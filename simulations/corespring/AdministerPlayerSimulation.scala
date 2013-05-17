package corespring 
import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._
import com.excilys.ebi.gatling.http.Headers.Names._
import akka.util.duration._
import bootstrap._
import assertions._

class AdministerPlayerSimulation extends Simulation {

	val httpConf = httpConfig
			.baseURL("http://corespring-local.herokuapp.com")
			.acceptHeader("*/*")
			.acceptCharsetHeader("ISO-8859-1,utf-8;q=0.7,*;q=0.3")
			.acceptEncodingHeader("gzip,deflate,sdch")
			.acceptLanguageHeader("en-US,en;q=0.8")
			.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.22 (KHTML, like Gecko) Ubuntu Chromium/25.0.1364.160 Chrome/25.0.1364.160 Safari/537.22")


	val headers_2 = Map(
			"Accept" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"""
	)

	val headers_3 = Map(
			"Cache-Control" -> """max-age=0""",
			"If-Modified-Since" -> """Thu, 16 May 2013 18:14:02 GMT""",
			"If-None-Match" -> """"9899eb5c0d0ec6d33c6c95c3f52644aa5186b09c""""
	)

	val headers_4 = Map(
			"Cache-Control" -> """max-age=0""",
			"If-Modified-Since" -> """Thu, 16 May 2013 18:14:02 GMT""",
			"If-None-Match" -> """"a9360bb056b872d48f658907e871b4d227990578""""
	)

	val headers_5 = Map(
			"Cache-Control" -> """max-age=0""",
			"If-Modified-Since" -> """Thu, 16 May 2013 18:14:02 GMT""",
			"If-None-Match" -> """"1abdb16a4375de49cc3f345bc1ecd4040d3b5e78""""
	)

	val headers_6 = Map(
			"Cache-Control" -> """max-age=0""",
			"If-Modified-Since" -> """Thu, 16 May 2013 18:14:02 GMT""",
			"If-None-Match" -> """"198d27ccc1f7c621a534a730cdfdca94113c8960""""
	)

	val headers_7 = Map(
			"Cache-Control" -> """max-age=0""",
			"If-Modified-Since" -> """Thu, 16 May 2013 18:14:02 GMT""",
			"If-None-Match" -> """"670e96e04869ac40fd6e28e214076a5102992a8d""""
	)

	val headers_8 = Map(
			"Cache-Control" -> """max-age=0""",
			"If-Modified-Since" -> """Thu, 16 May 2013 18:14:02 GMT""",
			"If-None-Match" -> """"7e6c658d785cf85a488d6405006d66c3962a925b""""
	)

	val headers_10 = Map(
			"Accept" -> """application/json, text/plain, */*""",
			"Content-Type" -> """application/json;charset=UTF-8""",
			"Origin" -> """http://corespring-local.herokuapp.com""",
			"X-Requested-With" -> """XMLHttpRequest"""
	)


	val scn = scenario("Scenario Name")
		.exec(http("request_1")
					.get("/player.js")
					.queryParam("""apiClientId""", """502d46ce0364068384f217a4""")
					.queryParam("""options""", """fadd89c220f50509875291123cecbcf0b68968c2ea6470d79efa89ad04a7f2c681eea0e4c0cfee5898180d67e158b36f05bd58e698154af0c05ba3262c6ecf797f2cd464e0573151c0065b7f4aa9f1f3a065f1bc77240511ee6b6187e3493ea0a3beff5c05898dd5ad0533550a874889""")
			)
		.pause(172 milliseconds)
		.exec(http("request_2")
					.get("/player/item/50098908e4b0f123a2d54c98/administer")
					.headers(headers_2)
			)
		.pause(121 milliseconds)
		.exec(http("request_3")
					.get("/assets/js/vendor/underscore/1.3.3/underscore-min.js")
					.headers(headers_3)
					.check(status.in(Seq(200,304)))
			)
		.exec(http("request_4")
					.get("/assets/bootstrap/2.1.1/js/bootstrap.js")
					.headers(headers_4)
					.check(status.in(Seq(200,304)))
			)
		.exec(http("request_5")
					.get("/assets/js/vendor/angular/1.0.3/angular-resource.min.js")
					.headers(headers_5)
					.check(status.in(Seq(200,304)))
			)
		.pause(11 milliseconds)
		.exec(http("request_6")
					.get("/assets/js/vendor/angular-bootstrap-ui/angular-bootstrap-ui.min.js")
					.headers(headers_6)
					.check(status.in(Seq(200,304)))
			)
		.exec(http("request_7")
					.get("/assets/js/vendor/angular-ui/fork-test/angular-ui.min.js")
					.headers(headers_7)
					.check(status.in(Seq(200,304)))
			)
		.pause(27 milliseconds)
		.exec(http("request_8")
					.get("/assets/bootstrap/patches/js/TypeAheadFork.js")
					.headers(headers_8)
					.check(status.in(Seq(200,304)))
			)
		.exec(http("request_9")
					.get("/player/routes.js")
			)
		.pause(193 milliseconds)
		.exec(http("request_10")
					.post("/player/api/50098908e4b0f123a2d54c98/session")
					.headers(headers_10)
						.body("""{}""").asJSON
			)

	setUp(scn.users(500).ramp(25).protocolConfig(httpConf))
}

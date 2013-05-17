package corespring;

import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._
import com.excilys.ebi.gatling.http.Headers.Names._
import akka.util.duration._
import bootstrap._
import assertions._

class AdministerSimulation extends Simulation {

	val httpConf = httpConfig
			.baseURL("http://corespring-app-devt.herokuapp.com")
			.acceptHeader("*/*")
			.acceptCharsetHeader("ISO-8859-1,utf-8;q=0.7,*;q=0.3")
			.acceptEncodingHeader("gzip,deflate,sdch")
			.acceptLanguageHeader("en-US,en;q=0.8")
			.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.22 (KHTML, like Gecko) Ubuntu Chromium/25.0.1364.160 Chrome/25.0.1364.160 Safari/537.22")


	val headers_2 = Map(
			"Accept" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"""
	)

	val headers_3 = Map(
			"If-Modified-Since" -> """Thu, 16 May 2013 14:34:20 GMT""",
			"If-None-Match" -> """"dbeb7f20a14acebe2f00d360468a6072b328a26c""""
	)

	val headers_4 = Map(
			"If-Modified-Since" -> """Thu, 16 May 2013 14:34:20 GMT""",
			"If-None-Match" -> """"86cced55b586a54db1e0933c9db9902af99bb909""""
	)

	val headers_5 = Map(
			"Accept" -> """text/css,*/*;q=0.1""",
			"If-Modified-Since" -> """Thu, 16 May 2013 14:34:20 GMT""",
			"If-None-Match" -> """"62a34aa7bec92684d3f8418afb5c214b05c6878a""""
	)

	val headers_6 = Map(
			"If-Modified-Since" -> """Thu, 16 May 2013 14:34:20 GMT""",
			"If-None-Match" -> """"f43037e31a69ce3476ab26caf2af2f3660fd36dd""""
	)

	val headers_7 = Map(
			"If-Modified-Since" -> """Thu, 16 May 2013 14:34:20 GMT""",
			"If-None-Match" -> """"62330fc4dd5bc3a062d88a42a030c0c127ccb950""""
	)

	val headers_8 = Map(
			"If-Modified-Since" -> """Thu, 16 May 2013 14:34:20 GMT""",
			"If-None-Match" -> """"e527326e04c8323f72654dcaebddc4a3b09a37e2""""
	)

	val headers_9 = Map(
			"If-Modified-Since" -> """Thu, 16 May 2013 15:04:08 GMT""",
			"If-None-Match" -> """"df434e66c5e18e62798dcfbdcef80bf43a1b005b""""
	)

	val headers_10 = Map(
			"If-Modified-Since" -> """Thu, 16 May 2013 14:34:20 GMT""",
			"If-None-Match" -> """"ab0030587c02e3ccf6b5210147a483816a26c300""""
	)

	val headers_12 = Map(
			"Accept" -> """text/css,*/*;q=0.1""",
			"If-Modified-Since" -> """Thu, 16 May 2013 14:34:20 GMT""",
			"If-None-Match" -> """"314c80f929a0e69990f786259a6cd2facf3d09a4""""
	)

	val headers_13 = Map(
			"If-Modified-Since" -> """Thu, 16 May 2013 15:05:45 GMT""",
			"If-None-Match" -> """"5b8f8bf2e838f319a50eb31f0060726f6ef37b4b""""
	)

	val headers_15 = Map(
			"Accept" -> """text/css,*/*;q=0.1"""
	)

	val headers_17 = Map(
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
		.pause(420 milliseconds)
		.exec(http("request_2")
					.get("/player/item/50098908e4b0f123a2d54c98/administer")
					.headers(headers_2)
			)
		.pause(117 milliseconds)
		.exec(http("request_3")
					.get("/assets/bootstrap/2.1.1/js/bootstrap.js")
					.headers(headers_3)
					.check(status.in(Seq(200,304)))
			)
		.exec(http("request_4")
					.get("/assets/js/vendor/underscore/1.3.3/underscore-min.js")
					.headers(headers_4)
					.check(status.in(Seq(200,304)))
			)
		.pause(17 milliseconds)
		.exec(http("request_5")
					.get("/assets/bootstrap/2.1.1/css/bootstrap.css")
					.headers(headers_5)
					.check(status.in(Seq(200,304)))
			)
		.pause(21 milliseconds)
		.exec(http("request_6")
					.get("/assets/js/vendor/angular-bootstrap-ui/angular-bootstrap-ui.min.js")
					.headers(headers_6)
					.check(status.in(Seq(200,304)))
			)
		.exec(http("request_7")
					.get("/assets/js/vendor/angular/1.0.3/angular-resource.min.js")
					.headers(headers_7)
					.check(status.in(Seq(200,304)))
			)
		.exec(http("request_8")
					.get("/assets/bootstrap/patches/js/TypeAheadFork.js")
					.headers(headers_8)
					.check(status.in(Seq(200,304)))
			)
		.exec(http("request_9")
					.get("/assets/cs-common--219329790.min.gz.js")
					.headers(headers_9)
					.check(status.in(Seq(200,304)))
			)
		.exec(http("request_10")
					.get("/assets/js/vendor/angular-ui/fork-test/angular-ui.min.js")
					.headers(headers_10)
					.check(status.in(Seq(200,304)))
			)
		.pause(26 milliseconds)
		.exec(http("request_11")
					.get("/player/routes.js")
			)
		.exec(http("request_12")
					.get("/assets/stylesheets/bytebureau/styles.css")
					.headers(headers_12)
					.check(status.in(Seq(200,304)))
			)
		.pause(27 milliseconds)
		.exec(http("request_13")
					.get("/assets/common--60172898.min.gz.js")
					.headers(headers_13)
					.check(status.in(Seq(200,304)))
			)
		.pause(11 milliseconds)
		.exec(http("request_14")
					.get("/assets/qti-interactions-949619811.min.gz.js")
			)
		.exec(http("request_15")
					.get("/assets/qti-interactions--1223047468.min.gz.css")
					.headers(headers_15)
			)
		.pause(182 milliseconds)
		.exec(http("request_16")
					.get("/assets/images/header-dark-grey-br-1.png")
			)
		.pause(29 milliseconds)
		.exec(http("request_17")
					.post("/player/api/50098908e4b0f123a2d54c98/session")
					.headers(headers_17)
						.body("""{}""").asJSON
			)

	setUp(scn.users(1).protocolConfig(httpConf))
}


import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._
import com.excilys.ebi.gatling.http.Headers.Names._
import akka.util.duration._
import bootstrap._
import assertions._

class AdministerSimulation2 extends Simulation {

	val httpConf = httpConfig
			.baseURL("http://corespring-load-testing.herokuapp.com")
			.acceptHeader("*/*")
			.acceptCharsetHeader("ISO-8859-1,utf-8;q=0.7,*;q=0.3")
			.acceptEncodingHeader("gzip,deflate,sdch")
			.acceptLanguageHeader("en-US,en;q=0.8")
			.userAgentHeader("Mozilla/5.0 (X11; Linux i686) AppleWebKit/537.22 (KHTML, like Gecko) Ubuntu Chromium/25.0.1364.160 Chrome/25.0.1364.160 Safari/537.22")


	val headers_2 = Map(
			"Accept" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"""
	)

	val headers_4 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 15:07:12 GMT""",
			"If-None-Match" -> """"47de5b18a78afc7d232645500b36b9feda33baa6""""
	)

	val headers_5 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 15:07:12 GMT""",
			"If-None-Match" -> """"877bc2d3d18dd5e63390edfe3ad41450e39145c0""""
	)

	val headers_6 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 15:07:12 GMT""",
			"If-None-Match" -> """"fa2d9c1f764f5b0c7c57294effd5e32fb518c3e1""""
	)

	val headers_7 = Map(
			"Accept" -> """text/css,*/*;q=0.1""",
			"If-Modified-Since" -> """Fri, 17 May 2013 15:07:12 GMT""",
			"If-None-Match" -> """"d32d73a40f19879052e88ea8ef54fb0aa255a59b""""
	)

	val headers_11 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 15:07:12 GMT""",
			"If-None-Match" -> """"711cbe444c3f656af9b147a230f89bd85ad6888c""""
	)

	val headers_12 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 15:07:12 GMT""",
			"If-None-Match" -> """"ab8e303fd6abdcb38d0280e9836e39e4bd9d4b24""""
	)

	val headers_13 = Map(
			"Accept" -> """text/css,*/*;q=0.1"""
	)

	val headers_14 = Map(
			"Accept" -> """text/css,*/*;q=0.1""",
			"If-Modified-Since" -> """Fri, 17 May 2013 15:07:12 GMT""",
			"If-None-Match" -> """"35938745826164c9ea7d5e2a2c5cc5756cb95a5b""""
	)

	val headers_15 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 15:07:12 GMT""",
			"If-None-Match" -> """"a7e6a3dc760c0c3fa2f9dfbf8f4535d17ce49cc7""""
	)

	val headers_16 = Map(
			"If-None-Match" -> """52dd587685bd00c22541020e05aea2e7"""
	)

	val headers_17 = Map(
			"Accept" -> """application/json, text/plain, */*""",
			"Content-Type" -> """application/json;charset=UTF-8""",
			"Origin" -> """http://corespring-load-testing.herokuapp.com""",
			"X-Requested-With" -> """XMLHttpRequest"""
	)


	val scn = scenario("Scenario Name")
		.exec(http("request_1")
					.get("/player.js")
					.queryParam("""apiClientId""", """502d46ce0364068384f217a4""")
					.queryParam("""options""", """fadd89c220f50509875291123cecbcf0b68968c2ea6470d79efa89ad04a7f2c681eea0e4c0cfee5898180d67e158b36fbb0fca01a435aeea4f0c622d07647255933cefa4f3781eb548913f4722dabc15a065f1bc77240511ee6b6187e3493ea0a3beff5c05898dd5ad0533550a874889""")
			)
		.pause(257 milliseconds)
		.exec(http("request_2")
					.get("/player/item/502282bce4b05b57849d303b/administer")
					.headers(headers_2)
			)
		.pause(160 milliseconds)
		.exec(http("request_3")
					.get("/assets/cs-common-234989643.min.gz.js")
			)
		.pause(105 milliseconds)
		.exec(http("request_4")
					.get("/assets/bootstrap/patches/js/TypeAheadFork.js")
					.headers(headers_4)
			)
		.pause(14 milliseconds)
		.exec(http("request_5")
					.get("/assets/js/vendor/underscore/1.3.3/underscore-min.js")
					.headers(headers_5)
			)
		.pause(40 milliseconds)
		.exec(http("request_6")
					.get("/assets/js/vendor/angular/1.0.3/angular-resource.min.js")
					.headers(headers_6)
			)
		.pause(69 milliseconds)
		.exec(http("request_7")
					.get("/assets/bootstrap/2.1.1/css/bootstrap.css")
					.headers(headers_7)
			)
		.exec(http("request_8")
					.get("/player/routes.js")
			)
		.pause(56 milliseconds)
		.exec(http("request_9")
					.get("/assets/common--649440441.min.gz.js")
			)
		.pause(37 milliseconds)
		.exec(http("request_10")
					.get("/assets/qti-interactions-383132690.min.gz.js")
			)
		.exec(http("request_11")
					.get("/assets/js/vendor/angular-ui/fork-test/angular-ui.min.js")
					.headers(headers_11)
			)
		.exec(http("request_12")
					.get("/assets/bootstrap/2.1.1/js/bootstrap.js")
					.headers(headers_12)
			)
		.pause(35 milliseconds)
		.exec(http("request_13")
					.get("/assets/qti-interactions--1955913016.min.gz.css")
					.headers(headers_13)
			)
		.pause(55 milliseconds)
		.exec(http("request_14")
					.get("/assets/stylesheets/bytebureau/styles.css")
					.headers(headers_14)
			)
		.pause(30 milliseconds)
		.exec(http("request_15")
					.get("/assets/js/vendor/angular-bootstrap-ui/angular-bootstrap-ui.min.js")
					.headers(headers_15)
			)
		.pause(439 milliseconds)
		.exec(http("request_16")
					.get("/player/item/502282bce4b05b57849d303b/Materials.png")
					.headers(headers_16)
					.check(status.is(304))
			)
		.pause(23 milliseconds)
		.exec(http("request_17")
					.post("/player/api/502282bce4b05b57849d303b/session")
					.headers(headers_17)
						.body("""{}""").asJSON
			)

	setUp(scn.users(1).protocolConfig(httpConf))
}

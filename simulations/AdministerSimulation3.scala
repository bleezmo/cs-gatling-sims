
import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._
import com.excilys.ebi.gatling.http.Headers.Names._
import akka.util.duration._
import bootstrap._
import assertions._

class AdministerSimulation3 extends Simulation {

	val httpConf = httpConfig
			.baseURL("http://corespring-load-testing.herokuapp.com")
			.acceptHeader("*/*")
			.acceptCharsetHeader("ISO-8859-1,utf-8;q=0.7,*;q=0.3")
			.acceptEncodingHeader("gzip,deflate,sdch")
			.acceptLanguageHeader("en-US,en;q=0.8")
			.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.22 (KHTML, like Gecko) Ubuntu Chromium/25.0.1364.160 Chrome/25.0.1364.160 Safari/537.22")


	val headers_2 = Map(
			"Accept" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"""
	)

	val headers_3 = Map(
			"Accept" -> """text/css,*/*;q=0.1"""
	)

	val headers_18 = Map(
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
		.pause(2)
		.exec(http("request_2")
					.get("/player/item/502282bce4b05b57849d303b/administer")
					.headers(headers_2)
			)
		.pause(264 milliseconds)
		.exec(http("request_3")
					.get("http://fonts.googleapis.com/css")
					.headers(headers_3)
					.queryParam("""family""", """Ubuntu:300,400,500,500italic,700""")
			)
		.pause(67 milliseconds)
		.exec(http("request_4")
					.get("/assets/js/vendor/angular/1.0.3/angular-resource.min.js")
			)
		.pause(11 milliseconds)
		.exec(http("request_5")
					.get("/assets/bootstrap/patches/js/TypeAheadFork.js")
			)
		.exec(http("request_6")
					.get("/assets/js/vendor/angular-bootstrap-ui/angular-bootstrap-ui.min.js")
			)
		.exec(http("request_7")
					.get("/assets/js/vendor/underscore/1.3.3/underscore-min.js")
			)
		.pause(113 milliseconds)
		.exec(http("request_8")
					.get("/assets/cs-common-234989643.min.gz.js")
			)
		.pause(33 milliseconds)
		.exec(http("request_9")
					.get("/assets/js/vendor/angular-ui/fork-test/angular-ui.min.js")
			)
		.exec(http("request_10")
					.get("/assets/common--649440441.min.gz.js")
			)
		.pause(28 milliseconds)
		.exec(http("request_11")
					.get("/assets/bootstrap/2.1.1/css/bootstrap.css")
					.headers(headers_3)
			)
		.exec(http("request_12")
					.get("/player/routes.js")
			)
		.pause(56 milliseconds)
		.exec(http("request_13")
					.get("/assets/qti-interactions--1955913016.min.gz.css")
					.headers(headers_3)
			)
		.pause(28 milliseconds)
		.exec(http("request_14")
					.get("/assets/qti-interactions-383132690.min.gz.js")
			)
		.pause(18 milliseconds)
		.exec(http("request_15")
					.get("/assets/bootstrap/2.1.1/js/bootstrap.js")
			)
		.pause(15 milliseconds)
		.exec(http("request_16")
					.get("/assets/qti-interactions--1955913016.min.gz.css")
					.headers(headers_3)
			)
		.exec(http("request_17")
					.get("/assets/stylesheets/bytebureau/styles.css")
					.headers(headers_3)
			)
		.pause(566 milliseconds)
		.exec(http("request_18")
					.post("/player/api/502282bce4b05b57849d303b/session")
					.headers(headers_18)
						.fileBody("AdministerSimulation3_request_18.txt")
			)
		.pause(707 milliseconds)
		.exec(http("request_19")
					.get("/player/item/502282bce4b05b57849d303b/Materials.png")
			)

	setUp(scn.users(1).protocolConfig(httpConf))
}

import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._
import com.excilys.ebi.gatling.http.Headers.Names._
import akka.util.duration._
import bootstrap._
import assertions._

class AdministerSimulation extends Simulation {

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

	val headers_7 = Map(
			"Accept" -> """text/css,*/*;q=0.1"""
	)

	val headers_9 = Map(
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
		.pause(1)
		.exec(http("request_2")
					.get("/player/item/502282bce4b05b57849d303b/administer")
					.headers(headers_2)
			)
		.pause(189 milliseconds)
		.exec(http("request_3")
					.get("/assets/cs-common--61582808.min.gz.js")
			)
		.exec(http("request_4")
					.get("/assets/qti-interactions--792729840.min.gz.js")
			)
		.pause(45 milliseconds)
		.exec(http("request_5")
					.get("/assets/common-986978564.min.gz.js")
			)
		.exec(http("request_6")
					.get("/player/routes.js")
			)
		.exec(http("request_7")
					.get("/assets/qti-interactions--967887320.min.gz.css")
					.headers(headers_7)
			)
		.pause(12 milliseconds)
		.exec(http("request_8")
					.get("/assets/stylesheets/bytebureau/styles.css")
					.headers(headers_7)
			)
		.pause(550 milliseconds)
		.exec(http("request_9")
					.post("/player/api/502282bce4b05b57849d303b/session")
					.headers(headers_9)
						.body("""{}""").asJSON
			)
		.pause(637 milliseconds)
		.exec(http("request_10")
					.get("/player/item/502282bce4b05b57849d303b/Materials.png")
			)

	setUp(scn.users(1).protocolConfig(httpConf))
}

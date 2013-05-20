
import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._
import com.excilys.ebi.gatling.http.Headers.Names._
import akka.util.duration._
import bootstrap._
import assertions._

class AdministerSimulation5 extends Simulation {

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

	val headers_4 = Map(
			"Accept" -> """application/json, text/plain, */*""",
			"Content-Type" -> """application/json;charset=UTF-8""",
			"Origin" -> """http://corespring-load-testing.herokuapp.com""",
			"X-Requested-With" -> """XMLHttpRequest"""
	)

	val headers_5 = Map(
			"Cache-Control" -> """max-age=0""",
			"If-None-Match" -> """52dd587685bd00c22541020e05aea2e7"""
	)


	val scn = scenario("Scenario Name")
		.exec(http("request_1")
					.get("/player.js")
					.queryParam("""apiClientId""", """502d46ce0364068384f217a4""")
					.queryParam("""options""", """fadd89c220f50509875291123cecbcf0b68968c2ea6470d79efa89ad04a7f2c681eea0e4c0cfee5898180d67e158b36fbb0fca01a435aeea4f0c622d07647255933cefa4f3781eb548913f4722dabc15a065f1bc77240511ee6b6187e3493ea0a3beff5c05898dd5ad0533550a874889""")
			)
		.pause(269 milliseconds)
		.exec(http("request_2")
					.get("/player/item/502282bce4b05b57849d303b/administer")
					.headers(headers_2)
			)
		.pause(262 milliseconds)
		.exec(http("request_3")
					.get("/player/routes.js")
			)
		.pause(237 milliseconds)
		.exec(http("request_4")
					.post("/player/api/502282bce4b05b57849d303b/session")
					.headers(headers_4)
						.fileBody("AdministerSimulation5_request_4.txt")
			)
		.pause(129 milliseconds)
		.exec(http("request_5")
					.get("/player/item/502282bce4b05b57849d303b/Materials.png")
					.headers(headers_5)
					.check(status.is(304))
			)

	setUp(scn.users(1).protocolConfig(httpConf))
}
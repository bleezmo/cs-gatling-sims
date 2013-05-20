
import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._
import com.excilys.ebi.gatling.http.Headers.Names._
import scala.concurrent.duration._
import bootstrap._
import assertions._

class AdministerSimulationSession extends Simulation {
  // Optional, let's you drive a testplan with parameters from our UI
  val users   = Integer.getInteger("threads", 1)
  val rampup    = Integer.getInteger("rampup", 1).toLong
 
  // MANDATORY
  val testguid  = List(System.getProperty("testguid"))

	val httpConf = httpConfig
			.baseURL("http://corespring-load-testing.herokuapp.com")
			.acceptHeader("*/*")
			.acceptCharsetHeader("ISO-8859-1,utf-8;q=0.7,*;q=0.3")
			.acceptEncodingHeader("gzip,deflate,sdch")
			.acceptLanguageHeader("en-US,en;q=0.8")
			.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.22 (KHTML, like Gecko) Ubuntu Chromium/25.0.1364.160 Chrome/25.0.1364.160 Safari/537.22")
      			.requestInfoExtractor((request: Request) => { testguid })


	val headers_2 = Map(
			"Accept" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"""
	)

	val headers_3 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 17:04:20 GMT""",
			"If-None-Match" -> """"3b342c9f2719be8ec2ff46d6e01e786980b32e0d""""
	)

	val headers_4 = Map(
			"Accept" -> """text/css,*/*;q=0.1""",
			"If-Modified-Since" -> """Fri, 17 May 2013 17:04:20 GMT""",
			"If-None-Match" -> """"858e4d0b23ef312db4197b6e74f77111909d20f9""""
	)

	val headers_5 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 17:04:20 GMT""",
			"If-None-Match" -> """"58effd049bff64d8e2b317ae1adabba518a03c48""""
	)

	val headers_6 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 17:04:20 GMT""",
			"If-None-Match" -> """"4587f9a578ae3da4334a12dd34521a85bdd937cf""""
	)

	val headers_7 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 17:04:20 GMT""",
			"If-None-Match" -> """"fcf8e8e90c64241eca1d687c690421b9267b5e3f""""
	)

	val headers_9 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 17:04:20 GMT""",
			"If-None-Match" -> """"f58397873641f4b3a76a5cdedfad5b593afa4bd3""""
	)

	val headers_10 = Map(
			"Accept" -> """text/css,*/*;q=0.1""",
			"If-Modified-Since" -> """Mon, 20 May 2013 00:47:35 GMT""",
			"If-None-Match" -> """"89704966bcbb689196099ab19a1aa0a21ef609db""""
	)

	val headers_11 = Map(
			"If-Modified-Since" -> """Mon, 20 May 2013 00:47:35 GMT""",
			"If-None-Match" -> """"e3ef8dcba65fdb05c015c4ca662d5e8a96a5aef6""""
	)

	val headers_12 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 17:04:20 GMT""",
			"If-None-Match" -> """"af542804957a9d04dcf18e909aff8c6fe48b8bc8""""
	)

	val headers_13 = Map(
			"Accept" -> """text/css,*/*;q=0.1""",
			"If-Modified-Since" -> """Fri, 17 May 2013 17:04:20 GMT""",
			"If-None-Match" -> """"b8b9dd5613bdb8d8b2fbbfdf16de39042ccabc96""""
	)

	val headers_14 = Map(
			"If-Modified-Since" -> """Mon, 20 May 2013 00:47:35 GMT""",
			"If-None-Match" -> """"f8a93f4b43957a3363461c236cb8eaf32652c91c""""
	)

	val headers_15 = Map(
			"If-Modified-Since" -> """Mon, 20 May 2013 00:47:35 GMT""",
			"If-None-Match" -> """"7b841ca359adf7f7b5db3c57627f9c0b71a9b358""""
	)

	val headers_16 = Map(
			"Accept" -> """application/json, text/plain, */*""",
			"Content-Type" -> """application/json;charset=UTF-8""",
			"Origin" -> """http://corespring-load-testing.herokuapp.com""",
			"X-Requested-With" -> """XMLHttpRequest"""
	)

	val headers_17 = Map(
			"If-None-Match" -> """52dd587685bd00c22541020e05aea2e7"""
	)


	val scn = scenario("Administer Item Player")
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
		.pause(165 milliseconds)
		.exec(http("request_3")
					.get("/assets/bootstrap/2.1.1/js/bootstrap.js")
					.headers(headers_3)
					.check(status.in(Seq(200,304)))
			)
		.exec(http("request_4")
					.get("/assets/bootstrap/2.1.1/css/bootstrap.css")
					.headers(headers_4)
					.check(status.in(Seq(200,304)))
			)
		.pause(14 milliseconds)
		.exec(http("request_5")
					.get("/assets/bootstrap/patches/js/TypeAheadFork.js")
					.headers(headers_5)
					.check(status.in(Seq(200,304)))
			)
		.exec(http("request_6")
					.get("/assets/js/vendor/underscore/1.3.3/underscore-min.js")
					.headers(headers_6)
					.check(status.in(Seq(200,304)))
			)
		.pause(68 milliseconds)
		.exec(http("request_7")
					.get("/assets/js/vendor/angular/1.0.3/angular-resource.min.js")
					.headers(headers_7)
					.check(status.in(Seq(200,304)))
			)
		.pause(34 milliseconds)
		.exec(http("request_8")
					.get("/player/routes.js")
			)
		.pause(33 milliseconds)
		.exec(http("request_9")
					.get("/assets/js/vendor/angular-bootstrap-ui/angular-bootstrap-ui.min.js")
					.headers(headers_9)
					.check(status.in(Seq(200,304)))
			)
		.pause(55 milliseconds)
		.exec(http("request_12")
					.get("/assets/js/vendor/angular-ui/fork-test/angular-ui.min.js")
					.headers(headers_12)
					.check(status.in(Seq(200,304)))
			)
		.exec(http("request_13")
					.get("/assets/stylesheets/bytebureau/styles.css")
					.headers(headers_13)
					.check(status.in(Seq(200,304)))
			)
		.pause(688 milliseconds)
		.exec(http("request_16")
					.post("/player/api/502282bce4b05b57849d303b/session")
					.headers(headers_16)
					.body("""{}""").asJSON
					.check(regex(""""id":"(\w{24})"""").saveAs("sessionId"))
			)
		.pause(529 milliseconds)
		.exec(http("request_17")
					.get("/player/item/502282bce4b05b57849d303b/Materials.png")
					.headers(headers_17)
					.check(status.in(Seq(200,304)))
			)
		.pause(10)
		.exec(http("request_18")
					.put("/player/api/502282bce4b05b57849d303b/session/${sessionId}")
					.headers(headers_16)
						.body("""{"id":"519a2269e4b07118d0ad6316","itemId":"502282bce4b05b57849d303b","responses":[{"id":"Q_01","value":"i'm guessing a reaction occurs"}],"settings":{"maxNoOfAttempts":1,"highlightUserResponse":true,"highlightCorrectResponse":true,"showFeedback":true,"allowEmptyResponses":false,"submitCompleteMessage":"Ok! Your response was submitted.","submitIncorrectMessage":"You may revise your work before you submit your final response."}}""").asJSON
			)
		.pause(72 milliseconds)
		.exec(http("request_19")
					.get("/assets/images/info-icon-37x37.png")
			)

	setUp(scn.users(users).ramp(rampup).protocolConfig(httpConf))
}


import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._
import com.excilys.ebi.gatling.http.Headers.Names._
import akka.util.duration._
import bootstrap._
import assertions._

class AdministerSimulation6 extends Simulation {

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
			"If-Modified-Since" -> """Fri, 17 May 2013 17:04:20 GMT""",
			"If-None-Match" -> """"f58397873641f4b3a76a5cdedfad5b593afa4bd3""""
	)

	val headers_4 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 17:04:20 GMT""",
			"If-None-Match" -> """"4587f9a578ae3da4334a12dd34521a85bdd937cf""""
	)

	val headers_5 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 17:04:20 GMT""",
			"If-None-Match" -> """"58effd049bff64d8e2b317ae1adabba518a03c48""""
	)

	val headers_6 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 17:04:20 GMT""",
			"If-None-Match" -> """"3b342c9f2719be8ec2ff46d6e01e786980b32e0d""""
	)

	val headers_7 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 17:04:20 GMT""",
			"If-None-Match" -> """"fcf8e8e90c64241eca1d687c690421b9267b5e3f""""
	)

	val headers_8 = Map(
			"Accept" -> """text/css,*/*;q=0.1""",
			"If-Modified-Since" -> """Fri, 17 May 2013 17:04:20 GMT""",
			"If-None-Match" -> """"858e4d0b23ef312db4197b6e74f77111909d20f9""""
	)

	val headers_9 = Map(
			"If-Modified-Since" -> """Fri, 17 May 2013 17:04:20 GMT""",
			"If-None-Match" -> """"af542804957a9d04dcf18e909aff8c6fe48b8bc8""""
	)

	val headers_11 = Map(
			"Accept" -> """text/css,*/*;q=0.1""",
			"If-Modified-Since" -> """Fri, 17 May 2013 17:04:20 GMT""",
			"If-None-Match" -> """"b8b9dd5613bdb8d8b2fbbfdf16de39042ccabc96""""
	)

	val headers_12 = Map(
			"If-Modified-Since" -> """Sun, 19 May 2013 18:01:24 GMT""",
			"If-None-Match" -> """"2d00cdcd07b9a4b13307840296b8b76d3cc83a43""""
	)

	val headers_13 = Map(
			"If-Modified-Since" -> """Sun, 19 May 2013 18:01:24 GMT""",
			"If-None-Match" -> """"b7361cb2f9199101cab1400c44acd68447115d6d""""
	)

	val headers_14 = Map(
			"Accept" -> """text/css,*/*;q=0.1""",
			"If-Modified-Since" -> """Sun, 19 May 2013 18:01:24 GMT""",
			"If-None-Match" -> """"d19a265f427bb690021d61bf04c5ea97f2902248""""
	)

	val headers_15 = Map(
			"If-Modified-Since" -> """Sun, 19 May 2013 18:01:24 GMT""",
			"If-None-Match" -> """"a74ecc06c8c0108639175c043cc63506949064c9""""
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
		.pause(204 milliseconds)
		.exec(http("request_3")
					.get("/assets/js/vendor/angular-bootstrap-ui/angular-bootstrap-ui.min.js")
					.headers(headers_3)
					.check(status.is(304))
			)
		.pause(30 milliseconds)
		.exec(http("request_4")
					.get("/assets/js/vendor/underscore/1.3.3/underscore-min.js")
					.headers(headers_4)
					.check(status.is(304))
			)
		.exec(http("request_5")
					.get("/assets/bootstrap/patches/js/TypeAheadFork.js")
					.headers(headers_5)
					.check(status.is(304))
			)
		.exec(http("request_6")
					.get("/assets/bootstrap/2.1.1/js/bootstrap.js")
					.headers(headers_6)
					.check(status.is(304))
			)
		.pause(11 milliseconds)
		.exec(http("request_7")
					.get("/assets/js/vendor/angular/1.0.3/angular-resource.min.js")
					.headers(headers_7)
					.check(status.is(304))
			)
		.exec(http("request_8")
					.get("/assets/bootstrap/2.1.1/css/bootstrap.css")
					.headers(headers_8)
					.check(status.is(304))
			)
		.pause(27 milliseconds)
		.exec(http("request_9")
					.get("/assets/js/vendor/angular-ui/fork-test/angular-ui.min.js")
					.headers(headers_9)
					.check(status.is(304))
			)
		.pause(85 milliseconds)
		.exec(http("request_10")
					.get("/player/routes.js")
			)
		.exec(http("request_11")
					.get("/assets/stylesheets/bytebureau/styles.css")
					.headers(headers_11)
					.check(status.is(304))
			)
		.pause(57 milliseconds)
		.exec(http("request_12")
					.get("/assets/cs-common-234989643.min.gz.js")
					.headers(headers_12)
			)
		.exec(http("request_13")
					.get("/assets/common--649440441.min.gz.js")
					.headers(headers_13)
			)
		.pause(31 milliseconds)
		.exec(http("request_14")
					.get("/assets/qti-interactions--1955913016.min.gz.css")
					.headers(headers_14)
			)
		.exec(http("request_15")
					.get("/assets/qti-interactions-383132690.min.gz.js")
					.headers(headers_15)
			)
		.pause(617 milliseconds)
		.exec(http("request_16")
					.post("/player/api/502282bce4b05b57849d303b/session")
					.headers(headers_16)
						.fileBody("AdministerSimulation6_request_16.txt")
			)
		.pause(29 milliseconds)
		.exec(http("request_17")
					.get("/player/item/502282bce4b05b57849d303b/Materials.png")
					.headers(headers_17)
					.check(status.is(304))
			)

	setUp(scn.users(1).protocolConfig(httpConf))
}
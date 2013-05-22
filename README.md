cs-gatling-sims
===============

To run on grid init:

1. download AdministerSimulationSession.scala
2. launch a test in grid init and load AdministerSimulationSession.scala (this is the only test in the repo which will run correctly on grid init)
3. in the addititional options, you may specify threads and ramp-up. Anything other specified options will be ignored for now (host is hard-coded as corespring-load-testing)
4. run it

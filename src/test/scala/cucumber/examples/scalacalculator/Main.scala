package cucumber.examples.scalacalculator

import org.junit.runner.JUnitCore

object Main extends App {
  JUnitCore.main(classOf[RunCukesTest].getName)
}

package com.test2.test2

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Test2Application{
	private val log: Log = LogFactory.getLog(javaClass)

	@Bean
	fun init(){
		log.fatal("FATALです")
		log.error("ERRORです")
		log.warn("WARNです")
		log.info("INFOです")
		log.debug("DEBUG")
		log.trace("TRACEです")
	}
}

fun main(args: Array<String>) {
	runApplication<Test2Application>(*args)
}

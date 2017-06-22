package org.SpringCloudDataFlowShell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.dataflow.shell.EnableDataFlowShell;

@EnableDataFlowShell
@SpringBootApplication
public class SpringCloudDataFlowShell {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDataFlowShell.class, args);
	}
}

/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudwatch;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.ClientConfigurationFactory;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.metrics.RequestMetricCollector;

/*
 * Builder with fluent api for building AmazonCloudWatchClient instances
 * 
 */
public class AmazonCloudWatchClientBuilder {

	
	/** The aws credentials provider. */
	private AWSCredentialsProvider awsCredentialsProvider;
	
	/** The client configuration. */
	private ClientConfiguration clientConfiguration;
	
	/** The request metric collector. */
	private RequestMetricCollector requestMetricCollector;
	
    /** Client configuration factory providing ClientConfigurations tailored to this client. */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();
	
	/**
	 * Instantiates a new amazon cloud watch client builder.
	 */
	private AmazonCloudWatchClientBuilder(){
		super();
	}
	
	/**
	 * Creates the.
	 *
	 * @return the amazon cloud watch client builder
	 */
	public static AmazonCloudWatchClientBuilder create() {
		return new AmazonCloudWatchClientBuilder();
	}
	
	/**
	 * Instantiates a new amazon cloud watch client builder.
	 *
	 * @param awsCredentials the aws credentials
	 */
	private AmazonCloudWatchClientBuilder(AWSCredentials awsCredentials){
		super();
		this.awsCredentialsProvider =new StaticCredentialsProvider(awsCredentials);
	}
	
	/**
	 * Creates the.
	 *
	 * @param awsCredentials the aws credentials
	 * @return the amazon cloud watch client builder
	 */
	public static AmazonCloudWatchClientBuilder create(AWSCredentials awsCredentials){
        return new AmazonCloudWatchClientBuilder(awsCredentials);
	}

	
	/**
	 * With aws credentials provider.
	 *
	 * @param awsCredentialsProvider the aws credentials provider
	 * @return the amazon cloud watch client builder
	 */
	public AmazonCloudWatchClientBuilder withAWSCredentialsProvider(AWSCredentialsProvider awsCredentialsProvider) {
		this.awsCredentialsProvider = awsCredentialsProvider;
		return this;
	}
	
	/**
	 * With client configuration.
	 *
	 * @param clientConfiguration the client configuration
	 * @return the amazon cloud watch client builder
	 */
	public AmazonCloudWatchClientBuilder withClientConfiguration(ClientConfiguration clientConfiguration) {
		this.clientConfiguration = clientConfiguration;
		return this;
	}
	
	
	/**
	 * With request metric collector.
	 *
	 * @param requestMetricCollector the request metric collector
	 * @return the amazon cloud watch client builder
	 */
	public AmazonCloudWatchClientBuilder withRequestMetricCollector(RequestMetricCollector requestMetricCollector) {
		this.requestMetricCollector = requestMetricCollector;
		return this;
	}
	
	
	/**
	 * Builds the.
	 *
	 * @return the amazon cloud watch client
	 */
	public AmazonCloudWatchClient build() {
		if (awsCredentialsProvider == null){
			awsCredentialsProvider = new DefaultAWSCredentialsProviderChain();
		}
		if(clientConfiguration == null){
			clientConfiguration = configFactory.getConfig();
		}
				
		return new AmazonCloudWatchClient(awsCredentialsProvider, clientConfiguration, requestMetricCollector);
	}
}

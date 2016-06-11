package com.amazonaws.services.cloudwatch;

import org.apache.http.annotation.NotThreadSafe;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.ClientConfigurationFactory;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.metrics.RequestMetricCollector;

@NotThreadSafe
public class AmazonCloudWatchClientBuilder {

	
	private AWSCredentialsProvider awsCredentialsProvider;
	private ClientConfiguration clientConfiguration;
	private RequestMetricCollector requestMetricCollector;
	
    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();
    
	
	public static AmazonCloudWatchClientBuilder create() {
		return new AmazonCloudWatchClientBuilder();
	}
	
	protected AmazonCloudWatchClientBuilder(){
		super();
	}
	
	public AmazonCloudWatchClientBuilder withAWSCredentialsProvider(AWSCredentialsProvider awsCredentialsProvider) {
		this.awsCredentialsProvider = awsCredentialsProvider;
		return this;
	}
	
	public AmazonCloudWatchClientBuilder withClientConfiguration(ClientConfiguration clientConfiguration) {
		this.clientConfiguration = clientConfiguration;
		return this;
	}
	
	public AmazonCloudWatchClientBuilder withClientConfiguration(RequestMetricCollector requestMetricCollector) {
		this.requestMetricCollector = requestMetricCollector;
		return this;
	}
	
	
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

/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow.examples.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClient;


/**
 * Configuration Helper to used to create SWF and S3 clients
 */

public class ConfigHelper {
	private Properties sampleConfig;
	
    private String swfServiceUrl;
    private String swfAccessId;
    private String swfSecretKey;
    private String s3AccessId;
    private String s3SecretKey;
    private String domain;
    private long domainRetentionPeriodInDays;
    
    private ConfigHelper(File propertiesFile) throws IOException {
        loadProperties(propertiesFile);
    }

    private void loadProperties(File propertiesFile) throws IOException {

        FileInputStream inputStream = new FileInputStream(propertiesFile);
        sampleConfig = new Properties();
        sampleConfig.load(inputStream);

        this.swfServiceUrl = sampleConfig.getProperty(ConfigKeys.SWF_SERVICE_URL_KEY);
        this.swfAccessId = sampleConfig.getProperty(ConfigKeys.SWF_ACCESS_ID_KEY);
        this.swfSecretKey = sampleConfig.getProperty(ConfigKeys.SWF_SECRET_KEY_KEY);

        this.s3AccessId = sampleConfig.getProperty(ConfigKeys.S3_ACCESS_ID_KEY);
        this.s3SecretKey = sampleConfig.getProperty(ConfigKeys.S3_SECRET_KEY_KEY);
        
        this.domain = sampleConfig.getProperty(ConfigKeys.DOMAIN_KEY);
        this.domainRetentionPeriodInDays = Long.parseLong(sampleConfig.getProperty(ConfigKeys.DOMAIN_RETENTION_PERIOD_KEY));
    }

    public static ConfigHelper createConfig() throws IOException, IllegalArgumentException {

        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.INFO);

//        Logger.getLogger("org.apache.http").setLevel(Level.INFO);

        ConfigHelper configHelper = null;

        boolean envVariableExists = false;
        //first check the existence of environment variable
        String sampleConfigPath = System.getenv(SampleConstants.ACCESS_PROPERTIES_ENVIRONMENT_VARIABLE);
        if (sampleConfigPath != null && sampleConfigPath.length() > 0) {
            envVariableExists = true;
        }        
        File accessProperties = new File(System.getProperty(SampleConstants.HOME_DIRECTORY_PROPERTY), SampleConstants.HOME_DIRECTORY_FILENAME);
        
        if(accessProperties.exists()){
            configHelper = new ConfigHelper(accessProperties);        	
        }
        else if (envVariableExists) {
            accessProperties = new File(sampleConfigPath, SampleConstants.ACCESS_PROPERTIES_FILENAME);
            configHelper = new ConfigHelper(accessProperties);
        }
        else {
            //try checking the existence of file on relative path.
            try {
                accessProperties = new File(SampleConstants.ACCESS_PROPERTIES_RELATIVE_PATH, SampleConstants.ACCESS_PROPERTIES_FILENAME);
                configHelper = new ConfigHelper(accessProperties);
            }
            catch (Exception e) {
                throw new FileNotFoundException("Cannot find AWS_SWF_SAMPLES_CONFIG environment variable, Exiting!!!");
            }
        }
        
        return configHelper;
    }

    public AmazonSimpleWorkflow createSWFClient() {
        ClientConfiguration config = new ClientConfiguration().withSocketTimeout(70 * 1000);
        AWSCredentials awsCredentials = new BasicAWSCredentials(this.swfAccessId, this.swfSecretKey);
        AmazonSimpleWorkflow client = new AmazonSimpleWorkflowClient(awsCredentials, config);
        client.setEndpoint(this.swfServiceUrl);
        return client;
    }

    public AmazonS3 createS3Client() {
        AWSCredentials s3AWSCredentials = new BasicAWSCredentials(this.s3AccessId, this.s3SecretKey);
        AmazonS3 client = new AmazonS3Client(s3AWSCredentials);
        return client;
    }
    
    public String getDomain() {
        return domain;
    }
    
    public long getDomainRetentionPeriodInDays() {
        return domainRetentionPeriodInDays;
    }
    
    public String getValueFromConfig(String key) {
    	return sampleConfig.getProperty(key);
    }
}

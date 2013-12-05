/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.services.elasticbeanstalk.model.transform.*;


/**
 * Client for accessing AWSElasticBeanstalk.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS Elastic Beanstalk <p>
 * This is the AWS Elastic Beanstalk API Reference. This guide provides detailed information about AWS Elastic Beanstalk actions, data types,
 * parameters, and errors.
 * </p>
 * <p>
 * AWS Elastic Beanstalk is a tool that makes it easy for you to create, deploy, and manage scalable, fault-tolerant applications running on Amazon Web
 * Services cloud resources.
 * </p>
 * <p>
 * For more information about this product, go to the <a href="http://aws.amazon.com/elasticbeanstalk/"> AWS Elastic Beanstalk </a> details page. The
 * location of the lastest AWS Elastic Beanstalk WSDL is <a href="http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl">
 * http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl </a> .
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS Elastic Beanstalk supports the following region-specific endpoint:
 * </p>
 * 
 * <ul>
 * <li> https://elasticbeanstalk.us-east-1.amazonaws.com </li>
 * 
 * </ul>
 */
public class AWSElasticBeanstalkClient extends AmazonWebServiceClient implements AWSElasticBeanstalk {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWSElasticBeanstalk exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on
     * AWSElasticBeanstalk.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSElasticBeanstalkClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElasticBeanstalk.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSElasticBeanstalk
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSElasticBeanstalkClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElasticBeanstalk using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSElasticBeanstalkClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElasticBeanstalk using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSElasticBeanstalk
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSElasticBeanstalkClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElasticBeanstalk using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSElasticBeanstalkClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElasticBeanstalk using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSElasticBeanstalk
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSElasticBeanstalkClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new TooManyEnvironmentsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new S3SubscriptionRequiredExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyApplicationVersionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyApplicationsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SourceBundleDeletionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyConfigurationTemplatesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyBucketsExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("elasticbeanstalk.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/elasticbeanstalk/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/elasticbeanstalk/request.handler2s"));
    }

    
    /**
     * <p>
     * Checks if the specified CNAME is available.
     * </p>
     *
     * @param checkDNSAvailabilityRequest Container for the necessary
     *           parameters to execute the CheckDNSAvailability service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the CheckDNSAvailability service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CheckDNSAvailabilityResult checkDNSAvailability(CheckDNSAvailabilityRequest checkDNSAvailabilityRequest) {
        ExecutionContext executionContext = createExecutionContext(checkDNSAvailabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CheckDNSAvailabilityRequest> request = null;
        Response<CheckDNSAvailabilityResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CheckDNSAvailabilityRequestMarshaller().marshall(checkDNSAvailabilityRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CheckDNSAvailabilityResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes the configuration options that are used in a particular
     * configuration template or environment, or that a specified solution
     * stack defines. The description includes the values the options, their
     * default values, and an indication of the required action on a running
     * environment if an option value is changed.
     * </p>
     *
     * @param describeConfigurationOptionsRequest Container for the necessary
     *           parameters to execute the DescribeConfigurationOptions service method
     *           on AWSElasticBeanstalk.
     * 
     * @return The response from the DescribeConfigurationOptions service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConfigurationOptionsResult describeConfigurationOptions(DescribeConfigurationOptionsRequest describeConfigurationOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConfigurationOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeConfigurationOptionsRequest> request = null;
        Response<DescribeConfigurationOptionsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeConfigurationOptionsRequestMarshaller().marshall(describeConfigurationOptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeConfigurationOptionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified configuration template.
     * </p>
     * <p>
     * <b>NOTE:</b>When you launch an environment using a configuration
     * template, the environment gets a copy of the template. You can delete
     * or modify the environment's copy of the template without affecting the
     * running environment.
     * </p>
     *
     * @param deleteConfigurationTemplateRequest Container for the necessary
     *           parameters to execute the DeleteConfigurationTemplate service method
     *           on AWSElasticBeanstalk.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteConfigurationTemplate(DeleteConfigurationTemplateRequest deleteConfigurationTemplateRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteConfigurationTemplateRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteConfigurationTemplateRequestMarshaller().marshall(deleteConfigurationTemplateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Launches an environment for the specified application using the
     * specified configuration.
     * </p>
     *
     * @param createEnvironmentRequest Container for the necessary parameters
     *           to execute the CreateEnvironment service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the CreateEnvironment service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     * @throws TooManyEnvironmentsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest createEnvironmentRequest) {
        ExecutionContext executionContext = createExecutionContext(createEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateEnvironmentRequest> request = null;
        Response<CreateEnvironmentResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateEnvironmentRequestMarshaller().marshall(createEnvironmentRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateEnvironmentResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates the Amazon S3 storage location for the account.
     * </p>
     * <p>
     * This location is used to store user log files.
     * </p>
     *
     * @param createStorageLocationRequest Container for the necessary
     *           parameters to execute the CreateStorageLocation service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the CreateStorageLocation service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     * @throws S3SubscriptionRequiredException
     * @throws TooManyBucketsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateStorageLocationResult createStorageLocation(CreateStorageLocationRequest createStorageLocationRequest) {
        ExecutionContext executionContext = createExecutionContext(createStorageLocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateStorageLocationRequest> request = null;
        Response<CreateStorageLocationResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateStorageLocationRequestMarshaller().marshall(createStorageLocationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateStorageLocationResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Initiates a request to compile the specified type of information of
     * the deployed environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>tail</code> compiles the
     * last lines from the application server log files of every Amazon EC2
     * instance in your environment. Use RetrieveEnvironmentInfo to access
     * the compiled information.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * 
     * <ul>
     * <li> RetrieveEnvironmentInfo </li>
     * 
     * </ul>
     *
     * @param requestEnvironmentInfoRequest Container for the necessary
     *           parameters to execute the RequestEnvironmentInfo service method on
     *           AWSElasticBeanstalk.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void requestEnvironmentInfo(RequestEnvironmentInfoRequest requestEnvironmentInfoRequest) {
        ExecutionContext executionContext = createExecutionContext(requestEnvironmentInfoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RequestEnvironmentInfoRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new RequestEnvironmentInfoRequestMarshaller().marshall(requestEnvironmentInfoRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Creates an application version for the specified application.
     * </p>
     * <p>
     * <b>NOTE:</b>Once you create an application version with a specified
     * Amazon S3 bucket and key location, you cannot change that Amazon S3
     * location. If you change the Amazon S3 location, you receive an
     * exception when you attempt to launch an environment from the
     * application version.
     * </p>
     *
     * @param createApplicationVersionRequest Container for the necessary
     *           parameters to execute the CreateApplicationVersion service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the CreateApplicationVersion service method,
     *         as returned by AWSElasticBeanstalk.
     * 
     * @throws TooManyApplicationsException
     * @throws TooManyApplicationVersionsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateApplicationVersionResult createApplicationVersion(CreateApplicationVersionRequest createApplicationVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(createApplicationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateApplicationVersionRequest> request = null;
        Response<CreateApplicationVersionResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateApplicationVersionRequestMarshaller().marshall(createApplicationVersionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateApplicationVersionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified version from the specified application.
     * </p>
     * <p>
     * <b>NOTE:</b>You cannot delete an application version that is
     * associated with a running environment.
     * </p>
     *
     * @param deleteApplicationVersionRequest Container for the necessary
     *           parameters to execute the DeleteApplicationVersion service method on
     *           AWSElasticBeanstalk.
     * 
     * 
     * @throws SourceBundleDeletionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteApplicationVersion(DeleteApplicationVersionRequest deleteApplicationVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteApplicationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteApplicationVersionRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteApplicationVersionRequestMarshaller().marshall(deleteApplicationVersionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Returns descriptions for existing application versions.
     * </p>
     *
     * @param describeApplicationVersionsRequest Container for the necessary
     *           parameters to execute the DescribeApplicationVersions service method
     *           on AWSElasticBeanstalk.
     * 
     * @return The response from the DescribeApplicationVersions service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeApplicationVersionsResult describeApplicationVersions(DescribeApplicationVersionsRequest describeApplicationVersionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeApplicationVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeApplicationVersionsRequest> request = null;
        Response<DescribeApplicationVersionsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeApplicationVersionsRequestMarshaller().marshall(describeApplicationVersionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeApplicationVersionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified application along with all associated versions
     * and configurations.
     * </p>
     * <p>
     * <b>NOTE:</b>You cannot delete an application that has a running
     * environment.
     * </p>
     *
     * @param deleteApplicationRequest Container for the necessary parameters
     *           to execute the DeleteApplication service method on
     *           AWSElasticBeanstalk.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteApplication(DeleteApplicationRequest deleteApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteApplicationRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteApplicationRequestMarshaller().marshall(deleteApplicationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Updates the specified application version to have the specified
     * properties.
     * </p>
     * <p>
     * <b>NOTE:</b> If a property (for example, description) is not provided,
     * the value remains unchanged. To clear properties, specify an empty
     * string.
     * </p>
     *
     * @param updateApplicationVersionRequest Container for the necessary
     *           parameters to execute the UpdateApplicationVersion service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the UpdateApplicationVersion service method,
     *         as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateApplicationVersionResult updateApplicationVersion(UpdateApplicationVersionRequest updateApplicationVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(updateApplicationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateApplicationVersionRequest> request = null;
        Response<UpdateApplicationVersionResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new UpdateApplicationVersionRequestMarshaller().marshall(updateApplicationVersionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateApplicationVersionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates an application that has one configuration template named
     * <code>default</code> and no application versions.
     * </p>
     * <p>
     * <b>NOTE:</b> The default configuration template is for a 32-bit
     * version of the Amazon Linux operating system running the Tomcat 6
     * application container.
     * </p>
     *
     * @param createApplicationRequest Container for the necessary parameters
     *           to execute the CreateApplication service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the CreateApplication service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     * @throws TooManyApplicationsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateApplicationRequestMarshaller().marshall(createApplicationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateApplicationResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Swaps the CNAMEs of two environments.
     * </p>
     *
     * @param swapEnvironmentCNAMEsRequest Container for the necessary
     *           parameters to execute the SwapEnvironmentCNAMEs service method on
     *           AWSElasticBeanstalk.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void swapEnvironmentCNAMEs(SwapEnvironmentCNAMEsRequest swapEnvironmentCNAMEsRequest) {
        ExecutionContext executionContext = createExecutionContext(swapEnvironmentCNAMEsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SwapEnvironmentCNAMEsRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new SwapEnvironmentCNAMEsRequestMarshaller().marshall(swapEnvironmentCNAMEsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Updates the specified configuration template to have the specified
     * properties or configuration option values.
     * </p>
     * <p>
     * <b>NOTE:</b> If a property (for example, ApplicationName) is not
     * provided, its value remains unchanged. To clear such properties,
     * specify an empty string.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * 
     * <ul>
     * <li> DescribeConfigurationOptions </li>
     * 
     * </ul>
     *
     * @param updateConfigurationTemplateRequest Container for the necessary
     *           parameters to execute the UpdateConfigurationTemplate service method
     *           on AWSElasticBeanstalk.
     * 
     * @return The response from the UpdateConfigurationTemplate service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateConfigurationTemplateResult updateConfigurationTemplate(UpdateConfigurationTemplateRequest updateConfigurationTemplateRequest) {
        ExecutionContext executionContext = createExecutionContext(updateConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateConfigurationTemplateRequest> request = null;
        Response<UpdateConfigurationTemplateResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new UpdateConfigurationTemplateRequestMarshaller().marshall(updateConfigurationTemplateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateConfigurationTemplateResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Retrieves the compiled information from a RequestEnvironmentInfo
     * request.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * 
     * <ul>
     * <li> RequestEnvironmentInfo </li>
     * 
     * </ul>
     *
     * @param retrieveEnvironmentInfoRequest Container for the necessary
     *           parameters to execute the RetrieveEnvironmentInfo service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the RetrieveEnvironmentInfo service method,
     *         as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RetrieveEnvironmentInfoResult retrieveEnvironmentInfo(RetrieveEnvironmentInfoRequest retrieveEnvironmentInfoRequest) {
        ExecutionContext executionContext = createExecutionContext(retrieveEnvironmentInfoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RetrieveEnvironmentInfoRequest> request = null;
        Response<RetrieveEnvironmentInfoResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new RetrieveEnvironmentInfoRequestMarshaller().marshall(retrieveEnvironmentInfoRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RetrieveEnvironmentInfoResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns a list of the available solution stack names.
     * </p>
     *
     * @param listAvailableSolutionStacksRequest Container for the necessary
     *           parameters to execute the ListAvailableSolutionStacks service method
     *           on AWSElasticBeanstalk.
     * 
     * @return The response from the ListAvailableSolutionStacks service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAvailableSolutionStacksResult listAvailableSolutionStacks(ListAvailableSolutionStacksRequest listAvailableSolutionStacksRequest) {
        ExecutionContext executionContext = createExecutionContext(listAvailableSolutionStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListAvailableSolutionStacksRequest> request = null;
        Response<ListAvailableSolutionStacksResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ListAvailableSolutionStacksRequestMarshaller().marshall(listAvailableSolutionStacksRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListAvailableSolutionStacksResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Updates the specified application to have the specified properties.
     * </p>
     * <p>
     * <b>NOTE:</b> If a property (for example, description) is not provided,
     * the value remains unchanged. To clear these properties, specify an
     * empty string.
     * </p>
     *
     * @param updateApplicationRequest Container for the necessary parameters
     *           to execute the UpdateApplication service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the UpdateApplication service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateApplicationRequest> request = null;
        Response<UpdateApplicationResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new UpdateApplicationRequestMarshaller().marshall(updateApplicationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateApplicationResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns descriptions for existing environments.
     * </p>
     *
     * @param describeEnvironmentsRequest Container for the necessary
     *           parameters to execute the DescribeEnvironments service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the DescribeEnvironments service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEnvironmentsResult describeEnvironments(DescribeEnvironmentsRequest describeEnvironmentsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEnvironmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeEnvironmentsRequest> request = null;
        Response<DescribeEnvironmentsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeEnvironmentsRequestMarshaller().marshall(describeEnvironmentsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeEnvironmentsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns AWS resources for this environment.
     * </p>
     *
     * @param describeEnvironmentResourcesRequest Container for the necessary
     *           parameters to execute the DescribeEnvironmentResources service method
     *           on AWSElasticBeanstalk.
     * 
     * @return The response from the DescribeEnvironmentResources service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEnvironmentResourcesResult describeEnvironmentResources(DescribeEnvironmentResourcesRequest describeEnvironmentResourcesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEnvironmentResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeEnvironmentResourcesRequest> request = null;
        Response<DescribeEnvironmentResourcesResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeEnvironmentResourcesRequestMarshaller().marshall(describeEnvironmentResourcesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeEnvironmentResourcesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Terminates the specified environment.
     * </p>
     *
     * @param terminateEnvironmentRequest Container for the necessary
     *           parameters to execute the TerminateEnvironment service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the TerminateEnvironment service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public TerminateEnvironmentResult terminateEnvironment(TerminateEnvironmentRequest terminateEnvironmentRequest) {
        ExecutionContext executionContext = createExecutionContext(terminateEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<TerminateEnvironmentRequest> request = null;
        Response<TerminateEnvironmentResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new TerminateEnvironmentRequestMarshaller().marshall(terminateEnvironmentRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new TerminateEnvironmentResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Takes a set of configuration settings and either a configuration
     * template or environment, and determines whether those values are
     * valid.
     * </p>
     * <p>
     * This action returns a list of messages indicating any errors or
     * warnings associated with the selection of option values.
     * </p>
     *
     * @param validateConfigurationSettingsRequest Container for the
     *           necessary parameters to execute the ValidateConfigurationSettings
     *           service method on AWSElasticBeanstalk.
     * 
     * @return The response from the ValidateConfigurationSettings service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ValidateConfigurationSettingsResult validateConfigurationSettings(ValidateConfigurationSettingsRequest validateConfigurationSettingsRequest) {
        ExecutionContext executionContext = createExecutionContext(validateConfigurationSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ValidateConfigurationSettingsRequest> request = null;
        Response<ValidateConfigurationSettingsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ValidateConfigurationSettingsRequestMarshaller().marshall(validateConfigurationSettingsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ValidateConfigurationSettingsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Causes the environment to restart the application container server
     * running on each Amazon EC2 instance.
     * </p>
     *
     * @param restartAppServerRequest Container for the necessary parameters
     *           to execute the RestartAppServer service method on AWSElasticBeanstalk.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void restartAppServer(RestartAppServerRequest restartAppServerRequest) {
        ExecutionContext executionContext = createExecutionContext(restartAppServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RestartAppServerRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new RestartAppServerRequestMarshaller().marshall(restartAppServerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the draft configuration associated with the running
     * environment.
     * </p>
     * <p>
     * Updating a running environment with any configuration changes creates
     * a draft configuration set. You can get the draft configuration using
     * DescribeConfigurationSettings while the update is in progress or if
     * the update fails. The <code>DeploymentStatus</code> for the draft
     * configuration indicates whether the deployment is in process or has
     * failed. The draft configuration remains in existence until it is
     * deleted with this action.
     * </p>
     *
     * @param deleteEnvironmentConfigurationRequest Container for the
     *           necessary parameters to execute the DeleteEnvironmentConfiguration
     *           service method on AWSElasticBeanstalk.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteEnvironmentConfiguration(DeleteEnvironmentConfigurationRequest deleteEnvironmentConfigurationRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteEnvironmentConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteEnvironmentConfigurationRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteEnvironmentConfigurationRequestMarshaller().marshall(deleteEnvironmentConfigurationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Updates the environment description, deploys a new application
     * version, updates the configuration settings to an entirely new
     * configuration template, or updates select configuration option values
     * in the running environment.
     * </p>
     * <p>
     * Attempting to update both the release and configuration is not
     * allowed and AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error.
     * </p>
     * <p>
     * When updating the configuration settings to a new template or
     * individual settings, a draft configuration is created and
     * DescribeConfigurationSettings for this environment returns two setting
     * descriptions with different <code>DeploymentStatus</code> values.
     * </p>
     *
     * @param updateEnvironmentRequest Container for the necessary parameters
     *           to execute the UpdateEnvironment service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the UpdateEnvironment service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest) {
        ExecutionContext executionContext = createExecutionContext(updateEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateEnvironmentRequest> request = null;
        Response<UpdateEnvironmentResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new UpdateEnvironmentRequestMarshaller().marshall(updateEnvironmentRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateEnvironmentResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a configuration template. Templates are associated with a
     * specific application and are used to deploy different versions of the
     * application with the same configuration settings.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * 
     * <ul>
     * <li> DescribeConfigurationOptions </li>
     * <li> DescribeConfigurationSettings </li>
     * <li> ListAvailableSolutionStacks </li>
     * 
     * </ul>
     *
     * @param createConfigurationTemplateRequest Container for the necessary
     *           parameters to execute the CreateConfigurationTemplate service method
     *           on AWSElasticBeanstalk.
     * 
     * @return The response from the CreateConfigurationTemplate service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     * @throws TooManyConfigurationTemplatesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateConfigurationTemplateResult createConfigurationTemplate(CreateConfigurationTemplateRequest createConfigurationTemplateRequest) {
        ExecutionContext executionContext = createExecutionContext(createConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateConfigurationTemplateRequest> request = null;
        Response<CreateConfigurationTemplateResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateConfigurationTemplateRequestMarshaller().marshall(createConfigurationTemplateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateConfigurationTemplateResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns a description of the settings for the specified configuration
     * set, that is, either a configuration template or the configuration set
     * associated with a running environment.
     * </p>
     * <p>
     * When describing the settings for the configuration set associated
     * with a running environment, it is possible to receive two sets of
     * setting descriptions. One is the deployed configuration set, and the
     * other is a draft configuration of an environment that is either in the
     * process of deployment or that failed to deploy.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * 
     * <ul>
     * <li> DeleteEnvironmentConfiguration </li>
     * 
     * </ul>
     *
     * @param describeConfigurationSettingsRequest Container for the
     *           necessary parameters to execute the DescribeConfigurationSettings
     *           service method on AWSElasticBeanstalk.
     * 
     * @return The response from the DescribeConfigurationSettings service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConfigurationSettingsResult describeConfigurationSettings(DescribeConfigurationSettingsRequest describeConfigurationSettingsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConfigurationSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeConfigurationSettingsRequest> request = null;
        Response<DescribeConfigurationSettingsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeConfigurationSettingsRequestMarshaller().marshall(describeConfigurationSettingsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeConfigurationSettingsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns the descriptions of existing applications.
     * </p>
     *
     * @param describeApplicationsRequest Container for the necessary
     *           parameters to execute the DescribeApplications service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the DescribeApplications service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeApplicationsResult describeApplications(DescribeApplicationsRequest describeApplicationsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeApplicationsRequest> request = null;
        Response<DescribeApplicationsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeApplicationsRequestMarshaller().marshall(describeApplicationsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeApplicationsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes and recreates all of the AWS resources (for example: the Auto
     * Scaling group, load balancer, etc.) for a specified environment and
     * forces a restart.
     * </p>
     *
     * @param rebuildEnvironmentRequest Container for the necessary
     *           parameters to execute the RebuildEnvironment service method on
     *           AWSElasticBeanstalk.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void rebuildEnvironment(RebuildEnvironmentRequest rebuildEnvironmentRequest) {
        ExecutionContext executionContext = createExecutionContext(rebuildEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RebuildEnvironmentRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new RebuildEnvironmentRequestMarshaller().marshall(rebuildEnvironmentRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Returns list of event descriptions matching criteria up to the last 6
     * weeks.
     * </p>
     * <p>
     * <b>NOTE:</b> This action returns the most recent 1,000 events from the
     * specified NextToken.
     * </p>
     *
     * @param describeEventsRequest Container for the necessary parameters to
     *           execute the DescribeEvents service method on AWSElasticBeanstalk.
     * 
     * @return The response from the DescribeEvents service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeEventsRequest> request = null;
        Response<DescribeEventsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeEventsRequestMarshaller().marshall(describeEventsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeEventsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates the Amazon S3 storage location for the account.
     * </p>
     * <p>
     * This location is used to store user log files.
     * </p>
     * 
     * @return The response from the CreateStorageLocation service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     * @throws S3SubscriptionRequiredException
     * @throws TooManyBucketsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateStorageLocationResult createStorageLocation() throws AmazonServiceException, AmazonClientException {
        return createStorageLocation(new CreateStorageLocationRequest());
    }
    
    /**
     * <p>
     * Returns descriptions for existing application versions.
     * </p>
     * 
     * @return The response from the DescribeApplicationVersions service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeApplicationVersionsResult describeApplicationVersions() throws AmazonServiceException, AmazonClientException {
        return describeApplicationVersions(new DescribeApplicationVersionsRequest());
    }
    
    /**
     * <p>
     * Swaps the CNAMEs of two environments.
     * </p>
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void swapEnvironmentCNAMEs() throws AmazonServiceException, AmazonClientException {
        swapEnvironmentCNAMEs(new SwapEnvironmentCNAMEsRequest());
    }
    
    /**
     * <p>
     * Returns a list of the available solution stack names.
     * </p>
     * 
     * @return The response from the ListAvailableSolutionStacks service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAvailableSolutionStacksResult listAvailableSolutionStacks() throws AmazonServiceException, AmazonClientException {
        return listAvailableSolutionStacks(new ListAvailableSolutionStacksRequest());
    }
    
    /**
     * <p>
     * Returns descriptions for existing environments.
     * </p>
     * 
     * @return The response from the DescribeEnvironments service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEnvironmentsResult describeEnvironments() throws AmazonServiceException, AmazonClientException {
        return describeEnvironments(new DescribeEnvironmentsRequest());
    }
    
    /**
     * <p>
     * Returns the descriptions of existing applications.
     * </p>
     * 
     * @return The response from the DescribeApplications service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeApplicationsResult describeApplications() throws AmazonServiceException, AmazonClientException {
        return describeApplications(new DescribeApplicationsRequest());
    }
    
    /**
     * <p>
     * Returns list of event descriptions matching criteria up to the last 6
     * weeks.
     * </p>
     * <p>
     * <b>NOTE:</b> This action returns the most recent 1,000 events from the
     * specified NextToken.
     * </p>
     * 
     * @return The response from the DescribeEvents service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents() throws AmazonServiceException, AmazonClientException {
        return describeEvents(new DescribeEventsRequest());
    }
    

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext)
    {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        for (Entry<String, String> entry : originalRequest.copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setSigner(getSigner());
        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        
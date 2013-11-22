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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.elasticbeanstalk.model.*;


/**
 * Asynchronous client for accessing AWSElasticBeanstalk.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
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
public class AWSElasticBeanstalkAsyncClient extends AWSElasticBeanstalkClient
        implements AWSElasticBeanstalkAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
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
    public AWSElasticBeanstalkAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
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
    public AWSElasticBeanstalkAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSElasticBeanstalk using the specified AWS account credentials.
     * Default client settings will be used, and a default cached thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSElasticBeanstalkAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSElasticBeanstalk using the specified AWS account credentials
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSElasticBeanstalkAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSElasticBeanstalk using the specified AWS account credentials,
     * executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSElasticBeanstalkAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSElasticBeanstalk using the specified AWS account credentials provider.
     * Default client settings will be used, and a default cached thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSElasticBeanstalkAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSElasticBeanstalk using the specified AWS account credentials provider
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSElasticBeanstalkAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSElasticBeanstalk using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     */
    public AWSElasticBeanstalkAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSElasticBeanstalk using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSElasticBeanstalkAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }


    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
            
    /**
     * <p>
     * Checks if the specified CNAME is available.
     * </p>
     *
     * @param checkDNSAvailabilityRequest Container for the necessary
     *           parameters to execute the CheckDNSAvailability operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         CheckDNSAvailability service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<CheckDNSAvailabilityResult> checkDNSAvailabilityAsync(final CheckDNSAvailabilityRequest checkDNSAvailabilityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CheckDNSAvailabilityResult>() {
            public CheckDNSAvailabilityResult call() throws Exception {
                return checkDNSAvailability(checkDNSAvailabilityRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Checks if the specified CNAME is available.
     * </p>
     *
     * @param checkDNSAvailabilityRequest Container for the necessary
     *           parameters to execute the CheckDNSAvailability operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CheckDNSAvailability service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<CheckDNSAvailabilityResult> checkDNSAvailabilityAsync(
            final CheckDNSAvailabilityRequest checkDNSAvailabilityRequest,
            final AsyncHandler<CheckDNSAvailabilityRequest, CheckDNSAvailabilityResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CheckDNSAvailabilityResult>() {
            public CheckDNSAvailabilityResult call() throws Exception {
            	CheckDNSAvailabilityResult result;
                try {
            		result = checkDNSAvailability(checkDNSAvailabilityRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(checkDNSAvailabilityRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DescribeConfigurationOptions operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConfigurationOptions service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<DescribeConfigurationOptionsResult> describeConfigurationOptionsAsync(final DescribeConfigurationOptionsRequest describeConfigurationOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeConfigurationOptionsResult>() {
            public DescribeConfigurationOptionsResult call() throws Exception {
                return describeConfigurationOptions(describeConfigurationOptionsRequest);
		    }
		});
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
     *           parameters to execute the DescribeConfigurationOptions operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConfigurationOptions service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<DescribeConfigurationOptionsResult> describeConfigurationOptionsAsync(
            final DescribeConfigurationOptionsRequest describeConfigurationOptionsRequest,
            final AsyncHandler<DescribeConfigurationOptionsRequest, DescribeConfigurationOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeConfigurationOptionsResult>() {
            public DescribeConfigurationOptionsResult call() throws Exception {
            	DescribeConfigurationOptionsResult result;
                try {
            		result = describeConfigurationOptions(describeConfigurationOptionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeConfigurationOptionsRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DeleteConfigurationTemplate operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteConfigurationTemplate service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<Void> deleteConfigurationTemplateAsync(final DeleteConfigurationTemplateRequest deleteConfigurationTemplateRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteConfigurationTemplate(deleteConfigurationTemplateRequest);
                return null;
		    }
		});
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
     *           parameters to execute the DeleteConfigurationTemplate operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteConfigurationTemplate service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<Void> deleteConfigurationTemplateAsync(
            final DeleteConfigurationTemplateRequest deleteConfigurationTemplateRequest,
            final AsyncHandler<DeleteConfigurationTemplateRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteConfigurationTemplate(deleteConfigurationTemplateRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteConfigurationTemplateRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Launches an environment for the specified application using the
     * specified configuration.
     * </p>
     *
     * @param createEnvironmentRequest Container for the necessary parameters
     *           to execute the CreateEnvironment operation on AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         CreateEnvironment service method, as returned by AWSElasticBeanstalk.
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
    public Future<CreateEnvironmentResult> createEnvironmentAsync(final CreateEnvironmentRequest createEnvironmentRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateEnvironmentResult>() {
            public CreateEnvironmentResult call() throws Exception {
                return createEnvironment(createEnvironmentRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Launches an environment for the specified application using the
     * specified configuration.
     * </p>
     *
     * @param createEnvironmentRequest Container for the necessary parameters
     *           to execute the CreateEnvironment operation on AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateEnvironment service method, as returned by AWSElasticBeanstalk.
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
    public Future<CreateEnvironmentResult> createEnvironmentAsync(
            final CreateEnvironmentRequest createEnvironmentRequest,
            final AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateEnvironmentResult>() {
            public CreateEnvironmentResult call() throws Exception {
            	CreateEnvironmentResult result;
                try {
            		result = createEnvironment(createEnvironmentRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createEnvironmentRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the CreateStorageLocation operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStorageLocation service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<CreateStorageLocationResult> createStorageLocationAsync(final CreateStorageLocationRequest createStorageLocationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateStorageLocationResult>() {
            public CreateStorageLocationResult call() throws Exception {
                return createStorageLocation(createStorageLocationRequest);
		    }
		});
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
     *           parameters to execute the CreateStorageLocation operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStorageLocation service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<CreateStorageLocationResult> createStorageLocationAsync(
            final CreateStorageLocationRequest createStorageLocationRequest,
            final AsyncHandler<CreateStorageLocationRequest, CreateStorageLocationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateStorageLocationResult>() {
            public CreateStorageLocationResult call() throws Exception {
            	CreateStorageLocationResult result;
                try {
            		result = createStorageLocation(createStorageLocationRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createStorageLocationRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the RequestEnvironmentInfo operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         RequestEnvironmentInfo service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<Void> requestEnvironmentInfoAsync(final RequestEnvironmentInfoRequest requestEnvironmentInfoRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                requestEnvironmentInfo(requestEnvironmentInfoRequest);
                return null;
		    }
		});
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
     *           parameters to execute the RequestEnvironmentInfo operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RequestEnvironmentInfo service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<Void> requestEnvironmentInfoAsync(
            final RequestEnvironmentInfoRequest requestEnvironmentInfoRequest,
            final AsyncHandler<RequestEnvironmentInfoRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		requestEnvironmentInfo(requestEnvironmentInfoRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(requestEnvironmentInfoRequest, null);
               	return null;
		    }
		});
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
     *           parameters to execute the CreateApplicationVersion operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         CreateApplicationVersion service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<CreateApplicationVersionResult> createApplicationVersionAsync(final CreateApplicationVersionRequest createApplicationVersionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateApplicationVersionResult>() {
            public CreateApplicationVersionResult call() throws Exception {
                return createApplicationVersion(createApplicationVersionRequest);
		    }
		});
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
     *           parameters to execute the CreateApplicationVersion operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateApplicationVersion service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<CreateApplicationVersionResult> createApplicationVersionAsync(
            final CreateApplicationVersionRequest createApplicationVersionRequest,
            final AsyncHandler<CreateApplicationVersionRequest, CreateApplicationVersionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateApplicationVersionResult>() {
            public CreateApplicationVersionResult call() throws Exception {
            	CreateApplicationVersionResult result;
                try {
            		result = createApplicationVersion(createApplicationVersionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createApplicationVersionRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DeleteApplicationVersion operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteApplicationVersion service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<Void> deleteApplicationVersionAsync(final DeleteApplicationVersionRequest deleteApplicationVersionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteApplicationVersion(deleteApplicationVersionRequest);
                return null;
		    }
		});
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
     *           parameters to execute the DeleteApplicationVersion operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteApplicationVersion service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<Void> deleteApplicationVersionAsync(
            final DeleteApplicationVersionRequest deleteApplicationVersionRequest,
            final AsyncHandler<DeleteApplicationVersionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteApplicationVersion(deleteApplicationVersionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteApplicationVersionRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns descriptions for existing application versions.
     * </p>
     *
     * @param describeApplicationVersionsRequest Container for the necessary
     *           parameters to execute the DescribeApplicationVersions operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeApplicationVersions service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<DescribeApplicationVersionsResult> describeApplicationVersionsAsync(final DescribeApplicationVersionsRequest describeApplicationVersionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeApplicationVersionsResult>() {
            public DescribeApplicationVersionsResult call() throws Exception {
                return describeApplicationVersions(describeApplicationVersionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns descriptions for existing application versions.
     * </p>
     *
     * @param describeApplicationVersionsRequest Container for the necessary
     *           parameters to execute the DescribeApplicationVersions operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeApplicationVersions service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<DescribeApplicationVersionsResult> describeApplicationVersionsAsync(
            final DescribeApplicationVersionsRequest describeApplicationVersionsRequest,
            final AsyncHandler<DescribeApplicationVersionsRequest, DescribeApplicationVersionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeApplicationVersionsResult>() {
            public DescribeApplicationVersionsResult call() throws Exception {
            	DescribeApplicationVersionsResult result;
                try {
            		result = describeApplicationVersions(describeApplicationVersionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeApplicationVersionsRequest, result);
               	return result;
		    }
		});
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
     *           to execute the DeleteApplication operation on AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteApplication service method, as returned by AWSElasticBeanstalk.
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
    public Future<Void> deleteApplicationAsync(final DeleteApplicationRequest deleteApplicationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteApplication(deleteApplicationRequest);
                return null;
		    }
		});
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
     *           to execute the DeleteApplication operation on AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteApplication service method, as returned by AWSElasticBeanstalk.
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
    public Future<Void> deleteApplicationAsync(
            final DeleteApplicationRequest deleteApplicationRequest,
            final AsyncHandler<DeleteApplicationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteApplication(deleteApplicationRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteApplicationRequest, null);
               	return null;
		    }
		});
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
     *           parameters to execute the UpdateApplicationVersion operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateApplicationVersion service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<UpdateApplicationVersionResult> updateApplicationVersionAsync(final UpdateApplicationVersionRequest updateApplicationVersionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateApplicationVersionResult>() {
            public UpdateApplicationVersionResult call() throws Exception {
                return updateApplicationVersion(updateApplicationVersionRequest);
		    }
		});
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
     *           parameters to execute the UpdateApplicationVersion operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateApplicationVersion service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<UpdateApplicationVersionResult> updateApplicationVersionAsync(
            final UpdateApplicationVersionRequest updateApplicationVersionRequest,
            final AsyncHandler<UpdateApplicationVersionRequest, UpdateApplicationVersionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateApplicationVersionResult>() {
            public UpdateApplicationVersionResult call() throws Exception {
            	UpdateApplicationVersionResult result;
                try {
            		result = updateApplicationVersion(updateApplicationVersionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateApplicationVersionRequest, result);
               	return result;
		    }
		});
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
     *           to execute the CreateApplication operation on AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         CreateApplication service method, as returned by AWSElasticBeanstalk.
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
    public Future<CreateApplicationResult> createApplicationAsync(final CreateApplicationRequest createApplicationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateApplicationResult>() {
            public CreateApplicationResult call() throws Exception {
                return createApplication(createApplicationRequest);
		    }
		});
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
     *           to execute the CreateApplication operation on AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateApplication service method, as returned by AWSElasticBeanstalk.
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
    public Future<CreateApplicationResult> createApplicationAsync(
            final CreateApplicationRequest createApplicationRequest,
            final AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateApplicationResult>() {
            public CreateApplicationResult call() throws Exception {
            	CreateApplicationResult result;
                try {
            		result = createApplication(createApplicationRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createApplicationRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Swaps the CNAMEs of two environments.
     * </p>
     *
     * @param swapEnvironmentCNAMEsRequest Container for the necessary
     *           parameters to execute the SwapEnvironmentCNAMEs operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         SwapEnvironmentCNAMEs service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<Void> swapEnvironmentCNAMEsAsync(final SwapEnvironmentCNAMEsRequest swapEnvironmentCNAMEsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                swapEnvironmentCNAMEs(swapEnvironmentCNAMEsRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Swaps the CNAMEs of two environments.
     * </p>
     *
     * @param swapEnvironmentCNAMEsRequest Container for the necessary
     *           parameters to execute the SwapEnvironmentCNAMEs operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SwapEnvironmentCNAMEs service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<Void> swapEnvironmentCNAMEsAsync(
            final SwapEnvironmentCNAMEsRequest swapEnvironmentCNAMEsRequest,
            final AsyncHandler<SwapEnvironmentCNAMEsRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		swapEnvironmentCNAMEs(swapEnvironmentCNAMEsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(swapEnvironmentCNAMEsRequest, null);
               	return null;
		    }
		});
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
     *           parameters to execute the UpdateConfigurationTemplate operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateConfigurationTemplate service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<UpdateConfigurationTemplateResult> updateConfigurationTemplateAsync(final UpdateConfigurationTemplateRequest updateConfigurationTemplateRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateConfigurationTemplateResult>() {
            public UpdateConfigurationTemplateResult call() throws Exception {
                return updateConfigurationTemplate(updateConfigurationTemplateRequest);
		    }
		});
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
     *           parameters to execute the UpdateConfigurationTemplate operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateConfigurationTemplate service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<UpdateConfigurationTemplateResult> updateConfigurationTemplateAsync(
            final UpdateConfigurationTemplateRequest updateConfigurationTemplateRequest,
            final AsyncHandler<UpdateConfigurationTemplateRequest, UpdateConfigurationTemplateResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateConfigurationTemplateResult>() {
            public UpdateConfigurationTemplateResult call() throws Exception {
            	UpdateConfigurationTemplateResult result;
                try {
            		result = updateConfigurationTemplate(updateConfigurationTemplateRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateConfigurationTemplateRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the RetrieveEnvironmentInfo operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         RetrieveEnvironmentInfo service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<RetrieveEnvironmentInfoResult> retrieveEnvironmentInfoAsync(final RetrieveEnvironmentInfoRequest retrieveEnvironmentInfoRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RetrieveEnvironmentInfoResult>() {
            public RetrieveEnvironmentInfoResult call() throws Exception {
                return retrieveEnvironmentInfo(retrieveEnvironmentInfoRequest);
		    }
		});
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
     *           parameters to execute the RetrieveEnvironmentInfo operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RetrieveEnvironmentInfo service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<RetrieveEnvironmentInfoResult> retrieveEnvironmentInfoAsync(
            final RetrieveEnvironmentInfoRequest retrieveEnvironmentInfoRequest,
            final AsyncHandler<RetrieveEnvironmentInfoRequest, RetrieveEnvironmentInfoResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RetrieveEnvironmentInfoResult>() {
            public RetrieveEnvironmentInfoResult call() throws Exception {
            	RetrieveEnvironmentInfoResult result;
                try {
            		result = retrieveEnvironmentInfo(retrieveEnvironmentInfoRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(retrieveEnvironmentInfoRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list of the available solution stack names.
     * </p>
     *
     * @param listAvailableSolutionStacksRequest Container for the necessary
     *           parameters to execute the ListAvailableSolutionStacks operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         ListAvailableSolutionStacks service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<ListAvailableSolutionStacksResult> listAvailableSolutionStacksAsync(final ListAvailableSolutionStacksRequest listAvailableSolutionStacksRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAvailableSolutionStacksResult>() {
            public ListAvailableSolutionStacksResult call() throws Exception {
                return listAvailableSolutionStacks(listAvailableSolutionStacksRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns a list of the available solution stack names.
     * </p>
     *
     * @param listAvailableSolutionStacksRequest Container for the necessary
     *           parameters to execute the ListAvailableSolutionStacks operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListAvailableSolutionStacks service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<ListAvailableSolutionStacksResult> listAvailableSolutionStacksAsync(
            final ListAvailableSolutionStacksRequest listAvailableSolutionStacksRequest,
            final AsyncHandler<ListAvailableSolutionStacksRequest, ListAvailableSolutionStacksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAvailableSolutionStacksResult>() {
            public ListAvailableSolutionStacksResult call() throws Exception {
            	ListAvailableSolutionStacksResult result;
                try {
            		result = listAvailableSolutionStacks(listAvailableSolutionStacksRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listAvailableSolutionStacksRequest, result);
               	return result;
		    }
		});
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
     *           to execute the UpdateApplication operation on AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateApplication service method, as returned by AWSElasticBeanstalk.
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
    public Future<UpdateApplicationResult> updateApplicationAsync(final UpdateApplicationRequest updateApplicationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateApplicationResult>() {
            public UpdateApplicationResult call() throws Exception {
                return updateApplication(updateApplicationRequest);
		    }
		});
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
     *           to execute the UpdateApplication operation on AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateApplication service method, as returned by AWSElasticBeanstalk.
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
    public Future<UpdateApplicationResult> updateApplicationAsync(
            final UpdateApplicationRequest updateApplicationRequest,
            final AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateApplicationResult>() {
            public UpdateApplicationResult call() throws Exception {
            	UpdateApplicationResult result;
                try {
            		result = updateApplication(updateApplicationRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateApplicationRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns descriptions for existing environments.
     * </p>
     *
     * @param describeEnvironmentsRequest Container for the necessary
     *           parameters to execute the DescribeEnvironments operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEnvironments service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(final DescribeEnvironmentsRequest describeEnvironmentsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEnvironmentsResult>() {
            public DescribeEnvironmentsResult call() throws Exception {
                return describeEnvironments(describeEnvironmentsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns descriptions for existing environments.
     * </p>
     *
     * @param describeEnvironmentsRequest Container for the necessary
     *           parameters to execute the DescribeEnvironments operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEnvironments service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(
            final DescribeEnvironmentsRequest describeEnvironmentsRequest,
            final AsyncHandler<DescribeEnvironmentsRequest, DescribeEnvironmentsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEnvironmentsResult>() {
            public DescribeEnvironmentsResult call() throws Exception {
            	DescribeEnvironmentsResult result;
                try {
            		result = describeEnvironments(describeEnvironmentsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeEnvironmentsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns AWS resources for this environment.
     * </p>
     *
     * @param describeEnvironmentResourcesRequest Container for the necessary
     *           parameters to execute the DescribeEnvironmentResources operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEnvironmentResources service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<DescribeEnvironmentResourcesResult> describeEnvironmentResourcesAsync(final DescribeEnvironmentResourcesRequest describeEnvironmentResourcesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEnvironmentResourcesResult>() {
            public DescribeEnvironmentResourcesResult call() throws Exception {
                return describeEnvironmentResources(describeEnvironmentResourcesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns AWS resources for this environment.
     * </p>
     *
     * @param describeEnvironmentResourcesRequest Container for the necessary
     *           parameters to execute the DescribeEnvironmentResources operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEnvironmentResources service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<DescribeEnvironmentResourcesResult> describeEnvironmentResourcesAsync(
            final DescribeEnvironmentResourcesRequest describeEnvironmentResourcesRequest,
            final AsyncHandler<DescribeEnvironmentResourcesRequest, DescribeEnvironmentResourcesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEnvironmentResourcesResult>() {
            public DescribeEnvironmentResourcesResult call() throws Exception {
            	DescribeEnvironmentResourcesResult result;
                try {
            		result = describeEnvironmentResources(describeEnvironmentResourcesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeEnvironmentResourcesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Terminates the specified environment.
     * </p>
     *
     * @param terminateEnvironmentRequest Container for the necessary
     *           parameters to execute the TerminateEnvironment operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateEnvironment service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<TerminateEnvironmentResult> terminateEnvironmentAsync(final TerminateEnvironmentRequest terminateEnvironmentRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TerminateEnvironmentResult>() {
            public TerminateEnvironmentResult call() throws Exception {
                return terminateEnvironment(terminateEnvironmentRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Terminates the specified environment.
     * </p>
     *
     * @param terminateEnvironmentRequest Container for the necessary
     *           parameters to execute the TerminateEnvironment operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateEnvironment service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<TerminateEnvironmentResult> terminateEnvironmentAsync(
            final TerminateEnvironmentRequest terminateEnvironmentRequest,
            final AsyncHandler<TerminateEnvironmentRequest, TerminateEnvironmentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TerminateEnvironmentResult>() {
            public TerminateEnvironmentResult call() throws Exception {
            	TerminateEnvironmentResult result;
                try {
            		result = terminateEnvironment(terminateEnvironmentRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(terminateEnvironmentRequest, result);
               	return result;
		    }
		});
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
     *           operation on AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         ValidateConfigurationSettings service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<ValidateConfigurationSettingsResult> validateConfigurationSettingsAsync(final ValidateConfigurationSettingsRequest validateConfigurationSettingsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ValidateConfigurationSettingsResult>() {
            public ValidateConfigurationSettingsResult call() throws Exception {
                return validateConfigurationSettings(validateConfigurationSettingsRequest);
		    }
		});
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
     *           operation on AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ValidateConfigurationSettings service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<ValidateConfigurationSettingsResult> validateConfigurationSettingsAsync(
            final ValidateConfigurationSettingsRequest validateConfigurationSettingsRequest,
            final AsyncHandler<ValidateConfigurationSettingsRequest, ValidateConfigurationSettingsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ValidateConfigurationSettingsResult>() {
            public ValidateConfigurationSettingsResult call() throws Exception {
            	ValidateConfigurationSettingsResult result;
                try {
            		result = validateConfigurationSettings(validateConfigurationSettingsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(validateConfigurationSettingsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Causes the environment to restart the application container server
     * running on each Amazon EC2 instance.
     * </p>
     *
     * @param restartAppServerRequest Container for the necessary parameters
     *           to execute the RestartAppServer operation on AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         RestartAppServer service method, as returned by AWSElasticBeanstalk.
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
    public Future<Void> restartAppServerAsync(final RestartAppServerRequest restartAppServerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                restartAppServer(restartAppServerRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Causes the environment to restart the application container server
     * running on each Amazon EC2 instance.
     * </p>
     *
     * @param restartAppServerRequest Container for the necessary parameters
     *           to execute the RestartAppServer operation on AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RestartAppServer service method, as returned by AWSElasticBeanstalk.
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
    public Future<Void> restartAppServerAsync(
            final RestartAppServerRequest restartAppServerRequest,
            final AsyncHandler<RestartAppServerRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		restartAppServer(restartAppServerRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(restartAppServerRequest, null);
               	return null;
		    }
		});
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
     *           operation on AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteEnvironmentConfiguration service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<Void> deleteEnvironmentConfigurationAsync(final DeleteEnvironmentConfigurationRequest deleteEnvironmentConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteEnvironmentConfiguration(deleteEnvironmentConfigurationRequest);
                return null;
		    }
		});
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
     *           operation on AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteEnvironmentConfiguration service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<Void> deleteEnvironmentConfigurationAsync(
            final DeleteEnvironmentConfigurationRequest deleteEnvironmentConfigurationRequest,
            final AsyncHandler<DeleteEnvironmentConfigurationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteEnvironmentConfiguration(deleteEnvironmentConfigurationRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteEnvironmentConfigurationRequest, null);
               	return null;
		    }
		});
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
     *           to execute the UpdateEnvironment operation on AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateEnvironment service method, as returned by AWSElasticBeanstalk.
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
    public Future<UpdateEnvironmentResult> updateEnvironmentAsync(final UpdateEnvironmentRequest updateEnvironmentRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateEnvironmentResult>() {
            public UpdateEnvironmentResult call() throws Exception {
                return updateEnvironment(updateEnvironmentRequest);
		    }
		});
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
     *           to execute the UpdateEnvironment operation on AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateEnvironment service method, as returned by AWSElasticBeanstalk.
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
    public Future<UpdateEnvironmentResult> updateEnvironmentAsync(
            final UpdateEnvironmentRequest updateEnvironmentRequest,
            final AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateEnvironmentResult>() {
            public UpdateEnvironmentResult call() throws Exception {
            	UpdateEnvironmentResult result;
                try {
            		result = updateEnvironment(updateEnvironmentRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateEnvironmentRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the CreateConfigurationTemplate operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         CreateConfigurationTemplate service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<CreateConfigurationTemplateResult> createConfigurationTemplateAsync(final CreateConfigurationTemplateRequest createConfigurationTemplateRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateConfigurationTemplateResult>() {
            public CreateConfigurationTemplateResult call() throws Exception {
                return createConfigurationTemplate(createConfigurationTemplateRequest);
		    }
		});
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
     *           parameters to execute the CreateConfigurationTemplate operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateConfigurationTemplate service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<CreateConfigurationTemplateResult> createConfigurationTemplateAsync(
            final CreateConfigurationTemplateRequest createConfigurationTemplateRequest,
            final AsyncHandler<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateConfigurationTemplateResult>() {
            public CreateConfigurationTemplateResult call() throws Exception {
            	CreateConfigurationTemplateResult result;
                try {
            		result = createConfigurationTemplate(createConfigurationTemplateRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createConfigurationTemplateRequest, result);
               	return result;
		    }
		});
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
     *           operation on AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConfigurationSettings service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<DescribeConfigurationSettingsResult> describeConfigurationSettingsAsync(final DescribeConfigurationSettingsRequest describeConfigurationSettingsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeConfigurationSettingsResult>() {
            public DescribeConfigurationSettingsResult call() throws Exception {
                return describeConfigurationSettings(describeConfigurationSettingsRequest);
		    }
		});
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
     *           operation on AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConfigurationSettings service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<DescribeConfigurationSettingsResult> describeConfigurationSettingsAsync(
            final DescribeConfigurationSettingsRequest describeConfigurationSettingsRequest,
            final AsyncHandler<DescribeConfigurationSettingsRequest, DescribeConfigurationSettingsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeConfigurationSettingsResult>() {
            public DescribeConfigurationSettingsResult call() throws Exception {
            	DescribeConfigurationSettingsResult result;
                try {
            		result = describeConfigurationSettings(describeConfigurationSettingsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeConfigurationSettingsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the descriptions of existing applications.
     * </p>
     *
     * @param describeApplicationsRequest Container for the necessary
     *           parameters to execute the DescribeApplications operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeApplications service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<DescribeApplicationsResult> describeApplicationsAsync(final DescribeApplicationsRequest describeApplicationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeApplicationsResult>() {
            public DescribeApplicationsResult call() throws Exception {
                return describeApplications(describeApplicationsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the descriptions of existing applications.
     * </p>
     *
     * @param describeApplicationsRequest Container for the necessary
     *           parameters to execute the DescribeApplications operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeApplications service method, as returned by
     *         AWSElasticBeanstalk.
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
    public Future<DescribeApplicationsResult> describeApplicationsAsync(
            final DescribeApplicationsRequest describeApplicationsRequest,
            final AsyncHandler<DescribeApplicationsRequest, DescribeApplicationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeApplicationsResult>() {
            public DescribeApplicationsResult call() throws Exception {
            	DescribeApplicationsResult result;
                try {
            		result = describeApplications(describeApplicationsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeApplicationsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes and recreates all of the AWS resources (for example: the Auto
     * Scaling group, load balancer, etc.) for a specified environment and
     * forces a restart.
     * </p>
     *
     * @param rebuildEnvironmentRequest Container for the necessary
     *           parameters to execute the RebuildEnvironment operation on
     *           AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         RebuildEnvironment service method, as returned by AWSElasticBeanstalk.
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
    public Future<Void> rebuildEnvironmentAsync(final RebuildEnvironmentRequest rebuildEnvironmentRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                rebuildEnvironment(rebuildEnvironmentRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deletes and recreates all of the AWS resources (for example: the Auto
     * Scaling group, load balancer, etc.) for a specified environment and
     * forces a restart.
     * </p>
     *
     * @param rebuildEnvironmentRequest Container for the necessary
     *           parameters to execute the RebuildEnvironment operation on
     *           AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RebuildEnvironment service method, as returned by AWSElasticBeanstalk.
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
    public Future<Void> rebuildEnvironmentAsync(
            final RebuildEnvironmentRequest rebuildEnvironmentRequest,
            final AsyncHandler<RebuildEnvironmentRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		rebuildEnvironment(rebuildEnvironmentRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(rebuildEnvironmentRequest, null);
               	return null;
		    }
		});
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
     *           execute the DescribeEvents operation on AWSElasticBeanstalk.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEvents service method, as returned by AWSElasticBeanstalk.
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
    public Future<DescribeEventsResult> describeEventsAsync(final DescribeEventsRequest describeEventsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEventsResult>() {
            public DescribeEventsResult call() throws Exception {
                return describeEvents(describeEventsRequest);
		    }
		});
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
     *           execute the DescribeEvents operation on AWSElasticBeanstalk.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEvents service method, as returned by AWSElasticBeanstalk.
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
    public Future<DescribeEventsResult> describeEventsAsync(
            final DescribeEventsRequest describeEventsRequest,
            final AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEventsResult>() {
            public DescribeEventsResult call() throws Exception {
            	DescribeEventsResult result;
                try {
            		result = describeEvents(describeEventsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeEventsRequest, result);
               	return result;
		    }
		});
    }
    
}
        
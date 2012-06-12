/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.elasticbeanstalk.model.*;


/**
 * Client for accessing AWSElasticBeanstalk.  All calls made
 * using this client are non-blocking and will immediately return a Java Future.
 * Callers must use the Future object to determine when the service call has actually
 * completed.
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
     * @see DefaultAWSCredentialsProvider
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
     * @see DefaultAWSCredentialsProvider
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
    
}
        
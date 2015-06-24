/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks;

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

import com.amazonaws.services.opsworks.model.*;

/**
 * Asynchronous client for accessing AWSOpsWorks.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * AWS OpsWorks <p>
 * Welcome to the <i>AWS OpsWorks API Reference</i> . This guide provides
 * descriptions, syntax, and usage examples about AWS OpsWorks actions
 * and data types, including common parameters and error codes.
 * </p>
 * <p>
 * AWS OpsWorks is an application management service that provides an
 * integrated experience for overseeing the complete application
 * lifecycle. For information about this product, go to the
 * <a href="http://aws.amazon.com/opsworks/"> AWS OpsWorks </a>
 * details page.
 * </p>
 * <p>
 * <b>SDKs and CLI</b>
 * </p>
 * <p>
 * The most common way to use the AWS OpsWorks API is by using the AWS
 * Command Line Interface (CLI) or by using one of the AWS SDKs to
 * implement applications in your preferred language. For more
 * information, see:
 * </p>
 * 
 * <ul>
 * <li>
 * <a href="http://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html"> AWS CLI </a>
 * </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/opsworks/AWSOpsWorksClient.html"> AWS SDK for Java </a>
 * </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/sdkfornet/latest/apidocs/html/N_Amazon_OpsWorks.htm"> AWS SDK for .NET </a>
 * </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/aws-sdk-php-2/latest/class-Aws.OpsWorks.OpsWorksClient.html"> AWS SDK for PHP 2 </a>
 * </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AWSRubySDK/latest/AWS/OpsWorks/Client.html"> AWS SDK for Ruby </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/documentation/sdkforjavascript/"> AWS SDK for Node.js </a>
 * </li>
 * <li>
 * <a href="http://docs.pythonboto.org/en/latest/ref/opsworks.html"> AWS SDK for Python(Boto) </a>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS OpsWorks supports only one endpoint,
 * opsworks.us-east-1.amazonaws.com (HTTPS), so you must connect to that
 * endpoint. You can then use the API to direct AWS OpsWorks to create
 * stacks in any AWS Region.
 * </p>
 * <p>
 * <b>Chef Versions</b>
 * </p>
 * <p>
 * When you call CreateStack, CloneStack, or UpdateStack we recommend you
 * use the <code>ConfigurationManager</code> parameter to specify the
 * Chef version, 0.9, 11.4, or 11.10. The default value is currently
 * 11.10. For more information, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-chef11.html"> Chef Versions </a>
 * .
 * </p>
 * <p>
 * <b>NOTE:</b>You can still specify Chef 0.9 for your stack, but new
 * features are not available for Chef 0.9 stacks, and support is
 * scheduled to end on July 24, 2014. We do not recommend using Chef 0.9
 * for new stacks, and we recommend migrating your existing Chef 0.9
 * stacks to Chef 11.10 as soon as possible.
 * </p>
 */
public class AWSOpsWorksAsyncClient extends AWSOpsWorksClient
        implements AWSOpsWorksAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks.  A credentials provider chain will be used
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
    public AWSOpsWorksAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks.  A credentials provider chain will be used
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
     *                       client connects to AWSOpsWorks
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSOpsWorksAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials.
     * Default client settings will be used, and a fixed size thread pool will be
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
    public AWSOpsWorksAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials
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
    public AWSOpsWorksAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials,
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
    public AWSOpsWorksAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials provider.
     * Default client settings will be used, and a fixed size thread pool will be
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
    public AWSOpsWorksAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials provider
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
    public AWSOpsWorksAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials
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
    public AWSOpsWorksAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials
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
    public AWSOpsWorksAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * call getExecutorService().shutdown() followed by
     * getExecutorService().awaitTermination() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
            
    /**
     * <p>
     * Deregisters an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterRdsDbInstanceRequest Container for the necessary
     *           parameters to execute the DeregisterRdsDbInstance operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterRdsDbInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterRdsDbInstanceAsync(final DeregisterRdsDbInstanceRequest deregisterRdsDbInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deregisterRdsDbInstance(deregisterRdsDbInstanceRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deregisters an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterRdsDbInstanceRequest Container for the necessary
     *           parameters to execute the DeregisterRdsDbInstance operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterRdsDbInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterRdsDbInstanceAsync(
            final DeregisterRdsDbInstanceRequest deregisterRdsDbInstanceRequest,
            final AsyncHandler<DeregisterRdsDbInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deregisterRdsDbInstance(deregisterRdsDbInstanceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deregisterRdsDbInstanceRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Registers an Amazon RDS instance with a stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerRdsDbInstanceRequest Container for the necessary
     *           parameters to execute the RegisterRdsDbInstance operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterRdsDbInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> registerRdsDbInstanceAsync(final RegisterRdsDbInstanceRequest registerRdsDbInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                registerRdsDbInstance(registerRdsDbInstanceRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Registers an Amazon RDS instance with a stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerRdsDbInstanceRequest Container for the necessary
     *           parameters to execute the RegisterRdsDbInstance operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterRdsDbInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> registerRdsDbInstanceAsync(
            final RegisterRdsDbInstanceRequest registerRdsDbInstanceRequest,
            final AsyncHandler<RegisterRdsDbInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                registerRdsDbInstance(registerRdsDbInstanceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(registerRdsDbInstanceRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Updates a user's SSH public key.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have self-management enabled or an attached policy that explicitly
     * grants permissions. For more information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateMyUserProfileRequest Container for the necessary
     *           parameters to execute the UpdateMyUserProfile operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateMyUserProfile service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateMyUserProfileAsync(final UpdateMyUserProfileRequest updateMyUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateMyUserProfile(updateMyUserProfileRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Updates a user's SSH public key.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have self-management enabled or an attached policy that explicitly
     * grants permissions. For more information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateMyUserProfileRequest Container for the necessary
     *           parameters to execute the UpdateMyUserProfile operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateMyUserProfile service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateMyUserProfileAsync(
            final UpdateMyUserProfileRequest updateMyUserProfileRequest,
            final AsyncHandler<UpdateMyUserProfileRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                updateMyUserProfile(updateMyUserProfileRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateMyUserProfileRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Deregisters an Amazon EBS volume. The volume can then be registered
     * by another stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterVolumeRequest Container for the necessary parameters
     *           to execute the DeregisterVolume operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterVolumeAsync(final DeregisterVolumeRequest deregisterVolumeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deregisterVolume(deregisterVolumeRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deregisters an Amazon EBS volume. The volume can then be registered
     * by another stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterVolumeRequest Container for the necessary parameters
     *           to execute the DeregisterVolume operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterVolumeAsync(
            final DeregisterVolumeRequest deregisterVolumeRequest,
            final AsyncHandler<DeregisterVolumeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deregisterVolume(deregisterVolumeRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deregisterVolumeRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Specifies a user's permissions. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingsecurity.html"> Security and Permissions </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param setPermissionRequest Container for the necessary parameters to
     *           execute the SetPermission operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         SetPermission service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setPermissionAsync(final SetPermissionRequest setPermissionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setPermission(setPermissionRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Specifies a user's permissions. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingsecurity.html"> Security and Permissions </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param setPermissionRequest Container for the necessary parameters to
     *           execute the SetPermission operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetPermission service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setPermissionAsync(
            final SetPermissionRequest setPermissionRequest,
            final AsyncHandler<SetPermissionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                setPermission(setPermissionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(setPermissionRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Requests a description of a set of instances.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeInstancesRequest Container for the necessary parameters
     *           to execute the DescribeInstances operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstances service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstancesResult> describeInstancesAsync(final DescribeInstancesRequest describeInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstancesResult>() {
            public DescribeInstancesResult call() throws Exception {
                return describeInstances(describeInstancesRequest);
        }
    });
    }

    /**
     * <p>
     * Requests a description of a set of instances.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeInstancesRequest Container for the necessary parameters
     *           to execute the DescribeInstances operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstances service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstancesResult> describeInstancesAsync(
            final DescribeInstancesRequest describeInstancesRequest,
            final AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstancesResult>() {
            public DescribeInstancesResult call() throws Exception {
              DescribeInstancesResult result;
                try {
                result = describeInstances(describeInstancesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeInstancesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes the permissions for a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describePermissionsRequest Container for the necessary
     *           parameters to execute the DescribePermissions operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribePermissions service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribePermissionsResult> describePermissionsAsync(final DescribePermissionsRequest describePermissionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePermissionsResult>() {
            public DescribePermissionsResult call() throws Exception {
                return describePermissions(describePermissionsRequest);
        }
    });
    }

    /**
     * <p>
     * Describes the permissions for a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describePermissionsRequest Container for the necessary
     *           parameters to execute the DescribePermissions operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribePermissions service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribePermissionsResult> describePermissionsAsync(
            final DescribePermissionsRequest describePermissionsRequest,
            final AsyncHandler<DescribePermissionsRequest, DescribePermissionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePermissionsResult>() {
            public DescribePermissionsResult call() throws Exception {
              DescribePermissionsResult result;
                try {
                result = describePermissions(describePermissionsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describePermissionsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes a specified instance, which terminates the associated Amazon
     * EC2 instance. You must stop an instance before you can delete it.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-delete.html"> Deleting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteInstanceRequest Container for the necessary parameters to
     *           execute the DeleteInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteInstanceAsync(final DeleteInstanceRequest deleteInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteInstance(deleteInstanceRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes a specified instance, which terminates the associated Amazon
     * EC2 instance. You must stop an instance before you can delete it.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-delete.html"> Deleting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteInstanceRequest Container for the necessary parameters to
     *           execute the DeleteInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteInstanceAsync(
            final DeleteInstanceRequest deleteInstanceRequest,
            final AsyncHandler<DeleteInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteInstance(deleteInstanceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteInstanceRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Creates a clone of a specified stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-cloning.html"> Clone a Stack </a>
     * . By default, all parameters are set to the values used by the parent
     * stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param cloneStackRequest Container for the necessary parameters to
     *           execute the CloneStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CloneStack service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CloneStackResult> cloneStackAsync(final CloneStackRequest cloneStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CloneStackResult>() {
            public CloneStackResult call() throws Exception {
                return cloneStack(cloneStackRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a clone of a specified stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-cloning.html"> Clone a Stack </a>
     * . By default, all parameters are set to the values used by the parent
     * stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param cloneStackRequest Container for the necessary parameters to
     *           execute the CloneStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CloneStack service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CloneStackResult> cloneStackAsync(
            final CloneStackRequest cloneStackRequest,
            final AsyncHandler<CloneStackRequest, CloneStackResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CloneStackResult>() {
            public CloneStackResult call() throws Exception {
              CloneStackResult result;
                try {
                result = cloneStack(cloneStackRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(cloneStackRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Detaches a specified Elastic Load Balancing instance from its layer.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param detachElasticLoadBalancerRequest Container for the necessary
     *           parameters to execute the DetachElasticLoadBalancer operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DetachElasticLoadBalancer service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> detachElasticLoadBalancerAsync(final DetachElasticLoadBalancerRequest detachElasticLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                detachElasticLoadBalancer(detachElasticLoadBalancerRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Detaches a specified Elastic Load Balancing instance from its layer.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param detachElasticLoadBalancerRequest Container for the necessary
     *           parameters to execute the DetachElasticLoadBalancer operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DetachElasticLoadBalancer service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> detachElasticLoadBalancerAsync(
            final DetachElasticLoadBalancerRequest detachElasticLoadBalancerRequest,
            final AsyncHandler<DetachElasticLoadBalancerRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                detachElasticLoadBalancer(detachElasticLoadBalancerRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(detachElasticLoadBalancerRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Stops a specified instance. When you stop a standard instance, the
     * data disappears and must be reinstalled when you restart the instance.
     * You can stop an Amazon EBS-backed instance without losing data. For
     * more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"> Starting, Stopping, and Rebooting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param stopInstanceRequest Container for the necessary parameters to
     *           execute the StopInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         StopInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> stopInstanceAsync(final StopInstanceRequest stopInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                stopInstance(stopInstanceRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Stops a specified instance. When you stop a standard instance, the
     * data disappears and must be reinstalled when you restart the instance.
     * You can stop an Amazon EBS-backed instance without losing data. For
     * more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"> Starting, Stopping, and Rebooting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param stopInstanceRequest Container for the necessary parameters to
     *           execute the StopInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StopInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> stopInstanceAsync(
            final StopInstanceRequest stopInstanceRequest,
            final AsyncHandler<StopInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                stopInstance(stopInstanceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(stopInstanceRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Updates a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Deploy or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateAppRequest Container for the necessary parameters to
     *           execute the UpdateApp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateApp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateAppAsync(final UpdateAppRequest updateAppRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateApp(updateAppRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Updates a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Deploy or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateAppRequest Container for the necessary parameters to
     *           execute the UpdateApp operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateApp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateAppAsync(
            final UpdateAppRequest updateAppRequest,
            final AsyncHandler<UpdateAppRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                updateApp(updateAppRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateAppRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Describes Amazon RDS instances.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeRdsDbInstancesRequest Container for the necessary
     *           parameters to execute the DescribeRdsDbInstances operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRdsDbInstances service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRdsDbInstancesResult> describeRdsDbInstancesAsync(final DescribeRdsDbInstancesRequest describeRdsDbInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeRdsDbInstancesResult>() {
            public DescribeRdsDbInstancesResult call() throws Exception {
                return describeRdsDbInstances(describeRdsDbInstancesRequest);
        }
    });
    }

    /**
     * <p>
     * Describes Amazon RDS instances.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeRdsDbInstancesRequest Container for the necessary
     *           parameters to execute the DescribeRdsDbInstances operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRdsDbInstances service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRdsDbInstancesResult> describeRdsDbInstancesAsync(
            final DescribeRdsDbInstancesRequest describeRdsDbInstancesRequest,
            final AsyncHandler<DescribeRdsDbInstancesRequest, DescribeRdsDbInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeRdsDbInstancesResult>() {
            public DescribeRdsDbInstancesResult call() throws Exception {
              DescribeRdsDbInstancesResult result;
                try {
                result = describeRdsDbInstances(describeRdsDbInstancesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeRdsDbInstancesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes the results of specified commands.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeCommandsRequest Container for the necessary parameters
     *           to execute the DescribeCommands operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCommands service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCommandsResult> describeCommandsAsync(final DescribeCommandsRequest describeCommandsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCommandsResult>() {
            public DescribeCommandsResult call() throws Exception {
                return describeCommands(describeCommandsRequest);
        }
    });
    }

    /**
     * <p>
     * Describes the results of specified commands.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeCommandsRequest Container for the necessary parameters
     *           to execute the DescribeCommands operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCommands service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCommandsResult> describeCommandsAsync(
            final DescribeCommandsRequest describeCommandsRequest,
            final AsyncHandler<DescribeCommandsRequest, DescribeCommandsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCommandsResult>() {
            public DescribeCommandsResult call() throws Exception {
              DescribeCommandsResult result;
                try {
                result = describeCommands(describeCommandsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeCommandsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Associates one of the stack's registered Elastic IP addresses with a
     * specified instance. The address must first be registered with the
     * stack by calling RegisterElasticIp. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param associateElasticIpRequest Container for the necessary
     *           parameters to execute the AssociateElasticIp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         AssociateElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> associateElasticIpAsync(final AssociateElasticIpRequest associateElasticIpRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                associateElasticIp(associateElasticIpRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Associates one of the stack's registered Elastic IP addresses with a
     * specified instance. The address must first be registered with the
     * stack by calling RegisterElasticIp. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param associateElasticIpRequest Container for the necessary
     *           parameters to execute the AssociateElasticIp operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AssociateElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> associateElasticIpAsync(
            final AssociateElasticIpRequest associateElasticIpRequest,
            final AsyncHandler<AssociateElasticIpRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                associateElasticIp(associateElasticIpRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(associateElasticIpRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Unassigns an assigned Amazon EBS volume. The volume remains
     * registered with the stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param unassignVolumeRequest Container for the necessary parameters to
     *           execute the UnassignVolume operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UnassignVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unassignVolumeAsync(final UnassignVolumeRequest unassignVolumeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                unassignVolume(unassignVolumeRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Unassigns an assigned Amazon EBS volume. The volume remains
     * registered with the stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param unassignVolumeRequest Container for the necessary parameters to
     *           execute the UnassignVolume operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UnassignVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unassignVolumeAsync(
            final UnassignVolumeRequest unassignVolumeRequest,
            final AsyncHandler<UnassignVolumeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                unassignVolume(unassignVolumeRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(unassignVolumeRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Describe an instance's RAID arrays.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeRaidArraysRequest Container for the necessary
     *           parameters to execute the DescribeRaidArrays operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRaidArrays service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRaidArraysResult> describeRaidArraysAsync(final DescribeRaidArraysRequest describeRaidArraysRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeRaidArraysResult>() {
            public DescribeRaidArraysResult call() throws Exception {
                return describeRaidArrays(describeRaidArraysRequest);
        }
    });
    }

    /**
     * <p>
     * Describe an instance's RAID arrays.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeRaidArraysRequest Container for the necessary
     *           parameters to execute the DescribeRaidArrays operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRaidArrays service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRaidArraysResult> describeRaidArraysAsync(
            final DescribeRaidArraysRequest describeRaidArraysRequest,
            final AsyncHandler<DescribeRaidArraysRequest, DescribeRaidArraysResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeRaidArraysResult>() {
            public DescribeRaidArraysResult call() throws Exception {
              DescribeRaidArraysResult result;
                try {
                result = describeRaidArrays(describeRaidArraysRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeRaidArraysRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets a generated host name for the specified layer, based on the
     * current host name theme.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param getHostnameSuggestionRequest Container for the necessary
     *           parameters to execute the GetHostnameSuggestion operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         GetHostnameSuggestion service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHostnameSuggestionResult> getHostnameSuggestionAsync(final GetHostnameSuggestionRequest getHostnameSuggestionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetHostnameSuggestionResult>() {
            public GetHostnameSuggestionResult call() throws Exception {
                return getHostnameSuggestion(getHostnameSuggestionRequest);
        }
    });
    }

    /**
     * <p>
     * Gets a generated host name for the specified layer, based on the
     * current host name theme.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param getHostnameSuggestionRequest Container for the necessary
     *           parameters to execute the GetHostnameSuggestion operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetHostnameSuggestion service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHostnameSuggestionResult> getHostnameSuggestionAsync(
            final GetHostnameSuggestionRequest getHostnameSuggestionRequest,
            final AsyncHandler<GetHostnameSuggestionRequest, GetHostnameSuggestionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetHostnameSuggestionResult>() {
            public GetHostnameSuggestionResult call() throws Exception {
              GetHostnameSuggestionResult result;
                try {
                result = getHostnameSuggestion(getHostnameSuggestionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getHostnameSuggestionRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Specify the load-based auto scaling configuration for a specified
     * layer. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"> Managing Load with Time-based and Load-based Instances </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> To use load-based auto scaling, you must create a set of
     * load-based auto scaling instances. Load-based auto scaling operates
     * only on the instances from that set, so you must ensure that you have
     * created enough instances to handle the maximum anticipated load.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param setLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetLoadBasedAutoScaling operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBasedAutoScaling service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setLoadBasedAutoScalingAsync(final SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setLoadBasedAutoScaling(setLoadBasedAutoScalingRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Specify the load-based auto scaling configuration for a specified
     * layer. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"> Managing Load with Time-based and Load-based Instances </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> To use load-based auto scaling, you must create a set of
     * load-based auto scaling instances. Load-based auto scaling operates
     * only on the instances from that set, so you must ensure that you have
     * created enough instances to handle the maximum anticipated load.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param setLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetLoadBasedAutoScaling operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBasedAutoScaling service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setLoadBasedAutoScalingAsync(
            final SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest,
            final AsyncHandler<SetLoadBasedAutoScalingRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                setLoadBasedAutoScaling(setLoadBasedAutoScalingRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(setLoadBasedAutoScalingRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Describes an instance's Amazon EBS volumes.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeVolumesRequest Container for the necessary parameters
     *           to execute the DescribeVolumes operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVolumes service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVolumesResult> describeVolumesAsync(final DescribeVolumesRequest describeVolumesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeVolumesResult>() {
            public DescribeVolumesResult call() throws Exception {
                return describeVolumes(describeVolumesRequest);
        }
    });
    }

    /**
     * <p>
     * Describes an instance's Amazon EBS volumes.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeVolumesRequest Container for the necessary parameters
     *           to execute the DescribeVolumes operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVolumes service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVolumesResult> describeVolumesAsync(
            final DescribeVolumesRequest describeVolumesRequest,
            final AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeVolumesResult>() {
            public DescribeVolumesResult call() throws Exception {
              DescribeVolumesResult result;
                try {
                result = describeVolumes(describeVolumesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeVolumesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Assigns one of the stack's registered Amazon EBS volumes to a
     * specified instance. The volume must first be registered with the stack
     * by calling RegisterVolume. After you register the volume, you must
     * call UpdateVolume to specify a mount point before calling
     * <code>AssignVolume</code> . For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param assignVolumeRequest Container for the necessary parameters to
     *           execute the AssignVolume operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         AssignVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> assignVolumeAsync(final AssignVolumeRequest assignVolumeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                assignVolume(assignVolumeRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Assigns one of the stack's registered Amazon EBS volumes to a
     * specified instance. The volume must first be registered with the stack
     * by calling RegisterVolume. After you register the volume, you must
     * call UpdateVolume to specify a mount point before calling
     * <code>AssignVolume</code> . For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param assignVolumeRequest Container for the necessary parameters to
     *           execute the AssignVolume operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AssignVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> assignVolumeAsync(
            final AssignVolumeRequest assignVolumeRequest,
            final AsyncHandler<AssignVolumeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                assignVolume(assignVolumeRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(assignVolumeRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Unassigns a registered instance from all of it's layers. The instance
     * remains in the stack as an unassigned instance and can be assigned to
     * another layer, as needed. You cannot use this action with instances
     * that were created with AWS OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param unassignInstanceRequest Container for the necessary parameters
     *           to execute the UnassignInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UnassignInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unassignInstanceAsync(final UnassignInstanceRequest unassignInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                unassignInstance(unassignInstanceRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Unassigns a registered instance from all of it's layers. The instance
     * remains in the stack as an unassigned instance and can be assigned to
     * another layer, as needed. You cannot use this action with instances
     * that were created with AWS OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param unassignInstanceRequest Container for the necessary parameters
     *           to execute the UnassignInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UnassignInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unassignInstanceAsync(
            final UnassignInstanceRequest unassignInstanceRequest,
            final AsyncHandler<UnassignInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                unassignInstance(unassignInstanceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(unassignInstanceRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * <b>NOTE:</b>This action can be used only with Windows stacks.
     * </p>
     * <p>
     * Grants RDP access to a Windows instance for a specified time period.
     * </p>
     *
     * @param grantAccessRequest Container for the necessary parameters to
     *           execute the GrantAccess operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         GrantAccess service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GrantAccessResult> grantAccessAsync(final GrantAccessRequest grantAccessRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GrantAccessResult>() {
            public GrantAccessResult call() throws Exception {
                return grantAccess(grantAccessRequest);
        }
    });
    }

    /**
     * <p>
     * <b>NOTE:</b>This action can be used only with Windows stacks.
     * </p>
     * <p>
     * Grants RDP access to a Windows instance for a specified time period.
     * </p>
     *
     * @param grantAccessRequest Container for the necessary parameters to
     *           execute the GrantAccess operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GrantAccess service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GrantAccessResult> grantAccessAsync(
            final GrantAccessRequest grantAccessRequest,
            final AsyncHandler<GrantAccessRequest, GrantAccessResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GrantAccessResult>() {
            public GrantAccessResult call() throws Exception {
              GrantAccessResult result;
                try {
                result = grantAccess(grantAccessRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(grantAccessRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes AWS OpsWorks service errors.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeServiceErrorsRequest Container for the necessary
     *           parameters to execute the DescribeServiceErrors operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServiceErrors service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServiceErrorsResult> describeServiceErrorsAsync(final DescribeServiceErrorsRequest describeServiceErrorsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeServiceErrorsResult>() {
            public DescribeServiceErrorsResult call() throws Exception {
                return describeServiceErrors(describeServiceErrorsRequest);
        }
    });
    }

    /**
     * <p>
     * Describes AWS OpsWorks service errors.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeServiceErrorsRequest Container for the necessary
     *           parameters to execute the DescribeServiceErrors operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServiceErrors service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServiceErrorsResult> describeServiceErrorsAsync(
            final DescribeServiceErrorsRequest describeServiceErrorsRequest,
            final AsyncHandler<DescribeServiceErrorsRequest, DescribeServiceErrorsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeServiceErrorsResult>() {
            public DescribeServiceErrorsResult call() throws Exception {
              DescribeServiceErrorsResult result;
                try {
                result = describeServiceErrors(describeServiceErrorsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeServiceErrorsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Updates a registered Elastic IP address's name. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateElasticIpRequest Container for the necessary parameters
     *           to execute the UpdateElasticIp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateElasticIpAsync(final UpdateElasticIpRequest updateElasticIpRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateElasticIp(updateElasticIpRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Updates a registered Elastic IP address's name. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateElasticIpRequest Container for the necessary parameters
     *           to execute the UpdateElasticIp operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateElasticIpAsync(
            final UpdateElasticIpRequest updateElasticIpRequest,
            final AsyncHandler<UpdateElasticIpRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                updateElasticIp(updateElasticIpRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateElasticIpRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Updates a specified layer.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateLayerRequest Container for the necessary parameters to
     *           execute the UpdateLayer operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateLayer service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateLayerAsync(final UpdateLayerRequest updateLayerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateLayer(updateLayerRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Updates a specified layer.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateLayerRequest Container for the necessary parameters to
     *           execute the UpdateLayer operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateLayer service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateLayerAsync(
            final UpdateLayerRequest updateLayerRequest,
            final AsyncHandler<UpdateLayerRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                updateLayer(updateLayerRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateLayerRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Starts a specified instance. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"> Starting, Stopping, and Rebooting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param startInstanceRequest Container for the necessary parameters to
     *           execute the StartInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         StartInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> startInstanceAsync(final StartInstanceRequest startInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                startInstance(startInstanceRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Starts a specified instance. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"> Starting, Stopping, and Rebooting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param startInstanceRequest Container for the necessary parameters to
     *           execute the StartInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StartInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> startInstanceAsync(
            final StartInstanceRequest startInstanceRequest,
            final AsyncHandler<StartInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                startInstance(startInstanceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(startInstanceRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Creates a layer. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-create.html"> How to Create a Layer </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> You should use CreateLayer for noncustom layer types
     * such as PHP App Server only if the stack does not have an existing
     * layer of that type. A stack can have at most one instance of each
     * noncustom layer; if you attempt to create a second instance,
     * CreateLayer fails. A stack can have an arbitrary number of custom
     * layers, so you can call CreateLayer as many times as you like for that
     * layer type.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createLayerRequest Container for the necessary parameters to
     *           execute the CreateLayer operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLayer service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLayerResult> createLayerAsync(final CreateLayerRequest createLayerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLayerResult>() {
            public CreateLayerResult call() throws Exception {
                return createLayer(createLayerRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a layer. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-create.html"> How to Create a Layer </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> You should use CreateLayer for noncustom layer types
     * such as PHP App Server only if the stack does not have an existing
     * layer of that type. A stack can have at most one instance of each
     * noncustom layer; if you attempt to create a second instance,
     * CreateLayer fails. A stack can have an arbitrary number of custom
     * layers, so you can call CreateLayer as many times as you like for that
     * layer type.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createLayerRequest Container for the necessary parameters to
     *           execute the CreateLayer operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLayer service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLayerResult> createLayerAsync(
            final CreateLayerRequest createLayerRequest,
            final AsyncHandler<CreateLayerRequest, CreateLayerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLayerResult>() {
            public CreateLayerResult call() throws Exception {
              CreateLayerResult result;
                try {
                result = createLayer(createLayerRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createLayerRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Disassociates an Elastic IP address from its instance. The address
     * remains registered with the stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param disassociateElasticIpRequest Container for the necessary
     *           parameters to execute the DisassociateElasticIp operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DisassociateElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disassociateElasticIpAsync(final DisassociateElasticIpRequest disassociateElasticIpRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disassociateElasticIp(disassociateElasticIpRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Disassociates an Elastic IP address from its instance. The address
     * remains registered with the stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param disassociateElasticIpRequest Container for the necessary
     *           parameters to execute the DisassociateElasticIp operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisassociateElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disassociateElasticIpAsync(
            final DisassociateElasticIpRequest disassociateElasticIpRequest,
            final AsyncHandler<DisassociateElasticIpRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                disassociateElasticIp(disassociateElasticIpRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(disassociateElasticIpRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Deletes a specified stack. You must first delete all instances,
     * layers, and apps or deregister registered instances. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-shutting.html"> Shut Down a Stack </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteStack service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteStackAsync(final DeleteStackRequest deleteStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteStack(deleteStackRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes a specified stack. You must first delete all instances,
     * layers, and apps or deregister registered instances. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-shutting.html"> Shut Down a Stack </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteStack service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteStackAsync(
            final DeleteStackRequest deleteStackRequest,
            final AsyncHandler<DeleteStackRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteStack(deleteStackRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteStackRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Describes the available AWS OpsWorks agent versions. You must specify
     * a stack ID or a configuration manager.
     * <code>DescribeAgentVersions</code> returns a list of available agent
     * versions for the specified stack or configuration manager.
     * </p>
     *
     * @param describeAgentVersionsRequest Container for the necessary
     *           parameters to execute the DescribeAgentVersions operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAgentVersions service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAgentVersionsResult> describeAgentVersionsAsync(final DescribeAgentVersionsRequest describeAgentVersionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAgentVersionsResult>() {
            public DescribeAgentVersionsResult call() throws Exception {
                return describeAgentVersions(describeAgentVersionsRequest);
        }
    });
    }

    /**
     * <p>
     * Describes the available AWS OpsWorks agent versions. You must specify
     * a stack ID or a configuration manager.
     * <code>DescribeAgentVersions</code> returns a list of available agent
     * versions for the specified stack or configuration manager.
     * </p>
     *
     * @param describeAgentVersionsRequest Container for the necessary
     *           parameters to execute the DescribeAgentVersions operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAgentVersions service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAgentVersionsResult> describeAgentVersionsAsync(
            final DescribeAgentVersionsRequest describeAgentVersionsRequest,
            final AsyncHandler<DescribeAgentVersionsRequest, DescribeAgentVersionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAgentVersionsResult>() {
            public DescribeAgentVersionsResult call() throws Exception {
              DescribeAgentVersionsResult result;
                try {
                result = describeAgentVersions(describeAgentVersionsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeAgentVersionsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Starts a stack's instances.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param startStackRequest Container for the necessary parameters to
     *           execute the StartStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         StartStack service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> startStackAsync(final StartStackRequest startStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                startStack(startStackRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Starts a stack's instances.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param startStackRequest Container for the necessary parameters to
     *           execute the StartStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StartStack service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> startStackAsync(
            final StartStackRequest startStackRequest,
            final AsyncHandler<StartStackRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                startStack(startStackRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(startStackRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Registers an Amazon EBS volume with a specified stack. A volume can
     * be registered with only one stack at a time. If the volume is already
     * registered, you must first deregister it by calling DeregisterVolume.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerVolumeRequest Container for the necessary parameters to
     *           execute the RegisterVolume operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterVolumeResult> registerVolumeAsync(final RegisterVolumeRequest registerVolumeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterVolumeResult>() {
            public RegisterVolumeResult call() throws Exception {
                return registerVolume(registerVolumeRequest);
        }
    });
    }

    /**
     * <p>
     * Registers an Amazon EBS volume with a specified stack. A volume can
     * be registered with only one stack at a time. If the volume is already
     * registered, you must first deregister it by calling DeregisterVolume.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerVolumeRequest Container for the necessary parameters to
     *           execute the RegisterVolume operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterVolumeResult> registerVolumeAsync(
            final RegisterVolumeRequest registerVolumeRequest,
            final AsyncHandler<RegisterVolumeRequest, RegisterVolumeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterVolumeResult>() {
            public RegisterVolumeResult call() throws Exception {
              RegisterVolumeResult result;
                try {
                result = registerVolume(registerVolumeRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(registerVolumeRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Updates an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateRdsDbInstanceRequest Container for the necessary
     *           parameters to execute the UpdateRdsDbInstance operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateRdsDbInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateRdsDbInstanceAsync(final UpdateRdsDbInstanceRequest updateRdsDbInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateRdsDbInstance(updateRdsDbInstanceRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Updates an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateRdsDbInstanceRequest Container for the necessary
     *           parameters to execute the UpdateRdsDbInstance operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateRdsDbInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateRdsDbInstanceAsync(
            final UpdateRdsDbInstanceRequest updateRdsDbInstanceRequest,
            final AsyncHandler<UpdateRdsDbInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                updateRdsDbInstance(updateRdsDbInstanceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateRdsDbInstanceRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Registers instances with a specified stack that were created outside
     * of AWS OpsWorks.
     * </p>
     * <p>
     * <b>NOTE:</b>We do not recommend using this action to register
     * instances. The complete registration operation has two primary steps,
     * installing the AWS OpsWorks agent on the instance and registering the
     * instance with the stack. RegisterInstance handles only the second
     * step. You should instead use the AWS CLI register command, which
     * performs the entire registration operation. For more information, see
     * Registering an Instance with an AWS OpsWorks Stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerInstanceRequest Container for the necessary parameters
     *           to execute the RegisterInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterInstanceResult> registerInstanceAsync(final RegisterInstanceRequest registerInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterInstanceResult>() {
            public RegisterInstanceResult call() throws Exception {
                return registerInstance(registerInstanceRequest);
        }
    });
    }

    /**
     * <p>
     * Registers instances with a specified stack that were created outside
     * of AWS OpsWorks.
     * </p>
     * <p>
     * <b>NOTE:</b>We do not recommend using this action to register
     * instances. The complete registration operation has two primary steps,
     * installing the AWS OpsWorks agent on the instance and registering the
     * instance with the stack. RegisterInstance handles only the second
     * step. You should instead use the AWS CLI register command, which
     * performs the entire registration operation. For more information, see
     * Registering an Instance with an AWS OpsWorks Stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerInstanceRequest Container for the necessary parameters
     *           to execute the RegisterInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterInstanceResult> registerInstanceAsync(
            final RegisterInstanceRequest registerInstanceRequest,
            final AsyncHandler<RegisterInstanceRequest, RegisterInstanceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterInstanceResult>() {
            public RegisterInstanceResult call() throws Exception {
              RegisterInstanceResult result;
                try {
                result = registerInstance(registerInstanceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(registerInstanceRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Updates a specified user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateUserProfileRequest Container for the necessary parameters
     *           to execute the UpdateUserProfile operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateUserProfile service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateUserProfileAsync(final UpdateUserProfileRequest updateUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateUserProfile(updateUserProfileRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Updates a specified user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateUserProfileRequest Container for the necessary parameters
     *           to execute the UpdateUserProfile operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateUserProfile service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateUserProfileAsync(
            final UpdateUserProfileRequest updateUserProfileRequest,
            final AsyncHandler<UpdateUserProfileRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                updateUserProfile(updateUserProfileRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateUserProfileRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Reboots a specified instance. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"> Starting, Stopping, and Rebooting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param rebootInstanceRequest Container for the necessary parameters to
     *           execute the RebootInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         RebootInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> rebootInstanceAsync(final RebootInstanceRequest rebootInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                rebootInstance(rebootInstanceRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Reboots a specified instance. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"> Starting, Stopping, and Rebooting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param rebootInstanceRequest Container for the necessary parameters to
     *           execute the RebootInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RebootInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> rebootInstanceAsync(
            final RebootInstanceRequest rebootInstanceRequest,
            final AsyncHandler<RebootInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                rebootInstance(rebootInstanceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(rebootInstanceRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Creates a new stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-edit.html"> Create a New Stack </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStack service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateStackResult> createStackAsync(final CreateStackRequest createStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateStackResult>() {
            public CreateStackResult call() throws Exception {
                return createStack(createStackRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a new stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-edit.html"> Create a New Stack </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStack service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateStackResult> createStackAsync(
            final CreateStackRequest createStackRequest,
            final AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateStackResult>() {
            public CreateStackResult call() throws Exception {
              CreateStackResult result;
                try {
                result = createStack(createStackRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createStackRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates an instance in a specified stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> Adding an Instance to a Layer </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createInstanceRequest Container for the necessary parameters to
     *           execute the CreateInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateInstanceResult> createInstanceAsync(final CreateInstanceRequest createInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateInstanceResult>() {
            public CreateInstanceResult call() throws Exception {
                return createInstance(createInstanceRequest);
        }
    });
    }

    /**
     * <p>
     * Creates an instance in a specified stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> Adding an Instance to a Layer </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createInstanceRequest Container for the necessary parameters to
     *           execute the CreateInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateInstanceResult> createInstanceAsync(
            final CreateInstanceRequest createInstanceRequest,
            final AsyncHandler<CreateInstanceRequest, CreateInstanceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateInstanceResult>() {
            public CreateInstanceResult call() throws Exception {
              CreateInstanceResult result;
                try {
                result = createInstance(createInstanceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createInstanceRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteAppRequest Container for the necessary parameters to
     *           execute the DeleteApp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteApp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAppAsync(final DeleteAppRequest deleteAppRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteApp(deleteAppRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteAppRequest Container for the necessary parameters to
     *           execute the DeleteApp operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteApp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAppAsync(
            final DeleteAppRequest deleteAppRequest,
            final AsyncHandler<DeleteAppRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteApp(deleteAppRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteAppRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Requests a description of a stack's provisioning parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeStackProvisioningParametersRequest Container for the
     *           necessary parameters to execute the
     *           DescribeStackProvisioningParameters operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackProvisioningParameters service method, as returned by
     *         AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackProvisioningParametersResult> describeStackProvisioningParametersAsync(final DescribeStackProvisioningParametersRequest describeStackProvisioningParametersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStackProvisioningParametersResult>() {
            public DescribeStackProvisioningParametersResult call() throws Exception {
                return describeStackProvisioningParameters(describeStackProvisioningParametersRequest);
        }
    });
    }

    /**
     * <p>
     * Requests a description of a stack's provisioning parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeStackProvisioningParametersRequest Container for the
     *           necessary parameters to execute the
     *           DescribeStackProvisioningParameters operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackProvisioningParameters service method, as returned by
     *         AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackProvisioningParametersResult> describeStackProvisioningParametersAsync(
            final DescribeStackProvisioningParametersRequest describeStackProvisioningParametersRequest,
            final AsyncHandler<DescribeStackProvisioningParametersRequest, DescribeStackProvisioningParametersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStackProvisioningParametersResult>() {
            public DescribeStackProvisioningParametersResult call() throws Exception {
              DescribeStackProvisioningParametersResult result;
                try {
                result = describeStackProvisioningParameters(describeStackProvisioningParametersRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeStackProvisioningParametersRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deregisters a specified Elastic IP address. The address can then be
     * registered by another stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterElasticIpRequest Container for the necessary
     *           parameters to execute the DeregisterElasticIp operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterElasticIpAsync(final DeregisterElasticIpRequest deregisterElasticIpRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deregisterElasticIp(deregisterElasticIpRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deregisters a specified Elastic IP address. The address can then be
     * registered by another stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterElasticIpRequest Container for the necessary
     *           parameters to execute the DeregisterElasticIp operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterElasticIpAsync(
            final DeregisterElasticIpRequest deregisterElasticIpRequest,
            final AsyncHandler<DeregisterElasticIpRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deregisterElasticIp(deregisterElasticIpRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deregisterElasticIpRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Attaches an Elastic Load Balancing load balancer to a specified
     * layer. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/load-balancer-elb.html"> Elastic Load Balancing </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> You must create the Elastic Load Balancing instance
     * separately, by using the Elastic Load Balancing console, API, or CLI.
     * For more information, see Elastic Load Balancing Developer Guide.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param attachElasticLoadBalancerRequest Container for the necessary
     *           parameters to execute the AttachElasticLoadBalancer operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         AttachElasticLoadBalancer service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> attachElasticLoadBalancerAsync(final AttachElasticLoadBalancerRequest attachElasticLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                attachElasticLoadBalancer(attachElasticLoadBalancerRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Attaches an Elastic Load Balancing load balancer to a specified
     * layer. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/load-balancer-elb.html"> Elastic Load Balancing </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> You must create the Elastic Load Balancing instance
     * separately, by using the Elastic Load Balancing console, API, or CLI.
     * For more information, see Elastic Load Balancing Developer Guide.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param attachElasticLoadBalancerRequest Container for the necessary
     *           parameters to execute the AttachElasticLoadBalancer operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AttachElasticLoadBalancer service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> attachElasticLoadBalancerAsync(
            final AttachElasticLoadBalancerRequest attachElasticLoadBalancerRequest,
            final AsyncHandler<AttachElasticLoadBalancerRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                attachElasticLoadBalancer(attachElasticLoadBalancerRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(attachElasticLoadBalancerRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Updates a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStack service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateStackAsync(final UpdateStackRequest updateStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateStack(updateStackRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Updates a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStack service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateStackAsync(
            final UpdateStackRequest updateStackRequest,
            final AsyncHandler<UpdateStackRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                updateStack(updateStackRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateStackRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Creates a new user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createUserProfileRequest Container for the necessary parameters
     *           to execute the CreateUserProfile operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateUserProfile service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateUserProfileResult> createUserProfileAsync(final CreateUserProfileRequest createUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateUserProfileResult>() {
            public CreateUserProfileResult call() throws Exception {
                return createUserProfile(createUserProfileRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a new user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createUserProfileRequest Container for the necessary parameters
     *           to execute the CreateUserProfile operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateUserProfile service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateUserProfileResult> createUserProfileAsync(
            final CreateUserProfileRequest createUserProfileRequest,
            final AsyncHandler<CreateUserProfileRequest, CreateUserProfileResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateUserProfileResult>() {
            public CreateUserProfileResult call() throws Exception {
              CreateUserProfileResult result;
                try {
                result = createUserProfile(createUserProfileRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createUserProfileRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Requests a description of one or more layers in a specified stack.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeLayersRequest Container for the necessary parameters to
     *           execute the DescribeLayers operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLayers service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLayersResult> describeLayersAsync(final DescribeLayersRequest describeLayersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLayersResult>() {
            public DescribeLayersResult call() throws Exception {
                return describeLayers(describeLayersRequest);
        }
    });
    }

    /**
     * <p>
     * Requests a description of one or more layers in a specified stack.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeLayersRequest Container for the necessary parameters to
     *           execute the DescribeLayers operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLayers service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLayersResult> describeLayersAsync(
            final DescribeLayersRequest describeLayersRequest,
            final AsyncHandler<DescribeLayersRequest, DescribeLayersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLayersResult>() {
            public DescribeLayersResult call() throws Exception {
              DescribeLayersResult result;
                try {
                result = describeLayers(describeLayersRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeLayersRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes load-based auto scaling configurations for specified
     * layers.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeLoadBasedAutoScaling operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBasedAutoScaling service method, as returned by
     *         AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBasedAutoScalingResult> describeLoadBasedAutoScalingAsync(final DescribeLoadBasedAutoScalingRequest describeLoadBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBasedAutoScalingResult>() {
            public DescribeLoadBasedAutoScalingResult call() throws Exception {
                return describeLoadBasedAutoScaling(describeLoadBasedAutoScalingRequest);
        }
    });
    }

    /**
     * <p>
     * Describes load-based auto scaling configurations for specified
     * layers.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeLoadBasedAutoScaling operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBasedAutoScaling service method, as returned by
     *         AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBasedAutoScalingResult> describeLoadBasedAutoScalingAsync(
            final DescribeLoadBasedAutoScalingRequest describeLoadBasedAutoScalingRequest,
            final AsyncHandler<DescribeLoadBasedAutoScalingRequest, DescribeLoadBasedAutoScalingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBasedAutoScalingResult>() {
            public DescribeLoadBasedAutoScalingResult call() throws Exception {
              DescribeLoadBasedAutoScalingResult result;
                try {
                result = describeLoadBasedAutoScaling(describeLoadBasedAutoScalingRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeLoadBasedAutoScalingRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes a stack's Elastic Load Balancing instances.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeElasticLoadBalancersRequest Container for the necessary
     *           parameters to execute the DescribeElasticLoadBalancers operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeElasticLoadBalancers service method, as returned by
     *         AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeElasticLoadBalancersResult> describeElasticLoadBalancersAsync(final DescribeElasticLoadBalancersRequest describeElasticLoadBalancersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeElasticLoadBalancersResult>() {
            public DescribeElasticLoadBalancersResult call() throws Exception {
                return describeElasticLoadBalancers(describeElasticLoadBalancersRequest);
        }
    });
    }

    /**
     * <p>
     * Describes a stack's Elastic Load Balancing instances.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeElasticLoadBalancersRequest Container for the necessary
     *           parameters to execute the DescribeElasticLoadBalancers operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeElasticLoadBalancers service method, as returned by
     *         AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeElasticLoadBalancersResult> describeElasticLoadBalancersAsync(
            final DescribeElasticLoadBalancersRequest describeElasticLoadBalancersRequest,
            final AsyncHandler<DescribeElasticLoadBalancersRequest, DescribeElasticLoadBalancersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeElasticLoadBalancersResult>() {
            public DescribeElasticLoadBalancersResult call() throws Exception {
              DescribeElasticLoadBalancersResult result;
                try {
                result = describeElasticLoadBalancers(describeElasticLoadBalancersRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeElasticLoadBalancersRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Assign a registered instance to a layer.
     * </p>
     * 
     * <ul>
     * <li>You can assign registered on-premises instances to any layer
     * type.</li>
     * <li>You can assign registered Amazon EC2 instances only to custom
     * layers.</li>
     * <li>You cannot use this action with instances that were created with
     * AWS OpsWorks.</li>
     * 
     * </ul>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param assignInstanceRequest Container for the necessary parameters to
     *           execute the AssignInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         AssignInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> assignInstanceAsync(final AssignInstanceRequest assignInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                assignInstance(assignInstanceRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Assign a registered instance to a layer.
     * </p>
     * 
     * <ul>
     * <li>You can assign registered on-premises instances to any layer
     * type.</li>
     * <li>You can assign registered Amazon EC2 instances only to custom
     * layers.</li>
     * <li>You cannot use this action with instances that were created with
     * AWS OpsWorks.</li>
     * 
     * </ul>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param assignInstanceRequest Container for the necessary parameters to
     *           execute the AssignInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AssignInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> assignInstanceAsync(
            final AssignInstanceRequest assignInstanceRequest,
            final AsyncHandler<AssignInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                assignInstance(assignInstanceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(assignInstanceRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Deregister a registered Amazon EC2 or on-premises instance. This
     * action removes the instance from the stack and returns it to your
     * control. This action can not be used with instances that were created
     * with AWS OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterInstanceRequest Container for the necessary
     *           parameters to execute the DeregisterInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterInstanceAsync(final DeregisterInstanceRequest deregisterInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deregisterInstance(deregisterInstanceRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deregister a registered Amazon EC2 or on-premises instance. This
     * action removes the instance from the stack and returns it to your
     * control. This action can not be used with instances that were created
     * with AWS OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterInstanceRequest Container for the necessary
     *           parameters to execute the DeregisterInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterInstanceAsync(
            final DeregisterInstanceRequest deregisterInstanceRequest,
            final AsyncHandler<DeregisterInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deregisterInstance(deregisterInstanceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deregisterInstanceRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Deletes a specified layer. You must first stop and then delete all
     * associated instances or unassign registered instances. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-delete.html"> How to Delete a Layer </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteLayerRequest Container for the necessary parameters to
     *           execute the DeleteLayer operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLayer service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLayerAsync(final DeleteLayerRequest deleteLayerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteLayer(deleteLayerRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes a specified layer. You must first stop and then delete all
     * associated instances or unassign registered instances. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-delete.html"> How to Delete a Layer </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteLayerRequest Container for the necessary parameters to
     *           execute the DeleteLayer operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLayer service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLayerAsync(
            final DeleteLayerRequest deleteLayerRequest,
            final AsyncHandler<DeleteLayerRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteLayer(deleteLayerRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteLayerRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Specify the time-based auto scaling configuration for a specified
     * instance. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"> Managing Load with Time-based and Load-based Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param setTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetTimeBasedAutoScaling operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         SetTimeBasedAutoScaling service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setTimeBasedAutoScalingAsync(final SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setTimeBasedAutoScaling(setTimeBasedAutoScalingRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Specify the time-based auto scaling configuration for a specified
     * instance. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"> Managing Load with Time-based and Load-based Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param setTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetTimeBasedAutoScaling operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetTimeBasedAutoScaling service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setTimeBasedAutoScalingAsync(
            final SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest,
            final AsyncHandler<SetTimeBasedAutoScalingRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                setTimeBasedAutoScaling(setTimeBasedAutoScalingRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(setTimeBasedAutoScalingRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Describes a user's SSH information.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have self-management enabled or an attached policy that explicitly
     * grants permissions. For more information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeMyUserProfileRequest Container for the necessary
     *           parameters to execute the DescribeMyUserProfile operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMyUserProfile service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMyUserProfileResult> describeMyUserProfileAsync(final DescribeMyUserProfileRequest describeMyUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMyUserProfileResult>() {
            public DescribeMyUserProfileResult call() throws Exception {
                return describeMyUserProfile(describeMyUserProfileRequest);
        }
    });
    }

    /**
     * <p>
     * Describes a user's SSH information.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have self-management enabled or an attached policy that explicitly
     * grants permissions. For more information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeMyUserProfileRequest Container for the necessary
     *           parameters to execute the DescribeMyUserProfile operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMyUserProfile service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMyUserProfileResult> describeMyUserProfileAsync(
            final DescribeMyUserProfileRequest describeMyUserProfileRequest,
            final AsyncHandler<DescribeMyUserProfileRequest, DescribeMyUserProfileResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMyUserProfileResult>() {
            public DescribeMyUserProfileResult call() throws Exception {
              DescribeMyUserProfileResult result;
                try {
                result = describeMyUserProfile(describeMyUserProfileRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeMyUserProfileRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates an app for a specified stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html"> Creating Apps </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createAppRequest Container for the necessary parameters to
     *           execute the CreateApp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateApp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAppResult> createAppAsync(final CreateAppRequest createAppRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAppResult>() {
            public CreateAppResult call() throws Exception {
                return createApp(createAppRequest);
        }
    });
    }

    /**
     * <p>
     * Creates an app for a specified stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html"> Creating Apps </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createAppRequest Container for the necessary parameters to
     *           execute the CreateApp operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateApp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAppResult> createAppAsync(
            final CreateAppRequest createAppRequest,
            final AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAppResult>() {
            public CreateAppResult call() throws Exception {
              CreateAppResult result;
                try {
                result = createApp(createAppRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createAppRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Updates an Amazon EBS volume's name or mount point. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateVolumeRequest Container for the necessary parameters to
     *           execute the UpdateVolume operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateVolumeAsync(final UpdateVolumeRequest updateVolumeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateVolume(updateVolumeRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Updates an Amazon EBS volume's name or mount point. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateVolumeRequest Container for the necessary parameters to
     *           execute the UpdateVolume operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateVolumeAsync(
            final UpdateVolumeRequest updateVolumeRequest,
            final AsyncHandler<UpdateVolumeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                updateVolume(updateVolumeRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateVolumeRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Describes time-based auto scaling configurations for specified
     * instances.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeTimeBasedAutoScaling operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTimeBasedAutoScaling service method, as returned by
     *         AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTimeBasedAutoScalingResult> describeTimeBasedAutoScalingAsync(final DescribeTimeBasedAutoScalingRequest describeTimeBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTimeBasedAutoScalingResult>() {
            public DescribeTimeBasedAutoScalingResult call() throws Exception {
                return describeTimeBasedAutoScaling(describeTimeBasedAutoScalingRequest);
        }
    });
    }

    /**
     * <p>
     * Describes time-based auto scaling configurations for specified
     * instances.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeTimeBasedAutoScaling operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTimeBasedAutoScaling service method, as returned by
     *         AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTimeBasedAutoScalingResult> describeTimeBasedAutoScalingAsync(
            final DescribeTimeBasedAutoScalingRequest describeTimeBasedAutoScalingRequest,
            final AsyncHandler<DescribeTimeBasedAutoScalingRequest, DescribeTimeBasedAutoScalingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTimeBasedAutoScalingResult>() {
            public DescribeTimeBasedAutoScalingResult call() throws Exception {
              DescribeTimeBasedAutoScalingResult result;
                try {
                result = describeTimeBasedAutoScaling(describeTimeBasedAutoScalingRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeTimeBasedAutoScalingRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes a user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteUserProfileRequest Container for the necessary parameters
     *           to execute the DeleteUserProfile operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteUserProfile service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteUserProfileAsync(final DeleteUserProfileRequest deleteUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteUserProfile(deleteUserProfileRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes a user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteUserProfileRequest Container for the necessary parameters
     *           to execute the DeleteUserProfile operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteUserProfile service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteUserProfileAsync(
            final DeleteUserProfileRequest deleteUserProfileRequest,
            final AsyncHandler<DeleteUserProfileRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteUserProfile(deleteUserProfileRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteUserProfileRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Describe specified users.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeUserProfilesRequest Container for the necessary
     *           parameters to execute the DescribeUserProfiles operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeUserProfiles service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeUserProfilesResult> describeUserProfilesAsync(final DescribeUserProfilesRequest describeUserProfilesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeUserProfilesResult>() {
            public DescribeUserProfilesResult call() throws Exception {
                return describeUserProfiles(describeUserProfilesRequest);
        }
    });
    }

    /**
     * <p>
     * Describe specified users.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeUserProfilesRequest Container for the necessary
     *           parameters to execute the DescribeUserProfiles operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeUserProfiles service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeUserProfilesResult> describeUserProfilesAsync(
            final DescribeUserProfilesRequest describeUserProfilesRequest,
            final AsyncHandler<DescribeUserProfilesRequest, DescribeUserProfilesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeUserProfilesResult>() {
            public DescribeUserProfilesResult call() throws Exception {
              DescribeUserProfilesResult result;
                try {
                result = describeUserProfiles(describeUserProfilesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeUserProfilesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Updates a specified instance.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateInstanceRequest Container for the necessary parameters to
     *           execute the UpdateInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateInstanceAsync(final UpdateInstanceRequest updateInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateInstance(updateInstanceRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Updates a specified instance.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateInstanceRequest Container for the necessary parameters to
     *           execute the UpdateInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateInstanceAsync(
            final UpdateInstanceRequest updateInstanceRequest,
            final AsyncHandler<UpdateInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                updateInstance(updateInstanceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateInstanceRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Requests a description of a specified set of deployments.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeDeploymentsRequest Container for the necessary
     *           parameters to execute the DescribeDeployments operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDeployments service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDeploymentsResult> describeDeploymentsAsync(final DescribeDeploymentsRequest describeDeploymentsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDeploymentsResult>() {
            public DescribeDeploymentsResult call() throws Exception {
                return describeDeployments(describeDeploymentsRequest);
        }
    });
    }

    /**
     * <p>
     * Requests a description of a specified set of deployments.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeDeploymentsRequest Container for the necessary
     *           parameters to execute the DescribeDeployments operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDeployments service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDeploymentsResult> describeDeploymentsAsync(
            final DescribeDeploymentsRequest describeDeploymentsRequest,
            final AsyncHandler<DescribeDeploymentsRequest, DescribeDeploymentsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDeploymentsResult>() {
            public DescribeDeploymentsResult call() throws Exception {
              DescribeDeploymentsResult result;
                try {
                result = describeDeployments(describeDeploymentsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeDeploymentsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Registers an Elastic IP address with a specified stack. An address
     * can be registered with only one stack at a time. If the address is
     * already registered, you must first deregister it by calling
     * DeregisterElasticIp. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerElasticIpRequest Container for the necessary parameters
     *           to execute the RegisterElasticIp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterElasticIpResult> registerElasticIpAsync(final RegisterElasticIpRequest registerElasticIpRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterElasticIpResult>() {
            public RegisterElasticIpResult call() throws Exception {
                return registerElasticIp(registerElasticIpRequest);
        }
    });
    }

    /**
     * <p>
     * Registers an Elastic IP address with a specified stack. An address
     * can be registered with only one stack at a time. If the address is
     * already registered, you must first deregister it by calling
     * DeregisterElasticIp. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerElasticIpRequest Container for the necessary parameters
     *           to execute the RegisterElasticIp operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterElasticIpResult> registerElasticIpAsync(
            final RegisterElasticIpRequest registerElasticIpRequest,
            final AsyncHandler<RegisterElasticIpRequest, RegisterElasticIpResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterElasticIpResult>() {
            public RegisterElasticIpResult call() throws Exception {
              RegisterElasticIpResult result;
                try {
                result = registerElasticIp(registerElasticIpRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(registerElasticIpRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP addresses </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeElasticIpsRequest Container for the necessary
     *           parameters to execute the DescribeElasticIps operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeElasticIps service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeElasticIpsResult> describeElasticIpsAsync(final DescribeElasticIpsRequest describeElasticIpsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeElasticIpsResult>() {
            public DescribeElasticIpsResult call() throws Exception {
                return describeElasticIps(describeElasticIpsRequest);
        }
    });
    }

    /**
     * <p>
     * Describes
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP addresses </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeElasticIpsRequest Container for the necessary
     *           parameters to execute the DescribeElasticIps operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeElasticIps service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeElasticIpsResult> describeElasticIpsAsync(
            final DescribeElasticIpsRequest describeElasticIpsRequest,
            final AsyncHandler<DescribeElasticIpsRequest, DescribeElasticIpsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeElasticIpsResult>() {
            public DescribeElasticIpsResult call() throws Exception {
              DescribeElasticIpsResult result;
                try {
                result = describeElasticIps(describeElasticIpsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeElasticIpsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Requests a description of one or more stacks.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStacks service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStacksResult> describeStacksAsync(final DescribeStacksRequest describeStacksRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStacksResult>() {
            public DescribeStacksResult call() throws Exception {
                return describeStacks(describeStacksRequest);
        }
    });
    }

    /**
     * <p>
     * Requests a description of one or more stacks.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStacks service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStacksResult> describeStacksAsync(
            final DescribeStacksRequest describeStacksRequest,
            final AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStacksResult>() {
            public DescribeStacksResult call() throws Exception {
              DescribeStacksResult result;
                try {
                result = describeStacks(describeStacksRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeStacksRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Requests a description of a specified set of apps.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeAppsRequest Container for the necessary parameters to
     *           execute the DescribeApps operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeApps service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAppsResult> describeAppsAsync(final DescribeAppsRequest describeAppsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAppsResult>() {
            public DescribeAppsResult call() throws Exception {
                return describeApps(describeAppsRequest);
        }
    });
    }

    /**
     * <p>
     * Requests a description of a specified set of apps.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeAppsRequest Container for the necessary parameters to
     *           execute the DescribeApps operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeApps service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAppsResult> describeAppsAsync(
            final DescribeAppsRequest describeAppsRequest,
            final AsyncHandler<DescribeAppsRequest, DescribeAppsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAppsResult>() {
            public DescribeAppsResult call() throws Exception {
              DescribeAppsResult result;
                try {
                result = describeApps(describeAppsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeAppsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Describes the number of layers and apps in a specified stack, and the
     * number of instances in each state, such as <code>running_setup</code>
     * or <code>online</code> .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeStackSummaryRequest Container for the necessary
     *           parameters to execute the DescribeStackSummary operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackSummary service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackSummaryResult> describeStackSummaryAsync(final DescribeStackSummaryRequest describeStackSummaryRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStackSummaryResult>() {
            public DescribeStackSummaryResult call() throws Exception {
                return describeStackSummary(describeStackSummaryRequest);
        }
    });
    }

    /**
     * <p>
     * Describes the number of layers and apps in a specified stack, and the
     * number of instances in each state, such as <code>running_setup</code>
     * or <code>online</code> .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeStackSummaryRequest Container for the necessary
     *           parameters to execute the DescribeStackSummary operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackSummary service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackSummaryResult> describeStackSummaryAsync(
            final DescribeStackSummaryRequest describeStackSummaryRequest,
            final AsyncHandler<DescribeStackSummaryRequest, DescribeStackSummaryResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStackSummaryResult>() {
            public DescribeStackSummaryResult call() throws Exception {
              DescribeStackSummaryResult result;
                try {
                result = describeStackSummary(describeStackSummaryRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeStackSummaryRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Stops a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param stopStackRequest Container for the necessary parameters to
     *           execute the StopStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         StopStack service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> stopStackAsync(final StopStackRequest stopStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                stopStack(stopStackRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Stops a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param stopStackRequest Container for the necessary parameters to
     *           execute the StopStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StopStack service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> stopStackAsync(
            final StopStackRequest stopStackRequest,
            final AsyncHandler<StopStackRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                stopStack(stopStackRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(stopStackRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Runs deployment or stack commands. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-deploying.html"> Deploying Apps </a> and <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-commands.html"> Run Stack Commands </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Deploy or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createDeploymentRequest Container for the necessary parameters
     *           to execute the CreateDeployment operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeployment service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDeploymentResult> createDeploymentAsync(final CreateDeploymentRequest createDeploymentRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDeploymentResult>() {
            public CreateDeploymentResult call() throws Exception {
                return createDeployment(createDeploymentRequest);
        }
    });
    }

    /**
     * <p>
     * Runs deployment or stack commands. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-deploying.html"> Deploying Apps </a> and <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-commands.html"> Run Stack Commands </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Deploy or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createDeploymentRequest Container for the necessary parameters
     *           to execute the CreateDeployment operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeployment service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDeploymentResult> createDeploymentAsync(
            final CreateDeploymentRequest createDeploymentRequest,
            final AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDeploymentResult>() {
            public CreateDeploymentResult call() throws Exception {
              CreateDeploymentResult result;
                try {
                result = createDeployment(createDeploymentRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createDeploymentRequest, result);
                 return result;
        }
    });
    }
    
}
        
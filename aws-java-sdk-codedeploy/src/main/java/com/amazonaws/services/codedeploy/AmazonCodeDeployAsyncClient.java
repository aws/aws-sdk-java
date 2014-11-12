/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy;

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

import com.amazonaws.services.codedeploy.model.*;

/**
 * Asynchronous client for accessing AmazonCodeDeploy.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * AWS CodeDeploy <b>Overview</b> <p>
 * This is the AWS CodeDeploy API Reference. This guide provides
 * descriptions of the AWS CodeDeploy APIs. For additional information,
 * see the
 * <a href="http://docs.aws.amazon.com/codedeploy/latest/userguide"> AWS CodeDeploy User Guide </a>
 * .
 * </p>
 * <b>Using the APIs</b> <p>
 * You can use the AWS CodeDeploy APIs to work with the following items:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * <i>Applications</i> , which are unique identifiers that AWS
 * CodeDeploy uses to ensure that the correct combinations of revisions,
 * deployment configurations, and deployment groups are being referenced
 * during deployments.
 * </p>
 * <p>
 * You can work with applications by calling CreateApplication,
 * DeleteApplication, GetApplication, ListApplications,
 * BatchGetApplications, and UpdateApplication to create, delete, and get
 * information about applications, and to change information about an
 * application, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Deployment configurations</i> , which are sets of deployment rules
 * and deployment success and failure conditions that AWS CodeDeploy uses
 * during deployments.
 * </p>
 * <p>
 * You can work with deployment configurations by calling
 * CreateDeploymentConfig, DeleteDeploymentConfig, GetDeploymentConfig,
 * and ListDeploymentConfigs to create, delete, and get information about
 * deployment configurations, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Deployment groups</i> , which represent groups of Amazon EC2
 * instances to which application revisions can be deployed.
 * </p>
 * <p>
 * You can work with deployment groups by calling CreateDeploymentGroup,
 * DeleteDeploymentGroup, GetDeploymentGroup, ListDeploymentGroups, and
 * UpdateDeploymentGroup to create, delete, and get information about
 * single and multiple deployment groups, and to change information about
 * a deployment group, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Deployment instances</i> (also known simply as <i>instances</i> ),
 * which represent Amazon EC2 instances to which application revisions
 * are deployed. Deployment instances are identified by their Amazon EC2
 * tags or Auto Scaling group names. Deployment instances belong to
 * deployment groups.
 * </p>
 * <p>
 * You can work with deployment instances by calling
 * GetDeploymentInstance and ListDeploymentInstances to get information
 * about single and multiple deployment instances, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Deployments</i> , which represent the process of deploying
 * revisions to deployment groups.
 * </p>
 * <p>
 * You can work with deployments by calling CreateDeployment,
 * GetDeployment, ListDeployments, BatchGetDeployments, and
 * StopDeployment to create and get information about deployments, and to
 * stop a deployment, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Application revisions</i> (also known simply as <i>revisions</i>
 * ), which are archive files that are stored in Amazon S3 buckets or
 * GitHub repositories. These revisions contain source content (such as
 * source code, web pages, executable files, any deployment scripts, and
 * similar) along with an Application Specification file (AppSpec file).
 * (The AppSpec file is unique to AWS CodeDeploy; it defines a series of
 * deployment actions that you want AWS CodeDeploy to execute.) An
 * application revision is uniquely identified by its Amazon S3 object
 * key and its ETag, version, or both. Application revisions are deployed
 * to deployment groups.
 * </p>
 * <p>
 * You can work with application revisions by calling
 * GetApplicationRevision, ListApplicationRevisions, and
 * RegisterApplicationRevision to get information about application
 * revisions and to inform AWS CodeDeploy about an application revision,
 * respectively.
 * </p>
 * </li>
 * 
 * </ul>
 */
public class AmazonCodeDeployAsyncClient extends AmazonCodeDeployClient
        implements AmazonCodeDeployAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCodeDeploy.  A credentials provider chain will be used
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
    public AmazonCodeDeployAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCodeDeploy.  A credentials provider chain will be used
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
     *                       client connects to AmazonCodeDeploy
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCodeDeployAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCodeDeploy using the specified AWS account credentials.
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
    public AmazonCodeDeployAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCodeDeploy using the specified AWS account credentials
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
    public AmazonCodeDeployAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCodeDeploy using the specified AWS account credentials,
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
    public AmazonCodeDeployAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCodeDeploy using the specified AWS account credentials provider.
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
    public AmazonCodeDeployAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCodeDeploy using the specified AWS account credentials provider
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
    public AmazonCodeDeployAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCodeDeploy using the specified AWS account credentials
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
    public AmazonCodeDeployAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCodeDeploy using the specified AWS account credentials
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
    public AmazonCodeDeployAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Gets information about a deployment group.
     * </p>
     *
     * @param getDeploymentGroupRequest Container for the necessary
     *           parameters to execute the GetDeploymentGroup operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         GetDeploymentGroup service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDeploymentGroupResult> getDeploymentGroupAsync(final GetDeploymentGroupRequest getDeploymentGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDeploymentGroupResult>() {
            public GetDeploymentGroupResult call() throws Exception {
                return getDeploymentGroup(getDeploymentGroupRequest);
        }
    });
    }

    /**
     * <p>
     * Gets information about a deployment group.
     * </p>
     *
     * @param getDeploymentGroupRequest Container for the necessary
     *           parameters to execute the GetDeploymentGroup operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDeploymentGroup service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDeploymentGroupResult> getDeploymentGroupAsync(
            final GetDeploymentGroupRequest getDeploymentGroupRequest,
            final AsyncHandler<GetDeploymentGroupRequest, GetDeploymentGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDeploymentGroupResult>() {
            public GetDeploymentGroupResult call() throws Exception {
              GetDeploymentGroupResult result;
                try {
                result = getDeploymentGroup(getDeploymentGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getDeploymentGroupRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Changes an existing application's name.
     * </p>
     *
     * @param updateApplicationRequest Container for the necessary parameters
     *           to execute the UpdateApplication operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateApplication service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateApplicationAsync(final UpdateApplicationRequest updateApplicationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateApplication(updateApplicationRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Changes an existing application's name.
     * </p>
     *
     * @param updateApplicationRequest Container for the necessary parameters
     *           to execute the UpdateApplication operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateApplication service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateApplicationAsync(
            final UpdateApplicationRequest updateApplicationRequest,
            final AsyncHandler<UpdateApplicationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                updateApplication(updateApplicationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateApplicationRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Creates a new deployment configuration.
     * </p>
     *
     * @param createDeploymentConfigRequest Container for the necessary
     *           parameters to execute the CreateDeploymentConfig operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeploymentConfig service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDeploymentConfigResult> createDeploymentConfigAsync(final CreateDeploymentConfigRequest createDeploymentConfigRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDeploymentConfigResult>() {
            public CreateDeploymentConfigResult call() throws Exception {
                return createDeploymentConfig(createDeploymentConfigRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a new deployment configuration.
     * </p>
     *
     * @param createDeploymentConfigRequest Container for the necessary
     *           parameters to execute the CreateDeploymentConfig operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeploymentConfig service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDeploymentConfigResult> createDeploymentConfigAsync(
            final CreateDeploymentConfigRequest createDeploymentConfigRequest,
            final AsyncHandler<CreateDeploymentConfigRequest, CreateDeploymentConfigResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDeploymentConfigResult>() {
            public CreateDeploymentConfigResult call() throws Exception {
              CreateDeploymentConfigResult result;
                try {
                result = createDeploymentConfig(createDeploymentConfigRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createDeploymentConfigRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Lists the Amazon EC2 instances for a deployment within the AWS user
     * account.
     * </p>
     *
     * @param listDeploymentInstancesRequest Container for the necessary
     *           parameters to execute the ListDeploymentInstances operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeploymentInstances service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeploymentInstancesResult> listDeploymentInstancesAsync(final ListDeploymentInstancesRequest listDeploymentInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDeploymentInstancesResult>() {
            public ListDeploymentInstancesResult call() throws Exception {
                return listDeploymentInstances(listDeploymentInstancesRequest);
        }
    });
    }

    /**
     * <p>
     * Lists the Amazon EC2 instances for a deployment within the AWS user
     * account.
     * </p>
     *
     * @param listDeploymentInstancesRequest Container for the necessary
     *           parameters to execute the ListDeploymentInstances operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeploymentInstances service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeploymentInstancesResult> listDeploymentInstancesAsync(
            final ListDeploymentInstancesRequest listDeploymentInstancesRequest,
            final AsyncHandler<ListDeploymentInstancesRequest, ListDeploymentInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDeploymentInstancesResult>() {
            public ListDeploymentInstancesResult call() throws Exception {
              ListDeploymentInstancesResult result;
                try {
                result = listDeploymentInstances(listDeploymentInstancesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listDeploymentInstancesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Lists the applications registered within the AWS user account.
     * </p>
     *
     * @param listApplicationsRequest Container for the necessary parameters
     *           to execute the ListApplications operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         ListApplications service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListApplicationsResult> listApplicationsAsync(final ListApplicationsRequest listApplicationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListApplicationsResult>() {
            public ListApplicationsResult call() throws Exception {
                return listApplications(listApplicationsRequest);
        }
    });
    }

    /**
     * <p>
     * Lists the applications registered within the AWS user account.
     * </p>
     *
     * @param listApplicationsRequest Container for the necessary parameters
     *           to execute the ListApplications operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListApplications service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListApplicationsResult> listApplicationsAsync(
            final ListApplicationsRequest listApplicationsRequest,
            final AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListApplicationsResult>() {
            public ListApplicationsResult call() throws Exception {
              ListApplicationsResult result;
                try {
                result = listApplications(listApplicationsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listApplicationsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Registers with AWS CodeDeploy a revision for the specified
     * application.
     * </p>
     *
     * @param registerApplicationRevisionRequest Container for the necessary
     *           parameters to execute the RegisterApplicationRevision operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterApplicationRevision service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> registerApplicationRevisionAsync(final RegisterApplicationRevisionRequest registerApplicationRevisionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                registerApplicationRevision(registerApplicationRevisionRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Registers with AWS CodeDeploy a revision for the specified
     * application.
     * </p>
     *
     * @param registerApplicationRevisionRequest Container for the necessary
     *           parameters to execute the RegisterApplicationRevision operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterApplicationRevision service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> registerApplicationRevisionAsync(
            final RegisterApplicationRevisionRequest registerApplicationRevisionRequest,
            final AsyncHandler<RegisterApplicationRevisionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                registerApplicationRevision(registerApplicationRevisionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(registerApplicationRevisionRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Gets information about a deployment configuration.
     * </p>
     *
     * @param getDeploymentConfigRequest Container for the necessary
     *           parameters to execute the GetDeploymentConfig operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         GetDeploymentConfig service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDeploymentConfigResult> getDeploymentConfigAsync(final GetDeploymentConfigRequest getDeploymentConfigRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDeploymentConfigResult>() {
            public GetDeploymentConfigResult call() throws Exception {
                return getDeploymentConfig(getDeploymentConfigRequest);
        }
    });
    }

    /**
     * <p>
     * Gets information about a deployment configuration.
     * </p>
     *
     * @param getDeploymentConfigRequest Container for the necessary
     *           parameters to execute the GetDeploymentConfig operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDeploymentConfig service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDeploymentConfigResult> getDeploymentConfigAsync(
            final GetDeploymentConfigRequest getDeploymentConfigRequest,
            final AsyncHandler<GetDeploymentConfigRequest, GetDeploymentConfigResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDeploymentConfigResult>() {
            public GetDeploymentConfigResult call() throws Exception {
              GetDeploymentConfigResult result;
                try {
                result = getDeploymentConfig(getDeploymentConfigRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getDeploymentConfigRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Lists the deployment groups for an application registered within the
     * AWS user account.
     * </p>
     *
     * @param listDeploymentGroupsRequest Container for the necessary
     *           parameters to execute the ListDeploymentGroups operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeploymentGroups service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeploymentGroupsResult> listDeploymentGroupsAsync(final ListDeploymentGroupsRequest listDeploymentGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDeploymentGroupsResult>() {
            public ListDeploymentGroupsResult call() throws Exception {
                return listDeploymentGroups(listDeploymentGroupsRequest);
        }
    });
    }

    /**
     * <p>
     * Lists the deployment groups for an application registered within the
     * AWS user account.
     * </p>
     *
     * @param listDeploymentGroupsRequest Container for the necessary
     *           parameters to execute the ListDeploymentGroups operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeploymentGroups service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeploymentGroupsResult> listDeploymentGroupsAsync(
            final ListDeploymentGroupsRequest listDeploymentGroupsRequest,
            final AsyncHandler<ListDeploymentGroupsRequest, ListDeploymentGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDeploymentGroupsResult>() {
            public ListDeploymentGroupsResult call() throws Exception {
              ListDeploymentGroupsResult result;
                try {
                result = listDeploymentGroups(listDeploymentGroupsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listDeploymentGroupsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets information about one or more applications.
     * </p>
     *
     * @param batchGetApplicationsRequest Container for the necessary
     *           parameters to execute the BatchGetApplications operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         BatchGetApplications service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BatchGetApplicationsResult> batchGetApplicationsAsync(final BatchGetApplicationsRequest batchGetApplicationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchGetApplicationsResult>() {
            public BatchGetApplicationsResult call() throws Exception {
                return batchGetApplications(batchGetApplicationsRequest);
        }
    });
    }

    /**
     * <p>
     * Gets information about one or more applications.
     * </p>
     *
     * @param batchGetApplicationsRequest Container for the necessary
     *           parameters to execute the BatchGetApplications operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         BatchGetApplications service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BatchGetApplicationsResult> batchGetApplicationsAsync(
            final BatchGetApplicationsRequest batchGetApplicationsRequest,
            final AsyncHandler<BatchGetApplicationsRequest, BatchGetApplicationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchGetApplicationsResult>() {
            public BatchGetApplicationsResult call() throws Exception {
              BatchGetApplicationsResult result;
                try {
                result = batchGetApplications(batchGetApplicationsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(batchGetApplicationsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes a deployment group.
     * </p>
     *
     * @param deleteDeploymentGroupRequest Container for the necessary
     *           parameters to execute the DeleteDeploymentGroup operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDeploymentGroup service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDeploymentGroupResult> deleteDeploymentGroupAsync(final DeleteDeploymentGroupRequest deleteDeploymentGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDeploymentGroupResult>() {
            public DeleteDeploymentGroupResult call() throws Exception {
                return deleteDeploymentGroup(deleteDeploymentGroupRequest);
        }
    });
    }

    /**
     * <p>
     * Deletes a deployment group.
     * </p>
     *
     * @param deleteDeploymentGroupRequest Container for the necessary
     *           parameters to execute the DeleteDeploymentGroup operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDeploymentGroup service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDeploymentGroupResult> deleteDeploymentGroupAsync(
            final DeleteDeploymentGroupRequest deleteDeploymentGroupRequest,
            final AsyncHandler<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDeploymentGroupResult>() {
            public DeleteDeploymentGroupResult call() throws Exception {
              DeleteDeploymentGroupResult result;
                try {
                result = deleteDeploymentGroup(deleteDeploymentGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteDeploymentGroupRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Lists information about revisions for an application.
     * </p>
     *
     * @param listApplicationRevisionsRequest Container for the necessary
     *           parameters to execute the ListApplicationRevisions operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         ListApplicationRevisions service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListApplicationRevisionsResult> listApplicationRevisionsAsync(final ListApplicationRevisionsRequest listApplicationRevisionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListApplicationRevisionsResult>() {
            public ListApplicationRevisionsResult call() throws Exception {
                return listApplicationRevisions(listApplicationRevisionsRequest);
        }
    });
    }

    /**
     * <p>
     * Lists information about revisions for an application.
     * </p>
     *
     * @param listApplicationRevisionsRequest Container for the necessary
     *           parameters to execute the ListApplicationRevisions operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListApplicationRevisions service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListApplicationRevisionsResult> listApplicationRevisionsAsync(
            final ListApplicationRevisionsRequest listApplicationRevisionsRequest,
            final AsyncHandler<ListApplicationRevisionsRequest, ListApplicationRevisionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListApplicationRevisionsResult>() {
            public ListApplicationRevisionsResult call() throws Exception {
              ListApplicationRevisionsResult result;
                try {
                result = listApplicationRevisions(listApplicationRevisionsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listApplicationRevisionsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Changes information about an existing deployment group.
     * </p>
     *
     * @param updateDeploymentGroupRequest Container for the necessary
     *           parameters to execute the UpdateDeploymentGroup operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDeploymentGroup service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDeploymentGroupResult> updateDeploymentGroupAsync(final UpdateDeploymentGroupRequest updateDeploymentGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDeploymentGroupResult>() {
            public UpdateDeploymentGroupResult call() throws Exception {
                return updateDeploymentGroup(updateDeploymentGroupRequest);
        }
    });
    }

    /**
     * <p>
     * Changes information about an existing deployment group.
     * </p>
     *
     * @param updateDeploymentGroupRequest Container for the necessary
     *           parameters to execute the UpdateDeploymentGroup operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDeploymentGroup service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDeploymentGroupResult> updateDeploymentGroupAsync(
            final UpdateDeploymentGroupRequest updateDeploymentGroupRequest,
            final AsyncHandler<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDeploymentGroupResult>() {
            public UpdateDeploymentGroupResult call() throws Exception {
              UpdateDeploymentGroupResult result;
                try {
                result = updateDeploymentGroup(updateDeploymentGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateDeploymentGroupRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Lists the deployments under a deployment group for an application
     * registered within the AWS user account.
     * </p>
     *
     * @param listDeploymentsRequest Container for the necessary parameters
     *           to execute the ListDeployments operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeployments service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeploymentsResult> listDeploymentsAsync(final ListDeploymentsRequest listDeploymentsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDeploymentsResult>() {
            public ListDeploymentsResult call() throws Exception {
                return listDeployments(listDeploymentsRequest);
        }
    });
    }

    /**
     * <p>
     * Lists the deployments under a deployment group for an application
     * registered within the AWS user account.
     * </p>
     *
     * @param listDeploymentsRequest Container for the necessary parameters
     *           to execute the ListDeployments operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeployments service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeploymentsResult> listDeploymentsAsync(
            final ListDeploymentsRequest listDeploymentsRequest,
            final AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDeploymentsResult>() {
            public ListDeploymentsResult call() throws Exception {
              ListDeploymentsResult result;
                try {
                result = listDeployments(listDeploymentsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listDeploymentsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets information about an application.
     * </p>
     *
     * @param getApplicationRequest Container for the necessary parameters to
     *           execute the GetApplication operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         GetApplication service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetApplicationResult> getApplicationAsync(final GetApplicationRequest getApplicationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetApplicationResult>() {
            public GetApplicationResult call() throws Exception {
                return getApplication(getApplicationRequest);
        }
    });
    }

    /**
     * <p>
     * Gets information about an application.
     * </p>
     *
     * @param getApplicationRequest Container for the necessary parameters to
     *           execute the GetApplication operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetApplication service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetApplicationResult> getApplicationAsync(
            final GetApplicationRequest getApplicationRequest,
            final AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetApplicationResult>() {
            public GetApplicationResult call() throws Exception {
              GetApplicationResult result;
                try {
                result = getApplication(getApplicationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getApplicationRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a new application.
     * </p>
     *
     * @param createApplicationRequest Container for the necessary parameters
     *           to execute the CreateApplication operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         CreateApplication service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
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
     * Creates a new application.
     * </p>
     *
     * @param createApplicationRequest Container for the necessary parameters
     *           to execute the CreateApplication operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateApplication service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
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
     * Attempts to stop an ongoing deployment.
     * </p>
     *
     * @param stopDeploymentRequest Container for the necessary parameters to
     *           execute the StopDeployment operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         StopDeployment service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StopDeploymentResult> stopDeploymentAsync(final StopDeploymentRequest stopDeploymentRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopDeploymentResult>() {
            public StopDeploymentResult call() throws Exception {
                return stopDeployment(stopDeploymentRequest);
        }
    });
    }

    /**
     * <p>
     * Attempts to stop an ongoing deployment.
     * </p>
     *
     * @param stopDeploymentRequest Container for the necessary parameters to
     *           execute the StopDeployment operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StopDeployment service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StopDeploymentResult> stopDeploymentAsync(
            final StopDeploymentRequest stopDeploymentRequest,
            final AsyncHandler<StopDeploymentRequest, StopDeploymentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopDeploymentResult>() {
            public StopDeploymentResult call() throws Exception {
              StopDeploymentResult result;
                try {
                result = stopDeployment(stopDeploymentRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(stopDeploymentRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a new deployment group for application revisions to be
     * deployed to.
     * </p>
     *
     * @param createDeploymentGroupRequest Container for the necessary
     *           parameters to execute the CreateDeploymentGroup operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeploymentGroup service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDeploymentGroupResult> createDeploymentGroupAsync(final CreateDeploymentGroupRequest createDeploymentGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDeploymentGroupResult>() {
            public CreateDeploymentGroupResult call() throws Exception {
                return createDeploymentGroup(createDeploymentGroupRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a new deployment group for application revisions to be
     * deployed to.
     * </p>
     *
     * @param createDeploymentGroupRequest Container for the necessary
     *           parameters to execute the CreateDeploymentGroup operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeploymentGroup service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDeploymentGroupResult> createDeploymentGroupAsync(
            final CreateDeploymentGroupRequest createDeploymentGroupRequest,
            final AsyncHandler<CreateDeploymentGroupRequest, CreateDeploymentGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDeploymentGroupResult>() {
            public CreateDeploymentGroupResult call() throws Exception {
              CreateDeploymentGroupResult result;
                try {
                result = createDeploymentGroup(createDeploymentGroupRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createDeploymentGroupRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes an application.
     * </p>
     *
     * @param deleteApplicationRequest Container for the necessary parameters
     *           to execute the DeleteApplication operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteApplication service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
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
     * Deletes an application.
     * </p>
     *
     * @param deleteApplicationRequest Container for the necessary parameters
     *           to execute the DeleteApplication operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteApplication service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
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
     * Gets information about one or more deployments.
     * </p>
     *
     * @param batchGetDeploymentsRequest Container for the necessary
     *           parameters to execute the BatchGetDeployments operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         BatchGetDeployments service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(final BatchGetDeploymentsRequest batchGetDeploymentsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchGetDeploymentsResult>() {
            public BatchGetDeploymentsResult call() throws Exception {
                return batchGetDeployments(batchGetDeploymentsRequest);
        }
    });
    }

    /**
     * <p>
     * Gets information about one or more deployments.
     * </p>
     *
     * @param batchGetDeploymentsRequest Container for the necessary
     *           parameters to execute the BatchGetDeployments operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         BatchGetDeployments service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(
            final BatchGetDeploymentsRequest batchGetDeploymentsRequest,
            final AsyncHandler<BatchGetDeploymentsRequest, BatchGetDeploymentsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchGetDeploymentsResult>() {
            public BatchGetDeploymentsResult call() throws Exception {
              BatchGetDeploymentsResult result;
                try {
                result = batchGetDeployments(batchGetDeploymentsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(batchGetDeploymentsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes a deployment configuration.
     * </p>
     * <p>
     * <b>NOTE:</b>A deployment configuration cannot be deleted if it is
     * currently in use. Also, predefined configurations cannot be deleted.
     * </p>
     *
     * @param deleteDeploymentConfigRequest Container for the necessary
     *           parameters to execute the DeleteDeploymentConfig operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDeploymentConfig service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDeploymentConfigAsync(final DeleteDeploymentConfigRequest deleteDeploymentConfigRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteDeploymentConfig(deleteDeploymentConfigRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes a deployment configuration.
     * </p>
     * <p>
     * <b>NOTE:</b>A deployment configuration cannot be deleted if it is
     * currently in use. Also, predefined configurations cannot be deleted.
     * </p>
     *
     * @param deleteDeploymentConfigRequest Container for the necessary
     *           parameters to execute the DeleteDeploymentConfig operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDeploymentConfig service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDeploymentConfigAsync(
            final DeleteDeploymentConfigRequest deleteDeploymentConfigRequest,
            final AsyncHandler<DeleteDeploymentConfigRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteDeploymentConfig(deleteDeploymentConfigRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteDeploymentConfigRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Gets information about a deployment.
     * </p>
     *
     * @param getDeploymentRequest Container for the necessary parameters to
     *           execute the GetDeployment operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         GetDeployment service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDeploymentResult> getDeploymentAsync(final GetDeploymentRequest getDeploymentRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDeploymentResult>() {
            public GetDeploymentResult call() throws Exception {
                return getDeployment(getDeploymentRequest);
        }
    });
    }

    /**
     * <p>
     * Gets information about a deployment.
     * </p>
     *
     * @param getDeploymentRequest Container for the necessary parameters to
     *           execute the GetDeployment operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDeployment service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDeploymentResult> getDeploymentAsync(
            final GetDeploymentRequest getDeploymentRequest,
            final AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDeploymentResult>() {
            public GetDeploymentResult call() throws Exception {
              GetDeploymentResult result;
                try {
                result = getDeployment(getDeploymentRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getDeploymentRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deploys an application revision to the specified deployment group.
     * </p>
     *
     * @param createDeploymentRequest Container for the necessary parameters
     *           to execute the CreateDeployment operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeployment service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
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
     * Deploys an application revision to the specified deployment group.
     * </p>
     *
     * @param createDeploymentRequest Container for the necessary parameters
     *           to execute the CreateDeployment operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeployment service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
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
    
    /**
     * <p>
     * Gets information about an Amazon EC2 instance as part of a
     * deployment.
     * </p>
     *
     * @param getDeploymentInstanceRequest Container for the necessary
     *           parameters to execute the GetDeploymentInstance operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         GetDeploymentInstance service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDeploymentInstanceResult> getDeploymentInstanceAsync(final GetDeploymentInstanceRequest getDeploymentInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDeploymentInstanceResult>() {
            public GetDeploymentInstanceResult call() throws Exception {
                return getDeploymentInstance(getDeploymentInstanceRequest);
        }
    });
    }

    /**
     * <p>
     * Gets information about an Amazon EC2 instance as part of a
     * deployment.
     * </p>
     *
     * @param getDeploymentInstanceRequest Container for the necessary
     *           parameters to execute the GetDeploymentInstance operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDeploymentInstance service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDeploymentInstanceResult> getDeploymentInstanceAsync(
            final GetDeploymentInstanceRequest getDeploymentInstanceRequest,
            final AsyncHandler<GetDeploymentInstanceRequest, GetDeploymentInstanceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDeploymentInstanceResult>() {
            public GetDeploymentInstanceResult call() throws Exception {
              GetDeploymentInstanceResult result;
                try {
                result = getDeploymentInstance(getDeploymentInstanceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getDeploymentInstanceRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Lists the deployment configurations within the AWS user account.
     * </p>
     *
     * @param listDeploymentConfigsRequest Container for the necessary
     *           parameters to execute the ListDeploymentConfigs operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeploymentConfigs service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(final ListDeploymentConfigsRequest listDeploymentConfigsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDeploymentConfigsResult>() {
            public ListDeploymentConfigsResult call() throws Exception {
                return listDeploymentConfigs(listDeploymentConfigsRequest);
        }
    });
    }

    /**
     * <p>
     * Lists the deployment configurations within the AWS user account.
     * </p>
     *
     * @param listDeploymentConfigsRequest Container for the necessary
     *           parameters to execute the ListDeploymentConfigs operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeploymentConfigs service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(
            final ListDeploymentConfigsRequest listDeploymentConfigsRequest,
            final AsyncHandler<ListDeploymentConfigsRequest, ListDeploymentConfigsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDeploymentConfigsResult>() {
            public ListDeploymentConfigsResult call() throws Exception {
              ListDeploymentConfigsResult result;
                try {
                result = listDeploymentConfigs(listDeploymentConfigsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listDeploymentConfigsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets information about an application revision.
     * </p>
     *
     * @param getApplicationRevisionRequest Container for the necessary
     *           parameters to execute the GetApplicationRevision operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         GetApplicationRevision service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetApplicationRevisionResult> getApplicationRevisionAsync(final GetApplicationRevisionRequest getApplicationRevisionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetApplicationRevisionResult>() {
            public GetApplicationRevisionResult call() throws Exception {
                return getApplicationRevision(getApplicationRevisionRequest);
        }
    });
    }

    /**
     * <p>
     * Gets information about an application revision.
     * </p>
     *
     * @param getApplicationRevisionRequest Container for the necessary
     *           parameters to execute the GetApplicationRevision operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetApplicationRevision service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetApplicationRevisionResult> getApplicationRevisionAsync(
            final GetApplicationRevisionRequest getApplicationRevisionRequest,
            final AsyncHandler<GetApplicationRevisionRequest, GetApplicationRevisionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetApplicationRevisionResult>() {
            public GetApplicationRevisionResult call() throws Exception {
              GetApplicationRevisionResult result;
                try {
                result = getApplicationRevision(getApplicationRevisionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getApplicationRevisionRequest, result);
                 return result;
        }
    });
    }
    
}
        
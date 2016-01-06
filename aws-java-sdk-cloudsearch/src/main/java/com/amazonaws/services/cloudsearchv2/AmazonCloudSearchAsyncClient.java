/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2;

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

import com.amazonaws.services.cloudsearchv2.model.*;

/**
 * Asynchronous client for accessing AmazonCloudSearchv2.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * Amazon CloudSearch Configuration Service <p>
 * You use the Amazon CloudSearch configuration service to create,
 * configure, and manage search domains. Configuration service requests
 * are submitted using the AWS Query protocol. AWS Query requests are
 * HTTP or HTTPS requests submitted via HTTP GET or POST with a query
 * parameter named Action.
 * </p>
 * <p>
 * The endpoint for configuration service requests is region-specific:
 * cloudsearch. <i>region</i> .amazonaws.com. For example,
 * cloudsearch.us-east-1.amazonaws.com. For a current list of supported
 * regions and endpoints, see
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#cloudsearch_region"> Regions and Endpoints </a>
 * .
 * </p>
 */
public class AmazonCloudSearchAsyncClient extends AmazonCloudSearchClient
        implements AmazonCloudSearchAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private final ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchv2.  A credentials provider chain will be used
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
    public AmazonCloudSearchAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchv2.  A credentials provider chain will be used
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
     *                       client connects to AmazonCloudSearchv2
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCloudSearchAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchv2 using the specified AWS account credentials.
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
    public AmazonCloudSearchAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchv2 using the specified AWS account credentials
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
    public AmazonCloudSearchAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchv2 using the specified AWS account credentials,
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
    public AmazonCloudSearchAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchv2 using the specified AWS account credentials provider.
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
    public AmazonCloudSearchAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchv2 using the specified AWS account credentials provider
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
    public AmazonCloudSearchAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchv2 using the specified AWS account credentials
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
    public AmazonCloudSearchAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchv2 using the specified AWS account credentials
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
    public AmazonCloudSearchAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Gets the analysis schemes configured for a domain. An analysis scheme
     * defines language-specific text processing options for a
     * <code>text</code> field. Can be limited to specific analysis schemes
     * by name. By default, shows all analysis schemes and includes any
     * pending changes to the configuration. Set the <code>Deployed</code>
     * option to <code>true</code> to show the active configuration and
     * exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeAnalysisSchemesRequest Container for the necessary
     *           parameters to execute the DescribeAnalysisSchemes operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAnalysisSchemes service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAnalysisSchemesResult> describeAnalysisSchemesAsync(final DescribeAnalysisSchemesRequest describeAnalysisSchemesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAnalysisSchemesResult>() {
            public DescribeAnalysisSchemesResult call() throws Exception {
                return describeAnalysisSchemes(describeAnalysisSchemesRequest);
        }
    });
    }

    /**
     * <p>
     * Gets the analysis schemes configured for a domain. An analysis scheme
     * defines language-specific text processing options for a
     * <code>text</code> field. Can be limited to specific analysis schemes
     * by name. By default, shows all analysis schemes and includes any
     * pending changes to the configuration. Set the <code>Deployed</code>
     * option to <code>true</code> to show the active configuration and
     * exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeAnalysisSchemesRequest Container for the necessary
     *           parameters to execute the DescribeAnalysisSchemes operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAnalysisSchemes service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAnalysisSchemesResult> describeAnalysisSchemesAsync(
            final DescribeAnalysisSchemesRequest describeAnalysisSchemesRequest,
            final AsyncHandler<DescribeAnalysisSchemesRequest, DescribeAnalysisSchemesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAnalysisSchemesResult>() {
            public DescribeAnalysisSchemesResult call() throws Exception {
              DescribeAnalysisSchemesResult result;
                try {
                result = describeAnalysisSchemes(describeAnalysisSchemesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeAnalysisSchemesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Removes an <code> IndexField </code> from the search domain. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"> Configuring Index Fields </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteIndexFieldRequest Container for the necessary parameters
     *           to execute the DeleteIndexField operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIndexField service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteIndexFieldResult> deleteIndexFieldAsync(final DeleteIndexFieldRequest deleteIndexFieldRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteIndexFieldResult>() {
            public DeleteIndexFieldResult call() throws Exception {
                return deleteIndexField(deleteIndexFieldRequest);
        }
    });
    }

    /**
     * <p>
     * Removes an <code> IndexField </code> from the search domain. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"> Configuring Index Fields </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteIndexFieldRequest Container for the necessary parameters
     *           to execute the DeleteIndexField operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIndexField service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteIndexFieldResult> deleteIndexFieldAsync(
            final DeleteIndexFieldRequest deleteIndexFieldRequest,
            final AsyncHandler<DeleteIndexFieldRequest, DeleteIndexFieldResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteIndexFieldResult>() {
            public DeleteIndexFieldResult call() throws Exception {
              DeleteIndexFieldResult result;
                try {
                result = deleteIndexField(deleteIndexFieldRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteIndexFieldRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Configures the availability options for a domain. Enabling the
     * Multi-AZ option expands an Amazon CloudSearch domain to an additional
     * Availability Zone in the same Region to increase fault tolerance in
     * the event of a service disruption. Changes to the Multi-AZ option can
     * take about half an hour to become active. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html"> Configuring Availability Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param updateAvailabilityOptionsRequest Container for the necessary
     *           parameters to execute the UpdateAvailabilityOptions operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAvailabilityOptions service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateAvailabilityOptionsResult> updateAvailabilityOptionsAsync(final UpdateAvailabilityOptionsRequest updateAvailabilityOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateAvailabilityOptionsResult>() {
            public UpdateAvailabilityOptionsResult call() throws Exception {
                return updateAvailabilityOptions(updateAvailabilityOptionsRequest);
        }
    });
    }

    /**
     * <p>
     * Configures the availability options for a domain. Enabling the
     * Multi-AZ option expands an Amazon CloudSearch domain to an additional
     * Availability Zone in the same Region to increase fault tolerance in
     * the event of a service disruption. Changes to the Multi-AZ option can
     * take about half an hour to become active. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html"> Configuring Availability Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param updateAvailabilityOptionsRequest Container for the necessary
     *           parameters to execute the UpdateAvailabilityOptions operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAvailabilityOptions service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateAvailabilityOptionsResult> updateAvailabilityOptionsAsync(
            final UpdateAvailabilityOptionsRequest updateAvailabilityOptionsRequest,
            final AsyncHandler<UpdateAvailabilityOptionsRequest, UpdateAvailabilityOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateAvailabilityOptionsResult>() {
            public UpdateAvailabilityOptionsResult call() throws Exception {
              UpdateAvailabilityOptionsResult result;
                try {
                result = updateAvailabilityOptions(updateAvailabilityOptionsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateAvailabilityOptionsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets information about the index fields configured for the search
     * domain. Can be limited to specific fields by name. By default, shows
     * all fields and includes any pending changes to the configuration. Set
     * the <code>Deployed</code> option to <code>true</code> to show the
     * active configuration and exclude pending changes. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html"> Getting Domain Information </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeIndexFieldsRequest Container for the necessary
     *           parameters to execute the DescribeIndexFields operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIndexFields service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIndexFieldsResult> describeIndexFieldsAsync(final DescribeIndexFieldsRequest describeIndexFieldsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeIndexFieldsResult>() {
            public DescribeIndexFieldsResult call() throws Exception {
                return describeIndexFields(describeIndexFieldsRequest);
        }
    });
    }

    /**
     * <p>
     * Gets information about the index fields configured for the search
     * domain. Can be limited to specific fields by name. By default, shows
     * all fields and includes any pending changes to the configuration. Set
     * the <code>Deployed</code> option to <code>true</code> to show the
     * active configuration and exclude pending changes. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html"> Getting Domain Information </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeIndexFieldsRequest Container for the necessary
     *           parameters to execute the DescribeIndexFields operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIndexFields service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIndexFieldsResult> describeIndexFieldsAsync(
            final DescribeIndexFieldsRequest describeIndexFieldsRequest,
            final AsyncHandler<DescribeIndexFieldsRequest, DescribeIndexFieldsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeIndexFieldsResult>() {
            public DescribeIndexFieldsResult call() throws Exception {
              DescribeIndexFieldsResult result;
                try {
                result = describeIndexFields(describeIndexFieldsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeIndexFieldsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Configures an <code> Expression </code> for the search domain. Used
     * to create new expressions and modify existing ones. If the expression
     * exists, the new configuration replaces the old one. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"> Configuring Expressions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineExpressionRequest Container for the necessary parameters
     *           to execute the DefineExpression operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DefineExpression service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineExpressionResult> defineExpressionAsync(final DefineExpressionRequest defineExpressionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DefineExpressionResult>() {
            public DefineExpressionResult call() throws Exception {
                return defineExpression(defineExpressionRequest);
        }
    });
    }

    /**
     * <p>
     * Configures an <code> Expression </code> for the search domain. Used
     * to create new expressions and modify existing ones. If the expression
     * exists, the new configuration replaces the old one. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"> Configuring Expressions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineExpressionRequest Container for the necessary parameters
     *           to execute the DefineExpression operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DefineExpression service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineExpressionResult> defineExpressionAsync(
            final DefineExpressionRequest defineExpressionRequest,
            final AsyncHandler<DefineExpressionRequest, DefineExpressionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DefineExpressionResult>() {
            public DefineExpressionResult call() throws Exception {
              DefineExpressionResult result;
                try {
                result = defineExpression(defineExpressionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(defineExpressionRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Configures a suggester for a domain. A suggester enables you to
     * display possible matches before users finish typing their queries.
     * When you configure a suggester, you must specify the name of the text
     * field you want to search for possible matches and a unique name for
     * the suggester. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineSuggesterRequest Container for the necessary parameters
     *           to execute the DefineSuggester operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DefineSuggester service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineSuggesterResult> defineSuggesterAsync(final DefineSuggesterRequest defineSuggesterRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DefineSuggesterResult>() {
            public DefineSuggesterResult call() throws Exception {
                return defineSuggester(defineSuggesterRequest);
        }
    });
    }

    /**
     * <p>
     * Configures a suggester for a domain. A suggester enables you to
     * display possible matches before users finish typing their queries.
     * When you configure a suggester, you must specify the name of the text
     * field you want to search for possible matches and a unique name for
     * the suggester. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineSuggesterRequest Container for the necessary parameters
     *           to execute the DefineSuggester operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DefineSuggester service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineSuggesterResult> defineSuggesterAsync(
            final DefineSuggesterRequest defineSuggesterRequest,
            final AsyncHandler<DefineSuggesterRequest, DefineSuggesterResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DefineSuggesterResult>() {
            public DefineSuggesterResult call() throws Exception {
              DefineSuggesterResult result;
                try {
                result = defineSuggester(defineSuggesterRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(defineSuggesterRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Configures the access rules that control access to the domain's
     * document and search endpoints. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html"> Configuring Access for an Amazon CloudSearch Domain </a>
     * .
     * </p>
     *
     * @param updateServiceAccessPoliciesRequest Container for the necessary
     *           parameters to execute the UpdateServiceAccessPolicies operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateServiceAccessPolicies service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateServiceAccessPoliciesResult> updateServiceAccessPoliciesAsync(final UpdateServiceAccessPoliciesRequest updateServiceAccessPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateServiceAccessPoliciesResult>() {
            public UpdateServiceAccessPoliciesResult call() throws Exception {
                return updateServiceAccessPolicies(updateServiceAccessPoliciesRequest);
        }
    });
    }

    /**
     * <p>
     * Configures the access rules that control access to the domain's
     * document and search endpoints. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html"> Configuring Access for an Amazon CloudSearch Domain </a>
     * .
     * </p>
     *
     * @param updateServiceAccessPoliciesRequest Container for the necessary
     *           parameters to execute the UpdateServiceAccessPolicies operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateServiceAccessPolicies service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateServiceAccessPoliciesResult> updateServiceAccessPoliciesAsync(
            final UpdateServiceAccessPoliciesRequest updateServiceAccessPoliciesRequest,
            final AsyncHandler<UpdateServiceAccessPoliciesRequest, UpdateServiceAccessPoliciesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateServiceAccessPoliciesResult>() {
            public UpdateServiceAccessPoliciesResult call() throws Exception {
              UpdateServiceAccessPoliciesResult result;
                try {
                result = updateServiceAccessPolicies(updateServiceAccessPoliciesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateServiceAccessPoliciesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes an analysis scheme. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteAnalysisSchemeRequest Container for the necessary
     *           parameters to execute the DeleteAnalysisScheme operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAnalysisScheme service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteAnalysisSchemeResult> deleteAnalysisSchemeAsync(final DeleteAnalysisSchemeRequest deleteAnalysisSchemeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteAnalysisSchemeResult>() {
            public DeleteAnalysisSchemeResult call() throws Exception {
                return deleteAnalysisScheme(deleteAnalysisSchemeRequest);
        }
    });
    }

    /**
     * <p>
     * Deletes an analysis scheme. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteAnalysisSchemeRequest Container for the necessary
     *           parameters to execute the DeleteAnalysisScheme operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAnalysisScheme service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteAnalysisSchemeResult> deleteAnalysisSchemeAsync(
            final DeleteAnalysisSchemeRequest deleteAnalysisSchemeRequest,
            final AsyncHandler<DeleteAnalysisSchemeRequest, DeleteAnalysisSchemeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteAnalysisSchemeResult>() {
            public DeleteAnalysisSchemeResult call() throws Exception {
              DeleteAnalysisSchemeResult result;
                try {
                result = deleteAnalysisScheme(deleteAnalysisSchemeRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteAnalysisSchemeRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Tells the search domain to start indexing its documents using the
     * latest indexing options. This operation must be invoked to activate
     * options whose OptionStatus is <code>RequiresIndexDocuments</code> .
     * </p>
     *
     * @param indexDocumentsRequest Container for the necessary parameters to
     *           execute the IndexDocuments operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         IndexDocuments service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<IndexDocumentsResult> indexDocumentsAsync(final IndexDocumentsRequest indexDocumentsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<IndexDocumentsResult>() {
            public IndexDocumentsResult call() throws Exception {
                return indexDocuments(indexDocumentsRequest);
        }
    });
    }

    /**
     * <p>
     * Tells the search domain to start indexing its documents using the
     * latest indexing options. This operation must be invoked to activate
     * options whose OptionStatus is <code>RequiresIndexDocuments</code> .
     * </p>
     *
     * @param indexDocumentsRequest Container for the necessary parameters to
     *           execute the IndexDocuments operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         IndexDocuments service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<IndexDocumentsResult> indexDocumentsAsync(
            final IndexDocumentsRequest indexDocumentsRequest,
            final AsyncHandler<IndexDocumentsRequest, IndexDocumentsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<IndexDocumentsResult>() {
            public IndexDocumentsResult call() throws Exception {
              IndexDocumentsResult result;
                try {
                result = indexDocuments(indexDocumentsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(indexDocumentsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets the suggesters configured for a domain. A suggester enables you
     * to display possible matches before users finish typing their queries.
     * Can be limited to specific suggesters by name. By default, shows all
     * suggesters and includes any pending changes to the configuration. Set
     * the <code>Deployed</code> option to <code>true</code> to show the
     * active configuration and exclude pending changes. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeSuggestersRequest Container for the necessary
     *           parameters to execute the DescribeSuggesters operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSuggesters service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSuggestersResult> describeSuggestersAsync(final DescribeSuggestersRequest describeSuggestersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSuggestersResult>() {
            public DescribeSuggestersResult call() throws Exception {
                return describeSuggesters(describeSuggestersRequest);
        }
    });
    }

    /**
     * <p>
     * Gets the suggesters configured for a domain. A suggester enables you
     * to display possible matches before users finish typing their queries.
     * Can be limited to specific suggesters by name. By default, shows all
     * suggesters and includes any pending changes to the configuration. Set
     * the <code>Deployed</code> option to <code>true</code> to show the
     * active configuration and exclude pending changes. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeSuggestersRequest Container for the necessary
     *           parameters to execute the DescribeSuggesters operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSuggesters service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSuggestersResult> describeSuggestersAsync(
            final DescribeSuggestersRequest describeSuggestersRequest,
            final AsyncHandler<DescribeSuggestersRequest, DescribeSuggestersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSuggestersResult>() {
            public DescribeSuggestersResult call() throws Exception {
              DescribeSuggestersResult result;
                try {
                result = describeSuggesters(describeSuggestersRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeSuggestersRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Configures scaling parameters for a domain. A domain's scaling
     * parameters specify the desired search instance type and replication
     * count. Amazon CloudSearch will still automatically scale your domain
     * based on the volume of data and traffic, but not below the desired
     * instance type and replication count. If the Multi-AZ option is
     * enabled, these values control the resources used per Availability
     * Zone. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html"> Configuring Scaling Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param updateScalingParametersRequest Container for the necessary
     *           parameters to execute the UpdateScalingParameters operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateScalingParameters service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateScalingParametersResult> updateScalingParametersAsync(final UpdateScalingParametersRequest updateScalingParametersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateScalingParametersResult>() {
            public UpdateScalingParametersResult call() throws Exception {
                return updateScalingParameters(updateScalingParametersRequest);
        }
    });
    }

    /**
     * <p>
     * Configures scaling parameters for a domain. A domain's scaling
     * parameters specify the desired search instance type and replication
     * count. Amazon CloudSearch will still automatically scale your domain
     * based on the volume of data and traffic, but not below the desired
     * instance type and replication count. If the Multi-AZ option is
     * enabled, these values control the resources used per Availability
     * Zone. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html"> Configuring Scaling Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param updateScalingParametersRequest Container for the necessary
     *           parameters to execute the UpdateScalingParameters operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateScalingParameters service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateScalingParametersResult> updateScalingParametersAsync(
            final UpdateScalingParametersRequest updateScalingParametersRequest,
            final AsyncHandler<UpdateScalingParametersRequest, UpdateScalingParametersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateScalingParametersResult>() {
            public UpdateScalingParametersResult call() throws Exception {
              UpdateScalingParametersResult result;
                try {
                result = updateScalingParameters(updateScalingParametersRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateScalingParametersRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Lists all search domains owned by an account.
     * </p>
     *
     * @param listDomainNamesRequest Container for the necessary parameters
     *           to execute the ListDomainNames operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         ListDomainNames service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDomainNamesResult> listDomainNamesAsync(final ListDomainNamesRequest listDomainNamesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDomainNamesResult>() {
            public ListDomainNamesResult call() throws Exception {
                return listDomainNames(listDomainNamesRequest);
        }
    });
    }

    /**
     * <p>
     * Lists all search domains owned by an account.
     * </p>
     *
     * @param listDomainNamesRequest Container for the necessary parameters
     *           to execute the ListDomainNames operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDomainNames service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDomainNamesResult> listDomainNamesAsync(
            final ListDomainNamesRequest listDomainNamesRequest,
            final AsyncHandler<ListDomainNamesRequest, ListDomainNamesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDomainNamesResult>() {
            public ListDomainNamesResult call() throws Exception {
              ListDomainNamesResult result;
                try {
                result = listDomainNames(listDomainNamesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listDomainNamesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Configures an <code> IndexField </code> for the search domain. Used
     * to create new fields and modify existing ones. You must specify the
     * name of the domain you are configuring and an index field
     * configuration. The index field configuration specifies a unique name,
     * the index field type, and the options you want to configure for the
     * field. The options you can specify depend on the <code> IndexFieldType
     * </code> . If the field exists, the new configuration replaces the old
     * one. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"> Configuring Index Fields </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineIndexFieldRequest Container for the necessary parameters
     *           to execute the DefineIndexField operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DefineIndexField service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineIndexFieldResult> defineIndexFieldAsync(final DefineIndexFieldRequest defineIndexFieldRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DefineIndexFieldResult>() {
            public DefineIndexFieldResult call() throws Exception {
                return defineIndexField(defineIndexFieldRequest);
        }
    });
    }

    /**
     * <p>
     * Configures an <code> IndexField </code> for the search domain. Used
     * to create new fields and modify existing ones. You must specify the
     * name of the domain you are configuring and an index field
     * configuration. The index field configuration specifies a unique name,
     * the index field type, and the options you want to configure for the
     * field. The options you can specify depend on the <code> IndexFieldType
     * </code> . If the field exists, the new configuration replaces the old
     * one. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"> Configuring Index Fields </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineIndexFieldRequest Container for the necessary parameters
     *           to execute the DefineIndexField operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DefineIndexField service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineIndexFieldResult> defineIndexFieldAsync(
            final DefineIndexFieldRequest defineIndexFieldRequest,
            final AsyncHandler<DefineIndexFieldRequest, DefineIndexFieldResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DefineIndexFieldResult>() {
            public DefineIndexFieldResult call() throws Exception {
              DefineIndexFieldResult result;
                try {
                result = defineIndexField(defineIndexFieldRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(defineIndexFieldRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a new search domain. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/creating-domains.html"> Creating a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param createDomainRequest Container for the necessary parameters to
     *           execute the CreateDomain operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDomain service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDomainResult> createDomainAsync(final CreateDomainRequest createDomainRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDomainResult>() {
            public CreateDomainResult call() throws Exception {
                return createDomain(createDomainRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a new search domain. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/creating-domains.html"> Creating a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param createDomainRequest Container for the necessary parameters to
     *           execute the CreateDomain operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDomain service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDomainResult> createDomainAsync(
            final CreateDomainRequest createDomainRequest,
            final AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDomainResult>() {
            public CreateDomainResult call() throws Exception {
              CreateDomainResult result;
                try {
                result = createDomain(createDomainRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createDomainRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes a suggester. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteSuggesterRequest Container for the necessary parameters
     *           to execute the DeleteSuggester operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSuggester service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteSuggesterResult> deleteSuggesterAsync(final DeleteSuggesterRequest deleteSuggesterRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteSuggesterResult>() {
            public DeleteSuggesterResult call() throws Exception {
                return deleteSuggester(deleteSuggesterRequest);
        }
    });
    }

    /**
     * <p>
     * Deletes a suggester. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteSuggesterRequest Container for the necessary parameters
     *           to execute the DeleteSuggester operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSuggester service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteSuggesterResult> deleteSuggesterAsync(
            final DeleteSuggesterRequest deleteSuggesterRequest,
            final AsyncHandler<DeleteSuggesterRequest, DeleteSuggesterResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteSuggesterResult>() {
            public DeleteSuggesterResult call() throws Exception {
              DeleteSuggesterResult result;
                try {
                result = deleteSuggester(deleteSuggesterRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteSuggesterRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Removes an <code> Expression </code> from the search domain. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"> Configuring Expressions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteExpressionRequest Container for the necessary parameters
     *           to execute the DeleteExpression operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteExpression service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteExpressionResult> deleteExpressionAsync(final DeleteExpressionRequest deleteExpressionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteExpressionResult>() {
            public DeleteExpressionResult call() throws Exception {
                return deleteExpression(deleteExpressionRequest);
        }
    });
    }

    /**
     * <p>
     * Removes an <code> Expression </code> from the search domain. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"> Configuring Expressions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteExpressionRequest Container for the necessary parameters
     *           to execute the DeleteExpression operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteExpression service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteExpressionResult> deleteExpressionAsync(
            final DeleteExpressionRequest deleteExpressionRequest,
            final AsyncHandler<DeleteExpressionRequest, DeleteExpressionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteExpressionResult>() {
            public DeleteExpressionResult call() throws Exception {
              DeleteExpressionResult result;
                try {
                result = deleteExpression(deleteExpressionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteExpressionRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets the availability options configured for a domain. By default,
     * shows the configuration with any pending changes. Set the
     * <code>Deployed</code> option to <code>true</code> to show the active
     * configuration and exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html"> Configuring Availability Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeAvailabilityOptionsRequest Container for the necessary
     *           parameters to execute the DescribeAvailabilityOptions operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAvailabilityOptions service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAvailabilityOptionsResult> describeAvailabilityOptionsAsync(final DescribeAvailabilityOptionsRequest describeAvailabilityOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAvailabilityOptionsResult>() {
            public DescribeAvailabilityOptionsResult call() throws Exception {
                return describeAvailabilityOptions(describeAvailabilityOptionsRequest);
        }
    });
    }

    /**
     * <p>
     * Gets the availability options configured for a domain. By default,
     * shows the configuration with any pending changes. Set the
     * <code>Deployed</code> option to <code>true</code> to show the active
     * configuration and exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html"> Configuring Availability Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeAvailabilityOptionsRequest Container for the necessary
     *           parameters to execute the DescribeAvailabilityOptions operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAvailabilityOptions service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAvailabilityOptionsResult> describeAvailabilityOptionsAsync(
            final DescribeAvailabilityOptionsRequest describeAvailabilityOptionsRequest,
            final AsyncHandler<DescribeAvailabilityOptionsRequest, DescribeAvailabilityOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAvailabilityOptionsResult>() {
            public DescribeAvailabilityOptionsResult call() throws Exception {
              DescribeAvailabilityOptionsResult result;
                try {
                result = describeAvailabilityOptions(describeAvailabilityOptionsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeAvailabilityOptionsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Configures an analysis scheme that can be applied to a
     * <code>text</code> or <code>text-array</code> field to define
     * language-specific text processing options. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineAnalysisSchemeRequest Container for the necessary
     *           parameters to execute the DefineAnalysisScheme operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DefineAnalysisScheme service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineAnalysisSchemeResult> defineAnalysisSchemeAsync(final DefineAnalysisSchemeRequest defineAnalysisSchemeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DefineAnalysisSchemeResult>() {
            public DefineAnalysisSchemeResult call() throws Exception {
                return defineAnalysisScheme(defineAnalysisSchemeRequest);
        }
    });
    }

    /**
     * <p>
     * Configures an analysis scheme that can be applied to a
     * <code>text</code> or <code>text-array</code> field to define
     * language-specific text processing options. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineAnalysisSchemeRequest Container for the necessary
     *           parameters to execute the DefineAnalysisScheme operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DefineAnalysisScheme service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineAnalysisSchemeResult> defineAnalysisSchemeAsync(
            final DefineAnalysisSchemeRequest defineAnalysisSchemeRequest,
            final AsyncHandler<DefineAnalysisSchemeRequest, DefineAnalysisSchemeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DefineAnalysisSchemeResult>() {
            public DefineAnalysisSchemeResult call() throws Exception {
              DefineAnalysisSchemeResult result;
                try {
                result = defineAnalysisScheme(defineAnalysisSchemeRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(defineAnalysisSchemeRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Indexes the search suggestions. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html#configuring-suggesters"> Configuring Suggesters </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param buildSuggestersRequest Container for the necessary parameters
     *           to execute the BuildSuggesters operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         BuildSuggesters service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BuildSuggestersResult> buildSuggestersAsync(final BuildSuggestersRequest buildSuggestersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BuildSuggestersResult>() {
            public BuildSuggestersResult call() throws Exception {
                return buildSuggesters(buildSuggestersRequest);
        }
    });
    }

    /**
     * <p>
     * Indexes the search suggestions. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html#configuring-suggesters"> Configuring Suggesters </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param buildSuggestersRequest Container for the necessary parameters
     *           to execute the BuildSuggesters operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         BuildSuggesters service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BuildSuggestersResult> buildSuggestersAsync(
            final BuildSuggestersRequest buildSuggestersRequest,
            final AsyncHandler<BuildSuggestersRequest, BuildSuggestersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BuildSuggestersResult>() {
            public BuildSuggestersResult call() throws Exception {
              BuildSuggestersResult result;
                try {
                result = buildSuggesters(buildSuggestersRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(buildSuggestersRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets information about the access policies that control access to the
     * domain's document and search endpoints. By default, shows the
     * configuration with any pending changes. Set the <code>Deployed</code>
     * option to <code>true</code> to show the active configuration and
     * exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html"> Configuring Access for a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeServiceAccessPoliciesRequest Container for the
     *           necessary parameters to execute the DescribeServiceAccessPolicies
     *           operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServiceAccessPolicies service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServiceAccessPoliciesResult> describeServiceAccessPoliciesAsync(final DescribeServiceAccessPoliciesRequest describeServiceAccessPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeServiceAccessPoliciesResult>() {
            public DescribeServiceAccessPoliciesResult call() throws Exception {
                return describeServiceAccessPolicies(describeServiceAccessPoliciesRequest);
        }
    });
    }

    /**
     * <p>
     * Gets information about the access policies that control access to the
     * domain's document and search endpoints. By default, shows the
     * configuration with any pending changes. Set the <code>Deployed</code>
     * option to <code>true</code> to show the active configuration and
     * exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html"> Configuring Access for a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeServiceAccessPoliciesRequest Container for the
     *           necessary parameters to execute the DescribeServiceAccessPolicies
     *           operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServiceAccessPolicies service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServiceAccessPoliciesResult> describeServiceAccessPoliciesAsync(
            final DescribeServiceAccessPoliciesRequest describeServiceAccessPoliciesRequest,
            final AsyncHandler<DescribeServiceAccessPoliciesRequest, DescribeServiceAccessPoliciesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeServiceAccessPoliciesResult>() {
            public DescribeServiceAccessPoliciesResult call() throws Exception {
              DescribeServiceAccessPoliciesResult result;
                try {
                result = describeServiceAccessPolicies(describeServiceAccessPoliciesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeServiceAccessPoliciesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Permanently deletes a search domain and all of its data. Once a
     * domain has been deleted, it cannot be recovered. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/deleting-domains.html"> Deleting a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteDomainRequest Container for the necessary parameters to
     *           execute the DeleteDomain operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDomain service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDomainResult> deleteDomainAsync(final DeleteDomainRequest deleteDomainRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDomainResult>() {
            public DeleteDomainResult call() throws Exception {
                return deleteDomain(deleteDomainRequest);
        }
    });
    }

    /**
     * <p>
     * Permanently deletes a search domain and all of its data. Once a
     * domain has been deleted, it cannot be recovered. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/deleting-domains.html"> Deleting a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteDomainRequest Container for the necessary parameters to
     *           execute the DeleteDomain operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDomain service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDomainResult> deleteDomainAsync(
            final DeleteDomainRequest deleteDomainRequest,
            final AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDomainResult>() {
            public DeleteDomainResult call() throws Exception {
              DeleteDomainResult result;
                try {
                result = deleteDomain(deleteDomainRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteDomainRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets the expressions configured for the search domain. Can be limited
     * to specific expressions by name. By default, shows all expressions and
     * includes any pending changes to the configuration. Set the
     * <code>Deployed</code> option to <code>true</code> to show the active
     * configuration and exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"> Configuring Expressions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeExpressionsRequest Container for the necessary
     *           parameters to execute the DescribeExpressions operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeExpressions service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeExpressionsResult> describeExpressionsAsync(final DescribeExpressionsRequest describeExpressionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeExpressionsResult>() {
            public DescribeExpressionsResult call() throws Exception {
                return describeExpressions(describeExpressionsRequest);
        }
    });
    }

    /**
     * <p>
     * Gets the expressions configured for the search domain. Can be limited
     * to specific expressions by name. By default, shows all expressions and
     * includes any pending changes to the configuration. Set the
     * <code>Deployed</code> option to <code>true</code> to show the active
     * configuration and exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"> Configuring Expressions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeExpressionsRequest Container for the necessary
     *           parameters to execute the DescribeExpressions operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeExpressions service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeExpressionsResult> describeExpressionsAsync(
            final DescribeExpressionsRequest describeExpressionsRequest,
            final AsyncHandler<DescribeExpressionsRequest, DescribeExpressionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeExpressionsResult>() {
            public DescribeExpressionsResult call() throws Exception {
              DescribeExpressionsResult result;
                try {
                result = describeExpressions(describeExpressionsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeExpressionsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets information about the search domains owned by this account. Can
     * be limited to specific domains. Shows all domains by default. To get
     * the number of searchable documents in a domain, use the console or
     * submit a <code>matchall</code> request to your domain's search
     * endpoint: <code>q=matchall&q.parser=structured&size=0</code> . For
     * more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html"> Getting Information about a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeDomainsRequest Container for the necessary parameters
     *           to execute the DescribeDomains operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDomains service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDomainsResult> describeDomainsAsync(final DescribeDomainsRequest describeDomainsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDomainsResult>() {
            public DescribeDomainsResult call() throws Exception {
                return describeDomains(describeDomainsRequest);
        }
    });
    }

    /**
     * <p>
     * Gets information about the search domains owned by this account. Can
     * be limited to specific domains. Shows all domains by default. To get
     * the number of searchable documents in a domain, use the console or
     * submit a <code>matchall</code> request to your domain's search
     * endpoint: <code>q=matchall&q.parser=structured&size=0</code> . For
     * more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html"> Getting Information about a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeDomainsRequest Container for the necessary parameters
     *           to execute the DescribeDomains operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDomains service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDomainsResult> describeDomainsAsync(
            final DescribeDomainsRequest describeDomainsRequest,
            final AsyncHandler<DescribeDomainsRequest, DescribeDomainsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDomainsResult>() {
            public DescribeDomainsResult call() throws Exception {
              DescribeDomainsResult result;
                try {
                result = describeDomains(describeDomainsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeDomainsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets the scaling parameters configured for a domain. A domain's
     * scaling parameters specify the desired search instance type and
     * replication count. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html"> Configuring Scaling Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeScalingParametersRequest Container for the necessary
     *           parameters to execute the DescribeScalingParameters operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeScalingParameters service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeScalingParametersResult> describeScalingParametersAsync(final DescribeScalingParametersRequest describeScalingParametersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScalingParametersResult>() {
            public DescribeScalingParametersResult call() throws Exception {
                return describeScalingParameters(describeScalingParametersRequest);
        }
    });
    }

    /**
     * <p>
     * Gets the scaling parameters configured for a domain. A domain's
     * scaling parameters specify the desired search instance type and
     * replication count. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html"> Configuring Scaling Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeScalingParametersRequest Container for the necessary
     *           parameters to execute the DescribeScalingParameters operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeScalingParameters service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeScalingParametersResult> describeScalingParametersAsync(
            final DescribeScalingParametersRequest describeScalingParametersRequest,
            final AsyncHandler<DescribeScalingParametersRequest, DescribeScalingParametersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScalingParametersResult>() {
            public DescribeScalingParametersResult call() throws Exception {
              DescribeScalingParametersResult result;
                try {
                result = describeScalingParameters(describeScalingParametersRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeScalingParametersRequest, result);
                 return result;
        }
    });
    }
    
}
        
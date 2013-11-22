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
package com.amazonaws.services.cloudformation;

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

import com.amazonaws.services.cloudformation.model.*;


/**
 * Asynchronous client for accessing AmazonCloudFormation.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * AWS CloudFormation <p>
 * AWS CloudFormation enables you to create and manage AWS infrastructure deployments predictably and repeatedly. AWS CloudFormation helps you leverage
 * AWS products such as Amazon EC2, EBS, Amazon SNS, ELB, and Auto Scaling to build highly-reliable, highly scalable, cost effective applications without
 * worrying about creating and configuring the underlying the AWS infrastructure.
 * </p>
 * <p>
 * With AWS CloudFormation, you declare all of your resources and dependencies in a template file. The template defines a collection of resources as a
 * single unit called a stack. AWS CloudFormation creates and deletes all member resources of the stack together and manages all dependencies between the
 * resources for you.
 * </p>
 * <p>
 * For more information about this product, go to the <a href="http://aws.amazon.com/cloudformation/"> CloudFormation Product Page </a> .
 * </p>
 * <p>
 * Amazon CloudFormation makes use of other AWS products. If you need additional technical information about a specific AWS product, you can find the
 * product's technical documentation at <a href="http://aws.amazon.com/documentation/"> http://aws.amazon.com/documentation/ </a> .
 * </p>
 * <p>
 * <b>NOTE:</b>You must call the AWS CloudFormation API as a regular IAM user. AWS CloudFormation does not support calling the API with an IAM role
 * </p>
 */
public class AmazonCloudFormationAsyncClient extends AmazonCloudFormationClient
        implements AmazonCloudFormationAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFormation.  A credentials provider chain will be used
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
    public AmazonCloudFormationAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFormation.  A credentials provider chain will be used
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
     *                       client connects to AmazonCloudFormation
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCloudFormationAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFormation using the specified AWS account credentials.
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
    public AmazonCloudFormationAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFormation using the specified AWS account credentials
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
    public AmazonCloudFormationAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFormation using the specified AWS account credentials,
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
    public AmazonCloudFormationAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFormation using the specified AWS account credentials provider.
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
    public AmazonCloudFormationAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFormation using the specified AWS account credentials provider
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
    public AmazonCloudFormationAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFormation using the specified AWS account credentials
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
    public AmazonCloudFormationAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFormation using the specified AWS account credentials
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
    public AmazonCloudFormationAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Validates a specified template.
     * </p>
     *
     * @param validateTemplateRequest Container for the necessary parameters
     *           to execute the ValidateTemplate operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         ValidateTemplate service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ValidateTemplateResult> validateTemplateAsync(final ValidateTemplateRequest validateTemplateRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ValidateTemplateResult>() {
            public ValidateTemplateResult call() throws Exception {
                return validateTemplate(validateTemplateRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Validates a specified template.
     * </p>
     *
     * @param validateTemplateRequest Container for the necessary parameters
     *           to execute the ValidateTemplate operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ValidateTemplate service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ValidateTemplateResult> validateTemplateAsync(
            final ValidateTemplateRequest validateTemplateRequest,
            final AsyncHandler<ValidateTemplateRequest, ValidateTemplateResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ValidateTemplateResult>() {
            public ValidateTemplateResult call() throws Exception {
            	ValidateTemplateResult result;
                try {
            		result = validateTemplate(validateTemplateRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(validateTemplateRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the description for the specified stack; if no stack name was
     * specified, then it returns the description for all the stacks created.
     * </p>
     *
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStacks service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
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
     * Returns the description for the specified stack; if no stack name was
     * specified, then it returns the description for all the stacks created.
     * </p>
     *
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStacks service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
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
     * Returns the template body for a specified stack. You can get the
     * template for running or deleted stacks.
     * </p>
     * <p>
     * For deleted stacks, GetTemplate returns the template for up to 90 days
     * after the stack has been deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> If the template does not exist, a ValidationError is
     * returned.
     * </p>
     *
     * @param getTemplateRequest Container for the necessary parameters to
     *           execute the GetTemplate operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         GetTemplate service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTemplateResult> getTemplateAsync(final GetTemplateRequest getTemplateRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTemplateResult>() {
            public GetTemplateResult call() throws Exception {
                return getTemplate(getTemplateRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the template body for a specified stack. You can get the
     * template for running or deleted stacks.
     * </p>
     * <p>
     * For deleted stacks, GetTemplate returns the template for up to 90 days
     * after the stack has been deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> If the template does not exist, a ValidationError is
     * returned.
     * </p>
     *
     * @param getTemplateRequest Container for the necessary parameters to
     *           execute the GetTemplate operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetTemplate service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTemplateResult> getTemplateAsync(
            final GetTemplateRequest getTemplateRequest,
            final AsyncHandler<GetTemplateRequest, GetTemplateResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTemplateResult>() {
            public GetTemplateResult call() throws Exception {
            	GetTemplateResult result;
                try {
            		result = getTemplate(getTemplateRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getTemplateRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the stack policy for a specified stack. If a stack doesn't
     * have a policy, a null value is returned.
     * </p>
     *
     * @param getStackPolicyRequest Container for the necessary parameters to
     *           execute the GetStackPolicy operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         GetStackPolicy service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetStackPolicyResult> getStackPolicyAsync(final GetStackPolicyRequest getStackPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetStackPolicyResult>() {
            public GetStackPolicyResult call() throws Exception {
                return getStackPolicy(getStackPolicyRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the stack policy for a specified stack. If a stack doesn't
     * have a policy, a null value is returned.
     * </p>
     *
     * @param getStackPolicyRequest Container for the necessary parameters to
     *           execute the GetStackPolicy operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetStackPolicy service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetStackPolicyResult> getStackPolicyAsync(
            final GetStackPolicyRequest getStackPolicyRequest,
            final AsyncHandler<GetStackPolicyRequest, GetStackPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetStackPolicyResult>() {
            public GetStackPolicyResult call() throws Exception {
            	GetStackPolicyResult result;
                try {
            		result = getStackPolicy(getStackPolicyRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getStackPolicyRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the summary information for stacks whose status matches the
     * specified StackStatusFilter. Summary information for stacks that have
     * been deleted is kept for 90 days after the stack is deleted. If no
     * StackStatusFilter is specified, summary information for all stacks is
     * returned (including existing stacks and stacks that have been
     * deleted).
     * </p>
     *
     * @param listStacksRequest Container for the necessary parameters to
     *           execute the ListStacks operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         ListStacks service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStacksResult> listStacksAsync(final ListStacksRequest listStacksRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListStacksResult>() {
            public ListStacksResult call() throws Exception {
                return listStacks(listStacksRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the summary information for stacks whose status matches the
     * specified StackStatusFilter. Summary information for stacks that have
     * been deleted is kept for 90 days after the stack is deleted. If no
     * StackStatusFilter is specified, summary information for all stacks is
     * returned (including existing stacks and stacks that have been
     * deleted).
     * </p>
     *
     * @param listStacksRequest Container for the necessary parameters to
     *           execute the ListStacks operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListStacks service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStacksResult> listStacksAsync(
            final ListStacksRequest listStacksRequest,
            final AsyncHandler<ListStacksRequest, ListStacksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListStacksResult>() {
            public ListStacksResult call() throws Exception {
            	ListStacksResult result;
                try {
            		result = listStacks(listStacksRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listStacksRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a stack as specified in the template. After the call completes
     * successfully, the stack creation starts. You can check the status of
     * the stack via the DescribeStacks API.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, the limit for stacks is 20 stacks per account
     * per region.
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStack service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
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
     * Creates a stack as specified in the template. After the call completes
     * successfully, the stack creation starts. You can check the status of
     * the stack via the DescribeStacks API.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, the limit for stacks is 20 stacks per account
     * per region.
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStack service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
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
     * Sets a stack policy for a specified stack.
     * </p>
     *
     * @param setStackPolicyRequest Container for the necessary parameters to
     *           execute the SetStackPolicy operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         SetStackPolicy service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setStackPolicyAsync(final SetStackPolicyRequest setStackPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setStackPolicy(setStackPolicyRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Sets a stack policy for a specified stack.
     * </p>
     *
     * @param setStackPolicyRequest Container for the necessary parameters to
     *           execute the SetStackPolicy operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetStackPolicy service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setStackPolicyAsync(
            final SetStackPolicyRequest setStackPolicyRequest,
            final AsyncHandler<SetStackPolicyRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		setStackPolicy(setStackPolicyRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(setStackPolicyRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the estimated monthly cost of a template. The return value is
     * an AWS Simple Monthly Calculator URL with a query string that
     * describes the resources required to run the template.
     * </p>
     *
     * @param estimateTemplateCostRequest Container for the necessary
     *           parameters to execute the EstimateTemplateCost operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         EstimateTemplateCost service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EstimateTemplateCostResult> estimateTemplateCostAsync(final EstimateTemplateCostRequest estimateTemplateCostRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EstimateTemplateCostResult>() {
            public EstimateTemplateCostResult call() throws Exception {
                return estimateTemplateCost(estimateTemplateCostRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the estimated monthly cost of a template. The return value is
     * an AWS Simple Monthly Calculator URL with a query string that
     * describes the resources required to run the template.
     * </p>
     *
     * @param estimateTemplateCostRequest Container for the necessary
     *           parameters to execute the EstimateTemplateCost operation on
     *           AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EstimateTemplateCost service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EstimateTemplateCostResult> estimateTemplateCostAsync(
            final EstimateTemplateCostRequest estimateTemplateCostRequest,
            final AsyncHandler<EstimateTemplateCostRequest, EstimateTemplateCostResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EstimateTemplateCostResult>() {
            public EstimateTemplateCostResult call() throws Exception {
            	EstimateTemplateCostResult result;
                try {
            		result = estimateTemplateCost(estimateTemplateCostRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(estimateTemplateCostRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns all stack related events for a specified stack. For more
     * information about a stack's event history, go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">
     * AWS CloudFormation User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b>Events are returned, even if the stack never existed or
     * has been successfully deleted.
     * </p>
     *
     * @param describeStackEventsRequest Container for the necessary
     *           parameters to execute the DescribeStackEvents operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackEvents service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackEventsResult> describeStackEventsAsync(final DescribeStackEventsRequest describeStackEventsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStackEventsResult>() {
            public DescribeStackEventsResult call() throws Exception {
                return describeStackEvents(describeStackEventsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns all stack related events for a specified stack. For more
     * information about a stack's event history, go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">
     * AWS CloudFormation User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b>Events are returned, even if the stack never existed or
     * has been successfully deleted.
     * </p>
     *
     * @param describeStackEventsRequest Container for the necessary
     *           parameters to execute the DescribeStackEvents operation on
     *           AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackEvents service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackEventsResult> describeStackEventsAsync(
            final DescribeStackEventsRequest describeStackEventsRequest,
            final AsyncHandler<DescribeStackEventsRequest, DescribeStackEventsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStackEventsResult>() {
            public DescribeStackEventsResult call() throws Exception {
            	DescribeStackEventsResult result;
                try {
            		result = describeStackEvents(describeStackEventsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeStackEventsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a description of the specified resource in the specified
     * stack.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResource returns resource information
     * for up to 90 days after the stack has been deleted.
     * </p>
     *
     * @param describeStackResourceRequest Container for the necessary
     *           parameters to execute the DescribeStackResource operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackResource service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackResourceResult> describeStackResourceAsync(final DescribeStackResourceRequest describeStackResourceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStackResourceResult>() {
            public DescribeStackResourceResult call() throws Exception {
                return describeStackResource(describeStackResourceRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns a description of the specified resource in the specified
     * stack.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResource returns resource information
     * for up to 90 days after the stack has been deleted.
     * </p>
     *
     * @param describeStackResourceRequest Container for the necessary
     *           parameters to execute the DescribeStackResource operation on
     *           AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackResource service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackResourceResult> describeStackResourceAsync(
            final DescribeStackResourceRequest describeStackResourceRequest,
            final AsyncHandler<DescribeStackResourceRequest, DescribeStackResourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStackResourceResult>() {
            public DescribeStackResourceResult call() throws Exception {
            	DescribeStackResourceResult result;
                try {
            		result = describeStackResource(describeStackResourceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeStackResourceRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Cancels an update on the specified stack. If the call completes
     * successfully, the stack will roll back the update and revert to the
     * previous stack configuration.
     * </p>
     * <p>
     * <b>NOTE:</b>Only stacks that are in the UPDATE_IN_PROGRESS state can
     * be canceled.
     * </p>
     *
     * @param cancelUpdateStackRequest Container for the necessary parameters
     *           to execute the CancelUpdateStack operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         CancelUpdateStack service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> cancelUpdateStackAsync(final CancelUpdateStackRequest cancelUpdateStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                cancelUpdateStack(cancelUpdateStackRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Cancels an update on the specified stack. If the call completes
     * successfully, the stack will roll back the update and revert to the
     * previous stack configuration.
     * </p>
     * <p>
     * <b>NOTE:</b>Only stacks that are in the UPDATE_IN_PROGRESS state can
     * be canceled.
     * </p>
     *
     * @param cancelUpdateStackRequest Container for the necessary parameters
     *           to execute the CancelUpdateStack operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CancelUpdateStack service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> cancelUpdateStackAsync(
            final CancelUpdateStackRequest cancelUpdateStackRequest,
            final AsyncHandler<CancelUpdateStackRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		cancelUpdateStack(cancelUpdateStackRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(cancelUpdateStackRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Updates a stack as specified in the template. After the call completes
     * successfully, the stack update starts. You can check the status of the
     * stack via the DescribeStacks action.
     * </p>
     * <p>
     * </p>
     * <p>
     * <b>Note: </b> You cannot update <a
     * com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html">
     * AWS::S3::Bucket </a> resources, for example, to add or modify tags.
     * </p>
     * <p>
     * </p>
     * <p>
     * To get a copy of the template for an existing stack, you can use the
     * GetTemplate action.
     * </p>
     * <p>
     * Tags that were associated with this stack during creation time will
     * still be associated with the stack after an <code>UpdateStack</code>
     * operation.
     * </p>
     * <p>
     * For more information about creating an update template, updating a
     * stack, and monitoring the progress of the update, see <a
     * om/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html">
     * Updating a Stack </a> .
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStack service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateStackResult> updateStackAsync(final UpdateStackRequest updateStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateStackResult>() {
            public UpdateStackResult call() throws Exception {
                return updateStack(updateStackRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Updates a stack as specified in the template. After the call completes
     * successfully, the stack update starts. You can check the status of the
     * stack via the DescribeStacks action.
     * </p>
     * <p>
     * </p>
     * <p>
     * <b>Note: </b> You cannot update <a
     * com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html">
     * AWS::S3::Bucket </a> resources, for example, to add or modify tags.
     * </p>
     * <p>
     * </p>
     * <p>
     * To get a copy of the template for an existing stack, you can use the
     * GetTemplate action.
     * </p>
     * <p>
     * Tags that were associated with this stack during creation time will
     * still be associated with the stack after an <code>UpdateStack</code>
     * operation.
     * </p>
     * <p>
     * For more information about creating an update template, updating a
     * stack, and monitoring the progress of the update, see <a
     * om/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html">
     * Updating a Stack </a> .
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStack service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateStackResult> updateStackAsync(
            final UpdateStackRequest updateStackRequest,
            final AsyncHandler<UpdateStackRequest, UpdateStackResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateStackResult>() {
            public UpdateStackResult call() throws Exception {
            	UpdateStackResult result;
                try {
            		result = updateStack(updateStackRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateStackRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns AWS resource descriptions for running and deleted stacks. If
     * <code>StackName</code> is specified, all the associated resources that
     * are part of the stack are returned. If <code>PhysicalResourceId</code>
     * is specified, the associated resources of the stack that the resource
     * belongs to are returned.
     * </p>
     * <p>
     * <b>NOTE:</b>Only the first 100 resources will be returned. If your
     * stack has more resources than this, you should use ListStackResources
     * instead.
     * </p>
     * <p>
     * For deleted stacks, <code>DescribeStackResources</code> returns
     * resource information for up to 90 days after the stack has been
     * deleted.
     * </p>
     * <p>
     * You must specify either <code>StackName</code> or
     * <code>PhysicalResourceId</code> , but not both. In addition, you can
     * specify <code>LogicalResourceId</code> to filter the returned result.
     * For more information about resources, the
     * <code>LogicalResourceId</code> and <code>PhysicalResourceId</code> ,
     * go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">
     * AWS CloudFormation User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b>A ValidationError is returned if you specify both
     * StackName and PhysicalResourceId in the same request.
     * </p>
     *
     * @param describeStackResourcesRequest Container for the necessary
     *           parameters to execute the DescribeStackResources operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackResources service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackResourcesResult> describeStackResourcesAsync(final DescribeStackResourcesRequest describeStackResourcesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStackResourcesResult>() {
            public DescribeStackResourcesResult call() throws Exception {
                return describeStackResources(describeStackResourcesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns AWS resource descriptions for running and deleted stacks. If
     * <code>StackName</code> is specified, all the associated resources that
     * are part of the stack are returned. If <code>PhysicalResourceId</code>
     * is specified, the associated resources of the stack that the resource
     * belongs to are returned.
     * </p>
     * <p>
     * <b>NOTE:</b>Only the first 100 resources will be returned. If your
     * stack has more resources than this, you should use ListStackResources
     * instead.
     * </p>
     * <p>
     * For deleted stacks, <code>DescribeStackResources</code> returns
     * resource information for up to 90 days after the stack has been
     * deleted.
     * </p>
     * <p>
     * You must specify either <code>StackName</code> or
     * <code>PhysicalResourceId</code> , but not both. In addition, you can
     * specify <code>LogicalResourceId</code> to filter the returned result.
     * For more information about resources, the
     * <code>LogicalResourceId</code> and <code>PhysicalResourceId</code> ,
     * go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">
     * AWS CloudFormation User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b>A ValidationError is returned if you specify both
     * StackName and PhysicalResourceId in the same request.
     * </p>
     *
     * @param describeStackResourcesRequest Container for the necessary
     *           parameters to execute the DescribeStackResources operation on
     *           AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackResources service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackResourcesResult> describeStackResourcesAsync(
            final DescribeStackResourcesRequest describeStackResourcesRequest,
            final AsyncHandler<DescribeStackResourcesRequest, DescribeStackResourcesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStackResourcesResult>() {
            public DescribeStackResourcesResult call() throws Exception {
            	DescribeStackResourcesResult result;
                try {
            		result = describeStackResources(describeStackResourcesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeStackResourcesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes a specified stack. Once the call completes successfully, stack
     * deletion starts. Deleted stacks do not show up in the DescribeStacks
     * API if the deletion has been completed successfully.
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteStack service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
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
     * Deletes a specified stack. Once the call completes successfully, stack
     * deletion starts. Deleted stacks do not show up in the DescribeStacks
     * API if the deletion has been completed successfully.
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteStack service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
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
     * Returns descriptions of all resources of the specified stack.
     * </p>
     * <p>
     * For deleted stacks, ListStackResources returns resource information
     * for up to 90 days after the stack has been deleted.
     * </p>
     *
     * @param listStackResourcesRequest Container for the necessary
     *           parameters to execute the ListStackResources operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         ListStackResources service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStackResourcesResult> listStackResourcesAsync(final ListStackResourcesRequest listStackResourcesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListStackResourcesResult>() {
            public ListStackResourcesResult call() throws Exception {
                return listStackResources(listStackResourcesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns descriptions of all resources of the specified stack.
     * </p>
     * <p>
     * For deleted stacks, ListStackResources returns resource information
     * for up to 90 days after the stack has been deleted.
     * </p>
     *
     * @param listStackResourcesRequest Container for the necessary
     *           parameters to execute the ListStackResources operation on
     *           AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListStackResources service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStackResourcesResult> listStackResourcesAsync(
            final ListStackResourcesRequest listStackResourcesRequest,
            final AsyncHandler<ListStackResourcesRequest, ListStackResourcesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListStackResourcesResult>() {
            public ListStackResourcesResult call() throws Exception {
            	ListStackResourcesResult result;
                try {
            		result = listStackResources(listStackResourcesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listStackResourcesRequest, result);
               	return result;
		    }
		});
    }
    
}
        
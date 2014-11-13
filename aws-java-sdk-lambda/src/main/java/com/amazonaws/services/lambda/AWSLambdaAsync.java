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
package com.amazonaws.services.lambda;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.lambda.model.*;

/**
 * Interface for accessing AWSLambda asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * AWS Lambda <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the AWS Lambda API Reference. The AWS Lambda Developer Guide
 * provides additional information. For the service overview, go to
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/welcome.html"> What is AWS Lambda </a> , and for information about how the service works, go to <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS LambdaL How it Works </a>
 * in the AWS Lambda Developer Guide.
 * </p>
 */
public interface AWSLambdaAsync extends AWSLambda {
    /**
     * <p>
     * Returns configuration information for the specified event source
     * mapping (see AddEventSource).
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetEventSource</code> action.
     * </p>
     *
     * @param getEventSourceRequest Container for the necessary parameters to
     *           execute the GetEventSource operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         GetEventSource service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetEventSourceResult> getEventSourceAsync(GetEventSourceRequest getEventSourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns configuration information for the specified event source
     * mapping (see AddEventSource).
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetEventSource</code> action.
     * </p>
     *
     * @param getEventSourceRequest Container for the necessary parameters to
     *           execute the GetEventSource operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetEventSource service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetEventSourceResult> getEventSourceAsync(GetEventSourceRequest getEventSourceRequest,
            AsyncHandler<GetEventSourceRequest, GetEventSourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified Lambda function code and configuration.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:DeleteFunction</code> action.
     * </p>
     *
     * @param deleteFunctionRequest Container for the necessary parameters to
     *           execute the DeleteFunction operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteFunctionAsync(DeleteFunctionRequest deleteFunctionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified Lambda function code and configuration.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:DeleteFunction</code> action.
     * </p>
     *
     * @param deleteFunctionRequest Container for the necessary parameters to
     *           execute the DeleteFunction operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteFunctionAsync(DeleteFunctionRequest deleteFunctionRequest,
            AsyncHandler<DeleteFunctionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of your Lambda functions. For each function, the
     * response includes the function configuration information. You must use
     * GetFunction to retrieve the code for your function.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListFunctions</code> action.
     * </p>
     *
     * @param listFunctionsRequest Container for the necessary parameters to
     *           execute the ListFunctions operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         ListFunctions service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest listFunctionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of your Lambda functions. For each function, the
     * response includes the function configuration information. You must use
     * GetFunction to retrieve the code for your function.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListFunctions</code> action.
     * </p>
     *
     * @param listFunctionsRequest Container for the necessary parameters to
     *           execute the ListFunctions operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListFunctions service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest listFunctionsRequest,
            AsyncHandler<ListFunctionsRequest, ListFunctionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Identifies an Amazon Kinesis stream as the event source for an AWS
     * Lambda function. AWS Lambda invokes the specified function when
     * records are posted to the stream.
     * </p>
     * <p>
     * This is the pull model, where AWS Lambda invokes the function. For
     * more information, go to
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS LambdaL How it Works </a>
     * in the AWS Lambda Developer Guide.
     * </p>
     * <p>
     * This association between an Amazon Kinesis stream and an AWS Lambda
     * function is called the event source mapping. You provide the
     * configuration information (for example, which stream to read from and
     * which AWS Lambda function to invoke) for the event source mapping in
     * the request body.
     * </p>
     * <p>
     * This operation requires permission for the <code>iam:PassRole</code>
     * action for the IAM role. It also requires permission for the
     * <code>lambda:AddEventSource</code> action.
     * </p>
     *
     * @param addEventSourceRequest Container for the necessary parameters to
     *           execute the AddEventSource operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         AddEventSource service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddEventSourceResult> addEventSourceAsync(AddEventSourceRequest addEventSourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Identifies an Amazon Kinesis stream as the event source for an AWS
     * Lambda function. AWS Lambda invokes the specified function when
     * records are posted to the stream.
     * </p>
     * <p>
     * This is the pull model, where AWS Lambda invokes the function. For
     * more information, go to
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS LambdaL How it Works </a>
     * in the AWS Lambda Developer Guide.
     * </p>
     * <p>
     * This association between an Amazon Kinesis stream and an AWS Lambda
     * function is called the event source mapping. You provide the
     * configuration information (for example, which stream to read from and
     * which AWS Lambda function to invoke) for the event source mapping in
     * the request body.
     * </p>
     * <p>
     * This operation requires permission for the <code>iam:PassRole</code>
     * action for the IAM role. It also requires permission for the
     * <code>lambda:AddEventSource</code> action.
     * </p>
     *
     * @param addEventSourceRequest Container for the necessary parameters to
     *           execute the AddEventSource operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddEventSource service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddEventSourceResult> addEventSourceAsync(AddEventSourceRequest addEventSourceRequest,
            AsyncHandler<AddEventSourceRequest, AddEventSourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Lambda function or updates an existing function. The
     * function metadata is created from the request parameters, and the code
     * for the function is provided by a .zip file in the request body. If
     * the function name already exists, the existing Lambda function is
     * updated with the new code and metadata.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UploadFunction</code> action.
     * </p>
     *
     * @param uploadFunctionRequest Container for the necessary parameters to
     *           execute the UploadFunction operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         UploadFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UploadFunctionResult> uploadFunctionAsync(UploadFunctionRequest uploadFunctionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Lambda function or updates an existing function. The
     * function metadata is created from the request parameters, and the code
     * for the function is provided by a .zip file in the request body. If
     * the function name already exists, the existing Lambda function is
     * updated with the new code and metadata.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UploadFunction</code> action.
     * </p>
     *
     * @param uploadFunctionRequest Container for the necessary parameters to
     *           execute the UploadFunction operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UploadFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UploadFunctionResult> uploadFunctionAsync(UploadFunctionRequest uploadFunctionRequest,
            AsyncHandler<UploadFunctionRequest, UploadFunctionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the configuration information of the Lambda function. This
     * the same information you provided as parameters when uploading the
     * function by using UploadFunction.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetFunctionConfiguration</code> operation.
     * </p>
     *
     * @param getFunctionConfigurationRequest Container for the necessary
     *           parameters to execute the GetFunctionConfiguration operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         GetFunctionConfiguration service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(GetFunctionConfigurationRequest getFunctionConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the configuration information of the Lambda function. This
     * the same information you provided as parameters when uploading the
     * function by using UploadFunction.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetFunctionConfiguration</code> operation.
     * </p>
     *
     * @param getFunctionConfigurationRequest Container for the necessary
     *           parameters to execute the GetFunctionConfiguration operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetFunctionConfiguration service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(GetFunctionConfigurationRequest getFunctionConfigurationRequest,
            AsyncHandler<GetFunctionConfigurationRequest, GetFunctionConfigurationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Submits an invocation request to AWS Lambda. Upon receiving the
     * request, Lambda executes the specified function asynchronously. To see
     * the logs generated by the Lambda function execution, see the
     * CloudWatch logs console.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeAsync</code> action.
     * </p>
     *
     * @param invokeAsyncRequest Container for the necessary parameters to
     *           execute the InvokeAsync operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         InvokeAsync service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<InvokeAsyncResult> invokeAsyncAsync(InvokeAsyncRequest invokeAsyncRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Submits an invocation request to AWS Lambda. Upon receiving the
     * request, Lambda executes the specified function asynchronously. To see
     * the logs generated by the Lambda function execution, see the
     * CloudWatch logs console.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeAsync</code> action.
     * </p>
     *
     * @param invokeAsyncRequest Container for the necessary parameters to
     *           execute the InvokeAsync operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         InvokeAsync service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<InvokeAsyncResult> invokeAsyncAsync(InvokeAsyncRequest invokeAsyncRequest,
            AsyncHandler<InvokeAsyncRequest, InvokeAsyncResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of event source mappings. For each mapping, the API
     * returns configuration information (see AddEventSource). You can
     * optionally specify filters to retrieve specific event source mappings.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListEventSources</code> action.
     * </p>
     *
     * @param listEventSourcesRequest Container for the necessary parameters
     *           to execute the ListEventSources operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         ListEventSources service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListEventSourcesResult> listEventSourcesAsync(ListEventSourcesRequest listEventSourcesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of event source mappings. For each mapping, the API
     * returns configuration information (see AddEventSource). You can
     * optionally specify filters to retrieve specific event source mappings.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListEventSources</code> action.
     * </p>
     *
     * @param listEventSourcesRequest Container for the necessary parameters
     *           to execute the ListEventSources operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListEventSources service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListEventSourcesResult> listEventSourcesAsync(ListEventSourcesRequest listEventSourcesRequest,
            AsyncHandler<ListEventSourcesRequest, ListEventSourcesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the configuration information of the Lambda function and a
     * presigned URL link to the .zip file you uploaded with UploadFunction
     * so you can download the .zip file. Note that the URL is valid for up
     * to 10 minutes. The configuration information is the same information
     * you provided as parameters when uploading the function.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetFunction</code> action.
     * </p>
     *
     * @param getFunctionRequest Container for the necessary parameters to
     *           execute the GetFunction operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         GetFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest getFunctionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the configuration information of the Lambda function and a
     * presigned URL link to the .zip file you uploaded with UploadFunction
     * so you can download the .zip file. Note that the URL is valid for up
     * to 10 minutes. The configuration information is the same information
     * you provided as parameters when uploading the function.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetFunction</code> action.
     * </p>
     *
     * @param getFunctionRequest Container for the necessary parameters to
     *           execute the GetFunction operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest getFunctionRequest,
            AsyncHandler<GetFunctionRequest, GetFunctionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the configuration parameters for the specified Lambda
     * function by using the values provided in the request. You provide only
     * the parameters you want to change. This operation must only be used on
     * an existing Lambda function and cannot be used to update the
     * function's code.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateFunctionConfiguration</code> action.
     * </p>
     *
     * @param updateFunctionConfigurationRequest Container for the necessary
     *           parameters to execute the UpdateFunctionConfiguration operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateFunctionConfiguration service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the configuration parameters for the specified Lambda
     * function by using the values provided in the request. You provide only
     * the parameters you want to change. This operation must only be used on
     * an existing Lambda function and cannot be used to update the
     * function's code.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateFunctionConfiguration</code> action.
     * </p>
     *
     * @param updateFunctionConfigurationRequest Container for the necessary
     *           parameters to execute the UpdateFunctionConfiguration operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateFunctionConfiguration service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest,
            AsyncHandler<UpdateFunctionConfigurationRequest, UpdateFunctionConfigurationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes an event source mapping. This means AWS Lambda will no longer
     * invoke the function for events in the associated source.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:RemoveEventSource</code> action.
     * </p>
     *
     * @param removeEventSourceRequest Container for the necessary parameters
     *           to execute the RemoveEventSource operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveEventSource service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> removeEventSourceAsync(RemoveEventSourceRequest removeEventSourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes an event source mapping. This means AWS Lambda will no longer
     * invoke the function for events in the associated source.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:RemoveEventSource</code> action.
     * </p>
     *
     * @param removeEventSourceRequest Container for the necessary parameters
     *           to execute the RemoveEventSource operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveEventSource service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> removeEventSourceAsync(RemoveEventSourceRequest removeEventSourceRequest,
            AsyncHandler<RemoveEventSourceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        
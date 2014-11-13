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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.lambda.model.*;

/**
 * Interface for accessing AWSLambda.
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
public interface AWSLambda {

    /**
     * Overrides the default endpoint for this client ("https://lambda.us-east-1.amazonaws.com/").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "lambda.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "https://lambda.us-east-1.amazonaws.com/"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "lambda.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "https://lambda.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSLambda#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
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
     *           execute the GetEventSource service method on AWSLambda.
     * 
     * @return The response from the GetEventSource service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetEventSourceResult getEventSource(GetEventSourceRequest getEventSourceRequest) 
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
     *           execute the DeleteFunction service method on AWSLambda.
     * 
     * 
     * @throws ServiceException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteFunction(DeleteFunctionRequest deleteFunctionRequest) 
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
     *           execute the ListFunctions service method on AWSLambda.
     * 
     * @return The response from the ListFunctions service method, as
     *         returned by AWSLambda.
     * 
     * @throws ServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListFunctionsResult listFunctions(ListFunctionsRequest listFunctionsRequest) 
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
     *           execute the AddEventSource service method on AWSLambda.
     * 
     * @return The response from the AddEventSource service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddEventSourceResult addEventSource(AddEventSourceRequest addEventSourceRequest) 
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
     *           execute the UploadFunction service method on AWSLambda.
     * 
     * @return The response from the UploadFunction service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UploadFunctionResult uploadFunction(UploadFunctionRequest uploadFunctionRequest) 
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
     *           parameters to execute the GetFunctionConfiguration service method on
     *           AWSLambda.
     * 
     * @return The response from the GetFunctionConfiguration service method,
     *         as returned by AWSLambda.
     * 
     * @throws ServiceException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetFunctionConfigurationResult getFunctionConfiguration(GetFunctionConfigurationRequest getFunctionConfigurationRequest) 
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
     *           execute the InvokeAsync service method on AWSLambda.
     * 
     * @return The response from the InvokeAsync service method, as returned
     *         by AWSLambda.
     * 
     * @throws InvalidRequestContentException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public InvokeAsyncResult invokeAsync(InvokeAsyncRequest invokeAsyncRequest) 
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
     *           to execute the ListEventSources service method on AWSLambda.
     * 
     * @return The response from the ListEventSources service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListEventSourcesResult listEventSources(ListEventSourcesRequest listEventSourcesRequest) 
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
     *           execute the GetFunction service method on AWSLambda.
     * 
     * @return The response from the GetFunction service method, as returned
     *         by AWSLambda.
     * 
     * @throws ServiceException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetFunctionResult getFunction(GetFunctionRequest getFunctionRequest) 
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
     *           parameters to execute the UpdateFunctionConfiguration service method
     *           on AWSLambda.
     * 
     * @return The response from the UpdateFunctionConfiguration service
     *         method, as returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateFunctionConfigurationResult updateFunctionConfiguration(UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest) 
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
     *           to execute the RemoveEventSource service method on AWSLambda.
     * 
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void removeEventSource(RemoveEventSourceRequest removeEventSourceRequest) 
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
     * @return The response from the ListFunctions service method, as
     *         returned by AWSLambda.
     * 
     * @throws ServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListFunctionsResult listFunctions() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the ListEventSources service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListEventSourcesResult listEventSources() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        
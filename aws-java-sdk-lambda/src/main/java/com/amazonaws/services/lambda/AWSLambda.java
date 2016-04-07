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
 * This is the <i>AWS Lambda API Reference</i> .
 * The AWS Lambda Developer Guide provides additional information.
 * For the service overview, go to
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/welcome.html"> What is AWS Lambda </a> , and for information about how the service works, go to <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS Lambda: How it Works </a>
 * in the <i>AWS Lambda Developer Guide</i> .
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
     * Using this API you can update the function version to which the alias
     * points and the alias description. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * This requires permission for the lambda:UpdateAlias action.
     * </p>
     *
     * @param updateAliasRequest Container for the necessary parameters to
     *           execute the UpdateAlias service method on AWSLambda.
     * 
     * @return The response from the UpdateAlias service method, as returned
     *         by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateAliasResult updateAlias(UpdateAliasRequest updateAliasRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified Lambda function code and configuration.
     * </p>
     * <p>
     * If you are using the versioning feature and you don't specify a
     * function version in your <code>DeleteFunction</code> request, AWS
     * Lambda will delete the function, including all its versions, and any
     * aliases pointing to the function versions. To delete a specific
     * function version, you must provide the function version via the
     * <code>Qualifier</code> parameter. For information about function
     * versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * When you delete a function the associated resource policy is also
     * deleted. You will need to delete the event source mappings explicitly.
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
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws ResourceConflictException
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
     * Adds a permission to the resource policy associated with the
     * specified AWS Lambda function. You use resource policies to grant
     * permissions to event sources that use <i>push</i> model. In a
     * <i>push</i> model, event sources (such as Amazon S3 and custom
     * applications) invoke your Lambda function. Each permission you add to
     * the resource policy allows an event source, permission to invoke the
     * Lambda function.
     * </p>
     * <p>
     * For information about the push model, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS Lambda: How it Works </a>
     * .
     * </p>
     * <p>
     * If you are using versioning, the permissions you add are specific to
     * the Lambda function version or alias you specify in the
     * <code>AddPermission</code> request via the <code>Qualifier</code>
     * parameter. For more information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:AddPermission</code> action.
     * </p>
     *
     * @param addPermissionRequest Container for the necessary parameters to
     *           execute the AddPermission service method on AWSLambda.
     * 
     * @return The response from the AddPermission service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws PolicyLengthExceededException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddPermissionResult addPermission(AddPermissionRequest addPermissionRequest) 
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
     * <p>
     * If you are using versioning feature, the response returns list of
     * $LATEST versions of your functions. For information about the
     * versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     *
     * @param listFunctionsRequest Container for the necessary parameters to
     *           execute the ListFunctions service method on AWSLambda.
     * 
     * @return The response from the ListFunctions service method, as
     *         returned by AWSLambda.
     * 
     * @throws ServiceException
     * @throws TooManyRequestsException
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
     * Returns the specified alias information such as the alias ARN,
     * description, and function version it is pointing to. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * This requires permission for the <code>lambda:GetAlias</code> action.
     * </p>
     *
     * @param getAliasRequest Container for the necessary parameters to
     *           execute the GetAlias service method on AWSLambda.
     * 
     * @return The response from the GetAlias service method, as returned by
     *         AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetAliasResult getAlias(GetAliasRequest getAliasRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * You can remove individual permissions from an resource policy
     * associated with a Lambda function by providing a statement ID that you
     * provided when you added the permission.
     * </p>
     * <p>
     * If you are using versioning, the permissions you remove are specific
     * to the Lambda function version or alias you specify in the
     * <code>AddPermission</code> request via the <code>Qualifier</code>
     * parameter. For more information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * Note that removal of a permission will cause an active event source
     * to lose permission to the function.
     * </p>
     * <p>
     * You need permission for the <code>lambda:RemovePermission</code>
     * action.
     * </p>
     *
     * @param removePermissionRequest Container for the necessary parameters
     *           to execute the RemovePermission service method on AWSLambda.
     * 
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void removePermission(RemovePermissionRequest removePermissionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Lambda function. The function metadata is created from
     * the request parameters, and the code for the function is provided by a
     * .zip file in the request body. If the function name already exists,
     * the operation will fail. Note that the function name is
     * case-sensitive.
     * </p>
     * <p>
     * If you are using versioning, you can also publish a version of the
     * Lambda function you are creating using the <code>Publish</code>
     * parameter. For more information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:CreateFunction</code> action.
     * </p>
     *
     * @param createFunctionRequest Container for the necessary parameters to
     *           execute the CreateFunction service method on AWSLambda.
     * 
     * @return The response from the CreateFunction service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws CodeStorageExceededException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateFunctionResult createFunction(CreateFunctionRequest createFunctionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * You can update an event source mapping. This is useful if you want to
     * change the parameters of the existing mapping without losing your
     * position in the stream. You can change which function will receive the
     * stream records, but to change the stream itself, you must create a new
     * mapping.
     * </p>
     * <p>
     * If you are using the versioning feature, you can update the event
     * source mapping to map to a specific Lambda function version or alias
     * as described in the <code>FunctionName</code> parameter. For
     * information about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * If you disable the event source mapping, AWS Lambda stops polling. If
     * you enable again, it will resume polling from the time it had stopped
     * polling, so you don't lose processing of any records. However, if you
     * delete event source mapping and create it again, it will reset.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateEventSourceMapping</code> action.
     * </p>
     *
     * @param updateEventSourceMappingRequest Container for the necessary
     *           parameters to execute the UpdateEventSourceMapping service method on
     *           AWSLambda.
     * 
     * @return The response from the UpdateEventSourceMapping service method,
     *         as returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws ResourceConflictException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateEventSourceMappingResult updateEventSourceMapping(UpdateEventSourceMappingRequest updateEventSourceMappingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Publishes a version of your function from the current snapshot of
     * $LATEST. That is, AWS Lambda takes a snapshot of the function code and
     * configuration information from $LATEST and publishes a new version.
     * The code and configuration cannot be modified after publication. For
     * information about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     *
     * @param publishVersionRequest Container for the necessary parameters to
     *           execute the PublishVersion service method on AWSLambda.
     * 
     * @return The response from the PublishVersion service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws CodeStorageExceededException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PublishVersionResult publishVersion(PublishVersionRequest publishVersionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <b>IMPORTANT:</b>This API is deprecated. We recommend you use Invoke
     * API (see Invoke).
     * </p>
     * <p>
     * Submits an invocation request to AWS Lambda. Upon receiving the
     * request, Lambda executes the specified function asynchronously. To see
     * the logs generated by the Lambda function execution, see the
     * CloudWatch Logs console.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeFunction</code> action.
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
    @Deprecated
    public InvokeAsyncResult invokeAsync(InvokeAsyncRequest invokeAsyncRequest) 
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
     * If you are using the versioning feature, note this API will always
     * update the $LATEST version of your Lambda function. For information
     * about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
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
     * @throws TooManyRequestsException
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
     * Invokes a specific Lambda function.
     * </p>
     * <p>
     * If you are using the versioning feature, you can invoke the specific
     * function version by providing function version or alias name that is
     * pointing to the function version using the <code>Qualifier</code>
     * parameter in the request. If you don't provide the
     * <code>Qualifier</code> parameter, the <code>$LATEST</code> version of
     * the Lambda function is invoked. For information about the versioning
     * feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeFunction</code> action.
     * </p>
     *
     * @param invokeRequest Container for the necessary parameters to execute
     *           the Invoke service method on AWSLambda.
     * 
     * @return The response from the Invoke service method, as returned by
     *         AWSLambda.
     * 
     * @throws InvalidRequestContentException
     * @throws InvalidSubnetIDException
     * @throws InvalidParameterValueException
     * @throws InvalidSecurityGroupIDException
     * @throws ServiceException
     * @throws RequestTooLargeException
     * @throws SubnetIPAddressLimitReachedException
     * @throws EC2ThrottledException
     * @throws ResourceNotFoundException
     * @throws EC2AccessDeniedException
     * @throws UnsupportedMediaTypeException
     * @throws EC2UnexpectedException
     * @throws TooManyRequestsException
     * @throws ENILimitReachedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public InvokeResult invoke(InvokeRequest invokeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the resource policy associated with the specified Lambda
     * function.
     * </p>
     * <p>
     * If you are using the versioning feature, you can get the resource
     * policy associated with the specific Lambda function version or alias
     * by specifying the version or alias name using the
     * <code>Qualifier</code> parameter. For more information about
     * versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * For information about adding permissions, see AddPermission.
     * </p>
     * <p>
     * You need permission for the <code>lambda:GetPolicy action.</code>
     * </p>
     *
     * @param getPolicyRequest Container for the necessary parameters to
     *           execute the GetPolicy service method on AWSLambda.
     * 
     * @return The response from the GetPolicy service method, as returned by
     *         AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns configuration information for the specified event source
     * mapping (see CreateEventSourceMapping).
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetEventSourceMapping</code> action.
     * </p>
     *
     * @param getEventSourceMappingRequest Container for the necessary
     *           parameters to execute the GetEventSourceMapping service method on
     *           AWSLambda.
     * 
     * @return The response from the GetEventSourceMapping service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetEventSourceMappingResult getEventSourceMapping(GetEventSourceMappingRequest getEventSourceMappingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of event source mappings you created using the
     * <code>CreateEventSourceMapping</code> (see CreateEventSourceMapping).
     * </p>
     * <p>
     * For each mapping, the API returns configuration information. You can
     * optionally specify filters to retrieve specific event source mappings.
     * </p>
     * <p>
     * If you are using the versioning feature, you can get list of event
     * source mappings for a specific Lambda function version or an alias as
     * described in the <code>FunctionName</code> parameter. For information
     * about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListEventSourceMappings</code> action.
     * </p>
     *
     * @param listEventSourceMappingsRequest Container for the necessary
     *           parameters to execute the ListEventSourceMappings service method on
     *           AWSLambda.
     * 
     * @return The response from the ListEventSourceMappings service method,
     *         as returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListEventSourceMappingsResult listEventSourceMappings(ListEventSourceMappingsRequest listEventSourceMappingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified Lambda function alias. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * This requires permission for the lambda:DeleteAlias action.
     * </p>
     *
     * @param deleteAliasRequest Container for the necessary parameters to
     *           execute the DeleteAlias service method on AWSLambda.
     * 
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteAlias(DeleteAliasRequest deleteAliasRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the configuration information of the Lambda function. This
     * the same information you provided as parameters when uploading the
     * function by using CreateFunction.
     * </p>
     * <p>
     * If you are using the versioning feature, you can retrieve this
     * information for a specific function version by using the optional
     * <code>Qualifier</code> parameter and specifying the function version
     * or alias that points to it. If you don't provide it, the API returns
     * information about the $LATEST version of the function. For more
     * information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
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
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
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
     * Removes an event source mapping. This means AWS Lambda will no longer
     * invoke the function for events in the associated source.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:DeleteEventSourceMapping</code> action.
     * </p>
     *
     * @param deleteEventSourceMappingRequest Container for the necessary
     *           parameters to execute the DeleteEventSourceMapping service method on
     *           AWSLambda.
     * 
     * @return The response from the DeleteEventSourceMapping service method,
     *         as returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteEventSourceMappingResult deleteEventSourceMapping(DeleteEventSourceMappingRequest deleteEventSourceMappingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Identifies a stream as an event source for a Lambda function. It can
     * be either an Amazon Kinesis stream or an Amazon DynamoDB stream. AWS
     * Lambda invokes the specified function when records are posted to the
     * stream.
     * </p>
     * <p>
     * This association between a stream source and a Lambda function is
     * called the event source mapping.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>This event source mapping is relevant only in the
     * AWS Lambda pull model, where AWS Lambda invokes the function. For more
     * information, go to AWS Lambda: How it Works in the AWS Lambda
     * Developer Guide.
     * </p>
     * <p>
     * You provide mapping information (for example, which stream to read
     * from and which Lambda function to invoke) in the request body.
     * </p>
     * <p>
     * Each event source, such as an Amazon Kinesis or a DynamoDB stream,
     * can be associated with multiple AWS Lambda function. A given Lambda
     * function can be associated with multiple AWS event sources.
     * </p>
     * <p>
     * <p>
     * If you are using versioning, you can specify a specific function
     * version or an alias via the function name parameter. For more
     * information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * 
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:CreateEventSourceMapping</code> action.
     * </p>
     *
     * @param createEventSourceMappingRequest Container for the necessary
     *           parameters to execute the CreateEventSourceMapping service method on
     *           AWSLambda.
     * 
     * @return The response from the CreateEventSourceMapping service method,
     *         as returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateEventSourceMappingResult createEventSourceMapping(CreateEventSourceMappingRequest createEventSourceMappingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the code for the specified Lambda function. This operation
     * must only be used on an existing Lambda function and cannot be used to
     * update the function configuration.
     * </p>
     * <p>
     * If you are using the versioning feature, note this API will always
     * update the $LATEST version of your Lambda function. For information
     * about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateFunctionCode</code> action.
     * </p>
     *
     * @param updateFunctionCodeRequest Container for the necessary
     *           parameters to execute the UpdateFunctionCode service method on
     *           AWSLambda.
     * 
     * @return The response from the UpdateFunctionCode service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws CodeStorageExceededException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateFunctionCodeResult updateFunctionCode(UpdateFunctionCodeRequest updateFunctionCodeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns list of aliases created for a Lambda function. For each
     * alias, the response includes information such as the alias ARN,
     * description, alias name, and the function version to which it points.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * This requires permission for the lambda:ListAliases action.
     * </p>
     *
     * @param listAliasesRequest Container for the necessary parameters to
     *           execute the ListAliases service method on AWSLambda.
     * 
     * @return The response from the ListAliases service method, as returned
     *         by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAliasesResult listAliases(ListAliasesRequest listAliasesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List all versions of a function. For information about the versioning
     * feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     *
     * @param listVersionsByFunctionRequest Container for the necessary
     *           parameters to execute the ListVersionsByFunction service method on
     *           AWSLambda.
     * 
     * @return The response from the ListVersionsByFunction service method,
     *         as returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListVersionsByFunctionResult listVersionsByFunction(ListVersionsByFunctionRequest listVersionsByFunctionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the configuration information of the Lambda function and a
     * presigned URL link to the .zip file you uploaded with CreateFunction
     * so you can download the .zip file. Note that the URL is valid for up
     * to 10 minutes. The configuration information is the same information
     * you provided as parameters when uploading the function.
     * </p>
     * <p>
     * Using the optional <code>Qualifier</code> parameter, you can specify
     * a specific function version for which you want this information. If
     * you don't specify this parameter, the API uses unqualified function
     * ARN which return information about the <code>$LATEST</code> version of
     * the Lambda function. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
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
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
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
     * Creates an alias that points to the specified Lambda function
     * version. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * Alias names are unique for a given function.
     * </p>
     * <p>
     * This requires permission for the lambda:CreateAlias action.
     * </p>
     *
     * @param createAliasRequest Container for the necessary parameters to
     *           execute the CreateAlias service method on AWSLambda.
     * 
     * @return The response from the CreateAlias service method, as returned
     *         by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAliasResult createAlias(CreateAliasRequest createAliasRequest) 
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
     * <p>
     * If you are using versioning feature, the response returns list of
     * $LATEST versions of your functions. For information about the
     * versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * 
     * @return The response from the ListFunctions service method, as
     *         returned by AWSLambda.
     * 
     * @throws ServiceException
     * @throws TooManyRequestsException
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
     * Returns a list of event source mappings you created using the
     * <code>CreateEventSourceMapping</code> (see CreateEventSourceMapping).
     * </p>
     * <p>
     * For each mapping, the API returns configuration information. You can
     * optionally specify filters to retrieve specific event source mappings.
     * </p>
     * <p>
     * If you are using the versioning feature, you can get list of event
     * source mappings for a specific Lambda function version or an alias as
     * described in the <code>FunctionName</code> parameter. For information
     * about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListEventSourceMappings</code> action.
     * </p>
     * 
     * @return The response from the ListEventSourceMappings service method,
     *         as returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListEventSourceMappingsResult listEventSourceMappings() throws AmazonServiceException, AmazonClientException;
    
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
        
/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lambda;

import com.amazonaws.services.lambda.model.*;

/**
 * Interface for accessing AWS Lambda asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lambda.AbstractAWSLambdaAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Lambda</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the <i>AWS Lambda API Reference</i>. The AWS Lambda Developer Guide provides additional information. For the
 * service overview, go to <a href="http://docs.aws.amazon.com/lambda/latest/dg/welcome.html">What is AWS Lambda</a>,
 * and for information about how the service works, go to <a
 * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a> in the
 * <i>AWS Lambda Developer Guide</i>.
 * </p>
 */
public interface AWSLambdaAsync extends AWSLambda {

    /**
     * <p>
     * Adds a permission to the resource policy associated with the specified AWS Lambda function. You use resource
     * policies to grant permissions to event sources that use <i>push</i> model. In a <i>push</i> model, event sources
     * (such as Amazon S3 and custom applications) invoke your Lambda function. Each permission you add to the resource
     * policy allows an event source, permission to invoke the Lambda function.
     * </p>
     * <p>
     * For information about the push model, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a>.
     * </p>
     * <p>
     * If you are using versioning, the permissions you add are specific to the Lambda function version or alias you
     * specify in the <code>AddPermission</code> request via the <code>Qualifier</code> parameter. For more information
     * about versioning, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda
     * Function Versioning and Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:AddPermission</code> action.
     * </p>
     * 
     * @param addPermissionRequest
     * @return A Java Future containing the result of the AddPermission operation returned by the service.
     * @sample AWSLambdaAsync.AddPermission
     */
    java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest addPermissionRequest);

    /**
     * <p>
     * Adds a permission to the resource policy associated with the specified AWS Lambda function. You use resource
     * policies to grant permissions to event sources that use <i>push</i> model. In a <i>push</i> model, event sources
     * (such as Amazon S3 and custom applications) invoke your Lambda function. Each permission you add to the resource
     * policy allows an event source, permission to invoke the Lambda function.
     * </p>
     * <p>
     * For information about the push model, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a>.
     * </p>
     * <p>
     * If you are using versioning, the permissions you add are specific to the Lambda function version or alias you
     * specify in the <code>AddPermission</code> request via the <code>Qualifier</code> parameter. For more information
     * about versioning, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda
     * Function Versioning and Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:AddPermission</code> action.
     * </p>
     * 
     * @param addPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddPermission operation returned by the service.
     * @sample AWSLambdaAsyncHandler.AddPermission
     */
    java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest addPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler);

    /**
     * <p>
     * Creates an alias that points to the specified Lambda function version. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * <p>
     * Alias names are unique for a given function. This requires permission for the lambda:CreateAlias action.
     * </p>
     * 
     * @param createAliasRequest
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AWSLambdaAsync.CreateAlias
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Creates an alias that points to the specified Lambda function version. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * <p>
     * Alias names are unique for a given function. This requires permission for the lambda:CreateAlias action.
     * </p>
     * 
     * @param createAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AWSLambdaAsyncHandler.CreateAlias
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler);

    /**
     * <p>
     * Identifies a stream as an event source for a Lambda function. It can be either an Amazon Kinesis stream or an
     * Amazon DynamoDB stream. AWS Lambda invokes the specified function when records are posted to the stream.
     * </p>
     * <p>
     * This association between a stream source and a Lambda function is called the event source mapping.
     * </p>
     * <important>
     * <p>
     * This event source mapping is relevant only in the AWS Lambda pull model, where AWS Lambda invokes the function.
     * For more information, go to <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS
     * Lambda: How it Works</a> in the <i>AWS Lambda Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * You provide mapping information (for example, which stream to read from and which Lambda function to invoke) in
     * the request body.
     * </p>
     * <p>
     * Each event source, such as an Amazon Kinesis or a DynamoDB stream, can be associated with multiple AWS Lambda
     * function. A given Lambda function can be associated with multiple AWS event sources.
     * </p>
     * <p>
     * If you are using versioning, you can specify a specific function version or an alias via the function name
     * parameter. For more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:CreateEventSourceMapping</code> action.
     * </p>
     * 
     * @param createEventSourceMappingRequest
     * @return A Java Future containing the result of the CreateEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsync.CreateEventSourceMapping
     */
    java.util.concurrent.Future<CreateEventSourceMappingResult> createEventSourceMappingAsync(CreateEventSourceMappingRequest createEventSourceMappingRequest);

    /**
     * <p>
     * Identifies a stream as an event source for a Lambda function. It can be either an Amazon Kinesis stream or an
     * Amazon DynamoDB stream. AWS Lambda invokes the specified function when records are posted to the stream.
     * </p>
     * <p>
     * This association between a stream source and a Lambda function is called the event source mapping.
     * </p>
     * <important>
     * <p>
     * This event source mapping is relevant only in the AWS Lambda pull model, where AWS Lambda invokes the function.
     * For more information, go to <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS
     * Lambda: How it Works</a> in the <i>AWS Lambda Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * You provide mapping information (for example, which stream to read from and which Lambda function to invoke) in
     * the request body.
     * </p>
     * <p>
     * Each event source, such as an Amazon Kinesis or a DynamoDB stream, can be associated with multiple AWS Lambda
     * function. A given Lambda function can be associated with multiple AWS event sources.
     * </p>
     * <p>
     * If you are using versioning, you can specify a specific function version or an alias via the function name
     * parameter. For more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:CreateEventSourceMapping</code> action.
     * </p>
     * 
     * @param createEventSourceMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsyncHandler.CreateEventSourceMapping
     */
    java.util.concurrent.Future<CreateEventSourceMappingResult> createEventSourceMappingAsync(CreateEventSourceMappingRequest createEventSourceMappingRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEventSourceMappingRequest, CreateEventSourceMappingResult> asyncHandler);

    /**
     * <p>
     * Creates a new Lambda function. The function metadata is created from the request parameters, and the code for the
     * function is provided by a .zip file in the request body. If the function name already exists, the operation will
     * fail. Note that the function name is case-sensitive.
     * </p>
     * <p>
     * If you are using versioning, you can also publish a version of the Lambda function you are creating using the
     * <code>Publish</code> parameter. For more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:CreateFunction</code> action.
     * </p>
     * 
     * @param createFunctionRequest
     * @return A Java Future containing the result of the CreateFunction operation returned by the service.
     * @sample AWSLambdaAsync.CreateFunction
     */
    java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(CreateFunctionRequest createFunctionRequest);

    /**
     * <p>
     * Creates a new Lambda function. The function metadata is created from the request parameters, and the code for the
     * function is provided by a .zip file in the request body. If the function name already exists, the operation will
     * fail. Note that the function name is case-sensitive.
     * </p>
     * <p>
     * If you are using versioning, you can also publish a version of the Lambda function you are creating using the
     * <code>Publish</code> parameter. For more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:CreateFunction</code> action.
     * </p>
     * 
     * @param createFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFunction operation returned by the service.
     * @sample AWSLambdaAsyncHandler.CreateFunction
     */
    java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(CreateFunctionRequest createFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFunctionRequest, CreateFunctionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Lambda function alias. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * <p>
     * This requires permission for the lambda:DeleteAlias action.
     * </p>
     * 
     * @param deleteAliasRequest
     * @return A Java Future containing the result of the DeleteAlias operation returned by the service.
     * @sample AWSLambdaAsync.DeleteAlias
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Deletes the specified Lambda function alias. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * <p>
     * This requires permission for the lambda:DeleteAlias action.
     * </p>
     * 
     * @param deleteAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlias operation returned by the service.
     * @sample AWSLambdaAsyncHandler.DeleteAlias
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler);

    /**
     * <p>
     * Removes an event source mapping. This means AWS Lambda will no longer invoke the function for events in the
     * associated source.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:DeleteEventSourceMapping</code> action.
     * </p>
     * 
     * @param deleteEventSourceMappingRequest
     * @return A Java Future containing the result of the DeleteEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsync.DeleteEventSourceMapping
     */
    java.util.concurrent.Future<DeleteEventSourceMappingResult> deleteEventSourceMappingAsync(DeleteEventSourceMappingRequest deleteEventSourceMappingRequest);

    /**
     * <p>
     * Removes an event source mapping. This means AWS Lambda will no longer invoke the function for events in the
     * associated source.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:DeleteEventSourceMapping</code> action.
     * </p>
     * 
     * @param deleteEventSourceMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsyncHandler.DeleteEventSourceMapping
     */
    java.util.concurrent.Future<DeleteEventSourceMappingResult> deleteEventSourceMappingAsync(DeleteEventSourceMappingRequest deleteEventSourceMappingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventSourceMappingRequest, DeleteEventSourceMappingResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Lambda function code and configuration.
     * </p>
     * <p>
     * If you are using the versioning feature and you don't specify a function version in your
     * <code>DeleteFunction</code> request, AWS Lambda will delete the function, including all its versions, and any
     * aliases pointing to the function versions. To delete a specific function version, you must provide the function
     * version via the <code>Qualifier</code> parameter. For information about function versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * When you delete a function the associated resource policy is also deleted. You will need to delete the event
     * source mappings explicitly.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:DeleteFunction</code> action.
     * </p>
     * 
     * @param deleteFunctionRequest
     * @return A Java Future containing the result of the DeleteFunction operation returned by the service.
     * @sample AWSLambdaAsync.DeleteFunction
     */
    java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(DeleteFunctionRequest deleteFunctionRequest);

    /**
     * <p>
     * Deletes the specified Lambda function code and configuration.
     * </p>
     * <p>
     * If you are using the versioning feature and you don't specify a function version in your
     * <code>DeleteFunction</code> request, AWS Lambda will delete the function, including all its versions, and any
     * aliases pointing to the function versions. To delete a specific function version, you must provide the function
     * version via the <code>Qualifier</code> parameter. For information about function versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * When you delete a function the associated resource policy is also deleted. You will need to delete the event
     * source mappings explicitly.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:DeleteFunction</code> action.
     * </p>
     * 
     * @param deleteFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFunction operation returned by the service.
     * @sample AWSLambdaAsyncHandler.DeleteFunction
     */
    java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(DeleteFunctionRequest deleteFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFunctionRequest, DeleteFunctionResult> asyncHandler);

    /**
     * <p>
     * Returns the specified alias information such as the alias ARN, description, and function version it is pointing
     * to. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * <p>
     * This requires permission for the <code>lambda:GetAlias</code> action.
     * </p>
     * 
     * @param getAliasRequest
     * @return A Java Future containing the result of the GetAlias operation returned by the service.
     * @sample AWSLambdaAsync.GetAlias
     */
    java.util.concurrent.Future<GetAliasResult> getAliasAsync(GetAliasRequest getAliasRequest);

    /**
     * <p>
     * Returns the specified alias information such as the alias ARN, description, and function version it is pointing
     * to. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * <p>
     * This requires permission for the <code>lambda:GetAlias</code> action.
     * </p>
     * 
     * @param getAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAlias operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetAlias
     */
    java.util.concurrent.Future<GetAliasResult> getAliasAsync(GetAliasRequest getAliasRequest,
            com.amazonaws.handlers.AsyncHandler<GetAliasRequest, GetAliasResult> asyncHandler);

    /**
     * <p>
     * Returns configuration information for the specified event source mapping (see <a>CreateEventSourceMapping</a>).
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:GetEventSourceMapping</code> action.
     * </p>
     * 
     * @param getEventSourceMappingRequest
     * @return A Java Future containing the result of the GetEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsync.GetEventSourceMapping
     */
    java.util.concurrent.Future<GetEventSourceMappingResult> getEventSourceMappingAsync(GetEventSourceMappingRequest getEventSourceMappingRequest);

    /**
     * <p>
     * Returns configuration information for the specified event source mapping (see <a>CreateEventSourceMapping</a>).
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:GetEventSourceMapping</code> action.
     * </p>
     * 
     * @param getEventSourceMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetEventSourceMapping
     */
    java.util.concurrent.Future<GetEventSourceMappingResult> getEventSourceMappingAsync(GetEventSourceMappingRequest getEventSourceMappingRequest,
            com.amazonaws.handlers.AsyncHandler<GetEventSourceMappingRequest, GetEventSourceMappingResult> asyncHandler);

    /**
     * <p>
     * Returns the configuration information of the Lambda function and a presigned URL link to the .zip file you
     * uploaded with <a>CreateFunction</a> so you can download the .zip file. Note that the URL is valid for up to 10
     * minutes. The configuration information is the same information you provided as parameters when uploading the
     * function.
     * </p>
     * <p>
     * Using the optional <code>Qualifier</code> parameter, you can specify a specific function version for which you
     * want this information. If you don't specify this parameter, the API uses unqualified function ARN which return
     * information about the <code>$LATEST</code> version of the Lambda function. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:GetFunction</code> action.
     * </p>
     * 
     * @param getFunctionRequest
     * @return A Java Future containing the result of the GetFunction operation returned by the service.
     * @sample AWSLambdaAsync.GetFunction
     */
    java.util.concurrent.Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest getFunctionRequest);

    /**
     * <p>
     * Returns the configuration information of the Lambda function and a presigned URL link to the .zip file you
     * uploaded with <a>CreateFunction</a> so you can download the .zip file. Note that the URL is valid for up to 10
     * minutes. The configuration information is the same information you provided as parameters when uploading the
     * function.
     * </p>
     * <p>
     * Using the optional <code>Qualifier</code> parameter, you can specify a specific function version for which you
     * want this information. If you don't specify this parameter, the API uses unqualified function ARN which return
     * information about the <code>$LATEST</code> version of the Lambda function. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:GetFunction</code> action.
     * </p>
     * 
     * @param getFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFunction operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetFunction
     */
    java.util.concurrent.Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest getFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<GetFunctionRequest, GetFunctionResult> asyncHandler);

    /**
     * <p>
     * Returns the configuration information of the Lambda function. This the same information you provided as
     * parameters when uploading the function by using <a>CreateFunction</a>.
     * </p>
     * <p>
     * If you are using the versioning feature, you can retrieve this information for a specific function version by
     * using the optional <code>Qualifier</code> parameter and specifying the function version or alias that points to
     * it. If you don't provide it, the API returns information about the $LATEST version of the function. For more
     * information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:GetFunctionConfiguration</code> operation.
     * </p>
     * 
     * @param getFunctionConfigurationRequest
     * @return A Java Future containing the result of the GetFunctionConfiguration operation returned by the service.
     * @sample AWSLambdaAsync.GetFunctionConfiguration
     */
    java.util.concurrent.Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(GetFunctionConfigurationRequest getFunctionConfigurationRequest);

    /**
     * <p>
     * Returns the configuration information of the Lambda function. This the same information you provided as
     * parameters when uploading the function by using <a>CreateFunction</a>.
     * </p>
     * <p>
     * If you are using the versioning feature, you can retrieve this information for a specific function version by
     * using the optional <code>Qualifier</code> parameter and specifying the function version or alias that points to
     * it. If you don't provide it, the API returns information about the $LATEST version of the function. For more
     * information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:GetFunctionConfiguration</code> operation.
     * </p>
     * 
     * @param getFunctionConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFunctionConfiguration operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetFunctionConfiguration
     */
    java.util.concurrent.Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(GetFunctionConfigurationRequest getFunctionConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetFunctionConfigurationRequest, GetFunctionConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns the resource policy associated with the specified Lambda function.
     * </p>
     * <p>
     * If you are using the versioning feature, you can get the resource policy associated with the specific Lambda
     * function version or alias by specifying the version or alias name using the <code>Qualifier</code> parameter. For
     * more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * For information about adding permissions, see <a>AddPermission</a>.
     * </p>
     * <p>
     * You need permission for the <code>lambda:GetPolicy action.</code>
     * </p>
     * 
     * @param getPolicyRequest
     * @return A Java Future containing the result of the GetPolicy operation returned by the service.
     * @sample AWSLambdaAsync.GetPolicy
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Returns the resource policy associated with the specified Lambda function.
     * </p>
     * <p>
     * If you are using the versioning feature, you can get the resource policy associated with the specific Lambda
     * function version or alias by specifying the version or alias name using the <code>Qualifier</code> parameter. For
     * more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * For information about adding permissions, see <a>AddPermission</a>.
     * </p>
     * <p>
     * You need permission for the <code>lambda:GetPolicy action.</code>
     * </p>
     * 
     * @param getPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPolicy operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetPolicy
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler);

    /**
     * <p>
     * Invokes a specific Lambda function. For an example, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/with-dynamodb-create-function.html#with-dbb-invoke-manually"
     * >Create the Lambda Function and Test It Manually</a>.
     * </p>
     * <p>
     * If you are using the versioning feature, you can invoke the specific function version by providing function
     * version or alias name that is pointing to the function version using the <code>Qualifier</code> parameter in the
     * request. If you don't provide the <code>Qualifier</code> parameter, the <code>$LATEST</code> version of the
     * Lambda function is invoked. Invocations occur at least once in response to an event and functions must be
     * idempotent to handle this. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:InvokeFunction</code> action.
     * </p>
     * 
     * @param invokeRequest
     * @return A Java Future containing the result of the Invoke operation returned by the service.
     * @sample AWSLambdaAsync.Invoke
     */
    java.util.concurrent.Future<InvokeResult> invokeAsync(InvokeRequest invokeRequest);

    /**
     * <p>
     * Invokes a specific Lambda function. For an example, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/with-dynamodb-create-function.html#with-dbb-invoke-manually"
     * >Create the Lambda Function and Test It Manually</a>.
     * </p>
     * <p>
     * If you are using the versioning feature, you can invoke the specific function version by providing function
     * version or alias name that is pointing to the function version using the <code>Qualifier</code> parameter in the
     * request. If you don't provide the <code>Qualifier</code> parameter, the <code>$LATEST</code> version of the
     * Lambda function is invoked. Invocations occur at least once in response to an event and functions must be
     * idempotent to handle this. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:InvokeFunction</code> action.
     * </p>
     * 
     * @param invokeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Invoke operation returned by the service.
     * @sample AWSLambdaAsyncHandler.Invoke
     */
    java.util.concurrent.Future<InvokeResult> invokeAsync(InvokeRequest invokeRequest,
            com.amazonaws.handlers.AsyncHandler<InvokeRequest, InvokeResult> asyncHandler);

    /**
     * <important>
     * <p>
     * This API is deprecated. We recommend you use <code>Invoke</code> API (see <a>Invoke</a>).
     * </p>
     * </important>
     * <p>
     * Submits an invocation request to AWS Lambda. Upon receiving the request, Lambda executes the specified function
     * asynchronously. To see the logs generated by the Lambda function execution, see the CloudWatch Logs console.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:InvokeFunction</code> action.
     * </p>
     * 
     * @param invokeAsyncRequest
     * @return A Java Future containing the result of the InvokeAsync operation returned by the service.
     * @sample AWSLambdaAsync.InvokeAsync
     */
    @Deprecated
    java.util.concurrent.Future<InvokeAsyncResult> invokeAsyncAsync(InvokeAsyncRequest invokeAsyncRequest);

    /**
     * <important>
     * <p>
     * This API is deprecated. We recommend you use <code>Invoke</code> API (see <a>Invoke</a>).
     * </p>
     * </important>
     * <p>
     * Submits an invocation request to AWS Lambda. Upon receiving the request, Lambda executes the specified function
     * asynchronously. To see the logs generated by the Lambda function execution, see the CloudWatch Logs console.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:InvokeFunction</code> action.
     * </p>
     * 
     * @param invokeAsyncRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InvokeAsync operation returned by the service.
     * @sample AWSLambdaAsyncHandler.InvokeAsync
     */
    @Deprecated
    java.util.concurrent.Future<InvokeAsyncResult> invokeAsyncAsync(InvokeAsyncRequest invokeAsyncRequest,
            com.amazonaws.handlers.AsyncHandler<InvokeAsyncRequest, InvokeAsyncResult> asyncHandler);

    /**
     * <p>
     * Returns list of aliases created for a Lambda function. For each alias, the response includes information such as
     * the alias ARN, description, alias name, and the function version to which it points. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * <p>
     * This requires permission for the lambda:ListAliases action.
     * </p>
     * 
     * @param listAliasesRequest
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AWSLambdaAsync.ListAliases
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Returns list of aliases created for a Lambda function. For each alias, the response includes information such as
     * the alias ARN, description, alias name, and the function version to which it points. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * <p>
     * This requires permission for the lambda:ListAliases action.
     * </p>
     * 
     * @param listAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AWSLambdaAsyncHandler.ListAliases
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of event source mappings you created using the <code>CreateEventSourceMapping</code> (see
     * <a>CreateEventSourceMapping</a>).
     * </p>
     * <p>
     * For each mapping, the API returns configuration information. You can optionally specify filters to retrieve
     * specific event source mappings.
     * </p>
     * <p>
     * If you are using the versioning feature, you can get list of event source mappings for a specific Lambda function
     * version or an alias as described in the <code>FunctionName</code> parameter. For information about the versioning
     * feature, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function
     * Versioning and Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:ListEventSourceMappings</code> action.
     * </p>
     * 
     * @param listEventSourceMappingsRequest
     * @return A Java Future containing the result of the ListEventSourceMappings operation returned by the service.
     * @sample AWSLambdaAsync.ListEventSourceMappings
     */
    java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(ListEventSourceMappingsRequest listEventSourceMappingsRequest);

    /**
     * <p>
     * Returns a list of event source mappings you created using the <code>CreateEventSourceMapping</code> (see
     * <a>CreateEventSourceMapping</a>).
     * </p>
     * <p>
     * For each mapping, the API returns configuration information. You can optionally specify filters to retrieve
     * specific event source mappings.
     * </p>
     * <p>
     * If you are using the versioning feature, you can get list of event source mappings for a specific Lambda function
     * version or an alias as described in the <code>FunctionName</code> parameter. For information about the versioning
     * feature, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function
     * Versioning and Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:ListEventSourceMappings</code> action.
     * </p>
     * 
     * @param listEventSourceMappingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEventSourceMappings operation returned by the service.
     * @sample AWSLambdaAsyncHandler.ListEventSourceMappings
     */
    java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(ListEventSourceMappingsRequest listEventSourceMappingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEventSourceMappingsRequest, ListEventSourceMappingsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListEventSourceMappings operation.
     *
     * @see #listEventSourceMappingsAsync(ListEventSourceMappingsRequest)
     */
    java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync();

    /**
     * Simplified method form for invoking the ListEventSourceMappings operation with an AsyncHandler.
     *
     * @see #listEventSourceMappingsAsync(ListEventSourceMappingsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(
            com.amazonaws.handlers.AsyncHandler<ListEventSourceMappingsRequest, ListEventSourceMappingsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of your Lambda functions. For each function, the response includes the function configuration
     * information. You must use <a>GetFunction</a> to retrieve the code for your function.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:ListFunctions</code> action.
     * </p>
     * <p>
     * If you are using versioning feature, the response returns list of $LATEST versions of your functions. For
     * information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * 
     * @param listFunctionsRequest
     * @return A Java Future containing the result of the ListFunctions operation returned by the service.
     * @sample AWSLambdaAsync.ListFunctions
     */
    java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest listFunctionsRequest);

    /**
     * <p>
     * Returns a list of your Lambda functions. For each function, the response includes the function configuration
     * information. You must use <a>GetFunction</a> to retrieve the code for your function.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:ListFunctions</code> action.
     * </p>
     * <p>
     * If you are using versioning feature, the response returns list of $LATEST versions of your functions. For
     * information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * 
     * @param listFunctionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFunctions operation returned by the service.
     * @sample AWSLambdaAsyncHandler.ListFunctions
     */
    java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest listFunctionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFunctionsRequest, ListFunctionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListFunctions operation.
     *
     * @see #listFunctionsAsync(ListFunctionsRequest)
     */
    java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync();

    /**
     * Simplified method form for invoking the ListFunctions operation with an AsyncHandler.
     *
     * @see #listFunctionsAsync(ListFunctionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(
            com.amazonaws.handlers.AsyncHandler<ListFunctionsRequest, ListFunctionsResult> asyncHandler);

    /**
     * <p>
     * List all versions of a function. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * 
     * @param listVersionsByFunctionRequest
     * @return A Java Future containing the result of the ListVersionsByFunction operation returned by the service.
     * @sample AWSLambdaAsync.ListVersionsByFunction
     */
    java.util.concurrent.Future<ListVersionsByFunctionResult> listVersionsByFunctionAsync(ListVersionsByFunctionRequest listVersionsByFunctionRequest);

    /**
     * <p>
     * List all versions of a function. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * 
     * @param listVersionsByFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVersionsByFunction operation returned by the service.
     * @sample AWSLambdaAsyncHandler.ListVersionsByFunction
     */
    java.util.concurrent.Future<ListVersionsByFunctionResult> listVersionsByFunctionAsync(ListVersionsByFunctionRequest listVersionsByFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<ListVersionsByFunctionRequest, ListVersionsByFunctionResult> asyncHandler);

    /**
     * <p>
     * Publishes a version of your function from the current snapshot of $LATEST. That is, AWS Lambda takes a snapshot
     * of the function code and configuration information from $LATEST and publishes a new version. The code and
     * configuration cannot be modified after publication. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * 
     * @param publishVersionRequest
     * @return A Java Future containing the result of the PublishVersion operation returned by the service.
     * @sample AWSLambdaAsync.PublishVersion
     */
    java.util.concurrent.Future<PublishVersionResult> publishVersionAsync(PublishVersionRequest publishVersionRequest);

    /**
     * <p>
     * Publishes a version of your function from the current snapshot of $LATEST. That is, AWS Lambda takes a snapshot
     * of the function code and configuration information from $LATEST and publishes a new version. The code and
     * configuration cannot be modified after publication. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * 
     * @param publishVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PublishVersion operation returned by the service.
     * @sample AWSLambdaAsyncHandler.PublishVersion
     */
    java.util.concurrent.Future<PublishVersionResult> publishVersionAsync(PublishVersionRequest publishVersionRequest,
            com.amazonaws.handlers.AsyncHandler<PublishVersionRequest, PublishVersionResult> asyncHandler);

    /**
     * <p>
     * You can remove individual permissions from an resource policy associated with a Lambda function by providing a
     * statement ID that you provided when you added the permission.
     * </p>
     * <p>
     * If you are using versioning, the permissions you remove are specific to the Lambda function version or alias you
     * specify in the <code>AddPermission</code> request via the <code>Qualifier</code> parameter. For more information
     * about versioning, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda
     * Function Versioning and Aliases</a>.
     * </p>
     * <p>
     * Note that removal of a permission will cause an active event source to lose permission to the function.
     * </p>
     * <p>
     * You need permission for the <code>lambda:RemovePermission</code> action.
     * </p>
     * 
     * @param removePermissionRequest
     * @return A Java Future containing the result of the RemovePermission operation returned by the service.
     * @sample AWSLambdaAsync.RemovePermission
     */
    java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest removePermissionRequest);

    /**
     * <p>
     * You can remove individual permissions from an resource policy associated with a Lambda function by providing a
     * statement ID that you provided when you added the permission.
     * </p>
     * <p>
     * If you are using versioning, the permissions you remove are specific to the Lambda function version or alias you
     * specify in the <code>AddPermission</code> request via the <code>Qualifier</code> parameter. For more information
     * about versioning, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda
     * Function Versioning and Aliases</a>.
     * </p>
     * <p>
     * Note that removal of a permission will cause an active event source to lose permission to the function.
     * </p>
     * <p>
     * You need permission for the <code>lambda:RemovePermission</code> action.
     * </p>
     * 
     * @param removePermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemovePermission operation returned by the service.
     * @sample AWSLambdaAsyncHandler.RemovePermission
     */
    java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest removePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler);

    /**
     * <p>
     * Using this API you can update the function version to which the alias points and the alias description. For more
     * information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS
     * Lambda Aliases</a>.
     * </p>
     * <p>
     * This requires permission for the lambda:UpdateAlias action.
     * </p>
     * 
     * @param updateAliasRequest
     * @return A Java Future containing the result of the UpdateAlias operation returned by the service.
     * @sample AWSLambdaAsync.UpdateAlias
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest updateAliasRequest);

    /**
     * <p>
     * Using this API you can update the function version to which the alias points and the alias description. For more
     * information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS
     * Lambda Aliases</a>.
     * </p>
     * <p>
     * This requires permission for the lambda:UpdateAlias action.
     * </p>
     * 
     * @param updateAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAlias operation returned by the service.
     * @sample AWSLambdaAsyncHandler.UpdateAlias
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest updateAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler);

    /**
     * <p>
     * You can update an event source mapping. This is useful if you want to change the parameters of the existing
     * mapping without losing your position in the stream. You can change which function will receive the stream
     * records, but to change the stream itself, you must create a new mapping.
     * </p>
     * <p>
     * If you are using the versioning feature, you can update the event source mapping to map to a specific Lambda
     * function version or alias as described in the <code>FunctionName</code> parameter. For information about the
     * versioning feature, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda
     * Function Versioning and Aliases</a>.
     * </p>
     * <p>
     * If you disable the event source mapping, AWS Lambda stops polling. If you enable again, it will resume polling
     * from the time it had stopped polling, so you don't lose processing of any records. However, if you delete event
     * source mapping and create it again, it will reset.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:UpdateEventSourceMapping</code> action.
     * </p>
     * 
     * @param updateEventSourceMappingRequest
     * @return A Java Future containing the result of the UpdateEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsync.UpdateEventSourceMapping
     */
    java.util.concurrent.Future<UpdateEventSourceMappingResult> updateEventSourceMappingAsync(UpdateEventSourceMappingRequest updateEventSourceMappingRequest);

    /**
     * <p>
     * You can update an event source mapping. This is useful if you want to change the parameters of the existing
     * mapping without losing your position in the stream. You can change which function will receive the stream
     * records, but to change the stream itself, you must create a new mapping.
     * </p>
     * <p>
     * If you are using the versioning feature, you can update the event source mapping to map to a specific Lambda
     * function version or alias as described in the <code>FunctionName</code> parameter. For information about the
     * versioning feature, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda
     * Function Versioning and Aliases</a>.
     * </p>
     * <p>
     * If you disable the event source mapping, AWS Lambda stops polling. If you enable again, it will resume polling
     * from the time it had stopped polling, so you don't lose processing of any records. However, if you delete event
     * source mapping and create it again, it will reset.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:UpdateEventSourceMapping</code> action.
     * </p>
     * 
     * @param updateEventSourceMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsyncHandler.UpdateEventSourceMapping
     */
    java.util.concurrent.Future<UpdateEventSourceMappingResult> updateEventSourceMappingAsync(UpdateEventSourceMappingRequest updateEventSourceMappingRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEventSourceMappingRequest, UpdateEventSourceMappingResult> asyncHandler);

    /**
     * <p>
     * Updates the code for the specified Lambda function. This operation must only be used on an existing Lambda
     * function and cannot be used to update the function configuration.
     * </p>
     * <p>
     * If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda
     * function. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:UpdateFunctionCode</code> action.
     * </p>
     * 
     * @param updateFunctionCodeRequest
     * @return A Java Future containing the result of the UpdateFunctionCode operation returned by the service.
     * @sample AWSLambdaAsync.UpdateFunctionCode
     */
    java.util.concurrent.Future<UpdateFunctionCodeResult> updateFunctionCodeAsync(UpdateFunctionCodeRequest updateFunctionCodeRequest);

    /**
     * <p>
     * Updates the code for the specified Lambda function. This operation must only be used on an existing Lambda
     * function and cannot be used to update the function configuration.
     * </p>
     * <p>
     * If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda
     * function. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:UpdateFunctionCode</code> action.
     * </p>
     * 
     * @param updateFunctionCodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFunctionCode operation returned by the service.
     * @sample AWSLambdaAsyncHandler.UpdateFunctionCode
     */
    java.util.concurrent.Future<UpdateFunctionCodeResult> updateFunctionCodeAsync(UpdateFunctionCodeRequest updateFunctionCodeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFunctionCodeRequest, UpdateFunctionCodeResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration parameters for the specified Lambda function by using the values provided in the
     * request. You provide only the parameters you want to change. This operation must only be used on an existing
     * Lambda function and cannot be used to update the function's code.
     * </p>
     * <p>
     * If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda
     * function. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:UpdateFunctionConfiguration</code> action.
     * </p>
     * 
     * @param updateFunctionConfigurationRequest
     * @return A Java Future containing the result of the UpdateFunctionConfiguration operation returned by the service.
     * @sample AWSLambdaAsync.UpdateFunctionConfiguration
     */
    java.util.concurrent.Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(
            UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest);

    /**
     * <p>
     * Updates the configuration parameters for the specified Lambda function by using the values provided in the
     * request. You provide only the parameters you want to change. This operation must only be used on an existing
     * Lambda function and cannot be used to update the function's code.
     * </p>
     * <p>
     * If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda
     * function. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:UpdateFunctionConfiguration</code> action.
     * </p>
     * 
     * @param updateFunctionConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFunctionConfiguration operation returned by the service.
     * @sample AWSLambdaAsyncHandler.UpdateFunctionConfiguration
     */
    java.util.concurrent.Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(
            UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFunctionConfigurationRequest, UpdateFunctionConfigurationResult> asyncHandler);

}

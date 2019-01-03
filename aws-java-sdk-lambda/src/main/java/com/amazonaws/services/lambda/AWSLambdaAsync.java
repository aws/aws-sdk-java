/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

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
 * service overview, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/welcome.html">What is AWS Lambda</a>, and
 * for information about how the service works, see <a
 * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a> in the
 * <b>AWS Lambda Developer Guide</b>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLambdaAsync extends AWSLambda {

    /**
     * <p>
     * Adds permissions to the resource-based policy of a version of a function layer. Use this action to grant layer
     * usage permission to other accounts. You can grant permission to a single account, all AWS accounts, or all
     * accounts in an organization.
     * </p>
     * <p>
     * To revoke permission, call <a>RemoveLayerVersionPermission</a> with the statement ID that you specified when you
     * added it.
     * </p>
     * 
     * @param addLayerVersionPermissionRequest
     * @return A Java Future containing the result of the AddLayerVersionPermission operation returned by the service.
     * @sample AWSLambdaAsync.AddLayerVersionPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddLayerVersionPermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddLayerVersionPermissionResult> addLayerVersionPermissionAsync(
            AddLayerVersionPermissionRequest addLayerVersionPermissionRequest);

    /**
     * <p>
     * Adds permissions to the resource-based policy of a version of a function layer. Use this action to grant layer
     * usage permission to other accounts. You can grant permission to a single account, all AWS accounts, or all
     * accounts in an organization.
     * </p>
     * <p>
     * To revoke permission, call <a>RemoveLayerVersionPermission</a> with the statement ID that you specified when you
     * added it.
     * </p>
     * 
     * @param addLayerVersionPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddLayerVersionPermission operation returned by the service.
     * @sample AWSLambdaAsyncHandler.AddLayerVersionPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddLayerVersionPermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddLayerVersionPermissionResult> addLayerVersionPermissionAsync(
            AddLayerVersionPermissionRequest addLayerVersionPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<AddLayerVersionPermissionRequest, AddLayerVersionPermissionResult> asyncHandler);

    /**
     * <p>
     * Adds a permission to the resource policy associated with the specified AWS Lambda function. You use resource
     * policies to grant permissions to event sources that use the <i>push</i> model. In a <i>push</i> model, event
     * sources (such as Amazon S3 and custom applications) invoke your Lambda function. Each permission you add to the
     * resource policy allows an event source permission to invoke the Lambda function.
     * </p>
     * <p>
     * Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the
     * unpublished version of the function), or include a version or alias. If a client uses a version or alias to
     * invoke a function, use the <code>Qualifier</code> parameter to apply permissions to that ARN. For more
     * information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:AddPermission</code> action.
     * </p>
     * 
     * @param addPermissionRequest
     * @return A Java Future containing the result of the AddPermission operation returned by the service.
     * @sample AWSLambdaAsync.AddPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddPermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest addPermissionRequest);

    /**
     * <p>
     * Adds a permission to the resource policy associated with the specified AWS Lambda function. You use resource
     * policies to grant permissions to event sources that use the <i>push</i> model. In a <i>push</i> model, event
     * sources (such as Amazon S3 and custom applications) invoke your Lambda function. Each permission you add to the
     * resource policy allows an event source permission to invoke the Lambda function.
     * </p>
     * <p>
     * Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the
     * unpublished version of the function), or include a version or alias. If a client uses a version or alias to
     * invoke a function, use the <code>Qualifier</code> parameter to apply permissions to that ARN. For more
     * information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddPermission" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateAlias" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler);

    /**
     * <p>
     * Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source
     * and triggers the function.
     * </p>
     * <p>
     * For details about each event source type, see the following topics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/with-kinesis.html">Using AWS Lambda with Amazon Kinesis</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html">Using AWS Lambda with Amazon SQS</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html">Using AWS Lambda with Amazon DynamoDB</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createEventSourceMappingRequest
     * @return A Java Future containing the result of the CreateEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsync.CreateEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEventSourceMappingResult> createEventSourceMappingAsync(CreateEventSourceMappingRequest createEventSourceMappingRequest);

    /**
     * <p>
     * Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source
     * and triggers the function.
     * </p>
     * <p>
     * For details about each event source type, see the following topics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/with-kinesis.html">Using AWS Lambda with Amazon Kinesis</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html">Using AWS Lambda with Amazon SQS</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html">Using AWS Lambda with Amazon DynamoDB</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createEventSourceMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsyncHandler.CreateEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEventSourceMappingResult> createEventSourceMappingAsync(CreateEventSourceMappingRequest createEventSourceMappingRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEventSourceMappingRequest, CreateEventSourceMappingResult> asyncHandler);

    /**
     * <p>
     * Creates a new Lambda function. The function configuration is created from the request parameters, and the code
     * for the function is provided by a .zip file. The function name is case-sensitive.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:CreateFunction</code> action.
     * </p>
     * 
     * @param createFunctionRequest
     * @return A Java Future containing the result of the CreateFunction operation returned by the service.
     * @sample AWSLambdaAsync.CreateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(CreateFunctionRequest createFunctionRequest);

    /**
     * <p>
     * Creates a new Lambda function. The function configuration is created from the request parameters, and the code
     * for the function is provided by a .zip file. The function name is case-sensitive.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateFunction" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes an event source mapping.
     * </p>
     * 
     * @param deleteEventSourceMappingRequest
     * @return A Java Future containing the result of the DeleteEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsync.DeleteEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventSourceMappingResult> deleteEventSourceMappingAsync(DeleteEventSourceMappingRequest deleteEventSourceMappingRequest);

    /**
     * <p>
     * Deletes an event source mapping.
     * </p>
     * 
     * @param deleteEventSourceMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsyncHandler.DeleteEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventSourceMappingResult> deleteEventSourceMappingAsync(DeleteEventSourceMappingRequest deleteEventSourceMappingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventSourceMappingRequest, DeleteEventSourceMappingResult> asyncHandler);

    /**
     * <p>
     * Deletes a Lambda function. To delete a specific function version, use the <code>Qualifier</code> parameter.
     * Otherwise, all versions and aliases are deleted. Event source mappings are not deleted.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:DeleteFunction</code> action.
     * </p>
     * 
     * @param deleteFunctionRequest
     * @return A Java Future containing the result of the DeleteFunction operation returned by the service.
     * @sample AWSLambdaAsync.DeleteFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(DeleteFunctionRequest deleteFunctionRequest);

    /**
     * <p>
     * Deletes a Lambda function. To delete a specific function version, use the <code>Qualifier</code> parameter.
     * Otherwise, all versions and aliases are deleted. Event source mappings are not deleted.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(DeleteFunctionRequest deleteFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFunctionRequest, DeleteFunctionResult> asyncHandler);

    /**
     * <p>
     * Removes concurrent execution limits from this function. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     * </p>
     * 
     * @param deleteFunctionConcurrencyRequest
     * @return A Java Future containing the result of the DeleteFunctionConcurrency operation returned by the service.
     * @sample AWSLambdaAsync.DeleteFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunctionConcurrency"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionConcurrencyResult> deleteFunctionConcurrencyAsync(
            DeleteFunctionConcurrencyRequest deleteFunctionConcurrencyRequest);

    /**
     * <p>
     * Removes concurrent execution limits from this function. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     * </p>
     * 
     * @param deleteFunctionConcurrencyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFunctionConcurrency operation returned by the service.
     * @sample AWSLambdaAsyncHandler.DeleteFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunctionConcurrency"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionConcurrencyResult> deleteFunctionConcurrencyAsync(
            DeleteFunctionConcurrencyRequest deleteFunctionConcurrencyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFunctionConcurrencyRequest, DeleteFunctionConcurrencyResult> asyncHandler);

    /**
     * <p>
     * Deletes a version of a function layer. Deleted versions can no longer be viewed or added to functions. However, a
     * copy of the version remains in Lambda until no functions refer to it.
     * </p>
     * 
     * @param deleteLayerVersionRequest
     * @return A Java Future containing the result of the DeleteLayerVersion operation returned by the service.
     * @sample AWSLambdaAsync.DeleteLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLayerVersionResult> deleteLayerVersionAsync(DeleteLayerVersionRequest deleteLayerVersionRequest);

    /**
     * <p>
     * Deletes a version of a function layer. Deleted versions can no longer be viewed or added to functions. However, a
     * copy of the version remains in Lambda until no functions refer to it.
     * </p>
     * 
     * @param deleteLayerVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLayerVersion operation returned by the service.
     * @sample AWSLambdaAsyncHandler.DeleteLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLayerVersionResult> deleteLayerVersionAsync(DeleteLayerVersionRequest deleteLayerVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLayerVersionRequest, DeleteLayerVersionResult> asyncHandler);

    /**
     * <p>
     * Retrieves details about your account's <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/limits.html">limits</a> and usage in a region.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return A Java Future containing the result of the GetAccountSettings operation returned by the service.
     * @sample AWSLambdaAsync.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest getAccountSettingsRequest);

    /**
     * <p>
     * Retrieves details about your account's <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/limits.html">limits</a> and usage in a region.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccountSettings operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest getAccountSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAlias" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAliasResult> getAliasAsync(GetAliasRequest getAliasRequest,
            com.amazonaws.handlers.AsyncHandler<GetAliasRequest, GetAliasResult> asyncHandler);

    /**
     * <p>
     * Returns details about an event source mapping.
     * </p>
     * 
     * @param getEventSourceMappingRequest
     * @return A Java Future containing the result of the GetEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsync.GetEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetEventSourceMapping" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEventSourceMappingResult> getEventSourceMappingAsync(GetEventSourceMappingRequest getEventSourceMappingRequest);

    /**
     * <p>
     * Returns details about an event source mapping.
     * </p>
     * 
     * @param getEventSourceMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetEventSourceMapping" target="_top">AWS
     *      API Documentation</a>
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
     * Use the <code>Qualifier</code> parameter to retrieve a published version of the function. Otherwise, returns the
     * unpublished version (<code>$LATEST</code>). For more information, see <a
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunction" target="_top">AWS API
     *      Documentation</a>
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
     * Use the <code>Qualifier</code> parameter to retrieve a published version of the function. Otherwise, returns the
     * unpublished version (<code>$LATEST</code>). For more information, see <a
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunction" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionConfiguration"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(GetFunctionConfigurationRequest getFunctionConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetFunctionConfigurationRequest, GetFunctionConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns information about a version of a function layer, with a link to download the layer archive that's valid
     * for 10 minutes.
     * </p>
     * 
     * @param getLayerVersionRequest
     * @return A Java Future containing the result of the GetLayerVersion operation returned by the service.
     * @sample AWSLambdaAsync.GetLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLayerVersionResult> getLayerVersionAsync(GetLayerVersionRequest getLayerVersionRequest);

    /**
     * <p>
     * Returns information about a version of a function layer, with a link to download the layer archive that's valid
     * for 10 minutes.
     * </p>
     * 
     * @param getLayerVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLayerVersion operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLayerVersionResult> getLayerVersionAsync(GetLayerVersionRequest getLayerVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetLayerVersionRequest, GetLayerVersionResult> asyncHandler);

    /**
     * <p>
     * Returns the permission policy for a layer version. For more information, see <a>AddLayerVersionPermission</a>.
     * </p>
     * 
     * @param getLayerVersionPolicyRequest
     * @return A Java Future containing the result of the GetLayerVersionPolicy operation returned by the service.
     * @sample AWSLambdaAsync.GetLayerVersionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLayerVersionPolicyResult> getLayerVersionPolicyAsync(GetLayerVersionPolicyRequest getLayerVersionPolicyRequest);

    /**
     * <p>
     * Returns the permission policy for a layer version. For more information, see <a>AddLayerVersionPermission</a>.
     * </p>
     * 
     * @param getLayerVersionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLayerVersionPolicy operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetLayerVersionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLayerVersionPolicyResult> getLayerVersionPolicyAsync(GetLayerVersionPolicyRequest getLayerVersionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetLayerVersionPolicyRequest, GetLayerVersionPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns the resource policy associated with the specified Lambda function.
     * </p>
     * <p>
     * This action requires permission for the <code>lambda:GetPolicy action.</code>
     * </p>
     * 
     * @param getPolicyRequest
     * @return A Java Future containing the result of the GetPolicy operation returned by the service.
     * @sample AWSLambdaAsync.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Returns the resource policy associated with the specified Lambda function.
     * </p>
     * <p>
     * This action requires permission for the <code>lambda:GetPolicy action.</code>
     * </p>
     * 
     * @param getPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPolicy operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler);

    /**
     * <p>
     * Invokes a Lambda function. For an example, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/with-dynamodb-create-function.html#with-dbb-invoke-manually"
     * >Create the Lambda Function and Test It Manually</a>.
     * </p>
     * <p>
     * Specify just a function name to invoke the latest version of the function. To invoke a published version, use the
     * <code>Qualifier</code> parameter to specify a <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">version or alias</a>.
     * </p>
     * <p>
     * If you use the <code>RequestResponse</code> (synchronous) invocation option, the function will be invoked only
     * once. If you use the <code>Event</code> (asynchronous) invocation option, the function will be invoked at least
     * once in response to an event and the function must be idempotent to handle this.
     * </p>
     * <p>
     * For functions with a long timeout, your client may be disconnected during synchronous invocation while it waits
     * for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long
     * connections with timeout or keep-alive settings.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:InvokeFunction</code> action.
     * </p>
     * <p>
     * The <code>TooManyRequestsException</code> noted below will return the following:
     * <code>ConcurrentInvocationLimitExceeded</code> will be returned if you have no functions with reserved
     * concurrency and have exceeded your account concurrent limit or if a function without reserved concurrency exceeds
     * the account's unreserved concurrency limit. <code>ReservedFunctionConcurrentInvocationLimitExceeded</code> will
     * be returned when a function with reserved concurrency exceeds its configured concurrency limit.
     * </p>
     * 
     * @param invokeRequest
     * @return A Java Future containing the result of the Invoke operation returned by the service.
     * @sample AWSLambdaAsync.Invoke
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/Invoke" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InvokeResult> invokeAsync(InvokeRequest invokeRequest);

    /**
     * <p>
     * Invokes a Lambda function. For an example, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/with-dynamodb-create-function.html#with-dbb-invoke-manually"
     * >Create the Lambda Function and Test It Manually</a>.
     * </p>
     * <p>
     * Specify just a function name to invoke the latest version of the function. To invoke a published version, use the
     * <code>Qualifier</code> parameter to specify a <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">version or alias</a>.
     * </p>
     * <p>
     * If you use the <code>RequestResponse</code> (synchronous) invocation option, the function will be invoked only
     * once. If you use the <code>Event</code> (asynchronous) invocation option, the function will be invoked at least
     * once in response to an event and the function must be idempotent to handle this.
     * </p>
     * <p>
     * For functions with a long timeout, your client may be disconnected during synchronous invocation while it waits
     * for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long
     * connections with timeout or keep-alive settings.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:InvokeFunction</code> action.
     * </p>
     * <p>
     * The <code>TooManyRequestsException</code> noted below will return the following:
     * <code>ConcurrentInvocationLimitExceeded</code> will be returned if you have no functions with reserved
     * concurrency and have exceeded your account concurrent limit or if a function without reserved concurrency exceeds
     * the account's unreserved concurrency limit. <code>ReservedFunctionConcurrentInvocationLimitExceeded</code> will
     * be returned when a function with reserved concurrency exceeds its configured concurrency limit.
     * </p>
     * 
     * @param invokeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Invoke operation returned by the service.
     * @sample AWSLambdaAsyncHandler.Invoke
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/Invoke" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InvokeResult> invokeAsync(InvokeRequest invokeRequest,
            com.amazonaws.handlers.AsyncHandler<InvokeRequest, InvokeResult> asyncHandler);

    /**
     * <important>
     * <p>
     * For asynchronous function invocation, use <a>Invoke</a>.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/InvokeAsync" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<InvokeAsyncResult> invokeAsyncAsync(InvokeAsyncRequest invokeAsyncRequest);

    /**
     * <important>
     * <p>
     * For asynchronous function invocation, use <a>Invoke</a>.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/InvokeAsync" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListAliases" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler);

    /**
     * <p>
     * Lists event source mappings. Specify an <code>EventSourceArn</code> to only show event source mappings for a
     * single event source.
     * </p>
     * 
     * @param listEventSourceMappingsRequest
     * @return A Java Future containing the result of the ListEventSourceMappings operation returned by the service.
     * @sample AWSLambdaAsync.ListEventSourceMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListEventSourceMappings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(ListEventSourceMappingsRequest listEventSourceMappingsRequest);

    /**
     * <p>
     * Lists event source mappings. Specify an <code>EventSourceArn</code> to only show event source mappings for a
     * single event source.
     * </p>
     * 
     * @param listEventSourceMappingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEventSourceMappings operation returned by the service.
     * @sample AWSLambdaAsyncHandler.ListEventSourceMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListEventSourceMappings" target="_top">AWS
     *      API Documentation</a>
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
     * If you are using the versioning feature, you can list all of your functions or only <code>$LATEST</code>
     * versions. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * 
     * @param listFunctionsRequest
     * @return A Java Future containing the result of the ListFunctions operation returned by the service.
     * @sample AWSLambdaAsync.ListFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctions" target="_top">AWS API
     *      Documentation</a>
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
     * If you are using the versioning feature, you can list all of your functions or only <code>$LATEST</code>
     * versions. For information about the versioning feature, see <a
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctions" target="_top">AWS API
     *      Documentation</a>
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
     * Lists the versions of a function layer. Versions that have been deleted aren't listed. Specify a <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime identifier</a> to list only
     * versions that indicate that they're compatible with that runtime.
     * </p>
     * 
     * @param listLayerVersionsRequest
     * @return A Java Future containing the result of the ListLayerVersions operation returned by the service.
     * @sample AWSLambdaAsync.ListLayerVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListLayerVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLayerVersionsResult> listLayerVersionsAsync(ListLayerVersionsRequest listLayerVersionsRequest);

    /**
     * <p>
     * Lists the versions of a function layer. Versions that have been deleted aren't listed. Specify a <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime identifier</a> to list only
     * versions that indicate that they're compatible with that runtime.
     * </p>
     * 
     * @param listLayerVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLayerVersions operation returned by the service.
     * @sample AWSLambdaAsyncHandler.ListLayerVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListLayerVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLayerVersionsResult> listLayerVersionsAsync(ListLayerVersionsRequest listLayerVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLayerVersionsRequest, ListLayerVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists function layers and shows information about the latest version of each. Specify a <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime identifier</a> to list only
     * layers that indicate that they're compatible with that runtime.
     * </p>
     * 
     * @param listLayersRequest
     * @return A Java Future containing the result of the ListLayers operation returned by the service.
     * @sample AWSLambdaAsync.ListLayers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListLayers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLayersResult> listLayersAsync(ListLayersRequest listLayersRequest);

    /**
     * <p>
     * Lists function layers and shows information about the latest version of each. Specify a <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime identifier</a> to list only
     * layers that indicate that they're compatible with that runtime.
     * </p>
     * 
     * @param listLayersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLayers operation returned by the service.
     * @sample AWSLambdaAsyncHandler.ListLayers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListLayers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLayersResult> listLayersAsync(ListLayersRequest listLayersRequest,
            com.amazonaws.handlers.AsyncHandler<ListLayersRequest, ListLayersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags assigned to a function when supplied the function ARN (Amazon Resource Name). For more
     * information on Tagging, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda
     * Functions</a> in the <b>AWS Lambda Developer Guide</b>.
     * </p>
     * 
     * @param listTagsRequest
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSLambdaAsync.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Returns a list of tags assigned to a function when supplied the function ARN (Amazon Resource Name). For more
     * information on Tagging, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda
     * Functions</a> in the <b>AWS Lambda Developer Guide</b>.
     * </p>
     * 
     * @param listTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSLambdaAsyncHandler.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

    /**
     * <p>
     * Lists all versions of a function. For information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * 
     * @param listVersionsByFunctionRequest
     * @return A Java Future containing the result of the ListVersionsByFunction operation returned by the service.
     * @sample AWSLambdaAsync.ListVersionsByFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListVersionsByFunction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListVersionsByFunctionResult> listVersionsByFunctionAsync(ListVersionsByFunctionRequest listVersionsByFunctionRequest);

    /**
     * <p>
     * Lists all versions of a function. For information about versioning, see <a
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListVersionsByFunction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListVersionsByFunctionResult> listVersionsByFunctionAsync(ListVersionsByFunctionRequest listVersionsByFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<ListVersionsByFunctionRequest, ListVersionsByFunctionResult> asyncHandler);

    /**
     * <p>
     * Creates a function layer from a ZIP archive. Each time you call <code>PublishLayerVersion</code> with the same
     * version name, a new version is created.
     * </p>
     * <p>
     * Add layers to your function with <a>CreateFunction</a> or <a>UpdateFunctionConfiguration</a>.
     * </p>
     * 
     * @param publishLayerVersionRequest
     * @return A Java Future containing the result of the PublishLayerVersion operation returned by the service.
     * @sample AWSLambdaAsync.PublishLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PublishLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishLayerVersionResult> publishLayerVersionAsync(PublishLayerVersionRequest publishLayerVersionRequest);

    /**
     * <p>
     * Creates a function layer from a ZIP archive. Each time you call <code>PublishLayerVersion</code> with the same
     * version name, a new version is created.
     * </p>
     * <p>
     * Add layers to your function with <a>CreateFunction</a> or <a>UpdateFunctionConfiguration</a>.
     * </p>
     * 
     * @param publishLayerVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PublishLayerVersion operation returned by the service.
     * @sample AWSLambdaAsyncHandler.PublishLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PublishLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishLayerVersionResult> publishLayerVersionAsync(PublishLayerVersionRequest publishLayerVersionRequest,
            com.amazonaws.handlers.AsyncHandler<PublishLayerVersionRequest, PublishLayerVersionResult> asyncHandler);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PublishVersion" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PublishVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishVersionResult> publishVersionAsync(PublishVersionRequest publishVersionRequest,
            com.amazonaws.handlers.AsyncHandler<PublishVersionRequest, PublishVersionResult> asyncHandler);

    /**
     * <p>
     * Sets a limit on the number of concurrent executions available to this function. It is a subset of your account's
     * total concurrent execution limit per region. Note that Lambda automatically reserves a buffer of 100 concurrent
     * executions for functions without any reserved concurrency limit. This means if your account limit is 1000, you
     * have a total of 900 available to allocate to individual functions. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     * </p>
     * 
     * @param putFunctionConcurrencyRequest
     * @return A Java Future containing the result of the PutFunctionConcurrency operation returned by the service.
     * @sample AWSLambdaAsync.PutFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionConcurrency" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutFunctionConcurrencyResult> putFunctionConcurrencyAsync(PutFunctionConcurrencyRequest putFunctionConcurrencyRequest);

    /**
     * <p>
     * Sets a limit on the number of concurrent executions available to this function. It is a subset of your account's
     * total concurrent execution limit per region. Note that Lambda automatically reserves a buffer of 100 concurrent
     * executions for functions without any reserved concurrency limit. This means if your account limit is 1000, you
     * have a total of 900 available to allocate to individual functions. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     * </p>
     * 
     * @param putFunctionConcurrencyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutFunctionConcurrency operation returned by the service.
     * @sample AWSLambdaAsyncHandler.PutFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionConcurrency" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutFunctionConcurrencyResult> putFunctionConcurrencyAsync(PutFunctionConcurrencyRequest putFunctionConcurrencyRequest,
            com.amazonaws.handlers.AsyncHandler<PutFunctionConcurrencyRequest, PutFunctionConcurrencyResult> asyncHandler);

    /**
     * <p>
     * Removes a statement from the permissions policy for a layer version. For more information, see
     * <a>AddLayerVersionPermission</a>.
     * </p>
     * 
     * @param removeLayerVersionPermissionRequest
     * @return A Java Future containing the result of the RemoveLayerVersionPermission operation returned by the
     *         service.
     * @sample AWSLambdaAsync.RemoveLayerVersionPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/RemoveLayerVersionPermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveLayerVersionPermissionResult> removeLayerVersionPermissionAsync(
            RemoveLayerVersionPermissionRequest removeLayerVersionPermissionRequest);

    /**
     * <p>
     * Removes a statement from the permissions policy for a layer version. For more information, see
     * <a>AddLayerVersionPermission</a>.
     * </p>
     * 
     * @param removeLayerVersionPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveLayerVersionPermission operation returned by the
     *         service.
     * @sample AWSLambdaAsyncHandler.RemoveLayerVersionPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/RemoveLayerVersionPermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveLayerVersionPermissionResult> removeLayerVersionPermissionAsync(
            RemoveLayerVersionPermissionRequest removeLayerVersionPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveLayerVersionPermissionRequest, RemoveLayerVersionPermissionResult> asyncHandler);

    /**
     * <p>
     * Removes permissions from a function. You can remove individual permissions from an resource policy associated
     * with a Lambda function by providing a statement ID that you provided when you added the permission. When you
     * remove permissions, disable the event source mapping or trigger configuration first to avoid errors.
     * </p>
     * <p>
     * Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the
     * unpublished version of the function), or include a version or alias. If a client uses a version or alias to
     * invoke a function, use the <code>Qualifier</code> parameter to apply permissions to that ARN. For more
     * information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * You need permission for the <code>lambda:RemovePermission</code> action.
     * </p>
     * 
     * @param removePermissionRequest
     * @return A Java Future containing the result of the RemovePermission operation returned by the service.
     * @sample AWSLambdaAsync.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/RemovePermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest removePermissionRequest);

    /**
     * <p>
     * Removes permissions from a function. You can remove individual permissions from an resource policy associated
     * with a Lambda function by providing a statement ID that you provided when you added the permission. When you
     * remove permissions, disable the event source mapping or trigger configuration first to avoid errors.
     * </p>
     * <p>
     * Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the
     * unpublished version of the function), or include a version or alias. If a client uses a version or alias to
     * invoke a function, use the <code>Qualifier</code> parameter to apply permissions to that ARN. For more
     * information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/RemovePermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest removePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler);

    /**
     * <p>
     * Creates a list of tags (key-value pairs) on the Lambda function. Requires the Lambda function ARN (Amazon
     * Resource Name). If a key is specified without a value, Lambda creates a tag with the specified key and a value of
     * null. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda
     * Functions</a> in the <b>AWS Lambda Developer Guide</b>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSLambdaAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Creates a list of tags (key-value pairs) on the Lambda function. Requires the Lambda function ARN (Amazon
     * Resource Name). If a key is specified without a value, Lambda creates a tag with the specified key and a value of
     * null. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda
     * Functions</a> in the <b>AWS Lambda Developer Guide</b>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSLambdaAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a Lambda function. Requires the function ARN (Amazon Resource Name). For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS
     * Lambda Developer Guide</b>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSLambdaAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a Lambda function. Requires the function ARN (Amazon Resource Name). For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS
     * Lambda Developer Guide</b>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSLambdaAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest updateAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler);

    /**
     * <p>
     * Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and
     * resume later from the same location.
     * </p>
     * 
     * @param updateEventSourceMappingRequest
     * @return A Java Future containing the result of the UpdateEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsync.UpdateEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEventSourceMappingResult> updateEventSourceMappingAsync(UpdateEventSourceMappingRequest updateEventSourceMappingRequest);

    /**
     * <p>
     * Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and
     * resume later from the same location.
     * </p>
     * 
     * @param updateEventSourceMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsyncHandler.UpdateEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionCode" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionCode" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionConfiguration"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(
            UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFunctionConfigurationRequest, UpdateFunctionConfigurationResult> asyncHandler);

}

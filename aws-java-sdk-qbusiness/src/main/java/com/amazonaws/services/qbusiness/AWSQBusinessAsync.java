/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness;

import javax.annotation.Generated;

import com.amazonaws.services.qbusiness.model.*;

/**
 * Interface for accessing QBusiness asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.qbusiness.AbstractAWSQBusinessAsync} instead.
 * </p>
 * <p>
 * <p>
 * This is the <i>Amazon Q Business</i> API Reference. Amazon Q Business is a fully managed, generative-AI powered
 * enterprise chat assistant that you can deploy within your organization. Amazon Q Business enhances employee
 * productivity by supporting key tasks such as question-answering, knowledge discovery, writing email messages,
 * summarizing text, drafting document outlines, and brainstorming ideas. Users ask questions of Amazon Q Business and
 * get answers that are presented in a conversational manner. For an introduction to the service, see the <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/what-is.html"> <i>Amazon Q Business User Guide</i>
 * </a>.
 * </p>
 * <p>
 * For an overview of the Amazon Q Business APIs, see <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/api-ref.html#api-overview">Overview of Amazon Q
 * Business API operations</a>.
 * </p>
 * <p>
 * For information about the IAM access control permissions you need to use this API, see <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/iam-roles.html">IAM roles for Amazon Q Business</a>
 * in the <i>Amazon Q Business User Guide</i>.
 * </p>
 * <p>
 * You can use the following AWS SDKs to access Amazon Q Business APIs:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-cpp">AWS SDK for C++</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-go">AWS SDK for Go</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-java">AWS SDK for Java</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-javascript">AWS SDK for JavaScript</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-net">AWS SDK for .NET</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/pythonsdk">AWS SDK for Python (Boto3)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-ruby">AWS SDK for Ruby</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * The following resources provide additional information about using the Amazon Q Business API:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i> <a href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/setting-up.html">Setting up for Amazon Q
 * Business</a> </i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i> <a href="https://awscli.amazonaws.com/v2/documentation/api/latest/reference/qbusiness/index.html">Amazon Q
 * Business CLI Reference</a> </i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i> <a href="https://docs.aws.amazon.com/general/latest/gr/amazonq.html">Amazon Web Services General Reference</a>
 * </i>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSQBusinessAsync extends AWSQBusiness {

    /**
     * <p>
     * Asynchronously deletes one or more documents added using the <code>BatchPutDocument</code> API from an Amazon Q
     * Business index.
     * </p>
     * <p>
     * You can see the progress of the deletion, and any error messages related to the process, by using CloudWatch.
     * </p>
     * 
     * @param batchDeleteDocumentRequest
     * @return A Java Future containing the result of the BatchDeleteDocument operation returned by the service.
     * @sample AWSQBusinessAsync.BatchDeleteDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/BatchDeleteDocument" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteDocumentResult> batchDeleteDocumentAsync(BatchDeleteDocumentRequest batchDeleteDocumentRequest);

    /**
     * <p>
     * Asynchronously deletes one or more documents added using the <code>BatchPutDocument</code> API from an Amazon Q
     * Business index.
     * </p>
     * <p>
     * You can see the progress of the deletion, and any error messages related to the process, by using CloudWatch.
     * </p>
     * 
     * @param batchDeleteDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteDocument operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.BatchDeleteDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/BatchDeleteDocument" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteDocumentResult> batchDeleteDocumentAsync(BatchDeleteDocumentRequest batchDeleteDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteDocumentRequest, BatchDeleteDocumentResult> asyncHandler);

    /**
     * <p>
     * Adds one or more documents to an Amazon Q Business index.
     * </p>
     * <p>
     * You use this API to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ingest your structured and unstructured documents and documents stored in an Amazon S3 bucket into an Amazon Q
     * Business index.
     * </p>
     * </li>
     * <li>
     * <p>
     * add custom attributes to documents in an Amazon Q Business index.
     * </p>
     * </li>
     * <li>
     * <p>
     * attach an access control list to the documents added to an Amazon Q Business index.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can see the progress of the deletion, and any error messages related to the process, by using CloudWatch.
     * </p>
     * 
     * @param batchPutDocumentRequest
     * @return A Java Future containing the result of the BatchPutDocument operation returned by the service.
     * @sample AWSQBusinessAsync.BatchPutDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/BatchPutDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchPutDocumentResult> batchPutDocumentAsync(BatchPutDocumentRequest batchPutDocumentRequest);

    /**
     * <p>
     * Adds one or more documents to an Amazon Q Business index.
     * </p>
     * <p>
     * You use this API to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ingest your structured and unstructured documents and documents stored in an Amazon S3 bucket into an Amazon Q
     * Business index.
     * </p>
     * </li>
     * <li>
     * <p>
     * add custom attributes to documents in an Amazon Q Business index.
     * </p>
     * </li>
     * <li>
     * <p>
     * attach an access control list to the documents added to an Amazon Q Business index.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can see the progress of the deletion, and any error messages related to the process, by using CloudWatch.
     * </p>
     * 
     * @param batchPutDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchPutDocument operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.BatchPutDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/BatchPutDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchPutDocumentResult> batchPutDocumentAsync(BatchPutDocumentRequest batchPutDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<BatchPutDocumentRequest, BatchPutDocumentResult> asyncHandler);

    /**
     * <p>
     * Starts or continues a non-streaming Amazon Q Business conversation.
     * </p>
     * 
     * @param chatSyncRequest
     * @return A Java Future containing the result of the ChatSync operation returned by the service.
     * @sample AWSQBusinessAsync.ChatSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ChatSync" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ChatSyncResult> chatSyncAsync(ChatSyncRequest chatSyncRequest);

    /**
     * <p>
     * Starts or continues a non-streaming Amazon Q Business conversation.
     * </p>
     * 
     * @param chatSyncRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ChatSync operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.ChatSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ChatSync" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ChatSyncResult> chatSyncAsync(ChatSyncRequest chatSyncRequest,
            com.amazonaws.handlers.AsyncHandler<ChatSyncRequest, ChatSyncResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Q Business application.
     * </p>
     * <note>
     * <p>
     * There are new tiers for Amazon Q Business. Not all features in Amazon Q Business Pro are also available in Amazon
     * Q Business Lite. For information on what's included in Amazon Q Business Lite and what's included in Amazon Q
     * Business Pro, see <a href="https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/what-is.html#tiers">Amazon Q
     * Business tiers</a>. You must use the Amazon Q Business console to assign subscription tiers to users.
     * </p>
     * </note>
     * 
     * @param createApplicationRequest
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSQBusinessAsync.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates an Amazon Q Business application.
     * </p>
     * <note>
     * <p>
     * There are new tiers for Amazon Q Business. Not all features in Amazon Q Business Pro are also available in Amazon
     * Q Business Lite. For information on what's included in Amazon Q Business Lite and what's included in Amazon Q
     * Business Pro, see <a href="https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/what-is.html#tiers">Amazon Q
     * Business tiers</a>. You must use the Amazon Q Business console to assign subscription tiers to users.
     * </p>
     * </note>
     * 
     * @param createApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Q Business index.
     * </p>
     * <p>
     * To determine if index creation has completed, check the <code>Status</code> field returned from a call to
     * <code>DescribeIndex</code>. The <code>Status</code> field is set to <code>ACTIVE</code> when the index is ready
     * to use.
     * </p>
     * <p>
     * Once the index is active, you can index your documents using the <a
     * href="https://docs.aws.amazon.com/amazonq/latest/api-reference/API_BatchPutDocument.html">
     * <code>BatchPutDocument</code> </a> API or the <a
     * href="https://docs.aws.amazon.com/amazonq/latest/api-reference/API_CreateDataSource.html">
     * <code>CreateDataSource</code> </a> API.
     * </p>
     * 
     * @param createIndexRequest
     * @return A Java Future containing the result of the CreateIndex operation returned by the service.
     * @sample AWSQBusinessAsync.CreateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIndexResult> createIndexAsync(CreateIndexRequest createIndexRequest);

    /**
     * <p>
     * Creates an Amazon Q Business index.
     * </p>
     * <p>
     * To determine if index creation has completed, check the <code>Status</code> field returned from a call to
     * <code>DescribeIndex</code>. The <code>Status</code> field is set to <code>ACTIVE</code> when the index is ready
     * to use.
     * </p>
     * <p>
     * Once the index is active, you can index your documents using the <a
     * href="https://docs.aws.amazon.com/amazonq/latest/api-reference/API_BatchPutDocument.html">
     * <code>BatchPutDocument</code> </a> API or the <a
     * href="https://docs.aws.amazon.com/amazonq/latest/api-reference/API_CreateDataSource.html">
     * <code>CreateDataSource</code> </a> API.
     * </p>
     * 
     * @param createIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIndex operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.CreateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIndexResult> createIndexAsync(CreateIndexRequest createIndexRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIndexRequest, CreateIndexResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Q Business plugin.
     * </p>
     * 
     * @param createPluginRequest
     * @return A Java Future containing the result of the CreatePlugin operation returned by the service.
     * @sample AWSQBusinessAsync.CreatePlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreatePlugin" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePluginResult> createPluginAsync(CreatePluginRequest createPluginRequest);

    /**
     * <p>
     * Creates an Amazon Q Business plugin.
     * </p>
     * 
     * @param createPluginRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePlugin operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.CreatePlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreatePlugin" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePluginResult> createPluginAsync(CreatePluginRequest createPluginRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePluginRequest, CreatePluginResult> asyncHandler);

    /**
     * <p>
     * Adds a retriever to your Amazon Q Business application.
     * </p>
     * 
     * @param createRetrieverRequest
     * @return A Java Future containing the result of the CreateRetriever operation returned by the service.
     * @sample AWSQBusinessAsync.CreateRetriever
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateRetriever" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRetrieverResult> createRetrieverAsync(CreateRetrieverRequest createRetrieverRequest);

    /**
     * <p>
     * Adds a retriever to your Amazon Q Business application.
     * </p>
     * 
     * @param createRetrieverRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRetriever operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.CreateRetriever
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateRetriever" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRetrieverResult> createRetrieverAsync(CreateRetrieverRequest createRetrieverRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRetrieverRequest, CreateRetrieverResult> asyncHandler);

    /**
     * <p>
     * Creates a universally unique identifier (UUID) mapped to a list of local user ids within an application.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AWSQBusinessAsync.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates a universally unique identifier (UUID) mapped to a list of local user ids within an application.
     * </p>
     * 
     * @param createUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Q Business web experience.
     * </p>
     * 
     * @param createWebExperienceRequest
     * @return A Java Future containing the result of the CreateWebExperience operation returned by the service.
     * @sample AWSQBusinessAsync.CreateWebExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateWebExperience" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWebExperienceResult> createWebExperienceAsync(CreateWebExperienceRequest createWebExperienceRequest);

    /**
     * <p>
     * Creates an Amazon Q Business web experience.
     * </p>
     * 
     * @param createWebExperienceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWebExperience operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.CreateWebExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateWebExperience" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWebExperienceResult> createWebExperienceAsync(CreateWebExperienceRequest createWebExperienceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWebExperienceRequest, CreateWebExperienceResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Q Business application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSQBusinessAsync.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes an Amazon Q Business application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes chat controls configured for an existing Amazon Q Business application.
     * </p>
     * 
     * @param deleteChatControlsConfigurationRequest
     * @return A Java Future containing the result of the DeleteChatControlsConfiguration operation returned by the
     *         service.
     * @sample AWSQBusinessAsync.DeleteChatControlsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteChatControlsConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChatControlsConfigurationResult> deleteChatControlsConfigurationAsync(
            DeleteChatControlsConfigurationRequest deleteChatControlsConfigurationRequest);

    /**
     * <p>
     * Deletes chat controls configured for an existing Amazon Q Business application.
     * </p>
     * 
     * @param deleteChatControlsConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChatControlsConfiguration operation returned by the
     *         service.
     * @sample AWSQBusinessAsyncHandler.DeleteChatControlsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteChatControlsConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChatControlsConfigurationResult> deleteChatControlsConfigurationAsync(
            DeleteChatControlsConfigurationRequest deleteChatControlsConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChatControlsConfigurationRequest, DeleteChatControlsConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Q Business web experience conversation.
     * </p>
     * 
     * @param deleteConversationRequest
     * @return A Java Future containing the result of the DeleteConversation operation returned by the service.
     * @sample AWSQBusinessAsync.DeleteConversation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteConversation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConversationResult> deleteConversationAsync(DeleteConversationRequest deleteConversationRequest);

    /**
     * <p>
     * Deletes an Amazon Q Business web experience conversation.
     * </p>
     * 
     * @param deleteConversationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConversation operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.DeleteConversation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteConversation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConversationResult> deleteConversationAsync(DeleteConversationRequest deleteConversationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConversationRequest, DeleteConversationResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Q Business data source connector. While the data source is being deleted, the
     * <code>Status</code> field returned by a call to the <code>DescribeDataSource</code> API is set to
     * <code>DELETING</code>.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return A Java Future containing the result of the DeleteDataSource operation returned by the service.
     * @sample AWSQBusinessAsync.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest deleteDataSourceRequest);

    /**
     * <p>
     * Deletes an Amazon Q Business data source connector. While the data source is being deleted, the
     * <code>Status</code> field returned by a call to the <code>DescribeDataSource</code> API is set to
     * <code>DELETING</code>.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataSource operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest deleteDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler);

    /**
     * <p>
     * Deletes a group so that all users and sub groups that belong to the group can no longer access documents only
     * available to that group. For example, after deleting the group "Summer Interns", all interns who belonged to that
     * group no longer see intern-only documents in their chat results.
     * </p>
     * <p>
     * If you want to delete, update, or replace users or sub groups of a group, you need to use the
     * <code>PutGroup</code> operation. For example, if a user in the group "Engineering" leaves the engineering team
     * and another user takes their place, you provide an updated list of users or sub groups that belong to the
     * "Engineering" group when calling <code>PutGroup</code>.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AWSQBusinessAsync.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Deletes a group so that all users and sub groups that belong to the group can no longer access documents only
     * available to that group. For example, after deleting the group "Summer Interns", all interns who belonged to that
     * group no longer see intern-only documents in their chat results.
     * </p>
     * <p>
     * If you want to delete, update, or replace users or sub groups of a group, you need to use the
     * <code>PutGroup</code> operation. For example, if a user in the group "Engineering" leaves the engineering team
     * and another user takes their place, you provide an updated list of users or sub groups that belong to the
     * "Engineering" group when calling <code>PutGroup</code>.
     * </p>
     * 
     * @param deleteGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Q Business index.
     * </p>
     * 
     * @param deleteIndexRequest
     * @return A Java Future containing the result of the DeleteIndex operation returned by the service.
     * @sample AWSQBusinessAsync.DeleteIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIndexResult> deleteIndexAsync(DeleteIndexRequest deleteIndexRequest);

    /**
     * <p>
     * Deletes an Amazon Q Business index.
     * </p>
     * 
     * @param deleteIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIndex operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.DeleteIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIndexResult> deleteIndexAsync(DeleteIndexRequest deleteIndexRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIndexRequest, DeleteIndexResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Q Business plugin.
     * </p>
     * 
     * @param deletePluginRequest
     * @return A Java Future containing the result of the DeletePlugin operation returned by the service.
     * @sample AWSQBusinessAsync.DeletePlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeletePlugin" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePluginResult> deletePluginAsync(DeletePluginRequest deletePluginRequest);

    /**
     * <p>
     * Deletes an Amazon Q Business plugin.
     * </p>
     * 
     * @param deletePluginRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePlugin operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.DeletePlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeletePlugin" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePluginResult> deletePluginAsync(DeletePluginRequest deletePluginRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePluginRequest, DeletePluginResult> asyncHandler);

    /**
     * <p>
     * Deletes the retriever used by an Amazon Q Business application.
     * </p>
     * 
     * @param deleteRetrieverRequest
     * @return A Java Future containing the result of the DeleteRetriever operation returned by the service.
     * @sample AWSQBusinessAsync.DeleteRetriever
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteRetriever" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRetrieverResult> deleteRetrieverAsync(DeleteRetrieverRequest deleteRetrieverRequest);

    /**
     * <p>
     * Deletes the retriever used by an Amazon Q Business application.
     * </p>
     * 
     * @param deleteRetrieverRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRetriever operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.DeleteRetriever
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteRetriever" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRetrieverResult> deleteRetrieverAsync(DeleteRetrieverRequest deleteRetrieverRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRetrieverRequest, DeleteRetrieverResult> asyncHandler);

    /**
     * <p>
     * Deletes a user by email id.
     * </p>
     * 
     * @param deleteUserRequest
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AWSQBusinessAsync.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes a user by email id.
     * </p>
     * 
     * @param deleteUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Q Business web experience.
     * </p>
     * 
     * @param deleteWebExperienceRequest
     * @return A Java Future containing the result of the DeleteWebExperience operation returned by the service.
     * @sample AWSQBusinessAsync.DeleteWebExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteWebExperience" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWebExperienceResult> deleteWebExperienceAsync(DeleteWebExperienceRequest deleteWebExperienceRequest);

    /**
     * <p>
     * Deletes an Amazon Q Business web experience.
     * </p>
     * 
     * @param deleteWebExperienceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWebExperience operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.DeleteWebExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteWebExperience" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWebExperienceResult> deleteWebExperienceAsync(DeleteWebExperienceRequest deleteWebExperienceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWebExperienceRequest, DeleteWebExperienceResult> asyncHandler);

    /**
     * <p>
     * Gets information about an existing Amazon Q Business application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AWSQBusinessAsync.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Gets information about an existing Amazon Q Business application.
     * </p>
     * 
     * @param getApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler);

    /**
     * <p>
     * Gets information about an chat controls configured for an existing Amazon Q Business application.
     * </p>
     * 
     * @param getChatControlsConfigurationRequest
     * @return A Java Future containing the result of the GetChatControlsConfiguration operation returned by the
     *         service.
     * @sample AWSQBusinessAsync.GetChatControlsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetChatControlsConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetChatControlsConfigurationResult> getChatControlsConfigurationAsync(
            GetChatControlsConfigurationRequest getChatControlsConfigurationRequest);

    /**
     * <p>
     * Gets information about an chat controls configured for an existing Amazon Q Business application.
     * </p>
     * 
     * @param getChatControlsConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChatControlsConfiguration operation returned by the
     *         service.
     * @sample AWSQBusinessAsyncHandler.GetChatControlsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetChatControlsConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetChatControlsConfigurationResult> getChatControlsConfigurationAsync(
            GetChatControlsConfigurationRequest getChatControlsConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetChatControlsConfigurationRequest, GetChatControlsConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets information about an existing Amazon Q Business data source connector.
     * </p>
     * 
     * @param getDataSourceRequest
     * @return A Java Future containing the result of the GetDataSource operation returned by the service.
     * @sample AWSQBusinessAsync.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest getDataSourceRequest);

    /**
     * <p>
     * Gets information about an existing Amazon Q Business data source connector.
     * </p>
     * 
     * @param getDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataSource operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest getDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataSourceRequest, GetDataSourceResult> asyncHandler);

    /**
     * <p>
     * Describes a group by group name.
     * </p>
     * 
     * @param getGroupRequest
     * @return A Java Future containing the result of the GetGroup operation returned by the service.
     * @sample AWSQBusinessAsync.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest getGroupRequest);

    /**
     * <p>
     * Describes a group by group name.
     * </p>
     * 
     * @param getGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroup operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest getGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupRequest, GetGroupResult> asyncHandler);

    /**
     * <p>
     * Gets information about an existing Amazon Q Business index.
     * </p>
     * 
     * @param getIndexRequest
     * @return A Java Future containing the result of the GetIndex operation returned by the service.
     * @sample AWSQBusinessAsync.GetIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIndexResult> getIndexAsync(GetIndexRequest getIndexRequest);

    /**
     * <p>
     * Gets information about an existing Amazon Q Business index.
     * </p>
     * 
     * @param getIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIndex operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.GetIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIndexResult> getIndexAsync(GetIndexRequest getIndexRequest,
            com.amazonaws.handlers.AsyncHandler<GetIndexRequest, GetIndexResult> asyncHandler);

    /**
     * <p>
     * Gets information about an existing Amazon Q Business plugin.
     * </p>
     * 
     * @param getPluginRequest
     * @return A Java Future containing the result of the GetPlugin operation returned by the service.
     * @sample AWSQBusinessAsync.GetPlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetPlugin" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPluginResult> getPluginAsync(GetPluginRequest getPluginRequest);

    /**
     * <p>
     * Gets information about an existing Amazon Q Business plugin.
     * </p>
     * 
     * @param getPluginRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPlugin operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.GetPlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetPlugin" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPluginResult> getPluginAsync(GetPluginRequest getPluginRequest,
            com.amazonaws.handlers.AsyncHandler<GetPluginRequest, GetPluginResult> asyncHandler);

    /**
     * <p>
     * Gets information about an existing retriever used by an Amazon Q Business application.
     * </p>
     * 
     * @param getRetrieverRequest
     * @return A Java Future containing the result of the GetRetriever operation returned by the service.
     * @sample AWSQBusinessAsync.GetRetriever
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetRetriever" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRetrieverResult> getRetrieverAsync(GetRetrieverRequest getRetrieverRequest);

    /**
     * <p>
     * Gets information about an existing retriever used by an Amazon Q Business application.
     * </p>
     * 
     * @param getRetrieverRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRetriever operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.GetRetriever
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetRetriever" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRetrieverResult> getRetrieverAsync(GetRetrieverRequest getRetrieverRequest,
            com.amazonaws.handlers.AsyncHandler<GetRetrieverRequest, GetRetrieverResult> asyncHandler);

    /**
     * <p>
     * Describes the universally unique identifier (UUID) associated with a local user in a data source.
     * </p>
     * 
     * @param getUserRequest
     * @return A Java Future containing the result of the GetUser operation returned by the service.
     * @sample AWSQBusinessAsync.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUserResult> getUserAsync(GetUserRequest getUserRequest);

    /**
     * <p>
     * Describes the universally unique identifier (UUID) associated with a local user in a data source.
     * </p>
     * 
     * @param getUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUser operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUserResult> getUserAsync(GetUserRequest getUserRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserRequest, GetUserResult> asyncHandler);

    /**
     * <p>
     * Gets information about an existing Amazon Q Business web experience.
     * </p>
     * 
     * @param getWebExperienceRequest
     * @return A Java Future containing the result of the GetWebExperience operation returned by the service.
     * @sample AWSQBusinessAsync.GetWebExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetWebExperience" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWebExperienceResult> getWebExperienceAsync(GetWebExperienceRequest getWebExperienceRequest);

    /**
     * <p>
     * Gets information about an existing Amazon Q Business web experience.
     * </p>
     * 
     * @param getWebExperienceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWebExperience operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.GetWebExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetWebExperience" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWebExperienceResult> getWebExperienceAsync(GetWebExperienceRequest getWebExperienceRequest,
            com.amazonaws.handlers.AsyncHandler<GetWebExperienceRequest, GetWebExperienceResult> asyncHandler);

    /**
     * <p>
     * Lists Amazon Q Business applications.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSQBusinessAsync.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists Amazon Q Business applications.
     * </p>
     * 
     * @param listApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler);

    /**
     * <p>
     * Lists one or more Amazon Q Business conversations.
     * </p>
     * 
     * @param listConversationsRequest
     * @return A Java Future containing the result of the ListConversations operation returned by the service.
     * @sample AWSQBusinessAsync.ListConversations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListConversations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListConversationsResult> listConversationsAsync(ListConversationsRequest listConversationsRequest);

    /**
     * <p>
     * Lists one or more Amazon Q Business conversations.
     * </p>
     * 
     * @param listConversationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConversations operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.ListConversations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListConversations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListConversationsResult> listConversationsAsync(ListConversationsRequest listConversationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConversationsRequest, ListConversationsResult> asyncHandler);

    /**
     * <p>
     * Get information about an Amazon Q Business data source connector synchronization.
     * </p>
     * 
     * @param listDataSourceSyncJobsRequest
     * @return A Java Future containing the result of the ListDataSourceSyncJobs operation returned by the service.
     * @sample AWSQBusinessAsync.ListDataSourceSyncJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListDataSourceSyncJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourceSyncJobsResult> listDataSourceSyncJobsAsync(ListDataSourceSyncJobsRequest listDataSourceSyncJobsRequest);

    /**
     * <p>
     * Get information about an Amazon Q Business data source connector synchronization.
     * </p>
     * 
     * @param listDataSourceSyncJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataSourceSyncJobs operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.ListDataSourceSyncJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListDataSourceSyncJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourceSyncJobsResult> listDataSourceSyncJobsAsync(ListDataSourceSyncJobsRequest listDataSourceSyncJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataSourceSyncJobsRequest, ListDataSourceSyncJobsResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon Q Business data source connectors that you have created.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return A Java Future containing the result of the ListDataSources operation returned by the service.
     * @sample AWSQBusinessAsync.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest listDataSourcesRequest);

    /**
     * <p>
     * Lists the Amazon Q Business data source connectors that you have created.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataSources operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest listDataSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataSourcesRequest, ListDataSourcesResult> asyncHandler);

    /**
     * <p>
     * A list of documents attached to an index.
     * </p>
     * 
     * @param listDocumentsRequest
     * @return A Java Future containing the result of the ListDocuments operation returned by the service.
     * @sample AWSQBusinessAsync.ListDocuments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListDocuments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(ListDocumentsRequest listDocumentsRequest);

    /**
     * <p>
     * A list of documents attached to an index.
     * </p>
     * 
     * @param listDocumentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDocuments operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.ListDocuments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListDocuments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(ListDocumentsRequest listDocumentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler);

    /**
     * <p>
     * Provides a list of groups that are mapped to users.
     * </p>
     * 
     * @param listGroupsRequest
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AWSQBusinessAsync.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest);

    /**
     * <p>
     * Provides a list of groups that are mapped to users.
     * </p>
     * 
     * @param listGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon Q Business indices you have created.
     * </p>
     * 
     * @param listIndicesRequest
     * @return A Java Future containing the result of the ListIndices operation returned by the service.
     * @sample AWSQBusinessAsync.ListIndices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListIndices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIndicesResult> listIndicesAsync(ListIndicesRequest listIndicesRequest);

    /**
     * <p>
     * Lists the Amazon Q Business indices you have created.
     * </p>
     * 
     * @param listIndicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIndices operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.ListIndices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListIndices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIndicesResult> listIndicesAsync(ListIndicesRequest listIndicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListIndicesRequest, ListIndicesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of messages associated with an Amazon Q Business web experience.
     * </p>
     * 
     * @param listMessagesRequest
     * @return A Java Future containing the result of the ListMessages operation returned by the service.
     * @sample AWSQBusinessAsync.ListMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListMessages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMessagesResult> listMessagesAsync(ListMessagesRequest listMessagesRequest);

    /**
     * <p>
     * Gets a list of messages associated with an Amazon Q Business web experience.
     * </p>
     * 
     * @param listMessagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMessages operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.ListMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListMessages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMessagesResult> listMessagesAsync(ListMessagesRequest listMessagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMessagesRequest, ListMessagesResult> asyncHandler);

    /**
     * <p>
     * Lists configured Amazon Q Business plugins.
     * </p>
     * 
     * @param listPluginsRequest
     * @return A Java Future containing the result of the ListPlugins operation returned by the service.
     * @sample AWSQBusinessAsync.ListPlugins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListPlugins" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPluginsResult> listPluginsAsync(ListPluginsRequest listPluginsRequest);

    /**
     * <p>
     * Lists configured Amazon Q Business plugins.
     * </p>
     * 
     * @param listPluginsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPlugins operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.ListPlugins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListPlugins" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPluginsResult> listPluginsAsync(ListPluginsRequest listPluginsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPluginsRequest, ListPluginsResult> asyncHandler);

    /**
     * <p>
     * Lists the retriever used by an Amazon Q Business application.
     * </p>
     * 
     * @param listRetrieversRequest
     * @return A Java Future containing the result of the ListRetrievers operation returned by the service.
     * @sample AWSQBusinessAsync.ListRetrievers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListRetrievers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRetrieversResult> listRetrieversAsync(ListRetrieversRequest listRetrieversRequest);

    /**
     * <p>
     * Lists the retriever used by an Amazon Q Business application.
     * </p>
     * 
     * @param listRetrieversRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRetrievers operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.ListRetrievers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListRetrievers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRetrieversResult> listRetrieversAsync(ListRetrieversRequest listRetrieversRequest,
            com.amazonaws.handlers.AsyncHandler<ListRetrieversRequest, ListRetrieversResult> asyncHandler);

    /**
     * <p>
     * Gets a list of tags associated with a specified resource. Amazon Q Business applications and data sources can
     * have tags associated with them.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSQBusinessAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Gets a list of tags associated with a specified resource. Amazon Q Business applications and data sources can
     * have tags associated with them.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists one or more Amazon Q Business Web Experiences.
     * </p>
     * 
     * @param listWebExperiencesRequest
     * @return A Java Future containing the result of the ListWebExperiences operation returned by the service.
     * @sample AWSQBusinessAsync.ListWebExperiences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListWebExperiences" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListWebExperiencesResult> listWebExperiencesAsync(ListWebExperiencesRequest listWebExperiencesRequest);

    /**
     * <p>
     * Lists one or more Amazon Q Business Web Experiences.
     * </p>
     * 
     * @param listWebExperiencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWebExperiences operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.ListWebExperiences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListWebExperiences" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListWebExperiencesResult> listWebExperiencesAsync(ListWebExperiencesRequest listWebExperiencesRequest,
            com.amazonaws.handlers.AsyncHandler<ListWebExperiencesRequest, ListWebExperiencesResult> asyncHandler);

    /**
     * <p>
     * Enables your end user to provide feedback on their Amazon Q Business generated chat responses.
     * </p>
     * 
     * @param putFeedbackRequest
     * @return A Java Future containing the result of the PutFeedback operation returned by the service.
     * @sample AWSQBusinessAsync.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest putFeedbackRequest);

    /**
     * <p>
     * Enables your end user to provide feedback on their Amazon Q Business generated chat responses.
     * </p>
     * 
     * @param putFeedbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutFeedback operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest putFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<PutFeedbackRequest, PutFeedbackResult> asyncHandler);

    /**
     * <p>
     * Create, or updates, a mapping of users—who have access to a document—to groups.
     * </p>
     * <p>
     * You can also map sub groups to groups. For example, the group "Company Intellectual Property Teams" includes sub
     * groups "Research" and "Engineering". These sub groups include their own list of users or people who work in these
     * teams. Only users who work in research and engineering, and therefore belong in the intellectual property group,
     * can see top-secret company documents in their Amazon Q Business chat results.
     * </p>
     * 
     * @param putGroupRequest
     * @return A Java Future containing the result of the PutGroup operation returned by the service.
     * @sample AWSQBusinessAsync.PutGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/PutGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutGroupResult> putGroupAsync(PutGroupRequest putGroupRequest);

    /**
     * <p>
     * Create, or updates, a mapping of users—who have access to a document—to groups.
     * </p>
     * <p>
     * You can also map sub groups to groups. For example, the group "Company Intellectual Property Teams" includes sub
     * groups "Research" and "Engineering". These sub groups include their own list of users or people who work in these
     * teams. Only users who work in research and engineering, and therefore belong in the intellectual property group,
     * can see top-secret company documents in their Amazon Q Business chat results.
     * </p>
     * 
     * @param putGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutGroup operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.PutGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/PutGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutGroupResult> putGroupAsync(PutGroupRequest putGroupRequest,
            com.amazonaws.handlers.AsyncHandler<PutGroupRequest, PutGroupResult> asyncHandler);

    /**
     * <p>
     * Starts a data source connector synchronization job. If a synchronization job is already in progress, Amazon Q
     * Business returns a <code>ConflictException</code>.
     * </p>
     * 
     * @param startDataSourceSyncJobRequest
     * @return A Java Future containing the result of the StartDataSourceSyncJob operation returned by the service.
     * @sample AWSQBusinessAsync.StartDataSourceSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/StartDataSourceSyncJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDataSourceSyncJobResult> startDataSourceSyncJobAsync(StartDataSourceSyncJobRequest startDataSourceSyncJobRequest);

    /**
     * <p>
     * Starts a data source connector synchronization job. If a synchronization job is already in progress, Amazon Q
     * Business returns a <code>ConflictException</code>.
     * </p>
     * 
     * @param startDataSourceSyncJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDataSourceSyncJob operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.StartDataSourceSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/StartDataSourceSyncJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDataSourceSyncJobResult> startDataSourceSyncJobAsync(StartDataSourceSyncJobRequest startDataSourceSyncJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartDataSourceSyncJobRequest, StartDataSourceSyncJobResult> asyncHandler);

    /**
     * <p>
     * Stops an Amazon Q Business data source connector synchronization job already in progress.
     * </p>
     * 
     * @param stopDataSourceSyncJobRequest
     * @return A Java Future containing the result of the StopDataSourceSyncJob operation returned by the service.
     * @sample AWSQBusinessAsync.StopDataSourceSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/StopDataSourceSyncJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopDataSourceSyncJobResult> stopDataSourceSyncJobAsync(StopDataSourceSyncJobRequest stopDataSourceSyncJobRequest);

    /**
     * <p>
     * Stops an Amazon Q Business data source connector synchronization job already in progress.
     * </p>
     * 
     * @param stopDataSourceSyncJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopDataSourceSyncJob operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.StopDataSourceSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/StopDataSourceSyncJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopDataSourceSyncJobResult> stopDataSourceSyncJobAsync(StopDataSourceSyncJobRequest stopDataSourceSyncJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopDataSourceSyncJobRequest, StopDataSourceSyncJobResult> asyncHandler);

    /**
     * <p>
     * Adds the specified tag to the specified Amazon Q Business application or data source resource. If the tag already
     * exists, the existing value is replaced with the new value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSQBusinessAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds the specified tag to the specified Amazon Q Business application or data source resource. If the tag already
     * exists, the existing value is replaced with the new value.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from an Amazon Q Business application or a data source.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSQBusinessAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from an Amazon Q Business application or a data source.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Amazon Q Business application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSQBusinessAsync.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates an existing Amazon Q Business application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler);

    /**
     * <p>
     * Updates an set of chat controls configured for an existing Amazon Q Business application.
     * </p>
     * 
     * @param updateChatControlsConfigurationRequest
     * @return A Java Future containing the result of the UpdateChatControlsConfiguration operation returned by the
     *         service.
     * @sample AWSQBusinessAsync.UpdateChatControlsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateChatControlsConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChatControlsConfigurationResult> updateChatControlsConfigurationAsync(
            UpdateChatControlsConfigurationRequest updateChatControlsConfigurationRequest);

    /**
     * <p>
     * Updates an set of chat controls configured for an existing Amazon Q Business application.
     * </p>
     * 
     * @param updateChatControlsConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChatControlsConfiguration operation returned by the
     *         service.
     * @sample AWSQBusinessAsyncHandler.UpdateChatControlsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateChatControlsConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChatControlsConfigurationResult> updateChatControlsConfigurationAsync(
            UpdateChatControlsConfigurationRequest updateChatControlsConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChatControlsConfigurationRequest, UpdateChatControlsConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Amazon Q Business data source connector.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return A Java Future containing the result of the UpdateDataSource operation returned by the service.
     * @sample AWSQBusinessAsync.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest updateDataSourceRequest);

    /**
     * <p>
     * Updates an existing Amazon Q Business data source connector.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataSource operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest updateDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler);

    /**
     * <p>
     * Updates an Amazon Q Business index.
     * </p>
     * 
     * @param updateIndexRequest
     * @return A Java Future containing the result of the UpdateIndex operation returned by the service.
     * @sample AWSQBusinessAsync.UpdateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIndexResult> updateIndexAsync(UpdateIndexRequest updateIndexRequest);

    /**
     * <p>
     * Updates an Amazon Q Business index.
     * </p>
     * 
     * @param updateIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIndex operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.UpdateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIndexResult> updateIndexAsync(UpdateIndexRequest updateIndexRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIndexRequest, UpdateIndexResult> asyncHandler);

    /**
     * <p>
     * Updates an Amazon Q Business plugin.
     * </p>
     * 
     * @param updatePluginRequest
     * @return A Java Future containing the result of the UpdatePlugin operation returned by the service.
     * @sample AWSQBusinessAsync.UpdatePlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdatePlugin" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePluginResult> updatePluginAsync(UpdatePluginRequest updatePluginRequest);

    /**
     * <p>
     * Updates an Amazon Q Business plugin.
     * </p>
     * 
     * @param updatePluginRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePlugin operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.UpdatePlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdatePlugin" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePluginResult> updatePluginAsync(UpdatePluginRequest updatePluginRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePluginRequest, UpdatePluginResult> asyncHandler);

    /**
     * <p>
     * Updates the retriever used for your Amazon Q Business application.
     * </p>
     * 
     * @param updateRetrieverRequest
     * @return A Java Future containing the result of the UpdateRetriever operation returned by the service.
     * @sample AWSQBusinessAsync.UpdateRetriever
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateRetriever" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRetrieverResult> updateRetrieverAsync(UpdateRetrieverRequest updateRetrieverRequest);

    /**
     * <p>
     * Updates the retriever used for your Amazon Q Business application.
     * </p>
     * 
     * @param updateRetrieverRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRetriever operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.UpdateRetriever
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateRetriever" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRetrieverResult> updateRetrieverAsync(UpdateRetrieverRequest updateRetrieverRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRetrieverRequest, UpdateRetrieverResult> asyncHandler);

    /**
     * <p>
     * Updates a information associated with a user id.
     * </p>
     * 
     * @param updateUserRequest
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AWSQBusinessAsync.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest);

    /**
     * <p>
     * Updates a information associated with a user id.
     * </p>
     * 
     * @param updateUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler);

    /**
     * <p>
     * Updates an Amazon Q Business web experience.
     * </p>
     * 
     * @param updateWebExperienceRequest
     * @return A Java Future containing the result of the UpdateWebExperience operation returned by the service.
     * @sample AWSQBusinessAsync.UpdateWebExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateWebExperience" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWebExperienceResult> updateWebExperienceAsync(UpdateWebExperienceRequest updateWebExperienceRequest);

    /**
     * <p>
     * Updates an Amazon Q Business web experience.
     * </p>
     * 
     * @param updateWebExperienceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWebExperience operation returned by the service.
     * @sample AWSQBusinessAsyncHandler.UpdateWebExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateWebExperience" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWebExperienceResult> updateWebExperienceAsync(UpdateWebExperienceRequest updateWebExperienceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWebExperienceRequest, UpdateWebExperienceResult> asyncHandler);

}

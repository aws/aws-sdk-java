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
package com.amazonaws.services.qconnect;

import javax.annotation.Generated;

import com.amazonaws.services.qconnect.model.*;

/**
 * Interface for accessing Amazon Q Connect asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.qconnect.AbstractAmazonQConnectAsync} instead.
 * </p>
 * <p>
 * <note>
 * <p>
 * <b>Powered by Amazon Bedrock</b>: Amazon Web Services implements <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/abuse-detection.html">automated abuse detection</a>.
 * Because Amazon Q in Connect is built on Amazon Bedrock, users can take full advantage of the controls implemented in
 * Amazon Bedrock to enforce safety, security, and the responsible use of artificial intelligence (AI).
 * </p>
 * </note>
 * <p>
 * Amazon Q in Connect is a generative AI customer service assistant. It is an LLM-enhanced evolution of Amazon Connect
 * Wisdom that delivers real-time recommendations to help contact center agents resolve customer issues quickly and
 * accurately.
 * </p>
 * <p>
 * Amazon Q in Connect automatically detects customer intent during calls and chats using conversational analytics and
 * natural language understanding (NLU). It then provides agents with immediate, real-time generative responses and
 * suggested actions, and links to relevant documents and articles. Agents can also query Amazon Q in Connect directly
 * using natural language or keywords to answer customer requests.
 * </p>
 * <p>
 * Use the Amazon Q in Connect APIs to create an assistant and a knowledge base, for example, or manage content by
 * uploading custom files.
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-q-connect.html">Use
 * Amazon Q in Connect for generative AI powered agent assistance in real-time</a> in the <i>Amazon Connect
 * Administrator Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonQConnectAsync extends AmazonQConnect {

    /**
     * <p>
     * Creates an Amazon Q in Connect assistant.
     * </p>
     * 
     * @param createAssistantRequest
     * @return A Java Future containing the result of the CreateAssistant operation returned by the service.
     * @sample AmazonQConnectAsync.CreateAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAssistantResult> createAssistantAsync(CreateAssistantRequest createAssistantRequest);

    /**
     * <p>
     * Creates an Amazon Q in Connect assistant.
     * </p>
     * 
     * @param createAssistantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAssistant operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.CreateAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAssistantResult> createAssistantAsync(CreateAssistantRequest createAssistantRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssistantRequest, CreateAssistantResult> asyncHandler);

    /**
     * <p>
     * Creates an association between an Amazon Q in Connect assistant and another resource. Currently, the only
     * supported association is with a knowledge base. An assistant can have only a single association.
     * </p>
     * 
     * @param createAssistantAssociationRequest
     * @return A Java Future containing the result of the CreateAssistantAssociation operation returned by the service.
     * @sample AmazonQConnectAsync.CreateAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateAssistantAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAssistantAssociationResult> createAssistantAssociationAsync(
            CreateAssistantAssociationRequest createAssistantAssociationRequest);

    /**
     * <p>
     * Creates an association between an Amazon Q in Connect assistant and another resource. Currently, the only
     * supported association is with a knowledge base. An assistant can have only a single association.
     * </p>
     * 
     * @param createAssistantAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAssistantAssociation operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.CreateAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateAssistantAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAssistantAssociationResult> createAssistantAssociationAsync(
            CreateAssistantAssociationRequest createAssistantAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssistantAssociationRequest, CreateAssistantAssociationResult> asyncHandler);

    /**
     * <p>
     * Creates Amazon Q in Connect content. Before to calling this API, use <a
     * href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_StartContentUpload.html"
     * >StartContentUpload</a> to upload an asset.
     * </p>
     * 
     * @param createContentRequest
     * @return A Java Future containing the result of the CreateContent operation returned by the service.
     * @sample AmazonQConnectAsync.CreateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateContent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateContentResult> createContentAsync(CreateContentRequest createContentRequest);

    /**
     * <p>
     * Creates Amazon Q in Connect content. Before to calling this API, use <a
     * href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_StartContentUpload.html"
     * >StartContentUpload</a> to upload an asset.
     * </p>
     * 
     * @param createContentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateContent operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.CreateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateContent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateContentResult> createContentAsync(CreateContentRequest createContentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateContentRequest, CreateContentResult> asyncHandler);

    /**
     * <p>
     * Creates a knowledge base.
     * </p>
     * <note>
     * <p>
     * When using this API, you cannot reuse <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/Welcome.html">Amazon AppIntegrations</a>
     * DataIntegrations with external knowledge bases such as Salesforce and ServiceNow. If you do, you'll get an
     * <code>InvalidRequestException</code> error.
     * </p>
     * <p>
     * For example, you're programmatically managing your external knowledge base, and you want to add or remove one of
     * the fields that is being ingested from Salesforce. Do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Call <a href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_DeleteKnowledgeBase.html">
     * DeleteKnowledgeBase</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <a href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_DeleteDataIntegration.html">
     * DeleteDataIntegration</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <a href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html">
     * CreateDataIntegration</a> to recreate the DataIntegration or a create different one.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call CreateKnowledgeBase.
     * </p>
     * </li>
     * </ol>
     * </note>
     * 
     * @param createKnowledgeBaseRequest
     * @return A Java Future containing the result of the CreateKnowledgeBase operation returned by the service.
     * @sample AmazonQConnectAsync.CreateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateKnowledgeBase" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateKnowledgeBaseResult> createKnowledgeBaseAsync(CreateKnowledgeBaseRequest createKnowledgeBaseRequest);

    /**
     * <p>
     * Creates a knowledge base.
     * </p>
     * <note>
     * <p>
     * When using this API, you cannot reuse <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/Welcome.html">Amazon AppIntegrations</a>
     * DataIntegrations with external knowledge bases such as Salesforce and ServiceNow. If you do, you'll get an
     * <code>InvalidRequestException</code> error.
     * </p>
     * <p>
     * For example, you're programmatically managing your external knowledge base, and you want to add or remove one of
     * the fields that is being ingested from Salesforce. Do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Call <a href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_DeleteKnowledgeBase.html">
     * DeleteKnowledgeBase</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <a href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_DeleteDataIntegration.html">
     * DeleteDataIntegration</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <a href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html">
     * CreateDataIntegration</a> to recreate the DataIntegration or a create different one.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call CreateKnowledgeBase.
     * </p>
     * </li>
     * </ol>
     * </note>
     * 
     * @param createKnowledgeBaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKnowledgeBase operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.CreateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateKnowledgeBase" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateKnowledgeBaseResult> createKnowledgeBaseAsync(CreateKnowledgeBaseRequest createKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKnowledgeBaseRequest, CreateKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Q in Connect quick response.
     * </p>
     * 
     * @param createQuickResponseRequest
     * @return A Java Future containing the result of the CreateQuickResponse operation returned by the service.
     * @sample AmazonQConnectAsync.CreateQuickResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateQuickResponse" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateQuickResponseResult> createQuickResponseAsync(CreateQuickResponseRequest createQuickResponseRequest);

    /**
     * <p>
     * Creates an Amazon Q in Connect quick response.
     * </p>
     * 
     * @param createQuickResponseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateQuickResponse operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.CreateQuickResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateQuickResponse" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateQuickResponseResult> createQuickResponseAsync(CreateQuickResponseRequest createQuickResponseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateQuickResponseRequest, CreateQuickResponseResult> asyncHandler);

    /**
     * <p>
     * Creates a session. A session is a contextual container used for generating recommendations. Amazon Connect
     * creates a new Amazon Q in Connect session for each contact on which Amazon Q in Connect is enabled.
     * </p>
     * 
     * @param createSessionRequest
     * @return A Java Future containing the result of the CreateSession operation returned by the service.
     * @sample AmazonQConnectAsync.CreateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSessionResult> createSessionAsync(CreateSessionRequest createSessionRequest);

    /**
     * <p>
     * Creates a session. A session is a contextual container used for generating recommendations. Amazon Connect
     * creates a new Amazon Q in Connect session for each contact on which Amazon Q in Connect is enabled.
     * </p>
     * 
     * @param createSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSession operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.CreateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSessionResult> createSessionAsync(CreateSessionRequest createSessionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSessionRequest, CreateSessionResult> asyncHandler);

    /**
     * <p>
     * Deletes an assistant.
     * </p>
     * 
     * @param deleteAssistantRequest
     * @return A Java Future containing the result of the DeleteAssistant operation returned by the service.
     * @sample AmazonQConnectAsync.DeleteAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssistantResult> deleteAssistantAsync(DeleteAssistantRequest deleteAssistantRequest);

    /**
     * <p>
     * Deletes an assistant.
     * </p>
     * 
     * @param deleteAssistantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAssistant operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.DeleteAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssistantResult> deleteAssistantAsync(DeleteAssistantRequest deleteAssistantRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAssistantRequest, DeleteAssistantResult> asyncHandler);

    /**
     * <p>
     * Deletes an assistant association.
     * </p>
     * 
     * @param deleteAssistantAssociationRequest
     * @return A Java Future containing the result of the DeleteAssistantAssociation operation returned by the service.
     * @sample AmazonQConnectAsync.DeleteAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteAssistantAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssistantAssociationResult> deleteAssistantAssociationAsync(
            DeleteAssistantAssociationRequest deleteAssistantAssociationRequest);

    /**
     * <p>
     * Deletes an assistant association.
     * </p>
     * 
     * @param deleteAssistantAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAssistantAssociation operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.DeleteAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteAssistantAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssistantAssociationResult> deleteAssistantAssociationAsync(
            DeleteAssistantAssociationRequest deleteAssistantAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAssistantAssociationRequest, DeleteAssistantAssociationResult> asyncHandler);

    /**
     * <p>
     * Deletes the content.
     * </p>
     * 
     * @param deleteContentRequest
     * @return A Java Future containing the result of the DeleteContent operation returned by the service.
     * @sample AmazonQConnectAsync.DeleteContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteContent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteContentResult> deleteContentAsync(DeleteContentRequest deleteContentRequest);

    /**
     * <p>
     * Deletes the content.
     * </p>
     * 
     * @param deleteContentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteContent operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.DeleteContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteContent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteContentResult> deleteContentAsync(DeleteContentRequest deleteContentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteContentRequest, DeleteContentResult> asyncHandler);

    /**
     * <p>
     * Deletes the quick response import job.
     * </p>
     * 
     * @param deleteImportJobRequest
     * @return A Java Future containing the result of the DeleteImportJob operation returned by the service.
     * @sample AmazonQConnectAsync.DeleteImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteImportJobResult> deleteImportJobAsync(DeleteImportJobRequest deleteImportJobRequest);

    /**
     * <p>
     * Deletes the quick response import job.
     * </p>
     * 
     * @param deleteImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteImportJob operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.DeleteImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteImportJobResult> deleteImportJobAsync(DeleteImportJobRequest deleteImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteImportJobRequest, DeleteImportJobResult> asyncHandler);

    /**
     * <p>
     * Deletes the knowledge base.
     * </p>
     * <note>
     * <p>
     * When you use this API to delete an external knowledge base such as Salesforce or ServiceNow, you must also delete
     * the <a href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/Welcome.html">Amazon
     * AppIntegrations</a> DataIntegration. This is because you can't reuse the DataIntegration after it's been
     * associated with an external knowledge base. However, you can delete and recreate it. See <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_DeleteDataIntegration.html"
     * >DeleteDataIntegration</a> and <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> in the <i>Amazon AppIntegrations API Reference</i>.
     * </p>
     * </note>
     * 
     * @param deleteKnowledgeBaseRequest
     * @return A Java Future containing the result of the DeleteKnowledgeBase operation returned by the service.
     * @sample AmazonQConnectAsync.DeleteKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteKnowledgeBase" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKnowledgeBaseResult> deleteKnowledgeBaseAsync(DeleteKnowledgeBaseRequest deleteKnowledgeBaseRequest);

    /**
     * <p>
     * Deletes the knowledge base.
     * </p>
     * <note>
     * <p>
     * When you use this API to delete an external knowledge base such as Salesforce or ServiceNow, you must also delete
     * the <a href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/Welcome.html">Amazon
     * AppIntegrations</a> DataIntegration. This is because you can't reuse the DataIntegration after it's been
     * associated with an external knowledge base. However, you can delete and recreate it. See <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_DeleteDataIntegration.html"
     * >DeleteDataIntegration</a> and <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> in the <i>Amazon AppIntegrations API Reference</i>.
     * </p>
     * </note>
     * 
     * @param deleteKnowledgeBaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKnowledgeBase operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.DeleteKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteKnowledgeBase" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKnowledgeBaseResult> deleteKnowledgeBaseAsync(DeleteKnowledgeBaseRequest deleteKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKnowledgeBaseRequest, DeleteKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Deletes a quick response.
     * </p>
     * 
     * @param deleteQuickResponseRequest
     * @return A Java Future containing the result of the DeleteQuickResponse operation returned by the service.
     * @sample AmazonQConnectAsync.DeleteQuickResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteQuickResponse" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteQuickResponseResult> deleteQuickResponseAsync(DeleteQuickResponseRequest deleteQuickResponseRequest);

    /**
     * <p>
     * Deletes a quick response.
     * </p>
     * 
     * @param deleteQuickResponseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteQuickResponse operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.DeleteQuickResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteQuickResponse" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteQuickResponseResult> deleteQuickResponseAsync(DeleteQuickResponseRequest deleteQuickResponseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteQuickResponseRequest, DeleteQuickResponseResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an assistant.
     * </p>
     * 
     * @param getAssistantRequest
     * @return A Java Future containing the result of the GetAssistant operation returned by the service.
     * @sample AmazonQConnectAsync.GetAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAssistantResult> getAssistantAsync(GetAssistantRequest getAssistantRequest);

    /**
     * <p>
     * Retrieves information about an assistant.
     * </p>
     * 
     * @param getAssistantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAssistant operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.GetAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAssistantResult> getAssistantAsync(GetAssistantRequest getAssistantRequest,
            com.amazonaws.handlers.AsyncHandler<GetAssistantRequest, GetAssistantResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an assistant association.
     * </p>
     * 
     * @param getAssistantAssociationRequest
     * @return A Java Future containing the result of the GetAssistantAssociation operation returned by the service.
     * @sample AmazonQConnectAsync.GetAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetAssistantAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssistantAssociationResult> getAssistantAssociationAsync(GetAssistantAssociationRequest getAssistantAssociationRequest);

    /**
     * <p>
     * Retrieves information about an assistant association.
     * </p>
     * 
     * @param getAssistantAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAssistantAssociation operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.GetAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetAssistantAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssistantAssociationResult> getAssistantAssociationAsync(GetAssistantAssociationRequest getAssistantAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetAssistantAssociationRequest, GetAssistantAssociationResult> asyncHandler);

    /**
     * <p>
     * Retrieves content, including a pre-signed URL to download the content.
     * </p>
     * 
     * @param getContentRequest
     * @return A Java Future containing the result of the GetContent operation returned by the service.
     * @sample AmazonQConnectAsync.GetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetContent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetContentResult> getContentAsync(GetContentRequest getContentRequest);

    /**
     * <p>
     * Retrieves content, including a pre-signed URL to download the content.
     * </p>
     * 
     * @param getContentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContent operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.GetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetContent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetContentResult> getContentAsync(GetContentRequest getContentRequest,
            com.amazonaws.handlers.AsyncHandler<GetContentRequest, GetContentResult> asyncHandler);

    /**
     * <p>
     * Retrieves summary information about the content.
     * </p>
     * 
     * @param getContentSummaryRequest
     * @return A Java Future containing the result of the GetContentSummary operation returned by the service.
     * @sample AmazonQConnectAsync.GetContentSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetContentSummary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetContentSummaryResult> getContentSummaryAsync(GetContentSummaryRequest getContentSummaryRequest);

    /**
     * <p>
     * Retrieves summary information about the content.
     * </p>
     * 
     * @param getContentSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContentSummary operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.GetContentSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetContentSummary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetContentSummaryResult> getContentSummaryAsync(GetContentSummaryRequest getContentSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetContentSummaryRequest, GetContentSummaryResult> asyncHandler);

    /**
     * <p>
     * Retrieves the started import job.
     * </p>
     * 
     * @param getImportJobRequest
     * @return A Java Future containing the result of the GetImportJob operation returned by the service.
     * @sample AmazonQConnectAsync.GetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetImportJobResult> getImportJobAsync(GetImportJobRequest getImportJobRequest);

    /**
     * <p>
     * Retrieves the started import job.
     * </p>
     * 
     * @param getImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImportJob operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.GetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetImportJobResult> getImportJobAsync(GetImportJobRequest getImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetImportJobRequest, GetImportJobResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the knowledge base.
     * </p>
     * 
     * @param getKnowledgeBaseRequest
     * @return A Java Future containing the result of the GetKnowledgeBase operation returned by the service.
     * @sample AmazonQConnectAsync.GetKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetKnowledgeBase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKnowledgeBaseResult> getKnowledgeBaseAsync(GetKnowledgeBaseRequest getKnowledgeBaseRequest);

    /**
     * <p>
     * Retrieves information about the knowledge base.
     * </p>
     * 
     * @param getKnowledgeBaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKnowledgeBase operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.GetKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetKnowledgeBase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKnowledgeBaseResult> getKnowledgeBaseAsync(GetKnowledgeBaseRequest getKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<GetKnowledgeBaseRequest, GetKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Retrieves the quick response.
     * </p>
     * 
     * @param getQuickResponseRequest
     * @return A Java Future containing the result of the GetQuickResponse operation returned by the service.
     * @sample AmazonQConnectAsync.GetQuickResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetQuickResponse" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQuickResponseResult> getQuickResponseAsync(GetQuickResponseRequest getQuickResponseRequest);

    /**
     * <p>
     * Retrieves the quick response.
     * </p>
     * 
     * @param getQuickResponseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQuickResponse operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.GetQuickResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetQuickResponse" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQuickResponseResult> getQuickResponseAsync(GetQuickResponseRequest getQuickResponseRequest,
            com.amazonaws.handlers.AsyncHandler<GetQuickResponseRequest, GetQuickResponseResult> asyncHandler);

    /**
     * <important>
     * <p>
     * This API will be discontinued starting June 1, 2024. To receive generative responses after March 1, 2024, you
     * will need to create a new Assistant in the Amazon Connect console and integrate the Amazon Q in Connect
     * JavaScript library (amazon-q-connectjs) into your applications.
     * </p>
     * </important>
     * <p>
     * Retrieves recommendations for the specified session. To avoid retrieving the same recommendations in subsequent
     * calls, use <a
     * href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_NotifyRecommendationsReceived.html"
     * >NotifyRecommendationsReceived</a>. This API supports long-polling behavior with the <code>waitTimeSeconds</code>
     * parameter. Short poll is the default behavior and only returns recommendations already available. To perform a
     * manual query against an assistant, use <a
     * href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_QueryAssistant.html"
     * >QueryAssistant</a>.
     * </p>
     * 
     * @param getRecommendationsRequest
     * @return A Java Future containing the result of the GetRecommendations operation returned by the service.
     * @sample AmazonQConnectAsync.GetRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetRecommendations" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<GetRecommendationsResult> getRecommendationsAsync(GetRecommendationsRequest getRecommendationsRequest);

    /**
     * <important>
     * <p>
     * This API will be discontinued starting June 1, 2024. To receive generative responses after March 1, 2024, you
     * will need to create a new Assistant in the Amazon Connect console and integrate the Amazon Q in Connect
     * JavaScript library (amazon-q-connectjs) into your applications.
     * </p>
     * </important>
     * <p>
     * Retrieves recommendations for the specified session. To avoid retrieving the same recommendations in subsequent
     * calls, use <a
     * href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_NotifyRecommendationsReceived.html"
     * >NotifyRecommendationsReceived</a>. This API supports long-polling behavior with the <code>waitTimeSeconds</code>
     * parameter. Short poll is the default behavior and only returns recommendations already available. To perform a
     * manual query against an assistant, use <a
     * href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_QueryAssistant.html"
     * >QueryAssistant</a>.
     * </p>
     * 
     * @param getRecommendationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecommendations operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.GetRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetRecommendations" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<GetRecommendationsResult> getRecommendationsAsync(GetRecommendationsRequest getRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecommendationsRequest, GetRecommendationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information for a specified session.
     * </p>
     * 
     * @param getSessionRequest
     * @return A Java Future containing the result of the GetSession operation returned by the service.
     * @sample AmazonQConnectAsync.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSessionResult> getSessionAsync(GetSessionRequest getSessionRequest);

    /**
     * <p>
     * Retrieves information for a specified session.
     * </p>
     * 
     * @param getSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSession operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSessionResult> getSessionAsync(GetSessionRequest getSessionRequest,
            com.amazonaws.handlers.AsyncHandler<GetSessionRequest, GetSessionResult> asyncHandler);

    /**
     * <p>
     * Lists information about assistant associations.
     * </p>
     * 
     * @param listAssistantAssociationsRequest
     * @return A Java Future containing the result of the ListAssistantAssociations operation returned by the service.
     * @sample AmazonQConnectAsync.ListAssistantAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListAssistantAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssistantAssociationsResult> listAssistantAssociationsAsync(
            ListAssistantAssociationsRequest listAssistantAssociationsRequest);

    /**
     * <p>
     * Lists information about assistant associations.
     * </p>
     * 
     * @param listAssistantAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssistantAssociations operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.ListAssistantAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListAssistantAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssistantAssociationsResult> listAssistantAssociationsAsync(
            ListAssistantAssociationsRequest listAssistantAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssistantAssociationsRequest, ListAssistantAssociationsResult> asyncHandler);

    /**
     * <p>
     * Lists information about assistants.
     * </p>
     * 
     * @param listAssistantsRequest
     * @return A Java Future containing the result of the ListAssistants operation returned by the service.
     * @sample AmazonQConnectAsync.ListAssistants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListAssistants" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAssistantsResult> listAssistantsAsync(ListAssistantsRequest listAssistantsRequest);

    /**
     * <p>
     * Lists information about assistants.
     * </p>
     * 
     * @param listAssistantsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssistants operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.ListAssistants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListAssistants" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAssistantsResult> listAssistantsAsync(ListAssistantsRequest listAssistantsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssistantsRequest, ListAssistantsResult> asyncHandler);

    /**
     * <p>
     * Lists the content.
     * </p>
     * 
     * @param listContentsRequest
     * @return A Java Future containing the result of the ListContents operation returned by the service.
     * @sample AmazonQConnectAsync.ListContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListContents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListContentsResult> listContentsAsync(ListContentsRequest listContentsRequest);

    /**
     * <p>
     * Lists the content.
     * </p>
     * 
     * @param listContentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListContents operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.ListContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListContents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListContentsResult> listContentsAsync(ListContentsRequest listContentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListContentsRequest, ListContentsResult> asyncHandler);

    /**
     * <p>
     * Lists information about import jobs.
     * </p>
     * 
     * @param listImportJobsRequest
     * @return A Java Future containing the result of the ListImportJobs operation returned by the service.
     * @sample AmazonQConnectAsync.ListImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListImportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListImportJobsResult> listImportJobsAsync(ListImportJobsRequest listImportJobsRequest);

    /**
     * <p>
     * Lists information about import jobs.
     * </p>
     * 
     * @param listImportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImportJobs operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.ListImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListImportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListImportJobsResult> listImportJobsAsync(ListImportJobsRequest listImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListImportJobsRequest, ListImportJobsResult> asyncHandler);

    /**
     * <p>
     * Lists the knowledge bases.
     * </p>
     * 
     * @param listKnowledgeBasesRequest
     * @return A Java Future containing the result of the ListKnowledgeBases operation returned by the service.
     * @sample AmazonQConnectAsync.ListKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListKnowledgeBases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListKnowledgeBasesResult> listKnowledgeBasesAsync(ListKnowledgeBasesRequest listKnowledgeBasesRequest);

    /**
     * <p>
     * Lists the knowledge bases.
     * </p>
     * 
     * @param listKnowledgeBasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKnowledgeBases operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.ListKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListKnowledgeBases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListKnowledgeBasesResult> listKnowledgeBasesAsync(ListKnowledgeBasesRequest listKnowledgeBasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListKnowledgeBasesRequest, ListKnowledgeBasesResult> asyncHandler);

    /**
     * <p>
     * Lists information about quick response.
     * </p>
     * 
     * @param listQuickResponsesRequest
     * @return A Java Future containing the result of the ListQuickResponses operation returned by the service.
     * @sample AmazonQConnectAsync.ListQuickResponses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListQuickResponses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListQuickResponsesResult> listQuickResponsesAsync(ListQuickResponsesRequest listQuickResponsesRequest);

    /**
     * <p>
     * Lists information about quick response.
     * </p>
     * 
     * @param listQuickResponsesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListQuickResponses operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.ListQuickResponses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListQuickResponses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListQuickResponsesResult> listQuickResponsesAsync(ListQuickResponsesRequest listQuickResponsesRequest,
            com.amazonaws.handlers.AsyncHandler<ListQuickResponsesRequest, ListQuickResponsesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonQConnectAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified recommendations from the specified assistant's queue of newly available recommendations.
     * You can use this API in conjunction with <a
     * href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_GetRecommendations.html"
     * >GetRecommendations</a> and a <code>waitTimeSeconds</code> input for long-polling behavior and avoiding duplicate
     * recommendations.
     * </p>
     * 
     * @param notifyRecommendationsReceivedRequest
     * @return A Java Future containing the result of the NotifyRecommendationsReceived operation returned by the
     *         service.
     * @sample AmazonQConnectAsync.NotifyRecommendationsReceived
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/NotifyRecommendationsReceived"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<NotifyRecommendationsReceivedResult> notifyRecommendationsReceivedAsync(
            NotifyRecommendationsReceivedRequest notifyRecommendationsReceivedRequest);

    /**
     * <p>
     * Removes the specified recommendations from the specified assistant's queue of newly available recommendations.
     * You can use this API in conjunction with <a
     * href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_GetRecommendations.html"
     * >GetRecommendations</a> and a <code>waitTimeSeconds</code> input for long-polling behavior and avoiding duplicate
     * recommendations.
     * </p>
     * 
     * @param notifyRecommendationsReceivedRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the NotifyRecommendationsReceived operation returned by the
     *         service.
     * @sample AmazonQConnectAsyncHandler.NotifyRecommendationsReceived
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/NotifyRecommendationsReceived"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<NotifyRecommendationsReceivedResult> notifyRecommendationsReceivedAsync(
            NotifyRecommendationsReceivedRequest notifyRecommendationsReceivedRequest,
            com.amazonaws.handlers.AsyncHandler<NotifyRecommendationsReceivedRequest, NotifyRecommendationsReceivedResult> asyncHandler);

    /**
     * <p>
     * Provides feedback against the specified assistant for the specified target. This API only supports generative
     * targets.
     * </p>
     * 
     * @param putFeedbackRequest
     * @return A Java Future containing the result of the PutFeedback operation returned by the service.
     * @sample AmazonQConnectAsync.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest putFeedbackRequest);

    /**
     * <p>
     * Provides feedback against the specified assistant for the specified target. This API only supports generative
     * targets.
     * </p>
     * 
     * @param putFeedbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutFeedback operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest putFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<PutFeedbackRequest, PutFeedbackResult> asyncHandler);

    /**
     * <important>
     * <p>
     * This API will be discontinued starting June 1, 2024. To receive generative responses after March 1, 2024, you
     * will need to create a new Assistant in the Amazon Connect console and integrate the Amazon Q in Connect
     * JavaScript library (amazon-q-connectjs) into your applications.
     * </p>
     * </important>
     * <p>
     * Performs a manual search against the specified assistant. To retrieve recommendations for an assistant, use <a
     * href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_GetRecommendations.html">
     * GetRecommendations</a>.
     * </p>
     * 
     * @param queryAssistantRequest
     * @return A Java Future containing the result of the QueryAssistant operation returned by the service.
     * @sample AmazonQConnectAsync.QueryAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/QueryAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<QueryAssistantResult> queryAssistantAsync(QueryAssistantRequest queryAssistantRequest);

    /**
     * <important>
     * <p>
     * This API will be discontinued starting June 1, 2024. To receive generative responses after March 1, 2024, you
     * will need to create a new Assistant in the Amazon Connect console and integrate the Amazon Q in Connect
     * JavaScript library (amazon-q-connectjs) into your applications.
     * </p>
     * </important>
     * <p>
     * Performs a manual search against the specified assistant. To retrieve recommendations for an assistant, use <a
     * href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_GetRecommendations.html">
     * GetRecommendations</a>.
     * </p>
     * 
     * @param queryAssistantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the QueryAssistant operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.QueryAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/QueryAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<QueryAssistantResult> queryAssistantAsync(QueryAssistantRequest queryAssistantRequest,
            com.amazonaws.handlers.AsyncHandler<QueryAssistantRequest, QueryAssistantResult> asyncHandler);

    /**
     * <p>
     * Removes a URI template from a knowledge base.
     * </p>
     * 
     * @param removeKnowledgeBaseTemplateUriRequest
     * @return A Java Future containing the result of the RemoveKnowledgeBaseTemplateUri operation returned by the
     *         service.
     * @sample AmazonQConnectAsync.RemoveKnowledgeBaseTemplateUri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/RemoveKnowledgeBaseTemplateUri"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveKnowledgeBaseTemplateUriResult> removeKnowledgeBaseTemplateUriAsync(
            RemoveKnowledgeBaseTemplateUriRequest removeKnowledgeBaseTemplateUriRequest);

    /**
     * <p>
     * Removes a URI template from a knowledge base.
     * </p>
     * 
     * @param removeKnowledgeBaseTemplateUriRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveKnowledgeBaseTemplateUri operation returned by the
     *         service.
     * @sample AmazonQConnectAsyncHandler.RemoveKnowledgeBaseTemplateUri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/RemoveKnowledgeBaseTemplateUri"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveKnowledgeBaseTemplateUriResult> removeKnowledgeBaseTemplateUriAsync(
            RemoveKnowledgeBaseTemplateUriRequest removeKnowledgeBaseTemplateUriRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveKnowledgeBaseTemplateUriRequest, RemoveKnowledgeBaseTemplateUriResult> asyncHandler);

    /**
     * <p>
     * Searches for content in a specified knowledge base. Can be used to get a specific content resource by its name.
     * </p>
     * 
     * @param searchContentRequest
     * @return A Java Future containing the result of the SearchContent operation returned by the service.
     * @sample AmazonQConnectAsync.SearchContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/SearchContent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchContentResult> searchContentAsync(SearchContentRequest searchContentRequest);

    /**
     * <p>
     * Searches for content in a specified knowledge base. Can be used to get a specific content resource by its name.
     * </p>
     * 
     * @param searchContentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchContent operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.SearchContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/SearchContent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchContentResult> searchContentAsync(SearchContentRequest searchContentRequest,
            com.amazonaws.handlers.AsyncHandler<SearchContentRequest, SearchContentResult> asyncHandler);

    /**
     * <p>
     * Searches existing Amazon Q in Connect quick responses in an Amazon Q in Connect knowledge base.
     * </p>
     * 
     * @param searchQuickResponsesRequest
     * @return A Java Future containing the result of the SearchQuickResponses operation returned by the service.
     * @sample AmazonQConnectAsync.SearchQuickResponses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/SearchQuickResponses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchQuickResponsesResult> searchQuickResponsesAsync(SearchQuickResponsesRequest searchQuickResponsesRequest);

    /**
     * <p>
     * Searches existing Amazon Q in Connect quick responses in an Amazon Q in Connect knowledge base.
     * </p>
     * 
     * @param searchQuickResponsesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchQuickResponses operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.SearchQuickResponses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/SearchQuickResponses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchQuickResponsesResult> searchQuickResponsesAsync(SearchQuickResponsesRequest searchQuickResponsesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchQuickResponsesRequest, SearchQuickResponsesResult> asyncHandler);

    /**
     * <p>
     * Searches for sessions.
     * </p>
     * 
     * @param searchSessionsRequest
     * @return A Java Future containing the result of the SearchSessions operation returned by the service.
     * @sample AmazonQConnectAsync.SearchSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/SearchSessions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchSessionsResult> searchSessionsAsync(SearchSessionsRequest searchSessionsRequest);

    /**
     * <p>
     * Searches for sessions.
     * </p>
     * 
     * @param searchSessionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchSessions operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.SearchSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/SearchSessions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchSessionsResult> searchSessionsAsync(SearchSessionsRequest searchSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchSessionsRequest, SearchSessionsResult> asyncHandler);

    /**
     * <p>
     * Get a URL to upload content to a knowledge base. To upload content, first make a PUT request to the returned URL
     * with your file, making sure to include the required headers. Then use <a
     * href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_CreateContent.html">CreateContent</a>
     * to finalize the content creation process or <a
     * href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_UpdateContent.html">UpdateContent</a>
     * to modify an existing resource. You can only upload content to a knowledge base of type CUSTOM.
     * </p>
     * 
     * @param startContentUploadRequest
     * @return A Java Future containing the result of the StartContentUpload operation returned by the service.
     * @sample AmazonQConnectAsync.StartContentUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/StartContentUpload" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartContentUploadResult> startContentUploadAsync(StartContentUploadRequest startContentUploadRequest);

    /**
     * <p>
     * Get a URL to upload content to a knowledge base. To upload content, first make a PUT request to the returned URL
     * with your file, making sure to include the required headers. Then use <a
     * href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_CreateContent.html">CreateContent</a>
     * to finalize the content creation process or <a
     * href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_UpdateContent.html">UpdateContent</a>
     * to modify an existing resource. You can only upload content to a knowledge base of type CUSTOM.
     * </p>
     * 
     * @param startContentUploadRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartContentUpload operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.StartContentUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/StartContentUpload" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartContentUploadResult> startContentUploadAsync(StartContentUploadRequest startContentUploadRequest,
            com.amazonaws.handlers.AsyncHandler<StartContentUploadRequest, StartContentUploadResult> asyncHandler);

    /**
     * <p>
     * Start an asynchronous job to import Amazon Q in Connect resources from an uploaded source file. Before calling
     * this API, use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_StartContentUpload.html">StartContentUpload</a>
     * to upload an asset that contains the resource data.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For importing Amazon Q in Connect quick responses, you need to upload a csv file including the quick responses.
     * For information about how to format the csv file for importing quick responses, see <a
     * href="https://docs.aws.amazon.com/console/connect/quick-responses/add-data">Import quick responses</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startImportJobRequest
     * @return A Java Future containing the result of the StartImportJob operation returned by the service.
     * @sample AmazonQConnectAsync.StartImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/StartImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartImportJobResult> startImportJobAsync(StartImportJobRequest startImportJobRequest);

    /**
     * <p>
     * Start an asynchronous job to import Amazon Q in Connect resources from an uploaded source file. Before calling
     * this API, use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_StartContentUpload.html">StartContentUpload</a>
     * to upload an asset that contains the resource data.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For importing Amazon Q in Connect quick responses, you need to upload a csv file including the quick responses.
     * For information about how to format the csv file for importing quick responses, see <a
     * href="https://docs.aws.amazon.com/console/connect/quick-responses/add-data">Import quick responses</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartImportJob operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.StartImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/StartImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartImportJobResult> startImportJobAsync(StartImportJobRequest startImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartImportJobRequest, StartImportJobResult> asyncHandler);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonQConnectAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonQConnectAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates information about the content.
     * </p>
     * 
     * @param updateContentRequest
     * @return A Java Future containing the result of the UpdateContent operation returned by the service.
     * @sample AmazonQConnectAsync.UpdateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/UpdateContent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateContentResult> updateContentAsync(UpdateContentRequest updateContentRequest);

    /**
     * <p>
     * Updates information about the content.
     * </p>
     * 
     * @param updateContentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContent operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.UpdateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/UpdateContent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateContentResult> updateContentAsync(UpdateContentRequest updateContentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContentRequest, UpdateContentResult> asyncHandler);

    /**
     * <p>
     * Updates the template URI of a knowledge base. This is only supported for knowledge bases of type EXTERNAL.
     * Include a single variable in <code>${variable}</code> format; this interpolated by Amazon Q in Connect using
     * ingested content. For example, if you ingest a Salesforce article, it has an <code>Id</code> value, and you can
     * set the template URI to
     * <code>https://myInstanceName.lightning.force.com/lightning/r/Knowledge__kav/*${Id}*&#47;view</code>.
     * </p>
     * 
     * @param updateKnowledgeBaseTemplateUriRequest
     * @return A Java Future containing the result of the UpdateKnowledgeBaseTemplateUri operation returned by the
     *         service.
     * @sample AmazonQConnectAsync.UpdateKnowledgeBaseTemplateUri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/UpdateKnowledgeBaseTemplateUri"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKnowledgeBaseTemplateUriResult> updateKnowledgeBaseTemplateUriAsync(
            UpdateKnowledgeBaseTemplateUriRequest updateKnowledgeBaseTemplateUriRequest);

    /**
     * <p>
     * Updates the template URI of a knowledge base. This is only supported for knowledge bases of type EXTERNAL.
     * Include a single variable in <code>${variable}</code> format; this interpolated by Amazon Q in Connect using
     * ingested content. For example, if you ingest a Salesforce article, it has an <code>Id</code> value, and you can
     * set the template URI to
     * <code>https://myInstanceName.lightning.force.com/lightning/r/Knowledge__kav/*${Id}*&#47;view</code>.
     * </p>
     * 
     * @param updateKnowledgeBaseTemplateUriRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateKnowledgeBaseTemplateUri operation returned by the
     *         service.
     * @sample AmazonQConnectAsyncHandler.UpdateKnowledgeBaseTemplateUri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/UpdateKnowledgeBaseTemplateUri"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKnowledgeBaseTemplateUriResult> updateKnowledgeBaseTemplateUriAsync(
            UpdateKnowledgeBaseTemplateUriRequest updateKnowledgeBaseTemplateUriRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateKnowledgeBaseTemplateUriRequest, UpdateKnowledgeBaseTemplateUriResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Amazon Q in Connect quick response.
     * </p>
     * 
     * @param updateQuickResponseRequest
     * @return A Java Future containing the result of the UpdateQuickResponse operation returned by the service.
     * @sample AmazonQConnectAsync.UpdateQuickResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/UpdateQuickResponse" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQuickResponseResult> updateQuickResponseAsync(UpdateQuickResponseRequest updateQuickResponseRequest);

    /**
     * <p>
     * Updates an existing Amazon Q in Connect quick response.
     * </p>
     * 
     * @param updateQuickResponseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateQuickResponse operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.UpdateQuickResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/UpdateQuickResponse" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQuickResponseResult> updateQuickResponseAsync(UpdateQuickResponseRequest updateQuickResponseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateQuickResponseRequest, UpdateQuickResponseResult> asyncHandler);

    /**
     * <p>
     * Updates a session. A session is a contextual container used for generating recommendations. Amazon Connect
     * updates the existing Amazon Q in Connect session for each contact on which Amazon Q in Connect is enabled.
     * </p>
     * 
     * @param updateSessionRequest
     * @return A Java Future containing the result of the UpdateSession operation returned by the service.
     * @sample AmazonQConnectAsync.UpdateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/UpdateSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSessionResult> updateSessionAsync(UpdateSessionRequest updateSessionRequest);

    /**
     * <p>
     * Updates a session. A session is a contextual container used for generating recommendations. Amazon Connect
     * updates the existing Amazon Q in Connect session for each contact on which Amazon Q in Connect is enabled.
     * </p>
     * 
     * @param updateSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSession operation returned by the service.
     * @sample AmazonQConnectAsyncHandler.UpdateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/UpdateSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSessionResult> updateSessionAsync(UpdateSessionRequest updateSessionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSessionRequest, UpdateSessionResult> asyncHandler);

}

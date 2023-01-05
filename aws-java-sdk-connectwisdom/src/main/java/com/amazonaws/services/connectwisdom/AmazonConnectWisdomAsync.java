/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectwisdom;

import javax.annotation.Generated;

import com.amazonaws.services.connectwisdom.model.*;

/**
 * Interface for accessing Amazon Connect Wisdom Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.connectwisdom.AbstractAmazonConnectWisdomAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Connect Wisdom delivers agents the information they need to solve customer issues as they're actively speaking
 * with customers. Agents can search across connected repositories from within their agent desktop to find answers
 * quickly. Use the Amazon Connect Wisdom APIs to create an assistant and a knowledge base, for example, or manage
 * content by uploading custom files.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonConnectWisdomAsync extends AmazonConnectWisdom {

    /**
     * <p>
     * Creates an Amazon Connect Wisdom assistant.
     * </p>
     * 
     * @param createAssistantRequest
     * @return A Java Future containing the result of the CreateAssistant operation returned by the service.
     * @sample AmazonConnectWisdomAsync.CreateAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAssistantResult> createAssistantAsync(CreateAssistantRequest createAssistantRequest);

    /**
     * <p>
     * Creates an Amazon Connect Wisdom assistant.
     * </p>
     * 
     * @param createAssistantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAssistant operation returned by the service.
     * @sample AmazonConnectWisdomAsyncHandler.CreateAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAssistantResult> createAssistantAsync(CreateAssistantRequest createAssistantRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssistantRequest, CreateAssistantResult> asyncHandler);

    /**
     * <p>
     * Creates an association between an Amazon Connect Wisdom assistant and another resource. Currently, the only
     * supported association is with a knowledge base. An assistant can have only a single association.
     * </p>
     * 
     * @param createAssistantAssociationRequest
     * @return A Java Future containing the result of the CreateAssistantAssociation operation returned by the service.
     * @sample AmazonConnectWisdomAsync.CreateAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateAssistantAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAssistantAssociationResult> createAssistantAssociationAsync(
            CreateAssistantAssociationRequest createAssistantAssociationRequest);

    /**
     * <p>
     * Creates an association between an Amazon Connect Wisdom assistant and another resource. Currently, the only
     * supported association is with a knowledge base. An assistant can have only a single association.
     * </p>
     * 
     * @param createAssistantAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAssistantAssociation operation returned by the service.
     * @sample AmazonConnectWisdomAsyncHandler.CreateAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateAssistantAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAssistantAssociationResult> createAssistantAssociationAsync(
            CreateAssistantAssociationRequest createAssistantAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssistantAssociationRequest, CreateAssistantAssociationResult> asyncHandler);

    /**
     * <p>
     * Creates Wisdom content. Before to calling this API, use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_StartContentUpload.html">StartContentUpload</a>
     * to upload an asset.
     * </p>
     * 
     * @param createContentRequest
     * @return A Java Future containing the result of the CreateContent operation returned by the service.
     * @sample AmazonConnectWisdomAsync.CreateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateContent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateContentResult> createContentAsync(CreateContentRequest createContentRequest);

    /**
     * <p>
     * Creates Wisdom content. Before to calling this API, use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_StartContentUpload.html">StartContentUpload</a>
     * to upload an asset.
     * </p>
     * 
     * @param createContentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateContent operation returned by the service.
     * @sample AmazonConnectWisdomAsyncHandler.CreateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateContent" target="_top">AWS API
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
     * 
     * <pre>
     * <code> &lt;p&gt;For example, you're programmatically managing your external knowledge base, and you want to add or remove one of the fields that is being ingested from Salesforce. Do the following:&lt;/p&gt; &lt;ol&gt; &lt;li&gt; &lt;p&gt;Call &lt;a href=&quot;https://docs.aws.amazon.com/wisdom/latest/APIReference/API_DeleteKnowledgeBase.html&quot;&gt;DeleteKnowledgeBase&lt;/a&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Call &lt;a href=&quot;https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_DeleteDataIntegration.html&quot;&gt;DeleteDataIntegration&lt;/a&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Call &lt;a href=&quot;https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html&quot;&gt;CreateDataIntegration&lt;/a&gt; to recreate the DataIntegration or a create different one.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Call CreateKnowledgeBase.&lt;/p&gt; &lt;/li&gt; &lt;/ol&gt; &lt;/note&gt; </code>
     * </pre>
     * 
     * @param createKnowledgeBaseRequest
     * @return A Java Future containing the result of the CreateKnowledgeBase operation returned by the service.
     * @sample AmazonConnectWisdomAsync.CreateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateKnowledgeBase" target="_top">AWS API
     *      Documentation</a>
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
     * 
     * <pre>
     * <code> &lt;p&gt;For example, you're programmatically managing your external knowledge base, and you want to add or remove one of the fields that is being ingested from Salesforce. Do the following:&lt;/p&gt; &lt;ol&gt; &lt;li&gt; &lt;p&gt;Call &lt;a href=&quot;https://docs.aws.amazon.com/wisdom/latest/APIReference/API_DeleteKnowledgeBase.html&quot;&gt;DeleteKnowledgeBase&lt;/a&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Call &lt;a href=&quot;https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_DeleteDataIntegration.html&quot;&gt;DeleteDataIntegration&lt;/a&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Call &lt;a href=&quot;https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html&quot;&gt;CreateDataIntegration&lt;/a&gt; to recreate the DataIntegration or a create different one.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Call CreateKnowledgeBase.&lt;/p&gt; &lt;/li&gt; &lt;/ol&gt; &lt;/note&gt; </code>
     * </pre>
     * 
     * @param createKnowledgeBaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKnowledgeBase operation returned by the service.
     * @sample AmazonConnectWisdomAsyncHandler.CreateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateKnowledgeBase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKnowledgeBaseResult> createKnowledgeBaseAsync(CreateKnowledgeBaseRequest createKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKnowledgeBaseRequest, CreateKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Creates a session. A session is a contextual container used for generating recommendations. Amazon Connect
     * creates a new Wisdom session for each contact on which Wisdom is enabled.
     * </p>
     * 
     * @param createSessionRequest
     * @return A Java Future containing the result of the CreateSession operation returned by the service.
     * @sample AmazonConnectWisdomAsync.CreateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSessionResult> createSessionAsync(CreateSessionRequest createSessionRequest);

    /**
     * <p>
     * Creates a session. A session is a contextual container used for generating recommendations. Amazon Connect
     * creates a new Wisdom session for each contact on which Wisdom is enabled.
     * </p>
     * 
     * @param createSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSession operation returned by the service.
     * @sample AmazonConnectWisdomAsyncHandler.CreateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateSession" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsync.DeleteAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteAssistant" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsyncHandler.DeleteAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteAssistant" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsync.DeleteAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteAssistantAssociation"
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
     * @sample AmazonConnectWisdomAsyncHandler.DeleteAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteAssistantAssociation"
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
     * @sample AmazonConnectWisdomAsync.DeleteContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteContent" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsyncHandler.DeleteContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteContent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteContentResult> deleteContentAsync(DeleteContentRequest deleteContentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteContentRequest, DeleteContentResult> asyncHandler);

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
     * @sample AmazonConnectWisdomAsync.DeleteKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteKnowledgeBase" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonConnectWisdomAsyncHandler.DeleteKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteKnowledgeBase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKnowledgeBaseResult> deleteKnowledgeBaseAsync(DeleteKnowledgeBaseRequest deleteKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKnowledgeBaseRequest, DeleteKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an assistant.
     * </p>
     * 
     * @param getAssistantRequest
     * @return A Java Future containing the result of the GetAssistant operation returned by the service.
     * @sample AmazonConnectWisdomAsync.GetAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetAssistant" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsyncHandler.GetAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetAssistant" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsync.GetAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetAssistantAssociation" target="_top">AWS
     *      API Documentation</a>
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
     * @sample AmazonConnectWisdomAsyncHandler.GetAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetAssistantAssociation" target="_top">AWS
     *      API Documentation</a>
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
     * @sample AmazonConnectWisdomAsync.GetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetContent" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsyncHandler.GetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetContent" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsync.GetContentSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetContentSummary" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsyncHandler.GetContentSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetContentSummary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetContentSummaryResult> getContentSummaryAsync(GetContentSummaryRequest getContentSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetContentSummaryRequest, GetContentSummaryResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the knowledge base.
     * </p>
     * 
     * @param getKnowledgeBaseRequest
     * @return A Java Future containing the result of the GetKnowledgeBase operation returned by the service.
     * @sample AmazonConnectWisdomAsync.GetKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetKnowledgeBase" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsyncHandler.GetKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetKnowledgeBase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKnowledgeBaseResult> getKnowledgeBaseAsync(GetKnowledgeBaseRequest getKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<GetKnowledgeBaseRequest, GetKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Retrieves recommendations for the specified session. To avoid retrieving the same recommendations in subsequent
     * calls, use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_NotifyRecommendationsReceived.html"
     * >NotifyRecommendationsReceived</a>. This API supports long-polling behavior with the <code>waitTimeSeconds</code>
     * parameter. Short poll is the default behavior and only returns recommendations already available. To perform a
     * manual query against an assistant, use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_QueryAssistant.html">QueryAssistant</a>.
     * </p>
     * 
     * @param getRecommendationsRequest
     * @return A Java Future containing the result of the GetRecommendations operation returned by the service.
     * @sample AmazonConnectWisdomAsync.GetRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetRecommendations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRecommendationsResult> getRecommendationsAsync(GetRecommendationsRequest getRecommendationsRequest);

    /**
     * <p>
     * Retrieves recommendations for the specified session. To avoid retrieving the same recommendations in subsequent
     * calls, use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_NotifyRecommendationsReceived.html"
     * >NotifyRecommendationsReceived</a>. This API supports long-polling behavior with the <code>waitTimeSeconds</code>
     * parameter. Short poll is the default behavior and only returns recommendations already available. To perform a
     * manual query against an assistant, use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_QueryAssistant.html">QueryAssistant</a>.
     * </p>
     * 
     * @param getRecommendationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecommendations operation returned by the service.
     * @sample AmazonConnectWisdomAsyncHandler.GetRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetRecommendations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRecommendationsResult> getRecommendationsAsync(GetRecommendationsRequest getRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecommendationsRequest, GetRecommendationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information for a specified session.
     * </p>
     * 
     * @param getSessionRequest
     * @return A Java Future containing the result of the GetSession operation returned by the service.
     * @sample AmazonConnectWisdomAsync.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetSession" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsyncHandler.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetSession" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsync.ListAssistantAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListAssistantAssociations"
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
     * @sample AmazonConnectWisdomAsyncHandler.ListAssistantAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListAssistantAssociations"
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
     * @sample AmazonConnectWisdomAsync.ListAssistants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListAssistants" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsyncHandler.ListAssistants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListAssistants" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsync.ListContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListContents" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsyncHandler.ListContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListContents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListContentsResult> listContentsAsync(ListContentsRequest listContentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListContentsRequest, ListContentsResult> asyncHandler);

    /**
     * <p>
     * Lists the knowledge bases.
     * </p>
     * 
     * @param listKnowledgeBasesRequest
     * @return A Java Future containing the result of the ListKnowledgeBases operation returned by the service.
     * @sample AmazonConnectWisdomAsync.ListKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListKnowledgeBases" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonConnectWisdomAsyncHandler.ListKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListKnowledgeBases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKnowledgeBasesResult> listKnowledgeBasesAsync(ListKnowledgeBasesRequest listKnowledgeBasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListKnowledgeBasesRequest, ListKnowledgeBasesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonConnectWisdomAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonConnectWisdomAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified recommendations from the specified assistant's queue of newly available recommendations.
     * You can use this API in conjunction with <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetRecommendations.html">GetRecommendations</a>
     * and a <code>waitTimeSeconds</code> input for long-polling behavior and avoiding duplicate recommendations.
     * </p>
     * 
     * @param notifyRecommendationsReceivedRequest
     * @return A Java Future containing the result of the NotifyRecommendationsReceived operation returned by the
     *         service.
     * @sample AmazonConnectWisdomAsync.NotifyRecommendationsReceived
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/NotifyRecommendationsReceived"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<NotifyRecommendationsReceivedResult> notifyRecommendationsReceivedAsync(
            NotifyRecommendationsReceivedRequest notifyRecommendationsReceivedRequest);

    /**
     * <p>
     * Removes the specified recommendations from the specified assistant's queue of newly available recommendations.
     * You can use this API in conjunction with <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetRecommendations.html">GetRecommendations</a>
     * and a <code>waitTimeSeconds</code> input for long-polling behavior and avoiding duplicate recommendations.
     * </p>
     * 
     * @param notifyRecommendationsReceivedRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the NotifyRecommendationsReceived operation returned by the
     *         service.
     * @sample AmazonConnectWisdomAsyncHandler.NotifyRecommendationsReceived
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/NotifyRecommendationsReceived"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<NotifyRecommendationsReceivedResult> notifyRecommendationsReceivedAsync(
            NotifyRecommendationsReceivedRequest notifyRecommendationsReceivedRequest,
            com.amazonaws.handlers.AsyncHandler<NotifyRecommendationsReceivedRequest, NotifyRecommendationsReceivedResult> asyncHandler);

    /**
     * <p>
     * Performs a manual search against the specified assistant. To retrieve recommendations for an assistant, use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetRecommendations.html">GetRecommendations</a>.
     * </p>
     * 
     * @param queryAssistantRequest
     * @return A Java Future containing the result of the QueryAssistant operation returned by the service.
     * @sample AmazonConnectWisdomAsync.QueryAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/QueryAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<QueryAssistantResult> queryAssistantAsync(QueryAssistantRequest queryAssistantRequest);

    /**
     * <p>
     * Performs a manual search against the specified assistant. To retrieve recommendations for an assistant, use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetRecommendations.html">GetRecommendations</a>.
     * </p>
     * 
     * @param queryAssistantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the QueryAssistant operation returned by the service.
     * @sample AmazonConnectWisdomAsyncHandler.QueryAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/QueryAssistant" target="_top">AWS API
     *      Documentation</a>
     */
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
     * @sample AmazonConnectWisdomAsync.RemoveKnowledgeBaseTemplateUri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/RemoveKnowledgeBaseTemplateUri"
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
     * @sample AmazonConnectWisdomAsyncHandler.RemoveKnowledgeBaseTemplateUri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/RemoveKnowledgeBaseTemplateUri"
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
     * @sample AmazonConnectWisdomAsync.SearchContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/SearchContent" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsyncHandler.SearchContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/SearchContent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchContentResult> searchContentAsync(SearchContentRequest searchContentRequest,
            com.amazonaws.handlers.AsyncHandler<SearchContentRequest, SearchContentResult> asyncHandler);

    /**
     * <p>
     * Searches for sessions.
     * </p>
     * 
     * @param searchSessionsRequest
     * @return A Java Future containing the result of the SearchSessions operation returned by the service.
     * @sample AmazonConnectWisdomAsync.SearchSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/SearchSessions" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsyncHandler.SearchSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/SearchSessions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchSessionsResult> searchSessionsAsync(SearchSessionsRequest searchSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchSessionsRequest, SearchSessionsResult> asyncHandler);

    /**
     * <p>
     * Get a URL to upload content to a knowledge base. To upload content, first make a PUT request to the returned URL
     * with your file, making sure to include the required headers. Then use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_CreateContent.html">CreateContent</a> to
     * finalize the content creation process or <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_UpdateContent.html">UpdateContent</a> to modify
     * an existing resource. You can only upload content to a knowledge base of type CUSTOM.
     * </p>
     * 
     * @param startContentUploadRequest
     * @return A Java Future containing the result of the StartContentUpload operation returned by the service.
     * @sample AmazonConnectWisdomAsync.StartContentUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/StartContentUpload" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartContentUploadResult> startContentUploadAsync(StartContentUploadRequest startContentUploadRequest);

    /**
     * <p>
     * Get a URL to upload content to a knowledge base. To upload content, first make a PUT request to the returned URL
     * with your file, making sure to include the required headers. Then use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_CreateContent.html">CreateContent</a> to
     * finalize the content creation process or <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_UpdateContent.html">UpdateContent</a> to modify
     * an existing resource. You can only upload content to a knowledge base of type CUSTOM.
     * </p>
     * 
     * @param startContentUploadRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartContentUpload operation returned by the service.
     * @sample AmazonConnectWisdomAsyncHandler.StartContentUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/StartContentUpload" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartContentUploadResult> startContentUploadAsync(StartContentUploadRequest startContentUploadRequest,
            com.amazonaws.handlers.AsyncHandler<StartContentUploadRequest, StartContentUploadResult> asyncHandler);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonConnectWisdomAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/TagResource" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/TagResource" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UntagResource" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UntagResource" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsync.UpdateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UpdateContent" target="_top">AWS API
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
     * @sample AmazonConnectWisdomAsyncHandler.UpdateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UpdateContent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateContentResult> updateContentAsync(UpdateContentRequest updateContentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContentRequest, UpdateContentResult> asyncHandler);

    /**
     * <p>
     * Updates the template URI of a knowledge base. This is only supported for knowledge bases of type EXTERNAL.
     * Include a single variable in <code>${variable}</code> format; this interpolated by Wisdom using ingested content.
     * For example, if you ingest a Salesforce article, it has an <code>Id</code> value, and you can set the template
     * URI to <code>https://myInstanceName.lightning.force.com/lightning/r/Knowledge__kav/*${Id}*&#47;view</code>.
     * </p>
     * 
     * @param updateKnowledgeBaseTemplateUriRequest
     * @return A Java Future containing the result of the UpdateKnowledgeBaseTemplateUri operation returned by the
     *         service.
     * @sample AmazonConnectWisdomAsync.UpdateKnowledgeBaseTemplateUri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UpdateKnowledgeBaseTemplateUri"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKnowledgeBaseTemplateUriResult> updateKnowledgeBaseTemplateUriAsync(
            UpdateKnowledgeBaseTemplateUriRequest updateKnowledgeBaseTemplateUriRequest);

    /**
     * <p>
     * Updates the template URI of a knowledge base. This is only supported for knowledge bases of type EXTERNAL.
     * Include a single variable in <code>${variable}</code> format; this interpolated by Wisdom using ingested content.
     * For example, if you ingest a Salesforce article, it has an <code>Id</code> value, and you can set the template
     * URI to <code>https://myInstanceName.lightning.force.com/lightning/r/Knowledge__kav/*${Id}*&#47;view</code>.
     * </p>
     * 
     * @param updateKnowledgeBaseTemplateUriRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateKnowledgeBaseTemplateUri operation returned by the
     *         service.
     * @sample AmazonConnectWisdomAsyncHandler.UpdateKnowledgeBaseTemplateUri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UpdateKnowledgeBaseTemplateUri"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKnowledgeBaseTemplateUriResult> updateKnowledgeBaseTemplateUriAsync(
            UpdateKnowledgeBaseTemplateUriRequest updateKnowledgeBaseTemplateUriRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateKnowledgeBaseTemplateUriRequest, UpdateKnowledgeBaseTemplateUriResult> asyncHandler);

}

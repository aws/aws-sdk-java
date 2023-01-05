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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.connectwisdom.model.*;

/**
 * Interface for accessing Amazon Connect Wisdom Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.connectwisdom.AbstractAmazonConnectWisdom} instead.
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
public interface AmazonConnectWisdom {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "wisdom";

    /**
     * <p>
     * Creates an Amazon Connect Wisdom assistant.
     * </p>
     * 
     * @param createAssistantRequest
     * @return Result of the CreateAssistant operation returned by the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. For example,
     *         if you're using a <code>Create</code> API (such as <code>CreateAssistant</code>) that accepts name, a
     *         conflicting resource (usually with the same name) is being created or mutated.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws ServiceQuotaExceededException
     *         You've exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use service quotas to request a service quota increase.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectWisdom.CreateAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAssistantResult createAssistant(CreateAssistantRequest createAssistantRequest);

    /**
     * <p>
     * Creates an association between an Amazon Connect Wisdom assistant and another resource. Currently, the only
     * supported association is with a knowledge base. An assistant can have only a single association.
     * </p>
     * 
     * @param createAssistantAssociationRequest
     * @return Result of the CreateAssistantAssociation operation returned by the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. For example,
     *         if you're using a <code>Create</code> API (such as <code>CreateAssistant</code>) that accepts name, a
     *         conflicting resource (usually with the same name) is being created or mutated.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws ServiceQuotaExceededException
     *         You've exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use service quotas to request a service quota increase.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.CreateAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateAssistantAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAssistantAssociationResult createAssistantAssociation(CreateAssistantAssociationRequest createAssistantAssociationRequest);

    /**
     * <p>
     * Creates Wisdom content. Before to calling this API, use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_StartContentUpload.html">StartContentUpload</a>
     * to upload an asset.
     * </p>
     * 
     * @param createContentRequest
     * @return Result of the CreateContent operation returned by the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. For example,
     *         if you're using a <code>Create</code> API (such as <code>CreateAssistant</code>) that accepts name, a
     *         conflicting resource (usually with the same name) is being created or mutated.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws ServiceQuotaExceededException
     *         You've exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use service quotas to request a service quota increase.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.CreateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateContent" target="_top">AWS API
     *      Documentation</a>
     */
    CreateContentResult createContent(CreateContentRequest createContentRequest);

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
     * @return Result of the CreateKnowledgeBase operation returned by the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. For example,
     *         if you're using a <code>Create</code> API (such as <code>CreateAssistant</code>) that accepts name, a
     *         conflicting resource (usually with the same name) is being created or mutated.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws ServiceQuotaExceededException
     *         You've exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use service quotas to request a service quota increase.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectWisdom.CreateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateKnowledgeBase" target="_top">AWS API
     *      Documentation</a>
     */
    CreateKnowledgeBaseResult createKnowledgeBase(CreateKnowledgeBaseRequest createKnowledgeBaseRequest);

    /**
     * <p>
     * Creates a session. A session is a contextual container used for generating recommendations. Amazon Connect
     * creates a new Wisdom session for each contact on which Wisdom is enabled.
     * </p>
     * 
     * @param createSessionRequest
     * @return Result of the CreateSession operation returned by the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. For example,
     *         if you're using a <code>Create</code> API (such as <code>CreateAssistant</code>) that accepts name, a
     *         conflicting resource (usually with the same name) is being created or mutated.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.CreateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateSession" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSessionResult createSession(CreateSessionRequest createSessionRequest);

    /**
     * <p>
     * Deletes an assistant.
     * </p>
     * 
     * @param deleteAssistantRequest
     * @return Result of the DeleteAssistant operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.DeleteAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAssistantResult deleteAssistant(DeleteAssistantRequest deleteAssistantRequest);

    /**
     * <p>
     * Deletes an assistant association.
     * </p>
     * 
     * @param deleteAssistantAssociationRequest
     * @return Result of the DeleteAssistantAssociation operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.DeleteAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteAssistantAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAssistantAssociationResult deleteAssistantAssociation(DeleteAssistantAssociationRequest deleteAssistantAssociationRequest);

    /**
     * <p>
     * Deletes the content.
     * </p>
     * 
     * @param deleteContentRequest
     * @return Result of the DeleteContent operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.DeleteContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteContent" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteContentResult deleteContent(DeleteContentRequest deleteContentRequest);

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
     * @return Result of the DeleteKnowledgeBase operation returned by the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. For example,
     *         if you're using a <code>Create</code> API (such as <code>CreateAssistant</code>) that accepts name, a
     *         conflicting resource (usually with the same name) is being created or mutated.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.DeleteKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteKnowledgeBase" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteKnowledgeBaseResult deleteKnowledgeBase(DeleteKnowledgeBaseRequest deleteKnowledgeBaseRequest);

    /**
     * <p>
     * Retrieves information about an assistant.
     * </p>
     * 
     * @param getAssistantRequest
     * @return Result of the GetAssistant operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.GetAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    GetAssistantResult getAssistant(GetAssistantRequest getAssistantRequest);

    /**
     * <p>
     * Retrieves information about an assistant association.
     * </p>
     * 
     * @param getAssistantAssociationRequest
     * @return Result of the GetAssistantAssociation operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.GetAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetAssistantAssociation" target="_top">AWS
     *      API Documentation</a>
     */
    GetAssistantAssociationResult getAssistantAssociation(GetAssistantAssociationRequest getAssistantAssociationRequest);

    /**
     * <p>
     * Retrieves content, including a pre-signed URL to download the content.
     * </p>
     * 
     * @param getContentRequest
     * @return Result of the GetContent operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.GetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetContent" target="_top">AWS API
     *      Documentation</a>
     */
    GetContentResult getContent(GetContentRequest getContentRequest);

    /**
     * <p>
     * Retrieves summary information about the content.
     * </p>
     * 
     * @param getContentSummaryRequest
     * @return Result of the GetContentSummary operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.GetContentSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetContentSummary" target="_top">AWS API
     *      Documentation</a>
     */
    GetContentSummaryResult getContentSummary(GetContentSummaryRequest getContentSummaryRequest);

    /**
     * <p>
     * Retrieves information about the knowledge base.
     * </p>
     * 
     * @param getKnowledgeBaseRequest
     * @return Result of the GetKnowledgeBase operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.GetKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetKnowledgeBase" target="_top">AWS API
     *      Documentation</a>
     */
    GetKnowledgeBaseResult getKnowledgeBase(GetKnowledgeBaseRequest getKnowledgeBaseRequest);

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
     * @return Result of the GetRecommendations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.GetRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetRecommendations" target="_top">AWS API
     *      Documentation</a>
     */
    GetRecommendationsResult getRecommendations(GetRecommendationsRequest getRecommendationsRequest);

    /**
     * <p>
     * Retrieves information for a specified session.
     * </p>
     * 
     * @param getSessionRequest
     * @return Result of the GetSession operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetSession" target="_top">AWS API
     *      Documentation</a>
     */
    GetSessionResult getSession(GetSessionRequest getSessionRequest);

    /**
     * <p>
     * Lists information about assistant associations.
     * </p>
     * 
     * @param listAssistantAssociationsRequest
     * @return Result of the ListAssistantAssociations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.ListAssistantAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListAssistantAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssistantAssociationsResult listAssistantAssociations(ListAssistantAssociationsRequest listAssistantAssociationsRequest);

    /**
     * <p>
     * Lists information about assistants.
     * </p>
     * 
     * @param listAssistantsRequest
     * @return Result of the ListAssistants operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectWisdom.ListAssistants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListAssistants" target="_top">AWS API
     *      Documentation</a>
     */
    ListAssistantsResult listAssistants(ListAssistantsRequest listAssistantsRequest);

    /**
     * <p>
     * Lists the content.
     * </p>
     * 
     * @param listContentsRequest
     * @return Result of the ListContents operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.ListContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListContents" target="_top">AWS API
     *      Documentation</a>
     */
    ListContentsResult listContents(ListContentsRequest listContentsRequest);

    /**
     * <p>
     * Lists the knowledge bases.
     * </p>
     * 
     * @param listKnowledgeBasesRequest
     * @return Result of the ListKnowledgeBases operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectWisdom.ListKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListKnowledgeBases" target="_top">AWS API
     *      Documentation</a>
     */
    ListKnowledgeBasesResult listKnowledgeBases(ListKnowledgeBasesRequest listKnowledgeBasesRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Removes the specified recommendations from the specified assistant's queue of newly available recommendations.
     * You can use this API in conjunction with <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetRecommendations.html">GetRecommendations</a>
     * and a <code>waitTimeSeconds</code> input for long-polling behavior and avoiding duplicate recommendations.
     * </p>
     * 
     * @param notifyRecommendationsReceivedRequest
     * @return Result of the NotifyRecommendationsReceived operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.NotifyRecommendationsReceived
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/NotifyRecommendationsReceived"
     *      target="_top">AWS API Documentation</a>
     */
    NotifyRecommendationsReceivedResult notifyRecommendationsReceived(NotifyRecommendationsReceivedRequest notifyRecommendationsReceivedRequest);

    /**
     * <p>
     * Performs a manual search against the specified assistant. To retrieve recommendations for an assistant, use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetRecommendations.html">GetRecommendations</a>.
     * </p>
     * 
     * @param queryAssistantRequest
     * @return Result of the QueryAssistant operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.QueryAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/QueryAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    QueryAssistantResult queryAssistant(QueryAssistantRequest queryAssistantRequest);

    /**
     * <p>
     * Removes a URI template from a knowledge base.
     * </p>
     * 
     * @param removeKnowledgeBaseTemplateUriRequest
     * @return Result of the RemoveKnowledgeBaseTemplateUri operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.RemoveKnowledgeBaseTemplateUri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/RemoveKnowledgeBaseTemplateUri"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveKnowledgeBaseTemplateUriResult removeKnowledgeBaseTemplateUri(RemoveKnowledgeBaseTemplateUriRequest removeKnowledgeBaseTemplateUriRequest);

    /**
     * <p>
     * Searches for content in a specified knowledge base. Can be used to get a specific content resource by its name.
     * </p>
     * 
     * @param searchContentRequest
     * @return Result of the SearchContent operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.SearchContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/SearchContent" target="_top">AWS API
     *      Documentation</a>
     */
    SearchContentResult searchContent(SearchContentRequest searchContentRequest);

    /**
     * <p>
     * Searches for sessions.
     * </p>
     * 
     * @param searchSessionsRequest
     * @return Result of the SearchSessions operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.SearchSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/SearchSessions" target="_top">AWS API
     *      Documentation</a>
     */
    SearchSessionsResult searchSessions(SearchSessionsRequest searchSessionsRequest);

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
     * @return Result of the StartContentUpload operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.StartContentUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/StartContentUpload" target="_top">AWS API
     *      Documentation</a>
     */
    StartContentUploadResult startContentUpload(StartContentUploadRequest startContentUploadRequest);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws TooManyTagsException
     *         Amazon Connect Wisdom throws this exception if you have too many tags in your tag set.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates information about the content.
     * </p>
     * 
     * @param updateContentRequest
     * @return Result of the UpdateContent operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws PreconditionFailedException
     *         The provided <code>revisionId</code> does not match, indicating the content has been modified since it
     *         was last read.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.UpdateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UpdateContent" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateContentResult updateContent(UpdateContentRequest updateContentRequest);

    /**
     * <p>
     * Updates the template URI of a knowledge base. This is only supported for knowledge bases of type EXTERNAL.
     * Include a single variable in <code>${variable}</code> format; this interpolated by Wisdom using ingested content.
     * For example, if you ingest a Salesforce article, it has an <code>Id</code> value, and you can set the template
     * URI to <code>https://myInstanceName.lightning.force.com/lightning/r/Knowledge__kav/*${Id}*&#47;view</code>.
     * </p>
     * 
     * @param updateKnowledgeBaseTemplateUriRequest
     * @return Result of the UpdateKnowledgeBaseTemplateUri operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.UpdateKnowledgeBaseTemplateUri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UpdateKnowledgeBaseTemplateUri"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateKnowledgeBaseTemplateUriResult updateKnowledgeBaseTemplateUri(UpdateKnowledgeBaseTemplateUriRequest updateKnowledgeBaseTemplateUriRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}

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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.qconnect.model.*;

/**
 * Interface for accessing Amazon Q Connect.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.qconnect.AbstractAmazonQConnect} instead.
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
public interface AmazonQConnect {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "wisdom";

    /**
     * <p>
     * Creates an Amazon Q in Connect assistant.
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
     * @sample AmazonQConnect.CreateAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAssistantResult createAssistant(CreateAssistantRequest createAssistantRequest);

    /**
     * <p>
     * Creates an association between an Amazon Q in Connect assistant and another resource. Currently, the only
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
     * @sample AmazonQConnect.CreateAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateAssistantAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAssistantAssociationResult createAssistantAssociation(CreateAssistantAssociationRequest createAssistantAssociationRequest);

    /**
     * <p>
     * Creates Amazon Q in Connect content. Before to calling this API, use <a
     * href="https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_StartContentUpload.html"
     * >StartContentUpload</a> to upload an asset.
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
     * @sample AmazonQConnect.CreateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateContent" target="_top">AWS API
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
     * @sample AmazonQConnect.CreateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateKnowledgeBase" target="_top">AWS
     *      API Documentation</a>
     */
    CreateKnowledgeBaseResult createKnowledgeBase(CreateKnowledgeBaseRequest createKnowledgeBaseRequest);

    /**
     * <p>
     * Creates an Amazon Q in Connect quick response.
     * </p>
     * 
     * @param createQuickResponseRequest
     * @return Result of the CreateQuickResponse operation returned by the service.
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
     * @sample AmazonQConnect.CreateQuickResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateQuickResponse" target="_top">AWS
     *      API Documentation</a>
     */
    CreateQuickResponseResult createQuickResponse(CreateQuickResponseRequest createQuickResponseRequest);

    /**
     * <p>
     * Creates a session. A session is a contextual container used for generating recommendations. Amazon Connect
     * creates a new Amazon Q in Connect session for each contact on which Amazon Q in Connect is enabled.
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
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonQConnect.CreateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/CreateSession" target="_top">AWS API
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
     * @sample AmazonQConnect.DeleteAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteAssistant" target="_top">AWS API
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
     * @sample AmazonQConnect.DeleteAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteAssistantAssociation"
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
     * @sample AmazonQConnect.DeleteContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteContent" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteContentResult deleteContent(DeleteContentRequest deleteContentRequest);

    /**
     * <p>
     * Deletes the quick response import job.
     * </p>
     * 
     * @param deleteImportJobRequest
     * @return Result of the DeleteImportJob operation returned by the service.
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
     * @sample AmazonQConnect.DeleteImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteImportJobResult deleteImportJob(DeleteImportJobRequest deleteImportJobRequest);

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
     * @sample AmazonQConnect.DeleteKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteKnowledgeBase" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteKnowledgeBaseResult deleteKnowledgeBase(DeleteKnowledgeBaseRequest deleteKnowledgeBaseRequest);

    /**
     * <p>
     * Deletes a quick response.
     * </p>
     * 
     * @param deleteQuickResponseRequest
     * @return Result of the DeleteQuickResponse operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonQConnect.DeleteQuickResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DeleteQuickResponse" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteQuickResponseResult deleteQuickResponse(DeleteQuickResponseRequest deleteQuickResponseRequest);

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
     * @sample AmazonQConnect.GetAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetAssistant" target="_top">AWS API
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
     * @sample AmazonQConnect.GetAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetAssistantAssociation"
     *      target="_top">AWS API Documentation</a>
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
     * @sample AmazonQConnect.GetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetContent" target="_top">AWS API
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
     * @sample AmazonQConnect.GetContentSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetContentSummary" target="_top">AWS API
     *      Documentation</a>
     */
    GetContentSummaryResult getContentSummary(GetContentSummaryRequest getContentSummaryRequest);

    /**
     * <p>
     * Retrieves the started import job.
     * </p>
     * 
     * @param getImportJobRequest
     * @return Result of the GetImportJob operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonQConnect.GetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetImportJobResult getImportJob(GetImportJobRequest getImportJobRequest);

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
     * @sample AmazonQConnect.GetKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetKnowledgeBase" target="_top">AWS API
     *      Documentation</a>
     */
    GetKnowledgeBaseResult getKnowledgeBase(GetKnowledgeBaseRequest getKnowledgeBaseRequest);

    /**
     * <p>
     * Retrieves the quick response.
     * </p>
     * 
     * @param getQuickResponseRequest
     * @return Result of the GetQuickResponse operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonQConnect.GetQuickResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetQuickResponse" target="_top">AWS API
     *      Documentation</a>
     */
    GetQuickResponseResult getQuickResponse(GetQuickResponseRequest getQuickResponseRequest);

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
     * @return Result of the GetRecommendations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonQConnect.GetRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetRecommendations" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
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
     * @sample AmazonQConnect.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetSession" target="_top">AWS API
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
     * @sample AmazonQConnect.ListAssistantAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListAssistantAssociations"
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
     * @sample AmazonQConnect.ListAssistants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListAssistants" target="_top">AWS API
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
     * @sample AmazonQConnect.ListContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListContents" target="_top">AWS API
     *      Documentation</a>
     */
    ListContentsResult listContents(ListContentsRequest listContentsRequest);

    /**
     * <p>
     * Lists information about import jobs.
     * </p>
     * 
     * @param listImportJobsRequest
     * @return Result of the ListImportJobs operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonQConnect.ListImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListImportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListImportJobsResult listImportJobs(ListImportJobsRequest listImportJobsRequest);

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
     * @sample AmazonQConnect.ListKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListKnowledgeBases" target="_top">AWS
     *      API Documentation</a>
     */
    ListKnowledgeBasesResult listKnowledgeBases(ListKnowledgeBasesRequest listKnowledgeBasesRequest);

    /**
     * <p>
     * Lists information about quick response.
     * </p>
     * 
     * @param listQuickResponsesRequest
     * @return Result of the ListQuickResponses operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonQConnect.ListQuickResponses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListQuickResponses" target="_top">AWS
     *      API Documentation</a>
     */
    ListQuickResponsesResult listQuickResponses(ListQuickResponsesRequest listQuickResponsesRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonQConnect.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the NotifyRecommendationsReceived operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonQConnect.NotifyRecommendationsReceived
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/NotifyRecommendationsReceived"
     *      target="_top">AWS API Documentation</a>
     */
    NotifyRecommendationsReceivedResult notifyRecommendationsReceived(NotifyRecommendationsReceivedRequest notifyRecommendationsReceivedRequest);

    /**
     * <p>
     * Provides feedback against the specified assistant for the specified target. This API only supports generative
     * targets.
     * </p>
     * 
     * @param putFeedbackRequest
     * @return Result of the PutFeedback operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonQConnect.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    PutFeedbackResult putFeedback(PutFeedbackRequest putFeedbackRequest);

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
     * @return Result of the QueryAssistant operation returned by the service.
     * @throws RequestTimeoutException
     *         The request reached the service more than 15 minutes after the date stamp on the request or more than 15
     *         minutes after the request expiration date (such as for pre-signed URLs), or the date stamp on the request
     *         is more than 15 minutes in the future.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonQConnect.QueryAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/QueryAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
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
     * @sample AmazonQConnect.RemoveKnowledgeBaseTemplateUri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/RemoveKnowledgeBaseTemplateUri"
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
     * @sample AmazonQConnect.SearchContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/SearchContent" target="_top">AWS API
     *      Documentation</a>
     */
    SearchContentResult searchContent(SearchContentRequest searchContentRequest);

    /**
     * <p>
     * Searches existing Amazon Q in Connect quick responses in an Amazon Q in Connect knowledge base.
     * </p>
     * 
     * @param searchQuickResponsesRequest
     * @return Result of the SearchQuickResponses operation returned by the service.
     * @throws RequestTimeoutException
     *         The request reached the service more than 15 minutes after the date stamp on the request or more than 15
     *         minutes after the request expiration date (such as for pre-signed URLs), or the date stamp on the request
     *         is more than 15 minutes in the future.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonQConnect.SearchQuickResponses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/SearchQuickResponses" target="_top">AWS
     *      API Documentation</a>
     */
    SearchQuickResponsesResult searchQuickResponses(SearchQuickResponsesRequest searchQuickResponsesRequest);

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
     * @sample AmazonQConnect.SearchSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/SearchSessions" target="_top">AWS API
     *      Documentation</a>
     */
    SearchSessionsResult searchSessions(SearchSessionsRequest searchSessionsRequest);

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
     * @return Result of the StartContentUpload operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonQConnect.StartContentUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/StartContentUpload" target="_top">AWS
     *      API Documentation</a>
     */
    StartContentUploadResult startContentUpload(StartContentUploadRequest startContentUploadRequest);

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
     * @return Result of the StartImportJob operation returned by the service.
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
     * @sample AmazonQConnect.StartImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/StartImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    StartImportJobResult startImportJob(StartImportJobRequest startImportJobRequest);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws TooManyTagsException
     *         Amazon Q in Connect throws this exception if you have too many tags in your tag set.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonQConnect.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/TagResource" target="_top">AWS API
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
     * @sample AmazonQConnect.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/UntagResource" target="_top">AWS API
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
     * @sample AmazonQConnect.UpdateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/UpdateContent" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateContentResult updateContent(UpdateContentRequest updateContentRequest);

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
     * @return Result of the UpdateKnowledgeBaseTemplateUri operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonQConnect.UpdateKnowledgeBaseTemplateUri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/UpdateKnowledgeBaseTemplateUri"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateKnowledgeBaseTemplateUriResult updateKnowledgeBaseTemplateUri(UpdateKnowledgeBaseTemplateUriRequest updateKnowledgeBaseTemplateUriRequest);

    /**
     * <p>
     * Updates an existing Amazon Q in Connect quick response.
     * </p>
     * 
     * @param updateQuickResponseRequest
     * @return Result of the UpdateQuickResponse operation returned by the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. For example,
     *         if you're using a <code>Create</code> API (such as <code>CreateAssistant</code>) that accepts name, a
     *         conflicting resource (usually with the same name) is being created or mutated.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws PreconditionFailedException
     *         The provided <code>revisionId</code> does not match, indicating the content has been modified since it
     *         was last read.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonQConnect.UpdateQuickResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/UpdateQuickResponse" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateQuickResponseResult updateQuickResponse(UpdateQuickResponseRequest updateQuickResponseRequest);

    /**
     * <p>
     * Updates a session. A session is a contextual container used for generating recommendations. Amazon Connect
     * updates the existing Amazon Q in Connect session for each contact on which Amazon Q in Connect is enabled.
     * </p>
     * 
     * @param updateSessionRequest
     * @return Result of the UpdateSession operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonQConnect.UpdateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/UpdateSession" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSessionResult updateSession(UpdateSessionRequest updateSessionRequest);

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

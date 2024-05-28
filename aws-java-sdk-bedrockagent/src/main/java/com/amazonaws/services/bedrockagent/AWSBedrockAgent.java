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
package com.amazonaws.services.bedrockagent;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.bedrockagent.model.*;

/**
 * Interface for accessing Agents for Amazon Bedrock.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.bedrockagent.AbstractAWSBedrockAgent} instead.
 * </p>
 * <p>
 * <p>
 * Describes the API operations for creating and managing Amazon Bedrock agents.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBedrockAgent {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "bedrock-agent";

    /**
     * <p>
     * Associates a knowledge base with an agent. If a knowledge base is associated and its <code>indexState</code> is
     * set to <code>Enabled</code>, the agent queries the knowledge base for information to augment its response to the
     * user.
     * </p>
     * 
     * @param associateAgentKnowledgeBaseRequest
     * @return Result of the AssociateAgentKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.AssociateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AssociateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateAgentKnowledgeBaseResult associateAgentKnowledgeBase(AssociateAgentKnowledgeBaseRequest associateAgentKnowledgeBaseRequest);

    /**
     * <p>
     * Creates an agent that orchestrates interactions between foundation models, data sources, software applications,
     * user conversations, and APIs to carry out tasks to help customers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the following fields for security purposes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>agentResourceRoleArn</code> – The Amazon Resource Name (ARN) of the role with permissions to invoke API
     * operations on an agent.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) <code>customerEncryptionKeyArn</code> – The Amazon Resource Name (ARN) of a KMS key to encrypt the
     * creation of the agent.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) <code>idleSessionTTLinSeconds</code> – Specify the number of seconds for which the agent should
     * maintain session information. After this time expires, the subsequent <code>InvokeAgent</code> request begins a
     * new session.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To override the default prompt behavior for agent orchestration and to use advanced prompts, include a
     * <code>promptOverrideConfiguration</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you agent fails to be created, the response returns a list of <code>failureReasons</code> alongside a list of
     * <code>recommendedActions</code> for you to troubleshoot.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAgentRequest
     * @return Result of the CreateAgent operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.CreateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAgentResult createAgent(CreateAgentRequest createAgentRequest);

    /**
     * <p>
     * Creates an action group for an agent. An action group represents the actions that an agent can carry out for the
     * customer by defining the APIs that an agent can call and the logic for calling them.
     * </p>
     * <p>
     * To allow your agent to request the user for additional information when trying to complete a task, add an action
     * group with the <code>parentActionGroupSignature</code> field set to <code>AMAZON.UserInput</code>. You must leave
     * the <code>description</code>, <code>apiSchema</code>, and <code>actionGroupExecutor</code> fields blank for this
     * action group. During orchestration, if your agent determines that it needs to invoke an API in an action group,
     * but doesn't have enough information to complete the API request, it will invoke this action group instead and
     * return an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html">Observation</a>
     * reprompting the user for more information.
     * </p>
     * 
     * @param createAgentActionGroupRequest
     * @return Result of the CreateAgentActionGroup operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.CreateAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAgentActionGroupResult createAgentActionGroup(CreateAgentActionGroupRequest createAgentActionGroupRequest);

    /**
     * <p>
     * Creates an alias of an agent that can be used to deploy the agent.
     * </p>
     * 
     * @param createAgentAliasRequest
     * @return Result of the CreateAgentAlias operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.CreateAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    CreateAgentAliasResult createAgentAlias(CreateAgentAliasRequest createAgentAliasRequest);

    /**
     * <p>
     * Sets up a data source to be added to a knowledge base.
     * </p>
     * <important>
     * <p>
     * You can't change the <code>chunkingConfiguration</code> after you create the data source.
     * </p>
     * </important>
     * 
     * @param createDataSourceRequest
     * @return Result of the CreateDataSource operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDataSourceResult createDataSource(CreateDataSourceRequest createDataSourceRequest);

    /**
     * <p>
     * Creates a knowledge base that contains data sources from which information can be queried and used by LLMs. To
     * create a knowledge base, you must first set up your data sources and configure a supported vector store. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup.html">Set up
     * your data for ingestion</a>.
     * </p>
     * <note>
     * <p>
     * If you prefer to let Amazon Bedrock create and manage a vector store for you in Amazon OpenSearch Service, use
     * the console. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-create">Create a knowledge base</a>.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * Provide the <code>name</code> and an optional <code>description</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the Amazon Resource Name (ARN) with permissions to create a knowledge base in the <code>roleArn</code>
     * field.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the embedding model to use in the <code>embeddingModelArn</code> field in the
     * <code>knowledgeBaseConfiguration</code> object.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the configuration for your vector store in the <code>storageConfiguration</code> object.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Amazon OpenSearch Service database, use the <code>opensearchServerlessConfiguration</code> object. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-oss.html">Create a vector store
     * in Amazon OpenSearch Service</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Amazon Aurora database, use the <code>RdsConfiguration</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html">Create a vector store
     * in Amazon Aurora</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Pinecone database, use the <code>pineconeConfiguration</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-pinecone.html">Create a vector
     * store in Pinecone</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Redis Enterprise Cloud database, use the <code>redisEnterpriseCloudConfiguration</code> object. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-redis.html">Create a vector store
     * in Redis Enterprise Cloud</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param createKnowledgeBaseRequest
     * @return Result of the CreateKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.CreateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    CreateKnowledgeBaseResult createKnowledgeBase(CreateKnowledgeBaseRequest createKnowledgeBaseRequest);

    /**
     * <p>
     * Deletes an agent.
     * </p>
     * 
     * @param deleteAgentRequest
     * @return Result of the DeleteAgent operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.DeleteAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgent" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAgentResult deleteAgent(DeleteAgentRequest deleteAgentRequest);

    /**
     * <p>
     * Deletes an action group in an agent.
     * </p>
     * 
     * @param deleteAgentActionGroupRequest
     * @return Result of the DeleteAgentActionGroup operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.DeleteAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAgentActionGroupResult deleteAgentActionGroup(DeleteAgentActionGroupRequest deleteAgentActionGroupRequest);

    /**
     * <p>
     * Deletes an alias of an agent.
     * </p>
     * 
     * @param deleteAgentAliasRequest
     * @return Result of the DeleteAgentAlias operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.DeleteAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteAgentAliasResult deleteAgentAlias(DeleteAgentAliasRequest deleteAgentAliasRequest);

    /**
     * <p>
     * Deletes a version of an agent.
     * </p>
     * 
     * @param deleteAgentVersionRequest
     * @return Result of the DeleteAgentVersion operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.DeleteAgentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAgentVersionResult deleteAgentVersion(DeleteAgentVersionRequest deleteAgentVersionRequest);

    /**
     * <p>
     * Deletes a data source from a knowledge base.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest);

    /**
     * <p>
     * Deletes a knowledge base. Before deleting a knowledge base, you should disassociate the knowledge base from any
     * agents that it is associated with by making a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_DisassociateAgentKnowledgeBase.html"
     * >DisassociateAgentKnowledgeBase</a> request.
     * </p>
     * 
     * @param deleteKnowledgeBaseRequest
     * @return Result of the DeleteKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.DeleteKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteKnowledgeBaseResult deleteKnowledgeBase(DeleteKnowledgeBaseRequest deleteKnowledgeBaseRequest);

    /**
     * <p>
     * Disassociates a knowledge base from an agent.
     * </p>
     * 
     * @param disassociateAgentKnowledgeBaseRequest
     * @return Result of the DisassociateAgentKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.DisassociateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DisassociateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateAgentKnowledgeBaseResult disassociateAgentKnowledgeBase(DisassociateAgentKnowledgeBaseRequest disassociateAgentKnowledgeBaseRequest);

    /**
     * <p>
     * Gets information about an agent.
     * </p>
     * 
     * @param getAgentRequest
     * @return Result of the GetAgent operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgent" target="_top">AWS API
     *      Documentation</a>
     */
    GetAgentResult getAgent(GetAgentRequest getAgentRequest);

    /**
     * <p>
     * Gets information about an action group for an agent.
     * </p>
     * 
     * @param getAgentActionGroupRequest
     * @return Result of the GetAgentActionGroup operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetAgentActionGroupResult getAgentActionGroup(GetAgentActionGroupRequest getAgentActionGroupRequest);

    /**
     * <p>
     * Gets information about an alias of an agent.
     * </p>
     * 
     * @param getAgentAliasRequest
     * @return Result of the GetAgentAlias operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    GetAgentAliasResult getAgentAlias(GetAgentAliasRequest getAgentAliasRequest);

    /**
     * <p>
     * Gets information about a knowledge base associated with an agent.
     * </p>
     * 
     * @param getAgentKnowledgeBaseRequest
     * @return Result of the GetAgentKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    GetAgentKnowledgeBaseResult getAgentKnowledgeBase(GetAgentKnowledgeBaseRequest getAgentKnowledgeBaseRequest);

    /**
     * <p>
     * Gets details about a version of an agent.
     * </p>
     * 
     * @param getAgentVersionRequest
     * @return Result of the GetAgentVersion operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetAgentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    GetAgentVersionResult getAgentVersion(GetAgentVersionRequest getAgentVersionRequest);

    /**
     * <p>
     * Gets information about a data source.
     * </p>
     * 
     * @param getDataSourceRequest
     * @return Result of the GetDataSource operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    GetDataSourceResult getDataSource(GetDataSourceRequest getDataSourceRequest);

    /**
     * <p>
     * Gets information about a ingestion job, in which a data source is added to a knowledge base.
     * </p>
     * 
     * @param getIngestionJobRequest
     * @return Result of the GetIngestionJob operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetIngestionJob" target="_top">AWS
     *      API Documentation</a>
     */
    GetIngestionJobResult getIngestionJob(GetIngestionJobRequest getIngestionJobRequest);

    /**
     * <p>
     * Gets information about a knoweldge base.
     * </p>
     * 
     * @param getKnowledgeBaseRequest
     * @return Result of the GetKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetKnowledgeBase" target="_top">AWS
     *      API Documentation</a>
     */
    GetKnowledgeBaseResult getKnowledgeBase(GetKnowledgeBaseRequest getKnowledgeBaseRequest);

    /**
     * <p>
     * Lists the action groups for an agent and information about each one.
     * </p>
     * 
     * @param listAgentActionGroupsRequest
     * @return Result of the ListAgentActionGroups operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListAgentActionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentActionGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListAgentActionGroupsResult listAgentActionGroups(ListAgentActionGroupsRequest listAgentActionGroupsRequest);

    /**
     * <p>
     * Lists the aliases of an agent and information about each one.
     * </p>
     * 
     * @param listAgentAliasesRequest
     * @return Result of the ListAgentAliases operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListAgentAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentAliases" target="_top">AWS
     *      API Documentation</a>
     */
    ListAgentAliasesResult listAgentAliases(ListAgentAliasesRequest listAgentAliasesRequest);

    /**
     * <p>
     * Lists knowledge bases associated with an agent and information about each one.
     * </p>
     * 
     * @param listAgentKnowledgeBasesRequest
     * @return Result of the ListAgentKnowledgeBases operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListAgentKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentKnowledgeBases"
     *      target="_top">AWS API Documentation</a>
     */
    ListAgentKnowledgeBasesResult listAgentKnowledgeBases(ListAgentKnowledgeBasesRequest listAgentKnowledgeBasesRequest);

    /**
     * <p>
     * Lists the versions of an agent and information about each version.
     * </p>
     * 
     * @param listAgentVersionsRequest
     * @return Result of the ListAgentVersions operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListAgentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListAgentVersionsResult listAgentVersions(ListAgentVersionsRequest listAgentVersionsRequest);

    /**
     * <p>
     * Lists the agents belonging to an account and information about each agent.
     * </p>
     * 
     * @param listAgentsRequest
     * @return Result of the ListAgents operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSBedrockAgent.ListAgents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgents" target="_top">AWS API
     *      Documentation</a>
     */
    ListAgentsResult listAgents(ListAgentsRequest listAgentsRequest);

    /**
     * <p>
     * Lists the data sources in a knowledge base and information about each one.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return Result of the ListDataSources operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListDataSources" target="_top">AWS
     *      API Documentation</a>
     */
    ListDataSourcesResult listDataSources(ListDataSourcesRequest listDataSourcesRequest);

    /**
     * <p>
     * Lists the ingestion jobs for a data source and information about each of them.
     * </p>
     * 
     * @param listIngestionJobsRequest
     * @return Result of the ListIngestionJobs operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListIngestionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListIngestionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListIngestionJobsResult listIngestionJobs(ListIngestionJobsRequest listIngestionJobsRequest);

    /**
     * <p>
     * Lists the knowledge bases in an account and information about each of them.
     * </p>
     * 
     * @param listKnowledgeBasesRequest
     * @return Result of the ListKnowledgeBases operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSBedrockAgent.ListKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListKnowledgeBases"
     *      target="_top">AWS API Documentation</a>
     */
    ListKnowledgeBasesResult listKnowledgeBases(ListKnowledgeBasesRequest listKnowledgeBasesRequest);

    /**
     * <p>
     * List all the tags for the resource you specify.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Creates a <code>DRAFT</code> version of the agent that can be used for internal testing.
     * </p>
     * 
     * @param prepareAgentRequest
     * @return Result of the PrepareAgent operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.PrepareAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PrepareAgent" target="_top">AWS API
     *      Documentation</a>
     */
    PrepareAgentResult prepareAgent(PrepareAgentRequest prepareAgentRequest);

    /**
     * <p>
     * Begins an ingestion job, in which a data source is added to a knowledge base.
     * </p>
     * 
     * @param startIngestionJobRequest
     * @return Result of the StartIngestionJob operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.StartIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/StartIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartIngestionJobResult startIngestionJob(StartIngestionJobRequest startIngestionJobRequest);

    /**
     * <p>
     * Associate tags with a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/what-is-service.html">Tagging resources</a> in the
     * Amazon Bedrock User Guide.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Remove tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the configuration of an agent.
     * </p>
     * 
     * @param updateAgentRequest
     * @return Result of the UpdateAgent operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.UpdateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAgentResult updateAgent(UpdateAgentRequest updateAgentRequest);

    /**
     * <p>
     * Updates the configuration for an action group for an agent.
     * </p>
     * 
     * @param updateAgentActionGroupRequest
     * @return Result of the UpdateAgentActionGroup operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.UpdateAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAgentActionGroupResult updateAgentActionGroup(UpdateAgentActionGroupRequest updateAgentActionGroupRequest);

    /**
     * <p>
     * Updates configurations for an alias of an agent.
     * </p>
     * 
     * @param updateAgentAliasRequest
     * @return Result of the UpdateAgentAlias operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.UpdateAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateAgentAliasResult updateAgentAlias(UpdateAgentAliasRequest updateAgentAliasRequest);

    /**
     * <p>
     * Updates the configuration for a knowledge base that has been associated with an agent.
     * </p>
     * 
     * @param updateAgentKnowledgeBaseRequest
     * @return Result of the UpdateAgentKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.UpdateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAgentKnowledgeBaseResult updateAgentKnowledgeBase(UpdateAgentKnowledgeBaseRequest updateAgentKnowledgeBaseRequest);

    /**
     * <p>
     * Updates configurations for a data source.
     * </p>
     * <important>
     * <p>
     * You can't change the <code>chunkingConfiguration</code> after you create the data source. Specify the existing
     * <code>chunkingConfiguration</code>.
     * </p>
     * </important>
     * 
     * @param updateDataSourceRequest
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest updateDataSourceRequest);

    /**
     * <p>
     * Updates the configuration of a knowledge base with the fields that you specify. Because all fields will be
     * overwritten, you must include the same values for fields that you want to keep the same.
     * </p>
     * <p>
     * You can change the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>roleArn</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't change the <code>knowledgeBaseConfiguration</code> or <code>storageConfiguration</code> fields, so you
     * must specify the same configurations as when you created the knowledge base. You can send a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetKnowledgeBase.html"
     * >GetKnowledgeBase</a> request and copy the same configurations.
     * </p>
     * 
     * @param updateKnowledgeBaseRequest
     * @return Result of the UpdateKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.UpdateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateKnowledgeBaseResult updateKnowledgeBase(UpdateKnowledgeBaseRequest updateKnowledgeBaseRequest);

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

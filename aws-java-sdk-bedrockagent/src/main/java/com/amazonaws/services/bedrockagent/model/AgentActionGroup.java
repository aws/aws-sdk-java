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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about an action group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AgentActionGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentActionGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is carried out upon
     * invoking the action or the custom control method for handling the information elicited from the user.
     * </p>
     */
    private ActionGroupExecutor actionGroupExecutor;
    /**
     * <p>
     * The unique identifier of the action group.
     * </p>
     */
    private String actionGroupId;
    /**
     * <p>
     * The name of the action group.
     * </p>
     */
    private String actionGroupName;
    /**
     * <p>
     * Specifies whether the action group is available for the agent to invoke or not when sending an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html">InvokeAgent</a>
     * request.
     * </p>
     */
    private String actionGroupState;
    /**
     * <p>
     * The unique identifier of the agent to which the action group belongs.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The version of the agent to which the action group belongs.
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * Contains either details about the S3 object containing the OpenAPI schema for the action group or the JSON or
     * YAML-formatted payload defining the schema. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     * schemas</a>.
     * </p>
     */
    private APISchema apiSchema;
    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The time at which the action group was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description of the action group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Defines functions that each define parameters that the agent needs to invoke from the user. Each function
     * represents an action in an action group.
     * </p>
     */
    private FunctionSchema functionSchema;
    /**
     * <p>
     * If this field is set as <code>AMAZON.UserInput</code>, the agent can request the user for additional information
     * when trying to complete a task. The <code>description</code>, <code>apiSchema</code>, and
     * <code>actionGroupExecutor</code> fields must be blank for this action group.
     * </p>
     * <p>
     * During orchestration, if the agent determines that it needs to invoke an API in an action group, but doesn't have
     * enough information to complete the API request, it will invoke this action group instead and return an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html">Observation</a>
     * reprompting the user for more information.
     * </p>
     */
    private String parentActionSignature;
    /**
     * <p>
     * The time at which the action group was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is carried out upon
     * invoking the action or the custom control method for handling the information elicited from the user.
     * </p>
     * 
     * @param actionGroupExecutor
     *        The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is carried out
     *        upon invoking the action or the custom control method for handling the information elicited from the user.
     */

    public void setActionGroupExecutor(ActionGroupExecutor actionGroupExecutor) {
        this.actionGroupExecutor = actionGroupExecutor;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is carried out upon
     * invoking the action or the custom control method for handling the information elicited from the user.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is carried out
     *         upon invoking the action or the custom control method for handling the information elicited from the
     *         user.
     */

    public ActionGroupExecutor getActionGroupExecutor() {
        return this.actionGroupExecutor;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is carried out upon
     * invoking the action or the custom control method for handling the information elicited from the user.
     * </p>
     * 
     * @param actionGroupExecutor
     *        The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is carried out
     *        upon invoking the action or the custom control method for handling the information elicited from the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withActionGroupExecutor(ActionGroupExecutor actionGroupExecutor) {
        setActionGroupExecutor(actionGroupExecutor);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the action group.
     * </p>
     * 
     * @param actionGroupId
     *        The unique identifier of the action group.
     */

    public void setActionGroupId(String actionGroupId) {
        this.actionGroupId = actionGroupId;
    }

    /**
     * <p>
     * The unique identifier of the action group.
     * </p>
     * 
     * @return The unique identifier of the action group.
     */

    public String getActionGroupId() {
        return this.actionGroupId;
    }

    /**
     * <p>
     * The unique identifier of the action group.
     * </p>
     * 
     * @param actionGroupId
     *        The unique identifier of the action group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withActionGroupId(String actionGroupId) {
        setActionGroupId(actionGroupId);
        return this;
    }

    /**
     * <p>
     * The name of the action group.
     * </p>
     * 
     * @param actionGroupName
     *        The name of the action group.
     */

    public void setActionGroupName(String actionGroupName) {
        this.actionGroupName = actionGroupName;
    }

    /**
     * <p>
     * The name of the action group.
     * </p>
     * 
     * @return The name of the action group.
     */

    public String getActionGroupName() {
        return this.actionGroupName;
    }

    /**
     * <p>
     * The name of the action group.
     * </p>
     * 
     * @param actionGroupName
     *        The name of the action group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withActionGroupName(String actionGroupName) {
        setActionGroupName(actionGroupName);
        return this;
    }

    /**
     * <p>
     * Specifies whether the action group is available for the agent to invoke or not when sending an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html">InvokeAgent</a>
     * request.
     * </p>
     * 
     * @param actionGroupState
     *        Specifies whether the action group is available for the agent to invoke or not when sending an <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html"
     *        >InvokeAgent</a> request.
     * @see ActionGroupState
     */

    public void setActionGroupState(String actionGroupState) {
        this.actionGroupState = actionGroupState;
    }

    /**
     * <p>
     * Specifies whether the action group is available for the agent to invoke or not when sending an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html">InvokeAgent</a>
     * request.
     * </p>
     * 
     * @return Specifies whether the action group is available for the agent to invoke or not when sending an <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html"
     *         >InvokeAgent</a> request.
     * @see ActionGroupState
     */

    public String getActionGroupState() {
        return this.actionGroupState;
    }

    /**
     * <p>
     * Specifies whether the action group is available for the agent to invoke or not when sending an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html">InvokeAgent</a>
     * request.
     * </p>
     * 
     * @param actionGroupState
     *        Specifies whether the action group is available for the agent to invoke or not when sending an <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html"
     *        >InvokeAgent</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroupState
     */

    public AgentActionGroup withActionGroupState(String actionGroupState) {
        setActionGroupState(actionGroupState);
        return this;
    }

    /**
     * <p>
     * Specifies whether the action group is available for the agent to invoke or not when sending an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html">InvokeAgent</a>
     * request.
     * </p>
     * 
     * @param actionGroupState
     *        Specifies whether the action group is available for the agent to invoke or not when sending an <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html"
     *        >InvokeAgent</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroupState
     */

    public AgentActionGroup withActionGroupState(ActionGroupState actionGroupState) {
        this.actionGroupState = actionGroupState.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier of the agent to which the action group belongs.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent to which the action group belongs.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent to which the action group belongs.
     * </p>
     * 
     * @return The unique identifier of the agent to which the action group belongs.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent to which the action group belongs.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent to which the action group belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The version of the agent to which the action group belongs.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent to which the action group belongs.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The version of the agent to which the action group belongs.
     * </p>
     * 
     * @return The version of the agent to which the action group belongs.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The version of the agent to which the action group belongs.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent to which the action group belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * Contains either details about the S3 object containing the OpenAPI schema for the action group or the JSON or
     * YAML-formatted payload defining the schema. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     * schemas</a>.
     * </p>
     * 
     * @param apiSchema
     *        Contains either details about the S3 object containing the OpenAPI schema for the action group or the JSON
     *        or YAML-formatted payload defining the schema. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     *        schemas</a>.
     */

    public void setApiSchema(APISchema apiSchema) {
        this.apiSchema = apiSchema;
    }

    /**
     * <p>
     * Contains either details about the S3 object containing the OpenAPI schema for the action group or the JSON or
     * YAML-formatted payload defining the schema. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     * schemas</a>.
     * </p>
     * 
     * @return Contains either details about the S3 object containing the OpenAPI schema for the action group or the
     *         JSON or YAML-formatted payload defining the schema. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     *         schemas</a>.
     */

    public APISchema getApiSchema() {
        return this.apiSchema;
    }

    /**
     * <p>
     * Contains either details about the S3 object containing the OpenAPI schema for the action group or the JSON or
     * YAML-formatted payload defining the schema. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     * schemas</a>.
     * </p>
     * 
     * @param apiSchema
     *        Contains either details about the S3 object containing the OpenAPI schema for the action group or the JSON
     *        or YAML-formatted payload defining the schema. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     *        schemas</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withApiSchema(APISchema apiSchema) {
        setApiSchema(apiSchema);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *         this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The time at which the action group was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the action group was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the action group was created.
     * </p>
     * 
     * @return The time at which the action group was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the action group was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the action group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description of the action group.
     * </p>
     * 
     * @param description
     *        The description of the action group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the action group.
     * </p>
     * 
     * @return The description of the action group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the action group.
     * </p>
     * 
     * @param description
     *        The description of the action group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Defines functions that each define parameters that the agent needs to invoke from the user. Each function
     * represents an action in an action group.
     * </p>
     * 
     * @param functionSchema
     *        Defines functions that each define parameters that the agent needs to invoke from the user. Each function
     *        represents an action in an action group.
     */

    public void setFunctionSchema(FunctionSchema functionSchema) {
        this.functionSchema = functionSchema;
    }

    /**
     * <p>
     * Defines functions that each define parameters that the agent needs to invoke from the user. Each function
     * represents an action in an action group.
     * </p>
     * 
     * @return Defines functions that each define parameters that the agent needs to invoke from the user. Each function
     *         represents an action in an action group.
     */

    public FunctionSchema getFunctionSchema() {
        return this.functionSchema;
    }

    /**
     * <p>
     * Defines functions that each define parameters that the agent needs to invoke from the user. Each function
     * represents an action in an action group.
     * </p>
     * 
     * @param functionSchema
     *        Defines functions that each define parameters that the agent needs to invoke from the user. Each function
     *        represents an action in an action group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withFunctionSchema(FunctionSchema functionSchema) {
        setFunctionSchema(functionSchema);
        return this;
    }

    /**
     * <p>
     * If this field is set as <code>AMAZON.UserInput</code>, the agent can request the user for additional information
     * when trying to complete a task. The <code>description</code>, <code>apiSchema</code>, and
     * <code>actionGroupExecutor</code> fields must be blank for this action group.
     * </p>
     * <p>
     * During orchestration, if the agent determines that it needs to invoke an API in an action group, but doesn't have
     * enough information to complete the API request, it will invoke this action group instead and return an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html">Observation</a>
     * reprompting the user for more information.
     * </p>
     * 
     * @param parentActionSignature
     *        If this field is set as <code>AMAZON.UserInput</code>, the agent can request the user for additional
     *        information when trying to complete a task. The <code>description</code>, <code>apiSchema</code>, and
     *        <code>actionGroupExecutor</code> fields must be blank for this action group.</p>
     *        <p>
     *        During orchestration, if the agent determines that it needs to invoke an API in an action group, but
     *        doesn't have enough information to complete the API request, it will invoke this action group instead and
     *        return an <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html"
     *        >Observation</a> reprompting the user for more information.
     * @see ActionGroupSignature
     */

    public void setParentActionSignature(String parentActionSignature) {
        this.parentActionSignature = parentActionSignature;
    }

    /**
     * <p>
     * If this field is set as <code>AMAZON.UserInput</code>, the agent can request the user for additional information
     * when trying to complete a task. The <code>description</code>, <code>apiSchema</code>, and
     * <code>actionGroupExecutor</code> fields must be blank for this action group.
     * </p>
     * <p>
     * During orchestration, if the agent determines that it needs to invoke an API in an action group, but doesn't have
     * enough information to complete the API request, it will invoke this action group instead and return an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html">Observation</a>
     * reprompting the user for more information.
     * </p>
     * 
     * @return If this field is set as <code>AMAZON.UserInput</code>, the agent can request the user for additional
     *         information when trying to complete a task. The <code>description</code>, <code>apiSchema</code>, and
     *         <code>actionGroupExecutor</code> fields must be blank for this action group.</p>
     *         <p>
     *         During orchestration, if the agent determines that it needs to invoke an API in an action group, but
     *         doesn't have enough information to complete the API request, it will invoke this action group instead and
     *         return an <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html"
     *         >Observation</a> reprompting the user for more information.
     * @see ActionGroupSignature
     */

    public String getParentActionSignature() {
        return this.parentActionSignature;
    }

    /**
     * <p>
     * If this field is set as <code>AMAZON.UserInput</code>, the agent can request the user for additional information
     * when trying to complete a task. The <code>description</code>, <code>apiSchema</code>, and
     * <code>actionGroupExecutor</code> fields must be blank for this action group.
     * </p>
     * <p>
     * During orchestration, if the agent determines that it needs to invoke an API in an action group, but doesn't have
     * enough information to complete the API request, it will invoke this action group instead and return an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html">Observation</a>
     * reprompting the user for more information.
     * </p>
     * 
     * @param parentActionSignature
     *        If this field is set as <code>AMAZON.UserInput</code>, the agent can request the user for additional
     *        information when trying to complete a task. The <code>description</code>, <code>apiSchema</code>, and
     *        <code>actionGroupExecutor</code> fields must be blank for this action group.</p>
     *        <p>
     *        During orchestration, if the agent determines that it needs to invoke an API in an action group, but
     *        doesn't have enough information to complete the API request, it will invoke this action group instead and
     *        return an <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html"
     *        >Observation</a> reprompting the user for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroupSignature
     */

    public AgentActionGroup withParentActionSignature(String parentActionSignature) {
        setParentActionSignature(parentActionSignature);
        return this;
    }

    /**
     * <p>
     * If this field is set as <code>AMAZON.UserInput</code>, the agent can request the user for additional information
     * when trying to complete a task. The <code>description</code>, <code>apiSchema</code>, and
     * <code>actionGroupExecutor</code> fields must be blank for this action group.
     * </p>
     * <p>
     * During orchestration, if the agent determines that it needs to invoke an API in an action group, but doesn't have
     * enough information to complete the API request, it will invoke this action group instead and return an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html">Observation</a>
     * reprompting the user for more information.
     * </p>
     * 
     * @param parentActionSignature
     *        If this field is set as <code>AMAZON.UserInput</code>, the agent can request the user for additional
     *        information when trying to complete a task. The <code>description</code>, <code>apiSchema</code>, and
     *        <code>actionGroupExecutor</code> fields must be blank for this action group.</p>
     *        <p>
     *        During orchestration, if the agent determines that it needs to invoke an API in an action group, but
     *        doesn't have enough information to complete the API request, it will invoke this action group instead and
     *        return an <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html"
     *        >Observation</a> reprompting the user for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroupSignature
     */

    public AgentActionGroup withParentActionSignature(ActionGroupSignature parentActionSignature) {
        this.parentActionSignature = parentActionSignature.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the action group was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the action group was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the action group was last updated.
     * </p>
     * 
     * @return The time at which the action group was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the action group was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the action group was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getActionGroupExecutor() != null)
            sb.append("ActionGroupExecutor: ").append(getActionGroupExecutor()).append(",");
        if (getActionGroupId() != null)
            sb.append("ActionGroupId: ").append(getActionGroupId()).append(",");
        if (getActionGroupName() != null)
            sb.append("ActionGroupName: ").append(getActionGroupName()).append(",");
        if (getActionGroupState() != null)
            sb.append("ActionGroupState: ").append(getActionGroupState()).append(",");
        if (getAgentId() != null)
            sb.append("AgentId: ").append(getAgentId()).append(",");
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion()).append(",");
        if (getApiSchema() != null)
            sb.append("ApiSchema: ").append(getApiSchema()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFunctionSchema() != null)
            sb.append("FunctionSchema: ").append(getFunctionSchema()).append(",");
        if (getParentActionSignature() != null)
            sb.append("ParentActionSignature: ").append(getParentActionSignature()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentActionGroup == false)
            return false;
        AgentActionGroup other = (AgentActionGroup) obj;
        if (other.getActionGroupExecutor() == null ^ this.getActionGroupExecutor() == null)
            return false;
        if (other.getActionGroupExecutor() != null && other.getActionGroupExecutor().equals(this.getActionGroupExecutor()) == false)
            return false;
        if (other.getActionGroupId() == null ^ this.getActionGroupId() == null)
            return false;
        if (other.getActionGroupId() != null && other.getActionGroupId().equals(this.getActionGroupId()) == false)
            return false;
        if (other.getActionGroupName() == null ^ this.getActionGroupName() == null)
            return false;
        if (other.getActionGroupName() != null && other.getActionGroupName().equals(this.getActionGroupName()) == false)
            return false;
        if (other.getActionGroupState() == null ^ this.getActionGroupState() == null)
            return false;
        if (other.getActionGroupState() != null && other.getActionGroupState().equals(this.getActionGroupState()) == false)
            return false;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        if (other.getApiSchema() == null ^ this.getApiSchema() == null)
            return false;
        if (other.getApiSchema() != null && other.getApiSchema().equals(this.getApiSchema()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFunctionSchema() == null ^ this.getFunctionSchema() == null)
            return false;
        if (other.getFunctionSchema() != null && other.getFunctionSchema().equals(this.getFunctionSchema()) == false)
            return false;
        if (other.getParentActionSignature() == null ^ this.getParentActionSignature() == null)
            return false;
        if (other.getParentActionSignature() != null && other.getParentActionSignature().equals(this.getParentActionSignature()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionGroupExecutor() == null) ? 0 : getActionGroupExecutor().hashCode());
        hashCode = prime * hashCode + ((getActionGroupId() == null) ? 0 : getActionGroupId().hashCode());
        hashCode = prime * hashCode + ((getActionGroupName() == null) ? 0 : getActionGroupName().hashCode());
        hashCode = prime * hashCode + ((getActionGroupState() == null) ? 0 : getActionGroupState().hashCode());
        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getApiSchema() == null) ? 0 : getApiSchema().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFunctionSchema() == null) ? 0 : getFunctionSchema().hashCode());
        hashCode = prime * hashCode + ((getParentActionSignature() == null) ? 0 : getParentActionSignature().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AgentActionGroup clone() {
        try {
            return (AgentActionGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.AgentActionGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentActionGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAgentActionGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is carried out upon
     * invoking the action or the custom control method for handling the information elicited from the user.
     * </p>
     */
    private ActionGroupExecutor actionGroupExecutor;
    /**
     * <p>
     * The name to give the action group.
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
     * The unique identifier of the agent for which to create the action group.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The version of the agent for which to create the action group.
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
     * A description of the action group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Contains details about the function schema for the action group or the JSON or YAML-formatted payload defining
     * the schema.
     * </p>
     */
    private FunctionSchema functionSchema;
    /**
     * <p>
     * To allow your agent to request the user for additional information when trying to complete a task, set this field
     * to <code>AMAZON.UserInput</code>. You must leave the <code>description</code>, <code>apiSchema</code>, and
     * <code>actionGroupExecutor</code> fields blank for this action group.
     * </p>
     * <p>
     * During orchestration, if your agent determines that it needs to invoke an API in an action group, but doesn't
     * have enough information to complete the API request, it will invoke this action group instead and return an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html">Observation</a>
     * reprompting the user for more information.
     * </p>
     */
    private String parentActionGroupSignature;

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

    public CreateAgentActionGroupRequest withActionGroupExecutor(ActionGroupExecutor actionGroupExecutor) {
        setActionGroupExecutor(actionGroupExecutor);
        return this;
    }

    /**
     * <p>
     * The name to give the action group.
     * </p>
     * 
     * @param actionGroupName
     *        The name to give the action group.
     */

    public void setActionGroupName(String actionGroupName) {
        this.actionGroupName = actionGroupName;
    }

    /**
     * <p>
     * The name to give the action group.
     * </p>
     * 
     * @return The name to give the action group.
     */

    public String getActionGroupName() {
        return this.actionGroupName;
    }

    /**
     * <p>
     * The name to give the action group.
     * </p>
     * 
     * @param actionGroupName
     *        The name to give the action group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentActionGroupRequest withActionGroupName(String actionGroupName) {
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

    public CreateAgentActionGroupRequest withActionGroupState(String actionGroupState) {
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

    public CreateAgentActionGroupRequest withActionGroupState(ActionGroupState actionGroupState) {
        this.actionGroupState = actionGroupState.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier of the agent for which to create the action group.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent for which to create the action group.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent for which to create the action group.
     * </p>
     * 
     * @return The unique identifier of the agent for which to create the action group.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent for which to create the action group.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent for which to create the action group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentActionGroupRequest withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The version of the agent for which to create the action group.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent for which to create the action group.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The version of the agent for which to create the action group.
     * </p>
     * 
     * @return The version of the agent for which to create the action group.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The version of the agent for which to create the action group.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent for which to create the action group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentActionGroupRequest withAgentVersion(String agentVersion) {
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

    public CreateAgentActionGroupRequest withApiSchema(APISchema apiSchema) {
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

    public CreateAgentActionGroupRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A description of the action group.
     * </p>
     * 
     * @param description
     *        A description of the action group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the action group.
     * </p>
     * 
     * @return A description of the action group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the action group.
     * </p>
     * 
     * @param description
     *        A description of the action group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentActionGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Contains details about the function schema for the action group or the JSON or YAML-formatted payload defining
     * the schema.
     * </p>
     * 
     * @param functionSchema
     *        Contains details about the function schema for the action group or the JSON or YAML-formatted payload
     *        defining the schema.
     */

    public void setFunctionSchema(FunctionSchema functionSchema) {
        this.functionSchema = functionSchema;
    }

    /**
     * <p>
     * Contains details about the function schema for the action group or the JSON or YAML-formatted payload defining
     * the schema.
     * </p>
     * 
     * @return Contains details about the function schema for the action group or the JSON or YAML-formatted payload
     *         defining the schema.
     */

    public FunctionSchema getFunctionSchema() {
        return this.functionSchema;
    }

    /**
     * <p>
     * Contains details about the function schema for the action group or the JSON or YAML-formatted payload defining
     * the schema.
     * </p>
     * 
     * @param functionSchema
     *        Contains details about the function schema for the action group or the JSON or YAML-formatted payload
     *        defining the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentActionGroupRequest withFunctionSchema(FunctionSchema functionSchema) {
        setFunctionSchema(functionSchema);
        return this;
    }

    /**
     * <p>
     * To allow your agent to request the user for additional information when trying to complete a task, set this field
     * to <code>AMAZON.UserInput</code>. You must leave the <code>description</code>, <code>apiSchema</code>, and
     * <code>actionGroupExecutor</code> fields blank for this action group.
     * </p>
     * <p>
     * During orchestration, if your agent determines that it needs to invoke an API in an action group, but doesn't
     * have enough information to complete the API request, it will invoke this action group instead and return an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html">Observation</a>
     * reprompting the user for more information.
     * </p>
     * 
     * @param parentActionGroupSignature
     *        To allow your agent to request the user for additional information when trying to complete a task, set
     *        this field to <code>AMAZON.UserInput</code>. You must leave the <code>description</code>,
     *        <code>apiSchema</code>, and <code>actionGroupExecutor</code> fields blank for this action group.</p>
     *        <p>
     *        During orchestration, if your agent determines that it needs to invoke an API in an action group, but
     *        doesn't have enough information to complete the API request, it will invoke this action group instead and
     *        return an <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html"
     *        >Observation</a> reprompting the user for more information.
     * @see ActionGroupSignature
     */

    public void setParentActionGroupSignature(String parentActionGroupSignature) {
        this.parentActionGroupSignature = parentActionGroupSignature;
    }

    /**
     * <p>
     * To allow your agent to request the user for additional information when trying to complete a task, set this field
     * to <code>AMAZON.UserInput</code>. You must leave the <code>description</code>, <code>apiSchema</code>, and
     * <code>actionGroupExecutor</code> fields blank for this action group.
     * </p>
     * <p>
     * During orchestration, if your agent determines that it needs to invoke an API in an action group, but doesn't
     * have enough information to complete the API request, it will invoke this action group instead and return an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html">Observation</a>
     * reprompting the user for more information.
     * </p>
     * 
     * @return To allow your agent to request the user for additional information when trying to complete a task, set
     *         this field to <code>AMAZON.UserInput</code>. You must leave the <code>description</code>,
     *         <code>apiSchema</code>, and <code>actionGroupExecutor</code> fields blank for this action group.</p>
     *         <p>
     *         During orchestration, if your agent determines that it needs to invoke an API in an action group, but
     *         doesn't have enough information to complete the API request, it will invoke this action group instead and
     *         return an <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html"
     *         >Observation</a> reprompting the user for more information.
     * @see ActionGroupSignature
     */

    public String getParentActionGroupSignature() {
        return this.parentActionGroupSignature;
    }

    /**
     * <p>
     * To allow your agent to request the user for additional information when trying to complete a task, set this field
     * to <code>AMAZON.UserInput</code>. You must leave the <code>description</code>, <code>apiSchema</code>, and
     * <code>actionGroupExecutor</code> fields blank for this action group.
     * </p>
     * <p>
     * During orchestration, if your agent determines that it needs to invoke an API in an action group, but doesn't
     * have enough information to complete the API request, it will invoke this action group instead and return an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html">Observation</a>
     * reprompting the user for more information.
     * </p>
     * 
     * @param parentActionGroupSignature
     *        To allow your agent to request the user for additional information when trying to complete a task, set
     *        this field to <code>AMAZON.UserInput</code>. You must leave the <code>description</code>,
     *        <code>apiSchema</code>, and <code>actionGroupExecutor</code> fields blank for this action group.</p>
     *        <p>
     *        During orchestration, if your agent determines that it needs to invoke an API in an action group, but
     *        doesn't have enough information to complete the API request, it will invoke this action group instead and
     *        return an <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html"
     *        >Observation</a> reprompting the user for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroupSignature
     */

    public CreateAgentActionGroupRequest withParentActionGroupSignature(String parentActionGroupSignature) {
        setParentActionGroupSignature(parentActionGroupSignature);
        return this;
    }

    /**
     * <p>
     * To allow your agent to request the user for additional information when trying to complete a task, set this field
     * to <code>AMAZON.UserInput</code>. You must leave the <code>description</code>, <code>apiSchema</code>, and
     * <code>actionGroupExecutor</code> fields blank for this action group.
     * </p>
     * <p>
     * During orchestration, if your agent determines that it needs to invoke an API in an action group, but doesn't
     * have enough information to complete the API request, it will invoke this action group instead and return an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html">Observation</a>
     * reprompting the user for more information.
     * </p>
     * 
     * @param parentActionGroupSignature
     *        To allow your agent to request the user for additional information when trying to complete a task, set
     *        this field to <code>AMAZON.UserInput</code>. You must leave the <code>description</code>,
     *        <code>apiSchema</code>, and <code>actionGroupExecutor</code> fields blank for this action group.</p>
     *        <p>
     *        During orchestration, if your agent determines that it needs to invoke an API in an action group, but
     *        doesn't have enough information to complete the API request, it will invoke this action group instead and
     *        return an <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html"
     *        >Observation</a> reprompting the user for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroupSignature
     */

    public CreateAgentActionGroupRequest withParentActionGroupSignature(ActionGroupSignature parentActionGroupSignature) {
        this.parentActionGroupSignature = parentActionGroupSignature.toString();
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFunctionSchema() != null)
            sb.append("FunctionSchema: ").append(getFunctionSchema()).append(",");
        if (getParentActionGroupSignature() != null)
            sb.append("ParentActionGroupSignature: ").append(getParentActionGroupSignature());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAgentActionGroupRequest == false)
            return false;
        CreateAgentActionGroupRequest other = (CreateAgentActionGroupRequest) obj;
        if (other.getActionGroupExecutor() == null ^ this.getActionGroupExecutor() == null)
            return false;
        if (other.getActionGroupExecutor() != null && other.getActionGroupExecutor().equals(this.getActionGroupExecutor()) == false)
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFunctionSchema() == null ^ this.getFunctionSchema() == null)
            return false;
        if (other.getFunctionSchema() != null && other.getFunctionSchema().equals(this.getFunctionSchema()) == false)
            return false;
        if (other.getParentActionGroupSignature() == null ^ this.getParentActionGroupSignature() == null)
            return false;
        if (other.getParentActionGroupSignature() != null && other.getParentActionGroupSignature().equals(this.getParentActionGroupSignature()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionGroupExecutor() == null) ? 0 : getActionGroupExecutor().hashCode());
        hashCode = prime * hashCode + ((getActionGroupName() == null) ? 0 : getActionGroupName().hashCode());
        hashCode = prime * hashCode + ((getActionGroupState() == null) ? 0 : getActionGroupState().hashCode());
        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getApiSchema() == null) ? 0 : getApiSchema().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFunctionSchema() == null) ? 0 : getFunctionSchema().hashCode());
        hashCode = prime * hashCode + ((getParentActionGroupSignature() == null) ? 0 : getParentActionGroupSignature().hashCode());
        return hashCode;
    }

    @Override
    public CreateAgentActionGroupRequest clone() {
        return (CreateAgentActionGroupRequest) super.clone();
    }

}

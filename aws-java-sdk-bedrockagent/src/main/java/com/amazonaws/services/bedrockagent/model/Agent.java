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
 * Contains details about an agent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/Agent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Agent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent.
     * </p>
     */
    private String agentArn;
    /**
     * <p>
     * The unique identifier of the agent.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The name of the agent.
     * </p>
     */
    private String agentName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the agent.
     * </p>
     */
    private String agentResourceRoleArn;
    /**
     * <p>
     * The status of the agent and whether it is ready for use. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The agent is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING – The agent is being prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARED – The agent is prepared and ready to be invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_PREPARED – The agent has been created but not yet prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED – The agent API operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The agent is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The agent is being deleted.
     * </p>
     * </li>
     * </ul>
     */
    private String agentStatus;
    /**
     * <p>
     * The version of the agent.
     * </p>
     */
    private String agentVersion;
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
     * The time at which the agent was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key that encrypts the agent.
     * </p>
     */
    private String customerEncryptionKeyArn;
    /**
     * <p>
     * The description of the agent.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Contains reasons that the agent-related API that you invoked failed.
     * </p>
     */
    private java.util.List<String> failureReasons;
    /**
     * <p>
     * The foundation model used for orchestration by the agent.
     * </p>
     */
    private String foundationModel;
    /**
     * <p>
     * The guardrails configuration assigned to the agent.
     * </p>
     */
    private GuardrailConfiguration guardrailConfiguration;
    /**
     * <p>
     * The number of seconds for which Amazon Bedrock keeps information about a user's conversation with the agent.
     * </p>
     * <p>
     * A user interaction remains active for the amount of time specified. If no conversation occurs during this time,
     * the session expires and Amazon Bedrock deletes any data provided before the timeout.
     * </p>
     */
    private Integer idleSessionTTLInSeconds;
    /**
     * <p>
     * Instructions that tell the agent what it should do and how it should interact with users.
     * </p>
     */
    private String instruction;
    /**
     * <p>
     * The time at which the agent was last prepared.
     * </p>
     */
    private java.util.Date preparedAt;
    /**
     * <p>
     * Contains configurations to override prompt templates in different parts of an agent sequence. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced
     * prompts</a>.
     * </p>
     */
    private PromptOverrideConfiguration promptOverrideConfiguration;
    /**
     * <p>
     * Contains recommended actions to take for the agent-related API that you invoked to succeed.
     * </p>
     */
    private java.util.List<String> recommendedActions;
    /**
     * <p>
     * The time at which the agent was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent.
     * </p>
     * 
     * @param agentArn
     *        The Amazon Resource Name (ARN) of the agent.
     */

    public void setAgentArn(String agentArn) {
        this.agentArn = agentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the agent.
     */

    public String getAgentArn() {
        return this.agentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent.
     * </p>
     * 
     * @param agentArn
     *        The Amazon Resource Name (ARN) of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withAgentArn(String agentArn) {
        setAgentArn(agentArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the agent.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent.
     * </p>
     * 
     * @return The unique identifier of the agent.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The name of the agent.
     * </p>
     * 
     * @param agentName
     *        The name of the agent.
     */

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    /**
     * <p>
     * The name of the agent.
     * </p>
     * 
     * @return The name of the agent.
     */

    public String getAgentName() {
        return this.agentName;
    }

    /**
     * <p>
     * The name of the agent.
     * </p>
     * 
     * @param agentName
     *        The name of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withAgentName(String agentName) {
        setAgentName(agentName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the agent.
     * </p>
     * 
     * @param agentResourceRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the agent.
     */

    public void setAgentResourceRoleArn(String agentResourceRoleArn) {
        this.agentResourceRoleArn = agentResourceRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the agent.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the agent.
     */

    public String getAgentResourceRoleArn() {
        return this.agentResourceRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the agent.
     * </p>
     * 
     * @param agentResourceRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withAgentResourceRoleArn(String agentResourceRoleArn) {
        setAgentResourceRoleArn(agentResourceRoleArn);
        return this;
    }

    /**
     * <p>
     * The status of the agent and whether it is ready for use. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The agent is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING – The agent is being prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARED – The agent is prepared and ready to be invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_PREPARED – The agent has been created but not yet prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED – The agent API operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The agent is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The agent is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param agentStatus
     *        The status of the agent and whether it is ready for use. The following statuses are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING – The agent is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARING – The agent is being prepared.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARED – The agent is prepared and ready to be invoked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NOT_PREPARED – The agent has been created but not yet prepared.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED – The agent API operation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The agent is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The agent is being deleted.
     *        </p>
     *        </li>
     * @see AgentStatus
     */

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    /**
     * <p>
     * The status of the agent and whether it is ready for use. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The agent is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING – The agent is being prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARED – The agent is prepared and ready to be invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_PREPARED – The agent has been created but not yet prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED – The agent API operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The agent is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The agent is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the agent and whether it is ready for use. The following statuses are possible:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATING – The agent is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PREPARING – The agent is being prepared.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PREPARED – The agent is prepared and ready to be invoked.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NOT_PREPARED – The agent has been created but not yet prepared.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FAILED – The agent API operation failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UPDATING – The agent is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETING – The agent is being deleted.
     *         </p>
     *         </li>
     * @see AgentStatus
     */

    public String getAgentStatus() {
        return this.agentStatus;
    }

    /**
     * <p>
     * The status of the agent and whether it is ready for use. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The agent is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING – The agent is being prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARED – The agent is prepared and ready to be invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_PREPARED – The agent has been created but not yet prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED – The agent API operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The agent is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The agent is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param agentStatus
     *        The status of the agent and whether it is ready for use. The following statuses are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING – The agent is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARING – The agent is being prepared.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARED – The agent is prepared and ready to be invoked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NOT_PREPARED – The agent has been created but not yet prepared.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED – The agent API operation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The agent is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The agent is being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public Agent withAgentStatus(String agentStatus) {
        setAgentStatus(agentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the agent and whether it is ready for use. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The agent is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING – The agent is being prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARED – The agent is prepared and ready to be invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_PREPARED – The agent has been created but not yet prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED – The agent API operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The agent is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The agent is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param agentStatus
     *        The status of the agent and whether it is ready for use. The following statuses are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING – The agent is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARING – The agent is being prepared.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARED – The agent is prepared and ready to be invoked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NOT_PREPARED – The agent has been created but not yet prepared.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED – The agent API operation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The agent is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The agent is being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public Agent withAgentStatus(AgentStatus agentStatus) {
        this.agentStatus = agentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The version of the agent.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The version of the agent.
     * </p>
     * 
     * @return The version of the agent.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The version of the agent.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
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

    public Agent withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The time at which the agent was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the agent was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the agent was created.
     * </p>
     * 
     * @return The time at which the agent was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the agent was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the agent was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key that encrypts the agent.
     * </p>
     * 
     * @param customerEncryptionKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key that encrypts the agent.
     */

    public void setCustomerEncryptionKeyArn(String customerEncryptionKeyArn) {
        this.customerEncryptionKeyArn = customerEncryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key that encrypts the agent.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS key that encrypts the agent.
     */

    public String getCustomerEncryptionKeyArn() {
        return this.customerEncryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key that encrypts the agent.
     * </p>
     * 
     * @param customerEncryptionKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key that encrypts the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withCustomerEncryptionKeyArn(String customerEncryptionKeyArn) {
        setCustomerEncryptionKeyArn(customerEncryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * The description of the agent.
     * </p>
     * 
     * @param description
     *        The description of the agent.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the agent.
     * </p>
     * 
     * @return The description of the agent.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the agent.
     * </p>
     * 
     * @param description
     *        The description of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Contains reasons that the agent-related API that you invoked failed.
     * </p>
     * 
     * @return Contains reasons that the agent-related API that you invoked failed.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * Contains reasons that the agent-related API that you invoked failed.
     * </p>
     * 
     * @param failureReasons
     *        Contains reasons that the agent-related API that you invoked failed.
     */

    public void setFailureReasons(java.util.Collection<String> failureReasons) {
        if (failureReasons == null) {
            this.failureReasons = null;
            return;
        }

        this.failureReasons = new java.util.ArrayList<String>(failureReasons);
    }

    /**
     * <p>
     * Contains reasons that the agent-related API that you invoked failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        Contains reasons that the agent-related API that you invoked failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withFailureReasons(String... failureReasons) {
        if (this.failureReasons == null) {
            setFailureReasons(new java.util.ArrayList<String>(failureReasons.length));
        }
        for (String ele : failureReasons) {
            this.failureReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains reasons that the agent-related API that you invoked failed.
     * </p>
     * 
     * @param failureReasons
     *        Contains reasons that the agent-related API that you invoked failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withFailureReasons(java.util.Collection<String> failureReasons) {
        setFailureReasons(failureReasons);
        return this;
    }

    /**
     * <p>
     * The foundation model used for orchestration by the agent.
     * </p>
     * 
     * @param foundationModel
     *        The foundation model used for orchestration by the agent.
     */

    public void setFoundationModel(String foundationModel) {
        this.foundationModel = foundationModel;
    }

    /**
     * <p>
     * The foundation model used for orchestration by the agent.
     * </p>
     * 
     * @return The foundation model used for orchestration by the agent.
     */

    public String getFoundationModel() {
        return this.foundationModel;
    }

    /**
     * <p>
     * The foundation model used for orchestration by the agent.
     * </p>
     * 
     * @param foundationModel
     *        The foundation model used for orchestration by the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withFoundationModel(String foundationModel) {
        setFoundationModel(foundationModel);
        return this;
    }

    /**
     * <p>
     * The guardrails configuration assigned to the agent.
     * </p>
     * 
     * @param guardrailConfiguration
     *        The guardrails configuration assigned to the agent.
     */

    public void setGuardrailConfiguration(GuardrailConfiguration guardrailConfiguration) {
        this.guardrailConfiguration = guardrailConfiguration;
    }

    /**
     * <p>
     * The guardrails configuration assigned to the agent.
     * </p>
     * 
     * @return The guardrails configuration assigned to the agent.
     */

    public GuardrailConfiguration getGuardrailConfiguration() {
        return this.guardrailConfiguration;
    }

    /**
     * <p>
     * The guardrails configuration assigned to the agent.
     * </p>
     * 
     * @param guardrailConfiguration
     *        The guardrails configuration assigned to the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withGuardrailConfiguration(GuardrailConfiguration guardrailConfiguration) {
        setGuardrailConfiguration(guardrailConfiguration);
        return this;
    }

    /**
     * <p>
     * The number of seconds for which Amazon Bedrock keeps information about a user's conversation with the agent.
     * </p>
     * <p>
     * A user interaction remains active for the amount of time specified. If no conversation occurs during this time,
     * the session expires and Amazon Bedrock deletes any data provided before the timeout.
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The number of seconds for which Amazon Bedrock keeps information about a user's conversation with the
     *        agent.</p>
     *        <p>
     *        A user interaction remains active for the amount of time specified. If no conversation occurs during this
     *        time, the session expires and Amazon Bedrock deletes any data provided before the timeout.
     */

    public void setIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        this.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The number of seconds for which Amazon Bedrock keeps information about a user's conversation with the agent.
     * </p>
     * <p>
     * A user interaction remains active for the amount of time specified. If no conversation occurs during this time,
     * the session expires and Amazon Bedrock deletes any data provided before the timeout.
     * </p>
     * 
     * @return The number of seconds for which Amazon Bedrock keeps information about a user's conversation with the
     *         agent.</p>
     *         <p>
     *         A user interaction remains active for the amount of time specified. If no conversation occurs during this
     *         time, the session expires and Amazon Bedrock deletes any data provided before the timeout.
     */

    public Integer getIdleSessionTTLInSeconds() {
        return this.idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The number of seconds for which Amazon Bedrock keeps information about a user's conversation with the agent.
     * </p>
     * <p>
     * A user interaction remains active for the amount of time specified. If no conversation occurs during this time,
     * the session expires and Amazon Bedrock deletes any data provided before the timeout.
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The number of seconds for which Amazon Bedrock keeps information about a user's conversation with the
     *        agent.</p>
     *        <p>
     *        A user interaction remains active for the amount of time specified. If no conversation occurs during this
     *        time, the session expires and Amazon Bedrock deletes any data provided before the timeout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        setIdleSessionTTLInSeconds(idleSessionTTLInSeconds);
        return this;
    }

    /**
     * <p>
     * Instructions that tell the agent what it should do and how it should interact with users.
     * </p>
     * 
     * @param instruction
     *        Instructions that tell the agent what it should do and how it should interact with users.
     */

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    /**
     * <p>
     * Instructions that tell the agent what it should do and how it should interact with users.
     * </p>
     * 
     * @return Instructions that tell the agent what it should do and how it should interact with users.
     */

    public String getInstruction() {
        return this.instruction;
    }

    /**
     * <p>
     * Instructions that tell the agent what it should do and how it should interact with users.
     * </p>
     * 
     * @param instruction
     *        Instructions that tell the agent what it should do and how it should interact with users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withInstruction(String instruction) {
        setInstruction(instruction);
        return this;
    }

    /**
     * <p>
     * The time at which the agent was last prepared.
     * </p>
     * 
     * @param preparedAt
     *        The time at which the agent was last prepared.
     */

    public void setPreparedAt(java.util.Date preparedAt) {
        this.preparedAt = preparedAt;
    }

    /**
     * <p>
     * The time at which the agent was last prepared.
     * </p>
     * 
     * @return The time at which the agent was last prepared.
     */

    public java.util.Date getPreparedAt() {
        return this.preparedAt;
    }

    /**
     * <p>
     * The time at which the agent was last prepared.
     * </p>
     * 
     * @param preparedAt
     *        The time at which the agent was last prepared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withPreparedAt(java.util.Date preparedAt) {
        setPreparedAt(preparedAt);
        return this;
    }

    /**
     * <p>
     * Contains configurations to override prompt templates in different parts of an agent sequence. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced
     * prompts</a>.
     * </p>
     * 
     * @param promptOverrideConfiguration
     *        Contains configurations to override prompt templates in different parts of an agent sequence. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     */

    public void setPromptOverrideConfiguration(PromptOverrideConfiguration promptOverrideConfiguration) {
        this.promptOverrideConfiguration = promptOverrideConfiguration;
    }

    /**
     * <p>
     * Contains configurations to override prompt templates in different parts of an agent sequence. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced
     * prompts</a>.
     * </p>
     * 
     * @return Contains configurations to override prompt templates in different parts of an agent sequence. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     */

    public PromptOverrideConfiguration getPromptOverrideConfiguration() {
        return this.promptOverrideConfiguration;
    }

    /**
     * <p>
     * Contains configurations to override prompt templates in different parts of an agent sequence. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced
     * prompts</a>.
     * </p>
     * 
     * @param promptOverrideConfiguration
     *        Contains configurations to override prompt templates in different parts of an agent sequence. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withPromptOverrideConfiguration(PromptOverrideConfiguration promptOverrideConfiguration) {
        setPromptOverrideConfiguration(promptOverrideConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains recommended actions to take for the agent-related API that you invoked to succeed.
     * </p>
     * 
     * @return Contains recommended actions to take for the agent-related API that you invoked to succeed.
     */

    public java.util.List<String> getRecommendedActions() {
        return recommendedActions;
    }

    /**
     * <p>
     * Contains recommended actions to take for the agent-related API that you invoked to succeed.
     * </p>
     * 
     * @param recommendedActions
     *        Contains recommended actions to take for the agent-related API that you invoked to succeed.
     */

    public void setRecommendedActions(java.util.Collection<String> recommendedActions) {
        if (recommendedActions == null) {
            this.recommendedActions = null;
            return;
        }

        this.recommendedActions = new java.util.ArrayList<String>(recommendedActions);
    }

    /**
     * <p>
     * Contains recommended actions to take for the agent-related API that you invoked to succeed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendedActions(java.util.Collection)} or {@link #withRecommendedActions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param recommendedActions
     *        Contains recommended actions to take for the agent-related API that you invoked to succeed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withRecommendedActions(String... recommendedActions) {
        if (this.recommendedActions == null) {
            setRecommendedActions(new java.util.ArrayList<String>(recommendedActions.length));
        }
        for (String ele : recommendedActions) {
            this.recommendedActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains recommended actions to take for the agent-related API that you invoked to succeed.
     * </p>
     * 
     * @param recommendedActions
     *        Contains recommended actions to take for the agent-related API that you invoked to succeed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withRecommendedActions(java.util.Collection<String> recommendedActions) {
        setRecommendedActions(recommendedActions);
        return this;
    }

    /**
     * <p>
     * The time at which the agent was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the agent was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the agent was last updated.
     * </p>
     * 
     * @return The time at which the agent was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the agent was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the agent was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Agent withUpdatedAt(java.util.Date updatedAt) {
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
        if (getAgentArn() != null)
            sb.append("AgentArn: ").append(getAgentArn()).append(",");
        if (getAgentId() != null)
            sb.append("AgentId: ").append(getAgentId()).append(",");
        if (getAgentName() != null)
            sb.append("AgentName: ").append(getAgentName()).append(",");
        if (getAgentResourceRoleArn() != null)
            sb.append("AgentResourceRoleArn: ").append(getAgentResourceRoleArn()).append(",");
        if (getAgentStatus() != null)
            sb.append("AgentStatus: ").append(getAgentStatus()).append(",");
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCustomerEncryptionKeyArn() != null)
            sb.append("CustomerEncryptionKeyArn: ").append(getCustomerEncryptionKeyArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons()).append(",");
        if (getFoundationModel() != null)
            sb.append("FoundationModel: ").append(getFoundationModel()).append(",");
        if (getGuardrailConfiguration() != null)
            sb.append("GuardrailConfiguration: ").append(getGuardrailConfiguration()).append(",");
        if (getIdleSessionTTLInSeconds() != null)
            sb.append("IdleSessionTTLInSeconds: ").append(getIdleSessionTTLInSeconds()).append(",");
        if (getInstruction() != null)
            sb.append("Instruction: ").append("***Sensitive Data Redacted***").append(",");
        if (getPreparedAt() != null)
            sb.append("PreparedAt: ").append(getPreparedAt()).append(",");
        if (getPromptOverrideConfiguration() != null)
            sb.append("PromptOverrideConfiguration: ").append("***Sensitive Data Redacted***").append(",");
        if (getRecommendedActions() != null)
            sb.append("RecommendedActions: ").append(getRecommendedActions()).append(",");
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

        if (obj instanceof Agent == false)
            return false;
        Agent other = (Agent) obj;
        if (other.getAgentArn() == null ^ this.getAgentArn() == null)
            return false;
        if (other.getAgentArn() != null && other.getAgentArn().equals(this.getAgentArn()) == false)
            return false;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAgentName() == null ^ this.getAgentName() == null)
            return false;
        if (other.getAgentName() != null && other.getAgentName().equals(this.getAgentName()) == false)
            return false;
        if (other.getAgentResourceRoleArn() == null ^ this.getAgentResourceRoleArn() == null)
            return false;
        if (other.getAgentResourceRoleArn() != null && other.getAgentResourceRoleArn().equals(this.getAgentResourceRoleArn()) == false)
            return false;
        if (other.getAgentStatus() == null ^ this.getAgentStatus() == null)
            return false;
        if (other.getAgentStatus() != null && other.getAgentStatus().equals(this.getAgentStatus()) == false)
            return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCustomerEncryptionKeyArn() == null ^ this.getCustomerEncryptionKeyArn() == null)
            return false;
        if (other.getCustomerEncryptionKeyArn() != null && other.getCustomerEncryptionKeyArn().equals(this.getCustomerEncryptionKeyArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFailureReasons() == null ^ this.getFailureReasons() == null)
            return false;
        if (other.getFailureReasons() != null && other.getFailureReasons().equals(this.getFailureReasons()) == false)
            return false;
        if (other.getFoundationModel() == null ^ this.getFoundationModel() == null)
            return false;
        if (other.getFoundationModel() != null && other.getFoundationModel().equals(this.getFoundationModel()) == false)
            return false;
        if (other.getGuardrailConfiguration() == null ^ this.getGuardrailConfiguration() == null)
            return false;
        if (other.getGuardrailConfiguration() != null && other.getGuardrailConfiguration().equals(this.getGuardrailConfiguration()) == false)
            return false;
        if (other.getIdleSessionTTLInSeconds() == null ^ this.getIdleSessionTTLInSeconds() == null)
            return false;
        if (other.getIdleSessionTTLInSeconds() != null && other.getIdleSessionTTLInSeconds().equals(this.getIdleSessionTTLInSeconds()) == false)
            return false;
        if (other.getInstruction() == null ^ this.getInstruction() == null)
            return false;
        if (other.getInstruction() != null && other.getInstruction().equals(this.getInstruction()) == false)
            return false;
        if (other.getPreparedAt() == null ^ this.getPreparedAt() == null)
            return false;
        if (other.getPreparedAt() != null && other.getPreparedAt().equals(this.getPreparedAt()) == false)
            return false;
        if (other.getPromptOverrideConfiguration() == null ^ this.getPromptOverrideConfiguration() == null)
            return false;
        if (other.getPromptOverrideConfiguration() != null && other.getPromptOverrideConfiguration().equals(this.getPromptOverrideConfiguration()) == false)
            return false;
        if (other.getRecommendedActions() == null ^ this.getRecommendedActions() == null)
            return false;
        if (other.getRecommendedActions() != null && other.getRecommendedActions().equals(this.getRecommendedActions()) == false)
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

        hashCode = prime * hashCode + ((getAgentArn() == null) ? 0 : getAgentArn().hashCode());
        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAgentName() == null) ? 0 : getAgentName().hashCode());
        hashCode = prime * hashCode + ((getAgentResourceRoleArn() == null) ? 0 : getAgentResourceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getAgentStatus() == null) ? 0 : getAgentStatus().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCustomerEncryptionKeyArn() == null) ? 0 : getCustomerEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getFoundationModel() == null) ? 0 : getFoundationModel().hashCode());
        hashCode = prime * hashCode + ((getGuardrailConfiguration() == null) ? 0 : getGuardrailConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIdleSessionTTLInSeconds() == null) ? 0 : getIdleSessionTTLInSeconds().hashCode());
        hashCode = prime * hashCode + ((getInstruction() == null) ? 0 : getInstruction().hashCode());
        hashCode = prime * hashCode + ((getPreparedAt() == null) ? 0 : getPreparedAt().hashCode());
        hashCode = prime * hashCode + ((getPromptOverrideConfiguration() == null) ? 0 : getPromptOverrideConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRecommendedActions() == null) ? 0 : getRecommendedActions().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Agent clone() {
        try {
            return (Agent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.AgentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

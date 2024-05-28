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
 * Contains details about a version of an agent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AgentVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent that the version belongs to.
     * </p>
     */
    private String agentArn;
    /**
     * <p>
     * The unique identifier of the agent that the version belongs to.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The name of the agent that the version belongs to.
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
     * The status of the agent that the version belongs to.
     * </p>
     */
    private String agentStatus;
    /**
     * <p>
     * The time at which the version was created.
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
     * The description of the version.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of reasons that the API operation on the version failed.
     * </p>
     */
    private java.util.List<String> failureReasons;
    /**
     * <p>
     * The foundation model that the version invokes.
     * </p>
     */
    private String foundationModel;
    /**
     * <p>
     * The guardrails configuration assigned to the agent version.
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
     * The instructions provided to the agent.
     * </p>
     */
    private String instruction;
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
     * A list of recommended actions to take for the failed API operation on the version to succeed.
     * </p>
     */
    private java.util.List<String> recommendedActions;
    /**
     * <p>
     * The time at which the version was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The version number.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent that the version belongs to.
     * </p>
     * 
     * @param agentArn
     *        The Amazon Resource Name (ARN) of the agent that the version belongs to.
     */

    public void setAgentArn(String agentArn) {
        this.agentArn = agentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent that the version belongs to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the agent that the version belongs to.
     */

    public String getAgentArn() {
        return this.agentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent that the version belongs to.
     * </p>
     * 
     * @param agentArn
     *        The Amazon Resource Name (ARN) of the agent that the version belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withAgentArn(String agentArn) {
        setAgentArn(agentArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the agent that the version belongs to.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent that the version belongs to.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent that the version belongs to.
     * </p>
     * 
     * @return The unique identifier of the agent that the version belongs to.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent that the version belongs to.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent that the version belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The name of the agent that the version belongs to.
     * </p>
     * 
     * @param agentName
     *        The name of the agent that the version belongs to.
     */

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    /**
     * <p>
     * The name of the agent that the version belongs to.
     * </p>
     * 
     * @return The name of the agent that the version belongs to.
     */

    public String getAgentName() {
        return this.agentName;
    }

    /**
     * <p>
     * The name of the agent that the version belongs to.
     * </p>
     * 
     * @param agentName
     *        The name of the agent that the version belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withAgentName(String agentName) {
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

    public AgentVersion withAgentResourceRoleArn(String agentResourceRoleArn) {
        setAgentResourceRoleArn(agentResourceRoleArn);
        return this;
    }

    /**
     * <p>
     * The status of the agent that the version belongs to.
     * </p>
     * 
     * @param agentStatus
     *        The status of the agent that the version belongs to.
     * @see AgentStatus
     */

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    /**
     * <p>
     * The status of the agent that the version belongs to.
     * </p>
     * 
     * @return The status of the agent that the version belongs to.
     * @see AgentStatus
     */

    public String getAgentStatus() {
        return this.agentStatus;
    }

    /**
     * <p>
     * The status of the agent that the version belongs to.
     * </p>
     * 
     * @param agentStatus
     *        The status of the agent that the version belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public AgentVersion withAgentStatus(String agentStatus) {
        setAgentStatus(agentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the agent that the version belongs to.
     * </p>
     * 
     * @param agentStatus
     *        The status of the agent that the version belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public AgentVersion withAgentStatus(AgentStatus agentStatus) {
        this.agentStatus = agentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the version was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the version was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the version was created.
     * </p>
     * 
     * @return The time at which the version was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the version was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withCreatedAt(java.util.Date createdAt) {
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

    public AgentVersion withCustomerEncryptionKeyArn(String customerEncryptionKeyArn) {
        setCustomerEncryptionKeyArn(customerEncryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * The description of the version.
     * </p>
     * 
     * @param description
     *        The description of the version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the version.
     * </p>
     * 
     * @return The description of the version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the version.
     * </p>
     * 
     * @param description
     *        The description of the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of reasons that the API operation on the version failed.
     * </p>
     * 
     * @return A list of reasons that the API operation on the version failed.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * A list of reasons that the API operation on the version failed.
     * </p>
     * 
     * @param failureReasons
     *        A list of reasons that the API operation on the version failed.
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
     * A list of reasons that the API operation on the version failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        A list of reasons that the API operation on the version failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withFailureReasons(String... failureReasons) {
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
     * A list of reasons that the API operation on the version failed.
     * </p>
     * 
     * @param failureReasons
     *        A list of reasons that the API operation on the version failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withFailureReasons(java.util.Collection<String> failureReasons) {
        setFailureReasons(failureReasons);
        return this;
    }

    /**
     * <p>
     * The foundation model that the version invokes.
     * </p>
     * 
     * @param foundationModel
     *        The foundation model that the version invokes.
     */

    public void setFoundationModel(String foundationModel) {
        this.foundationModel = foundationModel;
    }

    /**
     * <p>
     * The foundation model that the version invokes.
     * </p>
     * 
     * @return The foundation model that the version invokes.
     */

    public String getFoundationModel() {
        return this.foundationModel;
    }

    /**
     * <p>
     * The foundation model that the version invokes.
     * </p>
     * 
     * @param foundationModel
     *        The foundation model that the version invokes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withFoundationModel(String foundationModel) {
        setFoundationModel(foundationModel);
        return this;
    }

    /**
     * <p>
     * The guardrails configuration assigned to the agent version.
     * </p>
     * 
     * @param guardrailConfiguration
     *        The guardrails configuration assigned to the agent version.
     */

    public void setGuardrailConfiguration(GuardrailConfiguration guardrailConfiguration) {
        this.guardrailConfiguration = guardrailConfiguration;
    }

    /**
     * <p>
     * The guardrails configuration assigned to the agent version.
     * </p>
     * 
     * @return The guardrails configuration assigned to the agent version.
     */

    public GuardrailConfiguration getGuardrailConfiguration() {
        return this.guardrailConfiguration;
    }

    /**
     * <p>
     * The guardrails configuration assigned to the agent version.
     * </p>
     * 
     * @param guardrailConfiguration
     *        The guardrails configuration assigned to the agent version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withGuardrailConfiguration(GuardrailConfiguration guardrailConfiguration) {
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

    public AgentVersion withIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        setIdleSessionTTLInSeconds(idleSessionTTLInSeconds);
        return this;
    }

    /**
     * <p>
     * The instructions provided to the agent.
     * </p>
     * 
     * @param instruction
     *        The instructions provided to the agent.
     */

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    /**
     * <p>
     * The instructions provided to the agent.
     * </p>
     * 
     * @return The instructions provided to the agent.
     */

    public String getInstruction() {
        return this.instruction;
    }

    /**
     * <p>
     * The instructions provided to the agent.
     * </p>
     * 
     * @param instruction
     *        The instructions provided to the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withInstruction(String instruction) {
        setInstruction(instruction);
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

    public AgentVersion withPromptOverrideConfiguration(PromptOverrideConfiguration promptOverrideConfiguration) {
        setPromptOverrideConfiguration(promptOverrideConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of recommended actions to take for the failed API operation on the version to succeed.
     * </p>
     * 
     * @return A list of recommended actions to take for the failed API operation on the version to succeed.
     */

    public java.util.List<String> getRecommendedActions() {
        return recommendedActions;
    }

    /**
     * <p>
     * A list of recommended actions to take for the failed API operation on the version to succeed.
     * </p>
     * 
     * @param recommendedActions
     *        A list of recommended actions to take for the failed API operation on the version to succeed.
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
     * A list of recommended actions to take for the failed API operation on the version to succeed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendedActions(java.util.Collection)} or {@link #withRecommendedActions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param recommendedActions
     *        A list of recommended actions to take for the failed API operation on the version to succeed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withRecommendedActions(String... recommendedActions) {
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
     * A list of recommended actions to take for the failed API operation on the version to succeed.
     * </p>
     * 
     * @param recommendedActions
     *        A list of recommended actions to take for the failed API operation on the version to succeed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withRecommendedActions(java.util.Collection<String> recommendedActions) {
        setRecommendedActions(recommendedActions);
        return this;
    }

    /**
     * <p>
     * The time at which the version was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the version was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the version was last updated.
     * </p>
     * 
     * @return The time at which the version was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the version was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the version was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @param version
     *        The version number.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @return The version number.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @param version
     *        The version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withVersion(String version) {
        setVersion(version);
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
        if (getPromptOverrideConfiguration() != null)
            sb.append("PromptOverrideConfiguration: ").append("***Sensitive Data Redacted***").append(",");
        if (getRecommendedActions() != null)
            sb.append("RecommendedActions: ").append(getRecommendedActions()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentVersion == false)
            return false;
        AgentVersion other = (AgentVersion) obj;
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
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
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
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCustomerEncryptionKeyArn() == null) ? 0 : getCustomerEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getFoundationModel() == null) ? 0 : getFoundationModel().hashCode());
        hashCode = prime * hashCode + ((getGuardrailConfiguration() == null) ? 0 : getGuardrailConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIdleSessionTTLInSeconds() == null) ? 0 : getIdleSessionTTLInSeconds().hashCode());
        hashCode = prime * hashCode + ((getInstruction() == null) ? 0 : getInstruction().hashCode());
        hashCode = prime * hashCode + ((getPromptOverrideConfiguration() == null) ? 0 : getPromptOverrideConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRecommendedActions() == null) ? 0 : getRecommendedActions().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public AgentVersion clone() {
        try {
            return (AgentVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.AgentVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

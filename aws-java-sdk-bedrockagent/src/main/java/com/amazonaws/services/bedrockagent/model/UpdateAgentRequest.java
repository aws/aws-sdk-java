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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAgentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the agent.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * Specifies a new name for the agent.
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
     * The Amazon Resource Name (ARN) of the KMS key with which to encrypt the agent.
     * </p>
     */
    private String customerEncryptionKeyArn;
    /**
     * <p>
     * Specifies a new description of the agent.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies a new foundation model to be used for orchestration by the agent.
     * </p>
     */
    private String foundationModel;
    /**
     * <p>
     * The unique Guardrail configuration assigned to the agent when it is updated.
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
     * Specifies new instructions that tell the agent what it should do and how it should interact with users.
     * </p>
     */
    private String instruction;
    /**
     * <p>
     * Contains configurations to override prompts in different parts of an agent sequence. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     * </p>
     */
    private PromptOverrideConfiguration promptOverrideConfiguration;

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

    public UpdateAgentRequest withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * Specifies a new name for the agent.
     * </p>
     * 
     * @param agentName
     *        Specifies a new name for the agent.
     */

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    /**
     * <p>
     * Specifies a new name for the agent.
     * </p>
     * 
     * @return Specifies a new name for the agent.
     */

    public String getAgentName() {
        return this.agentName;
    }

    /**
     * <p>
     * Specifies a new name for the agent.
     * </p>
     * 
     * @param agentName
     *        Specifies a new name for the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withAgentName(String agentName) {
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

    public UpdateAgentRequest withAgentResourceRoleArn(String agentResourceRoleArn) {
        setAgentResourceRoleArn(agentResourceRoleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key with which to encrypt the agent.
     * </p>
     * 
     * @param customerEncryptionKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key with which to encrypt the agent.
     */

    public void setCustomerEncryptionKeyArn(String customerEncryptionKeyArn) {
        this.customerEncryptionKeyArn = customerEncryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key with which to encrypt the agent.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS key with which to encrypt the agent.
     */

    public String getCustomerEncryptionKeyArn() {
        return this.customerEncryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key with which to encrypt the agent.
     * </p>
     * 
     * @param customerEncryptionKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key with which to encrypt the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withCustomerEncryptionKeyArn(String customerEncryptionKeyArn) {
        setCustomerEncryptionKeyArn(customerEncryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * Specifies a new description of the agent.
     * </p>
     * 
     * @param description
     *        Specifies a new description of the agent.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Specifies a new description of the agent.
     * </p>
     * 
     * @return Specifies a new description of the agent.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Specifies a new description of the agent.
     * </p>
     * 
     * @param description
     *        Specifies a new description of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies a new foundation model to be used for orchestration by the agent.
     * </p>
     * 
     * @param foundationModel
     *        Specifies a new foundation model to be used for orchestration by the agent.
     */

    public void setFoundationModel(String foundationModel) {
        this.foundationModel = foundationModel;
    }

    /**
     * <p>
     * Specifies a new foundation model to be used for orchestration by the agent.
     * </p>
     * 
     * @return Specifies a new foundation model to be used for orchestration by the agent.
     */

    public String getFoundationModel() {
        return this.foundationModel;
    }

    /**
     * <p>
     * Specifies a new foundation model to be used for orchestration by the agent.
     * </p>
     * 
     * @param foundationModel
     *        Specifies a new foundation model to be used for orchestration by the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withFoundationModel(String foundationModel) {
        setFoundationModel(foundationModel);
        return this;
    }

    /**
     * <p>
     * The unique Guardrail configuration assigned to the agent when it is updated.
     * </p>
     * 
     * @param guardrailConfiguration
     *        The unique Guardrail configuration assigned to the agent when it is updated.
     */

    public void setGuardrailConfiguration(GuardrailConfiguration guardrailConfiguration) {
        this.guardrailConfiguration = guardrailConfiguration;
    }

    /**
     * <p>
     * The unique Guardrail configuration assigned to the agent when it is updated.
     * </p>
     * 
     * @return The unique Guardrail configuration assigned to the agent when it is updated.
     */

    public GuardrailConfiguration getGuardrailConfiguration() {
        return this.guardrailConfiguration;
    }

    /**
     * <p>
     * The unique Guardrail configuration assigned to the agent when it is updated.
     * </p>
     * 
     * @param guardrailConfiguration
     *        The unique Guardrail configuration assigned to the agent when it is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withGuardrailConfiguration(GuardrailConfiguration guardrailConfiguration) {
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

    public UpdateAgentRequest withIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        setIdleSessionTTLInSeconds(idleSessionTTLInSeconds);
        return this;
    }

    /**
     * <p>
     * Specifies new instructions that tell the agent what it should do and how it should interact with users.
     * </p>
     * 
     * @param instruction
     *        Specifies new instructions that tell the agent what it should do and how it should interact with users.
     */

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    /**
     * <p>
     * Specifies new instructions that tell the agent what it should do and how it should interact with users.
     * </p>
     * 
     * @return Specifies new instructions that tell the agent what it should do and how it should interact with users.
     */

    public String getInstruction() {
        return this.instruction;
    }

    /**
     * <p>
     * Specifies new instructions that tell the agent what it should do and how it should interact with users.
     * </p>
     * 
     * @param instruction
     *        Specifies new instructions that tell the agent what it should do and how it should interact with users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withInstruction(String instruction) {
        setInstruction(instruction);
        return this;
    }

    /**
     * <p>
     * Contains configurations to override prompts in different parts of an agent sequence. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     * </p>
     * 
     * @param promptOverrideConfiguration
     *        Contains configurations to override prompts in different parts of an agent sequence. For more information,
     *        see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced
     *        prompts</a>.
     */

    public void setPromptOverrideConfiguration(PromptOverrideConfiguration promptOverrideConfiguration) {
        this.promptOverrideConfiguration = promptOverrideConfiguration;
    }

    /**
     * <p>
     * Contains configurations to override prompts in different parts of an agent sequence. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     * </p>
     * 
     * @return Contains configurations to override prompts in different parts of an agent sequence. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     */

    public PromptOverrideConfiguration getPromptOverrideConfiguration() {
        return this.promptOverrideConfiguration;
    }

    /**
     * <p>
     * Contains configurations to override prompts in different parts of an agent sequence. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     * </p>
     * 
     * @param promptOverrideConfiguration
     *        Contains configurations to override prompts in different parts of an agent sequence. For more information,
     *        see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced
     *        prompts</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withPromptOverrideConfiguration(PromptOverrideConfiguration promptOverrideConfiguration) {
        setPromptOverrideConfiguration(promptOverrideConfiguration);
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
        if (getAgentId() != null)
            sb.append("AgentId: ").append(getAgentId()).append(",");
        if (getAgentName() != null)
            sb.append("AgentName: ").append(getAgentName()).append(",");
        if (getAgentResourceRoleArn() != null)
            sb.append("AgentResourceRoleArn: ").append(getAgentResourceRoleArn()).append(",");
        if (getCustomerEncryptionKeyArn() != null)
            sb.append("CustomerEncryptionKeyArn: ").append(getCustomerEncryptionKeyArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFoundationModel() != null)
            sb.append("FoundationModel: ").append(getFoundationModel()).append(",");
        if (getGuardrailConfiguration() != null)
            sb.append("GuardrailConfiguration: ").append(getGuardrailConfiguration()).append(",");
        if (getIdleSessionTTLInSeconds() != null)
            sb.append("IdleSessionTTLInSeconds: ").append(getIdleSessionTTLInSeconds()).append(",");
        if (getInstruction() != null)
            sb.append("Instruction: ").append("***Sensitive Data Redacted***").append(",");
        if (getPromptOverrideConfiguration() != null)
            sb.append("PromptOverrideConfiguration: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAgentRequest == false)
            return false;
        UpdateAgentRequest other = (UpdateAgentRequest) obj;
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
        if (other.getCustomerEncryptionKeyArn() == null ^ this.getCustomerEncryptionKeyArn() == null)
            return false;
        if (other.getCustomerEncryptionKeyArn() != null && other.getCustomerEncryptionKeyArn().equals(this.getCustomerEncryptionKeyArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAgentName() == null) ? 0 : getAgentName().hashCode());
        hashCode = prime * hashCode + ((getAgentResourceRoleArn() == null) ? 0 : getAgentResourceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCustomerEncryptionKeyArn() == null) ? 0 : getCustomerEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFoundationModel() == null) ? 0 : getFoundationModel().hashCode());
        hashCode = prime * hashCode + ((getGuardrailConfiguration() == null) ? 0 : getGuardrailConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIdleSessionTTLInSeconds() == null) ? 0 : getIdleSessionTTLInSeconds().hashCode());
        hashCode = prime * hashCode + ((getInstruction() == null) ? 0 : getInstruction().hashCode());
        hashCode = prime * hashCode + ((getPromptOverrideConfiguration() == null) ? 0 : getPromptOverrideConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAgentRequest clone() {
        return (UpdateAgentRequest) super.clone();
    }

}

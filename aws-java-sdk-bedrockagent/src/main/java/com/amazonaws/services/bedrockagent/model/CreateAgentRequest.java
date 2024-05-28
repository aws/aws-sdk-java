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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAgentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the agent that you create.
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
     * The Amazon Resource Name (ARN) of the KMS key with which to encrypt the agent.
     * </p>
     */
    private String customerEncryptionKeyArn;
    /**
     * <p>
     * A description of the agent.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The foundation model to be used for orchestration by the agent you create.
     * </p>
     */
    private String foundationModel;
    /**
     * <p>
     * The unique Guardrail configuration assigned to the agent when it is created.
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
     * Contains configurations to override prompts in different parts of an agent sequence. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     * </p>
     */
    private PromptOverrideConfiguration promptOverrideConfiguration;
    /**
     * <p>
     * Any tags that you want to attach to the agent.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A name for the agent that you create.
     * </p>
     * 
     * @param agentName
     *        A name for the agent that you create.
     */

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    /**
     * <p>
     * A name for the agent that you create.
     * </p>
     * 
     * @return A name for the agent that you create.
     */

    public String getAgentName() {
        return this.agentName;
    }

    /**
     * <p>
     * A name for the agent that you create.
     * </p>
     * 
     * @param agentName
     *        A name for the agent that you create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withAgentName(String agentName) {
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

    public CreateAgentRequest withAgentResourceRoleArn(String agentResourceRoleArn) {
        setAgentResourceRoleArn(agentResourceRoleArn);
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

    public CreateAgentRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public CreateAgentRequest withCustomerEncryptionKeyArn(String customerEncryptionKeyArn) {
        setCustomerEncryptionKeyArn(customerEncryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * A description of the agent.
     * </p>
     * 
     * @param description
     *        A description of the agent.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the agent.
     * </p>
     * 
     * @return A description of the agent.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the agent.
     * </p>
     * 
     * @param description
     *        A description of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The foundation model to be used for orchestration by the agent you create.
     * </p>
     * 
     * @param foundationModel
     *        The foundation model to be used for orchestration by the agent you create.
     */

    public void setFoundationModel(String foundationModel) {
        this.foundationModel = foundationModel;
    }

    /**
     * <p>
     * The foundation model to be used for orchestration by the agent you create.
     * </p>
     * 
     * @return The foundation model to be used for orchestration by the agent you create.
     */

    public String getFoundationModel() {
        return this.foundationModel;
    }

    /**
     * <p>
     * The foundation model to be used for orchestration by the agent you create.
     * </p>
     * 
     * @param foundationModel
     *        The foundation model to be used for orchestration by the agent you create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withFoundationModel(String foundationModel) {
        setFoundationModel(foundationModel);
        return this;
    }

    /**
     * <p>
     * The unique Guardrail configuration assigned to the agent when it is created.
     * </p>
     * 
     * @param guardrailConfiguration
     *        The unique Guardrail configuration assigned to the agent when it is created.
     */

    public void setGuardrailConfiguration(GuardrailConfiguration guardrailConfiguration) {
        this.guardrailConfiguration = guardrailConfiguration;
    }

    /**
     * <p>
     * The unique Guardrail configuration assigned to the agent when it is created.
     * </p>
     * 
     * @return The unique Guardrail configuration assigned to the agent when it is created.
     */

    public GuardrailConfiguration getGuardrailConfiguration() {
        return this.guardrailConfiguration;
    }

    /**
     * <p>
     * The unique Guardrail configuration assigned to the agent when it is created.
     * </p>
     * 
     * @param guardrailConfiguration
     *        The unique Guardrail configuration assigned to the agent when it is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withGuardrailConfiguration(GuardrailConfiguration guardrailConfiguration) {
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

    public CreateAgentRequest withIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
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

    public CreateAgentRequest withInstruction(String instruction) {
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

    public CreateAgentRequest withPromptOverrideConfiguration(PromptOverrideConfiguration promptOverrideConfiguration) {
        setPromptOverrideConfiguration(promptOverrideConfiguration);
        return this;
    }

    /**
     * <p>
     * Any tags that you want to attach to the agent.
     * </p>
     * 
     * @return Any tags that you want to attach to the agent.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags that you want to attach to the agent.
     * </p>
     * 
     * @param tags
     *        Any tags that you want to attach to the agent.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Any tags that you want to attach to the agent.
     * </p>
     * 
     * @param tags
     *        Any tags that you want to attach to the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAgentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAgentName() != null)
            sb.append("AgentName: ").append(getAgentName()).append(",");
        if (getAgentResourceRoleArn() != null)
            sb.append("AgentResourceRoleArn: ").append(getAgentResourceRoleArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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
            sb.append("PromptOverrideConfiguration: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAgentRequest == false)
            return false;
        CreateAgentRequest other = (CreateAgentRequest) obj;
        if (other.getAgentName() == null ^ this.getAgentName() == null)
            return false;
        if (other.getAgentName() != null && other.getAgentName().equals(this.getAgentName()) == false)
            return false;
        if (other.getAgentResourceRoleArn() == null ^ this.getAgentResourceRoleArn() == null)
            return false;
        if (other.getAgentResourceRoleArn() != null && other.getAgentResourceRoleArn().equals(this.getAgentResourceRoleArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentName() == null) ? 0 : getAgentName().hashCode());
        hashCode = prime * hashCode + ((getAgentResourceRoleArn() == null) ? 0 : getAgentResourceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCustomerEncryptionKeyArn() == null) ? 0 : getCustomerEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFoundationModel() == null) ? 0 : getFoundationModel().hashCode());
        hashCode = prime * hashCode + ((getGuardrailConfiguration() == null) ? 0 : getGuardrailConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIdleSessionTTLInSeconds() == null) ? 0 : getIdleSessionTTLInSeconds().hashCode());
        hashCode = prime * hashCode + ((getInstruction() == null) ? 0 : getInstruction().hashCode());
        hashCode = prime * hashCode + ((getPromptOverrideConfiguration() == null) ? 0 : getPromptOverrideConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAgentRequest clone() {
        return (CreateAgentRequest) super.clone();
    }

}

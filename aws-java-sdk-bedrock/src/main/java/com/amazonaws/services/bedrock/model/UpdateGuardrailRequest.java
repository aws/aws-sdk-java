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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UpdateGuardrail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGuardrailRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the guardrail
     * </p>
     */
    private String guardrailIdentifier;
    /**
     * <p>
     * A name for the guardrail.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the guardrail.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The topic policy to configure for the guardrail.
     * </p>
     */
    private GuardrailTopicPolicyConfig topicPolicyConfig;
    /**
     * <p>
     * The content policy to configure for the guardrail.
     * </p>
     */
    private GuardrailContentPolicyConfig contentPolicyConfig;
    /**
     * <p>
     * The word policy to configure for the guardrail.
     * </p>
     */
    private GuardrailWordPolicyConfig wordPolicyConfig;
    /**
     * <p>
     * The sensitive information policy to configure for the guardrail.
     * </p>
     */
    private GuardrailSensitiveInformationPolicyConfig sensitiveInformationPolicyConfig;
    /**
     * <p>
     * The message to return when the guardrail blocks a prompt.
     * </p>
     */
    private String blockedInputMessaging;
    /**
     * <p>
     * The message to return when the guardrail blocks a model response.
     * </p>
     */
    private String blockedOutputsMessaging;
    /**
     * <p>
     * The ARN of the KMS key with which to encrypt the guardrail.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The unique identifier of the guardrail
     * </p>
     * 
     * @param guardrailIdentifier
     *        The unique identifier of the guardrail
     */

    public void setGuardrailIdentifier(String guardrailIdentifier) {
        this.guardrailIdentifier = guardrailIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the guardrail
     * </p>
     * 
     * @return The unique identifier of the guardrail
     */

    public String getGuardrailIdentifier() {
        return this.guardrailIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the guardrail
     * </p>
     * 
     * @param guardrailIdentifier
     *        The unique identifier of the guardrail
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGuardrailRequest withGuardrailIdentifier(String guardrailIdentifier) {
        setGuardrailIdentifier(guardrailIdentifier);
        return this;
    }

    /**
     * <p>
     * A name for the guardrail.
     * </p>
     * 
     * @param name
     *        A name for the guardrail.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the guardrail.
     * </p>
     * 
     * @return A name for the guardrail.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the guardrail.
     * </p>
     * 
     * @param name
     *        A name for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGuardrailRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the guardrail.
     * </p>
     * 
     * @param description
     *        A description of the guardrail.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the guardrail.
     * </p>
     * 
     * @return A description of the guardrail.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the guardrail.
     * </p>
     * 
     * @param description
     *        A description of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGuardrailRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The topic policy to configure for the guardrail.
     * </p>
     * 
     * @param topicPolicyConfig
     *        The topic policy to configure for the guardrail.
     */

    public void setTopicPolicyConfig(GuardrailTopicPolicyConfig topicPolicyConfig) {
        this.topicPolicyConfig = topicPolicyConfig;
    }

    /**
     * <p>
     * The topic policy to configure for the guardrail.
     * </p>
     * 
     * @return The topic policy to configure for the guardrail.
     */

    public GuardrailTopicPolicyConfig getTopicPolicyConfig() {
        return this.topicPolicyConfig;
    }

    /**
     * <p>
     * The topic policy to configure for the guardrail.
     * </p>
     * 
     * @param topicPolicyConfig
     *        The topic policy to configure for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGuardrailRequest withTopicPolicyConfig(GuardrailTopicPolicyConfig topicPolicyConfig) {
        setTopicPolicyConfig(topicPolicyConfig);
        return this;
    }

    /**
     * <p>
     * The content policy to configure for the guardrail.
     * </p>
     * 
     * @param contentPolicyConfig
     *        The content policy to configure for the guardrail.
     */

    public void setContentPolicyConfig(GuardrailContentPolicyConfig contentPolicyConfig) {
        this.contentPolicyConfig = contentPolicyConfig;
    }

    /**
     * <p>
     * The content policy to configure for the guardrail.
     * </p>
     * 
     * @return The content policy to configure for the guardrail.
     */

    public GuardrailContentPolicyConfig getContentPolicyConfig() {
        return this.contentPolicyConfig;
    }

    /**
     * <p>
     * The content policy to configure for the guardrail.
     * </p>
     * 
     * @param contentPolicyConfig
     *        The content policy to configure for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGuardrailRequest withContentPolicyConfig(GuardrailContentPolicyConfig contentPolicyConfig) {
        setContentPolicyConfig(contentPolicyConfig);
        return this;
    }

    /**
     * <p>
     * The word policy to configure for the guardrail.
     * </p>
     * 
     * @param wordPolicyConfig
     *        The word policy to configure for the guardrail.
     */

    public void setWordPolicyConfig(GuardrailWordPolicyConfig wordPolicyConfig) {
        this.wordPolicyConfig = wordPolicyConfig;
    }

    /**
     * <p>
     * The word policy to configure for the guardrail.
     * </p>
     * 
     * @return The word policy to configure for the guardrail.
     */

    public GuardrailWordPolicyConfig getWordPolicyConfig() {
        return this.wordPolicyConfig;
    }

    /**
     * <p>
     * The word policy to configure for the guardrail.
     * </p>
     * 
     * @param wordPolicyConfig
     *        The word policy to configure for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGuardrailRequest withWordPolicyConfig(GuardrailWordPolicyConfig wordPolicyConfig) {
        setWordPolicyConfig(wordPolicyConfig);
        return this;
    }

    /**
     * <p>
     * The sensitive information policy to configure for the guardrail.
     * </p>
     * 
     * @param sensitiveInformationPolicyConfig
     *        The sensitive information policy to configure for the guardrail.
     */

    public void setSensitiveInformationPolicyConfig(GuardrailSensitiveInformationPolicyConfig sensitiveInformationPolicyConfig) {
        this.sensitiveInformationPolicyConfig = sensitiveInformationPolicyConfig;
    }

    /**
     * <p>
     * The sensitive information policy to configure for the guardrail.
     * </p>
     * 
     * @return The sensitive information policy to configure for the guardrail.
     */

    public GuardrailSensitiveInformationPolicyConfig getSensitiveInformationPolicyConfig() {
        return this.sensitiveInformationPolicyConfig;
    }

    /**
     * <p>
     * The sensitive information policy to configure for the guardrail.
     * </p>
     * 
     * @param sensitiveInformationPolicyConfig
     *        The sensitive information policy to configure for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGuardrailRequest withSensitiveInformationPolicyConfig(GuardrailSensitiveInformationPolicyConfig sensitiveInformationPolicyConfig) {
        setSensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig);
        return this;
    }

    /**
     * <p>
     * The message to return when the guardrail blocks a prompt.
     * </p>
     * 
     * @param blockedInputMessaging
     *        The message to return when the guardrail blocks a prompt.
     */

    public void setBlockedInputMessaging(String blockedInputMessaging) {
        this.blockedInputMessaging = blockedInputMessaging;
    }

    /**
     * <p>
     * The message to return when the guardrail blocks a prompt.
     * </p>
     * 
     * @return The message to return when the guardrail blocks a prompt.
     */

    public String getBlockedInputMessaging() {
        return this.blockedInputMessaging;
    }

    /**
     * <p>
     * The message to return when the guardrail blocks a prompt.
     * </p>
     * 
     * @param blockedInputMessaging
     *        The message to return when the guardrail blocks a prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGuardrailRequest withBlockedInputMessaging(String blockedInputMessaging) {
        setBlockedInputMessaging(blockedInputMessaging);
        return this;
    }

    /**
     * <p>
     * The message to return when the guardrail blocks a model response.
     * </p>
     * 
     * @param blockedOutputsMessaging
     *        The message to return when the guardrail blocks a model response.
     */

    public void setBlockedOutputsMessaging(String blockedOutputsMessaging) {
        this.blockedOutputsMessaging = blockedOutputsMessaging;
    }

    /**
     * <p>
     * The message to return when the guardrail blocks a model response.
     * </p>
     * 
     * @return The message to return when the guardrail blocks a model response.
     */

    public String getBlockedOutputsMessaging() {
        return this.blockedOutputsMessaging;
    }

    /**
     * <p>
     * The message to return when the guardrail blocks a model response.
     * </p>
     * 
     * @param blockedOutputsMessaging
     *        The message to return when the guardrail blocks a model response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGuardrailRequest withBlockedOutputsMessaging(String blockedOutputsMessaging) {
        setBlockedOutputsMessaging(blockedOutputsMessaging);
        return this;
    }

    /**
     * <p>
     * The ARN of the KMS key with which to encrypt the guardrail.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN of the KMS key with which to encrypt the guardrail.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ARN of the KMS key with which to encrypt the guardrail.
     * </p>
     * 
     * @return The ARN of the KMS key with which to encrypt the guardrail.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ARN of the KMS key with which to encrypt the guardrail.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN of the KMS key with which to encrypt the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGuardrailRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getGuardrailIdentifier() != null)
            sb.append("GuardrailIdentifier: ").append(getGuardrailIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getTopicPolicyConfig() != null)
            sb.append("TopicPolicyConfig: ").append(getTopicPolicyConfig()).append(",");
        if (getContentPolicyConfig() != null)
            sb.append("ContentPolicyConfig: ").append(getContentPolicyConfig()).append(",");
        if (getWordPolicyConfig() != null)
            sb.append("WordPolicyConfig: ").append(getWordPolicyConfig()).append(",");
        if (getSensitiveInformationPolicyConfig() != null)
            sb.append("SensitiveInformationPolicyConfig: ").append(getSensitiveInformationPolicyConfig()).append(",");
        if (getBlockedInputMessaging() != null)
            sb.append("BlockedInputMessaging: ").append("***Sensitive Data Redacted***").append(",");
        if (getBlockedOutputsMessaging() != null)
            sb.append("BlockedOutputsMessaging: ").append("***Sensitive Data Redacted***").append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGuardrailRequest == false)
            return false;
        UpdateGuardrailRequest other = (UpdateGuardrailRequest) obj;
        if (other.getGuardrailIdentifier() == null ^ this.getGuardrailIdentifier() == null)
            return false;
        if (other.getGuardrailIdentifier() != null && other.getGuardrailIdentifier().equals(this.getGuardrailIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTopicPolicyConfig() == null ^ this.getTopicPolicyConfig() == null)
            return false;
        if (other.getTopicPolicyConfig() != null && other.getTopicPolicyConfig().equals(this.getTopicPolicyConfig()) == false)
            return false;
        if (other.getContentPolicyConfig() == null ^ this.getContentPolicyConfig() == null)
            return false;
        if (other.getContentPolicyConfig() != null && other.getContentPolicyConfig().equals(this.getContentPolicyConfig()) == false)
            return false;
        if (other.getWordPolicyConfig() == null ^ this.getWordPolicyConfig() == null)
            return false;
        if (other.getWordPolicyConfig() != null && other.getWordPolicyConfig().equals(this.getWordPolicyConfig()) == false)
            return false;
        if (other.getSensitiveInformationPolicyConfig() == null ^ this.getSensitiveInformationPolicyConfig() == null)
            return false;
        if (other.getSensitiveInformationPolicyConfig() != null
                && other.getSensitiveInformationPolicyConfig().equals(this.getSensitiveInformationPolicyConfig()) == false)
            return false;
        if (other.getBlockedInputMessaging() == null ^ this.getBlockedInputMessaging() == null)
            return false;
        if (other.getBlockedInputMessaging() != null && other.getBlockedInputMessaging().equals(this.getBlockedInputMessaging()) == false)
            return false;
        if (other.getBlockedOutputsMessaging() == null ^ this.getBlockedOutputsMessaging() == null)
            return false;
        if (other.getBlockedOutputsMessaging() != null && other.getBlockedOutputsMessaging().equals(this.getBlockedOutputsMessaging()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGuardrailIdentifier() == null) ? 0 : getGuardrailIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTopicPolicyConfig() == null) ? 0 : getTopicPolicyConfig().hashCode());
        hashCode = prime * hashCode + ((getContentPolicyConfig() == null) ? 0 : getContentPolicyConfig().hashCode());
        hashCode = prime * hashCode + ((getWordPolicyConfig() == null) ? 0 : getWordPolicyConfig().hashCode());
        hashCode = prime * hashCode + ((getSensitiveInformationPolicyConfig() == null) ? 0 : getSensitiveInformationPolicyConfig().hashCode());
        hashCode = prime * hashCode + ((getBlockedInputMessaging() == null) ? 0 : getBlockedInputMessaging().hashCode());
        hashCode = prime * hashCode + ((getBlockedOutputsMessaging() == null) ? 0 : getBlockedOutputsMessaging().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGuardrailRequest clone() {
        return (UpdateGuardrailRequest) super.clone();
    }

}

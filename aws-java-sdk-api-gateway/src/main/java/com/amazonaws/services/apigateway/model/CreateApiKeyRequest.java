/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to create an <a>ApiKey</a> resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApiKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the <a>ApiKey</a>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the <a>ApiKey</a>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies whether the <a>ApiKey</a> can be used by callers.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the key identifier is distinct from the created
     * API key value.
     * </p>
     */
    private Boolean generateDistinctId;
    /**
     * <p>
     * Specifies a value of the API key.
     * </p>
     */
    private String value;
    /**
     * <p>
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     * </p>
     */
    private java.util.List<StageKey> stageKeys;
    /**
     * <p>
     * An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
     * </p>
     */
    private String customerId;

    /**
     * <p>
     * The name of the <a>ApiKey</a>.
     * </p>
     * 
     * @param name
     *        The name of the <a>ApiKey</a>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <a>ApiKey</a>.
     * </p>
     * 
     * @return The name of the <a>ApiKey</a>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <a>ApiKey</a>.
     * </p>
     * 
     * @param name
     *        The name of the <a>ApiKey</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiKeyRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the <a>ApiKey</a>.
     * </p>
     * 
     * @param description
     *        The description of the <a>ApiKey</a>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the <a>ApiKey</a>.
     * </p>
     * 
     * @return The description of the <a>ApiKey</a>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the <a>ApiKey</a>.
     * </p>
     * 
     * @param description
     *        The description of the <a>ApiKey</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiKeyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies whether the <a>ApiKey</a> can be used by callers.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the <a>ApiKey</a> can be used by callers.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the <a>ApiKey</a> can be used by callers.
     * </p>
     * 
     * @return Specifies whether the <a>ApiKey</a> can be used by callers.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether the <a>ApiKey</a> can be used by callers.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the <a>ApiKey</a> can be used by callers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiKeyRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the <a>ApiKey</a> can be used by callers.
     * </p>
     * 
     * @return Specifies whether the <a>ApiKey</a> can be used by callers.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the key identifier is distinct from the created
     * API key value.
     * </p>
     * 
     * @param generateDistinctId
     *        Specifies whether (<code>true</code>) or not (<code>false</code>) the key identifier is distinct from the
     *        created API key value.
     */

    public void setGenerateDistinctId(Boolean generateDistinctId) {
        this.generateDistinctId = generateDistinctId;
    }

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the key identifier is distinct from the created
     * API key value.
     * </p>
     * 
     * @return Specifies whether (<code>true</code>) or not (<code>false</code>) the key identifier is distinct from the
     *         created API key value.
     */

    public Boolean getGenerateDistinctId() {
        return this.generateDistinctId;
    }

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the key identifier is distinct from the created
     * API key value.
     * </p>
     * 
     * @param generateDistinctId
     *        Specifies whether (<code>true</code>) or not (<code>false</code>) the key identifier is distinct from the
     *        created API key value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiKeyRequest withGenerateDistinctId(Boolean generateDistinctId) {
        setGenerateDistinctId(generateDistinctId);
        return this;
    }

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the key identifier is distinct from the created
     * API key value.
     * </p>
     * 
     * @return Specifies whether (<code>true</code>) or not (<code>false</code>) the key identifier is distinct from the
     *         created API key value.
     */

    public Boolean isGenerateDistinctId() {
        return this.generateDistinctId;
    }

    /**
     * <p>
     * Specifies a value of the API key.
     * </p>
     * 
     * @param value
     *        Specifies a value of the API key.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Specifies a value of the API key.
     * </p>
     * 
     * @return Specifies a value of the API key.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Specifies a value of the API key.
     * </p>
     * 
     * @param value
     *        Specifies a value of the API key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiKeyRequest withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     * </p>
     * 
     * @return DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     */

    public java.util.List<StageKey> getStageKeys() {
        return stageKeys;
    }

    /**
     * <p>
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     * </p>
     * 
     * @param stageKeys
     *        DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     */

    public void setStageKeys(java.util.Collection<StageKey> stageKeys) {
        if (stageKeys == null) {
            this.stageKeys = null;
            return;
        }

        this.stageKeys = new java.util.ArrayList<StageKey>(stageKeys);
    }

    /**
     * <p>
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStageKeys(java.util.Collection)} or {@link #withStageKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stageKeys
     *        DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiKeyRequest withStageKeys(StageKey... stageKeys) {
        if (this.stageKeys == null) {
            setStageKeys(new java.util.ArrayList<StageKey>(stageKeys.length));
        }
        for (StageKey ele : stageKeys) {
            this.stageKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     * </p>
     * 
     * @param stageKeys
     *        DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiKeyRequest withStageKeys(java.util.Collection<StageKey> stageKeys) {
        setStageKeys(stageKeys);
        return this;
    }

    /**
     * <p>
     * An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
     * </p>
     * 
     * @param customerId
     *        An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
     */

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * <p>
     * An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
     * </p>
     * 
     * @return An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
     */

    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * <p>
     * An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
     * </p>
     * 
     * @param customerId
     *        An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiKeyRequest withCustomerId(String customerId) {
        setCustomerId(customerId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getGenerateDistinctId() != null)
            sb.append("GenerateDistinctId: ").append(getGenerateDistinctId()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getStageKeys() != null)
            sb.append("StageKeys: ").append(getStageKeys()).append(",");
        if (getCustomerId() != null)
            sb.append("CustomerId: ").append(getCustomerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApiKeyRequest == false)
            return false;
        CreateApiKeyRequest other = (CreateApiKeyRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getGenerateDistinctId() == null ^ this.getGenerateDistinctId() == null)
            return false;
        if (other.getGenerateDistinctId() != null && other.getGenerateDistinctId().equals(this.getGenerateDistinctId()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getStageKeys() == null ^ this.getStageKeys() == null)
            return false;
        if (other.getStageKeys() != null && other.getStageKeys().equals(this.getStageKeys()) == false)
            return false;
        if (other.getCustomerId() == null ^ this.getCustomerId() == null)
            return false;
        if (other.getCustomerId() != null && other.getCustomerId().equals(this.getCustomerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getGenerateDistinctId() == null) ? 0 : getGenerateDistinctId().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getStageKeys() == null) ? 0 : getStageKeys().hashCode());
        hashCode = prime * hashCode + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        return hashCode;
    }

    @Override
    public CreateApiKeyRequest clone() {
        return (CreateApiKeyRequest) super.clone();
    }

}

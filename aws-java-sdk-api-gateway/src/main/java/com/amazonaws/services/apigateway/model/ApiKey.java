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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A resource that can be distributed to callers for executing <a>Method</a> resources that require an API key. API keys
 * can be mapped to any <a>Stage</a> on any <a>RestApi</a>, which indicates that the callers with the API key can make
 * requests to that stage.
 * </p>
 * <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-api-keys.html">Use
 * API Keys</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApiKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the API Key.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The value of the API Key.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The name of the API Key.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
     * </p>
     */
    private String customerId;
    /**
     * <p>
     * The description of the API Key.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies whether the API Key can be used by callers.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The timestamp when the API Key was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The timestamp when the API Key was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDate;
    /**
     * <p>
     * A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
     * </p>
     */
    private java.util.List<String> stageKeys;

    /**
     * <p>
     * The identifier of the API Key.
     * </p>
     * 
     * @param id
     *        The identifier of the API Key.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the API Key.
     * </p>
     * 
     * @return The identifier of the API Key.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the API Key.
     * </p>
     * 
     * @param id
     *        The identifier of the API Key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiKey withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The value of the API Key.
     * </p>
     * 
     * @param value
     *        The value of the API Key.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the API Key.
     * </p>
     * 
     * @return The value of the API Key.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the API Key.
     * </p>
     * 
     * @param value
     *        The value of the API Key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiKey withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The name of the API Key.
     * </p>
     * 
     * @param name
     *        The name of the API Key.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the API Key.
     * </p>
     * 
     * @return The name of the API Key.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the API Key.
     * </p>
     * 
     * @param name
     *        The name of the API Key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiKey withName(String name) {
        setName(name);
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

    public ApiKey withCustomerId(String customerId) {
        setCustomerId(customerId);
        return this;
    }

    /**
     * <p>
     * The description of the API Key.
     * </p>
     * 
     * @param description
     *        The description of the API Key.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the API Key.
     * </p>
     * 
     * @return The description of the API Key.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the API Key.
     * </p>
     * 
     * @param description
     *        The description of the API Key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiKey withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies whether the API Key can be used by callers.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the API Key can be used by callers.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the API Key can be used by callers.
     * </p>
     * 
     * @return Specifies whether the API Key can be used by callers.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether the API Key can be used by callers.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the API Key can be used by callers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiKey withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the API Key can be used by callers.
     * </p>
     * 
     * @return Specifies whether the API Key can be used by callers.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The timestamp when the API Key was created.
     * </p>
     * 
     * @param createdDate
     *        The timestamp when the API Key was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The timestamp when the API Key was created.
     * </p>
     * 
     * @return The timestamp when the API Key was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The timestamp when the API Key was created.
     * </p>
     * 
     * @param createdDate
     *        The timestamp when the API Key was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiKey withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The timestamp when the API Key was last updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The timestamp when the API Key was last updated.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The timestamp when the API Key was last updated.
     * </p>
     * 
     * @return The timestamp when the API Key was last updated.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The timestamp when the API Key was last updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The timestamp when the API Key was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiKey withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
        return this;
    }

    /**
     * <p>
     * A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
     * </p>
     * 
     * @return A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
     */

    public java.util.List<String> getStageKeys() {
        return stageKeys;
    }

    /**
     * <p>
     * A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
     * </p>
     * 
     * @param stageKeys
     *        A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
     */

    public void setStageKeys(java.util.Collection<String> stageKeys) {
        if (stageKeys == null) {
            this.stageKeys = null;
            return;
        }

        this.stageKeys = new java.util.ArrayList<String>(stageKeys);
    }

    /**
     * <p>
     * A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStageKeys(java.util.Collection)} or {@link #withStageKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stageKeys
     *        A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiKey withStageKeys(String... stageKeys) {
        if (this.stageKeys == null) {
            setStageKeys(new java.util.ArrayList<String>(stageKeys.length));
        }
        for (String ele : stageKeys) {
            this.stageKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
     * </p>
     * 
     * @param stageKeys
     *        A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiKey withStageKeys(java.util.Collection<String> stageKeys) {
        setStageKeys(stageKeys);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCustomerId() != null)
            sb.append("CustomerId: ").append(getCustomerId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate()).append(",");
        if (getStageKeys() != null)
            sb.append("StageKeys: ").append(getStageKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApiKey == false)
            return false;
        ApiKey other = (ApiKey) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCustomerId() == null ^ this.getCustomerId() == null)
            return false;
        if (other.getCustomerId() != null && other.getCustomerId().equals(this.getCustomerId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getStageKeys() == null ^ this.getStageKeys() == null)
            return false;
        if (other.getStageKeys() != null && other.getStageKeys().equals(this.getStageKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getStageKeys() == null) ? 0 : getStageKeys().hashCode());
        return hashCode;
    }

    @Override
    public ApiKey clone() {
        try {
            return (ApiKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigateway.model.transform.ApiKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateApiKeyRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

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
     * Specifies whether the <a>ApiKey</a> can be used by callers.
     * </p>
     */
    private java.util.List<StageKey> stageKeys;

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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
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
     * Specifies whether the <a>ApiKey</a> can be used by callers.
     * </p>
     * 
     * @return Specifies whether the <a>ApiKey</a> can be used by callers.
     */
    public java.util.List<StageKey> getStageKeys() {
        return stageKeys;
    }

    /**
     * <p>
     * Specifies whether the <a>ApiKey</a> can be used by callers.
     * </p>
     * 
     * @param stageKeys
     *        Specifies whether the <a>ApiKey</a> can be used by callers.
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
     * Specifies whether the <a>ApiKey</a> can be used by callers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setStageKeys(java.util.Collection)} or
     * {@link #withStageKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param stageKeys
     *        Specifies whether the <a>ApiKey</a> can be used by callers.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
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
     * Specifies whether the <a>ApiKey</a> can be used by callers.
     * </p>
     * 
     * @param stageKeys
     *        Specifies whether the <a>ApiKey</a> can be used by callers.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateApiKeyRequest withStageKeys(
            java.util.Collection<StageKey> stageKeys) {
        setStageKeys(stageKeys);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getStageKeys() != null)
            sb.append("StageKeys: " + getStageKeys());
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
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null
                && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getStageKeys() == null ^ this.getStageKeys() == null)
            return false;
        if (other.getStageKeys() != null
                && other.getStageKeys().equals(this.getStageKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getStageKeys() == null) ? 0 : getStageKeys().hashCode());
        return hashCode;
    }

    @Override
    public CreateApiKeyRequest clone() {
        return (CreateApiKeyRequest) super.clone();
    }
}
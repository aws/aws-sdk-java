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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for an Amazon Q Business index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/NativeIndexConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NativeIndexConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the Amazon Q Business index.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * Overrides the default boosts applied by Amazon Q Business to supported document attribute data types.
     * </p>
     */
    private java.util.Map<String, DocumentAttributeBoostingConfiguration> boostingOverride;

    /**
     * <p>
     * The identifier for the Amazon Q Business index.
     * </p>
     * 
     * @param indexId
     *        The identifier for the Amazon Q Business index.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier for the Amazon Q Business index.
     * </p>
     * 
     * @return The identifier for the Amazon Q Business index.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier for the Amazon Q Business index.
     * </p>
     * 
     * @param indexId
     *        The identifier for the Amazon Q Business index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NativeIndexConfiguration withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * Overrides the default boosts applied by Amazon Q Business to supported document attribute data types.
     * </p>
     * 
     * @return Overrides the default boosts applied by Amazon Q Business to supported document attribute data types.
     */

    public java.util.Map<String, DocumentAttributeBoostingConfiguration> getBoostingOverride() {
        return boostingOverride;
    }

    /**
     * <p>
     * Overrides the default boosts applied by Amazon Q Business to supported document attribute data types.
     * </p>
     * 
     * @param boostingOverride
     *        Overrides the default boosts applied by Amazon Q Business to supported document attribute data types.
     */

    public void setBoostingOverride(java.util.Map<String, DocumentAttributeBoostingConfiguration> boostingOverride) {
        this.boostingOverride = boostingOverride;
    }

    /**
     * <p>
     * Overrides the default boosts applied by Amazon Q Business to supported document attribute data types.
     * </p>
     * 
     * @param boostingOverride
     *        Overrides the default boosts applied by Amazon Q Business to supported document attribute data types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NativeIndexConfiguration withBoostingOverride(java.util.Map<String, DocumentAttributeBoostingConfiguration> boostingOverride) {
        setBoostingOverride(boostingOverride);
        return this;
    }

    /**
     * Add a single BoostingOverride entry
     *
     * @see NativeIndexConfiguration#withBoostingOverride
     * @returns a reference to this object so that method calls can be chained together.
     */

    public NativeIndexConfiguration addBoostingOverrideEntry(String key, DocumentAttributeBoostingConfiguration value) {
        if (null == this.boostingOverride) {
            this.boostingOverride = new java.util.HashMap<String, DocumentAttributeBoostingConfiguration>();
        }
        if (this.boostingOverride.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.boostingOverride.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BoostingOverride.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NativeIndexConfiguration clearBoostingOverrideEntries() {
        this.boostingOverride = null;
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getBoostingOverride() != null)
            sb.append("BoostingOverride: ").append(getBoostingOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NativeIndexConfiguration == false)
            return false;
        NativeIndexConfiguration other = (NativeIndexConfiguration) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getBoostingOverride() == null ^ this.getBoostingOverride() == null)
            return false;
        if (other.getBoostingOverride() != null && other.getBoostingOverride().equals(this.getBoostingOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getBoostingOverride() == null) ? 0 : getBoostingOverride().hashCode());
        return hashCode;
    }

    @Override
    public NativeIndexConfiguration clone() {
        try {
            return (NativeIndexConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.NativeIndexConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

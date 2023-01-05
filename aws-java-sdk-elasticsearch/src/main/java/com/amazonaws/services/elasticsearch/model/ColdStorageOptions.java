/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration for cold storage options such as enabled
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColdStorageOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enable cold storage option. Accepted values true or false
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Enable cold storage option. Accepted values true or false
     * </p>
     * 
     * @param enabled
     *        Enable cold storage option. Accepted values true or false
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Enable cold storage option. Accepted values true or false
     * </p>
     * 
     * @return Enable cold storage option. Accepted values true or false
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Enable cold storage option. Accepted values true or false
     * </p>
     * 
     * @param enabled
     *        Enable cold storage option. Accepted values true or false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColdStorageOptions withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Enable cold storage option. Accepted values true or false
     * </p>
     * 
     * @return Enable cold storage option. Accepted values true or false
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColdStorageOptions == false)
            return false;
        ColdStorageOptions other = (ColdStorageOptions) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ColdStorageOptions clone() {
        try {
            return (ColdStorageOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.ColdStorageOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

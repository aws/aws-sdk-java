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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The package group origin configuration that determines how package versions can enter repositories.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PackageGroupOriginConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageGroupOriginConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The origin configuration settings that determine how package versions can enter repositories.
     * </p>
     */
    private java.util.Map<String, PackageGroupOriginRestriction> restrictions;

    /**
     * <p>
     * The origin configuration settings that determine how package versions can enter repositories.
     * </p>
     * 
     * @return The origin configuration settings that determine how package versions can enter repositories.
     */

    public java.util.Map<String, PackageGroupOriginRestriction> getRestrictions() {
        return restrictions;
    }

    /**
     * <p>
     * The origin configuration settings that determine how package versions can enter repositories.
     * </p>
     * 
     * @param restrictions
     *        The origin configuration settings that determine how package versions can enter repositories.
     */

    public void setRestrictions(java.util.Map<String, PackageGroupOriginRestriction> restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * <p>
     * The origin configuration settings that determine how package versions can enter repositories.
     * </p>
     * 
     * @param restrictions
     *        The origin configuration settings that determine how package versions can enter repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageGroupOriginConfiguration withRestrictions(java.util.Map<String, PackageGroupOriginRestriction> restrictions) {
        setRestrictions(restrictions);
        return this;
    }

    /**
     * Add a single Restrictions entry
     *
     * @see PackageGroupOriginConfiguration#withRestrictions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PackageGroupOriginConfiguration addRestrictionsEntry(String key, PackageGroupOriginRestriction value) {
        if (null == this.restrictions) {
            this.restrictions = new java.util.HashMap<String, PackageGroupOriginRestriction>();
        }
        if (this.restrictions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.restrictions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Restrictions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageGroupOriginConfiguration clearRestrictionsEntries() {
        this.restrictions = null;
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
        if (getRestrictions() != null)
            sb.append("Restrictions: ").append(getRestrictions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageGroupOriginConfiguration == false)
            return false;
        PackageGroupOriginConfiguration other = (PackageGroupOriginConfiguration) obj;
        if (other.getRestrictions() == null ^ this.getRestrictions() == null)
            return false;
        if (other.getRestrictions() != null && other.getRestrictions().equals(this.getRestrictions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestrictions() == null) ? 0 : getRestrictions().hashCode());
        return hashCode;
    }

    @Override
    public PackageGroupOriginConfiguration clone() {
        try {
            return (PackageGroupOriginConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.PackageGroupOriginConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

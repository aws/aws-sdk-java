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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a single version of a managed rule group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ManagedRuleGroupVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedRuleGroupVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The date and time that the managed rule group owner updated the rule group version information.
     * </p>
     */
    private java.util.Date lastUpdateTimestamp;

    /**
     * <p>
     * The version name.
     * </p>
     * 
     * @param name
     *        The version name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The version name.
     * </p>
     * 
     * @return The version name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The version name.
     * </p>
     * 
     * @param name
     *        The version name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupVersion withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The date and time that the managed rule group owner updated the rule group version information.
     * </p>
     * 
     * @param lastUpdateTimestamp
     *        The date and time that the managed rule group owner updated the rule group version information.
     */

    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    /**
     * <p>
     * The date and time that the managed rule group owner updated the rule group version information.
     * </p>
     * 
     * @return The date and time that the managed rule group owner updated the rule group version information.
     */

    public java.util.Date getLastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }

    /**
     * <p>
     * The date and time that the managed rule group owner updated the rule group version information.
     * </p>
     * 
     * @param lastUpdateTimestamp
     *        The date and time that the managed rule group owner updated the rule group version information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupVersion withLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        setLastUpdateTimestamp(lastUpdateTimestamp);
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
        if (getLastUpdateTimestamp() != null)
            sb.append("LastUpdateTimestamp: ").append(getLastUpdateTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedRuleGroupVersion == false)
            return false;
        ManagedRuleGroupVersion other = (ManagedRuleGroupVersion) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLastUpdateTimestamp() == null ^ this.getLastUpdateTimestamp() == null)
            return false;
        if (other.getLastUpdateTimestamp() != null && other.getLastUpdateTimestamp().equals(this.getLastUpdateTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTimestamp() == null) ? 0 : getLastUpdateTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ManagedRuleGroupVersion clone() {
        try {
            return (ManagedRuleGroupVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ManagedRuleGroupVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

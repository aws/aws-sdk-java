/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Limits settings on protection groups with arbitrary pattern type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ProtectionGroupArbitraryPatternLimits"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectionGroupArbitraryPatternLimits implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of resources you can specify for a single arbitrary pattern in a protection group.
     * </p>
     */
    private Long maxMembers;

    /**
     * <p>
     * The maximum number of resources you can specify for a single arbitrary pattern in a protection group.
     * </p>
     * 
     * @param maxMembers
     *        The maximum number of resources you can specify for a single arbitrary pattern in a protection group.
     */

    public void setMaxMembers(Long maxMembers) {
        this.maxMembers = maxMembers;
    }

    /**
     * <p>
     * The maximum number of resources you can specify for a single arbitrary pattern in a protection group.
     * </p>
     * 
     * @return The maximum number of resources you can specify for a single arbitrary pattern in a protection group.
     */

    public Long getMaxMembers() {
        return this.maxMembers;
    }

    /**
     * <p>
     * The maximum number of resources you can specify for a single arbitrary pattern in a protection group.
     * </p>
     * 
     * @param maxMembers
     *        The maximum number of resources you can specify for a single arbitrary pattern in a protection group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectionGroupArbitraryPatternLimits withMaxMembers(Long maxMembers) {
        setMaxMembers(maxMembers);
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
        if (getMaxMembers() != null)
            sb.append("MaxMembers: ").append(getMaxMembers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectionGroupArbitraryPatternLimits == false)
            return false;
        ProtectionGroupArbitraryPatternLimits other = (ProtectionGroupArbitraryPatternLimits) obj;
        if (other.getMaxMembers() == null ^ this.getMaxMembers() == null)
            return false;
        if (other.getMaxMembers() != null && other.getMaxMembers().equals(this.getMaxMembers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxMembers() == null) ? 0 : getMaxMembers().hashCode());
        return hashCode;
    }

    @Override
    public ProtectionGroupArbitraryPatternLimits clone() {
        try {
            return (ProtectionGroupArbitraryPatternLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.ProtectionGroupArbitraryPatternLimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

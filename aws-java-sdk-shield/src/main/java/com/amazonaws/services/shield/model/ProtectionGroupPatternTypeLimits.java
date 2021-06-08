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
 * Limits settings by pattern type in the protection groups for your subscription.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ProtectionGroupPatternTypeLimits"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectionGroupPatternTypeLimits implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Limits settings on protection groups with arbitrary pattern type.
     * </p>
     */
    private ProtectionGroupArbitraryPatternLimits arbitraryPatternLimits;

    /**
     * <p>
     * Limits settings on protection groups with arbitrary pattern type.
     * </p>
     * 
     * @param arbitraryPatternLimits
     *        Limits settings on protection groups with arbitrary pattern type.
     */

    public void setArbitraryPatternLimits(ProtectionGroupArbitraryPatternLimits arbitraryPatternLimits) {
        this.arbitraryPatternLimits = arbitraryPatternLimits;
    }

    /**
     * <p>
     * Limits settings on protection groups with arbitrary pattern type.
     * </p>
     * 
     * @return Limits settings on protection groups with arbitrary pattern type.
     */

    public ProtectionGroupArbitraryPatternLimits getArbitraryPatternLimits() {
        return this.arbitraryPatternLimits;
    }

    /**
     * <p>
     * Limits settings on protection groups with arbitrary pattern type.
     * </p>
     * 
     * @param arbitraryPatternLimits
     *        Limits settings on protection groups with arbitrary pattern type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectionGroupPatternTypeLimits withArbitraryPatternLimits(ProtectionGroupArbitraryPatternLimits arbitraryPatternLimits) {
        setArbitraryPatternLimits(arbitraryPatternLimits);
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
        if (getArbitraryPatternLimits() != null)
            sb.append("ArbitraryPatternLimits: ").append(getArbitraryPatternLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectionGroupPatternTypeLimits == false)
            return false;
        ProtectionGroupPatternTypeLimits other = (ProtectionGroupPatternTypeLimits) obj;
        if (other.getArbitraryPatternLimits() == null ^ this.getArbitraryPatternLimits() == null)
            return false;
        if (other.getArbitraryPatternLimits() != null && other.getArbitraryPatternLimits().equals(this.getArbitraryPatternLimits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArbitraryPatternLimits() == null) ? 0 : getArbitraryPatternLimits().hashCode());
        return hashCode;
    }

    @Override
    public ProtectionGroupPatternTypeLimits clone() {
        try {
            return (ProtectionGroupPatternTypeLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.ProtectionGroupPatternTypeLimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

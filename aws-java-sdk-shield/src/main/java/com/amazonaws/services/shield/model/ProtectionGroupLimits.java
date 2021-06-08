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
 * Limits settings on protection groups for your subscription.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ProtectionGroupLimits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectionGroupLimits implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of protection groups that you can have at one time.
     * </p>
     */
    private Long maxProtectionGroups;
    /**
     * <p>
     * Limits settings by pattern type in the protection groups for your subscription.
     * </p>
     */
    private ProtectionGroupPatternTypeLimits patternTypeLimits;

    /**
     * <p>
     * The maximum number of protection groups that you can have at one time.
     * </p>
     * 
     * @param maxProtectionGroups
     *        The maximum number of protection groups that you can have at one time.
     */

    public void setMaxProtectionGroups(Long maxProtectionGroups) {
        this.maxProtectionGroups = maxProtectionGroups;
    }

    /**
     * <p>
     * The maximum number of protection groups that you can have at one time.
     * </p>
     * 
     * @return The maximum number of protection groups that you can have at one time.
     */

    public Long getMaxProtectionGroups() {
        return this.maxProtectionGroups;
    }

    /**
     * <p>
     * The maximum number of protection groups that you can have at one time.
     * </p>
     * 
     * @param maxProtectionGroups
     *        The maximum number of protection groups that you can have at one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectionGroupLimits withMaxProtectionGroups(Long maxProtectionGroups) {
        setMaxProtectionGroups(maxProtectionGroups);
        return this;
    }

    /**
     * <p>
     * Limits settings by pattern type in the protection groups for your subscription.
     * </p>
     * 
     * @param patternTypeLimits
     *        Limits settings by pattern type in the protection groups for your subscription.
     */

    public void setPatternTypeLimits(ProtectionGroupPatternTypeLimits patternTypeLimits) {
        this.patternTypeLimits = patternTypeLimits;
    }

    /**
     * <p>
     * Limits settings by pattern type in the protection groups for your subscription.
     * </p>
     * 
     * @return Limits settings by pattern type in the protection groups for your subscription.
     */

    public ProtectionGroupPatternTypeLimits getPatternTypeLimits() {
        return this.patternTypeLimits;
    }

    /**
     * <p>
     * Limits settings by pattern type in the protection groups for your subscription.
     * </p>
     * 
     * @param patternTypeLimits
     *        Limits settings by pattern type in the protection groups for your subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectionGroupLimits withPatternTypeLimits(ProtectionGroupPatternTypeLimits patternTypeLimits) {
        setPatternTypeLimits(patternTypeLimits);
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
        if (getMaxProtectionGroups() != null)
            sb.append("MaxProtectionGroups: ").append(getMaxProtectionGroups()).append(",");
        if (getPatternTypeLimits() != null)
            sb.append("PatternTypeLimits: ").append(getPatternTypeLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectionGroupLimits == false)
            return false;
        ProtectionGroupLimits other = (ProtectionGroupLimits) obj;
        if (other.getMaxProtectionGroups() == null ^ this.getMaxProtectionGroups() == null)
            return false;
        if (other.getMaxProtectionGroups() != null && other.getMaxProtectionGroups().equals(this.getMaxProtectionGroups()) == false)
            return false;
        if (other.getPatternTypeLimits() == null ^ this.getPatternTypeLimits() == null)
            return false;
        if (other.getPatternTypeLimits() != null && other.getPatternTypeLimits().equals(this.getPatternTypeLimits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxProtectionGroups() == null) ? 0 : getMaxProtectionGroups().hashCode());
        hashCode = prime * hashCode + ((getPatternTypeLimits() == null) ? 0 : getPatternTypeLimits().hashCode());
        return hashCode;
    }

    @Override
    public ProtectionGroupLimits clone() {
        try {
            return (ProtectionGroupLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.ProtectionGroupLimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

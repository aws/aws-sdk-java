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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a security profile and the target associated with it.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityProfileTargetMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information that identifies the security profile.
     * </p>
     */
    private SecurityProfileIdentifier securityProfileIdentifier;
    /**
     * <p>
     * Information about the target (thing group) associated with the security profile.
     * </p>
     */
    private SecurityProfileTarget target;

    /**
     * <p>
     * Information that identifies the security profile.
     * </p>
     * 
     * @param securityProfileIdentifier
     *        Information that identifies the security profile.
     */

    public void setSecurityProfileIdentifier(SecurityProfileIdentifier securityProfileIdentifier) {
        this.securityProfileIdentifier = securityProfileIdentifier;
    }

    /**
     * <p>
     * Information that identifies the security profile.
     * </p>
     * 
     * @return Information that identifies the security profile.
     */

    public SecurityProfileIdentifier getSecurityProfileIdentifier() {
        return this.securityProfileIdentifier;
    }

    /**
     * <p>
     * Information that identifies the security profile.
     * </p>
     * 
     * @param securityProfileIdentifier
     *        Information that identifies the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityProfileTargetMapping withSecurityProfileIdentifier(SecurityProfileIdentifier securityProfileIdentifier) {
        setSecurityProfileIdentifier(securityProfileIdentifier);
        return this;
    }

    /**
     * <p>
     * Information about the target (thing group) associated with the security profile.
     * </p>
     * 
     * @param target
     *        Information about the target (thing group) associated with the security profile.
     */

    public void setTarget(SecurityProfileTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * Information about the target (thing group) associated with the security profile.
     * </p>
     * 
     * @return Information about the target (thing group) associated with the security profile.
     */

    public SecurityProfileTarget getTarget() {
        return this.target;
    }

    /**
     * <p>
     * Information about the target (thing group) associated with the security profile.
     * </p>
     * 
     * @param target
     *        Information about the target (thing group) associated with the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityProfileTargetMapping withTarget(SecurityProfileTarget target) {
        setTarget(target);
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
        if (getSecurityProfileIdentifier() != null)
            sb.append("SecurityProfileIdentifier: ").append(getSecurityProfileIdentifier()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityProfileTargetMapping == false)
            return false;
        SecurityProfileTargetMapping other = (SecurityProfileTargetMapping) obj;
        if (other.getSecurityProfileIdentifier() == null ^ this.getSecurityProfileIdentifier() == null)
            return false;
        if (other.getSecurityProfileIdentifier() != null && other.getSecurityProfileIdentifier().equals(this.getSecurityProfileIdentifier()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityProfileIdentifier() == null) ? 0 : getSecurityProfileIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public SecurityProfileTargetMapping clone() {
        try {
            return (SecurityProfileTargetMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.SecurityProfileTargetMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

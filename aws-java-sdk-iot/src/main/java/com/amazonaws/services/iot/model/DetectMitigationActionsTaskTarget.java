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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The target of a mitigation action task.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectMitigationActionsTaskTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifiers of the violations.
     * </p>
     */
    private java.util.List<String> violationIds;
    /**
     * <p>
     * The name of the security profile.
     * </p>
     */
    private String securityProfileName;
    /**
     * <p>
     * The name of the behavior.
     * </p>
     */
    private String behaviorName;

    /**
     * <p>
     * The unique identifiers of the violations.
     * </p>
     * 
     * @return The unique identifiers of the violations.
     */

    public java.util.List<String> getViolationIds() {
        return violationIds;
    }

    /**
     * <p>
     * The unique identifiers of the violations.
     * </p>
     * 
     * @param violationIds
     *        The unique identifiers of the violations.
     */

    public void setViolationIds(java.util.Collection<String> violationIds) {
        if (violationIds == null) {
            this.violationIds = null;
            return;
        }

        this.violationIds = new java.util.ArrayList<String>(violationIds);
    }

    /**
     * <p>
     * The unique identifiers of the violations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setViolationIds(java.util.Collection)} or {@link #withViolationIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param violationIds
     *        The unique identifiers of the violations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskTarget withViolationIds(String... violationIds) {
        if (this.violationIds == null) {
            setViolationIds(new java.util.ArrayList<String>(violationIds.length));
        }
        for (String ele : violationIds) {
            this.violationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the violations.
     * </p>
     * 
     * @param violationIds
     *        The unique identifiers of the violations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskTarget withViolationIds(java.util.Collection<String> violationIds) {
        setViolationIds(violationIds);
        return this;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * 
     * @param securityProfileName
     *        The name of the security profile.
     */

    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * 
     * @return The name of the security profile.
     */

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * 
     * @param securityProfileName
     *        The name of the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskTarget withSecurityProfileName(String securityProfileName) {
        setSecurityProfileName(securityProfileName);
        return this;
    }

    /**
     * <p>
     * The name of the behavior.
     * </p>
     * 
     * @param behaviorName
     *        The name of the behavior.
     */

    public void setBehaviorName(String behaviorName) {
        this.behaviorName = behaviorName;
    }

    /**
     * <p>
     * The name of the behavior.
     * </p>
     * 
     * @return The name of the behavior.
     */

    public String getBehaviorName() {
        return this.behaviorName;
    }

    /**
     * <p>
     * The name of the behavior.
     * </p>
     * 
     * @param behaviorName
     *        The name of the behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskTarget withBehaviorName(String behaviorName) {
        setBehaviorName(behaviorName);
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
        if (getViolationIds() != null)
            sb.append("ViolationIds: ").append(getViolationIds()).append(",");
        if (getSecurityProfileName() != null)
            sb.append("SecurityProfileName: ").append(getSecurityProfileName()).append(",");
        if (getBehaviorName() != null)
            sb.append("BehaviorName: ").append(getBehaviorName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectMitigationActionsTaskTarget == false)
            return false;
        DetectMitigationActionsTaskTarget other = (DetectMitigationActionsTaskTarget) obj;
        if (other.getViolationIds() == null ^ this.getViolationIds() == null)
            return false;
        if (other.getViolationIds() != null && other.getViolationIds().equals(this.getViolationIds()) == false)
            return false;
        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getBehaviorName() == null ^ this.getBehaviorName() == null)
            return false;
        if (other.getBehaviorName() != null && other.getBehaviorName().equals(this.getBehaviorName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViolationIds() == null) ? 0 : getViolationIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode + ((getBehaviorName() == null) ? 0 : getBehaviorName().hashCode());
        return hashCode;
    }

    @Override
    public DetectMitigationActionsTaskTarget clone() {
        try {
            return (DetectMitigationActionsTaskTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.DetectMitigationActionsTaskTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

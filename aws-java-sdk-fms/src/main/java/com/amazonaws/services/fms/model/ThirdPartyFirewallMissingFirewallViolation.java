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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The violation details about a third-party firewall's subnet that doesn't have a Firewall Manager managed firewall in
 * its VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ThirdPartyFirewallMissingFirewallViolation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThirdPartyFirewallMissingFirewallViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the third-party firewall that's causing the violation.
     * </p>
     */
    private String violationTarget;
    /**
     * <p>
     * The resource ID of the VPC associated with a third-party firewall.
     * </p>
     */
    private String vPC;
    /**
     * <p>
     * The Availability Zone of the third-party firewall that's causing the violation.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The reason the resource is causing this violation, if a reason is available.
     * </p>
     */
    private String targetViolationReason;

    /**
     * <p>
     * The ID of the third-party firewall that's causing the violation.
     * </p>
     * 
     * @param violationTarget
     *        The ID of the third-party firewall that's causing the violation.
     */

    public void setViolationTarget(String violationTarget) {
        this.violationTarget = violationTarget;
    }

    /**
     * <p>
     * The ID of the third-party firewall that's causing the violation.
     * </p>
     * 
     * @return The ID of the third-party firewall that's causing the violation.
     */

    public String getViolationTarget() {
        return this.violationTarget;
    }

    /**
     * <p>
     * The ID of the third-party firewall that's causing the violation.
     * </p>
     * 
     * @param violationTarget
     *        The ID of the third-party firewall that's causing the violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyFirewallMissingFirewallViolation withViolationTarget(String violationTarget) {
        setViolationTarget(violationTarget);
        return this;
    }

    /**
     * <p>
     * The resource ID of the VPC associated with a third-party firewall.
     * </p>
     * 
     * @param vPC
     *        The resource ID of the VPC associated with a third-party firewall.
     */

    public void setVPC(String vPC) {
        this.vPC = vPC;
    }

    /**
     * <p>
     * The resource ID of the VPC associated with a third-party firewall.
     * </p>
     * 
     * @return The resource ID of the VPC associated with a third-party firewall.
     */

    public String getVPC() {
        return this.vPC;
    }

    /**
     * <p>
     * The resource ID of the VPC associated with a third-party firewall.
     * </p>
     * 
     * @param vPC
     *        The resource ID of the VPC associated with a third-party firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyFirewallMissingFirewallViolation withVPC(String vPC) {
        setVPC(vPC);
        return this;
    }

    /**
     * <p>
     * The Availability Zone of the third-party firewall that's causing the violation.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the third-party firewall that's causing the violation.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the third-party firewall that's causing the violation.
     * </p>
     * 
     * @return The Availability Zone of the third-party firewall that's causing the violation.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the third-party firewall that's causing the violation.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the third-party firewall that's causing the violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyFirewallMissingFirewallViolation withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The reason the resource is causing this violation, if a reason is available.
     * </p>
     * 
     * @param targetViolationReason
     *        The reason the resource is causing this violation, if a reason is available.
     */

    public void setTargetViolationReason(String targetViolationReason) {
        this.targetViolationReason = targetViolationReason;
    }

    /**
     * <p>
     * The reason the resource is causing this violation, if a reason is available.
     * </p>
     * 
     * @return The reason the resource is causing this violation, if a reason is available.
     */

    public String getTargetViolationReason() {
        return this.targetViolationReason;
    }

    /**
     * <p>
     * The reason the resource is causing this violation, if a reason is available.
     * </p>
     * 
     * @param targetViolationReason
     *        The reason the resource is causing this violation, if a reason is available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyFirewallMissingFirewallViolation withTargetViolationReason(String targetViolationReason) {
        setTargetViolationReason(targetViolationReason);
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
        if (getViolationTarget() != null)
            sb.append("ViolationTarget: ").append(getViolationTarget()).append(",");
        if (getVPC() != null)
            sb.append("VPC: ").append(getVPC()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getTargetViolationReason() != null)
            sb.append("TargetViolationReason: ").append(getTargetViolationReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThirdPartyFirewallMissingFirewallViolation == false)
            return false;
        ThirdPartyFirewallMissingFirewallViolation other = (ThirdPartyFirewallMissingFirewallViolation) obj;
        if (other.getViolationTarget() == null ^ this.getViolationTarget() == null)
            return false;
        if (other.getViolationTarget() != null && other.getViolationTarget().equals(this.getViolationTarget()) == false)
            return false;
        if (other.getVPC() == null ^ this.getVPC() == null)
            return false;
        if (other.getVPC() != null && other.getVPC().equals(this.getVPC()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getTargetViolationReason() == null ^ this.getTargetViolationReason() == null)
            return false;
        if (other.getTargetViolationReason() != null && other.getTargetViolationReason().equals(this.getTargetViolationReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViolationTarget() == null) ? 0 : getViolationTarget().hashCode());
        hashCode = prime * hashCode + ((getVPC() == null) ? 0 : getVPC().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getTargetViolationReason() == null) ? 0 : getTargetViolationReason().hashCode());
        return hashCode;
    }

    @Override
    public ThirdPartyFirewallMissingFirewallViolation clone() {
        try {
            return (ThirdPartyFirewallMissingFirewallViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.ThirdPartyFirewallMissingFirewallViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

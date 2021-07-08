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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Violation detail for Network Firewall for a firewall policy that has a different
 * <a>NetworkFirewallPolicyDescription</a> than is required by the Firewall Manager policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/NetworkFirewallPolicyModifiedViolation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkFirewallPolicyModifiedViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Network Firewall or VPC resource that's in violation.
     * </p>
     */
    private String violationTarget;
    /**
     * <p>
     * The policy that's currently in use in the individual account.
     * </p>
     */
    private NetworkFirewallPolicyDescription currentPolicyDescription;
    /**
     * <p>
     * The policy that should be in use in the individual account in order to be compliant.
     * </p>
     */
    private NetworkFirewallPolicyDescription expectedPolicyDescription;

    /**
     * <p>
     * The ID of the Network Firewall or VPC resource that's in violation.
     * </p>
     * 
     * @param violationTarget
     *        The ID of the Network Firewall or VPC resource that's in violation.
     */

    public void setViolationTarget(String violationTarget) {
        this.violationTarget = violationTarget;
    }

    /**
     * <p>
     * The ID of the Network Firewall or VPC resource that's in violation.
     * </p>
     * 
     * @return The ID of the Network Firewall or VPC resource that's in violation.
     */

    public String getViolationTarget() {
        return this.violationTarget;
    }

    /**
     * <p>
     * The ID of the Network Firewall or VPC resource that's in violation.
     * </p>
     * 
     * @param violationTarget
     *        The ID of the Network Firewall or VPC resource that's in violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallPolicyModifiedViolation withViolationTarget(String violationTarget) {
        setViolationTarget(violationTarget);
        return this;
    }

    /**
     * <p>
     * The policy that's currently in use in the individual account.
     * </p>
     * 
     * @param currentPolicyDescription
     *        The policy that's currently in use in the individual account.
     */

    public void setCurrentPolicyDescription(NetworkFirewallPolicyDescription currentPolicyDescription) {
        this.currentPolicyDescription = currentPolicyDescription;
    }

    /**
     * <p>
     * The policy that's currently in use in the individual account.
     * </p>
     * 
     * @return The policy that's currently in use in the individual account.
     */

    public NetworkFirewallPolicyDescription getCurrentPolicyDescription() {
        return this.currentPolicyDescription;
    }

    /**
     * <p>
     * The policy that's currently in use in the individual account.
     * </p>
     * 
     * @param currentPolicyDescription
     *        The policy that's currently in use in the individual account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallPolicyModifiedViolation withCurrentPolicyDescription(NetworkFirewallPolicyDescription currentPolicyDescription) {
        setCurrentPolicyDescription(currentPolicyDescription);
        return this;
    }

    /**
     * <p>
     * The policy that should be in use in the individual account in order to be compliant.
     * </p>
     * 
     * @param expectedPolicyDescription
     *        The policy that should be in use in the individual account in order to be compliant.
     */

    public void setExpectedPolicyDescription(NetworkFirewallPolicyDescription expectedPolicyDescription) {
        this.expectedPolicyDescription = expectedPolicyDescription;
    }

    /**
     * <p>
     * The policy that should be in use in the individual account in order to be compliant.
     * </p>
     * 
     * @return The policy that should be in use in the individual account in order to be compliant.
     */

    public NetworkFirewallPolicyDescription getExpectedPolicyDescription() {
        return this.expectedPolicyDescription;
    }

    /**
     * <p>
     * The policy that should be in use in the individual account in order to be compliant.
     * </p>
     * 
     * @param expectedPolicyDescription
     *        The policy that should be in use in the individual account in order to be compliant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallPolicyModifiedViolation withExpectedPolicyDescription(NetworkFirewallPolicyDescription expectedPolicyDescription) {
        setExpectedPolicyDescription(expectedPolicyDescription);
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
        if (getCurrentPolicyDescription() != null)
            sb.append("CurrentPolicyDescription: ").append(getCurrentPolicyDescription()).append(",");
        if (getExpectedPolicyDescription() != null)
            sb.append("ExpectedPolicyDescription: ").append(getExpectedPolicyDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkFirewallPolicyModifiedViolation == false)
            return false;
        NetworkFirewallPolicyModifiedViolation other = (NetworkFirewallPolicyModifiedViolation) obj;
        if (other.getViolationTarget() == null ^ this.getViolationTarget() == null)
            return false;
        if (other.getViolationTarget() != null && other.getViolationTarget().equals(this.getViolationTarget()) == false)
            return false;
        if (other.getCurrentPolicyDescription() == null ^ this.getCurrentPolicyDescription() == null)
            return false;
        if (other.getCurrentPolicyDescription() != null && other.getCurrentPolicyDescription().equals(this.getCurrentPolicyDescription()) == false)
            return false;
        if (other.getExpectedPolicyDescription() == null ^ this.getExpectedPolicyDescription() == null)
            return false;
        if (other.getExpectedPolicyDescription() != null && other.getExpectedPolicyDescription().equals(this.getExpectedPolicyDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViolationTarget() == null) ? 0 : getViolationTarget().hashCode());
        hashCode = prime * hashCode + ((getCurrentPolicyDescription() == null) ? 0 : getCurrentPolicyDescription().hashCode());
        hashCode = prime * hashCode + ((getExpectedPolicyDescription() == null) ? 0 : getExpectedPolicyDescription().hashCode());
        return hashCode;
    }

    @Override
    public NetworkFirewallPolicyModifiedViolation clone() {
        try {
            return (NetworkFirewallPolicyModifiedViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.NetworkFirewallPolicyModifiedViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

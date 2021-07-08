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
 * Violation detail for network interfaces associated with an EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/AwsEc2NetworkInterfaceViolation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2NetworkInterfaceViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource ID of the network interface.
     * </p>
     */
    private String violationTarget;
    /**
     * <p>
     * List of security groups that violate the rules specified in the primary security group of the Firewall Manager
     * policy.
     * </p>
     */
    private java.util.List<String> violatingSecurityGroups;

    /**
     * <p>
     * The resource ID of the network interface.
     * </p>
     * 
     * @param violationTarget
     *        The resource ID of the network interface.
     */

    public void setViolationTarget(String violationTarget) {
        this.violationTarget = violationTarget;
    }

    /**
     * <p>
     * The resource ID of the network interface.
     * </p>
     * 
     * @return The resource ID of the network interface.
     */

    public String getViolationTarget() {
        return this.violationTarget;
    }

    /**
     * <p>
     * The resource ID of the network interface.
     * </p>
     * 
     * @param violationTarget
     *        The resource ID of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceViolation withViolationTarget(String violationTarget) {
        setViolationTarget(violationTarget);
        return this;
    }

    /**
     * <p>
     * List of security groups that violate the rules specified in the primary security group of the Firewall Manager
     * policy.
     * </p>
     * 
     * @return List of security groups that violate the rules specified in the primary security group of the Firewall
     *         Manager policy.
     */

    public java.util.List<String> getViolatingSecurityGroups() {
        return violatingSecurityGroups;
    }

    /**
     * <p>
     * List of security groups that violate the rules specified in the primary security group of the Firewall Manager
     * policy.
     * </p>
     * 
     * @param violatingSecurityGroups
     *        List of security groups that violate the rules specified in the primary security group of the Firewall
     *        Manager policy.
     */

    public void setViolatingSecurityGroups(java.util.Collection<String> violatingSecurityGroups) {
        if (violatingSecurityGroups == null) {
            this.violatingSecurityGroups = null;
            return;
        }

        this.violatingSecurityGroups = new java.util.ArrayList<String>(violatingSecurityGroups);
    }

    /**
     * <p>
     * List of security groups that violate the rules specified in the primary security group of the Firewall Manager
     * policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setViolatingSecurityGroups(java.util.Collection)} or
     * {@link #withViolatingSecurityGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param violatingSecurityGroups
     *        List of security groups that violate the rules specified in the primary security group of the Firewall
     *        Manager policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceViolation withViolatingSecurityGroups(String... violatingSecurityGroups) {
        if (this.violatingSecurityGroups == null) {
            setViolatingSecurityGroups(new java.util.ArrayList<String>(violatingSecurityGroups.length));
        }
        for (String ele : violatingSecurityGroups) {
            this.violatingSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of security groups that violate the rules specified in the primary security group of the Firewall Manager
     * policy.
     * </p>
     * 
     * @param violatingSecurityGroups
     *        List of security groups that violate the rules specified in the primary security group of the Firewall
     *        Manager policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceViolation withViolatingSecurityGroups(java.util.Collection<String> violatingSecurityGroups) {
        setViolatingSecurityGroups(violatingSecurityGroups);
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
        if (getViolatingSecurityGroups() != null)
            sb.append("ViolatingSecurityGroups: ").append(getViolatingSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2NetworkInterfaceViolation == false)
            return false;
        AwsEc2NetworkInterfaceViolation other = (AwsEc2NetworkInterfaceViolation) obj;
        if (other.getViolationTarget() == null ^ this.getViolationTarget() == null)
            return false;
        if (other.getViolationTarget() != null && other.getViolationTarget().equals(this.getViolationTarget()) == false)
            return false;
        if (other.getViolatingSecurityGroups() == null ^ this.getViolatingSecurityGroups() == null)
            return false;
        if (other.getViolatingSecurityGroups() != null && other.getViolatingSecurityGroups().equals(this.getViolatingSecurityGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViolationTarget() == null) ? 0 : getViolationTarget().hashCode());
        hashCode = prime * hashCode + ((getViolatingSecurityGroups() == null) ? 0 : getViolatingSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2NetworkInterfaceViolation clone() {
        try {
            return (AwsEc2NetworkInterfaceViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.AwsEc2NetworkInterfaceViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

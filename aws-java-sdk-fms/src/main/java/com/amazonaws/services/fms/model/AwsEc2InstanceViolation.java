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
 * Violation detail for an EC2 instance resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/AwsEc2InstanceViolation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2InstanceViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource ID of the EC2 instance.
     * </p>
     */
    private String violationTarget;
    /**
     * <p>
     * Violation detail for network interfaces associated with the EC2 instance.
     * </p>
     */
    private java.util.List<AwsEc2NetworkInterfaceViolation> awsEc2NetworkInterfaceViolations;

    /**
     * <p>
     * The resource ID of the EC2 instance.
     * </p>
     * 
     * @param violationTarget
     *        The resource ID of the EC2 instance.
     */

    public void setViolationTarget(String violationTarget) {
        this.violationTarget = violationTarget;
    }

    /**
     * <p>
     * The resource ID of the EC2 instance.
     * </p>
     * 
     * @return The resource ID of the EC2 instance.
     */

    public String getViolationTarget() {
        return this.violationTarget;
    }

    /**
     * <p>
     * The resource ID of the EC2 instance.
     * </p>
     * 
     * @param violationTarget
     *        The resource ID of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceViolation withViolationTarget(String violationTarget) {
        setViolationTarget(violationTarget);
        return this;
    }

    /**
     * <p>
     * Violation detail for network interfaces associated with the EC2 instance.
     * </p>
     * 
     * @return Violation detail for network interfaces associated with the EC2 instance.
     */

    public java.util.List<AwsEc2NetworkInterfaceViolation> getAwsEc2NetworkInterfaceViolations() {
        return awsEc2NetworkInterfaceViolations;
    }

    /**
     * <p>
     * Violation detail for network interfaces associated with the EC2 instance.
     * </p>
     * 
     * @param awsEc2NetworkInterfaceViolations
     *        Violation detail for network interfaces associated with the EC2 instance.
     */

    public void setAwsEc2NetworkInterfaceViolations(java.util.Collection<AwsEc2NetworkInterfaceViolation> awsEc2NetworkInterfaceViolations) {
        if (awsEc2NetworkInterfaceViolations == null) {
            this.awsEc2NetworkInterfaceViolations = null;
            return;
        }

        this.awsEc2NetworkInterfaceViolations = new java.util.ArrayList<AwsEc2NetworkInterfaceViolation>(awsEc2NetworkInterfaceViolations);
    }

    /**
     * <p>
     * Violation detail for network interfaces associated with the EC2 instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAwsEc2NetworkInterfaceViolations(java.util.Collection)} or
     * {@link #withAwsEc2NetworkInterfaceViolations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param awsEc2NetworkInterfaceViolations
     *        Violation detail for network interfaces associated with the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceViolation withAwsEc2NetworkInterfaceViolations(AwsEc2NetworkInterfaceViolation... awsEc2NetworkInterfaceViolations) {
        if (this.awsEc2NetworkInterfaceViolations == null) {
            setAwsEc2NetworkInterfaceViolations(new java.util.ArrayList<AwsEc2NetworkInterfaceViolation>(awsEc2NetworkInterfaceViolations.length));
        }
        for (AwsEc2NetworkInterfaceViolation ele : awsEc2NetworkInterfaceViolations) {
            this.awsEc2NetworkInterfaceViolations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Violation detail for network interfaces associated with the EC2 instance.
     * </p>
     * 
     * @param awsEc2NetworkInterfaceViolations
     *        Violation detail for network interfaces associated with the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceViolation withAwsEc2NetworkInterfaceViolations(java.util.Collection<AwsEc2NetworkInterfaceViolation> awsEc2NetworkInterfaceViolations) {
        setAwsEc2NetworkInterfaceViolations(awsEc2NetworkInterfaceViolations);
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
        if (getAwsEc2NetworkInterfaceViolations() != null)
            sb.append("AwsEc2NetworkInterfaceViolations: ").append(getAwsEc2NetworkInterfaceViolations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2InstanceViolation == false)
            return false;
        AwsEc2InstanceViolation other = (AwsEc2InstanceViolation) obj;
        if (other.getViolationTarget() == null ^ this.getViolationTarget() == null)
            return false;
        if (other.getViolationTarget() != null && other.getViolationTarget().equals(this.getViolationTarget()) == false)
            return false;
        if (other.getAwsEc2NetworkInterfaceViolations() == null ^ this.getAwsEc2NetworkInterfaceViolations() == null)
            return false;
        if (other.getAwsEc2NetworkInterfaceViolations() != null
                && other.getAwsEc2NetworkInterfaceViolations().equals(this.getAwsEc2NetworkInterfaceViolations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViolationTarget() == null) ? 0 : getViolationTarget().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2NetworkInterfaceViolations() == null) ? 0 : getAwsEc2NetworkInterfaceViolations().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2InstanceViolation clone() {
        try {
            return (AwsEc2InstanceViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.AwsEc2InstanceViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

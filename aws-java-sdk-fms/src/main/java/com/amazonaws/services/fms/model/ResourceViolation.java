/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Violation detail based on resource type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ResourceViolation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Violation details for security groups.
     * </p>
     */
    private AwsVPCSecurityGroupViolation awsVPCSecurityGroupViolation;
    /**
     * <p>
     * Violation details for network interface.
     * </p>
     */
    private AwsEc2NetworkInterfaceViolation awsEc2NetworkInterfaceViolation;
    /**
     * <p>
     * Violation details for an EC2 instance.
     * </p>
     */
    private AwsEc2InstanceViolation awsEc2InstanceViolation;

    /**
     * <p>
     * Violation details for security groups.
     * </p>
     * 
     * @param awsVPCSecurityGroupViolation
     *        Violation details for security groups.
     */

    public void setAwsVPCSecurityGroupViolation(AwsVPCSecurityGroupViolation awsVPCSecurityGroupViolation) {
        this.awsVPCSecurityGroupViolation = awsVPCSecurityGroupViolation;
    }

    /**
     * <p>
     * Violation details for security groups.
     * </p>
     * 
     * @return Violation details for security groups.
     */

    public AwsVPCSecurityGroupViolation getAwsVPCSecurityGroupViolation() {
        return this.awsVPCSecurityGroupViolation;
    }

    /**
     * <p>
     * Violation details for security groups.
     * </p>
     * 
     * @param awsVPCSecurityGroupViolation
     *        Violation details for security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withAwsVPCSecurityGroupViolation(AwsVPCSecurityGroupViolation awsVPCSecurityGroupViolation) {
        setAwsVPCSecurityGroupViolation(awsVPCSecurityGroupViolation);
        return this;
    }

    /**
     * <p>
     * Violation details for network interface.
     * </p>
     * 
     * @param awsEc2NetworkInterfaceViolation
     *        Violation details for network interface.
     */

    public void setAwsEc2NetworkInterfaceViolation(AwsEc2NetworkInterfaceViolation awsEc2NetworkInterfaceViolation) {
        this.awsEc2NetworkInterfaceViolation = awsEc2NetworkInterfaceViolation;
    }

    /**
     * <p>
     * Violation details for network interface.
     * </p>
     * 
     * @return Violation details for network interface.
     */

    public AwsEc2NetworkInterfaceViolation getAwsEc2NetworkInterfaceViolation() {
        return this.awsEc2NetworkInterfaceViolation;
    }

    /**
     * <p>
     * Violation details for network interface.
     * </p>
     * 
     * @param awsEc2NetworkInterfaceViolation
     *        Violation details for network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withAwsEc2NetworkInterfaceViolation(AwsEc2NetworkInterfaceViolation awsEc2NetworkInterfaceViolation) {
        setAwsEc2NetworkInterfaceViolation(awsEc2NetworkInterfaceViolation);
        return this;
    }

    /**
     * <p>
     * Violation details for an EC2 instance.
     * </p>
     * 
     * @param awsEc2InstanceViolation
     *        Violation details for an EC2 instance.
     */

    public void setAwsEc2InstanceViolation(AwsEc2InstanceViolation awsEc2InstanceViolation) {
        this.awsEc2InstanceViolation = awsEc2InstanceViolation;
    }

    /**
     * <p>
     * Violation details for an EC2 instance.
     * </p>
     * 
     * @return Violation details for an EC2 instance.
     */

    public AwsEc2InstanceViolation getAwsEc2InstanceViolation() {
        return this.awsEc2InstanceViolation;
    }

    /**
     * <p>
     * Violation details for an EC2 instance.
     * </p>
     * 
     * @param awsEc2InstanceViolation
     *        Violation details for an EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withAwsEc2InstanceViolation(AwsEc2InstanceViolation awsEc2InstanceViolation) {
        setAwsEc2InstanceViolation(awsEc2InstanceViolation);
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
        if (getAwsVPCSecurityGroupViolation() != null)
            sb.append("AwsVPCSecurityGroupViolation: ").append(getAwsVPCSecurityGroupViolation()).append(",");
        if (getAwsEc2NetworkInterfaceViolation() != null)
            sb.append("AwsEc2NetworkInterfaceViolation: ").append(getAwsEc2NetworkInterfaceViolation()).append(",");
        if (getAwsEc2InstanceViolation() != null)
            sb.append("AwsEc2InstanceViolation: ").append(getAwsEc2InstanceViolation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceViolation == false)
            return false;
        ResourceViolation other = (ResourceViolation) obj;
        if (other.getAwsVPCSecurityGroupViolation() == null ^ this.getAwsVPCSecurityGroupViolation() == null)
            return false;
        if (other.getAwsVPCSecurityGroupViolation() != null && other.getAwsVPCSecurityGroupViolation().equals(this.getAwsVPCSecurityGroupViolation()) == false)
            return false;
        if (other.getAwsEc2NetworkInterfaceViolation() == null ^ this.getAwsEc2NetworkInterfaceViolation() == null)
            return false;
        if (other.getAwsEc2NetworkInterfaceViolation() != null
                && other.getAwsEc2NetworkInterfaceViolation().equals(this.getAwsEc2NetworkInterfaceViolation()) == false)
            return false;
        if (other.getAwsEc2InstanceViolation() == null ^ this.getAwsEc2InstanceViolation() == null)
            return false;
        if (other.getAwsEc2InstanceViolation() != null && other.getAwsEc2InstanceViolation().equals(this.getAwsEc2InstanceViolation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsVPCSecurityGroupViolation() == null) ? 0 : getAwsVPCSecurityGroupViolation().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2NetworkInterfaceViolation() == null) ? 0 : getAwsEc2NetworkInterfaceViolation().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2InstanceViolation() == null) ? 0 : getAwsEc2InstanceViolation().hashCode());
        return hashCode;
    }

    @Override
    public ResourceViolation clone() {
        try {
            return (ResourceViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.ResourceViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

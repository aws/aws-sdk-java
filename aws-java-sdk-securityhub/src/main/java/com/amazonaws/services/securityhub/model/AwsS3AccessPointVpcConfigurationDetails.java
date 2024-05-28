/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The virtual private cloud (VPC) configuration for an Amazon S3 access point.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3AccessPointVpcConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3AccessPointVpcConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If this field is specified, this access point will only allow connections from the specified VPC ID.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * If this field is specified, this access point will only allow connections from the specified VPC ID.
     * </p>
     * 
     * @param vpcId
     *        If this field is specified, this access point will only allow connections from the specified VPC ID.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * If this field is specified, this access point will only allow connections from the specified VPC ID.
     * </p>
     * 
     * @return If this field is specified, this access point will only allow connections from the specified VPC ID.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * If this field is specified, this access point will only allow connections from the specified VPC ID.
     * </p>
     * 
     * @param vpcId
     *        If this field is specified, this access point will only allow connections from the specified VPC ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3AccessPointVpcConfigurationDetails withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3AccessPointVpcConfigurationDetails == false)
            return false;
        AwsS3AccessPointVpcConfigurationDetails other = (AwsS3AccessPointVpcConfigurationDetails) obj;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3AccessPointVpcConfigurationDetails clone() {
        try {
            return (AwsS3AccessPointVpcConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3AccessPointVpcConfigurationDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * For tasks that use the <code>awsvpc</code> networking mode, the VPC subnet and security group configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsServiceNetworkConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsServiceNetworkConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The VPC subnet and security group configuration.
     * </p>
     */
    private AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails awsVpcConfiguration;

    /**
     * <p>
     * The VPC subnet and security group configuration.
     * </p>
     * 
     * @param awsVpcConfiguration
     *        The VPC subnet and security group configuration.
     */

    public void setAwsVpcConfiguration(AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails awsVpcConfiguration) {
        this.awsVpcConfiguration = awsVpcConfiguration;
    }

    /**
     * <p>
     * The VPC subnet and security group configuration.
     * </p>
     * 
     * @return The VPC subnet and security group configuration.
     */

    public AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails getAwsVpcConfiguration() {
        return this.awsVpcConfiguration;
    }

    /**
     * <p>
     * The VPC subnet and security group configuration.
     * </p>
     * 
     * @param awsVpcConfiguration
     *        The VPC subnet and security group configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceNetworkConfigurationDetails withAwsVpcConfiguration(AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails awsVpcConfiguration) {
        setAwsVpcConfiguration(awsVpcConfiguration);
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
        if (getAwsVpcConfiguration() != null)
            sb.append("AwsVpcConfiguration: ").append(getAwsVpcConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsServiceNetworkConfigurationDetails == false)
            return false;
        AwsEcsServiceNetworkConfigurationDetails other = (AwsEcsServiceNetworkConfigurationDetails) obj;
        if (other.getAwsVpcConfiguration() == null ^ this.getAwsVpcConfiguration() == null)
            return false;
        if (other.getAwsVpcConfiguration() != null && other.getAwsVpcConfiguration().equals(this.getAwsVpcConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsVpcConfiguration() == null) ? 0 : getAwsVpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsServiceNetworkConfigurationDetails clone() {
        try {
            return (AwsEcsServiceNetworkConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsServiceNetworkConfigurationDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

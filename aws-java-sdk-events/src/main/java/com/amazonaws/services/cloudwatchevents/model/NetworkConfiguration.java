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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure specifies the network configuration for an ECS task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/NetworkConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Use this structure to specify the VPC subnets and security groups for the task, and whether a public IP address
     * is to be used. This structure is relevant only for ECS tasks that use the <code>awsvpc</code> network mode.
     * </p>
     */
    private AwsVpcConfiguration awsvpcConfiguration;

    /**
     * <p>
     * Use this structure to specify the VPC subnets and security groups for the task, and whether a public IP address
     * is to be used. This structure is relevant only for ECS tasks that use the <code>awsvpc</code> network mode.
     * </p>
     * 
     * @param awsvpcConfiguration
     *        Use this structure to specify the VPC subnets and security groups for the task, and whether a public IP
     *        address is to be used. This structure is relevant only for ECS tasks that use the <code>awsvpc</code>
     *        network mode.
     */

    public void setAwsvpcConfiguration(AwsVpcConfiguration awsvpcConfiguration) {
        this.awsvpcConfiguration = awsvpcConfiguration;
    }

    /**
     * <p>
     * Use this structure to specify the VPC subnets and security groups for the task, and whether a public IP address
     * is to be used. This structure is relevant only for ECS tasks that use the <code>awsvpc</code> network mode.
     * </p>
     * 
     * @return Use this structure to specify the VPC subnets and security groups for the task, and whether a public IP
     *         address is to be used. This structure is relevant only for ECS tasks that use the <code>awsvpc</code>
     *         network mode.
     */

    public AwsVpcConfiguration getAwsvpcConfiguration() {
        return this.awsvpcConfiguration;
    }

    /**
     * <p>
     * Use this structure to specify the VPC subnets and security groups for the task, and whether a public IP address
     * is to be used. This structure is relevant only for ECS tasks that use the <code>awsvpc</code> network mode.
     * </p>
     * 
     * @param awsvpcConfiguration
     *        Use this structure to specify the VPC subnets and security groups for the task, and whether a public IP
     *        address is to be used. This structure is relevant only for ECS tasks that use the <code>awsvpc</code>
     *        network mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConfiguration withAwsvpcConfiguration(AwsVpcConfiguration awsvpcConfiguration) {
        setAwsvpcConfiguration(awsvpcConfiguration);
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
        if (getAwsvpcConfiguration() != null)
            sb.append("AwsvpcConfiguration: ").append(getAwsvpcConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkConfiguration == false)
            return false;
        NetworkConfiguration other = (NetworkConfiguration) obj;
        if (other.getAwsvpcConfiguration() == null ^ this.getAwsvpcConfiguration() == null)
            return false;
        if (other.getAwsvpcConfiguration() != null && other.getAwsvpcConfiguration().equals(this.getAwsvpcConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsvpcConfiguration() == null) ? 0 : getAwsvpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public NetworkConfiguration clone() {
        try {
            return (NetworkConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.NetworkConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/TargetDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the target. If the target type of the target group is <code>instance</code>, specify an instance ID. If
     * the target type is <code>ip</code>, specify an IP address. If the target type is <code>lambda</code>, specify the
     * ARN of the Lambda function.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The port on which the target is listening.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * An Availability Zone or <code>all</code>. This determines whether the target receives traffic from the load
     * balancer nodes in the specified Availability Zone or from all enabled Availability Zones for the load balancer.
     * </p>
     * <p>
     * This parameter is not supported if the target type of the target group is <code>instance</code>.
     * </p>
     * <p>
     * If the target type is <code>ip</code> and the IP address is in a subnet of the VPC for the target group, the
     * Availability Zone is automatically detected and this parameter is optional. If the IP address is outside the VPC,
     * this parameter is required.
     * </p>
     * <p>
     * With an Application Load Balancer, if the target type is <code>ip</code> and the IP address is outside the VPC
     * for the target group, the only supported value is <code>all</code>.
     * </p>
     * <p>
     * If the target type is <code>lambda</code>, this parameter is optional and the only supported value is
     * <code>all</code>.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The ID of the target. If the target type of the target group is <code>instance</code>, specify an instance ID. If
     * the target type is <code>ip</code>, specify an IP address. If the target type is <code>lambda</code>, specify the
     * ARN of the Lambda function.
     * </p>
     * 
     * @param id
     *        The ID of the target. If the target type of the target group is <code>instance</code>, specify an instance
     *        ID. If the target type is <code>ip</code>, specify an IP address. If the target type is
     *        <code>lambda</code>, specify the ARN of the Lambda function.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the target. If the target type of the target group is <code>instance</code>, specify an instance ID. If
     * the target type is <code>ip</code>, specify an IP address. If the target type is <code>lambda</code>, specify the
     * ARN of the Lambda function.
     * </p>
     * 
     * @return The ID of the target. If the target type of the target group is <code>instance</code>, specify an
     *         instance ID. If the target type is <code>ip</code>, specify an IP address. If the target type is
     *         <code>lambda</code>, specify the ARN of the Lambda function.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the target. If the target type of the target group is <code>instance</code>, specify an instance ID. If
     * the target type is <code>ip</code>, specify an IP address. If the target type is <code>lambda</code>, specify the
     * ARN of the Lambda function.
     * </p>
     * 
     * @param id
     *        The ID of the target. If the target type of the target group is <code>instance</code>, specify an instance
     *        ID. If the target type is <code>ip</code>, specify an IP address. If the target type is
     *        <code>lambda</code>, specify the ARN of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetDescription withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The port on which the target is listening.
     * </p>
     * 
     * @param port
     *        The port on which the target is listening.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port on which the target is listening.
     * </p>
     * 
     * @return The port on which the target is listening.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port on which the target is listening.
     * </p>
     * 
     * @param port
     *        The port on which the target is listening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetDescription withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * An Availability Zone or <code>all</code>. This determines whether the target receives traffic from the load
     * balancer nodes in the specified Availability Zone or from all enabled Availability Zones for the load balancer.
     * </p>
     * <p>
     * This parameter is not supported if the target type of the target group is <code>instance</code>.
     * </p>
     * <p>
     * If the target type is <code>ip</code> and the IP address is in a subnet of the VPC for the target group, the
     * Availability Zone is automatically detected and this parameter is optional. If the IP address is outside the VPC,
     * this parameter is required.
     * </p>
     * <p>
     * With an Application Load Balancer, if the target type is <code>ip</code> and the IP address is outside the VPC
     * for the target group, the only supported value is <code>all</code>.
     * </p>
     * <p>
     * If the target type is <code>lambda</code>, this parameter is optional and the only supported value is
     * <code>all</code>.
     * </p>
     * 
     * @param availabilityZone
     *        An Availability Zone or <code>all</code>. This determines whether the target receives traffic from the
     *        load balancer nodes in the specified Availability Zone or from all enabled Availability Zones for the load
     *        balancer.</p>
     *        <p>
     *        This parameter is not supported if the target type of the target group is <code>instance</code>.
     *        </p>
     *        <p>
     *        If the target type is <code>ip</code> and the IP address is in a subnet of the VPC for the target group,
     *        the Availability Zone is automatically detected and this parameter is optional. If the IP address is
     *        outside the VPC, this parameter is required.
     *        </p>
     *        <p>
     *        With an Application Load Balancer, if the target type is <code>ip</code> and the IP address is outside the
     *        VPC for the target group, the only supported value is <code>all</code>.
     *        </p>
     *        <p>
     *        If the target type is <code>lambda</code>, this parameter is optional and the only supported value is
     *        <code>all</code>.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * An Availability Zone or <code>all</code>. This determines whether the target receives traffic from the load
     * balancer nodes in the specified Availability Zone or from all enabled Availability Zones for the load balancer.
     * </p>
     * <p>
     * This parameter is not supported if the target type of the target group is <code>instance</code>.
     * </p>
     * <p>
     * If the target type is <code>ip</code> and the IP address is in a subnet of the VPC for the target group, the
     * Availability Zone is automatically detected and this parameter is optional. If the IP address is outside the VPC,
     * this parameter is required.
     * </p>
     * <p>
     * With an Application Load Balancer, if the target type is <code>ip</code> and the IP address is outside the VPC
     * for the target group, the only supported value is <code>all</code>.
     * </p>
     * <p>
     * If the target type is <code>lambda</code>, this parameter is optional and the only supported value is
     * <code>all</code>.
     * </p>
     * 
     * @return An Availability Zone or <code>all</code>. This determines whether the target receives traffic from the
     *         load balancer nodes in the specified Availability Zone or from all enabled Availability Zones for the
     *         load balancer.</p>
     *         <p>
     *         This parameter is not supported if the target type of the target group is <code>instance</code>.
     *         </p>
     *         <p>
     *         If the target type is <code>ip</code> and the IP address is in a subnet of the VPC for the target group,
     *         the Availability Zone is automatically detected and this parameter is optional. If the IP address is
     *         outside the VPC, this parameter is required.
     *         </p>
     *         <p>
     *         With an Application Load Balancer, if the target type is <code>ip</code> and the IP address is outside
     *         the VPC for the target group, the only supported value is <code>all</code>.
     *         </p>
     *         <p>
     *         If the target type is <code>lambda</code>, this parameter is optional and the only supported value is
     *         <code>all</code>.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * An Availability Zone or <code>all</code>. This determines whether the target receives traffic from the load
     * balancer nodes in the specified Availability Zone or from all enabled Availability Zones for the load balancer.
     * </p>
     * <p>
     * This parameter is not supported if the target type of the target group is <code>instance</code>.
     * </p>
     * <p>
     * If the target type is <code>ip</code> and the IP address is in a subnet of the VPC for the target group, the
     * Availability Zone is automatically detected and this parameter is optional. If the IP address is outside the VPC,
     * this parameter is required.
     * </p>
     * <p>
     * With an Application Load Balancer, if the target type is <code>ip</code> and the IP address is outside the VPC
     * for the target group, the only supported value is <code>all</code>.
     * </p>
     * <p>
     * If the target type is <code>lambda</code>, this parameter is optional and the only supported value is
     * <code>all</code>.
     * </p>
     * 
     * @param availabilityZone
     *        An Availability Zone or <code>all</code>. This determines whether the target receives traffic from the
     *        load balancer nodes in the specified Availability Zone or from all enabled Availability Zones for the load
     *        balancer.</p>
     *        <p>
     *        This parameter is not supported if the target type of the target group is <code>instance</code>.
     *        </p>
     *        <p>
     *        If the target type is <code>ip</code> and the IP address is in a subnet of the VPC for the target group,
     *        the Availability Zone is automatically detected and this parameter is optional. If the IP address is
     *        outside the VPC, this parameter is required.
     *        </p>
     *        <p>
     *        With an Application Load Balancer, if the target type is <code>ip</code> and the IP address is outside the
     *        VPC for the target group, the only supported value is <code>all</code>.
     *        </p>
     *        <p>
     *        If the target type is <code>lambda</code>, this parameter is optional and the only supported value is
     *        <code>all</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetDescription withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetDescription == false)
            return false;
        TargetDescription other = (TargetDescription) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        return hashCode;
    }

    @Override
    public TargetDescription clone() {
        try {
            return (TargetDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

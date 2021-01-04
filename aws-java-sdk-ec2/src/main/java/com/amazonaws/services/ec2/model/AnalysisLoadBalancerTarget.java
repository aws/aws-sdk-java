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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a load balancer target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AnalysisLoadBalancerTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisLoadBalancerTarget implements Serializable, Cloneable {

    /**
     * <p>
     * The IP address.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The Availability Zone.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Information about the instance.
     * </p>
     */
    private AnalysisComponent instance;
    /**
     * <p>
     * The port on which the target is listening.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @param address
     *        The IP address.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @return The IP address.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @param address
     *        The IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisLoadBalancerTarget withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * 
     * @return The Availability Zone.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisLoadBalancerTarget withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * Information about the instance.
     * </p>
     * 
     * @param instance
     *        Information about the instance.
     */

    public void setInstance(AnalysisComponent instance) {
        this.instance = instance;
    }

    /**
     * <p>
     * Information about the instance.
     * </p>
     * 
     * @return Information about the instance.
     */

    public AnalysisComponent getInstance() {
        return this.instance;
    }

    /**
     * <p>
     * Information about the instance.
     * </p>
     * 
     * @param instance
     *        Information about the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisLoadBalancerTarget withInstance(AnalysisComponent instance) {
        setInstance(instance);
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

    public AnalysisLoadBalancerTarget withPort(Integer port) {
        setPort(port);
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
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getInstance() != null)
            sb.append("Instance: ").append(getInstance()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisLoadBalancerTarget == false)
            return false;
        AnalysisLoadBalancerTarget other = (AnalysisLoadBalancerTarget) obj;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getInstance() == null ^ this.getInstance() == null)
            return false;
        if (other.getInstance() != null && other.getInstance().equals(this.getInstance()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getInstance() == null) ? 0 : getInstance().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisLoadBalancerTarget clone() {
        try {
            return (AnalysisLoadBalancerTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

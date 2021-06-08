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
 * Describes a load balancer listener.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AnalysisLoadBalancerListener" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisLoadBalancerListener implements Serializable, Cloneable {

    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     */
    private Integer loadBalancerPort;
    /**
     * <p>
     * [Classic Load Balancers] The back-end port for the listener.
     * </p>
     */
    private Integer instancePort;

    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     * 
     * @param loadBalancerPort
     *        The port on which the load balancer is listening.
     */

    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }

    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     * 
     * @return The port on which the load balancer is listening.
     */

    public Integer getLoadBalancerPort() {
        return this.loadBalancerPort;
    }

    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     * 
     * @param loadBalancerPort
     *        The port on which the load balancer is listening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisLoadBalancerListener withLoadBalancerPort(Integer loadBalancerPort) {
        setLoadBalancerPort(loadBalancerPort);
        return this;
    }

    /**
     * <p>
     * [Classic Load Balancers] The back-end port for the listener.
     * </p>
     * 
     * @param instancePort
     *        [Classic Load Balancers] The back-end port for the listener.
     */

    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }

    /**
     * <p>
     * [Classic Load Balancers] The back-end port for the listener.
     * </p>
     * 
     * @return [Classic Load Balancers] The back-end port for the listener.
     */

    public Integer getInstancePort() {
        return this.instancePort;
    }

    /**
     * <p>
     * [Classic Load Balancers] The back-end port for the listener.
     * </p>
     * 
     * @param instancePort
     *        [Classic Load Balancers] The back-end port for the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisLoadBalancerListener withInstancePort(Integer instancePort) {
        setInstancePort(instancePort);
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
        if (getLoadBalancerPort() != null)
            sb.append("LoadBalancerPort: ").append(getLoadBalancerPort()).append(",");
        if (getInstancePort() != null)
            sb.append("InstancePort: ").append(getInstancePort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisLoadBalancerListener == false)
            return false;
        AnalysisLoadBalancerListener other = (AnalysisLoadBalancerListener) obj;
        if (other.getLoadBalancerPort() == null ^ this.getLoadBalancerPort() == null)
            return false;
        if (other.getLoadBalancerPort() != null && other.getLoadBalancerPort().equals(this.getLoadBalancerPort()) == false)
            return false;
        if (other.getInstancePort() == null ^ this.getInstancePort() == null)
            return false;
        if (other.getInstancePort() != null && other.getInstancePort().equals(this.getInstancePort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerPort() == null) ? 0 : getLoadBalancerPort().hashCode());
        hashCode = prime * hashCode + ((getInstancePort() == null) ? 0 : getInstancePort().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisLoadBalancerListener clone() {
        try {
            return (AnalysisLoadBalancerListener) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

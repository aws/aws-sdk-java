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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for DeleteLoadBalancerListeners.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DeleteLoadBalancerListeners"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteLoadBalancerListenersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The client port numbers of the listeners.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Integer> loadBalancerPorts;

    /**
     * Default constructor for DeleteLoadBalancerListenersRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DeleteLoadBalancerListenersRequest() {
    }

    /**
     * Constructs a new DeleteLoadBalancerListenersRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     * @param loadBalancerPorts
     *        The client port numbers of the listeners.
     */
    public DeleteLoadBalancerListenersRequest(String loadBalancerName, java.util.List<Integer> loadBalancerPorts) {
        setLoadBalancerName(loadBalancerName);
        setLoadBalancerPorts(loadBalancerPorts);
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @return The name of the load balancer.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLoadBalancerListenersRequest withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The client port numbers of the listeners.
     * </p>
     * 
     * @return The client port numbers of the listeners.
     */

    public java.util.List<Integer> getLoadBalancerPorts() {
        if (loadBalancerPorts == null) {
            loadBalancerPorts = new com.amazonaws.internal.SdkInternalList<Integer>();
        }
        return loadBalancerPorts;
    }

    /**
     * <p>
     * The client port numbers of the listeners.
     * </p>
     * 
     * @param loadBalancerPorts
     *        The client port numbers of the listeners.
     */

    public void setLoadBalancerPorts(java.util.Collection<Integer> loadBalancerPorts) {
        if (loadBalancerPorts == null) {
            this.loadBalancerPorts = null;
            return;
        }

        this.loadBalancerPorts = new com.amazonaws.internal.SdkInternalList<Integer>(loadBalancerPorts);
    }

    /**
     * <p>
     * The client port numbers of the listeners.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancerPorts(java.util.Collection)} or {@link #withLoadBalancerPorts(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param loadBalancerPorts
     *        The client port numbers of the listeners.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLoadBalancerListenersRequest withLoadBalancerPorts(Integer... loadBalancerPorts) {
        if (this.loadBalancerPorts == null) {
            setLoadBalancerPorts(new com.amazonaws.internal.SdkInternalList<Integer>(loadBalancerPorts.length));
        }
        for (Integer ele : loadBalancerPorts) {
            this.loadBalancerPorts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The client port numbers of the listeners.
     * </p>
     * 
     * @param loadBalancerPorts
     *        The client port numbers of the listeners.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLoadBalancerListenersRequest withLoadBalancerPorts(java.util.Collection<Integer> loadBalancerPorts) {
        setLoadBalancerPorts(loadBalancerPorts);
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
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: ").append(getLoadBalancerName()).append(",");
        if (getLoadBalancerPorts() != null)
            sb.append("LoadBalancerPorts: ").append(getLoadBalancerPorts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLoadBalancerListenersRequest == false)
            return false;
        DeleteLoadBalancerListenersRequest other = (DeleteLoadBalancerListenersRequest) obj;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getLoadBalancerPorts() == null ^ this.getLoadBalancerPorts() == null)
            return false;
        if (other.getLoadBalancerPorts() != null && other.getLoadBalancerPorts().equals(this.getLoadBalancerPorts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerPorts() == null) ? 0 : getLoadBalancerPorts().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLoadBalancerListenersRequest clone() {
        return (DeleteLoadBalancerListenersRequest) super.clone();
    }

}

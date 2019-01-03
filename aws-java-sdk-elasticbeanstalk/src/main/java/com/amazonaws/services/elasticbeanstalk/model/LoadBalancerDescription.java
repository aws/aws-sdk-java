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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the details of a LoadBalancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/LoadBalancerDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the LoadBalancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The domain name of the LoadBalancer.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * A list of Listeners used by the LoadBalancer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Listener> listeners;

    /**
     * <p>
     * The name of the LoadBalancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the LoadBalancer.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the LoadBalancer.
     * </p>
     * 
     * @return The name of the LoadBalancer.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The name of the LoadBalancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the LoadBalancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The domain name of the LoadBalancer.
     * </p>
     * 
     * @param domain
     *        The domain name of the LoadBalancer.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain name of the LoadBalancer.
     * </p>
     * 
     * @return The domain name of the LoadBalancer.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain name of the LoadBalancer.
     * </p>
     * 
     * @param domain
     *        The domain name of the LoadBalancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * A list of Listeners used by the LoadBalancer.
     * </p>
     * 
     * @return A list of Listeners used by the LoadBalancer.
     */

    public java.util.List<Listener> getListeners() {
        if (listeners == null) {
            listeners = new com.amazonaws.internal.SdkInternalList<Listener>();
        }
        return listeners;
    }

    /**
     * <p>
     * A list of Listeners used by the LoadBalancer.
     * </p>
     * 
     * @param listeners
     *        A list of Listeners used by the LoadBalancer.
     */

    public void setListeners(java.util.Collection<Listener> listeners) {
        if (listeners == null) {
            this.listeners = null;
            return;
        }

        this.listeners = new com.amazonaws.internal.SdkInternalList<Listener>(listeners);
    }

    /**
     * <p>
     * A list of Listeners used by the LoadBalancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListeners(java.util.Collection)} or {@link #withListeners(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param listeners
     *        A list of Listeners used by the LoadBalancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withListeners(Listener... listeners) {
        if (this.listeners == null) {
            setListeners(new com.amazonaws.internal.SdkInternalList<Listener>(listeners.length));
        }
        for (Listener ele : listeners) {
            this.listeners.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Listeners used by the LoadBalancer.
     * </p>
     * 
     * @param listeners
     *        A list of Listeners used by the LoadBalancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withListeners(java.util.Collection<Listener> listeners) {
        setListeners(listeners);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getListeners() != null)
            sb.append("Listeners: ").append(getListeners());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerDescription == false)
            return false;
        LoadBalancerDescription other = (LoadBalancerDescription) obj;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getListeners() == null ^ this.getListeners() == null)
            return false;
        if (other.getListeners() != null && other.getListeners().equals(this.getListeners()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getListeners() == null) ? 0 : getListeners().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancerDescription clone() {
        try {
            return (LoadBalancerDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

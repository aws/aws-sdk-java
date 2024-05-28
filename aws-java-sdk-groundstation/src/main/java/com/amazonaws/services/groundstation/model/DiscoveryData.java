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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Data for agent discovery.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DiscoveryData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiscoveryData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of capabilities to associate with agent.
     * </p>
     */
    private java.util.List<String> capabilityArns;
    /**
     * <p>
     * List of private IP addresses to associate with agent.
     * </p>
     */
    private java.util.List<String> privateIpAddresses;
    /**
     * <p>
     * List of public IP addresses to associate with agent.
     * </p>
     */
    private java.util.List<String> publicIpAddresses;

    /**
     * <p>
     * List of capabilities to associate with agent.
     * </p>
     * 
     * @return List of capabilities to associate with agent.
     */

    public java.util.List<String> getCapabilityArns() {
        return capabilityArns;
    }

    /**
     * <p>
     * List of capabilities to associate with agent.
     * </p>
     * 
     * @param capabilityArns
     *        List of capabilities to associate with agent.
     */

    public void setCapabilityArns(java.util.Collection<String> capabilityArns) {
        if (capabilityArns == null) {
            this.capabilityArns = null;
            return;
        }

        this.capabilityArns = new java.util.ArrayList<String>(capabilityArns);
    }

    /**
     * <p>
     * List of capabilities to associate with agent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilityArns(java.util.Collection)} or {@link #withCapabilityArns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param capabilityArns
     *        List of capabilities to associate with agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoveryData withCapabilityArns(String... capabilityArns) {
        if (this.capabilityArns == null) {
            setCapabilityArns(new java.util.ArrayList<String>(capabilityArns.length));
        }
        for (String ele : capabilityArns) {
            this.capabilityArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of capabilities to associate with agent.
     * </p>
     * 
     * @param capabilityArns
     *        List of capabilities to associate with agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoveryData withCapabilityArns(java.util.Collection<String> capabilityArns) {
        setCapabilityArns(capabilityArns);
        return this;
    }

    /**
     * <p>
     * List of private IP addresses to associate with agent.
     * </p>
     * 
     * @return List of private IP addresses to associate with agent.
     */

    public java.util.List<String> getPrivateIpAddresses() {
        return privateIpAddresses;
    }

    /**
     * <p>
     * List of private IP addresses to associate with agent.
     * </p>
     * 
     * @param privateIpAddresses
     *        List of private IP addresses to associate with agent.
     */

    public void setPrivateIpAddresses(java.util.Collection<String> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }

        this.privateIpAddresses = new java.util.ArrayList<String>(privateIpAddresses);
    }

    /**
     * <p>
     * List of private IP addresses to associate with agent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrivateIpAddresses(java.util.Collection)} or {@link #withPrivateIpAddresses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param privateIpAddresses
     *        List of private IP addresses to associate with agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoveryData withPrivateIpAddresses(String... privateIpAddresses) {
        if (this.privateIpAddresses == null) {
            setPrivateIpAddresses(new java.util.ArrayList<String>(privateIpAddresses.length));
        }
        for (String ele : privateIpAddresses) {
            this.privateIpAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of private IP addresses to associate with agent.
     * </p>
     * 
     * @param privateIpAddresses
     *        List of private IP addresses to associate with agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoveryData withPrivateIpAddresses(java.util.Collection<String> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * <p>
     * List of public IP addresses to associate with agent.
     * </p>
     * 
     * @return List of public IP addresses to associate with agent.
     */

    public java.util.List<String> getPublicIpAddresses() {
        return publicIpAddresses;
    }

    /**
     * <p>
     * List of public IP addresses to associate with agent.
     * </p>
     * 
     * @param publicIpAddresses
     *        List of public IP addresses to associate with agent.
     */

    public void setPublicIpAddresses(java.util.Collection<String> publicIpAddresses) {
        if (publicIpAddresses == null) {
            this.publicIpAddresses = null;
            return;
        }

        this.publicIpAddresses = new java.util.ArrayList<String>(publicIpAddresses);
    }

    /**
     * <p>
     * List of public IP addresses to associate with agent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPublicIpAddresses(java.util.Collection)} or {@link #withPublicIpAddresses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param publicIpAddresses
     *        List of public IP addresses to associate with agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoveryData withPublicIpAddresses(String... publicIpAddresses) {
        if (this.publicIpAddresses == null) {
            setPublicIpAddresses(new java.util.ArrayList<String>(publicIpAddresses.length));
        }
        for (String ele : publicIpAddresses) {
            this.publicIpAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of public IP addresses to associate with agent.
     * </p>
     * 
     * @param publicIpAddresses
     *        List of public IP addresses to associate with agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoveryData withPublicIpAddresses(java.util.Collection<String> publicIpAddresses) {
        setPublicIpAddresses(publicIpAddresses);
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
        if (getCapabilityArns() != null)
            sb.append("CapabilityArns: ").append(getCapabilityArns()).append(",");
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: ").append(getPrivateIpAddresses()).append(",");
        if (getPublicIpAddresses() != null)
            sb.append("PublicIpAddresses: ").append(getPublicIpAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscoveryData == false)
            return false;
        DiscoveryData other = (DiscoveryData) obj;
        if (other.getCapabilityArns() == null ^ this.getCapabilityArns() == null)
            return false;
        if (other.getCapabilityArns() != null && other.getCapabilityArns().equals(this.getCapabilityArns()) == false)
            return false;
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null)
            return false;
        if (other.getPrivateIpAddresses() != null && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false)
            return false;
        if (other.getPublicIpAddresses() == null ^ this.getPublicIpAddresses() == null)
            return false;
        if (other.getPublicIpAddresses() != null && other.getPublicIpAddresses().equals(this.getPublicIpAddresses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapabilityArns() == null) ? 0 : getCapabilityArns().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode());
        hashCode = prime * hashCode + ((getPublicIpAddresses() == null) ? 0 : getPublicIpAddresses().hashCode());
        return hashCode;
    }

    @Override
    public DiscoveryData clone() {
        try {
            return (DiscoveryData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.DiscoveryDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

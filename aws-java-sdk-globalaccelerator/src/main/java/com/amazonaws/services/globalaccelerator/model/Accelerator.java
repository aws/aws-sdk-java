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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An accelerator is a complex type that includes one or more listeners that process inbound connections and then direct
 * traffic to one or more endpoint groups, each of which includes endpoints, such as load balancers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/Accelerator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Accelerator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accelerator.
     * </p>
     */
    private String acceleratorArn;
    /**
     * <p>
     * The name of the accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric
     * characters or hyphens (-), and must not begin or end with a hyphen.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value for the address type must be IPv4.
     * </p>
     */
    private String ipAddressType;
    /**
     * <p>
     * Indicates whether theaccelerator is enabled. The value is true or false. The default value is true.
     * </p>
     * <p>
     * If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator can be deleted.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * IP address set associated with the accelerator.
     * </p>
     */
    private java.util.List<IpSet> ipSets;
    /**
     * <p>
     * Describes the deployment status of the accelerator.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time that the accelerator was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The date and time that the accelerator was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accelerator.
     * </p>
     * 
     * @param acceleratorArn
     *        The Amazon Resource Name (ARN) of the accelerator.
     */

    public void setAcceleratorArn(String acceleratorArn) {
        this.acceleratorArn = acceleratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accelerator.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the accelerator.
     */

    public String getAcceleratorArn() {
        return this.acceleratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accelerator.
     * </p>
     * 
     * @param acceleratorArn
     *        The Amazon Resource Name (ARN) of the accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Accelerator withAcceleratorArn(String acceleratorArn) {
        setAcceleratorArn(acceleratorArn);
        return this;
    }

    /**
     * <p>
     * The name of the accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric
     * characters or hyphens (-), and must not begin or end with a hyphen.
     * </p>
     * 
     * @param name
     *        The name of the accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric
     *        characters or hyphens (-), and must not begin or end with a hyphen.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric
     * characters or hyphens (-), and must not begin or end with a hyphen.
     * </p>
     * 
     * @return The name of the accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric
     *         characters or hyphens (-), and must not begin or end with a hyphen.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric
     * characters or hyphens (-), and must not begin or end with a hyphen.
     * </p>
     * 
     * @param name
     *        The name of the accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric
     *        characters or hyphens (-), and must not begin or end with a hyphen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Accelerator withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value for the address type must be IPv4.
     * </p>
     * 
     * @param ipAddressType
     *        The value for the address type must be IPv4.
     * @see IpAddressType
     */

    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * <p>
     * The value for the address type must be IPv4.
     * </p>
     * 
     * @return The value for the address type must be IPv4.
     * @see IpAddressType
     */

    public String getIpAddressType() {
        return this.ipAddressType;
    }

    /**
     * <p>
     * The value for the address type must be IPv4.
     * </p>
     * 
     * @param ipAddressType
     *        The value for the address type must be IPv4.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public Accelerator withIpAddressType(String ipAddressType) {
        setIpAddressType(ipAddressType);
        return this;
    }

    /**
     * <p>
     * The value for the address type must be IPv4.
     * </p>
     * 
     * @param ipAddressType
     *        The value for the address type must be IPv4.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public Accelerator withIpAddressType(IpAddressType ipAddressType) {
        this.ipAddressType = ipAddressType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether theaccelerator is enabled. The value is true or false. The default value is true.
     * </p>
     * <p>
     * If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator can be deleted.
     * </p>
     * 
     * @param enabled
     *        Indicates whether theaccelerator is enabled. The value is true or false. The default value is true. </p>
     *        <p>
     *        If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator can be
     *        deleted.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether theaccelerator is enabled. The value is true or false. The default value is true.
     * </p>
     * <p>
     * If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator can be deleted.
     * </p>
     * 
     * @return Indicates whether theaccelerator is enabled. The value is true or false. The default value is true. </p>
     *         <p>
     *         If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator can be
     *         deleted.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether theaccelerator is enabled. The value is true or false. The default value is true.
     * </p>
     * <p>
     * If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator can be deleted.
     * </p>
     * 
     * @param enabled
     *        Indicates whether theaccelerator is enabled. The value is true or false. The default value is true. </p>
     *        <p>
     *        If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator can be
     *        deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Accelerator withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether theaccelerator is enabled. The value is true or false. The default value is true.
     * </p>
     * <p>
     * If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator can be deleted.
     * </p>
     * 
     * @return Indicates whether theaccelerator is enabled. The value is true or false. The default value is true. </p>
     *         <p>
     *         If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator can be
     *         deleted.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * IP address set associated with the accelerator.
     * </p>
     * 
     * @return IP address set associated with the accelerator.
     */

    public java.util.List<IpSet> getIpSets() {
        return ipSets;
    }

    /**
     * <p>
     * IP address set associated with the accelerator.
     * </p>
     * 
     * @param ipSets
     *        IP address set associated with the accelerator.
     */

    public void setIpSets(java.util.Collection<IpSet> ipSets) {
        if (ipSets == null) {
            this.ipSets = null;
            return;
        }

        this.ipSets = new java.util.ArrayList<IpSet>(ipSets);
    }

    /**
     * <p>
     * IP address set associated with the accelerator.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpSets(java.util.Collection)} or {@link #withIpSets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ipSets
     *        IP address set associated with the accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Accelerator withIpSets(IpSet... ipSets) {
        if (this.ipSets == null) {
            setIpSets(new java.util.ArrayList<IpSet>(ipSets.length));
        }
        for (IpSet ele : ipSets) {
            this.ipSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * IP address set associated with the accelerator.
     * </p>
     * 
     * @param ipSets
     *        IP address set associated with the accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Accelerator withIpSets(java.util.Collection<IpSet> ipSets) {
        setIpSets(ipSets);
        return this;
    }

    /**
     * <p>
     * Describes the deployment status of the accelerator.
     * </p>
     * 
     * @param status
     *        Describes the deployment status of the accelerator.
     * @see AcceleratorStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes the deployment status of the accelerator.
     * </p>
     * 
     * @return Describes the deployment status of the accelerator.
     * @see AcceleratorStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Describes the deployment status of the accelerator.
     * </p>
     * 
     * @param status
     *        Describes the deployment status of the accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorStatus
     */

    public Accelerator withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Describes the deployment status of the accelerator.
     * </p>
     * 
     * @param status
     *        Describes the deployment status of the accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorStatus
     */

    public Accelerator withStatus(AcceleratorStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the accelerator was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the accelerator was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time that the accelerator was created.
     * </p>
     * 
     * @return The date and time that the accelerator was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time that the accelerator was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the accelerator was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Accelerator withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the accelerator was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the accelerator was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the accelerator was last modified.
     * </p>
     * 
     * @return The date and time that the accelerator was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the accelerator was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the accelerator was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Accelerator withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getAcceleratorArn() != null)
            sb.append("AcceleratorArn: ").append(getAcceleratorArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIpAddressType() != null)
            sb.append("IpAddressType: ").append(getIpAddressType()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getIpSets() != null)
            sb.append("IpSets: ").append(getIpSets()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Accelerator == false)
            return false;
        Accelerator other = (Accelerator) obj;
        if (other.getAcceleratorArn() == null ^ this.getAcceleratorArn() == null)
            return false;
        if (other.getAcceleratorArn() != null && other.getAcceleratorArn().equals(this.getAcceleratorArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIpAddressType() == null ^ this.getIpAddressType() == null)
            return false;
        if (other.getIpAddressType() != null && other.getIpAddressType().equals(this.getIpAddressType()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getIpSets() == null ^ this.getIpSets() == null)
            return false;
        if (other.getIpSets() != null && other.getIpSets().equals(this.getIpSets()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceleratorArn() == null) ? 0 : getAcceleratorArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIpAddressType() == null) ? 0 : getIpAddressType().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getIpSets() == null) ? 0 : getIpSets().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public Accelerator clone() {
        try {
            return (Accelerator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.globalaccelerator.model.transform.AcceleratorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

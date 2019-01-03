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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the static IP.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StaticIp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StaticIp implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the static IP (e.g., <code>StaticIP-Ohio-EXAMPLE</code>).
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the static IP (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:StaticIp/9cbb4a9e-f8e3-4dfe-b57e-12345EXAMPLE</code>).
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about an instance or another
     * resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     */
    private String supportCode;
    /**
     * <p>
     * The timestamp when the static IP was created (e.g., <code>1479735304.222</code>).
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The region and Availability Zone where the static IP was created.
     * </p>
     */
    private ResourceLocation location;
    /**
     * <p>
     * The resource type (usually <code>StaticIp</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The static IP address.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The instance where the static IP is attached (e.g., <code>Amazon_Linux-1GB-Ohio-1</code>).
     * </p>
     */
    private String attachedTo;
    /**
     * <p>
     * A Boolean value indicating whether the static IP is attached.
     * </p>
     */
    private Boolean isAttached;

    /**
     * <p>
     * The name of the static IP (e.g., <code>StaticIP-Ohio-EXAMPLE</code>).
     * </p>
     * 
     * @param name
     *        The name of the static IP (e.g., <code>StaticIP-Ohio-EXAMPLE</code>).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the static IP (e.g., <code>StaticIP-Ohio-EXAMPLE</code>).
     * </p>
     * 
     * @return The name of the static IP (e.g., <code>StaticIP-Ohio-EXAMPLE</code>).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the static IP (e.g., <code>StaticIP-Ohio-EXAMPLE</code>).
     * </p>
     * 
     * @param name
     *        The name of the static IP (e.g., <code>StaticIP-Ohio-EXAMPLE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticIp withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the static IP (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:StaticIp/9cbb4a9e-f8e3-4dfe-b57e-12345EXAMPLE</code>).
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the static IP (e.g.,
     *        <code>arn:aws:lightsail:us-east-2:123456789101:StaticIp/9cbb4a9e-f8e3-4dfe-b57e-12345EXAMPLE</code>).
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the static IP (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:StaticIp/9cbb4a9e-f8e3-4dfe-b57e-12345EXAMPLE</code>).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the static IP (e.g.,
     *         <code>arn:aws:lightsail:us-east-2:123456789101:StaticIp/9cbb4a9e-f8e3-4dfe-b57e-12345EXAMPLE</code>).
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the static IP (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:StaticIp/9cbb4a9e-f8e3-4dfe-b57e-12345EXAMPLE</code>).
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the static IP (e.g.,
     *        <code>arn:aws:lightsail:us-east-2:123456789101:StaticIp/9cbb4a9e-f8e3-4dfe-b57e-12345EXAMPLE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticIp withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about an instance or another
     * resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about an instance or
     *        another resource in Lightsail. This code enables our support team to look up your Lightsail information
     *        more easily.
     */

    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about an instance or another
     * resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @return The support code. Include this code in your email to support when you have questions about an instance or
     *         another resource in Lightsail. This code enables our support team to look up your Lightsail information
     *         more easily.
     */

    public String getSupportCode() {
        return this.supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about an instance or another
     * resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about an instance or
     *        another resource in Lightsail. This code enables our support team to look up your Lightsail information
     *        more easily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticIp withSupportCode(String supportCode) {
        setSupportCode(supportCode);
        return this;
    }

    /**
     * <p>
     * The timestamp when the static IP was created (e.g., <code>1479735304.222</code>).
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the static IP was created (e.g., <code>1479735304.222</code>).
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the static IP was created (e.g., <code>1479735304.222</code>).
     * </p>
     * 
     * @return The timestamp when the static IP was created (e.g., <code>1479735304.222</code>).
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the static IP was created (e.g., <code>1479735304.222</code>).
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the static IP was created (e.g., <code>1479735304.222</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticIp withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The region and Availability Zone where the static IP was created.
     * </p>
     * 
     * @param location
     *        The region and Availability Zone where the static IP was created.
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The region and Availability Zone where the static IP was created.
     * </p>
     * 
     * @return The region and Availability Zone where the static IP was created.
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The region and Availability Zone where the static IP was created.
     * </p>
     * 
     * @param location
     *        The region and Availability Zone where the static IP was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticIp withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The resource type (usually <code>StaticIp</code>).
     * </p>
     * 
     * @param resourceType
     *        The resource type (usually <code>StaticIp</code>).
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type (usually <code>StaticIp</code>).
     * </p>
     * 
     * @return The resource type (usually <code>StaticIp</code>).
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type (usually <code>StaticIp</code>).
     * </p>
     * 
     * @param resourceType
     *        The resource type (usually <code>StaticIp</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public StaticIp withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type (usually <code>StaticIp</code>).
     * </p>
     * 
     * @param resourceType
     *        The resource type (usually <code>StaticIp</code>).
     * @see ResourceType
     */

    public void setResourceType(ResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The resource type (usually <code>StaticIp</code>).
     * </p>
     * 
     * @param resourceType
     *        The resource type (usually <code>StaticIp</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public StaticIp withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The static IP address.
     * </p>
     * 
     * @param ipAddress
     *        The static IP address.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The static IP address.
     * </p>
     * 
     * @return The static IP address.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The static IP address.
     * </p>
     * 
     * @param ipAddress
     *        The static IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticIp withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The instance where the static IP is attached (e.g., <code>Amazon_Linux-1GB-Ohio-1</code>).
     * </p>
     * 
     * @param attachedTo
     *        The instance where the static IP is attached (e.g., <code>Amazon_Linux-1GB-Ohio-1</code>).
     */

    public void setAttachedTo(String attachedTo) {
        this.attachedTo = attachedTo;
    }

    /**
     * <p>
     * The instance where the static IP is attached (e.g., <code>Amazon_Linux-1GB-Ohio-1</code>).
     * </p>
     * 
     * @return The instance where the static IP is attached (e.g., <code>Amazon_Linux-1GB-Ohio-1</code>).
     */

    public String getAttachedTo() {
        return this.attachedTo;
    }

    /**
     * <p>
     * The instance where the static IP is attached (e.g., <code>Amazon_Linux-1GB-Ohio-1</code>).
     * </p>
     * 
     * @param attachedTo
     *        The instance where the static IP is attached (e.g., <code>Amazon_Linux-1GB-Ohio-1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticIp withAttachedTo(String attachedTo) {
        setAttachedTo(attachedTo);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the static IP is attached.
     * </p>
     * 
     * @param isAttached
     *        A Boolean value indicating whether the static IP is attached.
     */

    public void setIsAttached(Boolean isAttached) {
        this.isAttached = isAttached;
    }

    /**
     * <p>
     * A Boolean value indicating whether the static IP is attached.
     * </p>
     * 
     * @return A Boolean value indicating whether the static IP is attached.
     */

    public Boolean getIsAttached() {
        return this.isAttached;
    }

    /**
     * <p>
     * A Boolean value indicating whether the static IP is attached.
     * </p>
     * 
     * @param isAttached
     *        A Boolean value indicating whether the static IP is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticIp withIsAttached(Boolean isAttached) {
        setIsAttached(isAttached);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the static IP is attached.
     * </p>
     * 
     * @return A Boolean value indicating whether the static IP is attached.
     */

    public Boolean isAttached() {
        return this.isAttached;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getSupportCode() != null)
            sb.append("SupportCode: ").append(getSupportCode()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getAttachedTo() != null)
            sb.append("AttachedTo: ").append(getAttachedTo()).append(",");
        if (getIsAttached() != null)
            sb.append("IsAttached: ").append(getIsAttached());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StaticIp == false)
            return false;
        StaticIp other = (StaticIp) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSupportCode() == null ^ this.getSupportCode() == null)
            return false;
        if (other.getSupportCode() != null && other.getSupportCode().equals(this.getSupportCode()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getAttachedTo() == null ^ this.getAttachedTo() == null)
            return false;
        if (other.getAttachedTo() != null && other.getAttachedTo().equals(this.getAttachedTo()) == false)
            return false;
        if (other.getIsAttached() == null ^ this.getIsAttached() == null)
            return false;
        if (other.getIsAttached() != null && other.getIsAttached().equals(this.getIsAttached()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getSupportCode() == null) ? 0 : getSupportCode().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getAttachedTo() == null) ? 0 : getAttachedTo().hashCode());
        hashCode = prime * hashCode + ((getIsAttached() == null) ? 0 : getIsAttached().hashCode());
        return hashCode;
    }

    @Override
    public StaticIp clone() {
        try {
            return (StaticIp) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.StaticIpMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

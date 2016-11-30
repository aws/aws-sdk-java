/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes the SSH key pair.
 * </p>
 */
public class KeyPair implements Serializable, Cloneable {

    /**
     * <p>
     * The friendly name of the SSH key pair.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key pair (e.g.,
     * <code>arn:aws:lightsail:us-east-1:123456789101:KeyPair/05859e3d-331d-48ba-9034-12345EXAMPLE</code>).
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
     * The timestamp when the key pair was created (e.g., <code>1479816991.349</code>).
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The region name and Availability Zone where the key pair was created.
     * </p>
     */
    private ResourceLocation location;
    /**
     * <p>
     * The resource type (usually <code>KeyPair</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The RSA fingerprint of the key pair.
     * </p>
     */
    private String fingerprint;

    /**
     * <p>
     * The friendly name of the SSH key pair.
     * </p>
     * 
     * @param name
     *        The friendly name of the SSH key pair.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the SSH key pair.
     * </p>
     * 
     * @return The friendly name of the SSH key pair.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the SSH key pair.
     * </p>
     * 
     * @param name
     *        The friendly name of the SSH key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyPair withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key pair (e.g.,
     * <code>arn:aws:lightsail:us-east-1:123456789101:KeyPair/05859e3d-331d-48ba-9034-12345EXAMPLE</code>).
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the key pair (e.g.,
     *        <code>arn:aws:lightsail:us-east-1:123456789101:KeyPair/05859e3d-331d-48ba-9034-12345EXAMPLE</code>).
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key pair (e.g.,
     * <code>arn:aws:lightsail:us-east-1:123456789101:KeyPair/05859e3d-331d-48ba-9034-12345EXAMPLE</code>).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the key pair (e.g.,
     *         <code>arn:aws:lightsail:us-east-1:123456789101:KeyPair/05859e3d-331d-48ba-9034-12345EXAMPLE</code>).
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key pair (e.g.,
     * <code>arn:aws:lightsail:us-east-1:123456789101:KeyPair/05859e3d-331d-48ba-9034-12345EXAMPLE</code>).
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the key pair (e.g.,
     *        <code>arn:aws:lightsail:us-east-1:123456789101:KeyPair/05859e3d-331d-48ba-9034-12345EXAMPLE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyPair withArn(String arn) {
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

    public KeyPair withSupportCode(String supportCode) {
        setSupportCode(supportCode);
        return this;
    }

    /**
     * <p>
     * The timestamp when the key pair was created (e.g., <code>1479816991.349</code>).
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the key pair was created (e.g., <code>1479816991.349</code>).
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the key pair was created (e.g., <code>1479816991.349</code>).
     * </p>
     * 
     * @return The timestamp when the key pair was created (e.g., <code>1479816991.349</code>).
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the key pair was created (e.g., <code>1479816991.349</code>).
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the key pair was created (e.g., <code>1479816991.349</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyPair withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The region name and Availability Zone where the key pair was created.
     * </p>
     * 
     * @param location
     *        The region name and Availability Zone where the key pair was created.
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The region name and Availability Zone where the key pair was created.
     * </p>
     * 
     * @return The region name and Availability Zone where the key pair was created.
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The region name and Availability Zone where the key pair was created.
     * </p>
     * 
     * @param location
     *        The region name and Availability Zone where the key pair was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyPair withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The resource type (usually <code>KeyPair</code>).
     * </p>
     * 
     * @param resourceType
     *        The resource type (usually <code>KeyPair</code>).
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type (usually <code>KeyPair</code>).
     * </p>
     * 
     * @return The resource type (usually <code>KeyPair</code>).
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type (usually <code>KeyPair</code>).
     * </p>
     * 
     * @param resourceType
     *        The resource type (usually <code>KeyPair</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public KeyPair withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type (usually <code>KeyPair</code>).
     * </p>
     * 
     * @param resourceType
     *        The resource type (usually <code>KeyPair</code>).
     * @see ResourceType
     */

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The resource type (usually <code>KeyPair</code>).
     * </p>
     * 
     * @param resourceType
     *        The resource type (usually <code>KeyPair</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public KeyPair withResourceType(ResourceType resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The RSA fingerprint of the key pair.
     * </p>
     * 
     * @param fingerprint
     *        The RSA fingerprint of the key pair.
     */

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    /**
     * <p>
     * The RSA fingerprint of the key pair.
     * </p>
     * 
     * @return The RSA fingerprint of the key pair.
     */

    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * <p>
     * The RSA fingerprint of the key pair.
     * </p>
     * 
     * @param fingerprint
     *        The RSA fingerprint of the key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyPair withFingerprint(String fingerprint) {
        setFingerprint(fingerprint);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Name: " + getName() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getSupportCode() != null)
            sb.append("SupportCode: " + getSupportCode() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getFingerprint() != null)
            sb.append("Fingerprint: " + getFingerprint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyPair == false)
            return false;
        KeyPair other = (KeyPair) obj;
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
        if (other.getFingerprint() == null ^ this.getFingerprint() == null)
            return false;
        if (other.getFingerprint() != null && other.getFingerprint().equals(this.getFingerprint()) == false)
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
        hashCode = prime * hashCode + ((getFingerprint() == null) ? 0 : getFingerprint().hashCode());
        return hashCode;
    }

    @Override
    public KeyPair clone() {
        try {
            return (KeyPair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

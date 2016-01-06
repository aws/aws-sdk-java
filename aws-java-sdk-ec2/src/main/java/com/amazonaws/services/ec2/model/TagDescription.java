/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a tag.
 * </p>
 */
public class TagDescription implements Serializable, Cloneable {

    /**
     * The ID of the resource. For example, <code>ami-1a2b3c4d</code>.
     */
    private String resourceId;

    /**
     * The resource type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>customer-gateway, dhcp-options, image, instance, internet-gateway, network-acl, network-interface, reserved-instances, route-table, snapshot, spot-instances-request, subnet, security-group, volume, vpc, vpn-connection, vpn-gateway
     */
    private String resourceType;

    /**
     * The tag key.
     */
    private String key;

    /**
     * The tag value.
     */
    private String value;

    /**
     * The ID of the resource. For example, <code>ami-1a2b3c4d</code>.
     *
     * @return The ID of the resource. For example, <code>ami-1a2b3c4d</code>.
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * The ID of the resource. For example, <code>ami-1a2b3c4d</code>.
     *
     * @param resourceId The ID of the resource. For example, <code>ami-1a2b3c4d</code>.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * The ID of the resource. For example, <code>ami-1a2b3c4d</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceId The ID of the resource. For example, <code>ami-1a2b3c4d</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TagDescription withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * The resource type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>customer-gateway, dhcp-options, image, instance, internet-gateway, network-acl, network-interface, reserved-instances, route-table, snapshot, spot-instances-request, subnet, security-group, volume, vpc, vpn-connection, vpn-gateway
     *
     * @return The resource type.
     *
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The resource type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>customer-gateway, dhcp-options, image, instance, internet-gateway, network-acl, network-interface, reserved-instances, route-table, snapshot, spot-instances-request, subnet, security-group, volume, vpc, vpn-connection, vpn-gateway
     *
     * @param resourceType The resource type.
     *
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * The resource type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>customer-gateway, dhcp-options, image, instance, internet-gateway, network-acl, network-interface, reserved-instances, route-table, snapshot, spot-instances-request, subnet, security-group, volume, vpc, vpn-connection, vpn-gateway
     *
     * @param resourceType The resource type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ResourceType
     */
    public TagDescription withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * The resource type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>customer-gateway, dhcp-options, image, instance, internet-gateway, network-acl, network-interface, reserved-instances, route-table, snapshot, spot-instances-request, subnet, security-group, volume, vpc, vpn-connection, vpn-gateway
     *
     * @param resourceType The resource type.
     *
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }
    
    /**
     * The resource type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>customer-gateway, dhcp-options, image, instance, internet-gateway, network-acl, network-interface, reserved-instances, route-table, snapshot, spot-instances-request, subnet, security-group, volume, vpc, vpn-connection, vpn-gateway
     *
     * @param resourceType The resource type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ResourceType
     */
    public TagDescription withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * The tag key.
     *
     * @return The tag key.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The tag key.
     *
     * @param key The tag key.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The tag key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key The tag key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TagDescription withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * The tag value.
     *
     * @return The tag value.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The tag value.
     *
     * @param value The tag value.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The tag value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The tag value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TagDescription withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() + ",");
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TagDescription == false) return false;
        TagDescription other = (TagDescription)obj;
        
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        return true;
    }
    
    @Override
    public TagDescription clone() {
        try {
            return (TagDescription) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    
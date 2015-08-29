/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * The details that identify a resource that is discovered by AWS Config,
 * including the resource type, ID, and (if available) the custom
 * resource name.
 * </p>
 */
public class ResourceIdentifier implements Serializable, Cloneable {

    /**
     * The type of resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     */
    private String resourceType;

    /**
     * The ID of the resource (for example., <code>sg-xxxxxx</code>).
     */
    private String resourceId;

    /**
     * The custom name of the resource (if available).
     */
    private String resourceName;

    /**
     * The time that the resource was deleted.
     */
    private java.util.Date resourceDeletionTime;

    /**
     * The type of resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @return The type of resource.
     *
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The type of resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The type of resource.
     *
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * The type of resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The type of resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ResourceType
     */
    public ResourceIdentifier withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * The type of resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The type of resource.
     *
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }
    
    /**
     * The type of resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The type of resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ResourceType
     */
    public ResourceIdentifier withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * The ID of the resource (for example., <code>sg-xxxxxx</code>).
     *
     * @return The ID of the resource (for example., <code>sg-xxxxxx</code>).
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * The ID of the resource (for example., <code>sg-xxxxxx</code>).
     *
     * @param resourceId The ID of the resource (for example., <code>sg-xxxxxx</code>).
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * The ID of the resource (for example., <code>sg-xxxxxx</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceId The ID of the resource (for example., <code>sg-xxxxxx</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResourceIdentifier withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * The custom name of the resource (if available).
     *
     * @return The custom name of the resource (if available).
     */
    public String getResourceName() {
        return resourceName;
    }
    
    /**
     * The custom name of the resource (if available).
     *
     * @param resourceName The custom name of the resource (if available).
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
    /**
     * The custom name of the resource (if available).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceName The custom name of the resource (if available).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResourceIdentifier withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * The time that the resource was deleted.
     *
     * @return The time that the resource was deleted.
     */
    public java.util.Date getResourceDeletionTime() {
        return resourceDeletionTime;
    }
    
    /**
     * The time that the resource was deleted.
     *
     * @param resourceDeletionTime The time that the resource was deleted.
     */
    public void setResourceDeletionTime(java.util.Date resourceDeletionTime) {
        this.resourceDeletionTime = resourceDeletionTime;
    }
    
    /**
     * The time that the resource was deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceDeletionTime The time that the resource was deleted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResourceIdentifier withResourceDeletionTime(java.util.Date resourceDeletionTime) {
        this.resourceDeletionTime = resourceDeletionTime;
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
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() + ",");
        if (getResourceName() != null) sb.append("ResourceName: " + getResourceName() + ",");
        if (getResourceDeletionTime() != null) sb.append("ResourceDeletionTime: " + getResourceDeletionTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode()); 
        hashCode = prime * hashCode + ((getResourceDeletionTime() == null) ? 0 : getResourceDeletionTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResourceIdentifier == false) return false;
        ResourceIdentifier other = (ResourceIdentifier)obj;
        
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        if (other.getResourceName() == null ^ this.getResourceName() == null) return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false) return false; 
        if (other.getResourceDeletionTime() == null ^ this.getResourceDeletionTime() == null) return false;
        if (other.getResourceDeletionTime() != null && other.getResourceDeletionTime().equals(this.getResourceDeletionTime()) == false) return false; 
        return true;
    }
    
    @Override
    public ResourceIdentifier clone() {
        try {
            return (ResourceIdentifier) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    
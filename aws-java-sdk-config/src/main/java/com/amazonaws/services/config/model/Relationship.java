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
 * The relationship of the related resource to the main resource.
 * </p>
 */
public class Relationship implements Serializable, Cloneable {

    /**
     * The resource type of the related resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     */
    private String resourceType;

    /**
     * The resource ID of the related resource (for example,
     * <code>sg-xxxxxx</code>.
     */
    private String resourceId;

    /**
     * The name of the related resource.
     */
    private String relationshipName;

    /**
     * The resource type of the related resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @return The resource type of the related resource.
     *
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The resource type of the related resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The resource type of the related resource.
     *
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * The resource type of the related resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The resource type of the related resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ResourceType
     */
    public Relationship withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * The resource type of the related resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The resource type of the related resource.
     *
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }
    
    /**
     * The resource type of the related resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The resource type of the related resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ResourceType
     */
    public Relationship withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * The resource ID of the related resource (for example,
     * <code>sg-xxxxxx</code>.
     *
     * @return The resource ID of the related resource (for example,
     *         <code>sg-xxxxxx</code>.
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * The resource ID of the related resource (for example,
     * <code>sg-xxxxxx</code>.
     *
     * @param resourceId The resource ID of the related resource (for example,
     *         <code>sg-xxxxxx</code>.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * The resource ID of the related resource (for example,
     * <code>sg-xxxxxx</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceId The resource ID of the related resource (for example,
     *         <code>sg-xxxxxx</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Relationship withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * The name of the related resource.
     *
     * @return The name of the related resource.
     */
    public String getRelationshipName() {
        return relationshipName;
    }
    
    /**
     * The name of the related resource.
     *
     * @param relationshipName The name of the related resource.
     */
    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
    }
    
    /**
     * The name of the related resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param relationshipName The name of the related resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Relationship withRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
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
        if (getRelationshipName() != null) sb.append("RelationshipName: " + getRelationshipName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getRelationshipName() == null) ? 0 : getRelationshipName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Relationship == false) return false;
        Relationship other = (Relationship)obj;
        
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        if (other.getRelationshipName() == null ^ this.getRelationshipName() == null) return false;
        if (other.getRelationshipName() != null && other.getRelationshipName().equals(this.getRelationshipName()) == false) return false; 
        return true;
    }
    
    @Override
    public Relationship clone() {
        try {
            return (Relationship) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

/**
 * <p>
 * A tag and its associated resource.
 * </p>
 */
public class TaggedResource implements Serializable, Cloneable {

    /**
     * The tag for the resource.
     */
    private Tag tag;

    /**
     * The Amazon Resource Name (ARN) with which the tag is associated. For
     * example, <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     */
    private String resourceName;

    /**
     * The type of resource with which the tag is associated. Valid resource
     * types are: <ul> <li>Cluster</li> <li>CIDR/IP</li> <li>EC2 security
     * group</li> <li>Snapshot</li> <li>Cluster security group</li>
     * <li>Subnet group</li> <li>HSM connection</li> <li>HSM certificate</li>
     * <li>Parameter group</li> </ul> <p> For more information about Amazon
     * Redshift resource types and constructing ARNs, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing
     * an Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon
     * Redshift Cluster Management Guide.
     */
    private String resourceType;

    /**
     * The tag for the resource.
     *
     * @return The tag for the resource.
     */
    public Tag getTag() {
        return tag;
    }
    
    /**
     * The tag for the resource.
     *
     * @param tag The tag for the resource.
     */
    public void setTag(Tag tag) {
        this.tag = tag;
    }
    
    /**
     * The tag for the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tag The tag for the resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TaggedResource withTag(Tag tag) {
        this.tag = tag;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) with which the tag is associated. For
     * example, <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     *
     * @return The Amazon Resource Name (ARN) with which the tag is associated. For
     *         example, <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     */
    public String getResourceName() {
        return resourceName;
    }
    
    /**
     * The Amazon Resource Name (ARN) with which the tag is associated. For
     * example, <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     *
     * @param resourceName The Amazon Resource Name (ARN) with which the tag is associated. For
     *         example, <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
    /**
     * The Amazon Resource Name (ARN) with which the tag is associated. For
     * example, <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceName The Amazon Resource Name (ARN) with which the tag is associated. For
     *         example, <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TaggedResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * The type of resource with which the tag is associated. Valid resource
     * types are: <ul> <li>Cluster</li> <li>CIDR/IP</li> <li>EC2 security
     * group</li> <li>Snapshot</li> <li>Cluster security group</li>
     * <li>Subnet group</li> <li>HSM connection</li> <li>HSM certificate</li>
     * <li>Parameter group</li> </ul> <p> For more information about Amazon
     * Redshift resource types and constructing ARNs, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing
     * an Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon
     * Redshift Cluster Management Guide.
     *
     * @return The type of resource with which the tag is associated. Valid resource
     *         types are: <ul> <li>Cluster</li> <li>CIDR/IP</li> <li>EC2 security
     *         group</li> <li>Snapshot</li> <li>Cluster security group</li>
     *         <li>Subnet group</li> <li>HSM connection</li> <li>HSM certificate</li>
     *         <li>Parameter group</li> </ul> <p> For more information about Amazon
     *         Redshift resource types and constructing ARNs, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing
     *         an Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon
     *         Redshift Cluster Management Guide.
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The type of resource with which the tag is associated. Valid resource
     * types are: <ul> <li>Cluster</li> <li>CIDR/IP</li> <li>EC2 security
     * group</li> <li>Snapshot</li> <li>Cluster security group</li>
     * <li>Subnet group</li> <li>HSM connection</li> <li>HSM certificate</li>
     * <li>Parameter group</li> </ul> <p> For more information about Amazon
     * Redshift resource types and constructing ARNs, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing
     * an Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon
     * Redshift Cluster Management Guide.
     *
     * @param resourceType The type of resource with which the tag is associated. Valid resource
     *         types are: <ul> <li>Cluster</li> <li>CIDR/IP</li> <li>EC2 security
     *         group</li> <li>Snapshot</li> <li>Cluster security group</li>
     *         <li>Subnet group</li> <li>HSM connection</li> <li>HSM certificate</li>
     *         <li>Parameter group</li> </ul> <p> For more information about Amazon
     *         Redshift resource types and constructing ARNs, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing
     *         an Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon
     *         Redshift Cluster Management Guide.
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * The type of resource with which the tag is associated. Valid resource
     * types are: <ul> <li>Cluster</li> <li>CIDR/IP</li> <li>EC2 security
     * group</li> <li>Snapshot</li> <li>Cluster security group</li>
     * <li>Subnet group</li> <li>HSM connection</li> <li>HSM certificate</li>
     * <li>Parameter group</li> </ul> <p> For more information about Amazon
     * Redshift resource types and constructing ARNs, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing
     * an Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon
     * Redshift Cluster Management Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceType The type of resource with which the tag is associated. Valid resource
     *         types are: <ul> <li>Cluster</li> <li>CIDR/IP</li> <li>EC2 security
     *         group</li> <li>Snapshot</li> <li>Cluster security group</li>
     *         <li>Subnet group</li> <li>HSM connection</li> <li>HSM certificate</li>
     *         <li>Parameter group</li> </ul> <p> For more information about Amazon
     *         Redshift resource types and constructing ARNs, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing
     *         an Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon
     *         Redshift Cluster Management Guide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TaggedResource withResourceType(String resourceType) {
        this.resourceType = resourceType;
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
        if (getTag() != null) sb.append("Tag: " + getTag() + ",");
        if (getResourceName() != null) sb.append("ResourceName: " + getResourceName() + ",");
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTag() == null) ? 0 : getTag().hashCode()); 
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode()); 
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TaggedResource == false) return false;
        TaggedResource other = (TaggedResource)obj;
        
        if (other.getTag() == null ^ this.getTag() == null) return false;
        if (other.getTag() != null && other.getTag().equals(this.getTag()) == false) return false; 
        if (other.getResourceName() == null ^ this.getResourceName() == null) return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false) return false; 
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        return true;
    }
    
    @Override
    public TaggedResource clone() {
        try {
            return (TaggedResource) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    
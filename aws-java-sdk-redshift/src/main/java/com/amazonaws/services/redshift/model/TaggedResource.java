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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

/**
 * <p>
 * A tag and its associated resource.
 * </p>
 */
public class TaggedResource implements Serializable, Cloneable {

    /**
     * <p>
     * The tag for the resource.
     * </p>
     */
    private Tag tag;
    /**
     * <p>
     * The Amazon Resource Name (ARN) with which the tag is associated. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The type of resource with which the tag is associated. Valid resource types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * CIDR/IP
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * Cluster security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Subnet group
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM connection
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM certificate
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter group
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon Redshift resource types and constructing ARNs, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing an Amazon
     * Redshift Amazon Resource Name (ARN)</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The tag for the resource.
     * </p>
     * 
     * @param tag
     *        The tag for the resource.
     */

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    /**
     * <p>
     * The tag for the resource.
     * </p>
     * 
     * @return The tag for the resource.
     */

    public Tag getTag() {
        return this.tag;
    }

    /**
     * <p>
     * The tag for the resource.
     * </p>
     * 
     * @param tag
     *        The tag for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaggedResource withTag(Tag tag) {
        setTag(tag);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) with which the tag is associated. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * </p>
     * 
     * @param resourceName
     *        The Amazon Resource Name (ARN) with which the tag is associated. For example,
     *        <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) with which the tag is associated. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) with which the tag is associated. For example,
     *         <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) with which the tag is associated. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * </p>
     * 
     * @param resourceName
     *        The Amazon Resource Name (ARN) with which the tag is associated. For example,
     *        <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaggedResource withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The type of resource with which the tag is associated. Valid resource types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * CIDR/IP
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * Cluster security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Subnet group
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM connection
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM certificate
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter group
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon Redshift resource types and constructing ARNs, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing an Amazon
     * Redshift Amazon Resource Name (ARN)</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     * 
     * @param resourceType
     *        The type of resource with which the tag is associated. Valid resource types are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cluster
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CIDR/IP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EC2 security group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Snapshot
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cluster security group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Subnet group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HSM connection
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HSM certificate
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Parameter group
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about Amazon Redshift resource types and constructing ARNs, go to <a
     *        href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing an
     *        Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon Redshift Cluster Management Guide.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource with which the tag is associated. Valid resource types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * CIDR/IP
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * Cluster security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Subnet group
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM connection
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM certificate
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter group
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon Redshift resource types and constructing ARNs, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing an Amazon
     * Redshift Amazon Resource Name (ARN)</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     * 
     * @return The type of resource with which the tag is associated. Valid resource types are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Cluster
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CIDR/IP
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EC2 security group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Snapshot
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cluster security group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Subnet group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HSM connection
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HSM certificate
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Parameter group
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about Amazon Redshift resource types and constructing ARNs, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing an
     *         Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon Redshift Cluster Management Guide.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource with which the tag is associated. Valid resource types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * CIDR/IP
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * Cluster security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Subnet group
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM connection
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM certificate
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter group
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon Redshift resource types and constructing ARNs, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing an Amazon
     * Redshift Amazon Resource Name (ARN)</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     * 
     * @param resourceType
     *        The type of resource with which the tag is associated. Valid resource types are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cluster
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CIDR/IP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EC2 security group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Snapshot
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cluster security group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Subnet group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HSM connection
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HSM certificate
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Parameter group
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about Amazon Redshift resource types and constructing ARNs, go to <a
     *        href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing an
     *        Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon Redshift Cluster Management Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaggedResource withResourceType(String resourceType) {
        setResourceType(resourceType);
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
        if (getTag() != null)
            sb.append("Tag: " + getTag() + ",");
        if (getResourceName() != null)
            sb.append("ResourceName: " + getResourceName() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaggedResource == false)
            return false;
        TaggedResource other = (TaggedResource) obj;
        if (other.getTag() == null ^ this.getTag() == null)
            return false;
        if (other.getTag() != null && other.getTag().equals(this.getTag()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
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
    public TaggedResource clone() {
        try {
            return (TaggedResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

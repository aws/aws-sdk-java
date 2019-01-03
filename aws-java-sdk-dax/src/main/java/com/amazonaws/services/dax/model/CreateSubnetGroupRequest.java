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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/CreateSubnetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubnetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the subnet group. This value is stored as a lowercase string.
     * </p>
     */
    private String subnetGroupName;
    /**
     * <p>
     * A description for the subnet group
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of VPC subnet IDs for the subnet group.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * A name for the subnet group. This value is stored as a lowercase string.
     * </p>
     * 
     * @param subnetGroupName
     *        A name for the subnet group. This value is stored as a lowercase string.
     */

    public void setSubnetGroupName(String subnetGroupName) {
        this.subnetGroupName = subnetGroupName;
    }

    /**
     * <p>
     * A name for the subnet group. This value is stored as a lowercase string.
     * </p>
     * 
     * @return A name for the subnet group. This value is stored as a lowercase string.
     */

    public String getSubnetGroupName() {
        return this.subnetGroupName;
    }

    /**
     * <p>
     * A name for the subnet group. This value is stored as a lowercase string.
     * </p>
     * 
     * @param subnetGroupName
     *        A name for the subnet group. This value is stored as a lowercase string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetGroupRequest withSubnetGroupName(String subnetGroupName) {
        setSubnetGroupName(subnetGroupName);
        return this;
    }

    /**
     * <p>
     * A description for the subnet group
     * </p>
     * 
     * @param description
     *        A description for the subnet group
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the subnet group
     * </p>
     * 
     * @return A description for the subnet group
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the subnet group
     * </p>
     * 
     * @param description
     *        A description for the subnet group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of VPC subnet IDs for the subnet group.
     * </p>
     * 
     * @return A list of VPC subnet IDs for the subnet group.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * A list of VPC subnet IDs for the subnet group.
     * </p>
     * 
     * @param subnetIds
     *        A list of VPC subnet IDs for the subnet group.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * A list of VPC subnet IDs for the subnet group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of VPC subnet IDs for the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetGroupRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC subnet IDs for the subnet group.
     * </p>
     * 
     * @param subnetIds
     *        A list of VPC subnet IDs for the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetGroupRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
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
        if (getSubnetGroupName() != null)
            sb.append("SubnetGroupName: ").append(getSubnetGroupName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSubnetGroupRequest == false)
            return false;
        CreateSubnetGroupRequest other = (CreateSubnetGroupRequest) obj;
        if (other.getSubnetGroupName() == null ^ this.getSubnetGroupName() == null)
            return false;
        if (other.getSubnetGroupName() != null && other.getSubnetGroupName().equals(this.getSubnetGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetGroupName() == null) ? 0 : getSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubnetGroupRequest clone() {
        return (CreateSubnetGroupRequest) super.clone();
    }

}

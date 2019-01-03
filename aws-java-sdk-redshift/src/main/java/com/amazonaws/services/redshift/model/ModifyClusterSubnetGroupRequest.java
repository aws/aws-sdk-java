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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterSubnetGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClusterSubnetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the subnet group to be modified.
     * </p>
     */
    private String clusterSubnetGroupName;
    /**
     * <p>
     * A text description of the subnet group to be modified.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;

    /**
     * <p>
     * The name of the subnet group to be modified.
     * </p>
     * 
     * @param clusterSubnetGroupName
     *        The name of the subnet group to be modified.
     */

    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group to be modified.
     * </p>
     * 
     * @return The name of the subnet group to be modified.
     */

    public String getClusterSubnetGroupName() {
        return this.clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group to be modified.
     * </p>
     * 
     * @param clusterSubnetGroupName
     *        The name of the subnet group to be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterSubnetGroupRequest withClusterSubnetGroupName(String clusterSubnetGroupName) {
        setClusterSubnetGroupName(clusterSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * A text description of the subnet group to be modified.
     * </p>
     * 
     * @param description
     *        A text description of the subnet group to be modified.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A text description of the subnet group to be modified.
     * </p>
     * 
     * @return A text description of the subnet group to be modified.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A text description of the subnet group to be modified.
     * </p>
     * 
     * @param description
     *        A text description of the subnet group to be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterSubnetGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
     * </p>
     * 
     * @return An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
     * </p>
     * 
     * @param subnetIds
     *        An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterSubnetGroupRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
     * </p>
     * 
     * @param subnetIds
     *        An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterSubnetGroupRequest withSubnetIds(java.util.Collection<String> subnetIds) {
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
        if (getClusterSubnetGroupName() != null)
            sb.append("ClusterSubnetGroupName: ").append(getClusterSubnetGroupName()).append(",");
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

        if (obj instanceof ModifyClusterSubnetGroupRequest == false)
            return false;
        ModifyClusterSubnetGroupRequest other = (ModifyClusterSubnetGroupRequest) obj;
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null)
            return false;
        if (other.getClusterSubnetGroupName() != null && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false)
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

        hashCode = prime * hashCode + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        return hashCode;
    }

    @Override
    public ModifyClusterSubnetGroupRequest clone() {
        return (ModifyClusterSubnetGroupRequest) super.clone();
    }

}

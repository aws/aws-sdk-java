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

/**
 * <p>
 * Describes a subnet group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ClusterSubnetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterSubnetGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster subnet group.
     * </p>
     */
    private String clusterSubnetGroupName;
    /**
     * <p>
     * The description of the cluster subnet group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The VPC ID of the cluster subnet group.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The status of the cluster subnet group. Possible values are <code>Complete</code>, <code>Incomplete</code> and
     * <code>Invalid</code>.
     * </p>
     */
    private String subnetGroupStatus;
    /**
     * <p>
     * A list of the VPC <a>Subnet</a> elements.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Subnet> subnets;
    /**
     * <p>
     * The list of tags for the cluster subnet group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the cluster subnet group.
     * </p>
     * 
     * @param clusterSubnetGroupName
     *        The name of the cluster subnet group.
     */

    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cluster subnet group.
     * </p>
     * 
     * @return The name of the cluster subnet group.
     */

    public String getClusterSubnetGroupName() {
        return this.clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cluster subnet group.
     * </p>
     * 
     * @param clusterSubnetGroupName
     *        The name of the cluster subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSubnetGroup withClusterSubnetGroupName(String clusterSubnetGroupName) {
        setClusterSubnetGroupName(clusterSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * The description of the cluster subnet group.
     * </p>
     * 
     * @param description
     *        The description of the cluster subnet group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the cluster subnet group.
     * </p>
     * 
     * @return The description of the cluster subnet group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the cluster subnet group.
     * </p>
     * 
     * @param description
     *        The description of the cluster subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSubnetGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The VPC ID of the cluster subnet group.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID of the cluster subnet group.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID of the cluster subnet group.
     * </p>
     * 
     * @return The VPC ID of the cluster subnet group.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID of the cluster subnet group.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID of the cluster subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSubnetGroup withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The status of the cluster subnet group. Possible values are <code>Complete</code>, <code>Incomplete</code> and
     * <code>Invalid</code>.
     * </p>
     * 
     * @param subnetGroupStatus
     *        The status of the cluster subnet group. Possible values are <code>Complete</code>, <code>Incomplete</code>
     *        and <code>Invalid</code>.
     */

    public void setSubnetGroupStatus(String subnetGroupStatus) {
        this.subnetGroupStatus = subnetGroupStatus;
    }

    /**
     * <p>
     * The status of the cluster subnet group. Possible values are <code>Complete</code>, <code>Incomplete</code> and
     * <code>Invalid</code>.
     * </p>
     * 
     * @return The status of the cluster subnet group. Possible values are <code>Complete</code>,
     *         <code>Incomplete</code> and <code>Invalid</code>.
     */

    public String getSubnetGroupStatus() {
        return this.subnetGroupStatus;
    }

    /**
     * <p>
     * The status of the cluster subnet group. Possible values are <code>Complete</code>, <code>Incomplete</code> and
     * <code>Invalid</code>.
     * </p>
     * 
     * @param subnetGroupStatus
     *        The status of the cluster subnet group. Possible values are <code>Complete</code>, <code>Incomplete</code>
     *        and <code>Invalid</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSubnetGroup withSubnetGroupStatus(String subnetGroupStatus) {
        setSubnetGroupStatus(subnetGroupStatus);
        return this;
    }

    /**
     * <p>
     * A list of the VPC <a>Subnet</a> elements.
     * </p>
     * 
     * @return A list of the VPC <a>Subnet</a> elements.
     */

    public java.util.List<Subnet> getSubnets() {
        if (subnets == null) {
            subnets = new com.amazonaws.internal.SdkInternalList<Subnet>();
        }
        return subnets;
    }

    /**
     * <p>
     * A list of the VPC <a>Subnet</a> elements.
     * </p>
     * 
     * @param subnets
     *        A list of the VPC <a>Subnet</a> elements.
     */

    public void setSubnets(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new com.amazonaws.internal.SdkInternalList<Subnet>(subnets);
    }

    /**
     * <p>
     * A list of the VPC <a>Subnet</a> elements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        A list of the VPC <a>Subnet</a> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSubnetGroup withSubnets(Subnet... subnets) {
        if (this.subnets == null) {
            setSubnets(new com.amazonaws.internal.SdkInternalList<Subnet>(subnets.length));
        }
        for (Subnet ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the VPC <a>Subnet</a> elements.
     * </p>
     * 
     * @param subnets
     *        A list of the VPC <a>Subnet</a> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSubnetGroup withSubnets(java.util.Collection<Subnet> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The list of tags for the cluster subnet group.
     * </p>
     * 
     * @return The list of tags for the cluster subnet group.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The list of tags for the cluster subnet group.
     * </p>
     * 
     * @param tags
     *        The list of tags for the cluster subnet group.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags for the cluster subnet group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags for the cluster subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSubnetGroup withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags for the cluster subnet group.
     * </p>
     * 
     * @param tags
     *        The list of tags for the cluster subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSubnetGroup withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnetGroupStatus() != null)
            sb.append("SubnetGroupStatus: ").append(getSubnetGroupStatus()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterSubnetGroup == false)
            return false;
        ClusterSubnetGroup other = (ClusterSubnetGroup) obj;
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null)
            return false;
        if (other.getClusterSubnetGroupName() != null && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetGroupStatus() == null ^ this.getSubnetGroupStatus() == null)
            return false;
        if (other.getSubnetGroupStatus() != null && other.getSubnetGroupStatus().equals(this.getSubnetGroupStatus()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetGroupStatus() == null) ? 0 : getSubnetGroupStatus().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ClusterSubnetGroup clone() {
        try {
            return (ClusterSubnetGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
 * Describes a security group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ClusterSecurityGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterSecurityGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster security group to which the operation was applied.
     * </p>
     */
    private String clusterSecurityGroupName;
    /**
     * <p>
     * A description of the security group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of EC2 security groups that are permitted to access clusters associated with this cluster security group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EC2SecurityGroup> eC2SecurityGroups;
    /**
     * <p>
     * A list of IP ranges (CIDR blocks) that are permitted to access clusters associated with this cluster security
     * group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IPRange> iPRanges;
    /**
     * <p>
     * The list of tags for the cluster security group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the cluster security group to which the operation was applied.
     * </p>
     * 
     * @param clusterSecurityGroupName
     *        The name of the cluster security group to which the operation was applied.
     */

    public void setClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cluster security group to which the operation was applied.
     * </p>
     * 
     * @return The name of the cluster security group to which the operation was applied.
     */

    public String getClusterSecurityGroupName() {
        return this.clusterSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cluster security group to which the operation was applied.
     * </p>
     * 
     * @param clusterSecurityGroupName
     *        The name of the cluster security group to which the operation was applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSecurityGroup withClusterSecurityGroupName(String clusterSecurityGroupName) {
        setClusterSecurityGroupName(clusterSecurityGroupName);
        return this;
    }

    /**
     * <p>
     * A description of the security group.
     * </p>
     * 
     * @param description
     *        A description of the security group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the security group.
     * </p>
     * 
     * @return A description of the security group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the security group.
     * </p>
     * 
     * @param description
     *        A description of the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSecurityGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of EC2 security groups that are permitted to access clusters associated with this cluster security group.
     * </p>
     * 
     * @return A list of EC2 security groups that are permitted to access clusters associated with this cluster security
     *         group.
     */

    public java.util.List<EC2SecurityGroup> getEC2SecurityGroups() {
        if (eC2SecurityGroups == null) {
            eC2SecurityGroups = new com.amazonaws.internal.SdkInternalList<EC2SecurityGroup>();
        }
        return eC2SecurityGroups;
    }

    /**
     * <p>
     * A list of EC2 security groups that are permitted to access clusters associated with this cluster security group.
     * </p>
     * 
     * @param eC2SecurityGroups
     *        A list of EC2 security groups that are permitted to access clusters associated with this cluster security
     *        group.
     */

    public void setEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        if (eC2SecurityGroups == null) {
            this.eC2SecurityGroups = null;
            return;
        }

        this.eC2SecurityGroups = new com.amazonaws.internal.SdkInternalList<EC2SecurityGroup>(eC2SecurityGroups);
    }

    /**
     * <p>
     * A list of EC2 security groups that are permitted to access clusters associated with this cluster security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEC2SecurityGroups(java.util.Collection)} or {@link #withEC2SecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param eC2SecurityGroups
     *        A list of EC2 security groups that are permitted to access clusters associated with this cluster security
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSecurityGroup withEC2SecurityGroups(EC2SecurityGroup... eC2SecurityGroups) {
        if (this.eC2SecurityGroups == null) {
            setEC2SecurityGroups(new com.amazonaws.internal.SdkInternalList<EC2SecurityGroup>(eC2SecurityGroups.length));
        }
        for (EC2SecurityGroup ele : eC2SecurityGroups) {
            this.eC2SecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of EC2 security groups that are permitted to access clusters associated with this cluster security group.
     * </p>
     * 
     * @param eC2SecurityGroups
     *        A list of EC2 security groups that are permitted to access clusters associated with this cluster security
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSecurityGroup withEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        setEC2SecurityGroups(eC2SecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of IP ranges (CIDR blocks) that are permitted to access clusters associated with this cluster security
     * group.
     * </p>
     * 
     * @return A list of IP ranges (CIDR blocks) that are permitted to access clusters associated with this cluster
     *         security group.
     */

    public java.util.List<IPRange> getIPRanges() {
        if (iPRanges == null) {
            iPRanges = new com.amazonaws.internal.SdkInternalList<IPRange>();
        }
        return iPRanges;
    }

    /**
     * <p>
     * A list of IP ranges (CIDR blocks) that are permitted to access clusters associated with this cluster security
     * group.
     * </p>
     * 
     * @param iPRanges
     *        A list of IP ranges (CIDR blocks) that are permitted to access clusters associated with this cluster
     *        security group.
     */

    public void setIPRanges(java.util.Collection<IPRange> iPRanges) {
        if (iPRanges == null) {
            this.iPRanges = null;
            return;
        }

        this.iPRanges = new com.amazonaws.internal.SdkInternalList<IPRange>(iPRanges);
    }

    /**
     * <p>
     * A list of IP ranges (CIDR blocks) that are permitted to access clusters associated with this cluster security
     * group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIPRanges(java.util.Collection)} or {@link #withIPRanges(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param iPRanges
     *        A list of IP ranges (CIDR blocks) that are permitted to access clusters associated with this cluster
     *        security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSecurityGroup withIPRanges(IPRange... iPRanges) {
        if (this.iPRanges == null) {
            setIPRanges(new com.amazonaws.internal.SdkInternalList<IPRange>(iPRanges.length));
        }
        for (IPRange ele : iPRanges) {
            this.iPRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IP ranges (CIDR blocks) that are permitted to access clusters associated with this cluster security
     * group.
     * </p>
     * 
     * @param iPRanges
     *        A list of IP ranges (CIDR blocks) that are permitted to access clusters associated with this cluster
     *        security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSecurityGroup withIPRanges(java.util.Collection<IPRange> iPRanges) {
        setIPRanges(iPRanges);
        return this;
    }

    /**
     * <p>
     * The list of tags for the cluster security group.
     * </p>
     * 
     * @return The list of tags for the cluster security group.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The list of tags for the cluster security group.
     * </p>
     * 
     * @param tags
     *        The list of tags for the cluster security group.
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
     * The list of tags for the cluster security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags for the cluster security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSecurityGroup withTags(Tag... tags) {
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
     * The list of tags for the cluster security group.
     * </p>
     * 
     * @param tags
     *        The list of tags for the cluster security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSecurityGroup withTags(java.util.Collection<Tag> tags) {
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
        if (getClusterSecurityGroupName() != null)
            sb.append("ClusterSecurityGroupName: ").append(getClusterSecurityGroupName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEC2SecurityGroups() != null)
            sb.append("EC2SecurityGroups: ").append(getEC2SecurityGroups()).append(",");
        if (getIPRanges() != null)
            sb.append("IPRanges: ").append(getIPRanges()).append(",");
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

        if (obj instanceof ClusterSecurityGroup == false)
            return false;
        ClusterSecurityGroup other = (ClusterSecurityGroup) obj;
        if (other.getClusterSecurityGroupName() == null ^ this.getClusterSecurityGroupName() == null)
            return false;
        if (other.getClusterSecurityGroupName() != null && other.getClusterSecurityGroupName().equals(this.getClusterSecurityGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEC2SecurityGroups() == null ^ this.getEC2SecurityGroups() == null)
            return false;
        if (other.getEC2SecurityGroups() != null && other.getEC2SecurityGroups().equals(this.getEC2SecurityGroups()) == false)
            return false;
        if (other.getIPRanges() == null ^ this.getIPRanges() == null)
            return false;
        if (other.getIPRanges() != null && other.getIPRanges().equals(this.getIPRanges()) == false)
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

        hashCode = prime * hashCode + ((getClusterSecurityGroupName() == null) ? 0 : getClusterSecurityGroupName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEC2SecurityGroups() == null) ? 0 : getEC2SecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getIPRanges() == null) ? 0 : getIPRanges().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ClusterSecurityGroup clone() {
        try {
            return (ClusterSecurityGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

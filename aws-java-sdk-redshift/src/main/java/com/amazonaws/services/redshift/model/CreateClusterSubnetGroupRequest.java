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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterSubnetGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterSubnetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the subnet group. Amazon Redshift stores the value as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain no more than 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be "Default".
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for all subnet groups that are created by your AWS account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>examplesubnetgroup</code>
     * </p>
     */
    private String clusterSubnetGroupName;
    /**
     * <p>
     * A description for the subnet group.
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
     * A list of tag instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name for the subnet group. Amazon Redshift stores the value as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain no more than 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be "Default".
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for all subnet groups that are created by your AWS account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>examplesubnetgroup</code>
     * </p>
     * 
     * @param clusterSubnetGroupName
     *        The name for the subnet group. Amazon Redshift stores the value as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain no more than 255 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not be "Default".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be unique for all subnet groups that are created by your AWS account.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>examplesubnetgroup</code>
     */

    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name for the subnet group. Amazon Redshift stores the value as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain no more than 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be "Default".
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for all subnet groups that are created by your AWS account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>examplesubnetgroup</code>
     * </p>
     * 
     * @return The name for the subnet group. Amazon Redshift stores the value as a lowercase string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain no more than 255 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not be "Default".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be unique for all subnet groups that are created by your AWS account.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>examplesubnetgroup</code>
     */

    public String getClusterSubnetGroupName() {
        return this.clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name for the subnet group. Amazon Redshift stores the value as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain no more than 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be "Default".
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for all subnet groups that are created by your AWS account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>examplesubnetgroup</code>
     * </p>
     * 
     * @param clusterSubnetGroupName
     *        The name for the subnet group. Amazon Redshift stores the value as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain no more than 255 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not be "Default".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be unique for all subnet groups that are created by your AWS account.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>examplesubnetgroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterSubnetGroupRequest withClusterSubnetGroupName(String clusterSubnetGroupName) {
        setClusterSubnetGroupName(clusterSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * A description for the subnet group.
     * </p>
     * 
     * @param description
     *        A description for the subnet group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the subnet group.
     * </p>
     * 
     * @return A description for the subnet group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the subnet group.
     * </p>
     * 
     * @param description
     *        A description for the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterSubnetGroupRequest withDescription(String description) {
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

    public CreateClusterSubnetGroupRequest withSubnetIds(String... subnetIds) {
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

    public CreateClusterSubnetGroupRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @return A list of tag instances.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
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
     * A list of tag instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterSubnetGroupRequest withTags(Tag... tags) {
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
     * A list of tag instances.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterSubnetGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
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

        if (obj instanceof CreateClusterSubnetGroupRequest == false)
            return false;
        CreateClusterSubnetGroupRequest other = (CreateClusterSubnetGroupRequest) obj;
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
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterSubnetGroupRequest clone() {
        return (CreateClusterSubnetGroupRequest) super.clone();
    }

}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterSecurityGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterSecurityGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the security group. Amazon Redshift stores the value as a lowercase string.
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
     * Must be unique for all security groups that are created by your AWS account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>examplesecuritygroup</code>
     * </p>
     */
    private String clusterSecurityGroupName;
    /**
     * <p>
     * A description for the security group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of tag instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name for the security group. Amazon Redshift stores the value as a lowercase string.
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
     * Must be unique for all security groups that are created by your AWS account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>examplesecuritygroup</code>
     * </p>
     * 
     * @param clusterSecurityGroupName
     *        The name for the security group. Amazon Redshift stores the value as a lowercase string.</p>
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
     *        Must be unique for all security groups that are created by your AWS account.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>examplesecuritygroup</code>
     */

    public void setClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
    }

    /**
     * <p>
     * The name for the security group. Amazon Redshift stores the value as a lowercase string.
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
     * Must be unique for all security groups that are created by your AWS account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>examplesecuritygroup</code>
     * </p>
     * 
     * @return The name for the security group. Amazon Redshift stores the value as a lowercase string.</p>
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
     *         Must be unique for all security groups that are created by your AWS account.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>examplesecuritygroup</code>
     */

    public String getClusterSecurityGroupName() {
        return this.clusterSecurityGroupName;
    }

    /**
     * <p>
     * The name for the security group. Amazon Redshift stores the value as a lowercase string.
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
     * Must be unique for all security groups that are created by your AWS account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>examplesecuritygroup</code>
     * </p>
     * 
     * @param clusterSecurityGroupName
     *        The name for the security group. Amazon Redshift stores the value as a lowercase string.</p>
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
     *        Must be unique for all security groups that are created by your AWS account.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>examplesecuritygroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterSecurityGroupRequest withClusterSecurityGroupName(String clusterSecurityGroupName) {
        setClusterSecurityGroupName(clusterSecurityGroupName);
        return this;
    }

    /**
     * <p>
     * A description for the security group.
     * </p>
     * 
     * @param description
     *        A description for the security group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the security group.
     * </p>
     * 
     * @return A description for the security group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the security group.
     * </p>
     * 
     * @param description
     *        A description for the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterSecurityGroupRequest withDescription(String description) {
        setDescription(description);
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

    public CreateClusterSecurityGroupRequest withTags(Tag... tags) {
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

    public CreateClusterSecurityGroupRequest withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof CreateClusterSecurityGroupRequest == false)
            return false;
        CreateClusterSecurityGroupRequest other = (CreateClusterSecurityGroupRequest) obj;
        if (other.getClusterSecurityGroupName() == null ^ this.getClusterSecurityGroupName() == null)
            return false;
        if (other.getClusterSecurityGroupName() != null && other.getClusterSecurityGroupName().equals(this.getClusterSecurityGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterSecurityGroupRequest clone() {
        return (CreateClusterSecurityGroupRequest) super.clone();
    }

}

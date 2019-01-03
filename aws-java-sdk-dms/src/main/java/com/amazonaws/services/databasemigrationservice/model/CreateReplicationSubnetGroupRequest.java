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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationSubnetGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReplicationSubnetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the replication subnet group. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, spaces, underscores, or hyphens.
     * Must not be "default".
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     */
    private String replicationSubnetGroupIdentifier;
    /**
     * <p>
     * The description for the subnet group.
     * </p>
     */
    private String replicationSubnetGroupDescription;
    /**
     * <p>
     * The EC2 subnet IDs for the subnet group.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The tag to be assigned to the subnet group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the replication subnet group. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, spaces, underscores, or hyphens.
     * Must not be "default".
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param replicationSubnetGroupIdentifier
     *        The name for the replication subnet group. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters, periods, spaces, underscores, or
     *        hyphens. Must not be "default".
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     */

    public void setReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * The name for the replication subnet group. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, spaces, underscores, or hyphens.
     * Must not be "default".
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @return The name for the replication subnet group. This value is stored as a lowercase string.</p>
     *         <p>
     *         Constraints: Must contain no more than 255 alphanumeric characters, periods, spaces, underscores, or
     *         hyphens. Must not be "default".
     *         </p>
     *         <p>
     *         Example: <code>mySubnetgroup</code>
     */

    public String getReplicationSubnetGroupIdentifier() {
        return this.replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * The name for the replication subnet group. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, spaces, underscores, or hyphens.
     * Must not be "default".
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param replicationSubnetGroupIdentifier
     *        The name for the replication subnet group. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters, periods, spaces, underscores, or
     *        hyphens. Must not be "default".
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationSubnetGroupRequest withReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
        setReplicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * The description for the subnet group.
     * </p>
     * 
     * @param replicationSubnetGroupDescription
     *        The description for the subnet group.
     */

    public void setReplicationSubnetGroupDescription(String replicationSubnetGroupDescription) {
        this.replicationSubnetGroupDescription = replicationSubnetGroupDescription;
    }

    /**
     * <p>
     * The description for the subnet group.
     * </p>
     * 
     * @return The description for the subnet group.
     */

    public String getReplicationSubnetGroupDescription() {
        return this.replicationSubnetGroupDescription;
    }

    /**
     * <p>
     * The description for the subnet group.
     * </p>
     * 
     * @param replicationSubnetGroupDescription
     *        The description for the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationSubnetGroupRequest withReplicationSubnetGroupDescription(String replicationSubnetGroupDescription) {
        setReplicationSubnetGroupDescription(replicationSubnetGroupDescription);
        return this;
    }

    /**
     * <p>
     * The EC2 subnet IDs for the subnet group.
     * </p>
     * 
     * @return The EC2 subnet IDs for the subnet group.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The EC2 subnet IDs for the subnet group.
     * </p>
     * 
     * @param subnetIds
     *        The EC2 subnet IDs for the subnet group.
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
     * The EC2 subnet IDs for the subnet group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The EC2 subnet IDs for the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationSubnetGroupRequest withSubnetIds(String... subnetIds) {
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
     * The EC2 subnet IDs for the subnet group.
     * </p>
     * 
     * @param subnetIds
     *        The EC2 subnet IDs for the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationSubnetGroupRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The tag to be assigned to the subnet group.
     * </p>
     * 
     * @return The tag to be assigned to the subnet group.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag to be assigned to the subnet group.
     * </p>
     * 
     * @param tags
     *        The tag to be assigned to the subnet group.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag to be assigned to the subnet group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag to be assigned to the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationSubnetGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag to be assigned to the subnet group.
     * </p>
     * 
     * @param tags
     *        The tag to be assigned to the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationSubnetGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getReplicationSubnetGroupIdentifier() != null)
            sb.append("ReplicationSubnetGroupIdentifier: ").append(getReplicationSubnetGroupIdentifier()).append(",");
        if (getReplicationSubnetGroupDescription() != null)
            sb.append("ReplicationSubnetGroupDescription: ").append(getReplicationSubnetGroupDescription()).append(",");
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

        if (obj instanceof CreateReplicationSubnetGroupRequest == false)
            return false;
        CreateReplicationSubnetGroupRequest other = (CreateReplicationSubnetGroupRequest) obj;
        if (other.getReplicationSubnetGroupIdentifier() == null ^ this.getReplicationSubnetGroupIdentifier() == null)
            return false;
        if (other.getReplicationSubnetGroupIdentifier() != null
                && other.getReplicationSubnetGroupIdentifier().equals(this.getReplicationSubnetGroupIdentifier()) == false)
            return false;
        if (other.getReplicationSubnetGroupDescription() == null ^ this.getReplicationSubnetGroupDescription() == null)
            return false;
        if (other.getReplicationSubnetGroupDescription() != null
                && other.getReplicationSubnetGroupDescription().equals(this.getReplicationSubnetGroupDescription()) == false)
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

        hashCode = prime * hashCode + ((getReplicationSubnetGroupIdentifier() == null) ? 0 : getReplicationSubnetGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getReplicationSubnetGroupDescription() == null) ? 0 : getReplicationSubnetGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateReplicationSubnetGroupRequest clone() {
        return (CreateReplicationSubnetGroupRequest) super.clone();
    }

}

/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/CreateGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the resource group.
     * </p>
     */
    private Group group;
    /**
     * <p>
     * The resource query associated with the group.
     * </p>
     */
    private ResourceQuery resourceQuery;
    /**
     * <p>
     * The tags associated with the group.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The service configuration associated with the resource group. AWS Resource Groups supports adding service
     * configurations for the following resource group types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::EC2::CapacityReservationPool</code> - Amazon EC2 capacity reservation pools. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html#create-cr-group">
     * Working with capacity reservation groups</a> in the <i>EC2 Users Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private GroupConfiguration groupConfiguration;

    /**
     * <p>
     * The description of the resource group.
     * </p>
     * 
     * @param group
     *        The description of the resource group.
     */

    public void setGroup(Group group) {
        this.group = group;
    }

    /**
     * <p>
     * The description of the resource group.
     * </p>
     * 
     * @return The description of the resource group.
     */

    public Group getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The description of the resource group.
     * </p>
     * 
     * @param group
     *        The description of the resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupResult withGroup(Group group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * The resource query associated with the group.
     * </p>
     * 
     * @param resourceQuery
     *        The resource query associated with the group.
     */

    public void setResourceQuery(ResourceQuery resourceQuery) {
        this.resourceQuery = resourceQuery;
    }

    /**
     * <p>
     * The resource query associated with the group.
     * </p>
     * 
     * @return The resource query associated with the group.
     */

    public ResourceQuery getResourceQuery() {
        return this.resourceQuery;
    }

    /**
     * <p>
     * The resource query associated with the group.
     * </p>
     * 
     * @param resourceQuery
     *        The resource query associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupResult withResourceQuery(ResourceQuery resourceQuery) {
        setResourceQuery(resourceQuery);
        return this;
    }

    /**
     * <p>
     * The tags associated with the group.
     * </p>
     * 
     * @return The tags associated with the group.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the group.
     * </p>
     * 
     * @param tags
     *        The tags associated with the group.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags associated with the group.
     * </p>
     * 
     * @param tags
     *        The tags associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateGroupResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The service configuration associated with the resource group. AWS Resource Groups supports adding service
     * configurations for the following resource group types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::EC2::CapacityReservationPool</code> - Amazon EC2 capacity reservation pools. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html#create-cr-group">
     * Working with capacity reservation groups</a> in the <i>EC2 Users Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param groupConfiguration
     *        The service configuration associated with the resource group. AWS Resource Groups supports adding service
     *        configurations for the following resource group types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS::EC2::CapacityReservationPool</code> - Amazon EC2 capacity reservation pools. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html#create-cr-group"
     *        >Working with capacity reservation groups</a> in the <i>EC2 Users Guide</i>.
     *        </p>
     *        </li>
     */

    public void setGroupConfiguration(GroupConfiguration groupConfiguration) {
        this.groupConfiguration = groupConfiguration;
    }

    /**
     * <p>
     * The service configuration associated with the resource group. AWS Resource Groups supports adding service
     * configurations for the following resource group types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::EC2::CapacityReservationPool</code> - Amazon EC2 capacity reservation pools. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html#create-cr-group">
     * Working with capacity reservation groups</a> in the <i>EC2 Users Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The service configuration associated with the resource group. AWS Resource Groups supports adding service
     *         configurations for the following resource group types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWS::EC2::CapacityReservationPool</code> - Amazon EC2 capacity reservation pools. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html#create-cr-group"
     *         >Working with capacity reservation groups</a> in the <i>EC2 Users Guide</i>.
     *         </p>
     *         </li>
     */

    public GroupConfiguration getGroupConfiguration() {
        return this.groupConfiguration;
    }

    /**
     * <p>
     * The service configuration associated with the resource group. AWS Resource Groups supports adding service
     * configurations for the following resource group types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::EC2::CapacityReservationPool</code> - Amazon EC2 capacity reservation pools. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html#create-cr-group">
     * Working with capacity reservation groups</a> in the <i>EC2 Users Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param groupConfiguration
     *        The service configuration associated with the resource group. AWS Resource Groups supports adding service
     *        configurations for the following resource group types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS::EC2::CapacityReservationPool</code> - Amazon EC2 capacity reservation pools. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html#create-cr-group"
     *        >Working with capacity reservation groups</a> in the <i>EC2 Users Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupResult withGroupConfiguration(GroupConfiguration groupConfiguration) {
        setGroupConfiguration(groupConfiguration);
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
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup()).append(",");
        if (getResourceQuery() != null)
            sb.append("ResourceQuery: ").append(getResourceQuery()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getGroupConfiguration() != null)
            sb.append("GroupConfiguration: ").append(getGroupConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGroupResult == false)
            return false;
        CreateGroupResult other = (CreateGroupResult) obj;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getResourceQuery() == null ^ this.getResourceQuery() == null)
            return false;
        if (other.getResourceQuery() != null && other.getResourceQuery().equals(this.getResourceQuery()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getGroupConfiguration() == null ^ this.getGroupConfiguration() == null)
            return false;
        if (other.getGroupConfiguration() != null && other.getGroupConfiguration().equals(this.getGroupConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getResourceQuery() == null) ? 0 : getResourceQuery().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getGroupConfiguration() == null) ? 0 : getGroupConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateGroupResult clone() {
        try {
            return (CreateGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

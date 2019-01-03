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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateThingGroupsForThingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The thing whose group memberships will be updated.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The groups to which the thing will be added.
     * </p>
     */
    private java.util.List<String> thingGroupsToAdd;
    /**
     * <p>
     * The groups from which the thing will be removed.
     * </p>
     */
    private java.util.List<String> thingGroupsToRemove;
    /**
     * <p>
     * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10
     * thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes
     * the thing from the last dynamic group.
     * </p>
     */
    private Boolean overrideDynamicGroups;

    /**
     * <p>
     * The thing whose group memberships will be updated.
     * </p>
     * 
     * @param thingName
     *        The thing whose group memberships will be updated.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The thing whose group memberships will be updated.
     * </p>
     * 
     * @return The thing whose group memberships will be updated.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The thing whose group memberships will be updated.
     * </p>
     * 
     * @param thingName
     *        The thing whose group memberships will be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThingGroupsForThingRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The groups to which the thing will be added.
     * </p>
     * 
     * @return The groups to which the thing will be added.
     */

    public java.util.List<String> getThingGroupsToAdd() {
        return thingGroupsToAdd;
    }

    /**
     * <p>
     * The groups to which the thing will be added.
     * </p>
     * 
     * @param thingGroupsToAdd
     *        The groups to which the thing will be added.
     */

    public void setThingGroupsToAdd(java.util.Collection<String> thingGroupsToAdd) {
        if (thingGroupsToAdd == null) {
            this.thingGroupsToAdd = null;
            return;
        }

        this.thingGroupsToAdd = new java.util.ArrayList<String>(thingGroupsToAdd);
    }

    /**
     * <p>
     * The groups to which the thing will be added.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThingGroupsToAdd(java.util.Collection)} or {@link #withThingGroupsToAdd(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param thingGroupsToAdd
     *        The groups to which the thing will be added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThingGroupsForThingRequest withThingGroupsToAdd(String... thingGroupsToAdd) {
        if (this.thingGroupsToAdd == null) {
            setThingGroupsToAdd(new java.util.ArrayList<String>(thingGroupsToAdd.length));
        }
        for (String ele : thingGroupsToAdd) {
            this.thingGroupsToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The groups to which the thing will be added.
     * </p>
     * 
     * @param thingGroupsToAdd
     *        The groups to which the thing will be added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThingGroupsForThingRequest withThingGroupsToAdd(java.util.Collection<String> thingGroupsToAdd) {
        setThingGroupsToAdd(thingGroupsToAdd);
        return this;
    }

    /**
     * <p>
     * The groups from which the thing will be removed.
     * </p>
     * 
     * @return The groups from which the thing will be removed.
     */

    public java.util.List<String> getThingGroupsToRemove() {
        return thingGroupsToRemove;
    }

    /**
     * <p>
     * The groups from which the thing will be removed.
     * </p>
     * 
     * @param thingGroupsToRemove
     *        The groups from which the thing will be removed.
     */

    public void setThingGroupsToRemove(java.util.Collection<String> thingGroupsToRemove) {
        if (thingGroupsToRemove == null) {
            this.thingGroupsToRemove = null;
            return;
        }

        this.thingGroupsToRemove = new java.util.ArrayList<String>(thingGroupsToRemove);
    }

    /**
     * <p>
     * The groups from which the thing will be removed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThingGroupsToRemove(java.util.Collection)} or {@link #withThingGroupsToRemove(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param thingGroupsToRemove
     *        The groups from which the thing will be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThingGroupsForThingRequest withThingGroupsToRemove(String... thingGroupsToRemove) {
        if (this.thingGroupsToRemove == null) {
            setThingGroupsToRemove(new java.util.ArrayList<String>(thingGroupsToRemove.length));
        }
        for (String ele : thingGroupsToRemove) {
            this.thingGroupsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The groups from which the thing will be removed.
     * </p>
     * 
     * @param thingGroupsToRemove
     *        The groups from which the thing will be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThingGroupsForThingRequest withThingGroupsToRemove(java.util.Collection<String> thingGroupsToRemove) {
        setThingGroupsToRemove(thingGroupsToRemove);
        return this;
    }

    /**
     * <p>
     * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10
     * thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes
     * the thing from the last dynamic group.
     * </p>
     * 
     * @param overrideDynamicGroups
     *        Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs
     *        to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static
     *        group removes the thing from the last dynamic group.
     */

    public void setOverrideDynamicGroups(Boolean overrideDynamicGroups) {
        this.overrideDynamicGroups = overrideDynamicGroups;
    }

    /**
     * <p>
     * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10
     * thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes
     * the thing from the last dynamic group.
     * </p>
     * 
     * @return Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs
     *         to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static
     *         group removes the thing from the last dynamic group.
     */

    public Boolean getOverrideDynamicGroups() {
        return this.overrideDynamicGroups;
    }

    /**
     * <p>
     * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10
     * thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes
     * the thing from the last dynamic group.
     * </p>
     * 
     * @param overrideDynamicGroups
     *        Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs
     *        to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static
     *        group removes the thing from the last dynamic group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThingGroupsForThingRequest withOverrideDynamicGroups(Boolean overrideDynamicGroups) {
        setOverrideDynamicGroups(overrideDynamicGroups);
        return this;
    }

    /**
     * <p>
     * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10
     * thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes
     * the thing from the last dynamic group.
     * </p>
     * 
     * @return Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs
     *         to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static
     *         group removes the thing from the last dynamic group.
     */

    public Boolean isOverrideDynamicGroups() {
        return this.overrideDynamicGroups;
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
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getThingGroupsToAdd() != null)
            sb.append("ThingGroupsToAdd: ").append(getThingGroupsToAdd()).append(",");
        if (getThingGroupsToRemove() != null)
            sb.append("ThingGroupsToRemove: ").append(getThingGroupsToRemove()).append(",");
        if (getOverrideDynamicGroups() != null)
            sb.append("OverrideDynamicGroups: ").append(getOverrideDynamicGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateThingGroupsForThingRequest == false)
            return false;
        UpdateThingGroupsForThingRequest other = (UpdateThingGroupsForThingRequest) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getThingGroupsToAdd() == null ^ this.getThingGroupsToAdd() == null)
            return false;
        if (other.getThingGroupsToAdd() != null && other.getThingGroupsToAdd().equals(this.getThingGroupsToAdd()) == false)
            return false;
        if (other.getThingGroupsToRemove() == null ^ this.getThingGroupsToRemove() == null)
            return false;
        if (other.getThingGroupsToRemove() != null && other.getThingGroupsToRemove().equals(this.getThingGroupsToRemove()) == false)
            return false;
        if (other.getOverrideDynamicGroups() == null ^ this.getOverrideDynamicGroups() == null)
            return false;
        if (other.getOverrideDynamicGroups() != null && other.getOverrideDynamicGroups().equals(this.getOverrideDynamicGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getThingGroupsToAdd() == null) ? 0 : getThingGroupsToAdd().hashCode());
        hashCode = prime * hashCode + ((getThingGroupsToRemove() == null) ? 0 : getThingGroupsToRemove().hashCode());
        hashCode = prime * hashCode + ((getOverrideDynamicGroups() == null) ? 0 : getOverrideDynamicGroups().hashCode());
        return hashCode;
    }

    @Override
    public UpdateThingGroupsForThingRequest clone() {
        return (UpdateThingGroupsForThingRequest) super.clone();
    }

}

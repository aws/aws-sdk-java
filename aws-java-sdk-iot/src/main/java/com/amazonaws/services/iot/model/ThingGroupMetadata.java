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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Thing group metadata.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThingGroupMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parent thing group name.
     * </p>
     */
    private String parentGroupName;
    /**
     * <p>
     * The root parent thing group.
     * </p>
     */
    private java.util.List<GroupNameAndArn> rootToParentThingGroups;
    /**
     * <p>
     * The UNIX timestamp of when the thing group was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The parent thing group name.
     * </p>
     * 
     * @param parentGroupName
     *        The parent thing group name.
     */

    public void setParentGroupName(String parentGroupName) {
        this.parentGroupName = parentGroupName;
    }

    /**
     * <p>
     * The parent thing group name.
     * </p>
     * 
     * @return The parent thing group name.
     */

    public String getParentGroupName() {
        return this.parentGroupName;
    }

    /**
     * <p>
     * The parent thing group name.
     * </p>
     * 
     * @param parentGroupName
     *        The parent thing group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingGroupMetadata withParentGroupName(String parentGroupName) {
        setParentGroupName(parentGroupName);
        return this;
    }

    /**
     * <p>
     * The root parent thing group.
     * </p>
     * 
     * @return The root parent thing group.
     */

    public java.util.List<GroupNameAndArn> getRootToParentThingGroups() {
        return rootToParentThingGroups;
    }

    /**
     * <p>
     * The root parent thing group.
     * </p>
     * 
     * @param rootToParentThingGroups
     *        The root parent thing group.
     */

    public void setRootToParentThingGroups(java.util.Collection<GroupNameAndArn> rootToParentThingGroups) {
        if (rootToParentThingGroups == null) {
            this.rootToParentThingGroups = null;
            return;
        }

        this.rootToParentThingGroups = new java.util.ArrayList<GroupNameAndArn>(rootToParentThingGroups);
    }

    /**
     * <p>
     * The root parent thing group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRootToParentThingGroups(java.util.Collection)} or
     * {@link #withRootToParentThingGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param rootToParentThingGroups
     *        The root parent thing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingGroupMetadata withRootToParentThingGroups(GroupNameAndArn... rootToParentThingGroups) {
        if (this.rootToParentThingGroups == null) {
            setRootToParentThingGroups(new java.util.ArrayList<GroupNameAndArn>(rootToParentThingGroups.length));
        }
        for (GroupNameAndArn ele : rootToParentThingGroups) {
            this.rootToParentThingGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The root parent thing group.
     * </p>
     * 
     * @param rootToParentThingGroups
     *        The root parent thing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingGroupMetadata withRootToParentThingGroups(java.util.Collection<GroupNameAndArn> rootToParentThingGroups) {
        setRootToParentThingGroups(rootToParentThingGroups);
        return this;
    }

    /**
     * <p>
     * The UNIX timestamp of when the thing group was created.
     * </p>
     * 
     * @param creationDate
     *        The UNIX timestamp of when the thing group was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the thing group was created.
     * </p>
     * 
     * @return The UNIX timestamp of when the thing group was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the thing group was created.
     * </p>
     * 
     * @param creationDate
     *        The UNIX timestamp of when the thing group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingGroupMetadata withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getParentGroupName() != null)
            sb.append("ParentGroupName: ").append(getParentGroupName()).append(",");
        if (getRootToParentThingGroups() != null)
            sb.append("RootToParentThingGroups: ").append(getRootToParentThingGroups()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingGroupMetadata == false)
            return false;
        ThingGroupMetadata other = (ThingGroupMetadata) obj;
        if (other.getParentGroupName() == null ^ this.getParentGroupName() == null)
            return false;
        if (other.getParentGroupName() != null && other.getParentGroupName().equals(this.getParentGroupName()) == false)
            return false;
        if (other.getRootToParentThingGroups() == null ^ this.getRootToParentThingGroups() == null)
            return false;
        if (other.getRootToParentThingGroups() != null && other.getRootToParentThingGroups().equals(this.getRootToParentThingGroups()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParentGroupName() == null) ? 0 : getParentGroupName().hashCode());
        hashCode = prime * hashCode + ((getRootToParentThingGroups() == null) ? 0 : getRootToParentThingGroups().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public ThingGroupMetadata clone() {
        try {
            return (ThingGroupMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ThingGroupMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

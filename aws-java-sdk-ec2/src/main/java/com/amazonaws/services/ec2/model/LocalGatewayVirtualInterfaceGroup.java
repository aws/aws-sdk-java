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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a local gateway virtual interface group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LocalGatewayVirtualInterfaceGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocalGatewayVirtualInterfaceGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     */
    private String localGatewayVirtualInterfaceGroupId;
    /**
     * <p>
     * The IDs of the virtual interfaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> localGatewayVirtualInterfaceIds;
    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     */
    private String localGatewayId;
    /**
     * <p>
     * The tags assigned to the virtual interface group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceGroupId
     *        The ID of the virtual interface group.
     */

    public void setLocalGatewayVirtualInterfaceGroupId(String localGatewayVirtualInterfaceGroupId) {
        this.localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId;
    }

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     * 
     * @return The ID of the virtual interface group.
     */

    public String getLocalGatewayVirtualInterfaceGroupId() {
        return this.localGatewayVirtualInterfaceGroupId;
    }

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceGroupId
     *        The ID of the virtual interface group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayVirtualInterfaceGroup withLocalGatewayVirtualInterfaceGroupId(String localGatewayVirtualInterfaceGroupId) {
        setLocalGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId);
        return this;
    }

    /**
     * <p>
     * The IDs of the virtual interfaces.
     * </p>
     * 
     * @return The IDs of the virtual interfaces.
     */

    public java.util.List<String> getLocalGatewayVirtualInterfaceIds() {
        if (localGatewayVirtualInterfaceIds == null) {
            localGatewayVirtualInterfaceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return localGatewayVirtualInterfaceIds;
    }

    /**
     * <p>
     * The IDs of the virtual interfaces.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceIds
     *        The IDs of the virtual interfaces.
     */

    public void setLocalGatewayVirtualInterfaceIds(java.util.Collection<String> localGatewayVirtualInterfaceIds) {
        if (localGatewayVirtualInterfaceIds == null) {
            this.localGatewayVirtualInterfaceIds = null;
            return;
        }

        this.localGatewayVirtualInterfaceIds = new com.amazonaws.internal.SdkInternalList<String>(localGatewayVirtualInterfaceIds);
    }

    /**
     * <p>
     * The IDs of the virtual interfaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocalGatewayVirtualInterfaceIds(java.util.Collection)} or
     * {@link #withLocalGatewayVirtualInterfaceIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceIds
     *        The IDs of the virtual interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayVirtualInterfaceGroup withLocalGatewayVirtualInterfaceIds(String... localGatewayVirtualInterfaceIds) {
        if (this.localGatewayVirtualInterfaceIds == null) {
            setLocalGatewayVirtualInterfaceIds(new com.amazonaws.internal.SdkInternalList<String>(localGatewayVirtualInterfaceIds.length));
        }
        for (String ele : localGatewayVirtualInterfaceIds) {
            this.localGatewayVirtualInterfaceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the virtual interfaces.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceIds
     *        The IDs of the virtual interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayVirtualInterfaceGroup withLocalGatewayVirtualInterfaceIds(java.util.Collection<String> localGatewayVirtualInterfaceIds) {
        setLocalGatewayVirtualInterfaceIds(localGatewayVirtualInterfaceIds);
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * 
     * @param localGatewayId
     *        The ID of the local gateway.
     */

    public void setLocalGatewayId(String localGatewayId) {
        this.localGatewayId = localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * 
     * @return The ID of the local gateway.
     */

    public String getLocalGatewayId() {
        return this.localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * 
     * @param localGatewayId
     *        The ID of the local gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayVirtualInterfaceGroup withLocalGatewayId(String localGatewayId) {
        setLocalGatewayId(localGatewayId);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the virtual interface group.
     * </p>
     * 
     * @return The tags assigned to the virtual interface group.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the virtual interface group.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the virtual interface group.
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
     * The tags assigned to the virtual interface group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the virtual interface group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayVirtualInterfaceGroup withTags(Tag... tags) {
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
     * The tags assigned to the virtual interface group.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the virtual interface group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayVirtualInterfaceGroup withTags(java.util.Collection<Tag> tags) {
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
        if (getLocalGatewayVirtualInterfaceGroupId() != null)
            sb.append("LocalGatewayVirtualInterfaceGroupId: ").append(getLocalGatewayVirtualInterfaceGroupId()).append(",");
        if (getLocalGatewayVirtualInterfaceIds() != null)
            sb.append("LocalGatewayVirtualInterfaceIds: ").append(getLocalGatewayVirtualInterfaceIds()).append(",");
        if (getLocalGatewayId() != null)
            sb.append("LocalGatewayId: ").append(getLocalGatewayId()).append(",");
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

        if (obj instanceof LocalGatewayVirtualInterfaceGroup == false)
            return false;
        LocalGatewayVirtualInterfaceGroup other = (LocalGatewayVirtualInterfaceGroup) obj;
        if (other.getLocalGatewayVirtualInterfaceGroupId() == null ^ this.getLocalGatewayVirtualInterfaceGroupId() == null)
            return false;
        if (other.getLocalGatewayVirtualInterfaceGroupId() != null
                && other.getLocalGatewayVirtualInterfaceGroupId().equals(this.getLocalGatewayVirtualInterfaceGroupId()) == false)
            return false;
        if (other.getLocalGatewayVirtualInterfaceIds() == null ^ this.getLocalGatewayVirtualInterfaceIds() == null)
            return false;
        if (other.getLocalGatewayVirtualInterfaceIds() != null
                && other.getLocalGatewayVirtualInterfaceIds().equals(this.getLocalGatewayVirtualInterfaceIds()) == false)
            return false;
        if (other.getLocalGatewayId() == null ^ this.getLocalGatewayId() == null)
            return false;
        if (other.getLocalGatewayId() != null && other.getLocalGatewayId().equals(this.getLocalGatewayId()) == false)
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

        hashCode = prime * hashCode + ((getLocalGatewayVirtualInterfaceGroupId() == null) ? 0 : getLocalGatewayVirtualInterfaceGroupId().hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayVirtualInterfaceIds() == null) ? 0 : getLocalGatewayVirtualInterfaceIds().hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayId() == null) ? 0 : getLocalGatewayId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public LocalGatewayVirtualInterfaceGroup clone() {
        try {
            return (LocalGatewayVirtualInterfaceGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

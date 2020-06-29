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
 * Describes a managed prefix list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ManagedPrefixList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedPrefixList implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     */
    private String prefixListId;
    /**
     * <p>
     * The IP address version.
     * </p>
     */
    private String addressFamily;
    /**
     * <p>
     * The state of the prefix list.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The state message.
     * </p>
     */
    private String stateMessage;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the prefix list.
     * </p>
     */
    private String prefixListArn;
    /**
     * <p>
     * The name of the prefix list.
     * </p>
     */
    private String prefixListName;
    /**
     * <p>
     * The maximum number of entries for the prefix list.
     * </p>
     */
    private Integer maxEntries;
    /**
     * <p>
     * The version of the prefix list.
     * </p>
     */
    private Long version;
    /**
     * <p>
     * The tags for the prefix list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The ID of the owner of the prefix list.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list.
     */

    public void setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @return The ID of the prefix list.
     */

    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedPrefixList withPrefixListId(String prefixListId) {
        setPrefixListId(prefixListId);
        return this;
    }

    /**
     * <p>
     * The IP address version.
     * </p>
     * 
     * @param addressFamily
     *        The IP address version.
     */

    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    /**
     * <p>
     * The IP address version.
     * </p>
     * 
     * @return The IP address version.
     */

    public String getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * <p>
     * The IP address version.
     * </p>
     * 
     * @param addressFamily
     *        The IP address version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedPrefixList withAddressFamily(String addressFamily) {
        setAddressFamily(addressFamily);
        return this;
    }

    /**
     * <p>
     * The state of the prefix list.
     * </p>
     * 
     * @param state
     *        The state of the prefix list.
     * @see PrefixListState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the prefix list.
     * </p>
     * 
     * @return The state of the prefix list.
     * @see PrefixListState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the prefix list.
     * </p>
     * 
     * @param state
     *        The state of the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrefixListState
     */

    public ManagedPrefixList withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the prefix list.
     * </p>
     * 
     * @param state
     *        The state of the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrefixListState
     */

    public ManagedPrefixList withState(PrefixListState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The state message.
     * </p>
     * 
     * @param stateMessage
     *        The state message.
     */

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    /**
     * <p>
     * The state message.
     * </p>
     * 
     * @return The state message.
     */

    public String getStateMessage() {
        return this.stateMessage;
    }

    /**
     * <p>
     * The state message.
     * </p>
     * 
     * @param stateMessage
     *        The state message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedPrefixList withStateMessage(String stateMessage) {
        setStateMessage(stateMessage);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the prefix list.
     * </p>
     * 
     * @param prefixListArn
     *        The Amazon Resource Name (ARN) for the prefix list.
     */

    public void setPrefixListArn(String prefixListArn) {
        this.prefixListArn = prefixListArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the prefix list.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the prefix list.
     */

    public String getPrefixListArn() {
        return this.prefixListArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the prefix list.
     * </p>
     * 
     * @param prefixListArn
     *        The Amazon Resource Name (ARN) for the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedPrefixList withPrefixListArn(String prefixListArn) {
        setPrefixListArn(prefixListArn);
        return this;
    }

    /**
     * <p>
     * The name of the prefix list.
     * </p>
     * 
     * @param prefixListName
     *        The name of the prefix list.
     */

    public void setPrefixListName(String prefixListName) {
        this.prefixListName = prefixListName;
    }

    /**
     * <p>
     * The name of the prefix list.
     * </p>
     * 
     * @return The name of the prefix list.
     */

    public String getPrefixListName() {
        return this.prefixListName;
    }

    /**
     * <p>
     * The name of the prefix list.
     * </p>
     * 
     * @param prefixListName
     *        The name of the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedPrefixList withPrefixListName(String prefixListName) {
        setPrefixListName(prefixListName);
        return this;
    }

    /**
     * <p>
     * The maximum number of entries for the prefix list.
     * </p>
     * 
     * @param maxEntries
     *        The maximum number of entries for the prefix list.
     */

    public void setMaxEntries(Integer maxEntries) {
        this.maxEntries = maxEntries;
    }

    /**
     * <p>
     * The maximum number of entries for the prefix list.
     * </p>
     * 
     * @return The maximum number of entries for the prefix list.
     */

    public Integer getMaxEntries() {
        return this.maxEntries;
    }

    /**
     * <p>
     * The maximum number of entries for the prefix list.
     * </p>
     * 
     * @param maxEntries
     *        The maximum number of entries for the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedPrefixList withMaxEntries(Integer maxEntries) {
        setMaxEntries(maxEntries);
        return this;
    }

    /**
     * <p>
     * The version of the prefix list.
     * </p>
     * 
     * @param version
     *        The version of the prefix list.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the prefix list.
     * </p>
     * 
     * @return The version of the prefix list.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the prefix list.
     * </p>
     * 
     * @param version
     *        The version of the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedPrefixList withVersion(Long version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The tags for the prefix list.
     * </p>
     * 
     * @return The tags for the prefix list.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags for the prefix list.
     * </p>
     * 
     * @param tags
     *        The tags for the prefix list.
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
     * The tags for the prefix list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedPrefixList withTags(Tag... tags) {
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
     * The tags for the prefix list.
     * </p>
     * 
     * @param tags
     *        The tags for the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedPrefixList withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the owner of the prefix list.
     * </p>
     * 
     * @param ownerId
     *        The ID of the owner of the prefix list.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the owner of the prefix list.
     * </p>
     * 
     * @return The ID of the owner of the prefix list.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the owner of the prefix list.
     * </p>
     * 
     * @param ownerId
     *        The ID of the owner of the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedPrefixList withOwnerId(String ownerId) {
        setOwnerId(ownerId);
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
        if (getPrefixListId() != null)
            sb.append("PrefixListId: ").append(getPrefixListId()).append(",");
        if (getAddressFamily() != null)
            sb.append("AddressFamily: ").append(getAddressFamily()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateMessage() != null)
            sb.append("StateMessage: ").append(getStateMessage()).append(",");
        if (getPrefixListArn() != null)
            sb.append("PrefixListArn: ").append(getPrefixListArn()).append(",");
        if (getPrefixListName() != null)
            sb.append("PrefixListName: ").append(getPrefixListName()).append(",");
        if (getMaxEntries() != null)
            sb.append("MaxEntries: ").append(getMaxEntries()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedPrefixList == false)
            return false;
        ManagedPrefixList other = (ManagedPrefixList) obj;
        if (other.getPrefixListId() == null ^ this.getPrefixListId() == null)
            return false;
        if (other.getPrefixListId() != null && other.getPrefixListId().equals(this.getPrefixListId()) == false)
            return false;
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null && other.getAddressFamily().equals(this.getAddressFamily()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateMessage() == null ^ this.getStateMessage() == null)
            return false;
        if (other.getStateMessage() != null && other.getStateMessage().equals(this.getStateMessage()) == false)
            return false;
        if (other.getPrefixListArn() == null ^ this.getPrefixListArn() == null)
            return false;
        if (other.getPrefixListArn() != null && other.getPrefixListArn().equals(this.getPrefixListArn()) == false)
            return false;
        if (other.getPrefixListName() == null ^ this.getPrefixListName() == null)
            return false;
        if (other.getPrefixListName() != null && other.getPrefixListName().equals(this.getPrefixListName()) == false)
            return false;
        if (other.getMaxEntries() == null ^ this.getMaxEntries() == null)
            return false;
        if (other.getMaxEntries() != null && other.getMaxEntries().equals(this.getMaxEntries()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefixListId() == null) ? 0 : getPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateMessage() == null) ? 0 : getStateMessage().hashCode());
        hashCode = prime * hashCode + ((getPrefixListArn() == null) ? 0 : getPrefixListArn().hashCode());
        hashCode = prime * hashCode + ((getPrefixListName() == null) ? 0 : getPrefixListName().hashCode());
        hashCode = prime * hashCode + ((getMaxEntries() == null) ? 0 : getMaxEntries().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        return hashCode;
    }

    @Override
    public ManagedPrefixList clone() {
        try {
            return (ManagedPrefixList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

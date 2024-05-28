/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The multi-party data share environment. The collaboration contains metadata about its purpose and participants.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/Collaboration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Collaboration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID for the collaboration.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The unique ARN for the collaboration.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A human-readable identifier provided by the collaboration owner. Display names are not unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the collaboration provided by the collaboration owner.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     * account ID.
     * </p>
     */
    private String creatorAccountId;
    /**
     * <p>
     * A display name of the collaboration creator.
     * </p>
     */
    private String creatorDisplayName;
    /**
     * <p>
     * The time when the collaboration was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The time the collaboration metadata was last updated.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * The status of a member in a collaboration.
     * </p>
     */
    private String memberStatus;
    /**
     * <p>
     * The unique ID for your membership within the collaboration.
     * </p>
     */
    private String membershipId;
    /**
     * <p>
     * The unique ARN for your membership within the collaboration.
     * </p>
     */
    private String membershipArn;
    /**
     * <p>
     * The settings for client-side encryption for cryptographic computing.
     * </p>
     */
    private DataEncryptionMetadata dataEncryptionMetadata;
    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * </p>
     */
    private String queryLogStatus;

    /**
     * <p>
     * The unique ID for the collaboration.
     * </p>
     * 
     * @param id
     *        The unique ID for the collaboration.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID for the collaboration.
     * </p>
     * 
     * @return The unique ID for the collaboration.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID for the collaboration.
     * </p>
     * 
     * @param id
     *        The unique ID for the collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collaboration withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The unique ARN for the collaboration.
     * </p>
     * 
     * @param arn
     *        The unique ARN for the collaboration.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The unique ARN for the collaboration.
     * </p>
     * 
     * @return The unique ARN for the collaboration.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The unique ARN for the collaboration.
     * </p>
     * 
     * @param arn
     *        The unique ARN for the collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collaboration withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A human-readable identifier provided by the collaboration owner. Display names are not unique.
     * </p>
     * 
     * @param name
     *        A human-readable identifier provided by the collaboration owner. Display names are not unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A human-readable identifier provided by the collaboration owner. Display names are not unique.
     * </p>
     * 
     * @return A human-readable identifier provided by the collaboration owner. Display names are not unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A human-readable identifier provided by the collaboration owner. Display names are not unique.
     * </p>
     * 
     * @param name
     *        A human-readable identifier provided by the collaboration owner. Display names are not unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collaboration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the collaboration provided by the collaboration owner.
     * </p>
     * 
     * @param description
     *        A description of the collaboration provided by the collaboration owner.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the collaboration provided by the collaboration owner.
     * </p>
     * 
     * @return A description of the collaboration provided by the collaboration owner.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the collaboration provided by the collaboration owner.
     * </p>
     * 
     * @param description
     *        A description of the collaboration provided by the collaboration owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collaboration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     * account ID.
     * </p>
     * 
     * @param creatorAccountId
     *        The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     *        account ID.
     */

    public void setCreatorAccountId(String creatorAccountId) {
        this.creatorAccountId = creatorAccountId;
    }

    /**
     * <p>
     * The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     * account ID.
     * </p>
     * 
     * @return The identifier used to reference members of the collaboration. Currently only supports Amazon Web
     *         Services account ID.
     */

    public String getCreatorAccountId() {
        return this.creatorAccountId;
    }

    /**
     * <p>
     * The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     * account ID.
     * </p>
     * 
     * @param creatorAccountId
     *        The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     *        account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collaboration withCreatorAccountId(String creatorAccountId) {
        setCreatorAccountId(creatorAccountId);
        return this;
    }

    /**
     * <p>
     * A display name of the collaboration creator.
     * </p>
     * 
     * @param creatorDisplayName
     *        A display name of the collaboration creator.
     */

    public void setCreatorDisplayName(String creatorDisplayName) {
        this.creatorDisplayName = creatorDisplayName;
    }

    /**
     * <p>
     * A display name of the collaboration creator.
     * </p>
     * 
     * @return A display name of the collaboration creator.
     */

    public String getCreatorDisplayName() {
        return this.creatorDisplayName;
    }

    /**
     * <p>
     * A display name of the collaboration creator.
     * </p>
     * 
     * @param creatorDisplayName
     *        A display name of the collaboration creator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collaboration withCreatorDisplayName(String creatorDisplayName) {
        setCreatorDisplayName(creatorDisplayName);
        return this;
    }

    /**
     * <p>
     * The time when the collaboration was created.
     * </p>
     * 
     * @param createTime
     *        The time when the collaboration was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time when the collaboration was created.
     * </p>
     * 
     * @return The time when the collaboration was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time when the collaboration was created.
     * </p>
     * 
     * @param createTime
     *        The time when the collaboration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collaboration withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The time the collaboration metadata was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the collaboration metadata was last updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time the collaboration metadata was last updated.
     * </p>
     * 
     * @return The time the collaboration metadata was last updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time the collaboration metadata was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the collaboration metadata was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collaboration withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * The status of a member in a collaboration.
     * </p>
     * 
     * @param memberStatus
     *        The status of a member in a collaboration.
     * @see MemberStatus
     */

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    /**
     * <p>
     * The status of a member in a collaboration.
     * </p>
     * 
     * @return The status of a member in a collaboration.
     * @see MemberStatus
     */

    public String getMemberStatus() {
        return this.memberStatus;
    }

    /**
     * <p>
     * The status of a member in a collaboration.
     * </p>
     * 
     * @param memberStatus
     *        The status of a member in a collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberStatus
     */

    public Collaboration withMemberStatus(String memberStatus) {
        setMemberStatus(memberStatus);
        return this;
    }

    /**
     * <p>
     * The status of a member in a collaboration.
     * </p>
     * 
     * @param memberStatus
     *        The status of a member in a collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberStatus
     */

    public Collaboration withMemberStatus(MemberStatus memberStatus) {
        this.memberStatus = memberStatus.toString();
        return this;
    }

    /**
     * <p>
     * The unique ID for your membership within the collaboration.
     * </p>
     * 
     * @param membershipId
     *        The unique ID for your membership within the collaboration.
     */

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    /**
     * <p>
     * The unique ID for your membership within the collaboration.
     * </p>
     * 
     * @return The unique ID for your membership within the collaboration.
     */

    public String getMembershipId() {
        return this.membershipId;
    }

    /**
     * <p>
     * The unique ID for your membership within the collaboration.
     * </p>
     * 
     * @param membershipId
     *        The unique ID for your membership within the collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collaboration withMembershipId(String membershipId) {
        setMembershipId(membershipId);
        return this;
    }

    /**
     * <p>
     * The unique ARN for your membership within the collaboration.
     * </p>
     * 
     * @param membershipArn
     *        The unique ARN for your membership within the collaboration.
     */

    public void setMembershipArn(String membershipArn) {
        this.membershipArn = membershipArn;
    }

    /**
     * <p>
     * The unique ARN for your membership within the collaboration.
     * </p>
     * 
     * @return The unique ARN for your membership within the collaboration.
     */

    public String getMembershipArn() {
        return this.membershipArn;
    }

    /**
     * <p>
     * The unique ARN for your membership within the collaboration.
     * </p>
     * 
     * @param membershipArn
     *        The unique ARN for your membership within the collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collaboration withMembershipArn(String membershipArn) {
        setMembershipArn(membershipArn);
        return this;
    }

    /**
     * <p>
     * The settings for client-side encryption for cryptographic computing.
     * </p>
     * 
     * @param dataEncryptionMetadata
     *        The settings for client-side encryption for cryptographic computing.
     */

    public void setDataEncryptionMetadata(DataEncryptionMetadata dataEncryptionMetadata) {
        this.dataEncryptionMetadata = dataEncryptionMetadata;
    }

    /**
     * <p>
     * The settings for client-side encryption for cryptographic computing.
     * </p>
     * 
     * @return The settings for client-side encryption for cryptographic computing.
     */

    public DataEncryptionMetadata getDataEncryptionMetadata() {
        return this.dataEncryptionMetadata;
    }

    /**
     * <p>
     * The settings for client-side encryption for cryptographic computing.
     * </p>
     * 
     * @param dataEncryptionMetadata
     *        The settings for client-side encryption for cryptographic computing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collaboration withDataEncryptionMetadata(DataEncryptionMetadata dataEncryptionMetadata) {
        setDataEncryptionMetadata(dataEncryptionMetadata);
        return this;
    }

    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * </p>
     * 
     * @param queryLogStatus
     *        An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * @see CollaborationQueryLogStatus
     */

    public void setQueryLogStatus(String queryLogStatus) {
        this.queryLogStatus = queryLogStatus;
    }

    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * </p>
     * 
     * @return An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * @see CollaborationQueryLogStatus
     */

    public String getQueryLogStatus() {
        return this.queryLogStatus;
    }

    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * </p>
     * 
     * @param queryLogStatus
     *        An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CollaborationQueryLogStatus
     */

    public Collaboration withQueryLogStatus(String queryLogStatus) {
        setQueryLogStatus(queryLogStatus);
        return this;
    }

    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * </p>
     * 
     * @param queryLogStatus
     *        An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CollaborationQueryLogStatus
     */

    public Collaboration withQueryLogStatus(CollaborationQueryLogStatus queryLogStatus) {
        this.queryLogStatus = queryLogStatus.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatorAccountId() != null)
            sb.append("CreatorAccountId: ").append(getCreatorAccountId()).append(",");
        if (getCreatorDisplayName() != null)
            sb.append("CreatorDisplayName: ").append(getCreatorDisplayName()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getMemberStatus() != null)
            sb.append("MemberStatus: ").append(getMemberStatus()).append(",");
        if (getMembershipId() != null)
            sb.append("MembershipId: ").append(getMembershipId()).append(",");
        if (getMembershipArn() != null)
            sb.append("MembershipArn: ").append(getMembershipArn()).append(",");
        if (getDataEncryptionMetadata() != null)
            sb.append("DataEncryptionMetadata: ").append(getDataEncryptionMetadata()).append(",");
        if (getQueryLogStatus() != null)
            sb.append("QueryLogStatus: ").append(getQueryLogStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Collaboration == false)
            return false;
        Collaboration other = (Collaboration) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatorAccountId() == null ^ this.getCreatorAccountId() == null)
            return false;
        if (other.getCreatorAccountId() != null && other.getCreatorAccountId().equals(this.getCreatorAccountId()) == false)
            return false;
        if (other.getCreatorDisplayName() == null ^ this.getCreatorDisplayName() == null)
            return false;
        if (other.getCreatorDisplayName() != null && other.getCreatorDisplayName().equals(this.getCreatorDisplayName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getMemberStatus() == null ^ this.getMemberStatus() == null)
            return false;
        if (other.getMemberStatus() != null && other.getMemberStatus().equals(this.getMemberStatus()) == false)
            return false;
        if (other.getMembershipId() == null ^ this.getMembershipId() == null)
            return false;
        if (other.getMembershipId() != null && other.getMembershipId().equals(this.getMembershipId()) == false)
            return false;
        if (other.getMembershipArn() == null ^ this.getMembershipArn() == null)
            return false;
        if (other.getMembershipArn() != null && other.getMembershipArn().equals(this.getMembershipArn()) == false)
            return false;
        if (other.getDataEncryptionMetadata() == null ^ this.getDataEncryptionMetadata() == null)
            return false;
        if (other.getDataEncryptionMetadata() != null && other.getDataEncryptionMetadata().equals(this.getDataEncryptionMetadata()) == false)
            return false;
        if (other.getQueryLogStatus() == null ^ this.getQueryLogStatus() == null)
            return false;
        if (other.getQueryLogStatus() != null && other.getQueryLogStatus().equals(this.getQueryLogStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatorAccountId() == null) ? 0 : getCreatorAccountId().hashCode());
        hashCode = prime * hashCode + ((getCreatorDisplayName() == null) ? 0 : getCreatorDisplayName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getMemberStatus() == null) ? 0 : getMemberStatus().hashCode());
        hashCode = prime * hashCode + ((getMembershipId() == null) ? 0 : getMembershipId().hashCode());
        hashCode = prime * hashCode + ((getMembershipArn() == null) ? 0 : getMembershipArn().hashCode());
        hashCode = prime * hashCode + ((getDataEncryptionMetadata() == null) ? 0 : getDataEncryptionMetadata().hashCode());
        hashCode = prime * hashCode + ((getQueryLogStatus() == null) ? 0 : getQueryLogStatus().hashCode());
        return hashCode;
    }

    @Override
    public Collaboration clone() {
        try {
            return (Collaboration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.CollaborationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

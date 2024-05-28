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
 * The metadata of the collaboration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CollaborationSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollaborationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the collaboration.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN of the collaboration.
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
     * The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     * account ID.
     * </p>
     */
    private String creatorAccountId;
    /**
     * <p>
     * The display name of the collaboration creator.
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
     * The identifier of a member in a collaboration.
     * </p>
     */
    private String membershipId;
    /**
     * <p>
     * The ARN of a member in a collaboration.
     * </p>
     */
    private String membershipArn;

    /**
     * <p>
     * The identifier for the collaboration.
     * </p>
     * 
     * @param id
     *        The identifier for the collaboration.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the collaboration.
     * </p>
     * 
     * @return The identifier for the collaboration.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the collaboration.
     * </p>
     * 
     * @param id
     *        The identifier for the collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN of the collaboration.
     * </p>
     * 
     * @param arn
     *        The ARN of the collaboration.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the collaboration.
     * </p>
     * 
     * @return The ARN of the collaboration.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the collaboration.
     * </p>
     * 
     * @param arn
     *        The ARN of the collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationSummary withArn(String arn) {
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

    public CollaborationSummary withName(String name) {
        setName(name);
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

    public CollaborationSummary withCreatorAccountId(String creatorAccountId) {
        setCreatorAccountId(creatorAccountId);
        return this;
    }

    /**
     * <p>
     * The display name of the collaboration creator.
     * </p>
     * 
     * @param creatorDisplayName
     *        The display name of the collaboration creator.
     */

    public void setCreatorDisplayName(String creatorDisplayName) {
        this.creatorDisplayName = creatorDisplayName;
    }

    /**
     * <p>
     * The display name of the collaboration creator.
     * </p>
     * 
     * @return The display name of the collaboration creator.
     */

    public String getCreatorDisplayName() {
        return this.creatorDisplayName;
    }

    /**
     * <p>
     * The display name of the collaboration creator.
     * </p>
     * 
     * @param creatorDisplayName
     *        The display name of the collaboration creator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationSummary withCreatorDisplayName(String creatorDisplayName) {
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

    public CollaborationSummary withCreateTime(java.util.Date createTime) {
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

    public CollaborationSummary withUpdateTime(java.util.Date updateTime) {
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

    public CollaborationSummary withMemberStatus(String memberStatus) {
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

    public CollaborationSummary withMemberStatus(MemberStatus memberStatus) {
        this.memberStatus = memberStatus.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of a member in a collaboration.
     * </p>
     * 
     * @param membershipId
     *        The identifier of a member in a collaboration.
     */

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    /**
     * <p>
     * The identifier of a member in a collaboration.
     * </p>
     * 
     * @return The identifier of a member in a collaboration.
     */

    public String getMembershipId() {
        return this.membershipId;
    }

    /**
     * <p>
     * The identifier of a member in a collaboration.
     * </p>
     * 
     * @param membershipId
     *        The identifier of a member in a collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationSummary withMembershipId(String membershipId) {
        setMembershipId(membershipId);
        return this;
    }

    /**
     * <p>
     * The ARN of a member in a collaboration.
     * </p>
     * 
     * @param membershipArn
     *        The ARN of a member in a collaboration.
     */

    public void setMembershipArn(String membershipArn) {
        this.membershipArn = membershipArn;
    }

    /**
     * <p>
     * The ARN of a member in a collaboration.
     * </p>
     * 
     * @return The ARN of a member in a collaboration.
     */

    public String getMembershipArn() {
        return this.membershipArn;
    }

    /**
     * <p>
     * The ARN of a member in a collaboration.
     * </p>
     * 
     * @param membershipArn
     *        The ARN of a member in a collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationSummary withMembershipArn(String membershipArn) {
        setMembershipArn(membershipArn);
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
            sb.append("MembershipArn: ").append(getMembershipArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CollaborationSummary == false)
            return false;
        CollaborationSummary other = (CollaborationSummary) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreatorAccountId() == null) ? 0 : getCreatorAccountId().hashCode());
        hashCode = prime * hashCode + ((getCreatorDisplayName() == null) ? 0 : getCreatorDisplayName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getMemberStatus() == null) ? 0 : getMemberStatus().hashCode());
        hashCode = prime * hashCode + ((getMembershipId() == null) ? 0 : getMembershipId().hashCode());
        hashCode = prime * hashCode + ((getMembershipArn() == null) ? 0 : getMembershipArn().hashCode());
        return hashCode;
    }

    @Override
    public CollaborationSummary clone() {
        try {
            return (CollaborationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.CollaborationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

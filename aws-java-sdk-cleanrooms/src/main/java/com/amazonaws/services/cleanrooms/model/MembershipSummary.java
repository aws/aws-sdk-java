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
 * The membership object listed by the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/MembershipSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MembershipSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID for the membership's collaboration.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The unique ARN for the membership.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The unique ARN for the membership's associated collaboration.
     * </p>
     */
    private String collaborationArn;
    /**
     * <p>
     * The unique ID for the membership's collaboration.
     * </p>
     */
    private String collaborationId;
    /**
     * <p>
     * The identifier of the Amazon Web Services principal that created the collaboration. Currently only supports
     * Amazon Web Services account ID.
     * </p>
     */
    private String collaborationCreatorAccountId;
    /**
     * <p>
     * The display name of the collaboration creator.
     * </p>
     */
    private String collaborationCreatorDisplayName;
    /**
     * <p>
     * The name for the membership's collaboration.
     * </p>
     */
    private String collaborationName;
    /**
     * <p>
     * The time when the membership was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The time the membership metadata was last updated.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * The status of the membership.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The abilities granted to the collaboration member.
     * </p>
     */
    private java.util.List<String> memberAbilities;
    /**
     * <p>
     * The payment responsibilities accepted by the collaboration member.
     * </p>
     */
    private MembershipPaymentConfiguration paymentConfiguration;

    /**
     * <p>
     * The unique ID for the membership's collaboration.
     * </p>
     * 
     * @param id
     *        The unique ID for the membership's collaboration.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID for the membership's collaboration.
     * </p>
     * 
     * @return The unique ID for the membership's collaboration.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID for the membership's collaboration.
     * </p>
     * 
     * @param id
     *        The unique ID for the membership's collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MembershipSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The unique ARN for the membership.
     * </p>
     * 
     * @param arn
     *        The unique ARN for the membership.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The unique ARN for the membership.
     * </p>
     * 
     * @return The unique ARN for the membership.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The unique ARN for the membership.
     * </p>
     * 
     * @param arn
     *        The unique ARN for the membership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MembershipSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The unique ARN for the membership's associated collaboration.
     * </p>
     * 
     * @param collaborationArn
     *        The unique ARN for the membership's associated collaboration.
     */

    public void setCollaborationArn(String collaborationArn) {
        this.collaborationArn = collaborationArn;
    }

    /**
     * <p>
     * The unique ARN for the membership's associated collaboration.
     * </p>
     * 
     * @return The unique ARN for the membership's associated collaboration.
     */

    public String getCollaborationArn() {
        return this.collaborationArn;
    }

    /**
     * <p>
     * The unique ARN for the membership's associated collaboration.
     * </p>
     * 
     * @param collaborationArn
     *        The unique ARN for the membership's associated collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MembershipSummary withCollaborationArn(String collaborationArn) {
        setCollaborationArn(collaborationArn);
        return this;
    }

    /**
     * <p>
     * The unique ID for the membership's collaboration.
     * </p>
     * 
     * @param collaborationId
     *        The unique ID for the membership's collaboration.
     */

    public void setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
    }

    /**
     * <p>
     * The unique ID for the membership's collaboration.
     * </p>
     * 
     * @return The unique ID for the membership's collaboration.
     */

    public String getCollaborationId() {
        return this.collaborationId;
    }

    /**
     * <p>
     * The unique ID for the membership's collaboration.
     * </p>
     * 
     * @param collaborationId
     *        The unique ID for the membership's collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MembershipSummary withCollaborationId(String collaborationId) {
        setCollaborationId(collaborationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services principal that created the collaboration. Currently only supports
     * Amazon Web Services account ID.
     * </p>
     * 
     * @param collaborationCreatorAccountId
     *        The identifier of the Amazon Web Services principal that created the collaboration. Currently only
     *        supports Amazon Web Services account ID.
     */

    public void setCollaborationCreatorAccountId(String collaborationCreatorAccountId) {
        this.collaborationCreatorAccountId = collaborationCreatorAccountId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services principal that created the collaboration. Currently only supports
     * Amazon Web Services account ID.
     * </p>
     * 
     * @return The identifier of the Amazon Web Services principal that created the collaboration. Currently only
     *         supports Amazon Web Services account ID.
     */

    public String getCollaborationCreatorAccountId() {
        return this.collaborationCreatorAccountId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services principal that created the collaboration. Currently only supports
     * Amazon Web Services account ID.
     * </p>
     * 
     * @param collaborationCreatorAccountId
     *        The identifier of the Amazon Web Services principal that created the collaboration. Currently only
     *        supports Amazon Web Services account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MembershipSummary withCollaborationCreatorAccountId(String collaborationCreatorAccountId) {
        setCollaborationCreatorAccountId(collaborationCreatorAccountId);
        return this;
    }

    /**
     * <p>
     * The display name of the collaboration creator.
     * </p>
     * 
     * @param collaborationCreatorDisplayName
     *        The display name of the collaboration creator.
     */

    public void setCollaborationCreatorDisplayName(String collaborationCreatorDisplayName) {
        this.collaborationCreatorDisplayName = collaborationCreatorDisplayName;
    }

    /**
     * <p>
     * The display name of the collaboration creator.
     * </p>
     * 
     * @return The display name of the collaboration creator.
     */

    public String getCollaborationCreatorDisplayName() {
        return this.collaborationCreatorDisplayName;
    }

    /**
     * <p>
     * The display name of the collaboration creator.
     * </p>
     * 
     * @param collaborationCreatorDisplayName
     *        The display name of the collaboration creator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MembershipSummary withCollaborationCreatorDisplayName(String collaborationCreatorDisplayName) {
        setCollaborationCreatorDisplayName(collaborationCreatorDisplayName);
        return this;
    }

    /**
     * <p>
     * The name for the membership's collaboration.
     * </p>
     * 
     * @param collaborationName
     *        The name for the membership's collaboration.
     */

    public void setCollaborationName(String collaborationName) {
        this.collaborationName = collaborationName;
    }

    /**
     * <p>
     * The name for the membership's collaboration.
     * </p>
     * 
     * @return The name for the membership's collaboration.
     */

    public String getCollaborationName() {
        return this.collaborationName;
    }

    /**
     * <p>
     * The name for the membership's collaboration.
     * </p>
     * 
     * @param collaborationName
     *        The name for the membership's collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MembershipSummary withCollaborationName(String collaborationName) {
        setCollaborationName(collaborationName);
        return this;
    }

    /**
     * <p>
     * The time when the membership was created.
     * </p>
     * 
     * @param createTime
     *        The time when the membership was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time when the membership was created.
     * </p>
     * 
     * @return The time when the membership was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time when the membership was created.
     * </p>
     * 
     * @param createTime
     *        The time when the membership was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MembershipSummary withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The time the membership metadata was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the membership metadata was last updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time the membership metadata was last updated.
     * </p>
     * 
     * @return The time the membership metadata was last updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time the membership metadata was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the membership metadata was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MembershipSummary withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * The status of the membership.
     * </p>
     * 
     * @param status
     *        The status of the membership.
     * @see MembershipStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the membership.
     * </p>
     * 
     * @return The status of the membership.
     * @see MembershipStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the membership.
     * </p>
     * 
     * @param status
     *        The status of the membership.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipStatus
     */

    public MembershipSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the membership.
     * </p>
     * 
     * @param status
     *        The status of the membership.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipStatus
     */

    public MembershipSummary withStatus(MembershipStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The abilities granted to the collaboration member.
     * </p>
     * 
     * @return The abilities granted to the collaboration member.
     * @see MemberAbility
     */

    public java.util.List<String> getMemberAbilities() {
        return memberAbilities;
    }

    /**
     * <p>
     * The abilities granted to the collaboration member.
     * </p>
     * 
     * @param memberAbilities
     *        The abilities granted to the collaboration member.
     * @see MemberAbility
     */

    public void setMemberAbilities(java.util.Collection<String> memberAbilities) {
        if (memberAbilities == null) {
            this.memberAbilities = null;
            return;
        }

        this.memberAbilities = new java.util.ArrayList<String>(memberAbilities);
    }

    /**
     * <p>
     * The abilities granted to the collaboration member.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberAbilities(java.util.Collection)} or {@link #withMemberAbilities(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param memberAbilities
     *        The abilities granted to the collaboration member.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberAbility
     */

    public MembershipSummary withMemberAbilities(String... memberAbilities) {
        if (this.memberAbilities == null) {
            setMemberAbilities(new java.util.ArrayList<String>(memberAbilities.length));
        }
        for (String ele : memberAbilities) {
            this.memberAbilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The abilities granted to the collaboration member.
     * </p>
     * 
     * @param memberAbilities
     *        The abilities granted to the collaboration member.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberAbility
     */

    public MembershipSummary withMemberAbilities(java.util.Collection<String> memberAbilities) {
        setMemberAbilities(memberAbilities);
        return this;
    }

    /**
     * <p>
     * The abilities granted to the collaboration member.
     * </p>
     * 
     * @param memberAbilities
     *        The abilities granted to the collaboration member.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberAbility
     */

    public MembershipSummary withMemberAbilities(MemberAbility... memberAbilities) {
        java.util.ArrayList<String> memberAbilitiesCopy = new java.util.ArrayList<String>(memberAbilities.length);
        for (MemberAbility value : memberAbilities) {
            memberAbilitiesCopy.add(value.toString());
        }
        if (getMemberAbilities() == null) {
            setMemberAbilities(memberAbilitiesCopy);
        } else {
            getMemberAbilities().addAll(memberAbilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The payment responsibilities accepted by the collaboration member.
     * </p>
     * 
     * @param paymentConfiguration
     *        The payment responsibilities accepted by the collaboration member.
     */

    public void setPaymentConfiguration(MembershipPaymentConfiguration paymentConfiguration) {
        this.paymentConfiguration = paymentConfiguration;
    }

    /**
     * <p>
     * The payment responsibilities accepted by the collaboration member.
     * </p>
     * 
     * @return The payment responsibilities accepted by the collaboration member.
     */

    public MembershipPaymentConfiguration getPaymentConfiguration() {
        return this.paymentConfiguration;
    }

    /**
     * <p>
     * The payment responsibilities accepted by the collaboration member.
     * </p>
     * 
     * @param paymentConfiguration
     *        The payment responsibilities accepted by the collaboration member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MembershipSummary withPaymentConfiguration(MembershipPaymentConfiguration paymentConfiguration) {
        setPaymentConfiguration(paymentConfiguration);
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
        if (getCollaborationArn() != null)
            sb.append("CollaborationArn: ").append(getCollaborationArn()).append(",");
        if (getCollaborationId() != null)
            sb.append("CollaborationId: ").append(getCollaborationId()).append(",");
        if (getCollaborationCreatorAccountId() != null)
            sb.append("CollaborationCreatorAccountId: ").append(getCollaborationCreatorAccountId()).append(",");
        if (getCollaborationCreatorDisplayName() != null)
            sb.append("CollaborationCreatorDisplayName: ").append(getCollaborationCreatorDisplayName()).append(",");
        if (getCollaborationName() != null)
            sb.append("CollaborationName: ").append(getCollaborationName()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMemberAbilities() != null)
            sb.append("MemberAbilities: ").append(getMemberAbilities()).append(",");
        if (getPaymentConfiguration() != null)
            sb.append("PaymentConfiguration: ").append(getPaymentConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MembershipSummary == false)
            return false;
        MembershipSummary other = (MembershipSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCollaborationArn() == null ^ this.getCollaborationArn() == null)
            return false;
        if (other.getCollaborationArn() != null && other.getCollaborationArn().equals(this.getCollaborationArn()) == false)
            return false;
        if (other.getCollaborationId() == null ^ this.getCollaborationId() == null)
            return false;
        if (other.getCollaborationId() != null && other.getCollaborationId().equals(this.getCollaborationId()) == false)
            return false;
        if (other.getCollaborationCreatorAccountId() == null ^ this.getCollaborationCreatorAccountId() == null)
            return false;
        if (other.getCollaborationCreatorAccountId() != null
                && other.getCollaborationCreatorAccountId().equals(this.getCollaborationCreatorAccountId()) == false)
            return false;
        if (other.getCollaborationCreatorDisplayName() == null ^ this.getCollaborationCreatorDisplayName() == null)
            return false;
        if (other.getCollaborationCreatorDisplayName() != null
                && other.getCollaborationCreatorDisplayName().equals(this.getCollaborationCreatorDisplayName()) == false)
            return false;
        if (other.getCollaborationName() == null ^ this.getCollaborationName() == null)
            return false;
        if (other.getCollaborationName() != null && other.getCollaborationName().equals(this.getCollaborationName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMemberAbilities() == null ^ this.getMemberAbilities() == null)
            return false;
        if (other.getMemberAbilities() != null && other.getMemberAbilities().equals(this.getMemberAbilities()) == false)
            return false;
        if (other.getPaymentConfiguration() == null ^ this.getPaymentConfiguration() == null)
            return false;
        if (other.getPaymentConfiguration() != null && other.getPaymentConfiguration().equals(this.getPaymentConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCollaborationArn() == null) ? 0 : getCollaborationArn().hashCode());
        hashCode = prime * hashCode + ((getCollaborationId() == null) ? 0 : getCollaborationId().hashCode());
        hashCode = prime * hashCode + ((getCollaborationCreatorAccountId() == null) ? 0 : getCollaborationCreatorAccountId().hashCode());
        hashCode = prime * hashCode + ((getCollaborationCreatorDisplayName() == null) ? 0 : getCollaborationCreatorDisplayName().hashCode());
        hashCode = prime * hashCode + ((getCollaborationName() == null) ? 0 : getCollaborationName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMemberAbilities() == null) ? 0 : getMemberAbilities().hashCode());
        hashCode = prime * hashCode + ((getPaymentConfiguration() == null) ? 0 : getPaymentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public MembershipSummary clone() {
        try {
            return (MembershipSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.MembershipSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

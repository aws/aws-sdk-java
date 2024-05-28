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
 * The member object listed by the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/MemberSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     * account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The status of the member.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The member's display name.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The abilities granted to the collaboration member.
     * </p>
     */
    private java.util.List<String> abilities;
    /**
     * <p>
     * The time when the member was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The time the member metadata was last updated.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * The unique ID for the member's associated membership, if present.
     * </p>
     */
    private String membershipId;
    /**
     * <p>
     * The unique ARN for the member's associated membership, if present.
     * </p>
     */
    private String membershipArn;
    /**
     * <p>
     * The collaboration member's payment responsibilities set by the collaboration creator.
     * </p>
     */
    private PaymentConfiguration paymentConfiguration;

    /**
     * <p>
     * The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     * account ID.
     * </p>
     * 
     * @param accountId
     *        The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     *        account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
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

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     * account ID.
     * </p>
     * 
     * @param accountId
     *        The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     *        account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberSummary withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The status of the member.
     * </p>
     * 
     * @param status
     *        The status of the member.
     * @see MemberStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the member.
     * </p>
     * 
     * @return The status of the member.
     * @see MemberStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the member.
     * </p>
     * 
     * @param status
     *        The status of the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberStatus
     */

    public MemberSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the member.
     * </p>
     * 
     * @param status
     *        The status of the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberStatus
     */

    public MemberSummary withStatus(MemberStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The member's display name.
     * </p>
     * 
     * @param displayName
     *        The member's display name.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The member's display name.
     * </p>
     * 
     * @return The member's display name.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The member's display name.
     * </p>
     * 
     * @param displayName
     *        The member's display name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
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

    public java.util.List<String> getAbilities() {
        return abilities;
    }

    /**
     * <p>
     * The abilities granted to the collaboration member.
     * </p>
     * 
     * @param abilities
     *        The abilities granted to the collaboration member.
     * @see MemberAbility
     */

    public void setAbilities(java.util.Collection<String> abilities) {
        if (abilities == null) {
            this.abilities = null;
            return;
        }

        this.abilities = new java.util.ArrayList<String>(abilities);
    }

    /**
     * <p>
     * The abilities granted to the collaboration member.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAbilities(java.util.Collection)} or {@link #withAbilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param abilities
     *        The abilities granted to the collaboration member.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberAbility
     */

    public MemberSummary withAbilities(String... abilities) {
        if (this.abilities == null) {
            setAbilities(new java.util.ArrayList<String>(abilities.length));
        }
        for (String ele : abilities) {
            this.abilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The abilities granted to the collaboration member.
     * </p>
     * 
     * @param abilities
     *        The abilities granted to the collaboration member.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberAbility
     */

    public MemberSummary withAbilities(java.util.Collection<String> abilities) {
        setAbilities(abilities);
        return this;
    }

    /**
     * <p>
     * The abilities granted to the collaboration member.
     * </p>
     * 
     * @param abilities
     *        The abilities granted to the collaboration member.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberAbility
     */

    public MemberSummary withAbilities(MemberAbility... abilities) {
        java.util.ArrayList<String> abilitiesCopy = new java.util.ArrayList<String>(abilities.length);
        for (MemberAbility value : abilities) {
            abilitiesCopy.add(value.toString());
        }
        if (getAbilities() == null) {
            setAbilities(abilitiesCopy);
        } else {
            getAbilities().addAll(abilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The time when the member was created.
     * </p>
     * 
     * @param createTime
     *        The time when the member was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time when the member was created.
     * </p>
     * 
     * @return The time when the member was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time when the member was created.
     * </p>
     * 
     * @param createTime
     *        The time when the member was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberSummary withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The time the member metadata was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the member metadata was last updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time the member metadata was last updated.
     * </p>
     * 
     * @return The time the member metadata was last updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time the member metadata was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the member metadata was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberSummary withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * The unique ID for the member's associated membership, if present.
     * </p>
     * 
     * @param membershipId
     *        The unique ID for the member's associated membership, if present.
     */

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    /**
     * <p>
     * The unique ID for the member's associated membership, if present.
     * </p>
     * 
     * @return The unique ID for the member's associated membership, if present.
     */

    public String getMembershipId() {
        return this.membershipId;
    }

    /**
     * <p>
     * The unique ID for the member's associated membership, if present.
     * </p>
     * 
     * @param membershipId
     *        The unique ID for the member's associated membership, if present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberSummary withMembershipId(String membershipId) {
        setMembershipId(membershipId);
        return this;
    }

    /**
     * <p>
     * The unique ARN for the member's associated membership, if present.
     * </p>
     * 
     * @param membershipArn
     *        The unique ARN for the member's associated membership, if present.
     */

    public void setMembershipArn(String membershipArn) {
        this.membershipArn = membershipArn;
    }

    /**
     * <p>
     * The unique ARN for the member's associated membership, if present.
     * </p>
     * 
     * @return The unique ARN for the member's associated membership, if present.
     */

    public String getMembershipArn() {
        return this.membershipArn;
    }

    /**
     * <p>
     * The unique ARN for the member's associated membership, if present.
     * </p>
     * 
     * @param membershipArn
     *        The unique ARN for the member's associated membership, if present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberSummary withMembershipArn(String membershipArn) {
        setMembershipArn(membershipArn);
        return this;
    }

    /**
     * <p>
     * The collaboration member's payment responsibilities set by the collaboration creator.
     * </p>
     * 
     * @param paymentConfiguration
     *        The collaboration member's payment responsibilities set by the collaboration creator.
     */

    public void setPaymentConfiguration(PaymentConfiguration paymentConfiguration) {
        this.paymentConfiguration = paymentConfiguration;
    }

    /**
     * <p>
     * The collaboration member's payment responsibilities set by the collaboration creator.
     * </p>
     * 
     * @return The collaboration member's payment responsibilities set by the collaboration creator.
     */

    public PaymentConfiguration getPaymentConfiguration() {
        return this.paymentConfiguration;
    }

    /**
     * <p>
     * The collaboration member's payment responsibilities set by the collaboration creator.
     * </p>
     * 
     * @param paymentConfiguration
     *        The collaboration member's payment responsibilities set by the collaboration creator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberSummary withPaymentConfiguration(PaymentConfiguration paymentConfiguration) {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getAbilities() != null)
            sb.append("Abilities: ").append(getAbilities()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getMembershipId() != null)
            sb.append("MembershipId: ").append(getMembershipId()).append(",");
        if (getMembershipArn() != null)
            sb.append("MembershipArn: ").append(getMembershipArn()).append(",");
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

        if (obj instanceof MemberSummary == false)
            return false;
        MemberSummary other = (MemberSummary) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getAbilities() == null ^ this.getAbilities() == null)
            return false;
        if (other.getAbilities() != null && other.getAbilities().equals(this.getAbilities()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getMembershipId() == null ^ this.getMembershipId() == null)
            return false;
        if (other.getMembershipId() != null && other.getMembershipId().equals(this.getMembershipId()) == false)
            return false;
        if (other.getMembershipArn() == null ^ this.getMembershipArn() == null)
            return false;
        if (other.getMembershipArn() != null && other.getMembershipArn().equals(this.getMembershipArn()) == false)
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getAbilities() == null) ? 0 : getAbilities().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getMembershipId() == null) ? 0 : getMembershipId().hashCode());
        hashCode = prime * hashCode + ((getMembershipArn() == null) ? 0 : getMembershipArn().hashCode());
        hashCode = prime * hashCode + ((getPaymentConfiguration() == null) ? 0 : getPaymentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public MemberSummary clone() {
        try {
            return (MemberSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.MemberSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

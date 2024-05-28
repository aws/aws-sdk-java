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
 * Basic metadata used to construct a new member.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/MemberSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     * account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The abilities granted to the collaboration member.
     * </p>
     */
    private java.util.List<String> memberAbilities;
    /**
     * <p>
     * The member's display name.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The collaboration member's payment responsibilities set by the collaboration creator.
     * </p>
     * <p>
     * If the collaboration creator hasn't speciﬁed anyone as the member paying for query compute costs, then the member
     * who can query is the default payer.
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

    public MemberSpecification withAccountId(String accountId) {
        setAccountId(accountId);
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

    public MemberSpecification withMemberAbilities(String... memberAbilities) {
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

    public MemberSpecification withMemberAbilities(java.util.Collection<String> memberAbilities) {
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

    public MemberSpecification withMemberAbilities(MemberAbility... memberAbilities) {
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

    public MemberSpecification withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The collaboration member's payment responsibilities set by the collaboration creator.
     * </p>
     * <p>
     * If the collaboration creator hasn't speciﬁed anyone as the member paying for query compute costs, then the member
     * who can query is the default payer.
     * </p>
     * 
     * @param paymentConfiguration
     *        The collaboration member's payment responsibilities set by the collaboration creator. </p>
     *        <p>
     *        If the collaboration creator hasn't speciﬁed anyone as the member paying for query compute costs, then the
     *        member who can query is the default payer.
     */

    public void setPaymentConfiguration(PaymentConfiguration paymentConfiguration) {
        this.paymentConfiguration = paymentConfiguration;
    }

    /**
     * <p>
     * The collaboration member's payment responsibilities set by the collaboration creator.
     * </p>
     * <p>
     * If the collaboration creator hasn't speciﬁed anyone as the member paying for query compute costs, then the member
     * who can query is the default payer.
     * </p>
     * 
     * @return The collaboration member's payment responsibilities set by the collaboration creator. </p>
     *         <p>
     *         If the collaboration creator hasn't speciﬁed anyone as the member paying for query compute costs, then
     *         the member who can query is the default payer.
     */

    public PaymentConfiguration getPaymentConfiguration() {
        return this.paymentConfiguration;
    }

    /**
     * <p>
     * The collaboration member's payment responsibilities set by the collaboration creator.
     * </p>
     * <p>
     * If the collaboration creator hasn't speciﬁed anyone as the member paying for query compute costs, then the member
     * who can query is the default payer.
     * </p>
     * 
     * @param paymentConfiguration
     *        The collaboration member's payment responsibilities set by the collaboration creator. </p>
     *        <p>
     *        If the collaboration creator hasn't speciﬁed anyone as the member paying for query compute costs, then the
     *        member who can query is the default payer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberSpecification withPaymentConfiguration(PaymentConfiguration paymentConfiguration) {
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
        if (getMemberAbilities() != null)
            sb.append("MemberAbilities: ").append(getMemberAbilities()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
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

        if (obj instanceof MemberSpecification == false)
            return false;
        MemberSpecification other = (MemberSpecification) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getMemberAbilities() == null ^ this.getMemberAbilities() == null)
            return false;
        if (other.getMemberAbilities() != null && other.getMemberAbilities().equals(this.getMemberAbilities()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
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
        hashCode = prime * hashCode + ((getMemberAbilities() == null) ? 0 : getMemberAbilities().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getPaymentConfiguration() == null) ? 0 : getPaymentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public MemberSpecification clone() {
        try {
            return (MemberSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.MemberSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

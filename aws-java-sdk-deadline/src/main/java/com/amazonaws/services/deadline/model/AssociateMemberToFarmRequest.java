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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToFarm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateMemberToFarmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the farm to associate with the member.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The identity store ID of the member to associate with the farm.
     * </p>
     */
    private String identityStoreId;
    /**
     * <p>
     * The principal's membership level for the associated farm.
     * </p>
     */
    private String membershipLevel;
    /**
     * <p>
     * The member's principal ID to associate with the farm.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The principal type of the member to associate with the farm.
     * </p>
     */
    private String principalType;

    /**
     * <p>
     * The ID of the farm to associate with the member.
     * </p>
     * 
     * @param farmId
     *        The ID of the farm to associate with the member.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The ID of the farm to associate with the member.
     * </p>
     * 
     * @return The ID of the farm to associate with the member.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The ID of the farm to associate with the member.
     * </p>
     * 
     * @param farmId
     *        The ID of the farm to associate with the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateMemberToFarmRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The identity store ID of the member to associate with the farm.
     * </p>
     * 
     * @param identityStoreId
     *        The identity store ID of the member to associate with the farm.
     */

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    /**
     * <p>
     * The identity store ID of the member to associate with the farm.
     * </p>
     * 
     * @return The identity store ID of the member to associate with the farm.
     */

    public String getIdentityStoreId() {
        return this.identityStoreId;
    }

    /**
     * <p>
     * The identity store ID of the member to associate with the farm.
     * </p>
     * 
     * @param identityStoreId
     *        The identity store ID of the member to associate with the farm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateMemberToFarmRequest withIdentityStoreId(String identityStoreId) {
        setIdentityStoreId(identityStoreId);
        return this;
    }

    /**
     * <p>
     * The principal's membership level for the associated farm.
     * </p>
     * 
     * @param membershipLevel
     *        The principal's membership level for the associated farm.
     * @see MembershipLevel
     */

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    /**
     * <p>
     * The principal's membership level for the associated farm.
     * </p>
     * 
     * @return The principal's membership level for the associated farm.
     * @see MembershipLevel
     */

    public String getMembershipLevel() {
        return this.membershipLevel;
    }

    /**
     * <p>
     * The principal's membership level for the associated farm.
     * </p>
     * 
     * @param membershipLevel
     *        The principal's membership level for the associated farm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipLevel
     */

    public AssociateMemberToFarmRequest withMembershipLevel(String membershipLevel) {
        setMembershipLevel(membershipLevel);
        return this;
    }

    /**
     * <p>
     * The principal's membership level for the associated farm.
     * </p>
     * 
     * @param membershipLevel
     *        The principal's membership level for the associated farm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipLevel
     */

    public AssociateMemberToFarmRequest withMembershipLevel(MembershipLevel membershipLevel) {
        this.membershipLevel = membershipLevel.toString();
        return this;
    }

    /**
     * <p>
     * The member's principal ID to associate with the farm.
     * </p>
     * 
     * @param principalId
     *        The member's principal ID to associate with the farm.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The member's principal ID to associate with the farm.
     * </p>
     * 
     * @return The member's principal ID to associate with the farm.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The member's principal ID to associate with the farm.
     * </p>
     * 
     * @param principalId
     *        The member's principal ID to associate with the farm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateMemberToFarmRequest withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The principal type of the member to associate with the farm.
     * </p>
     * 
     * @param principalType
     *        The principal type of the member to associate with the farm.
     * @see PrincipalType
     */

    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * The principal type of the member to associate with the farm.
     * </p>
     * 
     * @return The principal type of the member to associate with the farm.
     * @see PrincipalType
     */

    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * <p>
     * The principal type of the member to associate with the farm.
     * </p>
     * 
     * @param principalType
     *        The principal type of the member to associate with the farm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public AssociateMemberToFarmRequest withPrincipalType(String principalType) {
        setPrincipalType(principalType);
        return this;
    }

    /**
     * <p>
     * The principal type of the member to associate with the farm.
     * </p>
     * 
     * @param principalType
     *        The principal type of the member to associate with the farm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public AssociateMemberToFarmRequest withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType.toString();
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
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getIdentityStoreId() != null)
            sb.append("IdentityStoreId: ").append(getIdentityStoreId()).append(",");
        if (getMembershipLevel() != null)
            sb.append("MembershipLevel: ").append(getMembershipLevel()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getPrincipalType() != null)
            sb.append("PrincipalType: ").append(getPrincipalType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateMemberToFarmRequest == false)
            return false;
        AssociateMemberToFarmRequest other = (AssociateMemberToFarmRequest) obj;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getIdentityStoreId() == null ^ this.getIdentityStoreId() == null)
            return false;
        if (other.getIdentityStoreId() != null && other.getIdentityStoreId().equals(this.getIdentityStoreId()) == false)
            return false;
        if (other.getMembershipLevel() == null ^ this.getMembershipLevel() == null)
            return false;
        if (other.getMembershipLevel() != null && other.getMembershipLevel().equals(this.getMembershipLevel()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getPrincipalType() == null ^ this.getPrincipalType() == null)
            return false;
        if (other.getPrincipalType() != null && other.getPrincipalType().equals(this.getPrincipalType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getIdentityStoreId() == null) ? 0 : getIdentityStoreId().hashCode());
        hashCode = prime * hashCode + ((getMembershipLevel() == null) ? 0 : getMembershipLevel().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getPrincipalType() == null) ? 0 : getPrincipalType().hashCode());
        return hashCode;
    }

    @Override
    public AssociateMemberToFarmRequest clone() {
        return (AssociateMemberToFarmRequest) super.clone();
    }

}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToFleet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateMemberToFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The farm ID of the fleet to associate with the member.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The ID of the fleet to associate with a member.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The member's identity store ID to associate with the fleet.
     * </p>
     */
    private String identityStoreId;
    /**
     * <p>
     * The principal's membership level for the associated fleet.
     * </p>
     */
    private String membershipLevel;
    /**
     * <p>
     * The member's principal ID to associate with a fleet.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The member's principal type to associate with the fleet.
     * </p>
     */
    private String principalType;

    /**
     * <p>
     * The farm ID of the fleet to associate with the member.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the fleet to associate with the member.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID of the fleet to associate with the member.
     * </p>
     * 
     * @return The farm ID of the fleet to associate with the member.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID of the fleet to associate with the member.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the fleet to associate with the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateMemberToFleetRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The ID of the fleet to associate with a member.
     * </p>
     * 
     * @param fleetId
     *        The ID of the fleet to associate with a member.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The ID of the fleet to associate with a member.
     * </p>
     * 
     * @return The ID of the fleet to associate with a member.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The ID of the fleet to associate with a member.
     * </p>
     * 
     * @param fleetId
     *        The ID of the fleet to associate with a member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateMemberToFleetRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The member's identity store ID to associate with the fleet.
     * </p>
     * 
     * @param identityStoreId
     *        The member's identity store ID to associate with the fleet.
     */

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    /**
     * <p>
     * The member's identity store ID to associate with the fleet.
     * </p>
     * 
     * @return The member's identity store ID to associate with the fleet.
     */

    public String getIdentityStoreId() {
        return this.identityStoreId;
    }

    /**
     * <p>
     * The member's identity store ID to associate with the fleet.
     * </p>
     * 
     * @param identityStoreId
     *        The member's identity store ID to associate with the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateMemberToFleetRequest withIdentityStoreId(String identityStoreId) {
        setIdentityStoreId(identityStoreId);
        return this;
    }

    /**
     * <p>
     * The principal's membership level for the associated fleet.
     * </p>
     * 
     * @param membershipLevel
     *        The principal's membership level for the associated fleet.
     * @see MembershipLevel
     */

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    /**
     * <p>
     * The principal's membership level for the associated fleet.
     * </p>
     * 
     * @return The principal's membership level for the associated fleet.
     * @see MembershipLevel
     */

    public String getMembershipLevel() {
        return this.membershipLevel;
    }

    /**
     * <p>
     * The principal's membership level for the associated fleet.
     * </p>
     * 
     * @param membershipLevel
     *        The principal's membership level for the associated fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipLevel
     */

    public AssociateMemberToFleetRequest withMembershipLevel(String membershipLevel) {
        setMembershipLevel(membershipLevel);
        return this;
    }

    /**
     * <p>
     * The principal's membership level for the associated fleet.
     * </p>
     * 
     * @param membershipLevel
     *        The principal's membership level for the associated fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipLevel
     */

    public AssociateMemberToFleetRequest withMembershipLevel(MembershipLevel membershipLevel) {
        this.membershipLevel = membershipLevel.toString();
        return this;
    }

    /**
     * <p>
     * The member's principal ID to associate with a fleet.
     * </p>
     * 
     * @param principalId
     *        The member's principal ID to associate with a fleet.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The member's principal ID to associate with a fleet.
     * </p>
     * 
     * @return The member's principal ID to associate with a fleet.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The member's principal ID to associate with a fleet.
     * </p>
     * 
     * @param principalId
     *        The member's principal ID to associate with a fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateMemberToFleetRequest withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The member's principal type to associate with the fleet.
     * </p>
     * 
     * @param principalType
     *        The member's principal type to associate with the fleet.
     * @see PrincipalType
     */

    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * The member's principal type to associate with the fleet.
     * </p>
     * 
     * @return The member's principal type to associate with the fleet.
     * @see PrincipalType
     */

    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * <p>
     * The member's principal type to associate with the fleet.
     * </p>
     * 
     * @param principalType
     *        The member's principal type to associate with the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public AssociateMemberToFleetRequest withPrincipalType(String principalType) {
        setPrincipalType(principalType);
        return this;
    }

    /**
     * <p>
     * The member's principal type to associate with the fleet.
     * </p>
     * 
     * @param principalType
     *        The member's principal type to associate with the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public AssociateMemberToFleetRequest withPrincipalType(PrincipalType principalType) {
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
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

        if (obj instanceof AssociateMemberToFleetRequest == false)
            return false;
        AssociateMemberToFleetRequest other = (AssociateMemberToFleetRequest) obj;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
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
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getIdentityStoreId() == null) ? 0 : getIdentityStoreId().hashCode());
        hashCode = prime * hashCode + ((getMembershipLevel() == null) ? 0 : getMembershipLevel().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getPrincipalType() == null) ? 0 : getPrincipalType().hashCode());
        return hashCode;
    }

    @Override
    public AssociateMemberToFleetRequest clone() {
        return (AssociateMemberToFleetRequest) super.clone();
    }

}

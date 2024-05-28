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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The fleet member.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/FleetMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetMember implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The farm ID.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The fleet ID.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The identity store ID.
     * </p>
     */
    private String identityStoreId;
    /**
     * <p>
     * The fleet member's membership level.
     * </p>
     */
    private String membershipLevel;
    /**
     * <p>
     * The principal ID of the fleet member.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The principal type of the fleet member.
     * </p>
     */
    private String principalType;

    /**
     * <p>
     * The farm ID.
     * </p>
     * 
     * @param farmId
     *        The farm ID.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID.
     * </p>
     * 
     * @return The farm ID.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID.
     * </p>
     * 
     * @param farmId
     *        The farm ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetMember withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The fleet ID.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The fleet ID.
     * </p>
     * 
     * @return The fleet ID.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The fleet ID.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetMember withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The identity store ID.
     * </p>
     * 
     * @param identityStoreId
     *        The identity store ID.
     */

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    /**
     * <p>
     * The identity store ID.
     * </p>
     * 
     * @return The identity store ID.
     */

    public String getIdentityStoreId() {
        return this.identityStoreId;
    }

    /**
     * <p>
     * The identity store ID.
     * </p>
     * 
     * @param identityStoreId
     *        The identity store ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetMember withIdentityStoreId(String identityStoreId) {
        setIdentityStoreId(identityStoreId);
        return this;
    }

    /**
     * <p>
     * The fleet member's membership level.
     * </p>
     * 
     * @param membershipLevel
     *        The fleet member's membership level.
     * @see MembershipLevel
     */

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    /**
     * <p>
     * The fleet member's membership level.
     * </p>
     * 
     * @return The fleet member's membership level.
     * @see MembershipLevel
     */

    public String getMembershipLevel() {
        return this.membershipLevel;
    }

    /**
     * <p>
     * The fleet member's membership level.
     * </p>
     * 
     * @param membershipLevel
     *        The fleet member's membership level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipLevel
     */

    public FleetMember withMembershipLevel(String membershipLevel) {
        setMembershipLevel(membershipLevel);
        return this;
    }

    /**
     * <p>
     * The fleet member's membership level.
     * </p>
     * 
     * @param membershipLevel
     *        The fleet member's membership level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipLevel
     */

    public FleetMember withMembershipLevel(MembershipLevel membershipLevel) {
        this.membershipLevel = membershipLevel.toString();
        return this;
    }

    /**
     * <p>
     * The principal ID of the fleet member.
     * </p>
     * 
     * @param principalId
     *        The principal ID of the fleet member.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The principal ID of the fleet member.
     * </p>
     * 
     * @return The principal ID of the fleet member.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The principal ID of the fleet member.
     * </p>
     * 
     * @param principalId
     *        The principal ID of the fleet member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetMember withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The principal type of the fleet member.
     * </p>
     * 
     * @param principalType
     *        The principal type of the fleet member.
     * @see PrincipalType
     */

    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * The principal type of the fleet member.
     * </p>
     * 
     * @return The principal type of the fleet member.
     * @see PrincipalType
     */

    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * <p>
     * The principal type of the fleet member.
     * </p>
     * 
     * @param principalType
     *        The principal type of the fleet member.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public FleetMember withPrincipalType(String principalType) {
        setPrincipalType(principalType);
        return this;
    }

    /**
     * <p>
     * The principal type of the fleet member.
     * </p>
     * 
     * @param principalType
     *        The principal type of the fleet member.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public FleetMember withPrincipalType(PrincipalType principalType) {
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

        if (obj instanceof FleetMember == false)
            return false;
        FleetMember other = (FleetMember) obj;
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
    public FleetMember clone() {
        try {
            return (FleetMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.FleetMemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

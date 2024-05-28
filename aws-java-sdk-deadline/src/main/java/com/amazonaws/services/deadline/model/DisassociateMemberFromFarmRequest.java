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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromFarm"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateMemberFromFarmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The farm ID of the farm to disassociate from the member.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * A member's principal ID to disassociate from a farm.
     * </p>
     */
    private String principalId;

    /**
     * <p>
     * The farm ID of the farm to disassociate from the member.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm to disassociate from the member.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID of the farm to disassociate from the member.
     * </p>
     * 
     * @return The farm ID of the farm to disassociate from the member.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID of the farm to disassociate from the member.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm to disassociate from the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateMemberFromFarmRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * A member's principal ID to disassociate from a farm.
     * </p>
     * 
     * @param principalId
     *        A member's principal ID to disassociate from a farm.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * A member's principal ID to disassociate from a farm.
     * </p>
     * 
     * @return A member's principal ID to disassociate from a farm.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * A member's principal ID to disassociate from a farm.
     * </p>
     * 
     * @param principalId
     *        A member's principal ID to disassociate from a farm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateMemberFromFarmRequest withPrincipalId(String principalId) {
        setPrincipalId(principalId);
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
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateMemberFromFarmRequest == false)
            return false;
        DisassociateMemberFromFarmRequest other = (DisassociateMemberFromFarmRequest) obj;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateMemberFromFarmRequest clone() {
        return (DisassociateMemberFromFarmRequest) super.clone();
    }

}

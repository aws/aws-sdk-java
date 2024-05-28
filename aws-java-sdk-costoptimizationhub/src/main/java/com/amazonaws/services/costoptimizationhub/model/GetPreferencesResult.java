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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/GetPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPreferencesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Retrieves the status of the "member account discount visibility" preference.
     * </p>
     */
    private String memberAccountDiscountVisibility;
    /**
     * <p>
     * Retrieves the status of the "savings estimation mode" preference.
     * </p>
     */
    private String savingsEstimationMode;

    /**
     * <p>
     * Retrieves the status of the "member account discount visibility" preference.
     * </p>
     * 
     * @param memberAccountDiscountVisibility
     *        Retrieves the status of the "member account discount visibility" preference.
     * @see MemberAccountDiscountVisibility
     */

    public void setMemberAccountDiscountVisibility(String memberAccountDiscountVisibility) {
        this.memberAccountDiscountVisibility = memberAccountDiscountVisibility;
    }

    /**
     * <p>
     * Retrieves the status of the "member account discount visibility" preference.
     * </p>
     * 
     * @return Retrieves the status of the "member account discount visibility" preference.
     * @see MemberAccountDiscountVisibility
     */

    public String getMemberAccountDiscountVisibility() {
        return this.memberAccountDiscountVisibility;
    }

    /**
     * <p>
     * Retrieves the status of the "member account discount visibility" preference.
     * </p>
     * 
     * @param memberAccountDiscountVisibility
     *        Retrieves the status of the "member account discount visibility" preference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberAccountDiscountVisibility
     */

    public GetPreferencesResult withMemberAccountDiscountVisibility(String memberAccountDiscountVisibility) {
        setMemberAccountDiscountVisibility(memberAccountDiscountVisibility);
        return this;
    }

    /**
     * <p>
     * Retrieves the status of the "member account discount visibility" preference.
     * </p>
     * 
     * @param memberAccountDiscountVisibility
     *        Retrieves the status of the "member account discount visibility" preference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberAccountDiscountVisibility
     */

    public GetPreferencesResult withMemberAccountDiscountVisibility(MemberAccountDiscountVisibility memberAccountDiscountVisibility) {
        this.memberAccountDiscountVisibility = memberAccountDiscountVisibility.toString();
        return this;
    }

    /**
     * <p>
     * Retrieves the status of the "savings estimation mode" preference.
     * </p>
     * 
     * @param savingsEstimationMode
     *        Retrieves the status of the "savings estimation mode" preference.
     * @see SavingsEstimationMode
     */

    public void setSavingsEstimationMode(String savingsEstimationMode) {
        this.savingsEstimationMode = savingsEstimationMode;
    }

    /**
     * <p>
     * Retrieves the status of the "savings estimation mode" preference.
     * </p>
     * 
     * @return Retrieves the status of the "savings estimation mode" preference.
     * @see SavingsEstimationMode
     */

    public String getSavingsEstimationMode() {
        return this.savingsEstimationMode;
    }

    /**
     * <p>
     * Retrieves the status of the "savings estimation mode" preference.
     * </p>
     * 
     * @param savingsEstimationMode
     *        Retrieves the status of the "savings estimation mode" preference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsEstimationMode
     */

    public GetPreferencesResult withSavingsEstimationMode(String savingsEstimationMode) {
        setSavingsEstimationMode(savingsEstimationMode);
        return this;
    }

    /**
     * <p>
     * Retrieves the status of the "savings estimation mode" preference.
     * </p>
     * 
     * @param savingsEstimationMode
     *        Retrieves the status of the "savings estimation mode" preference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsEstimationMode
     */

    public GetPreferencesResult withSavingsEstimationMode(SavingsEstimationMode savingsEstimationMode) {
        this.savingsEstimationMode = savingsEstimationMode.toString();
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
        if (getMemberAccountDiscountVisibility() != null)
            sb.append("MemberAccountDiscountVisibility: ").append(getMemberAccountDiscountVisibility()).append(",");
        if (getSavingsEstimationMode() != null)
            sb.append("SavingsEstimationMode: ").append(getSavingsEstimationMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPreferencesResult == false)
            return false;
        GetPreferencesResult other = (GetPreferencesResult) obj;
        if (other.getMemberAccountDiscountVisibility() == null ^ this.getMemberAccountDiscountVisibility() == null)
            return false;
        if (other.getMemberAccountDiscountVisibility() != null
                && other.getMemberAccountDiscountVisibility().equals(this.getMemberAccountDiscountVisibility()) == false)
            return false;
        if (other.getSavingsEstimationMode() == null ^ this.getSavingsEstimationMode() == null)
            return false;
        if (other.getSavingsEstimationMode() != null && other.getSavingsEstimationMode().equals(this.getSavingsEstimationMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemberAccountDiscountVisibility() == null) ? 0 : getMemberAccountDiscountVisibility().hashCode());
        hashCode = prime * hashCode + ((getSavingsEstimationMode() == null) ? 0 : getSavingsEstimationMode().hashCode());
        return hashCode;
    }

    @Override
    public GetPreferencesResult clone() {
        try {
            return (GetPreferencesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

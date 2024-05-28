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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about one of the policies that determined an authorization decision.
 * </p>
 * <p>
 * This data type is used as an element in a response parameter for the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorized.html">IsAuthorized</a>, <a
 * href
 * ="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_BatchIsAuthorized.html">BatchIsAuthorized
 * </a>, and <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorizedWithToken.html"
 * >IsAuthorizedWithToken</a> operations.
 * </p>
 * <p>
 * Example: <code>"determiningPolicies":[{"policyId":"SPEXAMPLEabcdefg111111"}]</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/DeterminingPolicyItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeterminingPolicyItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Id of a policy that determined to an authorization decision.
     * </p>
     * <p>
     * Example: <code>"policyId":"SPEXAMPLEabcdefg111111"</code>
     * </p>
     */
    private String policyId;

    /**
     * <p>
     * The Id of a policy that determined to an authorization decision.
     * </p>
     * <p>
     * Example: <code>"policyId":"SPEXAMPLEabcdefg111111"</code>
     * </p>
     * 
     * @param policyId
     *        The Id of a policy that determined to an authorization decision.</p>
     *        <p>
     *        Example: <code>"policyId":"SPEXAMPLEabcdefg111111"</code>
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The Id of a policy that determined to an authorization decision.
     * </p>
     * <p>
     * Example: <code>"policyId":"SPEXAMPLEabcdefg111111"</code>
     * </p>
     * 
     * @return The Id of a policy that determined to an authorization decision.</p>
     *         <p>
     *         Example: <code>"policyId":"SPEXAMPLEabcdefg111111"</code>
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The Id of a policy that determined to an authorization decision.
     * </p>
     * <p>
     * Example: <code>"policyId":"SPEXAMPLEabcdefg111111"</code>
     * </p>
     * 
     * @param policyId
     *        The Id of a policy that determined to an authorization decision.</p>
     *        <p>
     *        Example: <code>"policyId":"SPEXAMPLEabcdefg111111"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeterminingPolicyItem withPolicyId(String policyId) {
        setPolicyId(policyId);
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
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeterminingPolicyItem == false)
            return false;
        DeterminingPolicyItem other = (DeterminingPolicyItem) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        return hashCode;
    }

    @Override
    public DeterminingPolicyItem clone() {
        try {
            return (DeterminingPolicyItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.DeterminingPolicyItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetComplianceDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComplianceDetailResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the resources and the policy that you specified in the <code>GetComplianceDetail</code>
     * request.
     * </p>
     */
    private PolicyComplianceDetail policyComplianceDetail;

    /**
     * <p>
     * Information about the resources and the policy that you specified in the <code>GetComplianceDetail</code>
     * request.
     * </p>
     * 
     * @param policyComplianceDetail
     *        Information about the resources and the policy that you specified in the <code>GetComplianceDetail</code>
     *        request.
     */

    public void setPolicyComplianceDetail(PolicyComplianceDetail policyComplianceDetail) {
        this.policyComplianceDetail = policyComplianceDetail;
    }

    /**
     * <p>
     * Information about the resources and the policy that you specified in the <code>GetComplianceDetail</code>
     * request.
     * </p>
     * 
     * @return Information about the resources and the policy that you specified in the <code>GetComplianceDetail</code>
     *         request.
     */

    public PolicyComplianceDetail getPolicyComplianceDetail() {
        return this.policyComplianceDetail;
    }

    /**
     * <p>
     * Information about the resources and the policy that you specified in the <code>GetComplianceDetail</code>
     * request.
     * </p>
     * 
     * @param policyComplianceDetail
     *        Information about the resources and the policy that you specified in the <code>GetComplianceDetail</code>
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceDetailResult withPolicyComplianceDetail(PolicyComplianceDetail policyComplianceDetail) {
        setPolicyComplianceDetail(policyComplianceDetail);
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
        if (getPolicyComplianceDetail() != null)
            sb.append("PolicyComplianceDetail: ").append(getPolicyComplianceDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComplianceDetailResult == false)
            return false;
        GetComplianceDetailResult other = (GetComplianceDetailResult) obj;
        if (other.getPolicyComplianceDetail() == null ^ this.getPolicyComplianceDetail() == null)
            return false;
        if (other.getPolicyComplianceDetail() != null && other.getPolicyComplianceDetail().equals(this.getPolicyComplianceDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyComplianceDetail() == null) ? 0 : getPolicyComplianceDetail().hashCode());
        return hashCode;
    }

    @Override
    public GetComplianceDetailResult clone() {
        try {
            return (GetComplianceDetailResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

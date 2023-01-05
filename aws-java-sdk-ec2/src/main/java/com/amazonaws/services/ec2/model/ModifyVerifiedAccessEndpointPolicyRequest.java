/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyVerifiedAccessEndpointPolicyRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVerifiedAccessEndpointPolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyVerifiedAccessEndpointPolicyRequest> {

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     */
    private String verifiedAccessEndpointId;
    /**
     * <p>
     * The status of the Verified Access policy.
     * </p>
     */
    private Boolean policyEnabled;
    /**
     * <p>
     * The Amazon Web Services Verified Access policy document.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param verifiedAccessEndpointId
     *        The ID of the Amazon Web Services Verified Access endpoint.
     */

    public void setVerifiedAccessEndpointId(String verifiedAccessEndpointId) {
        this.verifiedAccessEndpointId = verifiedAccessEndpointId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access endpoint.
     */

    public String getVerifiedAccessEndpointId() {
        return this.verifiedAccessEndpointId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param verifiedAccessEndpointId
     *        The ID of the Amazon Web Services Verified Access endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessEndpointPolicyRequest withVerifiedAccessEndpointId(String verifiedAccessEndpointId) {
        setVerifiedAccessEndpointId(verifiedAccessEndpointId);
        return this;
    }

    /**
     * <p>
     * The status of the Verified Access policy.
     * </p>
     * 
     * @param policyEnabled
     *        The status of the Verified Access policy.
     */

    public void setPolicyEnabled(Boolean policyEnabled) {
        this.policyEnabled = policyEnabled;
    }

    /**
     * <p>
     * The status of the Verified Access policy.
     * </p>
     * 
     * @return The status of the Verified Access policy.
     */

    public Boolean getPolicyEnabled() {
        return this.policyEnabled;
    }

    /**
     * <p>
     * The status of the Verified Access policy.
     * </p>
     * 
     * @param policyEnabled
     *        The status of the Verified Access policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessEndpointPolicyRequest withPolicyEnabled(Boolean policyEnabled) {
        setPolicyEnabled(policyEnabled);
        return this;
    }

    /**
     * <p>
     * The status of the Verified Access policy.
     * </p>
     * 
     * @return The status of the Verified Access policy.
     */

    public Boolean isPolicyEnabled() {
        return this.policyEnabled;
    }

    /**
     * <p>
     * The Amazon Web Services Verified Access policy document.
     * </p>
     * 
     * @param policyDocument
     *        The Amazon Web Services Verified Access policy document.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The Amazon Web Services Verified Access policy document.
     * </p>
     * 
     * @return The Amazon Web Services Verified Access policy document.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The Amazon Web Services Verified Access policy document.
     * </p>
     * 
     * @param policyDocument
     *        The Amazon Web Services Verified Access policy document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessEndpointPolicyRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessEndpointPolicyRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVerifiedAccessEndpointPolicyRequest> getDryRunRequest() {
        Request<ModifyVerifiedAccessEndpointPolicyRequest> request = new ModifyVerifiedAccessEndpointPolicyRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getVerifiedAccessEndpointId() != null)
            sb.append("VerifiedAccessEndpointId: ").append(getVerifiedAccessEndpointId()).append(",");
        if (getPolicyEnabled() != null)
            sb.append("PolicyEnabled: ").append(getPolicyEnabled()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVerifiedAccessEndpointPolicyRequest == false)
            return false;
        ModifyVerifiedAccessEndpointPolicyRequest other = (ModifyVerifiedAccessEndpointPolicyRequest) obj;
        if (other.getVerifiedAccessEndpointId() == null ^ this.getVerifiedAccessEndpointId() == null)
            return false;
        if (other.getVerifiedAccessEndpointId() != null && other.getVerifiedAccessEndpointId().equals(this.getVerifiedAccessEndpointId()) == false)
            return false;
        if (other.getPolicyEnabled() == null ^ this.getPolicyEnabled() == null)
            return false;
        if (other.getPolicyEnabled() != null && other.getPolicyEnabled().equals(this.getPolicyEnabled()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifiedAccessEndpointId() == null) ? 0 : getVerifiedAccessEndpointId().hashCode());
        hashCode = prime * hashCode + ((getPolicyEnabled() == null) ? 0 : getPolicyEnabled().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVerifiedAccessEndpointPolicyRequest clone() {
        return (ModifyVerifiedAccessEndpointPolicyRequest) super.clone();
    }
}

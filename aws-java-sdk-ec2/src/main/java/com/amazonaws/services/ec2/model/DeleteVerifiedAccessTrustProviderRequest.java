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
import com.amazonaws.services.ec2.model.transform.DeleteVerifiedAccessTrustProviderRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVerifiedAccessTrustProviderRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteVerifiedAccessTrustProviderRequest> {

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access trust provider.
     * </p>
     */
    private String verifiedAccessTrustProviderId;
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
     * The ID of the Amazon Web Services Verified Access trust provider.
     * </p>
     * 
     * @param verifiedAccessTrustProviderId
     *        The ID of the Amazon Web Services Verified Access trust provider.
     */

    public void setVerifiedAccessTrustProviderId(String verifiedAccessTrustProviderId) {
        this.verifiedAccessTrustProviderId = verifiedAccessTrustProviderId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access trust provider.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access trust provider.
     */

    public String getVerifiedAccessTrustProviderId() {
        return this.verifiedAccessTrustProviderId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access trust provider.
     * </p>
     * 
     * @param verifiedAccessTrustProviderId
     *        The ID of the Amazon Web Services Verified Access trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVerifiedAccessTrustProviderRequest withVerifiedAccessTrustProviderId(String verifiedAccessTrustProviderId) {
        setVerifiedAccessTrustProviderId(verifiedAccessTrustProviderId);
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

    public DeleteVerifiedAccessTrustProviderRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteVerifiedAccessTrustProviderRequest> getDryRunRequest() {
        Request<DeleteVerifiedAccessTrustProviderRequest> request = new DeleteVerifiedAccessTrustProviderRequestMarshaller().marshall(this);
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
        if (getVerifiedAccessTrustProviderId() != null)
            sb.append("VerifiedAccessTrustProviderId: ").append(getVerifiedAccessTrustProviderId()).append(",");
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

        if (obj instanceof DeleteVerifiedAccessTrustProviderRequest == false)
            return false;
        DeleteVerifiedAccessTrustProviderRequest other = (DeleteVerifiedAccessTrustProviderRequest) obj;
        if (other.getVerifiedAccessTrustProviderId() == null ^ this.getVerifiedAccessTrustProviderId() == null)
            return false;
        if (other.getVerifiedAccessTrustProviderId() != null
                && other.getVerifiedAccessTrustProviderId().equals(this.getVerifiedAccessTrustProviderId()) == false)
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

        hashCode = prime * hashCode + ((getVerifiedAccessTrustProviderId() == null) ? 0 : getVerifiedAccessTrustProviderId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVerifiedAccessTrustProviderRequest clone() {
        return (DeleteVerifiedAccessTrustProviderRequest) super.clone();
    }
}

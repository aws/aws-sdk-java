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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutMultiRegionAccessPointPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMultiRegionAccessPointPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * An idempotency token used to identify the request and guarantee that requests are unique.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A container element containing the details of the policy for the Multi-Region Access Point.
     * </p>
     */
    private PutMultiRegionAccessPointPolicyInput details;

    /**
     * <p>
     * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * </p>
     * 
     * @return The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMultiRegionAccessPointPolicyRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * An idempotency token used to identify the request and guarantee that requests are unique.
     * </p>
     * 
     * @param clientToken
     *        An idempotency token used to identify the request and guarantee that requests are unique.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * An idempotency token used to identify the request and guarantee that requests are unique.
     * </p>
     * 
     * @return An idempotency token used to identify the request and guarantee that requests are unique.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * An idempotency token used to identify the request and guarantee that requests are unique.
     * </p>
     * 
     * @param clientToken
     *        An idempotency token used to identify the request and guarantee that requests are unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMultiRegionAccessPointPolicyRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A container element containing the details of the policy for the Multi-Region Access Point.
     * </p>
     * 
     * @param details
     *        A container element containing the details of the policy for the Multi-Region Access Point.
     */

    public void setDetails(PutMultiRegionAccessPointPolicyInput details) {
        this.details = details;
    }

    /**
     * <p>
     * A container element containing the details of the policy for the Multi-Region Access Point.
     * </p>
     * 
     * @return A container element containing the details of the policy for the Multi-Region Access Point.
     */

    public PutMultiRegionAccessPointPolicyInput getDetails() {
        return this.details;
    }

    /**
     * <p>
     * A container element containing the details of the policy for the Multi-Region Access Point.
     * </p>
     * 
     * @param details
     *        A container element containing the details of the policy for the Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMultiRegionAccessPointPolicyRequest withDetails(PutMultiRegionAccessPointPolicyInput details) {
        setDetails(details);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMultiRegionAccessPointPolicyRequest == false)
            return false;
        PutMultiRegionAccessPointPolicyRequest other = (PutMultiRegionAccessPointPolicyRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public PutMultiRegionAccessPointPolicyRequest clone() {
        return (PutMultiRegionAccessPointPolicyRequest) super.clone();
    }

}

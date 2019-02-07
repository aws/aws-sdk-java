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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.PurchaseScheduledInstancesRequestMarshaller;

/**
 * <p>
 * Contains the parameters for PurchaseScheduledInstances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseScheduledInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<PurchaseScheduledInstancesRequest> {

    /**
     * <p>
     * Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * One or more purchase requests.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PurchaseRequest> purchaseRequests;

    /**
     * <p>
     * Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see
     *         <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseScheduledInstancesRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * One or more purchase requests.
     * </p>
     * 
     * @return One or more purchase requests.
     */

    public java.util.List<PurchaseRequest> getPurchaseRequests() {
        if (purchaseRequests == null) {
            purchaseRequests = new com.amazonaws.internal.SdkInternalList<PurchaseRequest>();
        }
        return purchaseRequests;
    }

    /**
     * <p>
     * One or more purchase requests.
     * </p>
     * 
     * @param purchaseRequests
     *        One or more purchase requests.
     */

    public void setPurchaseRequests(java.util.Collection<PurchaseRequest> purchaseRequests) {
        if (purchaseRequests == null) {
            this.purchaseRequests = null;
            return;
        }

        this.purchaseRequests = new com.amazonaws.internal.SdkInternalList<PurchaseRequest>(purchaseRequests);
    }

    /**
     * <p>
     * One or more purchase requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPurchaseRequests(java.util.Collection)} or {@link #withPurchaseRequests(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param purchaseRequests
     *        One or more purchase requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseScheduledInstancesRequest withPurchaseRequests(PurchaseRequest... purchaseRequests) {
        if (this.purchaseRequests == null) {
            setPurchaseRequests(new com.amazonaws.internal.SdkInternalList<PurchaseRequest>(purchaseRequests.length));
        }
        for (PurchaseRequest ele : purchaseRequests) {
            this.purchaseRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more purchase requests.
     * </p>
     * 
     * @param purchaseRequests
     *        One or more purchase requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseScheduledInstancesRequest withPurchaseRequests(java.util.Collection<PurchaseRequest> purchaseRequests) {
        setPurchaseRequests(purchaseRequests);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<PurchaseScheduledInstancesRequest> getDryRunRequest() {
        Request<PurchaseScheduledInstancesRequest> request = new PurchaseScheduledInstancesRequestMarshaller().marshall(this);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getPurchaseRequests() != null)
            sb.append("PurchaseRequests: ").append(getPurchaseRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseScheduledInstancesRequest == false)
            return false;
        PurchaseScheduledInstancesRequest other = (PurchaseScheduledInstancesRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getPurchaseRequests() == null ^ this.getPurchaseRequests() == null)
            return false;
        if (other.getPurchaseRequests() != null && other.getPurchaseRequests().equals(this.getPurchaseRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getPurchaseRequests() == null) ? 0 : getPurchaseRequests().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseScheduledInstancesRequest clone() {
        return (PurchaseScheduledInstancesRequest) super.clone();
    }
}

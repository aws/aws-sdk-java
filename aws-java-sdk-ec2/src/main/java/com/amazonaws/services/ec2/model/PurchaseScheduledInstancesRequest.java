/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.PurchaseScheduledInstancesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#purchaseScheduledInstances(PurchaseScheduledInstancesRequest) PurchaseScheduledInstances operation}.
 * <p>
 * Purchases one or more Scheduled Instances with the specified schedule.
 * </p>
 * <p>
 * Scheduled Instances enable you to purchase Amazon EC2 compute capacity
 * by the hour for a one-year term. Before you can purchase a Scheduled
 * Instance, you must call DescribeScheduledInstanceAvailability to check
 * for available schedules and obtain a purchase token.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#purchaseScheduledInstances(PurchaseScheduledInstancesRequest)
 */
public class PurchaseScheduledInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<PurchaseScheduledInstancesRequest> {

    /**
     * Unique, case-sensitive identifier that ensures the idempotency of the
     * request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     */
    private String clientToken;

    /**
     * One or more purchase requests.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PurchaseRequest> purchaseRequests;

    /**
     * Unique, case-sensitive identifier that ensures the idempotency of the
     * request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     *
     * @return Unique, case-sensitive identifier that ensures the idempotency of the
     *         request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier that ensures the idempotency of the
     * request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     *
     * @param clientToken Unique, case-sensitive identifier that ensures the idempotency of the
     *         request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier that ensures the idempotency of the
     * request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Unique, case-sensitive identifier that ensures the idempotency of the
     *         request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PurchaseScheduledInstancesRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * One or more purchase requests.
     *
     * @return One or more purchase requests.
     */
    public java.util.List<PurchaseRequest> getPurchaseRequests() {
        if (purchaseRequests == null) {
              purchaseRequests = new com.amazonaws.internal.ListWithAutoConstructFlag<PurchaseRequest>();
              purchaseRequests.setAutoConstruct(true);
        }
        return purchaseRequests;
    }
    
    /**
     * One or more purchase requests.
     *
     * @param purchaseRequests One or more purchase requests.
     */
    public void setPurchaseRequests(java.util.Collection<PurchaseRequest> purchaseRequests) {
        if (purchaseRequests == null) {
            this.purchaseRequests = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PurchaseRequest> purchaseRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PurchaseRequest>(purchaseRequests.size());
        purchaseRequestsCopy.addAll(purchaseRequests);
        this.purchaseRequests = purchaseRequestsCopy;
    }
    
    /**
     * One or more purchase requests.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPurchaseRequests(java.util.Collection)} or {@link
     * #withPurchaseRequests(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param purchaseRequests One or more purchase requests.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PurchaseScheduledInstancesRequest withPurchaseRequests(PurchaseRequest... purchaseRequests) {
        if (getPurchaseRequests() == null) setPurchaseRequests(new java.util.ArrayList<PurchaseRequest>(purchaseRequests.length));
        for (PurchaseRequest value : purchaseRequests) {
            getPurchaseRequests().add(value);
        }
        return this;
    }
    
    /**
     * One or more purchase requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param purchaseRequests One or more purchase requests.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PurchaseScheduledInstancesRequest withPurchaseRequests(java.util.Collection<PurchaseRequest> purchaseRequests) {
        if (purchaseRequests == null) {
            this.purchaseRequests = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PurchaseRequest> purchaseRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PurchaseRequest>(purchaseRequests.size());
            purchaseRequestsCopy.addAll(purchaseRequests);
            this.purchaseRequests = purchaseRequestsCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<PurchaseScheduledInstancesRequest> getDryRunRequest() {
        Request<PurchaseScheduledInstancesRequest> request = new PurchaseScheduledInstancesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() + ",");
        if (getPurchaseRequests() != null) sb.append("PurchaseRequests: " + getPurchaseRequests() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PurchaseScheduledInstancesRequest == false) return false;
        PurchaseScheduledInstancesRequest other = (PurchaseScheduledInstancesRequest)obj;
        
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        if (other.getPurchaseRequests() == null ^ this.getPurchaseRequests() == null) return false;
        if (other.getPurchaseRequests() != null && other.getPurchaseRequests().equals(this.getPurchaseRequests()) == false) return false; 
        return true;
    }
    
    @Override
    public PurchaseScheduledInstancesRequest clone() {
        
            return (PurchaseScheduledInstancesRequest) super.clone();
    }

}
    
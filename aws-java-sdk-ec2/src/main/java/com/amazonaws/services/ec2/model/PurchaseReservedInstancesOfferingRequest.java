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
import com.amazonaws.services.ec2.model.transform.PurchaseReservedInstancesOfferingRequestMarshaller;

/**
 * <p>
 * Contains the parameters for PurchaseReservedInstancesOffering.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseReservedInstancesOfferingRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<PurchaseReservedInstancesOfferingRequest> {

    /**
     * <p>
     * The number of Reserved Instances to purchase.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The ID of the Reserved Instance offering to purchase.
     * </p>
     */
    private String reservedInstancesOfferingId;
    /**
     * <p>
     * Specified for Reserved Instance Marketplace offerings to limit the total order and ensure that the Reserved
     * Instances are not purchased at unexpected prices.
     * </p>
     */
    private ReservedInstanceLimitPrice limitPrice;

    /**
     * Default constructor for PurchaseReservedInstancesOfferingRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize the object after creating it.
     */
    public PurchaseReservedInstancesOfferingRequest() {
    }

    /**
     * Constructs a new PurchaseReservedInstancesOfferingRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param reservedInstancesOfferingId
     *        The ID of the Reserved Instance offering to purchase.
     * @param instanceCount
     *        The number of Reserved Instances to purchase.
     */
    public PurchaseReservedInstancesOfferingRequest(String reservedInstancesOfferingId, Integer instanceCount) {
        setReservedInstancesOfferingId(reservedInstancesOfferingId);
        setInstanceCount(instanceCount);
    }

    /**
     * <p>
     * The number of Reserved Instances to purchase.
     * </p>
     * 
     * @param instanceCount
     *        The number of Reserved Instances to purchase.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of Reserved Instances to purchase.
     * </p>
     * 
     * @return The number of Reserved Instances to purchase.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of Reserved Instances to purchase.
     * </p>
     * 
     * @param instanceCount
     *        The number of Reserved Instances to purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedInstancesOfferingRequest withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The ID of the Reserved Instance offering to purchase.
     * </p>
     * 
     * @param reservedInstancesOfferingId
     *        The ID of the Reserved Instance offering to purchase.
     */

    public void setReservedInstancesOfferingId(String reservedInstancesOfferingId) {
        this.reservedInstancesOfferingId = reservedInstancesOfferingId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance offering to purchase.
     * </p>
     * 
     * @return The ID of the Reserved Instance offering to purchase.
     */

    public String getReservedInstancesOfferingId() {
        return this.reservedInstancesOfferingId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance offering to purchase.
     * </p>
     * 
     * @param reservedInstancesOfferingId
     *        The ID of the Reserved Instance offering to purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedInstancesOfferingRequest withReservedInstancesOfferingId(String reservedInstancesOfferingId) {
        setReservedInstancesOfferingId(reservedInstancesOfferingId);
        return this;
    }

    /**
     * <p>
     * Specified for Reserved Instance Marketplace offerings to limit the total order and ensure that the Reserved
     * Instances are not purchased at unexpected prices.
     * </p>
     * 
     * @param limitPrice
     *        Specified for Reserved Instance Marketplace offerings to limit the total order and ensure that the
     *        Reserved Instances are not purchased at unexpected prices.
     */

    public void setLimitPrice(ReservedInstanceLimitPrice limitPrice) {
        this.limitPrice = limitPrice;
    }

    /**
     * <p>
     * Specified for Reserved Instance Marketplace offerings to limit the total order and ensure that the Reserved
     * Instances are not purchased at unexpected prices.
     * </p>
     * 
     * @return Specified for Reserved Instance Marketplace offerings to limit the total order and ensure that the
     *         Reserved Instances are not purchased at unexpected prices.
     */

    public ReservedInstanceLimitPrice getLimitPrice() {
        return this.limitPrice;
    }

    /**
     * <p>
     * Specified for Reserved Instance Marketplace offerings to limit the total order and ensure that the Reserved
     * Instances are not purchased at unexpected prices.
     * </p>
     * 
     * @param limitPrice
     *        Specified for Reserved Instance Marketplace offerings to limit the total order and ensure that the
     *        Reserved Instances are not purchased at unexpected prices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedInstancesOfferingRequest withLimitPrice(ReservedInstanceLimitPrice limitPrice) {
        setLimitPrice(limitPrice);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<PurchaseReservedInstancesOfferingRequest> getDryRunRequest() {
        Request<PurchaseReservedInstancesOfferingRequest> request = new PurchaseReservedInstancesOfferingRequestMarshaller().marshall(this);
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
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getReservedInstancesOfferingId() != null)
            sb.append("ReservedInstancesOfferingId: ").append(getReservedInstancesOfferingId()).append(",");
        if (getLimitPrice() != null)
            sb.append("LimitPrice: ").append(getLimitPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedInstancesOfferingRequest == false)
            return false;
        PurchaseReservedInstancesOfferingRequest other = (PurchaseReservedInstancesOfferingRequest) obj;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getReservedInstancesOfferingId() == null ^ this.getReservedInstancesOfferingId() == null)
            return false;
        if (other.getReservedInstancesOfferingId() != null && other.getReservedInstancesOfferingId().equals(this.getReservedInstancesOfferingId()) == false)
            return false;
        if (other.getLimitPrice() == null ^ this.getLimitPrice() == null)
            return false;
        if (other.getLimitPrice() != null && other.getLimitPrice().equals(this.getLimitPrice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getReservedInstancesOfferingId() == null) ? 0 : getReservedInstancesOfferingId().hashCode());
        hashCode = prime * hashCode + ((getLimitPrice() == null) ? 0 : getLimitPrice().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseReservedInstancesOfferingRequest clone() {
        return (PurchaseReservedInstancesOfferingRequest) super.clone();
    }
}

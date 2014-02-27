/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createReservedInstancesListing(CreateReservedInstancesListingRequest) CreateReservedInstancesListing operation}.
 * <p>
 * Creates a listing for Amazon EC2 Reserved Instances to be sold in the
 * Reserved Instance Marketplace. You can submit one Reserved Instance
 * listing at a time.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createReservedInstancesListing(CreateReservedInstancesListingRequest)
 */
public class CreateReservedInstancesListingRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the active Reserved Instance.
     */
    private String reservedInstancesId;

    /**
     * The number of instances that are a part of a Reserved Instance account
     * to be listed in the Reserved Instance Marketplace. This number should
     * be less than or equal to the instance count associated with the
     * Reserved Instance ID specified in this call.
     */
    private Integer instanceCount;

    /**
     * A list specifying the price of the Reserved Instance for each month
     * remaining in the Reserved Instance term.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PriceScheduleSpecification> priceSchedules;

    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * your listings. This helps avoid duplicate listings. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    private String clientToken;

    /**
     * The ID of the active Reserved Instance.
     *
     * @return The ID of the active Reserved Instance.
     */
    public String getReservedInstancesId() {
        return reservedInstancesId;
    }
    
    /**
     * The ID of the active Reserved Instance.
     *
     * @param reservedInstancesId The ID of the active Reserved Instance.
     */
    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }
    
    /**
     * The ID of the active Reserved Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesId The ID of the active Reserved Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateReservedInstancesListingRequest withReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
        return this;
    }

    /**
     * The number of instances that are a part of a Reserved Instance account
     * to be listed in the Reserved Instance Marketplace. This number should
     * be less than or equal to the instance count associated with the
     * Reserved Instance ID specified in this call.
     *
     * @return The number of instances that are a part of a Reserved Instance account
     *         to be listed in the Reserved Instance Marketplace. This number should
     *         be less than or equal to the instance count associated with the
     *         Reserved Instance ID specified in this call.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * The number of instances that are a part of a Reserved Instance account
     * to be listed in the Reserved Instance Marketplace. This number should
     * be less than or equal to the instance count associated with the
     * Reserved Instance ID specified in this call.
     *
     * @param instanceCount The number of instances that are a part of a Reserved Instance account
     *         to be listed in the Reserved Instance Marketplace. This number should
     *         be less than or equal to the instance count associated with the
     *         Reserved Instance ID specified in this call.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * The number of instances that are a part of a Reserved Instance account
     * to be listed in the Reserved Instance Marketplace. This number should
     * be less than or equal to the instance count associated with the
     * Reserved Instance ID specified in this call.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount The number of instances that are a part of a Reserved Instance account
     *         to be listed in the Reserved Instance Marketplace. This number should
     *         be less than or equal to the instance count associated with the
     *         Reserved Instance ID specified in this call.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateReservedInstancesListingRequest withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * A list specifying the price of the Reserved Instance for each month
     * remaining in the Reserved Instance term.
     *
     * @return A list specifying the price of the Reserved Instance for each month
     *         remaining in the Reserved Instance term.
     */
    public java.util.List<PriceScheduleSpecification> getPriceSchedules() {
        if (priceSchedules == null) {
              priceSchedules = new com.amazonaws.internal.ListWithAutoConstructFlag<PriceScheduleSpecification>();
              priceSchedules.setAutoConstruct(true);
        }
        return priceSchedules;
    }
    
    /**
     * A list specifying the price of the Reserved Instance for each month
     * remaining in the Reserved Instance term.
     *
     * @param priceSchedules A list specifying the price of the Reserved Instance for each month
     *         remaining in the Reserved Instance term.
     */
    public void setPriceSchedules(java.util.Collection<PriceScheduleSpecification> priceSchedules) {
        if (priceSchedules == null) {
            this.priceSchedules = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PriceScheduleSpecification> priceSchedulesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PriceScheduleSpecification>(priceSchedules.size());
        priceSchedulesCopy.addAll(priceSchedules);
        this.priceSchedules = priceSchedulesCopy;
    }
    
    /**
     * A list specifying the price of the Reserved Instance for each month
     * remaining in the Reserved Instance term.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param priceSchedules A list specifying the price of the Reserved Instance for each month
     *         remaining in the Reserved Instance term.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateReservedInstancesListingRequest withPriceSchedules(PriceScheduleSpecification... priceSchedules) {
        if (getPriceSchedules() == null) setPriceSchedules(new java.util.ArrayList<PriceScheduleSpecification>(priceSchedules.length));
        for (PriceScheduleSpecification value : priceSchedules) {
            getPriceSchedules().add(value);
        }
        return this;
    }
    
    /**
     * A list specifying the price of the Reserved Instance for each month
     * remaining in the Reserved Instance term.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param priceSchedules A list specifying the price of the Reserved Instance for each month
     *         remaining in the Reserved Instance term.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateReservedInstancesListingRequest withPriceSchedules(java.util.Collection<PriceScheduleSpecification> priceSchedules) {
        if (priceSchedules == null) {
            this.priceSchedules = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PriceScheduleSpecification> priceSchedulesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PriceScheduleSpecification>(priceSchedules.size());
            priceSchedulesCopy.addAll(priceSchedules);
            this.priceSchedules = priceSchedulesCopy;
        }

        return this;
    }

    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * your listings. This helps avoid duplicate listings. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return Unique, case-sensitive identifier you provide to ensure idempotency of
     *         your listings. This helps avoid duplicate listings. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * your listings. This helps avoid duplicate listings. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure idempotency of
     *         your listings. This helps avoid duplicate listings. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * your listings. This helps avoid duplicate listings. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure idempotency of
     *         your listings. This helps avoid duplicate listings. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateReservedInstancesListingRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
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
        if (getReservedInstancesId() != null) sb.append("ReservedInstancesId: " + getReservedInstancesId() + ",");
        if (getInstanceCount() != null) sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getPriceSchedules() != null) sb.append("PriceSchedules: " + getPriceSchedules() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode()); 
        hashCode = prime * hashCode + ((getPriceSchedules() == null) ? 0 : getPriceSchedules().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateReservedInstancesListingRequest == false) return false;
        CreateReservedInstancesListingRequest other = (CreateReservedInstancesListingRequest)obj;
        
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null) return false;
        if (other.getReservedInstancesId() != null && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false) return false; 
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null) return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false) return false; 
        if (other.getPriceSchedules() == null ^ this.getPriceSchedules() == null) return false;
        if (other.getPriceSchedules() != null && other.getPriceSchedules().equals(this.getPriceSchedules()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        return true;
    }
    
}
    
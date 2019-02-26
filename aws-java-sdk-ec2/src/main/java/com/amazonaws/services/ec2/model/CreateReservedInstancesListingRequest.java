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
import com.amazonaws.services.ec2.model.transform.CreateReservedInstancesListingRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateReservedInstancesListing.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReservedInstancesListingRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateReservedInstancesListingRequest> {

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of your listings. This helps avoid duplicate
     * listings. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The number of instances that are a part of a Reserved Instance account to be listed in the Reserved Instance
     * Marketplace. This number should be less than or equal to the instance count associated with the Reserved Instance
     * ID specified in this call.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * A list specifying the price of the Standard Reserved Instance for each month remaining in the Reserved Instance
     * term.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PriceScheduleSpecification> priceSchedules;
    /**
     * <p>
     * The ID of the active Standard Reserved Instance.
     * </p>
     */
    private String reservedInstancesId;

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of your listings. This helps avoid duplicate
     * listings. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of your listings. This helps avoid
     *        duplicate listings. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of your listings. This helps avoid duplicate
     * listings. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure idempotency of your listings. This helps avoid
     *         duplicate listings. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of your listings. This helps avoid duplicate
     * listings. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of your listings. This helps avoid
     *        duplicate listings. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReservedInstancesListingRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The number of instances that are a part of a Reserved Instance account to be listed in the Reserved Instance
     * Marketplace. This number should be less than or equal to the instance count associated with the Reserved Instance
     * ID specified in this call.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances that are a part of a Reserved Instance account to be listed in the Reserved
     *        Instance Marketplace. This number should be less than or equal to the instance count associated with the
     *        Reserved Instance ID specified in this call.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances that are a part of a Reserved Instance account to be listed in the Reserved Instance
     * Marketplace. This number should be less than or equal to the instance count associated with the Reserved Instance
     * ID specified in this call.
     * </p>
     * 
     * @return The number of instances that are a part of a Reserved Instance account to be listed in the Reserved
     *         Instance Marketplace. This number should be less than or equal to the instance count associated with the
     *         Reserved Instance ID specified in this call.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of instances that are a part of a Reserved Instance account to be listed in the Reserved Instance
     * Marketplace. This number should be less than or equal to the instance count associated with the Reserved Instance
     * ID specified in this call.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances that are a part of a Reserved Instance account to be listed in the Reserved
     *        Instance Marketplace. This number should be less than or equal to the instance count associated with the
     *        Reserved Instance ID specified in this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReservedInstancesListingRequest withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * A list specifying the price of the Standard Reserved Instance for each month remaining in the Reserved Instance
     * term.
     * </p>
     * 
     * @return A list specifying the price of the Standard Reserved Instance for each month remaining in the Reserved
     *         Instance term.
     */

    public java.util.List<PriceScheduleSpecification> getPriceSchedules() {
        if (priceSchedules == null) {
            priceSchedules = new com.amazonaws.internal.SdkInternalList<PriceScheduleSpecification>();
        }
        return priceSchedules;
    }

    /**
     * <p>
     * A list specifying the price of the Standard Reserved Instance for each month remaining in the Reserved Instance
     * term.
     * </p>
     * 
     * @param priceSchedules
     *        A list specifying the price of the Standard Reserved Instance for each month remaining in the Reserved
     *        Instance term.
     */

    public void setPriceSchedules(java.util.Collection<PriceScheduleSpecification> priceSchedules) {
        if (priceSchedules == null) {
            this.priceSchedules = null;
            return;
        }

        this.priceSchedules = new com.amazonaws.internal.SdkInternalList<PriceScheduleSpecification>(priceSchedules);
    }

    /**
     * <p>
     * A list specifying the price of the Standard Reserved Instance for each month remaining in the Reserved Instance
     * term.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPriceSchedules(java.util.Collection)} or {@link #withPriceSchedules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param priceSchedules
     *        A list specifying the price of the Standard Reserved Instance for each month remaining in the Reserved
     *        Instance term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReservedInstancesListingRequest withPriceSchedules(PriceScheduleSpecification... priceSchedules) {
        if (this.priceSchedules == null) {
            setPriceSchedules(new com.amazonaws.internal.SdkInternalList<PriceScheduleSpecification>(priceSchedules.length));
        }
        for (PriceScheduleSpecification ele : priceSchedules) {
            this.priceSchedules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list specifying the price of the Standard Reserved Instance for each month remaining in the Reserved Instance
     * term.
     * </p>
     * 
     * @param priceSchedules
     *        A list specifying the price of the Standard Reserved Instance for each month remaining in the Reserved
     *        Instance term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReservedInstancesListingRequest withPriceSchedules(java.util.Collection<PriceScheduleSpecification> priceSchedules) {
        setPriceSchedules(priceSchedules);
        return this;
    }

    /**
     * <p>
     * The ID of the active Standard Reserved Instance.
     * </p>
     * 
     * @param reservedInstancesId
     *        The ID of the active Standard Reserved Instance.
     */

    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }

    /**
     * <p>
     * The ID of the active Standard Reserved Instance.
     * </p>
     * 
     * @return The ID of the active Standard Reserved Instance.
     */

    public String getReservedInstancesId() {
        return this.reservedInstancesId;
    }

    /**
     * <p>
     * The ID of the active Standard Reserved Instance.
     * </p>
     * 
     * @param reservedInstancesId
     *        The ID of the active Standard Reserved Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReservedInstancesListingRequest withReservedInstancesId(String reservedInstancesId) {
        setReservedInstancesId(reservedInstancesId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateReservedInstancesListingRequest> getDryRunRequest() {
        Request<CreateReservedInstancesListingRequest> request = new CreateReservedInstancesListingRequestMarshaller().marshall(this);
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
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getPriceSchedules() != null)
            sb.append("PriceSchedules: ").append(getPriceSchedules()).append(",");
        if (getReservedInstancesId() != null)
            sb.append("ReservedInstancesId: ").append(getReservedInstancesId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReservedInstancesListingRequest == false)
            return false;
        CreateReservedInstancesListingRequest other = (CreateReservedInstancesListingRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getPriceSchedules() == null ^ this.getPriceSchedules() == null)
            return false;
        if (other.getPriceSchedules() != null && other.getPriceSchedules().equals(this.getPriceSchedules()) == false)
            return false;
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null)
            return false;
        if (other.getReservedInstancesId() != null && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getPriceSchedules() == null) ? 0 : getPriceSchedules().hashCode());
        hashCode = prime * hashCode + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode());
        return hashCode;
    }

    @Override
    public CreateReservedInstancesListingRequest clone() {
        return (CreateReservedInstancesListingRequest) super.clone();
    }
}

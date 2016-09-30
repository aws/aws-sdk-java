/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.GetReservedInstancesExchangeQuoteRequestMarshaller;

/**
 * <p>
 * Contains the parameters for GetReservedInstanceExchangeQuote.
 * </p>
 */
public class GetReservedInstancesExchangeQuoteRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetReservedInstancesExchangeQuoteRequest> {

    /**
     * <p>
     * The ID/s of the Convertible Reserved Instances you want to exchange.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> reservedInstanceIds;
    /**
     * <p>
     * The configuration requirements of the Convertible Reserved Instances you want in exchange for your current
     * Convertible Reserved Instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TargetConfigurationRequest> targetConfigurations;

    /**
     * <p>
     * The ID/s of the Convertible Reserved Instances you want to exchange.
     * </p>
     * 
     * @return The ID/s of the Convertible Reserved Instances you want to exchange.
     */

    public java.util.List<String> getReservedInstanceIds() {
        if (reservedInstanceIds == null) {
            reservedInstanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return reservedInstanceIds;
    }

    /**
     * <p>
     * The ID/s of the Convertible Reserved Instances you want to exchange.
     * </p>
     * 
     * @param reservedInstanceIds
     *        The ID/s of the Convertible Reserved Instances you want to exchange.
     */

    public void setReservedInstanceIds(java.util.Collection<String> reservedInstanceIds) {
        if (reservedInstanceIds == null) {
            this.reservedInstanceIds = null;
            return;
        }

        this.reservedInstanceIds = new com.amazonaws.internal.SdkInternalList<String>(reservedInstanceIds);
    }

    /**
     * <p>
     * The ID/s of the Convertible Reserved Instances you want to exchange.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedInstanceIds(java.util.Collection)} or {@link #withReservedInstanceIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param reservedInstanceIds
     *        The ID/s of the Convertible Reserved Instances you want to exchange.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedInstancesExchangeQuoteRequest withReservedInstanceIds(String... reservedInstanceIds) {
        if (this.reservedInstanceIds == null) {
            setReservedInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(reservedInstanceIds.length));
        }
        for (String ele : reservedInstanceIds) {
            this.reservedInstanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID/s of the Convertible Reserved Instances you want to exchange.
     * </p>
     * 
     * @param reservedInstanceIds
     *        The ID/s of the Convertible Reserved Instances you want to exchange.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedInstancesExchangeQuoteRequest withReservedInstanceIds(java.util.Collection<String> reservedInstanceIds) {
        setReservedInstanceIds(reservedInstanceIds);
        return this;
    }

    /**
     * <p>
     * The configuration requirements of the Convertible Reserved Instances you want in exchange for your current
     * Convertible Reserved Instances.
     * </p>
     * 
     * @return The configuration requirements of the Convertible Reserved Instances you want in exchange for your
     *         current Convertible Reserved Instances.
     */

    public java.util.List<TargetConfigurationRequest> getTargetConfigurations() {
        if (targetConfigurations == null) {
            targetConfigurations = new com.amazonaws.internal.SdkInternalList<TargetConfigurationRequest>();
        }
        return targetConfigurations;
    }

    /**
     * <p>
     * The configuration requirements of the Convertible Reserved Instances you want in exchange for your current
     * Convertible Reserved Instances.
     * </p>
     * 
     * @param targetConfigurations
     *        The configuration requirements of the Convertible Reserved Instances you want in exchange for your current
     *        Convertible Reserved Instances.
     */

    public void setTargetConfigurations(java.util.Collection<TargetConfigurationRequest> targetConfigurations) {
        if (targetConfigurations == null) {
            this.targetConfigurations = null;
            return;
        }

        this.targetConfigurations = new com.amazonaws.internal.SdkInternalList<TargetConfigurationRequest>(targetConfigurations);
    }

    /**
     * <p>
     * The configuration requirements of the Convertible Reserved Instances you want in exchange for your current
     * Convertible Reserved Instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetConfigurations(java.util.Collection)} or {@link #withTargetConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param targetConfigurations
     *        The configuration requirements of the Convertible Reserved Instances you want in exchange for your current
     *        Convertible Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedInstancesExchangeQuoteRequest withTargetConfigurations(TargetConfigurationRequest... targetConfigurations) {
        if (this.targetConfigurations == null) {
            setTargetConfigurations(new com.amazonaws.internal.SdkInternalList<TargetConfigurationRequest>(targetConfigurations.length));
        }
        for (TargetConfigurationRequest ele : targetConfigurations) {
            this.targetConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration requirements of the Convertible Reserved Instances you want in exchange for your current
     * Convertible Reserved Instances.
     * </p>
     * 
     * @param targetConfigurations
     *        The configuration requirements of the Convertible Reserved Instances you want in exchange for your current
     *        Convertible Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedInstancesExchangeQuoteRequest withTargetConfigurations(java.util.Collection<TargetConfigurationRequest> targetConfigurations) {
        setTargetConfigurations(targetConfigurations);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetReservedInstancesExchangeQuoteRequest> getDryRunRequest() {
        Request<GetReservedInstancesExchangeQuoteRequest> request = new GetReservedInstancesExchangeQuoteRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReservedInstanceIds() != null)
            sb.append("ReservedInstanceIds: " + getReservedInstanceIds() + ",");
        if (getTargetConfigurations() != null)
            sb.append("TargetConfigurations: " + getTargetConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReservedInstancesExchangeQuoteRequest == false)
            return false;
        GetReservedInstancesExchangeQuoteRequest other = (GetReservedInstancesExchangeQuoteRequest) obj;
        if (other.getReservedInstanceIds() == null ^ this.getReservedInstanceIds() == null)
            return false;
        if (other.getReservedInstanceIds() != null && other.getReservedInstanceIds().equals(this.getReservedInstanceIds()) == false)
            return false;
        if (other.getTargetConfigurations() == null ^ this.getTargetConfigurations() == null)
            return false;
        if (other.getTargetConfigurations() != null && other.getTargetConfigurations().equals(this.getTargetConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedInstanceIds() == null) ? 0 : getReservedInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getTargetConfigurations() == null) ? 0 : getTargetConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public GetReservedInstancesExchangeQuoteRequest clone() {
        return (GetReservedInstancesExchangeQuoteRequest) super.clone();
    }
}

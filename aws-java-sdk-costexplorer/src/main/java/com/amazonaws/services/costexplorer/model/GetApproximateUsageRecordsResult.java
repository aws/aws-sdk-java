/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetApproximateUsageRecords" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApproximateUsageRecordsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The service metadata for the service or services in the response.
     * </p>
     */
    private java.util.Map<String, Long> services;
    /**
     * <p>
     * The total number of usage records for all services in the services list.
     * </p>
     */
    private Long totalRecords;
    /**
     * <p>
     * The lookback period that's used for the estimation.
     * </p>
     */
    private DateInterval lookbackPeriod;

    /**
     * <p>
     * The service metadata for the service or services in the response.
     * </p>
     * 
     * @return The service metadata for the service or services in the response.
     */

    public java.util.Map<String, Long> getServices() {
        return services;
    }

    /**
     * <p>
     * The service metadata for the service or services in the response.
     * </p>
     * 
     * @param services
     *        The service metadata for the service or services in the response.
     */

    public void setServices(java.util.Map<String, Long> services) {
        this.services = services;
    }

    /**
     * <p>
     * The service metadata for the service or services in the response.
     * </p>
     * 
     * @param services
     *        The service metadata for the service or services in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApproximateUsageRecordsResult withServices(java.util.Map<String, Long> services) {
        setServices(services);
        return this;
    }

    /**
     * Add a single Services entry
     *
     * @see GetApproximateUsageRecordsResult#withServices
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetApproximateUsageRecordsResult addServicesEntry(String key, Long value) {
        if (null == this.services) {
            this.services = new java.util.HashMap<String, Long>();
        }
        if (this.services.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.services.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Services.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApproximateUsageRecordsResult clearServicesEntries() {
        this.services = null;
        return this;
    }

    /**
     * <p>
     * The total number of usage records for all services in the services list.
     * </p>
     * 
     * @param totalRecords
     *        The total number of usage records for all services in the services list.
     */

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    /**
     * <p>
     * The total number of usage records for all services in the services list.
     * </p>
     * 
     * @return The total number of usage records for all services in the services list.
     */

    public Long getTotalRecords() {
        return this.totalRecords;
    }

    /**
     * <p>
     * The total number of usage records for all services in the services list.
     * </p>
     * 
     * @param totalRecords
     *        The total number of usage records for all services in the services list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApproximateUsageRecordsResult withTotalRecords(Long totalRecords) {
        setTotalRecords(totalRecords);
        return this;
    }

    /**
     * <p>
     * The lookback period that's used for the estimation.
     * </p>
     * 
     * @param lookbackPeriod
     *        The lookback period that's used for the estimation.
     */

    public void setLookbackPeriod(DateInterval lookbackPeriod) {
        this.lookbackPeriod = lookbackPeriod;
    }

    /**
     * <p>
     * The lookback period that's used for the estimation.
     * </p>
     * 
     * @return The lookback period that's used for the estimation.
     */

    public DateInterval getLookbackPeriod() {
        return this.lookbackPeriod;
    }

    /**
     * <p>
     * The lookback period that's used for the estimation.
     * </p>
     * 
     * @param lookbackPeriod
     *        The lookback period that's used for the estimation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApproximateUsageRecordsResult withLookbackPeriod(DateInterval lookbackPeriod) {
        setLookbackPeriod(lookbackPeriod);
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
        if (getServices() != null)
            sb.append("Services: ").append(getServices()).append(",");
        if (getTotalRecords() != null)
            sb.append("TotalRecords: ").append(getTotalRecords()).append(",");
        if (getLookbackPeriod() != null)
            sb.append("LookbackPeriod: ").append(getLookbackPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApproximateUsageRecordsResult == false)
            return false;
        GetApproximateUsageRecordsResult other = (GetApproximateUsageRecordsResult) obj;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        if (other.getTotalRecords() == null ^ this.getTotalRecords() == null)
            return false;
        if (other.getTotalRecords() != null && other.getTotalRecords().equals(this.getTotalRecords()) == false)
            return false;
        if (other.getLookbackPeriod() == null ^ this.getLookbackPeriod() == null)
            return false;
        if (other.getLookbackPeriod() != null && other.getLookbackPeriod().equals(this.getLookbackPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        hashCode = prime * hashCode + ((getTotalRecords() == null) ? 0 : getTotalRecords().hashCode());
        hashCode = prime * hashCode + ((getLookbackPeriod() == null) ? 0 : getLookbackPeriod().hashCode());
        return hashCode;
    }

    @Override
    public GetApproximateUsageRecordsResult clone() {
        try {
            return (GetApproximateUsageRecordsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetApproximateUsageRecords" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApproximateUsageRecordsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * How granular you want the data to be. You can enable data at hourly or daily granularity.
     * </p>
     */
    private String granularity;
    /**
     * <p>
     * The service metadata for the service or services you want to query. If not specified, all elements are returned.
     * </p>
     */
    private java.util.List<String> services;
    /**
     * <p>
     * The service to evaluate for the usage records. You can choose resource-level data at daily granularity, or hourly
     * granularity with or without resource-level data.
     * </p>
     */
    private String approximationDimension;

    /**
     * <p>
     * How granular you want the data to be. You can enable data at hourly or daily granularity.
     * </p>
     * 
     * @param granularity
     *        How granular you want the data to be. You can enable data at hourly or daily granularity.
     * @see Granularity
     */

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    /**
     * <p>
     * How granular you want the data to be. You can enable data at hourly or daily granularity.
     * </p>
     * 
     * @return How granular you want the data to be. You can enable data at hourly or daily granularity.
     * @see Granularity
     */

    public String getGranularity() {
        return this.granularity;
    }

    /**
     * <p>
     * How granular you want the data to be. You can enable data at hourly or daily granularity.
     * </p>
     * 
     * @param granularity
     *        How granular you want the data to be. You can enable data at hourly or daily granularity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Granularity
     */

    public GetApproximateUsageRecordsRequest withGranularity(String granularity) {
        setGranularity(granularity);
        return this;
    }

    /**
     * <p>
     * How granular you want the data to be. You can enable data at hourly or daily granularity.
     * </p>
     * 
     * @param granularity
     *        How granular you want the data to be. You can enable data at hourly or daily granularity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Granularity
     */

    public GetApproximateUsageRecordsRequest withGranularity(Granularity granularity) {
        this.granularity = granularity.toString();
        return this;
    }

    /**
     * <p>
     * The service metadata for the service or services you want to query. If not specified, all elements are returned.
     * </p>
     * 
     * @return The service metadata for the service or services you want to query. If not specified, all elements are
     *         returned.
     */

    public java.util.List<String> getServices() {
        return services;
    }

    /**
     * <p>
     * The service metadata for the service or services you want to query. If not specified, all elements are returned.
     * </p>
     * 
     * @param services
     *        The service metadata for the service or services you want to query. If not specified, all elements are
     *        returned.
     */

    public void setServices(java.util.Collection<String> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new java.util.ArrayList<String>(services);
    }

    /**
     * <p>
     * The service metadata for the service or services you want to query. If not specified, all elements are returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServices(java.util.Collection)} or {@link #withServices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param services
     *        The service metadata for the service or services you want to query. If not specified, all elements are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApproximateUsageRecordsRequest withServices(String... services) {
        if (this.services == null) {
            setServices(new java.util.ArrayList<String>(services.length));
        }
        for (String ele : services) {
            this.services.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The service metadata for the service or services you want to query. If not specified, all elements are returned.
     * </p>
     * 
     * @param services
     *        The service metadata for the service or services you want to query. If not specified, all elements are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApproximateUsageRecordsRequest withServices(java.util.Collection<String> services) {
        setServices(services);
        return this;
    }

    /**
     * <p>
     * The service to evaluate for the usage records. You can choose resource-level data at daily granularity, or hourly
     * granularity with or without resource-level data.
     * </p>
     * 
     * @param approximationDimension
     *        The service to evaluate for the usage records. You can choose resource-level data at daily granularity, or
     *        hourly granularity with or without resource-level data.
     * @see ApproximationDimension
     */

    public void setApproximationDimension(String approximationDimension) {
        this.approximationDimension = approximationDimension;
    }

    /**
     * <p>
     * The service to evaluate for the usage records. You can choose resource-level data at daily granularity, or hourly
     * granularity with or without resource-level data.
     * </p>
     * 
     * @return The service to evaluate for the usage records. You can choose resource-level data at daily granularity,
     *         or hourly granularity with or without resource-level data.
     * @see ApproximationDimension
     */

    public String getApproximationDimension() {
        return this.approximationDimension;
    }

    /**
     * <p>
     * The service to evaluate for the usage records. You can choose resource-level data at daily granularity, or hourly
     * granularity with or without resource-level data.
     * </p>
     * 
     * @param approximationDimension
     *        The service to evaluate for the usage records. You can choose resource-level data at daily granularity, or
     *        hourly granularity with or without resource-level data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApproximationDimension
     */

    public GetApproximateUsageRecordsRequest withApproximationDimension(String approximationDimension) {
        setApproximationDimension(approximationDimension);
        return this;
    }

    /**
     * <p>
     * The service to evaluate for the usage records. You can choose resource-level data at daily granularity, or hourly
     * granularity with or without resource-level data.
     * </p>
     * 
     * @param approximationDimension
     *        The service to evaluate for the usage records. You can choose resource-level data at daily granularity, or
     *        hourly granularity with or without resource-level data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApproximationDimension
     */

    public GetApproximateUsageRecordsRequest withApproximationDimension(ApproximationDimension approximationDimension) {
        this.approximationDimension = approximationDimension.toString();
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
        if (getGranularity() != null)
            sb.append("Granularity: ").append(getGranularity()).append(",");
        if (getServices() != null)
            sb.append("Services: ").append(getServices()).append(",");
        if (getApproximationDimension() != null)
            sb.append("ApproximationDimension: ").append(getApproximationDimension());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApproximateUsageRecordsRequest == false)
            return false;
        GetApproximateUsageRecordsRequest other = (GetApproximateUsageRecordsRequest) obj;
        if (other.getGranularity() == null ^ this.getGranularity() == null)
            return false;
        if (other.getGranularity() != null && other.getGranularity().equals(this.getGranularity()) == false)
            return false;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        if (other.getApproximationDimension() == null ^ this.getApproximationDimension() == null)
            return false;
        if (other.getApproximationDimension() != null && other.getApproximationDimension().equals(this.getApproximationDimension()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGranularity() == null) ? 0 : getGranularity().hashCode());
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        hashCode = prime * hashCode + ((getApproximationDimension() == null) ? 0 : getApproximationDimension().hashCode());
        return hashCode;
    }

    @Override
    public GetApproximateUsageRecordsRequest clone() {
        return (GetApproximateUsageRecordsRequest) super.clone();
    }

}

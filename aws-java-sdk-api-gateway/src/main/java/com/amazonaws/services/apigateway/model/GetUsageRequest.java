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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The GET request to get the usage data of a usage plan in a specified time interval.
 * </p>
 */
public class GetUsageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Id of the usage plan associated with the usage data.
     * </p>
     */
    private String usagePlanId;
    /**
     * <p>
     * The Id of the API key associated with the resultant usage data.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The starting date (e.g., 2016-01-01) of the usage data.
     * </p>
     */
    private String startDate;
    /**
     * <p>
     * The ending date (e.g., 2016-12-31) of the usage data.
     * </p>
     */
    private String endDate;
    /**
     * <p>
     * Position
     * </p>
     */
    private String position;
    /**
     * <p>
     * The maximum number of results to be returned.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The Id of the usage plan associated with the usage data.
     * </p>
     * 
     * @param usagePlanId
     *        The Id of the usage plan associated with the usage data.
     */

    public void setUsagePlanId(String usagePlanId) {
        this.usagePlanId = usagePlanId;
    }

    /**
     * <p>
     * The Id of the usage plan associated with the usage data.
     * </p>
     * 
     * @return The Id of the usage plan associated with the usage data.
     */

    public String getUsagePlanId() {
        return this.usagePlanId;
    }

    /**
     * <p>
     * The Id of the usage plan associated with the usage data.
     * </p>
     * 
     * @param usagePlanId
     *        The Id of the usage plan associated with the usage data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageRequest withUsagePlanId(String usagePlanId) {
        setUsagePlanId(usagePlanId);
        return this;
    }

    /**
     * <p>
     * The Id of the API key associated with the resultant usage data.
     * </p>
     * 
     * @param keyId
     *        The Id of the API key associated with the resultant usage data.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The Id of the API key associated with the resultant usage data.
     * </p>
     * 
     * @return The Id of the API key associated with the resultant usage data.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The Id of the API key associated with the resultant usage data.
     * </p>
     * 
     * @param keyId
     *        The Id of the API key associated with the resultant usage data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The starting date (e.g., 2016-01-01) of the usage data.
     * </p>
     * 
     * @param startDate
     *        The starting date (e.g., 2016-01-01) of the usage data.
     */

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The starting date (e.g., 2016-01-01) of the usage data.
     * </p>
     * 
     * @return The starting date (e.g., 2016-01-01) of the usage data.
     */

    public String getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The starting date (e.g., 2016-01-01) of the usage data.
     * </p>
     * 
     * @param startDate
     *        The starting date (e.g., 2016-01-01) of the usage data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageRequest withStartDate(String startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The ending date (e.g., 2016-12-31) of the usage data.
     * </p>
     * 
     * @param endDate
     *        The ending date (e.g., 2016-12-31) of the usage data.
     */

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The ending date (e.g., 2016-12-31) of the usage data.
     * </p>
     * 
     * @return The ending date (e.g., 2016-12-31) of the usage data.
     */

    public String getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The ending date (e.g., 2016-12-31) of the usage data.
     * </p>
     * 
     * @param endDate
     *        The ending date (e.g., 2016-12-31) of the usage data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageRequest withEndDate(String endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * Position
     * </p>
     * 
     * @param position
     *        Position
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * Position
     * </p>
     * 
     * @return Position
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * Position
     * </p>
     * 
     * @param position
     *        Position
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageRequest withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned.
     * </p>
     * 
     * @param limit
     *        The maximum number of results to be returned.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of results to be returned.
     * </p>
     * 
     * @return The maximum number of results to be returned.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of results to be returned.
     * </p>
     * 
     * @param limit
     *        The maximum number of results to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
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
        if (getUsagePlanId() != null)
            sb.append("UsagePlanId: " + getUsagePlanId() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getStartDate() != null)
            sb.append("StartDate: " + getStartDate() + ",");
        if (getEndDate() != null)
            sb.append("EndDate: " + getEndDate() + ",");
        if (getPosition() != null)
            sb.append("Position: " + getPosition() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsageRequest == false)
            return false;
        GetUsageRequest other = (GetUsageRequest) obj;
        if (other.getUsagePlanId() == null ^ this.getUsagePlanId() == null)
            return false;
        if (other.getUsagePlanId() != null && other.getUsagePlanId().equals(this.getUsagePlanId()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsagePlanId() == null) ? 0 : getUsagePlanId().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public GetUsageRequest clone() {
        return (GetUsageRequest) super.clone();
    }
}

/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetUsageStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUsageStatisticsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose usage statistics you want to retrieve.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The type of usage statistics to retrieve.
     * </p>
     */
    private String usageStatisticType;
    /**
     * <p>
     * Represents the criteria used for querying usage.
     * </p>
     */
    private UsageCriteria usageCriteria;
    /**
     * <p>
     * The currency unit you would like to view your usage statistics in. Current valid values are USD.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous
     * request to continue listing results after the first page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose usage statistics you want to retrieve.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector that specifies the GuardDuty service whose usage statistics you want to retrieve.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose usage statistics you want to retrieve.
     * </p>
     * 
     * @return The ID of the detector that specifies the GuardDuty service whose usage statistics you want to retrieve.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose usage statistics you want to retrieve.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector that specifies the GuardDuty service whose usage statistics you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageStatisticsRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The type of usage statistics to retrieve.
     * </p>
     * 
     * @param usageStatisticType
     *        The type of usage statistics to retrieve.
     * @see UsageStatisticType
     */

    public void setUsageStatisticType(String usageStatisticType) {
        this.usageStatisticType = usageStatisticType;
    }

    /**
     * <p>
     * The type of usage statistics to retrieve.
     * </p>
     * 
     * @return The type of usage statistics to retrieve.
     * @see UsageStatisticType
     */

    public String getUsageStatisticType() {
        return this.usageStatisticType;
    }

    /**
     * <p>
     * The type of usage statistics to retrieve.
     * </p>
     * 
     * @param usageStatisticType
     *        The type of usage statistics to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageStatisticType
     */

    public GetUsageStatisticsRequest withUsageStatisticType(String usageStatisticType) {
        setUsageStatisticType(usageStatisticType);
        return this;
    }

    /**
     * <p>
     * The type of usage statistics to retrieve.
     * </p>
     * 
     * @param usageStatisticType
     *        The type of usage statistics to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageStatisticType
     */

    public GetUsageStatisticsRequest withUsageStatisticType(UsageStatisticType usageStatisticType) {
        this.usageStatisticType = usageStatisticType.toString();
        return this;
    }

    /**
     * <p>
     * Represents the criteria used for querying usage.
     * </p>
     * 
     * @param usageCriteria
     *        Represents the criteria used for querying usage.
     */

    public void setUsageCriteria(UsageCriteria usageCriteria) {
        this.usageCriteria = usageCriteria;
    }

    /**
     * <p>
     * Represents the criteria used for querying usage.
     * </p>
     * 
     * @return Represents the criteria used for querying usage.
     */

    public UsageCriteria getUsageCriteria() {
        return this.usageCriteria;
    }

    /**
     * <p>
     * Represents the criteria used for querying usage.
     * </p>
     * 
     * @param usageCriteria
     *        Represents the criteria used for querying usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageStatisticsRequest withUsageCriteria(UsageCriteria usageCriteria) {
        setUsageCriteria(usageCriteria);
        return this;
    }

    /**
     * <p>
     * The currency unit you would like to view your usage statistics in. Current valid values are USD.
     * </p>
     * 
     * @param unit
     *        The currency unit you would like to view your usage statistics in. Current valid values are USD.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The currency unit you would like to view your usage statistics in. Current valid values are USD.
     * </p>
     * 
     * @return The currency unit you would like to view your usage statistics in. Current valid values are USD.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The currency unit you would like to view your usage statistics in. Current valid values are USD.
     * </p>
     * 
     * @param unit
     *        The currency unit you would like to view your usage statistics in. Current valid values are USD.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageStatisticsRequest withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @return The maximum number of results to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageStatisticsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous
     * request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request to a list action. For subsequent calls, use the NextToken value returned
     *        from the previous request to continue listing results after the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous
     * request to continue listing results after the first page.
     * </p>
     * 
     * @return A token to use for paginating results that are returned in the response. Set the value of this parameter
     *         to null for the first request to a list action. For subsequent calls, use the NextToken value returned
     *         from the previous request to continue listing results after the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous
     * request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request to a list action. For subsequent calls, use the NextToken value returned
     *        from the previous request to continue listing results after the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageStatisticsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getUsageStatisticType() != null)
            sb.append("UsageStatisticType: ").append(getUsageStatisticType()).append(",");
        if (getUsageCriteria() != null)
            sb.append("UsageCriteria: ").append(getUsageCriteria()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsageStatisticsRequest == false)
            return false;
        GetUsageStatisticsRequest other = (GetUsageStatisticsRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getUsageStatisticType() == null ^ this.getUsageStatisticType() == null)
            return false;
        if (other.getUsageStatisticType() != null && other.getUsageStatisticType().equals(this.getUsageStatisticType()) == false)
            return false;
        if (other.getUsageCriteria() == null ^ this.getUsageCriteria() == null)
            return false;
        if (other.getUsageCriteria() != null && other.getUsageCriteria().equals(this.getUsageCriteria()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getUsageStatisticType() == null) ? 0 : getUsageStatisticType().hashCode());
        hashCode = prime * hashCode + ((getUsageCriteria() == null) ? 0 : getUsageCriteria().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetUsageStatisticsRequest clone() {
        return (GetUsageStatisticsRequest) super.clone();
    }

}

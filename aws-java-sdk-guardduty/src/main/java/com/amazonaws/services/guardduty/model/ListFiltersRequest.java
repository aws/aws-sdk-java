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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFiltersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the detector that specifies the GuardDuty service where you want to list filters. */
    private String detectorId;
    /** Indicates the maximum number of items that you want in the response. The maximum value is 50. */
    private Integer maxResults;
    /**
     * Paginates results. Set the value of this parameter to NULL on your first call to the ListFilters operation.For
     * subsequent calls to the operation, fill nextToken in the request with the value of nextToken from the previous
     * response to continue listing data.
     */
    private String nextToken;

    /**
     * The ID of the detector that specifies the GuardDuty service where you want to list filters.
     * 
     * @param detectorId
     *        The ID of the detector that specifies the GuardDuty service where you want to list filters.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * The ID of the detector that specifies the GuardDuty service where you want to list filters.
     * 
     * @return The ID of the detector that specifies the GuardDuty service where you want to list filters.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * The ID of the detector that specifies the GuardDuty service where you want to list filters.
     * 
     * @param detectorId
     *        The ID of the detector that specifies the GuardDuty service where you want to list filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFiltersRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * Indicates the maximum number of items that you want in the response. The maximum value is 50.
     * 
     * @param maxResults
     *        Indicates the maximum number of items that you want in the response. The maximum value is 50.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Indicates the maximum number of items that you want in the response. The maximum value is 50.
     * 
     * @return Indicates the maximum number of items that you want in the response. The maximum value is 50.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * Indicates the maximum number of items that you want in the response. The maximum value is 50.
     * 
     * @param maxResults
     *        Indicates the maximum number of items that you want in the response. The maximum value is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFiltersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * Paginates results. Set the value of this parameter to NULL on your first call to the ListFilters operation.For
     * subsequent calls to the operation, fill nextToken in the request with the value of nextToken from the previous
     * response to continue listing data.
     * 
     * @param nextToken
     *        Paginates results. Set the value of this parameter to NULL on your first call to the ListFilters
     *        operation.For subsequent calls to the operation, fill nextToken in the request with the value of nextToken
     *        from the previous response to continue listing data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Paginates results. Set the value of this parameter to NULL on your first call to the ListFilters operation.For
     * subsequent calls to the operation, fill nextToken in the request with the value of nextToken from the previous
     * response to continue listing data.
     * 
     * @return Paginates results. Set the value of this parameter to NULL on your first call to the ListFilters
     *         operation.For subsequent calls to the operation, fill nextToken in the request with the value of
     *         nextToken from the previous response to continue listing data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * Paginates results. Set the value of this parameter to NULL on your first call to the ListFilters operation.For
     * subsequent calls to the operation, fill nextToken in the request with the value of nextToken from the previous
     * response to continue listing data.
     * 
     * @param nextToken
     *        Paginates results. Set the value of this parameter to NULL on your first call to the ListFilters
     *        operation.For subsequent calls to the operation, fill nextToken in the request with the value of nextToken
     *        from the previous response to continue listing data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFiltersRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListFiltersRequest == false)
            return false;
        ListFiltersRequest other = (ListFiltersRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
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
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFiltersRequest clone() {
        return (ListFiltersRequest) super.clone();
    }

}

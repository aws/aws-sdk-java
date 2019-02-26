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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListThreatIntelSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListThreatIntelSetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The detectorID that specifies the GuardDuty service whose ThreatIntelSets you want to list. */
    private String detectorId;
    /**
     * You can use this parameter to indicate the maximum number of items that you want in the response. The default
     * value is 7. The maximum value is 7.
     */
    private Integer maxResults;
    /** Pagination token to start retrieving threat intel sets from. */
    private String nextToken;

    /**
     * The detectorID that specifies the GuardDuty service whose ThreatIntelSets you want to list.
     * 
     * @param detectorId
     *        The detectorID that specifies the GuardDuty service whose ThreatIntelSets you want to list.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * The detectorID that specifies the GuardDuty service whose ThreatIntelSets you want to list.
     * 
     * @return The detectorID that specifies the GuardDuty service whose ThreatIntelSets you want to list.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * The detectorID that specifies the GuardDuty service whose ThreatIntelSets you want to list.
     * 
     * @param detectorId
     *        The detectorID that specifies the GuardDuty service whose ThreatIntelSets you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThreatIntelSetsRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * You can use this parameter to indicate the maximum number of items that you want in the response. The default
     * value is 7. The maximum value is 7.
     * 
     * @param maxResults
     *        You can use this parameter to indicate the maximum number of items that you want in the response. The
     *        default value is 7. The maximum value is 7.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * You can use this parameter to indicate the maximum number of items that you want in the response. The default
     * value is 7. The maximum value is 7.
     * 
     * @return You can use this parameter to indicate the maximum number of items that you want in the response. The
     *         default value is 7. The maximum value is 7.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * You can use this parameter to indicate the maximum number of items that you want in the response. The default
     * value is 7. The maximum value is 7.
     * 
     * @param maxResults
     *        You can use this parameter to indicate the maximum number of items that you want in the response. The
     *        default value is 7. The maximum value is 7.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThreatIntelSetsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * Pagination token to start retrieving threat intel sets from.
     * 
     * @param nextToken
     *        Pagination token to start retrieving threat intel sets from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Pagination token to start retrieving threat intel sets from.
     * 
     * @return Pagination token to start retrieving threat intel sets from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * Pagination token to start retrieving threat intel sets from.
     * 
     * @param nextToken
     *        Pagination token to start retrieving threat intel sets from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThreatIntelSetsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListThreatIntelSetsRequest == false)
            return false;
        ListThreatIntelSetsRequest other = (ListThreatIntelSetsRequest) obj;
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
    public ListThreatIntelSetsRequest clone() {
        return (ListThreatIntelSetsRequest) super.clone();
    }

}

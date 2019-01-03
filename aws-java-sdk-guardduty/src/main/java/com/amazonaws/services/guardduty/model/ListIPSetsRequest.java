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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListIPSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIPSetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The unique ID of the detector that you want to retrieve. */
    private String detectorId;
    /**
     * You can use this parameter to indicate the maximum number of items that you want in the response. The default
     * value is 7. The maximum value is 7.
     */
    private Integer maxResults;
    /**
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the ListIPSet action. For subsequent calls to the action fill nextToken in the request with the value of
     * NextToken from the previous response to continue listing data.
     */
    private String nextToken;

    /**
     * The unique ID of the detector that you want to retrieve.
     * 
     * @param detectorId
     *        The unique ID of the detector that you want to retrieve.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * The unique ID of the detector that you want to retrieve.
     * 
     * @return The unique ID of the detector that you want to retrieve.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * The unique ID of the detector that you want to retrieve.
     * 
     * @param detectorId
     *        The unique ID of the detector that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIPSetsRequest withDetectorId(String detectorId) {
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

    public ListIPSetsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the ListIPSet action. For subsequent calls to the action fill nextToken in the request with the value of
     * NextToken from the previous response to continue listing data.
     * 
     * @param nextToken
     *        You can use this parameter when paginating results. Set the value of this parameter to null on your first
     *        call to the ListIPSet action. For subsequent calls to the action fill nextToken in the request with the
     *        value of NextToken from the previous response to continue listing data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the ListIPSet action. For subsequent calls to the action fill nextToken in the request with the value of
     * NextToken from the previous response to continue listing data.
     * 
     * @return You can use this parameter when paginating results. Set the value of this parameter to null on your first
     *         call to the ListIPSet action. For subsequent calls to the action fill nextToken in the request with the
     *         value of NextToken from the previous response to continue listing data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the ListIPSet action. For subsequent calls to the action fill nextToken in the request with the value of
     * NextToken from the previous response to continue listing data.
     * 
     * @param nextToken
     *        You can use this parameter when paginating results. Set the value of this parameter to null on your first
     *        call to the ListIPSet action. For subsequent calls to the action fill nextToken in the request with the
     *        value of NextToken from the previous response to continue listing data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIPSetsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListIPSetsRequest == false)
            return false;
        ListIPSetsRequest other = (ListIPSetsRequest) obj;
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
    public ListIPSetsRequest clone() {
        return (ListIPSetsRequest) super.clone();
    }

}

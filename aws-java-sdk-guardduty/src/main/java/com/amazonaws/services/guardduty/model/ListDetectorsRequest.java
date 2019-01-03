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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListDetectors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDetectorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** You can use this parameter to indicate the maximum number of detectors that you want in the response. */
    private Integer maxResults;
    /**
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the ListDetectors action. For subsequent calls to the action fill nextToken in the request with the value of
     * nextToken from the previous response to continue listing data.
     */
    private String nextToken;

    /**
     * You can use this parameter to indicate the maximum number of detectors that you want in the response.
     * 
     * @param maxResults
     *        You can use this parameter to indicate the maximum number of detectors that you want in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * You can use this parameter to indicate the maximum number of detectors that you want in the response.
     * 
     * @return You can use this parameter to indicate the maximum number of detectors that you want in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * You can use this parameter to indicate the maximum number of detectors that you want in the response.
     * 
     * @param maxResults
     *        You can use this parameter to indicate the maximum number of detectors that you want in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectorsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the ListDetectors action. For subsequent calls to the action fill nextToken in the request with the value of
     * nextToken from the previous response to continue listing data.
     * 
     * @param nextToken
     *        You can use this parameter when paginating results. Set the value of this parameter to null on your first
     *        call to the ListDetectors action. For subsequent calls to the action fill nextToken in the request with
     *        the value of nextToken from the previous response to continue listing data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the ListDetectors action. For subsequent calls to the action fill nextToken in the request with the value of
     * nextToken from the previous response to continue listing data.
     * 
     * @return You can use this parameter when paginating results. Set the value of this parameter to null on your first
     *         call to the ListDetectors action. For subsequent calls to the action fill nextToken in the request with
     *         the value of nextToken from the previous response to continue listing data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the ListDetectors action. For subsequent calls to the action fill nextToken in the request with the value of
     * nextToken from the previous response to continue listing data.
     * 
     * @param nextToken
     *        You can use this parameter when paginating results. Set the value of this parameter to null on your first
     *        call to the ListDetectors action. For subsequent calls to the action fill nextToken in the request with
     *        the value of nextToken from the previous response to continue listing data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectorsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListDetectorsRequest == false)
            return false;
        ListDetectorsRequest other = (ListDetectorsRequest) obj;
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDetectorsRequest clone() {
        return (ListDetectorsRequest) super.clone();
    }

}

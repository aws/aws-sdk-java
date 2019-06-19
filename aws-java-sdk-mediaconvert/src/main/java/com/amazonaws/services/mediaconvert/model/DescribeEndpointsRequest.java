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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * DescribeEndpointsRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DescribeEndpoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEndpointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Optional. Max number of endpoints, up to twenty, that will be returned at one time. */
    private Integer maxResults;
    /**
     * Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any exist, or
     * to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to return your
     * endpoints if any exist, or an empty list if none exist.
     */
    private String mode;
    /** Use this string, provided with the response to a previous request, to request the next batch of endpoints. */
    private String nextToken;

    /**
     * Optional. Max number of endpoints, up to twenty, that will be returned at one time.
     * 
     * @param maxResults
     *        Optional. Max number of endpoints, up to twenty, that will be returned at one time.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Optional. Max number of endpoints, up to twenty, that will be returned at one time.
     * 
     * @return Optional. Max number of endpoints, up to twenty, that will be returned at one time.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * Optional. Max number of endpoints, up to twenty, that will be returned at one time.
     * 
     * @param maxResults
     *        Optional. Max number of endpoints, up to twenty, that will be returned at one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any exist, or
     * to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to return your
     * endpoints if any exist, or an empty list if none exist.
     * 
     * @param mode
     *        Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any
     *        exist, or to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to
     *        return your endpoints if any exist, or an empty list if none exist.
     * @see DescribeEndpointsMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any exist, or
     * to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to return your
     * endpoints if any exist, or an empty list if none exist.
     * 
     * @return Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any
     *         exist, or to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to
     *         return your endpoints if any exist, or an empty list if none exist.
     * @see DescribeEndpointsMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any exist, or
     * to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to return your
     * endpoints if any exist, or an empty list if none exist.
     * 
     * @param mode
     *        Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any
     *        exist, or to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to
     *        return your endpoints if any exist, or an empty list if none exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DescribeEndpointsMode
     */

    public DescribeEndpointsRequest withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any exist, or
     * to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to return your
     * endpoints if any exist, or an empty list if none exist.
     * 
     * @param mode
     *        Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any
     *        exist, or to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to
     *        return your endpoints if any exist, or an empty list if none exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DescribeEndpointsMode
     */

    public DescribeEndpointsRequest withMode(DescribeEndpointsMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * Use this string, provided with the response to a previous request, to request the next batch of endpoints.
     * 
     * @param nextToken
     *        Use this string, provided with the response to a previous request, to request the next batch of endpoints.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Use this string, provided with the response to a previous request, to request the next batch of endpoints.
     * 
     * @return Use this string, provided with the response to a previous request, to request the next batch of
     *         endpoints.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * Use this string, provided with the response to a previous request, to request the next batch of endpoints.
     * 
     * @param nextToken
     *        Use this string, provided with the response to a previous request, to request the next batch of endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointsRequest withNextToken(String nextToken) {
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
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

        if (obj instanceof DescribeEndpointsRequest == false)
            return false;
        DescribeEndpointsRequest other = (DescribeEndpointsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
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
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEndpointsRequest clone() {
        return (DescribeEndpointsRequest) super.clone();
    }

}

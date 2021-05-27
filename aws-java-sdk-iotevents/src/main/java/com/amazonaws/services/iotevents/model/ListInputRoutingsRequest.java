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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListInputRoutings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInputRoutingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifer of the routed input.
     * </p>
     */
    private InputIdentifier inputIdentifier;
    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token that you can use to return the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifer of the routed input.
     * </p>
     * 
     * @param inputIdentifier
     *        The identifer of the routed input.
     */

    public void setInputIdentifier(InputIdentifier inputIdentifier) {
        this.inputIdentifier = inputIdentifier;
    }

    /**
     * <p>
     * The identifer of the routed input.
     * </p>
     * 
     * @return The identifer of the routed input.
     */

    public InputIdentifier getInputIdentifier() {
        return this.inputIdentifier;
    }

    /**
     * <p>
     * The identifer of the routed input.
     * </p>
     * 
     * @param inputIdentifier
     *        The identifer of the routed input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputRoutingsRequest withInputIdentifier(InputIdentifier inputIdentifier) {
        setInputIdentifier(inputIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @return The maximum number of results to be returned per request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputRoutingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token that you can use to return the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results.
     * </p>
     * 
     * @return The token that you can use to return the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token that you can use to return the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputRoutingsRequest withNextToken(String nextToken) {
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
        if (getInputIdentifier() != null)
            sb.append("InputIdentifier: ").append(getInputIdentifier()).append(",");
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

        if (obj instanceof ListInputRoutingsRequest == false)
            return false;
        ListInputRoutingsRequest other = (ListInputRoutingsRequest) obj;
        if (other.getInputIdentifier() == null ^ this.getInputIdentifier() == null)
            return false;
        if (other.getInputIdentifier() != null && other.getInputIdentifier().equals(this.getInputIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getInputIdentifier() == null) ? 0 : getInputIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInputRoutingsRequest clone() {
        return (ListInputRoutingsRequest) super.clone();
    }

}

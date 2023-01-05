/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.oam.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/ListAttachedLinks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAttachedLinksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Limits the number of returned links to the specified number.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of items to return. You received this token from a previous call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ARN of the sink that you want to retrieve links for.
     * </p>
     */
    private String sinkIdentifier;

    /**
     * <p>
     * Limits the number of returned links to the specified number.
     * </p>
     * 
     * @param maxResults
     *        Limits the number of returned links to the specified number.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Limits the number of returned links to the specified number.
     * </p>
     * 
     * @return Limits the number of returned links to the specified number.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Limits the number of returned links to the specified number.
     * </p>
     * 
     * @param maxResults
     *        Limits the number of returned links to the specified number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachedLinksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. You received this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. You received this token from a previous call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. You received this token from a previous call.
     * </p>
     * 
     * @return The token for the next set of items to return. You received this token from a previous call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. You received this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. You received this token from a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachedLinksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ARN of the sink that you want to retrieve links for.
     * </p>
     * 
     * @param sinkIdentifier
     *        The ARN of the sink that you want to retrieve links for.
     */

    public void setSinkIdentifier(String sinkIdentifier) {
        this.sinkIdentifier = sinkIdentifier;
    }

    /**
     * <p>
     * The ARN of the sink that you want to retrieve links for.
     * </p>
     * 
     * @return The ARN of the sink that you want to retrieve links for.
     */

    public String getSinkIdentifier() {
        return this.sinkIdentifier;
    }

    /**
     * <p>
     * The ARN of the sink that you want to retrieve links for.
     * </p>
     * 
     * @param sinkIdentifier
     *        The ARN of the sink that you want to retrieve links for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachedLinksRequest withSinkIdentifier(String sinkIdentifier) {
        setSinkIdentifier(sinkIdentifier);
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
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSinkIdentifier() != null)
            sb.append("SinkIdentifier: ").append(getSinkIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAttachedLinksRequest == false)
            return false;
        ListAttachedLinksRequest other = (ListAttachedLinksRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSinkIdentifier() == null ^ this.getSinkIdentifier() == null)
            return false;
        if (other.getSinkIdentifier() != null && other.getSinkIdentifier().equals(this.getSinkIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSinkIdentifier() == null) ? 0 : getSinkIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ListAttachedLinksRequest clone() {
        return (ListAttachedLinksRequest) super.clone();
    }

}

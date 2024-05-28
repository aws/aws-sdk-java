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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListCompositions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCompositionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters the Composition list to match the specified EncoderConfiguration attached to at least one of its output.
     * </p>
     */
    private String filterByEncoderConfigurationArn;
    /**
     * <p>
     * Filters the Composition list to match the specified Stage ARN.
     * </p>
     */
    private String filterByStageArn;
    /**
     * <p>
     * Maximum number of results to return. Default: 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The first Composition to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Filters the Composition list to match the specified EncoderConfiguration attached to at least one of its output.
     * </p>
     * 
     * @param filterByEncoderConfigurationArn
     *        Filters the Composition list to match the specified EncoderConfiguration attached to at least one of its
     *        output.
     */

    public void setFilterByEncoderConfigurationArn(String filterByEncoderConfigurationArn) {
        this.filterByEncoderConfigurationArn = filterByEncoderConfigurationArn;
    }

    /**
     * <p>
     * Filters the Composition list to match the specified EncoderConfiguration attached to at least one of its output.
     * </p>
     * 
     * @return Filters the Composition list to match the specified EncoderConfiguration attached to at least one of its
     *         output.
     */

    public String getFilterByEncoderConfigurationArn() {
        return this.filterByEncoderConfigurationArn;
    }

    /**
     * <p>
     * Filters the Composition list to match the specified EncoderConfiguration attached to at least one of its output.
     * </p>
     * 
     * @param filterByEncoderConfigurationArn
     *        Filters the Composition list to match the specified EncoderConfiguration attached to at least one of its
     *        output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCompositionsRequest withFilterByEncoderConfigurationArn(String filterByEncoderConfigurationArn) {
        setFilterByEncoderConfigurationArn(filterByEncoderConfigurationArn);
        return this;
    }

    /**
     * <p>
     * Filters the Composition list to match the specified Stage ARN.
     * </p>
     * 
     * @param filterByStageArn
     *        Filters the Composition list to match the specified Stage ARN.
     */

    public void setFilterByStageArn(String filterByStageArn) {
        this.filterByStageArn = filterByStageArn;
    }

    /**
     * <p>
     * Filters the Composition list to match the specified Stage ARN.
     * </p>
     * 
     * @return Filters the Composition list to match the specified Stage ARN.
     */

    public String getFilterByStageArn() {
        return this.filterByStageArn;
    }

    /**
     * <p>
     * Filters the Composition list to match the specified Stage ARN.
     * </p>
     * 
     * @param filterByStageArn
     *        Filters the Composition list to match the specified Stage ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCompositionsRequest withFilterByStageArn(String filterByStageArn) {
        setFilterByStageArn(filterByStageArn);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return. Default: 100.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return. Default: 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return. Default: 100.
     * </p>
     * 
     * @return Maximum number of results to return. Default: 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return. Default: 100.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return. Default: 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCompositionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The first Composition to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     * 
     * @param nextToken
     *        The first Composition to retrieve. This is used for pagination; see the <code>nextToken</code> response
     *        field.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The first Composition to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     * 
     * @return The first Composition to retrieve. This is used for pagination; see the <code>nextToken</code> response
     *         field.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The first Composition to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     * 
     * @param nextToken
     *        The first Composition to retrieve. This is used for pagination; see the <code>nextToken</code> response
     *        field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCompositionsRequest withNextToken(String nextToken) {
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
        if (getFilterByEncoderConfigurationArn() != null)
            sb.append("FilterByEncoderConfigurationArn: ").append(getFilterByEncoderConfigurationArn()).append(",");
        if (getFilterByStageArn() != null)
            sb.append("FilterByStageArn: ").append(getFilterByStageArn()).append(",");
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

        if (obj instanceof ListCompositionsRequest == false)
            return false;
        ListCompositionsRequest other = (ListCompositionsRequest) obj;
        if (other.getFilterByEncoderConfigurationArn() == null ^ this.getFilterByEncoderConfigurationArn() == null)
            return false;
        if (other.getFilterByEncoderConfigurationArn() != null
                && other.getFilterByEncoderConfigurationArn().equals(this.getFilterByEncoderConfigurationArn()) == false)
            return false;
        if (other.getFilterByStageArn() == null ^ this.getFilterByStageArn() == null)
            return false;
        if (other.getFilterByStageArn() != null && other.getFilterByStageArn().equals(this.getFilterByStageArn()) == false)
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

        hashCode = prime * hashCode + ((getFilterByEncoderConfigurationArn() == null) ? 0 : getFilterByEncoderConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getFilterByStageArn() == null) ? 0 : getFilterByStageArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCompositionsRequest clone() {
        return (ListCompositionsRequest) super.clone();
    }

}

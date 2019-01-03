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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetSamplingStatisticSummaries" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSamplingStatisticSummariesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the number of requests instrumented for each sampling rule.
     * </p>
     */
    private java.util.List<SamplingStatisticSummary> samplingStatisticSummaries;
    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the number of requests instrumented for each sampling rule.
     * </p>
     * 
     * @return Information about the number of requests instrumented for each sampling rule.
     */

    public java.util.List<SamplingStatisticSummary> getSamplingStatisticSummaries() {
        return samplingStatisticSummaries;
    }

    /**
     * <p>
     * Information about the number of requests instrumented for each sampling rule.
     * </p>
     * 
     * @param samplingStatisticSummaries
     *        Information about the number of requests instrumented for each sampling rule.
     */

    public void setSamplingStatisticSummaries(java.util.Collection<SamplingStatisticSummary> samplingStatisticSummaries) {
        if (samplingStatisticSummaries == null) {
            this.samplingStatisticSummaries = null;
            return;
        }

        this.samplingStatisticSummaries = new java.util.ArrayList<SamplingStatisticSummary>(samplingStatisticSummaries);
    }

    /**
     * <p>
     * Information about the number of requests instrumented for each sampling rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSamplingStatisticSummaries(java.util.Collection)} or
     * {@link #withSamplingStatisticSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param samplingStatisticSummaries
     *        Information about the number of requests instrumented for each sampling rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSamplingStatisticSummariesResult withSamplingStatisticSummaries(SamplingStatisticSummary... samplingStatisticSummaries) {
        if (this.samplingStatisticSummaries == null) {
            setSamplingStatisticSummaries(new java.util.ArrayList<SamplingStatisticSummary>(samplingStatisticSummaries.length));
        }
        for (SamplingStatisticSummary ele : samplingStatisticSummaries) {
            this.samplingStatisticSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the number of requests instrumented for each sampling rule.
     * </p>
     * 
     * @param samplingStatisticSummaries
     *        Information about the number of requests instrumented for each sampling rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSamplingStatisticSummariesResult withSamplingStatisticSummaries(java.util.Collection<SamplingStatisticSummary> samplingStatisticSummaries) {
        setSamplingStatisticSummaries(samplingStatisticSummaries);
        return this;
    }

    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. Not used.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     * 
     * @return Pagination token. Not used.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. Not used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSamplingStatisticSummariesResult withNextToken(String nextToken) {
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
        if (getSamplingStatisticSummaries() != null)
            sb.append("SamplingStatisticSummaries: ").append(getSamplingStatisticSummaries()).append(",");
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

        if (obj instanceof GetSamplingStatisticSummariesResult == false)
            return false;
        GetSamplingStatisticSummariesResult other = (GetSamplingStatisticSummariesResult) obj;
        if (other.getSamplingStatisticSummaries() == null ^ this.getSamplingStatisticSummaries() == null)
            return false;
        if (other.getSamplingStatisticSummaries() != null && other.getSamplingStatisticSummaries().equals(this.getSamplingStatisticSummaries()) == false)
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

        hashCode = prime * hashCode + ((getSamplingStatisticSummaries() == null) ? 0 : getSamplingStatisticSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetSamplingStatisticSummariesResult clone() {
        try {
            return (GetSamplingStatisticSummariesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetSamplingRules" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSamplingRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Rule definitions and metadata.
     * </p>
     */
    private java.util.List<SamplingRuleRecord> samplingRuleRecords;
    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Rule definitions and metadata.
     * </p>
     * 
     * @return Rule definitions and metadata.
     */

    public java.util.List<SamplingRuleRecord> getSamplingRuleRecords() {
        return samplingRuleRecords;
    }

    /**
     * <p>
     * Rule definitions and metadata.
     * </p>
     * 
     * @param samplingRuleRecords
     *        Rule definitions and metadata.
     */

    public void setSamplingRuleRecords(java.util.Collection<SamplingRuleRecord> samplingRuleRecords) {
        if (samplingRuleRecords == null) {
            this.samplingRuleRecords = null;
            return;
        }

        this.samplingRuleRecords = new java.util.ArrayList<SamplingRuleRecord>(samplingRuleRecords);
    }

    /**
     * <p>
     * Rule definitions and metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSamplingRuleRecords(java.util.Collection)} or {@link #withSamplingRuleRecords(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param samplingRuleRecords
     *        Rule definitions and metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSamplingRulesResult withSamplingRuleRecords(SamplingRuleRecord... samplingRuleRecords) {
        if (this.samplingRuleRecords == null) {
            setSamplingRuleRecords(new java.util.ArrayList<SamplingRuleRecord>(samplingRuleRecords.length));
        }
        for (SamplingRuleRecord ele : samplingRuleRecords) {
            this.samplingRuleRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Rule definitions and metadata.
     * </p>
     * 
     * @param samplingRuleRecords
     *        Rule definitions and metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSamplingRulesResult withSamplingRuleRecords(java.util.Collection<SamplingRuleRecord> samplingRuleRecords) {
        setSamplingRuleRecords(samplingRuleRecords);
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

    public GetSamplingRulesResult withNextToken(String nextToken) {
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
        if (getSamplingRuleRecords() != null)
            sb.append("SamplingRuleRecords: ").append(getSamplingRuleRecords()).append(",");
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

        if (obj instanceof GetSamplingRulesResult == false)
            return false;
        GetSamplingRulesResult other = (GetSamplingRulesResult) obj;
        if (other.getSamplingRuleRecords() == null ^ this.getSamplingRuleRecords() == null)
            return false;
        if (other.getSamplingRuleRecords() != null && other.getSamplingRuleRecords().equals(this.getSamplingRuleRecords()) == false)
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

        hashCode = prime * hashCode + ((getSamplingRuleRecords() == null) ? 0 : getSamplingRuleRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetSamplingRulesResult clone() {
        try {
            return (GetSamplingRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

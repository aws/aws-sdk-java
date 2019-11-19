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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetConformancePackComplianceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConformancePackComplianceSummaryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private com.amazonaws.internal.SdkInternalList<String> conformancePackNames;

    private Integer limit;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<String> getConformancePackNames() {
        if (conformancePackNames == null) {
            conformancePackNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return conformancePackNames;
    }

    /**
     * @param conformancePackNames
     */

    public void setConformancePackNames(java.util.Collection<String> conformancePackNames) {
        if (conformancePackNames == null) {
            this.conformancePackNames = null;
            return;
        }

        this.conformancePackNames = new com.amazonaws.internal.SdkInternalList<String>(conformancePackNames);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConformancePackNames(java.util.Collection)} or {@link #withConformancePackNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param conformancePackNames
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConformancePackComplianceSummaryRequest withConformancePackNames(String... conformancePackNames) {
        if (this.conformancePackNames == null) {
            setConformancePackNames(new com.amazonaws.internal.SdkInternalList<String>(conformancePackNames.length));
        }
        for (String ele : conformancePackNames) {
            this.conformancePackNames.add(ele);
        }
        return this;
    }

    /**
     * @param conformancePackNames
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConformancePackComplianceSummaryRequest withConformancePackNames(java.util.Collection<String> conformancePackNames) {
        setConformancePackNames(conformancePackNames);
        return this;
    }

    /**
     * @param limit
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * @return
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @param limit
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConformancePackComplianceSummaryRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConformancePackComplianceSummaryRequest withNextToken(String nextToken) {
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
        if (getConformancePackNames() != null)
            sb.append("ConformancePackNames: ").append(getConformancePackNames()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
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

        if (obj instanceof GetConformancePackComplianceSummaryRequest == false)
            return false;
        GetConformancePackComplianceSummaryRequest other = (GetConformancePackComplianceSummaryRequest) obj;
        if (other.getConformancePackNames() == null ^ this.getConformancePackNames() == null)
            return false;
        if (other.getConformancePackNames() != null && other.getConformancePackNames().equals(this.getConformancePackNames()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
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

        hashCode = prime * hashCode + ((getConformancePackNames() == null) ? 0 : getConformancePackNames().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetConformancePackComplianceSummaryRequest clone() {
        return (GetConformancePackComplianceSummaryRequest) super.clone();
    }

}

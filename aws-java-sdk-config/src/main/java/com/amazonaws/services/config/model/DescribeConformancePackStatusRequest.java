/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConformancePackStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConformancePackStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Comma-separated list of conformance pack names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> conformancePackNames;
    /**
     * <p>
     * The maximum number of conformance packs status returned on each page.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Comma-separated list of conformance pack names.
     * </p>
     * 
     * @return Comma-separated list of conformance pack names.
     */

    public java.util.List<String> getConformancePackNames() {
        if (conformancePackNames == null) {
            conformancePackNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return conformancePackNames;
    }

    /**
     * <p>
     * Comma-separated list of conformance pack names.
     * </p>
     * 
     * @param conformancePackNames
     *        Comma-separated list of conformance pack names.
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
     * Comma-separated list of conformance pack names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConformancePackNames(java.util.Collection)} or {@link #withConformancePackNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param conformancePackNames
     *        Comma-separated list of conformance pack names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConformancePackStatusRequest withConformancePackNames(String... conformancePackNames) {
        if (this.conformancePackNames == null) {
            setConformancePackNames(new com.amazonaws.internal.SdkInternalList<String>(conformancePackNames.length));
        }
        for (String ele : conformancePackNames) {
            this.conformancePackNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Comma-separated list of conformance pack names.
     * </p>
     * 
     * @param conformancePackNames
     *        Comma-separated list of conformance pack names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConformancePackStatusRequest withConformancePackNames(java.util.Collection<String> conformancePackNames) {
        setConformancePackNames(conformancePackNames);
        return this;
    }

    /**
     * <p>
     * The maximum number of conformance packs status returned on each page.
     * </p>
     * 
     * @param limit
     *        The maximum number of conformance packs status returned on each page.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of conformance packs status returned on each page.
     * </p>
     * 
     * @return The maximum number of conformance packs status returned on each page.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of conformance packs status returned on each page.
     * </p>
     * 
     * @param limit
     *        The maximum number of conformance packs status returned on each page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConformancePackStatusRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *        results in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *        results in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConformancePackStatusRequest withNextToken(String nextToken) {
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

        if (obj instanceof DescribeConformancePackStatusRequest == false)
            return false;
        DescribeConformancePackStatusRequest other = (DescribeConformancePackStatusRequest) obj;
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
    public DescribeConformancePackStatusRequest clone() {
        return (DescribeConformancePackStatusRequest) super.clone();
    }

}

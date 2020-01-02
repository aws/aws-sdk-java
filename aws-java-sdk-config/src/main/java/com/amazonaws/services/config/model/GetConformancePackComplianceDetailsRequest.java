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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetConformancePackComplianceDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConformancePackComplianceDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the conformance pack.
     * </p>
     */
    private String conformancePackName;
    /**
     * <p>
     * A <code>ConformancePackEvaluationFilters</code> object.
     * </p>
     */
    private ConformancePackEvaluationFilters filters;
    /**
     * <p>
     * The maximum number of evaluation results returned on each page. If you do no specify a number, AWS Config uses
     * the default. The default is 100.
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
     * Name of the conformance pack.
     * </p>
     * 
     * @param conformancePackName
     *        Name of the conformance pack.
     */

    public void setConformancePackName(String conformancePackName) {
        this.conformancePackName = conformancePackName;
    }

    /**
     * <p>
     * Name of the conformance pack.
     * </p>
     * 
     * @return Name of the conformance pack.
     */

    public String getConformancePackName() {
        return this.conformancePackName;
    }

    /**
     * <p>
     * Name of the conformance pack.
     * </p>
     * 
     * @param conformancePackName
     *        Name of the conformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConformancePackComplianceDetailsRequest withConformancePackName(String conformancePackName) {
        setConformancePackName(conformancePackName);
        return this;
    }

    /**
     * <p>
     * A <code>ConformancePackEvaluationFilters</code> object.
     * </p>
     * 
     * @param filters
     *        A <code>ConformancePackEvaluationFilters</code> object.
     */

    public void setFilters(ConformancePackEvaluationFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * A <code>ConformancePackEvaluationFilters</code> object.
     * </p>
     * 
     * @return A <code>ConformancePackEvaluationFilters</code> object.
     */

    public ConformancePackEvaluationFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * A <code>ConformancePackEvaluationFilters</code> object.
     * </p>
     * 
     * @param filters
     *        A <code>ConformancePackEvaluationFilters</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConformancePackComplianceDetailsRequest withFilters(ConformancePackEvaluationFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of evaluation results returned on each page. If you do no specify a number, AWS Config uses
     * the default. The default is 100.
     * </p>
     * 
     * @param limit
     *        The maximum number of evaluation results returned on each page. If you do no specify a number, AWS Config
     *        uses the default. The default is 100.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of evaluation results returned on each page. If you do no specify a number, AWS Config uses
     * the default. The default is 100.
     * </p>
     * 
     * @return The maximum number of evaluation results returned on each page. If you do no specify a number, AWS Config
     *         uses the default. The default is 100.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of evaluation results returned on each page. If you do no specify a number, AWS Config uses
     * the default. The default is 100.
     * </p>
     * 
     * @param limit
     *        The maximum number of evaluation results returned on each page. If you do no specify a number, AWS Config
     *        uses the default. The default is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConformancePackComplianceDetailsRequest withLimit(Integer limit) {
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

    public GetConformancePackComplianceDetailsRequest withNextToken(String nextToken) {
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
        if (getConformancePackName() != null)
            sb.append("ConformancePackName: ").append(getConformancePackName()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof GetConformancePackComplianceDetailsRequest == false)
            return false;
        GetConformancePackComplianceDetailsRequest other = (GetConformancePackComplianceDetailsRequest) obj;
        if (other.getConformancePackName() == null ^ this.getConformancePackName() == null)
            return false;
        if (other.getConformancePackName() != null && other.getConformancePackName().equals(this.getConformancePackName()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getConformancePackName() == null) ? 0 : getConformancePackName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetConformancePackComplianceDetailsRequest clone() {
        return (GetConformancePackComplianceDetailsRequest) super.clone();
    }

}

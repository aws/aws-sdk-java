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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConformancePackCompliance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConformancePackComplianceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Name of the conformance pack.
     * </p>
     */
    private String conformancePackName;
    /**
     * <p>
     * Returns a list of <code>ConformancePackRuleCompliance</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConformancePackRuleCompliance> conformancePackRuleComplianceList;
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

    public DescribeConformancePackComplianceResult withConformancePackName(String conformancePackName) {
        setConformancePackName(conformancePackName);
        return this;
    }

    /**
     * <p>
     * Returns a list of <code>ConformancePackRuleCompliance</code> objects.
     * </p>
     * 
     * @return Returns a list of <code>ConformancePackRuleCompliance</code> objects.
     */

    public java.util.List<ConformancePackRuleCompliance> getConformancePackRuleComplianceList() {
        if (conformancePackRuleComplianceList == null) {
            conformancePackRuleComplianceList = new com.amazonaws.internal.SdkInternalList<ConformancePackRuleCompliance>();
        }
        return conformancePackRuleComplianceList;
    }

    /**
     * <p>
     * Returns a list of <code>ConformancePackRuleCompliance</code> objects.
     * </p>
     * 
     * @param conformancePackRuleComplianceList
     *        Returns a list of <code>ConformancePackRuleCompliance</code> objects.
     */

    public void setConformancePackRuleComplianceList(java.util.Collection<ConformancePackRuleCompliance> conformancePackRuleComplianceList) {
        if (conformancePackRuleComplianceList == null) {
            this.conformancePackRuleComplianceList = null;
            return;
        }

        this.conformancePackRuleComplianceList = new com.amazonaws.internal.SdkInternalList<ConformancePackRuleCompliance>(conformancePackRuleComplianceList);
    }

    /**
     * <p>
     * Returns a list of <code>ConformancePackRuleCompliance</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConformancePackRuleComplianceList(java.util.Collection)} or
     * {@link #withConformancePackRuleComplianceList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param conformancePackRuleComplianceList
     *        Returns a list of <code>ConformancePackRuleCompliance</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConformancePackComplianceResult withConformancePackRuleComplianceList(ConformancePackRuleCompliance... conformancePackRuleComplianceList) {
        if (this.conformancePackRuleComplianceList == null) {
            setConformancePackRuleComplianceList(new com.amazonaws.internal.SdkInternalList<ConformancePackRuleCompliance>(
                    conformancePackRuleComplianceList.length));
        }
        for (ConformancePackRuleCompliance ele : conformancePackRuleComplianceList) {
            this.conformancePackRuleComplianceList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of <code>ConformancePackRuleCompliance</code> objects.
     * </p>
     * 
     * @param conformancePackRuleComplianceList
     *        Returns a list of <code>ConformancePackRuleCompliance</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConformancePackComplianceResult withConformancePackRuleComplianceList(
            java.util.Collection<ConformancePackRuleCompliance> conformancePackRuleComplianceList) {
        setConformancePackRuleComplianceList(conformancePackRuleComplianceList);
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

    public DescribeConformancePackComplianceResult withNextToken(String nextToken) {
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
        if (getConformancePackRuleComplianceList() != null)
            sb.append("ConformancePackRuleComplianceList: ").append(getConformancePackRuleComplianceList()).append(",");
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

        if (obj instanceof DescribeConformancePackComplianceResult == false)
            return false;
        DescribeConformancePackComplianceResult other = (DescribeConformancePackComplianceResult) obj;
        if (other.getConformancePackName() == null ^ this.getConformancePackName() == null)
            return false;
        if (other.getConformancePackName() != null && other.getConformancePackName().equals(this.getConformancePackName()) == false)
            return false;
        if (other.getConformancePackRuleComplianceList() == null ^ this.getConformancePackRuleComplianceList() == null)
            return false;
        if (other.getConformancePackRuleComplianceList() != null
                && other.getConformancePackRuleComplianceList().equals(this.getConformancePackRuleComplianceList()) == false)
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
        hashCode = prime * hashCode + ((getConformancePackRuleComplianceList() == null) ? 0 : getConformancePackRuleComplianceList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConformancePackComplianceResult clone() {
        try {
            return (DescribeConformancePackComplianceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

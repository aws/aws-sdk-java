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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeInsightRules" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInsightRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The rules returned by the operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InsightRule> insightRules;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param nextToken
     *        Reserved for future use.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param nextToken
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInsightRulesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The rules returned by the operation.
     * </p>
     * 
     * @return The rules returned by the operation.
     */

    public java.util.List<InsightRule> getInsightRules() {
        if (insightRules == null) {
            insightRules = new com.amazonaws.internal.SdkInternalList<InsightRule>();
        }
        return insightRules;
    }

    /**
     * <p>
     * The rules returned by the operation.
     * </p>
     * 
     * @param insightRules
     *        The rules returned by the operation.
     */

    public void setInsightRules(java.util.Collection<InsightRule> insightRules) {
        if (insightRules == null) {
            this.insightRules = null;
            return;
        }

        this.insightRules = new com.amazonaws.internal.SdkInternalList<InsightRule>(insightRules);
    }

    /**
     * <p>
     * The rules returned by the operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsightRules(java.util.Collection)} or {@link #withInsightRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param insightRules
     *        The rules returned by the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInsightRulesResult withInsightRules(InsightRule... insightRules) {
        if (this.insightRules == null) {
            setInsightRules(new com.amazonaws.internal.SdkInternalList<InsightRule>(insightRules.length));
        }
        for (InsightRule ele : insightRules) {
            this.insightRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules returned by the operation.
     * </p>
     * 
     * @param insightRules
     *        The rules returned by the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInsightRulesResult withInsightRules(java.util.Collection<InsightRule> insightRules) {
        setInsightRules(insightRules);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getInsightRules() != null)
            sb.append("InsightRules: ").append(getInsightRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInsightRulesResult == false)
            return false;
        DescribeInsightRulesResult other = (DescribeInsightRulesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getInsightRules() == null ^ this.getInsightRules() == null)
            return false;
        if (other.getInsightRules() != null && other.getInsightRules().equals(this.getInsightRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getInsightRules() == null) ? 0 : getInsightRules().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInsightRulesResult clone() {
        try {
            return (DescribeInsightRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

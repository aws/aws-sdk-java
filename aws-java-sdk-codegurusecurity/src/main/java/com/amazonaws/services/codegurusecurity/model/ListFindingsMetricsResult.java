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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/ListFindingsMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFindingsMetricsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>AccountFindingsMetric</code> objects retrieved from the specified time interval.
     * </p>
     */
    private java.util.List<AccountFindingsMetric> findingsMetrics;
    /**
     * <p>
     * A pagination token. You can use this in future calls to <code>ListFindingMetrics</code> to continue listing
     * results after the current page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>AccountFindingsMetric</code> objects retrieved from the specified time interval.
     * </p>
     * 
     * @return A list of <code>AccountFindingsMetric</code> objects retrieved from the specified time interval.
     */

    public java.util.List<AccountFindingsMetric> getFindingsMetrics() {
        return findingsMetrics;
    }

    /**
     * <p>
     * A list of <code>AccountFindingsMetric</code> objects retrieved from the specified time interval.
     * </p>
     * 
     * @param findingsMetrics
     *        A list of <code>AccountFindingsMetric</code> objects retrieved from the specified time interval.
     */

    public void setFindingsMetrics(java.util.Collection<AccountFindingsMetric> findingsMetrics) {
        if (findingsMetrics == null) {
            this.findingsMetrics = null;
            return;
        }

        this.findingsMetrics = new java.util.ArrayList<AccountFindingsMetric>(findingsMetrics);
    }

    /**
     * <p>
     * A list of <code>AccountFindingsMetric</code> objects retrieved from the specified time interval.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingsMetrics(java.util.Collection)} or {@link #withFindingsMetrics(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param findingsMetrics
     *        A list of <code>AccountFindingsMetric</code> objects retrieved from the specified time interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingsMetricsResult withFindingsMetrics(AccountFindingsMetric... findingsMetrics) {
        if (this.findingsMetrics == null) {
            setFindingsMetrics(new java.util.ArrayList<AccountFindingsMetric>(findingsMetrics.length));
        }
        for (AccountFindingsMetric ele : findingsMetrics) {
            this.findingsMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>AccountFindingsMetric</code> objects retrieved from the specified time interval.
     * </p>
     * 
     * @param findingsMetrics
     *        A list of <code>AccountFindingsMetric</code> objects retrieved from the specified time interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingsMetricsResult withFindingsMetrics(java.util.Collection<AccountFindingsMetric> findingsMetrics) {
        setFindingsMetrics(findingsMetrics);
        return this;
    }

    /**
     * <p>
     * A pagination token. You can use this in future calls to <code>ListFindingMetrics</code> to continue listing
     * results after the current page.
     * </p>
     * 
     * @param nextToken
     *        A pagination token. You can use this in future calls to <code>ListFindingMetrics</code> to continue
     *        listing results after the current page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token. You can use this in future calls to <code>ListFindingMetrics</code> to continue listing
     * results after the current page.
     * </p>
     * 
     * @return A pagination token. You can use this in future calls to <code>ListFindingMetrics</code> to continue
     *         listing results after the current page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token. You can use this in future calls to <code>ListFindingMetrics</code> to continue listing
     * results after the current page.
     * </p>
     * 
     * @param nextToken
     *        A pagination token. You can use this in future calls to <code>ListFindingMetrics</code> to continue
     *        listing results after the current page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingsMetricsResult withNextToken(String nextToken) {
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
        if (getFindingsMetrics() != null)
            sb.append("FindingsMetrics: ").append(getFindingsMetrics()).append(",");
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

        if (obj instanceof ListFindingsMetricsResult == false)
            return false;
        ListFindingsMetricsResult other = (ListFindingsMetricsResult) obj;
        if (other.getFindingsMetrics() == null ^ this.getFindingsMetrics() == null)
            return false;
        if (other.getFindingsMetrics() != null && other.getFindingsMetrics().equals(this.getFindingsMetrics()) == false)
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

        hashCode = prime * hashCode + ((getFindingsMetrics() == null) ? 0 : getFindingsMetrics().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFindingsMetricsResult clone() {
        try {
            return (ListFindingsMetricsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

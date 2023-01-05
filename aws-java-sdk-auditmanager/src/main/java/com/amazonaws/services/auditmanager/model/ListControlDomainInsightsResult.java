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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControlDomainInsights"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListControlDomainInsightsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The control domain analytics data that the <code>ListControlDomainInsights</code> API returned.
     * </p>
     */
    private java.util.List<ControlDomainInsights> controlDomainInsights;
    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The control domain analytics data that the <code>ListControlDomainInsights</code> API returned.
     * </p>
     * 
     * @return The control domain analytics data that the <code>ListControlDomainInsights</code> API returned.
     */

    public java.util.List<ControlDomainInsights> getControlDomainInsights() {
        return controlDomainInsights;
    }

    /**
     * <p>
     * The control domain analytics data that the <code>ListControlDomainInsights</code> API returned.
     * </p>
     * 
     * @param controlDomainInsights
     *        The control domain analytics data that the <code>ListControlDomainInsights</code> API returned.
     */

    public void setControlDomainInsights(java.util.Collection<ControlDomainInsights> controlDomainInsights) {
        if (controlDomainInsights == null) {
            this.controlDomainInsights = null;
            return;
        }

        this.controlDomainInsights = new java.util.ArrayList<ControlDomainInsights>(controlDomainInsights);
    }

    /**
     * <p>
     * The control domain analytics data that the <code>ListControlDomainInsights</code> API returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setControlDomainInsights(java.util.Collection)} or
     * {@link #withControlDomainInsights(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param controlDomainInsights
     *        The control domain analytics data that the <code>ListControlDomainInsights</code> API returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListControlDomainInsightsResult withControlDomainInsights(ControlDomainInsights... controlDomainInsights) {
        if (this.controlDomainInsights == null) {
            setControlDomainInsights(new java.util.ArrayList<ControlDomainInsights>(controlDomainInsights.length));
        }
        for (ControlDomainInsights ele : controlDomainInsights) {
            this.controlDomainInsights.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The control domain analytics data that the <code>ListControlDomainInsights</code> API returned.
     * </p>
     * 
     * @param controlDomainInsights
     *        The control domain analytics data that the <code>ListControlDomainInsights</code> API returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListControlDomainInsightsResult withControlDomainInsights(java.util.Collection<ControlDomainInsights> controlDomainInsights) {
        setControlDomainInsights(controlDomainInsights);
        return this;
    }

    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used to fetch the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     * 
     * @return The pagination token that's used to fetch the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used to fetch the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListControlDomainInsightsResult withNextToken(String nextToken) {
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
        if (getControlDomainInsights() != null)
            sb.append("ControlDomainInsights: ").append(getControlDomainInsights()).append(",");
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

        if (obj instanceof ListControlDomainInsightsResult == false)
            return false;
        ListControlDomainInsightsResult other = (ListControlDomainInsightsResult) obj;
        if (other.getControlDomainInsights() == null ^ this.getControlDomainInsights() == null)
            return false;
        if (other.getControlDomainInsights() != null && other.getControlDomainInsights().equals(this.getControlDomainInsights()) == false)
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

        hashCode = prime * hashCode + ((getControlDomainInsights() == null) ? 0 : getControlDomainInsights().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListControlDomainInsightsResult clone() {
        try {
            return (ListControlDomainInsightsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

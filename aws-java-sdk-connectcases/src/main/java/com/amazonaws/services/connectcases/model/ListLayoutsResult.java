/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListLayouts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLayoutsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The layouts for the domain.
     * </p>
     */
    private java.util.List<LayoutSummary> layouts;
    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The layouts for the domain.
     * </p>
     * 
     * @return The layouts for the domain.
     */

    public java.util.List<LayoutSummary> getLayouts() {
        return layouts;
    }

    /**
     * <p>
     * The layouts for the domain.
     * </p>
     * 
     * @param layouts
     *        The layouts for the domain.
     */

    public void setLayouts(java.util.Collection<LayoutSummary> layouts) {
        if (layouts == null) {
            this.layouts = null;
            return;
        }

        this.layouts = new java.util.ArrayList<LayoutSummary>(layouts);
    }

    /**
     * <p>
     * The layouts for the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayouts(java.util.Collection)} or {@link #withLayouts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param layouts
     *        The layouts for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLayoutsResult withLayouts(LayoutSummary... layouts) {
        if (this.layouts == null) {
            setLayouts(new java.util.ArrayList<LayoutSummary>(layouts.length));
        }
        for (LayoutSummary ele : layouts) {
            this.layouts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The layouts for the domain.
     * </p>
     * 
     * @param layouts
     *        The layouts for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLayoutsResult withLayouts(java.util.Collection<LayoutSummary> layouts) {
        setLayouts(layouts);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. This is null if there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @return The token for the next set of results. This is null if there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. This is null if there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLayoutsResult withNextToken(String nextToken) {
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
        if (getLayouts() != null)
            sb.append("Layouts: ").append(getLayouts()).append(",");
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

        if (obj instanceof ListLayoutsResult == false)
            return false;
        ListLayoutsResult other = (ListLayoutsResult) obj;
        if (other.getLayouts() == null ^ this.getLayouts() == null)
            return false;
        if (other.getLayouts() != null && other.getLayouts().equals(this.getLayouts()) == false)
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

        hashCode = prime * hashCode + ((getLayouts() == null) ? 0 : getLayouts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLayoutsResult clone() {
        try {
            return (ListLayoutsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

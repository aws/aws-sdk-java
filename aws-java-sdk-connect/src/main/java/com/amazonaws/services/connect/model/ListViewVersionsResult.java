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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListViewVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListViewVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of view version summaries.
     * </p>
     */
    private java.util.List<ViewVersionSummary> viewVersionSummaryList;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of view version summaries.
     * </p>
     * 
     * @return A list of view version summaries.
     */

    public java.util.List<ViewVersionSummary> getViewVersionSummaryList() {
        return viewVersionSummaryList;
    }

    /**
     * <p>
     * A list of view version summaries.
     * </p>
     * 
     * @param viewVersionSummaryList
     *        A list of view version summaries.
     */

    public void setViewVersionSummaryList(java.util.Collection<ViewVersionSummary> viewVersionSummaryList) {
        if (viewVersionSummaryList == null) {
            this.viewVersionSummaryList = null;
            return;
        }

        this.viewVersionSummaryList = new java.util.ArrayList<ViewVersionSummary>(viewVersionSummaryList);
    }

    /**
     * <p>
     * A list of view version summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setViewVersionSummaryList(java.util.Collection)} or
     * {@link #withViewVersionSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param viewVersionSummaryList
     *        A list of view version summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListViewVersionsResult withViewVersionSummaryList(ViewVersionSummary... viewVersionSummaryList) {
        if (this.viewVersionSummaryList == null) {
            setViewVersionSummaryList(new java.util.ArrayList<ViewVersionSummary>(viewVersionSummaryList.length));
        }
        for (ViewVersionSummary ele : viewVersionSummaryList) {
            this.viewVersionSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of view version summaries.
     * </p>
     * 
     * @param viewVersionSummaryList
     *        A list of view version summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListViewVersionsResult withViewVersionSummaryList(java.util.Collection<ViewVersionSummary> viewVersionSummaryList) {
        setViewVersionSummaryList(viewVersionSummaryList);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListViewVersionsResult withNextToken(String nextToken) {
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
        if (getViewVersionSummaryList() != null)
            sb.append("ViewVersionSummaryList: ").append(getViewVersionSummaryList()).append(",");
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

        if (obj instanceof ListViewVersionsResult == false)
            return false;
        ListViewVersionsResult other = (ListViewVersionsResult) obj;
        if (other.getViewVersionSummaryList() == null ^ this.getViewVersionSummaryList() == null)
            return false;
        if (other.getViewVersionSummaryList() != null && other.getViewVersionSummaryList().equals(this.getViewVersionSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getViewVersionSummaryList() == null) ? 0 : getViewVersionSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListViewVersionsResult clone() {
        try {
            return (ListViewVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

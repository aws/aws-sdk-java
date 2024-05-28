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
package com.amazonaws.services.controlcatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controlcatalog-2018-05-10/ListCommonControls" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCommonControlsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of common controls that the <code>ListCommonControls</code> API returns.
     * </p>
     */
    private java.util.List<CommonControlSummary> commonControls;
    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of common controls that the <code>ListCommonControls</code> API returns.
     * </p>
     * 
     * @return The list of common controls that the <code>ListCommonControls</code> API returns.
     */

    public java.util.List<CommonControlSummary> getCommonControls() {
        return commonControls;
    }

    /**
     * <p>
     * The list of common controls that the <code>ListCommonControls</code> API returns.
     * </p>
     * 
     * @param commonControls
     *        The list of common controls that the <code>ListCommonControls</code> API returns.
     */

    public void setCommonControls(java.util.Collection<CommonControlSummary> commonControls) {
        if (commonControls == null) {
            this.commonControls = null;
            return;
        }

        this.commonControls = new java.util.ArrayList<CommonControlSummary>(commonControls);
    }

    /**
     * <p>
     * The list of common controls that the <code>ListCommonControls</code> API returns.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommonControls(java.util.Collection)} or {@link #withCommonControls(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param commonControls
     *        The list of common controls that the <code>ListCommonControls</code> API returns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCommonControlsResult withCommonControls(CommonControlSummary... commonControls) {
        if (this.commonControls == null) {
            setCommonControls(new java.util.ArrayList<CommonControlSummary>(commonControls.length));
        }
        for (CommonControlSummary ele : commonControls) {
            this.commonControls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of common controls that the <code>ListCommonControls</code> API returns.
     * </p>
     * 
     * @param commonControls
     *        The list of common controls that the <code>ListCommonControls</code> API returns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCommonControlsResult withCommonControls(java.util.Collection<CommonControlSummary> commonControls) {
        setCommonControls(commonControls);
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

    public ListCommonControlsResult withNextToken(String nextToken) {
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
        if (getCommonControls() != null)
            sb.append("CommonControls: ").append(getCommonControls()).append(",");
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

        if (obj instanceof ListCommonControlsResult == false)
            return false;
        ListCommonControlsResult other = (ListCommonControlsResult) obj;
        if (other.getCommonControls() == null ^ this.getCommonControls() == null)
            return false;
        if (other.getCommonControls() != null && other.getCommonControls().equals(this.getCommonControls()) == false)
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

        hashCode = prime * hashCode + ((getCommonControls() == null) ? 0 : getCommonControls().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCommonControlsResult clone() {
        try {
            return (ListCommonControlsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

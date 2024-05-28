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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListPageResolutions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPageResolutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about the resolution for an engagement.
     * </p>
     */
    private java.util.List<ResolutionContact> pageResolutions;

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @return The token for the next set of items to return. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPageResolutionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about the resolution for an engagement.
     * </p>
     * 
     * @return Information about the resolution for an engagement.
     */

    public java.util.List<ResolutionContact> getPageResolutions() {
        return pageResolutions;
    }

    /**
     * <p>
     * Information about the resolution for an engagement.
     * </p>
     * 
     * @param pageResolutions
     *        Information about the resolution for an engagement.
     */

    public void setPageResolutions(java.util.Collection<ResolutionContact> pageResolutions) {
        if (pageResolutions == null) {
            this.pageResolutions = null;
            return;
        }

        this.pageResolutions = new java.util.ArrayList<ResolutionContact>(pageResolutions);
    }

    /**
     * <p>
     * Information about the resolution for an engagement.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPageResolutions(java.util.Collection)} or {@link #withPageResolutions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pageResolutions
     *        Information about the resolution for an engagement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPageResolutionsResult withPageResolutions(ResolutionContact... pageResolutions) {
        if (this.pageResolutions == null) {
            setPageResolutions(new java.util.ArrayList<ResolutionContact>(pageResolutions.length));
        }
        for (ResolutionContact ele : pageResolutions) {
            this.pageResolutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the resolution for an engagement.
     * </p>
     * 
     * @param pageResolutions
     *        Information about the resolution for an engagement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPageResolutionsResult withPageResolutions(java.util.Collection<ResolutionContact> pageResolutions) {
        setPageResolutions(pageResolutions);
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
        if (getPageResolutions() != null)
            sb.append("PageResolutions: ").append(getPageResolutions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPageResolutionsResult == false)
            return false;
        ListPageResolutionsResult other = (ListPageResolutionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPageResolutions() == null ^ this.getPageResolutions() == null)
            return false;
        if (other.getPageResolutions() != null && other.getPageResolutions().equals(this.getPageResolutions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageResolutions() == null) ? 0 : getPageResolutions().hashCode());
        return hashCode;
    }

    @Override
    public ListPageResolutionsResult clone() {
        try {
            return (ListPageResolutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

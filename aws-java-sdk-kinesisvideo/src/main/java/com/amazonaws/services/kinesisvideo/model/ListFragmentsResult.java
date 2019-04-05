/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/ListFragments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFragmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of archived <a>Fragment</a> objects from the stream that meet the selector criteria. Results are in no
     * specific order, even across pages.
     * </p>
     */
    private java.util.List<Fragment> fragments;
    /**
     * <p>
     * If the returned list is truncated, the operation returns this token to use to retrieve the next page of results.
     * This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of archived <a>Fragment</a> objects from the stream that meet the selector criteria. Results are in no
     * specific order, even across pages.
     * </p>
     * 
     * @return A list of archived <a>Fragment</a> objects from the stream that meet the selector criteria. Results are
     *         in no specific order, even across pages.
     */

    public java.util.List<Fragment> getFragments() {
        return fragments;
    }

    /**
     * <p>
     * A list of archived <a>Fragment</a> objects from the stream that meet the selector criteria. Results are in no
     * specific order, even across pages.
     * </p>
     * 
     * @param fragments
     *        A list of archived <a>Fragment</a> objects from the stream that meet the selector criteria. Results are in
     *        no specific order, even across pages.
     */

    public void setFragments(java.util.Collection<Fragment> fragments) {
        if (fragments == null) {
            this.fragments = null;
            return;
        }

        this.fragments = new java.util.ArrayList<Fragment>(fragments);
    }

    /**
     * <p>
     * A list of archived <a>Fragment</a> objects from the stream that meet the selector criteria. Results are in no
     * specific order, even across pages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFragments(java.util.Collection)} or {@link #withFragments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fragments
     *        A list of archived <a>Fragment</a> objects from the stream that meet the selector criteria. Results are in
     *        no specific order, even across pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFragmentsResult withFragments(Fragment... fragments) {
        if (this.fragments == null) {
            setFragments(new java.util.ArrayList<Fragment>(fragments.length));
        }
        for (Fragment ele : fragments) {
            this.fragments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of archived <a>Fragment</a> objects from the stream that meet the selector criteria. Results are in no
     * specific order, even across pages.
     * </p>
     * 
     * @param fragments
     *        A list of archived <a>Fragment</a> objects from the stream that meet the selector criteria. Results are in
     *        no specific order, even across pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFragmentsResult withFragments(java.util.Collection<Fragment> fragments) {
        setFragments(fragments);
        return this;
    }

    /**
     * <p>
     * If the returned list is truncated, the operation returns this token to use to retrieve the next page of results.
     * This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        If the returned list is truncated, the operation returns this token to use to retrieve the next page of
     *        results. This value is <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the returned list is truncated, the operation returns this token to use to retrieve the next page of results.
     * This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return If the returned list is truncated, the operation returns this token to use to retrieve the next page of
     *         results. This value is <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the returned list is truncated, the operation returns this token to use to retrieve the next page of results.
     * This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        If the returned list is truncated, the operation returns this token to use to retrieve the next page of
     *        results. This value is <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFragmentsResult withNextToken(String nextToken) {
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
        if (getFragments() != null)
            sb.append("Fragments: ").append(getFragments()).append(",");
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

        if (obj instanceof ListFragmentsResult == false)
            return false;
        ListFragmentsResult other = (ListFragmentsResult) obj;
        if (other.getFragments() == null ^ this.getFragments() == null)
            return false;
        if (other.getFragments() != null && other.getFragments().equals(this.getFragments()) == false)
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

        hashCode = prime * hashCode + ((getFragments() == null) ? 0 : getFragments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFragmentsResult clone() {
        try {
            return (ListFragmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

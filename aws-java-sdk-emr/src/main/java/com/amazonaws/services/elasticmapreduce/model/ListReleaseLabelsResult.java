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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListReleaseLabels" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReleaseLabelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The returned release labels.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> releaseLabels;
    /**
     * <p>
     * Used to paginate the next page of results if specified in the next <code>ListReleaseLabels</code> request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The returned release labels.
     * </p>
     * 
     * @return The returned release labels.
     */

    public java.util.List<String> getReleaseLabels() {
        if (releaseLabels == null) {
            releaseLabels = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return releaseLabels;
    }

    /**
     * <p>
     * The returned release labels.
     * </p>
     * 
     * @param releaseLabels
     *        The returned release labels.
     */

    public void setReleaseLabels(java.util.Collection<String> releaseLabels) {
        if (releaseLabels == null) {
            this.releaseLabels = null;
            return;
        }

        this.releaseLabels = new com.amazonaws.internal.SdkInternalList<String>(releaseLabels);
    }

    /**
     * <p>
     * The returned release labels.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReleaseLabels(java.util.Collection)} or {@link #withReleaseLabels(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param releaseLabels
     *        The returned release labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReleaseLabelsResult withReleaseLabels(String... releaseLabels) {
        if (this.releaseLabels == null) {
            setReleaseLabels(new com.amazonaws.internal.SdkInternalList<String>(releaseLabels.length));
        }
        for (String ele : releaseLabels) {
            this.releaseLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The returned release labels.
     * </p>
     * 
     * @param releaseLabels
     *        The returned release labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReleaseLabelsResult withReleaseLabels(java.util.Collection<String> releaseLabels) {
        setReleaseLabels(releaseLabels);
        return this;
    }

    /**
     * <p>
     * Used to paginate the next page of results if specified in the next <code>ListReleaseLabels</code> request.
     * </p>
     * 
     * @param nextToken
     *        Used to paginate the next page of results if specified in the next <code>ListReleaseLabels</code> request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Used to paginate the next page of results if specified in the next <code>ListReleaseLabels</code> request.
     * </p>
     * 
     * @return Used to paginate the next page of results if specified in the next <code>ListReleaseLabels</code>
     *         request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Used to paginate the next page of results if specified in the next <code>ListReleaseLabels</code> request.
     * </p>
     * 
     * @param nextToken
     *        Used to paginate the next page of results if specified in the next <code>ListReleaseLabels</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReleaseLabelsResult withNextToken(String nextToken) {
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
        if (getReleaseLabels() != null)
            sb.append("ReleaseLabels: ").append(getReleaseLabels()).append(",");
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

        if (obj instanceof ListReleaseLabelsResult == false)
            return false;
        ListReleaseLabelsResult other = (ListReleaseLabelsResult) obj;
        if (other.getReleaseLabels() == null ^ this.getReleaseLabels() == null)
            return false;
        if (other.getReleaseLabels() != null && other.getReleaseLabels().equals(this.getReleaseLabels()) == false)
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

        hashCode = prime * hashCode + ((getReleaseLabels() == null) ? 0 : getReleaseLabels().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListReleaseLabelsResult clone() {
        try {
            return (ListReleaseLabelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

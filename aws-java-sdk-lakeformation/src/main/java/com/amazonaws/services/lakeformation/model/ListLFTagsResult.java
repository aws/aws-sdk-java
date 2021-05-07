/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListLFTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLFTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of tags that the requested has permission to view.
     * </p>
     */
    private java.util.List<LFTagPair> lFTags;
    /**
     * <p>
     * A continuation token, present if the current list segment is not the last.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of tags that the requested has permission to view.
     * </p>
     * 
     * @return A list of tags that the requested has permission to view.
     */

    public java.util.List<LFTagPair> getLFTags() {
        return lFTags;
    }

    /**
     * <p>
     * A list of tags that the requested has permission to view.
     * </p>
     * 
     * @param lFTags
     *        A list of tags that the requested has permission to view.
     */

    public void setLFTags(java.util.Collection<LFTagPair> lFTags) {
        if (lFTags == null) {
            this.lFTags = null;
            return;
        }

        this.lFTags = new java.util.ArrayList<LFTagPair>(lFTags);
    }

    /**
     * <p>
     * A list of tags that the requested has permission to view.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLFTags(java.util.Collection)} or {@link #withLFTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param lFTags
     *        A list of tags that the requested has permission to view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLFTagsResult withLFTags(LFTagPair... lFTags) {
        if (this.lFTags == null) {
            setLFTags(new java.util.ArrayList<LFTagPair>(lFTags.length));
        }
        for (LFTagPair ele : lFTags) {
            this.lFTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags that the requested has permission to view.
     * </p>
     * 
     * @param lFTags
     *        A list of tags that the requested has permission to view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLFTagsResult withLFTags(java.util.Collection<LFTagPair> lFTags) {
        setLFTags(lFTags);
        return this;
    }

    /**
     * <p>
     * A continuation token, present if the current list segment is not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, present if the current list segment is not the last.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, present if the current list segment is not the last.
     * </p>
     * 
     * @return A continuation token, present if the current list segment is not the last.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, present if the current list segment is not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, present if the current list segment is not the last.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLFTagsResult withNextToken(String nextToken) {
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
        if (getLFTags() != null)
            sb.append("LFTags: ").append(getLFTags()).append(",");
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

        if (obj instanceof ListLFTagsResult == false)
            return false;
        ListLFTagsResult other = (ListLFTagsResult) obj;
        if (other.getLFTags() == null ^ this.getLFTags() == null)
            return false;
        if (other.getLFTags() != null && other.getLFTags().equals(this.getLFTags()) == false)
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

        hashCode = prime * hashCode + ((getLFTags() == null) ? 0 : getLFTags().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLFTagsResult clone() {
        try {
            return (ListLFTagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>Tag</code> objects, each with a tag key and a value.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * If response is truncated, Amazon SageMaker includes a token in the response. You can use this token in your
     * subsequent request to fetch next set of tokens.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>Tag</code> objects, each with a tag key and a value.
     * </p>
     * 
     * @return An array of <code>Tag</code> objects, each with a tag key and a value.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of <code>Tag</code> objects, each with a tag key and a value.
     * </p>
     * 
     * @param tags
     *        An array of <code>Tag</code> objects, each with a tag key and a value.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of <code>Tag</code> objects, each with a tag key and a value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of <code>Tag</code> objects, each with a tag key and a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Tag</code> objects, each with a tag key and a value.
     * </p>
     * 
     * @param tags
     *        An array of <code>Tag</code> objects, each with a tag key and a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * If response is truncated, Amazon SageMaker includes a token in the response. You can use this token in your
     * subsequent request to fetch next set of tokens.
     * </p>
     * 
     * @param nextToken
     *        If response is truncated, Amazon SageMaker includes a token in the response. You can use this token in
     *        your subsequent request to fetch next set of tokens.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If response is truncated, Amazon SageMaker includes a token in the response. You can use this token in your
     * subsequent request to fetch next set of tokens.
     * </p>
     * 
     * @return If response is truncated, Amazon SageMaker includes a token in the response. You can use this token in
     *         your subsequent request to fetch next set of tokens.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If response is truncated, Amazon SageMaker includes a token in the response. You can use this token in your
     * subsequent request to fetch next set of tokens.
     * </p>
     * 
     * @param nextToken
     *        If response is truncated, Amazon SageMaker includes a token in the response. You can use this token in
     *        your subsequent request to fetch next set of tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsResult withNextToken(String nextToken) {
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof ListTagsResult == false)
            return false;
        ListTagsResult other = (ListTagsResult) obj;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsResult clone() {
        try {
            return (ListTagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

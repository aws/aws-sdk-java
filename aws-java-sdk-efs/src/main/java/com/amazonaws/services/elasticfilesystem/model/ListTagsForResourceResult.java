/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/ListTagsForResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of the tags for the specified EFS resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * <code>NextToken</code> is present if the response payload is paginated. You can use <code>NextToken</code> in a
     * subsequent request to fetch the next page of access point descriptions.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of the tags for the specified EFS resource.
     * </p>
     * 
     * @return An array of the tags for the specified EFS resource.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * An array of the tags for the specified EFS resource.
     * </p>
     * 
     * @param tags
     *        An array of the tags for the specified EFS resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * An array of the tags for the specified EFS resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of the tags for the specified EFS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the tags for the specified EFS resource.
     * </p>
     * 
     * @param tags
     *        An array of the tags for the specified EFS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * <code>NextToken</code> is present if the response payload is paginated. You can use <code>NextToken</code> in a
     * subsequent request to fetch the next page of access point descriptions.
     * </p>
     * 
     * @param nextToken
     *        <code>NextToken</code> is present if the response payload is paginated. You can use <code>NextToken</code>
     *        in a subsequent request to fetch the next page of access point descriptions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * <code>NextToken</code> is present if the response payload is paginated. You can use <code>NextToken</code> in a
     * subsequent request to fetch the next page of access point descriptions.
     * </p>
     * 
     * @return <code>NextToken</code> is present if the response payload is paginated. You can use
     *         <code>NextToken</code> in a subsequent request to fetch the next page of access point descriptions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * <code>NextToken</code> is present if the response payload is paginated. You can use <code>NextToken</code> in a
     * subsequent request to fetch the next page of access point descriptions.
     * </p>
     * 
     * @param nextToken
     *        <code>NextToken</code> is present if the response payload is paginated. You can use <code>NextToken</code>
     *        in a subsequent request to fetch the next page of access point descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withNextToken(String nextToken) {
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

        if (obj instanceof ListTagsForResourceResult == false)
            return false;
        ListTagsForResourceResult other = (ListTagsForResourceResult) obj;
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
    public ListTagsForResourceResult clone() {
        try {
            return (ListTagsForResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListTagsForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * This value is the ARN you specified to list the tags of.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * When you can get additional results from the <code>ListTagsForResource</code> call, a <code>NextToken</code>
     * parameter is returned in the output. You can then pass in a subsequent command the <code>NextToken</code>
     * parameter to continue listing additional tags.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Key-value pairs that are assigned to a resource, usually for the purpose of grouping and searching for items.
     * Tags are metadata that you define that you can use for any purpose.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * This value is the ARN you specified to list the tags of.
     * </p>
     * 
     * @param arn
     *        This value is the ARN you specified to list the tags of.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * This value is the ARN you specified to list the tags of.
     * </p>
     * 
     * @return This value is the ARN you specified to list the tags of.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * This value is the ARN you specified to list the tags of.
     * </p>
     * 
     * @param arn
     *        This value is the ARN you specified to list the tags of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListTagsForResource</code> call, a <code>NextToken</code>
     * parameter is returned in the output. You can then pass in a subsequent command the <code>NextToken</code>
     * parameter to continue listing additional tags.
     * </p>
     * 
     * @param nextToken
     *        When you can get additional results from the <code>ListTagsForResource</code> call, a
     *        <code>NextToken</code> parameter is returned in the output. You can then pass in a subsequent command the
     *        <code>NextToken</code> parameter to continue listing additional tags.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListTagsForResource</code> call, a <code>NextToken</code>
     * parameter is returned in the output. You can then pass in a subsequent command the <code>NextToken</code>
     * parameter to continue listing additional tags.
     * </p>
     * 
     * @return When you can get additional results from the <code>ListTagsForResource</code> call, a
     *         <code>NextToken</code> parameter is returned in the output. You can then pass in a subsequent command the
     *         <code>NextToken</code> parameter to continue listing additional tags.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListTagsForResource</code> call, a <code>NextToken</code>
     * parameter is returned in the output. You can then pass in a subsequent command the <code>NextToken</code>
     * parameter to continue listing additional tags.
     * </p>
     * 
     * @param nextToken
     *        When you can get additional results from the <code>ListTagsForResource</code> call, a
     *        <code>NextToken</code> parameter is returned in the output. You can then pass in a subsequent command the
     *        <code>NextToken</code> parameter to continue listing additional tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that are assigned to a resource, usually for the purpose of grouping and searching for items.
     * Tags are metadata that you define that you can use for any purpose.
     * </p>
     * 
     * @return Key-value pairs that are assigned to a resource, usually for the purpose of grouping and searching for
     *         items. Tags are metadata that you define that you can use for any purpose.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs that are assigned to a resource, usually for the purpose of grouping and searching for items.
     * Tags are metadata that you define that you can use for any purpose.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that are assigned to a resource, usually for the purpose of grouping and searching for
     *        items. Tags are metadata that you define that you can use for any purpose.
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
     * Key-value pairs that are assigned to a resource, usually for the purpose of grouping and searching for items.
     * Tags are metadata that you define that you can use for any purpose.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that are assigned to a resource, usually for the purpose of grouping and searching for
     *        items. Tags are metadata that you define that you can use for any purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withTags(Tag... tags) {
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
     * Key-value pairs that are assigned to a resource, usually for the purpose of grouping and searching for items.
     * Tags are metadata that you define that you can use for any purpose.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that are assigned to a resource, usually for the purpose of grouping and searching for
     *        items. Tags are metadata that you define that you can use for any purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
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
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

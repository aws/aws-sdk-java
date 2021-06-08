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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListResourcesInProtectionGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcesInProtectionGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the protection group. You use this to identify the protection group in lists and to manage the
     * protection group, for example to update, delete, or describe it.
     * </p>
     */
    private String protectionGroupId;
    /**
     * <p>
     * The next token value from a previous call to <code>ListResourcesInProtectionGroup</code>. Pass null if this is
     * the first call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of resource ARN objects to return. If you leave this blank, Shield Advanced returns the first
     * 20 results.
     * </p>
     * <p>
     * This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number of
     * objects returned could be less than <code>MaxResults</code>, even if there are still more objects yet to return.
     * If there are more objects to return, Shield Advanced returns a value in <code>NextToken</code> that you can use
     * in your next request, to get the next batch of objects.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the protection group. You use this to identify the protection group in lists and to manage the
     * protection group, for example to update, delete, or describe it.
     * </p>
     * 
     * @param protectionGroupId
     *        The name of the protection group. You use this to identify the protection group in lists and to manage the
     *        protection group, for example to update, delete, or describe it.
     */

    public void setProtectionGroupId(String protectionGroupId) {
        this.protectionGroupId = protectionGroupId;
    }

    /**
     * <p>
     * The name of the protection group. You use this to identify the protection group in lists and to manage the
     * protection group, for example to update, delete, or describe it.
     * </p>
     * 
     * @return The name of the protection group. You use this to identify the protection group in lists and to manage
     *         the protection group, for example to update, delete, or describe it.
     */

    public String getProtectionGroupId() {
        return this.protectionGroupId;
    }

    /**
     * <p>
     * The name of the protection group. You use this to identify the protection group in lists and to manage the
     * protection group, for example to update, delete, or describe it.
     * </p>
     * 
     * @param protectionGroupId
     *        The name of the protection group. You use this to identify the protection group in lists and to manage the
     *        protection group, for example to update, delete, or describe it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesInProtectionGroupRequest withProtectionGroupId(String protectionGroupId) {
        setProtectionGroupId(protectionGroupId);
        return this;
    }

    /**
     * <p>
     * The next token value from a previous call to <code>ListResourcesInProtectionGroup</code>. Pass null if this is
     * the first call.
     * </p>
     * 
     * @param nextToken
     *        The next token value from a previous call to <code>ListResourcesInProtectionGroup</code>. Pass null if
     *        this is the first call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token value from a previous call to <code>ListResourcesInProtectionGroup</code>. Pass null if this is
     * the first call.
     * </p>
     * 
     * @return The next token value from a previous call to <code>ListResourcesInProtectionGroup</code>. Pass null if
     *         this is the first call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token value from a previous call to <code>ListResourcesInProtectionGroup</code>. Pass null if this is
     * the first call.
     * </p>
     * 
     * @param nextToken
     *        The next token value from a previous call to <code>ListResourcesInProtectionGroup</code>. Pass null if
     *        this is the first call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesInProtectionGroupRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of resource ARN objects to return. If you leave this blank, Shield Advanced returns the first
     * 20 results.
     * </p>
     * <p>
     * This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number of
     * objects returned could be less than <code>MaxResults</code>, even if there are still more objects yet to return.
     * If there are more objects to return, Shield Advanced returns a value in <code>NextToken</code> that you can use
     * in your next request, to get the next batch of objects.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of resource ARN objects to return. If you leave this blank, Shield Advanced returns the
     *        first 20 results.</p>
     *        <p>
     *        This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number
     *        of objects returned could be less than <code>MaxResults</code>, even if there are still more objects yet
     *        to return. If there are more objects to return, Shield Advanced returns a value in <code>NextToken</code>
     *        that you can use in your next request, to get the next batch of objects.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of resource ARN objects to return. If you leave this blank, Shield Advanced returns the first
     * 20 results.
     * </p>
     * <p>
     * This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number of
     * objects returned could be less than <code>MaxResults</code>, even if there are still more objects yet to return.
     * If there are more objects to return, Shield Advanced returns a value in <code>NextToken</code> that you can use
     * in your next request, to get the next batch of objects.
     * </p>
     * 
     * @return The maximum number of resource ARN objects to return. If you leave this blank, Shield Advanced returns
     *         the first 20 results.</p>
     *         <p>
     *         This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number
     *         of objects returned could be less than <code>MaxResults</code>, even if there are still more objects yet
     *         to return. If there are more objects to return, Shield Advanced returns a value in <code>NextToken</code>
     *         that you can use in your next request, to get the next batch of objects.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of resource ARN objects to return. If you leave this blank, Shield Advanced returns the first
     * 20 results.
     * </p>
     * <p>
     * This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number of
     * objects returned could be less than <code>MaxResults</code>, even if there are still more objects yet to return.
     * If there are more objects to return, Shield Advanced returns a value in <code>NextToken</code> that you can use
     * in your next request, to get the next batch of objects.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of resource ARN objects to return. If you leave this blank, Shield Advanced returns the
     *        first 20 results.</p>
     *        <p>
     *        This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number
     *        of objects returned could be less than <code>MaxResults</code>, even if there are still more objects yet
     *        to return. If there are more objects to return, Shield Advanced returns a value in <code>NextToken</code>
     *        that you can use in your next request, to get the next batch of objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesInProtectionGroupRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getProtectionGroupId() != null)
            sb.append("ProtectionGroupId: ").append(getProtectionGroupId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourcesInProtectionGroupRequest == false)
            return false;
        ListResourcesInProtectionGroupRequest other = (ListResourcesInProtectionGroupRequest) obj;
        if (other.getProtectionGroupId() == null ^ this.getProtectionGroupId() == null)
            return false;
        if (other.getProtectionGroupId() != null && other.getProtectionGroupId().equals(this.getProtectionGroupId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtectionGroupId() == null) ? 0 : getProtectionGroupId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListResourcesInProtectionGroupRequest clone() {
        return (ListResourcesInProtectionGroupRequest) super.clone();
    }

}

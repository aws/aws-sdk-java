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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListResourcesInProtectionGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcesInProtectionGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources that are included in the protection group.
     * </p>
     */
    private java.util.List<String> resourceArns;
    /**
     * <p>
     * When you request a list of objects from Shield Advanced, if the response does not include all of the remaining
     * available objects, Shield Advanced includes a <code>NextToken</code> value in the response. You can retrieve the
     * next batch of objects by requesting the list again and providing the token that was returned by the prior call in
     * your request.
     * </p>
     * <p>
     * You can indicate the maximum number of objects that you want Shield Advanced to return for a single call with the
     * <code>MaxResults</code> setting. Shield Advanced will not return more than <code>MaxResults</code> objects, but
     * may return fewer, even if more objects are still available.
     * </p>
     * <p>
     * Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a
     * <code>NextToken</code> value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources that are included in the protection group.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the resources that are included in the protection group.
     */

    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources that are included in the protection group.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARNs) of the resources that are included in the protection group.
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources that are included in the protection group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARNs) of the resources that are included in the protection group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesInProtectionGroupResult withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new java.util.ArrayList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources that are included in the protection group.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARNs) of the resources that are included in the protection group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesInProtectionGroupResult withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * When you request a list of objects from Shield Advanced, if the response does not include all of the remaining
     * available objects, Shield Advanced includes a <code>NextToken</code> value in the response. You can retrieve the
     * next batch of objects by requesting the list again and providing the token that was returned by the prior call in
     * your request.
     * </p>
     * <p>
     * You can indicate the maximum number of objects that you want Shield Advanced to return for a single call with the
     * <code>MaxResults</code> setting. Shield Advanced will not return more than <code>MaxResults</code> objects, but
     * may return fewer, even if more objects are still available.
     * </p>
     * <p>
     * Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a
     * <code>NextToken</code> value.
     * </p>
     * 
     * @param nextToken
     *        When you request a list of objects from Shield Advanced, if the response does not include all of the
     *        remaining available objects, Shield Advanced includes a <code>NextToken</code> value in the response. You
     *        can retrieve the next batch of objects by requesting the list again and providing the token that was
     *        returned by the prior call in your request. </p>
     *        <p>
     *        You can indicate the maximum number of objects that you want Shield Advanced to return for a single call
     *        with the <code>MaxResults</code> setting. Shield Advanced will not return more than
     *        <code>MaxResults</code> objects, but may return fewer, even if more objects are still available.
     *        </p>
     *        <p>
     *        Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a
     *        <code>NextToken</code> value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you request a list of objects from Shield Advanced, if the response does not include all of the remaining
     * available objects, Shield Advanced includes a <code>NextToken</code> value in the response. You can retrieve the
     * next batch of objects by requesting the list again and providing the token that was returned by the prior call in
     * your request.
     * </p>
     * <p>
     * You can indicate the maximum number of objects that you want Shield Advanced to return for a single call with the
     * <code>MaxResults</code> setting. Shield Advanced will not return more than <code>MaxResults</code> objects, but
     * may return fewer, even if more objects are still available.
     * </p>
     * <p>
     * Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a
     * <code>NextToken</code> value.
     * </p>
     * 
     * @return When you request a list of objects from Shield Advanced, if the response does not include all of the
     *         remaining available objects, Shield Advanced includes a <code>NextToken</code> value in the response. You
     *         can retrieve the next batch of objects by requesting the list again and providing the token that was
     *         returned by the prior call in your request. </p>
     *         <p>
     *         You can indicate the maximum number of objects that you want Shield Advanced to return for a single call
     *         with the <code>MaxResults</code> setting. Shield Advanced will not return more than
     *         <code>MaxResults</code> objects, but may return fewer, even if more objects are still available.
     *         </p>
     *         <p>
     *         Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include
     *         a <code>NextToken</code> value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When you request a list of objects from Shield Advanced, if the response does not include all of the remaining
     * available objects, Shield Advanced includes a <code>NextToken</code> value in the response. You can retrieve the
     * next batch of objects by requesting the list again and providing the token that was returned by the prior call in
     * your request.
     * </p>
     * <p>
     * You can indicate the maximum number of objects that you want Shield Advanced to return for a single call with the
     * <code>MaxResults</code> setting. Shield Advanced will not return more than <code>MaxResults</code> objects, but
     * may return fewer, even if more objects are still available.
     * </p>
     * <p>
     * Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a
     * <code>NextToken</code> value.
     * </p>
     * 
     * @param nextToken
     *        When you request a list of objects from Shield Advanced, if the response does not include all of the
     *        remaining available objects, Shield Advanced includes a <code>NextToken</code> value in the response. You
     *        can retrieve the next batch of objects by requesting the list again and providing the token that was
     *        returned by the prior call in your request. </p>
     *        <p>
     *        You can indicate the maximum number of objects that you want Shield Advanced to return for a single call
     *        with the <code>MaxResults</code> setting. Shield Advanced will not return more than
     *        <code>MaxResults</code> objects, but may return fewer, even if more objects are still available.
     *        </p>
     *        <p>
     *        Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a
     *        <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesInProtectionGroupResult withNextToken(String nextToken) {
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
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns()).append(",");
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

        if (obj instanceof ListResourcesInProtectionGroupResult == false)
            return false;
        ListResourcesInProtectionGroupResult other = (ListResourcesInProtectionGroupResult) obj;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
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

        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourcesInProtectionGroupResult clone() {
        try {
            return (ListResourcesInProtectionGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

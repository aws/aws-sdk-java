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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListSubscribers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSubscribersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If nextToken is returned, there are more results available. You can repeat the call using the returned token to
     * retrieve the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The subscribers available for the specified Security Lake account ID.
     * </p>
     */
    private java.util.List<SubscriberResource> subscribers;

    /**
     * <p>
     * If nextToken is returned, there are more results available. You can repeat the call using the returned token to
     * retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned, there are more results available. You can repeat the call using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. You can repeat the call using the returned token to
     * retrieve the next page.
     * </p>
     * 
     * @return If nextToken is returned, there are more results available. You can repeat the call using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. You can repeat the call using the returned token to
     * retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned, there are more results available. You can repeat the call using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscribersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The subscribers available for the specified Security Lake account ID.
     * </p>
     * 
     * @return The subscribers available for the specified Security Lake account ID.
     */

    public java.util.List<SubscriberResource> getSubscribers() {
        return subscribers;
    }

    /**
     * <p>
     * The subscribers available for the specified Security Lake account ID.
     * </p>
     * 
     * @param subscribers
     *        The subscribers available for the specified Security Lake account ID.
     */

    public void setSubscribers(java.util.Collection<SubscriberResource> subscribers) {
        if (subscribers == null) {
            this.subscribers = null;
            return;
        }

        this.subscribers = new java.util.ArrayList<SubscriberResource>(subscribers);
    }

    /**
     * <p>
     * The subscribers available for the specified Security Lake account ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscribers(java.util.Collection)} or {@link #withSubscribers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subscribers
     *        The subscribers available for the specified Security Lake account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscribersResult withSubscribers(SubscriberResource... subscribers) {
        if (this.subscribers == null) {
            setSubscribers(new java.util.ArrayList<SubscriberResource>(subscribers.length));
        }
        for (SubscriberResource ele : subscribers) {
            this.subscribers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subscribers available for the specified Security Lake account ID.
     * </p>
     * 
     * @param subscribers
     *        The subscribers available for the specified Security Lake account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscribersResult withSubscribers(java.util.Collection<SubscriberResource> subscribers) {
        setSubscribers(subscribers);
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
        if (getSubscribers() != null)
            sb.append("Subscribers: ").append(getSubscribers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSubscribersResult == false)
            return false;
        ListSubscribersResult other = (ListSubscribersResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSubscribers() == null ^ this.getSubscribers() == null)
            return false;
        if (other.getSubscribers() != null && other.getSubscribers().equals(this.getSubscribers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSubscribers() == null) ? 0 : getSubscribers().hashCode());
        return hashCode;
    }

    @Override
    public ListSubscribersResult clone() {
        try {
            return (ListSubscribersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Response for ListTopics action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListTopics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTopicsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of topic ARNs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Topic> topics;
    /**
     * <p>
     * Token to pass along to the next <code>ListTopics</code> request. This element is returned if there are additional
     * topics to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of topic ARNs.
     * </p>
     * 
     * @return A list of topic ARNs.
     */

    public java.util.List<Topic> getTopics() {
        if (topics == null) {
            topics = new com.amazonaws.internal.SdkInternalList<Topic>();
        }
        return topics;
    }

    /**
     * <p>
     * A list of topic ARNs.
     * </p>
     * 
     * @param topics
     *        A list of topic ARNs.
     */

    public void setTopics(java.util.Collection<Topic> topics) {
        if (topics == null) {
            this.topics = null;
            return;
        }

        this.topics = new com.amazonaws.internal.SdkInternalList<Topic>(topics);
    }

    /**
     * <p>
     * A list of topic ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopics(java.util.Collection)} or {@link #withTopics(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param topics
     *        A list of topic ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicsResult withTopics(Topic... topics) {
        if (this.topics == null) {
            setTopics(new com.amazonaws.internal.SdkInternalList<Topic>(topics.length));
        }
        for (Topic ele : topics) {
            this.topics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of topic ARNs.
     * </p>
     * 
     * @param topics
     *        A list of topic ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicsResult withTopics(java.util.Collection<Topic> topics) {
        setTopics(topics);
        return this;
    }

    /**
     * <p>
     * Token to pass along to the next <code>ListTopics</code> request. This element is returned if there are additional
     * topics to retrieve.
     * </p>
     * 
     * @param nextToken
     *        Token to pass along to the next <code>ListTopics</code> request. This element is returned if there are
     *        additional topics to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token to pass along to the next <code>ListTopics</code> request. This element is returned if there are additional
     * topics to retrieve.
     * </p>
     * 
     * @return Token to pass along to the next <code>ListTopics</code> request. This element is returned if there are
     *         additional topics to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token to pass along to the next <code>ListTopics</code> request. This element is returned if there are additional
     * topics to retrieve.
     * </p>
     * 
     * @param nextToken
     *        Token to pass along to the next <code>ListTopics</code> request. This element is returned if there are
     *        additional topics to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicsResult withNextToken(String nextToken) {
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
        if (getTopics() != null)
            sb.append("Topics: ").append(getTopics()).append(",");
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

        if (obj instanceof ListTopicsResult == false)
            return false;
        ListTopicsResult other = (ListTopicsResult) obj;
        if (other.getTopics() == null ^ this.getTopics() == null)
            return false;
        if (other.getTopics() != null && other.getTopics().equals(this.getTopics()) == false)
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

        hashCode = prime * hashCode + ((getTopics() == null) ? 0 : getTopics().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTopicsResult clone() {
        try {
            return (ListTopicsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListQueues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQueuesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Use this string to request the next batch of queues. */
    private String nextToken;
    /** List of queues. */
    private java.util.List<Queue> queues;

    /**
     * Use this string to request the next batch of queues.
     * 
     * @param nextToken
     *        Use this string to request the next batch of queues.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Use this string to request the next batch of queues.
     * 
     * @return Use this string to request the next batch of queues.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * Use this string to request the next batch of queues.
     * 
     * @param nextToken
     *        Use this string to request the next batch of queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueuesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * List of queues.
     * 
     * @return List of queues.
     */

    public java.util.List<Queue> getQueues() {
        return queues;
    }

    /**
     * List of queues.
     * 
     * @param queues
     *        List of queues.
     */

    public void setQueues(java.util.Collection<Queue> queues) {
        if (queues == null) {
            this.queues = null;
            return;
        }

        this.queues = new java.util.ArrayList<Queue>(queues);
    }

    /**
     * List of queues.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueues(java.util.Collection)} or {@link #withQueues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param queues
     *        List of queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueuesResult withQueues(Queue... queues) {
        if (this.queues == null) {
            setQueues(new java.util.ArrayList<Queue>(queues.length));
        }
        for (Queue ele : queues) {
            this.queues.add(ele);
        }
        return this;
    }

    /**
     * List of queues.
     * 
     * @param queues
     *        List of queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueuesResult withQueues(java.util.Collection<Queue> queues) {
        setQueues(queues);
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
        if (getQueues() != null)
            sb.append("Queues: ").append(getQueues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListQueuesResult == false)
            return false;
        ListQueuesResult other = (ListQueuesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getQueues() == null ^ this.getQueues() == null)
            return false;
        if (other.getQueues() != null && other.getQueues().equals(this.getQueues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getQueues() == null) ? 0 : getQueues().hashCode());
        return hashCode;
    }

    @Override
    public ListQueuesResult clone() {
        try {
            return (ListQueuesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

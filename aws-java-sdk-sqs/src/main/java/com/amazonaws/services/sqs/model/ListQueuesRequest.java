/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class ListQueuesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string to use for filtering the list results. Only those queues whose name begins with the specified string are
     * returned.
     * </p>
     * <p>
     * Queue names are case-sensitive.
     * </p>
     */
    private String queueNamePrefix;

    /**
     * Default constructor for ListQueuesRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public ListQueuesRequest() {
    }

    /**
     * Constructs a new ListQueuesRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueNamePrefix
     *        A string to use for filtering the list results. Only those queues whose name begins with the specified
     *        string are returned.</p>
     *        <p>
     *        Queue names are case-sensitive.
     */
    public ListQueuesRequest(String queueNamePrefix) {
        setQueueNamePrefix(queueNamePrefix);
    }

    /**
     * <p>
     * A string to use for filtering the list results. Only those queues whose name begins with the specified string are
     * returned.
     * </p>
     * <p>
     * Queue names are case-sensitive.
     * </p>
     * 
     * @param queueNamePrefix
     *        A string to use for filtering the list results. Only those queues whose name begins with the specified
     *        string are returned.</p>
     *        <p>
     *        Queue names are case-sensitive.
     */

    public void setQueueNamePrefix(String queueNamePrefix) {
        this.queueNamePrefix = queueNamePrefix;
    }

    /**
     * <p>
     * A string to use for filtering the list results. Only those queues whose name begins with the specified string are
     * returned.
     * </p>
     * <p>
     * Queue names are case-sensitive.
     * </p>
     * 
     * @return A string to use for filtering the list results. Only those queues whose name begins with the specified
     *         string are returned.</p>
     *         <p>
     *         Queue names are case-sensitive.
     */

    public String getQueueNamePrefix() {
        return this.queueNamePrefix;
    }

    /**
     * <p>
     * A string to use for filtering the list results. Only those queues whose name begins with the specified string are
     * returned.
     * </p>
     * <p>
     * Queue names are case-sensitive.
     * </p>
     * 
     * @param queueNamePrefix
     *        A string to use for filtering the list results. Only those queues whose name begins with the specified
     *        string are returned.</p>
     *        <p>
     *        Queue names are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueuesRequest withQueueNamePrefix(String queueNamePrefix) {
        setQueueNamePrefix(queueNamePrefix);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getQueueNamePrefix() != null)
            sb.append("QueueNamePrefix: " + getQueueNamePrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListQueuesRequest == false)
            return false;
        ListQueuesRequest other = (ListQueuesRequest) obj;
        if (other.getQueueNamePrefix() == null ^ this.getQueueNamePrefix() == null)
            return false;
        if (other.getQueueNamePrefix() != null && other.getQueueNamePrefix().equals(this.getQueueNamePrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueNamePrefix() == null) ? 0 : getQueueNamePrefix().hashCode());
        return hashCode;
    }

    @Override
    public ListQueuesRequest clone() {
        return (ListQueuesRequest) super.clone();
    }
}

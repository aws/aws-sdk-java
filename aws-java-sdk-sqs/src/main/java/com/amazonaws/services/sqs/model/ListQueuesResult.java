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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of your queues.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/ListQueues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQueuesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of queue URLs, up to 1,000 entries.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> queueUrls;

    /**
     * <p>
     * A list of queue URLs, up to 1,000 entries.
     * </p>
     * 
     * @return A list of queue URLs, up to 1,000 entries.
     */

    public java.util.List<String> getQueueUrls() {
        if (queueUrls == null) {
            queueUrls = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return queueUrls;
    }

    /**
     * <p>
     * A list of queue URLs, up to 1,000 entries.
     * </p>
     * 
     * @param queueUrls
     *        A list of queue URLs, up to 1,000 entries.
     */

    public void setQueueUrls(java.util.Collection<String> queueUrls) {
        if (queueUrls == null) {
            this.queueUrls = null;
            return;
        }

        this.queueUrls = new com.amazonaws.internal.SdkInternalList<String>(queueUrls);
    }

    /**
     * <p>
     * A list of queue URLs, up to 1,000 entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueueUrls(java.util.Collection)} or {@link #withQueueUrls(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param queueUrls
     *        A list of queue URLs, up to 1,000 entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueuesResult withQueueUrls(String... queueUrls) {
        if (this.queueUrls == null) {
            setQueueUrls(new com.amazonaws.internal.SdkInternalList<String>(queueUrls.length));
        }
        for (String ele : queueUrls) {
            this.queueUrls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of queue URLs, up to 1,000 entries.
     * </p>
     * 
     * @param queueUrls
     *        A list of queue URLs, up to 1,000 entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueuesResult withQueueUrls(java.util.Collection<String> queueUrls) {
        setQueueUrls(queueUrls);
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
        if (getQueueUrls() != null)
            sb.append("QueueUrls: ").append(getQueueUrls());
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
        if (other.getQueueUrls() == null ^ this.getQueueUrls() == null)
            return false;
        if (other.getQueueUrls() != null && other.getQueueUrls().equals(this.getQueueUrls()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrls() == null) ? 0 : getQueueUrls().hashCode());
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

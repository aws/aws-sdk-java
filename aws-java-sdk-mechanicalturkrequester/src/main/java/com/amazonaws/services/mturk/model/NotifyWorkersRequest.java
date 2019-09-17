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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/NotifyWorkers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotifyWorkersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The subject line of the email message to send. Can include up to 200 characters.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * The text of the email message to send. Can include up to 4,096 characters
     * </p>
     */
    private String messageText;
    /**
     * <p>
     * A list of Worker IDs you wish to notify. You can notify upto 100 Workers at a time.
     * </p>
     */
    private java.util.List<String> workerIds;

    /**
     * <p>
     * The subject line of the email message to send. Can include up to 200 characters.
     * </p>
     * 
     * @param subject
     *        The subject line of the email message to send. Can include up to 200 characters.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject line of the email message to send. Can include up to 200 characters.
     * </p>
     * 
     * @return The subject line of the email message to send. Can include up to 200 characters.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The subject line of the email message to send. Can include up to 200 characters.
     * </p>
     * 
     * @param subject
     *        The subject line of the email message to send. Can include up to 200 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyWorkersRequest withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The text of the email message to send. Can include up to 4,096 characters
     * </p>
     * 
     * @param messageText
     *        The text of the email message to send. Can include up to 4,096 characters
     */

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    /**
     * <p>
     * The text of the email message to send. Can include up to 4,096 characters
     * </p>
     * 
     * @return The text of the email message to send. Can include up to 4,096 characters
     */

    public String getMessageText() {
        return this.messageText;
    }

    /**
     * <p>
     * The text of the email message to send. Can include up to 4,096 characters
     * </p>
     * 
     * @param messageText
     *        The text of the email message to send. Can include up to 4,096 characters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyWorkersRequest withMessageText(String messageText) {
        setMessageText(messageText);
        return this;
    }

    /**
     * <p>
     * A list of Worker IDs you wish to notify. You can notify upto 100 Workers at a time.
     * </p>
     * 
     * @return A list of Worker IDs you wish to notify. You can notify upto 100 Workers at a time.
     */

    public java.util.List<String> getWorkerIds() {
        return workerIds;
    }

    /**
     * <p>
     * A list of Worker IDs you wish to notify. You can notify upto 100 Workers at a time.
     * </p>
     * 
     * @param workerIds
     *        A list of Worker IDs you wish to notify. You can notify upto 100 Workers at a time.
     */

    public void setWorkerIds(java.util.Collection<String> workerIds) {
        if (workerIds == null) {
            this.workerIds = null;
            return;
        }

        this.workerIds = new java.util.ArrayList<String>(workerIds);
    }

    /**
     * <p>
     * A list of Worker IDs you wish to notify. You can notify upto 100 Workers at a time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkerIds(java.util.Collection)} or {@link #withWorkerIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workerIds
     *        A list of Worker IDs you wish to notify. You can notify upto 100 Workers at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyWorkersRequest withWorkerIds(String... workerIds) {
        if (this.workerIds == null) {
            setWorkerIds(new java.util.ArrayList<String>(workerIds.length));
        }
        for (String ele : workerIds) {
            this.workerIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Worker IDs you wish to notify. You can notify upto 100 Workers at a time.
     * </p>
     * 
     * @param workerIds
     *        A list of Worker IDs you wish to notify. You can notify upto 100 Workers at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyWorkersRequest withWorkerIds(java.util.Collection<String> workerIds) {
        setWorkerIds(workerIds);
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
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getMessageText() != null)
            sb.append("MessageText: ").append(getMessageText()).append(",");
        if (getWorkerIds() != null)
            sb.append("WorkerIds: ").append(getWorkerIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotifyWorkersRequest == false)
            return false;
        NotifyWorkersRequest other = (NotifyWorkersRequest) obj;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getMessageText() == null ^ this.getMessageText() == null)
            return false;
        if (other.getMessageText() != null && other.getMessageText().equals(this.getMessageText()) == false)
            return false;
        if (other.getWorkerIds() == null ^ this.getWorkerIds() == null)
            return false;
        if (other.getWorkerIds() != null && other.getWorkerIds().equals(this.getWorkerIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getMessageText() == null) ? 0 : getMessageText().hashCode());
        hashCode = prime * hashCode + ((getWorkerIds() == null) ? 0 : getWorkerIds().hashCode());
        return hashCode;
    }

    @Override
    public NotifyWorkersRequest clone() {
        return (NotifyWorkersRequest) super.clone();
    }

}

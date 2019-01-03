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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/NotifyWorkers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotifyWorkersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When MTurk sends notifications to the list of Workers, it returns back any failures it encounters in this list of
     * NotifyWorkersFailureStatus objects.
     * </p>
     */
    private java.util.List<NotifyWorkersFailureStatus> notifyWorkersFailureStatuses;

    /**
     * <p>
     * When MTurk sends notifications to the list of Workers, it returns back any failures it encounters in this list of
     * NotifyWorkersFailureStatus objects.
     * </p>
     * 
     * @return When MTurk sends notifications to the list of Workers, it returns back any failures it encounters in this
     *         list of NotifyWorkersFailureStatus objects.
     */

    public java.util.List<NotifyWorkersFailureStatus> getNotifyWorkersFailureStatuses() {
        return notifyWorkersFailureStatuses;
    }

    /**
     * <p>
     * When MTurk sends notifications to the list of Workers, it returns back any failures it encounters in this list of
     * NotifyWorkersFailureStatus objects.
     * </p>
     * 
     * @param notifyWorkersFailureStatuses
     *        When MTurk sends notifications to the list of Workers, it returns back any failures it encounters in this
     *        list of NotifyWorkersFailureStatus objects.
     */

    public void setNotifyWorkersFailureStatuses(java.util.Collection<NotifyWorkersFailureStatus> notifyWorkersFailureStatuses) {
        if (notifyWorkersFailureStatuses == null) {
            this.notifyWorkersFailureStatuses = null;
            return;
        }

        this.notifyWorkersFailureStatuses = new java.util.ArrayList<NotifyWorkersFailureStatus>(notifyWorkersFailureStatuses);
    }

    /**
     * <p>
     * When MTurk sends notifications to the list of Workers, it returns back any failures it encounters in this list of
     * NotifyWorkersFailureStatus objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotifyWorkersFailureStatuses(java.util.Collection)} or
     * {@link #withNotifyWorkersFailureStatuses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param notifyWorkersFailureStatuses
     *        When MTurk sends notifications to the list of Workers, it returns back any failures it encounters in this
     *        list of NotifyWorkersFailureStatus objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyWorkersResult withNotifyWorkersFailureStatuses(NotifyWorkersFailureStatus... notifyWorkersFailureStatuses) {
        if (this.notifyWorkersFailureStatuses == null) {
            setNotifyWorkersFailureStatuses(new java.util.ArrayList<NotifyWorkersFailureStatus>(notifyWorkersFailureStatuses.length));
        }
        for (NotifyWorkersFailureStatus ele : notifyWorkersFailureStatuses) {
            this.notifyWorkersFailureStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * When MTurk sends notifications to the list of Workers, it returns back any failures it encounters in this list of
     * NotifyWorkersFailureStatus objects.
     * </p>
     * 
     * @param notifyWorkersFailureStatuses
     *        When MTurk sends notifications to the list of Workers, it returns back any failures it encounters in this
     *        list of NotifyWorkersFailureStatus objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyWorkersResult withNotifyWorkersFailureStatuses(java.util.Collection<NotifyWorkersFailureStatus> notifyWorkersFailureStatuses) {
        setNotifyWorkersFailureStatuses(notifyWorkersFailureStatuses);
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
        if (getNotifyWorkersFailureStatuses() != null)
            sb.append("NotifyWorkersFailureStatuses: ").append(getNotifyWorkersFailureStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotifyWorkersResult == false)
            return false;
        NotifyWorkersResult other = (NotifyWorkersResult) obj;
        if (other.getNotifyWorkersFailureStatuses() == null ^ this.getNotifyWorkersFailureStatuses() == null)
            return false;
        if (other.getNotifyWorkersFailureStatuses() != null && other.getNotifyWorkersFailureStatuses().equals(this.getNotifyWorkersFailureStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotifyWorkersFailureStatuses() == null) ? 0 : getNotifyWorkersFailureStatuses().hashCode());
        return hashCode;
    }

    @Override
    public NotifyWorkersResult clone() {
        try {
            return (NotifyWorkersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

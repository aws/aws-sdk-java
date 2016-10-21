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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;

/**
 * A structure to relate notification and a list of subscribers who belong to the notification.
 */
public class NotificationWithSubscribers implements Serializable, Cloneable {

    private Notification notification;

    private java.util.List<Subscriber> subscribers;

    /**
     * @param notification
     */

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * @return
     */

    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @param notification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationWithSubscribers withNotification(Notification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Subscriber> getSubscribers() {
        return subscribers;
    }

    /**
     * @param subscribers
     */

    public void setSubscribers(java.util.Collection<Subscriber> subscribers) {
        if (subscribers == null) {
            this.subscribers = null;
            return;
        }

        this.subscribers = new java.util.ArrayList<Subscriber>(subscribers);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscribers(java.util.Collection)} or {@link #withSubscribers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subscribers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationWithSubscribers withSubscribers(Subscriber... subscribers) {
        if (this.subscribers == null) {
            setSubscribers(new java.util.ArrayList<Subscriber>(subscribers.length));
        }
        for (Subscriber ele : subscribers) {
            this.subscribers.add(ele);
        }
        return this;
    }

    /**
     * @param subscribers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationWithSubscribers withSubscribers(java.util.Collection<Subscriber> subscribers) {
        setSubscribers(subscribers);
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
        if (getNotification() != null)
            sb.append("Notification: " + getNotification() + ",");
        if (getSubscribers() != null)
            sb.append("Subscribers: " + getSubscribers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationWithSubscribers == false)
            return false;
        NotificationWithSubscribers other = (NotificationWithSubscribers) obj;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null && other.getNotification().equals(this.getNotification()) == false)
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

        hashCode = prime * hashCode + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode + ((getSubscribers() == null) ? 0 : getSubscribers().hashCode());
        return hashCode;
    }

    @Override
    public NotificationWithSubscribers clone() {
        try {
            return (NotificationWithSubscribers) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

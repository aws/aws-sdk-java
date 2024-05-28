/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListNotifications" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNotificationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When the number of notifications is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of notifications, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListNotifications</code> to list the next set of notifications.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The results of the <code>ListNotifications</code> action.
     * </p>
     */
    private java.util.List<NotificationOutput> notifications;

    /**
     * <p>
     * When the number of notifications is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of notifications, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListNotifications</code> to list the next set of notifications.
     * </p>
     * 
     * @param nextToken
     *        When the number of notifications is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of notifications, the response includes a pagination token named <code>NextToken</code>. You can specify
     *        this <code>NextToken</code> value in a subsequent call to <code>ListNotifications</code> to list the next
     *        set of notifications.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of notifications is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of notifications, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListNotifications</code> to list the next set of notifications.
     * </p>
     * 
     * @return When the number of notifications is greater than the default value for the <code>MaxResults</code>
     *         parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *         of notifications, the response includes a pagination token named <code>NextToken</code>. You can specify
     *         this <code>NextToken</code> value in a subsequent call to <code>ListNotifications</code> to list the next
     *         set of notifications.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of notifications is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of notifications, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListNotifications</code> to list the next set of notifications.
     * </p>
     * 
     * @param nextToken
     *        When the number of notifications is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of notifications, the response includes a pagination token named <code>NextToken</code>. You can specify
     *        this <code>NextToken</code> value in a subsequent call to <code>ListNotifications</code> to list the next
     *        set of notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The results of the <code>ListNotifications</code> action.
     * </p>
     * 
     * @return The results of the <code>ListNotifications</code> action.
     */

    public java.util.List<NotificationOutput> getNotifications() {
        return notifications;
    }

    /**
     * <p>
     * The results of the <code>ListNotifications</code> action.
     * </p>
     * 
     * @param notifications
     *        The results of the <code>ListNotifications</code> action.
     */

    public void setNotifications(java.util.Collection<NotificationOutput> notifications) {
        if (notifications == null) {
            this.notifications = null;
            return;
        }

        this.notifications = new java.util.ArrayList<NotificationOutput>(notifications);
    }

    /**
     * <p>
     * The results of the <code>ListNotifications</code> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotifications(java.util.Collection)} or {@link #withNotifications(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param notifications
     *        The results of the <code>ListNotifications</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationsResult withNotifications(NotificationOutput... notifications) {
        if (this.notifications == null) {
            setNotifications(new java.util.ArrayList<NotificationOutput>(notifications.length));
        }
        for (NotificationOutput ele : notifications) {
            this.notifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The results of the <code>ListNotifications</code> action.
     * </p>
     * 
     * @param notifications
     *        The results of the <code>ListNotifications</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationsResult withNotifications(java.util.Collection<NotificationOutput> notifications) {
        setNotifications(notifications);
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
        if (getNotifications() != null)
            sb.append("Notifications: ").append(getNotifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNotificationsResult == false)
            return false;
        ListNotificationsResult other = (ListNotificationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getNotifications() == null ^ this.getNotifications() == null)
            return false;
        if (other.getNotifications() != null && other.getNotifications().equals(this.getNotifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getNotifications() == null) ? 0 : getNotifications().hashCode());
        return hashCode;
    }

    @Override
    public ListNotificationsResult clone() {
        try {
            return (ListNotificationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

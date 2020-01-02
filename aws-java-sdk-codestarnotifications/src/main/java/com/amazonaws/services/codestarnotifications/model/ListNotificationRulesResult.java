/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codestarnotifications.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListNotificationRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNotificationRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of notification rules for the AWS account, by Amazon Resource Name (ARN) and ID.
     * </p>
     */
    private java.util.List<NotificationRuleSummary> notificationRules;

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that can be used in a request to return the next batch of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @return An enumeration token that can be used in a request to return the next batch of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that can be used in a request to return the next batch of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationRulesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of notification rules for the AWS account, by Amazon Resource Name (ARN) and ID.
     * </p>
     * 
     * @return The list of notification rules for the AWS account, by Amazon Resource Name (ARN) and ID.
     */

    public java.util.List<NotificationRuleSummary> getNotificationRules() {
        return notificationRules;
    }

    /**
     * <p>
     * The list of notification rules for the AWS account, by Amazon Resource Name (ARN) and ID.
     * </p>
     * 
     * @param notificationRules
     *        The list of notification rules for the AWS account, by Amazon Resource Name (ARN) and ID.
     */

    public void setNotificationRules(java.util.Collection<NotificationRuleSummary> notificationRules) {
        if (notificationRules == null) {
            this.notificationRules = null;
            return;
        }

        this.notificationRules = new java.util.ArrayList<NotificationRuleSummary>(notificationRules);
    }

    /**
     * <p>
     * The list of notification rules for the AWS account, by Amazon Resource Name (ARN) and ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationRules(java.util.Collection)} or {@link #withNotificationRules(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param notificationRules
     *        The list of notification rules for the AWS account, by Amazon Resource Name (ARN) and ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationRulesResult withNotificationRules(NotificationRuleSummary... notificationRules) {
        if (this.notificationRules == null) {
            setNotificationRules(new java.util.ArrayList<NotificationRuleSummary>(notificationRules.length));
        }
        for (NotificationRuleSummary ele : notificationRules) {
            this.notificationRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of notification rules for the AWS account, by Amazon Resource Name (ARN) and ID.
     * </p>
     * 
     * @param notificationRules
     *        The list of notification rules for the AWS account, by Amazon Resource Name (ARN) and ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationRulesResult withNotificationRules(java.util.Collection<NotificationRuleSummary> notificationRules) {
        setNotificationRules(notificationRules);
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
        if (getNotificationRules() != null)
            sb.append("NotificationRules: ").append(getNotificationRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNotificationRulesResult == false)
            return false;
        ListNotificationRulesResult other = (ListNotificationRulesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getNotificationRules() == null ^ this.getNotificationRules() == null)
            return false;
        if (other.getNotificationRules() != null && other.getNotificationRules().equals(this.getNotificationRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getNotificationRules() == null) ? 0 : getNotificationRules().hashCode());
        return hashCode;
    }

    @Override
    public ListNotificationRulesResult clone() {
        try {
            return (ListNotificationRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

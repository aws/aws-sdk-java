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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListNotifications" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNotificationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The time after which you want to list notifications.
     * </p>
     */
    private java.util.Date afterTimestamp;
    /**
     * <p>
     * The time before which you want to list notifications.
     * </p>
     */
    private java.util.Date beforeTimestamp;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The maximum number of notifications to return in a single call to <code>ListNotifications</code>. When the number
     * of notifications to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListNotifications</code> to list the
     * next set of notifications.
     * </p>
     */
    private Integer maxResults;
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
     * The subjects of notifications.
     * </p>
     */
    private java.util.List<String> subjects;
    /**
     * <p>
     * The task status of notifications.
     * </p>
     */
    private String taskStatus;
    /**
     * <p>
     * The type of notifications.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The time after which you want to list notifications.
     * </p>
     * 
     * @param afterTimestamp
     *        The time after which you want to list notifications.
     */

    public void setAfterTimestamp(java.util.Date afterTimestamp) {
        this.afterTimestamp = afterTimestamp;
    }

    /**
     * <p>
     * The time after which you want to list notifications.
     * </p>
     * 
     * @return The time after which you want to list notifications.
     */

    public java.util.Date getAfterTimestamp() {
        return this.afterTimestamp;
    }

    /**
     * <p>
     * The time after which you want to list notifications.
     * </p>
     * 
     * @param afterTimestamp
     *        The time after which you want to list notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationsRequest withAfterTimestamp(java.util.Date afterTimestamp) {
        setAfterTimestamp(afterTimestamp);
        return this;
    }

    /**
     * <p>
     * The time before which you want to list notifications.
     * </p>
     * 
     * @param beforeTimestamp
     *        The time before which you want to list notifications.
     */

    public void setBeforeTimestamp(java.util.Date beforeTimestamp) {
        this.beforeTimestamp = beforeTimestamp;
    }

    /**
     * <p>
     * The time before which you want to list notifications.
     * </p>
     * 
     * @return The time before which you want to list notifications.
     */

    public java.util.Date getBeforeTimestamp() {
        return this.beforeTimestamp;
    }

    /**
     * <p>
     * The time before which you want to list notifications.
     * </p>
     * 
     * @param beforeTimestamp
     *        The time before which you want to list notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationsRequest withBeforeTimestamp(java.util.Date beforeTimestamp) {
        setBeforeTimestamp(beforeTimestamp);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationsRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of notifications to return in a single call to <code>ListNotifications</code>. When the number
     * of notifications to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListNotifications</code> to list the
     * next set of notifications.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of notifications to return in a single call to <code>ListNotifications</code>. When the
     *        number of notifications to be listed is greater than the value of <code>MaxResults</code>, the response
     *        contains a <code>NextToken</code> value that you can use in a subsequent call to
     *        <code>ListNotifications</code> to list the next set of notifications.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of notifications to return in a single call to <code>ListNotifications</code>. When the number
     * of notifications to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListNotifications</code> to list the
     * next set of notifications.
     * </p>
     * 
     * @return The maximum number of notifications to return in a single call to <code>ListNotifications</code>. When
     *         the number of notifications to be listed is greater than the value of <code>MaxResults</code>, the
     *         response contains a <code>NextToken</code> value that you can use in a subsequent call to
     *         <code>ListNotifications</code> to list the next set of notifications.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of notifications to return in a single call to <code>ListNotifications</code>. When the number
     * of notifications to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListNotifications</code> to list the
     * next set of notifications.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of notifications to return in a single call to <code>ListNotifications</code>. When the
     *        number of notifications to be listed is greater than the value of <code>MaxResults</code>, the response
     *        contains a <code>NextToken</code> value that you can use in a subsequent call to
     *        <code>ListNotifications</code> to list the next set of notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
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

    public ListNotificationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The subjects of notifications.
     * </p>
     * 
     * @return The subjects of notifications.
     */

    public java.util.List<String> getSubjects() {
        return subjects;
    }

    /**
     * <p>
     * The subjects of notifications.
     * </p>
     * 
     * @param subjects
     *        The subjects of notifications.
     */

    public void setSubjects(java.util.Collection<String> subjects) {
        if (subjects == null) {
            this.subjects = null;
            return;
        }

        this.subjects = new java.util.ArrayList<String>(subjects);
    }

    /**
     * <p>
     * The subjects of notifications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubjects(java.util.Collection)} or {@link #withSubjects(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subjects
     *        The subjects of notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationsRequest withSubjects(String... subjects) {
        if (this.subjects == null) {
            setSubjects(new java.util.ArrayList<String>(subjects.length));
        }
        for (String ele : subjects) {
            this.subjects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subjects of notifications.
     * </p>
     * 
     * @param subjects
     *        The subjects of notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationsRequest withSubjects(java.util.Collection<String> subjects) {
        setSubjects(subjects);
        return this;
    }

    /**
     * <p>
     * The task status of notifications.
     * </p>
     * 
     * @param taskStatus
     *        The task status of notifications.
     * @see TaskStatus
     */

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * The task status of notifications.
     * </p>
     * 
     * @return The task status of notifications.
     * @see TaskStatus
     */

    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * <p>
     * The task status of notifications.
     * </p>
     * 
     * @param taskStatus
     *        The task status of notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public ListNotificationsRequest withTaskStatus(String taskStatus) {
        setTaskStatus(taskStatus);
        return this;
    }

    /**
     * <p>
     * The task status of notifications.
     * </p>
     * 
     * @param taskStatus
     *        The task status of notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public ListNotificationsRequest withTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
        return this;
    }

    /**
     * <p>
     * The type of notifications.
     * </p>
     * 
     * @param type
     *        The type of notifications.
     * @see NotificationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of notifications.
     * </p>
     * 
     * @return The type of notifications.
     * @see NotificationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of notifications.
     * </p>
     * 
     * @param type
     *        The type of notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public ListNotificationsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of notifications.
     * </p>
     * 
     * @param type
     *        The type of notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public ListNotificationsRequest withType(NotificationType type) {
        this.type = type.toString();
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
        if (getAfterTimestamp() != null)
            sb.append("AfterTimestamp: ").append(getAfterTimestamp()).append(",");
        if (getBeforeTimestamp() != null)
            sb.append("BeforeTimestamp: ").append(getBeforeTimestamp()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSubjects() != null)
            sb.append("Subjects: ").append(getSubjects()).append(",");
        if (getTaskStatus() != null)
            sb.append("TaskStatus: ").append(getTaskStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNotificationsRequest == false)
            return false;
        ListNotificationsRequest other = (ListNotificationsRequest) obj;
        if (other.getAfterTimestamp() == null ^ this.getAfterTimestamp() == null)
            return false;
        if (other.getAfterTimestamp() != null && other.getAfterTimestamp().equals(this.getAfterTimestamp()) == false)
            return false;
        if (other.getBeforeTimestamp() == null ^ this.getBeforeTimestamp() == null)
            return false;
        if (other.getBeforeTimestamp() != null && other.getBeforeTimestamp().equals(this.getBeforeTimestamp()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSubjects() == null ^ this.getSubjects() == null)
            return false;
        if (other.getSubjects() != null && other.getSubjects().equals(this.getSubjects()) == false)
            return false;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAfterTimestamp() == null) ? 0 : getAfterTimestamp().hashCode());
        hashCode = prime * hashCode + ((getBeforeTimestamp() == null) ? 0 : getBeforeTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSubjects() == null) ? 0 : getSubjects().hashCode());
        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ListNotificationsRequest clone() {
        return (ListNotificationsRequest) super.clone();
    }

}

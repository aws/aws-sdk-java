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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Simple Notification Service (Amazon SNS) notification settings associated with a specific job. The
 * <code>Notification</code> object is returned as a part of the response syntax of the <code>DescribeJob</code> action
 * in the <code>JobMetadata</code> data type.
 * </p>
 * <p>
 * When the notification settings are defined during job creation, you can choose to notify based on a specific set of
 * job states using the <code>JobStatesToNotify</code> array of strings, or you can specify that you want to have Amazon
 * SNS notifications sent out for all job states with <code>NotifyAll</code> set to true.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/Notification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Notification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The new SNS <code>TopicArn</code> that you want to associate with this job. You can create Amazon Resource Names
     * (ARNs) for topics by using the <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_CreateTopic.html">CreateTopic</a> Amazon SNS API action.
     * </p>
     * <p>
     * You can subscribe email addresses to an Amazon SNS topic through the AWS Management Console, or by using the <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html">Subscribe</a> AWS Simple Notification Service
     * (SNS) API action.
     * </p>
     */
    private String snsTopicARN;
    /**
     * <p>
     * The list of job states that will trigger a notification for this job.
     * </p>
     */
    private java.util.List<String> jobStatesToNotify;
    /**
     * <p>
     * Any change in job state will trigger a notification for this job.
     * </p>
     */
    private Boolean notifyAll;

    /**
     * <p>
     * The new SNS <code>TopicArn</code> that you want to associate with this job. You can create Amazon Resource Names
     * (ARNs) for topics by using the <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_CreateTopic.html">CreateTopic</a> Amazon SNS API action.
     * </p>
     * <p>
     * You can subscribe email addresses to an Amazon SNS topic through the AWS Management Console, or by using the <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html">Subscribe</a> AWS Simple Notification Service
     * (SNS) API action.
     * </p>
     * 
     * @param snsTopicARN
     *        The new SNS <code>TopicArn</code> that you want to associate with this job. You can create Amazon Resource
     *        Names (ARNs) for topics by using the <a
     *        href="http://docs.aws.amazon.com/sns/latest/api/API_CreateTopic.html">CreateTopic</a> Amazon SNS API
     *        action.</p>
     *        <p>
     *        You can subscribe email addresses to an Amazon SNS topic through the AWS Management Console, or by using
     *        the <a href="http://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html">Subscribe</a> AWS Simple
     *        Notification Service (SNS) API action.
     */

    public void setSnsTopicARN(String snsTopicARN) {
        this.snsTopicARN = snsTopicARN;
    }

    /**
     * <p>
     * The new SNS <code>TopicArn</code> that you want to associate with this job. You can create Amazon Resource Names
     * (ARNs) for topics by using the <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_CreateTopic.html">CreateTopic</a> Amazon SNS API action.
     * </p>
     * <p>
     * You can subscribe email addresses to an Amazon SNS topic through the AWS Management Console, or by using the <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html">Subscribe</a> AWS Simple Notification Service
     * (SNS) API action.
     * </p>
     * 
     * @return The new SNS <code>TopicArn</code> that you want to associate with this job. You can create Amazon
     *         Resource Names (ARNs) for topics by using the <a
     *         href="http://docs.aws.amazon.com/sns/latest/api/API_CreateTopic.html">CreateTopic</a> Amazon SNS API
     *         action.</p>
     *         <p>
     *         You can subscribe email addresses to an Amazon SNS topic through the AWS Management Console, or by using
     *         the <a href="http://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html">Subscribe</a> AWS Simple
     *         Notification Service (SNS) API action.
     */

    public String getSnsTopicARN() {
        return this.snsTopicARN;
    }

    /**
     * <p>
     * The new SNS <code>TopicArn</code> that you want to associate with this job. You can create Amazon Resource Names
     * (ARNs) for topics by using the <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_CreateTopic.html">CreateTopic</a> Amazon SNS API action.
     * </p>
     * <p>
     * You can subscribe email addresses to an Amazon SNS topic through the AWS Management Console, or by using the <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html">Subscribe</a> AWS Simple Notification Service
     * (SNS) API action.
     * </p>
     * 
     * @param snsTopicARN
     *        The new SNS <code>TopicArn</code> that you want to associate with this job. You can create Amazon Resource
     *        Names (ARNs) for topics by using the <a
     *        href="http://docs.aws.amazon.com/sns/latest/api/API_CreateTopic.html">CreateTopic</a> Amazon SNS API
     *        action.</p>
     *        <p>
     *        You can subscribe email addresses to an Amazon SNS topic through the AWS Management Console, or by using
     *        the <a href="http://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html">Subscribe</a> AWS Simple
     *        Notification Service (SNS) API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Notification withSnsTopicARN(String snsTopicARN) {
        setSnsTopicARN(snsTopicARN);
        return this;
    }

    /**
     * <p>
     * The list of job states that will trigger a notification for this job.
     * </p>
     * 
     * @return The list of job states that will trigger a notification for this job.
     * @see JobState
     */

    public java.util.List<String> getJobStatesToNotify() {
        return jobStatesToNotify;
    }

    /**
     * <p>
     * The list of job states that will trigger a notification for this job.
     * </p>
     * 
     * @param jobStatesToNotify
     *        The list of job states that will trigger a notification for this job.
     * @see JobState
     */

    public void setJobStatesToNotify(java.util.Collection<String> jobStatesToNotify) {
        if (jobStatesToNotify == null) {
            this.jobStatesToNotify = null;
            return;
        }

        this.jobStatesToNotify = new java.util.ArrayList<String>(jobStatesToNotify);
    }

    /**
     * <p>
     * The list of job states that will trigger a notification for this job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobStatesToNotify(java.util.Collection)} or {@link #withJobStatesToNotify(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param jobStatesToNotify
     *        The list of job states that will trigger a notification for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobState
     */

    public Notification withJobStatesToNotify(String... jobStatesToNotify) {
        if (this.jobStatesToNotify == null) {
            setJobStatesToNotify(new java.util.ArrayList<String>(jobStatesToNotify.length));
        }
        for (String ele : jobStatesToNotify) {
            this.jobStatesToNotify.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of job states that will trigger a notification for this job.
     * </p>
     * 
     * @param jobStatesToNotify
     *        The list of job states that will trigger a notification for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobState
     */

    public Notification withJobStatesToNotify(java.util.Collection<String> jobStatesToNotify) {
        setJobStatesToNotify(jobStatesToNotify);
        return this;
    }

    /**
     * <p>
     * The list of job states that will trigger a notification for this job.
     * </p>
     * 
     * @param jobStatesToNotify
     *        The list of job states that will trigger a notification for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobState
     */

    public Notification withJobStatesToNotify(JobState... jobStatesToNotify) {
        java.util.ArrayList<String> jobStatesToNotifyCopy = new java.util.ArrayList<String>(jobStatesToNotify.length);
        for (JobState value : jobStatesToNotify) {
            jobStatesToNotifyCopy.add(value.toString());
        }
        if (getJobStatesToNotify() == null) {
            setJobStatesToNotify(jobStatesToNotifyCopy);
        } else {
            getJobStatesToNotify().addAll(jobStatesToNotifyCopy);
        }
        return this;
    }

    /**
     * <p>
     * Any change in job state will trigger a notification for this job.
     * </p>
     * 
     * @param notifyAll
     *        Any change in job state will trigger a notification for this job.
     */

    public void setNotifyAll(Boolean notifyAll) {
        this.notifyAll = notifyAll;
    }

    /**
     * <p>
     * Any change in job state will trigger a notification for this job.
     * </p>
     * 
     * @return Any change in job state will trigger a notification for this job.
     */

    public Boolean getNotifyAll() {
        return this.notifyAll;
    }

    /**
     * <p>
     * Any change in job state will trigger a notification for this job.
     * </p>
     * 
     * @param notifyAll
     *        Any change in job state will trigger a notification for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Notification withNotifyAll(Boolean notifyAll) {
        setNotifyAll(notifyAll);
        return this;
    }

    /**
     * <p>
     * Any change in job state will trigger a notification for this job.
     * </p>
     * 
     * @return Any change in job state will trigger a notification for this job.
     */

    public Boolean isNotifyAll() {
        return this.notifyAll;
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
        if (getSnsTopicARN() != null)
            sb.append("SnsTopicARN: ").append(getSnsTopicARN()).append(",");
        if (getJobStatesToNotify() != null)
            sb.append("JobStatesToNotify: ").append(getJobStatesToNotify()).append(",");
        if (getNotifyAll() != null)
            sb.append("NotifyAll: ").append(getNotifyAll());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Notification == false)
            return false;
        Notification other = (Notification) obj;
        if (other.getSnsTopicARN() == null ^ this.getSnsTopicARN() == null)
            return false;
        if (other.getSnsTopicARN() != null && other.getSnsTopicARN().equals(this.getSnsTopicARN()) == false)
            return false;
        if (other.getJobStatesToNotify() == null ^ this.getJobStatesToNotify() == null)
            return false;
        if (other.getJobStatesToNotify() != null && other.getJobStatesToNotify().equals(this.getJobStatesToNotify()) == false)
            return false;
        if (other.getNotifyAll() == null ^ this.getNotifyAll() == null)
            return false;
        if (other.getNotifyAll() != null && other.getNotifyAll().equals(this.getNotifyAll()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnsTopicARN() == null) ? 0 : getSnsTopicARN().hashCode());
        hashCode = prime * hashCode + ((getJobStatesToNotify() == null) ? 0 : getJobStatesToNotify().hashCode());
        hashCode = prime * hashCode + ((getNotifyAll() == null) ? 0 : getNotifyAll().hashCode());
        return hashCode;
    }

    @Override
    public Notification clone() {
        try {
            return (Notification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.NotificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

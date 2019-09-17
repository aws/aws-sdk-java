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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes information about the usage report subscription.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UsageReportSubscription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageReportSubscription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket where generated reports are stored.
     * </p>
     * <p>
     * If you enabled on-instance session scripts and Amazon S3 logging for your session script configuration, AppStream
     * 2.0 created an S3 bucket to store the script output. The bucket is unique to your account and Region. When you
     * enable usage reporting in this case, AppStream 2.0 uses the same bucket to store your usage reports. If you
     * haven't already enabled on-instance session scripts, when you enable usage reports, AppStream 2.0 creates a new
     * S3 bucket.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The schedule for generating usage reports.
     * </p>
     */
    private String schedule;
    /**
     * <p>
     * The time when the last usage report was generated.
     * </p>
     */
    private java.util.Date lastGeneratedReportDate;
    /**
     * <p>
     * The errors that were returned if usage reports couldn't be generated.
     * </p>
     */
    private java.util.List<LastReportGenerationExecutionError> subscriptionErrors;

    /**
     * <p>
     * The Amazon S3 bucket where generated reports are stored.
     * </p>
     * <p>
     * If you enabled on-instance session scripts and Amazon S3 logging for your session script configuration, AppStream
     * 2.0 created an S3 bucket to store the script output. The bucket is unique to your account and Region. When you
     * enable usage reporting in this case, AppStream 2.0 uses the same bucket to store your usage reports. If you
     * haven't already enabled on-instance session scripts, when you enable usage reports, AppStream 2.0 creates a new
     * S3 bucket.
     * </p>
     * 
     * @param s3BucketName
     *        The Amazon S3 bucket where generated reports are stored.</p>
     *        <p>
     *        If you enabled on-instance session scripts and Amazon S3 logging for your session script configuration,
     *        AppStream 2.0 created an S3 bucket to store the script output. The bucket is unique to your account and
     *        Region. When you enable usage reporting in this case, AppStream 2.0 uses the same bucket to store your
     *        usage reports. If you haven't already enabled on-instance session scripts, when you enable usage reports,
     *        AppStream 2.0 creates a new S3 bucket.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The Amazon S3 bucket where generated reports are stored.
     * </p>
     * <p>
     * If you enabled on-instance session scripts and Amazon S3 logging for your session script configuration, AppStream
     * 2.0 created an S3 bucket to store the script output. The bucket is unique to your account and Region. When you
     * enable usage reporting in this case, AppStream 2.0 uses the same bucket to store your usage reports. If you
     * haven't already enabled on-instance session scripts, when you enable usage reports, AppStream 2.0 creates a new
     * S3 bucket.
     * </p>
     * 
     * @return The Amazon S3 bucket where generated reports are stored.</p>
     *         <p>
     *         If you enabled on-instance session scripts and Amazon S3 logging for your session script configuration,
     *         AppStream 2.0 created an S3 bucket to store the script output. The bucket is unique to your account and
     *         Region. When you enable usage reporting in this case, AppStream 2.0 uses the same bucket to store your
     *         usage reports. If you haven't already enabled on-instance session scripts, when you enable usage reports,
     *         AppStream 2.0 creates a new S3 bucket.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The Amazon S3 bucket where generated reports are stored.
     * </p>
     * <p>
     * If you enabled on-instance session scripts and Amazon S3 logging for your session script configuration, AppStream
     * 2.0 created an S3 bucket to store the script output. The bucket is unique to your account and Region. When you
     * enable usage reporting in this case, AppStream 2.0 uses the same bucket to store your usage reports. If you
     * haven't already enabled on-instance session scripts, when you enable usage reports, AppStream 2.0 creates a new
     * S3 bucket.
     * </p>
     * 
     * @param s3BucketName
     *        The Amazon S3 bucket where generated reports are stored.</p>
     *        <p>
     *        If you enabled on-instance session scripts and Amazon S3 logging for your session script configuration,
     *        AppStream 2.0 created an S3 bucket to store the script output. The bucket is unique to your account and
     *        Region. When you enable usage reporting in this case, AppStream 2.0 uses the same bucket to store your
     *        usage reports. If you haven't already enabled on-instance session scripts, when you enable usage reports,
     *        AppStream 2.0 creates a new S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageReportSubscription withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The schedule for generating usage reports.
     * </p>
     * 
     * @param schedule
     *        The schedule for generating usage reports.
     * @see UsageReportSchedule
     */

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule for generating usage reports.
     * </p>
     * 
     * @return The schedule for generating usage reports.
     * @see UsageReportSchedule
     */

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule for generating usage reports.
     * </p>
     * 
     * @param schedule
     *        The schedule for generating usage reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageReportSchedule
     */

    public UsageReportSubscription withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The schedule for generating usage reports.
     * </p>
     * 
     * @param schedule
     *        The schedule for generating usage reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageReportSchedule
     */

    public UsageReportSubscription withSchedule(UsageReportSchedule schedule) {
        this.schedule = schedule.toString();
        return this;
    }

    /**
     * <p>
     * The time when the last usage report was generated.
     * </p>
     * 
     * @param lastGeneratedReportDate
     *        The time when the last usage report was generated.
     */

    public void setLastGeneratedReportDate(java.util.Date lastGeneratedReportDate) {
        this.lastGeneratedReportDate = lastGeneratedReportDate;
    }

    /**
     * <p>
     * The time when the last usage report was generated.
     * </p>
     * 
     * @return The time when the last usage report was generated.
     */

    public java.util.Date getLastGeneratedReportDate() {
        return this.lastGeneratedReportDate;
    }

    /**
     * <p>
     * The time when the last usage report was generated.
     * </p>
     * 
     * @param lastGeneratedReportDate
     *        The time when the last usage report was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageReportSubscription withLastGeneratedReportDate(java.util.Date lastGeneratedReportDate) {
        setLastGeneratedReportDate(lastGeneratedReportDate);
        return this;
    }

    /**
     * <p>
     * The errors that were returned if usage reports couldn't be generated.
     * </p>
     * 
     * @return The errors that were returned if usage reports couldn't be generated.
     */

    public java.util.List<LastReportGenerationExecutionError> getSubscriptionErrors() {
        return subscriptionErrors;
    }

    /**
     * <p>
     * The errors that were returned if usage reports couldn't be generated.
     * </p>
     * 
     * @param subscriptionErrors
     *        The errors that were returned if usage reports couldn't be generated.
     */

    public void setSubscriptionErrors(java.util.Collection<LastReportGenerationExecutionError> subscriptionErrors) {
        if (subscriptionErrors == null) {
            this.subscriptionErrors = null;
            return;
        }

        this.subscriptionErrors = new java.util.ArrayList<LastReportGenerationExecutionError>(subscriptionErrors);
    }

    /**
     * <p>
     * The errors that were returned if usage reports couldn't be generated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscriptionErrors(java.util.Collection)} or {@link #withSubscriptionErrors(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param subscriptionErrors
     *        The errors that were returned if usage reports couldn't be generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageReportSubscription withSubscriptionErrors(LastReportGenerationExecutionError... subscriptionErrors) {
        if (this.subscriptionErrors == null) {
            setSubscriptionErrors(new java.util.ArrayList<LastReportGenerationExecutionError>(subscriptionErrors.length));
        }
        for (LastReportGenerationExecutionError ele : subscriptionErrors) {
            this.subscriptionErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The errors that were returned if usage reports couldn't be generated.
     * </p>
     * 
     * @param subscriptionErrors
     *        The errors that were returned if usage reports couldn't be generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageReportSubscription withSubscriptionErrors(java.util.Collection<LastReportGenerationExecutionError> subscriptionErrors) {
        setSubscriptionErrors(subscriptionErrors);
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
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getLastGeneratedReportDate() != null)
            sb.append("LastGeneratedReportDate: ").append(getLastGeneratedReportDate()).append(",");
        if (getSubscriptionErrors() != null)
            sb.append("SubscriptionErrors: ").append(getSubscriptionErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageReportSubscription == false)
            return false;
        UsageReportSubscription other = (UsageReportSubscription) obj;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getLastGeneratedReportDate() == null ^ this.getLastGeneratedReportDate() == null)
            return false;
        if (other.getLastGeneratedReportDate() != null && other.getLastGeneratedReportDate().equals(this.getLastGeneratedReportDate()) == false)
            return false;
        if (other.getSubscriptionErrors() == null ^ this.getSubscriptionErrors() == null)
            return false;
        if (other.getSubscriptionErrors() != null && other.getSubscriptionErrors().equals(this.getSubscriptionErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getLastGeneratedReportDate() == null) ? 0 : getLastGeneratedReportDate().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionErrors() == null) ? 0 : getSubscriptionErrors().hashCode());
        return hashCode;
    }

    @Override
    public UsageReportSubscription clone() {
        try {
            return (UsageReportSubscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.UsageReportSubscriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

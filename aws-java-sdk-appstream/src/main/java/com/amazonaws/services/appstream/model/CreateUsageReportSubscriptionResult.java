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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateUsageReportSubscription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUsageReportSubscriptionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

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

    public CreateUsageReportSubscriptionResult withS3BucketName(String s3BucketName) {
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

    public CreateUsageReportSubscriptionResult withSchedule(String schedule) {
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

    public CreateUsageReportSubscriptionResult withSchedule(UsageReportSchedule schedule) {
        this.schedule = schedule.toString();
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
            sb.append("Schedule: ").append(getSchedule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUsageReportSubscriptionResult == false)
            return false;
        CreateUsageReportSubscriptionResult other = (CreateUsageReportSubscriptionResult) obj;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        return hashCode;
    }

    @Override
    public CreateUsageReportSubscriptionResult clone() {
        try {
            return (CreateUsageReportSubscriptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

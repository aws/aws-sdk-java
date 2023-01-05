/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information from your report plan about where to deliver your reports, specifically your Amazon S3 bucket
 * name, S3 key prefix, and the formats of your reports.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ReportDeliveryChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportDeliveryChannel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique name of the S3 bucket that receives your reports.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The prefix for where Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the
     * following path: s3://your-bucket-name/<code>prefix</code>/Backup/us-west-2/year/month/day/report-name. If not
     * specified, there is no prefix.
     * </p>
     */
    private String s3KeyPrefix;
    /**
     * <p>
     * A list of the format of your reports: <code>CSV</code>, <code>JSON</code>, or both. If not specified, the default
     * format is <code>CSV</code>.
     * </p>
     */
    private java.util.List<String> formats;

    /**
     * <p>
     * The unique name of the S3 bucket that receives your reports.
     * </p>
     * 
     * @param s3BucketName
     *        The unique name of the S3 bucket that receives your reports.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The unique name of the S3 bucket that receives your reports.
     * </p>
     * 
     * @return The unique name of the S3 bucket that receives your reports.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The unique name of the S3 bucket that receives your reports.
     * </p>
     * 
     * @param s3BucketName
     *        The unique name of the S3 bucket that receives your reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDeliveryChannel withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The prefix for where Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the
     * following path: s3://your-bucket-name/<code>prefix</code>/Backup/us-west-2/year/month/day/report-name. If not
     * specified, there is no prefix.
     * </p>
     * 
     * @param s3KeyPrefix
     *        The prefix for where Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of
     *        the following path: s3://your-bucket-name/<code>prefix</code>/Backup/us-west-2/year/month/day/report-name.
     *        If not specified, there is no prefix.
     */

    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * The prefix for where Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the
     * following path: s3://your-bucket-name/<code>prefix</code>/Backup/us-west-2/year/month/day/report-name. If not
     * specified, there is no prefix.
     * </p>
     * 
     * @return The prefix for where Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of
     *         the following path: s3://your-bucket-name/<code>prefix</code>
     *         /Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
     */

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    /**
     * <p>
     * The prefix for where Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the
     * following path: s3://your-bucket-name/<code>prefix</code>/Backup/us-west-2/year/month/day/report-name. If not
     * specified, there is no prefix.
     * </p>
     * 
     * @param s3KeyPrefix
     *        The prefix for where Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of
     *        the following path: s3://your-bucket-name/<code>prefix</code>/Backup/us-west-2/year/month/day/report-name.
     *        If not specified, there is no prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDeliveryChannel withS3KeyPrefix(String s3KeyPrefix) {
        setS3KeyPrefix(s3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * A list of the format of your reports: <code>CSV</code>, <code>JSON</code>, or both. If not specified, the default
     * format is <code>CSV</code>.
     * </p>
     * 
     * @return A list of the format of your reports: <code>CSV</code>, <code>JSON</code>, or both. If not specified, the
     *         default format is <code>CSV</code>.
     */

    public java.util.List<String> getFormats() {
        return formats;
    }

    /**
     * <p>
     * A list of the format of your reports: <code>CSV</code>, <code>JSON</code>, or both. If not specified, the default
     * format is <code>CSV</code>.
     * </p>
     * 
     * @param formats
     *        A list of the format of your reports: <code>CSV</code>, <code>JSON</code>, or both. If not specified, the
     *        default format is <code>CSV</code>.
     */

    public void setFormats(java.util.Collection<String> formats) {
        if (formats == null) {
            this.formats = null;
            return;
        }

        this.formats = new java.util.ArrayList<String>(formats);
    }

    /**
     * <p>
     * A list of the format of your reports: <code>CSV</code>, <code>JSON</code>, or both. If not specified, the default
     * format is <code>CSV</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFormats(java.util.Collection)} or {@link #withFormats(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param formats
     *        A list of the format of your reports: <code>CSV</code>, <code>JSON</code>, or both. If not specified, the
     *        default format is <code>CSV</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDeliveryChannel withFormats(String... formats) {
        if (this.formats == null) {
            setFormats(new java.util.ArrayList<String>(formats.length));
        }
        for (String ele : formats) {
            this.formats.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the format of your reports: <code>CSV</code>, <code>JSON</code>, or both. If not specified, the default
     * format is <code>CSV</code>.
     * </p>
     * 
     * @param formats
     *        A list of the format of your reports: <code>CSV</code>, <code>JSON</code>, or both. If not specified, the
     *        default format is <code>CSV</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDeliveryChannel withFormats(java.util.Collection<String> formats) {
        setFormats(formats);
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
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: ").append(getS3KeyPrefix()).append(",");
        if (getFormats() != null)
            sb.append("Formats: ").append(getFormats());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportDeliveryChannel == false)
            return false;
        ReportDeliveryChannel other = (ReportDeliveryChannel) obj;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        if (other.getFormats() == null ^ this.getFormats() == null)
            return false;
        if (other.getFormats() != null && other.getFormats().equals(this.getFormats()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getFormats() == null) ? 0 : getFormats().hashCode());
        return hashCode;
    }

    @Override
    public ReportDeliveryChannel clone() {
        try {
            return (ReportDeliveryChannel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.ReportDeliveryChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

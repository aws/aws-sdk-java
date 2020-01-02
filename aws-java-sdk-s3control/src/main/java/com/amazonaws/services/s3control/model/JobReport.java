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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the configuration parameters for a job-completion report.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/JobReport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobReport implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The format of the specified job-completion report.
     * </p>
     */
    private String format;
    /**
     * <p>
     * Indicates whether the specified job will generate a job-completion report.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * An optional prefix to describe where in the specified bucket the job-completion report will be stored. Amazon S3
     * will store the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * Indicates whether the job-completion report will include details of all tasks or only failed tasks.
     * </p>
     */
    private String reportScope;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.
     * </p>
     * 
     * @param bucket
     *        The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.
     * </p>
     * 
     * @param bucket
     *        The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobReport withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The format of the specified job-completion report.
     * </p>
     * 
     * @param format
     *        The format of the specified job-completion report.
     * @see JobReportFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the specified job-completion report.
     * </p>
     * 
     * @return The format of the specified job-completion report.
     * @see JobReportFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the specified job-completion report.
     * </p>
     * 
     * @param format
     *        The format of the specified job-completion report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobReportFormat
     */

    public JobReport withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the specified job-completion report.
     * </p>
     * 
     * @param format
     *        The format of the specified job-completion report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobReportFormat
     */

    public JobReport withFormat(JobReportFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the specified job will generate a job-completion report.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the specified job will generate a job-completion report.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether the specified job will generate a job-completion report.
     * </p>
     * 
     * @return Indicates whether the specified job will generate a job-completion report.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether the specified job will generate a job-completion report.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the specified job will generate a job-completion report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobReport withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the specified job will generate a job-completion report.
     * </p>
     * 
     * @return Indicates whether the specified job will generate a job-completion report.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * An optional prefix to describe where in the specified bucket the job-completion report will be stored. Amazon S3
     * will store the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.
     * </p>
     * 
     * @param prefix
     *        An optional prefix to describe where in the specified bucket the job-completion report will be stored.
     *        Amazon S3 will store the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * An optional prefix to describe where in the specified bucket the job-completion report will be stored. Amazon S3
     * will store the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.
     * </p>
     * 
     * @return An optional prefix to describe where in the specified bucket the job-completion report will be stored.
     *         Amazon S3 will store the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * An optional prefix to describe where in the specified bucket the job-completion report will be stored. Amazon S3
     * will store the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.
     * </p>
     * 
     * @param prefix
     *        An optional prefix to describe where in the specified bucket the job-completion report will be stored.
     *        Amazon S3 will store the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobReport withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * Indicates whether the job-completion report will include details of all tasks or only failed tasks.
     * </p>
     * 
     * @param reportScope
     *        Indicates whether the job-completion report will include details of all tasks or only failed tasks.
     * @see JobReportScope
     */

    public void setReportScope(String reportScope) {
        this.reportScope = reportScope;
    }

    /**
     * <p>
     * Indicates whether the job-completion report will include details of all tasks or only failed tasks.
     * </p>
     * 
     * @return Indicates whether the job-completion report will include details of all tasks or only failed tasks.
     * @see JobReportScope
     */

    public String getReportScope() {
        return this.reportScope;
    }

    /**
     * <p>
     * Indicates whether the job-completion report will include details of all tasks or only failed tasks.
     * </p>
     * 
     * @param reportScope
     *        Indicates whether the job-completion report will include details of all tasks or only failed tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobReportScope
     */

    public JobReport withReportScope(String reportScope) {
        setReportScope(reportScope);
        return this;
    }

    /**
     * <p>
     * Indicates whether the job-completion report will include details of all tasks or only failed tasks.
     * </p>
     * 
     * @param reportScope
     *        Indicates whether the job-completion report will include details of all tasks or only failed tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobReportScope
     */

    public JobReport withReportScope(JobReportScope reportScope) {
        this.reportScope = reportScope.toString();
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getReportScope() != null)
            sb.append("ReportScope: ").append(getReportScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobReport == false)
            return false;
        JobReport other = (JobReport) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getReportScope() == null ^ this.getReportScope() == null)
            return false;
        if (other.getReportScope() != null && other.getReportScope().equals(this.getReportScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getReportScope() == null) ? 0 : getReportScope().hashCode());
        return hashCode;
    }

    @Override
    public JobReport clone() {
        try {
            return (JobReport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

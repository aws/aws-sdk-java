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
 * Contains job logs. Whenever Snowball is used to import data into or export data out of Amazon S3, you'll have the
 * option of downloading a PDF job report. Job logs are returned as a part of the response syntax of the
 * <code>DescribeJob</code> action in the <code>JobMetadata</code> data type. The job logs can be accessed for up to 60
 * minutes after this request has been made. To access any of the job logs after 60 minutes have passed, you'll have to
 * make another call to the <code>DescribeJob</code> action.
 * </p>
 * <p>
 * For import jobs, the PDF job report becomes available at the end of the import process. For export jobs, your job
 * report typically becomes available while the Snowball for your job part is being delivered to you.
 * </p>
 * <p>
 * The job report provides you insight into the state of your Amazon S3 data transfer. The report includes details about
 * your job or job part for your records.
 * </p>
 * <p>
 * For deeper visibility into the status of your transferred objects, you can look at the two associated logs: a success
 * log and a failure log. The logs are saved in comma-separated value (CSV) format, and the name of each log includes
 * the ID of the job or job part that the log describes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/JobLogs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobLogs implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A link to an Amazon S3 presigned URL where the job completion report is located.
     * </p>
     */
    private String jobCompletionReportURI;
    /**
     * <p>
     * A link to an Amazon S3 presigned URL where the job success log is located.
     * </p>
     */
    private String jobSuccessLogURI;
    /**
     * <p>
     * A link to an Amazon S3 presigned URL where the job failure log is located.
     * </p>
     */
    private String jobFailureLogURI;

    /**
     * <p>
     * A link to an Amazon S3 presigned URL where the job completion report is located.
     * </p>
     * 
     * @param jobCompletionReportURI
     *        A link to an Amazon S3 presigned URL where the job completion report is located.
     */

    public void setJobCompletionReportURI(String jobCompletionReportURI) {
        this.jobCompletionReportURI = jobCompletionReportURI;
    }

    /**
     * <p>
     * A link to an Amazon S3 presigned URL where the job completion report is located.
     * </p>
     * 
     * @return A link to an Amazon S3 presigned URL where the job completion report is located.
     */

    public String getJobCompletionReportURI() {
        return this.jobCompletionReportURI;
    }

    /**
     * <p>
     * A link to an Amazon S3 presigned URL where the job completion report is located.
     * </p>
     * 
     * @param jobCompletionReportURI
     *        A link to an Amazon S3 presigned URL where the job completion report is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobLogs withJobCompletionReportURI(String jobCompletionReportURI) {
        setJobCompletionReportURI(jobCompletionReportURI);
        return this;
    }

    /**
     * <p>
     * A link to an Amazon S3 presigned URL where the job success log is located.
     * </p>
     * 
     * @param jobSuccessLogURI
     *        A link to an Amazon S3 presigned URL where the job success log is located.
     */

    public void setJobSuccessLogURI(String jobSuccessLogURI) {
        this.jobSuccessLogURI = jobSuccessLogURI;
    }

    /**
     * <p>
     * A link to an Amazon S3 presigned URL where the job success log is located.
     * </p>
     * 
     * @return A link to an Amazon S3 presigned URL where the job success log is located.
     */

    public String getJobSuccessLogURI() {
        return this.jobSuccessLogURI;
    }

    /**
     * <p>
     * A link to an Amazon S3 presigned URL where the job success log is located.
     * </p>
     * 
     * @param jobSuccessLogURI
     *        A link to an Amazon S3 presigned URL where the job success log is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobLogs withJobSuccessLogURI(String jobSuccessLogURI) {
        setJobSuccessLogURI(jobSuccessLogURI);
        return this;
    }

    /**
     * <p>
     * A link to an Amazon S3 presigned URL where the job failure log is located.
     * </p>
     * 
     * @param jobFailureLogURI
     *        A link to an Amazon S3 presigned URL where the job failure log is located.
     */

    public void setJobFailureLogURI(String jobFailureLogURI) {
        this.jobFailureLogURI = jobFailureLogURI;
    }

    /**
     * <p>
     * A link to an Amazon S3 presigned URL where the job failure log is located.
     * </p>
     * 
     * @return A link to an Amazon S3 presigned URL where the job failure log is located.
     */

    public String getJobFailureLogURI() {
        return this.jobFailureLogURI;
    }

    /**
     * <p>
     * A link to an Amazon S3 presigned URL where the job failure log is located.
     * </p>
     * 
     * @param jobFailureLogURI
     *        A link to an Amazon S3 presigned URL where the job failure log is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobLogs withJobFailureLogURI(String jobFailureLogURI) {
        setJobFailureLogURI(jobFailureLogURI);
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
        if (getJobCompletionReportURI() != null)
            sb.append("JobCompletionReportURI: ").append(getJobCompletionReportURI()).append(",");
        if (getJobSuccessLogURI() != null)
            sb.append("JobSuccessLogURI: ").append(getJobSuccessLogURI()).append(",");
        if (getJobFailureLogURI() != null)
            sb.append("JobFailureLogURI: ").append(getJobFailureLogURI());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobLogs == false)
            return false;
        JobLogs other = (JobLogs) obj;
        if (other.getJobCompletionReportURI() == null ^ this.getJobCompletionReportURI() == null)
            return false;
        if (other.getJobCompletionReportURI() != null && other.getJobCompletionReportURI().equals(this.getJobCompletionReportURI()) == false)
            return false;
        if (other.getJobSuccessLogURI() == null ^ this.getJobSuccessLogURI() == null)
            return false;
        if (other.getJobSuccessLogURI() != null && other.getJobSuccessLogURI().equals(this.getJobSuccessLogURI()) == false)
            return false;
        if (other.getJobFailureLogURI() == null ^ this.getJobFailureLogURI() == null)
            return false;
        if (other.getJobFailureLogURI() != null && other.getJobFailureLogURI().equals(this.getJobFailureLogURI()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobCompletionReportURI() == null) ? 0 : getJobCompletionReportURI().hashCode());
        hashCode = prime * hashCode + ((getJobSuccessLogURI() == null) ? 0 : getJobSuccessLogURI().hashCode());
        hashCode = prime * hashCode + ((getJobFailureLogURI() == null) ? 0 : getJobFailureLogURI().hashCode());
        return hashCode;
    }

    @Override
    public JobLogs clone() {
        try {
            return (JobLogs) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.JobLogsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

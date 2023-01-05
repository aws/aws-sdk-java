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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains detailed information about a recommendation report.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/RecommendationReportDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationReportDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time that the recommendation report generation task completes.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * The S3 bucket where the report file is located.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The Amazon S3 key name of the report file.
     * </p>
     */
    private java.util.List<String> s3Keys;
    /**
     * <p>
     * The time that the recommendation report generation task starts.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The status of the recommendation report generation task.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message for recommendation report generation.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The time that the recommendation report generation task completes.
     * </p>
     * 
     * @param completionTime
     *        The time that the recommendation report generation task completes.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * The time that the recommendation report generation task completes.
     * </p>
     * 
     * @return The time that the recommendation report generation task completes.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * The time that the recommendation report generation task completes.
     * </p>
     * 
     * @param completionTime
     *        The time that the recommendation report generation task completes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationReportDetails withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * The S3 bucket where the report file is located.
     * </p>
     * 
     * @param s3Bucket
     *        The S3 bucket where the report file is located.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket where the report file is located.
     * </p>
     * 
     * @return The S3 bucket where the report file is located.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket where the report file is located.
     * </p>
     * 
     * @param s3Bucket
     *        The S3 bucket where the report file is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationReportDetails withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 key name of the report file.
     * </p>
     * 
     * @return The Amazon S3 key name of the report file.
     */

    public java.util.List<String> getS3Keys() {
        return s3Keys;
    }

    /**
     * <p>
     * The Amazon S3 key name of the report file.
     * </p>
     * 
     * @param s3Keys
     *        The Amazon S3 key name of the report file.
     */

    public void setS3Keys(java.util.Collection<String> s3Keys) {
        if (s3Keys == null) {
            this.s3Keys = null;
            return;
        }

        this.s3Keys = new java.util.ArrayList<String>(s3Keys);
    }

    /**
     * <p>
     * The Amazon S3 key name of the report file.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3Keys(java.util.Collection)} or {@link #withS3Keys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param s3Keys
     *        The Amazon S3 key name of the report file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationReportDetails withS3Keys(String... s3Keys) {
        if (this.s3Keys == null) {
            setS3Keys(new java.util.ArrayList<String>(s3Keys.length));
        }
        for (String ele : s3Keys) {
            this.s3Keys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon S3 key name of the report file.
     * </p>
     * 
     * @param s3Keys
     *        The Amazon S3 key name of the report file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationReportDetails withS3Keys(java.util.Collection<String> s3Keys) {
        setS3Keys(s3Keys);
        return this;
    }

    /**
     * <p>
     * The time that the recommendation report generation task starts.
     * </p>
     * 
     * @param startTime
     *        The time that the recommendation report generation task starts.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time that the recommendation report generation task starts.
     * </p>
     * 
     * @return The time that the recommendation report generation task starts.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time that the recommendation report generation task starts.
     * </p>
     * 
     * @param startTime
     *        The time that the recommendation report generation task starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationReportDetails withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The status of the recommendation report generation task.
     * </p>
     * 
     * @param status
     *        The status of the recommendation report generation task.
     * @see RecommendationReportStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the recommendation report generation task.
     * </p>
     * 
     * @return The status of the recommendation report generation task.
     * @see RecommendationReportStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the recommendation report generation task.
     * </p>
     * 
     * @param status
     *        The status of the recommendation report generation task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationReportStatus
     */

    public RecommendationReportDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the recommendation report generation task.
     * </p>
     * 
     * @param status
     *        The status of the recommendation report generation task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationReportStatus
     */

    public RecommendationReportDetails withStatus(RecommendationReportStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message for recommendation report generation.
     * </p>
     * 
     * @param statusMessage
     *        The status message for recommendation report generation.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for recommendation report generation.
     * </p>
     * 
     * @return The status message for recommendation report generation.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for recommendation report generation.
     * </p>
     * 
     * @param statusMessage
     *        The status message for recommendation report generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationReportDetails withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3Keys() != null)
            sb.append("S3Keys: ").append(getS3Keys()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationReportDetails == false)
            return false;
        RecommendationReportDetails other = (RecommendationReportDetails) obj;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Keys() == null ^ this.getS3Keys() == null)
            return false;
        if (other.getS3Keys() != null && other.getS3Keys().equals(this.getS3Keys()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Keys() == null) ? 0 : getS3Keys().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationReportDetails clone() {
        try {
            return (RecommendationReportDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.RecommendationReportDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the job template. We recommend using a UUID. Alpha-numeric characters, "-", and "_" are
     * valid for use here.
     * </p>
     */
    private String jobTemplateId;
    /**
     * <p>
     * The ARN of the job to use as the basis for the job template.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * An S3 link to the job document to use in the template. Required if you don't specify a value for
     * <code>document</code>.
     * </p>
     * <note>
     * <p>
     * If the job document resides in an S3 bucket, you must use a placeholder link when specifying the document.
     * </p>
     * <p>
     * The placeholder link is of the following form:
     * </p>
     * <p>
     * <code>${aws:iot:s3-presigned-url:https://s3.amazonaws.com/<i>bucket</i>/<i>key</i>}</code>
     * </p>
     * <p>
     * where <i>bucket</i> is your bucket name and <i>key</i> is the object in the bucket to which you are linking.
     * </p>
     * </note>
     */
    private String documentSource;
    /**
     * <p>
     * The job document. Required if you don't specify a value for <code>documentSource</code>.
     * </p>
     */
    private String document;
    /**
     * <p>
     * A description of the job document.
     * </p>
     */
    private String description;

    private PresignedUrlConfig presignedUrlConfig;

    private JobExecutionsRolloutConfig jobExecutionsRolloutConfig;

    private AbortConfig abortConfig;

    private TimeoutConfig timeoutConfig;
    /**
     * <p>
     * Metadata that can be used to manage the job template.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique identifier for the job template. We recommend using a UUID. Alpha-numeric characters, "-", and "_" are
     * valid for use here.
     * </p>
     * 
     * @param jobTemplateId
     *        A unique identifier for the job template. We recommend using a UUID. Alpha-numeric characters, "-", and
     *        "_" are valid for use here.
     */

    public void setJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
    }

    /**
     * <p>
     * A unique identifier for the job template. We recommend using a UUID. Alpha-numeric characters, "-", and "_" are
     * valid for use here.
     * </p>
     * 
     * @return A unique identifier for the job template. We recommend using a UUID. Alpha-numeric characters, "-", and
     *         "_" are valid for use here.
     */

    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

    /**
     * <p>
     * A unique identifier for the job template. We recommend using a UUID. Alpha-numeric characters, "-", and "_" are
     * valid for use here.
     * </p>
     * 
     * @param jobTemplateId
     *        A unique identifier for the job template. We recommend using a UUID. Alpha-numeric characters, "-", and
     *        "_" are valid for use here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withJobTemplateId(String jobTemplateId) {
        setJobTemplateId(jobTemplateId);
        return this;
    }

    /**
     * <p>
     * The ARN of the job to use as the basis for the job template.
     * </p>
     * 
     * @param jobArn
     *        The ARN of the job to use as the basis for the job template.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The ARN of the job to use as the basis for the job template.
     * </p>
     * 
     * @return The ARN of the job to use as the basis for the job template.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The ARN of the job to use as the basis for the job template.
     * </p>
     * 
     * @param jobArn
     *        The ARN of the job to use as the basis for the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * An S3 link to the job document to use in the template. Required if you don't specify a value for
     * <code>document</code>.
     * </p>
     * <note>
     * <p>
     * If the job document resides in an S3 bucket, you must use a placeholder link when specifying the document.
     * </p>
     * <p>
     * The placeholder link is of the following form:
     * </p>
     * <p>
     * <code>${aws:iot:s3-presigned-url:https://s3.amazonaws.com/<i>bucket</i>/<i>key</i>}</code>
     * </p>
     * <p>
     * where <i>bucket</i> is your bucket name and <i>key</i> is the object in the bucket to which you are linking.
     * </p>
     * </note>
     * 
     * @param documentSource
     *        An S3 link to the job document to use in the template. Required if you don't specify a value for
     *        <code>document</code>.</p> <note>
     *        <p>
     *        If the job document resides in an S3 bucket, you must use a placeholder link when specifying the document.
     *        </p>
     *        <p>
     *        The placeholder link is of the following form:
     *        </p>
     *        <p>
     *        <code>${aws:iot:s3-presigned-url:https://s3.amazonaws.com/<i>bucket</i>/<i>key</i>}</code>
     *        </p>
     *        <p>
     *        where <i>bucket</i> is your bucket name and <i>key</i> is the object in the bucket to which you are
     *        linking.
     *        </p>
     */

    public void setDocumentSource(String documentSource) {
        this.documentSource = documentSource;
    }

    /**
     * <p>
     * An S3 link to the job document to use in the template. Required if you don't specify a value for
     * <code>document</code>.
     * </p>
     * <note>
     * <p>
     * If the job document resides in an S3 bucket, you must use a placeholder link when specifying the document.
     * </p>
     * <p>
     * The placeholder link is of the following form:
     * </p>
     * <p>
     * <code>${aws:iot:s3-presigned-url:https://s3.amazonaws.com/<i>bucket</i>/<i>key</i>}</code>
     * </p>
     * <p>
     * where <i>bucket</i> is your bucket name and <i>key</i> is the object in the bucket to which you are linking.
     * </p>
     * </note>
     * 
     * @return An S3 link to the job document to use in the template. Required if you don't specify a value for
     *         <code>document</code>.</p> <note>
     *         <p>
     *         If the job document resides in an S3 bucket, you must use a placeholder link when specifying the
     *         document.
     *         </p>
     *         <p>
     *         The placeholder link is of the following form:
     *         </p>
     *         <p>
     *         <code>${aws:iot:s3-presigned-url:https://s3.amazonaws.com/<i>bucket</i>/<i>key</i>}</code>
     *         </p>
     *         <p>
     *         where <i>bucket</i> is your bucket name and <i>key</i> is the object in the bucket to which you are
     *         linking.
     *         </p>
     */

    public String getDocumentSource() {
        return this.documentSource;
    }

    /**
     * <p>
     * An S3 link to the job document to use in the template. Required if you don't specify a value for
     * <code>document</code>.
     * </p>
     * <note>
     * <p>
     * If the job document resides in an S3 bucket, you must use a placeholder link when specifying the document.
     * </p>
     * <p>
     * The placeholder link is of the following form:
     * </p>
     * <p>
     * <code>${aws:iot:s3-presigned-url:https://s3.amazonaws.com/<i>bucket</i>/<i>key</i>}</code>
     * </p>
     * <p>
     * where <i>bucket</i> is your bucket name and <i>key</i> is the object in the bucket to which you are linking.
     * </p>
     * </note>
     * 
     * @param documentSource
     *        An S3 link to the job document to use in the template. Required if you don't specify a value for
     *        <code>document</code>.</p> <note>
     *        <p>
     *        If the job document resides in an S3 bucket, you must use a placeholder link when specifying the document.
     *        </p>
     *        <p>
     *        The placeholder link is of the following form:
     *        </p>
     *        <p>
     *        <code>${aws:iot:s3-presigned-url:https://s3.amazonaws.com/<i>bucket</i>/<i>key</i>}</code>
     *        </p>
     *        <p>
     *        where <i>bucket</i> is your bucket name and <i>key</i> is the object in the bucket to which you are
     *        linking.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withDocumentSource(String documentSource) {
        setDocumentSource(documentSource);
        return this;
    }

    /**
     * <p>
     * The job document. Required if you don't specify a value for <code>documentSource</code>.
     * </p>
     * 
     * @param document
     *        The job document. Required if you don't specify a value for <code>documentSource</code>.
     */

    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The job document. Required if you don't specify a value for <code>documentSource</code>.
     * </p>
     * 
     * @return The job document. Required if you don't specify a value for <code>documentSource</code>.
     */

    public String getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The job document. Required if you don't specify a value for <code>documentSource</code>.
     * </p>
     * 
     * @param document
     *        The job document. Required if you don't specify a value for <code>documentSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withDocument(String document) {
        setDocument(document);
        return this;
    }

    /**
     * <p>
     * A description of the job document.
     * </p>
     * 
     * @param description
     *        A description of the job document.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the job document.
     * </p>
     * 
     * @return A description of the job document.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the job document.
     * </p>
     * 
     * @param description
     *        A description of the job document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param presignedUrlConfig
     */

    public void setPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        this.presignedUrlConfig = presignedUrlConfig;
    }

    /**
     * @return
     */

    public PresignedUrlConfig getPresignedUrlConfig() {
        return this.presignedUrlConfig;
    }

    /**
     * @param presignedUrlConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        setPresignedUrlConfig(presignedUrlConfig);
        return this;
    }

    /**
     * @param jobExecutionsRolloutConfig
     */

    public void setJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
    }

    /**
     * @return
     */

    public JobExecutionsRolloutConfig getJobExecutionsRolloutConfig() {
        return this.jobExecutionsRolloutConfig;
    }

    /**
     * @param jobExecutionsRolloutConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        setJobExecutionsRolloutConfig(jobExecutionsRolloutConfig);
        return this;
    }

    /**
     * @param abortConfig
     */

    public void setAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
    }

    /**
     * @return
     */

    public AbortConfig getAbortConfig() {
        return this.abortConfig;
    }

    /**
     * @param abortConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withAbortConfig(AbortConfig abortConfig) {
        setAbortConfig(abortConfig);
        return this;
    }

    /**
     * @param timeoutConfig
     */

    public void setTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
    }

    /**
     * @return
     */

    public TimeoutConfig getTimeoutConfig() {
        return this.timeoutConfig;
    }

    /**
     * @param timeoutConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withTimeoutConfig(TimeoutConfig timeoutConfig) {
        setTimeoutConfig(timeoutConfig);
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the job template.
     * </p>
     * 
     * @return Metadata that can be used to manage the job template.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the job template.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the job template.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata that can be used to manage the job template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the job template.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getJobTemplateId() != null)
            sb.append("JobTemplateId: ").append(getJobTemplateId()).append(",");
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getDocumentSource() != null)
            sb.append("DocumentSource: ").append(getDocumentSource()).append(",");
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPresignedUrlConfig() != null)
            sb.append("PresignedUrlConfig: ").append(getPresignedUrlConfig()).append(",");
        if (getJobExecutionsRolloutConfig() != null)
            sb.append("JobExecutionsRolloutConfig: ").append(getJobExecutionsRolloutConfig()).append(",");
        if (getAbortConfig() != null)
            sb.append("AbortConfig: ").append(getAbortConfig()).append(",");
        if (getTimeoutConfig() != null)
            sb.append("TimeoutConfig: ").append(getTimeoutConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobTemplateRequest == false)
            return false;
        CreateJobTemplateRequest other = (CreateJobTemplateRequest) obj;
        if (other.getJobTemplateId() == null ^ this.getJobTemplateId() == null)
            return false;
        if (other.getJobTemplateId() != null && other.getJobTemplateId().equals(this.getJobTemplateId()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getDocumentSource() == null ^ this.getDocumentSource() == null)
            return false;
        if (other.getDocumentSource() != null && other.getDocumentSource().equals(this.getDocumentSource()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPresignedUrlConfig() == null ^ this.getPresignedUrlConfig() == null)
            return false;
        if (other.getPresignedUrlConfig() != null && other.getPresignedUrlConfig().equals(this.getPresignedUrlConfig()) == false)
            return false;
        if (other.getJobExecutionsRolloutConfig() == null ^ this.getJobExecutionsRolloutConfig() == null)
            return false;
        if (other.getJobExecutionsRolloutConfig() != null && other.getJobExecutionsRolloutConfig().equals(this.getJobExecutionsRolloutConfig()) == false)
            return false;
        if (other.getAbortConfig() == null ^ this.getAbortConfig() == null)
            return false;
        if (other.getAbortConfig() != null && other.getAbortConfig().equals(this.getAbortConfig()) == false)
            return false;
        if (other.getTimeoutConfig() == null ^ this.getTimeoutConfig() == null)
            return false;
        if (other.getTimeoutConfig() != null && other.getTimeoutConfig().equals(this.getTimeoutConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobTemplateId() == null) ? 0 : getJobTemplateId().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getDocumentSource() == null) ? 0 : getDocumentSource().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPresignedUrlConfig() == null) ? 0 : getPresignedUrlConfig().hashCode());
        hashCode = prime * hashCode + ((getJobExecutionsRolloutConfig() == null) ? 0 : getJobExecutionsRolloutConfig().hashCode());
        hashCode = prime * hashCode + ((getAbortConfig() == null) ? 0 : getAbortConfig().hashCode());
        hashCode = prime * hashCode + ((getTimeoutConfig() == null) ? 0 : getTimeoutConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobTemplateRequest clone() {
        return (CreateJobTemplateRequest) super.clone();
    }

}

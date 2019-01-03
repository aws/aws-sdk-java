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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A job identifier which must be unique for your AWS account. We recommend using a UUID. Alpha-numeric characters,
     * "-" and "_" are valid for use here.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * A list of things and thing groups to which the job should be sent.
     * </p>
     */
    private java.util.List<String> targets;
    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     */
    private String documentSource;
    /**
     * <p>
     * The job document.
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
    private String document;
    /**
     * <p>
     * A short text description of the job.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Configuration information for pre-signed S3 URLs.
     * </p>
     */
    private PresignedUrlConfig presignedUrlConfig;
    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a thing when the thing is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     */
    private String targetSelection;
    /**
     * <p>
     * Allows you to create a staged rollout of the job.
     * </p>
     */
    private JobExecutionsRolloutConfig jobExecutionsRolloutConfig;
    /**
     * <p>
     * Allows you to create criteria to abort a job.
     * </p>
     */
    private AbortConfig abortConfig;
    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of the job. The timer is started when the
     * job execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to another
     * terminal state before the time expires, it will be automatically set to <code>TIMED_OUT</code>.
     * </p>
     */
    private TimeoutConfig timeoutConfig;
    /**
     * <p>
     * Metadata which can be used to manage the job.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A job identifier which must be unique for your AWS account. We recommend using a UUID. Alpha-numeric characters,
     * "-" and "_" are valid for use here.
     * </p>
     * 
     * @param jobId
     *        A job identifier which must be unique for your AWS account. We recommend using a UUID. Alpha-numeric
     *        characters, "-" and "_" are valid for use here.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * A job identifier which must be unique for your AWS account. We recommend using a UUID. Alpha-numeric characters,
     * "-" and "_" are valid for use here.
     * </p>
     * 
     * @return A job identifier which must be unique for your AWS account. We recommend using a UUID. Alpha-numeric
     *         characters, "-" and "_" are valid for use here.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * A job identifier which must be unique for your AWS account. We recommend using a UUID. Alpha-numeric characters,
     * "-" and "_" are valid for use here.
     * </p>
     * 
     * @param jobId
     *        A job identifier which must be unique for your AWS account. We recommend using a UUID. Alpha-numeric
     *        characters, "-" and "_" are valid for use here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * A list of things and thing groups to which the job should be sent.
     * </p>
     * 
     * @return A list of things and thing groups to which the job should be sent.
     */

    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * A list of things and thing groups to which the job should be sent.
     * </p>
     * 
     * @param targets
     *        A list of things and thing groups to which the job should be sent.
     */

    public void setTargets(java.util.Collection<String> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<String>(targets);
    }

    /**
     * <p>
     * A list of things and thing groups to which the job should be sent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        A list of things and thing groups to which the job should be sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withTargets(String... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<String>(targets.length));
        }
        for (String ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of things and thing groups to which the job should be sent.
     * </p>
     * 
     * @param targets
     *        A list of things and thing groups to which the job should be sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * 
     * @param documentSource
     *        An S3 link to the job document.
     */

    public void setDocumentSource(String documentSource) {
        this.documentSource = documentSource;
    }

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * 
     * @return An S3 link to the job document.
     */

    public String getDocumentSource() {
        return this.documentSource;
    }

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * 
     * @param documentSource
     *        An S3 link to the job document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withDocumentSource(String documentSource) {
        setDocumentSource(documentSource);
        return this;
    }

    /**
     * <p>
     * The job document.
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
     * @param document
     *        The job document.</p> <note>
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

    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The job document.
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
     * @return The job document.</p> <note>
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

    public String getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The job document.
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
     * @param document
     *        The job document.</p> <note>
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

    public CreateJobRequest withDocument(String document) {
        setDocument(document);
        return this;
    }

    /**
     * <p>
     * A short text description of the job.
     * </p>
     * 
     * @param description
     *        A short text description of the job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A short text description of the job.
     * </p>
     * 
     * @return A short text description of the job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A short text description of the job.
     * </p>
     * 
     * @param description
     *        A short text description of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Configuration information for pre-signed S3 URLs.
     * </p>
     * 
     * @param presignedUrlConfig
     *        Configuration information for pre-signed S3 URLs.
     */

    public void setPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        this.presignedUrlConfig = presignedUrlConfig;
    }

    /**
     * <p>
     * Configuration information for pre-signed S3 URLs.
     * </p>
     * 
     * @return Configuration information for pre-signed S3 URLs.
     */

    public PresignedUrlConfig getPresignedUrlConfig() {
        return this.presignedUrlConfig;
    }

    /**
     * <p>
     * Configuration information for pre-signed S3 URLs.
     * </p>
     * 
     * @param presignedUrlConfig
     *        Configuration information for pre-signed S3 URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        setPresignedUrlConfig(presignedUrlConfig);
        return this;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a thing when the thing is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *        specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *        when a change is detected in a target. For example, a job will run on a thing when the thing is added to a
     *        target group, even after the job was completed by all things originally in the group.
     * @see TargetSelection
     */

    public void setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a thing when the thing is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * 
     * @return Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *         specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *         when a change is detected in a target. For example, a job will run on a thing when the thing is added to
     *         a target group, even after the job was completed by all things originally in the group.
     * @see TargetSelection
     */

    public String getTargetSelection() {
        return this.targetSelection;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a thing when the thing is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *        specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *        when a change is detected in a target. For example, a job will run on a thing when the thing is added to a
     *        target group, even after the job was completed by all things originally in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetSelection
     */

    public CreateJobRequest withTargetSelection(String targetSelection) {
        setTargetSelection(targetSelection);
        return this;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a thing when the thing is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *        specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *        when a change is detected in a target. For example, a job will run on a thing when the thing is added to a
     *        target group, even after the job was completed by all things originally in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetSelection
     */

    public CreateJobRequest withTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
        return this;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of the job.
     * </p>
     * 
     * @param jobExecutionsRolloutConfig
     *        Allows you to create a staged rollout of the job.
     */

    public void setJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of the job.
     * </p>
     * 
     * @return Allows you to create a staged rollout of the job.
     */

    public JobExecutionsRolloutConfig getJobExecutionsRolloutConfig() {
        return this.jobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of the job.
     * </p>
     * 
     * @param jobExecutionsRolloutConfig
     *        Allows you to create a staged rollout of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        setJobExecutionsRolloutConfig(jobExecutionsRolloutConfig);
        return this;
    }

    /**
     * <p>
     * Allows you to create criteria to abort a job.
     * </p>
     * 
     * @param abortConfig
     *        Allows you to create criteria to abort a job.
     */

    public void setAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
    }

    /**
     * <p>
     * Allows you to create criteria to abort a job.
     * </p>
     * 
     * @return Allows you to create criteria to abort a job.
     */

    public AbortConfig getAbortConfig() {
        return this.abortConfig;
    }

    /**
     * <p>
     * Allows you to create criteria to abort a job.
     * </p>
     * 
     * @param abortConfig
     *        Allows you to create criteria to abort a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withAbortConfig(AbortConfig abortConfig) {
        setAbortConfig(abortConfig);
        return this;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of the job. The timer is started when the
     * job execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to another
     * terminal state before the time expires, it will be automatically set to <code>TIMED_OUT</code>.
     * </p>
     * 
     * @param timeoutConfig
     *        Specifies the amount of time each device has to finish its execution of the job. The timer is started when
     *        the job execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to
     *        another terminal state before the time expires, it will be automatically set to <code>TIMED_OUT</code>.
     */

    public void setTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of the job. The timer is started when the
     * job execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to another
     * terminal state before the time expires, it will be automatically set to <code>TIMED_OUT</code>.
     * </p>
     * 
     * @return Specifies the amount of time each device has to finish its execution of the job. The timer is started
     *         when the job execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set
     *         to another terminal state before the time expires, it will be automatically set to <code>TIMED_OUT</code>
     *         .
     */

    public TimeoutConfig getTimeoutConfig() {
        return this.timeoutConfig;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of the job. The timer is started when the
     * job execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to another
     * terminal state before the time expires, it will be automatically set to <code>TIMED_OUT</code>.
     * </p>
     * 
     * @param timeoutConfig
     *        Specifies the amount of time each device has to finish its execution of the job. The timer is started when
     *        the job execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to
     *        another terminal state before the time expires, it will be automatically set to <code>TIMED_OUT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withTimeoutConfig(TimeoutConfig timeoutConfig) {
        setTimeoutConfig(timeoutConfig);
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the job.
     * </p>
     * 
     * @return Metadata which can be used to manage the job.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the job.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the job.
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
     * Metadata which can be used to manage the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withTags(Tag... tags) {
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
     * Metadata which can be used to manage the job.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getDocumentSource() != null)
            sb.append("DocumentSource: ").append(getDocumentSource()).append(",");
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPresignedUrlConfig() != null)
            sb.append("PresignedUrlConfig: ").append(getPresignedUrlConfig()).append(",");
        if (getTargetSelection() != null)
            sb.append("TargetSelection: ").append(getTargetSelection()).append(",");
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

        if (obj instanceof CreateJobRequest == false)
            return false;
        CreateJobRequest other = (CreateJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
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
        if (other.getTargetSelection() == null ^ this.getTargetSelection() == null)
            return false;
        if (other.getTargetSelection() != null && other.getTargetSelection().equals(this.getTargetSelection()) == false)
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

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getDocumentSource() == null) ? 0 : getDocumentSource().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPresignedUrlConfig() == null) ? 0 : getPresignedUrlConfig().hashCode());
        hashCode = prime * hashCode + ((getTargetSelection() == null) ? 0 : getTargetSelection().hashCode());
        hashCode = prime * hashCode + ((getJobExecutionsRolloutConfig() == null) ? 0 : getJobExecutionsRolloutConfig().hashCode());
        hashCode = prime * hashCode + ((getAbortConfig() == null) ? 0 : getAbortConfig().hashCode());
        hashCode = prime * hashCode + ((getTimeoutConfig() == null) ? 0 : getTimeoutConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobRequest clone() {
        return (CreateJobRequest) super.clone();
    }

}

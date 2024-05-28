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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A job identifier which must be unique for your Amazon Web Services account. We recommend using a UUID.
     * Alpha-numeric characters, "-" and "_" are valid for use here.
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
     * An S3 link, or S3 object URL, to the job document. The link is an Amazon S3 object URL and is required if you
     * don't specify a value for <code>document</code>.
     * </p>
     * <p>
     * For example,
     * <code>--document-source https://s3.<i>region-code</i>.amazonaws.com/example-firmware/device-firmware.1.0</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html">Methods for accessing a
     * bucket</a>.
     * </p>
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
     * <note>
     * <p>
     * We recommend that you use continuous jobs instead of snapshot jobs for dynamic thing group targets. By using
     * continuous jobs, devices that join the group receive the job execution even after the job has been created.
     * </p>
     * </note>
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
     * Allows you to create the criteria to abort a job.
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
     * The namespace used to indicate that a job is a customer-managed job.
     * </p>
     * <p>
     * When you specify a value for this parameter, Amazon Web Services IoT Core sends jobs notifications to MQTT topics
     * that contain the value in the following format.
     * </p>
     * <p>
     * <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     * </p>
     * <note>
     * <p>
     * The <code>namespaceId</code> feature is only supported by IoT Greengrass at this time. For more information, see
     * <a href="https://docs.aws.amazon.com/greengrass/v2/developerguide/setting-up.html">Setting up IoT Greengrass core
     * devices.</a>
     * </p>
     * </note>
     */
    private String namespaceId;
    /**
     * <p>
     * The ARN of the job template used to create the job.
     * </p>
     */
    private String jobTemplateArn;
    /**
     * <p>
     * Allows you to create the criteria to retry a job.
     * </p>
     */
    private JobExecutionsRetryConfig jobExecutionsRetryConfig;
    /**
     * <p>
     * Parameters of an Amazon Web Services managed template that you can specify to create the job document.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from Amazon Web Services managed templates.
     * This parameter can't be used with custom job templates or to create jobs from them.
     * </p>
     * </note>
     */
    private java.util.Map<String, String> documentParameters;
    /**
     * <p>
     * The configuration that allows you to schedule a job for a future date and time in addition to specifying the end
     * behavior for each job execution.
     * </p>
     */
    private SchedulingConfig schedulingConfig;
    /**
     * <p>
     * The package version Amazon Resource Names (ARNs) that are installed on the device when the job successfully
     * completes. The package version must be in either the Published or Deprecated state when the job deploys. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * <p>
     * <b>Note:</b>The following Length Constraints relates to a single ARN. Up to 25 package version ARNs are allowed.
     * </p>
     */
    private java.util.List<String> destinationPackageVersions;

    /**
     * <p>
     * A job identifier which must be unique for your Amazon Web Services account. We recommend using a UUID.
     * Alpha-numeric characters, "-" and "_" are valid for use here.
     * </p>
     * 
     * @param jobId
     *        A job identifier which must be unique for your Amazon Web Services account. We recommend using a UUID.
     *        Alpha-numeric characters, "-" and "_" are valid for use here.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * A job identifier which must be unique for your Amazon Web Services account. We recommend using a UUID.
     * Alpha-numeric characters, "-" and "_" are valid for use here.
     * </p>
     * 
     * @return A job identifier which must be unique for your Amazon Web Services account. We recommend using a UUID.
     *         Alpha-numeric characters, "-" and "_" are valid for use here.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * A job identifier which must be unique for your Amazon Web Services account. We recommend using a UUID.
     * Alpha-numeric characters, "-" and "_" are valid for use here.
     * </p>
     * 
     * @param jobId
     *        A job identifier which must be unique for your Amazon Web Services account. We recommend using a UUID.
     *        Alpha-numeric characters, "-" and "_" are valid for use here.
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
     * An S3 link, or S3 object URL, to the job document. The link is an Amazon S3 object URL and is required if you
     * don't specify a value for <code>document</code>.
     * </p>
     * <p>
     * For example,
     * <code>--document-source https://s3.<i>region-code</i>.amazonaws.com/example-firmware/device-firmware.1.0</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html">Methods for accessing a
     * bucket</a>.
     * </p>
     * 
     * @param documentSource
     *        An S3 link, or S3 object URL, to the job document. The link is an Amazon S3 object URL and is required if
     *        you don't specify a value for <code>document</code>.</p>
     *        <p>
     *        For example,
     *        <code>--document-source https://s3.<i>region-code</i>.amazonaws.com/example-firmware/device-firmware.1.0</code>
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html">Methods for
     *        accessing a bucket</a>.
     */

    public void setDocumentSource(String documentSource) {
        this.documentSource = documentSource;
    }

    /**
     * <p>
     * An S3 link, or S3 object URL, to the job document. The link is an Amazon S3 object URL and is required if you
     * don't specify a value for <code>document</code>.
     * </p>
     * <p>
     * For example,
     * <code>--document-source https://s3.<i>region-code</i>.amazonaws.com/example-firmware/device-firmware.1.0</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html">Methods for accessing a
     * bucket</a>.
     * </p>
     * 
     * @return An S3 link, or S3 object URL, to the job document. The link is an Amazon S3 object URL and is required if
     *         you don't specify a value for <code>document</code>.</p>
     *         <p>
     *         For example,
     *         <code>--document-source https://s3.<i>region-code</i>.amazonaws.com/example-firmware/device-firmware.1.0</code>
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html">Methods for
     *         accessing a bucket</a>.
     */

    public String getDocumentSource() {
        return this.documentSource;
    }

    /**
     * <p>
     * An S3 link, or S3 object URL, to the job document. The link is an Amazon S3 object URL and is required if you
     * don't specify a value for <code>document</code>.
     * </p>
     * <p>
     * For example,
     * <code>--document-source https://s3.<i>region-code</i>.amazonaws.com/example-firmware/device-firmware.1.0</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html">Methods for accessing a
     * bucket</a>.
     * </p>
     * 
     * @param documentSource
     *        An S3 link, or S3 object URL, to the job document. The link is an Amazon S3 object URL and is required if
     *        you don't specify a value for <code>document</code>.</p>
     *        <p>
     *        For example,
     *        <code>--document-source https://s3.<i>region-code</i>.amazonaws.com/example-firmware/device-firmware.1.0</code>
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html">Methods for
     *        accessing a bucket</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withDocumentSource(String documentSource) {
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
     * <note>
     * <p>
     * We recommend that you use continuous jobs instead of snapshot jobs for dynamic thing group targets. By using
     * continuous jobs, devices that join the group receive the job execution even after the job has been created.
     * </p>
     * </note>
     * 
     * @param targetSelection
     *        Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *        specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *        when a change is detected in a target. For example, a job will run on a thing when the thing is added to a
     *        target group, even after the job was completed by all things originally in the group.</p> <note>
     *        <p>
     *        We recommend that you use continuous jobs instead of snapshot jobs for dynamic thing group targets. By
     *        using continuous jobs, devices that join the group receive the job execution even after the job has been
     *        created.
     *        </p>
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
     * <note>
     * <p>
     * We recommend that you use continuous jobs instead of snapshot jobs for dynamic thing group targets. By using
     * continuous jobs, devices that join the group receive the job execution even after the job has been created.
     * </p>
     * </note>
     * 
     * @return Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *         specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *         when a change is detected in a target. For example, a job will run on a thing when the thing is added to
     *         a target group, even after the job was completed by all things originally in the group.</p> <note>
     *         <p>
     *         We recommend that you use continuous jobs instead of snapshot jobs for dynamic thing group targets. By
     *         using continuous jobs, devices that join the group receive the job execution even after the job has been
     *         created.
     *         </p>
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
     * <note>
     * <p>
     * We recommend that you use continuous jobs instead of snapshot jobs for dynamic thing group targets. By using
     * continuous jobs, devices that join the group receive the job execution even after the job has been created.
     * </p>
     * </note>
     * 
     * @param targetSelection
     *        Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *        specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *        when a change is detected in a target. For example, a job will run on a thing when the thing is added to a
     *        target group, even after the job was completed by all things originally in the group.</p> <note>
     *        <p>
     *        We recommend that you use continuous jobs instead of snapshot jobs for dynamic thing group targets. By
     *        using continuous jobs, devices that join the group receive the job execution even after the job has been
     *        created.
     *        </p>
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
     * <note>
     * <p>
     * We recommend that you use continuous jobs instead of snapshot jobs for dynamic thing group targets. By using
     * continuous jobs, devices that join the group receive the job execution even after the job has been created.
     * </p>
     * </note>
     * 
     * @param targetSelection
     *        Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *        specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *        when a change is detected in a target. For example, a job will run on a thing when the thing is added to a
     *        target group, even after the job was completed by all things originally in the group.</p> <note>
     *        <p>
     *        We recommend that you use continuous jobs instead of snapshot jobs for dynamic thing group targets. By
     *        using continuous jobs, devices that join the group receive the job execution even after the job has been
     *        created.
     *        </p>
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
     * Allows you to create the criteria to abort a job.
     * </p>
     * 
     * @param abortConfig
     *        Allows you to create the criteria to abort a job.
     */

    public void setAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
    }

    /**
     * <p>
     * Allows you to create the criteria to abort a job.
     * </p>
     * 
     * @return Allows you to create the criteria to abort a job.
     */

    public AbortConfig getAbortConfig() {
        return this.abortConfig;
    }

    /**
     * <p>
     * Allows you to create the criteria to abort a job.
     * </p>
     * 
     * @param abortConfig
     *        Allows you to create the criteria to abort a job.
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
     * <p>
     * The namespace used to indicate that a job is a customer-managed job.
     * </p>
     * <p>
     * When you specify a value for this parameter, Amazon Web Services IoT Core sends jobs notifications to MQTT topics
     * that contain the value in the following format.
     * </p>
     * <p>
     * <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     * </p>
     * <note>
     * <p>
     * The <code>namespaceId</code> feature is only supported by IoT Greengrass at this time. For more information, see
     * <a href="https://docs.aws.amazon.com/greengrass/v2/developerguide/setting-up.html">Setting up IoT Greengrass core
     * devices.</a>
     * </p>
     * </note>
     * 
     * @param namespaceId
     *        The namespace used to indicate that a job is a customer-managed job.</p>
     *        <p>
     *        When you specify a value for this parameter, Amazon Web Services IoT Core sends jobs notifications to MQTT
     *        topics that contain the value in the following format.
     *        </p>
     *        <p>
     *        <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     *        </p>
     *        <note>
     *        <p>
     *        The <code>namespaceId</code> feature is only supported by IoT Greengrass at this time. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/developerguide/setting-up.html">Setting up IoT Greengrass
     *        core devices.</a>
     *        </p>
     */

    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * <p>
     * The namespace used to indicate that a job is a customer-managed job.
     * </p>
     * <p>
     * When you specify a value for this parameter, Amazon Web Services IoT Core sends jobs notifications to MQTT topics
     * that contain the value in the following format.
     * </p>
     * <p>
     * <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     * </p>
     * <note>
     * <p>
     * The <code>namespaceId</code> feature is only supported by IoT Greengrass at this time. For more information, see
     * <a href="https://docs.aws.amazon.com/greengrass/v2/developerguide/setting-up.html">Setting up IoT Greengrass core
     * devices.</a>
     * </p>
     * </note>
     * 
     * @return The namespace used to indicate that a job is a customer-managed job.</p>
     *         <p>
     *         When you specify a value for this parameter, Amazon Web Services IoT Core sends jobs notifications to
     *         MQTT topics that contain the value in the following format.
     *         </p>
     *         <p>
     *         <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     *         </p>
     *         <note>
     *         <p>
     *         The <code>namespaceId</code> feature is only supported by IoT Greengrass at this time. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/greengrass/v2/developerguide/setting-up.html">Setting up IoT Greengrass
     *         core devices.</a>
     *         </p>
     */

    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * <p>
     * The namespace used to indicate that a job is a customer-managed job.
     * </p>
     * <p>
     * When you specify a value for this parameter, Amazon Web Services IoT Core sends jobs notifications to MQTT topics
     * that contain the value in the following format.
     * </p>
     * <p>
     * <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     * </p>
     * <note>
     * <p>
     * The <code>namespaceId</code> feature is only supported by IoT Greengrass at this time. For more information, see
     * <a href="https://docs.aws.amazon.com/greengrass/v2/developerguide/setting-up.html">Setting up IoT Greengrass core
     * devices.</a>
     * </p>
     * </note>
     * 
     * @param namespaceId
     *        The namespace used to indicate that a job is a customer-managed job.</p>
     *        <p>
     *        When you specify a value for this parameter, Amazon Web Services IoT Core sends jobs notifications to MQTT
     *        topics that contain the value in the following format.
     *        </p>
     *        <p>
     *        <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     *        </p>
     *        <note>
     *        <p>
     *        The <code>namespaceId</code> feature is only supported by IoT Greengrass at this time. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/developerguide/setting-up.html">Setting up IoT Greengrass
     *        core devices.</a>
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withNamespaceId(String namespaceId) {
        setNamespaceId(namespaceId);
        return this;
    }

    /**
     * <p>
     * The ARN of the job template used to create the job.
     * </p>
     * 
     * @param jobTemplateArn
     *        The ARN of the job template used to create the job.
     */

    public void setJobTemplateArn(String jobTemplateArn) {
        this.jobTemplateArn = jobTemplateArn;
    }

    /**
     * <p>
     * The ARN of the job template used to create the job.
     * </p>
     * 
     * @return The ARN of the job template used to create the job.
     */

    public String getJobTemplateArn() {
        return this.jobTemplateArn;
    }

    /**
     * <p>
     * The ARN of the job template used to create the job.
     * </p>
     * 
     * @param jobTemplateArn
     *        The ARN of the job template used to create the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withJobTemplateArn(String jobTemplateArn) {
        setJobTemplateArn(jobTemplateArn);
        return this;
    }

    /**
     * <p>
     * Allows you to create the criteria to retry a job.
     * </p>
     * 
     * @param jobExecutionsRetryConfig
     *        Allows you to create the criteria to retry a job.
     */

    public void setJobExecutionsRetryConfig(JobExecutionsRetryConfig jobExecutionsRetryConfig) {
        this.jobExecutionsRetryConfig = jobExecutionsRetryConfig;
    }

    /**
     * <p>
     * Allows you to create the criteria to retry a job.
     * </p>
     * 
     * @return Allows you to create the criteria to retry a job.
     */

    public JobExecutionsRetryConfig getJobExecutionsRetryConfig() {
        return this.jobExecutionsRetryConfig;
    }

    /**
     * <p>
     * Allows you to create the criteria to retry a job.
     * </p>
     * 
     * @param jobExecutionsRetryConfig
     *        Allows you to create the criteria to retry a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withJobExecutionsRetryConfig(JobExecutionsRetryConfig jobExecutionsRetryConfig) {
        setJobExecutionsRetryConfig(jobExecutionsRetryConfig);
        return this;
    }

    /**
     * <p>
     * Parameters of an Amazon Web Services managed template that you can specify to create the job document.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from Amazon Web Services managed templates.
     * This parameter can't be used with custom job templates or to create jobs from them.
     * </p>
     * </note>
     * 
     * @return Parameters of an Amazon Web Services managed template that you can specify to create the job
     *         document.</p> <note>
     *         <p>
     *         <code>documentParameters</code> can only be used when creating jobs from Amazon Web Services managed
     *         templates. This parameter can't be used with custom job templates or to create jobs from them.
     *         </p>
     */

    public java.util.Map<String, String> getDocumentParameters() {
        return documentParameters;
    }

    /**
     * <p>
     * Parameters of an Amazon Web Services managed template that you can specify to create the job document.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from Amazon Web Services managed templates.
     * This parameter can't be used with custom job templates or to create jobs from them.
     * </p>
     * </note>
     * 
     * @param documentParameters
     *        Parameters of an Amazon Web Services managed template that you can specify to create the job document.</p>
     *        <note>
     *        <p>
     *        <code>documentParameters</code> can only be used when creating jobs from Amazon Web Services managed
     *        templates. This parameter can't be used with custom job templates or to create jobs from them.
     *        </p>
     */

    public void setDocumentParameters(java.util.Map<String, String> documentParameters) {
        this.documentParameters = documentParameters;
    }

    /**
     * <p>
     * Parameters of an Amazon Web Services managed template that you can specify to create the job document.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from Amazon Web Services managed templates.
     * This parameter can't be used with custom job templates or to create jobs from them.
     * </p>
     * </note>
     * 
     * @param documentParameters
     *        Parameters of an Amazon Web Services managed template that you can specify to create the job document.</p>
     *        <note>
     *        <p>
     *        <code>documentParameters</code> can only be used when creating jobs from Amazon Web Services managed
     *        templates. This parameter can't be used with custom job templates or to create jobs from them.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withDocumentParameters(java.util.Map<String, String> documentParameters) {
        setDocumentParameters(documentParameters);
        return this;
    }

    /**
     * Add a single DocumentParameters entry
     *
     * @see CreateJobRequest#withDocumentParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest addDocumentParametersEntry(String key, String value) {
        if (null == this.documentParameters) {
            this.documentParameters = new java.util.HashMap<String, String>();
        }
        if (this.documentParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.documentParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DocumentParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest clearDocumentParametersEntries() {
        this.documentParameters = null;
        return this;
    }

    /**
     * <p>
     * The configuration that allows you to schedule a job for a future date and time in addition to specifying the end
     * behavior for each job execution.
     * </p>
     * 
     * @param schedulingConfig
     *        The configuration that allows you to schedule a job for a future date and time in addition to specifying
     *        the end behavior for each job execution.
     */

    public void setSchedulingConfig(SchedulingConfig schedulingConfig) {
        this.schedulingConfig = schedulingConfig;
    }

    /**
     * <p>
     * The configuration that allows you to schedule a job for a future date and time in addition to specifying the end
     * behavior for each job execution.
     * </p>
     * 
     * @return The configuration that allows you to schedule a job for a future date and time in addition to specifying
     *         the end behavior for each job execution.
     */

    public SchedulingConfig getSchedulingConfig() {
        return this.schedulingConfig;
    }

    /**
     * <p>
     * The configuration that allows you to schedule a job for a future date and time in addition to specifying the end
     * behavior for each job execution.
     * </p>
     * 
     * @param schedulingConfig
     *        The configuration that allows you to schedule a job for a future date and time in addition to specifying
     *        the end behavior for each job execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withSchedulingConfig(SchedulingConfig schedulingConfig) {
        setSchedulingConfig(schedulingConfig);
        return this;
    }

    /**
     * <p>
     * The package version Amazon Resource Names (ARNs) that are installed on the device when the job successfully
     * completes. The package version must be in either the Published or Deprecated state when the job deploys. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * <p>
     * <b>Note:</b>The following Length Constraints relates to a single ARN. Up to 25 package version ARNs are allowed.
     * </p>
     * 
     * @return The package version Amazon Resource Names (ARNs) that are installed on the device when the job
     *         successfully completes. The package version must be in either the Published or Deprecated state when the
     *         job deploys. For more information, see <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *         >Package version lifecycle</a>. </p>
     *         <p>
     *         <b>Note:</b>The following Length Constraints relates to a single ARN. Up to 25 package version ARNs are
     *         allowed.
     */

    public java.util.List<String> getDestinationPackageVersions() {
        return destinationPackageVersions;
    }

    /**
     * <p>
     * The package version Amazon Resource Names (ARNs) that are installed on the device when the job successfully
     * completes. The package version must be in either the Published or Deprecated state when the job deploys. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * <p>
     * <b>Note:</b>The following Length Constraints relates to a single ARN. Up to 25 package version ARNs are allowed.
     * </p>
     * 
     * @param destinationPackageVersions
     *        The package version Amazon Resource Names (ARNs) that are installed on the device when the job
     *        successfully completes. The package version must be in either the Published or Deprecated state when the
     *        job deploys. For more information, see <a href=
     *        "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *        >Package version lifecycle</a>. </p>
     *        <p>
     *        <b>Note:</b>The following Length Constraints relates to a single ARN. Up to 25 package version ARNs are
     *        allowed.
     */

    public void setDestinationPackageVersions(java.util.Collection<String> destinationPackageVersions) {
        if (destinationPackageVersions == null) {
            this.destinationPackageVersions = null;
            return;
        }

        this.destinationPackageVersions = new java.util.ArrayList<String>(destinationPackageVersions);
    }

    /**
     * <p>
     * The package version Amazon Resource Names (ARNs) that are installed on the device when the job successfully
     * completes. The package version must be in either the Published or Deprecated state when the job deploys. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * <p>
     * <b>Note:</b>The following Length Constraints relates to a single ARN. Up to 25 package version ARNs are allowed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationPackageVersions(java.util.Collection)} or
     * {@link #withDestinationPackageVersions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param destinationPackageVersions
     *        The package version Amazon Resource Names (ARNs) that are installed on the device when the job
     *        successfully completes. The package version must be in either the Published or Deprecated state when the
     *        job deploys. For more information, see <a href=
     *        "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *        >Package version lifecycle</a>. </p>
     *        <p>
     *        <b>Note:</b>The following Length Constraints relates to a single ARN. Up to 25 package version ARNs are
     *        allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withDestinationPackageVersions(String... destinationPackageVersions) {
        if (this.destinationPackageVersions == null) {
            setDestinationPackageVersions(new java.util.ArrayList<String>(destinationPackageVersions.length));
        }
        for (String ele : destinationPackageVersions) {
            this.destinationPackageVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The package version Amazon Resource Names (ARNs) that are installed on the device when the job successfully
     * completes. The package version must be in either the Published or Deprecated state when the job deploys. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * <p>
     * <b>Note:</b>The following Length Constraints relates to a single ARN. Up to 25 package version ARNs are allowed.
     * </p>
     * 
     * @param destinationPackageVersions
     *        The package version Amazon Resource Names (ARNs) that are installed on the device when the job
     *        successfully completes. The package version must be in either the Published or Deprecated state when the
     *        job deploys. For more information, see <a href=
     *        "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *        >Package version lifecycle</a>. </p>
     *        <p>
     *        <b>Note:</b>The following Length Constraints relates to a single ARN. Up to 25 package version ARNs are
     *        allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withDestinationPackageVersions(java.util.Collection<String> destinationPackageVersions) {
        setDestinationPackageVersions(destinationPackageVersions);
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
            sb.append("Tags: ").append(getTags()).append(",");
        if (getNamespaceId() != null)
            sb.append("NamespaceId: ").append(getNamespaceId()).append(",");
        if (getJobTemplateArn() != null)
            sb.append("JobTemplateArn: ").append(getJobTemplateArn()).append(",");
        if (getJobExecutionsRetryConfig() != null)
            sb.append("JobExecutionsRetryConfig: ").append(getJobExecutionsRetryConfig()).append(",");
        if (getDocumentParameters() != null)
            sb.append("DocumentParameters: ").append(getDocumentParameters()).append(",");
        if (getSchedulingConfig() != null)
            sb.append("SchedulingConfig: ").append(getSchedulingConfig()).append(",");
        if (getDestinationPackageVersions() != null)
            sb.append("DestinationPackageVersions: ").append(getDestinationPackageVersions());
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
        if (other.getNamespaceId() == null ^ this.getNamespaceId() == null)
            return false;
        if (other.getNamespaceId() != null && other.getNamespaceId().equals(this.getNamespaceId()) == false)
            return false;
        if (other.getJobTemplateArn() == null ^ this.getJobTemplateArn() == null)
            return false;
        if (other.getJobTemplateArn() != null && other.getJobTemplateArn().equals(this.getJobTemplateArn()) == false)
            return false;
        if (other.getJobExecutionsRetryConfig() == null ^ this.getJobExecutionsRetryConfig() == null)
            return false;
        if (other.getJobExecutionsRetryConfig() != null && other.getJobExecutionsRetryConfig().equals(this.getJobExecutionsRetryConfig()) == false)
            return false;
        if (other.getDocumentParameters() == null ^ this.getDocumentParameters() == null)
            return false;
        if (other.getDocumentParameters() != null && other.getDocumentParameters().equals(this.getDocumentParameters()) == false)
            return false;
        if (other.getSchedulingConfig() == null ^ this.getSchedulingConfig() == null)
            return false;
        if (other.getSchedulingConfig() != null && other.getSchedulingConfig().equals(this.getSchedulingConfig()) == false)
            return false;
        if (other.getDestinationPackageVersions() == null ^ this.getDestinationPackageVersions() == null)
            return false;
        if (other.getDestinationPackageVersions() != null && other.getDestinationPackageVersions().equals(this.getDestinationPackageVersions()) == false)
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
        hashCode = prime * hashCode + ((getNamespaceId() == null) ? 0 : getNamespaceId().hashCode());
        hashCode = prime * hashCode + ((getJobTemplateArn() == null) ? 0 : getJobTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getJobExecutionsRetryConfig() == null) ? 0 : getJobExecutionsRetryConfig().hashCode());
        hashCode = prime * hashCode + ((getDocumentParameters() == null) ? 0 : getDocumentParameters().hashCode());
        hashCode = prime * hashCode + ((getSchedulingConfig() == null) ? 0 : getSchedulingConfig().hashCode());
        hashCode = prime * hashCode + ((getDestinationPackageVersions() == null) ? 0 : getDestinationPackageVersions().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobRequest clone() {
        return (CreateJobRequest) super.clone();
    }

}

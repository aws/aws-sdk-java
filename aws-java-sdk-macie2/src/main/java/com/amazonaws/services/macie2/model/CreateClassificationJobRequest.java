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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateClassificationJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClassificationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The custom data identifiers to use for data analysis and classification.
     * </p>
     */
    private java.util.List<String> customDataIdentifierIds;
    /**
     * <p>
     * A custom description of the job. The description can contain as many as 200 characters.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies whether to analyze all existing, eligible objects immediately after the job is created.
     * </p>
     */
    private Boolean initialRun;
    /**
     * <p>
     * The schedule for running the job. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - Run the job only once. If you specify this value, don't specify a value for the scheduleFrequency
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you specify this value, use the
     * scheduleFrequency property to define the recurrence pattern for the job.
     * </p>
     * </li>
     * </ul>
     */
    private String jobType;
    /**
     * <p>
     * A custom name for the job. The name can contain as many as 500 characters.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The S3 buckets that contain the objects to analyze, and the scope of that analysis.
     * </p>
     */
    private S3JobDefinition s3JobDefinition;
    /**
     * <p>
     * The sampling depth, as a percentage, to apply when processing objects. This value determines the percentage of
     * eligible objects that the job analyzes. If this value is less than 100, Amazon Macie selects the objects to
     * analyze at random, up to the specified percentage, and analyzes all the data in those objects.
     * </p>
     */
    private Integer samplingPercentage;
    /**
     * <p>
     * The recurrence pattern for running the job. To run the job only once, don't specify a value for this property and
     * set the value for the jobType property to ONE_TIME.
     * </p>
     */
    private JobScheduleFrequency scheduleFrequency;
    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the job.
     * </p>
     * <p>
     * A job can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum
     * length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClassificationJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The custom data identifiers to use for data analysis and classification.
     * </p>
     * 
     * @return The custom data identifiers to use for data analysis and classification.
     */

    public java.util.List<String> getCustomDataIdentifierIds() {
        return customDataIdentifierIds;
    }

    /**
     * <p>
     * The custom data identifiers to use for data analysis and classification.
     * </p>
     * 
     * @param customDataIdentifierIds
     *        The custom data identifiers to use for data analysis and classification.
     */

    public void setCustomDataIdentifierIds(java.util.Collection<String> customDataIdentifierIds) {
        if (customDataIdentifierIds == null) {
            this.customDataIdentifierIds = null;
            return;
        }

        this.customDataIdentifierIds = new java.util.ArrayList<String>(customDataIdentifierIds);
    }

    /**
     * <p>
     * The custom data identifiers to use for data analysis and classification.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomDataIdentifierIds(java.util.Collection)} or
     * {@link #withCustomDataIdentifierIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customDataIdentifierIds
     *        The custom data identifiers to use for data analysis and classification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClassificationJobRequest withCustomDataIdentifierIds(String... customDataIdentifierIds) {
        if (this.customDataIdentifierIds == null) {
            setCustomDataIdentifierIds(new java.util.ArrayList<String>(customDataIdentifierIds.length));
        }
        for (String ele : customDataIdentifierIds) {
            this.customDataIdentifierIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The custom data identifiers to use for data analysis and classification.
     * </p>
     * 
     * @param customDataIdentifierIds
     *        The custom data identifiers to use for data analysis and classification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClassificationJobRequest withCustomDataIdentifierIds(java.util.Collection<String> customDataIdentifierIds) {
        setCustomDataIdentifierIds(customDataIdentifierIds);
        return this;
    }

    /**
     * <p>
     * A custom description of the job. The description can contain as many as 200 characters.
     * </p>
     * 
     * @param description
     *        A custom description of the job. The description can contain as many as 200 characters.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A custom description of the job. The description can contain as many as 200 characters.
     * </p>
     * 
     * @return A custom description of the job. The description can contain as many as 200 characters.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A custom description of the job. The description can contain as many as 200 characters.
     * </p>
     * 
     * @param description
     *        A custom description of the job. The description can contain as many as 200 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClassificationJobRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies whether to analyze all existing, eligible objects immediately after the job is created.
     * </p>
     * 
     * @param initialRun
     *        Specifies whether to analyze all existing, eligible objects immediately after the job is created.
     */

    public void setInitialRun(Boolean initialRun) {
        this.initialRun = initialRun;
    }

    /**
     * <p>
     * Specifies whether to analyze all existing, eligible objects immediately after the job is created.
     * </p>
     * 
     * @return Specifies whether to analyze all existing, eligible objects immediately after the job is created.
     */

    public Boolean getInitialRun() {
        return this.initialRun;
    }

    /**
     * <p>
     * Specifies whether to analyze all existing, eligible objects immediately after the job is created.
     * </p>
     * 
     * @param initialRun
     *        Specifies whether to analyze all existing, eligible objects immediately after the job is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClassificationJobRequest withInitialRun(Boolean initialRun) {
        setInitialRun(initialRun);
        return this;
    }

    /**
     * <p>
     * Specifies whether to analyze all existing, eligible objects immediately after the job is created.
     * </p>
     * 
     * @return Specifies whether to analyze all existing, eligible objects immediately after the job is created.
     */

    public Boolean isInitialRun() {
        return this.initialRun;
    }

    /**
     * <p>
     * The schedule for running the job. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - Run the job only once. If you specify this value, don't specify a value for the scheduleFrequency
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you specify this value, use the
     * scheduleFrequency property to define the recurrence pattern for the job.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobType
     *        The schedule for running the job. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ONE_TIME - Run the job only once. If you specify this value, don't specify a value for the
     *        scheduleFrequency property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you specify this value, use the
     *        scheduleFrequency property to define the recurrence pattern for the job.
     *        </p>
     *        </li>
     * @see JobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The schedule for running the job. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - Run the job only once. If you specify this value, don't specify a value for the scheduleFrequency
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you specify this value, use the
     * scheduleFrequency property to define the recurrence pattern for the job.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The schedule for running the job. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ONE_TIME - Run the job only once. If you specify this value, don't specify a value for the
     *         scheduleFrequency property.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you specify this value, use the
     *         scheduleFrequency property to define the recurrence pattern for the job.
     *         </p>
     *         </li>
     * @see JobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * The schedule for running the job. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - Run the job only once. If you specify this value, don't specify a value for the scheduleFrequency
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you specify this value, use the
     * scheduleFrequency property to define the recurrence pattern for the job.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobType
     *        The schedule for running the job. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ONE_TIME - Run the job only once. If you specify this value, don't specify a value for the
     *        scheduleFrequency property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you specify this value, use the
     *        scheduleFrequency property to define the recurrence pattern for the job.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public CreateClassificationJobRequest withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * The schedule for running the job. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - Run the job only once. If you specify this value, don't specify a value for the scheduleFrequency
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you specify this value, use the
     * scheduleFrequency property to define the recurrence pattern for the job.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobType
     *        The schedule for running the job. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ONE_TIME - Run the job only once. If you specify this value, don't specify a value for the
     *        scheduleFrequency property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you specify this value, use the
     *        scheduleFrequency property to define the recurrence pattern for the job.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public CreateClassificationJobRequest withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * A custom name for the job. The name can contain as many as 500 characters.
     * </p>
     * 
     * @param name
     *        A custom name for the job. The name can contain as many as 500 characters.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A custom name for the job. The name can contain as many as 500 characters.
     * </p>
     * 
     * @return A custom name for the job. The name can contain as many as 500 characters.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A custom name for the job. The name can contain as many as 500 characters.
     * </p>
     * 
     * @param name
     *        A custom name for the job. The name can contain as many as 500 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClassificationJobRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The S3 buckets that contain the objects to analyze, and the scope of that analysis.
     * </p>
     * 
     * @param s3JobDefinition
     *        The S3 buckets that contain the objects to analyze, and the scope of that analysis.
     */

    public void setS3JobDefinition(S3JobDefinition s3JobDefinition) {
        this.s3JobDefinition = s3JobDefinition;
    }

    /**
     * <p>
     * The S3 buckets that contain the objects to analyze, and the scope of that analysis.
     * </p>
     * 
     * @return The S3 buckets that contain the objects to analyze, and the scope of that analysis.
     */

    public S3JobDefinition getS3JobDefinition() {
        return this.s3JobDefinition;
    }

    /**
     * <p>
     * The S3 buckets that contain the objects to analyze, and the scope of that analysis.
     * </p>
     * 
     * @param s3JobDefinition
     *        The S3 buckets that contain the objects to analyze, and the scope of that analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClassificationJobRequest withS3JobDefinition(S3JobDefinition s3JobDefinition) {
        setS3JobDefinition(s3JobDefinition);
        return this;
    }

    /**
     * <p>
     * The sampling depth, as a percentage, to apply when processing objects. This value determines the percentage of
     * eligible objects that the job analyzes. If this value is less than 100, Amazon Macie selects the objects to
     * analyze at random, up to the specified percentage, and analyzes all the data in those objects.
     * </p>
     * 
     * @param samplingPercentage
     *        The sampling depth, as a percentage, to apply when processing objects. This value determines the
     *        percentage of eligible objects that the job analyzes. If this value is less than 100, Amazon Macie selects
     *        the objects to analyze at random, up to the specified percentage, and analyzes all the data in those
     *        objects.
     */

    public void setSamplingPercentage(Integer samplingPercentage) {
        this.samplingPercentage = samplingPercentage;
    }

    /**
     * <p>
     * The sampling depth, as a percentage, to apply when processing objects. This value determines the percentage of
     * eligible objects that the job analyzes. If this value is less than 100, Amazon Macie selects the objects to
     * analyze at random, up to the specified percentage, and analyzes all the data in those objects.
     * </p>
     * 
     * @return The sampling depth, as a percentage, to apply when processing objects. This value determines the
     *         percentage of eligible objects that the job analyzes. If this value is less than 100, Amazon Macie
     *         selects the objects to analyze at random, up to the specified percentage, and analyzes all the data in
     *         those objects.
     */

    public Integer getSamplingPercentage() {
        return this.samplingPercentage;
    }

    /**
     * <p>
     * The sampling depth, as a percentage, to apply when processing objects. This value determines the percentage of
     * eligible objects that the job analyzes. If this value is less than 100, Amazon Macie selects the objects to
     * analyze at random, up to the specified percentage, and analyzes all the data in those objects.
     * </p>
     * 
     * @param samplingPercentage
     *        The sampling depth, as a percentage, to apply when processing objects. This value determines the
     *        percentage of eligible objects that the job analyzes. If this value is less than 100, Amazon Macie selects
     *        the objects to analyze at random, up to the specified percentage, and analyzes all the data in those
     *        objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClassificationJobRequest withSamplingPercentage(Integer samplingPercentage) {
        setSamplingPercentage(samplingPercentage);
        return this;
    }

    /**
     * <p>
     * The recurrence pattern for running the job. To run the job only once, don't specify a value for this property and
     * set the value for the jobType property to ONE_TIME.
     * </p>
     * 
     * @param scheduleFrequency
     *        The recurrence pattern for running the job. To run the job only once, don't specify a value for this
     *        property and set the value for the jobType property to ONE_TIME.
     */

    public void setScheduleFrequency(JobScheduleFrequency scheduleFrequency) {
        this.scheduleFrequency = scheduleFrequency;
    }

    /**
     * <p>
     * The recurrence pattern for running the job. To run the job only once, don't specify a value for this property and
     * set the value for the jobType property to ONE_TIME.
     * </p>
     * 
     * @return The recurrence pattern for running the job. To run the job only once, don't specify a value for this
     *         property and set the value for the jobType property to ONE_TIME.
     */

    public JobScheduleFrequency getScheduleFrequency() {
        return this.scheduleFrequency;
    }

    /**
     * <p>
     * The recurrence pattern for running the job. To run the job only once, don't specify a value for this property and
     * set the value for the jobType property to ONE_TIME.
     * </p>
     * 
     * @param scheduleFrequency
     *        The recurrence pattern for running the job. To run the job only once, don't specify a value for this
     *        property and set the value for the jobType property to ONE_TIME.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClassificationJobRequest withScheduleFrequency(JobScheduleFrequency scheduleFrequency) {
        setScheduleFrequency(scheduleFrequency);
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the job.
     * </p>
     * <p>
     * A job can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum
     * length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * </p>
     * 
     * @return A map of key-value pairs that specifies the tags to associate with the job.</p>
     *         <p>
     *         A job can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The
     *         maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the job.
     * </p>
     * <p>
     * A job can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum
     * length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that specifies the tags to associate with the job.</p>
     *        <p>
     *        A job can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The
     *        maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the job.
     * </p>
     * <p>
     * A job can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum
     * length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that specifies the tags to associate with the job.</p>
     *        <p>
     *        A job can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The
     *        maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClassificationJobRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateClassificationJobRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateClassificationJobRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClassificationJobRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCustomDataIdentifierIds() != null)
            sb.append("CustomDataIdentifierIds: ").append(getCustomDataIdentifierIds()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInitialRun() != null)
            sb.append("InitialRun: ").append(getInitialRun()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getS3JobDefinition() != null)
            sb.append("S3JobDefinition: ").append(getS3JobDefinition()).append(",");
        if (getSamplingPercentage() != null)
            sb.append("SamplingPercentage: ").append(getSamplingPercentage()).append(",");
        if (getScheduleFrequency() != null)
            sb.append("ScheduleFrequency: ").append(getScheduleFrequency()).append(",");
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

        if (obj instanceof CreateClassificationJobRequest == false)
            return false;
        CreateClassificationJobRequest other = (CreateClassificationJobRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCustomDataIdentifierIds() == null ^ this.getCustomDataIdentifierIds() == null)
            return false;
        if (other.getCustomDataIdentifierIds() != null && other.getCustomDataIdentifierIds().equals(this.getCustomDataIdentifierIds()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInitialRun() == null ^ this.getInitialRun() == null)
            return false;
        if (other.getInitialRun() != null && other.getInitialRun().equals(this.getInitialRun()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getS3JobDefinition() == null ^ this.getS3JobDefinition() == null)
            return false;
        if (other.getS3JobDefinition() != null && other.getS3JobDefinition().equals(this.getS3JobDefinition()) == false)
            return false;
        if (other.getSamplingPercentage() == null ^ this.getSamplingPercentage() == null)
            return false;
        if (other.getSamplingPercentage() != null && other.getSamplingPercentage().equals(this.getSamplingPercentage()) == false)
            return false;
        if (other.getScheduleFrequency() == null ^ this.getScheduleFrequency() == null)
            return false;
        if (other.getScheduleFrequency() != null && other.getScheduleFrequency().equals(this.getScheduleFrequency()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCustomDataIdentifierIds() == null) ? 0 : getCustomDataIdentifierIds().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInitialRun() == null) ? 0 : getInitialRun().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getS3JobDefinition() == null) ? 0 : getS3JobDefinition().hashCode());
        hashCode = prime * hashCode + ((getSamplingPercentage() == null) ? 0 : getSamplingPercentage().hashCode());
        hashCode = prime * hashCode + ((getScheduleFrequency() == null) ? 0 : getScheduleFrequency().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateClassificationJobRequest clone() {
        return (CreateClassificationJobRequest) super.clone();
    }

}

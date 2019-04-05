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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CreateJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Defines the type of job that you're creating.
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * Defines the Amazon S3 buckets associated with this job.
     * </p>
     * <p>
     * With <code>IMPORT</code> jobs, you specify the bucket or buckets that your transferred data will be imported
     * into.
     * </p>
     * <p>
     * With <code>EXPORT</code> jobs, you specify the bucket or buckets that your transferred data will be exported
     * from. Optionally, you can also specify a <code>KeyRange</code> value. If you choose to export a range, you define
     * the length of the range by providing either an inclusive <code>BeginMarker</code> value, an inclusive
     * <code>EndMarker</code> value, or both. Ranges are UTF-8 binary sorted.
     * </p>
     */
    private JobResource resources;
    /**
     * <p>
     * Defines an optional description of this specific job, for example <code>Important Photos 2016-08-11</code>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID for the address that you want the Snowball shipped to.
     * </p>
     */
    private String addressId;
    /**
     * <p>
     * The <code>KmsKeyARN</code> that you want to associate with this job. <code>KmsKeyARN</code>s are created using
     * the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> AWS Key
     * Management Service (KMS) API action.
     * </p>
     */
    private String kmsKeyARN;
    /**
     * <p>
     * The <code>RoleARN</code> that you want to associate with this job. <code>RoleArn</code>s are created using the <a
     * href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS Identity and
     * Access Management (IAM) API action.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * If your job is being created in one of the US regions, you have the option of specifying what size Snowball you'd
     * like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     */
    private String snowballCapacityPreference;
    /**
     * <p>
     * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snowball, rather it
     * represents how quickly the Snowball moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the US, you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     */
    private String shippingOption;
    /**
     * <p>
     * Defines the Amazon Simple Notification Service (Amazon SNS) notification settings for this job.
     * </p>
     */
    private Notification notification;
    /**
     * <p>
     * The ID of a cluster. If you're creating a job for a node in a cluster, you need to provide only this
     * <code>clusterId</code> value. The other job attributes are inherited from the cluster.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The type of AWS Snowball device to use for this job. The only supported device types for cluster jobs are
     * <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * </p>
     */
    private String snowballType;
    /**
     * <p>
     * The forwarding address ID for a job. This field is not supported in most regions.
     * </p>
     */
    private String forwardingAddressId;

    /**
     * <p>
     * Defines the type of job that you're creating.
     * </p>
     * 
     * @param jobType
     *        Defines the type of job that you're creating.
     * @see JobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * Defines the type of job that you're creating.
     * </p>
     * 
     * @return Defines the type of job that you're creating.
     * @see JobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * Defines the type of job that you're creating.
     * </p>
     * 
     * @param jobType
     *        Defines the type of job that you're creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public CreateJobRequest withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * Defines the type of job that you're creating.
     * </p>
     * 
     * @param jobType
     *        Defines the type of job that you're creating.
     * @see JobType
     */

    public void setJobType(JobType jobType) {
        withJobType(jobType);
    }

    /**
     * <p>
     * Defines the type of job that you're creating.
     * </p>
     * 
     * @param jobType
     *        Defines the type of job that you're creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public CreateJobRequest withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * Defines the Amazon S3 buckets associated with this job.
     * </p>
     * <p>
     * With <code>IMPORT</code> jobs, you specify the bucket or buckets that your transferred data will be imported
     * into.
     * </p>
     * <p>
     * With <code>EXPORT</code> jobs, you specify the bucket or buckets that your transferred data will be exported
     * from. Optionally, you can also specify a <code>KeyRange</code> value. If you choose to export a range, you define
     * the length of the range by providing either an inclusive <code>BeginMarker</code> value, an inclusive
     * <code>EndMarker</code> value, or both. Ranges are UTF-8 binary sorted.
     * </p>
     * 
     * @param resources
     *        Defines the Amazon S3 buckets associated with this job.</p>
     *        <p>
     *        With <code>IMPORT</code> jobs, you specify the bucket or buckets that your transferred data will be
     *        imported into.
     *        </p>
     *        <p>
     *        With <code>EXPORT</code> jobs, you specify the bucket or buckets that your transferred data will be
     *        exported from. Optionally, you can also specify a <code>KeyRange</code> value. If you choose to export a
     *        range, you define the length of the range by providing either an inclusive <code>BeginMarker</code> value,
     *        an inclusive <code>EndMarker</code> value, or both. Ranges are UTF-8 binary sorted.
     */

    public void setResources(JobResource resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * Defines the Amazon S3 buckets associated with this job.
     * </p>
     * <p>
     * With <code>IMPORT</code> jobs, you specify the bucket or buckets that your transferred data will be imported
     * into.
     * </p>
     * <p>
     * With <code>EXPORT</code> jobs, you specify the bucket or buckets that your transferred data will be exported
     * from. Optionally, you can also specify a <code>KeyRange</code> value. If you choose to export a range, you define
     * the length of the range by providing either an inclusive <code>BeginMarker</code> value, an inclusive
     * <code>EndMarker</code> value, or both. Ranges are UTF-8 binary sorted.
     * </p>
     * 
     * @return Defines the Amazon S3 buckets associated with this job.</p>
     *         <p>
     *         With <code>IMPORT</code> jobs, you specify the bucket or buckets that your transferred data will be
     *         imported into.
     *         </p>
     *         <p>
     *         With <code>EXPORT</code> jobs, you specify the bucket or buckets that your transferred data will be
     *         exported from. Optionally, you can also specify a <code>KeyRange</code> value. If you choose to export a
     *         range, you define the length of the range by providing either an inclusive <code>BeginMarker</code>
     *         value, an inclusive <code>EndMarker</code> value, or both. Ranges are UTF-8 binary sorted.
     */

    public JobResource getResources() {
        return this.resources;
    }

    /**
     * <p>
     * Defines the Amazon S3 buckets associated with this job.
     * </p>
     * <p>
     * With <code>IMPORT</code> jobs, you specify the bucket or buckets that your transferred data will be imported
     * into.
     * </p>
     * <p>
     * With <code>EXPORT</code> jobs, you specify the bucket or buckets that your transferred data will be exported
     * from. Optionally, you can also specify a <code>KeyRange</code> value. If you choose to export a range, you define
     * the length of the range by providing either an inclusive <code>BeginMarker</code> value, an inclusive
     * <code>EndMarker</code> value, or both. Ranges are UTF-8 binary sorted.
     * </p>
     * 
     * @param resources
     *        Defines the Amazon S3 buckets associated with this job.</p>
     *        <p>
     *        With <code>IMPORT</code> jobs, you specify the bucket or buckets that your transferred data will be
     *        imported into.
     *        </p>
     *        <p>
     *        With <code>EXPORT</code> jobs, you specify the bucket or buckets that your transferred data will be
     *        exported from. Optionally, you can also specify a <code>KeyRange</code> value. If you choose to export a
     *        range, you define the length of the range by providing either an inclusive <code>BeginMarker</code> value,
     *        an inclusive <code>EndMarker</code> value, or both. Ranges are UTF-8 binary sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withResources(JobResource resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * Defines an optional description of this specific job, for example <code>Important Photos 2016-08-11</code>.
     * </p>
     * 
     * @param description
     *        Defines an optional description of this specific job, for example <code>Important Photos 2016-08-11</code>
     *        .
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Defines an optional description of this specific job, for example <code>Important Photos 2016-08-11</code>.
     * </p>
     * 
     * @return Defines an optional description of this specific job, for example
     *         <code>Important Photos 2016-08-11</code>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Defines an optional description of this specific job, for example <code>Important Photos 2016-08-11</code>.
     * </p>
     * 
     * @param description
     *        Defines an optional description of this specific job, for example <code>Important Photos 2016-08-11</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID for the address that you want the Snowball shipped to.
     * </p>
     * 
     * @param addressId
     *        The ID for the address that you want the Snowball shipped to.
     */

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * <p>
     * The ID for the address that you want the Snowball shipped to.
     * </p>
     * 
     * @return The ID for the address that you want the Snowball shipped to.
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     * <p>
     * The ID for the address that you want the Snowball shipped to.
     * </p>
     * 
     * @param addressId
     *        The ID for the address that you want the Snowball shipped to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withAddressId(String addressId) {
        setAddressId(addressId);
        return this;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> that you want to associate with this job. <code>KmsKeyARN</code>s are created using
     * the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> AWS Key
     * Management Service (KMS) API action.
     * </p>
     * 
     * @param kmsKeyARN
     *        The <code>KmsKeyARN</code> that you want to associate with this job. <code>KmsKeyARN</code>s are created
     *        using the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a>
     *        AWS Key Management Service (KMS) API action.
     */

    public void setKmsKeyARN(String kmsKeyARN) {
        this.kmsKeyARN = kmsKeyARN;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> that you want to associate with this job. <code>KmsKeyARN</code>s are created using
     * the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> AWS Key
     * Management Service (KMS) API action.
     * </p>
     * 
     * @return The <code>KmsKeyARN</code> that you want to associate with this job. <code>KmsKeyARN</code>s are created
     *         using the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a>
     *         AWS Key Management Service (KMS) API action.
     */

    public String getKmsKeyARN() {
        return this.kmsKeyARN;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> that you want to associate with this job. <code>KmsKeyARN</code>s are created using
     * the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> AWS Key
     * Management Service (KMS) API action.
     * </p>
     * 
     * @param kmsKeyARN
     *        The <code>KmsKeyARN</code> that you want to associate with this job. <code>KmsKeyARN</code>s are created
     *        using the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a>
     *        AWS Key Management Service (KMS) API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withKmsKeyARN(String kmsKeyARN) {
        setKmsKeyARN(kmsKeyARN);
        return this;
    }

    /**
     * <p>
     * The <code>RoleARN</code> that you want to associate with this job. <code>RoleArn</code>s are created using the <a
     * href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS Identity and
     * Access Management (IAM) API action.
     * </p>
     * 
     * @param roleARN
     *        The <code>RoleARN</code> that you want to associate with this job. <code>RoleArn</code>s are created using
     *        the <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS
     *        Identity and Access Management (IAM) API action.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The <code>RoleARN</code> that you want to associate with this job. <code>RoleArn</code>s are created using the <a
     * href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS Identity and
     * Access Management (IAM) API action.
     * </p>
     * 
     * @return The <code>RoleARN</code> that you want to associate with this job. <code>RoleArn</code>s are created
     *         using the <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a>
     *         AWS Identity and Access Management (IAM) API action.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The <code>RoleARN</code> that you want to associate with this job. <code>RoleArn</code>s are created using the <a
     * href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS Identity and
     * Access Management (IAM) API action.
     * </p>
     * 
     * @param roleARN
     *        The <code>RoleARN</code> that you want to associate with this job. <code>RoleArn</code>s are created using
     *        the <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS
     *        Identity and Access Management (IAM) API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * If your job is being created in one of the US regions, you have the option of specifying what size Snowball you'd
     * like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * 
     * @param snowballCapacityPreference
     *        If your job is being created in one of the US regions, you have the option of specifying what size
     *        Snowball you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * @see SnowballCapacity
     */

    public void setSnowballCapacityPreference(String snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference;
    }

    /**
     * <p>
     * If your job is being created in one of the US regions, you have the option of specifying what size Snowball you'd
     * like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * 
     * @return If your job is being created in one of the US regions, you have the option of specifying what size
     *         Snowball you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * @see SnowballCapacity
     */

    public String getSnowballCapacityPreference() {
        return this.snowballCapacityPreference;
    }

    /**
     * <p>
     * If your job is being created in one of the US regions, you have the option of specifying what size Snowball you'd
     * like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * 
     * @param snowballCapacityPreference
     *        If your job is being created in one of the US regions, you have the option of specifying what size
     *        Snowball you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballCapacity
     */

    public CreateJobRequest withSnowballCapacityPreference(String snowballCapacityPreference) {
        setSnowballCapacityPreference(snowballCapacityPreference);
        return this;
    }

    /**
     * <p>
     * If your job is being created in one of the US regions, you have the option of specifying what size Snowball you'd
     * like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * 
     * @param snowballCapacityPreference
     *        If your job is being created in one of the US regions, you have the option of specifying what size
     *        Snowball you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * @see SnowballCapacity
     */

    public void setSnowballCapacityPreference(SnowballCapacity snowballCapacityPreference) {
        withSnowballCapacityPreference(snowballCapacityPreference);
    }

    /**
     * <p>
     * If your job is being created in one of the US regions, you have the option of specifying what size Snowball you'd
     * like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * 
     * @param snowballCapacityPreference
     *        If your job is being created in one of the US regions, you have the option of specifying what size
     *        Snowball you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballCapacity
     */

    public CreateJobRequest withSnowballCapacityPreference(SnowballCapacity snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference.toString();
        return this;
    }

    /**
     * <p>
     * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snowball, rather it
     * represents how quickly the Snowball moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the US, you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * 
     * @param shippingOption
     *        The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snowball, rather it
     *        represents how quickly the Snowball moves to its destination while in transit. Regional shipping speeds
     *        are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in
     *        about a day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     *        delivered in about a day. In addition, most countries in the EU have access to standard shipping, which
     *        typically takes less than a week, one way.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In India, Snowballs are delivered in one to seven days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the US, you have access to one-day shipping and two-day shipping.
     *        </p>
     *        </li>
     * @see ShippingOption
     */

    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }

    /**
     * <p>
     * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snowball, rather it
     * represents how quickly the Snowball moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the US, you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snowball, rather it
     *         represents how quickly the Snowball moves to its destination while in transit. Regional shipping speeds
     *         are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in
     *         about a day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     *         delivered in about a day. In addition, most countries in the EU have access to standard shipping, which
     *         typically takes less than a week, one way.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In India, Snowballs are delivered in one to seven days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the US, you have access to one-day shipping and two-day shipping.
     *         </p>
     *         </li>
     * @see ShippingOption
     */

    public String getShippingOption() {
        return this.shippingOption;
    }

    /**
     * <p>
     * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snowball, rather it
     * represents how quickly the Snowball moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the US, you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * 
     * @param shippingOption
     *        The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snowball, rather it
     *        represents how quickly the Snowball moves to its destination while in transit. Regional shipping speeds
     *        are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in
     *        about a day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     *        delivered in about a day. In addition, most countries in the EU have access to standard shipping, which
     *        typically takes less than a week, one way.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In India, Snowballs are delivered in one to seven days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the US, you have access to one-day shipping and two-day shipping.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShippingOption
     */

    public CreateJobRequest withShippingOption(String shippingOption) {
        setShippingOption(shippingOption);
        return this;
    }

    /**
     * <p>
     * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snowball, rather it
     * represents how quickly the Snowball moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the US, you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * 
     * @param shippingOption
     *        The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snowball, rather it
     *        represents how quickly the Snowball moves to its destination while in transit. Regional shipping speeds
     *        are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in
     *        about a day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     *        delivered in about a day. In addition, most countries in the EU have access to standard shipping, which
     *        typically takes less than a week, one way.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In India, Snowballs are delivered in one to seven days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the US, you have access to one-day shipping and two-day shipping.
     *        </p>
     *        </li>
     * @see ShippingOption
     */

    public void setShippingOption(ShippingOption shippingOption) {
        withShippingOption(shippingOption);
    }

    /**
     * <p>
     * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snowball, rather it
     * represents how quickly the Snowball moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the US, you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * 
     * @param shippingOption
     *        The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snowball, rather it
     *        represents how quickly the Snowball moves to its destination while in transit. Regional shipping speeds
     *        are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in
     *        about a day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     *        delivered in about a day. In addition, most countries in the EU have access to standard shipping, which
     *        typically takes less than a week, one way.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In India, Snowballs are delivered in one to seven days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the US, you have access to one-day shipping and two-day shipping.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShippingOption
     */

    public CreateJobRequest withShippingOption(ShippingOption shippingOption) {
        this.shippingOption = shippingOption.toString();
        return this;
    }

    /**
     * <p>
     * Defines the Amazon Simple Notification Service (Amazon SNS) notification settings for this job.
     * </p>
     * 
     * @param notification
     *        Defines the Amazon Simple Notification Service (Amazon SNS) notification settings for this job.
     */

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * Defines the Amazon Simple Notification Service (Amazon SNS) notification settings for this job.
     * </p>
     * 
     * @return Defines the Amazon Simple Notification Service (Amazon SNS) notification settings for this job.
     */

    public Notification getNotification() {
        return this.notification;
    }

    /**
     * <p>
     * Defines the Amazon Simple Notification Service (Amazon SNS) notification settings for this job.
     * </p>
     * 
     * @param notification
     *        Defines the Amazon Simple Notification Service (Amazon SNS) notification settings for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withNotification(Notification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * <p>
     * The ID of a cluster. If you're creating a job for a node in a cluster, you need to provide only this
     * <code>clusterId</code> value. The other job attributes are inherited from the cluster.
     * </p>
     * 
     * @param clusterId
     *        The ID of a cluster. If you're creating a job for a node in a cluster, you need to provide only this
     *        <code>clusterId</code> value. The other job attributes are inherited from the cluster.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The ID of a cluster. If you're creating a job for a node in a cluster, you need to provide only this
     * <code>clusterId</code> value. The other job attributes are inherited from the cluster.
     * </p>
     * 
     * @return The ID of a cluster. If you're creating a job for a node in a cluster, you need to provide only this
     *         <code>clusterId</code> value. The other job attributes are inherited from the cluster.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The ID of a cluster. If you're creating a job for a node in a cluster, you need to provide only this
     * <code>clusterId</code> value. The other job attributes are inherited from the cluster.
     * </p>
     * 
     * @param clusterId
     *        The ID of a cluster. If you're creating a job for a node in a cluster, you need to provide only this
     *        <code>clusterId</code> value. The other job attributes are inherited from the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this job. The only supported device types for cluster jobs are
     * <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snowball device to use for this job. The only supported device types for cluster jobs are
     *        <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * @see SnowballType
     */

    public void setSnowballType(String snowballType) {
        this.snowballType = snowballType;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this job. The only supported device types for cluster jobs are
     * <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * </p>
     * 
     * @return The type of AWS Snowball device to use for this job. The only supported device types for cluster jobs are
     *         <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * @see SnowballType
     */

    public String getSnowballType() {
        return this.snowballType;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this job. The only supported device types for cluster jobs are
     * <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snowball device to use for this job. The only supported device types for cluster jobs are
     *        <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballType
     */

    public CreateJobRequest withSnowballType(String snowballType) {
        setSnowballType(snowballType);
        return this;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this job. The only supported device types for cluster jobs are
     * <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snowball device to use for this job. The only supported device types for cluster jobs are
     *        <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * @see SnowballType
     */

    public void setSnowballType(SnowballType snowballType) {
        withSnowballType(snowballType);
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this job. The only supported device types for cluster jobs are
     * <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snowball device to use for this job. The only supported device types for cluster jobs are
     *        <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballType
     */

    public CreateJobRequest withSnowballType(SnowballType snowballType) {
        this.snowballType = snowballType.toString();
        return this;
    }

    /**
     * <p>
     * The forwarding address ID for a job. This field is not supported in most regions.
     * </p>
     * 
     * @param forwardingAddressId
     *        The forwarding address ID for a job. This field is not supported in most regions.
     */

    public void setForwardingAddressId(String forwardingAddressId) {
        this.forwardingAddressId = forwardingAddressId;
    }

    /**
     * <p>
     * The forwarding address ID for a job. This field is not supported in most regions.
     * </p>
     * 
     * @return The forwarding address ID for a job. This field is not supported in most regions.
     */

    public String getForwardingAddressId() {
        return this.forwardingAddressId;
    }

    /**
     * <p>
     * The forwarding address ID for a job. This field is not supported in most regions.
     * </p>
     * 
     * @param forwardingAddressId
     *        The forwarding address ID for a job. This field is not supported in most regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withForwardingAddressId(String forwardingAddressId) {
        setForwardingAddressId(forwardingAddressId);
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
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAddressId() != null)
            sb.append("AddressId: ").append(getAddressId()).append(",");
        if (getKmsKeyARN() != null)
            sb.append("KmsKeyARN: ").append(getKmsKeyARN()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getSnowballCapacityPreference() != null)
            sb.append("SnowballCapacityPreference: ").append(getSnowballCapacityPreference()).append(",");
        if (getShippingOption() != null)
            sb.append("ShippingOption: ").append(getShippingOption()).append(",");
        if (getNotification() != null)
            sb.append("Notification: ").append(getNotification()).append(",");
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getSnowballType() != null)
            sb.append("SnowballType: ").append(getSnowballType()).append(",");
        if (getForwardingAddressId() != null)
            sb.append("ForwardingAddressId: ").append(getForwardingAddressId());
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
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAddressId() == null ^ this.getAddressId() == null)
            return false;
        if (other.getAddressId() != null && other.getAddressId().equals(this.getAddressId()) == false)
            return false;
        if (other.getKmsKeyARN() == null ^ this.getKmsKeyARN() == null)
            return false;
        if (other.getKmsKeyARN() != null && other.getKmsKeyARN().equals(this.getKmsKeyARN()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getSnowballCapacityPreference() == null ^ this.getSnowballCapacityPreference() == null)
            return false;
        if (other.getSnowballCapacityPreference() != null && other.getSnowballCapacityPreference().equals(this.getSnowballCapacityPreference()) == false)
            return false;
        if (other.getShippingOption() == null ^ this.getShippingOption() == null)
            return false;
        if (other.getShippingOption() != null && other.getShippingOption().equals(this.getShippingOption()) == false)
            return false;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null && other.getNotification().equals(this.getNotification()) == false)
            return false;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getSnowballType() == null ^ this.getSnowballType() == null)
            return false;
        if (other.getSnowballType() != null && other.getSnowballType().equals(this.getSnowballType()) == false)
            return false;
        if (other.getForwardingAddressId() == null ^ this.getForwardingAddressId() == null)
            return false;
        if (other.getForwardingAddressId() != null && other.getForwardingAddressId().equals(this.getForwardingAddressId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyARN() == null) ? 0 : getKmsKeyARN().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getSnowballCapacityPreference() == null) ? 0 : getSnowballCapacityPreference().hashCode());
        hashCode = prime * hashCode + ((getShippingOption() == null) ? 0 : getShippingOption().hashCode());
        hashCode = prime * hashCode + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getSnowballType() == null) ? 0 : getSnowballType().hashCode());
        hashCode = prime * hashCode + ((getForwardingAddressId() == null) ? 0 : getForwardingAddressId().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobRequest clone() {
        return (CreateJobRequest) super.clone();
    }

}

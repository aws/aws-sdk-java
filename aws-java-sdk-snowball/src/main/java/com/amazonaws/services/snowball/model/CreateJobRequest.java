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
     * Specifies the service or services on the Snow Family device that your transferred data will be exported from or
     * imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
     * </p>
     */
    private OnDeviceServiceConfiguration onDeviceServiceConfiguration;
    /**
     * <p>
     * Defines an optional description of this specific job, for example <code>Important Photos 2016-08-11</code>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID for the address that you want the Snow device shipped to.
     * </p>
     */
    private String addressId;
    /**
     * <p>
     * The <code>KmsKeyARN</code> that you want to associate with this job. <code>KmsKeyARN</code>s are created using
     * the <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> AWS Key
     * Management Service (KMS) API action.
     * </p>
     */
    private String kmsKeyARN;
    /**
     * <p>
     * The <code>RoleARN</code> that you want to associate with this job. <code>RoleArn</code>s are created using the <a
     * href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS Identity and
     * Access Management (IAM) API action.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * If your job is being created in one of the US regions, you have the option of specifying what size Snow device
     * you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * <p>
     * For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html"
     * (Snow Family Devices and Capacity) in the <i>Snowcone User Guide</i> or
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and
     * Capacity) in the <i>Snowcone User Guide</i>.
     * </p>
     */
    private String snowballCapacityPreference;
    /**
     * <p>
     * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snow device, rather it
     * represents how quickly the Snow device moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered in about
     * a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snow devices are delivered in one to seven days.
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
     * The type of AWS Snow Family device to use for this job.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snow Family currently supports only the <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * The type of AWS Snow device to use for this job. Currently, the only supported device type for cluster jobs is
     * <code>EDGE</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html">Snowball Edge Device
     * Options</a> in the Snowball Edge Developer Guide.
     * </p>
     * <p>
     * For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html"
     * (Snow Family Devices and Capacity) in the <i>Snowcone User Guide</i> or
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and
     * Capacity) in the <i>Snowcone User Guide</i>.
     * </p>
     */
    private String snowballType;
    /**
     * <p>
     * The forwarding address ID for a job. This field is not supported in most Regions.
     * </p>
     */
    private String forwardingAddressId;
    /**
     * <p>
     * The tax documents required in your AWS Region.
     * </p>
     */
    private TaxDocuments taxDocuments;
    /**
     * <p>
     * Defines the device configuration for an AWS Snowcone job.
     * </p>
     * <p>
     * For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html"
     * (Snow Family Devices and Capacity) in the <i>Snowcone User Guide</i> or
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and
     * Capacity) in the <i>Snowcone User Guide</i>.
     * </p>
     */
    private DeviceConfiguration deviceConfiguration;
    /**
     * <p>
     * Allows you to securely operate and manage Snowcone devices remotely from outside of your internal network. When
     * set to <code>INSTALLED_AUTOSTART</code>, remote management will automatically be available when the device
     * arrives at your location. Otherwise, you need to use the Snowball Client to manage the device.
     * </p>
     */
    private String remoteManagement;
    /**
     * <p>
     * The ID of the long-term pricing type for the device.
     * </p>
     */
    private String longTermPricingId;

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
     * Specifies the service or services on the Snow Family device that your transferred data will be exported from or
     * imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
     * </p>
     * 
     * @param onDeviceServiceConfiguration
     *        Specifies the service or services on the Snow Family device that your transferred data will be exported
     *        from or imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
     */

    public void setOnDeviceServiceConfiguration(OnDeviceServiceConfiguration onDeviceServiceConfiguration) {
        this.onDeviceServiceConfiguration = onDeviceServiceConfiguration;
    }

    /**
     * <p>
     * Specifies the service or services on the Snow Family device that your transferred data will be exported from or
     * imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
     * </p>
     * 
     * @return Specifies the service or services on the Snow Family device that your transferred data will be exported
     *         from or imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
     */

    public OnDeviceServiceConfiguration getOnDeviceServiceConfiguration() {
        return this.onDeviceServiceConfiguration;
    }

    /**
     * <p>
     * Specifies the service or services on the Snow Family device that your transferred data will be exported from or
     * imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
     * </p>
     * 
     * @param onDeviceServiceConfiguration
     *        Specifies the service or services on the Snow Family device that your transferred data will be exported
     *        from or imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withOnDeviceServiceConfiguration(OnDeviceServiceConfiguration onDeviceServiceConfiguration) {
        setOnDeviceServiceConfiguration(onDeviceServiceConfiguration);
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
     * The ID for the address that you want the Snow device shipped to.
     * </p>
     * 
     * @param addressId
     *        The ID for the address that you want the Snow device shipped to.
     */

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * <p>
     * The ID for the address that you want the Snow device shipped to.
     * </p>
     * 
     * @return The ID for the address that you want the Snow device shipped to.
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     * <p>
     * The ID for the address that you want the Snow device shipped to.
     * </p>
     * 
     * @param addressId
     *        The ID for the address that you want the Snow device shipped to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withAddressId(String addressId) {
        setAddressId(addressId);
        return this;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> that you want to associate with this job. <code>KmsKeyARN</code>s are created using
     * the <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> AWS Key
     * Management Service (KMS) API action.
     * </p>
     * 
     * @param kmsKeyARN
     *        The <code>KmsKeyARN</code> that you want to associate with this job. <code>KmsKeyARN</code>s are created
     *        using the <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a>
     *        AWS Key Management Service (KMS) API action.
     */

    public void setKmsKeyARN(String kmsKeyARN) {
        this.kmsKeyARN = kmsKeyARN;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> that you want to associate with this job. <code>KmsKeyARN</code>s are created using
     * the <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> AWS Key
     * Management Service (KMS) API action.
     * </p>
     * 
     * @return The <code>KmsKeyARN</code> that you want to associate with this job. <code>KmsKeyARN</code>s are created
     *         using the <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a>
     *         AWS Key Management Service (KMS) API action.
     */

    public String getKmsKeyARN() {
        return this.kmsKeyARN;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> that you want to associate with this job. <code>KmsKeyARN</code>s are created using
     * the <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> AWS Key
     * Management Service (KMS) API action.
     * </p>
     * 
     * @param kmsKeyARN
     *        The <code>KmsKeyARN</code> that you want to associate with this job. <code>KmsKeyARN</code>s are created
     *        using the <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a>
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
     * href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS Identity and
     * Access Management (IAM) API action.
     * </p>
     * 
     * @param roleARN
     *        The <code>RoleARN</code> that you want to associate with this job. <code>RoleArn</code>s are created using
     *        the <a href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS
     *        Identity and Access Management (IAM) API action.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The <code>RoleARN</code> that you want to associate with this job. <code>RoleArn</code>s are created using the <a
     * href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS Identity and
     * Access Management (IAM) API action.
     * </p>
     * 
     * @return The <code>RoleARN</code> that you want to associate with this job. <code>RoleArn</code>s are created
     *         using the <a
     *         href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS
     *         Identity and Access Management (IAM) API action.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The <code>RoleARN</code> that you want to associate with this job. <code>RoleArn</code>s are created using the <a
     * href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS Identity and
     * Access Management (IAM) API action.
     * </p>
     * 
     * @param roleARN
     *        The <code>RoleARN</code> that you want to associate with this job. <code>RoleArn</code>s are created using
     *        the <a href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS
     *        Identity and Access Management (IAM) API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * If your job is being created in one of the US regions, you have the option of specifying what size Snow device
     * you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * <p>
     * For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html"
     * (Snow Family Devices and Capacity) in the <i>Snowcone User Guide</i> or
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and
     * Capacity) in the <i>Snowcone User Guide</i>.
     * </p>
     * 
     * @param snowballCapacityPreference
     *        If your job is being created in one of the US regions, you have the option of specifying what size Snow
     *        device you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.</p>
     *        <p>
     *        For more information, see
     *        "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i> or
     *        "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i>.
     * @see SnowballCapacity
     */

    public void setSnowballCapacityPreference(String snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference;
    }

    /**
     * <p>
     * If your job is being created in one of the US regions, you have the option of specifying what size Snow device
     * you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * <p>
     * For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html"
     * (Snow Family Devices and Capacity) in the <i>Snowcone User Guide</i> or
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and
     * Capacity) in the <i>Snowcone User Guide</i>.
     * </p>
     * 
     * @return If your job is being created in one of the US regions, you have the option of specifying what size Snow
     *         device you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.</p>
     *         <p>
     *         For more information, see
     *         "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices
     *         and Capacity) in the <i>Snowcone User Guide</i> or
     *         "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices
     *         and Capacity) in the <i>Snowcone User Guide</i>.
     * @see SnowballCapacity
     */

    public String getSnowballCapacityPreference() {
        return this.snowballCapacityPreference;
    }

    /**
     * <p>
     * If your job is being created in one of the US regions, you have the option of specifying what size Snow device
     * you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * <p>
     * For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html"
     * (Snow Family Devices and Capacity) in the <i>Snowcone User Guide</i> or
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and
     * Capacity) in the <i>Snowcone User Guide</i>.
     * </p>
     * 
     * @param snowballCapacityPreference
     *        If your job is being created in one of the US regions, you have the option of specifying what size Snow
     *        device you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.</p>
     *        <p>
     *        For more information, see
     *        "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i> or
     *        "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballCapacity
     */

    public CreateJobRequest withSnowballCapacityPreference(String snowballCapacityPreference) {
        setSnowballCapacityPreference(snowballCapacityPreference);
        return this;
    }

    /**
     * <p>
     * If your job is being created in one of the US regions, you have the option of specifying what size Snow device
     * you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * <p>
     * For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html"
     * (Snow Family Devices and Capacity) in the <i>Snowcone User Guide</i> or
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and
     * Capacity) in the <i>Snowcone User Guide</i>.
     * </p>
     * 
     * @param snowballCapacityPreference
     *        If your job is being created in one of the US regions, you have the option of specifying what size Snow
     *        device you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.</p>
     *        <p>
     *        For more information, see
     *        "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i> or
     *        "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i>.
     * @see SnowballCapacity
     */

    public void setSnowballCapacityPreference(SnowballCapacity snowballCapacityPreference) {
        withSnowballCapacityPreference(snowballCapacityPreference);
    }

    /**
     * <p>
     * If your job is being created in one of the US regions, you have the option of specifying what size Snow device
     * you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * <p>
     * For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html"
     * (Snow Family Devices and Capacity) in the <i>Snowcone User Guide</i> or
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and
     * Capacity) in the <i>Snowcone User Guide</i>.
     * </p>
     * 
     * @param snowballCapacityPreference
     *        If your job is being created in one of the US regions, you have the option of specifying what size Snow
     *        device you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.</p>
     *        <p>
     *        For more information, see
     *        "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i> or
     *        "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballCapacity
     */

    public CreateJobRequest withSnowballCapacityPreference(SnowballCapacity snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference.toString();
        return this;
    }

    /**
     * <p>
     * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snow device, rather it
     * represents how quickly the Snow device moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered in about
     * a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snow devices are delivered in one to seven days.
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
     *        The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snow device, rather it
     *        represents how quickly the Snow device moves to its destination while in transit. Regional shipping speeds
     *        are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered
     *        in about a day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express
     *        are delivered in about a day. In addition, most countries in the EU have access to standard shipping,
     *        which typically takes less than a week, one way.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In India, Snow devices are delivered in one to seven days.
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
     * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snow device, rather it
     * represents how quickly the Snow device moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered in about
     * a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snow devices are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the US, you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snow device, rather
     *         it represents how quickly the Snow device moves to its destination while in transit. Regional shipping
     *         speeds are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered
     *         in about a day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express
     *         are delivered in about a day. In addition, most countries in the EU have access to standard shipping,
     *         which typically takes less than a week, one way.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In India, Snow devices are delivered in one to seven days.
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
     * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snow device, rather it
     * represents how quickly the Snow device moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered in about
     * a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snow devices are delivered in one to seven days.
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
     *        The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snow device, rather it
     *        represents how quickly the Snow device moves to its destination while in transit. Regional shipping speeds
     *        are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered
     *        in about a day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express
     *        are delivered in about a day. In addition, most countries in the EU have access to standard shipping,
     *        which typically takes less than a week, one way.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In India, Snow devices are delivered in one to seven days.
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
     * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snow device, rather it
     * represents how quickly the Snow device moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered in about
     * a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snow devices are delivered in one to seven days.
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
     *        The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snow device, rather it
     *        represents how quickly the Snow device moves to its destination while in transit. Regional shipping speeds
     *        are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered
     *        in about a day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express
     *        are delivered in about a day. In addition, most countries in the EU have access to standard shipping,
     *        which typically takes less than a week, one way.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In India, Snow devices are delivered in one to seven days.
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
     * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snow device, rather it
     * represents how quickly the Snow device moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered in about
     * a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snow devices are delivered in one to seven days.
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
     *        The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snow device, rather it
     *        represents how quickly the Snow device moves to its destination while in transit. Regional shipping speeds
     *        are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered
     *        in about a day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express
     *        are delivered in about a day. In addition, most countries in the EU have access to standard shipping,
     *        which typically takes less than a week, one way.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In India, Snow devices are delivered in one to seven days.
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
     * The type of AWS Snow Family device to use for this job.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snow Family currently supports only the <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * The type of AWS Snow device to use for this job. Currently, the only supported device type for cluster jobs is
     * <code>EDGE</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html">Snowball Edge Device
     * Options</a> in the Snowball Edge Developer Guide.
     * </p>
     * <p>
     * For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html"
     * (Snow Family Devices and Capacity) in the <i>Snowcone User Guide</i> or
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and
     * Capacity) in the <i>Snowcone User Guide</i>.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snow Family device to use for this job. </p> <note>
     *        <p>
     *        For cluster jobs, AWS Snow Family currently supports only the <code>EDGE</code> device type.
     *        </p>
     *        </note>
     *        <p>
     *        The type of AWS Snow device to use for this job. Currently, the only supported device type for cluster
     *        jobs is <code>EDGE</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html">Snowball Edge
     *        Device Options</a> in the Snowball Edge Developer Guide.
     *        </p>
     *        <p>
     *        For more information, see
     *        "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i> or
     *        "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i>.
     * @see SnowballType
     */

    public void setSnowballType(String snowballType) {
        this.snowballType = snowballType;
    }

    /**
     * <p>
     * The type of AWS Snow Family device to use for this job.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snow Family currently supports only the <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * The type of AWS Snow device to use for this job. Currently, the only supported device type for cluster jobs is
     * <code>EDGE</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html">Snowball Edge Device
     * Options</a> in the Snowball Edge Developer Guide.
     * </p>
     * <p>
     * For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html"
     * (Snow Family Devices and Capacity) in the <i>Snowcone User Guide</i> or
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and
     * Capacity) in the <i>Snowcone User Guide</i>.
     * </p>
     * 
     * @return The type of AWS Snow Family device to use for this job. </p> <note>
     *         <p>
     *         For cluster jobs, AWS Snow Family currently supports only the <code>EDGE</code> device type.
     *         </p>
     *         </note>
     *         <p>
     *         The type of AWS Snow device to use for this job. Currently, the only supported device type for cluster
     *         jobs is <code>EDGE</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html">Snowball Edge
     *         Device Options</a> in the Snowball Edge Developer Guide.
     *         </p>
     *         <p>
     *         For more information, see
     *         "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices
     *         and Capacity) in the <i>Snowcone User Guide</i> or
     *         "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices
     *         and Capacity) in the <i>Snowcone User Guide</i>.
     * @see SnowballType
     */

    public String getSnowballType() {
        return this.snowballType;
    }

    /**
     * <p>
     * The type of AWS Snow Family device to use for this job.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snow Family currently supports only the <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * The type of AWS Snow device to use for this job. Currently, the only supported device type for cluster jobs is
     * <code>EDGE</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html">Snowball Edge Device
     * Options</a> in the Snowball Edge Developer Guide.
     * </p>
     * <p>
     * For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html"
     * (Snow Family Devices and Capacity) in the <i>Snowcone User Guide</i> or
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and
     * Capacity) in the <i>Snowcone User Guide</i>.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snow Family device to use for this job. </p> <note>
     *        <p>
     *        For cluster jobs, AWS Snow Family currently supports only the <code>EDGE</code> device type.
     *        </p>
     *        </note>
     *        <p>
     *        The type of AWS Snow device to use for this job. Currently, the only supported device type for cluster
     *        jobs is <code>EDGE</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html">Snowball Edge
     *        Device Options</a> in the Snowball Edge Developer Guide.
     *        </p>
     *        <p>
     *        For more information, see
     *        "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i> or
     *        "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballType
     */

    public CreateJobRequest withSnowballType(String snowballType) {
        setSnowballType(snowballType);
        return this;
    }

    /**
     * <p>
     * The type of AWS Snow Family device to use for this job.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snow Family currently supports only the <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * The type of AWS Snow device to use for this job. Currently, the only supported device type for cluster jobs is
     * <code>EDGE</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html">Snowball Edge Device
     * Options</a> in the Snowball Edge Developer Guide.
     * </p>
     * <p>
     * For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html"
     * (Snow Family Devices and Capacity) in the <i>Snowcone User Guide</i> or
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and
     * Capacity) in the <i>Snowcone User Guide</i>.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snow Family device to use for this job. </p> <note>
     *        <p>
     *        For cluster jobs, AWS Snow Family currently supports only the <code>EDGE</code> device type.
     *        </p>
     *        </note>
     *        <p>
     *        The type of AWS Snow device to use for this job. Currently, the only supported device type for cluster
     *        jobs is <code>EDGE</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html">Snowball Edge
     *        Device Options</a> in the Snowball Edge Developer Guide.
     *        </p>
     *        <p>
     *        For more information, see
     *        "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i> or
     *        "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i>.
     * @see SnowballType
     */

    public void setSnowballType(SnowballType snowballType) {
        withSnowballType(snowballType);
    }

    /**
     * <p>
     * The type of AWS Snow Family device to use for this job.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snow Family currently supports only the <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * The type of AWS Snow device to use for this job. Currently, the only supported device type for cluster jobs is
     * <code>EDGE</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html">Snowball Edge Device
     * Options</a> in the Snowball Edge Developer Guide.
     * </p>
     * <p>
     * For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html"
     * (Snow Family Devices and Capacity) in the <i>Snowcone User Guide</i> or
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and
     * Capacity) in the <i>Snowcone User Guide</i>.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snow Family device to use for this job. </p> <note>
     *        <p>
     *        For cluster jobs, AWS Snow Family currently supports only the <code>EDGE</code> device type.
     *        </p>
     *        </note>
     *        <p>
     *        The type of AWS Snow device to use for this job. Currently, the only supported device type for cluster
     *        jobs is <code>EDGE</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html">Snowball Edge
     *        Device Options</a> in the Snowball Edge Developer Guide.
     *        </p>
     *        <p>
     *        For more information, see
     *        "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i> or
     *        "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballType
     */

    public CreateJobRequest withSnowballType(SnowballType snowballType) {
        this.snowballType = snowballType.toString();
        return this;
    }

    /**
     * <p>
     * The forwarding address ID for a job. This field is not supported in most Regions.
     * </p>
     * 
     * @param forwardingAddressId
     *        The forwarding address ID for a job. This field is not supported in most Regions.
     */

    public void setForwardingAddressId(String forwardingAddressId) {
        this.forwardingAddressId = forwardingAddressId;
    }

    /**
     * <p>
     * The forwarding address ID for a job. This field is not supported in most Regions.
     * </p>
     * 
     * @return The forwarding address ID for a job. This field is not supported in most Regions.
     */

    public String getForwardingAddressId() {
        return this.forwardingAddressId;
    }

    /**
     * <p>
     * The forwarding address ID for a job. This field is not supported in most Regions.
     * </p>
     * 
     * @param forwardingAddressId
     *        The forwarding address ID for a job. This field is not supported in most Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withForwardingAddressId(String forwardingAddressId) {
        setForwardingAddressId(forwardingAddressId);
        return this;
    }

    /**
     * <p>
     * The tax documents required in your AWS Region.
     * </p>
     * 
     * @param taxDocuments
     *        The tax documents required in your AWS Region.
     */

    public void setTaxDocuments(TaxDocuments taxDocuments) {
        this.taxDocuments = taxDocuments;
    }

    /**
     * <p>
     * The tax documents required in your AWS Region.
     * </p>
     * 
     * @return The tax documents required in your AWS Region.
     */

    public TaxDocuments getTaxDocuments() {
        return this.taxDocuments;
    }

    /**
     * <p>
     * The tax documents required in your AWS Region.
     * </p>
     * 
     * @param taxDocuments
     *        The tax documents required in your AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withTaxDocuments(TaxDocuments taxDocuments) {
        setTaxDocuments(taxDocuments);
        return this;
    }

    /**
     * <p>
     * Defines the device configuration for an AWS Snowcone job.
     * </p>
     * <p>
     * For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html"
     * (Snow Family Devices and Capacity) in the <i>Snowcone User Guide</i> or
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and
     * Capacity) in the <i>Snowcone User Guide</i>.
     * </p>
     * 
     * @param deviceConfiguration
     *        Defines the device configuration for an AWS Snowcone job.</p>
     *        <p>
     *        For more information, see
     *        "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i> or
     *        "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i>.
     */

    public void setDeviceConfiguration(DeviceConfiguration deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
    }

    /**
     * <p>
     * Defines the device configuration for an AWS Snowcone job.
     * </p>
     * <p>
     * For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html"
     * (Snow Family Devices and Capacity) in the <i>Snowcone User Guide</i> or
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and
     * Capacity) in the <i>Snowcone User Guide</i>.
     * </p>
     * 
     * @return Defines the device configuration for an AWS Snowcone job.</p>
     *         <p>
     *         For more information, see
     *         "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices
     *         and Capacity) in the <i>Snowcone User Guide</i> or
     *         "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices
     *         and Capacity) in the <i>Snowcone User Guide</i>.
     */

    public DeviceConfiguration getDeviceConfiguration() {
        return this.deviceConfiguration;
    }

    /**
     * <p>
     * Defines the device configuration for an AWS Snowcone job.
     * </p>
     * <p>
     * For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html"
     * (Snow Family Devices and Capacity) in the <i>Snowcone User Guide</i> or
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and
     * Capacity) in the <i>Snowcone User Guide</i>.
     * </p>
     * 
     * @param deviceConfiguration
     *        Defines the device configuration for an AWS Snowcone job.</p>
     *        <p>
     *        For more information, see
     *        "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i> or
     *        "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices
     *        and Capacity) in the <i>Snowcone User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withDeviceConfiguration(DeviceConfiguration deviceConfiguration) {
        setDeviceConfiguration(deviceConfiguration);
        return this;
    }

    /**
     * <p>
     * Allows you to securely operate and manage Snowcone devices remotely from outside of your internal network. When
     * set to <code>INSTALLED_AUTOSTART</code>, remote management will automatically be available when the device
     * arrives at your location. Otherwise, you need to use the Snowball Client to manage the device.
     * </p>
     * 
     * @param remoteManagement
     *        Allows you to securely operate and manage Snowcone devices remotely from outside of your internal network.
     *        When set to <code>INSTALLED_AUTOSTART</code>, remote management will automatically be available when the
     *        device arrives at your location. Otherwise, you need to use the Snowball Client to manage the device.
     * @see RemoteManagement
     */

    public void setRemoteManagement(String remoteManagement) {
        this.remoteManagement = remoteManagement;
    }

    /**
     * <p>
     * Allows you to securely operate and manage Snowcone devices remotely from outside of your internal network. When
     * set to <code>INSTALLED_AUTOSTART</code>, remote management will automatically be available when the device
     * arrives at your location. Otherwise, you need to use the Snowball Client to manage the device.
     * </p>
     * 
     * @return Allows you to securely operate and manage Snowcone devices remotely from outside of your internal
     *         network. When set to <code>INSTALLED_AUTOSTART</code>, remote management will automatically be available
     *         when the device arrives at your location. Otherwise, you need to use the Snowball Client to manage the
     *         device.
     * @see RemoteManagement
     */

    public String getRemoteManagement() {
        return this.remoteManagement;
    }

    /**
     * <p>
     * Allows you to securely operate and manage Snowcone devices remotely from outside of your internal network. When
     * set to <code>INSTALLED_AUTOSTART</code>, remote management will automatically be available when the device
     * arrives at your location. Otherwise, you need to use the Snowball Client to manage the device.
     * </p>
     * 
     * @param remoteManagement
     *        Allows you to securely operate and manage Snowcone devices remotely from outside of your internal network.
     *        When set to <code>INSTALLED_AUTOSTART</code>, remote management will automatically be available when the
     *        device arrives at your location. Otherwise, you need to use the Snowball Client to manage the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RemoteManagement
     */

    public CreateJobRequest withRemoteManagement(String remoteManagement) {
        setRemoteManagement(remoteManagement);
        return this;
    }

    /**
     * <p>
     * Allows you to securely operate and manage Snowcone devices remotely from outside of your internal network. When
     * set to <code>INSTALLED_AUTOSTART</code>, remote management will automatically be available when the device
     * arrives at your location. Otherwise, you need to use the Snowball Client to manage the device.
     * </p>
     * 
     * @param remoteManagement
     *        Allows you to securely operate and manage Snowcone devices remotely from outside of your internal network.
     *        When set to <code>INSTALLED_AUTOSTART</code>, remote management will automatically be available when the
     *        device arrives at your location. Otherwise, you need to use the Snowball Client to manage the device.
     * @see RemoteManagement
     */

    public void setRemoteManagement(RemoteManagement remoteManagement) {
        withRemoteManagement(remoteManagement);
    }

    /**
     * <p>
     * Allows you to securely operate and manage Snowcone devices remotely from outside of your internal network. When
     * set to <code>INSTALLED_AUTOSTART</code>, remote management will automatically be available when the device
     * arrives at your location. Otherwise, you need to use the Snowball Client to manage the device.
     * </p>
     * 
     * @param remoteManagement
     *        Allows you to securely operate and manage Snowcone devices remotely from outside of your internal network.
     *        When set to <code>INSTALLED_AUTOSTART</code>, remote management will automatically be available when the
     *        device arrives at your location. Otherwise, you need to use the Snowball Client to manage the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RemoteManagement
     */

    public CreateJobRequest withRemoteManagement(RemoteManagement remoteManagement) {
        this.remoteManagement = remoteManagement.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the long-term pricing type for the device.
     * </p>
     * 
     * @param longTermPricingId
     *        The ID of the long-term pricing type for the device.
     */

    public void setLongTermPricingId(String longTermPricingId) {
        this.longTermPricingId = longTermPricingId;
    }

    /**
     * <p>
     * The ID of the long-term pricing type for the device.
     * </p>
     * 
     * @return The ID of the long-term pricing type for the device.
     */

    public String getLongTermPricingId() {
        return this.longTermPricingId;
    }

    /**
     * <p>
     * The ID of the long-term pricing type for the device.
     * </p>
     * 
     * @param longTermPricingId
     *        The ID of the long-term pricing type for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withLongTermPricingId(String longTermPricingId) {
        setLongTermPricingId(longTermPricingId);
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
        if (getOnDeviceServiceConfiguration() != null)
            sb.append("OnDeviceServiceConfiguration: ").append(getOnDeviceServiceConfiguration()).append(",");
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
            sb.append("ForwardingAddressId: ").append(getForwardingAddressId()).append(",");
        if (getTaxDocuments() != null)
            sb.append("TaxDocuments: ").append(getTaxDocuments()).append(",");
        if (getDeviceConfiguration() != null)
            sb.append("DeviceConfiguration: ").append(getDeviceConfiguration()).append(",");
        if (getRemoteManagement() != null)
            sb.append("RemoteManagement: ").append(getRemoteManagement()).append(",");
        if (getLongTermPricingId() != null)
            sb.append("LongTermPricingId: ").append(getLongTermPricingId());
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
        if (other.getOnDeviceServiceConfiguration() == null ^ this.getOnDeviceServiceConfiguration() == null)
            return false;
        if (other.getOnDeviceServiceConfiguration() != null && other.getOnDeviceServiceConfiguration().equals(this.getOnDeviceServiceConfiguration()) == false)
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
        if (other.getTaxDocuments() == null ^ this.getTaxDocuments() == null)
            return false;
        if (other.getTaxDocuments() != null && other.getTaxDocuments().equals(this.getTaxDocuments()) == false)
            return false;
        if (other.getDeviceConfiguration() == null ^ this.getDeviceConfiguration() == null)
            return false;
        if (other.getDeviceConfiguration() != null && other.getDeviceConfiguration().equals(this.getDeviceConfiguration()) == false)
            return false;
        if (other.getRemoteManagement() == null ^ this.getRemoteManagement() == null)
            return false;
        if (other.getRemoteManagement() != null && other.getRemoteManagement().equals(this.getRemoteManagement()) == false)
            return false;
        if (other.getLongTermPricingId() == null ^ this.getLongTermPricingId() == null)
            return false;
        if (other.getLongTermPricingId() != null && other.getLongTermPricingId().equals(this.getLongTermPricingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getOnDeviceServiceConfiguration() == null) ? 0 : getOnDeviceServiceConfiguration().hashCode());
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
        hashCode = prime * hashCode + ((getTaxDocuments() == null) ? 0 : getTaxDocuments().hashCode());
        hashCode = prime * hashCode + ((getDeviceConfiguration() == null) ? 0 : getDeviceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRemoteManagement() == null) ? 0 : getRemoteManagement().hashCode());
        hashCode = prime * hashCode + ((getLongTermPricingId() == null) ? 0 : getLongTermPricingId().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobRequest clone() {
        return (CreateJobRequest) super.clone();
    }

}

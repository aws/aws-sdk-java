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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CreateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of job for this cluster. Currently, the only job type supported for clusters is <code>LOCAL_USE</code>.
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * The resources associated with the cluster job. These resources include Amazon S3 buckets and optional AWS Lambda
     * functions written in the Python language.
     * </p>
     */
    private JobResource resources;
    /**
     * <p>
     * An optional description of this specific cluster, for example <code>Environmental Data Cluster-01</code>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID for the address that you want the cluster shipped to.
     * </p>
     */
    private String addressId;
    /**
     * <p>
     * The <code>KmsKeyARN</code> value that you want to associate with this cluster. <code>KmsKeyARN</code> values are
     * created by using the <a
     * href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> API action in AWS Key
     * Management Service (AWS KMS).
     * </p>
     */
    private String kmsKeyARN;
    /**
     * <p>
     * The <code>RoleARN</code> that you want to associate with this cluster. <code>RoleArn</code> values are created by
     * using the <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API
     * action in AWS Identity and Access Management (IAM).
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster. The only supported device types for cluster jobs are
     * <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * </p>
     */
    private String snowballType;
    /**
     * <p>
     * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball
     * Edge device, rather it represents how quickly each device moves to its destination while in transit. Regional
     * shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, devices are delivered in one to seven days.
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
     * The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
     * </p>
     */
    private Notification notification;
    /**
     * <p>
     * The forwarding address ID for a cluster. This field is not supported in most regions.
     * </p>
     */
    private String forwardingAddressId;

    /**
     * <p>
     * The type of job for this cluster. Currently, the only job type supported for clusters is <code>LOCAL_USE</code>.
     * </p>
     * 
     * @param jobType
     *        The type of job for this cluster. Currently, the only job type supported for clusters is
     *        <code>LOCAL_USE</code>.
     * @see JobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The type of job for this cluster. Currently, the only job type supported for clusters is <code>LOCAL_USE</code>.
     * </p>
     * 
     * @return The type of job for this cluster. Currently, the only job type supported for clusters is
     *         <code>LOCAL_USE</code>.
     * @see JobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * The type of job for this cluster. Currently, the only job type supported for clusters is <code>LOCAL_USE</code>.
     * </p>
     * 
     * @param jobType
     *        The type of job for this cluster. Currently, the only job type supported for clusters is
     *        <code>LOCAL_USE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public CreateClusterRequest withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * The type of job for this cluster. Currently, the only job type supported for clusters is <code>LOCAL_USE</code>.
     * </p>
     * 
     * @param jobType
     *        The type of job for this cluster. Currently, the only job type supported for clusters is
     *        <code>LOCAL_USE</code>.
     * @see JobType
     */

    public void setJobType(JobType jobType) {
        withJobType(jobType);
    }

    /**
     * <p>
     * The type of job for this cluster. Currently, the only job type supported for clusters is <code>LOCAL_USE</code>.
     * </p>
     * 
     * @param jobType
     *        The type of job for this cluster. Currently, the only job type supported for clusters is
     *        <code>LOCAL_USE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public CreateClusterRequest withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * The resources associated with the cluster job. These resources include Amazon S3 buckets and optional AWS Lambda
     * functions written in the Python language.
     * </p>
     * 
     * @param resources
     *        The resources associated with the cluster job. These resources include Amazon S3 buckets and optional AWS
     *        Lambda functions written in the Python language.
     */

    public void setResources(JobResource resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * The resources associated with the cluster job. These resources include Amazon S3 buckets and optional AWS Lambda
     * functions written in the Python language.
     * </p>
     * 
     * @return The resources associated with the cluster job. These resources include Amazon S3 buckets and optional AWS
     *         Lambda functions written in the Python language.
     */

    public JobResource getResources() {
        return this.resources;
    }

    /**
     * <p>
     * The resources associated with the cluster job. These resources include Amazon S3 buckets and optional AWS Lambda
     * functions written in the Python language.
     * </p>
     * 
     * @param resources
     *        The resources associated with the cluster job. These resources include Amazon S3 buckets and optional AWS
     *        Lambda functions written in the Python language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withResources(JobResource resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * An optional description of this specific cluster, for example <code>Environmental Data Cluster-01</code>.
     * </p>
     * 
     * @param description
     *        An optional description of this specific cluster, for example <code>Environmental Data Cluster-01</code>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of this specific cluster, for example <code>Environmental Data Cluster-01</code>.
     * </p>
     * 
     * @return An optional description of this specific cluster, for example <code>Environmental Data Cluster-01</code>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of this specific cluster, for example <code>Environmental Data Cluster-01</code>.
     * </p>
     * 
     * @param description
     *        An optional description of this specific cluster, for example <code>Environmental Data Cluster-01</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID for the address that you want the cluster shipped to.
     * </p>
     * 
     * @param addressId
     *        The ID for the address that you want the cluster shipped to.
     */

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * <p>
     * The ID for the address that you want the cluster shipped to.
     * </p>
     * 
     * @return The ID for the address that you want the cluster shipped to.
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     * <p>
     * The ID for the address that you want the cluster shipped to.
     * </p>
     * 
     * @param addressId
     *        The ID for the address that you want the cluster shipped to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withAddressId(String addressId) {
        setAddressId(addressId);
        return this;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> value that you want to associate with this cluster. <code>KmsKeyARN</code> values are
     * created by using the <a
     * href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> API action in AWS Key
     * Management Service (AWS KMS).
     * </p>
     * 
     * @param kmsKeyARN
     *        The <code>KmsKeyARN</code> value that you want to associate with this cluster. <code>KmsKeyARN</code>
     *        values are created by using the <a
     *        href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> API action in
     *        AWS Key Management Service (AWS KMS).
     */

    public void setKmsKeyARN(String kmsKeyARN) {
        this.kmsKeyARN = kmsKeyARN;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> value that you want to associate with this cluster. <code>KmsKeyARN</code> values are
     * created by using the <a
     * href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> API action in AWS Key
     * Management Service (AWS KMS).
     * </p>
     * 
     * @return The <code>KmsKeyARN</code> value that you want to associate with this cluster. <code>KmsKeyARN</code>
     *         values are created by using the <a
     *         href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> API action in
     *         AWS Key Management Service (AWS KMS).
     */

    public String getKmsKeyARN() {
        return this.kmsKeyARN;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> value that you want to associate with this cluster. <code>KmsKeyARN</code> values are
     * created by using the <a
     * href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> API action in AWS Key
     * Management Service (AWS KMS).
     * </p>
     * 
     * @param kmsKeyARN
     *        The <code>KmsKeyARN</code> value that you want to associate with this cluster. <code>KmsKeyARN</code>
     *        values are created by using the <a
     *        href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> API action in
     *        AWS Key Management Service (AWS KMS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withKmsKeyARN(String kmsKeyARN) {
        setKmsKeyARN(kmsKeyARN);
        return this;
    }

    /**
     * <p>
     * The <code>RoleARN</code> that you want to associate with this cluster. <code>RoleArn</code> values are created by
     * using the <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API
     * action in AWS Identity and Access Management (IAM).
     * </p>
     * 
     * @param roleARN
     *        The <code>RoleARN</code> that you want to associate with this cluster. <code>RoleArn</code> values are
     *        created by using the <a
     *        href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action in
     *        AWS Identity and Access Management (IAM).
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The <code>RoleARN</code> that you want to associate with this cluster. <code>RoleArn</code> values are created by
     * using the <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API
     * action in AWS Identity and Access Management (IAM).
     * </p>
     * 
     * @return The <code>RoleARN</code> that you want to associate with this cluster. <code>RoleArn</code> values are
     *         created by using the <a
     *         href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action
     *         in AWS Identity and Access Management (IAM).
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The <code>RoleARN</code> that you want to associate with this cluster. <code>RoleArn</code> values are created by
     * using the <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API
     * action in AWS Identity and Access Management (IAM).
     * </p>
     * 
     * @param roleARN
     *        The <code>RoleARN</code> that you want to associate with this cluster. <code>RoleArn</code> values are
     *        created by using the <a
     *        href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action in
     *        AWS Identity and Access Management (IAM).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster. The only supported device types for cluster jobs are
     * <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snowball device to use for this cluster. The only supported device types for cluster jobs
     *        are <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * @see SnowballType
     */

    public void setSnowballType(String snowballType) {
        this.snowballType = snowballType;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster. The only supported device types for cluster jobs are
     * <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * </p>
     * 
     * @return The type of AWS Snowball device to use for this cluster. The only supported device types for cluster jobs
     *         are <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * @see SnowballType
     */

    public String getSnowballType() {
        return this.snowballType;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster. The only supported device types for cluster jobs are
     * <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snowball device to use for this cluster. The only supported device types for cluster jobs
     *        are <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballType
     */

    public CreateClusterRequest withSnowballType(String snowballType) {
        setSnowballType(snowballType);
        return this;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster. The only supported device types for cluster jobs are
     * <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snowball device to use for this cluster. The only supported device types for cluster jobs
     *        are <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * @see SnowballType
     */

    public void setSnowballType(SnowballType snowballType) {
        withSnowballType(snowballType);
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster. The only supported device types for cluster jobs are
     * <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snowball device to use for this cluster. The only supported device types for cluster jobs
     *        are <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballType
     */

    public CreateClusterRequest withSnowballType(SnowballType snowballType) {
        this.snowballType = snowballType.toString();
        return this;
    }

    /**
     * <p>
     * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball
     * Edge device, rather it represents how quickly each device moves to its destination while in transit. Regional
     * shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, devices are delivered in one to seven days.
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
     *        The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each
     *        Snowball Edge device, rather it represents how quickly each device moves to its destination while in
     *        transit. Regional shipping speeds are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, devices shipped express are delivered in
     *        about a day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express
     *        are delivered in about a day. In addition, most countries in the EU have access to standard shipping,
     *        which typically takes less than a week, one way.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In India, devices are delivered in one to seven days.
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
     * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball
     * Edge device, rather it represents how quickly each device moves to its destination while in transit. Regional
     * shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, devices are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the US, you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each
     *         Snowball Edge device, rather it represents how quickly each device moves to its destination while in
     *         transit. Regional shipping speeds are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         In Australia, you have access to express shipping. Typically, devices shipped express are delivered in
     *         about a day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped
     *         express are delivered in about a day. In addition, most countries in the EU have access to standard
     *         shipping, which typically takes less than a week, one way.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In India, devices are delivered in one to seven days.
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
     * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball
     * Edge device, rather it represents how quickly each device moves to its destination while in transit. Regional
     * shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, devices are delivered in one to seven days.
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
     *        The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each
     *        Snowball Edge device, rather it represents how quickly each device moves to its destination while in
     *        transit. Regional shipping speeds are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, devices shipped express are delivered in
     *        about a day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express
     *        are delivered in about a day. In addition, most countries in the EU have access to standard shipping,
     *        which typically takes less than a week, one way.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In India, devices are delivered in one to seven days.
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

    public CreateClusterRequest withShippingOption(String shippingOption) {
        setShippingOption(shippingOption);
        return this;
    }

    /**
     * <p>
     * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball
     * Edge device, rather it represents how quickly each device moves to its destination while in transit. Regional
     * shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, devices are delivered in one to seven days.
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
     *        The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each
     *        Snowball Edge device, rather it represents how quickly each device moves to its destination while in
     *        transit. Regional shipping speeds are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, devices shipped express are delivered in
     *        about a day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express
     *        are delivered in about a day. In addition, most countries in the EU have access to standard shipping,
     *        which typically takes less than a week, one way.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In India, devices are delivered in one to seven days.
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
     * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball
     * Edge device, rather it represents how quickly each device moves to its destination while in transit. Regional
     * shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, devices are delivered in one to seven days.
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
     *        The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each
     *        Snowball Edge device, rather it represents how quickly each device moves to its destination while in
     *        transit. Regional shipping speeds are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, devices shipped express are delivered in
     *        about a day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express
     *        are delivered in about a day. In addition, most countries in the EU have access to standard shipping,
     *        which typically takes less than a week, one way.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In India, devices are delivered in one to seven days.
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

    public CreateClusterRequest withShippingOption(ShippingOption shippingOption) {
        this.shippingOption = shippingOption.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
     * </p>
     * 
     * @param notification
     *        The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
     */

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
     * </p>
     * 
     * @return The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
     */

    public Notification getNotification() {
        return this.notification;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
     * </p>
     * 
     * @param notification
     *        The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withNotification(Notification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * <p>
     * The forwarding address ID for a cluster. This field is not supported in most regions.
     * </p>
     * 
     * @param forwardingAddressId
     *        The forwarding address ID for a cluster. This field is not supported in most regions.
     */

    public void setForwardingAddressId(String forwardingAddressId) {
        this.forwardingAddressId = forwardingAddressId;
    }

    /**
     * <p>
     * The forwarding address ID for a cluster. This field is not supported in most regions.
     * </p>
     * 
     * @return The forwarding address ID for a cluster. This field is not supported in most regions.
     */

    public String getForwardingAddressId() {
        return this.forwardingAddressId;
    }

    /**
     * <p>
     * The forwarding address ID for a cluster. This field is not supported in most regions.
     * </p>
     * 
     * @param forwardingAddressId
     *        The forwarding address ID for a cluster. This field is not supported in most regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withForwardingAddressId(String forwardingAddressId) {
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
        if (getSnowballType() != null)
            sb.append("SnowballType: ").append(getSnowballType()).append(",");
        if (getShippingOption() != null)
            sb.append("ShippingOption: ").append(getShippingOption()).append(",");
        if (getNotification() != null)
            sb.append("Notification: ").append(getNotification()).append(",");
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

        if (obj instanceof CreateClusterRequest == false)
            return false;
        CreateClusterRequest other = (CreateClusterRequest) obj;
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
        if (other.getSnowballType() == null ^ this.getSnowballType() == null)
            return false;
        if (other.getSnowballType() != null && other.getSnowballType().equals(this.getSnowballType()) == false)
            return false;
        if (other.getShippingOption() == null ^ this.getShippingOption() == null)
            return false;
        if (other.getShippingOption() != null && other.getShippingOption().equals(this.getShippingOption()) == false)
            return false;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null && other.getNotification().equals(this.getNotification()) == false)
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
        hashCode = prime * hashCode + ((getSnowballType() == null) ? 0 : getSnowballType().hashCode());
        hashCode = prime * hashCode + ((getShippingOption() == null) ? 0 : getShippingOption().hashCode());
        hashCode = prime * hashCode + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode + ((getForwardingAddressId() == null) ? 0 : getForwardingAddressId().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterRequest clone() {
        return (CreateClusterRequest) super.clone();
    }

}

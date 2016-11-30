/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains metadata about a specific cluster.
 * </p>
 */
public class ClusterMetadata implements Serializable, Cloneable {

    /**
     * <p>
     * The automatically generated ID for a cluster.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The optional description of the cluster.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The <code>KmsKeyARN</code> Amazon Resource Name (ARN) associated with this cluster. This ARN was created using
     * the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> API action in
     * AWS Key Management Service (AWS KMS).
     * </p>
     */
    private String kmsKeyARN;
    /**
     * <p>
     * The role ARN associated with this cluster. This ARN was created using the <a
     * href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action in AWS
     * Identity and Access Management (IAM).
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The current status of the cluster.
     * </p>
     */
    private String clusterState;
    /**
     * <p>
     * The type of job for this cluster. Currently, the only job type supported for clusters is <code>LOCAL_USE</code>.
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * The type of AWS Snowball appliance to use for this cluster. Currently, the only supported appliance type for
     * cluster jobs is <code>EDGE</code>.
     * </p>
     */
    private String snowballType;
    /**
     * <p>
     * The creation date for this cluster.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The arrays of <a>JobResource</a> objects that can include updated <a>S3Resource</a> objects or
     * <a>LambdaResource</a> objects.
     * </p>
     */
    private JobResource resources;
    /**
     * <p>
     * The automatically generated ID for a specific address.
     * </p>
     */
    private String addressId;
    /**
     * <p>
     * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball
     * Edge appliance, rather it represents how quickly each appliance moves to its destination while in transit.
     * Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, appliances shipped express are delivered in about a
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
     * In India, Snowball Edges are delivered in one to seven days.
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
     * The automatically generated ID for a cluster.
     * </p>
     * 
     * @param clusterId
     *        The automatically generated ID for a cluster.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The automatically generated ID for a cluster.
     * </p>
     * 
     * @return The automatically generated ID for a cluster.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The automatically generated ID for a cluster.
     * </p>
     * 
     * @param clusterId
     *        The automatically generated ID for a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterMetadata withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The optional description of the cluster.
     * </p>
     * 
     * @param description
     *        The optional description of the cluster.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description of the cluster.
     * </p>
     * 
     * @return The optional description of the cluster.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The optional description of the cluster.
     * </p>
     * 
     * @param description
     *        The optional description of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterMetadata withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> Amazon Resource Name (ARN) associated with this cluster. This ARN was created using
     * the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> API action in
     * AWS Key Management Service (AWS KMS).
     * </p>
     * 
     * @param kmsKeyARN
     *        The <code>KmsKeyARN</code> Amazon Resource Name (ARN) associated with this cluster. This ARN was created
     *        using the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a>
     *        API action in AWS Key Management Service (AWS KMS).
     */

    public void setKmsKeyARN(String kmsKeyARN) {
        this.kmsKeyARN = kmsKeyARN;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> Amazon Resource Name (ARN) associated with this cluster. This ARN was created using
     * the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> API action in
     * AWS Key Management Service (AWS KMS).
     * </p>
     * 
     * @return The <code>KmsKeyARN</code> Amazon Resource Name (ARN) associated with this cluster. This ARN was created
     *         using the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a>
     *         API action in AWS Key Management Service (AWS KMS).
     */

    public String getKmsKeyARN() {
        return this.kmsKeyARN;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> Amazon Resource Name (ARN) associated with this cluster. This ARN was created using
     * the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a> API action in
     * AWS Key Management Service (AWS KMS).
     * </p>
     * 
     * @param kmsKeyARN
     *        The <code>KmsKeyARN</code> Amazon Resource Name (ARN) associated with this cluster. This ARN was created
     *        using the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html">CreateKey</a>
     *        API action in AWS Key Management Service (AWS KMS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterMetadata withKmsKeyARN(String kmsKeyARN) {
        setKmsKeyARN(kmsKeyARN);
        return this;
    }

    /**
     * <p>
     * The role ARN associated with this cluster. This ARN was created using the <a
     * href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action in AWS
     * Identity and Access Management (IAM).
     * </p>
     * 
     * @param roleARN
     *        The role ARN associated with this cluster. This ARN was created using the <a
     *        href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action in
     *        AWS Identity and Access Management (IAM).
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The role ARN associated with this cluster. This ARN was created using the <a
     * href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action in AWS
     * Identity and Access Management (IAM).
     * </p>
     * 
     * @return The role ARN associated with this cluster. This ARN was created using the <a
     *         href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action
     *         in AWS Identity and Access Management (IAM).
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The role ARN associated with this cluster. This ARN was created using the <a
     * href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action in AWS
     * Identity and Access Management (IAM).
     * </p>
     * 
     * @param roleARN
     *        The role ARN associated with this cluster. This ARN was created using the <a
     *        href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action in
     *        AWS Identity and Access Management (IAM).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterMetadata withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * 
     * @param clusterState
     *        The current status of the cluster.
     * @see ClusterState
     */

    public void setClusterState(String clusterState) {
        this.clusterState = clusterState;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * 
     * @return The current status of the cluster.
     * @see ClusterState
     */

    public String getClusterState() {
        return this.clusterState;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * 
     * @param clusterState
     *        The current status of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public ClusterMetadata withClusterState(String clusterState) {
        setClusterState(clusterState);
        return this;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * 
     * @param clusterState
     *        The current status of the cluster.
     * @see ClusterState
     */

    public void setClusterState(ClusterState clusterState) {
        this.clusterState = clusterState.toString();
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * 
     * @param clusterState
     *        The current status of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public ClusterMetadata withClusterState(ClusterState clusterState) {
        setClusterState(clusterState);
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

    public ClusterMetadata withJobType(String jobType) {
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
        this.jobType = jobType.toString();
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

    public ClusterMetadata withJobType(JobType jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * The type of AWS Snowball appliance to use for this cluster. Currently, the only supported appliance type for
     * cluster jobs is <code>EDGE</code>.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snowball appliance to use for this cluster. Currently, the only supported appliance type
     *        for cluster jobs is <code>EDGE</code>.
     * @see SnowballType
     */

    public void setSnowballType(String snowballType) {
        this.snowballType = snowballType;
    }

    /**
     * <p>
     * The type of AWS Snowball appliance to use for this cluster. Currently, the only supported appliance type for
     * cluster jobs is <code>EDGE</code>.
     * </p>
     * 
     * @return The type of AWS Snowball appliance to use for this cluster. Currently, the only supported appliance type
     *         for cluster jobs is <code>EDGE</code>.
     * @see SnowballType
     */

    public String getSnowballType() {
        return this.snowballType;
    }

    /**
     * <p>
     * The type of AWS Snowball appliance to use for this cluster. Currently, the only supported appliance type for
     * cluster jobs is <code>EDGE</code>.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snowball appliance to use for this cluster. Currently, the only supported appliance type
     *        for cluster jobs is <code>EDGE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballType
     */

    public ClusterMetadata withSnowballType(String snowballType) {
        setSnowballType(snowballType);
        return this;
    }

    /**
     * <p>
     * The type of AWS Snowball appliance to use for this cluster. Currently, the only supported appliance type for
     * cluster jobs is <code>EDGE</code>.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snowball appliance to use for this cluster. Currently, the only supported appliance type
     *        for cluster jobs is <code>EDGE</code>.
     * @see SnowballType
     */

    public void setSnowballType(SnowballType snowballType) {
        this.snowballType = snowballType.toString();
    }

    /**
     * <p>
     * The type of AWS Snowball appliance to use for this cluster. Currently, the only supported appliance type for
     * cluster jobs is <code>EDGE</code>.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snowball appliance to use for this cluster. Currently, the only supported appliance type
     *        for cluster jobs is <code>EDGE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballType
     */

    public ClusterMetadata withSnowballType(SnowballType snowballType) {
        setSnowballType(snowballType);
        return this;
    }

    /**
     * <p>
     * The creation date for this cluster.
     * </p>
     * 
     * @param creationDate
     *        The creation date for this cluster.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date for this cluster.
     * </p>
     * 
     * @return The creation date for this cluster.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date for this cluster.
     * </p>
     * 
     * @param creationDate
     *        The creation date for this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterMetadata withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The arrays of <a>JobResource</a> objects that can include updated <a>S3Resource</a> objects or
     * <a>LambdaResource</a> objects.
     * </p>
     * 
     * @param resources
     *        The arrays of <a>JobResource</a> objects that can include updated <a>S3Resource</a> objects or
     *        <a>LambdaResource</a> objects.
     */

    public void setResources(JobResource resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * The arrays of <a>JobResource</a> objects that can include updated <a>S3Resource</a> objects or
     * <a>LambdaResource</a> objects.
     * </p>
     * 
     * @return The arrays of <a>JobResource</a> objects that can include updated <a>S3Resource</a> objects or
     *         <a>LambdaResource</a> objects.
     */

    public JobResource getResources() {
        return this.resources;
    }

    /**
     * <p>
     * The arrays of <a>JobResource</a> objects that can include updated <a>S3Resource</a> objects or
     * <a>LambdaResource</a> objects.
     * </p>
     * 
     * @param resources
     *        The arrays of <a>JobResource</a> objects that can include updated <a>S3Resource</a> objects or
     *        <a>LambdaResource</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterMetadata withResources(JobResource resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The automatically generated ID for a specific address.
     * </p>
     * 
     * @param addressId
     *        The automatically generated ID for a specific address.
     */

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * <p>
     * The automatically generated ID for a specific address.
     * </p>
     * 
     * @return The automatically generated ID for a specific address.
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     * <p>
     * The automatically generated ID for a specific address.
     * </p>
     * 
     * @param addressId
     *        The automatically generated ID for a specific address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterMetadata withAddressId(String addressId) {
        setAddressId(addressId);
        return this;
    }

    /**
     * <p>
     * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball
     * Edge appliance, rather it represents how quickly each appliance moves to its destination while in transit.
     * Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, appliances shipped express are delivered in about a
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
     * In India, Snowball Edges are delivered in one to seven days.
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
     *        Snowball Edge appliance, rather it represents how quickly each appliance moves to its destination while in
     *        transit. Regional shipping speeds are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, appliances shipped express are delivered in
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
     *        In India, Snowball Edges are delivered in one to seven days.
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
     * Edge appliance, rather it represents how quickly each appliance moves to its destination while in transit.
     * Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, appliances shipped express are delivered in about a
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
     * In India, Snowball Edges are delivered in one to seven days.
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
     *         Snowball Edge appliance, rather it represents how quickly each appliance moves to its destination while
     *         in transit. Regional shipping speeds are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         In Australia, you have access to express shipping. Typically, appliances shipped express are delivered in
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
     *         In India, Snowball Edges are delivered in one to seven days.
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
     * Edge appliance, rather it represents how quickly each appliance moves to its destination while in transit.
     * Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, appliances shipped express are delivered in about a
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
     * In India, Snowball Edges are delivered in one to seven days.
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
     *        Snowball Edge appliance, rather it represents how quickly each appliance moves to its destination while in
     *        transit. Regional shipping speeds are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, appliances shipped express are delivered in
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
     *        In India, Snowball Edges are delivered in one to seven days.
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

    public ClusterMetadata withShippingOption(String shippingOption) {
        setShippingOption(shippingOption);
        return this;
    }

    /**
     * <p>
     * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball
     * Edge appliance, rather it represents how quickly each appliance moves to its destination while in transit.
     * Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, appliances shipped express are delivered in about a
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
     * In India, Snowball Edges are delivered in one to seven days.
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
     *        Snowball Edge appliance, rather it represents how quickly each appliance moves to its destination while in
     *        transit. Regional shipping speeds are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, appliances shipped express are delivered in
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
     *        In India, Snowball Edges are delivered in one to seven days.
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
        this.shippingOption = shippingOption.toString();
    }

    /**
     * <p>
     * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball
     * Edge appliance, rather it represents how quickly each appliance moves to its destination while in transit.
     * Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, appliances shipped express are delivered in about a
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
     * In India, Snowball Edges are delivered in one to seven days.
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
     *        Snowball Edge appliance, rather it represents how quickly each appliance moves to its destination while in
     *        transit. Regional shipping speeds are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, appliances shipped express are delivered in
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
     *        In India, Snowball Edges are delivered in one to seven days.
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

    public ClusterMetadata withShippingOption(ShippingOption shippingOption) {
        setShippingOption(shippingOption);
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

    public ClusterMetadata withNotification(Notification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClusterId() != null)
            sb.append("ClusterId: " + getClusterId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getKmsKeyARN() != null)
            sb.append("KmsKeyARN: " + getKmsKeyARN() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getClusterState() != null)
            sb.append("ClusterState: " + getClusterState() + ",");
        if (getJobType() != null)
            sb.append("JobType: " + getJobType() + ",");
        if (getSnowballType() != null)
            sb.append("SnowballType: " + getSnowballType() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources() + ",");
        if (getAddressId() != null)
            sb.append("AddressId: " + getAddressId() + ",");
        if (getShippingOption() != null)
            sb.append("ShippingOption: " + getShippingOption() + ",");
        if (getNotification() != null)
            sb.append("Notification: " + getNotification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterMetadata == false)
            return false;
        ClusterMetadata other = (ClusterMetadata) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsKeyARN() == null ^ this.getKmsKeyARN() == null)
            return false;
        if (other.getKmsKeyARN() != null && other.getKmsKeyARN().equals(this.getKmsKeyARN()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getClusterState() == null ^ this.getClusterState() == null)
            return false;
        if (other.getClusterState() != null && other.getClusterState().equals(this.getClusterState()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getSnowballType() == null ^ this.getSnowballType() == null)
            return false;
        if (other.getSnowballType() != null && other.getSnowballType().equals(this.getSnowballType()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getAddressId() == null ^ this.getAddressId() == null)
            return false;
        if (other.getAddressId() != null && other.getAddressId().equals(this.getAddressId()) == false)
            return false;
        if (other.getShippingOption() == null ^ this.getShippingOption() == null)
            return false;
        if (other.getShippingOption() != null && other.getShippingOption().equals(this.getShippingOption()) == false)
            return false;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null && other.getNotification().equals(this.getNotification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyARN() == null) ? 0 : getKmsKeyARN().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getClusterState() == null) ? 0 : getClusterState().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getSnowballType() == null) ? 0 : getSnowballType().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        hashCode = prime * hashCode + ((getShippingOption() == null) ? 0 : getShippingOption().hashCode());
        hashCode = prime * hashCode + ((getNotification() == null) ? 0 : getNotification().hashCode());
        return hashCode;
    }

    @Override
    public ClusterMetadata clone() {
        try {
            return (ClusterMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

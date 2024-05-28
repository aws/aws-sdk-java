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
package com.amazonaws.services.timestreaminfluxdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/UpdateDbInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDbInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A service-generated unique identifier.
     * </p>
     */
    private String id;
    /**
     * <p>
     * This customer-supplied name uniquely identifies the DB instance when interacting with the Amazon Timestream for
     * InfluxDB API and AWS CLI commands.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB instance.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The status of the DB instance.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The endpoint used to connect to InfluxDB. The default InfluxDB port is 8086.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The Timestream for InfluxDB instance type that InfluxDB runs on.
     * </p>
     */
    private String dbInstanceType;
    /**
     * <p>
     * The Timestream for InfluxDB DB storage type that InfluxDB stores data on.
     * </p>
     */
    private String dbStorageType;
    /**
     * <p>
     * The amount of storage allocated for your DB storage type (in gibibytes).
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * Specifies whether the Timestream for InfluxDB is deployed as Single-AZ or with a MultiAZ Standby for High
     * availability.
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * A list of VPC subnet IDs associated with the DB instance.
     * </p>
     */
    private java.util.List<String> vpcSubnetIds;
    /**
     * <p>
     * Indicates if the DB instance has a public IP to facilitate access.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * A list of VPC security group IDs associated with the DB instance.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The id of the DB parameter group assigned to your DB instance.
     * </p>
     */
    private String dbParameterGroupIdentifier;
    /**
     * <p>
     * The Availability Zone in which the DB instance resides.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The Availability Zone in which the standby instance is located when deploying with a MultiAZ standby instance.
     * </p>
     */
    private String secondaryAvailabilityZone;
    /**
     * <p>
     * Configuration for sending InfluxDB engine logs to send to specified S3 bucket.
     * </p>
     */
    private LogDeliveryConfiguration logDeliveryConfiguration;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret containing the initial InfluxDB authorization
     * parameters. The secret value is a JSON formatted key-value pair holding InfluxDB authorization values:
     * organization, bucket, username, and password.
     * </p>
     */
    private String influxAuthParametersSecretArn;

    /**
     * <p>
     * A service-generated unique identifier.
     * </p>
     * 
     * @param id
     *        A service-generated unique identifier.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A service-generated unique identifier.
     * </p>
     * 
     * @return A service-generated unique identifier.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A service-generated unique identifier.
     * </p>
     * 
     * @param id
     *        A service-generated unique identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * This customer-supplied name uniquely identifies the DB instance when interacting with the Amazon Timestream for
     * InfluxDB API and AWS CLI commands.
     * </p>
     * 
     * @param name
     *        This customer-supplied name uniquely identifies the DB instance when interacting with the Amazon
     *        Timestream for InfluxDB API and AWS CLI commands.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * This customer-supplied name uniquely identifies the DB instance when interacting with the Amazon Timestream for
     * InfluxDB API and AWS CLI commands.
     * </p>
     * 
     * @return This customer-supplied name uniquely identifies the DB instance when interacting with the Amazon
     *         Timestream for InfluxDB API and AWS CLI commands.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * This customer-supplied name uniquely identifies the DB instance when interacting with the Amazon Timestream for
     * InfluxDB API and AWS CLI commands.
     * </p>
     * 
     * @param name
     *        This customer-supplied name uniquely identifies the DB instance when interacting with the Amazon
     *        Timestream for InfluxDB API and AWS CLI commands.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB instance.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the DB instance.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the DB instance.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB instance.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The status of the DB instance.
     * </p>
     * 
     * @param status
     *        The status of the DB instance.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the DB instance.
     * </p>
     * 
     * @return The status of the DB instance.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the DB instance.
     * </p>
     * 
     * @param status
     *        The status of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public UpdateDbInstanceResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the DB instance.
     * </p>
     * 
     * @param status
     *        The status of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public UpdateDbInstanceResult withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The endpoint used to connect to InfluxDB. The default InfluxDB port is 8086.
     * </p>
     * 
     * @param endpoint
     *        The endpoint used to connect to InfluxDB. The default InfluxDB port is 8086.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint used to connect to InfluxDB. The default InfluxDB port is 8086.
     * </p>
     * 
     * @return The endpoint used to connect to InfluxDB. The default InfluxDB port is 8086.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint used to connect to InfluxDB. The default InfluxDB port is 8086.
     * </p>
     * 
     * @param endpoint
     *        The endpoint used to connect to InfluxDB. The default InfluxDB port is 8086.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceResult withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The Timestream for InfluxDB instance type that InfluxDB runs on.
     * </p>
     * 
     * @param dbInstanceType
     *        The Timestream for InfluxDB instance type that InfluxDB runs on.
     * @see DbInstanceType
     */

    public void setDbInstanceType(String dbInstanceType) {
        this.dbInstanceType = dbInstanceType;
    }

    /**
     * <p>
     * The Timestream for InfluxDB instance type that InfluxDB runs on.
     * </p>
     * 
     * @return The Timestream for InfluxDB instance type that InfluxDB runs on.
     * @see DbInstanceType
     */

    public String getDbInstanceType() {
        return this.dbInstanceType;
    }

    /**
     * <p>
     * The Timestream for InfluxDB instance type that InfluxDB runs on.
     * </p>
     * 
     * @param dbInstanceType
     *        The Timestream for InfluxDB instance type that InfluxDB runs on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DbInstanceType
     */

    public UpdateDbInstanceResult withDbInstanceType(String dbInstanceType) {
        setDbInstanceType(dbInstanceType);
        return this;
    }

    /**
     * <p>
     * The Timestream for InfluxDB instance type that InfluxDB runs on.
     * </p>
     * 
     * @param dbInstanceType
     *        The Timestream for InfluxDB instance type that InfluxDB runs on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DbInstanceType
     */

    public UpdateDbInstanceResult withDbInstanceType(DbInstanceType dbInstanceType) {
        this.dbInstanceType = dbInstanceType.toString();
        return this;
    }

    /**
     * <p>
     * The Timestream for InfluxDB DB storage type that InfluxDB stores data on.
     * </p>
     * 
     * @param dbStorageType
     *        The Timestream for InfluxDB DB storage type that InfluxDB stores data on.
     * @see DbStorageType
     */

    public void setDbStorageType(String dbStorageType) {
        this.dbStorageType = dbStorageType;
    }

    /**
     * <p>
     * The Timestream for InfluxDB DB storage type that InfluxDB stores data on.
     * </p>
     * 
     * @return The Timestream for InfluxDB DB storage type that InfluxDB stores data on.
     * @see DbStorageType
     */

    public String getDbStorageType() {
        return this.dbStorageType;
    }

    /**
     * <p>
     * The Timestream for InfluxDB DB storage type that InfluxDB stores data on.
     * </p>
     * 
     * @param dbStorageType
     *        The Timestream for InfluxDB DB storage type that InfluxDB stores data on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DbStorageType
     */

    public UpdateDbInstanceResult withDbStorageType(String dbStorageType) {
        setDbStorageType(dbStorageType);
        return this;
    }

    /**
     * <p>
     * The Timestream for InfluxDB DB storage type that InfluxDB stores data on.
     * </p>
     * 
     * @param dbStorageType
     *        The Timestream for InfluxDB DB storage type that InfluxDB stores data on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DbStorageType
     */

    public UpdateDbInstanceResult withDbStorageType(DbStorageType dbStorageType) {
        this.dbStorageType = dbStorageType.toString();
        return this;
    }

    /**
     * <p>
     * The amount of storage allocated for your DB storage type (in gibibytes).
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage allocated for your DB storage type (in gibibytes).
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage allocated for your DB storage type (in gibibytes).
     * </p>
     * 
     * @return The amount of storage allocated for your DB storage type (in gibibytes).
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage allocated for your DB storage type (in gibibytes).
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage allocated for your DB storage type (in gibibytes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceResult withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * Specifies whether the Timestream for InfluxDB is deployed as Single-AZ or with a MultiAZ Standby for High
     * availability.
     * </p>
     * 
     * @param deploymentType
     *        Specifies whether the Timestream for InfluxDB is deployed as Single-AZ or with a MultiAZ Standby for High
     *        availability.
     * @see DeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Specifies whether the Timestream for InfluxDB is deployed as Single-AZ or with a MultiAZ Standby for High
     * availability.
     * </p>
     * 
     * @return Specifies whether the Timestream for InfluxDB is deployed as Single-AZ or with a MultiAZ Standby for High
     *         availability.
     * @see DeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * Specifies whether the Timestream for InfluxDB is deployed as Single-AZ or with a MultiAZ Standby for High
     * availability.
     * </p>
     * 
     * @param deploymentType
     *        Specifies whether the Timestream for InfluxDB is deployed as Single-AZ or with a MultiAZ Standby for High
     *        availability.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public UpdateDbInstanceResult withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the Timestream for InfluxDB is deployed as Single-AZ or with a MultiAZ Standby for High
     * availability.
     * </p>
     * 
     * @param deploymentType
     *        Specifies whether the Timestream for InfluxDB is deployed as Single-AZ or with a MultiAZ Standby for High
     *        availability.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public UpdateDbInstanceResult withDeploymentType(DeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * A list of VPC subnet IDs associated with the DB instance.
     * </p>
     * 
     * @return A list of VPC subnet IDs associated with the DB instance.
     */

    public java.util.List<String> getVpcSubnetIds() {
        return vpcSubnetIds;
    }

    /**
     * <p>
     * A list of VPC subnet IDs associated with the DB instance.
     * </p>
     * 
     * @param vpcSubnetIds
     *        A list of VPC subnet IDs associated with the DB instance.
     */

    public void setVpcSubnetIds(java.util.Collection<String> vpcSubnetIds) {
        if (vpcSubnetIds == null) {
            this.vpcSubnetIds = null;
            return;
        }

        this.vpcSubnetIds = new java.util.ArrayList<String>(vpcSubnetIds);
    }

    /**
     * <p>
     * A list of VPC subnet IDs associated with the DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSubnetIds(java.util.Collection)} or {@link #withVpcSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vpcSubnetIds
     *        A list of VPC subnet IDs associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceResult withVpcSubnetIds(String... vpcSubnetIds) {
        if (this.vpcSubnetIds == null) {
            setVpcSubnetIds(new java.util.ArrayList<String>(vpcSubnetIds.length));
        }
        for (String ele : vpcSubnetIds) {
            this.vpcSubnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC subnet IDs associated with the DB instance.
     * </p>
     * 
     * @param vpcSubnetIds
     *        A list of VPC subnet IDs associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceResult withVpcSubnetIds(java.util.Collection<String> vpcSubnetIds) {
        setVpcSubnetIds(vpcSubnetIds);
        return this;
    }

    /**
     * <p>
     * Indicates if the DB instance has a public IP to facilitate access.
     * </p>
     * 
     * @param publiclyAccessible
     *        Indicates if the DB instance has a public IP to facilitate access.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Indicates if the DB instance has a public IP to facilitate access.
     * </p>
     * 
     * @return Indicates if the DB instance has a public IP to facilitate access.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Indicates if the DB instance has a public IP to facilitate access.
     * </p>
     * 
     * @param publiclyAccessible
     *        Indicates if the DB instance has a public IP to facilitate access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceResult withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Indicates if the DB instance has a public IP to facilitate access.
     * </p>
     * 
     * @return Indicates if the DB instance has a public IP to facilitate access.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * A list of VPC security group IDs associated with the DB instance.
     * </p>
     * 
     * @return A list of VPC security group IDs associated with the DB instance.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of VPC security group IDs associated with the DB instance.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security group IDs associated with the DB instance.
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * A list of VPC security group IDs associated with the DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security group IDs associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceResult withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC security group IDs associated with the DB instance.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security group IDs associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceResult withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The id of the DB parameter group assigned to your DB instance.
     * </p>
     * 
     * @param dbParameterGroupIdentifier
     *        The id of the DB parameter group assigned to your DB instance.
     */

    public void setDbParameterGroupIdentifier(String dbParameterGroupIdentifier) {
        this.dbParameterGroupIdentifier = dbParameterGroupIdentifier;
    }

    /**
     * <p>
     * The id of the DB parameter group assigned to your DB instance.
     * </p>
     * 
     * @return The id of the DB parameter group assigned to your DB instance.
     */

    public String getDbParameterGroupIdentifier() {
        return this.dbParameterGroupIdentifier;
    }

    /**
     * <p>
     * The id of the DB parameter group assigned to your DB instance.
     * </p>
     * 
     * @param dbParameterGroupIdentifier
     *        The id of the DB parameter group assigned to your DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceResult withDbParameterGroupIdentifier(String dbParameterGroupIdentifier) {
        setDbParameterGroupIdentifier(dbParameterGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the DB instance resides.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the DB instance resides.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the DB instance resides.
     * </p>
     * 
     * @return The Availability Zone in which the DB instance resides.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the DB instance resides.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the DB instance resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceResult withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the standby instance is located when deploying with a MultiAZ standby instance.
     * </p>
     * 
     * @param secondaryAvailabilityZone
     *        The Availability Zone in which the standby instance is located when deploying with a MultiAZ standby
     *        instance.
     */

    public void setSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        this.secondaryAvailabilityZone = secondaryAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the standby instance is located when deploying with a MultiAZ standby instance.
     * </p>
     * 
     * @return The Availability Zone in which the standby instance is located when deploying with a MultiAZ standby
     *         instance.
     */

    public String getSecondaryAvailabilityZone() {
        return this.secondaryAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the standby instance is located when deploying with a MultiAZ standby instance.
     * </p>
     * 
     * @param secondaryAvailabilityZone
     *        The Availability Zone in which the standby instance is located when deploying with a MultiAZ standby
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceResult withSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        setSecondaryAvailabilityZone(secondaryAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * Configuration for sending InfluxDB engine logs to send to specified S3 bucket.
     * </p>
     * 
     * @param logDeliveryConfiguration
     *        Configuration for sending InfluxDB engine logs to send to specified S3 bucket.
     */

    public void setLogDeliveryConfiguration(LogDeliveryConfiguration logDeliveryConfiguration) {
        this.logDeliveryConfiguration = logDeliveryConfiguration;
    }

    /**
     * <p>
     * Configuration for sending InfluxDB engine logs to send to specified S3 bucket.
     * </p>
     * 
     * @return Configuration for sending InfluxDB engine logs to send to specified S3 bucket.
     */

    public LogDeliveryConfiguration getLogDeliveryConfiguration() {
        return this.logDeliveryConfiguration;
    }

    /**
     * <p>
     * Configuration for sending InfluxDB engine logs to send to specified S3 bucket.
     * </p>
     * 
     * @param logDeliveryConfiguration
     *        Configuration for sending InfluxDB engine logs to send to specified S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceResult withLogDeliveryConfiguration(LogDeliveryConfiguration logDeliveryConfiguration) {
        setLogDeliveryConfiguration(logDeliveryConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret containing the initial InfluxDB authorization
     * parameters. The secret value is a JSON formatted key-value pair holding InfluxDB authorization values:
     * organization, bucket, username, and password.
     * </p>
     * 
     * @param influxAuthParametersSecretArn
     *        The Amazon Resource Name (ARN) of the AWS Secrets Manager secret containing the initial InfluxDB
     *        authorization parameters. The secret value is a JSON formatted key-value pair holding InfluxDB
     *        authorization values: organization, bucket, username, and password.
     */

    public void setInfluxAuthParametersSecretArn(String influxAuthParametersSecretArn) {
        this.influxAuthParametersSecretArn = influxAuthParametersSecretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret containing the initial InfluxDB authorization
     * parameters. The secret value is a JSON formatted key-value pair holding InfluxDB authorization values:
     * organization, bucket, username, and password.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Secrets Manager secret containing the initial InfluxDB
     *         authorization parameters. The secret value is a JSON formatted key-value pair holding InfluxDB
     *         authorization values: organization, bucket, username, and password.
     */

    public String getInfluxAuthParametersSecretArn() {
        return this.influxAuthParametersSecretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret containing the initial InfluxDB authorization
     * parameters. The secret value is a JSON formatted key-value pair holding InfluxDB authorization values:
     * organization, bucket, username, and password.
     * </p>
     * 
     * @param influxAuthParametersSecretArn
     *        The Amazon Resource Name (ARN) of the AWS Secrets Manager secret containing the initial InfluxDB
     *        authorization parameters. The secret value is a JSON formatted key-value pair holding InfluxDB
     *        authorization values: organization, bucket, username, and password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceResult withInfluxAuthParametersSecretArn(String influxAuthParametersSecretArn) {
        setInfluxAuthParametersSecretArn(influxAuthParametersSecretArn);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getDbInstanceType() != null)
            sb.append("DbInstanceType: ").append(getDbInstanceType()).append(",");
        if (getDbStorageType() != null)
            sb.append("DbStorageType: ").append(getDbStorageType()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getVpcSubnetIds() != null)
            sb.append("VpcSubnetIds: ").append(getVpcSubnetIds()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getDbParameterGroupIdentifier() != null)
            sb.append("DbParameterGroupIdentifier: ").append(getDbParameterGroupIdentifier()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getSecondaryAvailabilityZone() != null)
            sb.append("SecondaryAvailabilityZone: ").append(getSecondaryAvailabilityZone()).append(",");
        if (getLogDeliveryConfiguration() != null)
            sb.append("LogDeliveryConfiguration: ").append(getLogDeliveryConfiguration()).append(",");
        if (getInfluxAuthParametersSecretArn() != null)
            sb.append("InfluxAuthParametersSecretArn: ").append(getInfluxAuthParametersSecretArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDbInstanceResult == false)
            return false;
        UpdateDbInstanceResult other = (UpdateDbInstanceResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getDbInstanceType() == null ^ this.getDbInstanceType() == null)
            return false;
        if (other.getDbInstanceType() != null && other.getDbInstanceType().equals(this.getDbInstanceType()) == false)
            return false;
        if (other.getDbStorageType() == null ^ this.getDbStorageType() == null)
            return false;
        if (other.getDbStorageType() != null && other.getDbStorageType().equals(this.getDbStorageType()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getVpcSubnetIds() == null ^ this.getVpcSubnetIds() == null)
            return false;
        if (other.getVpcSubnetIds() != null && other.getVpcSubnetIds().equals(this.getVpcSubnetIds()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getDbParameterGroupIdentifier() == null ^ this.getDbParameterGroupIdentifier() == null)
            return false;
        if (other.getDbParameterGroupIdentifier() != null && other.getDbParameterGroupIdentifier().equals(this.getDbParameterGroupIdentifier()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getSecondaryAvailabilityZone() == null ^ this.getSecondaryAvailabilityZone() == null)
            return false;
        if (other.getSecondaryAvailabilityZone() != null && other.getSecondaryAvailabilityZone().equals(this.getSecondaryAvailabilityZone()) == false)
            return false;
        if (other.getLogDeliveryConfiguration() == null ^ this.getLogDeliveryConfiguration() == null)
            return false;
        if (other.getLogDeliveryConfiguration() != null && other.getLogDeliveryConfiguration().equals(this.getLogDeliveryConfiguration()) == false)
            return false;
        if (other.getInfluxAuthParametersSecretArn() == null ^ this.getInfluxAuthParametersSecretArn() == null)
            return false;
        if (other.getInfluxAuthParametersSecretArn() != null
                && other.getInfluxAuthParametersSecretArn().equals(this.getInfluxAuthParametersSecretArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getDbInstanceType() == null) ? 0 : getDbInstanceType().hashCode());
        hashCode = prime * hashCode + ((getDbStorageType() == null) ? 0 : getDbStorageType().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getVpcSubnetIds() == null) ? 0 : getVpcSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getDbParameterGroupIdentifier() == null) ? 0 : getDbParameterGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getSecondaryAvailabilityZone() == null) ? 0 : getSecondaryAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getLogDeliveryConfiguration() == null) ? 0 : getLogDeliveryConfiguration().hashCode());
        hashCode = prime * hashCode + ((getInfluxAuthParametersSecretArn() == null) ? 0 : getInfluxAuthParametersSecretArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDbInstanceResult clone() {
        try {
            return (UpdateDbInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

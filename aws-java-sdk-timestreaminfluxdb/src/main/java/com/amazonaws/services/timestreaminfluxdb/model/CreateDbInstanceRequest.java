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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/CreateDbInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDbInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name that uniquely identifies the DB instance when interacting with the Amazon Timestream for InfluxDB API
     * and CLI commands. This name will also be a prefix included in the endpoint. DB instance names must be unique per
     * customer and per region.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The username of the initial admin user created in InfluxDB. Must start with a letter and can't end with a hyphen
     * or contain two consecutive hyphens. For example, my-user1. This username will allow you to access the InfluxDB UI
     * to perform various administrative tasks and also use the InfluxDB CLI to create an operator token. These
     * attributes will be stored in a Secret created in Amazon Secrets Manager in your account.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The password of the initial admin user created in InfluxDB. This password will allow you to access the InfluxDB
     * UI to perform various administrative tasks and also use the InfluxDB CLI to create an operator token. These
     * attributes will be stored in a Secret created in AWS SecretManager in your account.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The name of the initial organization for the initial admin user in InfluxDB. An InfluxDB organization is a
     * workspace for a group of users.
     * </p>
     */
    private String organization;
    /**
     * <p>
     * The name of the initial InfluxDB bucket. All InfluxDB data is stored in a bucket. A bucket combines the concept
     * of a database and a retention period (the duration of time that each data point persists). A bucket belongs to an
     * organization.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The Timestream for InfluxDB DB instance type to run InfluxDB on.
     * </p>
     */
    private String dbInstanceType;
    /**
     * <p>
     * A list of VPC subnet IDs to associate with the DB instance. Provide at least two VPC subnet IDs in different
     * availability zones when deploying with a Multi-AZ standby.
     * </p>
     */
    private java.util.List<String> vpcSubnetIds;
    /**
     * <p>
     * A list of VPC security group IDs to associate with the DB instance.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;
    /**
     * <p>
     * Configures the DB instance with a public IP to facilitate access.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The Timestream for InfluxDB DB storage type to read and write InfluxDB data.
     * </p>
     * <p>
     * You can choose between 3 different types of provisioned Influx IOPS included storage according to your workloads
     * requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Influx IO Included 3000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * Influx IO Included 12000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * Influx IO Included 16000 IOPS
     * </p>
     * </li>
     * </ul>
     */
    private String dbStorageType;
    /**
     * <p>
     * The amount of storage to allocate for your DB storage type in GiB (gibibytes).
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The id of the DB parameter group to assign to your DB instance. DB parameter groups specify how the database is
     * configured. For example, DB parameter groups can specify the limit for query concurrency.
     * </p>
     */
    private String dbParameterGroupIdentifier;
    /**
     * <p>
     * Specifies whether the DB instance will be deployed as a standalone instance or with a Multi-AZ standby for high
     * availability.
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
     * </p>
     */
    private LogDeliveryConfiguration logDeliveryConfiguration;
    /**
     * <p>
     * A list of key-value pairs to associate with the DB instance.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name that uniquely identifies the DB instance when interacting with the Amazon Timestream for InfluxDB API
     * and CLI commands. This name will also be a prefix included in the endpoint. DB instance names must be unique per
     * customer and per region.
     * </p>
     * 
     * @param name
     *        The name that uniquely identifies the DB instance when interacting with the Amazon Timestream for InfluxDB
     *        API and CLI commands. This name will also be a prefix included in the endpoint. DB instance names must be
     *        unique per customer and per region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that uniquely identifies the DB instance when interacting with the Amazon Timestream for InfluxDB API
     * and CLI commands. This name will also be a prefix included in the endpoint. DB instance names must be unique per
     * customer and per region.
     * </p>
     * 
     * @return The name that uniquely identifies the DB instance when interacting with the Amazon Timestream for
     *         InfluxDB API and CLI commands. This name will also be a prefix included in the endpoint. DB instance
     *         names must be unique per customer and per region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that uniquely identifies the DB instance when interacting with the Amazon Timestream for InfluxDB API
     * and CLI commands. This name will also be a prefix included in the endpoint. DB instance names must be unique per
     * customer and per region.
     * </p>
     * 
     * @param name
     *        The name that uniquely identifies the DB instance when interacting with the Amazon Timestream for InfluxDB
     *        API and CLI commands. This name will also be a prefix included in the endpoint. DB instance names must be
     *        unique per customer and per region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbInstanceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The username of the initial admin user created in InfluxDB. Must start with a letter and can't end with a hyphen
     * or contain two consecutive hyphens. For example, my-user1. This username will allow you to access the InfluxDB UI
     * to perform various administrative tasks and also use the InfluxDB CLI to create an operator token. These
     * attributes will be stored in a Secret created in Amazon Secrets Manager in your account.
     * </p>
     * 
     * @param username
     *        The username of the initial admin user created in InfluxDB. Must start with a letter and can't end with a
     *        hyphen or contain two consecutive hyphens. For example, my-user1. This username will allow you to access
     *        the InfluxDB UI to perform various administrative tasks and also use the InfluxDB CLI to create an
     *        operator token. These attributes will be stored in a Secret created in Amazon Secrets Manager in your
     *        account.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username of the initial admin user created in InfluxDB. Must start with a letter and can't end with a hyphen
     * or contain two consecutive hyphens. For example, my-user1. This username will allow you to access the InfluxDB UI
     * to perform various administrative tasks and also use the InfluxDB CLI to create an operator token. These
     * attributes will be stored in a Secret created in Amazon Secrets Manager in your account.
     * </p>
     * 
     * @return The username of the initial admin user created in InfluxDB. Must start with a letter and can't end with a
     *         hyphen or contain two consecutive hyphens. For example, my-user1. This username will allow you to access
     *         the InfluxDB UI to perform various administrative tasks and also use the InfluxDB CLI to create an
     *         operator token. These attributes will be stored in a Secret created in Amazon Secrets Manager in your
     *         account.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The username of the initial admin user created in InfluxDB. Must start with a letter and can't end with a hyphen
     * or contain two consecutive hyphens. For example, my-user1. This username will allow you to access the InfluxDB UI
     * to perform various administrative tasks and also use the InfluxDB CLI to create an operator token. These
     * attributes will be stored in a Secret created in Amazon Secrets Manager in your account.
     * </p>
     * 
     * @param username
     *        The username of the initial admin user created in InfluxDB. Must start with a letter and can't end with a
     *        hyphen or contain two consecutive hyphens. For example, my-user1. This username will allow you to access
     *        the InfluxDB UI to perform various administrative tasks and also use the InfluxDB CLI to create an
     *        operator token. These attributes will be stored in a Secret created in Amazon Secrets Manager in your
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbInstanceRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The password of the initial admin user created in InfluxDB. This password will allow you to access the InfluxDB
     * UI to perform various administrative tasks and also use the InfluxDB CLI to create an operator token. These
     * attributes will be stored in a Secret created in AWS SecretManager in your account.
     * </p>
     * 
     * @param password
     *        The password of the initial admin user created in InfluxDB. This password will allow you to access the
     *        InfluxDB UI to perform various administrative tasks and also use the InfluxDB CLI to create an operator
     *        token. These attributes will be stored in a Secret created in AWS SecretManager in your account.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password of the initial admin user created in InfluxDB. This password will allow you to access the InfluxDB
     * UI to perform various administrative tasks and also use the InfluxDB CLI to create an operator token. These
     * attributes will be stored in a Secret created in AWS SecretManager in your account.
     * </p>
     * 
     * @return The password of the initial admin user created in InfluxDB. This password will allow you to access the
     *         InfluxDB UI to perform various administrative tasks and also use the InfluxDB CLI to create an operator
     *         token. These attributes will be stored in a Secret created in AWS SecretManager in your account.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password of the initial admin user created in InfluxDB. This password will allow you to access the InfluxDB
     * UI to perform various administrative tasks and also use the InfluxDB CLI to create an operator token. These
     * attributes will be stored in a Secret created in AWS SecretManager in your account.
     * </p>
     * 
     * @param password
     *        The password of the initial admin user created in InfluxDB. This password will allow you to access the
     *        InfluxDB UI to perform various administrative tasks and also use the InfluxDB CLI to create an operator
     *        token. These attributes will be stored in a Secret created in AWS SecretManager in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbInstanceRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The name of the initial organization for the initial admin user in InfluxDB. An InfluxDB organization is a
     * workspace for a group of users.
     * </p>
     * 
     * @param organization
     *        The name of the initial organization for the initial admin user in InfluxDB. An InfluxDB organization is a
     *        workspace for a group of users.
     */

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * <p>
     * The name of the initial organization for the initial admin user in InfluxDB. An InfluxDB organization is a
     * workspace for a group of users.
     * </p>
     * 
     * @return The name of the initial organization for the initial admin user in InfluxDB. An InfluxDB organization is
     *         a workspace for a group of users.
     */

    public String getOrganization() {
        return this.organization;
    }

    /**
     * <p>
     * The name of the initial organization for the initial admin user in InfluxDB. An InfluxDB organization is a
     * workspace for a group of users.
     * </p>
     * 
     * @param organization
     *        The name of the initial organization for the initial admin user in InfluxDB. An InfluxDB organization is a
     *        workspace for a group of users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbInstanceRequest withOrganization(String organization) {
        setOrganization(organization);
        return this;
    }

    /**
     * <p>
     * The name of the initial InfluxDB bucket. All InfluxDB data is stored in a bucket. A bucket combines the concept
     * of a database and a retention period (the duration of time that each data point persists). A bucket belongs to an
     * organization.
     * </p>
     * 
     * @param bucket
     *        The name of the initial InfluxDB bucket. All InfluxDB data is stored in a bucket. A bucket combines the
     *        concept of a database and a retention period (the duration of time that each data point persists). A
     *        bucket belongs to an organization.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the initial InfluxDB bucket. All InfluxDB data is stored in a bucket. A bucket combines the concept
     * of a database and a retention period (the duration of time that each data point persists). A bucket belongs to an
     * organization.
     * </p>
     * 
     * @return The name of the initial InfluxDB bucket. All InfluxDB data is stored in a bucket. A bucket combines the
     *         concept of a database and a retention period (the duration of time that each data point persists). A
     *         bucket belongs to an organization.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the initial InfluxDB bucket. All InfluxDB data is stored in a bucket. A bucket combines the concept
     * of a database and a retention period (the duration of time that each data point persists). A bucket belongs to an
     * organization.
     * </p>
     * 
     * @param bucket
     *        The name of the initial InfluxDB bucket. All InfluxDB data is stored in a bucket. A bucket combines the
     *        concept of a database and a retention period (the duration of time that each data point persists). A
     *        bucket belongs to an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbInstanceRequest withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The Timestream for InfluxDB DB instance type to run InfluxDB on.
     * </p>
     * 
     * @param dbInstanceType
     *        The Timestream for InfluxDB DB instance type to run InfluxDB on.
     * @see DbInstanceType
     */

    public void setDbInstanceType(String dbInstanceType) {
        this.dbInstanceType = dbInstanceType;
    }

    /**
     * <p>
     * The Timestream for InfluxDB DB instance type to run InfluxDB on.
     * </p>
     * 
     * @return The Timestream for InfluxDB DB instance type to run InfluxDB on.
     * @see DbInstanceType
     */

    public String getDbInstanceType() {
        return this.dbInstanceType;
    }

    /**
     * <p>
     * The Timestream for InfluxDB DB instance type to run InfluxDB on.
     * </p>
     * 
     * @param dbInstanceType
     *        The Timestream for InfluxDB DB instance type to run InfluxDB on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DbInstanceType
     */

    public CreateDbInstanceRequest withDbInstanceType(String dbInstanceType) {
        setDbInstanceType(dbInstanceType);
        return this;
    }

    /**
     * <p>
     * The Timestream for InfluxDB DB instance type to run InfluxDB on.
     * </p>
     * 
     * @param dbInstanceType
     *        The Timestream for InfluxDB DB instance type to run InfluxDB on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DbInstanceType
     */

    public CreateDbInstanceRequest withDbInstanceType(DbInstanceType dbInstanceType) {
        this.dbInstanceType = dbInstanceType.toString();
        return this;
    }

    /**
     * <p>
     * A list of VPC subnet IDs to associate with the DB instance. Provide at least two VPC subnet IDs in different
     * availability zones when deploying with a Multi-AZ standby.
     * </p>
     * 
     * @return A list of VPC subnet IDs to associate with the DB instance. Provide at least two VPC subnet IDs in
     *         different availability zones when deploying with a Multi-AZ standby.
     */

    public java.util.List<String> getVpcSubnetIds() {
        return vpcSubnetIds;
    }

    /**
     * <p>
     * A list of VPC subnet IDs to associate with the DB instance. Provide at least two VPC subnet IDs in different
     * availability zones when deploying with a Multi-AZ standby.
     * </p>
     * 
     * @param vpcSubnetIds
     *        A list of VPC subnet IDs to associate with the DB instance. Provide at least two VPC subnet IDs in
     *        different availability zones when deploying with a Multi-AZ standby.
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
     * A list of VPC subnet IDs to associate with the DB instance. Provide at least two VPC subnet IDs in different
     * availability zones when deploying with a Multi-AZ standby.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSubnetIds(java.util.Collection)} or {@link #withVpcSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vpcSubnetIds
     *        A list of VPC subnet IDs to associate with the DB instance. Provide at least two VPC subnet IDs in
     *        different availability zones when deploying with a Multi-AZ standby.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbInstanceRequest withVpcSubnetIds(String... vpcSubnetIds) {
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
     * A list of VPC subnet IDs to associate with the DB instance. Provide at least two VPC subnet IDs in different
     * availability zones when deploying with a Multi-AZ standby.
     * </p>
     * 
     * @param vpcSubnetIds
     *        A list of VPC subnet IDs to associate with the DB instance. Provide at least two VPC subnet IDs in
     *        different availability zones when deploying with a Multi-AZ standby.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbInstanceRequest withVpcSubnetIds(java.util.Collection<String> vpcSubnetIds) {
        setVpcSubnetIds(vpcSubnetIds);
        return this;
    }

    /**
     * <p>
     * A list of VPC security group IDs to associate with the DB instance.
     * </p>
     * 
     * @return A list of VPC security group IDs to associate with the DB instance.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of VPC security group IDs to associate with the DB instance.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security group IDs to associate with the DB instance.
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
     * A list of VPC security group IDs to associate with the DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security group IDs to associate with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbInstanceRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of VPC security group IDs to associate with the DB instance.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security group IDs to associate with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbInstanceRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * Configures the DB instance with a public IP to facilitate access.
     * </p>
     * 
     * @param publiclyAccessible
     *        Configures the DB instance with a public IP to facilitate access.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Configures the DB instance with a public IP to facilitate access.
     * </p>
     * 
     * @return Configures the DB instance with a public IP to facilitate access.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Configures the DB instance with a public IP to facilitate access.
     * </p>
     * 
     * @param publiclyAccessible
     *        Configures the DB instance with a public IP to facilitate access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbInstanceRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Configures the DB instance with a public IP to facilitate access.
     * </p>
     * 
     * @return Configures the DB instance with a public IP to facilitate access.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The Timestream for InfluxDB DB storage type to read and write InfluxDB data.
     * </p>
     * <p>
     * You can choose between 3 different types of provisioned Influx IOPS included storage according to your workloads
     * requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Influx IO Included 3000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * Influx IO Included 12000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * Influx IO Included 16000 IOPS
     * </p>
     * </li>
     * </ul>
     * 
     * @param dbStorageType
     *        The Timestream for InfluxDB DB storage type to read and write InfluxDB data.</p>
     *        <p>
     *        You can choose between 3 different types of provisioned Influx IOPS included storage according to your
     *        workloads requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Influx IO Included 3000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Influx IO Included 12000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Influx IO Included 16000 IOPS
     *        </p>
     *        </li>
     * @see DbStorageType
     */

    public void setDbStorageType(String dbStorageType) {
        this.dbStorageType = dbStorageType;
    }

    /**
     * <p>
     * The Timestream for InfluxDB DB storage type to read and write InfluxDB data.
     * </p>
     * <p>
     * You can choose between 3 different types of provisioned Influx IOPS included storage according to your workloads
     * requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Influx IO Included 3000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * Influx IO Included 12000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * Influx IO Included 16000 IOPS
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Timestream for InfluxDB DB storage type to read and write InfluxDB data.</p>
     *         <p>
     *         You can choose between 3 different types of provisioned Influx IOPS included storage according to your
     *         workloads requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Influx IO Included 3000 IOPS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Influx IO Included 12000 IOPS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Influx IO Included 16000 IOPS
     *         </p>
     *         </li>
     * @see DbStorageType
     */

    public String getDbStorageType() {
        return this.dbStorageType;
    }

    /**
     * <p>
     * The Timestream for InfluxDB DB storage type to read and write InfluxDB data.
     * </p>
     * <p>
     * You can choose between 3 different types of provisioned Influx IOPS included storage according to your workloads
     * requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Influx IO Included 3000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * Influx IO Included 12000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * Influx IO Included 16000 IOPS
     * </p>
     * </li>
     * </ul>
     * 
     * @param dbStorageType
     *        The Timestream for InfluxDB DB storage type to read and write InfluxDB data.</p>
     *        <p>
     *        You can choose between 3 different types of provisioned Influx IOPS included storage according to your
     *        workloads requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Influx IO Included 3000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Influx IO Included 12000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Influx IO Included 16000 IOPS
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DbStorageType
     */

    public CreateDbInstanceRequest withDbStorageType(String dbStorageType) {
        setDbStorageType(dbStorageType);
        return this;
    }

    /**
     * <p>
     * The Timestream for InfluxDB DB storage type to read and write InfluxDB data.
     * </p>
     * <p>
     * You can choose between 3 different types of provisioned Influx IOPS included storage according to your workloads
     * requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Influx IO Included 3000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * Influx IO Included 12000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * Influx IO Included 16000 IOPS
     * </p>
     * </li>
     * </ul>
     * 
     * @param dbStorageType
     *        The Timestream for InfluxDB DB storage type to read and write InfluxDB data.</p>
     *        <p>
     *        You can choose between 3 different types of provisioned Influx IOPS included storage according to your
     *        workloads requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Influx IO Included 3000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Influx IO Included 12000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Influx IO Included 16000 IOPS
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DbStorageType
     */

    public CreateDbInstanceRequest withDbStorageType(DbStorageType dbStorageType) {
        this.dbStorageType = dbStorageType.toString();
        return this;
    }

    /**
     * <p>
     * The amount of storage to allocate for your DB storage type in GiB (gibibytes).
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage to allocate for your DB storage type in GiB (gibibytes).
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage to allocate for your DB storage type in GiB (gibibytes).
     * </p>
     * 
     * @return The amount of storage to allocate for your DB storage type in GiB (gibibytes).
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage to allocate for your DB storage type in GiB (gibibytes).
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage to allocate for your DB storage type in GiB (gibibytes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The id of the DB parameter group to assign to your DB instance. DB parameter groups specify how the database is
     * configured. For example, DB parameter groups can specify the limit for query concurrency.
     * </p>
     * 
     * @param dbParameterGroupIdentifier
     *        The id of the DB parameter group to assign to your DB instance. DB parameter groups specify how the
     *        database is configured. For example, DB parameter groups can specify the limit for query concurrency.
     */

    public void setDbParameterGroupIdentifier(String dbParameterGroupIdentifier) {
        this.dbParameterGroupIdentifier = dbParameterGroupIdentifier;
    }

    /**
     * <p>
     * The id of the DB parameter group to assign to your DB instance. DB parameter groups specify how the database is
     * configured. For example, DB parameter groups can specify the limit for query concurrency.
     * </p>
     * 
     * @return The id of the DB parameter group to assign to your DB instance. DB parameter groups specify how the
     *         database is configured. For example, DB parameter groups can specify the limit for query concurrency.
     */

    public String getDbParameterGroupIdentifier() {
        return this.dbParameterGroupIdentifier;
    }

    /**
     * <p>
     * The id of the DB parameter group to assign to your DB instance. DB parameter groups specify how the database is
     * configured. For example, DB parameter groups can specify the limit for query concurrency.
     * </p>
     * 
     * @param dbParameterGroupIdentifier
     *        The id of the DB parameter group to assign to your DB instance. DB parameter groups specify how the
     *        database is configured. For example, DB parameter groups can specify the limit for query concurrency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbInstanceRequest withDbParameterGroupIdentifier(String dbParameterGroupIdentifier) {
        setDbParameterGroupIdentifier(dbParameterGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance will be deployed as a standalone instance or with a Multi-AZ standby for high
     * availability.
     * </p>
     * 
     * @param deploymentType
     *        Specifies whether the DB instance will be deployed as a standalone instance or with a Multi-AZ standby for
     *        high availability.
     * @see DeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Specifies whether the DB instance will be deployed as a standalone instance or with a Multi-AZ standby for high
     * availability.
     * </p>
     * 
     * @return Specifies whether the DB instance will be deployed as a standalone instance or with a Multi-AZ standby
     *         for high availability.
     * @see DeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * Specifies whether the DB instance will be deployed as a standalone instance or with a Multi-AZ standby for high
     * availability.
     * </p>
     * 
     * @param deploymentType
     *        Specifies whether the DB instance will be deployed as a standalone instance or with a Multi-AZ standby for
     *        high availability.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public CreateDbInstanceRequest withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance will be deployed as a standalone instance or with a Multi-AZ standby for high
     * availability.
     * </p>
     * 
     * @param deploymentType
     *        Specifies whether the DB instance will be deployed as a standalone instance or with a Multi-AZ standby for
     *        high availability.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public CreateDbInstanceRequest withDeploymentType(DeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
     * </p>
     * 
     * @param logDeliveryConfiguration
     *        Configuration for sending InfluxDB engine logs to a specified S3 bucket.
     */

    public void setLogDeliveryConfiguration(LogDeliveryConfiguration logDeliveryConfiguration) {
        this.logDeliveryConfiguration = logDeliveryConfiguration;
    }

    /**
     * <p>
     * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
     * </p>
     * 
     * @return Configuration for sending InfluxDB engine logs to a specified S3 bucket.
     */

    public LogDeliveryConfiguration getLogDeliveryConfiguration() {
        return this.logDeliveryConfiguration;
    }

    /**
     * <p>
     * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
     * </p>
     * 
     * @param logDeliveryConfiguration
     *        Configuration for sending InfluxDB engine logs to a specified S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbInstanceRequest withLogDeliveryConfiguration(LogDeliveryConfiguration logDeliveryConfiguration) {
        setLogDeliveryConfiguration(logDeliveryConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the DB instance.
     * </p>
     * 
     * @return A list of key-value pairs to associate with the DB instance.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the DB instance.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the DB instance.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the DB instance.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbInstanceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateDbInstanceRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbInstanceRequest addTagsEntry(String key, String value) {
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

    public CreateDbInstanceRequest clearTagsEntries() {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***").append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getOrganization() != null)
            sb.append("Organization: ").append(getOrganization()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getDbInstanceType() != null)
            sb.append("DbInstanceType: ").append(getDbInstanceType()).append(",");
        if (getVpcSubnetIds() != null)
            sb.append("VpcSubnetIds: ").append(getVpcSubnetIds()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getDbStorageType() != null)
            sb.append("DbStorageType: ").append(getDbStorageType()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getDbParameterGroupIdentifier() != null)
            sb.append("DbParameterGroupIdentifier: ").append(getDbParameterGroupIdentifier()).append(",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getLogDeliveryConfiguration() != null)
            sb.append("LogDeliveryConfiguration: ").append(getLogDeliveryConfiguration()).append(",");
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

        if (obj instanceof CreateDbInstanceRequest == false)
            return false;
        CreateDbInstanceRequest other = (CreateDbInstanceRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getOrganization() == null ^ this.getOrganization() == null)
            return false;
        if (other.getOrganization() != null && other.getOrganization().equals(this.getOrganization()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getDbInstanceType() == null ^ this.getDbInstanceType() == null)
            return false;
        if (other.getDbInstanceType() != null && other.getDbInstanceType().equals(this.getDbInstanceType()) == false)
            return false;
        if (other.getVpcSubnetIds() == null ^ this.getVpcSubnetIds() == null)
            return false;
        if (other.getVpcSubnetIds() != null && other.getVpcSubnetIds().equals(this.getVpcSubnetIds()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getDbStorageType() == null ^ this.getDbStorageType() == null)
            return false;
        if (other.getDbStorageType() != null && other.getDbStorageType().equals(this.getDbStorageType()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getDbParameterGroupIdentifier() == null ^ this.getDbParameterGroupIdentifier() == null)
            return false;
        if (other.getDbParameterGroupIdentifier() != null && other.getDbParameterGroupIdentifier().equals(this.getDbParameterGroupIdentifier()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getLogDeliveryConfiguration() == null ^ this.getLogDeliveryConfiguration() == null)
            return false;
        if (other.getLogDeliveryConfiguration() != null && other.getLogDeliveryConfiguration().equals(this.getLogDeliveryConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getOrganization() == null) ? 0 : getOrganization().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getDbInstanceType() == null) ? 0 : getDbInstanceType().hashCode());
        hashCode = prime * hashCode + ((getVpcSubnetIds() == null) ? 0 : getVpcSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getDbStorageType() == null) ? 0 : getDbStorageType().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getDbParameterGroupIdentifier() == null) ? 0 : getDbParameterGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getLogDeliveryConfiguration() == null) ? 0 : getLogDeliveryConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDbInstanceRequest clone() {
        return (CreateDbInstanceRequest) super.clone();
    }

}

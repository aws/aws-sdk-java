/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

/**
 * <p>
 * The data specification of an Amazon Relational Database Service
 * (Amazon RDS) <code>DataSource</code> .
 * </p>
 */
public class RDSDataSpec implements Serializable, Cloneable {

    /**
     * Describes the <code>DatabaseName</code> and
     * <code>InstanceIdentifier</code> of an an Amazon RDS database.
     */
    private RDSDatabase databaseInformation;

    /**
     * The query that is used to retrieve the observation data for the
     * <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     */
    private String selectSqlQuery;

    /**
     * The AWS Identity and Access Management (IAM) credentials that are used
     * connect to the Amazon RDS database.
     */
    private RDSDatabaseCredentials databaseCredentials;

    /**
     * The Amazon S3 location for staging Amazon RDS data. The data retrieved
     * from Amazon RDS using <code>SelectSqlQuery</code> is stored in this
     * location.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     */
    private String s3StagingLocation;

    /**
     * DataRearrangement - A JSON string that represents the splitting
     * requirement of a <code>DataSource</code>. <br/> <p> Sample - <code>
     * "{\"randomSeed\":\"some-random-seed\",
     * \"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     */
    private String dataRearrangement;

    /**
     * A JSON string that represents the schema. This is not required if
     * <code>DataSchemaUri</code> is specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     */
    private String dataSchema;

    /**
     * The Amazon S3 location of the <code>DataSchema</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     */
    private String dataSchemaUri;

    /**
     * The role (DataPipelineDefaultResourceRole) assumed by an Amazon
     * Elastic Compute Cloud (Amazon EC2) instance to carry out the copy
     * operation from Amazon RDS to an Amazon S3 task. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     * templates</a> for data pipelines.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String resourceRole;

    /**
     * The role (DataPipelineDefaultRole) assumed by AWS Data Pipeline
     * service to monitor the progress of the copy task from Amazon RDS to
     * Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     * templates</a> for data pipelines.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String serviceRole;

    /**
     * The subnet ID to be used to access a VPC-based RDS DB instance. This
     * attribute is used by Data Pipeline to carry out the copy task from
     * Amazon RDS to Amazon S3.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String subnetId;

    /**
     * The security group IDs to be used to access a VPC-based RDS DB
     * instance. Ensure that there are appropriate ingress rules set up to
     * allow access to the RDS DB instance. This attribute is used by Data
     * Pipeline to carry out the copy operation from Amazon RDS to an Amazon
     * S3 task.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIds;

    /**
     * Describes the <code>DatabaseName</code> and
     * <code>InstanceIdentifier</code> of an an Amazon RDS database.
     *
     * @return Describes the <code>DatabaseName</code> and
     *         <code>InstanceIdentifier</code> of an an Amazon RDS database.
     */
    public RDSDatabase getDatabaseInformation() {
        return databaseInformation;
    }
    
    /**
     * Describes the <code>DatabaseName</code> and
     * <code>InstanceIdentifier</code> of an an Amazon RDS database.
     *
     * @param databaseInformation Describes the <code>DatabaseName</code> and
     *         <code>InstanceIdentifier</code> of an an Amazon RDS database.
     */
    public void setDatabaseInformation(RDSDatabase databaseInformation) {
        this.databaseInformation = databaseInformation;
    }
    
    /**
     * Describes the <code>DatabaseName</code> and
     * <code>InstanceIdentifier</code> of an an Amazon RDS database.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param databaseInformation Describes the <code>DatabaseName</code> and
     *         <code>InstanceIdentifier</code> of an an Amazon RDS database.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSDataSpec withDatabaseInformation(RDSDatabase databaseInformation) {
        this.databaseInformation = databaseInformation;
        return this;
    }

    /**
     * The query that is used to retrieve the observation data for the
     * <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     *
     * @return The query that is used to retrieve the observation data for the
     *         <code>DataSource</code>.
     */
    public String getSelectSqlQuery() {
        return selectSqlQuery;
    }
    
    /**
     * The query that is used to retrieve the observation data for the
     * <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     *
     * @param selectSqlQuery The query that is used to retrieve the observation data for the
     *         <code>DataSource</code>.
     */
    public void setSelectSqlQuery(String selectSqlQuery) {
        this.selectSqlQuery = selectSqlQuery;
    }
    
    /**
     * The query that is used to retrieve the observation data for the
     * <code>DataSource</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     *
     * @param selectSqlQuery The query that is used to retrieve the observation data for the
     *         <code>DataSource</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSDataSpec withSelectSqlQuery(String selectSqlQuery) {
        this.selectSqlQuery = selectSqlQuery;
        return this;
    }

    /**
     * The AWS Identity and Access Management (IAM) credentials that are used
     * connect to the Amazon RDS database.
     *
     * @return The AWS Identity and Access Management (IAM) credentials that are used
     *         connect to the Amazon RDS database.
     */
    public RDSDatabaseCredentials getDatabaseCredentials() {
        return databaseCredentials;
    }
    
    /**
     * The AWS Identity and Access Management (IAM) credentials that are used
     * connect to the Amazon RDS database.
     *
     * @param databaseCredentials The AWS Identity and Access Management (IAM) credentials that are used
     *         connect to the Amazon RDS database.
     */
    public void setDatabaseCredentials(RDSDatabaseCredentials databaseCredentials) {
        this.databaseCredentials = databaseCredentials;
    }
    
    /**
     * The AWS Identity and Access Management (IAM) credentials that are used
     * connect to the Amazon RDS database.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param databaseCredentials The AWS Identity and Access Management (IAM) credentials that are used
     *         connect to the Amazon RDS database.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSDataSpec withDatabaseCredentials(RDSDatabaseCredentials databaseCredentials) {
        this.databaseCredentials = databaseCredentials;
        return this;
    }

    /**
     * The Amazon S3 location for staging Amazon RDS data. The data retrieved
     * from Amazon RDS using <code>SelectSqlQuery</code> is stored in this
     * location.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @return The Amazon S3 location for staging Amazon RDS data. The data retrieved
     *         from Amazon RDS using <code>SelectSqlQuery</code> is stored in this
     *         location.
     */
    public String getS3StagingLocation() {
        return s3StagingLocation;
    }
    
    /**
     * The Amazon S3 location for staging Amazon RDS data. The data retrieved
     * from Amazon RDS using <code>SelectSqlQuery</code> is stored in this
     * location.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param s3StagingLocation The Amazon S3 location for staging Amazon RDS data. The data retrieved
     *         from Amazon RDS using <code>SelectSqlQuery</code> is stored in this
     *         location.
     */
    public void setS3StagingLocation(String s3StagingLocation) {
        this.s3StagingLocation = s3StagingLocation;
    }
    
    /**
     * The Amazon S3 location for staging Amazon RDS data. The data retrieved
     * from Amazon RDS using <code>SelectSqlQuery</code> is stored in this
     * location.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param s3StagingLocation The Amazon S3 location for staging Amazon RDS data. The data retrieved
     *         from Amazon RDS using <code>SelectSqlQuery</code> is stored in this
     *         location.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSDataSpec withS3StagingLocation(String s3StagingLocation) {
        this.s3StagingLocation = s3StagingLocation;
        return this;
    }

    /**
     * DataRearrangement - A JSON string that represents the splitting
     * requirement of a <code>DataSource</code>. <br/> <p> Sample - <code>
     * "{\"randomSeed\":\"some-random-seed\",
     * \"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     *
     * @return DataRearrangement - A JSON string that represents the splitting
     *         requirement of a <code>DataSource</code>. <br/> <p> Sample - <code>
     *         "{\"randomSeed\":\"some-random-seed\",
     *         \"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     */
    public String getDataRearrangement() {
        return dataRearrangement;
    }
    
    /**
     * DataRearrangement - A JSON string that represents the splitting
     * requirement of a <code>DataSource</code>. <br/> <p> Sample - <code>
     * "{\"randomSeed\":\"some-random-seed\",
     * \"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     *
     * @param dataRearrangement DataRearrangement - A JSON string that represents the splitting
     *         requirement of a <code>DataSource</code>. <br/> <p> Sample - <code>
     *         "{\"randomSeed\":\"some-random-seed\",
     *         \"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     */
    public void setDataRearrangement(String dataRearrangement) {
        this.dataRearrangement = dataRearrangement;
    }
    
    /**
     * DataRearrangement - A JSON string that represents the splitting
     * requirement of a <code>DataSource</code>. <br/> <p> Sample - <code>
     * "{\"randomSeed\":\"some-random-seed\",
     * \"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataRearrangement DataRearrangement - A JSON string that represents the splitting
     *         requirement of a <code>DataSource</code>. <br/> <p> Sample - <code>
     *         "{\"randomSeed\":\"some-random-seed\",
     *         \"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSDataSpec withDataRearrangement(String dataRearrangement) {
        this.dataRearrangement = dataRearrangement;
        return this;
    }

    /**
     * A JSON string that represents the schema. This is not required if
     * <code>DataSchemaUri</code> is specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     *
     * @return A JSON string that represents the schema. This is not required if
     *         <code>DataSchemaUri</code> is specified.
     */
    public String getDataSchema() {
        return dataSchema;
    }
    
    /**
     * A JSON string that represents the schema. This is not required if
     * <code>DataSchemaUri</code> is specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     *
     * @param dataSchema A JSON string that represents the schema. This is not required if
     *         <code>DataSchemaUri</code> is specified.
     */
    public void setDataSchema(String dataSchema) {
        this.dataSchema = dataSchema;
    }
    
    /**
     * A JSON string that represents the schema. This is not required if
     * <code>DataSchemaUri</code> is specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     *
     * @param dataSchema A JSON string that represents the schema. This is not required if
     *         <code>DataSchemaUri</code> is specified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSDataSpec withDataSchema(String dataSchema) {
        this.dataSchema = dataSchema;
        return this;
    }

    /**
     * The Amazon S3 location of the <code>DataSchema</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @return The Amazon S3 location of the <code>DataSchema</code>.
     */
    public String getDataSchemaUri() {
        return dataSchemaUri;
    }
    
    /**
     * The Amazon S3 location of the <code>DataSchema</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param dataSchemaUri The Amazon S3 location of the <code>DataSchema</code>.
     */
    public void setDataSchemaUri(String dataSchemaUri) {
        this.dataSchemaUri = dataSchemaUri;
    }
    
    /**
     * The Amazon S3 location of the <code>DataSchema</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param dataSchemaUri The Amazon S3 location of the <code>DataSchema</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSDataSpec withDataSchemaUri(String dataSchemaUri) {
        this.dataSchemaUri = dataSchemaUri;
        return this;
    }

    /**
     * The role (DataPipelineDefaultResourceRole) assumed by an Amazon
     * Elastic Compute Cloud (Amazon EC2) instance to carry out the copy
     * operation from Amazon RDS to an Amazon S3 task. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     * templates</a> for data pipelines.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The role (DataPipelineDefaultResourceRole) assumed by an Amazon
     *         Elastic Compute Cloud (Amazon EC2) instance to carry out the copy
     *         operation from Amazon RDS to an Amazon S3 task. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     *         templates</a> for data pipelines.
     */
    public String getResourceRole() {
        return resourceRole;
    }
    
    /**
     * The role (DataPipelineDefaultResourceRole) assumed by an Amazon
     * Elastic Compute Cloud (Amazon EC2) instance to carry out the copy
     * operation from Amazon RDS to an Amazon S3 task. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     * templates</a> for data pipelines.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param resourceRole The role (DataPipelineDefaultResourceRole) assumed by an Amazon
     *         Elastic Compute Cloud (Amazon EC2) instance to carry out the copy
     *         operation from Amazon RDS to an Amazon S3 task. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     *         templates</a> for data pipelines.
     */
    public void setResourceRole(String resourceRole) {
        this.resourceRole = resourceRole;
    }
    
    /**
     * The role (DataPipelineDefaultResourceRole) assumed by an Amazon
     * Elastic Compute Cloud (Amazon EC2) instance to carry out the copy
     * operation from Amazon RDS to an Amazon S3 task. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     * templates</a> for data pipelines.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param resourceRole The role (DataPipelineDefaultResourceRole) assumed by an Amazon
     *         Elastic Compute Cloud (Amazon EC2) instance to carry out the copy
     *         operation from Amazon RDS to an Amazon S3 task. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     *         templates</a> for data pipelines.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSDataSpec withResourceRole(String resourceRole) {
        this.resourceRole = resourceRole;
        return this;
    }

    /**
     * The role (DataPipelineDefaultRole) assumed by AWS Data Pipeline
     * service to monitor the progress of the copy task from Amazon RDS to
     * Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     * templates</a> for data pipelines.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The role (DataPipelineDefaultRole) assumed by AWS Data Pipeline
     *         service to monitor the progress of the copy task from Amazon RDS to
     *         Amazon S3. For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     *         templates</a> for data pipelines.
     */
    public String getServiceRole() {
        return serviceRole;
    }
    
    /**
     * The role (DataPipelineDefaultRole) assumed by AWS Data Pipeline
     * service to monitor the progress of the copy task from Amazon RDS to
     * Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     * templates</a> for data pipelines.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param serviceRole The role (DataPipelineDefaultRole) assumed by AWS Data Pipeline
     *         service to monitor the progress of the copy task from Amazon RDS to
     *         Amazon S3. For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     *         templates</a> for data pipelines.
     */
    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }
    
    /**
     * The role (DataPipelineDefaultRole) assumed by AWS Data Pipeline
     * service to monitor the progress of the copy task from Amazon RDS to
     * Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     * templates</a> for data pipelines.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param serviceRole The role (DataPipelineDefaultRole) assumed by AWS Data Pipeline
     *         service to monitor the progress of the copy task from Amazon RDS to
     *         Amazon S3. For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     *         templates</a> for data pipelines.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSDataSpec withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * The subnet ID to be used to access a VPC-based RDS DB instance. This
     * attribute is used by Data Pipeline to carry out the copy task from
     * Amazon RDS to Amazon S3.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The subnet ID to be used to access a VPC-based RDS DB instance. This
     *         attribute is used by Data Pipeline to carry out the copy task from
     *         Amazon RDS to Amazon S3.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The subnet ID to be used to access a VPC-based RDS DB instance. This
     * attribute is used by Data Pipeline to carry out the copy task from
     * Amazon RDS to Amazon S3.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param subnetId The subnet ID to be used to access a VPC-based RDS DB instance. This
     *         attribute is used by Data Pipeline to carry out the copy task from
     *         Amazon RDS to Amazon S3.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The subnet ID to be used to access a VPC-based RDS DB instance. This
     * attribute is used by Data Pipeline to carry out the copy task from
     * Amazon RDS to Amazon S3.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param subnetId The subnet ID to be used to access a VPC-based RDS DB instance. This
     *         attribute is used by Data Pipeline to carry out the copy task from
     *         Amazon RDS to Amazon S3.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSDataSpec withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * The security group IDs to be used to access a VPC-based RDS DB
     * instance. Ensure that there are appropriate ingress rules set up to
     * allow access to the RDS DB instance. This attribute is used by Data
     * Pipeline to carry out the copy operation from Amazon RDS to an Amazon
     * S3 task.
     *
     * @return The security group IDs to be used to access a VPC-based RDS DB
     *         instance. Ensure that there are appropriate ingress rules set up to
     *         allow access to the RDS DB instance. This attribute is used by Data
     *         Pipeline to carry out the copy operation from Amazon RDS to an Amazon
     *         S3 task.
     */
    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
              securityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroupIds.setAutoConstruct(true);
        }
        return securityGroupIds;
    }
    
    /**
     * The security group IDs to be used to access a VPC-based RDS DB
     * instance. Ensure that there are appropriate ingress rules set up to
     * allow access to the RDS DB instance. This attribute is used by Data
     * Pipeline to carry out the copy operation from Amazon RDS to an Amazon
     * S3 task.
     *
     * @param securityGroupIds The security group IDs to be used to access a VPC-based RDS DB
     *         instance. Ensure that there are appropriate ingress rules set up to
     *         allow access to the RDS DB instance. This attribute is used by Data
     *         Pipeline to carry out the copy operation from Amazon RDS to an Amazon
     *         S3 task.
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroupIds.size());
        securityGroupIdsCopy.addAll(securityGroupIds);
        this.securityGroupIds = securityGroupIdsCopy;
    }
    
    /**
     * The security group IDs to be used to access a VPC-based RDS DB
     * instance. Ensure that there are appropriate ingress rules set up to
     * allow access to the RDS DB instance. This attribute is used by Data
     * Pipeline to carry out the copy operation from Amazon RDS to an Amazon
     * S3 task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds The security group IDs to be used to access a VPC-based RDS DB
     *         instance. Ensure that there are appropriate ingress rules set up to
     *         allow access to the RDS DB instance. This attribute is used by Data
     *         Pipeline to carry out the copy operation from Amazon RDS to an Amazon
     *         S3 task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSDataSpec withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        for (String value : securityGroupIds) {
            getSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * The security group IDs to be used to access a VPC-based RDS DB
     * instance. Ensure that there are appropriate ingress rules set up to
     * allow access to the RDS DB instance. This attribute is used by Data
     * Pipeline to carry out the copy operation from Amazon RDS to an Amazon
     * S3 task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds The security group IDs to be used to access a VPC-based RDS DB
     *         instance. Ensure that there are appropriate ingress rules set up to
     *         allow access to the RDS DB instance. This attribute is used by Data
     *         Pipeline to carry out the copy operation from Amazon RDS to an Amazon
     *         S3 task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSDataSpec withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroupIds.size());
            securityGroupIdsCopy.addAll(securityGroupIds);
            this.securityGroupIds = securityGroupIdsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDatabaseInformation() != null) sb.append("DatabaseInformation: " + getDatabaseInformation() + ",");
        if (getSelectSqlQuery() != null) sb.append("SelectSqlQuery: " + getSelectSqlQuery() + ",");
        if (getDatabaseCredentials() != null) sb.append("DatabaseCredentials: " + getDatabaseCredentials() + ",");
        if (getS3StagingLocation() != null) sb.append("S3StagingLocation: " + getS3StagingLocation() + ",");
        if (getDataRearrangement() != null) sb.append("DataRearrangement: " + getDataRearrangement() + ",");
        if (getDataSchema() != null) sb.append("DataSchema: " + getDataSchema() + ",");
        if (getDataSchemaUri() != null) sb.append("DataSchemaUri: " + getDataSchemaUri() + ",");
        if (getResourceRole() != null) sb.append("ResourceRole: " + getResourceRole() + ",");
        if (getServiceRole() != null) sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getSecurityGroupIds() != null) sb.append("SecurityGroupIds: " + getSecurityGroupIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDatabaseInformation() == null) ? 0 : getDatabaseInformation().hashCode()); 
        hashCode = prime * hashCode + ((getSelectSqlQuery() == null) ? 0 : getSelectSqlQuery().hashCode()); 
        hashCode = prime * hashCode + ((getDatabaseCredentials() == null) ? 0 : getDatabaseCredentials().hashCode()); 
        hashCode = prime * hashCode + ((getS3StagingLocation() == null) ? 0 : getS3StagingLocation().hashCode()); 
        hashCode = prime * hashCode + ((getDataRearrangement() == null) ? 0 : getDataRearrangement().hashCode()); 
        hashCode = prime * hashCode + ((getDataSchema() == null) ? 0 : getDataSchema().hashCode()); 
        hashCode = prime * hashCode + ((getDataSchemaUri() == null) ? 0 : getDataSchemaUri().hashCode()); 
        hashCode = prime * hashCode + ((getResourceRole() == null) ? 0 : getResourceRole().hashCode()); 
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RDSDataSpec == false) return false;
        RDSDataSpec other = (RDSDataSpec)obj;
        
        if (other.getDatabaseInformation() == null ^ this.getDatabaseInformation() == null) return false;
        if (other.getDatabaseInformation() != null && other.getDatabaseInformation().equals(this.getDatabaseInformation()) == false) return false; 
        if (other.getSelectSqlQuery() == null ^ this.getSelectSqlQuery() == null) return false;
        if (other.getSelectSqlQuery() != null && other.getSelectSqlQuery().equals(this.getSelectSqlQuery()) == false) return false; 
        if (other.getDatabaseCredentials() == null ^ this.getDatabaseCredentials() == null) return false;
        if (other.getDatabaseCredentials() != null && other.getDatabaseCredentials().equals(this.getDatabaseCredentials()) == false) return false; 
        if (other.getS3StagingLocation() == null ^ this.getS3StagingLocation() == null) return false;
        if (other.getS3StagingLocation() != null && other.getS3StagingLocation().equals(this.getS3StagingLocation()) == false) return false; 
        if (other.getDataRearrangement() == null ^ this.getDataRearrangement() == null) return false;
        if (other.getDataRearrangement() != null && other.getDataRearrangement().equals(this.getDataRearrangement()) == false) return false; 
        if (other.getDataSchema() == null ^ this.getDataSchema() == null) return false;
        if (other.getDataSchema() != null && other.getDataSchema().equals(this.getDataSchema()) == false) return false; 
        if (other.getDataSchemaUri() == null ^ this.getDataSchemaUri() == null) return false;
        if (other.getDataSchemaUri() != null && other.getDataSchemaUri().equals(this.getDataSchemaUri()) == false) return false; 
        if (other.getResourceRole() == null ^ this.getResourceRole() == null) return false;
        if (other.getResourceRole() != null && other.getResourceRole().equals(this.getResourceRole()) == false) return false; 
        if (other.getServiceRole() == null ^ this.getServiceRole() == null) return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null) return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false) return false; 
        return true;
    }
    
    @Override
    public RDSDataSpec clone() {
        try {
            return (RDSDataSpec) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    
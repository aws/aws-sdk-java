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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataSourceFromRDSRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>DataSource</code>. Typically, an Amazon Resource Number
     * (ARN) becomes the ID for a <code>DataSource</code>.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * A user-supplied name or description of the <code>DataSource</code>.
     * </p>
     */
    private String dataSourceName;
    /**
     * <p>
     * The data specification of an Amazon RDS <code>DataSource</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DatabaseInformation -
     * <ul>
     * <li> <code>DatabaseName</code> - The name of the Amazon RDS database.</li>
     * <li> <code>InstanceIdentifier </code> - A unique identifier for the Amazon RDS database instance.</li>
     * </ul>
     * </p>
     * </li>
     * <li>
     * <p>
     * DatabaseCredentials - AWS Identity and Access Management (IAM) credentials that are used to connect to the Amazon
     * RDS database.
     * </p>
     * </li>
     * <li>
     * <p>
     * ResourceRole - A role (DataPipelineDefaultResourceRole) assumed by an EC2 instance to carry out the copy task
     * from Amazon RDS to Amazon Simple Storage Service (Amazon S3). For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRole - A role (DataPipelineDefaultRole) assumed by the AWS Data Pipeline service to monitor the progress
     * of the copy task from Amazon RDS to Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * SecurityInfo - The security information to use to access an RDS DB instance. You need to set up appropriate
     * ingress rules for the security entity IDs provided to allow access to the Amazon RDS instance. Specify a [
     * <code>SubnetId</code>, <code>SecurityGroupIds</code>] pair for a VPC-based RDS DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * SelectSqlQuery - A query that is used to retrieve the observation data for the <code>Datasource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3StagingLocation - The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon RDS using
     * <code>SelectSqlQuery</code> is stored in this location.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchemaUri - The Amazon S3 location of the <code>DataSchema</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchema - A JSON string representing the schema. This is not required if <code>DataSchemaUri</code> is
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the
     * <code>Datasource</code>.
     * </p>
     * <br>
     * <p>
     * Sample - <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     * </p>
     * </li>
     * </ul>
     */
    private RDSDataSpec rDSData;
    /**
     * <p>
     * The role that Amazon ML assumes on behalf of the user to create and activate a data pipeline in the user's
     * account and copy data using the <code>SelectSqlQuery</code> query from Amazon RDS to Amazon S3.
     * </p>
     * <p>
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation data
     * referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during <code>MLModel</code>
     * training. This parameter must be set to <code>true</code> if the <code></code>DataSource<code></code> needs to be
     * used for <code>MLModel</code> training.
     * </p>
     */
    private Boolean computeStatistics;

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>DataSource</code>. Typically, an Amazon Resource Number
     * (ARN) becomes the ID for a <code>DataSource</code>.
     * </p>
     * 
     * @param dataSourceId
     *        A user-supplied ID that uniquely identifies the <code>DataSource</code>. Typically, an Amazon Resource
     *        Number (ARN) becomes the ID for a <code>DataSource</code>.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>DataSource</code>. Typically, an Amazon Resource Number
     * (ARN) becomes the ID for a <code>DataSource</code>.
     * </p>
     * 
     * @return A user-supplied ID that uniquely identifies the <code>DataSource</code>. Typically, an Amazon Resource
     *         Number (ARN) becomes the ID for a <code>DataSource</code>.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>DataSource</code>. Typically, an Amazon Resource Number
     * (ARN) becomes the ID for a <code>DataSource</code>.
     * </p>
     * 
     * @param dataSourceId
     *        A user-supplied ID that uniquely identifies the <code>DataSource</code>. Typically, an Amazon Resource
     *        Number (ARN) becomes the ID for a <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceFromRDSRequest withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>DataSource</code>.
     * </p>
     * 
     * @param dataSourceName
     *        A user-supplied name or description of the <code>DataSource</code>.
     */

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>DataSource</code>.
     * </p>
     * 
     * @return A user-supplied name or description of the <code>DataSource</code>.
     */

    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>DataSource</code>.
     * </p>
     * 
     * @param dataSourceName
     *        A user-supplied name or description of the <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceFromRDSRequest withDataSourceName(String dataSourceName) {
        setDataSourceName(dataSourceName);
        return this;
    }

    /**
     * <p>
     * The data specification of an Amazon RDS <code>DataSource</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DatabaseInformation -
     * <ul>
     * <li> <code>DatabaseName</code> - The name of the Amazon RDS database.</li>
     * <li> <code>InstanceIdentifier </code> - A unique identifier for the Amazon RDS database instance.</li>
     * </ul>
     * </p>
     * </li>
     * <li>
     * <p>
     * DatabaseCredentials - AWS Identity and Access Management (IAM) credentials that are used to connect to the Amazon
     * RDS database.
     * </p>
     * </li>
     * <li>
     * <p>
     * ResourceRole - A role (DataPipelineDefaultResourceRole) assumed by an EC2 instance to carry out the copy task
     * from Amazon RDS to Amazon Simple Storage Service (Amazon S3). For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRole - A role (DataPipelineDefaultRole) assumed by the AWS Data Pipeline service to monitor the progress
     * of the copy task from Amazon RDS to Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * SecurityInfo - The security information to use to access an RDS DB instance. You need to set up appropriate
     * ingress rules for the security entity IDs provided to allow access to the Amazon RDS instance. Specify a [
     * <code>SubnetId</code>, <code>SecurityGroupIds</code>] pair for a VPC-based RDS DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * SelectSqlQuery - A query that is used to retrieve the observation data for the <code>Datasource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3StagingLocation - The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon RDS using
     * <code>SelectSqlQuery</code> is stored in this location.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchemaUri - The Amazon S3 location of the <code>DataSchema</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchema - A JSON string representing the schema. This is not required if <code>DataSchemaUri</code> is
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the
     * <code>Datasource</code>.
     * </p>
     * <br>
     * <p>
     * Sample - <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param rDSData
     *        The data specification of an Amazon RDS <code>DataSource</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DatabaseInformation -
     *        <ul>
     *        <li> <code>DatabaseName</code> - The name of the Amazon RDS database.</li>
     *        <li> <code>InstanceIdentifier </code> - A unique identifier for the Amazon RDS database instance.</li>
     *        </ul>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DatabaseCredentials - AWS Identity and Access Management (IAM) credentials that are used to connect to the
     *        Amazon RDS database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ResourceRole - A role (DataPipelineDefaultResourceRole) assumed by an EC2 instance to carry out the copy
     *        task from Amazon RDS to Amazon Simple Storage Service (Amazon S3). For more information, see <a
     *        href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a>
     *        for data pipelines.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ServiceRole - A role (DataPipelineDefaultRole) assumed by the AWS Data Pipeline service to monitor the
     *        progress of the copy task from Amazon RDS to Amazon S3. For more information, see <a
     *        href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a>
     *        for data pipelines.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SecurityInfo - The security information to use to access an RDS DB instance. You need to set up
     *        appropriate ingress rules for the security entity IDs provided to allow access to the Amazon RDS instance.
     *        Specify a [<code>SubnetId</code>, <code>SecurityGroupIds</code>] pair for a VPC-based RDS DB instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SelectSqlQuery - A query that is used to retrieve the observation data for the <code>Datasource</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3StagingLocation - The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon RDS
     *        using <code>SelectSqlQuery</code> is stored in this location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataSchemaUri - The Amazon S3 location of the <code>DataSchema</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataSchema - A JSON string representing the schema. This is not required if <code>DataSchemaUri</code> is
     *        specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the
     *        <code>Datasource</code>.
     *        </p>
     *        <br>
     *        <p>
     *        Sample - <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     *        </p>
     *        </li>
     */

    public void setRDSData(RDSDataSpec rDSData) {
        this.rDSData = rDSData;
    }

    /**
     * <p>
     * The data specification of an Amazon RDS <code>DataSource</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DatabaseInformation -
     * <ul>
     * <li> <code>DatabaseName</code> - The name of the Amazon RDS database.</li>
     * <li> <code>InstanceIdentifier </code> - A unique identifier for the Amazon RDS database instance.</li>
     * </ul>
     * </p>
     * </li>
     * <li>
     * <p>
     * DatabaseCredentials - AWS Identity and Access Management (IAM) credentials that are used to connect to the Amazon
     * RDS database.
     * </p>
     * </li>
     * <li>
     * <p>
     * ResourceRole - A role (DataPipelineDefaultResourceRole) assumed by an EC2 instance to carry out the copy task
     * from Amazon RDS to Amazon Simple Storage Service (Amazon S3). For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRole - A role (DataPipelineDefaultRole) assumed by the AWS Data Pipeline service to monitor the progress
     * of the copy task from Amazon RDS to Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * SecurityInfo - The security information to use to access an RDS DB instance. You need to set up appropriate
     * ingress rules for the security entity IDs provided to allow access to the Amazon RDS instance. Specify a [
     * <code>SubnetId</code>, <code>SecurityGroupIds</code>] pair for a VPC-based RDS DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * SelectSqlQuery - A query that is used to retrieve the observation data for the <code>Datasource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3StagingLocation - The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon RDS using
     * <code>SelectSqlQuery</code> is stored in this location.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchemaUri - The Amazon S3 location of the <code>DataSchema</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchema - A JSON string representing the schema. This is not required if <code>DataSchemaUri</code> is
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the
     * <code>Datasource</code>.
     * </p>
     * <br>
     * <p>
     * Sample - <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The data specification of an Amazon RDS <code>DataSource</code>:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DatabaseInformation -
     *         <ul>
     *         <li> <code>DatabaseName</code> - The name of the Amazon RDS database.</li>
     *         <li> <code>InstanceIdentifier </code> - A unique identifier for the Amazon RDS database instance.</li>
     *         </ul>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DatabaseCredentials - AWS Identity and Access Management (IAM) credentials that are used to connect to
     *         the Amazon RDS database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ResourceRole - A role (DataPipelineDefaultResourceRole) assumed by an EC2 instance to carry out the copy
     *         task from Amazon RDS to Amazon Simple Storage Service (Amazon S3). For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a>
     *         for data pipelines.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ServiceRole - A role (DataPipelineDefaultRole) assumed by the AWS Data Pipeline service to monitor the
     *         progress of the copy task from Amazon RDS to Amazon S3. For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a>
     *         for data pipelines.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SecurityInfo - The security information to use to access an RDS DB instance. You need to set up
     *         appropriate ingress rules for the security entity IDs provided to allow access to the Amazon RDS
     *         instance. Specify a [<code>SubnetId</code>, <code>SecurityGroupIds</code>] pair for a VPC-based RDS DB
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SelectSqlQuery - A query that is used to retrieve the observation data for the <code>Datasource</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         S3StagingLocation - The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon
     *         RDS using <code>SelectSqlQuery</code> is stored in this location.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DataSchemaUri - The Amazon S3 location of the <code>DataSchema</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DataSchema - A JSON string representing the schema. This is not required if <code>DataSchemaUri</code> is
     *         specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the
     *         <code>Datasource</code>.
     *         </p>
     *         <br>
     *         <p>
     *         Sample - <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     *         </p>
     *         </li>
     */

    public RDSDataSpec getRDSData() {
        return this.rDSData;
    }

    /**
     * <p>
     * The data specification of an Amazon RDS <code>DataSource</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DatabaseInformation -
     * <ul>
     * <li> <code>DatabaseName</code> - The name of the Amazon RDS database.</li>
     * <li> <code>InstanceIdentifier </code> - A unique identifier for the Amazon RDS database instance.</li>
     * </ul>
     * </p>
     * </li>
     * <li>
     * <p>
     * DatabaseCredentials - AWS Identity and Access Management (IAM) credentials that are used to connect to the Amazon
     * RDS database.
     * </p>
     * </li>
     * <li>
     * <p>
     * ResourceRole - A role (DataPipelineDefaultResourceRole) assumed by an EC2 instance to carry out the copy task
     * from Amazon RDS to Amazon Simple Storage Service (Amazon S3). For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRole - A role (DataPipelineDefaultRole) assumed by the AWS Data Pipeline service to monitor the progress
     * of the copy task from Amazon RDS to Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * SecurityInfo - The security information to use to access an RDS DB instance. You need to set up appropriate
     * ingress rules for the security entity IDs provided to allow access to the Amazon RDS instance. Specify a [
     * <code>SubnetId</code>, <code>SecurityGroupIds</code>] pair for a VPC-based RDS DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * SelectSqlQuery - A query that is used to retrieve the observation data for the <code>Datasource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3StagingLocation - The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon RDS using
     * <code>SelectSqlQuery</code> is stored in this location.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchemaUri - The Amazon S3 location of the <code>DataSchema</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchema - A JSON string representing the schema. This is not required if <code>DataSchemaUri</code> is
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the
     * <code>Datasource</code>.
     * </p>
     * <br>
     * <p>
     * Sample - <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param rDSData
     *        The data specification of an Amazon RDS <code>DataSource</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DatabaseInformation -
     *        <ul>
     *        <li> <code>DatabaseName</code> - The name of the Amazon RDS database.</li>
     *        <li> <code>InstanceIdentifier </code> - A unique identifier for the Amazon RDS database instance.</li>
     *        </ul>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DatabaseCredentials - AWS Identity and Access Management (IAM) credentials that are used to connect to the
     *        Amazon RDS database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ResourceRole - A role (DataPipelineDefaultResourceRole) assumed by an EC2 instance to carry out the copy
     *        task from Amazon RDS to Amazon Simple Storage Service (Amazon S3). For more information, see <a
     *        href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a>
     *        for data pipelines.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ServiceRole - A role (DataPipelineDefaultRole) assumed by the AWS Data Pipeline service to monitor the
     *        progress of the copy task from Amazon RDS to Amazon S3. For more information, see <a
     *        href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a>
     *        for data pipelines.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SecurityInfo - The security information to use to access an RDS DB instance. You need to set up
     *        appropriate ingress rules for the security entity IDs provided to allow access to the Amazon RDS instance.
     *        Specify a [<code>SubnetId</code>, <code>SecurityGroupIds</code>] pair for a VPC-based RDS DB instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SelectSqlQuery - A query that is used to retrieve the observation data for the <code>Datasource</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3StagingLocation - The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon RDS
     *        using <code>SelectSqlQuery</code> is stored in this location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataSchemaUri - The Amazon S3 location of the <code>DataSchema</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataSchema - A JSON string representing the schema. This is not required if <code>DataSchemaUri</code> is
     *        specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the
     *        <code>Datasource</code>.
     *        </p>
     *        <br>
     *        <p>
     *        Sample - <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceFromRDSRequest withRDSData(RDSDataSpec rDSData) {
        setRDSData(rDSData);
        return this;
    }

    /**
     * <p>
     * The role that Amazon ML assumes on behalf of the user to create and activate a data pipeline in the user's
     * account and copy data using the <code>SelectSqlQuery</code> query from Amazon RDS to Amazon S3.
     * </p>
     * <p>
     * </p>
     * 
     * @param roleARN
     *        The role that Amazon ML assumes on behalf of the user to create and activate a data pipeline in the user's
     *        account and copy data using the <code>SelectSqlQuery</code> query from Amazon RDS to Amazon S3.</p>
     *        <p>
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The role that Amazon ML assumes on behalf of the user to create and activate a data pipeline in the user's
     * account and copy data using the <code>SelectSqlQuery</code> query from Amazon RDS to Amazon S3.
     * </p>
     * <p>
     * </p>
     * 
     * @return The role that Amazon ML assumes on behalf of the user to create and activate a data pipeline in the
     *         user's account and copy data using the <code>SelectSqlQuery</code> query from Amazon RDS to Amazon
     *         S3.</p>
     *         <p>
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The role that Amazon ML assumes on behalf of the user to create and activate a data pipeline in the user's
     * account and copy data using the <code>SelectSqlQuery</code> query from Amazon RDS to Amazon S3.
     * </p>
     * <p>
     * </p>
     * 
     * @param roleARN
     *        The role that Amazon ML assumes on behalf of the user to create and activate a data pipeline in the user's
     *        account and copy data using the <code>SelectSqlQuery</code> query from Amazon RDS to Amazon S3.</p>
     *        <p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceFromRDSRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation data
     * referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during <code>MLModel</code>
     * training. This parameter must be set to <code>true</code> if the <code></code>DataSource<code></code> needs to be
     * used for <code>MLModel</code> training.
     * </p>
     * 
     * @param computeStatistics
     *        The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation
     *        data referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during
     *        <code>MLModel</code> training. This parameter must be set to <code>true</code> if the <code></code>
     *        DataSource<code></code> needs to be used for <code>MLModel</code> training.
     */

    public void setComputeStatistics(Boolean computeStatistics) {
        this.computeStatistics = computeStatistics;
    }

    /**
     * <p>
     * The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation data
     * referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during <code>MLModel</code>
     * training. This parameter must be set to <code>true</code> if the <code></code>DataSource<code></code> needs to be
     * used for <code>MLModel</code> training.
     * </p>
     * 
     * @return The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation
     *         data referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during
     *         <code>MLModel</code> training. This parameter must be set to <code>true</code> if the <code></code>
     *         DataSource<code></code> needs to be used for <code>MLModel</code> training.
     */

    public Boolean getComputeStatistics() {
        return this.computeStatistics;
    }

    /**
     * <p>
     * The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation data
     * referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during <code>MLModel</code>
     * training. This parameter must be set to <code>true</code> if the <code></code>DataSource<code></code> needs to be
     * used for <code>MLModel</code> training.
     * </p>
     * 
     * @param computeStatistics
     *        The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation
     *        data referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during
     *        <code>MLModel</code> training. This parameter must be set to <code>true</code> if the <code></code>
     *        DataSource<code></code> needs to be used for <code>MLModel</code> training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceFromRDSRequest withComputeStatistics(Boolean computeStatistics) {
        setComputeStatistics(computeStatistics);
        return this;
    }

    /**
     * <p>
     * The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation data
     * referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during <code>MLModel</code>
     * training. This parameter must be set to <code>true</code> if the <code></code>DataSource<code></code> needs to be
     * used for <code>MLModel</code> training.
     * </p>
     * 
     * @return The compute statistics for a <code>DataSource</code>. The statistics are generated from the observation
     *         data referenced by a <code>DataSource</code>. Amazon ML uses the statistics internally during
     *         <code>MLModel</code> training. This parameter must be set to <code>true</code> if the <code></code>
     *         DataSource<code></code> needs to be used for <code>MLModel</code> training.
     */

    public Boolean isComputeStatistics() {
        return this.computeStatistics;
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
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getDataSourceName() != null)
            sb.append("DataSourceName: ").append(getDataSourceName()).append(",");
        if (getRDSData() != null)
            sb.append("RDSData: ").append(getRDSData()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getComputeStatistics() != null)
            sb.append("ComputeStatistics: ").append(getComputeStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataSourceFromRDSRequest == false)
            return false;
        CreateDataSourceFromRDSRequest other = (CreateDataSourceFromRDSRequest) obj;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getDataSourceName() == null ^ this.getDataSourceName() == null)
            return false;
        if (other.getDataSourceName() != null && other.getDataSourceName().equals(this.getDataSourceName()) == false)
            return false;
        if (other.getRDSData() == null ^ this.getRDSData() == null)
            return false;
        if (other.getRDSData() != null && other.getRDSData().equals(this.getRDSData()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getComputeStatistics() == null ^ this.getComputeStatistics() == null)
            return false;
        if (other.getComputeStatistics() != null && other.getComputeStatistics().equals(this.getComputeStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getDataSourceName() == null) ? 0 : getDataSourceName().hashCode());
        hashCode = prime * hashCode + ((getRDSData() == null) ? 0 : getRDSData().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getComputeStatistics() == null) ? 0 : getComputeStatistics().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataSourceFromRDSRequest clone() {
        return (CreateDataSourceFromRDSRequest) super.clone();
    }

}

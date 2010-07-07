/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds;

import com.amazonaws.*;
import com.amazonaws.services.rds.model.*;

/**
 * Interface for accessing AmazonRDS.
 * <p>
 * Amazon Relational Database Service (Amazon RDS) is a web service that
 * makes it easier to set up, operate, and scale a relational database in
 * the cloud. It provides cost-efficient, resizable capacity for an
 * industry-standard relational database and manages common database
 * administration tasks, freeing up developers to focus on what makes
 * their applications and businesses unique.
 * </p>
 * <p>
 * Amazon RDS gives you access to the capabilities of a familiar MySQL
 * database server. This means the code, applications, and tools you
 * already use today with your existing MySQL databases work with Amazon
 * RDS without modification. Amazon RDS automatically backs up your
 * database and maintains the database software that powers your DB
 * Instance. Amazon RDS is flexible: you can scale your database
 * instance's compute resources and storage capacity to meet your
 * application's demand. As with all Amazon Web Services, there are no
 * up-front investments, and you pay only for the resources you use.
 * </p>
 */
public interface AmazonRDS {

    /**
     * Overrides the default endpoint for this client ("https://rds.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ec2.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://ec2.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "ec2.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://ec2.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * This API returns a list of DBSecurityGroup descriptions. If a
     * DBSecurityGroupName is specified, the list will contain only the
     * descriptions of the specified DBSecurityGroup.
     * </p>
     *
     * @param describeDBSecurityGroupsRequest Container for the necessary
     *           parameters to execute the DescribeDBSecurityGroups service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeDBSecurityGroups service method,
     *         as returned by AmazonRDS.
     * 
     * @throws DBSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBSecurityGroupsResult describeDBSecurityGroups(DescribeDBSecurityGroupsRequest describeDBSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API creates a new DB Instance to an arbitrary point-in-time.
     * Users can restore to any point in time before the latestRestorableTime
     * for up to backupRetentionPeriod days. The target database is created
     * from the source database with the same configuration as the original
     * database except that the DB instance is created with the default DB
     * security group.
     * </p>
     *
     * @param restoreDBInstanceFromDBSnapshotRequest Container for the
     *           necessary parameters to execute the RestoreDBInstanceFromDBSnapshot
     *           service method on AmazonRDS.
     * 
     * @return The response from the RestoreDBInstanceFromDBSnapshot service
     *         method, as returned by AmazonRDS.
     * 
     * @throws InstanceQuotaExceededException
     * @throws DBInstanceAlreadyExistsException
     * @throws StorageQuotaExceededException
     * @throws InvalidDBSnapshotStateException
     * @throws InsufficientDBInstanceCapacityException
     * @throws DBSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBInstance restoreDBInstanceFromDBSnapshot(RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is used to change RDS Instance settings. Users call the
     * ModifyDBInstance API to change one or more database configuration
     * parameters by specifying these parameters and the new values in the
     * request.
     * </p>
     *
     * @param modifyDBInstanceRequest Container for the necessary parameters
     *           to execute the ModifyDBInstance service method on AmazonRDS.
     * 
     * @return The response from the ModifyDBInstance service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws DBSecurityGroupNotFoundException
     * @throws InvalidDBSecurityGroupStateException
     * @throws InsufficientDBInstanceCapacityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBInstance modifyDBInstance(ModifyDBInstanceRequest modifyDBInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API creates a new database parameter group.
     * </p>
     *
     * @param createDBParameterGroupRequest Container for the necessary
     *           parameters to execute the CreateDBParameterGroup service method on
     *           AmazonRDS.
     * 
     * @return The response from the CreateDBParameterGroup service method,
     *         as returned by AmazonRDS.
     * 
     * @throws DBParameterGroupQuotaExceededException
     * @throws DBParameterGroupAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBParameterGroup createDBParameterGroup(CreateDBParameterGroupRequest createDBParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API deletes a database security group. Database security group
     * must not be associated with any RDS Instances.
     * </p>
     *
     * @param deleteDBSecurityGroupRequest Container for the necessary
     *           parameters to execute the DeleteDBSecurityGroup service method on
     *           AmazonRDS.
     * 
     * @throws DBSecurityGroupNotFoundException
     * @throws InvalidDBSecurityGroupStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteDBSecurityGroup(DeleteDBSecurityGroupRequest deleteDBSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API creates a new DB instance.
     * </p>
     *
     * @param createDBInstanceRequest Container for the necessary parameters
     *           to execute the CreateDBInstance service method on AmazonRDS.
     * 
     * @return The response from the CreateDBInstance service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     * @throws InstanceQuotaExceededException
     * @throws DBInstanceAlreadyExistsException
     * @throws StorageQuotaExceededException
     * @throws DBSecurityGroupNotFoundException
     * @throws InsufficientDBInstanceCapacityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBInstance createDBInstance(CreateDBInstanceRequest createDBInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API creates a new database security group. Database Security
     * groups control access to a database instance.
     * </p>
     *
     * @param createDBSecurityGroupRequest Container for the necessary
     *           parameters to execute the CreateDBSecurityGroup service method on
     *           AmazonRDS.
     * 
     * @return The response from the CreateDBSecurityGroup service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBSecurityGroupQuotaExceededException
     * @throws DBSecurityGroupAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBSecurityGroup createDBSecurityGroup(CreateDBSecurityGroupRequest createDBSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The RebootDBInstance API reboots a previously provisioned RDS
     * instance. This API results in the application of modified
     * DBParameterGroup parameters with ApplyStatus of pending-reboot to the
     * RDS instance. This action is taken as soon as possible, and results in
     * a momentary outage to the RDS instance during which the RDS instance
     * status is set to rebooting. A DBInstance event is created when the
     * reboot is completed.
     * </p>
     *
     * @param rebootDBInstanceRequest Container for the necessary parameters
     *           to execute the RebootDBInstance service method on AmazonRDS.
     * 
     * @return The response from the RebootDBInstance service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBInstance rebootDBInstance(RebootDBInstanceRequest rebootDBInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API allows for ingress to a DBSecurityGroup using one of two
     * forms of authorization. First, EC2 Security Groups can be added to the
     * DBSecurityGroup if the application using the database is running on
     * EC2 instances. Second, IP ranges are available if the application
     * accessing your database is running on the Internet. Required
     * parameters for this API are one of CIDR range or (EC2SecurityGroupName
     * AND EC2SecurityGroupOwnerId).
     * </p>
     *
     * @param authorizeDBSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the AuthorizeDBSecurityGroupIngress
     *           service method on AmazonRDS.
     * 
     * @return The response from the AuthorizeDBSecurityGroupIngress service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBSecurityGroupNotFoundException
     * @throws InvalidDBSecurityGroupStateException
     * @throws AuthorizationAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBSecurityGroup authorizeDBSecurityGroupIngress(AuthorizeDBSecurityGroupIngressRequest authorizeDBSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is used to delete a DBSnapshot. The DBSnapshot must be in
     * the "available" state to be deleted.
     * </p>
     *
     * @param deleteDBSnapshotRequest Container for the necessary parameters
     *           to execute the DeleteDBSnapshot service method on AmazonRDS.
     * 
     * @return The response from the DeleteDBSnapshot service method, as
     *         returned by AmazonRDS.
     * 
     * @throws InvalidDBSnapshotStateException
     * @throws DBSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBSnapshot deleteDBSnapshot(DeleteDBSnapshotRequest deleteDBSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API deletes a particular DBParameterGroup. The DBParameterGroup
     * cannot be associated with any RDS instances to be deleted.
     * </p>
     *
     * @param deleteDBParameterGroupRequest Container for the necessary
     *           parameters to execute the DeleteDBParameterGroup service method on
     *           AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     * @throws InvalidDBParameterGroupStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteDBParameterGroup(DeleteDBParameterGroupRequest deleteDBParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API returns events related to DB Instances, DB Security Groups,
     * DB Snapshots and DB Parameter Groups for the past 14 das. Events
     * specific to a particular DB Instance, database security group,
     * database snapshot or database parameter group can be obtained by
     * providing the name as a parameter. By default, the past hour of events
     * are returned.
     * </p>
     *
     * @param describeEventsRequest Container for the necessary parameters to
     *           execute the DescribeEvents service method on AmazonRDS.
     * 
     * @return The response from the DescribeEvents service method, as
     *         returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is used to retrieve information about provisioned RDS
     * instances. DescribeDBInstances supports pagination.
     * </p>
     *
     * @param describeDBInstancesRequest Container for the necessary
     *           parameters to execute the DescribeDBInstances service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeDBInstances service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBInstanceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBInstancesResult describeDBInstances(DescribeDBInstancesRequest describeDBInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API returns a list of DBParameterGroup descriptions. If a
     * DBParameterGroupName is specified, the list will contain only the
     * descriptions of the specified DBParameterGroup.
     * </p>
     *
     * @param describeDBParameterGroupsRequest Container for the necessary
     *           parameters to execute the DescribeDBParameterGroups service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeDBParameterGroups service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBParameterGroupsResult describeDBParameterGroups(DescribeDBParameterGroupsRequest describeDBParameterGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API returns the default engine and system parameter information
     * for the specified database engine.
     * </p>
     *
     * @param describeEngineDefaultParametersRequest Container for the
     *           necessary parameters to execute the DescribeEngineDefaultParameters
     *           service method on AmazonRDS.
     * 
     * @return The response from the DescribeEngineDefaultParameters service
     *         method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EngineDefaults describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API modifies the parameters of a DBParameterGroup. To modify
     * more than one parameter submit a list of the following: ParameterName,
     * ParameterValue, and ApplyMethod. A maximum of 20 parameters can be
     * modified in a single request.
     * </p>
     *
     * @param modifyDBParameterGroupRequest Container for the necessary
     *           parameters to execute the ModifyDBParameterGroup service method on
     *           AmazonRDS.
     * 
     * @return The response from the ModifyDBParameterGroup service method,
     *         as returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     * @throws InvalidDBParameterGroupStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifyDBParameterGroupResult modifyDBParameterGroup(ModifyDBParameterGroupRequest modifyDBParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is used to retrieve information about DBSnapshots. This API
     * supports pagination.
     * </p>
     *
     * @param describeDBSnapshotsRequest Container for the necessary
     *           parameters to execute the DescribeDBSnapshots service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeDBSnapshots service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBSnapshotsResult describeDBSnapshots(DescribeDBSnapshotsRequest describeDBSnapshotsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API modifies the parameters of a DBParameterGroup to the
     * engine/system default value. To reset specific parameters submit a
     * list of the following: ParameterName and ApplyMethod. To reset the
     * entire DBParameterGroup specify the DBParameterGroup name and
     * ResetAllParameters parameters. When resetting the entire group,
     * dynamic parameters are updated immediately and static parameters are
     * set to pending-reboot to take effect on the next MySQL reboot or
     * RebootDBInstance request.
     * </p>
     *
     * @param resetDBParameterGroupRequest Container for the necessary
     *           parameters to execute the ResetDBParameterGroup service method on
     *           AmazonRDS.
     * 
     * @return The response from the ResetDBParameterGroup service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     * @throws InvalidDBParameterGroupStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ResetDBParameterGroupResult resetDBParameterGroup(ResetDBParameterGroupRequest resetDBParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API returns the detailed parameter list for a particular
     * DBParameterGroup.
     * </p>
     *
     * @param describeDBParametersRequest Container for the necessary
     *           parameters to execute the DescribeDBParameters service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeDBParameters service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBParametersResult describeDBParameters(DescribeDBParametersRequest describeDBParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DeleteDBInstance API deletes a previously provisioned RDS
     * instance. A successful response from the web service indicates the
     * request was received correctly. If a final DBSnapshot is requested the
     * status of the RDS instance will be "deleting" until the DBSnapshot is
     * created. DescribeDBInstance is used to monitor the status of this
     * operation. This cannot be canceled or reverted once submitted.
     * </p>
     *
     * @param deleteDBInstanceRequest Container for the necessary parameters
     *           to execute the DeleteDBInstance service method on AmazonRDS.
     * 
     * @return The response from the DeleteDBInstance service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws SnapshotQuotaExceededException
     * @throws DBSnapshotAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBInstance deleteDBInstance(DeleteDBInstanceRequest deleteDBInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API creates a new RDS instance from a point-in-time system
     * snapshot. The target database is created from the source database
     * restore point with the same configuration as the original source
     * database, except that the new RDS instance is created with the default
     * security group.
     * </p>
     *
     * @param restoreDBInstanceToPointInTimeRequest Container for the
     *           necessary parameters to execute the RestoreDBInstanceToPointInTime
     *           service method on AmazonRDS.
     * 
     * @return The response from the RestoreDBInstanceToPointInTime service
     *         method, as returned by AmazonRDS.
     * 
     * @throws PointInTimeRestoreNotEnabledException
     * @throws InstanceQuotaExceededException
     * @throws DBInstanceAlreadyExistsException
     * @throws DBInstanceNotFoundException
     * @throws StorageQuotaExceededException
     * @throws InvalidDBInstanceStateException
     * @throws InsufficientDBInstanceCapacityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBInstance restoreDBInstanceToPointInTime(RestoreDBInstanceToPointInTimeRequest restoreDBInstanceToPointInTimeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is used to create a DBSnapshot. The source DBInstance must
     * be in "available" state.
     * </p>
     *
     * @param createDBSnapshotRequest Container for the necessary parameters
     *           to execute the CreateDBSnapshot service method on AmazonRDS.
     * 
     * @return The response from the CreateDBSnapshot service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws SnapshotQuotaExceededException
     * @throws DBSnapshotAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBSnapshot createDBSnapshot(CreateDBSnapshotRequest createDBSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API revokes ingress from a DBSecurityGroup for previously
     * authorized IP ranges or EC2 Security Groups. Required parameters for
     * this API are one of CIDRIP or (EC2SecurityGroupName AND
     * EC2SecurityGroupOwnerId).
     * </p>
     *
     * @param revokeDBSecurityGroupIngressRequest Container for the necessary
     *           parameters to execute the RevokeDBSecurityGroupIngress service method
     *           on AmazonRDS.
     * 
     * @return The response from the RevokeDBSecurityGroupIngress service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBSecurityGroupNotFoundException
     * @throws InvalidDBSecurityGroupStateException
     * @throws AuthorizationNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBSecurityGroup revokeDBSecurityGroupIngress(RevokeDBSecurityGroupIngressRequest revokeDBSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API returns a list of DBSecurityGroup descriptions. If a
     * DBSecurityGroupName is specified, the list will contain only the
     * descriptions of the specified DBSecurityGroup.
     * </p>
     * 
     * @return The response from the DescribeDBSecurityGroups service method,
     *         as returned by AmazonRDS.
     * 
     * @throws DBSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBSecurityGroupsResult describeDBSecurityGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * This API returns events related to DB Instances, DB Security Groups,
     * DB Snapshots and DB Parameter Groups for the past 14 das. Events
     * specific to a particular DB Instance, database security group,
     * database snapshot or database parameter group can be obtained by
     * providing the name as a parameter. By default, the past hour of events
     * are returned.
     * </p>
     * 
     * @return The response from the DescribeEvents service method, as
     *         returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * This API is used to retrieve information about provisioned RDS
     * instances. DescribeDBInstances supports pagination.
     * </p>
     * 
     * @return The response from the DescribeDBInstances service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBInstanceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBInstancesResult describeDBInstances() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * This API returns a list of DBParameterGroup descriptions. If a
     * DBParameterGroupName is specified, the list will contain only the
     * descriptions of the specified DBParameterGroup.
     * </p>
     * 
     * @return The response from the DescribeDBParameterGroups service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBParameterGroupsResult describeDBParameterGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * This API is used to retrieve information about DBSnapshots. This API
     * supports pagination.
     * </p>
     * 
     * @return The response from the DescribeDBSnapshots service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBSnapshotsResult describeDBSnapshots() throws AmazonServiceException, AmazonClientException;
    

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
}
        
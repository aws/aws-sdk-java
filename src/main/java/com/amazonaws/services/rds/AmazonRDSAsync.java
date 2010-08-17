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
            
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.rds.model.*;

/**
 * Interface for accessing AmazonRDS asynchronously,
 * using Java Futures.
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
public interface AmazonRDSAsync extends AmazonRDS {
    /**
     * <p>
     * This API deletes a database security group. Database security group
     * must not be associated with any RDS Instances.
     * </p>
     *
     * @param deleteDBSecurityGroupRequest Container for the necessary
     *           parameters to execute the DeleteDBSecurityGroup operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDBSecurityGroup service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDBSecurityGroupAsync(DeleteDBSecurityGroupRequest deleteDBSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is used to delete a DBSnapshot. The DBSnapshot must be in
     * the "available" state to be deleted.
     * </p>
     *
     * @param deleteDBSnapshotRequest Container for the necessary parameters
     *           to execute the DeleteDBSnapshot operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDBSnapshot service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSnapshot> deleteDBSnapshotAsync(DeleteDBSnapshotRequest deleteDBSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param describeReservedDBInstancesRequest Container for the necessary
     *           parameters to execute the DescribeReservedDBInstances operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedDBInstances service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedDBInstancesResult> describeReservedDBInstancesAsync(DescribeReservedDBInstancesRequest describeReservedDBInstancesRequest) 
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
     *           operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         AuthorizeDBSecurityGroupIngress service method, as returned by
     *         AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSecurityGroup> authorizeDBSecurityGroupIngressAsync(AuthorizeDBSecurityGroupIngressRequest authorizeDBSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API returns the detailed parameter list for a particular
     * DBParameterGroup.
     * </p>
     *
     * @param describeDBParametersRequest Container for the necessary
     *           parameters to execute the DescribeDBParameters operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBParameters service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBParametersResult> describeDBParametersAsync(DescribeDBParametersRequest describeDBParametersRequest) 
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
     *           parameters to execute the ModifyDBParameterGroup operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyDBParameterGroup service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyDBParameterGroupResult> modifyDBParameterGroupAsync(ModifyDBParameterGroupRequest modifyDBParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param purchaseReservedDBInstancesOfferingRequest Container for the
     *           necessary parameters to execute the
     *           PurchaseReservedDBInstancesOffering operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         PurchaseReservedDBInstancesOffering service method, as returned by
     *         AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReservedDBInstance> purchaseReservedDBInstancesOfferingAsync(PurchaseReservedDBInstancesOfferingRequest purchaseReservedDBInstancesOfferingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API returns a list of DBSecurityGroup descriptions. If a
     * DBSecurityGroupName is specified, the list will contain only the
     * descriptions of the specified DBSecurityGroup.
     * </p>
     *
     * @param describeDBSecurityGroupsRequest Container for the necessary
     *           parameters to execute the DescribeDBSecurityGroups operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBSecurityGroups service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBSecurityGroupsResult> describeDBSecurityGroupsAsync(DescribeDBSecurityGroupsRequest describeDBSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is used to retrieve information about provisioned RDS
     * instances. DescribeDBInstances supports pagination.
     * </p>
     *
     * @param describeDBInstancesRequest Container for the necessary
     *           parameters to execute the DescribeDBInstances operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBInstances service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBInstancesResult> describeDBInstancesAsync(DescribeDBInstancesRequest describeDBInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param describeDBEngineVersionsRequest Container for the necessary
     *           parameters to execute the DescribeDBEngineVersions operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBEngineVersions service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API creates a new database security group. Database Security
     * groups control access to a database instance.
     * </p>
     *
     * @param createDBSecurityGroupRequest Container for the necessary
     *           parameters to execute the CreateDBSecurityGroup operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDBSecurityGroup service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSecurityGroup> createDBSecurityGroupAsync(CreateDBSecurityGroupRequest createDBSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is used to retrieve information about DBSnapshots. This API
     * supports pagination.
     * </p>
     *
     * @param describeDBSnapshotsRequest Container for the necessary
     *           parameters to execute the DescribeDBSnapshots operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBSnapshots service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBSnapshotsResult> describeDBSnapshotsAsync(DescribeDBSnapshotsRequest describeDBSnapshotsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API creates a new database parameter group.
     * </p>
     *
     * @param createDBParameterGroupRequest Container for the necessary
     *           parameters to execute the CreateDBParameterGroup operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDBParameterGroup service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBParameterGroup> createDBParameterGroupAsync(CreateDBParameterGroupRequest createDBParameterGroupRequest) 
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
     *           operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         RestoreDBInstanceToPointInTime service method, as returned by
     *         AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> restoreDBInstanceToPointInTimeAsync(RestoreDBInstanceToPointInTimeRequest restoreDBInstanceToPointInTimeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API returns a list of DBParameterGroup descriptions. If a
     * DBParameterGroupName is specified, the list will contain only the
     * descriptions of the specified DBParameterGroup.
     * </p>
     *
     * @param describeDBParameterGroupsRequest Container for the necessary
     *           parameters to execute the DescribeDBParameterGroups operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBParameterGroups service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync(DescribeDBParameterGroupsRequest describeDBParameterGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API creates a new DB instance.
     * </p>
     *
     * @param createDBInstanceRequest Container for the necessary parameters
     *           to execute the CreateDBInstance operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDBInstance service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> createDBInstanceAsync(CreateDBInstanceRequest createDBInstanceRequest) 
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
     *           execute the DescribeEvents operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEvents service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest) 
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
     *           to execute the ModifyDBInstance operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyDBInstance service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> modifyDBInstanceAsync(ModifyDBInstanceRequest modifyDBInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param describeReservedDBInstancesOfferingsRequest Container for the
     *           necessary parameters to execute the
     *           DescribeReservedDBInstancesOfferings operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedDBInstancesOfferings service method, as returned by
     *         AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedDBInstancesOfferingsResult> describeReservedDBInstancesOfferingsAsync(DescribeReservedDBInstancesOfferingsRequest describeReservedDBInstancesOfferingsRequest) 
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
     *           to execute the DeleteDBInstance operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDBInstance service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> deleteDBInstanceAsync(DeleteDBInstanceRequest deleteDBInstanceRequest) 
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
     *           parameters to execute the ResetDBParameterGroup operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         ResetDBParameterGroup service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ResetDBParameterGroupResult> resetDBParameterGroupAsync(ResetDBParameterGroupRequest resetDBParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API deletes a particular DBParameterGroup. The DBParameterGroup
     * cannot be associated with any RDS instances to be deleted.
     * </p>
     *
     * @param deleteDBParameterGroupRequest Container for the necessary
     *           parameters to execute the DeleteDBParameterGroup operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDBParameterGroup service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDBParameterGroupAsync(DeleteDBParameterGroupRequest deleteDBParameterGroupRequest) 
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
     *           to execute the RebootDBInstance operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         RebootDBInstance service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> rebootDBInstanceAsync(RebootDBInstanceRequest rebootDBInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API returns the default engine and system parameter information
     * for the specified database engine.
     * </p>
     *
     * @param describeEngineDefaultParametersRequest Container for the
     *           necessary parameters to execute the DescribeEngineDefaultParameters
     *           operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEngineDefaultParameters service method, as returned by
     *         AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EngineDefaults> describeEngineDefaultParametersAsync(DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest) 
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
     *           operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         RestoreDBInstanceFromDBSnapshot service method, as returned by
     *         AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> restoreDBInstanceFromDBSnapshotAsync(RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest) 
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
     *           parameters to execute the RevokeDBSecurityGroupIngress operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeDBSecurityGroupIngress service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSecurityGroup> revokeDBSecurityGroupIngressAsync(RevokeDBSecurityGroupIngressRequest revokeDBSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This API is used to create a DBSnapshot. The source DBInstance must
     * be in "available" state.
     * </p>
     *
     * @param createDBSnapshotRequest Container for the necessary parameters
     *           to execute the CreateDBSnapshot operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDBSnapshot service method, as returned by AmazonRDS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSnapshot> createDBSnapshotAsync(CreateDBSnapshotRequest createDBSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

}
        
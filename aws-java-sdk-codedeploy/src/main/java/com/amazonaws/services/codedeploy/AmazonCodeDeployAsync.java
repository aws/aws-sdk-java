/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.codedeploy.model.*;

/**
 * Interface for accessing AmazonCodeDeploy asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * AWS CodeDeploy <b>Overview</b> <p>
 * This is the AWS CodeDeploy API Reference. This guide provides
 * descriptions of the AWS CodeDeploy APIs. For additional information,
 * see the
 * <a href="http://docs.aws.amazon.com/codedeploy/latest/userguide"> AWS CodeDeploy User Guide </a>
 * .
 * </p>
 * <b>Using the APIs</b> <p>
 * You can use the AWS CodeDeploy APIs to work with the following items:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * <i>Applications</i> , which are unique identifiers that AWS
 * CodeDeploy uses to ensure that the correct combinations of revisions,
 * deployment configurations, and deployment groups are being referenced
 * during deployments.
 * </p>
 * <p>
 * You can work with applications by calling CreateApplication,
 * DeleteApplication, GetApplication, ListApplications,
 * BatchGetApplications, and UpdateApplication to create, delete, and get
 * information about applications, and to change information about an
 * application, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Deployment configurations</i> , which are sets of deployment rules
 * and deployment success and failure conditions that AWS CodeDeploy uses
 * during deployments.
 * </p>
 * <p>
 * You can work with deployment configurations by calling
 * CreateDeploymentConfig, DeleteDeploymentConfig, GetDeploymentConfig,
 * and ListDeploymentConfigs to create, delete, and get information about
 * deployment configurations, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Deployment groups</i> , which represent groups of Amazon EC2
 * instances to which application revisions can be deployed.
 * </p>
 * <p>
 * You can work with deployment groups by calling CreateDeploymentGroup,
 * DeleteDeploymentGroup, GetDeploymentGroup, ListDeploymentGroups, and
 * UpdateDeploymentGroup to create, delete, and get information about
 * single and multiple deployment groups, and to change information about
 * a deployment group, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Deployment instances</i> (also known simply as <i>instances</i> ),
 * which represent Amazon EC2 instances to which application revisions
 * are deployed. Deployment instances are identified by their Amazon EC2
 * tags or Auto Scaling group names. Deployment instances belong to
 * deployment groups.
 * </p>
 * <p>
 * You can work with deployment instances by calling
 * GetDeploymentInstance and ListDeploymentInstances to get information
 * about single and multiple deployment instances, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Deployments</i> , which represent the process of deploying
 * revisions to deployment groups.
 * </p>
 * <p>
 * You can work with deployments by calling CreateDeployment,
 * GetDeployment, ListDeployments, BatchGetDeployments, and
 * StopDeployment to create and get information about deployments, and to
 * stop a deployment, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Application revisions</i> (also known simply as <i>revisions</i>
 * ), which are archive files that are stored in Amazon S3 buckets or
 * GitHub repositories. These revisions contain source content (such as
 * source code, web pages, executable files, any deployment scripts, and
 * similar) along with an Application Specification file (AppSpec file).
 * (The AppSpec file is unique to AWS CodeDeploy; it defines a series of
 * deployment actions that you want AWS CodeDeploy to execute.) An
 * application revision is uniquely identified by its Amazon S3 object
 * key and its ETag, version, or both. Application revisions are deployed
 * to deployment groups.
 * </p>
 * <p>
 * You can work with application revisions by calling
 * GetApplicationRevision, ListApplicationRevisions, and
 * RegisterApplicationRevision to get information about application
 * revisions and to inform AWS CodeDeploy about an application revision,
 * respectively.
 * </p>
 * </li>
 * 
 * </ul>
 */
public interface AmazonCodeDeployAsync extends AmazonCodeDeploy {
    /**
     * <p>
     * Gets information about a deployment group.
     * </p>
     *
     * @param getDeploymentGroupRequest Container for the necessary
     *           parameters to execute the GetDeploymentGroup operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         GetDeploymentGroup service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDeploymentGroupResult> getDeploymentGroupAsync(GetDeploymentGroupRequest getDeploymentGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about a deployment group.
     * </p>
     *
     * @param getDeploymentGroupRequest Container for the necessary
     *           parameters to execute the GetDeploymentGroup operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDeploymentGroup service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDeploymentGroupResult> getDeploymentGroupAsync(GetDeploymentGroupRequest getDeploymentGroupRequest,
            AsyncHandler<GetDeploymentGroupRequest, GetDeploymentGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes an existing application's name.
     * </p>
     *
     * @param updateApplicationRequest Container for the necessary parameters
     *           to execute the UpdateApplication operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateApplication service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes an existing application's name.
     * </p>
     *
     * @param updateApplicationRequest Container for the necessary parameters
     *           to execute the UpdateApplication operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateApplication service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest,
            AsyncHandler<UpdateApplicationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new deployment configuration.
     * </p>
     *
     * @param createDeploymentConfigRequest Container for the necessary
     *           parameters to execute the CreateDeploymentConfig operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeploymentConfig service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDeploymentConfigResult> createDeploymentConfigAsync(CreateDeploymentConfigRequest createDeploymentConfigRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new deployment configuration.
     * </p>
     *
     * @param createDeploymentConfigRequest Container for the necessary
     *           parameters to execute the CreateDeploymentConfig operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeploymentConfig service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDeploymentConfigResult> createDeploymentConfigAsync(CreateDeploymentConfigRequest createDeploymentConfigRequest,
            AsyncHandler<CreateDeploymentConfigRequest, CreateDeploymentConfigResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the Amazon EC2 instances for a deployment within the AWS user
     * account.
     * </p>
     *
     * @param listDeploymentInstancesRequest Container for the necessary
     *           parameters to execute the ListDeploymentInstances operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeploymentInstances service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeploymentInstancesResult> listDeploymentInstancesAsync(ListDeploymentInstancesRequest listDeploymentInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the Amazon EC2 instances for a deployment within the AWS user
     * account.
     * </p>
     *
     * @param listDeploymentInstancesRequest Container for the necessary
     *           parameters to execute the ListDeploymentInstances operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeploymentInstances service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeploymentInstancesResult> listDeploymentInstancesAsync(ListDeploymentInstancesRequest listDeploymentInstancesRequest,
            AsyncHandler<ListDeploymentInstancesRequest, ListDeploymentInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the applications registered within the AWS user account.
     * </p>
     *
     * @param listApplicationsRequest Container for the necessary parameters
     *           to execute the ListApplications operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         ListApplications service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the applications registered within the AWS user account.
     * </p>
     *
     * @param listApplicationsRequest Container for the necessary parameters
     *           to execute the ListApplications operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListApplications service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest,
            AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers with AWS CodeDeploy a revision for the specified
     * application.
     * </p>
     *
     * @param registerApplicationRevisionRequest Container for the necessary
     *           parameters to execute the RegisterApplicationRevision operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterApplicationRevision service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> registerApplicationRevisionAsync(RegisterApplicationRevisionRequest registerApplicationRevisionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers with AWS CodeDeploy a revision for the specified
     * application.
     * </p>
     *
     * @param registerApplicationRevisionRequest Container for the necessary
     *           parameters to execute the RegisterApplicationRevision operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterApplicationRevision service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> registerApplicationRevisionAsync(RegisterApplicationRevisionRequest registerApplicationRevisionRequest,
            AsyncHandler<RegisterApplicationRevisionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about a deployment configuration.
     * </p>
     *
     * @param getDeploymentConfigRequest Container for the necessary
     *           parameters to execute the GetDeploymentConfig operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         GetDeploymentConfig service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDeploymentConfigResult> getDeploymentConfigAsync(GetDeploymentConfigRequest getDeploymentConfigRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about a deployment configuration.
     * </p>
     *
     * @param getDeploymentConfigRequest Container for the necessary
     *           parameters to execute the GetDeploymentConfig operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDeploymentConfig service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDeploymentConfigResult> getDeploymentConfigAsync(GetDeploymentConfigRequest getDeploymentConfigRequest,
            AsyncHandler<GetDeploymentConfigRequest, GetDeploymentConfigResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the deployment groups for an application registered within the
     * AWS user account.
     * </p>
     *
     * @param listDeploymentGroupsRequest Container for the necessary
     *           parameters to execute the ListDeploymentGroups operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeploymentGroups service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeploymentGroupsResult> listDeploymentGroupsAsync(ListDeploymentGroupsRequest listDeploymentGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the deployment groups for an application registered within the
     * AWS user account.
     * </p>
     *
     * @param listDeploymentGroupsRequest Container for the necessary
     *           parameters to execute the ListDeploymentGroups operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeploymentGroups service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeploymentGroupsResult> listDeploymentGroupsAsync(ListDeploymentGroupsRequest listDeploymentGroupsRequest,
            AsyncHandler<ListDeploymentGroupsRequest, ListDeploymentGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about one or more applications.
     * </p>
     *
     * @param batchGetApplicationsRequest Container for the necessary
     *           parameters to execute the BatchGetApplications operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         BatchGetApplications service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BatchGetApplicationsResult> batchGetApplicationsAsync(BatchGetApplicationsRequest batchGetApplicationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about one or more applications.
     * </p>
     *
     * @param batchGetApplicationsRequest Container for the necessary
     *           parameters to execute the BatchGetApplications operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         BatchGetApplications service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BatchGetApplicationsResult> batchGetApplicationsAsync(BatchGetApplicationsRequest batchGetApplicationsRequest,
            AsyncHandler<BatchGetApplicationsRequest, BatchGetApplicationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a deployment group.
     * </p>
     *
     * @param deleteDeploymentGroupRequest Container for the necessary
     *           parameters to execute the DeleteDeploymentGroup operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDeploymentGroup service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDeploymentGroupResult> deleteDeploymentGroupAsync(DeleteDeploymentGroupRequest deleteDeploymentGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a deployment group.
     * </p>
     *
     * @param deleteDeploymentGroupRequest Container for the necessary
     *           parameters to execute the DeleteDeploymentGroup operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDeploymentGroup service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDeploymentGroupResult> deleteDeploymentGroupAsync(DeleteDeploymentGroupRequest deleteDeploymentGroupRequest,
            AsyncHandler<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists information about revisions for an application.
     * </p>
     *
     * @param listApplicationRevisionsRequest Container for the necessary
     *           parameters to execute the ListApplicationRevisions operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         ListApplicationRevisions service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListApplicationRevisionsResult> listApplicationRevisionsAsync(ListApplicationRevisionsRequest listApplicationRevisionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists information about revisions for an application.
     * </p>
     *
     * @param listApplicationRevisionsRequest Container for the necessary
     *           parameters to execute the ListApplicationRevisions operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListApplicationRevisions service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListApplicationRevisionsResult> listApplicationRevisionsAsync(ListApplicationRevisionsRequest listApplicationRevisionsRequest,
            AsyncHandler<ListApplicationRevisionsRequest, ListApplicationRevisionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes information about an existing deployment group.
     * </p>
     *
     * @param updateDeploymentGroupRequest Container for the necessary
     *           parameters to execute the UpdateDeploymentGroup operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDeploymentGroup service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDeploymentGroupResult> updateDeploymentGroupAsync(UpdateDeploymentGroupRequest updateDeploymentGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes information about an existing deployment group.
     * </p>
     *
     * @param updateDeploymentGroupRequest Container for the necessary
     *           parameters to execute the UpdateDeploymentGroup operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDeploymentGroup service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDeploymentGroupResult> updateDeploymentGroupAsync(UpdateDeploymentGroupRequest updateDeploymentGroupRequest,
            AsyncHandler<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the deployments under a deployment group for an application
     * registered within the AWS user account.
     * </p>
     *
     * @param listDeploymentsRequest Container for the necessary parameters
     *           to execute the ListDeployments operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeployments service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest listDeploymentsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the deployments under a deployment group for an application
     * registered within the AWS user account.
     * </p>
     *
     * @param listDeploymentsRequest Container for the necessary parameters
     *           to execute the ListDeployments operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeployments service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest listDeploymentsRequest,
            AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about an application.
     * </p>
     *
     * @param getApplicationRequest Container for the necessary parameters to
     *           execute the GetApplication operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         GetApplication service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about an application.
     * </p>
     *
     * @param getApplicationRequest Container for the necessary parameters to
     *           execute the GetApplication operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetApplication service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest,
            AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new application.
     * </p>
     *
     * @param createApplicationRequest Container for the necessary parameters
     *           to execute the CreateApplication operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         CreateApplication service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new application.
     * </p>
     *
     * @param createApplicationRequest Container for the necessary parameters
     *           to execute the CreateApplication operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateApplication service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest,
            AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attempts to stop an ongoing deployment.
     * </p>
     *
     * @param stopDeploymentRequest Container for the necessary parameters to
     *           execute the StopDeployment operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         StopDeployment service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StopDeploymentResult> stopDeploymentAsync(StopDeploymentRequest stopDeploymentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attempts to stop an ongoing deployment.
     * </p>
     *
     * @param stopDeploymentRequest Container for the necessary parameters to
     *           execute the StopDeployment operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StopDeployment service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StopDeploymentResult> stopDeploymentAsync(StopDeploymentRequest stopDeploymentRequest,
            AsyncHandler<StopDeploymentRequest, StopDeploymentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new deployment group for application revisions to be
     * deployed to.
     * </p>
     *
     * @param createDeploymentGroupRequest Container for the necessary
     *           parameters to execute the CreateDeploymentGroup operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeploymentGroup service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDeploymentGroupResult> createDeploymentGroupAsync(CreateDeploymentGroupRequest createDeploymentGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new deployment group for application revisions to be
     * deployed to.
     * </p>
     *
     * @param createDeploymentGroupRequest Container for the necessary
     *           parameters to execute the CreateDeploymentGroup operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeploymentGroup service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDeploymentGroupResult> createDeploymentGroupAsync(CreateDeploymentGroupRequest createDeploymentGroupRequest,
            AsyncHandler<CreateDeploymentGroupRequest, CreateDeploymentGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an application.
     * </p>
     *
     * @param deleteApplicationRequest Container for the necessary parameters
     *           to execute the DeleteApplication operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteApplication service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an application.
     * </p>
     *
     * @param deleteApplicationRequest Container for the necessary parameters
     *           to execute the DeleteApplication operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteApplication service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest,
            AsyncHandler<DeleteApplicationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about one or more deployments.
     * </p>
     *
     * @param batchGetDeploymentsRequest Container for the necessary
     *           parameters to execute the BatchGetDeployments operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         BatchGetDeployments service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(BatchGetDeploymentsRequest batchGetDeploymentsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about one or more deployments.
     * </p>
     *
     * @param batchGetDeploymentsRequest Container for the necessary
     *           parameters to execute the BatchGetDeployments operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         BatchGetDeployments service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(BatchGetDeploymentsRequest batchGetDeploymentsRequest,
            AsyncHandler<BatchGetDeploymentsRequest, BatchGetDeploymentsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a deployment configuration.
     * </p>
     * <p>
     * <b>NOTE:</b>A deployment configuration cannot be deleted if it is
     * currently in use. Also, predefined configurations cannot be deleted.
     * </p>
     *
     * @param deleteDeploymentConfigRequest Container for the necessary
     *           parameters to execute the DeleteDeploymentConfig operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDeploymentConfig service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDeploymentConfigAsync(DeleteDeploymentConfigRequest deleteDeploymentConfigRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a deployment configuration.
     * </p>
     * <p>
     * <b>NOTE:</b>A deployment configuration cannot be deleted if it is
     * currently in use. Also, predefined configurations cannot be deleted.
     * </p>
     *
     * @param deleteDeploymentConfigRequest Container for the necessary
     *           parameters to execute the DeleteDeploymentConfig operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDeploymentConfig service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDeploymentConfigAsync(DeleteDeploymentConfigRequest deleteDeploymentConfigRequest,
            AsyncHandler<DeleteDeploymentConfigRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about a deployment.
     * </p>
     *
     * @param getDeploymentRequest Container for the necessary parameters to
     *           execute the GetDeployment operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         GetDeployment service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest getDeploymentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about a deployment.
     * </p>
     *
     * @param getDeploymentRequest Container for the necessary parameters to
     *           execute the GetDeployment operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDeployment service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest getDeploymentRequest,
            AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deploys an application revision to the specified deployment group.
     * </p>
     *
     * @param createDeploymentRequest Container for the necessary parameters
     *           to execute the CreateDeployment operation on AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeployment service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deploys an application revision to the specified deployment group.
     * </p>
     *
     * @param createDeploymentRequest Container for the necessary parameters
     *           to execute the CreateDeployment operation on AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeployment service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest,
            AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about an Amazon EC2 instance as part of a
     * deployment.
     * </p>
     *
     * @param getDeploymentInstanceRequest Container for the necessary
     *           parameters to execute the GetDeploymentInstance operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         GetDeploymentInstance service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDeploymentInstanceResult> getDeploymentInstanceAsync(GetDeploymentInstanceRequest getDeploymentInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about an Amazon EC2 instance as part of a
     * deployment.
     * </p>
     *
     * @param getDeploymentInstanceRequest Container for the necessary
     *           parameters to execute the GetDeploymentInstance operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDeploymentInstance service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDeploymentInstanceResult> getDeploymentInstanceAsync(GetDeploymentInstanceRequest getDeploymentInstanceRequest,
            AsyncHandler<GetDeploymentInstanceRequest, GetDeploymentInstanceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the deployment configurations within the AWS user account.
     * </p>
     *
     * @param listDeploymentConfigsRequest Container for the necessary
     *           parameters to execute the ListDeploymentConfigs operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeploymentConfigs service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(ListDeploymentConfigsRequest listDeploymentConfigsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the deployment configurations within the AWS user account.
     * </p>
     *
     * @param listDeploymentConfigsRequest Container for the necessary
     *           parameters to execute the ListDeploymentConfigs operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDeploymentConfigs service method, as returned by AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(ListDeploymentConfigsRequest listDeploymentConfigsRequest,
            AsyncHandler<ListDeploymentConfigsRequest, ListDeploymentConfigsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about an application revision.
     * </p>
     *
     * @param getApplicationRevisionRequest Container for the necessary
     *           parameters to execute the GetApplicationRevision operation on
     *           AmazonCodeDeploy.
     * 
     * @return A Java Future object containing the response from the
     *         GetApplicationRevision service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetApplicationRevisionResult> getApplicationRevisionAsync(GetApplicationRevisionRequest getApplicationRevisionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about an application revision.
     * </p>
     *
     * @param getApplicationRevisionRequest Container for the necessary
     *           parameters to execute the GetApplicationRevision operation on
     *           AmazonCodeDeploy.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetApplicationRevision service method, as returned by
     *         AmazonCodeDeploy.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetApplicationRevisionResult> getApplicationRevisionAsync(GetApplicationRevisionRequest getApplicationRevisionRequest,
            AsyncHandler<GetApplicationRevisionRequest, GetApplicationRevisionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        
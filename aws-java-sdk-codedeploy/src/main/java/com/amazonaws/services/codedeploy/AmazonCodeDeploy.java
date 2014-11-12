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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.codedeploy.model.*;

/**
 * Interface for accessing AmazonCodeDeploy.
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
public interface AmazonCodeDeploy {

    /**
     * Overrides the default endpoint for this client ("https://codedeploy.us-east-1.amazonaws.com/").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "codedeploy.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "https://codedeploy.us-east-1.amazonaws.com/"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "codedeploy.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "https://codedeploy.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonCodeDeploy#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Gets information about a deployment group.
     * </p>
     *
     * @param getDeploymentGroupRequest Container for the necessary
     *           parameters to execute the GetDeploymentGroup service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the GetDeploymentGroup service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws DeploymentGroupDoesNotExistException
     * @throws InvalidDeploymentGroupNameException
     * @throws InvalidApplicationNameException
     * @throws DeploymentGroupNameRequiredException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDeploymentGroupResult getDeploymentGroup(GetDeploymentGroupRequest getDeploymentGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes an existing application's name.
     * </p>
     *
     * @param updateApplicationRequest Container for the necessary parameters
     *           to execute the UpdateApplication service method on AmazonCodeDeploy.
     * 
     * 
     * @throws InvalidApplicationNameException
     * @throws ApplicationAlreadyExistsException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateApplication(UpdateApplicationRequest updateApplicationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new deployment configuration.
     * </p>
     *
     * @param createDeploymentConfigRequest Container for the necessary
     *           parameters to execute the CreateDeploymentConfig service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the CreateDeploymentConfig service method,
     *         as returned by AmazonCodeDeploy.
     * 
     * @throws DeploymentConfigLimitExceededException
     * @throws InvalidMinimumHealthyHostValueException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigAlreadyExistsException
     * @throws DeploymentConfigNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDeploymentConfigResult createDeploymentConfig(CreateDeploymentConfigRequest createDeploymentConfigRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the Amazon EC2 instances for a deployment within the AWS user
     * account.
     * </p>
     *
     * @param listDeploymentInstancesRequest Container for the necessary
     *           parameters to execute the ListDeploymentInstances service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the ListDeploymentInstances service method,
     *         as returned by AmazonCodeDeploy.
     * 
     * @throws InvalidDeploymentIdException
     * @throws InvalidInstanceStatusException
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws DeploymentNotStartedException
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDeploymentInstancesResult listDeploymentInstances(ListDeploymentInstancesRequest listDeploymentInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the applications registered within the AWS user account.
     * </p>
     *
     * @param listApplicationsRequest Container for the necessary parameters
     *           to execute the ListApplications service method on AmazonCodeDeploy.
     * 
     * @return The response from the ListApplications service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers with AWS CodeDeploy a revision for the specified
     * application.
     * </p>
     *
     * @param registerApplicationRevisionRequest Container for the necessary
     *           parameters to execute the RegisterApplicationRevision service method
     *           on AmazonCodeDeploy.
     * 
     * 
     * @throws InvalidRevisionException
     * @throws RevisionRequiredException
     * @throws InvalidApplicationNameException
     * @throws DescriptionTooLongException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void registerApplicationRevision(RegisterApplicationRevisionRequest registerApplicationRevisionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about a deployment configuration.
     * </p>
     *
     * @param getDeploymentConfigRequest Container for the necessary
     *           parameters to execute the GetDeploymentConfig service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the GetDeploymentConfig service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws DeploymentConfigDoesNotExistException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDeploymentConfigResult getDeploymentConfig(GetDeploymentConfigRequest getDeploymentConfigRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the deployment groups for an application registered within the
     * AWS user account.
     * </p>
     *
     * @param listDeploymentGroupsRequest Container for the necessary
     *           parameters to execute the ListDeploymentGroups service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the ListDeploymentGroups service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidApplicationNameException
     * @throws InvalidNextTokenException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDeploymentGroupsResult listDeploymentGroups(ListDeploymentGroupsRequest listDeploymentGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about one or more applications.
     * </p>
     *
     * @param batchGetApplicationsRequest Container for the necessary
     *           parameters to execute the BatchGetApplications service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the BatchGetApplications service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchGetApplicationsResult batchGetApplications(BatchGetApplicationsRequest batchGetApplicationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a deployment group.
     * </p>
     *
     * @param deleteDeploymentGroupRequest Container for the necessary
     *           parameters to execute the DeleteDeploymentGroup service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the DeleteDeploymentGroup service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidRoleException
     * @throws InvalidDeploymentGroupNameException
     * @throws InvalidApplicationNameException
     * @throws DeploymentGroupNameRequiredException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteDeploymentGroupResult deleteDeploymentGroup(DeleteDeploymentGroupRequest deleteDeploymentGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists information about revisions for an application.
     * </p>
     *
     * @param listApplicationRevisionsRequest Container for the necessary
     *           parameters to execute the ListApplicationRevisions service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the ListApplicationRevisions service method,
     *         as returned by AmazonCodeDeploy.
     * 
     * @throws InvalidSortByException
     * @throws InvalidApplicationNameException
     * @throws InvalidKeyPrefixFilterException
     * @throws InvalidNextTokenException
     * @throws BucketNameFilterRequiredException
     * @throws InvalidSortOrderException
     * @throws InvalidDeployedStateFilterException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     * @throws InvalidBucketNameFilterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListApplicationRevisionsResult listApplicationRevisions(ListApplicationRevisionsRequest listApplicationRevisionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes information about an existing deployment group.
     * </p>
     *
     * @param updateDeploymentGroupRequest Container for the necessary
     *           parameters to execute the UpdateDeploymentGroup service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the UpdateDeploymentGroup service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidRoleException
     * @throws InvalidDeploymentGroupNameException
     * @throws DeploymentConfigDoesNotExistException
     * @throws InvalidApplicationNameException
     * @throws InvalidAutoScalingGroupException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentGroupAlreadyExistsException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     * @throws InvalidEC2TagException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateDeploymentGroupResult updateDeploymentGroup(UpdateDeploymentGroupRequest updateDeploymentGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the deployments under a deployment group for an application
     * registered within the AWS user account.
     * </p>
     *
     * @param listDeploymentsRequest Container for the necessary parameters
     *           to execute the ListDeployments service method on AmazonCodeDeploy.
     * 
     * @return The response from the ListDeployments service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws DeploymentGroupDoesNotExistException
     * @throws InvalidDeploymentGroupNameException
     * @throws InvalidApplicationNameException
     * @throws InvalidTimeRangeException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidNextTokenException
     * @throws ApplicationDoesNotExistException
     * @throws InvalidDeploymentStatusException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDeploymentsResult listDeployments(ListDeploymentsRequest listDeploymentsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about an application.
     * </p>
     *
     * @param getApplicationRequest Container for the necessary parameters to
     *           execute the GetApplication service method on AmazonCodeDeploy.
     * 
     * @return The response from the GetApplication service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new application.
     * </p>
     *
     * @param createApplicationRequest Container for the necessary parameters
     *           to execute the CreateApplication service method on AmazonCodeDeploy.
     * 
     * @return The response from the CreateApplication service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidApplicationNameException
     * @throws ApplicationAlreadyExistsException
     * @throws ApplicationLimitExceededException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attempts to stop an ongoing deployment.
     * </p>
     *
     * @param stopDeploymentRequest Container for the necessary parameters to
     *           execute the StopDeployment service method on AmazonCodeDeploy.
     * 
     * @return The response from the StopDeployment service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidDeploymentIdException
     * @throws DeploymentAlreadyCompletedException
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public StopDeploymentResult stopDeployment(StopDeploymentRequest stopDeploymentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new deployment group for application revisions to be
     * deployed to.
     * </p>
     *
     * @param createDeploymentGroupRequest Container for the necessary
     *           parameters to execute the CreateDeploymentGroup service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the CreateDeploymentGroup service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws RoleRequiredException
     * @throws InvalidRoleException
     * @throws InvalidDeploymentGroupNameException
     * @throws DeploymentConfigDoesNotExistException
     * @throws InvalidApplicationNameException
     * @throws InvalidAutoScalingGroupException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentGroupAlreadyExistsException
     * @throws DeploymentGroupLimitExceededException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     * @throws InvalidEC2TagException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDeploymentGroupResult createDeploymentGroup(CreateDeploymentGroupRequest createDeploymentGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an application.
     * </p>
     *
     * @param deleteApplicationRequest Container for the necessary parameters
     *           to execute the DeleteApplication service method on AmazonCodeDeploy.
     * 
     * 
     * @throws InvalidApplicationNameException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteApplication(DeleteApplicationRequest deleteApplicationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about one or more deployments.
     * </p>
     *
     * @param batchGetDeploymentsRequest Container for the necessary
     *           parameters to execute the BatchGetDeployments service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the BatchGetDeployments service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidDeploymentIdException
     * @throws DeploymentIdRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchGetDeploymentsResult batchGetDeployments(BatchGetDeploymentsRequest batchGetDeploymentsRequest) 
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
     *           parameters to execute the DeleteDeploymentConfig service method on
     *           AmazonCodeDeploy.
     * 
     * 
     * @throws InvalidOperationException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigInUseException
     * @throws DeploymentConfigNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteDeploymentConfig(DeleteDeploymentConfigRequest deleteDeploymentConfigRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about a deployment.
     * </p>
     *
     * @param getDeploymentRequest Container for the necessary parameters to
     *           execute the GetDeployment service method on AmazonCodeDeploy.
     * 
     * @return The response from the GetDeployment service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidDeploymentIdException
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deploys an application revision to the specified deployment group.
     * </p>
     *
     * @param createDeploymentRequest Container for the necessary parameters
     *           to execute the CreateDeployment service method on AmazonCodeDeploy.
     * 
     * @return The response from the CreateDeployment service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidRevisionException
     * @throws DeploymentGroupDoesNotExistException
     * @throws RevisionRequiredException
     * @throws InvalidDeploymentGroupNameException
     * @throws DeploymentConfigDoesNotExistException
     * @throws InvalidApplicationNameException
     * @throws DeploymentGroupNameRequiredException
     * @throws DescriptionTooLongException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentLimitExceededException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about an Amazon EC2 instance as part of a
     * deployment.
     * </p>
     *
     * @param getDeploymentInstanceRequest Container for the necessary
     *           parameters to execute the GetDeploymentInstance service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the GetDeploymentInstance service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidDeploymentIdException
     * @throws InstanceIdRequiredException
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws InstanceDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDeploymentInstanceResult getDeploymentInstance(GetDeploymentInstanceRequest getDeploymentInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the deployment configurations within the AWS user account.
     * </p>
     *
     * @param listDeploymentConfigsRequest Container for the necessary
     *           parameters to execute the ListDeploymentConfigs service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the ListDeploymentConfigs service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDeploymentConfigsResult listDeploymentConfigs(ListDeploymentConfigsRequest listDeploymentConfigsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about an application revision.
     * </p>
     *
     * @param getApplicationRevisionRequest Container for the necessary
     *           parameters to execute the GetApplicationRevision service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the GetApplicationRevision service method,
     *         as returned by AmazonCodeDeploy.
     * 
     * @throws InvalidRevisionException
     * @throws RevisionRequiredException
     * @throws InvalidApplicationNameException
     * @throws RevisionDoesNotExistException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetApplicationRevisionResult getApplicationRevision(GetApplicationRevisionRequest getApplicationRevisionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes an existing application's name.
     * </p>
     * 
     * 
     * @throws InvalidApplicationNameException
     * @throws ApplicationAlreadyExistsException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateApplication() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Lists the applications registered within the AWS user account.
     * </p>
     * 
     * @return The response from the ListApplications service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListApplicationsResult listApplications() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Gets information about one or more applications.
     * </p>
     * 
     * @return The response from the BatchGetApplications service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchGetApplicationsResult batchGetApplications() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Lists the deployments under a deployment group for an application
     * registered within the AWS user account.
     * </p>
     * 
     * @return The response from the ListDeployments service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws DeploymentGroupDoesNotExistException
     * @throws InvalidDeploymentGroupNameException
     * @throws InvalidApplicationNameException
     * @throws InvalidTimeRangeException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidNextTokenException
     * @throws ApplicationDoesNotExistException
     * @throws InvalidDeploymentStatusException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDeploymentsResult listDeployments() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Gets information about one or more deployments.
     * </p>
     * 
     * @return The response from the BatchGetDeployments service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidDeploymentIdException
     * @throws DeploymentIdRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchGetDeploymentsResult batchGetDeployments() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Lists the deployment configurations within the AWS user account.
     * </p>
     * 
     * @return The response from the ListDeploymentConfigs service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDeploymentConfigsResult listDeploymentConfigs() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        
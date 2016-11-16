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
package com.amazonaws.services.codedeploy;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.services.codedeploy.waiters.AmazonCodeDeployWaiters;

/**
 * Interface for accessing CodeDeploy.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codedeploy.AbstractAmazonCodeDeploy} instead.
 * </p>
 * <p>
 * <fullname>AWS CodeDeploy</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This reference guide provides descriptions of the AWS CodeDeploy APIs. For more information about AWS CodeDeploy, see
 * the <a href="http://docs.aws.amazon.com/codedeploy/latest/userguide">AWS CodeDeploy User Guide</a>.
 * </p>
 * <p>
 * <b>Using the APIs</b>
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to work with the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Applications are unique identifiers used by AWS CodeDeploy to ensure the correct combinations of revisions,
 * deployment configurations, and deployment groups are being referenced during deployments.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, list, and update applications.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployment configurations are sets of deployment rules and success and failure conditions used by AWS CodeDeploy
 * during deployments.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, and list deployment configurations.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployment groups are groups of instances to which application revisions can be deployed.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, list, and update deployment groups.
 * </p>
 * </li>
 * <li>
 * <p>
 * Instances represent Amazon EC2 instances to which application revisions are deployed. Instances are identified by
 * their Amazon EC2 tags or Auto Scaling group names. Instances belong to deployment groups.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to get and list instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployments represent the process of deploying revisions to instances.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, get, list, and stop deployments.
 * </p>
 * </li>
 * <li>
 * <p>
 * Application revisions are archive files stored in Amazon S3 buckets or GitHub repositories. These revisions contain
 * source content (such as source code, web pages, executable files, and deployment scripts) along with an application
 * specification (AppSpec) file. (The AppSpec file is unique to AWS CodeDeploy; it defines the deployment actions you
 * want AWS CodeDeploy to execute.) For application revisions stored in Amazon S3 buckets, an application revision is
 * uniquely identified by its Amazon S3 object key and its ETag, version, or both. For application revisions stored in
 * GitHub repositories, an application revision is uniquely identified by its repository name and commit ID. Application
 * revisions are deployed through deployment groups.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to get, list, and register application revisions.
 * </p>
 * </li>
 * </ul>
 */
public interface AmazonCodeDeploy {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "codedeploy";

    /**
     * Overrides the default endpoint for this client ("https://codedeploy.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "codedeploy.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://codedeploy.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "codedeploy.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://codedeploy.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonCodeDeploy#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Adds tags to on-premises instances.
     * </p>
     * 
     * @param addTagsToOnPremisesInstancesRequest
     *        Represents the input of, and adds tags to, an on-premises instance operation.
     * @return Result of the AddTagsToOnPremisesInstances operation returned by the service.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws TagRequiredException
     *         A tag was not specified.
     * @throws InvalidTagException
     *         The specified tag was specified in an invalid format.
     * @throws TagLimitExceededException
     *         The maximum allowed number of tags was exceeded.
     * @throws InstanceLimitExceededException
     *         The maximum number of allowed on-premises instances in a single call was exceeded.
     * @throws InstanceNotRegisteredException
     *         The specified on-premises instance is not registered.
     * @sample AmazonCodeDeploy.AddTagsToOnPremisesInstances
     */
    AddTagsToOnPremisesInstancesResult addTagsToOnPremisesInstances(AddTagsToOnPremisesInstancesRequest addTagsToOnPremisesInstancesRequest);

    /**
     * <p>
     * Gets information about one or more application revisions.
     * </p>
     * 
     * @param batchGetApplicationRevisionsRequest
     *        Represents the input of a batch get application revisions operation.
     * @return Result of the BatchGetApplicationRevisions operation returned by the service.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or AWS account.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws RevisionRequiredException
     *         The revision ID was not specified.
     * @throws InvalidRevisionException
     *         The revision was specified in an invalid format.
     * @throws BatchLimitExceededException
     *         The maximum number of names or IDs allowed for this request (100) was exceeded.
     * @sample AmazonCodeDeploy.BatchGetApplicationRevisions
     */
    BatchGetApplicationRevisionsResult batchGetApplicationRevisions(BatchGetApplicationRevisionsRequest batchGetApplicationRevisionsRequest);

    /**
     * <p>
     * Gets information about one or more applications.
     * </p>
     * 
     * @param batchGetApplicationsRequest
     *        Represents the input of a batch get applications operation.
     * @return Result of the BatchGetApplications operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or AWS account.
     * @throws BatchLimitExceededException
     *         The maximum number of names or IDs allowed for this request (100) was exceeded.
     * @sample AmazonCodeDeploy.BatchGetApplications
     */
    BatchGetApplicationsResult batchGetApplications(BatchGetApplicationsRequest batchGetApplicationsRequest);

    /**
     * Simplified method form for invoking the BatchGetApplications operation.
     *
     * @see #batchGetApplications(BatchGetApplicationsRequest)
     */
    BatchGetApplicationsResult batchGetApplications();

    /**
     * <p>
     * Get information about one or more deployment groups.
     * </p>
     * 
     * @param batchGetDeploymentGroupsRequest
     *        Represents the input of a batch get deployment groups operation.
     * @return Result of the BatchGetDeploymentGroups operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or AWS account.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws BatchLimitExceededException
     *         The maximum number of names or IDs allowed for this request (100) was exceeded.
     * @sample AmazonCodeDeploy.BatchGetDeploymentGroups
     */
    BatchGetDeploymentGroupsResult batchGetDeploymentGroups(BatchGetDeploymentGroupsRequest batchGetDeploymentGroupsRequest);

    /**
     * <p>
     * Gets information about one or more instance that are part of a deployment group.
     * </p>
     * 
     * @param batchGetDeploymentInstancesRequest
     *        Represents the input of a batch get deployment instances operation.
     * @return Result of the BatchGetDeploymentInstances operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment does not exist with the applicable IAM user or AWS account.
     * @throws InstanceIdRequiredException
     *         The instance ID was not specified.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @throws InvalidInstanceNameException
     *         The specified on-premises instance name was specified in an invalid format.
     * @throws BatchLimitExceededException
     *         The maximum number of names or IDs allowed for this request (100) was exceeded.
     * @sample AmazonCodeDeploy.BatchGetDeploymentInstances
     */
    BatchGetDeploymentInstancesResult batchGetDeploymentInstances(BatchGetDeploymentInstancesRequest batchGetDeploymentInstancesRequest);

    /**
     * <p>
     * Gets information about one or more deployments.
     * </p>
     * 
     * @param batchGetDeploymentsRequest
     *        Represents the input of a batch get deployments operation.
     * @return Result of the BatchGetDeployments operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @throws BatchLimitExceededException
     *         The maximum number of names or IDs allowed for this request (100) was exceeded.
     * @sample AmazonCodeDeploy.BatchGetDeployments
     */
    BatchGetDeploymentsResult batchGetDeployments(BatchGetDeploymentsRequest batchGetDeploymentsRequest);

    /**
     * Simplified method form for invoking the BatchGetDeployments operation.
     *
     * @see #batchGetDeployments(BatchGetDeploymentsRequest)
     */
    BatchGetDeploymentsResult batchGetDeployments();

    /**
     * <p>
     * Gets information about one or more on-premises instances.
     * </p>
     * 
     * @param batchGetOnPremisesInstancesRequest
     *        Represents the input of a batch get on-premises instances operation.
     * @return Result of the BatchGetOnPremisesInstances operation returned by the service.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws InvalidInstanceNameException
     *         The specified on-premises instance name was specified in an invalid format.
     * @throws BatchLimitExceededException
     *         The maximum number of names or IDs allowed for this request (100) was exceeded.
     * @sample AmazonCodeDeploy.BatchGetOnPremisesInstances
     */
    BatchGetOnPremisesInstancesResult batchGetOnPremisesInstances(BatchGetOnPremisesInstancesRequest batchGetOnPremisesInstancesRequest);

    /**
     * Simplified method form for invoking the BatchGetOnPremisesInstances operation.
     *
     * @see #batchGetOnPremisesInstances(BatchGetOnPremisesInstancesRequest)
     */
    BatchGetOnPremisesInstancesResult batchGetOnPremisesInstances();

    /**
     * <p>
     * Creates an application.
     * </p>
     * 
     * @param createApplicationRequest
     *        Represents the input of a create application operation.
     * @return Result of the CreateApplication operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationAlreadyExistsException
     *         An application with the specified name already exists with the applicable IAM user or AWS account.
     * @throws ApplicationLimitExceededException
     *         More applications were attempted to be created than are allowed.
     * @sample AmazonCodeDeploy.CreateApplication
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Deploys an application revision through the specified deployment group.
     * </p>
     * 
     * @param createDeploymentRequest
     *        Represents the input of a create deployment operation.
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or AWS account.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws DeploymentGroupDoesNotExistException
     *         The named deployment group does not exist with the applicable IAM user or AWS account.
     * @throws RevisionRequiredException
     *         The revision ID was not specified.
     * @throws RevisionDoesNotExistException
     *         The named revision does not exist with the applicable IAM user or AWS account.
     * @throws InvalidRevisionException
     *         The revision was specified in an invalid format.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid format.
     * @throws DeploymentConfigDoesNotExistException
     *         The deployment configuration does not exist with the applicable IAM user or AWS account.
     * @throws DescriptionTooLongException
     *         The description is too long.
     * @throws DeploymentLimitExceededException
     *         The number of allowed deployments was exceeded.
     * @throws InvalidAutoRollbackConfigException
     *         The automatic rollback configuration was specified in an invalid format. For example, automatic rollback
     *         is enabled but an invalid triggering event type or no event types were listed.
     * @sample AmazonCodeDeploy.CreateDeployment
     */
    CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Creates a deployment configuration.
     * </p>
     * 
     * @param createDeploymentConfigRequest
     *        Represents the input of a create deployment configuration operation.
     * @return Result of the CreateDeploymentConfig operation returned by the service.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid format.
     * @throws DeploymentConfigNameRequiredException
     *         The deployment configuration name was not specified.
     * @throws DeploymentConfigAlreadyExistsException
     *         A deployment configuration with the specified name already exists with the applicable IAM user or AWS
     *         account.
     * @throws InvalidMinimumHealthyHostValueException
     *         The minimum healthy instance value was specified in an invalid format.
     * @throws DeploymentConfigLimitExceededException
     *         The deployment configurations limit was exceeded.
     * @sample AmazonCodeDeploy.CreateDeploymentConfig
     */
    CreateDeploymentConfigResult createDeploymentConfig(CreateDeploymentConfigRequest createDeploymentConfigRequest);

    /**
     * <p>
     * Creates a deployment group to which application revisions will be deployed.
     * </p>
     * 
     * @param createDeploymentGroupRequest
     *        Represents the input of a create deployment group operation.
     * @return Result of the CreateDeploymentGroup operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or AWS account.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws DeploymentGroupAlreadyExistsException
     *         A deployment group with the specified name already exists with the applicable IAM user or AWS account.
     * @throws InvalidEC2TagException
     *         The tag was specified in an invalid format.
     * @throws InvalidTagException
     *         The specified tag was specified in an invalid format.
     * @throws InvalidAutoScalingGroupException
     *         The Auto Scaling group was specified in an invalid format or does not exist.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid format.
     * @throws DeploymentConfigDoesNotExistException
     *         The deployment configuration does not exist with the applicable IAM user or AWS account.
     * @throws RoleRequiredException
     *         The role ID was not specified.
     * @throws InvalidRoleException
     *         The service role ARN was specified in an invalid format. Or, if an Auto Scaling group was specified, the
     *         specified service role does not grant the appropriate permissions to Auto Scaling.
     * @throws DeploymentGroupLimitExceededException
     *         The deployment groups limit was exceeded.
     * @throws LifecycleHookLimitExceededException
     *         The limit for lifecycle hooks was exceeded.
     * @throws InvalidTriggerConfigException
     *         The trigger was specified in an invalid format.
     * @throws TriggerTargetsLimitExceededException
     *         The maximum allowed number of triggers was exceeded.
     * @throws InvalidAlarmConfigException
     *         The format of the alarm configuration is invalid. Possible causes include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The alarm list is null.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The alarm object is null.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The alarm name is empty or null or exceeds the 255 character limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Two alarms with the same name have been specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The alarm configuration is enabled but the alarm list is empty.
     *         </p>
     *         </li>
     * @throws AlarmsLimitExceededException
     *         The maximum number of alarms for a deployment group (10) was exceeded.
     * @throws InvalidAutoRollbackConfigException
     *         The automatic rollback configuration was specified in an invalid format. For example, automatic rollback
     *         is enabled but an invalid triggering event type or no event types were listed.
     * @sample AmazonCodeDeploy.CreateDeploymentGroup
     */
    CreateDeploymentGroupResult createDeploymentGroup(CreateDeploymentGroupRequest createDeploymentGroupRequest);

    /**
     * <p>
     * Deletes an application.
     * </p>
     * 
     * @param deleteApplicationRequest
     *        Represents the input of a delete application operation.
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @sample AmazonCodeDeploy.DeleteApplication
     */
    DeleteApplicationResult deleteApplication(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes a deployment configuration.
     * </p>
     * <note>
     * <p>
     * A deployment configuration cannot be deleted if it is currently in use. Predefined configurations cannot be
     * deleted.
     * </p>
     * </note>
     * 
     * @param deleteDeploymentConfigRequest
     *        Represents the input of a delete deployment configuration operation.
     * @return Result of the DeleteDeploymentConfig operation returned by the service.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid format.
     * @throws DeploymentConfigNameRequiredException
     *         The deployment configuration name was not specified.
     * @throws DeploymentConfigInUseException
     *         The deployment configuration is still in use.
     * @throws InvalidOperationException
     *         An invalid operation was detected.
     * @sample AmazonCodeDeploy.DeleteDeploymentConfig
     */
    DeleteDeploymentConfigResult deleteDeploymentConfig(DeleteDeploymentConfigRequest deleteDeploymentConfigRequest);

    /**
     * <p>
     * Deletes a deployment group.
     * </p>
     * 
     * @param deleteDeploymentGroupRequest
     *        Represents the input of a delete deployment group operation.
     * @return Result of the DeleteDeploymentGroup operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws InvalidRoleException
     *         The service role ARN was specified in an invalid format. Or, if an Auto Scaling group was specified, the
     *         specified service role does not grant the appropriate permissions to Auto Scaling.
     * @sample AmazonCodeDeploy.DeleteDeploymentGroup
     */
    DeleteDeploymentGroupResult deleteDeploymentGroup(DeleteDeploymentGroupRequest deleteDeploymentGroupRequest);

    /**
     * <p>
     * Deregisters an on-premises instance.
     * </p>
     * 
     * @param deregisterOnPremisesInstanceRequest
     *        Represents the input of a deregister on-premises instance operation.
     * @return Result of the DeregisterOnPremisesInstance operation returned by the service.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws InvalidInstanceNameException
     *         The specified on-premises instance name was specified in an invalid format.
     * @sample AmazonCodeDeploy.DeregisterOnPremisesInstance
     */
    DeregisterOnPremisesInstanceResult deregisterOnPremisesInstance(DeregisterOnPremisesInstanceRequest deregisterOnPremisesInstanceRequest);

    /**
     * <p>
     * Gets information about an application.
     * </p>
     * 
     * @param getApplicationRequest
     *        Represents the input of a get application operation.
     * @return Result of the GetApplication operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or AWS account.
     * @sample AmazonCodeDeploy.GetApplication
     */
    GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Gets information about an application revision.
     * </p>
     * 
     * @param getApplicationRevisionRequest
     *        Represents the input of a get application revision operation.
     * @return Result of the GetApplicationRevision operation returned by the service.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or AWS account.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws RevisionDoesNotExistException
     *         The named revision does not exist with the applicable IAM user or AWS account.
     * @throws RevisionRequiredException
     *         The revision ID was not specified.
     * @throws InvalidRevisionException
     *         The revision was specified in an invalid format.
     * @sample AmazonCodeDeploy.GetApplicationRevision
     */
    GetApplicationRevisionResult getApplicationRevision(GetApplicationRevisionRequest getApplicationRevisionRequest);

    /**
     * <p>
     * Gets information about a deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     *        Represents the input of a get deployment operation.
     * @return Result of the GetDeployment operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @throws DeploymentDoesNotExistException
     *         The deployment does not exist with the applicable IAM user or AWS account.
     * @sample AmazonCodeDeploy.GetDeployment
     */
    GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Gets information about a deployment configuration.
     * </p>
     * 
     * @param getDeploymentConfigRequest
     *        Represents the input of a get deployment configuration operation.
     * @return Result of the GetDeploymentConfig operation returned by the service.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid format.
     * @throws DeploymentConfigNameRequiredException
     *         The deployment configuration name was not specified.
     * @throws DeploymentConfigDoesNotExistException
     *         The deployment configuration does not exist with the applicable IAM user or AWS account.
     * @sample AmazonCodeDeploy.GetDeploymentConfig
     */
    GetDeploymentConfigResult getDeploymentConfig(GetDeploymentConfigRequest getDeploymentConfigRequest);

    /**
     * <p>
     * Gets information about a deployment group.
     * </p>
     * 
     * @param getDeploymentGroupRequest
     *        Represents the input of a get deployment group operation.
     * @return Result of the GetDeploymentGroup operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or AWS account.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws DeploymentGroupDoesNotExistException
     *         The named deployment group does not exist with the applicable IAM user or AWS account.
     * @sample AmazonCodeDeploy.GetDeploymentGroup
     */
    GetDeploymentGroupResult getDeploymentGroup(GetDeploymentGroupRequest getDeploymentGroupRequest);

    /**
     * <p>
     * Gets information about an instance as part of a deployment.
     * </p>
     * 
     * @param getDeploymentInstanceRequest
     *        Represents the input of a get deployment instance operation.
     * @return Result of the GetDeploymentInstance operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment does not exist with the applicable IAM user or AWS account.
     * @throws InstanceIdRequiredException
     *         The instance ID was not specified.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @throws InstanceDoesNotExistException
     *         The specified instance does not exist in the deployment group.
     * @throws InvalidInstanceNameException
     *         The specified on-premises instance name was specified in an invalid format.
     * @sample AmazonCodeDeploy.GetDeploymentInstance
     */
    GetDeploymentInstanceResult getDeploymentInstance(GetDeploymentInstanceRequest getDeploymentInstanceRequest);

    /**
     * <p>
     * Gets information about an on-premises instance.
     * </p>
     * 
     * @param getOnPremisesInstanceRequest
     *        Represents the input of a get on-premises instance operation.
     * @return Result of the GetOnPremisesInstance operation returned by the service.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws InstanceNotRegisteredException
     *         The specified on-premises instance is not registered.
     * @throws InvalidInstanceNameException
     *         The specified on-premises instance name was specified in an invalid format.
     * @sample AmazonCodeDeploy.GetOnPremisesInstance
     */
    GetOnPremisesInstanceResult getOnPremisesInstance(GetOnPremisesInstanceRequest getOnPremisesInstanceRequest);

    /**
     * <p>
     * Lists information about revisions for an application.
     * </p>
     * 
     * @param listApplicationRevisionsRequest
     *        Represents the input of a list application revisions operation.
     * @return Result of the ListApplicationRevisions operation returned by the service.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or AWS account.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws InvalidSortByException
     *         The column name to sort by is either not present or was specified in an invalid format.
     * @throws InvalidSortOrderException
     *         The sort order was specified in an invalid format.
     * @throws InvalidBucketNameFilterException
     *         The bucket name either doesn't exist or was specified in an invalid format.
     * @throws InvalidKeyPrefixFilterException
     *         The specified key prefix filter was specified in an invalid format.
     * @throws BucketNameFilterRequiredException
     *         A bucket name is required, but was not provided.
     * @throws InvalidDeployedStateFilterException
     *         The deployed state filter was specified in an invalid format.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListApplicationRevisions
     */
    ListApplicationRevisionsResult listApplicationRevisions(ListApplicationRevisionsRequest listApplicationRevisionsRequest);

    /**
     * <p>
     * Lists the applications registered with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param listApplicationsRequest
     *        Represents the input of a list applications operation.
     * @return Result of the ListApplications operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListApplications
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest);

    /**
     * Simplified method form for invoking the ListApplications operation.
     *
     * @see #listApplications(ListApplicationsRequest)
     */
    ListApplicationsResult listApplications();

    /**
     * <p>
     * Lists the deployment configurations with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentConfigsRequest
     *        Represents the input of a list deployment configurations operation.
     * @return Result of the ListDeploymentConfigs operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListDeploymentConfigs
     */
    ListDeploymentConfigsResult listDeploymentConfigs(ListDeploymentConfigsRequest listDeploymentConfigsRequest);

    /**
     * Simplified method form for invoking the ListDeploymentConfigs operation.
     *
     * @see #listDeploymentConfigs(ListDeploymentConfigsRequest)
     */
    ListDeploymentConfigsResult listDeploymentConfigs();

    /**
     * <p>
     * Lists the deployment groups for an application registered with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentGroupsRequest
     *        Represents the input of a list deployment groups operation.
     * @return Result of the ListDeploymentGroups operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or AWS account.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListDeploymentGroups
     */
    ListDeploymentGroupsResult listDeploymentGroups(ListDeploymentGroupsRequest listDeploymentGroupsRequest);

    /**
     * <p>
     * Lists the instance for a deployment associated with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentInstancesRequest
     *        Represents the input of a list deployment instances operation.
     * @return Result of the ListDeploymentInstances operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment does not exist with the applicable IAM user or AWS account.
     * @throws DeploymentNotStartedException
     *         The specified deployment has not started.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @throws InvalidInstanceStatusException
     *         The specified instance status does not exist.
     * @sample AmazonCodeDeploy.ListDeploymentInstances
     */
    ListDeploymentInstancesResult listDeploymentInstances(ListDeploymentInstancesRequest listDeploymentInstancesRequest);

    /**
     * <p>
     * Lists the deployments in a deployment group for an application registered with the applicable IAM user or AWS
     * account.
     * </p>
     * 
     * @param listDeploymentsRequest
     *        Represents the input of a list deployments operation.
     * @return Result of the ListDeployments operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or AWS account.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws DeploymentGroupDoesNotExistException
     *         The named deployment group does not exist with the applicable IAM user or AWS account.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws InvalidTimeRangeException
     *         The specified time range was specified in an invalid format.
     * @throws InvalidDeploymentStatusException
     *         The specified deployment status doesn't exist or cannot be determined.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListDeployments
     */
    ListDeploymentsResult listDeployments(ListDeploymentsRequest listDeploymentsRequest);

    /**
     * Simplified method form for invoking the ListDeployments operation.
     *
     * @see #listDeployments(ListDeploymentsRequest)
     */
    ListDeploymentsResult listDeployments();

    /**
     * <p>
     * Gets a list of names for one or more on-premises instances.
     * </p>
     * <p>
     * Unless otherwise specified, both registered and deregistered on-premises instance names will be listed. To list
     * only registered or deregistered on-premises instance names, use the registration status parameter.
     * </p>
     * 
     * @param listOnPremisesInstancesRequest
     *        Represents the input of a list on-premises instances operation.
     * @return Result of the ListOnPremisesInstances operation returned by the service.
     * @throws InvalidRegistrationStatusException
     *         The registration status was specified in an invalid format.
     * @throws InvalidTagFilterException
     *         The specified tag filter was specified in an invalid format.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListOnPremisesInstances
     */
    ListOnPremisesInstancesResult listOnPremisesInstances(ListOnPremisesInstancesRequest listOnPremisesInstancesRequest);

    /**
     * Simplified method form for invoking the ListOnPremisesInstances operation.
     *
     * @see #listOnPremisesInstances(ListOnPremisesInstancesRequest)
     */
    ListOnPremisesInstancesResult listOnPremisesInstances();

    /**
     * <p>
     * Registers with AWS CodeDeploy a revision for the specified application.
     * </p>
     * 
     * @param registerApplicationRevisionRequest
     *        Represents the input of a register application revision operation.
     * @return Result of the RegisterApplicationRevision operation returned by the service.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or AWS account.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws DescriptionTooLongException
     *         The description is too long.
     * @throws RevisionRequiredException
     *         The revision ID was not specified.
     * @throws InvalidRevisionException
     *         The revision was specified in an invalid format.
     * @sample AmazonCodeDeploy.RegisterApplicationRevision
     */
    RegisterApplicationRevisionResult registerApplicationRevision(RegisterApplicationRevisionRequest registerApplicationRevisionRequest);

    /**
     * <p>
     * Registers an on-premises instance.
     * </p>
     * 
     * @param registerOnPremisesInstanceRequest
     *        Represents the input of the register on-premises instance operation.
     * @return Result of the RegisterOnPremisesInstance operation returned by the service.
     * @throws InstanceNameAlreadyRegisteredException
     *         The specified on-premises instance name is already registered.
     * @throws IamUserArnAlreadyRegisteredException
     *         The specified IAM user ARN is already registered with an on-premises instance.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws IamUserArnRequiredException
     *         An IAM user ARN was not specified.
     * @throws InvalidInstanceNameException
     *         The specified on-premises instance name was specified in an invalid format.
     * @throws InvalidIamUserArnException
     *         The IAM user ARN was specified in an invalid format.
     * @sample AmazonCodeDeploy.RegisterOnPremisesInstance
     */
    RegisterOnPremisesInstanceResult registerOnPremisesInstance(RegisterOnPremisesInstanceRequest registerOnPremisesInstanceRequest);

    /**
     * <p>
     * Removes one or more tags from one or more on-premises instances.
     * </p>
     * 
     * @param removeTagsFromOnPremisesInstancesRequest
     *        Represents the input of a remove tags from on-premises instances operation.
     * @return Result of the RemoveTagsFromOnPremisesInstances operation returned by the service.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws TagRequiredException
     *         A tag was not specified.
     * @throws InvalidTagException
     *         The specified tag was specified in an invalid format.
     * @throws TagLimitExceededException
     *         The maximum allowed number of tags was exceeded.
     * @throws InstanceLimitExceededException
     *         The maximum number of allowed on-premises instances in a single call was exceeded.
     * @throws InstanceNotRegisteredException
     *         The specified on-premises instance is not registered.
     * @sample AmazonCodeDeploy.RemoveTagsFromOnPremisesInstances
     */
    RemoveTagsFromOnPremisesInstancesResult removeTagsFromOnPremisesInstances(RemoveTagsFromOnPremisesInstancesRequest removeTagsFromOnPremisesInstancesRequest);

    /**
     * <p>
     * Attempts to stop an ongoing deployment.
     * </p>
     * 
     * @param stopDeploymentRequest
     *        Represents the input of a stop deployment operation.
     * @return Result of the StopDeployment operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment does not exist with the applicable IAM user or AWS account.
     * @throws DeploymentAlreadyCompletedException
     *         The deployment is already complete.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @sample AmazonCodeDeploy.StopDeployment
     */
    StopDeploymentResult stopDeployment(StopDeploymentRequest stopDeploymentRequest);

    /**
     * <p>
     * Changes the name of an application.
     * </p>
     * 
     * @param updateApplicationRequest
     *        Represents the input of an update application operation.
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationAlreadyExistsException
     *         An application with the specified name already exists with the applicable IAM user or AWS account.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or AWS account.
     * @sample AmazonCodeDeploy.UpdateApplication
     */
    UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest);

    /**
     * Simplified method form for invoking the UpdateApplication operation.
     *
     * @see #updateApplication(UpdateApplicationRequest)
     */
    UpdateApplicationResult updateApplication();

    /**
     * <p>
     * Changes information about a deployment group.
     * </p>
     * 
     * @param updateDeploymentGroupRequest
     *        Represents the input of an update deployment group operation.
     * @return Result of the UpdateDeploymentGroup operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or AWS account.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws DeploymentGroupAlreadyExistsException
     *         A deployment group with the specified name already exists with the applicable IAM user or AWS account.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws DeploymentGroupDoesNotExistException
     *         The named deployment group does not exist with the applicable IAM user or AWS account.
     * @throws InvalidEC2TagException
     *         The tag was specified in an invalid format.
     * @throws InvalidTagException
     *         The specified tag was specified in an invalid format.
     * @throws InvalidAutoScalingGroupException
     *         The Auto Scaling group was specified in an invalid format or does not exist.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid format.
     * @throws DeploymentConfigDoesNotExistException
     *         The deployment configuration does not exist with the applicable IAM user or AWS account.
     * @throws InvalidRoleException
     *         The service role ARN was specified in an invalid format. Or, if an Auto Scaling group was specified, the
     *         specified service role does not grant the appropriate permissions to Auto Scaling.
     * @throws LifecycleHookLimitExceededException
     *         The limit for lifecycle hooks was exceeded.
     * @throws InvalidTriggerConfigException
     *         The trigger was specified in an invalid format.
     * @throws TriggerTargetsLimitExceededException
     *         The maximum allowed number of triggers was exceeded.
     * @throws InvalidAlarmConfigException
     *         The format of the alarm configuration is invalid. Possible causes include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The alarm list is null.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The alarm object is null.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The alarm name is empty or null or exceeds the 255 character limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Two alarms with the same name have been specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The alarm configuration is enabled but the alarm list is empty.
     *         </p>
     *         </li>
     * @throws AlarmsLimitExceededException
     *         The maximum number of alarms for a deployment group (10) was exceeded.
     * @throws InvalidAutoRollbackConfigException
     *         The automatic rollback configuration was specified in an invalid format. For example, automatic rollback
     *         is enabled but an invalid triggering event type or no event types were listed.
     * @sample AmazonCodeDeploy.UpdateDeploymentGroup
     */
    UpdateDeploymentGroupResult updateDeploymentGroup(UpdateDeploymentGroupRequest updateDeploymentGroupRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AmazonCodeDeployWaiters waiters();

}

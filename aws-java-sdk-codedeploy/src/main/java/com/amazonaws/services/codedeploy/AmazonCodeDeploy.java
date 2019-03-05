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
package com.amazonaws.services.codedeploy;

import javax.annotation.Generated;

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
 * AWS CodeDeploy is a deployment service that automates application deployments to Amazon EC2 instances, on-premises
 * instances running in your own facility, serverless AWS Lambda functions, or applications in an Amazon ECS service.
 * </p>
 * <p>
 * You can deploy a nearly unlimited variety of application content, such as an updated Lambda function, updated
 * applications in an Amazon ECS service, code, web and configuration files, executables, packages, scripts, multimedia
 * files, and so on. AWS CodeDeploy can deploy application content stored in Amazon S3 buckets, GitHub repositories, or
 * Bitbucket repositories. You do not need to make changes to your existing code before you can use AWS CodeDeploy.
 * </p>
 * <p>
 * AWS CodeDeploy makes it easier for you to rapidly release new features, helps you avoid downtime during application
 * deployment, and handles the complexity of updating your applications, without many of the risks associated with
 * error-prone manual deployments.
 * </p>
 * <p>
 * <b>AWS CodeDeploy Components</b>
 * </p>
 * <p>
 * Use the information in this guide to help you work with the following AWS CodeDeploy components:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Application</b>: A name that uniquely identifies the application you want to deploy. AWS CodeDeploy uses this
 * name, which functions as a container, to ensure the correct combination of revision, deployment configuration, and
 * deployment group are referenced during a deployment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deployment group</b>: A set of individual instances, CodeDeploy Lambda deployment configuration settings, or an
 * Amazon ECS service and network details. A Lambda deployment group specifies how to route traffic to a new version of
 * a Lambda function. An Amazon ECS deployment group specifies the service created in Amazon ECS to deploy, a load
 * balancer, and a listener to reroute production traffic to an updated containerized application. An EC2/On-premises
 * deployment group contains individually tagged instances, Amazon EC2 instances in Amazon EC2 Auto Scaling groups, or
 * both. All deployment groups can specify optional trigger, alarm, and rollback settings.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deployment configuration</b>: A set of deployment rules and deployment success and failure conditions used by AWS
 * CodeDeploy during a deployment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deployment</b>: The process and the components used when updating a Lambda function, a containerized application
 * in an Amazon ECS service, or of installing content on one or more instances.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Application revisions</b>: For an AWS Lambda deployment, this is an AppSpec file that specifies the Lambda
 * function to be updated and one or more functions to validate deployment lifecycle events. For an Amazon ECS
 * deployment, this is an AppSpec file that specifies the Amazon ECS task definition, container, and port where
 * production traffic is rerouted. For an EC2/On-premises deployment, this is an archive file that contains source
 * content—source code, webpages, executable files, and deployment scripts—along with an AppSpec file. Revisions are
 * stored in Amazon S3 buckets or GitHub repositories. For Amazon S3, a revision is uniquely identified by its Amazon S3
 * object key and its ETag, version, or both. For GitHub, a revision is uniquely identified by its commit ID.
 * </p>
 * </li>
 * </ul>
 * <p>
 * This guide also contains information to help you get details about the instances in your deployments, to make
 * on-premises instances available for AWS CodeDeploy deployments, to get details about a Lambda function deployment,
 * and to get details about Amazon ECS service deployments.
 * </p>
 * <p>
 * <b>AWS CodeDeploy Information Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codedeploy/latest/userguide">AWS CodeDeploy User Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codedeploy/latest/APIReference/">AWS CodeDeploy API Reference Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cli/latest/reference/deploy/index.html">AWS CLI Reference for AWS CodeDeploy</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://forums.aws.amazon.com/forum.jspa?forumID=179">AWS CodeDeploy Developer Forum</a>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "codedeploy.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://codedeploy.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
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
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
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
     * @throws InvalidInstanceNameException
     *         The on-premises instance name was specified in an invalid format.
     * @throws TagRequiredException
     *         A tag was not specified.
     * @throws InvalidTagException
     *         The tag was specified in an invalid format.
     * @throws TagLimitExceededException
     *         The maximum allowed number of tags was exceeded.
     * @throws InstanceLimitExceededException
     *         The maximum number of allowed on-premises instances in a single call was exceeded.
     * @throws InstanceNotRegisteredException
     *         The specified on-premises instance is not registered.
     * @sample AmazonCodeDeploy.AddTagsToOnPremisesInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/AddTagsToOnPremisesInstances"
     *      target="_top">AWS API Documentation</a>
     */
    AddTagsToOnPremisesInstancesResult addTagsToOnPremisesInstances(AddTagsToOnPremisesInstancesRequest addTagsToOnPremisesInstancesRequest);

    /**
     * <p>
     * Gets information about one or more application revisions.
     * </p>
     * 
     * @param batchGetApplicationRevisionsRequest
     *        Represents the input of a BatchGetApplicationRevisions operation.
     * @return Result of the BatchGetApplicationRevisions operation returned by the service.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the IAM user or AWS account.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetApplicationRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetApplicationRevisionsResult batchGetApplicationRevisions(BatchGetApplicationRevisionsRequest batchGetApplicationRevisionsRequest);

    /**
     * <p>
     * Gets information about one or more applications.
     * </p>
     * 
     * @param batchGetApplicationsRequest
     *        Represents the input of a BatchGetApplications operation.
     * @return Result of the BatchGetApplications operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the IAM user or AWS account.
     * @throws BatchLimitExceededException
     *         The maximum number of names or IDs allowed for this request (100) was exceeded.
     * @sample AmazonCodeDeploy.BatchGetApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetApplications"
     *      target="_top">AWS API Documentation</a>
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
     * Gets information about one or more deployment groups.
     * </p>
     * 
     * @param batchGetDeploymentGroupsRequest
     *        Represents the input of a BatchGetDeploymentGroups operation.
     * @return Result of the BatchGetDeploymentGroups operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the IAM user or AWS account.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws BatchLimitExceededException
     *         The maximum number of names or IDs allowed for this request (100) was exceeded.
     * @throws DeploymentConfigDoesNotExistException
     *         The deployment configuration does not exist with the IAM user or AWS account.
     * @sample AmazonCodeDeploy.BatchGetDeploymentGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeploymentGroups"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetDeploymentGroupsResult batchGetDeploymentGroups(BatchGetDeploymentGroupsRequest batchGetDeploymentGroupsRequest);

    /**
     * <note>
     * <p>
     * This method works, but is deprecated. Use <code>BatchGetDeploymentTargets</code> instead.
     * </p>
     * </note>
     * <p>
     * Returns an array of instances associated with a deployment. This method works with EC2/On-premises and AWS Lambda
     * compute platforms. The newer <code>BatchGetDeploymentTargets</code> works with all compute platforms.
     * </p>
     * 
     * @param batchGetDeploymentInstancesRequest
     *        Represents the input of a BatchGetDeploymentInstances operation.
     * @return Result of the BatchGetDeploymentInstances operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment with the IAM user or AWS account does not exist.
     * @throws InstanceIdRequiredException
     *         The instance ID was not specified.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @throws InvalidInstanceNameException
     *         The on-premises instance name was specified in an invalid format.
     * @throws BatchLimitExceededException
     *         The maximum number of names or IDs allowed for this request (100) was exceeded.
     * @throws InvalidComputePlatformException
     *         The computePlatform is invalid. The computePlatform should be <code>Lambda</code> or <code>Server</code>.
     * @sample AmazonCodeDeploy.BatchGetDeploymentInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeploymentInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    BatchGetDeploymentInstancesResult batchGetDeploymentInstances(BatchGetDeploymentInstancesRequest batchGetDeploymentInstancesRequest);

    /**
     * <p>
     * Returns an array of targets associated with a deployment. This method works with all compute types and should be
     * used instead of the deprecated <code>BatchGetDeploymentInstances</code>.
     * </p>
     * <p>
     * The type of targets returned depends on the deployment's compute platform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2/On-premises</b>: Information about EC2 instance targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Lambda</b>: Information about Lambda functions targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon ECS</b>: Information about Amazon ECS service targets.
     * </p>
     * </li>
     * </ul>
     * 
     * @param batchGetDeploymentTargetsRequest
     * @return Result of the BatchGetDeploymentTargets operation returned by the service.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment with the IAM user or AWS account does not exist.
     * @throws DeploymentTargetIdRequiredException
     *         A deployment target ID was not provided.
     * @throws InvalidDeploymentTargetIdException
     *         The target ID provided was not valid.
     * @throws DeploymentTargetDoesNotExistException
     *         The provided target ID does not belong to the attempted deployment.
     * @throws DeploymentTargetListSizeExceededException
     *         The maximum number of targets that can be associated with an Amazon ECS or AWS Lambda deployment was
     *         exceeded. The target list of both types of deployments must have exactly one item. This exception does
     *         not apply to EC2/On-premises deployments.
     * @sample AmazonCodeDeploy.BatchGetDeploymentTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeploymentTargets"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetDeploymentTargetsResult batchGetDeploymentTargets(BatchGetDeploymentTargetsRequest batchGetDeploymentTargetsRequest);

    /**
     * <p>
     * Gets information about one or more deployments.
     * </p>
     * 
     * @param batchGetDeploymentsRequest
     *        Represents the input of a BatchGetDeployments operation.
     * @return Result of the BatchGetDeployments operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @throws BatchLimitExceededException
     *         The maximum number of names or IDs allowed for this request (100) was exceeded.
     * @sample AmazonCodeDeploy.BatchGetDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeployments" target="_top">AWS
     *      API Documentation</a>
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
     *        Represents the input of a BatchGetOnPremisesInstances operation.
     * @return Result of the BatchGetOnPremisesInstances operation returned by the service.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws InvalidInstanceNameException
     *         The on-premises instance name was specified in an invalid format.
     * @throws BatchLimitExceededException
     *         The maximum number of names or IDs allowed for this request (100) was exceeded.
     * @sample AmazonCodeDeploy.BatchGetOnPremisesInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetOnPremisesInstances"
     *      target="_top">AWS API Documentation</a>
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
     * For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment
     * to instances in the replacement environment without waiting for a specified wait time to elapse. (Traffic
     * rerouting, which is achieved by registering instances in the replacement environment with the load balancer, can
     * start as soon as all instances have a status of Ready.)
     * </p>
     * 
     * @param continueDeploymentRequest
     * @return Result of the ContinueDeployment operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment with the IAM user or AWS account does not exist.
     * @throws DeploymentAlreadyCompletedException
     *         The deployment is already complete.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @throws DeploymentIsNotInReadyStateException
     *         The deployment does not have a status of Ready and can't continue yet.
     * @throws UnsupportedActionForDeploymentTypeException
     *         A call was submitted that is not supported for the specified deployment type.
     * @throws InvalidDeploymentWaitTypeException
     *         The wait type is invalid.
     * @throws InvalidDeploymentStatusException
     *         The specified deployment status doesn't exist or cannot be determined.
     * @sample AmazonCodeDeploy.ContinueDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ContinueDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    ContinueDeploymentResult continueDeployment(ContinueDeploymentRequest continueDeploymentRequest);

    /**
     * <p>
     * Creates an application.
     * </p>
     * 
     * @param createApplicationRequest
     *        Represents the input of a CreateApplication operation.
     * @return Result of the CreateApplication operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationAlreadyExistsException
     *         An application with the specified name with the IAM user or AWS account already exists.
     * @throws ApplicationLimitExceededException
     *         More applications were attempted to be created than are allowed.
     * @throws InvalidComputePlatformException
     *         The computePlatform is invalid. The computePlatform should be <code>Lambda</code> or <code>Server</code>.
     * @sample AmazonCodeDeploy.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Deploys an application revision through the specified deployment group.
     * </p>
     * 
     * @param createDeploymentRequest
     *        Represents the input of a CreateDeployment operation.
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the IAM user or AWS account.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws DeploymentGroupDoesNotExistException
     *         The named deployment group with the IAM user or AWS account does not exist.
     * @throws RevisionRequiredException
     *         The revision ID was not specified.
     * @throws RevisionDoesNotExistException
     *         The named revision does not exist with the IAM user or AWS account.
     * @throws InvalidRevisionException
     *         The revision was specified in an invalid format.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid format.
     * @throws DeploymentConfigDoesNotExistException
     *         The deployment configuration does not exist with the IAM user or AWS account.
     * @throws DescriptionTooLongException
     *         The description is too long.
     * @throws DeploymentLimitExceededException
     *         The number of allowed deployments was exceeded.
     * @throws InvalidTargetInstancesException
     *         The target instance configuration is invalid. Possible causes include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Configuration data for target instances was entered for an in-place deployment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The limit of 10 tags for a tag type was exceeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The combined length of the tag names exceeded the limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A specified tag is not currently applied to any instances.
     *         </p>
     *         </li>
     * @throws InvalidAutoRollbackConfigException
     *         The automatic rollback configuration was specified in an invalid format. For example, automatic rollback
     *         is enabled, but an invalid triggering event type or no event types were listed.
     * @throws InvalidLoadBalancerInfoException
     *         An invalid load balancer name, or no load balancer name, was specified.
     * @throws InvalidFileExistsBehaviorException
     *         An invalid fileExistsBehavior option was specified to determine how AWS CodeDeploy handles files or
     *         directories that already exist in a deployment target location, but weren't part of the previous
     *         successful deployment. Valid values include "DISALLOW," "OVERWRITE," and "RETAIN."
     * @throws InvalidRoleException
     *         The service role ARN was specified in an invalid format. Or, if an Auto Scaling group was specified, the
     *         specified service role does not grant the appropriate permissions to Amazon EC2 Auto Scaling.
     * @throws InvalidAutoScalingGroupException
     *         The Auto Scaling group was specified in an invalid format or does not exist.
     * @throws ThrottlingException
     *         An API function was called too frequently.
     * @throws InvalidUpdateOutdatedInstancesOnlyValueException
     *         The UpdateOutdatedInstancesOnly value is invalid. For AWS Lambda deployments, <code>false</code> is
     *         expected. For EC2/On-premises deployments, <code>true</code> or <code>false</code> is expected.
     * @throws InvalidIgnoreApplicationStopFailuresValueException
     *         The IgnoreApplicationStopFailures value is invalid. For AWS Lambda deployments, <code>false</code> is
     *         expected. For EC2/On-premises deployments, <code>true</code> or <code>false</code> is expected.
     * @throws InvalidGitHubAccountTokenException
     *         The GitHub token is not valid.
     * @sample AmazonCodeDeploy.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Creates a deployment configuration.
     * </p>
     * 
     * @param createDeploymentConfigRequest
     *        Represents the input of a CreateDeploymentConfig operation.
     * @return Result of the CreateDeploymentConfig operation returned by the service.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid format.
     * @throws DeploymentConfigNameRequiredException
     *         The deployment configuration name was not specified.
     * @throws DeploymentConfigAlreadyExistsException
     *         A deployment configuration with the specified name with the IAM user or AWS account already exists .
     * @throws InvalidMinimumHealthyHostValueException
     *         The minimum healthy instance value was specified in an invalid format.
     * @throws DeploymentConfigLimitExceededException
     *         The deployment configurations limit was exceeded.
     * @throws InvalidComputePlatformException
     *         The computePlatform is invalid. The computePlatform should be <code>Lambda</code> or <code>Server</code>.
     * @throws InvalidTrafficRoutingConfigurationException
     *         The configuration that specifies how traffic is routed during a deployment is invalid.
     * @sample AmazonCodeDeploy.CreateDeploymentConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateDeploymentConfig"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDeploymentConfigResult createDeploymentConfig(CreateDeploymentConfigRequest createDeploymentConfigRequest);

    /**
     * <p>
     * Creates a deployment group to which application revisions are deployed.
     * </p>
     * 
     * @param createDeploymentGroupRequest
     *        Represents the input of a CreateDeploymentGroup operation.
     * @return Result of the CreateDeploymentGroup operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the IAM user or AWS account.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws DeploymentGroupAlreadyExistsException
     *         A deployment group with the specified name with the IAM user or AWS account already exists.
     * @throws InvalidEC2TagException
     *         The tag was specified in an invalid format.
     * @throws InvalidTagException
     *         The tag was specified in an invalid format.
     * @throws InvalidAutoScalingGroupException
     *         The Auto Scaling group was specified in an invalid format or does not exist.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid format.
     * @throws DeploymentConfigDoesNotExistException
     *         The deployment configuration does not exist with the IAM user or AWS account.
     * @throws RoleRequiredException
     *         The role ID was not specified.
     * @throws InvalidRoleException
     *         The service role ARN was specified in an invalid format. Or, if an Auto Scaling group was specified, the
     *         specified service role does not grant the appropriate permissions to Amazon EC2 Auto Scaling.
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
     *         The alarm name is empty or null or exceeds the limit of 255 characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Two alarms with the same name have been specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The alarm configuration is enabled, but the alarm list is empty.
     *         </p>
     *         </li>
     * @throws AlarmsLimitExceededException
     *         The maximum number of alarms for a deployment group (10) was exceeded.
     * @throws InvalidAutoRollbackConfigException
     *         The automatic rollback configuration was specified in an invalid format. For example, automatic rollback
     *         is enabled, but an invalid triggering event type or no event types were listed.
     * @throws InvalidLoadBalancerInfoException
     *         An invalid load balancer name, or no load balancer name, was specified.
     * @throws InvalidDeploymentStyleException
     *         An invalid deployment style was specified. Valid deployment types include "IN_PLACE" and "BLUE_GREEN."
     *         Valid deployment options include "WITH_TRAFFIC_CONTROL" and "WITHOUT_TRAFFIC_CONTROL."
     * @throws InvalidBlueGreenDeploymentConfigurationException
     *         The configuration for the blue/green deployment group was provided in an invalid format. For information
     *         about deployment configuration format, see <a>CreateDeploymentConfig</a>.
     * @throws InvalidEC2TagCombinationException
     *         A call was submitted that specified both Ec2TagFilters and Ec2TagSet, but only one of these data types
     *         can be used in a single call.
     * @throws InvalidOnPremisesTagCombinationException
     *         A call was submitted that specified both OnPremisesTagFilters and OnPremisesTagSet, but only one of these
     *         data types can be used in a single call.
     * @throws TagSetListLimitExceededException
     *         The number of tag groups included in the tag set list exceeded the maximum allowed limit of 3.
     * @throws InvalidInputException
     *         The input was specified in an invalid format.
     * @throws ThrottlingException
     *         An API function was called too frequently.
     * @throws InvalidECSServiceException
     *         The Amazon ECS service identifier is not valid.
     * @throws InvalidTargetGroupPairException
     *         A target group pair associated with this deployment is not valid.
     * @throws ECSServiceMappingLimitExceededException
     *         The Amazon ECS service is associated with more than one deployment groups. An Amazon ECS service can be
     *         associated with only one deployment group.
     * @sample AmazonCodeDeploy.CreateDeploymentGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateDeploymentGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDeploymentGroupResult createDeploymentGroup(CreateDeploymentGroupRequest createDeploymentGroupRequest);

    /**
     * <p>
     * Deletes an application.
     * </p>
     * 
     * @param deleteApplicationRequest
     *        Represents the input of a DeleteApplication operation.
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @sample AmazonCodeDeploy.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
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
     *        Represents the input of a DeleteDeploymentConfig operation.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeleteDeploymentConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDeploymentConfigResult deleteDeploymentConfig(DeleteDeploymentConfigRequest deleteDeploymentConfigRequest);

    /**
     * <p>
     * Deletes a deployment group.
     * </p>
     * 
     * @param deleteDeploymentGroupRequest
     *        Represents the input of a DeleteDeploymentGroup operation.
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
     *         specified service role does not grant the appropriate permissions to Amazon EC2 Auto Scaling.
     * @sample AmazonCodeDeploy.DeleteDeploymentGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeleteDeploymentGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDeploymentGroupResult deleteDeploymentGroup(DeleteDeploymentGroupRequest deleteDeploymentGroupRequest);

    /**
     * <p>
     * Deletes a GitHub account connection.
     * </p>
     * 
     * @param deleteGitHubAccountTokenRequest
     *        Represents the input of a DeleteGitHubAccount operation.
     * @return Result of the DeleteGitHubAccountToken operation returned by the service.
     * @throws GitHubAccountTokenNameRequiredException
     *         The call is missing a required GitHub account connection name.
     * @throws GitHubAccountTokenDoesNotExistException
     *         No GitHub account connection exists with the named specified in the call.
     * @throws InvalidGitHubAccountTokenNameException
     *         The format of the specified GitHub account connection name is invalid.
     * @throws ResourceValidationException
     *         The specified resource could not be validated.
     * @throws OperationNotSupportedException
     *         The API used does not support the deployment.
     * @sample AmazonCodeDeploy.DeleteGitHubAccountToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeleteGitHubAccountToken"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteGitHubAccountTokenResult deleteGitHubAccountToken(DeleteGitHubAccountTokenRequest deleteGitHubAccountTokenRequest);

    /**
     * <p>
     * Deregisters an on-premises instance.
     * </p>
     * 
     * @param deregisterOnPremisesInstanceRequest
     *        Represents the input of a DeregisterOnPremisesInstance operation.
     * @return Result of the DeregisterOnPremisesInstance operation returned by the service.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws InvalidInstanceNameException
     *         The on-premises instance name was specified in an invalid format.
     * @sample AmazonCodeDeploy.DeregisterOnPremisesInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeregisterOnPremisesInstance"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterOnPremisesInstanceResult deregisterOnPremisesInstance(DeregisterOnPremisesInstanceRequest deregisterOnPremisesInstanceRequest);

    /**
     * <p>
     * Gets information about an application.
     * </p>
     * 
     * @param getApplicationRequest
     *        Represents the input of a GetApplication operation.
     * @return Result of the GetApplication operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the IAM user or AWS account.
     * @sample AmazonCodeDeploy.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Gets information about an application revision.
     * </p>
     * 
     * @param getApplicationRevisionRequest
     *        Represents the input of a GetApplicationRevision operation.
     * @return Result of the GetApplicationRevision operation returned by the service.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the IAM user or AWS account.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws RevisionDoesNotExistException
     *         The named revision does not exist with the IAM user or AWS account.
     * @throws RevisionRequiredException
     *         The revision ID was not specified.
     * @throws InvalidRevisionException
     *         The revision was specified in an invalid format.
     * @sample AmazonCodeDeploy.GetApplicationRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetApplicationRevision"
     *      target="_top">AWS API Documentation</a>
     */
    GetApplicationRevisionResult getApplicationRevision(GetApplicationRevisionRequest getApplicationRevisionRequest);

    /**
     * <p>
     * Gets information about a deployment.
     * </p>
     * <note>
     * <p>
     * The <code>content</code> property of the <code>appSpecContent</code> object in the returned revision is always
     * null. Use <code>GetApplicationRevision</code> and the <code>sha256</code> property of the returned
     * <code>appSpecContent</code> object to get the content of the deployment’s AppSpec file.
     * </p>
     * </note>
     * 
     * @param getDeploymentRequest
     *        Represents the input of a GetDeployment operation.
     * @return Result of the GetDeployment operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @throws DeploymentDoesNotExistException
     *         The deployment with the IAM user or AWS account does not exist.
     * @sample AmazonCodeDeploy.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Gets information about a deployment configuration.
     * </p>
     * 
     * @param getDeploymentConfigRequest
     *        Represents the input of a GetDeploymentConfig operation.
     * @return Result of the GetDeploymentConfig operation returned by the service.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid format.
     * @throws DeploymentConfigNameRequiredException
     *         The deployment configuration name was not specified.
     * @throws DeploymentConfigDoesNotExistException
     *         The deployment configuration does not exist with the IAM user or AWS account.
     * @throws InvalidComputePlatformException
     *         The computePlatform is invalid. The computePlatform should be <code>Lambda</code> or <code>Server</code>.
     * @sample AmazonCodeDeploy.GetDeploymentConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentConfig" target="_top">AWS
     *      API Documentation</a>
     */
    GetDeploymentConfigResult getDeploymentConfig(GetDeploymentConfigRequest getDeploymentConfigRequest);

    /**
     * <p>
     * Gets information about a deployment group.
     * </p>
     * 
     * @param getDeploymentGroupRequest
     *        Represents the input of a GetDeploymentGroup operation.
     * @return Result of the GetDeploymentGroup operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the IAM user or AWS account.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws DeploymentGroupDoesNotExistException
     *         The named deployment group with the IAM user or AWS account does not exist.
     * @throws DeploymentConfigDoesNotExistException
     *         The deployment configuration does not exist with the IAM user or AWS account.
     * @sample AmazonCodeDeploy.GetDeploymentGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentGroup" target="_top">AWS
     *      API Documentation</a>
     */
    GetDeploymentGroupResult getDeploymentGroup(GetDeploymentGroupRequest getDeploymentGroupRequest);

    /**
     * <p>
     * Gets information about an instance as part of a deployment.
     * </p>
     * 
     * @param getDeploymentInstanceRequest
     *        Represents the input of a GetDeploymentInstance operation.
     * @return Result of the GetDeploymentInstance operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment with the IAM user or AWS account does not exist.
     * @throws InstanceIdRequiredException
     *         The instance ID was not specified.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @throws InstanceDoesNotExistException
     *         The specified instance does not exist in the deployment group.
     * @throws InvalidInstanceNameException
     *         The on-premises instance name was specified in an invalid format.
     * @throws InvalidComputePlatformException
     *         The computePlatform is invalid. The computePlatform should be <code>Lambda</code> or <code>Server</code>.
     * @sample AmazonCodeDeploy.GetDeploymentInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    GetDeploymentInstanceResult getDeploymentInstance(GetDeploymentInstanceRequest getDeploymentInstanceRequest);

    /**
     * <p>
     * Returns information about a deployment target.
     * </p>
     * 
     * @param getDeploymentTargetRequest
     * @return Result of the GetDeploymentTarget operation returned by the service.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment with the IAM user or AWS account does not exist.
     * @throws DeploymentTargetIdRequiredException
     *         A deployment target ID was not provided.
     * @throws InvalidDeploymentTargetIdException
     *         The target ID provided was not valid.
     * @throws DeploymentTargetDoesNotExistException
     *         The provided target ID does not belong to the attempted deployment.
     * @throws InvalidInstanceNameException
     *         The on-premises instance name was specified in an invalid format.
     * @sample AmazonCodeDeploy.GetDeploymentTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentTarget" target="_top">AWS
     *      API Documentation</a>
     */
    GetDeploymentTargetResult getDeploymentTarget(GetDeploymentTargetRequest getDeploymentTargetRequest);

    /**
     * <p>
     * Gets information about an on-premises instance.
     * </p>
     * 
     * @param getOnPremisesInstanceRequest
     *        Represents the input of a GetOnPremisesInstance operation.
     * @return Result of the GetOnPremisesInstance operation returned by the service.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws InstanceNotRegisteredException
     *         The specified on-premises instance is not registered.
     * @throws InvalidInstanceNameException
     *         The on-premises instance name was specified in an invalid format.
     * @sample AmazonCodeDeploy.GetOnPremisesInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetOnPremisesInstance"
     *      target="_top">AWS API Documentation</a>
     */
    GetOnPremisesInstanceResult getOnPremisesInstance(GetOnPremisesInstanceRequest getOnPremisesInstanceRequest);

    /**
     * <p>
     * Lists information about revisions for an application.
     * </p>
     * 
     * @param listApplicationRevisionsRequest
     *        Represents the input of a ListApplicationRevisions operation.
     * @return Result of the ListApplicationRevisions operation returned by the service.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the IAM user or AWS account.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListApplicationRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationRevisionsResult listApplicationRevisions(ListApplicationRevisionsRequest listApplicationRevisionsRequest);

    /**
     * <p>
     * Lists the applications registered with the IAM user or AWS account.
     * </p>
     * 
     * @param listApplicationsRequest
     *        Represents the input of a ListApplications operation.
     * @return Result of the ListApplications operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListApplications" target="_top">AWS
     *      API Documentation</a>
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
     * Lists the deployment configurations with the IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentConfigsRequest
     *        Represents the input of a ListDeploymentConfigs operation.
     * @return Result of the ListDeploymentConfigs operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListDeploymentConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentConfigs"
     *      target="_top">AWS API Documentation</a>
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
     * Lists the deployment groups for an application registered with the IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentGroupsRequest
     *        Represents the input of a ListDeploymentGroups operation.
     * @return Result of the ListDeploymentGroups operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the IAM user or AWS account.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListDeploymentGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListDeploymentGroupsResult listDeploymentGroups(ListDeploymentGroupsRequest listDeploymentGroupsRequest);

    /**
     * <note>
     * <p>
     * The newer BatchGetDeploymentTargets should be used instead because it works with all compute types.
     * <code>ListDeploymentInstances</code> throws an exception if it is used with a compute platform other than
     * EC2/On-premises or AWS Lambda.
     * </p>
     * </note>
     * <p>
     * Lists the instance for a deployment associated with the IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentInstancesRequest
     *        Represents the input of a ListDeploymentInstances operation.
     * @return Result of the ListDeploymentInstances operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment with the IAM user or AWS account does not exist.
     * @throws DeploymentNotStartedException
     *         The specified deployment has not started.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @throws InvalidInstanceStatusException
     *         The specified instance status does not exist.
     * @throws InvalidInstanceTypeException
     *         An invalid instance type was specified for instances in a blue/green deployment. Valid values include
     *         "Blue" for an original environment and "Green" for a replacement environment.
     * @throws InvalidDeploymentInstanceTypeException
     *         An instance type was specified for an in-place deployment. Instance types are supported for blue/green
     *         deployments only.
     * @throws InvalidTargetFilterNameException
     *         The target filter name is invalid.
     * @throws InvalidComputePlatformException
     *         The computePlatform is invalid. The computePlatform should be <code>Lambda</code> or <code>Server</code>.
     * @sample AmazonCodeDeploy.ListDeploymentInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    ListDeploymentInstancesResult listDeploymentInstances(ListDeploymentInstancesRequest listDeploymentInstancesRequest);

    /**
     * <p>
     * Returns an array of target IDs that are associated a deployment.
     * </p>
     * 
     * @param listDeploymentTargetsRequest
     * @return Result of the ListDeploymentTargets operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment with the IAM user or AWS account does not exist.
     * @throws DeploymentNotStartedException
     *         The specified deployment has not started.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @throws InvalidInstanceStatusException
     *         The specified instance status does not exist.
     * @throws InvalidInstanceTypeException
     *         An invalid instance type was specified for instances in a blue/green deployment. Valid values include
     *         "Blue" for an original environment and "Green" for a replacement environment.
     * @throws InvalidDeploymentInstanceTypeException
     *         An instance type was specified for an in-place deployment. Instance types are supported for blue/green
     *         deployments only.
     * @sample AmazonCodeDeploy.ListDeploymentTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentTargets"
     *      target="_top">AWS API Documentation</a>
     */
    ListDeploymentTargetsResult listDeploymentTargets(ListDeploymentTargetsRequest listDeploymentTargetsRequest);

    /**
     * <p>
     * Lists the deployments in a deployment group for an application registered with the IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentsRequest
     *        Represents the input of a ListDeployments operation.
     * @return Result of the ListDeployments operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the IAM user or AWS account.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws DeploymentGroupDoesNotExistException
     *         The named deployment group with the IAM user or AWS account does not exist.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws InvalidTimeRangeException
     *         The specified time range was specified in an invalid format.
     * @throws InvalidDeploymentStatusException
     *         The specified deployment status doesn't exist or cannot be determined.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeployments" target="_top">AWS API
     *      Documentation</a>
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
     * Lists the names of stored connections to GitHub accounts.
     * </p>
     * 
     * @param listGitHubAccountTokenNamesRequest
     *        Represents the input of a ListGitHubAccountTokenNames operation.
     * @return Result of the ListGitHubAccountTokenNames operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @throws ResourceValidationException
     *         The specified resource could not be validated.
     * @throws OperationNotSupportedException
     *         The API used does not support the deployment.
     * @sample AmazonCodeDeploy.ListGitHubAccountTokenNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListGitHubAccountTokenNames"
     *      target="_top">AWS API Documentation</a>
     */
    ListGitHubAccountTokenNamesResult listGitHubAccountTokenNames(ListGitHubAccountTokenNamesRequest listGitHubAccountTokenNamesRequest);

    /**
     * <p>
     * Gets a list of names for one or more on-premises instances.
     * </p>
     * <p>
     * Unless otherwise specified, both registered and deregistered on-premises instance names are listed. To list only
     * registered or deregistered on-premises instance names, use the registration status parameter.
     * </p>
     * 
     * @param listOnPremisesInstancesRequest
     *        Represents the input of a ListOnPremisesInstances operation.
     * @return Result of the ListOnPremisesInstances operation returned by the service.
     * @throws InvalidRegistrationStatusException
     *         The registration status was specified in an invalid format.
     * @throws InvalidTagFilterException
     *         The tag filter was specified in an invalid format.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListOnPremisesInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListOnPremisesInstances"
     *      target="_top">AWS API Documentation</a>
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
     * Sets the result of a Lambda validation function. The function validates one or both lifecycle events (
     * <code>BeforeAllowTraffic</code> and <code>AfterAllowTraffic</code>) and returns <code>Succeeded</code> or
     * <code>Failed</code>.
     * </p>
     * 
     * @param putLifecycleEventHookExecutionStatusRequest
     * @return Result of the PutLifecycleEventHookExecutionStatus operation returned by the service.
     * @throws InvalidLifecycleEventHookExecutionStatusException
     *         The result of a Lambda validation function that verifies a lifecycle event is invalid. It should return
     *         <code>Succeeded</code> or <code>Failed</code>.
     * @throws InvalidLifecycleEventHookExecutionIdException
     *         A lifecycle event hook is invalid. Review the <code>hooks</code> section in your AppSpec file to ensure
     *         the lifecycle events and <code>hooks</code> functions are valid.
     * @throws LifecycleEventAlreadyCompletedException
     *         An attempt to return the status of an already completed lifecycle event occurred.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment with the IAM user or AWS account does not exist.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @throws UnsupportedActionForDeploymentTypeException
     *         A call was submitted that is not supported for the specified deployment type.
     * @sample AmazonCodeDeploy.PutLifecycleEventHookExecutionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/PutLifecycleEventHookExecutionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    PutLifecycleEventHookExecutionStatusResult putLifecycleEventHookExecutionStatus(
            PutLifecycleEventHookExecutionStatusRequest putLifecycleEventHookExecutionStatusRequest);

    /**
     * <p>
     * Registers with AWS CodeDeploy a revision for the specified application.
     * </p>
     * 
     * @param registerApplicationRevisionRequest
     *        Represents the input of a RegisterApplicationRevision operation.
     * @return Result of the RegisterApplicationRevision operation returned by the service.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the IAM user or AWS account.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/RegisterApplicationRevision"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterApplicationRevisionResult registerApplicationRevision(RegisterApplicationRevisionRequest registerApplicationRevisionRequest);

    /**
     * <p>
     * Registers an on-premises instance.
     * </p>
     * <note>
     * <p>
     * Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the request. You cannot use both.
     * </p>
     * </note>
     * 
     * @param registerOnPremisesInstanceRequest
     *        Represents the input of the register on-premises instance operation.
     * @return Result of the RegisterOnPremisesInstance operation returned by the service.
     * @throws InstanceNameAlreadyRegisteredException
     *         The specified on-premises instance name is already registered.
     * @throws IamArnRequiredException
     *         No IAM ARN was included in the request. You must use an IAM session ARN or IAM user ARN in the request.
     * @throws IamSessionArnAlreadyRegisteredException
     *         The request included an IAM session ARN that has already been used to register a different instance.
     * @throws IamUserArnAlreadyRegisteredException
     *         The specified IAM user ARN is already registered with an on-premises instance.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws IamUserArnRequiredException
     *         An IAM user ARN was not specified.
     * @throws InvalidInstanceNameException
     *         The on-premises instance name was specified in an invalid format.
     * @throws InvalidIamSessionArnException
     *         The IAM session ARN was specified in an invalid format.
     * @throws InvalidIamUserArnException
     *         The IAM user ARN was specified in an invalid format.
     * @throws MultipleIamArnsProvidedException
     *         Both an IAM user ARN and an IAM session ARN were included in the request. Use only one ARN type.
     * @sample AmazonCodeDeploy.RegisterOnPremisesInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/RegisterOnPremisesInstance"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterOnPremisesInstanceResult registerOnPremisesInstance(RegisterOnPremisesInstanceRequest registerOnPremisesInstanceRequest);

    /**
     * <p>
     * Removes one or more tags from one or more on-premises instances.
     * </p>
     * 
     * @param removeTagsFromOnPremisesInstancesRequest
     *        Represents the input of a RemoveTagsFromOnPremisesInstances operation.
     * @return Result of the RemoveTagsFromOnPremisesInstances operation returned by the service.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws InvalidInstanceNameException
     *         The on-premises instance name was specified in an invalid format.
     * @throws TagRequiredException
     *         A tag was not specified.
     * @throws InvalidTagException
     *         The tag was specified in an invalid format.
     * @throws TagLimitExceededException
     *         The maximum allowed number of tags was exceeded.
     * @throws InstanceLimitExceededException
     *         The maximum number of allowed on-premises instances in a single call was exceeded.
     * @throws InstanceNotRegisteredException
     *         The specified on-premises instance is not registered.
     * @sample AmazonCodeDeploy.RemoveTagsFromOnPremisesInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/RemoveTagsFromOnPremisesInstances"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveTagsFromOnPremisesInstancesResult removeTagsFromOnPremisesInstances(RemoveTagsFromOnPremisesInstancesRequest removeTagsFromOnPremisesInstancesRequest);

    /**
     * <p>
     * In a blue/green deployment, overrides any specified wait time and starts terminating instances immediately after
     * the traffic routing is complete.
     * </p>
     * 
     * @param skipWaitTimeForInstanceTerminationRequest
     * @return Result of the SkipWaitTimeForInstanceTermination operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment with the IAM user or AWS account does not exist.
     * @throws DeploymentAlreadyCompletedException
     *         The deployment is already complete.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @throws DeploymentNotStartedException
     *         The specified deployment has not started.
     * @throws UnsupportedActionForDeploymentTypeException
     *         A call was submitted that is not supported for the specified deployment type.
     * @sample AmazonCodeDeploy.SkipWaitTimeForInstanceTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/SkipWaitTimeForInstanceTermination"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    SkipWaitTimeForInstanceTerminationResult skipWaitTimeForInstanceTermination(
            SkipWaitTimeForInstanceTerminationRequest skipWaitTimeForInstanceTerminationRequest);

    /**
     * <p>
     * Attempts to stop an ongoing deployment.
     * </p>
     * 
     * @param stopDeploymentRequest
     *        Represents the input of a StopDeployment operation.
     * @return Result of the StopDeployment operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment with the IAM user or AWS account does not exist.
     * @throws DeploymentGroupDoesNotExistException
     *         The named deployment group with the IAM user or AWS account does not exist.
     * @throws DeploymentAlreadyCompletedException
     *         The deployment is already complete.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid format.
     * @sample AmazonCodeDeploy.StopDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/StopDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    StopDeploymentResult stopDeployment(StopDeploymentRequest stopDeploymentRequest);

    /**
     * <p>
     * Changes the name of an application.
     * </p>
     * 
     * @param updateApplicationRequest
     *        Represents the input of an UpdateApplication operation.
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationAlreadyExistsException
     *         An application with the specified name with the IAM user or AWS account already exists.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the IAM user or AWS account.
     * @sample AmazonCodeDeploy.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
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
     *        Represents the input of an UpdateDeploymentGroup operation.
     * @return Result of the UpdateDeploymentGroup operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the IAM user or AWS account.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws DeploymentGroupAlreadyExistsException
     *         A deployment group with the specified name with the IAM user or AWS account already exists.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws DeploymentGroupDoesNotExistException
     *         The named deployment group with the IAM user or AWS account does not exist.
     * @throws InvalidEC2TagException
     *         The tag was specified in an invalid format.
     * @throws InvalidTagException
     *         The tag was specified in an invalid format.
     * @throws InvalidAutoScalingGroupException
     *         The Auto Scaling group was specified in an invalid format or does not exist.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid format.
     * @throws DeploymentConfigDoesNotExistException
     *         The deployment configuration does not exist with the IAM user or AWS account.
     * @throws InvalidRoleException
     *         The service role ARN was specified in an invalid format. Or, if an Auto Scaling group was specified, the
     *         specified service role does not grant the appropriate permissions to Amazon EC2 Auto Scaling.
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
     *         The alarm name is empty or null or exceeds the limit of 255 characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Two alarms with the same name have been specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The alarm configuration is enabled, but the alarm list is empty.
     *         </p>
     *         </li>
     * @throws AlarmsLimitExceededException
     *         The maximum number of alarms for a deployment group (10) was exceeded.
     * @throws InvalidAutoRollbackConfigException
     *         The automatic rollback configuration was specified in an invalid format. For example, automatic rollback
     *         is enabled, but an invalid triggering event type or no event types were listed.
     * @throws InvalidLoadBalancerInfoException
     *         An invalid load balancer name, or no load balancer name, was specified.
     * @throws InvalidDeploymentStyleException
     *         An invalid deployment style was specified. Valid deployment types include "IN_PLACE" and "BLUE_GREEN."
     *         Valid deployment options include "WITH_TRAFFIC_CONTROL" and "WITHOUT_TRAFFIC_CONTROL."
     * @throws InvalidBlueGreenDeploymentConfigurationException
     *         The configuration for the blue/green deployment group was provided in an invalid format. For information
     *         about deployment configuration format, see <a>CreateDeploymentConfig</a>.
     * @throws InvalidEC2TagCombinationException
     *         A call was submitted that specified both Ec2TagFilters and Ec2TagSet, but only one of these data types
     *         can be used in a single call.
     * @throws InvalidOnPremisesTagCombinationException
     *         A call was submitted that specified both OnPremisesTagFilters and OnPremisesTagSet, but only one of these
     *         data types can be used in a single call.
     * @throws TagSetListLimitExceededException
     *         The number of tag groups included in the tag set list exceeded the maximum allowed limit of 3.
     * @throws InvalidInputException
     *         The input was specified in an invalid format.
     * @throws ThrottlingException
     *         An API function was called too frequently.
     * @throws InvalidECSServiceException
     *         The Amazon ECS service identifier is not valid.
     * @throws InvalidTargetGroupPairException
     *         A target group pair associated with this deployment is not valid.
     * @throws ECSServiceMappingLimitExceededException
     *         The Amazon ECS service is associated with more than one deployment groups. An Amazon ECS service can be
     *         associated with only one deployment group.
     * @sample AmazonCodeDeploy.UpdateDeploymentGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/UpdateDeploymentGroup"
     *      target="_top">AWS API Documentation</a>
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

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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.codedeploy.AmazonCodeDeployClientBuilder;
import com.amazonaws.services.codedeploy.waiters.AmazonCodeDeployWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.services.codedeploy.model.transform.*;

/**
 * Client for accessing CodeDeploy. All service calls made using this client are blocking, and will not return until the
 * service call completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCodeDeployClient extends AmazonWebServiceClient implements AmazonCodeDeploy {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCodeDeploy.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "codedeploy";

    private volatile AmazonCodeDeployWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceValidationException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.ResourceValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GitHubAccountTokenDoesNotExistException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.GitHubAccountTokenDoesNotExistException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidOperationException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagSetListLimitExceededException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.TagSetListLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentConfigDoesNotExistException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentConfigDoesNotExistException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ApplicationNameRequiredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidLifecycleEventHookExecutionIdException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidLifecycleEventHookExecutionIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAutoRollbackConfigException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidAutoRollbackConfigException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentLimitExceededException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTagFilterException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidTagFilterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentAlreadyCompletedException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentAlreadyCompletedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationNotSupportedException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.OperationNotSupportedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentGroupLimitExceededException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentGroupLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeploymentGroupNameException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidDeploymentGroupNameException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentTargetDoesNotExistException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentTargetDoesNotExistException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlarmsLimitExceededException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.AlarmsLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidGitHubAccountTokenException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidGitHubAccountTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TriggerTargetsLimitExceededException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.TriggerTargetsLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidLoadBalancerInfoException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidLoadBalancerInfoException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MultipleIamArnsProvidedException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.MultipleIamArnsProvidedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeploymentConfigNameException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidDeploymentConfigNameException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LifecycleHookLimitExceededException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.LifecycleHookLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IamUserArnAlreadyRegisteredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.IamUserArnAlreadyRegisteredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RevisionRequiredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.RevisionRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentIsNotInReadyStateException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentIsNotInReadyStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidGitHubAccountTokenNameException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidGitHubAccountTokenNameException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InstanceNotRegisteredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InstanceNotRegisteredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidBlueGreenDeploymentConfigurationException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidBlueGreenDeploymentConfigurationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ApplicationAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.ApplicationAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeployedStateFilterException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidDeployedStateFilterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentTargetIdRequiredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentTargetIdRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InstanceDoesNotExistException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InstanceDoesNotExistException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidECSServiceException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidECSServiceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAlarmConfigException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidAlarmConfigException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DescriptionTooLongException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DescriptionTooLongException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInstanceStatusException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidInstanceStatusException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InstanceLimitExceededException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InstanceLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentIdRequiredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidIgnoreApplicationStopFailuresValueException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidIgnoreApplicationStopFailuresValueException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentConfigNameRequiredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentConfigNameRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTargetGroupPairException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidTargetGroupPairException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTargetFilterNameException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidTargetFilterNameException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ApplicationLimitExceededException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.ApplicationLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRegistrationStatusException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidRegistrationStatusException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidLifecycleEventHookExecutionStatusException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidLifecycleEventHookExecutionStatusException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentGroupDoesNotExistException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentGroupDoesNotExistException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedActionForDeploymentTypeException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.UnsupportedActionForDeploymentTypeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidMinimumHealthyHostValueException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidMinimumHealthyHostValueException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BatchLimitExceededException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.BatchLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ApplicationDoesNotExistException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.ApplicationDoesNotExistException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTargetInstancesException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidTargetInstancesException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagRequiredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.TagRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BucketNameFilterRequiredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.BucketNameFilterRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidIamUserArnException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidIamUserArnException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInstanceTypeException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidInstanceTypeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTriggerConfigException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidTriggerConfigException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IamArnRequiredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.IamArnRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidKeyPrefixFilterException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidKeyPrefixFilterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GitHubAccountTokenNameRequiredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.GitHubAccountTokenNameRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ECSServiceMappingLimitExceededException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.ECSServiceMappingLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidBucketNameFilterException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidBucketNameFilterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidComputePlatformException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidComputePlatformException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RoleRequiredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.RoleRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.ThrottlingException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentNotStartedException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentNotStartedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LifecycleEventAlreadyCompletedException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.LifecycleEventAlreadyCompletedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidIamSessionArnException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidIamSessionArnException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentGroupAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentGroupAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidOnPremisesTagCombinationException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidOnPremisesTagCombinationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidEC2TagCombinationException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidEC2TagCombinationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InstanceNameRequiredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InstanceNameRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentConfigLimitExceededException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentConfigLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRevisionException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidRevisionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IamUserArnRequiredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.IamUserArnRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidUpdateOutdatedInstancesOnlyValueException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidUpdateOutdatedInstancesOnlyValueException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeploymentIdException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidDeploymentIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentTargetListSizeExceededException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentTargetListSizeExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeploymentStatusException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidDeploymentStatusException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInstanceNameException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidInstanceNameException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentConfigInUseException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentConfigInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentConfigAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentConfigAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IamSessionArnAlreadyRegisteredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.IamSessionArnAlreadyRegisteredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InstanceNameAlreadyRegisteredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InstanceNameAlreadyRegisteredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTagException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidTagException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidApplicationNameException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidApplicationNameException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeploymentStyleException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidDeploymentStyleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTimeRangeException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidTimeRangeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidInputException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSortByException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidSortByException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeploymentInstanceTypeException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidDeploymentInstanceTypeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidEC2TagException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidEC2TagException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentDoesNotExistException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentDoesNotExistException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSortOrderException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidSortOrderException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeploymentGroupNameRequiredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.DeploymentGroupNameRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RevisionDoesNotExistException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.RevisionDoesNotExistException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRoleException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidRoleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InstanceIdRequiredException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InstanceIdRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidFileExistsBehaviorException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidFileExistsBehaviorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeploymentTargetIdException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidDeploymentTargetIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagLimitExceededException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.TagLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeploymentWaitTypeException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidDeploymentWaitTypeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAutoScalingGroupException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidAutoScalingGroupException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTrafficRoutingConfigurationException").withModeledClass(
                                    com.amazonaws.services.codedeploy.model.InvalidTrafficRoutingConfigurationException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.codedeploy.model.AmazonCodeDeployException.class));

    /**
     * Constructs a new client to invoke service methods on CodeDeploy. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonCodeDeployClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCodeDeployClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodeDeploy. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodeDeploy (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonCodeDeployClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCodeDeployClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on CodeDeploy using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonCodeDeployClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonCodeDeployClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonCodeDeployClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodeDeploy using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodeDeploy (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonCodeDeployClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCodeDeployClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCodeDeployClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on CodeDeploy using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonCodeDeployClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCodeDeployClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodeDeploy using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodeDeploy (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonCodeDeployClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCodeDeployClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCodeDeployClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on CodeDeploy using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodeDeploy (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonCodeDeployClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCodeDeployClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCodeDeployClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonCodeDeployClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonCodeDeployClientBuilder builder() {
        return AmazonCodeDeployClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on CodeDeploy using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCodeDeployClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on CodeDeploy using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCodeDeployClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://codedeploy.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/codedeploy/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/codedeploy/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

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
    @Override
    public AddTagsToOnPremisesInstancesResult addTagsToOnPremisesInstances(AddTagsToOnPremisesInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeAddTagsToOnPremisesInstances(request);
    }

    @SdkInternalApi
    final AddTagsToOnPremisesInstancesResult executeAddTagsToOnPremisesInstances(AddTagsToOnPremisesInstancesRequest addTagsToOnPremisesInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsToOnPremisesInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToOnPremisesInstancesRequest> request = null;
        Response<AddTagsToOnPremisesInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToOnPremisesInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(addTagsToOnPremisesInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTagsToOnPremisesInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddTagsToOnPremisesInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AddTagsToOnPremisesInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public BatchGetApplicationRevisionsResult batchGetApplicationRevisions(BatchGetApplicationRevisionsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetApplicationRevisions(request);
    }

    @SdkInternalApi
    final BatchGetApplicationRevisionsResult executeBatchGetApplicationRevisions(BatchGetApplicationRevisionsRequest batchGetApplicationRevisionsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetApplicationRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetApplicationRevisionsRequest> request = null;
        Response<BatchGetApplicationRevisionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetApplicationRevisionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetApplicationRevisionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetApplicationRevisions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetApplicationRevisionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetApplicationRevisionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public BatchGetApplicationsResult batchGetApplications(BatchGetApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetApplications(request);
    }

    @SdkInternalApi
    final BatchGetApplicationsResult executeBatchGetApplications(BatchGetApplicationsRequest batchGetApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetApplicationsRequest> request = null;
        Response<BatchGetApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetApplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public BatchGetApplicationsResult batchGetApplications() {
        return batchGetApplications(new BatchGetApplicationsRequest());
    }

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
    @Override
    public BatchGetDeploymentGroupsResult batchGetDeploymentGroups(BatchGetDeploymentGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetDeploymentGroups(request);
    }

    @SdkInternalApi
    final BatchGetDeploymentGroupsResult executeBatchGetDeploymentGroups(BatchGetDeploymentGroupsRequest batchGetDeploymentGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetDeploymentGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDeploymentGroupsRequest> request = null;
        Response<BatchGetDeploymentGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDeploymentGroupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetDeploymentGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetDeploymentGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetDeploymentGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetDeploymentGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    @Deprecated
    public BatchGetDeploymentInstancesResult batchGetDeploymentInstances(BatchGetDeploymentInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetDeploymentInstances(request);
    }

    @SdkInternalApi
    final BatchGetDeploymentInstancesResult executeBatchGetDeploymentInstances(BatchGetDeploymentInstancesRequest batchGetDeploymentInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetDeploymentInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDeploymentInstancesRequest> request = null;
        Response<BatchGetDeploymentInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDeploymentInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetDeploymentInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetDeploymentInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetDeploymentInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetDeploymentInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public BatchGetDeploymentTargetsResult batchGetDeploymentTargets(BatchGetDeploymentTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetDeploymentTargets(request);
    }

    @SdkInternalApi
    final BatchGetDeploymentTargetsResult executeBatchGetDeploymentTargets(BatchGetDeploymentTargetsRequest batchGetDeploymentTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetDeploymentTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDeploymentTargetsRequest> request = null;
        Response<BatchGetDeploymentTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDeploymentTargetsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetDeploymentTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetDeploymentTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetDeploymentTargetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetDeploymentTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public BatchGetDeploymentsResult batchGetDeployments(BatchGetDeploymentsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetDeployments(request);
    }

    @SdkInternalApi
    final BatchGetDeploymentsResult executeBatchGetDeployments(BatchGetDeploymentsRequest batchGetDeploymentsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDeploymentsRequest> request = null;
        Response<BatchGetDeploymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDeploymentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetDeploymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetDeployments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetDeploymentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetDeploymentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public BatchGetDeploymentsResult batchGetDeployments() {
        return batchGetDeployments(new BatchGetDeploymentsRequest());
    }

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
    @Override
    public BatchGetOnPremisesInstancesResult batchGetOnPremisesInstances(BatchGetOnPremisesInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetOnPremisesInstances(request);
    }

    @SdkInternalApi
    final BatchGetOnPremisesInstancesResult executeBatchGetOnPremisesInstances(BatchGetOnPremisesInstancesRequest batchGetOnPremisesInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetOnPremisesInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetOnPremisesInstancesRequest> request = null;
        Response<BatchGetOnPremisesInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetOnPremisesInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetOnPremisesInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetOnPremisesInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetOnPremisesInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetOnPremisesInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public BatchGetOnPremisesInstancesResult batchGetOnPremisesInstances() {
        return batchGetOnPremisesInstances(new BatchGetOnPremisesInstancesRequest());
    }

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
    @Override
    public ContinueDeploymentResult continueDeployment(ContinueDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeContinueDeployment(request);
    }

    @SdkInternalApi
    final ContinueDeploymentResult executeContinueDeployment(ContinueDeploymentRequest continueDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(continueDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ContinueDeploymentRequest> request = null;
        Response<ContinueDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ContinueDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(continueDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ContinueDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ContinueDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ContinueDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplication(request);
    }

    @SdkInternalApi
    final CreateApplicationResult executeCreateApplication(CreateApplicationRequest createApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDeployment(request);
    }

    @SdkInternalApi
    final CreateDeploymentResult executeCreateDeployment(CreateDeploymentRequest createDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(createDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentRequest> request = null;
        Response<CreateDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CreateDeploymentConfigResult createDeploymentConfig(CreateDeploymentConfigRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDeploymentConfig(request);
    }

    @SdkInternalApi
    final CreateDeploymentConfigResult executeCreateDeploymentConfig(CreateDeploymentConfigRequest createDeploymentConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(createDeploymentConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentConfigRequest> request = null;
        Response<CreateDeploymentConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeploymentConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDeploymentConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDeploymentConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDeploymentConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CreateDeploymentGroupResult createDeploymentGroup(CreateDeploymentGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDeploymentGroup(request);
    }

    @SdkInternalApi
    final CreateDeploymentGroupResult executeCreateDeploymentGroup(CreateDeploymentGroupRequest createDeploymentGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentGroupRequest> request = null;
        Response<CreateDeploymentGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeploymentGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDeploymentGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDeploymentGroupResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateDeploymentGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteApplicationResult deleteApplication(DeleteApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplication(request);
    }

    @SdkInternalApi
    final DeleteApplicationResult executeDeleteApplication(DeleteApplicationRequest deleteApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        Response<DeleteApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteDeploymentConfigResult deleteDeploymentConfig(DeleteDeploymentConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDeploymentConfig(request);
    }

    @SdkInternalApi
    final DeleteDeploymentConfigResult executeDeleteDeploymentConfig(DeleteDeploymentConfigRequest deleteDeploymentConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDeploymentConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeploymentConfigRequest> request = null;
        Response<DeleteDeploymentConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeploymentConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDeploymentConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDeploymentConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDeploymentConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDeploymentConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteDeploymentGroupResult deleteDeploymentGroup(DeleteDeploymentGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDeploymentGroup(request);
    }

    @SdkInternalApi
    final DeleteDeploymentGroupResult executeDeleteDeploymentGroup(DeleteDeploymentGroupRequest deleteDeploymentGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeploymentGroupRequest> request = null;
        Response<DeleteDeploymentGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeploymentGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDeploymentGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDeploymentGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDeploymentGroupResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteDeploymentGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteGitHubAccountTokenResult deleteGitHubAccountToken(DeleteGitHubAccountTokenRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGitHubAccountToken(request);
    }

    @SdkInternalApi
    final DeleteGitHubAccountTokenResult executeDeleteGitHubAccountToken(DeleteGitHubAccountTokenRequest deleteGitHubAccountTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGitHubAccountTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGitHubAccountTokenRequest> request = null;
        Response<DeleteGitHubAccountTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGitHubAccountTokenRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteGitHubAccountTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGitHubAccountToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGitHubAccountTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteGitHubAccountTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeregisterOnPremisesInstanceResult deregisterOnPremisesInstance(DeregisterOnPremisesInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterOnPremisesInstance(request);
    }

    @SdkInternalApi
    final DeregisterOnPremisesInstanceResult executeDeregisterOnPremisesInstance(DeregisterOnPremisesInstanceRequest deregisterOnPremisesInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterOnPremisesInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterOnPremisesInstanceRequest> request = null;
        Response<DeregisterOnPremisesInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterOnPremisesInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterOnPremisesInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterOnPremisesInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterOnPremisesInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterOnPremisesInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetApplicationResult getApplication(GetApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplication(request);
    }

    @SdkInternalApi
    final GetApplicationResult executeGetApplication(GetApplicationRequest getApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationRequest> request = null;
        Response<GetApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetApplicationRevisionResult getApplicationRevision(GetApplicationRevisionRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplicationRevision(request);
    }

    @SdkInternalApi
    final GetApplicationRevisionResult executeGetApplicationRevision(GetApplicationRevisionRequest getApplicationRevisionRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationRevisionRequest> request = null;
        Response<GetApplicationRevisionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationRevisionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApplicationRevisionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplicationRevision");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationRevisionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetApplicationRevisionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetDeploymentResult getDeployment(GetDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeployment(request);
    }

    @SdkInternalApi
    final GetDeploymentResult executeGetDeployment(GetDeploymentRequest getDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentRequest> request = null;
        Response<GetDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetDeploymentConfigResult getDeploymentConfig(GetDeploymentConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeploymentConfig(request);
    }

    @SdkInternalApi
    final GetDeploymentConfigResult executeGetDeploymentConfig(GetDeploymentConfigRequest getDeploymentConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeploymentConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentConfigRequest> request = null;
        Response<GetDeploymentConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeploymentConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeploymentConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeploymentConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeploymentConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetDeploymentGroupResult getDeploymentGroup(GetDeploymentGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeploymentGroup(request);
    }

    @SdkInternalApi
    final GetDeploymentGroupResult executeGetDeploymentGroup(GetDeploymentGroupRequest getDeploymentGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentGroupRequest> request = null;
        Response<GetDeploymentGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeploymentGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeploymentGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeploymentGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeploymentGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    @Deprecated
    public GetDeploymentInstanceResult getDeploymentInstance(GetDeploymentInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeploymentInstance(request);
    }

    @SdkInternalApi
    final GetDeploymentInstanceResult executeGetDeploymentInstance(GetDeploymentInstanceRequest getDeploymentInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeploymentInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentInstanceRequest> request = null;
        Response<GetDeploymentInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeploymentInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeploymentInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeploymentInstanceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetDeploymentInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetDeploymentTargetResult getDeploymentTarget(GetDeploymentTargetRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeploymentTarget(request);
    }

    @SdkInternalApi
    final GetDeploymentTargetResult executeGetDeploymentTarget(GetDeploymentTargetRequest getDeploymentTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeploymentTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentTargetRequest> request = null;
        Response<GetDeploymentTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentTargetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeploymentTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeploymentTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeploymentTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeploymentTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetOnPremisesInstanceResult getOnPremisesInstance(GetOnPremisesInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeGetOnPremisesInstance(request);
    }

    @SdkInternalApi
    final GetOnPremisesInstanceResult executeGetOnPremisesInstance(GetOnPremisesInstanceRequest getOnPremisesInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(getOnPremisesInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOnPremisesInstanceRequest> request = null;
        Response<GetOnPremisesInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOnPremisesInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOnPremisesInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOnPremisesInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOnPremisesInstanceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetOnPremisesInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListApplicationRevisionsResult listApplicationRevisions(ListApplicationRevisionsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplicationRevisions(request);
    }

    @SdkInternalApi
    final ListApplicationRevisionsResult executeListApplicationRevisions(ListApplicationRevisionsRequest listApplicationRevisionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationRevisionsRequest> request = null;
        Response<ListApplicationRevisionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationRevisionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listApplicationRevisionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplicationRevisions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationRevisionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListApplicationRevisionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplications(request);
    }

    @SdkInternalApi
    final ListApplicationsResult executeListApplications(ListApplicationsRequest listApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationsRequest> request = null;
        Response<ListApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListApplicationsResult listApplications() {
        return listApplications(new ListApplicationsRequest());
    }

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
    @Override
    public ListDeploymentConfigsResult listDeploymentConfigs(ListDeploymentConfigsRequest request) {
        request = beforeClientExecution(request);
        return executeListDeploymentConfigs(request);
    }

    @SdkInternalApi
    final ListDeploymentConfigsResult executeListDeploymentConfigs(ListDeploymentConfigsRequest listDeploymentConfigsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeploymentConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentConfigsRequest> request = null;
        Response<ListDeploymentConfigsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentConfigsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeploymentConfigsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeploymentConfigs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeploymentConfigsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListDeploymentConfigsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListDeploymentConfigsResult listDeploymentConfigs() {
        return listDeploymentConfigs(new ListDeploymentConfigsRequest());
    }

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
    @Override
    public ListDeploymentGroupsResult listDeploymentGroups(ListDeploymentGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListDeploymentGroups(request);
    }

    @SdkInternalApi
    final ListDeploymentGroupsResult executeListDeploymentGroups(ListDeploymentGroupsRequest listDeploymentGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeploymentGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentGroupsRequest> request = null;
        Response<ListDeploymentGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeploymentGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeploymentGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeploymentGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDeploymentGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    @Deprecated
    public ListDeploymentInstancesResult listDeploymentInstances(ListDeploymentInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListDeploymentInstances(request);
    }

    @SdkInternalApi
    final ListDeploymentInstancesResult executeListDeploymentInstances(ListDeploymentInstancesRequest listDeploymentInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeploymentInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentInstancesRequest> request = null;
        Response<ListDeploymentInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDeploymentInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeploymentInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeploymentInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDeploymentInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListDeploymentTargetsResult listDeploymentTargets(ListDeploymentTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeListDeploymentTargets(request);
    }

    @SdkInternalApi
    final ListDeploymentTargetsResult executeListDeploymentTargets(ListDeploymentTargetsRequest listDeploymentTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeploymentTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentTargetsRequest> request = null;
        Response<ListDeploymentTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentTargetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeploymentTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeploymentTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeploymentTargetsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListDeploymentTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListDeploymentsResult listDeployments(ListDeploymentsRequest request) {
        request = beforeClientExecution(request);
        return executeListDeployments(request);
    }

    @SdkInternalApi
    final ListDeploymentsResult executeListDeployments(ListDeploymentsRequest listDeploymentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentsRequest> request = null;
        Response<ListDeploymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeploymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeployments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeploymentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDeploymentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListDeploymentsResult listDeployments() {
        return listDeployments(new ListDeploymentsRequest());
    }

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
    @Override
    public ListGitHubAccountTokenNamesResult listGitHubAccountTokenNames(ListGitHubAccountTokenNamesRequest request) {
        request = beforeClientExecution(request);
        return executeListGitHubAccountTokenNames(request);
    }

    @SdkInternalApi
    final ListGitHubAccountTokenNamesResult executeListGitHubAccountTokenNames(ListGitHubAccountTokenNamesRequest listGitHubAccountTokenNamesRequest) {

        ExecutionContext executionContext = createExecutionContext(listGitHubAccountTokenNamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGitHubAccountTokenNamesRequest> request = null;
        Response<ListGitHubAccountTokenNamesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGitHubAccountTokenNamesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listGitHubAccountTokenNamesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGitHubAccountTokenNames");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGitHubAccountTokenNamesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListGitHubAccountTokenNamesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListOnPremisesInstancesResult listOnPremisesInstances(ListOnPremisesInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListOnPremisesInstances(request);
    }

    @SdkInternalApi
    final ListOnPremisesInstancesResult executeListOnPremisesInstances(ListOnPremisesInstancesRequest listOnPremisesInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listOnPremisesInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOnPremisesInstancesRequest> request = null;
        Response<ListOnPremisesInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOnPremisesInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listOnPremisesInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOnPremisesInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOnPremisesInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListOnPremisesInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListOnPremisesInstancesResult listOnPremisesInstances() {
        return listOnPremisesInstances(new ListOnPremisesInstancesRequest());
    }

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
    @Override
    public PutLifecycleEventHookExecutionStatusResult putLifecycleEventHookExecutionStatus(PutLifecycleEventHookExecutionStatusRequest request) {
        request = beforeClientExecution(request);
        return executePutLifecycleEventHookExecutionStatus(request);
    }

    @SdkInternalApi
    final PutLifecycleEventHookExecutionStatusResult executePutLifecycleEventHookExecutionStatus(
            PutLifecycleEventHookExecutionStatusRequest putLifecycleEventHookExecutionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(putLifecycleEventHookExecutionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLifecycleEventHookExecutionStatusRequest> request = null;
        Response<PutLifecycleEventHookExecutionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLifecycleEventHookExecutionStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putLifecycleEventHookExecutionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutLifecycleEventHookExecutionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutLifecycleEventHookExecutionStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutLifecycleEventHookExecutionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public RegisterApplicationRevisionResult registerApplicationRevision(RegisterApplicationRevisionRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterApplicationRevision(request);
    }

    @SdkInternalApi
    final RegisterApplicationRevisionResult executeRegisterApplicationRevision(RegisterApplicationRevisionRequest registerApplicationRevisionRequest) {

        ExecutionContext executionContext = createExecutionContext(registerApplicationRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterApplicationRevisionRequest> request = null;
        Response<RegisterApplicationRevisionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterApplicationRevisionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerApplicationRevisionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterApplicationRevision");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterApplicationRevisionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterApplicationRevisionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public RegisterOnPremisesInstanceResult registerOnPremisesInstance(RegisterOnPremisesInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterOnPremisesInstance(request);
    }

    @SdkInternalApi
    final RegisterOnPremisesInstanceResult executeRegisterOnPremisesInstance(RegisterOnPremisesInstanceRequest registerOnPremisesInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(registerOnPremisesInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterOnPremisesInstanceRequest> request = null;
        Response<RegisterOnPremisesInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterOnPremisesInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerOnPremisesInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterOnPremisesInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterOnPremisesInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterOnPremisesInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public RemoveTagsFromOnPremisesInstancesResult removeTagsFromOnPremisesInstances(RemoveTagsFromOnPremisesInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTagsFromOnPremisesInstances(request);
    }

    @SdkInternalApi
    final RemoveTagsFromOnPremisesInstancesResult executeRemoveTagsFromOnPremisesInstances(
            RemoveTagsFromOnPremisesInstancesRequest removeTagsFromOnPremisesInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTagsFromOnPremisesInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromOnPremisesInstancesRequest> request = null;
        Response<RemoveTagsFromOnPremisesInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromOnPremisesInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeTagsFromOnPremisesInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTagsFromOnPremisesInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveTagsFromOnPremisesInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveTagsFromOnPremisesInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    @Deprecated
    public SkipWaitTimeForInstanceTerminationResult skipWaitTimeForInstanceTermination(SkipWaitTimeForInstanceTerminationRequest request) {
        request = beforeClientExecution(request);
        return executeSkipWaitTimeForInstanceTermination(request);
    }

    @SdkInternalApi
    final SkipWaitTimeForInstanceTerminationResult executeSkipWaitTimeForInstanceTermination(
            SkipWaitTimeForInstanceTerminationRequest skipWaitTimeForInstanceTerminationRequest) {

        ExecutionContext executionContext = createExecutionContext(skipWaitTimeForInstanceTerminationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SkipWaitTimeForInstanceTerminationRequest> request = null;
        Response<SkipWaitTimeForInstanceTerminationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SkipWaitTimeForInstanceTerminationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(skipWaitTimeForInstanceTerminationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SkipWaitTimeForInstanceTermination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SkipWaitTimeForInstanceTerminationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SkipWaitTimeForInstanceTerminationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public StopDeploymentResult stopDeployment(StopDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeStopDeployment(request);
    }

    @SdkInternalApi
    final StopDeploymentResult executeStopDeployment(StopDeploymentRequest stopDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(stopDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDeploymentRequest> request = null;
        Response<StopDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplication(request);
    }

    @SdkInternalApi
    final UpdateApplicationResult executeUpdateApplication(UpdateApplicationRequest updateApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<UpdateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public UpdateApplicationResult updateApplication() {
        return updateApplication(new UpdateApplicationRequest());
    }

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
    @Override
    public UpdateDeploymentGroupResult updateDeploymentGroup(UpdateDeploymentGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDeploymentGroup(request);
    }

    @SdkInternalApi
    final UpdateDeploymentGroupResult executeUpdateDeploymentGroup(UpdateDeploymentGroupRequest updateDeploymentGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeploymentGroupRequest> request = null;
        Response<UpdateDeploymentGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeploymentGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDeploymentGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeDeploy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDeploymentGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDeploymentGroupResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateDeploymentGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public AmazonCodeDeployWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonCodeDeployWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}

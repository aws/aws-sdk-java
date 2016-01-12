/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.services.codedeploy.model.transform.*;

/**
 * Client for accessing CodeDeploy. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS CodeDeploy</fullname> <b>Overview</b>
 * <p>
 * This is the AWS CodeDeploy API Reference. This guide provides descriptions of
 * the AWS CodeDeploy APIs. For additional information, see the <a
 * href="http://docs.aws.amazon.com/codedeploy/latest/userguide">AWS CodeDeploy
 * User Guide</a>.
 * </p>
 * <b>Using the APIs</b>
 * <p>
 * You can use the AWS CodeDeploy APIs to work with the following items:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Applications are unique identifiers that AWS CodeDeploy uses to ensure that
 * the correct combinations of revisions, deployment configurations, and
 * deployment groups are being referenced during deployments.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, list, and update
 * applications.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployment configurations are sets of deployment rules and deployment success
 * and failure conditions that AWS CodeDeploy uses during deployments.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, and list
 * deployment configurations.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployment groups are groups of instances to which application revisions can
 * be deployed.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, list, and update
 * deployment groups.
 * </p>
 * </li>
 * <li>
 * <p>
 * Instances represent Amazon EC2 instances to which application revisions are
 * deployed. Instances are identified by their Amazon EC2 tags or Auto Scaling
 * group names. Instances belong to deployment groups.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to get and list instances.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployments represent the process of deploying revisions to instances.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, get, list, and stop
 * deployments.
 * </p>
 * </li>
 * <li>
 * <p>
 * Application revisions are archive files that are stored in Amazon S3 buckets
 * or GitHub repositories. These revisions contain source content (such as
 * source code, web pages, executable files, any deployment scripts, and
 * similar) along with an Application Specification file (AppSpec file). (The
 * AppSpec file is unique to AWS CodeDeploy; it defines a series of deployment
 * actions that you want AWS CodeDeploy to execute.) An application revision is
 * uniquely identified by its Amazon S3 object key and its ETag, version, or
 * both (for application revisions that are stored in Amazon S3 buckets) or by
 * its repository name and commit ID (for applications revisions that are stored
 * in GitHub repositories). Application revisions are deployed through
 * deployment groups.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to get, list, and register application
 * revisions.
 * </p>
 * </li>
 * </ul>
 */
public class AmazonCodeDeployClient extends AmazonWebServiceClient implements
        AmazonCodeDeploy {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCodeDeploy.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "codedeploy";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "codedeploy";

    /**
     * List of exception unmarshallers for all CodeDeploy exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on CodeDeploy. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCodeDeployClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodeDeploy. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CodeDeploy (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCodeDeployClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on CodeDeploy using the
     * specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AmazonCodeDeployClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodeDeploy using the
     * specified AWS account credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CodeDeploy (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCodeDeployClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on CodeDeploy using the
     * specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AmazonCodeDeployClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodeDeploy using the
     * specified AWS account credentials provider and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CodeDeploy (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCodeDeployClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on CodeDeploy using the
     * specified AWS account credentials provider, client configuration options,
     * and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CodeDeploy (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonCodeDeployClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.DeploymentGroupLimitExceededException.class,
                        "DeploymentGroupLimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.RoleRequiredException.class,
                        "RoleRequiredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InstanceIdRequiredException.class,
                        "InstanceIdRequiredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidRegistrationStatusException.class,
                        "InvalidRegistrationStatusException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidOperationException.class,
                        "InvalidOperationException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InstanceLimitExceededException.class,
                        "InstanceLimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.DeploymentConfigInUseException.class,
                        "DeploymentConfigInUseException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InstanceNotRegisteredException.class,
                        "InstanceNotRegisteredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InstanceNameRequiredException.class,
                        "InstanceNameRequiredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.DeploymentConfigLimitExceededException.class,
                        "DeploymentConfigLimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.DeploymentConfigNameRequiredException.class,
                        "DeploymentConfigNameRequiredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.RevisionRequiredException.class,
                        "RevisionRequiredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException.class,
                        "ApplicationNameRequiredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.ApplicationDoesNotExistException.class,
                        "ApplicationDoesNotExistException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.DeploymentGroupDoesNotExistException.class,
                        "DeploymentGroupDoesNotExistException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.DescriptionTooLongException.class,
                        "DescriptionTooLongException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.ApplicationLimitExceededException.class,
                        "ApplicationLimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.RevisionDoesNotExistException.class,
                        "RevisionDoesNotExistException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidDeploymentConfigNameException.class,
                        "InvalidDeploymentConfigNameException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidNextTokenException.class,
                        "InvalidNextTokenException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidSortByException.class,
                        "InvalidSortByException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.TagLimitExceededException.class,
                        "TagLimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.DeploymentGroupNameRequiredException.class,
                        "DeploymentGroupNameRequiredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.DeploymentConfigDoesNotExistException.class,
                        "DeploymentConfigDoesNotExistException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.BucketNameFilterRequiredException.class,
                        "BucketNameFilterRequiredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidKeyPrefixFilterException.class,
                        "InvalidKeyPrefixFilterException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidDeploymentGroupNameException.class,
                        "InvalidDeploymentGroupNameException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.DeploymentAlreadyCompletedException.class,
                        "DeploymentAlreadyCompletedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidSortOrderException.class,
                        "InvalidSortOrderException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidTagFilterException.class,
                        "InvalidTagFilterException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.IamUserArnRequiredException.class,
                        "IamUserArnRequiredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidTimeRangeException.class,
                        "InvalidTimeRangeException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidInstanceNameException.class,
                        "InvalidInstanceNameException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidBucketNameFilterException.class,
                        "InvalidBucketNameFilterException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidDeploymentStatusException.class,
                        "InvalidDeploymentStatusException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.DeploymentGroupAlreadyExistsException.class,
                        "DeploymentGroupAlreadyExistsException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidIamUserArnException.class,
                        "InvalidIamUserArnException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.TagRequiredException.class,
                        "TagRequiredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidRoleException.class,
                        "InvalidRoleException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidDeployedStateFilterException.class,
                        "InvalidDeployedStateFilterException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidEC2TagException.class,
                        "InvalidEC2TagException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.ApplicationAlreadyExistsException.class,
                        "ApplicationAlreadyExistsException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidMinimumHealthyHostValueException.class,
                        "InvalidMinimumHealthyHostValueException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InstanceDoesNotExistException.class,
                        "InstanceDoesNotExistException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidTagException.class,
                        "InvalidTagException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.IamUserArnAlreadyRegisteredException.class,
                        "IamUserArnAlreadyRegisteredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InstanceNameAlreadyRegisteredException.class,
                        "InstanceNameAlreadyRegisteredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException.class,
                        "DeploymentIdRequiredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidDeploymentIdException.class,
                        "InvalidDeploymentIdException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidInstanceStatusException.class,
                        "InvalidInstanceStatusException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidRevisionException.class,
                        "InvalidRevisionException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.DeploymentConfigAlreadyExistsException.class,
                        "DeploymentConfigAlreadyExistsException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidAutoScalingGroupException.class,
                        "InvalidAutoScalingGroupException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.DeploymentDoesNotExistException.class,
                        "DeploymentDoesNotExistException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.InvalidApplicationNameException.class,
                        "InvalidApplicationNameException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.DeploymentNotStartedException.class,
                        "DeploymentNotStartedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.codedeploy.model.DeploymentLimitExceededException.class,
                        "DeploymentLimitExceededException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://codedeploy.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/codedeploy/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/codedeploy/request.handler2s"));
    }

    /**
     * <p>
     * Adds a tag to an on-premises instance.
     * </p>
     * 
     * @param addTagsToOnPremisesInstancesRequest
     *        Represents the input of an adds tags to on-premises instance
     *        operation.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws TagRequiredException
     *         A tag was not specified.
     * @throws InvalidTagException
     *         The specified tag was specified in an invalid format.
     * @throws TagLimitExceededException
     *         The maximum allowed number of tags was exceeded.
     * @throws InstanceLimitExceededException
     *         The maximum number of allowed on-premises instances was exceeded.
     * @throws InstanceNotRegisteredException
     *         The specified on-premises instance is not registered.
     * @sample AmazonCodeDeploy.AddTagsToOnPremisesInstances
     */
    @Override
    public void addTagsToOnPremisesInstances(
            AddTagsToOnPremisesInstancesRequest addTagsToOnPremisesInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(addTagsToOnPremisesInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToOnPremisesInstancesRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToOnPremisesInstancesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(addTagsToOnPremisesInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     *        Represents the input of a batch get applications operation.
     * @return Result of the BatchGetApplications operation returned by the
     *         service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not
     *         specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or
     *         AWS account.
     * @sample AmazonCodeDeploy.BatchGetApplications
     */
    @Override
    public BatchGetApplicationsResult batchGetApplications(
            BatchGetApplicationsRequest batchGetApplicationsRequest) {
        ExecutionContext executionContext = createExecutionContext(batchGetApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetApplicationsRequest> request = null;
        Response<BatchGetApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetApplicationsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(batchGetApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<BatchGetApplicationsResult> responseHandler = new JsonResponseHandler<BatchGetApplicationsResult>(
                    new BatchGetApplicationsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * Gets information about one or more deployments.
     * </p>
     * 
     * @param batchGetDeploymentsRequest
     *        Represents the input of a batch get deployments operation.
     * @return Result of the BatchGetDeployments operation returned by the
     *         service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid
     *         format.
     * @sample AmazonCodeDeploy.BatchGetDeployments
     */
    @Override
    public BatchGetDeploymentsResult batchGetDeployments(
            BatchGetDeploymentsRequest batchGetDeploymentsRequest) {
        ExecutionContext executionContext = createExecutionContext(batchGetDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDeploymentsRequest> request = null;
        Response<BatchGetDeploymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDeploymentsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(batchGetDeploymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<BatchGetDeploymentsResult> responseHandler = new JsonResponseHandler<BatchGetDeploymentsResult>(
                    new BatchGetDeploymentsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Represents the input of a batch get on-premises instances
     *        operation.
     * @return Result of the BatchGetOnPremisesInstances operation returned by
     *         the service.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws InvalidInstanceNameException
     *         The specified on-premises instance name was specified in an
     *         invalid format.
     * @sample AmazonCodeDeploy.BatchGetOnPremisesInstances
     */
    @Override
    public BatchGetOnPremisesInstancesResult batchGetOnPremisesInstances(
            BatchGetOnPremisesInstancesRequest batchGetOnPremisesInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(batchGetOnPremisesInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetOnPremisesInstancesRequest> request = null;
        Response<BatchGetOnPremisesInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetOnPremisesInstancesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(batchGetOnPremisesInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<BatchGetOnPremisesInstancesResult> responseHandler = new JsonResponseHandler<BatchGetOnPremisesInstancesResult>(
                    new BatchGetOnPremisesInstancesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * Creates a new application.
     * </p>
     * 
     * @param createApplicationRequest
     *        Represents the input of a create application operation.
     * @return Result of the CreateApplication operation returned by the
     *         service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not
     *         specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationAlreadyExistsException
     *         An application with the specified name already exists with the
     *         applicable IAM user or AWS account.
     * @throws ApplicationLimitExceededException
     *         More applications were attempted to be created than were allowed.
     * @sample AmazonCodeDeploy.CreateApplication
     */
    @Override
    public CreateApplicationResult createApplication(
            CreateApplicationRequest createApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateApplicationResult> responseHandler = new JsonResponseHandler<CreateApplicationResult>(
                    new CreateApplicationResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Represents the input of a create deployment operation.
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not
     *         specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or
     *         AWS account.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws DeploymentGroupDoesNotExistException
     *         The named deployment group does not exist with the applicable IAM
     *         user or AWS account.
     * @throws RevisionRequiredException
     *         The revision ID was not specified.
     * @throws InvalidRevisionException
     *         The revision was specified in an invalid format.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid
     *         format.
     * @throws DeploymentConfigDoesNotExistException
     *         The deployment configuration does not exist with the applicable
     *         IAM user or AWS account.
     * @throws DescriptionTooLongException
     *         The description that was provided is too long.
     * @throws DeploymentLimitExceededException
     *         The number of allowed deployments was exceeded.
     * @sample AmazonCodeDeploy.CreateDeployment
     */
    @Override
    public CreateDeploymentResult createDeployment(
            CreateDeploymentRequest createDeploymentRequest) {
        ExecutionContext executionContext = createExecutionContext(createDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentRequest> request = null;
        Response<CreateDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateDeploymentResult> responseHandler = new JsonResponseHandler<CreateDeploymentResult>(
                    new CreateDeploymentResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new deployment configuration.
     * </p>
     * 
     * @param createDeploymentConfigRequest
     *        Represents the input of a create deployment configuration
     *        operation.
     * @return Result of the CreateDeploymentConfig operation returned by the
     *         service.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid
     *         format.
     * @throws DeploymentConfigNameRequiredException
     *         The deployment configuration name was not specified.
     * @throws DeploymentConfigAlreadyExistsException
     *         A deployment configuration with the specified name already exists
     *         with the applicable IAM user or AWS account.
     * @throws InvalidMinimumHealthyHostValueException
     *         The minimum healthy instances value was specified in an invalid
     *         format.
     * @throws DeploymentConfigLimitExceededException
     *         The deployment configurations limit was exceeded.
     * @sample AmazonCodeDeploy.CreateDeploymentConfig
     */
    @Override
    public CreateDeploymentConfigResult createDeploymentConfig(
            CreateDeploymentConfigRequest createDeploymentConfigRequest) {
        ExecutionContext executionContext = createExecutionContext(createDeploymentConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentConfigRequest> request = null;
        Response<CreateDeploymentConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentConfigRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createDeploymentConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateDeploymentConfigResult> responseHandler = new JsonResponseHandler<CreateDeploymentConfigResult>(
                    new CreateDeploymentConfigResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new deployment group for application revisions to be deployed
     * to.
     * </p>
     * 
     * @param createDeploymentGroupRequest
     *        Represents the input of a create deployment group operation.
     * @return Result of the CreateDeploymentGroup operation returned by the
     *         service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not
     *         specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or
     *         AWS account.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws DeploymentGroupAlreadyExistsException
     *         A deployment group with the specified name already exists with
     *         the applicable IAM user or AWS account.
     * @throws InvalidEC2TagException
     *         The tag was specified in an invalid format.
     * @throws InvalidTagException
     *         The specified tag was specified in an invalid format.
     * @throws InvalidAutoScalingGroupException
     *         The Auto Scaling group was specified in an invalid format or does
     *         not exist.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid
     *         format.
     * @throws DeploymentConfigDoesNotExistException
     *         The deployment configuration does not exist with the applicable
     *         IAM user or AWS account.
     * @throws RoleRequiredException
     *         The role ID was not specified.
     * @throws InvalidRoleException
     *         The service role ARN was specified in an invalid format. Or, if
     *         an Auto Scaling group was specified, the specified service role
     *         does not grant the appropriate permissions to Auto Scaling.
     * @throws DeploymentGroupLimitExceededException
     *         The deployment groups limit was exceeded.
     * @sample AmazonCodeDeploy.CreateDeploymentGroup
     */
    @Override
    public CreateDeploymentGroupResult createDeploymentGroup(
            CreateDeploymentGroupRequest createDeploymentGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentGroupRequest> request = null;
        Response<CreateDeploymentGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentGroupRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createDeploymentGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateDeploymentGroupResult> responseHandler = new JsonResponseHandler<CreateDeploymentGroupResult>(
                    new CreateDeploymentGroupResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Represents the input of a delete application operation.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not
     *         specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @sample AmazonCodeDeploy.DeleteApplication
     */
    @Override
    public void deleteApplication(
            DeleteApplicationRequest deleteApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a deployment configuration.
     * </p>
     * <note>A deployment configuration cannot be deleted if it is currently in
     * use. Also, predefined configurations cannot be deleted.</note>
     * 
     * @param deleteDeploymentConfigRequest
     *        Represents the input of a delete deployment configuration
     *        operation.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid
     *         format.
     * @throws DeploymentConfigNameRequiredException
     *         The deployment configuration name was not specified.
     * @throws DeploymentConfigInUseException
     *         The deployment configuration is still in use.
     * @throws InvalidOperationException
     *         An invalid operation was detected.
     * @sample AmazonCodeDeploy.DeleteDeploymentConfig
     */
    @Override
    public void deleteDeploymentConfig(
            DeleteDeploymentConfigRequest deleteDeploymentConfigRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDeploymentConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeploymentConfigRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeploymentConfigRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteDeploymentConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     *        Represents the input of a delete deployment group operation.
     * @return Result of the DeleteDeploymentGroup operation returned by the
     *         service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not
     *         specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws InvalidRoleException
     *         The service role ARN was specified in an invalid format. Or, if
     *         an Auto Scaling group was specified, the specified service role
     *         does not grant the appropriate permissions to Auto Scaling.
     * @sample AmazonCodeDeploy.DeleteDeploymentGroup
     */
    @Override
    public DeleteDeploymentGroupResult deleteDeploymentGroup(
            DeleteDeploymentGroupRequest deleteDeploymentGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeploymentGroupRequest> request = null;
        Response<DeleteDeploymentGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeploymentGroupRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteDeploymentGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteDeploymentGroupResult> responseHandler = new JsonResponseHandler<DeleteDeploymentGroupResult>(
                    new DeleteDeploymentGroupResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Represents the input of a deregister on-premises instance
     *        operation.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws InvalidInstanceNameException
     *         The specified on-premises instance name was specified in an
     *         invalid format.
     * @sample AmazonCodeDeploy.DeregisterOnPremisesInstance
     */
    @Override
    public void deregisterOnPremisesInstance(
            DeregisterOnPremisesInstanceRequest deregisterOnPremisesInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(deregisterOnPremisesInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterOnPremisesInstanceRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterOnPremisesInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deregisterOnPremisesInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     *        Represents the input of a get application operation.
     * @return Result of the GetApplication operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not
     *         specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or
     *         AWS account.
     * @sample AmazonCodeDeploy.GetApplication
     */
    @Override
    public GetApplicationResult getApplication(
            GetApplicationRequest getApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(getApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationRequest> request = null;
        Response<GetApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationRequestMarshaller().marshall(super
                        .beforeMarshalling(getApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetApplicationResult> responseHandler = new JsonResponseHandler<GetApplicationResult>(
                    new GetApplicationResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Represents the input of a get application revision operation.
     * @return Result of the GetApplicationRevision operation returned by the
     *         service.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or
     *         AWS account.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not
     *         specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws RevisionDoesNotExistException
     *         The named revision does not exist with the applicable IAM user or
     *         AWS account.
     * @throws RevisionRequiredException
     *         The revision ID was not specified.
     * @throws InvalidRevisionException
     *         The revision was specified in an invalid format.
     * @sample AmazonCodeDeploy.GetApplicationRevision
     */
    @Override
    public GetApplicationRevisionResult getApplicationRevision(
            GetApplicationRevisionRequest getApplicationRevisionRequest) {
        ExecutionContext executionContext = createExecutionContext(getApplicationRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationRevisionRequest> request = null;
        Response<GetApplicationRevisionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationRevisionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getApplicationRevisionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetApplicationRevisionResult> responseHandler = new JsonResponseHandler<GetApplicationRevisionResult>(
                    new GetApplicationRevisionResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * 
     * @param getDeploymentRequest
     *        Represents the input of a get deployment operation.
     * @return Result of the GetDeployment operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid
     *         format.
     * @throws DeploymentDoesNotExistException
     *         The deployment does not exist with the applicable IAM user or AWS
     *         account.
     * @sample AmazonCodeDeploy.GetDeployment
     */
    @Override
    public GetDeploymentResult getDeployment(
            GetDeploymentRequest getDeploymentRequest) {
        ExecutionContext executionContext = createExecutionContext(getDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentRequest> request = null;
        Response<GetDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentRequestMarshaller().marshall(super
                        .beforeMarshalling(getDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetDeploymentResult> responseHandler = new JsonResponseHandler<GetDeploymentResult>(
                    new GetDeploymentResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Represents the input of a get deployment configuration operation.
     * @return Result of the GetDeploymentConfig operation returned by the
     *         service.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid
     *         format.
     * @throws DeploymentConfigNameRequiredException
     *         The deployment configuration name was not specified.
     * @throws DeploymentConfigDoesNotExistException
     *         The deployment configuration does not exist with the applicable
     *         IAM user or AWS account.
     * @sample AmazonCodeDeploy.GetDeploymentConfig
     */
    @Override
    public GetDeploymentConfigResult getDeploymentConfig(
            GetDeploymentConfigRequest getDeploymentConfigRequest) {
        ExecutionContext executionContext = createExecutionContext(getDeploymentConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentConfigRequest> request = null;
        Response<GetDeploymentConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentConfigRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getDeploymentConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetDeploymentConfigResult> responseHandler = new JsonResponseHandler<GetDeploymentConfigResult>(
                    new GetDeploymentConfigResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Represents the input of a get deployment group operation.
     * @return Result of the GetDeploymentGroup operation returned by the
     *         service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not
     *         specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or
     *         AWS account.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws DeploymentGroupDoesNotExistException
     *         The named deployment group does not exist with the applicable IAM
     *         user or AWS account.
     * @sample AmazonCodeDeploy.GetDeploymentGroup
     */
    @Override
    public GetDeploymentGroupResult getDeploymentGroup(
            GetDeploymentGroupRequest getDeploymentGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(getDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentGroupRequest> request = null;
        Response<GetDeploymentGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentGroupRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getDeploymentGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetDeploymentGroupResult> responseHandler = new JsonResponseHandler<GetDeploymentGroupResult>(
                    new GetDeploymentGroupResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Represents the input of a get deployment instance operation.
     * @return Result of the GetDeploymentInstance operation returned by the
     *         service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment does not exist with the applicable IAM user or AWS
     *         account.
     * @throws InstanceIdRequiredException
     *         The instance ID was not specified.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid
     *         format.
     * @throws InstanceDoesNotExistException
     *         The specified instance does not exist in the deployment group.
     * @sample AmazonCodeDeploy.GetDeploymentInstance
     */
    @Override
    public GetDeploymentInstanceResult getDeploymentInstance(
            GetDeploymentInstanceRequest getDeploymentInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(getDeploymentInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentInstanceRequest> request = null;
        Response<GetDeploymentInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getDeploymentInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetDeploymentInstanceResult> responseHandler = new JsonResponseHandler<GetDeploymentInstanceResult>(
                    new GetDeploymentInstanceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Represents the input of a get on-premises instance operation.
     * @return Result of the GetOnPremisesInstance operation returned by the
     *         service.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws InstanceNotRegisteredException
     *         The specified on-premises instance is not registered.
     * @throws InvalidInstanceNameException
     *         The specified on-premises instance name was specified in an
     *         invalid format.
     * @sample AmazonCodeDeploy.GetOnPremisesInstance
     */
    @Override
    public GetOnPremisesInstanceResult getOnPremisesInstance(
            GetOnPremisesInstanceRequest getOnPremisesInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(getOnPremisesInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOnPremisesInstanceRequest> request = null;
        Response<GetOnPremisesInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOnPremisesInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getOnPremisesInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetOnPremisesInstanceResult> responseHandler = new JsonResponseHandler<GetOnPremisesInstanceResult>(
                    new GetOnPremisesInstanceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Represents the input of a list application revisions operation.
     * @return Result of the ListApplicationRevisions operation returned by the
     *         service.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or
     *         AWS account.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not
     *         specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws InvalidSortByException
     *         The column name to sort by is either not present or was specified
     *         in an invalid format.
     * @throws InvalidSortOrderException
     *         The sort order was specified in an invalid format.
     * @throws InvalidBucketNameFilterException
     *         The bucket name either doesn't exist or was specified in an
     *         invalid format.
     * @throws InvalidKeyPrefixFilterException
     *         The specified key prefix filter was specified in an invalid
     *         format.
     * @throws BucketNameFilterRequiredException
     *         A bucket name is required but was not provided.
     * @throws InvalidDeployedStateFilterException
     *         The deployed state filter was specified in an invalid format.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListApplicationRevisions
     */
    @Override
    public ListApplicationRevisionsResult listApplicationRevisions(
            ListApplicationRevisionsRequest listApplicationRevisionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listApplicationRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationRevisionsRequest> request = null;
        Response<ListApplicationRevisionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationRevisionsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listApplicationRevisionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListApplicationRevisionsResult> responseHandler = new JsonResponseHandler<ListApplicationRevisionsResult>(
                    new ListApplicationRevisionsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the applications registered with the applicable IAM user or AWS
     * account.
     * </p>
     * 
     * @param listApplicationsRequest
     *        Represents the input of a list applications operation.
     * @return Result of the ListApplications operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListApplications
     */
    @Override
    public ListApplicationsResult listApplications(
            ListApplicationsRequest listApplicationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationsRequest> request = null;
        Response<ListApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListApplicationsResult> responseHandler = new JsonResponseHandler<ListApplicationsResult>(
                    new ListApplicationsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * Lists the deployment configurations with the applicable IAM user or AWS
     * account.
     * </p>
     * 
     * @param listDeploymentConfigsRequest
     *        Represents the input of a list deployment configurations
     *        operation.
     * @return Result of the ListDeploymentConfigs operation returned by the
     *         service.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListDeploymentConfigs
     */
    @Override
    public ListDeploymentConfigsResult listDeploymentConfigs(
            ListDeploymentConfigsRequest listDeploymentConfigsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDeploymentConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentConfigsRequest> request = null;
        Response<ListDeploymentConfigsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentConfigsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listDeploymentConfigsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListDeploymentConfigsResult> responseHandler = new JsonResponseHandler<ListDeploymentConfigsResult>(
                    new ListDeploymentConfigsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * Lists the deployment groups for an application registered with the
     * applicable IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentGroupsRequest
     *        Represents the input of a list deployment groups operation.
     * @return Result of the ListDeploymentGroups operation returned by the
     *         service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not
     *         specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or
     *         AWS account.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListDeploymentGroups
     */
    @Override
    public ListDeploymentGroupsResult listDeploymentGroups(
            ListDeploymentGroupsRequest listDeploymentGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDeploymentGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentGroupsRequest> request = null;
        Response<ListDeploymentGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentGroupsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listDeploymentGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListDeploymentGroupsResult> responseHandler = new JsonResponseHandler<ListDeploymentGroupsResult>(
                    new ListDeploymentGroupsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the instances for a deployment associated with the applicable IAM
     * user or AWS account.
     * </p>
     * 
     * @param listDeploymentInstancesRequest
     *        Represents the input of a list deployment instances operation.
     * @return Result of the ListDeploymentInstances operation returned by the
     *         service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment does not exist with the applicable IAM user or AWS
     *         account.
     * @throws DeploymentNotStartedException
     *         The specified deployment has not started.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid
     *         format.
     * @throws InvalidInstanceStatusException
     *         The specified instance status does not exist.
     * @sample AmazonCodeDeploy.ListDeploymentInstances
     */
    @Override
    public ListDeploymentInstancesResult listDeploymentInstances(
            ListDeploymentInstancesRequest listDeploymentInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(listDeploymentInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentInstancesRequest> request = null;
        Response<ListDeploymentInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentInstancesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listDeploymentInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListDeploymentInstancesResult> responseHandler = new JsonResponseHandler<ListDeploymentInstancesResult>(
                    new ListDeploymentInstancesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the deployments within a deployment group for an application
     * registered with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentsRequest
     *        Represents the input of a list deployments operation.
     * @return Result of the ListDeployments operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not
     *         specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or
     *         AWS account.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws DeploymentGroupDoesNotExistException
     *         The named deployment group does not exist with the applicable IAM
     *         user or AWS account.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws InvalidTimeRangeException
     *         The specified time range was specified in an invalid format.
     * @throws InvalidDeploymentStatusException
     *         The specified deployment status doesn't exist or cannot be
     *         determined.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListDeployments
     */
    @Override
    public ListDeploymentsResult listDeployments(
            ListDeploymentsRequest listDeploymentsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentsRequest> request = null;
        Response<ListDeploymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentsRequestMarshaller().marshall(super
                        .beforeMarshalling(listDeploymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListDeploymentsResult> responseHandler = new JsonResponseHandler<ListDeploymentsResult>(
                    new ListDeploymentsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * Gets a list of one or more on-premises instance names.
     * </p>
     * <p>
     * Unless otherwise specified, both registered and deregistered on-premises
     * instance names will be listed. To list only registered or deregistered
     * on-premises instance names, use the registration status parameter.
     * </p>
     * 
     * @param listOnPremisesInstancesRequest
     *        Represents the input of a list on-premises instances operation.
     * @return Result of the ListOnPremisesInstances operation returned by the
     *         service.
     * @throws InvalidRegistrationStatusException
     *         The registration status was specified in an invalid format.
     * @throws InvalidTagFilterException
     *         The specified tag filter was specified in an invalid format.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format.
     * @sample AmazonCodeDeploy.ListOnPremisesInstances
     */
    @Override
    public ListOnPremisesInstancesResult listOnPremisesInstances(
            ListOnPremisesInstancesRequest listOnPremisesInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(listOnPremisesInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOnPremisesInstancesRequest> request = null;
        Response<ListOnPremisesInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOnPremisesInstancesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listOnPremisesInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListOnPremisesInstancesResult> responseHandler = new JsonResponseHandler<ListOnPremisesInstancesResult>(
                    new ListOnPremisesInstancesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * Registers with AWS CodeDeploy a revision for the specified application.
     * </p>
     * 
     * @param registerApplicationRevisionRequest
     *        Represents the input of a register application revision operation.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or
     *         AWS account.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not
     *         specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws DescriptionTooLongException
     *         The description that was provided is too long.
     * @throws RevisionRequiredException
     *         The revision ID was not specified.
     * @throws InvalidRevisionException
     *         The revision was specified in an invalid format.
     * @sample AmazonCodeDeploy.RegisterApplicationRevision
     */
    @Override
    public void registerApplicationRevision(
            RegisterApplicationRevisionRequest registerApplicationRevisionRequest) {
        ExecutionContext executionContext = createExecutionContext(registerApplicationRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterApplicationRevisionRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterApplicationRevisionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(registerApplicationRevisionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers an on-premises instance.
     * </p>
     * 
     * @param registerOnPremisesInstanceRequest
     *        Represents the input of register on-premises instance operation.
     * @throws InstanceNameAlreadyRegisteredException
     *         The specified on-premises instance name is already registered.
     * @throws IamUserArnAlreadyRegisteredException
     *         The specified IAM user ARN is already registered with an
     *         on-premises instance.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws IamUserArnRequiredException
     *         An IAM user ARN was not specified.
     * @throws InvalidInstanceNameException
     *         The specified on-premises instance name was specified in an
     *         invalid format.
     * @throws InvalidIamUserArnException
     *         The IAM user ARN was specified in an invalid format.
     * @sample AmazonCodeDeploy.RegisterOnPremisesInstance
     */
    @Override
    public void registerOnPremisesInstance(
            RegisterOnPremisesInstanceRequest registerOnPremisesInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(registerOnPremisesInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterOnPremisesInstanceRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterOnPremisesInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(registerOnPremisesInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     *        Represents the input of a remove tags from on-premises instances
     *        operation.
     * @throws InstanceNameRequiredException
     *         An on-premises instance name was not specified.
     * @throws TagRequiredException
     *         A tag was not specified.
     * @throws InvalidTagException
     *         The specified tag was specified in an invalid format.
     * @throws TagLimitExceededException
     *         The maximum allowed number of tags was exceeded.
     * @throws InstanceLimitExceededException
     *         The maximum number of allowed on-premises instances was exceeded.
     * @throws InstanceNotRegisteredException
     *         The specified on-premises instance is not registered.
     * @sample AmazonCodeDeploy.RemoveTagsFromOnPremisesInstances
     */
    @Override
    public void removeTagsFromOnPremisesInstances(
            RemoveTagsFromOnPremisesInstancesRequest removeTagsFromOnPremisesInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(removeTagsFromOnPremisesInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromOnPremisesInstancesRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromOnPremisesInstancesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(removeTagsFromOnPremisesInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     *        Represents the input of a stop deployment operation.
     * @return Result of the StopDeployment operation returned by the service.
     * @throws DeploymentIdRequiredException
     *         At least one deployment ID must be specified.
     * @throws DeploymentDoesNotExistException
     *         The deployment does not exist with the applicable IAM user or AWS
     *         account.
     * @throws DeploymentAlreadyCompletedException
     *         The deployment is already completed.
     * @throws InvalidDeploymentIdException
     *         At least one of the deployment IDs was specified in an invalid
     *         format.
     * @sample AmazonCodeDeploy.StopDeployment
     */
    @Override
    public StopDeploymentResult stopDeployment(
            StopDeploymentRequest stopDeploymentRequest) {
        ExecutionContext executionContext = createExecutionContext(stopDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDeploymentRequest> request = null;
        Response<StopDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopDeploymentRequestMarshaller().marshall(super
                        .beforeMarshalling(stopDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<StopDeploymentResult> responseHandler = new JsonResponseHandler<StopDeploymentResult>(
                    new StopDeploymentResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes an existing application's name.
     * </p>
     * 
     * @param updateApplicationRequest
     *        Represents the input of an update application operation.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not
     *         specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationAlreadyExistsException
     *         An application with the specified name already exists with the
     *         applicable IAM user or AWS account.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or
     *         AWS account.
     * @sample AmazonCodeDeploy.UpdateApplication
     */
    @Override
    public void updateApplication(
            UpdateApplicationRequest updateApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public void updateApplication() {
        updateApplication(new UpdateApplicationRequest());
    }

    /**
     * <p>
     * Changes information about an existing deployment group.
     * </p>
     * 
     * @param updateDeploymentGroupRequest
     *        Represents the input of an update deployment group operation.
     * @return Result of the UpdateDeploymentGroup operation returned by the
     *         service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not
     *         specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @throws ApplicationDoesNotExistException
     *         The application does not exist with the applicable IAM user or
     *         AWS account.
     * @throws InvalidDeploymentGroupNameException
     *         The deployment group name was specified in an invalid format.
     * @throws DeploymentGroupAlreadyExistsException
     *         A deployment group with the specified name already exists with
     *         the applicable IAM user or AWS account.
     * @throws DeploymentGroupNameRequiredException
     *         The deployment group name was not specified.
     * @throws DeploymentGroupDoesNotExistException
     *         The named deployment group does not exist with the applicable IAM
     *         user or AWS account.
     * @throws InvalidEC2TagException
     *         The tag was specified in an invalid format.
     * @throws InvalidTagException
     *         The specified tag was specified in an invalid format.
     * @throws InvalidAutoScalingGroupException
     *         The Auto Scaling group was specified in an invalid format or does
     *         not exist.
     * @throws InvalidDeploymentConfigNameException
     *         The deployment configuration name was specified in an invalid
     *         format.
     * @throws DeploymentConfigDoesNotExistException
     *         The deployment configuration does not exist with the applicable
     *         IAM user or AWS account.
     * @throws InvalidRoleException
     *         The service role ARN was specified in an invalid format. Or, if
     *         an Auto Scaling group was specified, the specified service role
     *         does not grant the appropriate permissions to Auto Scaling.
     * @sample AmazonCodeDeploy.UpdateDeploymentGroup
     */
    @Override
    public UpdateDeploymentGroupResult updateDeploymentGroup(
            UpdateDeploymentGroupRequest updateDeploymentGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeploymentGroupRequest> request = null;
        Response<UpdateDeploymentGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeploymentGroupRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateDeploymentGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateDeploymentGroupResult> responseHandler = new JsonResponseHandler<UpdateDeploymentGroupResult>(
                    new UpdateDeploymentGroupResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}

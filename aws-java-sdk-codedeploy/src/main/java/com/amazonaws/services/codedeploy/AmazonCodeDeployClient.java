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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.auth.presign.PresignerParams;
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
@ThreadSafe
public class AmazonCodeDeployClient extends AmazonWebServiceClient implements AmazonCodeDeploy {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCodeDeploy.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "codedeploy";

    private volatile AmazonCodeDeployWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
            .withProtocolVersion("1.1")
            .withSupportsCbor(false)
            .withSupportsIon(false)
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("BatchLimitExceededException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.BatchLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ApplicationDoesNotExistException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.ApplicationDoesNotExistException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("TagRequiredException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.TagRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidOperationException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidOperationException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("BucketNameFilterRequiredException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.BucketNameFilterRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidIamUserArnException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidIamUserArnException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidTriggerConfigException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidTriggerConfigException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("DeploymentConfigDoesNotExistException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.DeploymentConfigDoesNotExistException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidKeyPrefixFilterException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidKeyPrefixFilterException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ApplicationNameRequiredException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidBucketNameFilterException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidBucketNameFilterException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidAutoRollbackConfigException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidAutoRollbackConfigException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("RoleRequiredException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.RoleRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("DeploymentLimitExceededException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.DeploymentLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidTagFilterException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidTagFilterException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("DeploymentNotStartedException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.DeploymentNotStartedException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("DeploymentGroupAlreadyExistsException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.DeploymentGroupAlreadyExistsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InstanceNameRequiredException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InstanceNameRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("DeploymentAlreadyCompletedException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.DeploymentAlreadyCompletedException.class))
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
                    new JsonErrorShapeMetadata().withErrorCode("DeploymentGroupLimitExceededException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.DeploymentGroupLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidDeploymentGroupNameException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidDeploymentGroupNameException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidDeploymentIdException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidDeploymentIdException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("AlarmsLimitExceededException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.AlarmsLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidDeploymentStatusException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidDeploymentStatusException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidNextTokenException.class))
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
                    new JsonErrorShapeMetadata().withErrorCode("TriggerTargetsLimitExceededException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.TriggerTargetsLimitExceededException.class))
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
                    new JsonErrorShapeMetadata().withErrorCode("InstanceNotRegisteredException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InstanceNotRegisteredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidTimeRangeException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidTimeRangeException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ApplicationAlreadyExistsException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.ApplicationAlreadyExistsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidDeployedStateFilterException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidDeployedStateFilterException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidSortByException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidSortByException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InstanceDoesNotExistException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InstanceDoesNotExistException.class))
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
                    new JsonErrorShapeMetadata().withErrorCode("InvalidAlarmConfigException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidAlarmConfigException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("DescriptionTooLongException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.DescriptionTooLongException.class))
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
                    new JsonErrorShapeMetadata().withErrorCode("InvalidInstanceStatusException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidInstanceStatusException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InstanceLimitExceededException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InstanceLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("DeploymentIdRequiredException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InstanceIdRequiredException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InstanceIdRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("DeploymentConfigNameRequiredException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.DeploymentConfigNameRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ApplicationLimitExceededException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.ApplicationLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidRegistrationStatusException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidRegistrationStatusException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("TagLimitExceededException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.TagLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("DeploymentGroupDoesNotExistException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.DeploymentGroupDoesNotExistException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidAutoScalingGroupException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidAutoScalingGroupException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidMinimumHealthyHostValueException").withModeledClass(
                            com.amazonaws.services.codedeploy.model.InvalidMinimumHealthyHostValueException.class))
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
     */
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
     */
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
     */
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
     */
    public AmazonCodeDeployClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
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
     */
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
     */
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
     */
    public AmazonCodeDeployClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
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
    @Override
    public AddTagsToOnPremisesInstancesResult addTagsToOnPremisesInstances(AddTagsToOnPremisesInstancesRequest addTagsToOnPremisesInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(addTagsToOnPremisesInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToOnPremisesInstancesRequest> request = null;
        Response<AddTagsToOnPremisesInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToOnPremisesInstancesRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(addTagsToOnPremisesInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public BatchGetApplicationRevisionsResult batchGetApplicationRevisions(BatchGetApplicationRevisionsRequest batchGetApplicationRevisionsRequest) {
        ExecutionContext executionContext = createExecutionContext(batchGetApplicationRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetApplicationRevisionsRequest> request = null;
        Response<BatchGetApplicationRevisionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetApplicationRevisionsRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetApplicationRevisionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public BatchGetApplicationsResult batchGetApplications(BatchGetApplicationsRequest batchGetApplicationsRequest) {
        ExecutionContext executionContext = createExecutionContext(batchGetApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetApplicationsRequest> request = null;
        Response<BatchGetApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetApplicationsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public BatchGetDeploymentGroupsResult batchGetDeploymentGroups(BatchGetDeploymentGroupsRequest batchGetDeploymentGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(batchGetDeploymentGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDeploymentGroupsRequest> request = null;
        Response<BatchGetDeploymentGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDeploymentGroupsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetDeploymentGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public BatchGetDeploymentInstancesResult batchGetDeploymentInstances(BatchGetDeploymentInstancesRequest batchGetDeploymentInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(batchGetDeploymentInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDeploymentInstancesRequest> request = null;
        Response<BatchGetDeploymentInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDeploymentInstancesRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetDeploymentInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public BatchGetDeploymentsResult batchGetDeployments(BatchGetDeploymentsRequest batchGetDeploymentsRequest) {
        ExecutionContext executionContext = createExecutionContext(batchGetDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDeploymentsRequest> request = null;
        Response<BatchGetDeploymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDeploymentsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetDeploymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public BatchGetOnPremisesInstancesResult batchGetOnPremisesInstances(BatchGetOnPremisesInstancesRequest batchGetOnPremisesInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(batchGetOnPremisesInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetOnPremisesInstancesRequest> request = null;
        Response<BatchGetOnPremisesInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetOnPremisesInstancesRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetOnPremisesInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest) {
        ExecutionContext executionContext = createExecutionContext(createDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentRequest> request = null;
        Response<CreateDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public CreateDeploymentConfigResult createDeploymentConfig(CreateDeploymentConfigRequest createDeploymentConfigRequest) {
        ExecutionContext executionContext = createExecutionContext(createDeploymentConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentConfigRequest> request = null;
        Response<CreateDeploymentConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentConfigRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeploymentConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public CreateDeploymentGroupResult createDeploymentGroup(CreateDeploymentGroupRequest createDeploymentGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentGroupRequest> request = null;
        Response<CreateDeploymentGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentGroupRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeploymentGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *        Represents the input of a delete application operation.
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ApplicationNameRequiredException
     *         The minimum number of required application names was not specified.
     * @throws InvalidApplicationNameException
     *         The application name was specified in an invalid format.
     * @sample AmazonCodeDeploy.DeleteApplication
     */
    @Override
    public DeleteApplicationResult deleteApplication(DeleteApplicationRequest deleteApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        Response<DeleteApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public DeleteDeploymentConfigResult deleteDeploymentConfig(DeleteDeploymentConfigRequest deleteDeploymentConfigRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDeploymentConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeploymentConfigRequest> request = null;
        Response<DeleteDeploymentConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeploymentConfigRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDeploymentConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public DeleteDeploymentGroupResult deleteDeploymentGroup(DeleteDeploymentGroupRequest deleteDeploymentGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeploymentGroupRequest> request = null;
        Response<DeleteDeploymentGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeploymentGroupRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDeploymentGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public DeregisterOnPremisesInstanceResult deregisterOnPremisesInstance(DeregisterOnPremisesInstanceRequest deregisterOnPremisesInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(deregisterOnPremisesInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterOnPremisesInstanceRequest> request = null;
        Response<DeregisterOnPremisesInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterOnPremisesInstanceRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterOnPremisesInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(getApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationRequest> request = null;
        Response<GetApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public GetApplicationRevisionResult getApplicationRevision(GetApplicationRevisionRequest getApplicationRevisionRequest) {
        ExecutionContext executionContext = createExecutionContext(getApplicationRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationRevisionRequest> request = null;
        Response<GetApplicationRevisionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationRevisionRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApplicationRevisionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest) {
        ExecutionContext executionContext = createExecutionContext(getDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentRequest> request = null;
        Response<GetDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public GetDeploymentConfigResult getDeploymentConfig(GetDeploymentConfigRequest getDeploymentConfigRequest) {
        ExecutionContext executionContext = createExecutionContext(getDeploymentConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentConfigRequest> request = null;
        Response<GetDeploymentConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentConfigRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeploymentConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public GetDeploymentGroupResult getDeploymentGroup(GetDeploymentGroupRequest getDeploymentGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(getDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentGroupRequest> request = null;
        Response<GetDeploymentGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentGroupRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeploymentGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public GetDeploymentInstanceResult getDeploymentInstance(GetDeploymentInstanceRequest getDeploymentInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(getDeploymentInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentInstanceRequest> request = null;
        Response<GetDeploymentInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentInstanceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeploymentInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public GetOnPremisesInstanceResult getOnPremisesInstance(GetOnPremisesInstanceRequest getOnPremisesInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(getOnPremisesInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOnPremisesInstanceRequest> request = null;
        Response<GetOnPremisesInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOnPremisesInstanceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOnPremisesInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public ListApplicationRevisionsResult listApplicationRevisions(ListApplicationRevisionsRequest listApplicationRevisionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listApplicationRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationRevisionsRequest> request = null;
        Response<ListApplicationRevisionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationRevisionsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listApplicationRevisionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationsRequest> request = null;
        Response<ListApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public ListDeploymentConfigsResult listDeploymentConfigs(ListDeploymentConfigsRequest listDeploymentConfigsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDeploymentConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentConfigsRequest> request = null;
        Response<ListDeploymentConfigsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentConfigsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeploymentConfigsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public ListDeploymentGroupsResult listDeploymentGroups(ListDeploymentGroupsRequest listDeploymentGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDeploymentGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentGroupsRequest> request = null;
        Response<ListDeploymentGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentGroupsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeploymentGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public ListDeploymentInstancesResult listDeploymentInstances(ListDeploymentInstancesRequest listDeploymentInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(listDeploymentInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentInstancesRequest> request = null;
        Response<ListDeploymentInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentInstancesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeploymentInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public ListDeploymentsResult listDeployments(ListDeploymentsRequest listDeploymentsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentsRequest> request = null;
        Response<ListDeploymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeploymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public ListOnPremisesInstancesResult listOnPremisesInstances(ListOnPremisesInstancesRequest listOnPremisesInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(listOnPremisesInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOnPremisesInstancesRequest> request = null;
        Response<ListOnPremisesInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOnPremisesInstancesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listOnPremisesInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public RegisterApplicationRevisionResult registerApplicationRevision(RegisterApplicationRevisionRequest registerApplicationRevisionRequest) {
        ExecutionContext executionContext = createExecutionContext(registerApplicationRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterApplicationRevisionRequest> request = null;
        Response<RegisterApplicationRevisionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterApplicationRevisionRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerApplicationRevisionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public RegisterOnPremisesInstanceResult registerOnPremisesInstance(RegisterOnPremisesInstanceRequest registerOnPremisesInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(registerOnPremisesInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterOnPremisesInstanceRequest> request = null;
        Response<RegisterOnPremisesInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterOnPremisesInstanceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerOnPremisesInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public RemoveTagsFromOnPremisesInstancesResult removeTagsFromOnPremisesInstances(
            RemoveTagsFromOnPremisesInstancesRequest removeTagsFromOnPremisesInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(removeTagsFromOnPremisesInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromOnPremisesInstancesRequest> request = null;
        Response<RemoveTagsFromOnPremisesInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromOnPremisesInstancesRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeTagsFromOnPremisesInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public StopDeploymentResult stopDeployment(StopDeploymentRequest stopDeploymentRequest) {
        ExecutionContext executionContext = createExecutionContext(stopDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDeploymentRequest> request = null;
        Response<StopDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopDeploymentRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<UpdateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public UpdateDeploymentGroupResult updateDeploymentGroup(UpdateDeploymentGroupRequest updateDeploymentGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeploymentGroupRequest> request = null;
        Response<UpdateDeploymentGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeploymentGroupRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDeploymentGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
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

}

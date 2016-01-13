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
package com.amazonaws.services.opsworks;

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

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.services.opsworks.model.transform.*;

/**
 * Client for accessing AWS OpsWorks. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS OpsWorks</fullname>
 * <p>
 * Welcome to the <i>AWS OpsWorks API Reference</i>. This guide provides
 * descriptions, syntax, and usage examples about AWS OpsWorks actions and data
 * types, including common parameters and error codes.
 * </p>
 * <p>
 * AWS OpsWorks is an application management service that provides an integrated
 * experience for overseeing the complete application lifecycle. For information
 * about this product, go to the <a href="http://aws.amazon.com/opsworks/">AWS
 * OpsWorks</a> details page.
 * </p>
 * <p>
 * <b>SDKs and CLI</b>
 * </p>
 * <p>
 * The most common way to use the AWS OpsWorks API is by using the AWS Command
 * Line Interface (CLI) or by using one of the AWS SDKs to implement
 * applications in your preferred language. For more information, see:
 * </p>
 * <ul>
 * <li><a href=
 * "http://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html">AWS
 * CLI</a></li>
 * <li><a href=
 * "http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/opsworks/AWSOpsWorksClient.html"
 * >AWS SDK for Java</a></li>
 * <li><a href=
 * "http://docs.aws.amazon.com/sdkfornet/latest/apidocs/html/N_Amazon_OpsWorks.htm"
 * >AWS SDK for .NET</a></li>
 * <li><a href=
 * "http://docs.aws.amazon.com/aws-sdk-php-2/latest/class-Aws.OpsWorks.OpsWorksClient.html"
 * >AWS SDK for PHP 2</a></li>
 * <li><a href=
 * "http://docs.aws.amazon.com/AWSRubySDK/latest/AWS/OpsWorks/Client.html">AWS
 * SDK for Ruby</a></li>
 * <li><a href="http://aws.amazon.com/documentation/sdkforjavascript/">AWS SDK
 * for Node.js</a></li>
 * <li><a href="http://docs.pythonboto.org/en/latest/ref/opsworks.html">AWS SDK
 * for Python(Boto)</a></li>
 * </ul>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS OpsWorks supports only one endpoint, opsworks.us-east-1.amazonaws.com
 * (HTTPS), so you must connect to that endpoint. You can then use the API to
 * direct AWS OpsWorks to create stacks in any AWS Region.
 * </p>
 * <p>
 * <b>Chef Versions</b>
 * </p>
 * <p>
 * When you call <a>CreateStack</a>, <a>CloneStack</a>, or <a>UpdateStack</a> we
 * recommend you use the <code>ConfigurationManager</code> parameter to specify
 * the Chef version. The recommended value for Linux stacks, which is also the
 * default value, is currently 11.10. Windows stacks use Chef 12.2. For more
 * information, see <a href=
 * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-chef11.html"
 * >Chef Versions</a>.
 * </p>
 * <note>You can also specify Chef 11.4 or Chef 0.9 for your Linux stack.
 * However, Chef 0.9 has been deprecated. We do not recommend using Chef 0.9 for
 * new stacks, and we recommend migrating your existing Chef 0.9 stacks to Chef
 * 11.10 as soon as possible.</note>
 */
public class AWSOpsWorksClient extends AmazonWebServiceClient implements
        AWSOpsWorks {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSOpsWorks.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "opsworks";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "opsworks";

    /**
     * List of exception unmarshallers for all AWS OpsWorks exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on AWS OpsWorks. A
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
    public AWSOpsWorksClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS OpsWorks. A
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
     *        connects to AWS OpsWorks (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSOpsWorksClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS OpsWorks using
     * the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AWSOpsWorksClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS OpsWorks using
     * the specified AWS account credentials and client configuration options.
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
     *        connects to AWS OpsWorks (ex: proxy settings, retry counts, etc.).
     */
    public AWSOpsWorksClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS OpsWorks using
     * the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AWSOpsWorksClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS OpsWorks using
     * the specified AWS account credentials provider and client configuration
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
     *        connects to AWS OpsWorks (ex: proxy settings, retry counts, etc.).
     */
    public AWSOpsWorksClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS OpsWorks using
     * the specified AWS account credentials provider, client configuration
     * options, and request metric collector.
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
     *        connects to AWS OpsWorks (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSOpsWorksClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.opsworks.model.ValidationException.class,
                        "ValidationException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.opsworks.model.ResourceNotFoundException.class,
                        "ResourceNotFoundException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://opsworks.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/opsworks/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/opsworks/request.handler2s"));
    }

    /**
     * <p>
     * Assign a registered instance to a layer.
     * </p>
     * <ul>
     * <li>You can assign registered on-premises instances to any layer type.</li>
     * <li>You can assign registered Amazon EC2 instances only to custom layers.
     * </li>
     * <li>You cannot use this action with instances that were created with AWS
     * OpsWorks.</li>
     * </ul>
     * <p>
     * <b>Required Permissions</b>: To use this action, an AWS Identity and
     * Access Management (IAM) user must have a Manage permissions level for the
     * stack or an attached policy that explicitly grants permissions. For more
     * information on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param assignInstanceRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.AssignInstance
     */
    @Override
    public void assignInstance(AssignInstanceRequest assignInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(assignInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssignInstanceRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssignInstanceRequestMarshaller().marshall(super
                        .beforeMarshalling(assignInstanceRequest));
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
     * Assigns one of the stack's registered Amazon EBS volumes to a specified
     * instance. The volume must first be registered with the stack by calling
     * <a>RegisterVolume</a>. After you register the volume, you must call
     * <a>UpdateVolume</a> to specify a mount point before calling
     * <code>AssignVolume</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param assignVolumeRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.AssignVolume
     */
    @Override
    public void assignVolume(AssignVolumeRequest assignVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(assignVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssignVolumeRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssignVolumeRequestMarshaller().marshall(super
                        .beforeMarshalling(assignVolumeRequest));
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
     * Associates one of the stack's registered Elastic IP addresses with a
     * specified instance. The address must first be registered with the stack
     * by calling <a>RegisterElasticIp</a>. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param associateElasticIpRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.AssociateElasticIp
     */
    @Override
    public void associateElasticIp(
            AssociateElasticIpRequest associateElasticIpRequest) {
        ExecutionContext executionContext = createExecutionContext(associateElasticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateElasticIpRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateElasticIpRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(associateElasticIpRequest));
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
     * Attaches an Elastic Load Balancing load balancer to a specified layer.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/load-balancer-elb.html"
     * >Elastic Load Balancing</a>.
     * </p>
     * <note>
     * <p>
     * You must create the Elastic Load Balancing instance separately, by using
     * the Elastic Load Balancing console, API, or CLI. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/Welcome.html"
     * > Elastic Load Balancing Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param attachElasticLoadBalancerRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.AttachElasticLoadBalancer
     */
    @Override
    public void attachElasticLoadBalancer(
            AttachElasticLoadBalancerRequest attachElasticLoadBalancerRequest) {
        ExecutionContext executionContext = createExecutionContext(attachElasticLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachElasticLoadBalancerRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachElasticLoadBalancerRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(attachElasticLoadBalancerRequest));
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
     * Creates a clone of a specified stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-cloning.html"
     * >Clone a Stack</a>. By default, all parameters are set to the values used
     * by the parent stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param cloneStackRequest
     * @return Result of the CloneStack operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.CloneStack
     */
    @Override
    public CloneStackResult cloneStack(CloneStackRequest cloneStackRequest) {
        ExecutionContext executionContext = createExecutionContext(cloneStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CloneStackRequest> request = null;
        Response<CloneStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CloneStackRequestMarshaller().marshall(super
                        .beforeMarshalling(cloneStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CloneStackResult> responseHandler = new JsonResponseHandler<CloneStackResult>(
                    new CloneStackResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an app for a specified stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html"
     * >Creating Apps</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createAppRequest
     * @return Result of the CreateApp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.CreateApp
     */
    @Override
    public CreateAppResult createApp(CreateAppRequest createAppRequest) {
        ExecutionContext executionContext = createExecutionContext(createAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppRequest> request = null;
        Response<CreateAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppRequestMarshaller().marshall(super
                        .beforeMarshalling(createAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateAppResult> responseHandler = new JsonResponseHandler<CreateAppResult>(
                    new CreateAppResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Runs deployment or stack commands. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-deploying.html"
     * >Deploying Apps</a> and <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-commands.html"
     * >Run Stack Commands</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Deploy or Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createDeploymentRequest
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.CreateDeployment
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
     * Creates an instance in a specified stack. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"
     * >Adding an Instance to a Layer</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createInstanceRequest
     * @return Result of the CreateInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.CreateInstance
     */
    @Override
    public CreateInstanceResult createInstance(
            CreateInstanceRequest createInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(createInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstanceRequest> request = null;
        Response<CreateInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstanceRequestMarshaller().marshall(super
                        .beforeMarshalling(createInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateInstanceResult> responseHandler = new JsonResponseHandler<CreateInstanceResult>(
                    new CreateInstanceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a layer. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-create.html"
     * >How to Create a Layer</a>.
     * </p>
     * <note>
     * <p>
     * You should use <b>CreateLayer</b> for noncustom layer types such as PHP
     * App Server only if the stack does not have an existing layer of that
     * type. A stack can have at most one instance of each noncustom layer; if
     * you attempt to create a second instance, <b>CreateLayer</b> fails. A
     * stack can have an arbitrary number of custom layers, so you can call
     * <b>CreateLayer</b> as many times as you like for that layer type.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createLayerRequest
     * @return Result of the CreateLayer operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.CreateLayer
     */
    @Override
    public CreateLayerResult createLayer(CreateLayerRequest createLayerRequest) {
        ExecutionContext executionContext = createExecutionContext(createLayerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLayerRequest> request = null;
        Response<CreateLayerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLayerRequestMarshaller().marshall(super
                        .beforeMarshalling(createLayerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateLayerResult> responseHandler = new JsonResponseHandler<CreateLayerResult>(
                    new CreateLayerResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-edit.html"
     * >Create a New Stack</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createStackRequest
     * @return Result of the CreateStack operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @sample AWSOpsWorks.CreateStack
     */
    @Override
    public CreateStackResult createStack(CreateStackRequest createStackRequest) {
        ExecutionContext executionContext = createExecutionContext(createStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStackRequest> request = null;
        Response<CreateStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStackRequestMarshaller().marshall(super
                        .beforeMarshalling(createStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateStackResult> responseHandler = new JsonResponseHandler<CreateStackResult>(
                    new CreateStackResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createUserProfileRequest
     * @return Result of the CreateUserProfile operation returned by the
     *         service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @sample AWSOpsWorks.CreateUserProfile
     */
    @Override
    public CreateUserProfileResult createUserProfile(
            CreateUserProfileRequest createUserProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(createUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserProfileRequest> request = null;
        Response<CreateUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserProfileRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateUserProfileResult> responseHandler = new JsonResponseHandler<CreateUserProfileResult>(
                    new CreateUserProfileResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deleteAppRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeleteApp
     */
    @Override
    public void deleteApp(DeleteAppRequest deleteAppRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteAppRequest));
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
     * Deletes a specified instance, which terminates the associated Amazon EC2
     * instance. You must stop an instance before you can delete it.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-delete.html"
     * >Deleting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeleteInstance
     */
    @Override
    public void deleteInstance(DeleteInstanceRequest deleteInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInstanceRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteInstanceRequest));
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
     * Deletes a specified layer. You must first stop and then delete all
     * associated instances or unassign registered instances. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-delete.html"
     * >How to Delete a Layer</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deleteLayerRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeleteLayer
     */
    @Override
    public void deleteLayer(DeleteLayerRequest deleteLayerRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteLayerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLayerRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLayerRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteLayerRequest));
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
     * Deletes a specified stack. You must first delete all instances, layers,
     * and apps or deregister registered instances. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-shutting.html"
     * >Shut Down a Stack</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deleteStackRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeleteStack
     */
    @Override
    public void deleteStack(DeleteStackRequest deleteStackRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStackRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStackRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteStackRequest));
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
     * Deletes a user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeleteUserProfile
     */
    @Override
    public void deleteUserProfile(
            DeleteUserProfileRequest deleteUserProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserProfileRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserProfileRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteUserProfileRequest));
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
     * Deregisters a specified Amazon ECS cluster from a stack. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-ecscluster.html#workinglayers-ecscluster-delete"
     * > Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * />.
     * </p>
     * 
     * @param deregisterEcsClusterRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeregisterEcsCluster
     */
    @Override
    public void deregisterEcsCluster(
            DeregisterEcsClusterRequest deregisterEcsClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(deregisterEcsClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterEcsClusterRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterEcsClusterRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deregisterEcsClusterRequest));
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
     * Deregisters a specified Elastic IP address. The address can then be
     * registered by another stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deregisterElasticIpRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeregisterElasticIp
     */
    @Override
    public void deregisterElasticIp(
            DeregisterElasticIpRequest deregisterElasticIpRequest) {
        ExecutionContext executionContext = createExecutionContext(deregisterElasticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterElasticIpRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterElasticIpRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deregisterElasticIpRequest));
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
     * Deregister a registered Amazon EC2 or on-premises instance. This action
     * removes the instance from the stack and returns it to your control. This
     * action can not be used with instances that were created with AWS
     * OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deregisterInstanceRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeregisterInstance
     */
    @Override
    public void deregisterInstance(
            DeregisterInstanceRequest deregisterInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(deregisterInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterInstanceRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deregisterInstanceRequest));
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
     * Deregisters an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deregisterRdsDbInstanceRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeregisterRdsDbInstance
     */
    @Override
    public void deregisterRdsDbInstance(
            DeregisterRdsDbInstanceRequest deregisterRdsDbInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(deregisterRdsDbInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterRdsDbInstanceRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterRdsDbInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deregisterRdsDbInstanceRequest));
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
     * Deregisters an Amazon EBS volume. The volume can then be registered by
     * another stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deregisterVolumeRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeregisterVolume
     */
    @Override
    public void deregisterVolume(DeregisterVolumeRequest deregisterVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(deregisterVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterVolumeRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterVolumeRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deregisterVolumeRequest));
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
     * Describes the available AWS OpsWorks agent versions. You must specify a
     * stack ID or a configuration manager. <code>DescribeAgentVersions</code>
     * returns a list of available agent versions for the specified stack or
     * configuration manager.
     * </p>
     * 
     * @param describeAgentVersionsRequest
     * @return Result of the DescribeAgentVersions operation returned by the
     *         service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeAgentVersions
     */
    @Override
    public DescribeAgentVersionsResult describeAgentVersions(
            DescribeAgentVersionsRequest describeAgentVersionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAgentVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAgentVersionsRequest> request = null;
        Response<DescribeAgentVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAgentVersionsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeAgentVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeAgentVersionsResult> responseHandler = new JsonResponseHandler<DescribeAgentVersionsResult>(
                    new DescribeAgentVersionsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests a description of a specified set of apps.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeAppsRequest
     * @return Result of the DescribeApps operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeApps
     */
    @Override
    public DescribeAppsResult describeApps(
            DescribeAppsRequest describeAppsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAppsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppsRequest> request = null;
        Response<DescribeAppsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppsRequestMarshaller().marshall(super
                        .beforeMarshalling(describeAppsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeAppsResult> responseHandler = new JsonResponseHandler<DescribeAppsResult>(
                    new DescribeAppsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the results of specified commands.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeCommandsRequest
     * @return Result of the DescribeCommands operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeCommands
     */
    @Override
    public DescribeCommandsResult describeCommands(
            DescribeCommandsRequest describeCommandsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCommandsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCommandsRequest> request = null;
        Response<DescribeCommandsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCommandsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeCommandsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeCommandsResult> responseHandler = new JsonResponseHandler<DescribeCommandsResult>(
                    new DescribeCommandsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests a description of a specified set of deployments.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeDeploymentsRequest
     * @return Result of the DescribeDeployments operation returned by the
     *         service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeDeployments
     */
    @Override
    public DescribeDeploymentsResult describeDeployments(
            DescribeDeploymentsRequest describeDeploymentsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeploymentsRequest> request = null;
        Response<DescribeDeploymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeploymentsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeDeploymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeDeploymentsResult> responseHandler = new JsonResponseHandler<DescribeDeploymentsResult>(
                    new DescribeDeploymentsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes Amazon ECS clusters that are registered with a stack. If you
     * specify only a stack ID, you can use the <code>MaxResults</code> and
     * <code>NextToken</code> parameters to paginate the response. However, AWS
     * OpsWorks currently supports only one cluster per layer, so the result set
     * has a maximum of one element.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack or an attached
     * policy that explicitly grants permission. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeEcsClustersRequest
     * @return Result of the DescribeEcsClusters operation returned by the
     *         service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeEcsClusters
     */
    @Override
    public DescribeEcsClustersResult describeEcsClusters(
            DescribeEcsClustersRequest describeEcsClustersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEcsClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEcsClustersRequest> request = null;
        Response<DescribeEcsClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEcsClustersRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeEcsClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeEcsClustersResult> responseHandler = new JsonResponseHandler<DescribeEcsClustersResult>(
                    new DescribeEcsClustersResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"
     * >Elastic IP addresses</a>.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeElasticIpsRequest
     * @return Result of the DescribeElasticIps operation returned by the
     *         service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeElasticIps
     */
    @Override
    public DescribeElasticIpsResult describeElasticIps(
            DescribeElasticIpsRequest describeElasticIpsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeElasticIpsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticIpsRequest> request = null;
        Response<DescribeElasticIpsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticIpsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeElasticIpsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeElasticIpsResult> responseHandler = new JsonResponseHandler<DescribeElasticIpsResult>(
                    new DescribeElasticIpsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a stack's Elastic Load Balancing instances.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeElasticLoadBalancersRequest
     * @return Result of the DescribeElasticLoadBalancers operation returned by
     *         the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeElasticLoadBalancers
     */
    @Override
    public DescribeElasticLoadBalancersResult describeElasticLoadBalancers(
            DescribeElasticLoadBalancersRequest describeElasticLoadBalancersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeElasticLoadBalancersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticLoadBalancersRequest> request = null;
        Response<DescribeElasticLoadBalancersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticLoadBalancersRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeElasticLoadBalancersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeElasticLoadBalancersResult> responseHandler = new JsonResponseHandler<DescribeElasticLoadBalancersResult>(
                    new DescribeElasticLoadBalancersResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests a description of a set of instances.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeInstancesRequest
     * @return Result of the DescribeInstances operation returned by the
     *         service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeInstances
     */
    @Override
    public DescribeInstancesResult describeInstances(
            DescribeInstancesRequest describeInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstancesRequest> request = null;
        Response<DescribeInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstancesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeInstancesResult> responseHandler = new JsonResponseHandler<DescribeInstancesResult>(
                    new DescribeInstancesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests a description of one or more layers in a specified stack.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeLayersRequest
     * @return Result of the DescribeLayers operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeLayers
     */
    @Override
    public DescribeLayersResult describeLayers(
            DescribeLayersRequest describeLayersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLayersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLayersRequest> request = null;
        Response<DescribeLayersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLayersRequestMarshaller().marshall(super
                        .beforeMarshalling(describeLayersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeLayersResult> responseHandler = new JsonResponseHandler<DescribeLayersResult>(
                    new DescribeLayersResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes load-based auto scaling configurations for specified layers.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeLoadBasedAutoScalingRequest
     * @return Result of the DescribeLoadBasedAutoScaling operation returned by
     *         the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeLoadBasedAutoScaling
     */
    @Override
    public DescribeLoadBasedAutoScalingResult describeLoadBasedAutoScaling(
            DescribeLoadBasedAutoScalingRequest describeLoadBasedAutoScalingRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLoadBasedAutoScalingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoadBasedAutoScalingRequest> request = null;
        Response<DescribeLoadBasedAutoScalingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoadBasedAutoScalingRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeLoadBasedAutoScalingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeLoadBasedAutoScalingResult> responseHandler = new JsonResponseHandler<DescribeLoadBasedAutoScalingResult>(
                    new DescribeLoadBasedAutoScalingResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a user's SSH information.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have
     * self-management enabled or an attached policy that explicitly grants
     * permissions. For more information on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeMyUserProfileRequest
     * @return Result of the DescribeMyUserProfile operation returned by the
     *         service.
     * @sample AWSOpsWorks.DescribeMyUserProfile
     */
    @Override
    public DescribeMyUserProfileResult describeMyUserProfile(
            DescribeMyUserProfileRequest describeMyUserProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(describeMyUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMyUserProfileRequest> request = null;
        Response<DescribeMyUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMyUserProfileRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeMyUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeMyUserProfileResult> responseHandler = new JsonResponseHandler<DescribeMyUserProfileResult>(
                    new DescribeMyUserProfileResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the permissions for a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describePermissionsRequest
     * @return Result of the DescribePermissions operation returned by the
     *         service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribePermissions
     */
    @Override
    public DescribePermissionsResult describePermissions(
            DescribePermissionsRequest describePermissionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePermissionsRequest> request = null;
        Response<DescribePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePermissionsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribePermissionsResult> responseHandler = new JsonResponseHandler<DescribePermissionsResult>(
                    new DescribePermissionsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe an instance's RAID arrays.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeRaidArraysRequest
     * @return Result of the DescribeRaidArrays operation returned by the
     *         service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeRaidArrays
     */
    @Override
    public DescribeRaidArraysResult describeRaidArrays(
            DescribeRaidArraysRequest describeRaidArraysRequest) {
        ExecutionContext executionContext = createExecutionContext(describeRaidArraysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRaidArraysRequest> request = null;
        Response<DescribeRaidArraysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRaidArraysRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeRaidArraysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeRaidArraysResult> responseHandler = new JsonResponseHandler<DescribeRaidArraysResult>(
                    new DescribeRaidArraysResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes Amazon RDS instances.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeRdsDbInstancesRequest
     * @return Result of the DescribeRdsDbInstances operation returned by the
     *         service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeRdsDbInstances
     */
    @Override
    public DescribeRdsDbInstancesResult describeRdsDbInstances(
            DescribeRdsDbInstancesRequest describeRdsDbInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeRdsDbInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRdsDbInstancesRequest> request = null;
        Response<DescribeRdsDbInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRdsDbInstancesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeRdsDbInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeRdsDbInstancesResult> responseHandler = new JsonResponseHandler<DescribeRdsDbInstancesResult>(
                    new DescribeRdsDbInstancesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes AWS OpsWorks service errors.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeServiceErrorsRequest
     * @return Result of the DescribeServiceErrors operation returned by the
     *         service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeServiceErrors
     */
    @Override
    public DescribeServiceErrorsResult describeServiceErrors(
            DescribeServiceErrorsRequest describeServiceErrorsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeServiceErrorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServiceErrorsRequest> request = null;
        Response<DescribeServiceErrorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServiceErrorsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeServiceErrorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeServiceErrorsResult> responseHandler = new JsonResponseHandler<DescribeServiceErrorsResult>(
                    new DescribeServiceErrorsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests a description of a stack's provisioning parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeStackProvisioningParametersRequest
     * @return Result of the DescribeStackProvisioningParameters operation
     *         returned by the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeStackProvisioningParameters
     */
    @Override
    public DescribeStackProvisioningParametersResult describeStackProvisioningParameters(
            DescribeStackProvisioningParametersRequest describeStackProvisioningParametersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStackProvisioningParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackProvisioningParametersRequest> request = null;
        Response<DescribeStackProvisioningParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStackProvisioningParametersRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeStackProvisioningParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeStackProvisioningParametersResult> responseHandler = new JsonResponseHandler<DescribeStackProvisioningParametersResult>(
                    new DescribeStackProvisioningParametersResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the number of layers and apps in a specified stack, and the
     * number of instances in each state, such as <code>running_setup</code> or
     * <code>online</code>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeStackSummaryRequest
     * @return Result of the DescribeStackSummary operation returned by the
     *         service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeStackSummary
     */
    @Override
    public DescribeStackSummaryResult describeStackSummary(
            DescribeStackSummaryRequest describeStackSummaryRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStackSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackSummaryRequest> request = null;
        Response<DescribeStackSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStackSummaryRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeStackSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeStackSummaryResult> responseHandler = new JsonResponseHandler<DescribeStackSummaryResult>(
                    new DescribeStackSummaryResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests a description of one or more stacks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeStacksRequest
     * @return Result of the DescribeStacks operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeStacks
     */
    @Override
    public DescribeStacksResult describeStacks(
            DescribeStacksRequest describeStacksRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStacksRequest> request = null;
        Response<DescribeStacksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStacksRequestMarshaller().marshall(super
                        .beforeMarshalling(describeStacksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeStacksResult> responseHandler = new JsonResponseHandler<DescribeStacksResult>(
                    new DescribeStacksResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes time-based auto scaling configurations for specified instances.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeTimeBasedAutoScalingRequest
     * @return Result of the DescribeTimeBasedAutoScaling operation returned by
     *         the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeTimeBasedAutoScaling
     */
    @Override
    public DescribeTimeBasedAutoScalingResult describeTimeBasedAutoScaling(
            DescribeTimeBasedAutoScalingRequest describeTimeBasedAutoScalingRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTimeBasedAutoScalingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTimeBasedAutoScalingRequest> request = null;
        Response<DescribeTimeBasedAutoScalingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTimeBasedAutoScalingRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeTimeBasedAutoScalingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeTimeBasedAutoScalingResult> responseHandler = new JsonResponseHandler<DescribeTimeBasedAutoScalingResult>(
                    new DescribeTimeBasedAutoScalingResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe specified users.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeUserProfilesRequest
     * @return Result of the DescribeUserProfiles operation returned by the
     *         service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeUserProfiles
     */
    @Override
    public DescribeUserProfilesResult describeUserProfiles(
            DescribeUserProfilesRequest describeUserProfilesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeUserProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserProfilesRequest> request = null;
        Response<DescribeUserProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserProfilesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeUserProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeUserProfilesResult> responseHandler = new JsonResponseHandler<DescribeUserProfilesResult>(
                    new DescribeUserProfilesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an instance's Amazon EBS volumes.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeVolumesRequest
     * @return Result of the DescribeVolumes operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeVolumes
     */
    @Override
    public DescribeVolumesResult describeVolumes(
            DescribeVolumesRequest describeVolumesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVolumesRequest> request = null;
        Response<DescribeVolumesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVolumesRequestMarshaller().marshall(super
                        .beforeMarshalling(describeVolumesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeVolumesResult> responseHandler = new JsonResponseHandler<DescribeVolumesResult>(
                    new DescribeVolumesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches a specified Elastic Load Balancing instance from its layer.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param detachElasticLoadBalancerRequest
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DetachElasticLoadBalancer
     */
    @Override
    public void detachElasticLoadBalancer(
            DetachElasticLoadBalancerRequest detachElasticLoadBalancerRequest) {
        ExecutionContext executionContext = createExecutionContext(detachElasticLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachElasticLoadBalancerRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachElasticLoadBalancerRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(detachElasticLoadBalancerRequest));
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
     * Disassociates an Elastic IP address from its instance. The address
     * remains registered with the stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param disassociateElasticIpRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DisassociateElasticIp
     */
    @Override
    public void disassociateElasticIp(
            DisassociateElasticIpRequest disassociateElasticIpRequest) {
        ExecutionContext executionContext = createExecutionContext(disassociateElasticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateElasticIpRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateElasticIpRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(disassociateElasticIpRequest));
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
     * Gets a generated host name for the specified layer, based on the current
     * host name theme.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param getHostnameSuggestionRequest
     * @return Result of the GetHostnameSuggestion operation returned by the
     *         service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.GetHostnameSuggestion
     */
    @Override
    public GetHostnameSuggestionResult getHostnameSuggestion(
            GetHostnameSuggestionRequest getHostnameSuggestionRequest) {
        ExecutionContext executionContext = createExecutionContext(getHostnameSuggestionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetHostnameSuggestionRequest> request = null;
        Response<GetHostnameSuggestionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetHostnameSuggestionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getHostnameSuggestionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetHostnameSuggestionResult> responseHandler = new JsonResponseHandler<GetHostnameSuggestionResult>(
                    new GetHostnameSuggestionResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>This action can be used only with Windows stacks.</note>
     * <p>
     * Grants RDP access to a Windows instance for a specified time period.
     * </p>
     * 
     * @param grantAccessRequest
     * @return Result of the GrantAccess operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.GrantAccess
     */
    @Override
    public GrantAccessResult grantAccess(GrantAccessRequest grantAccessRequest) {
        ExecutionContext executionContext = createExecutionContext(grantAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GrantAccessRequest> request = null;
        Response<GrantAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GrantAccessRequestMarshaller().marshall(super
                        .beforeMarshalling(grantAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GrantAccessResult> responseHandler = new JsonResponseHandler<GrantAccessResult>(
                    new GrantAccessResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reboots a specified instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"
     * >Starting, Stopping, and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param rebootInstanceRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RebootInstance
     */
    @Override
    public void rebootInstance(RebootInstanceRequest rebootInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(rebootInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootInstanceRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootInstanceRequestMarshaller().marshall(super
                        .beforeMarshalling(rebootInstanceRequest));
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
     * Registers a specified Amazon ECS cluster with a stack. You can register
     * only one cluster with a stack. A cluster can be registered with only one
     * stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-ecscluster.html"
     * > Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * > Managing User Permissions</a>.
     * </p>
     * 
     * @param registerEcsClusterRequest
     * @return Result of the RegisterEcsCluster operation returned by the
     *         service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RegisterEcsCluster
     */
    @Override
    public RegisterEcsClusterResult registerEcsCluster(
            RegisterEcsClusterRequest registerEcsClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(registerEcsClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterEcsClusterRequest> request = null;
        Response<RegisterEcsClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterEcsClusterRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(registerEcsClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RegisterEcsClusterResult> responseHandler = new JsonResponseHandler<RegisterEcsClusterResult>(
                    new RegisterEcsClusterResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers an Elastic IP address with a specified stack. An address can be
     * registered with only one stack at a time. If the address is already
     * registered, you must first deregister it by calling
     * <a>DeregisterElasticIp</a>. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param registerElasticIpRequest
     * @return Result of the RegisterElasticIp operation returned by the
     *         service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RegisterElasticIp
     */
    @Override
    public RegisterElasticIpResult registerElasticIp(
            RegisterElasticIpRequest registerElasticIpRequest) {
        ExecutionContext executionContext = createExecutionContext(registerElasticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterElasticIpRequest> request = null;
        Response<RegisterElasticIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterElasticIpRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(registerElasticIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RegisterElasticIpResult> responseHandler = new JsonResponseHandler<RegisterElasticIpResult>(
                    new RegisterElasticIpResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers instances with a specified stack that were created outside of
     * AWS OpsWorks.
     * </p>
     * <note>We do not recommend using this action to register instances. The
     * complete registration operation has two primary steps, installing the AWS
     * OpsWorks agent on the instance and registering the instance with the
     * stack. <code>RegisterInstance</code> handles only the second step. You
     * should instead use the AWS CLI <code>register</code> command, which
     * performs the entire registration operation. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/registered-instances-register.html"
     * > Registering an Instance with an AWS OpsWorks Stack</a>.</note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param registerInstanceRequest
     * @return Result of the RegisterInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RegisterInstance
     */
    @Override
    public RegisterInstanceResult registerInstance(
            RegisterInstanceRequest registerInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(registerInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterInstanceRequest> request = null;
        Response<RegisterInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(registerInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RegisterInstanceResult> responseHandler = new JsonResponseHandler<RegisterInstanceResult>(
                    new RegisterInstanceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers an Amazon RDS instance with a stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param registerRdsDbInstanceRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RegisterRdsDbInstance
     */
    @Override
    public void registerRdsDbInstance(
            RegisterRdsDbInstanceRequest registerRdsDbInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(registerRdsDbInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterRdsDbInstanceRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterRdsDbInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(registerRdsDbInstanceRequest));
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
     * Registers an Amazon EBS volume with a specified stack. A volume can be
     * registered with only one stack at a time. If the volume is already
     * registered, you must first deregister it by calling
     * <a>DeregisterVolume</a>. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param registerVolumeRequest
     * @return Result of the RegisterVolume operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RegisterVolume
     */
    @Override
    public RegisterVolumeResult registerVolume(
            RegisterVolumeRequest registerVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(registerVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterVolumeRequest> request = null;
        Response<RegisterVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterVolumeRequestMarshaller().marshall(super
                        .beforeMarshalling(registerVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RegisterVolumeResult> responseHandler = new JsonResponseHandler<RegisterVolumeResult>(
                    new RegisterVolumeResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specify the load-based auto scaling configuration for a specified layer.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"
     * >Managing Load with Time-based and Load-based Instances</a>.
     * </p>
     * <note>
     * <p>
     * To use load-based auto scaling, you must create a set of load-based auto
     * scaling instances. Load-based auto scaling operates only on the instances
     * from that set, so you must ensure that you have created enough instances
     * to handle the maximum anticipated load.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param setLoadBasedAutoScalingRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.SetLoadBasedAutoScaling
     */
    @Override
    public void setLoadBasedAutoScaling(
            SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest) {
        ExecutionContext executionContext = createExecutionContext(setLoadBasedAutoScalingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetLoadBasedAutoScalingRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetLoadBasedAutoScalingRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(setLoadBasedAutoScalingRequest));
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
     * Specifies a user's permissions. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingsecurity.html"
     * >Security and Permissions</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param setPermissionRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.SetPermission
     */
    @Override
    public void setPermission(SetPermissionRequest setPermissionRequest) {
        ExecutionContext executionContext = createExecutionContext(setPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetPermissionRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetPermissionRequestMarshaller().marshall(super
                        .beforeMarshalling(setPermissionRequest));
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
     * Specify the time-based auto scaling configuration for a specified
     * instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"
     * >Managing Load with Time-based and Load-based Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param setTimeBasedAutoScalingRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.SetTimeBasedAutoScaling
     */
    @Override
    public void setTimeBasedAutoScaling(
            SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest) {
        ExecutionContext executionContext = createExecutionContext(setTimeBasedAutoScalingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetTimeBasedAutoScalingRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetTimeBasedAutoScalingRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(setTimeBasedAutoScalingRequest));
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
     * Starts a specified instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"
     * >Starting, Stopping, and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param startInstanceRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.StartInstance
     */
    @Override
    public void startInstance(StartInstanceRequest startInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(startInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartInstanceRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartInstanceRequestMarshaller().marshall(super
                        .beforeMarshalling(startInstanceRequest));
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
     * Starts a stack's instances.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param startStackRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.StartStack
     */
    @Override
    public void startStack(StartStackRequest startStackRequest) {
        ExecutionContext executionContext = createExecutionContext(startStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartStackRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartStackRequestMarshaller().marshall(super
                        .beforeMarshalling(startStackRequest));
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
     * Stops a specified instance. When you stop a standard instance, the data
     * disappears and must be reinstalled when you restart the instance. You can
     * stop an Amazon EBS-backed instance without losing data. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"
     * >Starting, Stopping, and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param stopInstanceRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.StopInstance
     */
    @Override
    public void stopInstance(StopInstanceRequest stopInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(stopInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopInstanceRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopInstanceRequestMarshaller().marshall(super
                        .beforeMarshalling(stopInstanceRequest));
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
     * Stops a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param stopStackRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.StopStack
     */
    @Override
    public void stopStack(StopStackRequest stopStackRequest) {
        ExecutionContext executionContext = createExecutionContext(stopStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopStackRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopStackRequestMarshaller().marshall(super
                        .beforeMarshalling(stopStackRequest));
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
     * Unassigns a registered instance from all of it's layers. The instance
     * remains in the stack as an unassigned instance and can be assigned to
     * another layer, as needed. You cannot use this action with instances that
     * were created with AWS OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param unassignInstanceRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UnassignInstance
     */
    @Override
    public void unassignInstance(UnassignInstanceRequest unassignInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(unassignInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnassignInstanceRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnassignInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(unassignInstanceRequest));
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
     * Unassigns an assigned Amazon EBS volume. The volume remains registered
     * with the stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param unassignVolumeRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UnassignVolume
     */
    @Override
    public void unassignVolume(UnassignVolumeRequest unassignVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(unassignVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnassignVolumeRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnassignVolumeRequestMarshaller().marshall(super
                        .beforeMarshalling(unassignVolumeRequest));
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
     * Updates a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Deploy or Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateAppRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateApp
     */
    @Override
    public void updateApp(UpdateAppRequest updateAppRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAppRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAppRequestMarshaller().marshall(super
                        .beforeMarshalling(updateAppRequest));
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
     * Updates a registered Elastic IP address's name. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateElasticIpRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateElasticIp
     */
    @Override
    public void updateElasticIp(UpdateElasticIpRequest updateElasticIpRequest) {
        ExecutionContext executionContext = createExecutionContext(updateElasticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateElasticIpRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateElasticIpRequestMarshaller().marshall(super
                        .beforeMarshalling(updateElasticIpRequest));
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
     * Updates a specified instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateInstanceRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateInstance
     */
    @Override
    public void updateInstance(UpdateInstanceRequest updateInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(updateInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInstanceRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInstanceRequestMarshaller().marshall(super
                        .beforeMarshalling(updateInstanceRequest));
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
     * Updates a specified layer.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateLayerRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateLayer
     */
    @Override
    public void updateLayer(UpdateLayerRequest updateLayerRequest) {
        ExecutionContext executionContext = createExecutionContext(updateLayerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLayerRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLayerRequestMarshaller().marshall(super
                        .beforeMarshalling(updateLayerRequest));
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
     * Updates a user's SSH public key.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have
     * self-management enabled or an attached policy that explicitly grants
     * permissions. For more information on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateMyUserProfileRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @sample AWSOpsWorks.UpdateMyUserProfile
     */
    @Override
    public void updateMyUserProfile(
            UpdateMyUserProfileRequest updateMyUserProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(updateMyUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMyUserProfileRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMyUserProfileRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateMyUserProfileRequest));
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
     * Updates an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateRdsDbInstanceRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateRdsDbInstance
     */
    @Override
    public void updateRdsDbInstance(
            UpdateRdsDbInstanceRequest updateRdsDbInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(updateRdsDbInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRdsDbInstanceRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRdsDbInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateRdsDbInstanceRequest));
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
     * Updates a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateStackRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateStack
     */
    @Override
    public void updateStack(UpdateStackRequest updateStackRequest) {
        ExecutionContext executionContext = createExecutionContext(updateStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStackRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStackRequestMarshaller().marshall(super
                        .beforeMarshalling(updateStackRequest));
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
     * Updates a specified user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateUserProfile
     */
    @Override
    public void updateUserProfile(
            UpdateUserProfileRequest updateUserProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(updateUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserProfileRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserProfileRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateUserProfileRequest));
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
     * Updates an Amazon EBS volume's name or mount point. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateVolumeRequest
     * @throws ValidationException
     *         Indicates that a request was invalid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateVolume
     */
    @Override
    public void updateVolume(UpdateVolumeRequest updateVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(updateVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVolumeRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVolumeRequestMarshaller().marshall(super
                        .beforeMarshalling(updateVolumeRequest));
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

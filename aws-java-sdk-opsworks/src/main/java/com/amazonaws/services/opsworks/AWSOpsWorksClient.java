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
package com.amazonaws.services.opsworks;

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

import com.amazonaws.services.opsworks.AWSOpsWorksClientBuilder;
import com.amazonaws.services.opsworks.waiters.AWSOpsWorksWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.services.opsworks.model.transform.*;

/**
 * Client for accessing AWS OpsWorks. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <fullname>AWS OpsWorks</fullname>
 * <p>
 * Welcome to the <i>AWS OpsWorks Stacks API Reference</i>. This guide provides descriptions, syntax, and usage examples
 * for AWS OpsWorks Stacks actions and data types, including common parameters and error codes.
 * </p>
 * <p>
 * AWS OpsWorks Stacks is an application management service that provides an integrated experience for overseeing the
 * complete application lifecycle. For information about this product, go to the <a
 * href="http://aws.amazon.com/opsworks/">AWS OpsWorks</a> details page.
 * </p>
 * <p>
 * <b>SDKs and CLI</b>
 * </p>
 * <p>
 * The most common way to use the AWS OpsWorks Stacks API is by using the AWS Command Line Interface (CLI) or by using
 * one of the AWS SDKs to implement applications in your preferred language. For more information, see:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html">AWS CLI</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/opsworks/AWSOpsWorksClient.html">
 * AWS SDK for Java</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/sdkfornet/latest/apidocs/html/N_Amazon_OpsWorks.htm">AWS SDK for .NET</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/aws-sdk-php-2/latest/class-Aws.OpsWorks.OpsWorksClient.html">AWS SDK for PHP
 * 2</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/sdkforruby/api/">AWS SDK for Ruby</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/documentation/sdkforjavascript/">AWS SDK for Node.js</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.pythonboto.org/en/latest/ref/opsworks.html">AWS SDK for Python(Boto)</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS OpsWorks Stacks supports the following endpoints, all HTTPS. You must connect to one of the following endpoints.
 * Stacks can only be accessed or managed within the endpoint in which they are created.
 * </p>
 * <ul>
 * <li>
 * <p>
 * opsworks.us-east-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.us-east-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.us-west-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.us-west-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ca-central-1.amazonaws.com (API only; not available in the AWS console)
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.eu-west-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.eu-west-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.eu-west-3.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.eu-central-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ap-northeast-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ap-northeast-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ap-south-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ap-southeast-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ap-southeast-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.sa-east-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Chef Versions</b>
 * </p>
 * <p>
 * When you call <a>CreateStack</a>, <a>CloneStack</a>, or <a>UpdateStack</a> we recommend you use the
 * <code>ConfigurationManager</code> parameter to specify the Chef version. The recommended and default value for Linux
 * stacks is currently 12. Windows stacks use Chef 12.2. For more information, see <a
 * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-chef11.html">Chef Versions</a>.
 * </p>
 * <note>
 * <p>
 * You can specify Chef 12, 11.10, or 11.4 for your Linux stack. We recommend migrating your existing Linux stacks to
 * Chef 12 as soon as possible.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSOpsWorksClient extends AmazonWebServiceClient implements AWSOpsWorks {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSOpsWorks.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "opsworks";

    private volatile AWSOpsWorksWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.opsworks.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withModeledClass(
                                    com.amazonaws.services.opsworks.model.ValidationException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.opsworks.model.AWSOpsWorksException.class));

    /**
     * Constructs a new client to invoke service methods on AWS OpsWorks. A credentials provider chain will be used that
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
     * @deprecated use {@link AWSOpsWorksClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSOpsWorksClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS OpsWorks. A credentials provider chain will be used that
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
     *        The client configuration options controlling how this client connects to AWS OpsWorks (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSOpsWorksClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSOpsWorksClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS OpsWorks using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSOpsWorksClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSOpsWorksClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSOpsWorksClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS OpsWorks using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS OpsWorks (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSOpsWorksClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOpsWorksClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSOpsWorksClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS OpsWorks using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSOpsWorksClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSOpsWorksClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS OpsWorks using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS OpsWorks (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSOpsWorksClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOpsWorksClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSOpsWorksClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS OpsWorks using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS OpsWorks (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSOpsWorksClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOpsWorksClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSOpsWorksClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSOpsWorksClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSOpsWorksClientBuilder builder() {
        return AWSOpsWorksClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS OpsWorks using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSOpsWorksClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS OpsWorks using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSOpsWorksClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://opsworks.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/opsworks/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/opsworks/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Assign a registered instance to a layer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can assign registered on-premises instances to any layer type.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can assign registered Amazon EC2 instances only to custom layers.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use this action with instances that were created with AWS OpsWorks Stacks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Required Permissions</b>: To use this action, an AWS Identity and Access Management (IAM) user must have a
     * Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more
     * information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param assignInstanceRequest
     * @return Result of the AssignInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.AssignInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/AssignInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssignInstanceResult assignInstance(AssignInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeAssignInstance(request);
    }

    @SdkInternalApi
    final AssignInstanceResult executeAssignInstance(AssignInstanceRequest assignInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(assignInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssignInstanceRequest> request = null;
        Response<AssignInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssignInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(assignInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssignInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssignInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssignInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns one of the stack's registered Amazon EBS volumes to a specified instance. The volume must first be
     * registered with the stack by calling <a>RegisterVolume</a>. After you register the volume, you must call
     * <a>UpdateVolume</a> to specify a mount point before calling <code>AssignVolume</code>. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param assignVolumeRequest
     * @return Result of the AssignVolume operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.AssignVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/AssignVolume" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssignVolumeResult assignVolume(AssignVolumeRequest request) {
        request = beforeClientExecution(request);
        return executeAssignVolume(request);
    }

    @SdkInternalApi
    final AssignVolumeResult executeAssignVolume(AssignVolumeRequest assignVolumeRequest) {

        ExecutionContext executionContext = createExecutionContext(assignVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssignVolumeRequest> request = null;
        Response<AssignVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssignVolumeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(assignVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssignVolume");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssignVolumeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssignVolumeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates one of the stack's registered Elastic IP addresses with a specified instance. The address must first
     * be registered with the stack by calling <a>RegisterElasticIp</a>. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param associateElasticIpRequest
     * @return Result of the AssociateElasticIp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.AssociateElasticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/AssociateElasticIp" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AssociateElasticIpResult associateElasticIp(AssociateElasticIpRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateElasticIp(request);
    }

    @SdkInternalApi
    final AssociateElasticIpResult executeAssociateElasticIp(AssociateElasticIpRequest associateElasticIpRequest) {

        ExecutionContext executionContext = createExecutionContext(associateElasticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateElasticIpRequest> request = null;
        Response<AssociateElasticIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateElasticIpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateElasticIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateElasticIp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateElasticIpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateElasticIpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches an Elastic Load Balancing load balancer to a specified layer. AWS OpsWorks Stacks does not support
     * Application Load Balancer. You can only use Classic Load Balancer with AWS OpsWorks Stacks. For more information,
     * see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers-elb.html">Elastic Load Balancing</a>.
     * </p>
     * <note>
     * <p>
     * You must create the Elastic Load Balancing instance separately, by using the Elastic Load Balancing console, API,
     * or CLI. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/Welcome.html"> Elastic Load Balancing
     * Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param attachElasticLoadBalancerRequest
     * @return Result of the AttachElasticLoadBalancer operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.AttachElasticLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/AttachElasticLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AttachElasticLoadBalancerResult attachElasticLoadBalancer(AttachElasticLoadBalancerRequest request) {
        request = beforeClientExecution(request);
        return executeAttachElasticLoadBalancer(request);
    }

    @SdkInternalApi
    final AttachElasticLoadBalancerResult executeAttachElasticLoadBalancer(AttachElasticLoadBalancerRequest attachElasticLoadBalancerRequest) {

        ExecutionContext executionContext = createExecutionContext(attachElasticLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachElasticLoadBalancerRequest> request = null;
        Response<AttachElasticLoadBalancerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachElasticLoadBalancerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(attachElasticLoadBalancerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachElasticLoadBalancer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachElasticLoadBalancerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AttachElasticLoadBalancerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a clone of a specified stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-cloning.html">Clone a Stack</a>. By
     * default, all parameters are set to the values used by the parent stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param cloneStackRequest
     * @return Result of the CloneStack operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.CloneStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CloneStack" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CloneStackResult cloneStack(CloneStackRequest request) {
        request = beforeClientExecution(request);
        return executeCloneStack(request);
    }

    @SdkInternalApi
    final CloneStackResult executeCloneStack(CloneStackRequest cloneStackRequest) {

        ExecutionContext executionContext = createExecutionContext(cloneStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CloneStackRequest> request = null;
        Response<CloneStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CloneStackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cloneStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CloneStack");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CloneStackResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CloneStackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an app for a specified stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating Apps</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createAppRequest
     * @return Result of the CreateApp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAppResult createApp(CreateAppRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApp(request);
    }

    @SdkInternalApi
    final CreateAppResult executeCreateApp(CreateAppRequest createAppRequest) {

        ExecutionContext executionContext = createExecutionContext(createAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppRequest> request = null;
        Response<CreateAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Runs deployment or stack commands. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-deploying.html">Deploying Apps</a> and <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-commands.html">Run Stack Commands</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Deploy or Manage permissions level for
     * the stack, or an attached policy that explicitly grants permissions. For more information on user permissions,
     * see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createDeploymentRequest
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateDeployment" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
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
     * Creates an instance in a specified stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html">Adding an Instance to a
     * Layer</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createInstanceRequest
     * @return Result of the CreateInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.CreateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateInstanceResult createInstance(CreateInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInstance(request);
    }

    @SdkInternalApi
    final CreateInstanceResult executeCreateInstance(CreateInstanceRequest createInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(createInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstanceRequest> request = null;
        Response<CreateInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a layer. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-create.html">How to Create a
     * Layer</a>.
     * </p>
     * <note>
     * <p>
     * You should use <b>CreateLayer</b> for noncustom layer types such as PHP App Server only if the stack does not
     * have an existing layer of that type. A stack can have at most one instance of each noncustom layer; if you
     * attempt to create a second instance, <b>CreateLayer</b> fails. A stack can have an arbitrary number of custom
     * layers, so you can call <b>CreateLayer</b> as many times as you like for that layer type.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createLayerRequest
     * @return Result of the CreateLayer operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.CreateLayer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateLayer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLayerResult createLayer(CreateLayerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLayer(request);
    }

    @SdkInternalApi
    final CreateLayerResult executeCreateLayer(CreateLayerRequest createLayerRequest) {

        ExecutionContext executionContext = createExecutionContext(createLayerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLayerRequest> request = null;
        Response<CreateLayerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLayerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLayerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLayer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLayerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLayerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-edit.html">Create a New Stack</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createStackRequest
     * @return Result of the CreateStack operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @sample AWSOpsWorks.CreateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateStack" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateStackResult createStack(CreateStackRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStack(request);
    }

    @SdkInternalApi
    final CreateStackResult executeCreateStack(CreateStackRequest createStackRequest) {

        ExecutionContext executionContext = createExecutionContext(createStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStackRequest> request = null;
        Response<CreateStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStack");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateStackResultJsonUnmarshaller());
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
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createUserProfileRequest
     * @return Result of the CreateUserProfile operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @sample AWSOpsWorks.CreateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateUserProfileResult createUserProfile(CreateUserProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUserProfile(request);
    }

    @SdkInternalApi
    final CreateUserProfileResult executeCreateUserProfile(CreateUserProfileRequest createUserProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserProfileRequest> request = null;
        Response<CreateUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUserProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUserProfileResultJsonUnmarshaller());
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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deleteAppRequest
     * @return Result of the DeleteApp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAppResult deleteApp(DeleteAppRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApp(request);
    }

    @SdkInternalApi
    final DeleteAppResult executeDeleteApp(DeleteAppRequest deleteAppRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppRequest> request = null;
        Response<DeleteAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified instance, which terminates the associated Amazon EC2 instance. You must stop an instance
     * before you can delete it.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-delete.html">Deleting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return Result of the DeleteInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteInstanceResult deleteInstance(DeleteInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInstance(request);
    }

    @SdkInternalApi
    final DeleteInstanceResult executeDeleteInstance(DeleteInstanceRequest deleteInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInstanceRequest> request = null;
        Response<DeleteInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified layer. You must first stop and then delete all associated instances or unassign registered
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-delete.html">How to Delete a
     * Layer</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deleteLayerRequest
     * @return Result of the DeleteLayer operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeleteLayer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteLayer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLayerResult deleteLayer(DeleteLayerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLayer(request);
    }

    @SdkInternalApi
    final DeleteLayerResult executeDeleteLayer(DeleteLayerRequest deleteLayerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLayerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLayerRequest> request = null;
        Response<DeleteLayerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLayerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLayerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLayer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLayerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLayerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified stack. You must first delete all instances, layers, and apps or deregister registered
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-shutting.html">Shut Down a Stack</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deleteStackRequest
     * @return Result of the DeleteStack operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeleteStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteStack" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteStackResult deleteStack(DeleteStackRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStack(request);
    }

    @SdkInternalApi
    final DeleteStackResult executeDeleteStack(DeleteStackRequest deleteStackRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStackRequest> request = null;
        Response<DeleteStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStack");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteStackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @return Result of the DeleteUserProfile operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeleteUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteUserProfileResult deleteUserProfile(DeleteUserProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUserProfile(request);
    }

    @SdkInternalApi
    final DeleteUserProfileResult executeDeleteUserProfile(DeleteUserProfileRequest deleteUserProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserProfileRequest> request = null;
        Response<DeleteUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUserProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters a specified Amazon ECS cluster from a stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-ecscluster.html#workinglayers-ecscluster-delete"
     * > Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html</a>.
     * </p>
     * 
     * @param deregisterEcsClusterRequest
     * @return Result of the DeregisterEcsCluster operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeregisterEcsCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeregisterEcsCluster" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeregisterEcsClusterResult deregisterEcsCluster(DeregisterEcsClusterRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterEcsCluster(request);
    }

    @SdkInternalApi
    final DeregisterEcsClusterResult executeDeregisterEcsCluster(DeregisterEcsClusterRequest deregisterEcsClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterEcsClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterEcsClusterRequest> request = null;
        Response<DeregisterEcsClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterEcsClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deregisterEcsClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterEcsCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterEcsClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeregisterEcsClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters a specified Elastic IP address. The address can then be registered by another stack. For more
     * information, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource
     * Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deregisterElasticIpRequest
     * @return Result of the DeregisterElasticIp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeregisterElasticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeregisterElasticIp" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeregisterElasticIpResult deregisterElasticIp(DeregisterElasticIpRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterElasticIp(request);
    }

    @SdkInternalApi
    final DeregisterElasticIpResult executeDeregisterElasticIp(DeregisterElasticIpRequest deregisterElasticIpRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterElasticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterElasticIpRequest> request = null;
        Response<DeregisterElasticIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterElasticIpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deregisterElasticIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterElasticIp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterElasticIpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeregisterElasticIpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregister a registered Amazon EC2 or on-premises instance. This action removes the instance from the stack and
     * returns it to your control. This action cannot be used with instances that were created with AWS OpsWorks Stacks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deregisterInstanceRequest
     * @return Result of the DeregisterInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeregisterInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeregisterInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeregisterInstanceResult deregisterInstance(DeregisterInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterInstance(request);
    }

    @SdkInternalApi
    final DeregisterInstanceResult executeDeregisterInstance(DeregisterInstanceRequest deregisterInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterInstanceRequest> request = null;
        Response<DeregisterInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deregisterInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeregisterInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deregisterRdsDbInstanceRequest
     * @return Result of the DeregisterRdsDbInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeregisterRdsDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeregisterRdsDbInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterRdsDbInstanceResult deregisterRdsDbInstance(DeregisterRdsDbInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterRdsDbInstance(request);
    }

    @SdkInternalApi
    final DeregisterRdsDbInstanceResult executeDeregisterRdsDbInstance(DeregisterRdsDbInstanceRequest deregisterRdsDbInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterRdsDbInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterRdsDbInstanceRequest> request = null;
        Response<DeregisterRdsDbInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterRdsDbInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterRdsDbInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterRdsDbInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterRdsDbInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterRdsDbInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters an Amazon EBS volume. The volume can then be registered by another stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deregisterVolumeRequest
     * @return Result of the DeregisterVolume operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeregisterVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeregisterVolume" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeregisterVolumeResult deregisterVolume(DeregisterVolumeRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterVolume(request);
    }

    @SdkInternalApi
    final DeregisterVolumeResult executeDeregisterVolume(DeregisterVolumeRequest deregisterVolumeRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterVolumeRequest> request = null;
        Response<DeregisterVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterVolumeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deregisterVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterVolume");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterVolumeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeregisterVolumeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the available AWS OpsWorks Stacks agent versions. You must specify a stack ID or a configuration
     * manager. <code>DescribeAgentVersions</code> returns a list of available agent versions for the specified stack or
     * configuration manager.
     * </p>
     * 
     * @param describeAgentVersionsRequest
     * @return Result of the DescribeAgentVersions operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeAgentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeAgentVersions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAgentVersionsResult describeAgentVersions(DescribeAgentVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAgentVersions(request);
    }

    @SdkInternalApi
    final DescribeAgentVersionsResult executeDescribeAgentVersions(DescribeAgentVersionsRequest describeAgentVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAgentVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAgentVersionsRequest> request = null;
        Response<DescribeAgentVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAgentVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAgentVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAgentVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAgentVersionsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeAgentVersionsResultJsonUnmarshaller());
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
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeAppsRequest
     * @return Result of the DescribeApps operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeApps" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeAppsResult describeApps(DescribeAppsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeApps(request);
    }

    @SdkInternalApi
    final DescribeAppsResult executeDescribeApps(DescribeAppsRequest describeAppsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAppsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppsRequest> request = null;
        Response<DescribeAppsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAppsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeApps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAppsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAppsResultJsonUnmarshaller());
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
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeCommandsRequest
     * @return Result of the DescribeCommands operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeCommands
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeCommands" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeCommandsResult describeCommands(DescribeCommandsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCommands(request);
    }

    @SdkInternalApi
    final DescribeCommandsResult executeDescribeCommands(DescribeCommandsRequest describeCommandsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCommandsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCommandsRequest> request = null;
        Response<DescribeCommandsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCommandsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCommandsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCommands");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCommandsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeCommandsResultJsonUnmarshaller());
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
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeDeploymentsRequest
     * @return Result of the DescribeDeployments operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeDeployments" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDeploymentsResult describeDeployments(DescribeDeploymentsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDeployments(request);
    }

    @SdkInternalApi
    final DescribeDeploymentsResult executeDescribeDeployments(DescribeDeploymentsRequest describeDeploymentsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeploymentsRequest> request = null;
        Response<DescribeDeploymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeploymentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDeploymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDeployments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDeploymentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDeploymentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes Amazon ECS clusters that are registered with a stack. If you specify only a stack ID, you can use the
     * <code>MaxResults</code> and <code>NextToken</code> parameters to paginate the response. However, AWS OpsWorks
     * Stacks currently supports only one cluster per layer, so the result set has a maximum of one element.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack or an attached policy that explicitly grants permission. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * 
     * @param describeEcsClustersRequest
     * @return Result of the DescribeEcsClusters operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeEcsClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeEcsClusters" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeEcsClustersResult describeEcsClusters(DescribeEcsClustersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEcsClusters(request);
    }

    @SdkInternalApi
    final DescribeEcsClustersResult executeDescribeEcsClusters(DescribeEcsClustersRequest describeEcsClustersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEcsClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEcsClustersRequest> request = null;
        Response<DescribeEcsClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEcsClustersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEcsClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEcsClusters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEcsClustersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEcsClustersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP
     * addresses</a>.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeElasticIpsRequest
     * @return Result of the DescribeElasticIps operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeElasticIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeElasticIps" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeElasticIpsResult describeElasticIps(DescribeElasticIpsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeElasticIps(request);
    }

    @SdkInternalApi
    final DescribeElasticIpsResult executeDescribeElasticIps(DescribeElasticIpsRequest describeElasticIpsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeElasticIpsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticIpsRequest> request = null;
        Response<DescribeElasticIpsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticIpsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeElasticIpsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeElasticIps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeElasticIpsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeElasticIpsResultJsonUnmarshaller());
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
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeElasticLoadBalancersRequest
     * @return Result of the DescribeElasticLoadBalancers operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeElasticLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeElasticLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeElasticLoadBalancersResult describeElasticLoadBalancers(DescribeElasticLoadBalancersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeElasticLoadBalancers(request);
    }

    @SdkInternalApi
    final DescribeElasticLoadBalancersResult executeDescribeElasticLoadBalancers(DescribeElasticLoadBalancersRequest describeElasticLoadBalancersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeElasticLoadBalancersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticLoadBalancersRequest> request = null;
        Response<DescribeElasticLoadBalancersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticLoadBalancersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeElasticLoadBalancersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeElasticLoadBalancers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeElasticLoadBalancersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeElasticLoadBalancersResultJsonUnmarshaller());
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
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeInstancesRequest
     * @return Result of the DescribeInstances operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeInstances" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeInstancesResult describeInstances(DescribeInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstances(request);
    }

    @SdkInternalApi
    final DescribeInstancesResult executeDescribeInstances(DescribeInstancesRequest describeInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstancesRequest> request = null;
        Response<DescribeInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeInstancesResultJsonUnmarshaller());
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
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeLayersRequest
     * @return Result of the DescribeLayers operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeLayers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeLayers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeLayersResult describeLayers(DescribeLayersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLayers(request);
    }

    @SdkInternalApi
    final DescribeLayersResult executeDescribeLayers(DescribeLayersRequest describeLayersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLayersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLayersRequest> request = null;
        Response<DescribeLayersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLayersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLayersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLayers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLayersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeLayersResultJsonUnmarshaller());
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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeLoadBasedAutoScalingRequest
     * @return Result of the DescribeLoadBasedAutoScaling operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeLoadBasedAutoScaling
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeLoadBasedAutoScaling"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLoadBasedAutoScalingResult describeLoadBasedAutoScaling(DescribeLoadBasedAutoScalingRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLoadBasedAutoScaling(request);
    }

    @SdkInternalApi
    final DescribeLoadBasedAutoScalingResult executeDescribeLoadBasedAutoScaling(DescribeLoadBasedAutoScalingRequest describeLoadBasedAutoScalingRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLoadBasedAutoScalingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoadBasedAutoScalingRequest> request = null;
        Response<DescribeLoadBasedAutoScalingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoadBasedAutoScalingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeLoadBasedAutoScalingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLoadBasedAutoScaling");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLoadBasedAutoScalingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeLoadBasedAutoScalingResultJsonUnmarshaller());
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
     * <b>Required Permissions</b>: To use this action, an IAM user must have self-management enabled or an attached
     * policy that explicitly grants permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeMyUserProfileRequest
     * @return Result of the DescribeMyUserProfile operation returned by the service.
     * @sample AWSOpsWorks.DescribeMyUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeMyUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeMyUserProfileResult describeMyUserProfile(DescribeMyUserProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMyUserProfile(request);
    }

    @SdkInternalApi
    final DescribeMyUserProfileResult executeDescribeMyUserProfile(DescribeMyUserProfileRequest describeMyUserProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMyUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMyUserProfileRequest> request = null;
        Response<DescribeMyUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMyUserProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeMyUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMyUserProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMyUserProfileResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeMyUserProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the operating systems that are supported by AWS OpsWorks Stacks.
     * </p>
     * 
     * @param describeOperatingSystemsRequest
     * @return Result of the DescribeOperatingSystems operation returned by the service.
     * @sample AWSOpsWorks.DescribeOperatingSystems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeOperatingSystems"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeOperatingSystemsResult describeOperatingSystems(DescribeOperatingSystemsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOperatingSystems(request);
    }

    @SdkInternalApi
    final DescribeOperatingSystemsResult executeDescribeOperatingSystems(DescribeOperatingSystemsRequest describeOperatingSystemsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOperatingSystemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOperatingSystemsRequest> request = null;
        Response<DescribeOperatingSystemsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOperatingSystemsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeOperatingSystemsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOperatingSystems");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOperatingSystemsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeOperatingSystemsResultJsonUnmarshaller());
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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describePermissionsRequest
     * @return Result of the DescribePermissions operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribePermissions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribePermissionsResult describePermissions(DescribePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePermissions(request);
    }

    @SdkInternalApi
    final DescribePermissionsResult executeDescribePermissions(DescribePermissionsRequest describePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePermissionsRequest> request = null;
        Response<DescribePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePermissionsResultJsonUnmarshaller());
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
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeRaidArraysRequest
     * @return Result of the DescribeRaidArrays operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeRaidArrays
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeRaidArrays" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeRaidArraysResult describeRaidArrays(DescribeRaidArraysRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRaidArrays(request);
    }

    @SdkInternalApi
    final DescribeRaidArraysResult executeDescribeRaidArrays(DescribeRaidArraysRequest describeRaidArraysRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRaidArraysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRaidArraysRequest> request = null;
        Response<DescribeRaidArraysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRaidArraysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRaidArraysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRaidArrays");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRaidArraysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeRaidArraysResultJsonUnmarshaller());
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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * 
     * @param describeRdsDbInstancesRequest
     * @return Result of the DescribeRdsDbInstances operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeRdsDbInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeRdsDbInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRdsDbInstancesResult describeRdsDbInstances(DescribeRdsDbInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRdsDbInstances(request);
    }

    @SdkInternalApi
    final DescribeRdsDbInstancesResult executeDescribeRdsDbInstances(DescribeRdsDbInstancesRequest describeRdsDbInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRdsDbInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRdsDbInstancesRequest> request = null;
        Response<DescribeRdsDbInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRdsDbInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRdsDbInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRdsDbInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRdsDbInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRdsDbInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes AWS OpsWorks Stacks service errors.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * 
     * @param describeServiceErrorsRequest
     * @return Result of the DescribeServiceErrors operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeServiceErrors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeServiceErrors" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeServiceErrorsResult describeServiceErrors(DescribeServiceErrorsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeServiceErrors(request);
    }

    @SdkInternalApi
    final DescribeServiceErrorsResult executeDescribeServiceErrors(DescribeServiceErrorsRequest describeServiceErrorsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeServiceErrorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServiceErrorsRequest> request = null;
        Response<DescribeServiceErrorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServiceErrorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeServiceErrorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeServiceErrors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeServiceErrorsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeServiceErrorsResultJsonUnmarshaller());
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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeStackProvisioningParametersRequest
     * @return Result of the DescribeStackProvisioningParameters operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeStackProvisioningParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeStackProvisioningParameters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeStackProvisioningParametersResult describeStackProvisioningParameters(DescribeStackProvisioningParametersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStackProvisioningParameters(request);
    }

    @SdkInternalApi
    final DescribeStackProvisioningParametersResult executeDescribeStackProvisioningParameters(
            DescribeStackProvisioningParametersRequest describeStackProvisioningParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStackProvisioningParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackProvisioningParametersRequest> request = null;
        Response<DescribeStackProvisioningParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStackProvisioningParametersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeStackProvisioningParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStackProvisioningParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStackProvisioningParametersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeStackProvisioningParametersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the number of layers and apps in a specified stack, and the number of instances in each state, such as
     * <code>running_setup</code> or <code>online</code>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeStackSummaryRequest
     * @return Result of the DescribeStackSummary operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeStackSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeStackSummary" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeStackSummaryResult describeStackSummary(DescribeStackSummaryRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStackSummary(request);
    }

    @SdkInternalApi
    final DescribeStackSummaryResult executeDescribeStackSummary(DescribeStackSummaryRequest describeStackSummaryRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStackSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackSummaryRequest> request = null;
        Response<DescribeStackSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStackSummaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeStackSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStackSummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStackSummaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeStackSummaryResultJsonUnmarshaller());
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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeStacksRequest
     * @return Result of the DescribeStacks operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeStacks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeStacksResult describeStacks(DescribeStacksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStacks(request);
    }

    @SdkInternalApi
    final DescribeStacksResult executeDescribeStacks(DescribeStacksRequest describeStacksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStacksRequest> request = null;
        Response<DescribeStacksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStacksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeStacksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStacks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStacksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeStacksResultJsonUnmarshaller());
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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeTimeBasedAutoScalingRequest
     * @return Result of the DescribeTimeBasedAutoScaling operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeTimeBasedAutoScaling
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeTimeBasedAutoScaling"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTimeBasedAutoScalingResult describeTimeBasedAutoScaling(DescribeTimeBasedAutoScalingRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTimeBasedAutoScaling(request);
    }

    @SdkInternalApi
    final DescribeTimeBasedAutoScalingResult executeDescribeTimeBasedAutoScaling(DescribeTimeBasedAutoScalingRequest describeTimeBasedAutoScalingRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTimeBasedAutoScalingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTimeBasedAutoScalingRequest> request = null;
        Response<DescribeTimeBasedAutoScalingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTimeBasedAutoScalingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeTimeBasedAutoScalingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTimeBasedAutoScaling");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTimeBasedAutoScalingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeTimeBasedAutoScalingResultJsonUnmarshaller());
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
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeUserProfilesRequest
     * @return Result of the DescribeUserProfiles operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeUserProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeUserProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeUserProfilesResult describeUserProfiles(DescribeUserProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUserProfiles(request);
    }

    @SdkInternalApi
    final DescribeUserProfilesResult executeDescribeUserProfiles(DescribeUserProfilesRequest describeUserProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUserProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserProfilesRequest> request = null;
        Response<DescribeUserProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUserProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUserProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUserProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeUserProfilesResultJsonUnmarshaller());
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
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeVolumesRequest
     * @return Result of the DescribeVolumes operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeVolumes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeVolumesResult describeVolumes(DescribeVolumesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVolumes(request);
    }

    @SdkInternalApi
    final DescribeVolumesResult executeDescribeVolumes(DescribeVolumesRequest describeVolumesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVolumesRequest> request = null;
        Response<DescribeVolumesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVolumesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeVolumesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVolumes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVolumesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeVolumesResultJsonUnmarshaller());
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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param detachElasticLoadBalancerRequest
     * @return Result of the DetachElasticLoadBalancer operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DetachElasticLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DetachElasticLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DetachElasticLoadBalancerResult detachElasticLoadBalancer(DetachElasticLoadBalancerRequest request) {
        request = beforeClientExecution(request);
        return executeDetachElasticLoadBalancer(request);
    }

    @SdkInternalApi
    final DetachElasticLoadBalancerResult executeDetachElasticLoadBalancer(DetachElasticLoadBalancerRequest detachElasticLoadBalancerRequest) {

        ExecutionContext executionContext = createExecutionContext(detachElasticLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachElasticLoadBalancerRequest> request = null;
        Response<DetachElasticLoadBalancerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachElasticLoadBalancerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(detachElasticLoadBalancerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachElasticLoadBalancer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachElasticLoadBalancerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DetachElasticLoadBalancerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates an Elastic IP address from its instance. The address remains registered with the stack. For more
     * information, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource
     * Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param disassociateElasticIpRequest
     * @return Result of the DisassociateElasticIp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DisassociateElasticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DisassociateElasticIp" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisassociateElasticIpResult disassociateElasticIp(DisassociateElasticIpRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateElasticIp(request);
    }

    @SdkInternalApi
    final DisassociateElasticIpResult executeDisassociateElasticIp(DisassociateElasticIpRequest disassociateElasticIpRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateElasticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateElasticIpRequest> request = null;
        Response<DisassociateElasticIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateElasticIpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateElasticIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateElasticIp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateElasticIpResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisassociateElasticIpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a generated host name for the specified layer, based on the current host name theme.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param getHostnameSuggestionRequest
     * @return Result of the GetHostnameSuggestion operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.GetHostnameSuggestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/GetHostnameSuggestion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetHostnameSuggestionResult getHostnameSuggestion(GetHostnameSuggestionRequest request) {
        request = beforeClientExecution(request);
        return executeGetHostnameSuggestion(request);
    }

    @SdkInternalApi
    final GetHostnameSuggestionResult executeGetHostnameSuggestion(GetHostnameSuggestionRequest getHostnameSuggestionRequest) {

        ExecutionContext executionContext = createExecutionContext(getHostnameSuggestionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetHostnameSuggestionRequest> request = null;
        Response<GetHostnameSuggestionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetHostnameSuggestionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getHostnameSuggestionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetHostnameSuggestion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetHostnameSuggestionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetHostnameSuggestionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action can be used only with Windows stacks.
     * </p>
     * </note>
     * <p>
     * Grants RDP access to a Windows instance for a specified time period.
     * </p>
     * 
     * @param grantAccessRequest
     * @return Result of the GrantAccess operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.GrantAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/GrantAccess" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GrantAccessResult grantAccess(GrantAccessRequest request) {
        request = beforeClientExecution(request);
        return executeGrantAccess(request);
    }

    @SdkInternalApi
    final GrantAccessResult executeGrantAccess(GrantAccessRequest grantAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(grantAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GrantAccessRequest> request = null;
        Response<GrantAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GrantAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(grantAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GrantAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GrantAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GrantAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of tags that are applied to the specified stack or layer.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListTags(request);
    }

    @SdkInternalApi
    final ListTagsResult executeListTags(ListTagsRequest listTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reboots a specified instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html">Starting, Stopping,
     * and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param rebootInstanceRequest
     * @return Result of the RebootInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RebootInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RebootInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RebootInstanceResult rebootInstance(RebootInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeRebootInstance(request);
    }

    @SdkInternalApi
    final RebootInstanceResult executeRebootInstance(RebootInstanceRequest rebootInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(rebootInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootInstanceRequest> request = null;
        Response<RebootInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rebootInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RebootInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RebootInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RebootInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a specified Amazon ECS cluster with a stack. You can register only one cluster with a stack. A cluster
     * can be registered with only one stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-ecscluster.html"> Resource
     * Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param registerEcsClusterRequest
     * @return Result of the RegisterEcsCluster operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RegisterEcsCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterEcsCluster" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RegisterEcsClusterResult registerEcsCluster(RegisterEcsClusterRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterEcsCluster(request);
    }

    @SdkInternalApi
    final RegisterEcsClusterResult executeRegisterEcsCluster(RegisterEcsClusterRequest registerEcsClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(registerEcsClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterEcsClusterRequest> request = null;
        Response<RegisterEcsClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterEcsClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerEcsClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterEcsCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterEcsClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterEcsClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers an Elastic IP address with a specified stack. An address can be registered with only one stack at a
     * time. If the address is already registered, you must first deregister it by calling <a>DeregisterElasticIp</a>.
     * For more information, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource
     * Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param registerElasticIpRequest
     * @return Result of the RegisterElasticIp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RegisterElasticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterElasticIp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RegisterElasticIpResult registerElasticIp(RegisterElasticIpRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterElasticIp(request);
    }

    @SdkInternalApi
    final RegisterElasticIpResult executeRegisterElasticIp(RegisterElasticIpRequest registerElasticIpRequest) {

        ExecutionContext executionContext = createExecutionContext(registerElasticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterElasticIpRequest> request = null;
        Response<RegisterElasticIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterElasticIpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerElasticIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterElasticIp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterElasticIpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterElasticIpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers instances that were created outside of AWS OpsWorks Stacks with a specified stack.
     * </p>
     * <note>
     * <p>
     * We do not recommend using this action to register instances. The complete registration operation includes two
     * tasks: installing the AWS OpsWorks Stacks agent on the instance, and registering the instance with the stack.
     * <code>RegisterInstance</code> handles only the second step. You should instead use the AWS CLI
     * <code>register</code> command, which performs the entire registration operation. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/registered-instances-register.html"> Registering an
     * Instance with an AWS OpsWorks Stacks Stack</a>.
     * </p>
     * </note>
     * <p>
     * Registered instances have the same requirements as instances that are created by using the <a>CreateInstance</a>
     * API. For example, registered instances must be running a supported Linux-based operating system, and they must
     * have a supported instance type. For more information about requirements for instances that you want to register,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/registered-instances-register-registering-preparer.html">
     * Preparing the Instance</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param registerInstanceRequest
     * @return Result of the RegisterInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RegisterInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RegisterInstanceResult registerInstance(RegisterInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterInstance(request);
    }

    @SdkInternalApi
    final RegisterInstanceResult executeRegisterInstance(RegisterInstanceRequest registerInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(registerInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterInstanceRequest> request = null;
        Response<RegisterInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterInstanceResultJsonUnmarshaller());
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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param registerRdsDbInstanceRequest
     * @return Result of the RegisterRdsDbInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RegisterRdsDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterRdsDbInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RegisterRdsDbInstanceResult registerRdsDbInstance(RegisterRdsDbInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterRdsDbInstance(request);
    }

    @SdkInternalApi
    final RegisterRdsDbInstanceResult executeRegisterRdsDbInstance(RegisterRdsDbInstanceRequest registerRdsDbInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(registerRdsDbInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterRdsDbInstanceRequest> request = null;
        Response<RegisterRdsDbInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterRdsDbInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerRdsDbInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterRdsDbInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterRdsDbInstanceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new RegisterRdsDbInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers an Amazon EBS volume with a specified stack. A volume can be registered with only one stack at a time.
     * If the volume is already registered, you must first deregister it by calling <a>DeregisterVolume</a>. For more
     * information, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource
     * Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param registerVolumeRequest
     * @return Result of the RegisterVolume operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RegisterVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterVolume" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RegisterVolumeResult registerVolume(RegisterVolumeRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterVolume(request);
    }

    @SdkInternalApi
    final RegisterVolumeResult executeRegisterVolume(RegisterVolumeRequest registerVolumeRequest) {

        ExecutionContext executionContext = createExecutionContext(registerVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterVolumeRequest> request = null;
        Response<RegisterVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterVolumeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterVolume");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterVolumeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterVolumeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specify the load-based auto scaling configuration for a specified layer. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html">Managing Load with
     * Time-based and Load-based Instances</a>.
     * </p>
     * <note>
     * <p>
     * To use load-based auto scaling, you must create a set of load-based auto scaling instances. Load-based auto
     * scaling operates only on the instances from that set, so you must ensure that you have created enough instances
     * to handle the maximum anticipated load.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param setLoadBasedAutoScalingRequest
     * @return Result of the SetLoadBasedAutoScaling operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.SetLoadBasedAutoScaling
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/SetLoadBasedAutoScaling"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetLoadBasedAutoScalingResult setLoadBasedAutoScaling(SetLoadBasedAutoScalingRequest request) {
        request = beforeClientExecution(request);
        return executeSetLoadBasedAutoScaling(request);
    }

    @SdkInternalApi
    final SetLoadBasedAutoScalingResult executeSetLoadBasedAutoScaling(SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest) {

        ExecutionContext executionContext = createExecutionContext(setLoadBasedAutoScalingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetLoadBasedAutoScalingRequest> request = null;
        Response<SetLoadBasedAutoScalingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetLoadBasedAutoScalingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(setLoadBasedAutoScalingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetLoadBasedAutoScaling");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetLoadBasedAutoScalingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SetLoadBasedAutoScalingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specifies a user's permissions. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingsecurity.html">Security and Permissions</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param setPermissionRequest
     * @return Result of the SetPermission operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.SetPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/SetPermission" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SetPermissionResult setPermission(SetPermissionRequest request) {
        request = beforeClientExecution(request);
        return executeSetPermission(request);
    }

    @SdkInternalApi
    final SetPermissionResult executeSetPermission(SetPermissionRequest setPermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(setPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetPermissionRequest> request = null;
        Response<SetPermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetPermissionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetPermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetPermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetPermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specify the time-based auto scaling configuration for a specified instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html">Managing Load with
     * Time-based and Load-based Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param setTimeBasedAutoScalingRequest
     * @return Result of the SetTimeBasedAutoScaling operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.SetTimeBasedAutoScaling
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/SetTimeBasedAutoScaling"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetTimeBasedAutoScalingResult setTimeBasedAutoScaling(SetTimeBasedAutoScalingRequest request) {
        request = beforeClientExecution(request);
        return executeSetTimeBasedAutoScaling(request);
    }

    @SdkInternalApi
    final SetTimeBasedAutoScalingResult executeSetTimeBasedAutoScaling(SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest) {

        ExecutionContext executionContext = createExecutionContext(setTimeBasedAutoScalingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetTimeBasedAutoScalingRequest> request = null;
        Response<SetTimeBasedAutoScalingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetTimeBasedAutoScalingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(setTimeBasedAutoScalingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetTimeBasedAutoScaling");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetTimeBasedAutoScalingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SetTimeBasedAutoScalingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a specified instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html">Starting, Stopping,
     * and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param startInstanceRequest
     * @return Result of the StartInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.StartInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/StartInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartInstanceResult startInstance(StartInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeStartInstance(request);
    }

    @SdkInternalApi
    final StartInstanceResult executeStartInstance(StartInstanceRequest startInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(startInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartInstanceRequest> request = null;
        Response<StartInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a stack's instances.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param startStackRequest
     * @return Result of the StartStack operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.StartStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/StartStack" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartStackResult startStack(StartStackRequest request) {
        request = beforeClientExecution(request);
        return executeStartStack(request);
    }

    @SdkInternalApi
    final StartStackResult executeStartStack(StartStackRequest startStackRequest) {

        ExecutionContext executionContext = createExecutionContext(startStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartStackRequest> request = null;
        Response<StartStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartStackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartStack");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartStackResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartStackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a specified instance. When you stop a standard instance, the data disappears and must be reinstalled when
     * you restart the instance. You can stop an Amazon EBS-backed instance without losing data. For more information,
     * see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html">Starting,
     * Stopping, and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param stopInstanceRequest
     * @return Result of the StopInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.StopInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/StopInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopInstanceResult stopInstance(StopInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeStopInstance(request);
    }

    @SdkInternalApi
    final StopInstanceResult executeStopInstance(StopInstanceRequest stopInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(stopInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopInstanceRequest> request = null;
        Response<StopInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param stopStackRequest
     * @return Result of the StopStack operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.StopStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/StopStack" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopStackResult stopStack(StopStackRequest request) {
        request = beforeClientExecution(request);
        return executeStopStack(request);
    }

    @SdkInternalApi
    final StopStackResult executeStopStack(StopStackRequest stopStackRequest) {

        ExecutionContext executionContext = createExecutionContext(stopStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopStackRequest> request = null;
        Response<StopStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopStackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopStack");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopStackResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopStackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Apply cost-allocation tags to a specified stack or layer in AWS OpsWorks Stacks. For more information about how
     * tagging works, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/tagging.html">Tags</a> in the
     * AWS OpsWorks User Guide.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Unassigns a registered instance from all layers that are using the instance. The instance remains in the stack as
     * an unassigned instance, and can be assigned to another layer as needed. You cannot use this action with instances
     * that were created with AWS OpsWorks Stacks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param unassignInstanceRequest
     * @return Result of the UnassignInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UnassignInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UnassignInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UnassignInstanceResult unassignInstance(UnassignInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeUnassignInstance(request);
    }

    @SdkInternalApi
    final UnassignInstanceResult executeUnassignInstance(UnassignInstanceRequest unassignInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(unassignInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnassignInstanceRequest> request = null;
        Response<UnassignInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnassignInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(unassignInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UnassignInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UnassignInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UnassignInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Unassigns an assigned Amazon EBS volume. The volume remains registered with the stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param unassignVolumeRequest
     * @return Result of the UnassignVolume operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UnassignVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UnassignVolume" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UnassignVolumeResult unassignVolume(UnassignVolumeRequest request) {
        request = beforeClientExecution(request);
        return executeUnassignVolume(request);
    }

    @SdkInternalApi
    final UnassignVolumeResult executeUnassignVolume(UnassignVolumeRequest unassignVolumeRequest) {

        ExecutionContext executionContext = createExecutionContext(unassignVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnassignVolumeRequest> request = null;
        Response<UnassignVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnassignVolumeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(unassignVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UnassignVolume");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UnassignVolumeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UnassignVolumeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes tags from a specified stack or layer.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Deploy or Manage permissions level for
     * the stack, or an attached policy that explicitly grants permissions. For more information on user permissions,
     * see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateAppRequest
     * @return Result of the UpdateApp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAppResult updateApp(UpdateAppRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApp(request);
    }

    @SdkInternalApi
    final UpdateAppResult executeUpdateApp(UpdateAppRequest updateAppRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAppRequest> request = null;
        Response<UpdateAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a registered Elastic IP address's name. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateElasticIpRequest
     * @return Result of the UpdateElasticIp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateElasticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateElasticIp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateElasticIpResult updateElasticIp(UpdateElasticIpRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateElasticIp(request);
    }

    @SdkInternalApi
    final UpdateElasticIpResult executeUpdateElasticIp(UpdateElasticIpRequest updateElasticIpRequest) {

        ExecutionContext executionContext = createExecutionContext(updateElasticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateElasticIpRequest> request = null;
        Response<UpdateElasticIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateElasticIpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateElasticIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateElasticIp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateElasticIpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateElasticIpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a specified instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateInstanceRequest
     * @return Result of the UpdateInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateInstanceResult updateInstance(UpdateInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInstance(request);
    }

    @SdkInternalApi
    final UpdateInstanceResult executeUpdateInstance(UpdateInstanceRequest updateInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInstanceRequest> request = null;
        Response<UpdateInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a specified layer.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateLayerRequest
     * @return Result of the UpdateLayer operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateLayer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateLayer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateLayerResult updateLayer(UpdateLayerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLayer(request);
    }

    @SdkInternalApi
    final UpdateLayerResult executeUpdateLayer(UpdateLayerRequest updateLayerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLayerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLayerRequest> request = null;
        Response<UpdateLayerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLayerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLayerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLayer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLayerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateLayerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a user's SSH public key.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have self-management enabled or an attached
     * policy that explicitly grants permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateMyUserProfileRequest
     * @return Result of the UpdateMyUserProfile operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @sample AWSOpsWorks.UpdateMyUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateMyUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateMyUserProfileResult updateMyUserProfile(UpdateMyUserProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMyUserProfile(request);
    }

    @SdkInternalApi
    final UpdateMyUserProfileResult executeUpdateMyUserProfile(UpdateMyUserProfileRequest updateMyUserProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMyUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMyUserProfileRequest> request = null;
        Response<UpdateMyUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMyUserProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMyUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMyUserProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMyUserProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMyUserProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateRdsDbInstanceRequest
     * @return Result of the UpdateRdsDbInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateRdsDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateRdsDbInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateRdsDbInstanceResult updateRdsDbInstance(UpdateRdsDbInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRdsDbInstance(request);
    }

    @SdkInternalApi
    final UpdateRdsDbInstanceResult executeUpdateRdsDbInstance(UpdateRdsDbInstanceRequest updateRdsDbInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRdsDbInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRdsDbInstanceRequest> request = null;
        Response<UpdateRdsDbInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRdsDbInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRdsDbInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRdsDbInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRdsDbInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRdsDbInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateStackRequest
     * @return Result of the UpdateStack operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateStack" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateStackResult updateStack(UpdateStackRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStack(request);
    }

    @SdkInternalApi
    final UpdateStackResult executeUpdateStack(UpdateStackRequest updateStackRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStackRequest> request = null;
        Response<UpdateStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStack");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateStackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a specified user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @return Result of the UpdateUserProfile operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateUserProfileResult updateUserProfile(UpdateUserProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserProfile(request);
    }

    @SdkInternalApi
    final UpdateUserProfileResult executeUpdateUserProfile(UpdateUserProfileRequest updateUserProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserProfileRequest> request = null;
        Response<UpdateUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an Amazon EBS volume's name or mount point. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateVolumeRequest
     * @return Result of the UpdateVolume operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateVolume" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateVolumeResult updateVolume(UpdateVolumeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVolume(request);
    }

    @SdkInternalApi
    final UpdateVolumeResult executeUpdateVolume(UpdateVolumeRequest updateVolumeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVolumeRequest> request = null;
        Response<UpdateVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVolumeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVolume");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVolumeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVolumeResultJsonUnmarshaller());
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
    public AWSOpsWorksWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AWSOpsWorksWaiters(this);
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

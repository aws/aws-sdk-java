/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk;

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

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.services.elasticbeanstalk.model.transform.*;

/**
 * Client for accessing Elastic Beanstalk. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Elastic Beanstalk</fullname>
 * <p>
 * This is the AWS Elastic Beanstalk API Reference. This guide provides detailed
 * information about AWS Elastic Beanstalk actions, data types, parameters, and
 * errors.
 * </p>
 * <p>
 * AWS Elastic Beanstalk is a tool that makes it easy for you to create, deploy,
 * and manage scalable, fault-tolerant applications running on Amazon Web
 * Services cloud resources.
 * </p>
 * <p>
 * For more information about this product, go to the <a
 * href="http://aws.amazon.com/elasticbeanstalk/">AWS Elastic Beanstalk</a>
 * details page. The location of the latest AWS Elastic Beanstalk WSDL is <a
 * href=
 * "http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl"
 * >http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.
 * wsdl</a>. To install the Software Development Kits (SDKs), Integrated
 * Development Environment (IDE) Toolkits, and command line tools that enable
 * you to access the API, go to <a href="https://aws.amazon.com/tools/">Tools
 * for Amazon Web Services</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * For a list of region-specific endpoints that AWS Elastic Beanstalk supports,
 * go to <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region"
 * >Regions and Endpoints</a> in the <i>Amazon Web Services Glossary</i>.
 * </p>
 */
public class AWSElasticBeanstalkClient extends AmazonWebServiceClient implements
        AWSElasticBeanstalk {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSElasticBeanstalk.class);

    /** Default signing name for the service. */
    private final String DEFAULT_SIGNING_NAME = "elasticbeanstalk";

    /**
     * List of exception unmarshallers for all Elastic Beanstalk exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on Elastic Beanstalk. A
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
    public AWSElasticBeanstalkClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Beanstalk. A
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
     *        connects to Elastic Beanstalk (ex: proxy settings, retry counts,
     *        etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSElasticBeanstalkClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Beanstalk
     * using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AWSElasticBeanstalkClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Beanstalk
     * using the specified AWS account credentials and client configuration
     * options.
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
     *        connects to Elastic Beanstalk (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AWSElasticBeanstalkClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Beanstalk
     * using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AWSElasticBeanstalkClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Beanstalk
     * using the specified AWS account credentials provider and client
     * configuration options.
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
     *        connects to Elastic Beanstalk (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AWSElasticBeanstalkClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Beanstalk
     * using the specified AWS account credentials provider, client
     * configuration options, and request metric collector.
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
     *        connects to Elastic Beanstalk (ex: proxy settings, retry counts,
     *        etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSElasticBeanstalkClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers
                .add(new OperationInProgressExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TooManyEnvironmentsExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new ElasticBeanstalkServiceExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new S3LocationNotInServiceRegionExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TooManyApplicationsExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TooManyConfigurationTemplatesExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new S3SubscriptionRequiredExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new SourceBundleDeletionExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new InsufficientPrivilegesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TooManyApplicationVersionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyBucketsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://elasticbeanstalk.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/elasticbeanstalk/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/elasticbeanstalk/request.handler2s"));
    }

    /**
     * <p>
     * Cancels in-progress environment configuration update or application
     * version deployment.
     * </p>
     * 
     * @param abortEnvironmentUpdateRequest
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    @Override
    public void abortEnvironmentUpdate(
            AbortEnvironmentUpdateRequest abortEnvironmentUpdateRequest) {
        ExecutionContext executionContext = createExecutionContext(abortEnvironmentUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AbortEnvironmentUpdateRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AbortEnvironmentUpdateRequestMarshaller()
                        .marshall(abortEnvironmentUpdateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public void abortEnvironmentUpdate() {
        abortEnvironmentUpdate(new AbortEnvironmentUpdateRequest());
    }

    /**
     * <p>
     * Checks if the specified CNAME is available.
     * </p>
     * 
     * @param checkDNSAvailabilityRequest
     *        Results message indicating whether a CNAME is available.
     * @return Result of the CheckDNSAvailability operation returned by the
     *         service.
     */
    @Override
    public CheckDNSAvailabilityResult checkDNSAvailability(
            CheckDNSAvailabilityRequest checkDNSAvailabilityRequest) {
        ExecutionContext executionContext = createExecutionContext(checkDNSAvailabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CheckDNSAvailabilityRequest> request = null;
        Response<CheckDNSAvailabilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CheckDNSAvailabilityRequestMarshaller()
                        .marshall(checkDNSAvailabilityRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new CheckDNSAvailabilityResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an application that has one configuration template named
     * <code>default</code> and no application versions.
     * </p>
     * 
     * @param createApplicationRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the CreateApplication operation returned by the
     *         service.
     * @throws TooManyApplicationsException
     *         The caller has exceeded the limit on the number of applications
     *         associated with their account.
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
                        .marshall(createApplicationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new CreateApplicationResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an application version for the specified application.
     * </p>
     * <note>Once you create an application version with a specified Amazon S3
     * bucket and key location, you cannot change that Amazon S3 location. If
     * you change the Amazon S3 location, you receive an exception when you
     * attempt to launch an environment from the application version. </note>
     * 
     * @param createApplicationVersionRequest
     * @return Result of the CreateApplicationVersion operation returned by the
     *         service.
     * @throws TooManyApplicationsException
     *         The caller has exceeded the limit on the number of applications
     *         associated with their account.
     * @throws TooManyApplicationVersionsException
     *         The caller has exceeded the limit on the number of application
     *         versions associated with their account.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     * @throws S3LocationNotInServiceRegionException
     *         The specified S3 bucket does not belong to the S3 region in which
     *         the service is running.
     */
    @Override
    public CreateApplicationVersionResult createApplicationVersion(
            CreateApplicationVersionRequest createApplicationVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(createApplicationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationVersionRequest> request = null;
        Response<CreateApplicationVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationVersionRequestMarshaller()
                        .marshall(createApplicationVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new CreateApplicationVersionResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a configuration template. Templates are associated with a
     * specific application and are used to deploy different versions of the
     * application with the same configuration settings.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li><a>DescribeConfigurationOptions</a></li>
     * <li><a>DescribeConfigurationSettings</a></li>
     * <li><a>ListAvailableSolutionStacks</a></li>
     * </ul>
     * 
     * @param createConfigurationTemplateRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the CreateConfigurationTemplate operation returned by
     *         the service.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     * @throws TooManyConfigurationTemplatesException
     *         The caller has exceeded the limit on the number of configuration
     *         templates associated with their account.
     */
    @Override
    public CreateConfigurationTemplateResult createConfigurationTemplate(
            CreateConfigurationTemplateRequest createConfigurationTemplateRequest) {
        ExecutionContext executionContext = createExecutionContext(createConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfigurationTemplateRequest> request = null;
        Response<CreateConfigurationTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfigurationTemplateRequestMarshaller()
                        .marshall(createConfigurationTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new CreateConfigurationTemplateResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Launches an environment for the specified application using the specified
     * configuration.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return Result of the CreateEnvironment operation returned by the
     *         service.
     * @throws TooManyEnvironmentsException
     *         The caller has exceeded the limit of allowed environments
     *         associated with the account.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    @Override
    public CreateEnvironmentResult createEnvironment(
            CreateEnvironmentRequest createEnvironmentRequest) {
        ExecutionContext executionContext = createExecutionContext(createEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEnvironmentRequest> request = null;
        Response<CreateEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEnvironmentRequestMarshaller()
                        .marshall(createEnvironmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new CreateEnvironmentResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the Amazon S3 storage location for the account.
     * </p>
     * <p>
     * This location is used to store user log files.
     * </p>
     * 
     * @param createStorageLocationRequest
     *        null
     * @return Result of the CreateStorageLocation operation returned by the
     *         service.
     * @throws TooManyBucketsException
     *         The web service attempted to create a bucket in an Amazon S3
     *         account that already has 100 buckets.
     * @throws S3SubscriptionRequiredException
     *         The caller does not have a subscription to Amazon S3.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    @Override
    public CreateStorageLocationResult createStorageLocation(
            CreateStorageLocationRequest createStorageLocationRequest) {
        ExecutionContext executionContext = createExecutionContext(createStorageLocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStorageLocationRequest> request = null;
        Response<CreateStorageLocationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStorageLocationRequestMarshaller()
                        .marshall(createStorageLocationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new CreateStorageLocationResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public CreateStorageLocationResult createStorageLocation() {
        return createStorageLocation(new CreateStorageLocationRequest());
    }

    /**
     * <p>
     * Deletes the specified application along with all associated versions and
     * configurations. The application versions will not be deleted from your
     * Amazon S3 bucket.
     * </p>
     * <note>You cannot delete an application that has a running environment.
     * </note>
     * 
     * @param deleteApplicationRequest
     *        This documentation target is not reported in the API reference.
     * @throws OperationInProgressException
     *         Unable to perform the specified operation because another
     *         operation is already in progress affecting an element in this
     *         activity.
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
                        .marshall(deleteApplicationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified version from the specified application.
     * </p>
     * <note>You cannot delete an application version that is associated with a
     * running environment.</note>
     * 
     * @param deleteApplicationVersionRequest
     *        This documentation target is not reported in the API reference.
     * @throws SourceBundleDeletionException
     *         Unable to delete the Amazon S3 source bundle associated with the
     *         application version, although the application version deleted
     *         successfully.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     * @throws OperationInProgressException
     *         Unable to perform the specified operation because another
     *         operation is already in progress affecting an element in this
     *         activity.
     * @throws S3LocationNotInServiceRegionException
     *         The specified S3 bucket does not belong to the S3 region in which
     *         the service is running.
     */
    @Override
    public void deleteApplicationVersion(
            DeleteApplicationVersionRequest deleteApplicationVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteApplicationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationVersionRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationVersionRequestMarshaller()
                        .marshall(deleteApplicationVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified configuration template.
     * </p>
     * <note>When you launch an environment using a configuration template, the
     * environment gets a copy of the template. You can delete or modify the
     * environment's copy of the template without affecting the running
     * environment.</note>
     * 
     * @param deleteConfigurationTemplateRequest
     *        This documentation target is not reported in the API reference.
     * @throws OperationInProgressException
     *         Unable to perform the specified operation because another
     *         operation is already in progress affecting an element in this
     *         activity.
     */
    @Override
    public void deleteConfigurationTemplate(
            DeleteConfigurationTemplateRequest deleteConfigurationTemplateRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfigurationTemplateRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfigurationTemplateRequestMarshaller()
                        .marshall(deleteConfigurationTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the draft configuration associated with the running environment.
     * </p>
     * <p>
     * Updating a running environment with any configuration changes creates a
     * draft configuration set. You can get the draft configuration using
     * <a>DescribeConfigurationSettings</a> while the update is in progress or
     * if the update fails. The <code>DeploymentStatus</code> for the draft
     * configuration indicates whether the deployment is in process or has
     * failed. The draft configuration remains in existence until it is deleted
     * with this action.
     * </p>
     * 
     * @param deleteEnvironmentConfigurationRequest
     *        This documentation target is not reported in the API reference.
     */
    @Override
    public void deleteEnvironmentConfiguration(
            DeleteEnvironmentConfigurationRequest deleteEnvironmentConfigurationRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteEnvironmentConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEnvironmentConfigurationRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEnvironmentConfigurationRequestMarshaller()
                        .marshall(deleteEnvironmentConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns descriptions for existing application versions.
     * </p>
     * 
     * @param describeApplicationVersionsRequest
     *        Result message containing a list of configuration descriptions.
     * @return Result of the DescribeApplicationVersions operation returned by
     *         the service.
     */
    @Override
    public DescribeApplicationVersionsResult describeApplicationVersions(
            DescribeApplicationVersionsRequest describeApplicationVersionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeApplicationVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationVersionsRequest> request = null;
        Response<DescribeApplicationVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeApplicationVersionsRequestMarshaller()
                        .marshall(describeApplicationVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new DescribeApplicationVersionsResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeApplicationVersionsResult describeApplicationVersions() {
        return describeApplicationVersions(new DescribeApplicationVersionsRequest());
    }

    /**
     * <p>
     * Returns the descriptions of existing applications.
     * </p>
     * 
     * @param describeApplicationsRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the DescribeApplications operation returned by the
     *         service.
     */
    @Override
    public DescribeApplicationsResult describeApplications(
            DescribeApplicationsRequest describeApplicationsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationsRequest> request = null;
        Response<DescribeApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeApplicationsRequestMarshaller()
                        .marshall(describeApplicationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new DescribeApplicationsResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeApplicationsResult describeApplications() {
        return describeApplications(new DescribeApplicationsRequest());
    }

    /**
     * <p>
     * Describes the configuration options that are used in a particular
     * configuration template or environment, or that a specified solution stack
     * defines. The description includes the values the options, their default
     * values, and an indication of the required action on a running environment
     * if an option value is changed.
     * </p>
     * 
     * @param describeConfigurationOptionsRequest
     *        Result message containig a list of application version
     *        descriptions.
     * @return Result of the DescribeConfigurationOptions operation returned by
     *         the service.
     */
    @Override
    public DescribeConfigurationOptionsResult describeConfigurationOptions(
            DescribeConfigurationOptionsRequest describeConfigurationOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConfigurationOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationOptionsRequest> request = null;
        Response<DescribeConfigurationOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationOptionsRequestMarshaller()
                        .marshall(describeConfigurationOptionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new DescribeConfigurationOptionsResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of the settings for the specified configuration
     * set, that is, either a configuration template or the configuration set
     * associated with a running environment.
     * </p>
     * <p>
     * When describing the settings for the configuration set associated with a
     * running environment, it is possible to receive two sets of setting
     * descriptions. One is the deployed configuration set, and the other is a
     * draft configuration of an environment that is either in the process of
     * deployment or that failed to deploy.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li><a>DeleteEnvironmentConfiguration</a></li>
     * </ul>
     * 
     * @param describeConfigurationSettingsRequest
     *        Result message containing all of the configuration settings for a
     *        specified solution stack or configuration template.
     * @return Result of the DescribeConfigurationSettings operation returned by
     *         the service.
     */
    @Override
    public DescribeConfigurationSettingsResult describeConfigurationSettings(
            DescribeConfigurationSettingsRequest describeConfigurationSettingsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConfigurationSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationSettingsRequest> request = null;
        Response<DescribeConfigurationSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationSettingsRequestMarshaller()
                        .marshall(describeConfigurationSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new DescribeConfigurationSettingsResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the overall health of the specified
     * environment. The <b>DescribeEnvironmentHealth</b> operation is only
     * available with AWS Elastic Beanstalk Enhanced Health.
     * </p>
     * 
     * @param describeEnvironmentHealthRequest
     *        See the example below to learn how to create a request body.
     * @return Result of the DescribeEnvironmentHealth operation returned by the
     *         service.
     * @throws InvalidRequestException
     *         The request is invalid, please check parameters and their values
     * @throws ElasticBeanstalkServiceException
     *         null
     */
    @Override
    public DescribeEnvironmentHealthResult describeEnvironmentHealth(
            DescribeEnvironmentHealthRequest describeEnvironmentHealthRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEnvironmentHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEnvironmentHealthRequest> request = null;
        Response<DescribeEnvironmentHealthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEnvironmentHealthRequestMarshaller()
                        .marshall(describeEnvironmentHealthRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new DescribeEnvironmentHealthResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns AWS resources for this environment.
     * </p>
     * 
     * @param describeEnvironmentResourcesRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the DescribeEnvironmentResources operation returned by
     *         the service.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    @Override
    public DescribeEnvironmentResourcesResult describeEnvironmentResources(
            DescribeEnvironmentResourcesRequest describeEnvironmentResourcesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEnvironmentResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEnvironmentResourcesRequest> request = null;
        Response<DescribeEnvironmentResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEnvironmentResourcesRequestMarshaller()
                        .marshall(describeEnvironmentResourcesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new DescribeEnvironmentResourcesResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns descriptions for existing environments.
     * </p>
     * 
     * @param describeEnvironmentsRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the DescribeEnvironments operation returned by the
     *         service.
     */
    @Override
    public DescribeEnvironmentsResult describeEnvironments(
            DescribeEnvironmentsRequest describeEnvironmentsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEnvironmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEnvironmentsRequest> request = null;
        Response<DescribeEnvironmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEnvironmentsRequestMarshaller()
                        .marshall(describeEnvironmentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new DescribeEnvironmentsResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeEnvironmentsResult describeEnvironments() {
        return describeEnvironments(new DescribeEnvironmentsRequest());
    }

    /**
     * <p>
     * Returns list of event descriptions matching criteria up to the last 6
     * weeks.
     * </p>
     * <note> This action returns the most recent 1,000 events from the
     * specified <code>NextToken</code>. </note>
     * 
     * @param describeEventsRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the DescribeEvents operation returned by the service.
     */
    @Override
    public DescribeEventsResult describeEvents(
            DescribeEventsRequest describeEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsRequest> request = null;
        Response<DescribeEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventsRequestMarshaller()
                        .marshall(describeEventsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new DescribeEventsResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeEventsResult describeEvents() {
        return describeEvents(new DescribeEventsRequest());
    }

    /**
     * <p>
     * Returns more detailed information about the health of the specified
     * instances (for example, CPU utilization, load average, and causes). The
     * <b>DescribeInstancesHealth</b> operation is only available with AWS
     * Elastic Beanstalk Enhanced Health.
     * </p>
     * 
     * @param describeInstancesHealthRequest
     *        See the example below to learn how to create a request body.
     * @return Result of the DescribeInstancesHealth operation returned by the
     *         service.
     * @throws InvalidRequestException
     *         The request is invalid, please check parameters and their values
     * @throws ElasticBeanstalkServiceException
     *         null
     */
    @Override
    public DescribeInstancesHealthResult describeInstancesHealth(
            DescribeInstancesHealthRequest describeInstancesHealthRequest) {
        ExecutionContext executionContext = createExecutionContext(describeInstancesHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstancesHealthRequest> request = null;
        Response<DescribeInstancesHealthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstancesHealthRequestMarshaller()
                        .marshall(describeInstancesHealthRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new DescribeInstancesHealthResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the available solution stack names.
     * </p>
     * 
     * @param listAvailableSolutionStacksRequest
     *        null
     * @return Result of the ListAvailableSolutionStacks operation returned by
     *         the service.
     */
    @Override
    public ListAvailableSolutionStacksResult listAvailableSolutionStacks(
            ListAvailableSolutionStacksRequest listAvailableSolutionStacksRequest) {
        ExecutionContext executionContext = createExecutionContext(listAvailableSolutionStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAvailableSolutionStacksRequest> request = null;
        Response<ListAvailableSolutionStacksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAvailableSolutionStacksRequestMarshaller()
                        .marshall(listAvailableSolutionStacksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new ListAvailableSolutionStacksResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListAvailableSolutionStacksResult listAvailableSolutionStacks() {
        return listAvailableSolutionStacks(new ListAvailableSolutionStacksRequest());
    }

    /**
     * <p>
     * Deletes and recreates all of the AWS resources (for example: the Auto
     * Scaling group, load balancer, etc.) for a specified environment and
     * forces a restart.
     * </p>
     * 
     * @param rebuildEnvironmentRequest
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    @Override
    public void rebuildEnvironment(
            RebuildEnvironmentRequest rebuildEnvironmentRequest) {
        ExecutionContext executionContext = createExecutionContext(rebuildEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebuildEnvironmentRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebuildEnvironmentRequestMarshaller()
                        .marshall(rebuildEnvironmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates a request to compile the specified type of information of the
     * deployed environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>tail</code> compiles the last
     * lines from the application server log files of every Amazon EC2 instance
     * in your environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>bundle</code> compresses the
     * application server log files for every Amazon EC2 instance into a
     * <code>.zip</code> file. Legacy and .NET containers do not support bundle
     * logs.
     * </p>
     * <p>
     * Use <a>RetrieveEnvironmentInfo</a> to obtain the set of logs.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li><a>RetrieveEnvironmentInfo</a></li>
     * </ul>
     * 
     * @param requestEnvironmentInfoRequest
     *        This documentation target is not reported in the API reference.
     */
    @Override
    public void requestEnvironmentInfo(
            RequestEnvironmentInfoRequest requestEnvironmentInfoRequest) {
        ExecutionContext executionContext = createExecutionContext(requestEnvironmentInfoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RequestEnvironmentInfoRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RequestEnvironmentInfoRequestMarshaller()
                        .marshall(requestEnvironmentInfoRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Causes the environment to restart the application container server
     * running on each Amazon EC2 instance.
     * </p>
     * 
     * @param restartAppServerRequest
     */
    @Override
    public void restartAppServer(RestartAppServerRequest restartAppServerRequest) {
        ExecutionContext executionContext = createExecutionContext(restartAppServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestartAppServerRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestartAppServerRequestMarshaller()
                        .marshall(restartAppServerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the compiled information from a <a>RequestEnvironmentInfo</a>
     * request.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li><a>RequestEnvironmentInfo</a></li>
     * </ul>
     * 
     * @param retrieveEnvironmentInfoRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the RetrieveEnvironmentInfo operation returned by the
     *         service.
     */
    @Override
    public RetrieveEnvironmentInfoResult retrieveEnvironmentInfo(
            RetrieveEnvironmentInfoRequest retrieveEnvironmentInfoRequest) {
        ExecutionContext executionContext = createExecutionContext(retrieveEnvironmentInfoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetrieveEnvironmentInfoRequest> request = null;
        Response<RetrieveEnvironmentInfoResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetrieveEnvironmentInfoRequestMarshaller()
                        .marshall(retrieveEnvironmentInfoRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new RetrieveEnvironmentInfoResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Swaps the CNAMEs of two environments.
     * </p>
     * 
     * @param swapEnvironmentCNAMEsRequest
     *        Swaps the CNAMEs of two environments.
     */
    @Override
    public void swapEnvironmentCNAMEs(
            SwapEnvironmentCNAMEsRequest swapEnvironmentCNAMEsRequest) {
        ExecutionContext executionContext = createExecutionContext(swapEnvironmentCNAMEsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SwapEnvironmentCNAMEsRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SwapEnvironmentCNAMEsRequestMarshaller()
                        .marshall(swapEnvironmentCNAMEsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public void swapEnvironmentCNAMEs() {
        swapEnvironmentCNAMEs(new SwapEnvironmentCNAMEsRequest());
    }

    /**
     * <p>
     * Terminates the specified environment.
     * </p>
     * 
     * @param terminateEnvironmentRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the TerminateEnvironment operation returned by the
     *         service.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    @Override
    public TerminateEnvironmentResult terminateEnvironment(
            TerminateEnvironmentRequest terminateEnvironmentRequest) {
        ExecutionContext executionContext = createExecutionContext(terminateEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateEnvironmentRequest> request = null;
        Response<TerminateEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateEnvironmentRequestMarshaller()
                        .marshall(terminateEnvironmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new TerminateEnvironmentResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified application to have the specified properties.
     * </p>
     * <note> If a property (for example, <code>description</code>) is not
     * provided, the value remains unchanged. To clear these properties, specify
     * an empty string. </note>
     * 
     * @param updateApplicationRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the UpdateApplication operation returned by the
     *         service.
     */
    @Override
    public UpdateApplicationResult updateApplication(
            UpdateApplicationRequest updateApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<UpdateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestMarshaller()
                        .marshall(updateApplicationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new UpdateApplicationResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified application version to have the specified
     * properties.
     * </p>
     * <note> If a property (for example, <code>description</code>) is not
     * provided, the value remains unchanged. To clear properties, specify an
     * empty string. </note>
     * 
     * @param updateApplicationVersionRequest
     * @return Result of the UpdateApplicationVersion operation returned by the
     *         service.
     */
    @Override
    public UpdateApplicationVersionResult updateApplicationVersion(
            UpdateApplicationVersionRequest updateApplicationVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(updateApplicationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationVersionRequest> request = null;
        Response<UpdateApplicationVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationVersionRequestMarshaller()
                        .marshall(updateApplicationVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new UpdateApplicationVersionResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified configuration template to have the specified
     * properties or configuration option values.
     * </p>
     * <note> If a property (for example, <code>ApplicationName</code>) is not
     * provided, its value remains unchanged. To clear such properties, specify
     * an empty string. </note>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li><a>DescribeConfigurationOptions</a></li>
     * </ul>
     * 
     * @param updateConfigurationTemplateRequest
     *        The result message containing the options for the specified
     *        solution stack.
     * @return Result of the UpdateConfigurationTemplate operation returned by
     *         the service.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    @Override
    public UpdateConfigurationTemplateResult updateConfigurationTemplate(
            UpdateConfigurationTemplateRequest updateConfigurationTemplateRequest) {
        ExecutionContext executionContext = createExecutionContext(updateConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfigurationTemplateRequest> request = null;
        Response<UpdateConfigurationTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConfigurationTemplateRequestMarshaller()
                        .marshall(updateConfigurationTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new UpdateConfigurationTemplateResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the environment description, deploys a new application version,
     * updates the configuration settings to an entirely new configuration
     * template, or updates select configuration option values in the running
     * environment.
     * </p>
     * <p>
     * Attempting to update both the release and configuration is not allowed
     * and AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error.
     * </p>
     * <p>
     * When updating the configuration settings to a new template or individual
     * settings, a draft configuration is created and
     * <a>DescribeConfigurationSettings</a> for this environment returns two
     * setting descriptions with different <code>DeploymentStatus</code> values.
     * </p>
     * 
     * @param updateEnvironmentRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the UpdateEnvironment operation returned by the
     *         service.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    @Override
    public UpdateEnvironmentResult updateEnvironment(
            UpdateEnvironmentRequest updateEnvironmentRequest) {
        ExecutionContext executionContext = createExecutionContext(updateEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnvironmentRequest> request = null;
        Response<UpdateEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEnvironmentRequestMarshaller()
                        .marshall(updateEnvironmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new UpdateEnvironmentResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Takes a set of configuration settings and either a configuration template
     * or environment, and determines whether those values are valid.
     * </p>
     * <p>
     * This action returns a list of messages indicating any errors or warnings
     * associated with the selection of option values.
     * </p>
     * 
     * @param validateConfigurationSettingsRequest
     *        A list of validation messages for a specified configuration
     *        template.
     * @return Result of the ValidateConfigurationSettings operation returned by
     *         the service.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    @Override
    public ValidateConfigurationSettingsResult validateConfigurationSettings(
            ValidateConfigurationSettingsRequest validateConfigurationSettingsRequest) {
        ExecutionContext executionContext = createExecutionContext(validateConfigurationSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidateConfigurationSettingsRequest> request = null;
        Response<ValidateConfigurationSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ValidateConfigurationSettingsRequestMarshaller()
                        .marshall(validateConfigurationSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new ValidateConfigurationSettingsResultStaxUnmarshaller(),
                    executionContext);

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
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
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

        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(
                unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(
                exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}

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
package com.amazonaws.services.elasticsearch;

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

import com.amazonaws.services.elasticsearch.model.*;
import com.amazonaws.services.elasticsearch.model.transform.*;

/**
 * Client for accessing Amazon Elasticsearch Service. All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <fullname>Amazon Elasticsearch Configuration Service</fullname>
 * <p>
 * Use the Amazon Elasticsearch configuration API to create, configure, and
 * manage Elasticsearch domains.
 * </p>
 * <p>
 * The endpoint for configuration service requests is region-specific:
 * es.<i>region</i>.amazonaws.com. For example, es.us-east-1.amazonaws.com. For
 * a current list of supported regions and endpoints, see <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/rande.html#cloudsearch_region"
 * target="_blank">Regions and Endpoints</a>.
 * </p>
 */
public class AWSElasticsearchClient extends AmazonWebServiceClient implements
        AWSElasticsearch {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSElasticsearch.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "es";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "es";

    /**
     * List of exception unmarshallers for all Amazon Elasticsearch Service
     * exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on Amazon Elasticsearch
     * Service. A credentials provider chain will be used that searches for
     * credentials in this order:
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
    public AWSElasticsearchClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elasticsearch
     * Service. A credentials provider chain will be used that searches for
     * credentials in this order:
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
     *        connects to Amazon Elasticsearch Service (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSElasticsearchClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elasticsearch
     * Service using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AWSElasticsearchClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elasticsearch
     * Service using the specified AWS account credentials and client
     * configuration options.
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
     *        connects to Amazon Elasticsearch Service (ex: proxy settings,
     *        retry counts, etc.).
     */
    public AWSElasticsearchClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elasticsearch
     * Service using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AWSElasticsearchClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elasticsearch
     * Service using the specified AWS account credentials provider and client
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
     *        connects to Amazon Elasticsearch Service (ex: proxy settings,
     *        retry counts, etc.).
     */
    public AWSElasticsearchClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elasticsearch
     * Service using the specified AWS account credentials provider, client
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
     *        connects to Amazon Elasticsearch Service (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSElasticsearchClient(
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
                        com.amazonaws.services.elasticsearch.model.ResourceAlreadyExistsException.class,
                        "ResourceAlreadyExistsException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.elasticsearch.model.LimitExceededException.class,
                        "LimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.elasticsearch.model.DisabledOperationException.class,
                        "DisabledOperationException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.elasticsearch.model.ValidationException.class,
                        "ValidationException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.elasticsearch.model.BaseException.class,
                "BaseException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.elasticsearch.model.ResourceNotFoundException.class,
                        "ResourceNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.elasticsearch.model.InvalidTypeException.class,
                        "InvalidTypeException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.elasticsearch.model.InternalException.class,
                        "InternalException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://es.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/elasticsearch/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/elasticsearch/request.handler2s"));
    }

    /**
     * <p>
     * Attaches tags to an existing Elasticsearch domain. Tags are a set of
     * case-sensitive key value pairs. An Elasticsearch domain may have up to 10
     * tags. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-awsresorcetagging"
     * target="_blank"> Tagging Amazon Elasticsearch Service Domains for more
     * information.</a>
     * </p>
     * 
     * @param addTagsRequest
     *        Container for the parameters to the <code><a>AddTags</a></code>
     *        operation. Specify the tags that you want to attach to the
     *        Elasticsearch domain.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or
     *         sub-resources. Gives http status code of 409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http
     *         status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error,
     *         exception or failure (the failure is internal to the service) .
     *         Gives http status code of 500.
     * @sample AWSElasticsearch.AddTags
     */
    @Override
    public void addTags(AddTagsRequest addTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(addTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsRequestMarshaller().marshall(super
                        .beforeMarshalling(addTagsRequest));
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
     * Creates a new Elasticsearch domain. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     * target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon
     * Elasticsearch Service Developer Guide</i>.
     * </p>
     * 
     * @param createElasticsearchDomainRequest
     * @return Result of the CreateElasticsearchDomain operation returned by the
     *         service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not
     *         supported operation. Gives http status code of 409.
     * @throws InternalException
     *         The request processing has failed because of an unknown error,
     *         exception or failure (the failure is internal to the service) .
     *         Gives http status code of 500.
     * @throws InvalidTypeException
     *         An exception for trying to create or access sub-resource that is
     *         either invalid or not supported. Gives http status code of 409.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or
     *         sub-resources. Gives http status code of 409.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists. Gives
     *         http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http
     *         status code of 400.
     * @sample AWSElasticsearch.CreateElasticsearchDomain
     */
    @Override
    public CreateElasticsearchDomainResult createElasticsearchDomain(
            CreateElasticsearchDomainRequest createElasticsearchDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(createElasticsearchDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateElasticsearchDomainRequest> request = null;
        Response<CreateElasticsearchDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateElasticsearchDomainRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createElasticsearchDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateElasticsearchDomainResult> responseHandler = new JsonResponseHandler<CreateElasticsearchDomainResult>(
                    new CreateElasticsearchDomainResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently deletes the specified Elasticsearch domain and all of its
     * data. Once a domain is deleted, it cannot be recovered.
     * </p>
     * 
     * @param deleteElasticsearchDomainRequest
     *        Container for the parameters to the
     *        <code><a>DeleteElasticsearchDomain</a></code> operation. Specifies
     *        the name of the Elasticsearch domain that you want to delete.
     * @return Result of the DeleteElasticsearchDomain operation returned by the
     *         service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error,
     *         exception or failure (the failure is internal to the service) .
     *         Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not
     *         exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http
     *         status code of 400.
     * @sample AWSElasticsearch.DeleteElasticsearchDomain
     */
    @Override
    public DeleteElasticsearchDomainResult deleteElasticsearchDomain(
            DeleteElasticsearchDomainRequest deleteElasticsearchDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteElasticsearchDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteElasticsearchDomainRequest> request = null;
        Response<DeleteElasticsearchDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteElasticsearchDomainRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteElasticsearchDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteElasticsearchDomainResult> responseHandler = new JsonResponseHandler<DeleteElasticsearchDomainResult>(
                    new DeleteElasticsearchDomainResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns domain configuration information about the specified
     * Elasticsearch domain, including the domain ID, domain endpoint, and
     * domain ARN.
     * </p>
     * 
     * @param describeElasticsearchDomainRequest
     *        Container for the parameters to the
     *        <code><a>DescribeElasticsearchDomain</a></code> operation.
     * @return Result of the DescribeElasticsearchDomain operation returned by
     *         the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error,
     *         exception or failure (the failure is internal to the service) .
     *         Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not
     *         exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http
     *         status code of 400.
     * @sample AWSElasticsearch.DescribeElasticsearchDomain
     */
    @Override
    public DescribeElasticsearchDomainResult describeElasticsearchDomain(
            DescribeElasticsearchDomainRequest describeElasticsearchDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(describeElasticsearchDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticsearchDomainRequest> request = null;
        Response<DescribeElasticsearchDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticsearchDomainRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeElasticsearchDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeElasticsearchDomainResult> responseHandler = new JsonResponseHandler<DescribeElasticsearchDomainResult>(
                    new DescribeElasticsearchDomainResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides cluster configuration information about the specified
     * Elasticsearch domain, such as the state, creation date, update version,
     * and update date for cluster options.
     * </p>
     * 
     * @param describeElasticsearchDomainConfigRequest
     *        Container for the parameters to the
     *        <code>DescribeElasticsearchDomainConfig</code> operation.
     *        Specifies the domain name for which you want configuration
     *        information.
     * @return Result of the DescribeElasticsearchDomainConfig operation
     *         returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error,
     *         exception or failure (the failure is internal to the service) .
     *         Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not
     *         exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http
     *         status code of 400.
     * @sample AWSElasticsearch.DescribeElasticsearchDomainConfig
     */
    @Override
    public DescribeElasticsearchDomainConfigResult describeElasticsearchDomainConfig(
            DescribeElasticsearchDomainConfigRequest describeElasticsearchDomainConfigRequest) {
        ExecutionContext executionContext = createExecutionContext(describeElasticsearchDomainConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticsearchDomainConfigRequest> request = null;
        Response<DescribeElasticsearchDomainConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticsearchDomainConfigRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeElasticsearchDomainConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeElasticsearchDomainConfigResult> responseHandler = new JsonResponseHandler<DescribeElasticsearchDomainConfigResult>(
                    new DescribeElasticsearchDomainConfigResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns domain configuration information about the specified
     * Elasticsearch domains, including the domain ID, domain endpoint, and
     * domain ARN.
     * </p>
     * 
     * @param describeElasticsearchDomainsRequest
     *        Container for the parameters to the
     *        <code><a>DescribeElasticsearchDomains</a></code> operation. By
     *        default, the API returns the status of all Elasticsearch domains.
     * @return Result of the DescribeElasticsearchDomains operation returned by
     *         the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error,
     *         exception or failure (the failure is internal to the service) .
     *         Gives http status code of 500.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http
     *         status code of 400.
     * @sample AWSElasticsearch.DescribeElasticsearchDomains
     */
    @Override
    public DescribeElasticsearchDomainsResult describeElasticsearchDomains(
            DescribeElasticsearchDomainsRequest describeElasticsearchDomainsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeElasticsearchDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticsearchDomainsRequest> request = null;
        Response<DescribeElasticsearchDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticsearchDomainsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeElasticsearchDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeElasticsearchDomainsResult> responseHandler = new JsonResponseHandler<DescribeElasticsearchDomainsResult>(
                    new DescribeElasticsearchDomainsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the name of all Elasticsearch domains owned by the current user's
     * account.
     * </p>
     * 
     * @param listDomainNamesRequest
     * @return Result of the ListDomainNames operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http
     *         status code of 400.
     * @sample AWSElasticsearch.ListDomainNames
     */
    @Override
    public ListDomainNamesResult listDomainNames(
            ListDomainNamesRequest listDomainNamesRequest) {
        ExecutionContext executionContext = createExecutionContext(listDomainNamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainNamesRequest> request = null;
        Response<ListDomainNamesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainNamesRequestMarshaller().marshall(super
                        .beforeMarshalling(listDomainNamesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListDomainNamesResult> responseHandler = new JsonResponseHandler<ListDomainNamesResult>(
                    new ListDomainNamesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all tags for the given Elasticsearch domain.
     * </p>
     * 
     * @param listTagsRequest
     *        Container for the parameters to the <code><a>ListTags</a></code>
     *        operation. Specify the <code>ARN</code> for the Elasticsearch
     *        domain to which the tags are attached that you want to view are
     *        attached.
     * @return Result of the ListTags operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not
     *         exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http
     *         status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error,
     *         exception or failure (the failure is internal to the service) .
     *         Gives http status code of 500.
     * @sample AWSElasticsearch.ListTags
     */
    @Override
    public ListTagsResult listTags(ListTagsRequest listTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestMarshaller().marshall(super
                        .beforeMarshalling(listTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListTagsResult> responseHandler = new JsonResponseHandler<ListTagsResult>(
                    new ListTagsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified set of tags from the specified Elasticsearch
     * domain.
     * </p>
     * 
     * @param removeTagsRequest
     *        Container for the parameters to the <code><a>RemoveTags</a></code>
     *        operation. Specify the <code>ARN</code> for the Elasticsearch
     *        domain from which you want to remove the specified
     *        <code>TagKey</code>.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http
     *         status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error,
     *         exception or failure (the failure is internal to the service) .
     *         Gives http status code of 500.
     * @sample AWSElasticsearch.RemoveTags
     */
    @Override
    public void removeTags(RemoveTagsRequest removeTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(removeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsRequestMarshaller().marshall(super
                        .beforeMarshalling(removeTagsRequest));
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
     * Modifies the cluster configuration of the specified Elasticsearch domain,
     * setting as setting the instance type and the number of instances.
     * </p>
     * 
     * @param updateElasticsearchDomainConfigRequest
     *        Container for the parameters to the
     *        <code><a>UpdateElasticsearchDomain</a></code> operation. Specifies
     *        the type and number of instances in the domain cluster.
     * @return Result of the UpdateElasticsearchDomainConfig operation returned
     *         by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error,
     *         exception or failure (the failure is internal to the service) .
     *         Gives http status code of 500.
     * @throws InvalidTypeException
     *         An exception for trying to create or access sub-resource that is
     *         either invalid or not supported. Gives http status code of 409.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or
     *         sub-resources. Gives http status code of 409.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not
     *         exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http
     *         status code of 400.
     * @sample AWSElasticsearch.UpdateElasticsearchDomainConfig
     */
    @Override
    public UpdateElasticsearchDomainConfigResult updateElasticsearchDomainConfig(
            UpdateElasticsearchDomainConfigRequest updateElasticsearchDomainConfigRequest) {
        ExecutionContext executionContext = createExecutionContext(updateElasticsearchDomainConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateElasticsearchDomainConfigRequest> request = null;
        Response<UpdateElasticsearchDomainConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateElasticsearchDomainConfigRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateElasticsearchDomainConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateElasticsearchDomainConfigResult> responseHandler = new JsonResponseHandler<UpdateElasticsearchDomainConfigResult>(
                    new UpdateElasticsearchDomainConfigResultJsonUnmarshaller());
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

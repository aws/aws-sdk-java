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
package com.amazonaws.services.glacier;

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

import com.amazonaws.services.glacier.AmazonGlacierClientBuilder;
import com.amazonaws.services.glacier.waiters.AmazonGlacierWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.glacier.model.*;
import com.amazonaws.services.glacier.model.transform.*;

/**
 * Client for accessing Amazon Glacier. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Amazon Glacier is a storage solution for "cold data."
 * </p>
 * <p>
 * Amazon Glacier is an extremely low-cost storage service that provides secure, durable, and easy-to-use storage for
 * data backup and archival. With Amazon Glacier, customers can store their data cost effectively for months, years, or
 * decades. Amazon Glacier also enables customers to offload the administrative burdens of operating and scaling storage
 * to AWS, so they don't have to worry about capacity planning, hardware provisioning, data replication, hardware
 * failure and recovery, or time-consuming hardware migrations.
 * </p>
 * <p>
 * Amazon Glacier is a great storage choice when low storage cost is paramount and your data is rarely retrieved. If
 * your application requires fast or frequent access to your data, consider using Amazon S3. For more information, see
 * <a href="http://aws.amazon.com/s3/">Amazon Simple Storage Service (Amazon S3)</a>.
 * </p>
 * <p>
 * You can store any kind of data in any format. There is no maximum limit on the total amount of data you can store in
 * Amazon Glacier.
 * </p>
 * <p>
 * If you are a first-time user of Amazon Glacier, we recommend that you begin by reading the following sections in the
 * <i>Amazon Glacier Developer Guide</i>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/introduction.html">What is Amazon Glacier</a> - This
 * section of the Developer Guide describes the underlying data model, the operations it supports, and the AWS SDKs that
 * you can use to interact with the service.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/amazon-glacier-getting-started.html">Getting Started
 * with Amazon Glacier</a> - The Getting Started section walks you through the process of creating a vault, uploading
 * archives, creating jobs to download archives, retrieving the job output, and deleting archives.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonGlacierClient extends AmazonWebServiceClient implements AmazonGlacier {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonGlacier.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "glacier";

    private volatile AmazonGlacierWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestTimeoutException").withModeledClass(
                                    com.amazonaws.services.glacier.model.RequestTimeoutException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MissingParameterValueException").withModeledClass(
                                    com.amazonaws.services.glacier.model.MissingParameterValueException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withModeledClass(
                                    com.amazonaws.services.glacier.model.InvalidParameterValueException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientCapacityException").withModeledClass(
                                    com.amazonaws.services.glacier.model.InsufficientCapacityException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.glacier.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PolicyEnforcedException").withModeledClass(
                                    com.amazonaws.services.glacier.model.PolicyEnforcedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.glacier.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.glacier.model.ServiceUnavailableException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.glacier.model.AmazonGlacierException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Glacier. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     * @deprecated use {@link AmazonGlacierClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonGlacierClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Glacier. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon Glacier (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonGlacierClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonGlacierClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Glacier using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonGlacierClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonGlacierClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonGlacierClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Glacier using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Glacier (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonGlacierClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonGlacierClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonGlacierClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Glacier using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonGlacierClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonGlacierClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Glacier using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Glacier (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonGlacierClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonGlacierClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonGlacierClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Glacier using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Glacier (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonGlacierClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonGlacierClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonGlacierClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonGlacierClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonGlacierClientBuilder builder() {
        return AmazonGlacierClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Glacier using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonGlacierClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Glacier using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonGlacierClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://glacier.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/glacier/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/glacier/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * This operation aborts a multipart upload identified by the upload ID.
     * </p>
     * <p>
     * After the Abort Multipart Upload request succeeds, you cannot upload any more parts to the multipart upload or
     * complete the multipart upload. Aborting a completed upload fails. However, aborting an already-aborted upload
     * will succeed, for a short time. For more information about uploading a part and completing a multipart upload,
     * see <a>UploadMultipartPart</a> and <a>CompleteMultipartUpload</a>.
     * </p>
     * <p>
     * This operation is idempotent.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html">Working with Archives in
     * Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-abort-upload.html">Abort Multipart
     * Upload</a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param abortMultipartUploadRequest
     *        Provides options to abort a multipart upload identified by the upload ID.</p>
     *        <p>
     *        For information about the underlying REST API, see <a
     *        href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-abort-upload.html">Abort Multipart
     *        Upload</a>. For conceptual information, see <a
     *        href="http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html">Working with
     *        Archives in Amazon Glacier</a>.
     * @return Result of the AbortMultipartUpload operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.AbortMultipartUpload
     */
    @Override
    public AbortMultipartUploadResult abortMultipartUpload(AbortMultipartUploadRequest request) {
        request = beforeClientExecution(request);
        return executeAbortMultipartUpload(request);
    }

    @SdkInternalApi
    final AbortMultipartUploadResult executeAbortMultipartUpload(AbortMultipartUploadRequest abortMultipartUploadRequest) {

        ExecutionContext executionContext = createExecutionContext(abortMultipartUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AbortMultipartUploadRequest> request = null;
        Response<AbortMultipartUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AbortMultipartUploadRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(abortMultipartUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AbortMultipartUpload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AbortMultipartUploadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AbortMultipartUploadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation aborts the vault locking process if the vault lock is not in the <code>Locked</code> state. If the
     * vault lock is in the <code>Locked</code> state when this operation is requested, the operation returns an
     * <code>AccessDeniedException</code> error. Aborting the vault locking process removes the vault lock policy from
     * the specified vault.
     * </p>
     * <p>
     * A vault lock is put into the <code>InProgress</code> state by calling <a>InitiateVaultLock</a>. A vault lock is
     * put into the <code>Locked</code> state by calling <a>CompleteVaultLock</a>. You can get the state of a vault lock
     * by calling <a>GetVaultLock</a>. For more information about the vault locking process, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html">Amazon Glacier Vault Lock</a>. For
     * more information about vault lock policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock-policy.html">Amazon Glacier Access Control
     * with Vault Lock Policies</a>.
     * </p>
     * <p>
     * This operation is idempotent. You can successfully invoke this operation multiple times, if the vault lock is in
     * the <code>InProgress</code> state or if there is no policy associated with the vault.
     * </p>
     * 
     * @param abortVaultLockRequest
     *        The input values for <code>AbortVaultLock</code>.
     * @return Result of the AbortVaultLock operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.AbortVaultLock
     */
    @Override
    public AbortVaultLockResult abortVaultLock(AbortVaultLockRequest request) {
        request = beforeClientExecution(request);
        return executeAbortVaultLock(request);
    }

    @SdkInternalApi
    final AbortVaultLockResult executeAbortVaultLock(AbortVaultLockRequest abortVaultLockRequest) {

        ExecutionContext executionContext = createExecutionContext(abortVaultLockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AbortVaultLockRequest> request = null;
        Response<AbortVaultLockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AbortVaultLockRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(abortVaultLockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AbortVaultLock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AbortVaultLockResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AbortVaultLockResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation adds the specified tags to a vault. Each tag is composed of a key and a value. Each vault can have
     * up to 10 tags. If your request would cause the tag limit for the vault to be exceeded, the operation throws the
     * <code>LimitExceededException</code> error. If a tag already exists on the vault under a specified key, the
     * existing key value will be overwritten. For more information about tags, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/tagging.html">Tagging Amazon Glacier Resources</a>.
     * </p>
     * 
     * @param addTagsToVaultRequest
     *        The input values for <code>AddTagsToVault</code>.
     * @return Result of the AddTagsToVault operation returned by the service.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws LimitExceededException
     *         Returned if the request results in a vault or account limit being exceeded.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.AddTagsToVault
     */
    @Override
    public AddTagsToVaultResult addTagsToVault(AddTagsToVaultRequest request) {
        request = beforeClientExecution(request);
        return executeAddTagsToVault(request);
    }

    @SdkInternalApi
    final AddTagsToVaultResult executeAddTagsToVault(AddTagsToVaultRequest addTagsToVaultRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsToVaultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToVaultRequest> request = null;
        Response<AddTagsToVaultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToVaultRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addTagsToVaultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTagsToVault");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddTagsToVaultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddTagsToVaultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * You call this operation to inform Amazon Glacier that all the archive parts have been uploaded and that Amazon
     * Glacier can now assemble the archive from the uploaded parts. After assembling and saving the archive to the
     * vault, Amazon Glacier returns the URI path of the newly created archive resource. Using the URI path, you can
     * then access the archive. After you upload an archive, you should save the archive ID returned to retrieve the
     * archive at a later point. You can also get the vault inventory to obtain a list of archive IDs in a vault. For
     * more information, see <a>InitiateJob</a>.
     * </p>
     * <p>
     * In the request, you must include the computed SHA256 tree hash of the entire archive you have uploaded. For
     * information about computing a SHA256 tree hash, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/checksum-calculations.html">Computing Checksums</a>. On
     * the server side, Amazon Glacier also constructs the SHA256 tree hash of the assembled archive. If the values
     * match, Amazon Glacier saves the archive to the vault; otherwise, it returns an error, and the operation fails.
     * The <a>ListParts</a> operation returns a list of parts uploaded for a specific multipart upload. It includes
     * checksum information for each uploaded part that can be used to debug a bad checksum issue.
     * </p>
     * <p>
     * Additionally, Amazon Glacier also checks for any missing content ranges when assembling the archive, if missing
     * content ranges are found, Amazon Glacier returns an error and the operation fails.
     * </p>
     * <p>
     * Complete Multipart Upload is an idempotent operation. After your first successful complete multipart upload, if
     * you call the operation again within a short period, the operation will succeed and return the same archive ID.
     * This is useful in the event you experience a network issue that causes an aborted connection or receive a 500
     * server error, in which case you can repeat your Complete Multipart Upload request and get the same archive ID
     * without creating duplicate archives. Note, however, that after the multipart upload completes, you cannot call
     * the List Parts operation and the multipart upload will not appear in List Multipart Uploads response, even if
     * idempotent complete is possible.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/uploading-archive-mpu.html">Uploading Large Archives in
     * Parts (Multipart Upload)</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-complete-upload.html">Complete Multipart
     * Upload</a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param completeMultipartUploadRequest
     *        Provides options to complete a multipart upload operation. This informs Amazon Glacier that all the
     *        archive parts have been uploaded and Amazon Glacier can now assemble the archive from the uploaded parts.
     *        After assembling and saving the archive to the vault, Amazon Glacier returns the URI path of the newly
     *        created archive resource.
     * @return Result of the CompleteMultipartUpload operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.CompleteMultipartUpload
     */
    @Override
    public CompleteMultipartUploadResult completeMultipartUpload(CompleteMultipartUploadRequest request) {
        request = beforeClientExecution(request);
        return executeCompleteMultipartUpload(request);
    }

    @SdkInternalApi
    final CompleteMultipartUploadResult executeCompleteMultipartUpload(CompleteMultipartUploadRequest completeMultipartUploadRequest) {

        ExecutionContext executionContext = createExecutionContext(completeMultipartUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CompleteMultipartUploadRequest> request = null;
        Response<CompleteMultipartUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CompleteMultipartUploadRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(completeMultipartUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CompleteMultipartUpload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CompleteMultipartUploadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CompleteMultipartUploadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation completes the vault locking process by transitioning the vault lock from the
     * <code>InProgress</code> state to the <code>Locked</code> state, which causes the vault lock policy to become
     * unchangeable. A vault lock is put into the <code>InProgress</code> state by calling <a>InitiateVaultLock</a>. You
     * can obtain the state of the vault lock by calling <a>GetVaultLock</a>. For more information about the vault
     * locking process, <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html">Amazon Glacier
     * Vault Lock</a>.
     * </p>
     * <p>
     * This operation is idempotent. This request is always successful if the vault lock is in the <code>Locked</code>
     * state and the provided lock ID matches the lock ID originally used to lock the vault.
     * </p>
     * <p>
     * If an invalid lock ID is passed in the request when the vault lock is in the <code>Locked</code> state, the
     * operation returns an <code>AccessDeniedException</code> error. If an invalid lock ID is passed in the request
     * when the vault lock is in the <code>InProgress</code> state, the operation throws an
     * <code>InvalidParameter</code> error.
     * </p>
     * 
     * @param completeVaultLockRequest
     *        The input values for <code>CompleteVaultLock</code>.
     * @return Result of the CompleteVaultLock operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.CompleteVaultLock
     */
    @Override
    public CompleteVaultLockResult completeVaultLock(CompleteVaultLockRequest request) {
        request = beforeClientExecution(request);
        return executeCompleteVaultLock(request);
    }

    @SdkInternalApi
    final CompleteVaultLockResult executeCompleteVaultLock(CompleteVaultLockRequest completeVaultLockRequest) {

        ExecutionContext executionContext = createExecutionContext(completeVaultLockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CompleteVaultLockRequest> request = null;
        Response<CompleteVaultLockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CompleteVaultLockRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(completeVaultLockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CompleteVaultLock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CompleteVaultLockResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CompleteVaultLockResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation creates a new vault with the specified name. The name of the vault must be unique within a region
     * for an AWS account. You can create up to 1,000 vaults per account. If you need to create more vaults, contact
     * Amazon Glacier.
     * </p>
     * <p>
     * You must use the following guidelines when naming a vault.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Names can be between 1 and 255 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is idempotent.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/creating-vaults.html">Creating a Vault in Amazon
     * Glacier</a> and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-put.html">Create Vault
     * </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param createVaultRequest
     *        Provides options to create a vault.
     * @return Result of the CreateVault operation returned by the service.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @throws LimitExceededException
     *         Returned if the request results in a vault or account limit being exceeded.
     * @sample AmazonGlacier.CreateVault
     */
    @Override
    public CreateVaultResult createVault(CreateVaultRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVault(request);
    }

    @SdkInternalApi
    final CreateVaultResult executeCreateVault(CreateVaultRequest createVaultRequest) {

        ExecutionContext executionContext = createExecutionContext(createVaultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVaultRequest> request = null;
        Response<CreateVaultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVaultRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVaultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVault");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVaultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVaultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation deletes an archive from a vault. Subsequent requests to initiate a retrieval of this archive will
     * fail. Archive retrievals that are in progress for this archive ID may or may not succeed according to the
     * following scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the archive retrieval job is actively preparing the data for download when Amazon Glacier receives the delete
     * archive request, the archival retrieval operation might fail.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the archive retrieval job has successfully prepared the archive for download when Amazon Glacier receives the
     * delete archive request, you will be able to download the output.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is idempotent. Attempting to delete an already-deleted archive does not result in an error.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/deleting-an-archive.html">Deleting an Archive in Amazon
     * Glacier</a> and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-delete.html">Delete
     * Archive</a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param deleteArchiveRequest
     *        Provides options for deleting an archive from an Amazon Glacier vault.
     * @return Result of the DeleteArchive operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.DeleteArchive
     */
    @Override
    public DeleteArchiveResult deleteArchive(DeleteArchiveRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteArchive(request);
    }

    @SdkInternalApi
    final DeleteArchiveResult executeDeleteArchive(DeleteArchiveRequest deleteArchiveRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteArchiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteArchiveRequest> request = null;
        Response<DeleteArchiveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteArchiveRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteArchiveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteArchive");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteArchiveResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteArchiveResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation deletes a vault. Amazon Glacier will delete a vault only if there are no archives in the vault as
     * of the last inventory and there have been no writes to the vault since the last inventory. If either of these
     * conditions is not satisfied, the vault deletion fails (that is, the vault is not removed) and Amazon Glacier
     * returns an error. You can use <a>DescribeVault</a> to return the number of archives in a vault, and you can use
     * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html">Initiate a Job (POST
     * jobs)</a> to initiate a new inventory retrieval for a vault. The inventory contains the archive IDs you use to
     * delete archives using <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-delete.html">Delete Archive (DELETE
     * archive)</a>.
     * </p>
     * <p>
     * This operation is idempotent.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/deleting-vaults.html">Deleting a Vault in Amazon
     * Glacier</a> and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-delete.html">Delete Vault
     * </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param deleteVaultRequest
     *        Provides options for deleting a vault from Amazon Glacier.
     * @return Result of the DeleteVault operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.DeleteVault
     */
    @Override
    public DeleteVaultResult deleteVault(DeleteVaultRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVault(request);
    }

    @SdkInternalApi
    final DeleteVaultResult executeDeleteVault(DeleteVaultRequest deleteVaultRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVaultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVaultRequest> request = null;
        Response<DeleteVaultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVaultRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVaultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVault");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVaultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVaultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation deletes the access policy associated with the specified vault. The operation is eventually
     * consistent; that is, it might take some time for Amazon Glacier to completely remove the access policy, and you
     * might still see the effect of the policy for a short time after you send the delete request.
     * </p>
     * <p>
     * This operation is idempotent. You can invoke delete multiple times, even if there is no policy associated with
     * the vault. For more information about vault access policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html">Amazon Glacier Access Control
     * with Vault Access Policies</a>.
     * </p>
     * 
     * @param deleteVaultAccessPolicyRequest
     *        DeleteVaultAccessPolicy input.
     * @return Result of the DeleteVaultAccessPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.DeleteVaultAccessPolicy
     */
    @Override
    public DeleteVaultAccessPolicyResult deleteVaultAccessPolicy(DeleteVaultAccessPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVaultAccessPolicy(request);
    }

    @SdkInternalApi
    final DeleteVaultAccessPolicyResult executeDeleteVaultAccessPolicy(DeleteVaultAccessPolicyRequest deleteVaultAccessPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVaultAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVaultAccessPolicyRequest> request = null;
        Response<DeleteVaultAccessPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVaultAccessPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVaultAccessPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVaultAccessPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVaultAccessPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVaultAccessPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation deletes the notification configuration set for a vault. The operation is eventually consistent;
     * that is, it might take some time for Amazon Glacier to completely disable the notifications and you might still
     * receive some notifications for a short time after you send the delete request.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/configuring-notifications.html">Configuring Vault
     * Notifications in Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-notifications-delete.html">Delete Vault
     * Notification Configuration </a> in the Amazon Glacier Developer Guide.
     * </p>
     * 
     * @param deleteVaultNotificationsRequest
     *        Provides options for deleting a vault notification configuration from an Amazon Glacier vault.
     * @return Result of the DeleteVaultNotifications operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.DeleteVaultNotifications
     */
    @Override
    public DeleteVaultNotificationsResult deleteVaultNotifications(DeleteVaultNotificationsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVaultNotifications(request);
    }

    @SdkInternalApi
    final DeleteVaultNotificationsResult executeDeleteVaultNotifications(DeleteVaultNotificationsRequest deleteVaultNotificationsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVaultNotificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVaultNotificationsRequest> request = null;
        Response<DeleteVaultNotificationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVaultNotificationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVaultNotificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVaultNotifications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVaultNotificationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVaultNotificationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns information about a job you previously initiated, including the job initiation date, the
     * user who initiated the job, the job status code/message and the Amazon SNS topic to notify after Amazon Glacier
     * completes the job. For more information about initiating a job, see <a>InitiateJob</a>.
     * </p>
     * <note>
     * <p>
     * This operation enables you to check the status of your job. However, it is strongly recommended that you set up
     * an Amazon SNS topic and specify it in your initiate job request so that Amazon Glacier can notify the topic after
     * it completes the job.
     * </p>
     * </note>
     * <p>
     * A job ID will not expire for at least 24 hours after Amazon Glacier completes the job.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For more information about using this operation, see the documentation for the underlying REST API <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-describe-job-get.html">Describe Job</a> in the
     * <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param describeJobRequest
     *        Provides options for retrieving a job description.
     * @return Result of the DescribeJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.DescribeJob
     */
    @Override
    public DescribeJobResult describeJob(DescribeJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeJob(request);
    }

    @SdkInternalApi
    final DescribeJobResult executeDescribeJob(DescribeJobRequest describeJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobRequest> request = null;
        Response<DescribeJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns information about a vault, including the vault's Amazon Resource Name (ARN), the date the
     * vault was created, the number of archives it contains, and the total size of all the archives in the vault. The
     * number of archives and their total size are as of the last inventory generation. This means that if you add or
     * remove an archive from a vault, and then immediately use Describe Vault, the change in contents will not be
     * immediately reflected. If you want to retrieve the latest inventory of the vault, use <a>InitiateJob</a>. Amazon
     * Glacier generates vault inventories approximately daily. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-inventory.html">Downloading a Vault Inventory in
     * Amazon Glacier</a>.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/retrieving-vault-info.html">Retrieving Vault Metadata
     * in Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-get.html">Describe Vault </a> in the
     * <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param describeVaultRequest
     *        Provides options for retrieving metadata for a specific vault in Amazon Glacier.
     * @return Result of the DescribeVault operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.DescribeVault
     */
    @Override
    public DescribeVaultResult describeVault(DescribeVaultRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVault(request);
    }

    @SdkInternalApi
    final DescribeVaultResult executeDescribeVault(DescribeVaultRequest describeVaultRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVaultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVaultRequest> request = null;
        Response<DescribeVaultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVaultRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeVaultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVault");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVaultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeVaultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns the current data retrieval policy for the account and region specified in the GET request.
     * For more information about data retrieval policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/data-retrieval-policy.html">Amazon Glacier Data
     * Retrieval Policies</a>.
     * </p>
     * 
     * @param getDataRetrievalPolicyRequest
     *        Input for GetDataRetrievalPolicy.
     * @return Result of the GetDataRetrievalPolicy operation returned by the service.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.GetDataRetrievalPolicy
     */
    @Override
    public GetDataRetrievalPolicyResult getDataRetrievalPolicy(GetDataRetrievalPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataRetrievalPolicy(request);
    }

    @SdkInternalApi
    final GetDataRetrievalPolicyResult executeGetDataRetrievalPolicy(GetDataRetrievalPolicyRequest getDataRetrievalPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataRetrievalPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataRetrievalPolicyRequest> request = null;
        Response<GetDataRetrievalPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataRetrievalPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataRetrievalPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataRetrievalPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataRetrievalPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDataRetrievalPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation downloads the output of the job you initiated using <a>InitiateJob</a>. Depending on the job type
     * you specified when you initiated the job, the output will be either the content of an archive or a vault
     * inventory.
     * </p>
     * <p>
     * You can download all the job output or download a portion of the output by specifying a byte range. In the case
     * of an archive retrieval job, depending on the byte range you specify, Amazon Glacier returns the checksum for the
     * portion of the data. You can compute the checksum on the client and verify that the values match to ensure the
     * portion you downloaded is the correct data.
     * </p>
     * <p>
     * A job ID will not expire for at least 24 hours after Amazon Glacier completes the job. That a byte range. For
     * both archive and inventory retrieval jobs, you should verify the downloaded size against the size returned in the
     * headers from the <b>Get Job Output</b> response.
     * </p>
     * <p>
     * For archive retrieval jobs, you should also verify that the size is what you expected. If you download a portion
     * of the output, the expected size is based on the range of bytes you specified. For example, if you specify a
     * range of <code>bytes=0-1048575</code>, you should verify your download size is 1,048,576 bytes. If you download
     * an entire archive, the expected size is the size of the archive when you uploaded it to Amazon Glacier The
     * expected size is also returned in the headers from the <b>Get Job Output</b> response.
     * </p>
     * <p>
     * In the case of an archive retrieval job, depending on the byte range you specify, Amazon Glacier returns the
     * checksum for the portion of the data. To ensure the portion you downloaded is the correct data, compute the
     * checksum on the client, verify that the values match, and verify that the size is what you expected.
     * </p>
     * <p>
     * A job ID does not expire for at least 24 hours after Amazon Glacier completes the job. That is, you can download
     * the job output within the 24 hours period after Amazon Glacier completes the job.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and the underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-inventory.html">Downloading a Vault
     * Inventory</a>, <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/downloading-an-archive.html">Downloading an
     * Archive</a>, and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-job-output-get.html">Get Job
     * Output </a>
     * </p>
     * 
     * @param getJobOutputRequest
     *        Provides options for downloading output of an Amazon Glacier job.
     * @return Result of the GetJobOutput operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.GetJobOutput
     */
    @Override
    public GetJobOutputResult getJobOutput(GetJobOutputRequest request) {
        request = beforeClientExecution(request);
        return executeGetJobOutput(request);
    }

    @SdkInternalApi
    final GetJobOutputResult executeGetJobOutput(GetJobOutputRequest getJobOutputRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobOutputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobOutputRequest> request = null;
        Response<GetJobOutputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobOutputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobOutputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJobOutput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobOutputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(true), new GetJobOutputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            GetJobOutputResult result = response.getAwsResponse();

            // wrapping the response with the LengthCheckInputStream.
            result.setBody(new LengthCheckInputStream(result.getBody(), Long.parseLong(response.getHttpResponse().getHeaders().get("Content-Length")),
                    com.amazonaws.util.LengthCheckInputStream.INCLUDE_SKIPPED_BYTES));

            // wrapping the response with the service client holder input stream to avoid client being GC'ed.
            result.setBody(new ServiceClientHolderInputStream(result.getBody(), this));

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation retrieves the <code>access-policy</code> subresource set on the vault; for more information on
     * setting this subresource, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-SetVaultAccessPolicy.html">Set Vault Access Policy
     * (PUT access-policy)</a>. If there is no access policy set on the vault, the operation returns a
     * <code>404 Not found</code> error. For more information about vault access policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html">Amazon Glacier Access Control
     * with Vault Access Policies</a>.
     * </p>
     * 
     * @param getVaultAccessPolicyRequest
     *        Input for GetVaultAccessPolicy.
     * @return Result of the GetVaultAccessPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.GetVaultAccessPolicy
     */
    @Override
    public GetVaultAccessPolicyResult getVaultAccessPolicy(GetVaultAccessPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetVaultAccessPolicy(request);
    }

    @SdkInternalApi
    final GetVaultAccessPolicyResult executeGetVaultAccessPolicy(GetVaultAccessPolicyRequest getVaultAccessPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getVaultAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVaultAccessPolicyRequest> request = null;
        Response<GetVaultAccessPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVaultAccessPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVaultAccessPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVaultAccessPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVaultAccessPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVaultAccessPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation retrieves the following attributes from the <code>lock-policy</code> subresource set on the
     * specified vault:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The vault lock policy set on the vault.
     * </p>
     * </li>
     * <li>
     * <p>
     * The state of the vault lock, which is either <code>InProgess</code> or <code>Locked</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the lock ID expires. The lock ID is used to complete the vault locking process.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the vault lock was initiated and put into the <code>InProgress</code> state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A vault lock is put into the <code>InProgress</code> state by calling <a>InitiateVaultLock</a>. A vault lock is
     * put into the <code>Locked</code> state by calling <a>CompleteVaultLock</a>. You can abort the vault locking
     * process by calling <a>AbortVaultLock</a>. For more information about the vault locking process, <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html">Amazon Glacier Vault Lock</a>.
     * </p>
     * <p>
     * If there is no vault lock policy set on the vault, the operation returns a <code>404 Not found</code> error. For
     * more information about vault lock policies, <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock-policy.html">Amazon Glacier Access Control
     * with Vault Lock Policies</a>.
     * </p>
     * 
     * @param getVaultLockRequest
     *        The input values for <code>GetVaultLock</code>.
     * @return Result of the GetVaultLock operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.GetVaultLock
     */
    @Override
    public GetVaultLockResult getVaultLock(GetVaultLockRequest request) {
        request = beforeClientExecution(request);
        return executeGetVaultLock(request);
    }

    @SdkInternalApi
    final GetVaultLockResult executeGetVaultLock(GetVaultLockRequest getVaultLockRequest) {

        ExecutionContext executionContext = createExecutionContext(getVaultLockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVaultLockRequest> request = null;
        Response<GetVaultLockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVaultLockRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVaultLockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVaultLock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVaultLockResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVaultLockResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation retrieves the <code>notification-configuration</code> subresource of the specified vault.
     * </p>
     * <p>
     * For information about setting a notification configuration on a vault, see <a>SetVaultNotifications</a>. If a
     * notification configuration for a vault is not set, the operation returns a <code>404 Not Found</code> error. For
     * more information about vault notifications, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/configuring-notifications.html">Configuring Vault
     * Notifications in Amazon Glacier</a>.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/configuring-notifications.html">Configuring Vault
     * Notifications in Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-notifications-get.html">Get Vault
     * Notification Configuration </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param getVaultNotificationsRequest
     *        Provides options for retrieving the notification configuration set on an Amazon Glacier vault.
     * @return Result of the GetVaultNotifications operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.GetVaultNotifications
     */
    @Override
    public GetVaultNotificationsResult getVaultNotifications(GetVaultNotificationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetVaultNotifications(request);
    }

    @SdkInternalApi
    final GetVaultNotificationsResult executeGetVaultNotifications(GetVaultNotificationsRequest getVaultNotificationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getVaultNotificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVaultNotificationsRequest> request = null;
        Response<GetVaultNotificationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVaultNotificationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVaultNotificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVaultNotifications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVaultNotificationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetVaultNotificationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation initiates a job of the specified type, which can be a select, an archival retrieval, or a vault
     * retrieval. For more information about using this operation, see the documentation for the underlying REST API <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html">Initiate a Job</a>.
     * </p>
     * 
     * @param initiateJobRequest
     *        Provides options for initiating an Amazon Glacier job.
     * @return Result of the InitiateJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws PolicyEnforcedException
     *         Returned if a retrieval job would exceed the current data policy's retrieval rate limit. For more
     *         information about data retrieval policies,
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws InsufficientCapacityException
     *         Returned if there is insufficient capacity to process this expedited request. This error only applies to
     *         expedited retrievals and not to standard or bulk retrievals.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.InitiateJob
     */
    @Override
    public InitiateJobResult initiateJob(InitiateJobRequest request) {
        request = beforeClientExecution(request);
        return executeInitiateJob(request);
    }

    @SdkInternalApi
    final InitiateJobResult executeInitiateJob(InitiateJobRequest initiateJobRequest) {

        ExecutionContext executionContext = createExecutionContext(initiateJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InitiateJobRequest> request = null;
        Response<InitiateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InitiateJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(initiateJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InitiateJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InitiateJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new InitiateJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation initiates a multipart upload. Amazon Glacier creates a multipart upload resource and returns its
     * ID in the response. The multipart upload ID is used in subsequent requests to upload parts of an archive (see
     * <a>UploadMultipartPart</a>).
     * </p>
     * <p>
     * When you initiate a multipart upload, you specify the part size in number of bytes. The part size must be a
     * megabyte (1024 KB) multiplied by a power of 2-for example, 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB),
     * 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the maximum is 4 GB.
     * </p>
     * <p>
     * Every part you upload to this resource (see <a>UploadMultipartPart</a>), except the last one, must have the same
     * size. The last one can be the same size or smaller. For example, suppose you want to upload a 16.2 MB file. If
     * you initiate the multipart upload with a part size of 4 MB, you will upload four parts of 4 MB each and one part
     * of 0.2 MB.
     * </p>
     * <note>
     * <p>
     * You don't need to know the size of the archive when you start a multipart upload because Amazon Glacier does not
     * require you to specify the overall archive size.
     * </p>
     * </note>
     * <p>
     * After you complete the multipart upload, Amazon Glacier removes the multipart upload resource referenced by the
     * ID. Amazon Glacier also removes the multipart upload resource if you cancel the multipart upload or it may be
     * removed if there is no activity for a period of 24 hours.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/uploading-archive-mpu.html">Uploading Large Archives in
     * Parts (Multipart Upload)</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-initiate-upload.html">Initiate Multipart
     * Upload</a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param initiateMultipartUploadRequest
     *        Provides options for initiating a multipart upload to an Amazon Glacier vault.
     * @return Result of the InitiateMultipartUpload operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.InitiateMultipartUpload
     */
    @Override
    public InitiateMultipartUploadResult initiateMultipartUpload(InitiateMultipartUploadRequest request) {
        request = beforeClientExecution(request);
        return executeInitiateMultipartUpload(request);
    }

    @SdkInternalApi
    final InitiateMultipartUploadResult executeInitiateMultipartUpload(InitiateMultipartUploadRequest initiateMultipartUploadRequest) {

        ExecutionContext executionContext = createExecutionContext(initiateMultipartUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InitiateMultipartUploadRequest> request = null;
        Response<InitiateMultipartUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InitiateMultipartUploadRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(initiateMultipartUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InitiateMultipartUpload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InitiateMultipartUploadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new InitiateMultipartUploadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation initiates the vault locking process by doing the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Installing a vault lock policy on the specified vault.
     * </p>
     * </li>
     * <li>
     * <p>
     * Setting the lock state of vault lock to <code>InProgress</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returning a lock ID, which is used to complete the vault locking process.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can set one vault lock policy for each vault and this policy can be up to 20 KB in size. For more information
     * about vault lock policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock-policy.html">Amazon Glacier Access Control
     * with Vault Lock Policies</a>.
     * </p>
     * <p>
     * You must complete the vault locking process within 24 hours after the vault lock enters the
     * <code>InProgress</code> state. After the 24 hour window ends, the lock ID expires, the vault automatically exits
     * the <code>InProgress</code> state, and the vault lock policy is removed from the vault. You call
     * <a>CompleteVaultLock</a> to complete the vault locking process by setting the state of the vault lock to
     * <code>Locked</code>.
     * </p>
     * <p>
     * After a vault lock is in the <code>Locked</code> state, you cannot initiate a new vault lock for the vault.
     * </p>
     * <p>
     * You can abort the vault locking process by calling <a>AbortVaultLock</a>. You can get the state of the vault lock
     * by calling <a>GetVaultLock</a>. For more information about the vault locking process, <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html">Amazon Glacier Vault Lock</a>.
     * </p>
     * <p>
     * If this operation is called when the vault lock is in the <code>InProgress</code> state, the operation returns an
     * <code>AccessDeniedException</code> error. When the vault lock is in the <code>InProgress</code> state you must
     * call <a>AbortVaultLock</a> before you can initiate a new vault lock policy.
     * </p>
     * 
     * @param initiateVaultLockRequest
     *        The input values for <code>InitiateVaultLock</code>.
     * @return Result of the InitiateVaultLock operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.InitiateVaultLock
     */
    @Override
    public InitiateVaultLockResult initiateVaultLock(InitiateVaultLockRequest request) {
        request = beforeClientExecution(request);
        return executeInitiateVaultLock(request);
    }

    @SdkInternalApi
    final InitiateVaultLockResult executeInitiateVaultLock(InitiateVaultLockRequest initiateVaultLockRequest) {

        ExecutionContext executionContext = createExecutionContext(initiateVaultLockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InitiateVaultLockRequest> request = null;
        Response<InitiateVaultLockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InitiateVaultLockRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(initiateVaultLockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InitiateVaultLock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InitiateVaultLockResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new InitiateVaultLockResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation lists jobs for a vault, including jobs that are in-progress and jobs that have recently finished.
     * The List Job operation returns a list of these jobs sorted by job initiation time.
     * </p>
     * <note>
     * <p>
     * Amazon Glacier retains recently completed jobs for a period before deleting them; however, it eventually removes
     * completed jobs. The output of completed jobs can be retrieved. Retaining completed jobs for a period of time
     * after they have completed enables you to get a job output in the event you miss the job completion notification
     * or your first attempt to download it fails. For example, suppose you start an archive retrieval job to download
     * an archive. After the job completes, you start to download the archive but encounter a network error. In this
     * scenario, you can retry and download the archive while the job exists.
     * </p>
     * </note>
     * <p>
     * The List Jobs operation supports pagination. You should always check the response <code>Marker</code> field. If
     * there are no more jobs to list, the <code>Marker</code> field is set to <code>null</code>. If there are more jobs
     * to list, the <code>Marker</code> field is set to a non-null value, which you can use to continue the pagination
     * of the list. To return a list of jobs that begins at a specific job, set the marker request parameter to the
     * <code>Marker</code> value for that job that you obtained from a previous List Jobs request.
     * </p>
     * <p>
     * You can set a maximum limit for the number of jobs returned in the response by specifying the <code>limit</code>
     * parameter in the request. The default limit is 50. The number of jobs returned might be fewer than the limit, but
     * the number of returned jobs never exceeds the limit.
     * </p>
     * <p>
     * Additionally, you can filter the jobs list returned by specifying the optional <code>statuscode</code> parameter
     * or <code>completed</code> parameter, or both. Using the <code>statuscode</code> parameter, you can specify to
     * return only jobs that match either the <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>
     * status. Using the <code>completed</code> parameter, you can specify to return only jobs that were completed (
     * <code>true</code>) or jobs that were not completed (<code>false</code>).
     * </p>
     * <p>
     * For more information about using this operation, see the documentation for the underlying REST API <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-jobs-get.html">List Jobs</a>.
     * </p>
     * 
     * @param listJobsRequest
     *        Provides options for retrieving a job list for an Amazon Glacier vault.
     * @return Result of the ListJobs operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.ListJobs
     */
    @Override
    public ListJobsResult listJobs(ListJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListJobs(request);
    }

    @SdkInternalApi
    final ListJobsResult executeListJobs(ListJobsRequest listJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsRequest> request = null;
        Response<ListJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation lists in-progress multipart uploads for the specified vault. An in-progress multipart upload is a
     * multipart upload that has been initiated by an <a>InitiateMultipartUpload</a> request, but has not yet been
     * completed or aborted. The list returned in the List Multipart Upload response has no guaranteed order.
     * </p>
     * <p>
     * The List Multipart Uploads operation supports pagination. By default, this operation returns up to 50 multipart
     * uploads in the response. You should always check the response for a <code>marker</code> at which to continue the
     * list; if there are no more items the <code>marker</code> is <code>null</code>. To return a list of multipart
     * uploads that begins at a specific upload, set the <code>marker</code> request parameter to the value you obtained
     * from a previous List Multipart Upload request. You can also limit the number of uploads returned in the response
     * by specifying the <code>limit</code> parameter in the request.
     * </p>
     * <p>
     * Note the difference between this operation and listing parts (<a>ListParts</a>). The List Multipart Uploads
     * operation lists all multipart uploads for a vault and does not require a multipart upload ID. The List Parts
     * operation requires a multipart upload ID since parts are associated with a single upload.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and the underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html">Working with Archives in
     * Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-list-uploads.html">List Multipart Uploads
     * </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param listMultipartUploadsRequest
     *        Provides options for retrieving list of in-progress multipart uploads for an Amazon Glacier vault.
     * @return Result of the ListMultipartUploads operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.ListMultipartUploads
     */
    @Override
    public ListMultipartUploadsResult listMultipartUploads(ListMultipartUploadsRequest request) {
        request = beforeClientExecution(request);
        return executeListMultipartUploads(request);
    }

    @SdkInternalApi
    final ListMultipartUploadsResult executeListMultipartUploads(ListMultipartUploadsRequest listMultipartUploadsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMultipartUploadsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMultipartUploadsRequest> request = null;
        Response<ListMultipartUploadsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMultipartUploadsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMultipartUploadsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMultipartUploads");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMultipartUploadsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMultipartUploadsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation lists the parts of an archive that have been uploaded in a specific multipart upload. You can make
     * this request at any time during an in-progress multipart upload before you complete the upload (see
     * <a>CompleteMultipartUpload</a>. List Parts returns an error for completed uploads. The list returned in the List
     * Parts response is sorted by part range.
     * </p>
     * <p>
     * The List Parts operation supports pagination. By default, this operation returns up to 50 uploaded parts in the
     * response. You should always check the response for a <code>marker</code> at which to continue the list; if there
     * are no more items the <code>marker</code> is <code>null</code>. To return a list of parts that begins at a
     * specific part, set the <code>marker</code> request parameter to the value you obtained from a previous List Parts
     * request. You can also limit the number of parts returned in the response by specifying the <code>limit</code>
     * parameter in the request.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and the underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html">Working with Archives in
     * Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-list-parts.html">List Parts</a> in the
     * <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param listPartsRequest
     *        Provides options for retrieving a list of parts of an archive that have been uploaded in a specific
     *        multipart upload.
     * @return Result of the ListParts operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.ListParts
     */
    @Override
    public ListPartsResult listParts(ListPartsRequest request) {
        request = beforeClientExecution(request);
        return executeListParts(request);
    }

    @SdkInternalApi
    final ListPartsResult executeListParts(ListPartsRequest listPartsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPartsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPartsRequest> request = null;
        Response<ListPartsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPartsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPartsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListParts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPartsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPartsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation lists the provisioned capacity units for the specified AWS account.
     * </p>
     * 
     * @param listProvisionedCapacityRequest
     * @return Result of the ListProvisionedCapacity operation returned by the service.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.ListProvisionedCapacity
     */
    @Override
    public ListProvisionedCapacityResult listProvisionedCapacity(ListProvisionedCapacityRequest request) {
        request = beforeClientExecution(request);
        return executeListProvisionedCapacity(request);
    }

    @SdkInternalApi
    final ListProvisionedCapacityResult executeListProvisionedCapacity(ListProvisionedCapacityRequest listProvisionedCapacityRequest) {

        ExecutionContext executionContext = createExecutionContext(listProvisionedCapacityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProvisionedCapacityRequest> request = null;
        Response<ListProvisionedCapacityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProvisionedCapacityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listProvisionedCapacityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProvisionedCapacity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProvisionedCapacityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListProvisionedCapacityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation lists all the tags attached to a vault. The operation returns an empty map if there are no tags.
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/tagging.html">Tagging Amazon Glacier Resources</a>.
     * </p>
     * 
     * @param listTagsForVaultRequest
     *        The input value for <code>ListTagsForVaultInput</code>.
     * @return Result of the ListTagsForVault operation returned by the service.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.ListTagsForVault
     */
    @Override
    public ListTagsForVaultResult listTagsForVault(ListTagsForVaultRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForVault(request);
    }

    @SdkInternalApi
    final ListTagsForVaultResult executeListTagsForVault(ListTagsForVaultRequest listTagsForVaultRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForVaultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForVaultRequest> request = null;
        Response<ListTagsForVaultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForVaultRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForVaultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForVault");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForVaultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForVaultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation lists all vaults owned by the calling user's account. The list returned in the response is
     * ASCII-sorted by vault name.
     * </p>
     * <p>
     * By default, this operation returns up to 10 items. If there are more vaults to list, the response
     * <code>marker</code> field contains the vault Amazon Resource Name (ARN) at which to continue the list with a new
     * List Vaults request; otherwise, the <code>marker</code> field is <code>null</code>. To return a list of vaults
     * that begins at a specific vault, set the <code>marker</code> request parameter to the vault ARN you obtained from
     * a previous List Vaults request. You can also limit the number of vaults returned in the response by specifying
     * the <code>limit</code> parameter in the request.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/retrieving-vault-info.html">Retrieving Vault Metadata
     * in Amazon Glacier</a> and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vaults-get.html">List
     * Vaults </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param listVaultsRequest
     *        Provides options to retrieve the vault list owned by the calling user's account. The list provides
     *        metadata information for each vault.
     * @return Result of the ListVaults operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.ListVaults
     */
    @Override
    public ListVaultsResult listVaults(ListVaultsRequest request) {
        request = beforeClientExecution(request);
        return executeListVaults(request);
    }

    @SdkInternalApi
    final ListVaultsResult executeListVaults(ListVaultsRequest listVaultsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVaultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVaultsRequest> request = null;
        Response<ListVaultsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVaultsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVaultsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVaults");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVaultsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVaultsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation purchases a provisioned capacity unit for an AWS account.
     * </p>
     * 
     * @param purchaseProvisionedCapacityRequest
     * @return Result of the PurchaseProvisionedCapacity operation returned by the service.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws LimitExceededException
     *         Returned if the request results in a vault or account limit being exceeded.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.PurchaseProvisionedCapacity
     */
    @Override
    public PurchaseProvisionedCapacityResult purchaseProvisionedCapacity(PurchaseProvisionedCapacityRequest request) {
        request = beforeClientExecution(request);
        return executePurchaseProvisionedCapacity(request);
    }

    @SdkInternalApi
    final PurchaseProvisionedCapacityResult executePurchaseProvisionedCapacity(PurchaseProvisionedCapacityRequest purchaseProvisionedCapacityRequest) {

        ExecutionContext executionContext = createExecutionContext(purchaseProvisionedCapacityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseProvisionedCapacityRequest> request = null;
        Response<PurchaseProvisionedCapacityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseProvisionedCapacityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(purchaseProvisionedCapacityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PurchaseProvisionedCapacity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PurchaseProvisionedCapacityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PurchaseProvisionedCapacityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation removes one or more tags from the set of tags attached to a vault. For more information about
     * tags, see <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/tagging.html">Tagging Amazon Glacier
     * Resources</a>. This operation is idempotent. The operation will be successful, even if there are no tags attached
     * to the vault.
     * </p>
     * 
     * @param removeTagsFromVaultRequest
     *        The input value for <code>RemoveTagsFromVaultInput</code>.
     * @return Result of the RemoveTagsFromVault operation returned by the service.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.RemoveTagsFromVault
     */
    @Override
    public RemoveTagsFromVaultResult removeTagsFromVault(RemoveTagsFromVaultRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTagsFromVault(request);
    }

    @SdkInternalApi
    final RemoveTagsFromVaultResult executeRemoveTagsFromVault(RemoveTagsFromVaultRequest removeTagsFromVaultRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTagsFromVaultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromVaultRequest> request = null;
        Response<RemoveTagsFromVaultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromVaultRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTagsFromVaultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTagsFromVault");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveTagsFromVaultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveTagsFromVaultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation sets and then enacts a data retrieval policy in the region specified in the PUT request. You can
     * set one policy per region for an AWS account. The policy is enacted within a few minutes of a successful PUT
     * operation.
     * </p>
     * <p>
     * The set policy operation does not affect retrieval jobs that were in progress before the policy was enacted. For
     * more information about data retrieval policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/data-retrieval-policy.html">Amazon Glacier Data
     * Retrieval Policies</a>.
     * </p>
     * 
     * @param setDataRetrievalPolicyRequest
     *        SetDataRetrievalPolicy input.
     * @return Result of the SetDataRetrievalPolicy operation returned by the service.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.SetDataRetrievalPolicy
     */
    @Override
    public SetDataRetrievalPolicyResult setDataRetrievalPolicy(SetDataRetrievalPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeSetDataRetrievalPolicy(request);
    }

    @SdkInternalApi
    final SetDataRetrievalPolicyResult executeSetDataRetrievalPolicy(SetDataRetrievalPolicyRequest setDataRetrievalPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(setDataRetrievalPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetDataRetrievalPolicyRequest> request = null;
        Response<SetDataRetrievalPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetDataRetrievalPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setDataRetrievalPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetDataRetrievalPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetDataRetrievalPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SetDataRetrievalPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation configures an access policy for a vault and will overwrite an existing policy. To configure a
     * vault access policy, send a PUT request to the <code>access-policy</code> subresource of the vault. An access
     * policy is specific to a vault and is also called a vault subresource. You can set one access policy per vault and
     * the policy can be up to 20 KB in size. For more information about vault access policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html">Amazon Glacier Access Control
     * with Vault Access Policies</a>.
     * </p>
     * 
     * @param setVaultAccessPolicyRequest
     *        SetVaultAccessPolicy input.
     * @return Result of the SetVaultAccessPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.SetVaultAccessPolicy
     */
    @Override
    public SetVaultAccessPolicyResult setVaultAccessPolicy(SetVaultAccessPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeSetVaultAccessPolicy(request);
    }

    @SdkInternalApi
    final SetVaultAccessPolicyResult executeSetVaultAccessPolicy(SetVaultAccessPolicyRequest setVaultAccessPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(setVaultAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetVaultAccessPolicyRequest> request = null;
        Response<SetVaultAccessPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetVaultAccessPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setVaultAccessPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetVaultAccessPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetVaultAccessPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetVaultAccessPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation configures notifications that will be sent when specific events happen to a vault. By default, you
     * don't get any notifications.
     * </p>
     * <p>
     * To configure vault notifications, send a PUT request to the <code>notification-configuration</code> subresource
     * of the vault. The request should include a JSON document that provides an Amazon SNS topic and specific events
     * for which you want Amazon Glacier to send notifications to the topic.
     * </p>
     * <p>
     * Amazon SNS topics must grant permission to the vault to be allowed to publish notifications to the topic. You can
     * configure a vault to publish a notification for the following vault events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ArchiveRetrievalCompleted</b> This event occurs when a job that was initiated for an archive retrieval is
     * completed (<a>InitiateJob</a>). The status of the completed job can be "Succeeded" or "Failed". The notification
     * sent to the SNS topic is the same output as returned from <a>DescribeJob</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InventoryRetrievalCompleted</b> This event occurs when a job that was initiated for an inventory retrieval is
     * completed (<a>InitiateJob</a>). The status of the completed job can be "Succeeded" or "Failed". The notification
     * sent to the SNS topic is the same output as returned from <a>DescribeJob</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/configuring-notifications.html">Configuring Vault
     * Notifications in Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-notifications-put.html">Set Vault
     * Notification Configuration </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param setVaultNotificationsRequest
     *        Provides options to configure notifications that will be sent when specific events happen to a vault.
     * @return Result of the SetVaultNotifications operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.SetVaultNotifications
     */
    @Override
    public SetVaultNotificationsResult setVaultNotifications(SetVaultNotificationsRequest request) {
        request = beforeClientExecution(request);
        return executeSetVaultNotifications(request);
    }

    @SdkInternalApi
    final SetVaultNotificationsResult executeSetVaultNotifications(SetVaultNotificationsRequest setVaultNotificationsRequest) {

        ExecutionContext executionContext = createExecutionContext(setVaultNotificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetVaultNotificationsRequest> request = null;
        Response<SetVaultNotificationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetVaultNotificationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setVaultNotificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetVaultNotifications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetVaultNotificationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new SetVaultNotificationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation adds an archive to a vault. This is a synchronous operation, and for a successful upload, your
     * data is durably persisted. Amazon Glacier returns the archive ID in the <code>x-amz-archive-id</code> header of
     * the response.
     * </p>
     * <p>
     * You must use the archive ID to access your data in Amazon Glacier. After you upload an archive, you should save
     * the archive ID returned so that you can retrieve or delete the archive later. Besides saving the archive ID, you
     * can also index it and give it a friendly name to allow for better searching. You can also use the optional
     * archive description field to specify how the archive is referred to in an external index of archives, such as you
     * might create in Amazon DynamoDB. You can also get the vault inventory to obtain a list of archive IDs in a vault.
     * For more information, see <a>InitiateJob</a>.
     * </p>
     * <p>
     * You must provide a SHA256 tree hash of the data you are uploading. For information about computing a SHA256 tree
     * hash, see <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/checksum-calculations.html">Computing
     * Checksums</a>.
     * </p>
     * <p>
     * You can optionally specify an archive description of up to 1,024 printable ASCII characters. You can get the
     * archive description when you either retrieve the archive or get the vault inventory. For more information, see
     * <a>InitiateJob</a>. Amazon Glacier does not interpret the description in any way. An archive description does not
     * need to be unique. You cannot use the description to retrieve or sort the archive list.
     * </p>
     * <p>
     * Archives are immutable. After you upload an archive, you cannot edit the archive or its description.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/uploading-an-archive.html">Uploading an Archive in
     * Amazon Glacier</a> and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-post.html">Upload
     * Archive</a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param uploadArchiveRequest
     *        Provides options to add an archive to a vault.
     * @return Result of the UploadArchive operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws RequestTimeoutException
     *         Returned if, when uploading an archive, Amazon Glacier times out while receiving the upload.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.UploadArchive
     */
    @Override
    public UploadArchiveResult uploadArchive(UploadArchiveRequest request) {
        request = beforeClientExecution(request);
        return executeUploadArchive(request);
    }

    @SdkInternalApi
    final UploadArchiveResult executeUploadArchive(UploadArchiveRequest uploadArchiveRequest) {

        ExecutionContext executionContext = createExecutionContext(uploadArchiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UploadArchiveRequest> request = null;
        Response<UploadArchiveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UploadArchiveRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(uploadArchiveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UploadArchive");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UploadArchiveResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UploadArchiveResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation uploads a part of an archive. You can upload archive parts in any order. You can also upload them
     * in parallel. You can upload up to 10,000 parts for a multipart upload.
     * </p>
     * <p>
     * Amazon Glacier rejects your upload part request if any of the following conditions is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SHA256 tree hash does not match</b>To ensure that part data is not corrupted in transmission, you compute a
     * SHA256 tree hash of the part and include it in your request. Upon receiving the part data, Amazon Glacier also
     * computes a SHA256 tree hash. If these hash values don't match, the operation fails. For information about
     * computing a SHA256 tree hash, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/checksum-calculations.html">Computing Checksums</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Part size does not match</b>The size of each part except the last must match the size specified in the
     * corresponding <a>InitiateMultipartUpload</a> request. The size of the last part must be the same size as, or
     * smaller than, the specified size.
     * </p>
     * <note>
     * <p>
     * If you upload a part whose size is smaller than the part size you specified in your initiate multipart upload
     * request and that part is not the last part, then the upload part request will succeed. However, the subsequent
     * Complete Multipart Upload request will fail.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b>Range does not align</b>The byte range value in the request does not align with the part size specified in the
     * corresponding initiate request. For example, if you specify a part size of 4194304 bytes (4 MB), then 0 to
     * 4194303 bytes (4 MB - 1) and 4194304 (4 MB) to 8388607 (8 MB - 1) are valid part ranges. However, if you set a
     * range value of 2 MB to 6 MB, the range does not align with the part size and the upload will fail.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is idempotent. If you upload the same part multiple times, the data included in the most recent
     * request overwrites the previously uploaded data.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/uploading-archive-mpu.html">Uploading Large Archives in
     * Parts (Multipart Upload)</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-upload-part.html">Upload Part </a> in the <i>Amazon
     * Glacier Developer Guide</i>.
     * </p>
     * 
     * @param uploadMultipartPartRequest
     *        Provides options to upload a part of an archive in a multipart upload operation.
     * @return Result of the UploadMultipartPart operation returned by the service.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
     * @throws InvalidParameterValueException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws MissingParameterValueException
     *         Returned if a required header or parameter is missing from the request.
     * @throws RequestTimeoutException
     *         Returned if, when uploading an archive, Amazon Glacier times out while receiving the upload.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AmazonGlacier.UploadMultipartPart
     */
    @Override
    public UploadMultipartPartResult uploadMultipartPart(UploadMultipartPartRequest request) {
        request = beforeClientExecution(request);
        return executeUploadMultipartPart(request);
    }

    @SdkInternalApi
    final UploadMultipartPartResult executeUploadMultipartPart(UploadMultipartPartRequest uploadMultipartPartRequest) {

        ExecutionContext executionContext = createExecutionContext(uploadMultipartPartRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UploadMultipartPartRequest> request = null;
        Response<UploadMultipartPartResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UploadMultipartPartRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(uploadMultipartPartRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Glacier");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UploadMultipartPart");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UploadMultipartPartResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UploadMultipartPartResultJsonUnmarshaller());
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

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata()
                .withCustomErrorCodeFieldName("code"));

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public AmazonGlacierWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonGlacierWaiters(this);
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

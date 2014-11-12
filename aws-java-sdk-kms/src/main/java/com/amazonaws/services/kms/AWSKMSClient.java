/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kms;

import java.net.*;
import java.util.*;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.regions.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.json.*;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.services.kms.model.transform.*;

/**
 * Client for accessing AWSKMS.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS Key Management Service <p>
 * AWS Key Management Service (KMS) is an encryption and key management
 * web service. This guide describes the KMS actions that you can call
 * programmatically. For general information about KMS, see (need an
 * address here). For the KMS developer guide, see (need address here).
 * </p>
 * <p>
 * <b>NOTE:</b> AWS provides SDKs that consist of libraries and sample
 * code for various programming languages and platforms (Java, Ruby,
 * .Net, iOS, Android, etc.). The SDKs provide a convenient way to create
 * programmatic access to KMS and AWS. For example, the SDKs take care of
 * tasks such as signing requests (see below), managing errors, and
 * retrying requests automatically. For more information about the AWS
 * SDKs, including how to download and install them, see Tools for Amazon
 * Web Services.
 * </p>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls
 * to KMS. However, you can also use the KMS Query API to make to make
 * direct calls to the KMS web service.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * Requests must be signed by using an access key ID and a secret access
 * key. We strongly recommend that you do not use your AWS account access
 * key ID and secret key for everyday work with KMS. Instead, use the
 * access key ID and secret access key for an IAM user, or you can use
 * the AWS Security Token Service to generate temporary security
 * credentials that you can use to sign requests.
 * </p>
 * <p>
 * All KMS operations require
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 </a>
 * .
 * </p>
 * <p>
 * <b>Recording API Requests</b>
 * </p>
 * <p>
 * KMS supports AWS CloudTrail, a service that records AWS API calls and
 * related events for your AWS account and delivers them to an Amazon S3
 * bucket that you specify. By using the information collected by
 * CloudTrail, you can determine what requests were made to KMS, who made
 * the request, when it was made, and so on. To learn more about
 * CloudTrail, including how to turn it on and find your log files, see
 * the
 * <a href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/whatiscloudtrail.html"> AWS CloudTrail User Guide </a>
 * 
 * </p>
 * <p>
 * <b>Additional Resources</b>
 * </p>
 * <p>
 * For more information about credentials and request signing, see the
 * following:
 * </p>
 * 
 * <ul>
 * <li>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html"> AWS Security Credentials </a>
 * . This topic provides general information about the types of
 * credentials used for accessing AWS. </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/"> AWS Security Token Service </a>
 * . This guide describes how to create and use temporary security
 * credentials. </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"> Signing AWS API Requests </a>
 * . This set of topics walks you through the process of signing a
 * request using an access key ID and a secret access key. </li>
 * 
 * </ul>
 */
public class AWSKMSClient extends AmazonWebServiceClient implements AWSKMS {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSKMS.class);

    /**
     * List of exception unmarshallers for all AWSKMS exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSKMS.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSKMSClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSKMS.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSKMS
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSKMSClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSKMS using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSKMSClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSKMS using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSKMS
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSKMSClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(adjustClientConfiguration(clientConfiguration));
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSKMS using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSKMSClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSKMS using the specified AWS account credentials
     * provider and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSKMS
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSKMSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSKMS using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSKMS
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AWSKMSClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new DisabledExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSInternalExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DependencyTimeoutExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidCiphertextExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MalformedPolicyDocumentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidKeyUsageExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidArnExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidMarkerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidGrantTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KeyUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidAliasNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedOperationExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("kms.us-east-1.amazonaws.com/");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/kms/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/kms/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;
        
        return config;
    }

    /**
     * <p>
     * Creates a customer master key. Customer master keys can be used to
     * encrypt small amounts of data (less than 4K) directly, but they are
     * most commonly used to encrypt or envelope data keys that are then used
     * to encrypt customer data. For more information about data keys, see
     * GenerateDataKey and GenerateDataKeyWithoutPlaintext.
     * </p>
     *
     * @param createKeyRequest Container for the necessary parameters to
     *           execute the CreateKey service method on AWSKMS.
     * 
     * @return The response from the CreateKey service method, as returned by
     *         AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws MalformedPolicyDocumentException
     * @throws InvalidArnException
     * @throws UnsupportedOperationException
     * @throws KMSInternalException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateKeyResult createKey(CreateKeyRequest createKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(createKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateKeyRequest> request = null;
        Response<CreateKeyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateKeyRequestMarshaller().marshall(createKeyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateKeyResult, JsonUnmarshallerContext> unmarshaller =
                new CreateKeyResultJsonUnmarshaller();
            JsonResponseHandler<CreateKeyResult> responseHandler =
                new JsonResponseHandler<CreateKeyResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Encrypts plaintext into ciphertext by using a customer master key.
     * </p>
     *
     * @param encryptRequest Container for the necessary parameters to
     *           execute the Encrypt service method on AWSKMS.
     * 
     * @return The response from the Encrypt service method, as returned by
     *         AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidGrantTokenException
     * @throws KeyUnavailableException
     * @throws NotFoundException
     * @throws DisabledException
     * @throws InvalidKeyUsageException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EncryptResult encrypt(EncryptRequest encryptRequest) {
        ExecutionContext executionContext = createExecutionContext(encryptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EncryptRequest> request = null;
        Response<EncryptResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EncryptRequestMarshaller().marshall(encryptRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EncryptResult, JsonUnmarshallerContext> unmarshaller =
                new EncryptResultJsonUnmarshaller();
            JsonResponseHandler<EncryptResult> responseHandler =
                new JsonResponseHandler<EncryptResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves a policy attached to the specified key.
     * </p>
     *
     * @param getKeyPolicyRequest Container for the necessary parameters to
     *           execute the GetKeyPolicy service method on AWSKMS.
     * 
     * @return The response from the GetKeyPolicy service method, as returned
     *         by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetKeyPolicyResult getKeyPolicy(GetKeyPolicyRequest getKeyPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getKeyPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyPolicyRequest> request = null;
        Response<GetKeyPolicyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyPolicyRequestMarshaller().marshall(getKeyPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetKeyPolicyResult, JsonUnmarshallerContext> unmarshaller =
                new GetKeyPolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetKeyPolicyResult> responseHandler =
                new JsonResponseHandler<GetKeyPolicyResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the description of a key.
     * </p>
     *
     * @param updateKeyDescriptionRequest Container for the necessary
     *           parameters to execute the UpdateKeyDescription service method on
     *           AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateKeyDescription(UpdateKeyDescriptionRequest updateKeyDescriptionRequest) {
        ExecutionContext executionContext = createExecutionContext(updateKeyDescriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateKeyDescriptionRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateKeyDescriptionRequestMarshaller().marshall(updateKeyDescriptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Lists the customer master keys.
     * </p>
     *
     * @param listKeysRequest Container for the necessary parameters to
     *           execute the ListKeys service method on AWSKMS.
     * 
     * @return The response from the ListKeys service method, as returned by
     *         AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListKeysResult listKeys(ListKeysRequest listKeysRequest) {
        ExecutionContext executionContext = createExecutionContext(listKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKeysRequest> request = null;
        Response<ListKeysResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKeysRequestMarshaller().marshall(listKeysRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListKeysResult, JsonUnmarshallerContext> unmarshaller =
                new ListKeysResultJsonUnmarshaller();
            JsonResponseHandler<ListKeysResult> responseHandler =
                new JsonResponseHandler<ListKeysResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Generates a secure data key. Data keys are used to encrypt and
     * decrypt data. They are wrapped by customer master keys.
     * </p>
     *
     * @param generateDataKeyRequest Container for the necessary parameters
     *           to execute the GenerateDataKey service method on AWSKMS.
     * 
     * @return The response from the GenerateDataKey service method, as
     *         returned by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidGrantTokenException
     * @throws KeyUnavailableException
     * @throws NotFoundException
     * @throws DisabledException
     * @throws InvalidKeyUsageException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GenerateDataKeyResult generateDataKey(GenerateDataKeyRequest generateDataKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(generateDataKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateDataKeyRequest> request = null;
        Response<GenerateDataKeyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateDataKeyRequestMarshaller().marshall(generateDataKeyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GenerateDataKeyResult, JsonUnmarshallerContext> unmarshaller =
                new GenerateDataKeyResultJsonUnmarshaller();
            JsonResponseHandler<GenerateDataKeyResult> responseHandler =
                new JsonResponseHandler<GenerateDataKeyResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds a grant to a key to specify who can access the key and under
     * what conditions. Grants are alternate permission mechanisms to key
     * policies. If absent, access to the key is evaluated based on IAM
     * policies attached to the user. By default, grants do not expire.
     * Grants can be listed, retired, or revoked as indicated by the
     * following APIs. Typically, when you are finished using a grant, you
     * retire it. When you want to end a grant immediately, revoke it. For
     * more information about grants, see
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/grants.html"> Grants </a>
     * . <ol> <li> ListGrants </li>
     * <li> RetireGrant </li>
     * <li> RevokeGrant </li>
     * </ol>
     * </p>
     *
     * @param createGrantRequest Container for the necessary parameters to
     *           execute the CreateGrant service method on AWSKMS.
     * 
     * @return The response from the CreateGrant service method, as returned
     *         by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidGrantTokenException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws DisabledException
     * @throws KMSInternalException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateGrantResult createGrant(CreateGrantRequest createGrantRequest) {
        ExecutionContext executionContext = createExecutionContext(createGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGrantRequest> request = null;
        Response<CreateGrantResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGrantRequestMarshaller().marshall(createGrantRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateGrantResult, JsonUnmarshallerContext> unmarshaller =
                new CreateGrantResultJsonUnmarshaller();
            JsonResponseHandler<CreateGrantResult> responseHandler =
                new JsonResponseHandler<CreateGrantResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists all of the key aliases in the account.
     * </p>
     *
     * @param listAliasesRequest Container for the necessary parameters to
     *           execute the ListAliases service method on AWSKMS.
     * 
     * @return The response from the ListAliases service method, as returned
     *         by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAliasesResult listAliases(ListAliasesRequest listAliasesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAliasesRequest> request = null;
        Response<ListAliasesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAliasesRequestMarshaller().marshall(listAliasesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAliasesResult, JsonUnmarshallerContext> unmarshaller =
                new ListAliasesResultJsonUnmarshaller();
            JsonResponseHandler<ListAliasesResult> responseHandler =
                new JsonResponseHandler<ListAliasesResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a key wrapped by a customer master key without the plaintext
     * copy of that key. To retrieve the plaintext, see GenerateDataKey.
     * </p>
     *
     * @param generateDataKeyWithoutPlaintextRequest Container for the
     *           necessary parameters to execute the GenerateDataKeyWithoutPlaintext
     *           service method on AWSKMS.
     * 
     * @return The response from the GenerateDataKeyWithoutPlaintext service
     *         method, as returned by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidGrantTokenException
     * @throws KeyUnavailableException
     * @throws NotFoundException
     * @throws DisabledException
     * @throws InvalidKeyUsageException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GenerateDataKeyWithoutPlaintextResult generateDataKeyWithoutPlaintext(GenerateDataKeyWithoutPlaintextRequest generateDataKeyWithoutPlaintextRequest) {
        ExecutionContext executionContext = createExecutionContext(generateDataKeyWithoutPlaintextRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateDataKeyWithoutPlaintextRequest> request = null;
        Response<GenerateDataKeyWithoutPlaintextResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateDataKeyWithoutPlaintextRequestMarshaller().marshall(generateDataKeyWithoutPlaintextRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GenerateDataKeyWithoutPlaintextResult, JsonUnmarshallerContext> unmarshaller =
                new GenerateDataKeyWithoutPlaintextResultJsonUnmarshaller();
            JsonResponseHandler<GenerateDataKeyWithoutPlaintextResult> responseHandler =
                new JsonResponseHandler<GenerateDataKeyWithoutPlaintextResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified alias.
     * </p>
     *
     * @param deleteAliasRequest Container for the necessary parameters to
     *           execute the DeleteAlias service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteAlias(DeleteAliasRequest deleteAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAliasRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAliasRequestMarshaller().marshall(deleteAliasRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Enables rotation of the specified customer master key.
     * </p>
     *
     * @param enableKeyRotationRequest Container for the necessary parameters
     *           to execute the EnableKeyRotation service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void enableKeyRotation(EnableKeyRotationRequest enableKeyRotationRequest) {
        ExecutionContext executionContext = createExecutionContext(enableKeyRotationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableKeyRotationRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableKeyRotationRequestMarshaller().marshall(enableKeyRotationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Retires a grant. You can retire a grant when you're done using it to
     * clean up. You should revoke a grant when you intend to actively deny
     * operations that depend on it.
     * </p>
     *
     * @param retireGrantRequest Container for the necessary parameters to
     *           execute the RetireGrant service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidGrantTokenException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void retireGrant(RetireGrantRequest retireGrantRequest) {
        ExecutionContext executionContext = createExecutionContext(retireGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetireGrantRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetireGrantRequestMarshaller().marshall(retireGrantRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Provides detailed information about the specified customer master
     * key.
     * </p>
     *
     * @param describeKeyRequest Container for the necessary parameters to
     *           execute the DescribeKey service method on AWSKMS.
     * 
     * @return The response from the DescribeKey service method, as returned
     *         by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeKeyResult describeKey(DescribeKeyRequest describeKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(describeKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeKeyRequest> request = null;
        Response<DescribeKeyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeKeyRequestMarshaller().marshall(describeKeyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeKeyResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeKeyResultJsonUnmarshaller();
            JsonResponseHandler<DescribeKeyResult> responseHandler =
                new JsonResponseHandler<DescribeKeyResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * List the grants for a specified key.
     * </p>
     *
     * @param listGrantsRequest Container for the necessary parameters to
     *           execute the ListGrants service method on AWSKMS.
     * 
     * @return The response from the ListGrants service method, as returned
     *         by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidMarkerException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListGrantsResult listGrants(ListGrantsRequest listGrantsRequest) {
        ExecutionContext executionContext = createExecutionContext(listGrantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGrantsRequest> request = null;
        Response<ListGrantsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGrantsRequestMarshaller().marshall(listGrantsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListGrantsResult, JsonUnmarshallerContext> unmarshaller =
                new ListGrantsResultJsonUnmarshaller();
            JsonResponseHandler<ListGrantsResult> responseHandler =
                new JsonResponseHandler<ListGrantsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously
     * encrypted by using the Encrypt function.
     * </p>
     *
     * @param decryptRequest Container for the necessary parameters to
     *           execute the Decrypt service method on AWSKMS.
     * 
     * @return The response from the Decrypt service method, as returned by
     *         AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidGrantTokenException
     * @throws KeyUnavailableException
     * @throws NotFoundException
     * @throws DisabledException
     * @throws InvalidCiphertextException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DecryptResult decrypt(DecryptRequest decryptRequest) {
        ExecutionContext executionContext = createExecutionContext(decryptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DecryptRequest> request = null;
        Response<DecryptResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DecryptRequestMarshaller().marshall(decryptRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DecryptResult, JsonUnmarshallerContext> unmarshaller =
                new DecryptResultJsonUnmarshaller();
            JsonResponseHandler<DecryptResult> responseHandler =
                new JsonResponseHandler<DecryptResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Generates an unpredictable byte string.
     * </p>
     *
     * @param generateRandomRequest Container for the necessary parameters to
     *           execute the GenerateRandom service method on AWSKMS.
     * 
     * @return The response from the GenerateRandom service method, as
     *         returned by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GenerateRandomResult generateRandom(GenerateRandomRequest generateRandomRequest) {
        ExecutionContext executionContext = createExecutionContext(generateRandomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateRandomRequest> request = null;
        Response<GenerateRandomResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateRandomRequestMarshaller().marshall(generateRandomRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GenerateRandomResult, JsonUnmarshallerContext> unmarshaller =
                new GenerateRandomResultJsonUnmarshaller();
            JsonResponseHandler<GenerateRandomResult> responseHandler =
                new JsonResponseHandler<GenerateRandomResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves a Boolean value that indicates whether key rotation is
     * enabled for the specified key.
     * </p>
     *
     * @param getKeyRotationStatusRequest Container for the necessary
     *           parameters to execute the GetKeyRotationStatus service method on
     *           AWSKMS.
     * 
     * @return The response from the GetKeyRotationStatus service method, as
     *         returned by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetKeyRotationStatusResult getKeyRotationStatus(GetKeyRotationStatusRequest getKeyRotationStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(getKeyRotationStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyRotationStatusRequest> request = null;
        Response<GetKeyRotationStatusResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyRotationStatusRequestMarshaller().marshall(getKeyRotationStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetKeyRotationStatusResult, JsonUnmarshallerContext> unmarshaller =
                new GetKeyRotationStatusResultJsonUnmarshaller();
            JsonResponseHandler<GetKeyRotationStatusResult> responseHandler =
                new JsonResponseHandler<GetKeyRotationStatusResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Disables rotation of the specified key.
     * </p>
     *
     * @param disableKeyRotationRequest Container for the necessary
     *           parameters to execute the DisableKeyRotation service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void disableKeyRotation(DisableKeyRotationRequest disableKeyRotationRequest) {
        ExecutionContext executionContext = createExecutionContext(disableKeyRotationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableKeyRotationRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableKeyRotationRequestMarshaller().marshall(disableKeyRotationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Retrieves a list of policies attached to a key.
     * </p>
     *
     * @param listKeyPoliciesRequest Container for the necessary parameters
     *           to execute the ListKeyPolicies service method on AWSKMS.
     * 
     * @return The response from the ListKeyPolicies service method, as
     *         returned by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListKeyPoliciesResult listKeyPolicies(ListKeyPoliciesRequest listKeyPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listKeyPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKeyPoliciesRequest> request = null;
        Response<ListKeyPoliciesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKeyPoliciesRequestMarshaller().marshall(listKeyPoliciesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListKeyPoliciesResult, JsonUnmarshallerContext> unmarshaller =
                new ListKeyPoliciesResultJsonUnmarshaller();
            JsonResponseHandler<ListKeyPoliciesResult> responseHandler =
                new JsonResponseHandler<ListKeyPoliciesResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a display name for a customer master key. An alias can be
     * used to identify a key and should be unique. The console enforces a
     * one-to-one mapping between the alias and a key. An alias name can
     * contain only alphanumeric characters, forward slashes (/), underscores
     * (_), and dashes (-). An alias must start with the word "alias"
     * followed by a forward slash (alias/). An alias that begins with "aws"
     * after the forward slash (alias/aws...) is reserved by Amazon Web
     * Services (AWS).
     * </p>
     *
     * @param createAliasRequest Container for the necessary parameters to
     *           execute the CreateAlias service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws AlreadyExistsException
     * @throws InvalidAliasNameException
     * @throws NotFoundException
     * @throws KMSInternalException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createAlias(CreateAliasRequest createAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(createAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAliasRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAliasRequestMarshaller().marshall(createAliasRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Attaches a policy to the specified key.
     * </p>
     *
     * @param putKeyPolicyRequest Container for the necessary parameters to
     *           execute the PutKeyPolicy service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws MalformedPolicyDocumentException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws UnsupportedOperationException
     * @throws KMSInternalException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putKeyPolicy(PutKeyPolicyRequest putKeyPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(putKeyPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutKeyPolicyRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutKeyPolicyRequestMarshaller().marshall(putKeyPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Encrypts data on the server side with a new customer master key
     * without exposing the plaintext of the data on the client side. The
     * data is first decrypted and then encrypted. This operation can also be
     * used to change the encryption context of a ciphertext.
     * </p>
     *
     * @param reEncryptRequest Container for the necessary parameters to
     *           execute the ReEncrypt service method on AWSKMS.
     * 
     * @return The response from the ReEncrypt service method, as returned by
     *         AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidGrantTokenException
     * @throws KeyUnavailableException
     * @throws NotFoundException
     * @throws DisabledException
     * @throws InvalidCiphertextException
     * @throws InvalidKeyUsageException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReEncryptResult reEncrypt(ReEncryptRequest reEncryptRequest) {
        ExecutionContext executionContext = createExecutionContext(reEncryptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReEncryptRequest> request = null;
        Response<ReEncryptResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReEncryptRequestMarshaller().marshall(reEncryptRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ReEncryptResult, JsonUnmarshallerContext> unmarshaller =
                new ReEncryptResultJsonUnmarshaller();
            JsonResponseHandler<ReEncryptResult> responseHandler =
                new JsonResponseHandler<ReEncryptResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Revokes a grant. You can revoke a grant to actively deny operations
     * that depend on it.
     * </p>
     *
     * @param revokeGrantRequest Container for the necessary parameters to
     *           execute the RevokeGrant service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void revokeGrant(RevokeGrantRequest revokeGrantRequest) {
        ExecutionContext executionContext = createExecutionContext(revokeGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeGrantRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeGrantRequestMarshaller().marshall(revokeGrantRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Marks a key as enabled, thereby permitting its use. You can have up
     * to 25 enabled keys at one time.
     * </p>
     *
     * @param enableKeyRequest Container for the necessary parameters to
     *           execute the EnableKey service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void enableKey(EnableKeyRequest enableKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(enableKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableKeyRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableKeyRequestMarshaller().marshall(enableKeyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Marks a key as disabled, thereby preventing its use.
     * </p>
     *
     * @param disableKeyRequest Container for the necessary parameters to
     *           execute the DisableKey service method on AWSKMS.
     * 
     * 
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void disableKey(DisableKeyRequest disableKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(disableKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableKeyRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableKeyRequestMarshaller().marshall(disableKeyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Creates a customer master key. Customer master keys can be used to
     * encrypt small amounts of data (less than 4K) directly, but they are
     * most commonly used to encrypt or envelope data keys that are then used
     * to encrypt customer data. For more information about data keys, see
     * GenerateDataKey and GenerateDataKeyWithoutPlaintext.
     * </p>
     * 
     * @return The response from the CreateKey service method, as returned by
     *         AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws MalformedPolicyDocumentException
     * @throws InvalidArnException
     * @throws UnsupportedOperationException
     * @throws KMSInternalException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateKeyResult createKey() throws AmazonServiceException, AmazonClientException {
        return createKey(new CreateKeyRequest());
    }
    
    /**
     * <p>
     * Lists the customer master keys.
     * </p>
     * 
     * @return The response from the ListKeys service method, as returned by
     *         AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListKeysResult listKeys() throws AmazonServiceException, AmazonClientException {
        return listKeys(new ListKeysRequest());
    }
    
    /**
     * <p>
     * Lists all of the key aliases in the account.
     * </p>
     * 
     * @return The response from the ListAliases service method, as returned
     *         by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAliasesResult listAliases() throws AmazonServiceException, AmazonClientException {
        return listAliases(new ListAliasesRequest());
    }
    
    /**
     * <p>
     * Generates an unpredictable byte string.
     * </p>
     * 
     * @return The response from the GenerateRandom service method, as
     *         returned by AWSKMS.
     * 
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GenerateRandomResult generateRandom() throws AmazonServiceException, AmazonClientException {
        return generateRandom(new GenerateRandomRequest());
    }

    @Override
    public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);
    }

    @Override
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        super.setEndpoint(endpoint, serviceName, regionId);
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
        
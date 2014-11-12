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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.kms.model.*;

/**
 * Asynchronous client for accessing AWSKMS.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
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
public class AWSKMSAsyncClient extends AWSKMSClient
        implements AWSKMSAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
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
    public AWSKMSAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
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
    public AWSKMSAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSKMS using the specified AWS account credentials.
     * Default client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSKMSAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSKMS using the specified AWS account credentials
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSKMSAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSKMS using the specified AWS account credentials,
     * executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSKMSAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSKMS using the specified AWS account credentials provider.
     * Default client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSKMSAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSKMS using the specified AWS account credentials provider
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSKMSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSKMS using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     */
    public AWSKMSAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSKMS using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSKMSAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() followed by
     * getExecutorService().awaitTermination() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
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
     *           execute the CreateKey operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateKeyResult> createKeyAsync(final CreateKeyRequest createKeyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateKeyResult>() {
            public CreateKeyResult call() throws Exception {
                return createKey(createKeyRequest);
        }
    });
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
     *           execute the CreateKey operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateKeyResult> createKeyAsync(
            final CreateKeyRequest createKeyRequest,
            final AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateKeyResult>() {
            public CreateKeyResult call() throws Exception {
              CreateKeyResult result;
                try {
                result = createKey(createKeyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createKeyRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Encrypts plaintext into ciphertext by using a customer master key.
     * </p>
     *
     * @param encryptRequest Container for the necessary parameters to
     *           execute the Encrypt operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the Encrypt
     *         service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EncryptResult> encryptAsync(final EncryptRequest encryptRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EncryptResult>() {
            public EncryptResult call() throws Exception {
                return encrypt(encryptRequest);
        }
    });
    }

    /**
     * <p>
     * Encrypts plaintext into ciphertext by using a customer master key.
     * </p>
     *
     * @param encryptRequest Container for the necessary parameters to
     *           execute the Encrypt operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Encrypt
     *         service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EncryptResult> encryptAsync(
            final EncryptRequest encryptRequest,
            final AsyncHandler<EncryptRequest, EncryptResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EncryptResult>() {
            public EncryptResult call() throws Exception {
              EncryptResult result;
                try {
                result = encrypt(encryptRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(encryptRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Retrieves a policy attached to the specified key.
     * </p>
     *
     * @param getKeyPolicyRequest Container for the necessary parameters to
     *           execute the GetKeyPolicy operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         GetKeyPolicy service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetKeyPolicyResult> getKeyPolicyAsync(final GetKeyPolicyRequest getKeyPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetKeyPolicyResult>() {
            public GetKeyPolicyResult call() throws Exception {
                return getKeyPolicy(getKeyPolicyRequest);
        }
    });
    }

    /**
     * <p>
     * Retrieves a policy attached to the specified key.
     * </p>
     *
     * @param getKeyPolicyRequest Container for the necessary parameters to
     *           execute the GetKeyPolicy operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetKeyPolicy service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetKeyPolicyResult> getKeyPolicyAsync(
            final GetKeyPolicyRequest getKeyPolicyRequest,
            final AsyncHandler<GetKeyPolicyRequest, GetKeyPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetKeyPolicyResult>() {
            public GetKeyPolicyResult call() throws Exception {
              GetKeyPolicyResult result;
                try {
                result = getKeyPolicy(getKeyPolicyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getKeyPolicyRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Updates the description of a key.
     * </p>
     *
     * @param updateKeyDescriptionRequest Container for the necessary
     *           parameters to execute the UpdateKeyDescription operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateKeyDescription service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateKeyDescriptionAsync(final UpdateKeyDescriptionRequest updateKeyDescriptionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateKeyDescription(updateKeyDescriptionRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Updates the description of a key.
     * </p>
     *
     * @param updateKeyDescriptionRequest Container for the necessary
     *           parameters to execute the UpdateKeyDescription operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateKeyDescription service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateKeyDescriptionAsync(
            final UpdateKeyDescriptionRequest updateKeyDescriptionRequest,
            final AsyncHandler<UpdateKeyDescriptionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                updateKeyDescription(updateKeyDescriptionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateKeyDescriptionRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Lists the customer master keys.
     * </p>
     *
     * @param listKeysRequest Container for the necessary parameters to
     *           execute the ListKeys operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the ListKeys
     *         service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListKeysResult> listKeysAsync(final ListKeysRequest listKeysRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListKeysResult>() {
            public ListKeysResult call() throws Exception {
                return listKeys(listKeysRequest);
        }
    });
    }

    /**
     * <p>
     * Lists the customer master keys.
     * </p>
     *
     * @param listKeysRequest Container for the necessary parameters to
     *           execute the ListKeys operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the ListKeys
     *         service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListKeysResult> listKeysAsync(
            final ListKeysRequest listKeysRequest,
            final AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListKeysResult>() {
            public ListKeysResult call() throws Exception {
              ListKeysResult result;
                try {
                result = listKeys(listKeysRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listKeysRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Generates a secure data key. Data keys are used to encrypt and
     * decrypt data. They are wrapped by customer master keys.
     * </p>
     *
     * @param generateDataKeyRequest Container for the necessary parameters
     *           to execute the GenerateDataKey operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         GenerateDataKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GenerateDataKeyResult> generateDataKeyAsync(final GenerateDataKeyRequest generateDataKeyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GenerateDataKeyResult>() {
            public GenerateDataKeyResult call() throws Exception {
                return generateDataKey(generateDataKeyRequest);
        }
    });
    }

    /**
     * <p>
     * Generates a secure data key. Data keys are used to encrypt and
     * decrypt data. They are wrapped by customer master keys.
     * </p>
     *
     * @param generateDataKeyRequest Container for the necessary parameters
     *           to execute the GenerateDataKey operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GenerateDataKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GenerateDataKeyResult> generateDataKeyAsync(
            final GenerateDataKeyRequest generateDataKeyRequest,
            final AsyncHandler<GenerateDataKeyRequest, GenerateDataKeyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GenerateDataKeyResult>() {
            public GenerateDataKeyResult call() throws Exception {
              GenerateDataKeyResult result;
                try {
                result = generateDataKey(generateDataKeyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(generateDataKeyRequest, result);
                 return result;
        }
    });
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
     *           execute the CreateGrant operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateGrant service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateGrantResult> createGrantAsync(final CreateGrantRequest createGrantRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateGrantResult>() {
            public CreateGrantResult call() throws Exception {
                return createGrant(createGrantRequest);
        }
    });
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
     *           execute the CreateGrant operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateGrant service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateGrantResult> createGrantAsync(
            final CreateGrantRequest createGrantRequest,
            final AsyncHandler<CreateGrantRequest, CreateGrantResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateGrantResult>() {
            public CreateGrantResult call() throws Exception {
              CreateGrantResult result;
                try {
                result = createGrant(createGrantRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createGrantRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Lists all of the key aliases in the account.
     * </p>
     *
     * @param listAliasesRequest Container for the necessary parameters to
     *           execute the ListAliases operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         ListAliases service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListAliasesResult> listAliasesAsync(final ListAliasesRequest listAliasesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAliasesResult>() {
            public ListAliasesResult call() throws Exception {
                return listAliases(listAliasesRequest);
        }
    });
    }

    /**
     * <p>
     * Lists all of the key aliases in the account.
     * </p>
     *
     * @param listAliasesRequest Container for the necessary parameters to
     *           execute the ListAliases operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListAliases service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListAliasesResult> listAliasesAsync(
            final ListAliasesRequest listAliasesRequest,
            final AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAliasesResult>() {
            public ListAliasesResult call() throws Exception {
              ListAliasesResult result;
                try {
                result = listAliases(listAliasesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listAliasesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns a key wrapped by a customer master key without the plaintext
     * copy of that key. To retrieve the plaintext, see GenerateDataKey.
     * </p>
     *
     * @param generateDataKeyWithoutPlaintextRequest Container for the
     *           necessary parameters to execute the GenerateDataKeyWithoutPlaintext
     *           operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         GenerateDataKeyWithoutPlaintext service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GenerateDataKeyWithoutPlaintextResult> generateDataKeyWithoutPlaintextAsync(final GenerateDataKeyWithoutPlaintextRequest generateDataKeyWithoutPlaintextRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GenerateDataKeyWithoutPlaintextResult>() {
            public GenerateDataKeyWithoutPlaintextResult call() throws Exception {
                return generateDataKeyWithoutPlaintext(generateDataKeyWithoutPlaintextRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a key wrapped by a customer master key without the plaintext
     * copy of that key. To retrieve the plaintext, see GenerateDataKey.
     * </p>
     *
     * @param generateDataKeyWithoutPlaintextRequest Container for the
     *           necessary parameters to execute the GenerateDataKeyWithoutPlaintext
     *           operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GenerateDataKeyWithoutPlaintext service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GenerateDataKeyWithoutPlaintextResult> generateDataKeyWithoutPlaintextAsync(
            final GenerateDataKeyWithoutPlaintextRequest generateDataKeyWithoutPlaintextRequest,
            final AsyncHandler<GenerateDataKeyWithoutPlaintextRequest, GenerateDataKeyWithoutPlaintextResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GenerateDataKeyWithoutPlaintextResult>() {
            public GenerateDataKeyWithoutPlaintextResult call() throws Exception {
              GenerateDataKeyWithoutPlaintextResult result;
                try {
                result = generateDataKeyWithoutPlaintext(generateDataKeyWithoutPlaintextRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(generateDataKeyWithoutPlaintextRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the specified alias.
     * </p>
     *
     * @param deleteAliasRequest Container for the necessary parameters to
     *           execute the DeleteAlias operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAlias service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAliasAsync(final DeleteAliasRequest deleteAliasRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteAlias(deleteAliasRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the specified alias.
     * </p>
     *
     * @param deleteAliasRequest Container for the necessary parameters to
     *           execute the DeleteAlias operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAlias service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAliasAsync(
            final DeleteAliasRequest deleteAliasRequest,
            final AsyncHandler<DeleteAliasRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteAlias(deleteAliasRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteAliasRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Enables rotation of the specified customer master key.
     * </p>
     *
     * @param enableKeyRotationRequest Container for the necessary parameters
     *           to execute the EnableKeyRotation operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         EnableKeyRotation service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableKeyRotationAsync(final EnableKeyRotationRequest enableKeyRotationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                enableKeyRotation(enableKeyRotationRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Enables rotation of the specified customer master key.
     * </p>
     *
     * @param enableKeyRotationRequest Container for the necessary parameters
     *           to execute the EnableKeyRotation operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableKeyRotation service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableKeyRotationAsync(
            final EnableKeyRotationRequest enableKeyRotationRequest,
            final AsyncHandler<EnableKeyRotationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                enableKeyRotation(enableKeyRotationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(enableKeyRotationRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Retires a grant. You can retire a grant when you're done using it to
     * clean up. You should revoke a grant when you intend to actively deny
     * operations that depend on it.
     * </p>
     *
     * @param retireGrantRequest Container for the necessary parameters to
     *           execute the RetireGrant operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         RetireGrant service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> retireGrantAsync(final RetireGrantRequest retireGrantRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                retireGrant(retireGrantRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Retires a grant. You can retire a grant when you're done using it to
     * clean up. You should revoke a grant when you intend to actively deny
     * operations that depend on it.
     * </p>
     *
     * @param retireGrantRequest Container for the necessary parameters to
     *           execute the RetireGrant operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RetireGrant service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> retireGrantAsync(
            final RetireGrantRequest retireGrantRequest,
            final AsyncHandler<RetireGrantRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                retireGrant(retireGrantRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(retireGrantRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Provides detailed information about the specified customer master
     * key.
     * </p>
     *
     * @param describeKeyRequest Container for the necessary parameters to
     *           execute the DescribeKey operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeKeyResult> describeKeyAsync(final DescribeKeyRequest describeKeyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeKeyResult>() {
            public DescribeKeyResult call() throws Exception {
                return describeKey(describeKeyRequest);
        }
    });
    }

    /**
     * <p>
     * Provides detailed information about the specified customer master
     * key.
     * </p>
     *
     * @param describeKeyRequest Container for the necessary parameters to
     *           execute the DescribeKey operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeKeyResult> describeKeyAsync(
            final DescribeKeyRequest describeKeyRequest,
            final AsyncHandler<DescribeKeyRequest, DescribeKeyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeKeyResult>() {
            public DescribeKeyResult call() throws Exception {
              DescribeKeyResult result;
                try {
                result = describeKey(describeKeyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeKeyRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * List the grants for a specified key.
     * </p>
     *
     * @param listGrantsRequest Container for the necessary parameters to
     *           execute the ListGrants operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         ListGrants service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListGrantsResult> listGrantsAsync(final ListGrantsRequest listGrantsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListGrantsResult>() {
            public ListGrantsResult call() throws Exception {
                return listGrants(listGrantsRequest);
        }
    });
    }

    /**
     * <p>
     * List the grants for a specified key.
     * </p>
     *
     * @param listGrantsRequest Container for the necessary parameters to
     *           execute the ListGrants operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListGrants service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListGrantsResult> listGrantsAsync(
            final ListGrantsRequest listGrantsRequest,
            final AsyncHandler<ListGrantsRequest, ListGrantsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListGrantsResult>() {
            public ListGrantsResult call() throws Exception {
              ListGrantsResult result;
                try {
                result = listGrants(listGrantsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listGrantsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously
     * encrypted by using the Encrypt function.
     * </p>
     *
     * @param decryptRequest Container for the necessary parameters to
     *           execute the Decrypt operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the Decrypt
     *         service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DecryptResult> decryptAsync(final DecryptRequest decryptRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DecryptResult>() {
            public DecryptResult call() throws Exception {
                return decrypt(decryptRequest);
        }
    });
    }

    /**
     * <p>
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously
     * encrypted by using the Encrypt function.
     * </p>
     *
     * @param decryptRequest Container for the necessary parameters to
     *           execute the Decrypt operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Decrypt
     *         service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DecryptResult> decryptAsync(
            final DecryptRequest decryptRequest,
            final AsyncHandler<DecryptRequest, DecryptResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DecryptResult>() {
            public DecryptResult call() throws Exception {
              DecryptResult result;
                try {
                result = decrypt(decryptRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(decryptRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Generates an unpredictable byte string.
     * </p>
     *
     * @param generateRandomRequest Container for the necessary parameters to
     *           execute the GenerateRandom operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         GenerateRandom service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GenerateRandomResult> generateRandomAsync(final GenerateRandomRequest generateRandomRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GenerateRandomResult>() {
            public GenerateRandomResult call() throws Exception {
                return generateRandom(generateRandomRequest);
        }
    });
    }

    /**
     * <p>
     * Generates an unpredictable byte string.
     * </p>
     *
     * @param generateRandomRequest Container for the necessary parameters to
     *           execute the GenerateRandom operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GenerateRandom service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GenerateRandomResult> generateRandomAsync(
            final GenerateRandomRequest generateRandomRequest,
            final AsyncHandler<GenerateRandomRequest, GenerateRandomResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GenerateRandomResult>() {
            public GenerateRandomResult call() throws Exception {
              GenerateRandomResult result;
                try {
                result = generateRandom(generateRandomRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(generateRandomRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Retrieves a Boolean value that indicates whether key rotation is
     * enabled for the specified key.
     * </p>
     *
     * @param getKeyRotationStatusRequest Container for the necessary
     *           parameters to execute the GetKeyRotationStatus operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         GetKeyRotationStatus service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(final GetKeyRotationStatusRequest getKeyRotationStatusRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetKeyRotationStatusResult>() {
            public GetKeyRotationStatusResult call() throws Exception {
                return getKeyRotationStatus(getKeyRotationStatusRequest);
        }
    });
    }

    /**
     * <p>
     * Retrieves a Boolean value that indicates whether key rotation is
     * enabled for the specified key.
     * </p>
     *
     * @param getKeyRotationStatusRequest Container for the necessary
     *           parameters to execute the GetKeyRotationStatus operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetKeyRotationStatus service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(
            final GetKeyRotationStatusRequest getKeyRotationStatusRequest,
            final AsyncHandler<GetKeyRotationStatusRequest, GetKeyRotationStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetKeyRotationStatusResult>() {
            public GetKeyRotationStatusResult call() throws Exception {
              GetKeyRotationStatusResult result;
                try {
                result = getKeyRotationStatus(getKeyRotationStatusRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getKeyRotationStatusRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Disables rotation of the specified key.
     * </p>
     *
     * @param disableKeyRotationRequest Container for the necessary
     *           parameters to execute the DisableKeyRotation operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         DisableKeyRotation service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disableKeyRotationAsync(final DisableKeyRotationRequest disableKeyRotationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disableKeyRotation(disableKeyRotationRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Disables rotation of the specified key.
     * </p>
     *
     * @param disableKeyRotationRequest Container for the necessary
     *           parameters to execute the DisableKeyRotation operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableKeyRotation service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disableKeyRotationAsync(
            final DisableKeyRotationRequest disableKeyRotationRequest,
            final AsyncHandler<DisableKeyRotationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                disableKeyRotation(disableKeyRotationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(disableKeyRotationRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Retrieves a list of policies attached to a key.
     * </p>
     *
     * @param listKeyPoliciesRequest Container for the necessary parameters
     *           to execute the ListKeyPolicies operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         ListKeyPolicies service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListKeyPoliciesResult> listKeyPoliciesAsync(final ListKeyPoliciesRequest listKeyPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListKeyPoliciesResult>() {
            public ListKeyPoliciesResult call() throws Exception {
                return listKeyPolicies(listKeyPoliciesRequest);
        }
    });
    }

    /**
     * <p>
     * Retrieves a list of policies attached to a key.
     * </p>
     *
     * @param listKeyPoliciesRequest Container for the necessary parameters
     *           to execute the ListKeyPolicies operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListKeyPolicies service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListKeyPoliciesResult> listKeyPoliciesAsync(
            final ListKeyPoliciesRequest listKeyPoliciesRequest,
            final AsyncHandler<ListKeyPoliciesRequest, ListKeyPoliciesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListKeyPoliciesResult>() {
            public ListKeyPoliciesResult call() throws Exception {
              ListKeyPoliciesResult result;
                try {
                result = listKeyPolicies(listKeyPoliciesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listKeyPoliciesRequest, result);
                 return result;
        }
    });
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
     *           execute the CreateAlias operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAlias service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createAliasAsync(final CreateAliasRequest createAliasRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createAlias(createAliasRequest);
                return null;
        }
    });
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
     *           execute the CreateAlias operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAlias service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createAliasAsync(
            final CreateAliasRequest createAliasRequest,
            final AsyncHandler<CreateAliasRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                createAlias(createAliasRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createAliasRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Attaches a policy to the specified key.
     * </p>
     *
     * @param putKeyPolicyRequest Container for the necessary parameters to
     *           execute the PutKeyPolicy operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         PutKeyPolicy service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putKeyPolicyAsync(final PutKeyPolicyRequest putKeyPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                putKeyPolicy(putKeyPolicyRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Attaches a policy to the specified key.
     * </p>
     *
     * @param putKeyPolicyRequest Container for the necessary parameters to
     *           execute the PutKeyPolicy operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutKeyPolicy service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putKeyPolicyAsync(
            final PutKeyPolicyRequest putKeyPolicyRequest,
            final AsyncHandler<PutKeyPolicyRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                putKeyPolicy(putKeyPolicyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(putKeyPolicyRequest, null);
                 return null;
        }
    });
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
     *           execute the ReEncrypt operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         ReEncrypt service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReEncryptResult> reEncryptAsync(final ReEncryptRequest reEncryptRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReEncryptResult>() {
            public ReEncryptResult call() throws Exception {
                return reEncrypt(reEncryptRequest);
        }
    });
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
     *           execute the ReEncrypt operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReEncrypt service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReEncryptResult> reEncryptAsync(
            final ReEncryptRequest reEncryptRequest,
            final AsyncHandler<ReEncryptRequest, ReEncryptResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReEncryptResult>() {
            public ReEncryptResult call() throws Exception {
              ReEncryptResult result;
                try {
                result = reEncrypt(reEncryptRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(reEncryptRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Revokes a grant. You can revoke a grant to actively deny operations
     * that depend on it.
     * </p>
     *
     * @param revokeGrantRequest Container for the necessary parameters to
     *           execute the RevokeGrant operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeGrant service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> revokeGrantAsync(final RevokeGrantRequest revokeGrantRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                revokeGrant(revokeGrantRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Revokes a grant. You can revoke a grant to actively deny operations
     * that depend on it.
     * </p>
     *
     * @param revokeGrantRequest Container for the necessary parameters to
     *           execute the RevokeGrant operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeGrant service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> revokeGrantAsync(
            final RevokeGrantRequest revokeGrantRequest,
            final AsyncHandler<RevokeGrantRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                revokeGrant(revokeGrantRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(revokeGrantRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Marks a key as enabled, thereby permitting its use. You can have up
     * to 25 enabled keys at one time.
     * </p>
     *
     * @param enableKeyRequest Container for the necessary parameters to
     *           execute the EnableKey operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         EnableKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableKeyAsync(final EnableKeyRequest enableKeyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                enableKey(enableKeyRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Marks a key as enabled, thereby permitting its use. You can have up
     * to 25 enabled keys at one time.
     * </p>
     *
     * @param enableKeyRequest Container for the necessary parameters to
     *           execute the EnableKey operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableKeyAsync(
            final EnableKeyRequest enableKeyRequest,
            final AsyncHandler<EnableKeyRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                enableKey(enableKeyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(enableKeyRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Marks a key as disabled, thereby preventing its use.
     * </p>
     *
     * @param disableKeyRequest Container for the necessary parameters to
     *           execute the DisableKey operation on AWSKMS.
     * 
     * @return A Java Future object containing the response from the
     *         DisableKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disableKeyAsync(final DisableKeyRequest disableKeyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disableKey(disableKeyRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Marks a key as disabled, thereby preventing its use.
     * </p>
     *
     * @param disableKeyRequest Container for the necessary parameters to
     *           execute the DisableKey operation on AWSKMS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableKey service method, as returned by AWSKMS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSKMS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disableKeyAsync(
            final DisableKeyRequest disableKeyRequest,
            final AsyncHandler<DisableKeyRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                disableKey(disableKeyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(disableKeyRequest, null);
                 return null;
        }
    });
    }
    
}
        
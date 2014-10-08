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
package com.amazonaws.services.cognitoidentity;

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

import com.amazonaws.services.cognitoidentity.model.*;

/**
 * Asynchronous client for accessing AmazonCognitoIdentity.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * Amazon Cognito <p>
 * Amazon Cognito is a web service that delivers scoped temporary
 * credentials to mobile devices and other untrusted environments. Amazon
 * Cognito uniquely identifies a device and supplies the user with a
 * consistent identity over the lifetime of an application.
 * </p>
 * <p>
 * Using Amazon Cognito, you can enable authentication with one or more
 * third-party identity providers (Facebook, Google, or Login with
 * Amazon), and you can also choose to support unauthenticated access
 * from your app. Cognito delivers a unique identifier for each user and
 * acts as an OpenID token provider trusted by AWS Security Token Service
 * (STS) to access temporary, limited-privilege AWS credentials.
 * </p>
 * <p>
 * To provide end-user credentials, first make an unsigned call to GetId.
 * If the end user is authenticated with one of the supported identity
 * providers, set the <code>Logins</code> map with the identity provider
 * token. <code>GetId</code> returns a unique identifier for the user.
 * </p>
 * <p>
 * Next, make an unsigned call to GetOpenIdToken, which returns the
 * OpenID token necessary to call STS and retrieve AWS credentials. This
 * call expects the same <code>Logins</code> map as the
 * <code>GetId</code> call, as well as the <code>IdentityID</code>
 * originally returned by <code>GetId</code> . The token returned by
 * <code>GetOpenIdToken</code> can be passed to the STS operation
 * <a href="http://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRoleWithWebIdentity.html"> AssumeRoleWithWebIdentity </a>
 * to retrieve AWS credentials.
 * </p>
 */
public class AmazonCognitoIdentityAsyncClient extends AmazonCognitoIdentityClient
        implements AmazonCognitoIdentityAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoIdentity.  A credentials provider chain will be used
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
    public AmazonCognitoIdentityAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoIdentity.  A credentials provider chain will be used
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
     *                       client connects to AmazonCognitoIdentity
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCognitoIdentityAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoIdentity using the specified AWS account credentials.
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
    public AmazonCognitoIdentityAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoIdentity using the specified AWS account credentials
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
    public AmazonCognitoIdentityAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoIdentity using the specified AWS account credentials,
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
    public AmazonCognitoIdentityAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoIdentity using the specified AWS account credentials provider.
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
    public AmazonCognitoIdentityAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoIdentity using the specified AWS account credentials provider
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
    public AmazonCognitoIdentityAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoIdentity using the specified AWS account credentials
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
    public AmazonCognitoIdentityAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoIdentity using the specified AWS account credentials
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
    public AmazonCognitoIdentityAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Lists all of the Cognito identity pools registered for your account.
     * </p>
     *
     * @param listIdentityPoolsRequest Container for the necessary parameters
     *           to execute the ListIdentityPools operation on AmazonCognitoIdentity.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentityPools service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentityPoolsResult> listIdentityPoolsAsync(final ListIdentityPoolsRequest listIdentityPoolsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListIdentityPoolsResult>() {
            public ListIdentityPoolsResult call() throws Exception {
                return listIdentityPools(listIdentityPoolsRequest);
        }
    });
    }

    /**
     * <p>
     * Lists all of the Cognito identity pools registered for your account.
     * </p>
     *
     * @param listIdentityPoolsRequest Container for the necessary parameters
     *           to execute the ListIdentityPools operation on AmazonCognitoIdentity.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentityPools service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentityPoolsResult> listIdentityPoolsAsync(
            final ListIdentityPoolsRequest listIdentityPoolsRequest,
            final AsyncHandler<ListIdentityPoolsRequest, ListIdentityPoolsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListIdentityPoolsResult>() {
            public ListIdentityPoolsResult call() throws Exception {
              ListIdentityPoolsResult result;
                try {
                result = listIdentityPools(listIdentityPoolsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listIdentityPoolsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Merges two users having different <code>IdentityId</code> s, existing
     * in the same identity pool, and identified by the same developer
     * provider. You can use this action to request that discrete users be
     * merged and identified as a single user in the Cognito environment.
     * Cognito associates the given source user (
     * <code>SourceUserIdentifier</code> ) with the <code>IdentityId</code>
     * of the <code>DestinationUserIdentifier</code> . Only
     * developer-authenticated users can be merged. If the users to be merged
     * are associated with the same public provider, but as two different
     * users, an exception will be thrown.
     * </p>
     *
     * @param mergeDeveloperIdentitiesRequest Container for the necessary
     *           parameters to execute the MergeDeveloperIdentities operation on
     *           AmazonCognitoIdentity.
     * 
     * @return A Java Future object containing the response from the
     *         MergeDeveloperIdentities service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<MergeDeveloperIdentitiesResult> mergeDeveloperIdentitiesAsync(final MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<MergeDeveloperIdentitiesResult>() {
            public MergeDeveloperIdentitiesResult call() throws Exception {
                return mergeDeveloperIdentities(mergeDeveloperIdentitiesRequest);
        }
    });
    }

    /**
     * <p>
     * Merges two users having different <code>IdentityId</code> s, existing
     * in the same identity pool, and identified by the same developer
     * provider. You can use this action to request that discrete users be
     * merged and identified as a single user in the Cognito environment.
     * Cognito associates the given source user (
     * <code>SourceUserIdentifier</code> ) with the <code>IdentityId</code>
     * of the <code>DestinationUserIdentifier</code> . Only
     * developer-authenticated users can be merged. If the users to be merged
     * are associated with the same public provider, but as two different
     * users, an exception will be thrown.
     * </p>
     *
     * @param mergeDeveloperIdentitiesRequest Container for the necessary
     *           parameters to execute the MergeDeveloperIdentities operation on
     *           AmazonCognitoIdentity.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         MergeDeveloperIdentities service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<MergeDeveloperIdentitiesResult> mergeDeveloperIdentitiesAsync(
            final MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest,
            final AsyncHandler<MergeDeveloperIdentitiesRequest, MergeDeveloperIdentitiesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<MergeDeveloperIdentitiesResult>() {
            public MergeDeveloperIdentitiesResult call() throws Exception {
              MergeDeveloperIdentitiesResult result;
                try {
                result = mergeDeveloperIdentities(mergeDeveloperIdentitiesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(mergeDeveloperIdentitiesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets an OpenID token, using a known Cognito ID. This known Cognito ID
     * is returned by GetId. You can optionally add additional logins for the
     * identity. Supplying multiple logins creates an implicit link.
     * </p>
     * <p>
     * The OpenId token is valid for 15 minutes.
     * </p>
     *
     * @param getOpenIdTokenRequest Container for the necessary parameters to
     *           execute the GetOpenIdToken operation on AmazonCognitoIdentity.
     * 
     * @return A Java Future object containing the response from the
     *         GetOpenIdToken service method, as returned by AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetOpenIdTokenResult> getOpenIdTokenAsync(final GetOpenIdTokenRequest getOpenIdTokenRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetOpenIdTokenResult>() {
            public GetOpenIdTokenResult call() throws Exception {
                return getOpenIdToken(getOpenIdTokenRequest);
        }
    });
    }

    /**
     * <p>
     * Gets an OpenID token, using a known Cognito ID. This known Cognito ID
     * is returned by GetId. You can optionally add additional logins for the
     * identity. Supplying multiple logins creates an implicit link.
     * </p>
     * <p>
     * The OpenId token is valid for 15 minutes.
     * </p>
     *
     * @param getOpenIdTokenRequest Container for the necessary parameters to
     *           execute the GetOpenIdToken operation on AmazonCognitoIdentity.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetOpenIdToken service method, as returned by AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetOpenIdTokenResult> getOpenIdTokenAsync(
            final GetOpenIdTokenRequest getOpenIdTokenRequest,
            final AsyncHandler<GetOpenIdTokenRequest, GetOpenIdTokenResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetOpenIdTokenResult>() {
            public GetOpenIdTokenResult call() throws Exception {
              GetOpenIdTokenResult result;
                try {
                result = getOpenIdToken(getOpenIdTokenRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getOpenIdTokenRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Unlinks a <code>DeveloperUserIdentifier</code> from an existing
     * identity. Unlinked developer users will be considered new identities
     * next time they are seen. If, for a given Cognito identity, you remove
     * all federated identities as well as the developer user identifier, the
     * Cognito identity becomes inaccessible.
     * </p>
     *
     * @param unlinkDeveloperIdentityRequest Container for the necessary
     *           parameters to execute the UnlinkDeveloperIdentity operation on
     *           AmazonCognitoIdentity.
     * 
     * @return A Java Future object containing the response from the
     *         UnlinkDeveloperIdentity service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unlinkDeveloperIdentityAsync(final UnlinkDeveloperIdentityRequest unlinkDeveloperIdentityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                unlinkDeveloperIdentity(unlinkDeveloperIdentityRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Unlinks a <code>DeveloperUserIdentifier</code> from an existing
     * identity. Unlinked developer users will be considered new identities
     * next time they are seen. If, for a given Cognito identity, you remove
     * all federated identities as well as the developer user identifier, the
     * Cognito identity becomes inaccessible.
     * </p>
     *
     * @param unlinkDeveloperIdentityRequest Container for the necessary
     *           parameters to execute the UnlinkDeveloperIdentity operation on
     *           AmazonCognitoIdentity.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UnlinkDeveloperIdentity service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unlinkDeveloperIdentityAsync(
            final UnlinkDeveloperIdentityRequest unlinkDeveloperIdentityRequest,
            final AsyncHandler<UnlinkDeveloperIdentityRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                unlinkDeveloperIdentity(unlinkDeveloperIdentityRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(unlinkDeveloperIdentityRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Retrieves the <code>IdentityID</code> associated with a
     * <code>DeveloperUserIdentifier</code> or the list of
     * <code>DeveloperUserIdentifier</code> s associated with an
     * <code>IdentityId</code> for an existing identity. Either
     * <code>IdentityID</code> or <code>DeveloperUserIdentifier</code> must
     * not be null. If you supply only one of these values, the other value
     * will be searched in the database and returned as a part of the
     * response. If you supply both, <code>DeveloperUserIdentifier</code>
     * will be matched against <code>IdentityID</code> . If the values are
     * verified against the database, the response returns both values and is
     * the same as the request. Otherwise a
     * <code>ResourceConflictException</code> is thrown.
     * </p>
     *
     * @param lookupDeveloperIdentityRequest Container for the necessary
     *           parameters to execute the LookupDeveloperIdentity operation on
     *           AmazonCognitoIdentity.
     * 
     * @return A Java Future object containing the response from the
     *         LookupDeveloperIdentity service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<LookupDeveloperIdentityResult> lookupDeveloperIdentityAsync(final LookupDeveloperIdentityRequest lookupDeveloperIdentityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<LookupDeveloperIdentityResult>() {
            public LookupDeveloperIdentityResult call() throws Exception {
                return lookupDeveloperIdentity(lookupDeveloperIdentityRequest);
        }
    });
    }

    /**
     * <p>
     * Retrieves the <code>IdentityID</code> associated with a
     * <code>DeveloperUserIdentifier</code> or the list of
     * <code>DeveloperUserIdentifier</code> s associated with an
     * <code>IdentityId</code> for an existing identity. Either
     * <code>IdentityID</code> or <code>DeveloperUserIdentifier</code> must
     * not be null. If you supply only one of these values, the other value
     * will be searched in the database and returned as a part of the
     * response. If you supply both, <code>DeveloperUserIdentifier</code>
     * will be matched against <code>IdentityID</code> . If the values are
     * verified against the database, the response returns both values and is
     * the same as the request. Otherwise a
     * <code>ResourceConflictException</code> is thrown.
     * </p>
     *
     * @param lookupDeveloperIdentityRequest Container for the necessary
     *           parameters to execute the LookupDeveloperIdentity operation on
     *           AmazonCognitoIdentity.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         LookupDeveloperIdentity service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<LookupDeveloperIdentityResult> lookupDeveloperIdentityAsync(
            final LookupDeveloperIdentityRequest lookupDeveloperIdentityRequest,
            final AsyncHandler<LookupDeveloperIdentityRequest, LookupDeveloperIdentityResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<LookupDeveloperIdentityResult>() {
            public LookupDeveloperIdentityResult call() throws Exception {
              LookupDeveloperIdentityResult result;
                try {
                result = lookupDeveloperIdentity(lookupDeveloperIdentityRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(lookupDeveloperIdentityRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Unlinks a federated identity from an existing account. Unlinked
     * logins will be considered new identities next time they are seen.
     * Removing the last linked login will make this identity inaccessible.
     * </p>
     *
     * @param unlinkIdentityRequest Container for the necessary parameters to
     *           execute the UnlinkIdentity operation on AmazonCognitoIdentity.
     * 
     * @return A Java Future object containing the response from the
     *         UnlinkIdentity service method, as returned by AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unlinkIdentityAsync(final UnlinkIdentityRequest unlinkIdentityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                unlinkIdentity(unlinkIdentityRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Unlinks a federated identity from an existing account. Unlinked
     * logins will be considered new identities next time they are seen.
     * Removing the last linked login will make this identity inaccessible.
     * </p>
     *
     * @param unlinkIdentityRequest Container for the necessary parameters to
     *           execute the UnlinkIdentity operation on AmazonCognitoIdentity.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UnlinkIdentity service method, as returned by AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unlinkIdentityAsync(
            final UnlinkIdentityRequest unlinkIdentityRequest,
            final AsyncHandler<UnlinkIdentityRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                unlinkIdentity(unlinkIdentityRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(unlinkIdentityRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Gets details about a particular identity pool, including the pool
     * name, ID description, creation date, and current number of users.
     * </p>
     *
     * @param describeIdentityPoolRequest Container for the necessary
     *           parameters to execute the DescribeIdentityPool operation on
     *           AmazonCognitoIdentity.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIdentityPool service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIdentityPoolResult> describeIdentityPoolAsync(final DescribeIdentityPoolRequest describeIdentityPoolRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeIdentityPoolResult>() {
            public DescribeIdentityPoolResult call() throws Exception {
                return describeIdentityPool(describeIdentityPoolRequest);
        }
    });
    }

    /**
     * <p>
     * Gets details about a particular identity pool, including the pool
     * name, ID description, creation date, and current number of users.
     * </p>
     *
     * @param describeIdentityPoolRequest Container for the necessary
     *           parameters to execute the DescribeIdentityPool operation on
     *           AmazonCognitoIdentity.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIdentityPool service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIdentityPoolResult> describeIdentityPoolAsync(
            final DescribeIdentityPoolRequest describeIdentityPoolRequest,
            final AsyncHandler<DescribeIdentityPoolRequest, DescribeIdentityPoolResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeIdentityPoolResult>() {
            public DescribeIdentityPoolResult call() throws Exception {
              DescribeIdentityPoolResult result;
                try {
                result = describeIdentityPool(describeIdentityPoolRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeIdentityPoolRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Lists the identities in a pool.
     * </p>
     *
     * @param listIdentitiesRequest Container for the necessary parameters to
     *           execute the ListIdentities operation on AmazonCognitoIdentity.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentities service method, as returned by AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentitiesResult> listIdentitiesAsync(final ListIdentitiesRequest listIdentitiesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListIdentitiesResult>() {
            public ListIdentitiesResult call() throws Exception {
                return listIdentities(listIdentitiesRequest);
        }
    });
    }

    /**
     * <p>
     * Lists the identities in a pool.
     * </p>
     *
     * @param listIdentitiesRequest Container for the necessary parameters to
     *           execute the ListIdentities operation on AmazonCognitoIdentity.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentities service method, as returned by AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentitiesResult> listIdentitiesAsync(
            final ListIdentitiesRequest listIdentitiesRequest,
            final AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListIdentitiesResult>() {
            public ListIdentitiesResult call() throws Exception {
              ListIdentitiesResult result;
                try {
                result = listIdentities(listIdentitiesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listIdentitiesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes a user pool. Once a pool is deleted, users will not be able
     * to authenticate with the pool.
     * </p>
     *
     * @param deleteIdentityPoolRequest Container for the necessary
     *           parameters to execute the DeleteIdentityPool operation on
     *           AmazonCognitoIdentity.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIdentityPool service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteIdentityPoolAsync(final DeleteIdentityPoolRequest deleteIdentityPoolRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteIdentityPool(deleteIdentityPoolRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes a user pool. Once a pool is deleted, users will not be able
     * to authenticate with the pool.
     * </p>
     *
     * @param deleteIdentityPoolRequest Container for the necessary
     *           parameters to execute the DeleteIdentityPool operation on
     *           AmazonCognitoIdentity.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIdentityPool service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteIdentityPoolAsync(
            final DeleteIdentityPoolRequest deleteIdentityPoolRequest,
            final AsyncHandler<DeleteIdentityPoolRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteIdentityPool(deleteIdentityPoolRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteIdentityPoolRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Generates (or retrieves) a Cognito ID. Supplying multiple logins will
     * create an implicit linked account.
     * </p>
     *
     * @param getIdRequest Container for the necessary parameters to execute
     *           the GetId operation on AmazonCognitoIdentity.
     * 
     * @return A Java Future object containing the response from the GetId
     *         service method, as returned by AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdResult> getIdAsync(final GetIdRequest getIdRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdResult>() {
            public GetIdResult call() throws Exception {
                return getId(getIdRequest);
        }
    });
    }

    /**
     * <p>
     * Generates (or retrieves) a Cognito ID. Supplying multiple logins will
     * create an implicit linked account.
     * </p>
     *
     * @param getIdRequest Container for the necessary parameters to execute
     *           the GetId operation on AmazonCognitoIdentity.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the GetId
     *         service method, as returned by AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdResult> getIdAsync(
            final GetIdRequest getIdRequest,
            final AsyncHandler<GetIdRequest, GetIdResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdResult>() {
            public GetIdResult call() throws Exception {
              GetIdResult result;
                try {
                result = getId(getIdRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getIdRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Registers (or retrieves) a Cognito <code>IdentityId</code> and an
     * OpenID Connect token for a user authenticated by your backend
     * authentication process. Supplying multiple logins will create an
     * implicit linked account. You can only specify one developer provider
     * as part of the <code>Logins</code> map, which is linked to the
     * identity pool. The developer provider is the "domain" by which Cognito
     * will refer to your users.
     * </p>
     * <p>
     * You can use <code>GetOpenIdTokenForDeveloperIdentity</code> to create
     * a new identity and to link new logins (that is, user credentials
     * issued by a public provider or developer provider) to an existing
     * identity. When you want to create a new identity, the
     * <code>IdentityId</code> should be null. When you want to associate a
     * new login with an existing authenticated/unauthenticated identity, you
     * can do so by providing the existing <code>IdentityId</code> . This API
     * will create the identity in the specified <code>IdentityPoolId</code>
     * .
     * </p>
     *
     * @param getOpenIdTokenForDeveloperIdentityRequest Container for the
     *           necessary parameters to execute the GetOpenIdTokenForDeveloperIdentity
     *           operation on AmazonCognitoIdentity.
     * 
     * @return A Java Future object containing the response from the
     *         GetOpenIdTokenForDeveloperIdentity service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetOpenIdTokenForDeveloperIdentityResult> getOpenIdTokenForDeveloperIdentityAsync(final GetOpenIdTokenForDeveloperIdentityRequest getOpenIdTokenForDeveloperIdentityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetOpenIdTokenForDeveloperIdentityResult>() {
            public GetOpenIdTokenForDeveloperIdentityResult call() throws Exception {
                return getOpenIdTokenForDeveloperIdentity(getOpenIdTokenForDeveloperIdentityRequest);
        }
    });
    }

    /**
     * <p>
     * Registers (or retrieves) a Cognito <code>IdentityId</code> and an
     * OpenID Connect token for a user authenticated by your backend
     * authentication process. Supplying multiple logins will create an
     * implicit linked account. You can only specify one developer provider
     * as part of the <code>Logins</code> map, which is linked to the
     * identity pool. The developer provider is the "domain" by which Cognito
     * will refer to your users.
     * </p>
     * <p>
     * You can use <code>GetOpenIdTokenForDeveloperIdentity</code> to create
     * a new identity and to link new logins (that is, user credentials
     * issued by a public provider or developer provider) to an existing
     * identity. When you want to create a new identity, the
     * <code>IdentityId</code> should be null. When you want to associate a
     * new login with an existing authenticated/unauthenticated identity, you
     * can do so by providing the existing <code>IdentityId</code> . This API
     * will create the identity in the specified <code>IdentityPoolId</code>
     * .
     * </p>
     *
     * @param getOpenIdTokenForDeveloperIdentityRequest Container for the
     *           necessary parameters to execute the GetOpenIdTokenForDeveloperIdentity
     *           operation on AmazonCognitoIdentity.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetOpenIdTokenForDeveloperIdentity service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetOpenIdTokenForDeveloperIdentityResult> getOpenIdTokenForDeveloperIdentityAsync(
            final GetOpenIdTokenForDeveloperIdentityRequest getOpenIdTokenForDeveloperIdentityRequest,
            final AsyncHandler<GetOpenIdTokenForDeveloperIdentityRequest, GetOpenIdTokenForDeveloperIdentityResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetOpenIdTokenForDeveloperIdentityResult>() {
            public GetOpenIdTokenForDeveloperIdentityResult call() throws Exception {
              GetOpenIdTokenForDeveloperIdentityResult result;
                try {
                result = getOpenIdTokenForDeveloperIdentity(getOpenIdTokenForDeveloperIdentityRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getOpenIdTokenForDeveloperIdentityRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Updates a user pool.
     * </p>
     *
     * @param updateIdentityPoolRequest Container for the necessary
     *           parameters to execute the UpdateIdentityPool operation on
     *           AmazonCognitoIdentity.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateIdentityPool service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateIdentityPoolResult> updateIdentityPoolAsync(final UpdateIdentityPoolRequest updateIdentityPoolRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateIdentityPoolResult>() {
            public UpdateIdentityPoolResult call() throws Exception {
                return updateIdentityPool(updateIdentityPoolRequest);
        }
    });
    }

    /**
     * <p>
     * Updates a user pool.
     * </p>
     *
     * @param updateIdentityPoolRequest Container for the necessary
     *           parameters to execute the UpdateIdentityPool operation on
     *           AmazonCognitoIdentity.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateIdentityPool service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateIdentityPoolResult> updateIdentityPoolAsync(
            final UpdateIdentityPoolRequest updateIdentityPoolRequest,
            final AsyncHandler<UpdateIdentityPoolRequest, UpdateIdentityPoolResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateIdentityPoolResult>() {
            public UpdateIdentityPoolResult call() throws Exception {
              UpdateIdentityPoolResult result;
                try {
                result = updateIdentityPool(updateIdentityPoolRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateIdentityPoolRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a new identity pool. The identity pool is a store of user
     * identity information that is specific to your AWS account. The limit
     * on identity pools is 60 per account.
     * </p>
     *
     * @param createIdentityPoolRequest Container for the necessary
     *           parameters to execute the CreateIdentityPool operation on
     *           AmazonCognitoIdentity.
     * 
     * @return A Java Future object containing the response from the
     *         CreateIdentityPool service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateIdentityPoolResult> createIdentityPoolAsync(final CreateIdentityPoolRequest createIdentityPoolRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateIdentityPoolResult>() {
            public CreateIdentityPoolResult call() throws Exception {
                return createIdentityPool(createIdentityPoolRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a new identity pool. The identity pool is a store of user
     * identity information that is specific to your AWS account. The limit
     * on identity pools is 60 per account.
     * </p>
     *
     * @param createIdentityPoolRequest Container for the necessary
     *           parameters to execute the CreateIdentityPool operation on
     *           AmazonCognitoIdentity.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateIdentityPool service method, as returned by
     *         AmazonCognitoIdentity.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentity indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateIdentityPoolResult> createIdentityPoolAsync(
            final CreateIdentityPoolRequest createIdentityPoolRequest,
            final AsyncHandler<CreateIdentityPoolRequest, CreateIdentityPoolResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateIdentityPoolResult>() {
            public CreateIdentityPoolResult call() throws Exception {
              CreateIdentityPoolResult result;
                try {
                result = createIdentityPool(createIdentityPoolRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createIdentityPoolRequest, result);
                 return result;
        }
    });
    }
    
}
        
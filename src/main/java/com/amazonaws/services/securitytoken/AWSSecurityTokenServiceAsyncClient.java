/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitytoken;
            
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

import com.amazonaws.services.securitytoken.model.*;


/**
 * Client for accessing AWSSecurityTokenService.  All calls made
 * using this client are non-blocking and will immediately return a Java Future.
 * Callers must use the Future object to determine when the service call has actually
 * completed.
 * AWS Security Token Service <p>
 * This is the <i>AWS Security Token Service API Reference</i> . The AWS Security Token Service is a web service that enables you to request temporary,
 * limited-privilege credentials for AWS Identity and Access Management (IAM) users or for users that you authenticate (federated users). This guide
 * provides descriptions of the AWS Security Token Service API as well as links to related content in <a
 * href="http://docs.amazonwebservices.com/IAM/latest/UserGuide/"> Using IAM </a> .
 * </p>
 * <p>
 * For more detailed information about using this service, go to <a href="http://docs.amazonwebservices.com/IAM/latest/UserGuide/TokenBasedAuth.html">
 * Granting Temporary Access to Your AWS Resources </a> in <i>Using IAM</i> .
 * </p>
 * <p>
 * For specific information about setting up signatures and authorization through the API, go to <a
 * href="http://docs.amazonwebservices.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"> Making Query Requests </a> in <i>Using IAM</i> .
 * </p>
 * <p>
 * If you're new to AWS and need additional technical information about a specific AWS product, you can find the product's technical documentation at <a
 * href="http://aws.amazon.com/documentation/"> http://aws.amazon.com/documentation/ </a> .
 * </p>
 * <p>
 * We will refer to Amazon Identity and Access Management using the abbreviated form IAM. All copyrights and legal protections still apply.
 * </p> 
 */       
public class AWSSecurityTokenServiceAsyncClient extends AWSSecurityTokenServiceClient
        implements AWSSecurityTokenServiceAsync { 

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    
    /**
     * Constructs a new asynchronous client to invoke service methods on 
     * AWSSecurityTokenService using the specified AWS account credentials.
     * Default client settings will be used, and a default cached thread pool will be 
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
    public AWSSecurityTokenServiceAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSecurityTokenService using the specified AWS account credentials
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
    public AWSSecurityTokenServiceAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }
     
    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSecurityTokenService using the specified AWS account credentials,
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
    public AWSSecurityTokenServiceAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on 
     * AWSSecurityTokenService using the specified AWS account credentials provider.
     * Default client settings will be used, and a default cached thread pool will be 
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
    public AWSSecurityTokenServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }
    
    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSecurityTokenService using the specified AWS account credentials provider
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
    public AWSSecurityTokenServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSecurityTokenService using the specified AWS account credentials
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
    public AWSSecurityTokenServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, 
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
     * call getExecutorService().shutdown() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
            
    /**
     * <p>
     * The GetSessionToken action returns a set of temporary credentials for
     * an AWS account or IAM user. The credentials consist of an Access Key
     * ID, a Secret Access Key, and a security token. These credentials are
     * valid for the specified duration only. The session duration for IAM
     * users can be between one and 36 hours, with a default of 12 hours. The
     * session duration for AWS account owners is restricted to one hour.
     * </p>
     * <p>
     * For more information about using GetSessionToken to create temporary
     * credentials, go to <a
     * mazonwebservices.com/IAM/latest/UserGuide/CreatingSessionTokens.html">
     * Creating Temporary Credentials to Enable Access for IAM Users </a> in
     * <i>Using IAM</i> .
     * </p>
     *
     * @param getSessionTokenRequest Container for the necessary parameters
     *           to execute the GetSessionToken operation on AWSSecurityTokenService.
     * 
     * @return A Java Future object containing the response from the
     *         GetSessionToken service method, as returned by
     *         AWSSecurityTokenService.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetSessionTokenResult> getSessionTokenAsync(final GetSessionTokenRequest getSessionTokenRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSessionTokenResult>() {
            public GetSessionTokenResult call() throws Exception {
                return getSessionToken(getSessionTokenRequest);
		    }
		});
    }
    
    /**
     * <p>
     * The GetFederationToken action returns a set of temporary credentials
     * for a federated user with the user name and policy specified in the
     * request. The credentials consist of an Access Key ID, a Secret Access
     * Key, and a security token. The credentials are valid for the specified
     * duration, between one and 36 hours.
     * </p>
     * <p>
     * The federated user who holds these credentials has any permissions
     * allowed by the intersection of the specified policy and any resource
     * or user policies that apply to the caller of the GetFederationToken
     * API, and any resource policies that apply to the federated user's
     * Amazon Resource Name (ARN). For more information about how token
     * permissions work, see <a
     * ocs.amazonwebservices.com/IAM/latest/UserGuide/TokenPermissions.html">
     * Controlling Permissions in Temporary Credentials </a> in <i>Using AWS
     * Identity and Access Management</i> . For information about using
     * GetFederationToken to create temporary credentials, see <a
     * cs.amazonwebservices.com/IAM/latest/UserGuide/CreatingFedTokens.html">
     * Creating Temporary Credentials to Enable Access for Federated Users
     * </a> in <i>Using AWS Identity and Access Management</i> .
     * </p>
     *
     * @param getFederationTokenRequest Container for the necessary
     *           parameters to execute the GetFederationToken operation on
     *           AWSSecurityTokenService.
     * 
     * @return A Java Future object containing the response from the
     *         GetFederationToken service method, as returned by
     *         AWSSecurityTokenService.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetFederationTokenResult> getFederationTokenAsync(final GetFederationTokenRequest getFederationTokenRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetFederationTokenResult>() {
            public GetFederationTokenResult call() throws Exception {
                return getFederationToken(getFederationTokenRequest);
		    }
		});
    }
    
}
        
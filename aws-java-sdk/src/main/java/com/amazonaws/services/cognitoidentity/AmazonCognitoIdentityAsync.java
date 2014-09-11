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

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.cognitoidentity.model.*;

/**
 * Interface for accessing AmazonCognitoIdentity asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * Amazon Cognito <p>
 * Amazon Cognito is a web service that facilitates the delivery of
 * scoped, temporary credentials to mobile devices or other untrusted
 * environments. Amazon Cognito uniquely identifies a device or user and
 * supplies the user with a consistent identity throughout the lifetime
 * of an application.
 * </p>
 * <p>
 * Amazon Cognito lets users authenticate with third-party identity
 * providers (Facebook, Google, or Login with Amazon). As a developer,
 * you decide which identity providers to trust. You can also choose to
 * support unauthenticated access from your application. Your users are
 * provided with Cognito tokens that uniquely identify their device and
 * any information provided about third-party logins.
 * </p>
 */
public interface AmazonCognitoIdentityAsync extends AmazonCognitoIdentity {
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
    public Future<ListIdentityPoolsResult> listIdentityPoolsAsync(ListIdentityPoolsRequest listIdentityPoolsRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public Future<ListIdentityPoolsResult> listIdentityPoolsAsync(ListIdentityPoolsRequest listIdentityPoolsRequest,
            AsyncHandler<ListIdentityPoolsRequest, ListIdentityPoolsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets an OpenID token, using a known Cognito ID. This known Cognito ID
     * is returned from GetId. You can optionally add additional logins for
     * the identity. Supplying multiple logins creates an implicit link.
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
    public Future<GetOpenIdTokenResult> getOpenIdTokenAsync(GetOpenIdTokenRequest getOpenIdTokenRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets an OpenID token, using a known Cognito ID. This known Cognito ID
     * is returned from GetId. You can optionally add additional logins for
     * the identity. Supplying multiple logins creates an implicit link.
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
    public Future<GetOpenIdTokenResult> getOpenIdTokenAsync(GetOpenIdTokenRequest getOpenIdTokenRequest,
            AsyncHandler<GetOpenIdTokenRequest, GetOpenIdTokenResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

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
    public Future<Void> unlinkIdentityAsync(UnlinkIdentityRequest unlinkIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public Future<Void> unlinkIdentityAsync(UnlinkIdentityRequest unlinkIdentityRequest,
            AsyncHandler<UnlinkIdentityRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

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
    public Future<DescribeIdentityPoolResult> describeIdentityPoolAsync(DescribeIdentityPoolRequest describeIdentityPoolRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public Future<DescribeIdentityPoolResult> describeIdentityPoolAsync(DescribeIdentityPoolRequest describeIdentityPoolRequest,
            AsyncHandler<DescribeIdentityPoolRequest, DescribeIdentityPoolResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

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
    public Future<GetIdResult> getIdAsync(GetIdRequest getIdRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public Future<GetIdResult> getIdAsync(GetIdRequest getIdRequest,
            AsyncHandler<GetIdRequest, GetIdResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

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
    public Future<Void> deleteIdentityPoolAsync(DeleteIdentityPoolRequest deleteIdentityPoolRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public Future<Void> deleteIdentityPoolAsync(DeleteIdentityPoolRequest deleteIdentityPoolRequest,
            AsyncHandler<DeleteIdentityPoolRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

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
    public Future<ListIdentitiesResult> listIdentitiesAsync(ListIdentitiesRequest listIdentitiesRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public Future<ListIdentitiesResult> listIdentitiesAsync(ListIdentitiesRequest listIdentitiesRequest,
            AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

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
    public Future<UpdateIdentityPoolResult> updateIdentityPoolAsync(UpdateIdentityPoolRequest updateIdentityPoolRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public Future<UpdateIdentityPoolResult> updateIdentityPoolAsync(UpdateIdentityPoolRequest updateIdentityPoolRequest,
            AsyncHandler<UpdateIdentityPoolRequest, UpdateIdentityPoolResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new identity pool. The identity pool is a store of user
     * identity information that is specific to your AWS account.
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
    public Future<CreateIdentityPoolResult> createIdentityPoolAsync(CreateIdentityPoolRequest createIdentityPoolRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new identity pool. The identity pool is a store of user
     * identity information that is specific to your AWS account.
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
    public Future<CreateIdentityPoolResult> createIdentityPoolAsync(CreateIdentityPoolRequest createIdentityPoolRequest,
            AsyncHandler<CreateIdentityPoolRequest, CreateIdentityPoolResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        
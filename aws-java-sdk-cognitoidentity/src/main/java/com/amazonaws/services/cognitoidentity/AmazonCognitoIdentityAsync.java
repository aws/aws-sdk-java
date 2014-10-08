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
    public Future<MergeDeveloperIdentitiesResult> mergeDeveloperIdentitiesAsync(MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public Future<MergeDeveloperIdentitiesResult> mergeDeveloperIdentitiesAsync(MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest,
            AsyncHandler<MergeDeveloperIdentitiesRequest, MergeDeveloperIdentitiesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

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
    public Future<GetOpenIdTokenResult> getOpenIdTokenAsync(GetOpenIdTokenRequest getOpenIdTokenRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public Future<GetOpenIdTokenResult> getOpenIdTokenAsync(GetOpenIdTokenRequest getOpenIdTokenRequest,
            AsyncHandler<GetOpenIdTokenRequest, GetOpenIdTokenResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

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
    public Future<Void> unlinkDeveloperIdentityAsync(UnlinkDeveloperIdentityRequest unlinkDeveloperIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public Future<Void> unlinkDeveloperIdentityAsync(UnlinkDeveloperIdentityRequest unlinkDeveloperIdentityRequest,
            AsyncHandler<UnlinkDeveloperIdentityRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

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
    public Future<LookupDeveloperIdentityResult> lookupDeveloperIdentityAsync(LookupDeveloperIdentityRequest lookupDeveloperIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public Future<LookupDeveloperIdentityResult> lookupDeveloperIdentityAsync(LookupDeveloperIdentityRequest lookupDeveloperIdentityRequest,
            AsyncHandler<LookupDeveloperIdentityRequest, LookupDeveloperIdentityResult> asyncHandler)
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
    public Future<GetOpenIdTokenForDeveloperIdentityResult> getOpenIdTokenForDeveloperIdentityAsync(GetOpenIdTokenForDeveloperIdentityRequest getOpenIdTokenForDeveloperIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public Future<GetOpenIdTokenForDeveloperIdentityResult> getOpenIdTokenForDeveloperIdentityAsync(GetOpenIdTokenForDeveloperIdentityRequest getOpenIdTokenForDeveloperIdentityRequest,
            AsyncHandler<GetOpenIdTokenForDeveloperIdentityRequest, GetOpenIdTokenForDeveloperIdentityResult> asyncHandler)
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
    public Future<CreateIdentityPoolResult> createIdentityPoolAsync(CreateIdentityPoolRequest createIdentityPoolRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public Future<CreateIdentityPoolResult> createIdentityPoolAsync(CreateIdentityPoolRequest createIdentityPoolRequest,
            AsyncHandler<CreateIdentityPoolRequest, CreateIdentityPoolResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        
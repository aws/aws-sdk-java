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
package com.amazonaws.services.cognitoidentity;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidentity.model.*;

/**
 * Interface for accessing Amazon Cognito Identity asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cognitoidentity.AbstractAmazonCognitoIdentityAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Cognito Federated Identities</fullname>
 * <p>
 * Amazon Cognito Federated Identities is a web service that delivers scoped temporary credentials to mobile devices and
 * other untrusted environments. It uniquely identifies a device and supplies the user with a consistent identity over
 * the lifetime of an application.
 * </p>
 * <p>
 * Using Amazon Cognito Federated Identities, you can enable authentication with one or more third-party identity
 * providers (Facebook, Google, or Login with Amazon) or an Amazon Cognito user pool, and you can also choose to support
 * unauthenticated access from your app. Cognito delivers a unique identifier for each user and acts as an OpenID token
 * provider trusted by AWS Security Token Service (STS) to access temporary, limited-privilege AWS credentials.
 * </p>
 * <p>
 * For a description of the authentication flow from the Amazon Cognito Developer Guide see <a
 * href="https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html">Authentication Flow</a>.
 * </p>
 * <p>
 * For more information see <a
 * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-identity.html">Amazon Cognito Federated
 * Identities</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCognitoIdentityAsync extends AmazonCognitoIdentity {

    /**
     * <p>
     * Creates a new identity pool. The identity pool is a store of user identity information that is specific to your
     * AWS account. The limit on identity pools is 60 per account. The keys for <code>SupportedLoginProviders</code> are
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Facebook: <code>graph.facebook.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Google: <code>accounts.google.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon: <code>www.amazon.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Twitter: <code>api.twitter.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Digits: <code>www.digits.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param createIdentityPoolRequest
     *        Input to the CreateIdentityPool action.
     * @return A Java Future containing the result of the CreateIdentityPool operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.CreateIdentityPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/CreateIdentityPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIdentityPoolResult> createIdentityPoolAsync(CreateIdentityPoolRequest createIdentityPoolRequest);

    /**
     * <p>
     * Creates a new identity pool. The identity pool is a store of user identity information that is specific to your
     * AWS account. The limit on identity pools is 60 per account. The keys for <code>SupportedLoginProviders</code> are
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Facebook: <code>graph.facebook.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Google: <code>accounts.google.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon: <code>www.amazon.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Twitter: <code>api.twitter.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Digits: <code>www.digits.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param createIdentityPoolRequest
     *        Input to the CreateIdentityPool action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIdentityPool operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.CreateIdentityPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/CreateIdentityPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIdentityPoolResult> createIdentityPoolAsync(CreateIdentityPoolRequest createIdentityPoolRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIdentityPoolRequest, CreateIdentityPoolResult> asyncHandler);

    /**
     * <p>
     * Deletes identities from an identity pool. You can specify a list of 1-60 identities that you want to delete.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param deleteIdentitiesRequest
     *        Input to the <code>DeleteIdentities</code> action.
     * @return A Java Future containing the result of the DeleteIdentities operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.DeleteIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DeleteIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIdentitiesResult> deleteIdentitiesAsync(DeleteIdentitiesRequest deleteIdentitiesRequest);

    /**
     * <p>
     * Deletes identities from an identity pool. You can specify a list of 1-60 identities that you want to delete.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param deleteIdentitiesRequest
     *        Input to the <code>DeleteIdentities</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIdentities operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.DeleteIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DeleteIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIdentitiesResult> deleteIdentitiesAsync(DeleteIdentitiesRequest deleteIdentitiesRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIdentitiesRequest, DeleteIdentitiesResult> asyncHandler);

    /**
     * <p>
     * Deletes an identity pool. Once a pool is deleted, users will not be able to authenticate with the pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param deleteIdentityPoolRequest
     *        Input to the DeleteIdentityPool action.
     * @return A Java Future containing the result of the DeleteIdentityPool operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.DeleteIdentityPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DeleteIdentityPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIdentityPoolResult> deleteIdentityPoolAsync(DeleteIdentityPoolRequest deleteIdentityPoolRequest);

    /**
     * <p>
     * Deletes an identity pool. Once a pool is deleted, users will not be able to authenticate with the pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param deleteIdentityPoolRequest
     *        Input to the DeleteIdentityPool action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIdentityPool operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.DeleteIdentityPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DeleteIdentityPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIdentityPoolResult> deleteIdentityPoolAsync(DeleteIdentityPoolRequest deleteIdentityPoolRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIdentityPoolRequest, DeleteIdentityPoolResult> asyncHandler);

    /**
     * <p>
     * Returns metadata related to the given identity, including when the identity was created and any associated linked
     * logins.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param describeIdentityRequest
     *        Input to the <code>DescribeIdentity</code> action.
     * @return A Java Future containing the result of the DescribeIdentity operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.DescribeIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DescribeIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdentityResult> describeIdentityAsync(DescribeIdentityRequest describeIdentityRequest);

    /**
     * <p>
     * Returns metadata related to the given identity, including when the identity was created and any associated linked
     * logins.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param describeIdentityRequest
     *        Input to the <code>DescribeIdentity</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIdentity operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.DescribeIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DescribeIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdentityResult> describeIdentityAsync(DescribeIdentityRequest describeIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIdentityRequest, DescribeIdentityResult> asyncHandler);

    /**
     * <p>
     * Gets details about a particular identity pool, including the pool name, ID description, creation date, and
     * current number of users.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param describeIdentityPoolRequest
     *        Input to the DescribeIdentityPool action.
     * @return A Java Future containing the result of the DescribeIdentityPool operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.DescribeIdentityPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DescribeIdentityPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdentityPoolResult> describeIdentityPoolAsync(DescribeIdentityPoolRequest describeIdentityPoolRequest);

    /**
     * <p>
     * Gets details about a particular identity pool, including the pool name, ID description, creation date, and
     * current number of users.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param describeIdentityPoolRequest
     *        Input to the DescribeIdentityPool action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIdentityPool operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.DescribeIdentityPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DescribeIdentityPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdentityPoolResult> describeIdentityPoolAsync(DescribeIdentityPoolRequest describeIdentityPoolRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIdentityPoolRequest, DescribeIdentityPoolResult> asyncHandler);

    /**
     * <p>
     * Returns credentials for the provided identity ID. Any provided logins will be validated against supported login
     * providers. If the token is for cognito-identity.amazonaws.com, it will be passed through to AWS Security Token
     * Service with the appropriate role for the token.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param getCredentialsForIdentityRequest
     *        Input to the <code>GetCredentialsForIdentity</code> action.
     * @return A Java Future containing the result of the GetCredentialsForIdentity operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.GetCredentialsForIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetCredentialsForIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCredentialsForIdentityResult> getCredentialsForIdentityAsync(
            GetCredentialsForIdentityRequest getCredentialsForIdentityRequest);

    /**
     * <p>
     * Returns credentials for the provided identity ID. Any provided logins will be validated against supported login
     * providers. If the token is for cognito-identity.amazonaws.com, it will be passed through to AWS Security Token
     * Service with the appropriate role for the token.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param getCredentialsForIdentityRequest
     *        Input to the <code>GetCredentialsForIdentity</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCredentialsForIdentity operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.GetCredentialsForIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetCredentialsForIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCredentialsForIdentityResult> getCredentialsForIdentityAsync(
            GetCredentialsForIdentityRequest getCredentialsForIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<GetCredentialsForIdentityRequest, GetCredentialsForIdentityResult> asyncHandler);

    /**
     * <p>
     * Generates (or retrieves) a Cognito ID. Supplying multiple logins will create an implicit linked account.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param getIdRequest
     *        Input to the GetId action.
     * @return A Java Future containing the result of the GetId operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.GetId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetId" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIdResult> getIdAsync(GetIdRequest getIdRequest);

    /**
     * <p>
     * Generates (or retrieves) a Cognito ID. Supplying multiple logins will create an implicit linked account.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param getIdRequest
     *        Input to the GetId action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetId operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.GetId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetId" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIdResult> getIdAsync(GetIdRequest getIdRequest, com.amazonaws.handlers.AsyncHandler<GetIdRequest, GetIdResult> asyncHandler);

    /**
     * <p>
     * Gets the roles for an identity pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param getIdentityPoolRolesRequest
     *        Input to the <code>GetIdentityPoolRoles</code> action.
     * @return A Java Future containing the result of the GetIdentityPoolRoles operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.GetIdentityPoolRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetIdentityPoolRoles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdentityPoolRolesResult> getIdentityPoolRolesAsync(GetIdentityPoolRolesRequest getIdentityPoolRolesRequest);

    /**
     * <p>
     * Gets the roles for an identity pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param getIdentityPoolRolesRequest
     *        Input to the <code>GetIdentityPoolRoles</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIdentityPoolRoles operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.GetIdentityPoolRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetIdentityPoolRoles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdentityPoolRolesResult> getIdentityPoolRolesAsync(GetIdentityPoolRolesRequest getIdentityPoolRolesRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdentityPoolRolesRequest, GetIdentityPoolRolesResult> asyncHandler);

    /**
     * <p>
     * Gets an OpenID token, using a known Cognito ID. This known Cognito ID is returned by <a>GetId</a>. You can
     * optionally add additional logins for the identity. Supplying multiple logins creates an implicit link.
     * </p>
     * <p>
     * The OpenId token is valid for 10 minutes.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param getOpenIdTokenRequest
     *        Input to the GetOpenIdToken action.
     * @return A Java Future containing the result of the GetOpenIdToken operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.GetOpenIdToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetOpenIdToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOpenIdTokenResult> getOpenIdTokenAsync(GetOpenIdTokenRequest getOpenIdTokenRequest);

    /**
     * <p>
     * Gets an OpenID token, using a known Cognito ID. This known Cognito ID is returned by <a>GetId</a>. You can
     * optionally add additional logins for the identity. Supplying multiple logins creates an implicit link.
     * </p>
     * <p>
     * The OpenId token is valid for 10 minutes.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param getOpenIdTokenRequest
     *        Input to the GetOpenIdToken action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOpenIdToken operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.GetOpenIdToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetOpenIdToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOpenIdTokenResult> getOpenIdTokenAsync(GetOpenIdTokenRequest getOpenIdTokenRequest,
            com.amazonaws.handlers.AsyncHandler<GetOpenIdTokenRequest, GetOpenIdTokenResult> asyncHandler);

    /**
     * <p>
     * Registers (or retrieves) a Cognito <code>IdentityId</code> and an OpenID Connect token for a user authenticated
     * by your backend authentication process. Supplying multiple logins will create an implicit linked account. You can
     * only specify one developer provider as part of the <code>Logins</code> map, which is linked to the identity pool.
     * The developer provider is the "domain" by which Cognito will refer to your users.
     * </p>
     * <p>
     * You can use <code>GetOpenIdTokenForDeveloperIdentity</code> to create a new identity and to link new logins (that
     * is, user credentials issued by a public provider or developer provider) to an existing identity. When you want to
     * create a new identity, the <code>IdentityId</code> should be null. When you want to associate a new login with an
     * existing authenticated/unauthenticated identity, you can do so by providing the existing <code>IdentityId</code>.
     * This API will create the identity in the specified <code>IdentityPoolId</code>.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param getOpenIdTokenForDeveloperIdentityRequest
     *        Input to the <code>GetOpenIdTokenForDeveloperIdentity</code> action.
     * @return A Java Future containing the result of the GetOpenIdTokenForDeveloperIdentity operation returned by the
     *         service.
     * @sample AmazonCognitoIdentityAsync.GetOpenIdTokenForDeveloperIdentity
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetOpenIdTokenForDeveloperIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOpenIdTokenForDeveloperIdentityResult> getOpenIdTokenForDeveloperIdentityAsync(
            GetOpenIdTokenForDeveloperIdentityRequest getOpenIdTokenForDeveloperIdentityRequest);

    /**
     * <p>
     * Registers (or retrieves) a Cognito <code>IdentityId</code> and an OpenID Connect token for a user authenticated
     * by your backend authentication process. Supplying multiple logins will create an implicit linked account. You can
     * only specify one developer provider as part of the <code>Logins</code> map, which is linked to the identity pool.
     * The developer provider is the "domain" by which Cognito will refer to your users.
     * </p>
     * <p>
     * You can use <code>GetOpenIdTokenForDeveloperIdentity</code> to create a new identity and to link new logins (that
     * is, user credentials issued by a public provider or developer provider) to an existing identity. When you want to
     * create a new identity, the <code>IdentityId</code> should be null. When you want to associate a new login with an
     * existing authenticated/unauthenticated identity, you can do so by providing the existing <code>IdentityId</code>.
     * This API will create the identity in the specified <code>IdentityPoolId</code>.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param getOpenIdTokenForDeveloperIdentityRequest
     *        Input to the <code>GetOpenIdTokenForDeveloperIdentity</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOpenIdTokenForDeveloperIdentity operation returned by the
     *         service.
     * @sample AmazonCognitoIdentityAsyncHandler.GetOpenIdTokenForDeveloperIdentity
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetOpenIdTokenForDeveloperIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOpenIdTokenForDeveloperIdentityResult> getOpenIdTokenForDeveloperIdentityAsync(
            GetOpenIdTokenForDeveloperIdentityRequest getOpenIdTokenForDeveloperIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<GetOpenIdTokenForDeveloperIdentityRequest, GetOpenIdTokenForDeveloperIdentityResult> asyncHandler);

    /**
     * <p>
     * Lists the identities in an identity pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param listIdentitiesRequest
     *        Input to the ListIdentities action.
     * @return A Java Future containing the result of the ListIdentities operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.ListIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/ListIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(ListIdentitiesRequest listIdentitiesRequest);

    /**
     * <p>
     * Lists the identities in an identity pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param listIdentitiesRequest
     *        Input to the ListIdentities action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIdentities operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.ListIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/ListIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(ListIdentitiesRequest listIdentitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler);

    /**
     * <p>
     * Lists all of the Cognito identity pools registered for your account.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param listIdentityPoolsRequest
     *        Input to the ListIdentityPools action.
     * @return A Java Future containing the result of the ListIdentityPools operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.ListIdentityPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/ListIdentityPools"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentityPoolsResult> listIdentityPoolsAsync(ListIdentityPoolsRequest listIdentityPoolsRequest);

    /**
     * <p>
     * Lists all of the Cognito identity pools registered for your account.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param listIdentityPoolsRequest
     *        Input to the ListIdentityPools action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIdentityPools operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.ListIdentityPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/ListIdentityPools"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentityPoolsResult> listIdentityPoolsAsync(ListIdentityPoolsRequest listIdentityPoolsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIdentityPoolsRequest, ListIdentityPoolsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags that are assigned to an Amazon Cognito identity pool.
     * </p>
     * <p>
     * A tag is a label that you can apply to identity pools to categorize and manage them in different ways, such as by
     * purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * You can use this action up to 10 times per second, per account.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags that are assigned to an Amazon Cognito identity pool.
     * </p>
     * <p>
     * A tag is a label that you can apply to identity pools to categorize and manage them in different ways, such as by
     * purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * You can use this action up to 10 times per second, per account.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves the <code>IdentityID</code> associated with a <code>DeveloperUserIdentifier</code> or the list of
     * <code>DeveloperUserIdentifier</code> values associated with an <code>IdentityId</code> for an existing identity.
     * Either <code>IdentityID</code> or <code>DeveloperUserIdentifier</code> must not be null. If you supply only one
     * of these values, the other value will be searched in the database and returned as a part of the response. If you
     * supply both, <code>DeveloperUserIdentifier</code> will be matched against <code>IdentityID</code>. If the values
     * are verified against the database, the response returns both values and is the same as the request. Otherwise a
     * <code>ResourceConflictException</code> is thrown.
     * </p>
     * <p>
     * <code>LookupDeveloperIdentity</code> is intended for low-throughput control plane operations: for example, to
     * enable customer service to locate an identity ID by username. If you are using it for higher-volume operations
     * such as user authentication, your requests are likely to be throttled. <a>GetOpenIdTokenForDeveloperIdentity</a>
     * is a better option for higher-volume operations for user authentication.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param lookupDeveloperIdentityRequest
     *        Input to the <code>LookupDeveloperIdentityInput</code> action.
     * @return A Java Future containing the result of the LookupDeveloperIdentity operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.LookupDeveloperIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/LookupDeveloperIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<LookupDeveloperIdentityResult> lookupDeveloperIdentityAsync(LookupDeveloperIdentityRequest lookupDeveloperIdentityRequest);

    /**
     * <p>
     * Retrieves the <code>IdentityID</code> associated with a <code>DeveloperUserIdentifier</code> or the list of
     * <code>DeveloperUserIdentifier</code> values associated with an <code>IdentityId</code> for an existing identity.
     * Either <code>IdentityID</code> or <code>DeveloperUserIdentifier</code> must not be null. If you supply only one
     * of these values, the other value will be searched in the database and returned as a part of the response. If you
     * supply both, <code>DeveloperUserIdentifier</code> will be matched against <code>IdentityID</code>. If the values
     * are verified against the database, the response returns both values and is the same as the request. Otherwise a
     * <code>ResourceConflictException</code> is thrown.
     * </p>
     * <p>
     * <code>LookupDeveloperIdentity</code> is intended for low-throughput control plane operations: for example, to
     * enable customer service to locate an identity ID by username. If you are using it for higher-volume operations
     * such as user authentication, your requests are likely to be throttled. <a>GetOpenIdTokenForDeveloperIdentity</a>
     * is a better option for higher-volume operations for user authentication.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param lookupDeveloperIdentityRequest
     *        Input to the <code>LookupDeveloperIdentityInput</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the LookupDeveloperIdentity operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.LookupDeveloperIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/LookupDeveloperIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<LookupDeveloperIdentityResult> lookupDeveloperIdentityAsync(LookupDeveloperIdentityRequest lookupDeveloperIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<LookupDeveloperIdentityRequest, LookupDeveloperIdentityResult> asyncHandler);

    /**
     * <p>
     * Merges two users having different <code>IdentityId</code>s, existing in the same identity pool, and identified by
     * the same developer provider. You can use this action to request that discrete users be merged and identified as a
     * single user in the Cognito environment. Cognito associates the given source user (
     * <code>SourceUserIdentifier</code>) with the <code>IdentityId</code> of the <code>DestinationUserIdentifier</code>
     * . Only developer-authenticated users can be merged. If the users to be merged are associated with the same public
     * provider, but as two different users, an exception will be thrown.
     * </p>
     * <p>
     * The number of linked logins is limited to 20. So, the number of linked logins for the source user,
     * <code>SourceUserIdentifier</code>, and the destination user, <code>DestinationUserIdentifier</code>, together
     * should not be larger than 20. Otherwise, an exception will be thrown.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param mergeDeveloperIdentitiesRequest
     *        Input to the <code>MergeDeveloperIdentities</code> action.
     * @return A Java Future containing the result of the MergeDeveloperIdentities operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.MergeDeveloperIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/MergeDeveloperIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergeDeveloperIdentitiesResult> mergeDeveloperIdentitiesAsync(MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest);

    /**
     * <p>
     * Merges two users having different <code>IdentityId</code>s, existing in the same identity pool, and identified by
     * the same developer provider. You can use this action to request that discrete users be merged and identified as a
     * single user in the Cognito environment. Cognito associates the given source user (
     * <code>SourceUserIdentifier</code>) with the <code>IdentityId</code> of the <code>DestinationUserIdentifier</code>
     * . Only developer-authenticated users can be merged. If the users to be merged are associated with the same public
     * provider, but as two different users, an exception will be thrown.
     * </p>
     * <p>
     * The number of linked logins is limited to 20. So, the number of linked logins for the source user,
     * <code>SourceUserIdentifier</code>, and the destination user, <code>DestinationUserIdentifier</code>, together
     * should not be larger than 20. Otherwise, an exception will be thrown.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param mergeDeveloperIdentitiesRequest
     *        Input to the <code>MergeDeveloperIdentities</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MergeDeveloperIdentities operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.MergeDeveloperIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/MergeDeveloperIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergeDeveloperIdentitiesResult> mergeDeveloperIdentitiesAsync(MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest,
            com.amazonaws.handlers.AsyncHandler<MergeDeveloperIdentitiesRequest, MergeDeveloperIdentitiesResult> asyncHandler);

    /**
     * <p>
     * Sets the roles for an identity pool. These roles are used when making calls to <a>GetCredentialsForIdentity</a>
     * action.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param setIdentityPoolRolesRequest
     *        Input to the <code>SetIdentityPoolRoles</code> action.
     * @return A Java Future containing the result of the SetIdentityPoolRoles operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.SetIdentityPoolRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/SetIdentityPoolRoles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetIdentityPoolRolesResult> setIdentityPoolRolesAsync(SetIdentityPoolRolesRequest setIdentityPoolRolesRequest);

    /**
     * <p>
     * Sets the roles for an identity pool. These roles are used when making calls to <a>GetCredentialsForIdentity</a>
     * action.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param setIdentityPoolRolesRequest
     *        Input to the <code>SetIdentityPoolRoles</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetIdentityPoolRoles operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.SetIdentityPoolRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/SetIdentityPoolRoles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetIdentityPoolRolesResult> setIdentityPoolRolesAsync(SetIdentityPoolRolesRequest setIdentityPoolRolesRequest,
            com.amazonaws.handlers.AsyncHandler<SetIdentityPoolRolesRequest, SetIdentityPoolRolesResult> asyncHandler);

    /**
     * <p>
     * Assigns a set of tags to an Amazon Cognito identity pool. A tag is a label that you can use to categorize and
     * manage identity pools in different ways, such as by purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * Each tag consists of a key and value, both of which you define. A key is a general category for more specific
     * values. For example, if you have two versions of an identity pool, one for testing and another for production,
     * you might assign an <code>Environment</code> tag key to both identity pools. The value of this key might be
     * <code>Test</code> for one identity pool and <code>Production</code> for the other.
     * </p>
     * <p>
     * Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the
     * Billing and Cost Management console, where you can track the costs associated with your identity pools. In an IAM
     * policy, you can constrain permissions for identity pools based on specific tags or tag values.
     * </p>
     * <p>
     * You can use this action up to 5 times per second, per account. An identity pool can have as many as 50 tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns a set of tags to an Amazon Cognito identity pool. A tag is a label that you can use to categorize and
     * manage identity pools in different ways, such as by purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * Each tag consists of a key and value, both of which you define. A key is a general category for more specific
     * values. For example, if you have two versions of an identity pool, one for testing and another for production,
     * you might assign an <code>Environment</code> tag key to both identity pools. The value of this key might be
     * <code>Test</code> for one identity pool and <code>Production</code> for the other.
     * </p>
     * <p>
     * Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the
     * Billing and Cost Management console, where you can track the costs associated with your identity pools. In an IAM
     * policy, you can constrain permissions for identity pools based on specific tags or tag values.
     * </p>
     * <p>
     * You can use this action up to 5 times per second, per account. An identity pool can have as many as 50 tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Unlinks a <code>DeveloperUserIdentifier</code> from an existing identity. Unlinked developer users will be
     * considered new identities next time they are seen. If, for a given Cognito identity, you remove all federated
     * identities as well as the developer user identifier, the Cognito identity becomes inaccessible.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param unlinkDeveloperIdentityRequest
     *        Input to the <code>UnlinkDeveloperIdentity</code> action.
     * @return A Java Future containing the result of the UnlinkDeveloperIdentity operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.UnlinkDeveloperIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/UnlinkDeveloperIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UnlinkDeveloperIdentityResult> unlinkDeveloperIdentityAsync(UnlinkDeveloperIdentityRequest unlinkDeveloperIdentityRequest);

    /**
     * <p>
     * Unlinks a <code>DeveloperUserIdentifier</code> from an existing identity. Unlinked developer users will be
     * considered new identities next time they are seen. If, for a given Cognito identity, you remove all federated
     * identities as well as the developer user identifier, the Cognito identity becomes inaccessible.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param unlinkDeveloperIdentityRequest
     *        Input to the <code>UnlinkDeveloperIdentity</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnlinkDeveloperIdentity operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.UnlinkDeveloperIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/UnlinkDeveloperIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UnlinkDeveloperIdentityResult> unlinkDeveloperIdentityAsync(UnlinkDeveloperIdentityRequest unlinkDeveloperIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<UnlinkDeveloperIdentityRequest, UnlinkDeveloperIdentityResult> asyncHandler);

    /**
     * <p>
     * Unlinks a federated identity from an existing account. Unlinked logins will be considered new identities next
     * time they are seen. Removing the last linked login will make this identity inaccessible.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param unlinkIdentityRequest
     *        Input to the UnlinkIdentity action.
     * @return A Java Future containing the result of the UnlinkIdentity operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.UnlinkIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/UnlinkIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UnlinkIdentityResult> unlinkIdentityAsync(UnlinkIdentityRequest unlinkIdentityRequest);

    /**
     * <p>
     * Unlinks a federated identity from an existing account. Unlinked logins will be considered new identities next
     * time they are seen. Removing the last linked login will make this identity inaccessible.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param unlinkIdentityRequest
     *        Input to the UnlinkIdentity action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnlinkIdentity operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.UnlinkIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/UnlinkIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UnlinkIdentityResult> unlinkIdentityAsync(UnlinkIdentityRequest unlinkIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<UnlinkIdentityRequest, UnlinkIdentityResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from an Amazon Cognito identity pool. You can use this action up to 5 times per
     * second, per account
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from an Amazon Cognito identity pool. You can use this action up to 5 times per
     * second, per account
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an identity pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param updateIdentityPoolRequest
     *        An object representing an Amazon Cognito identity pool.
     * @return A Java Future containing the result of the UpdateIdentityPool operation returned by the service.
     * @sample AmazonCognitoIdentityAsync.UpdateIdentityPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/UpdateIdentityPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIdentityPoolResult> updateIdentityPoolAsync(UpdateIdentityPoolRequest updateIdentityPoolRequest);

    /**
     * <p>
     * Updates an identity pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param updateIdentityPoolRequest
     *        An object representing an Amazon Cognito identity pool.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIdentityPool operation returned by the service.
     * @sample AmazonCognitoIdentityAsyncHandler.UpdateIdentityPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/UpdateIdentityPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIdentityPoolResult> updateIdentityPoolAsync(UpdateIdentityPoolRequest updateIdentityPoolRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIdentityPoolRequest, UpdateIdentityPoolResult> asyncHandler);

}

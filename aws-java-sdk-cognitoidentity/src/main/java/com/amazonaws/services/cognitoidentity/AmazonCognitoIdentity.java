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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cognitoidentity.model.*;

/**
 * Interface for accessing Amazon Cognito Identity.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cognitoidentity.AbstractAmazonCognitoIdentity} instead.
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
public interface AmazonCognitoIdentity {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cognito-identity";

    /**
     * Overrides the default endpoint for this client ("https://cognito-identity.us-east-1.amazonaws.com"). Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cognito-identity.us-east-1.amazonaws.com") or a full URL, including
     * the protocol (ex: "https://cognito-identity.us-east-1.amazonaws.com"). If the protocol is not specified here, the
     * default protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "cognito-identity.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://cognito-identity.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonCognitoIdentity#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

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
     * @return Result of the CreateIdentityPool operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @throws LimitExceededException
     *         Thrown when the total number of user pools has exceeded a preset limit.
     * @sample AmazonCognitoIdentity.CreateIdentityPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/CreateIdentityPool"
     *      target="_top">AWS API Documentation</a>
     */
    CreateIdentityPoolResult createIdentityPool(CreateIdentityPoolRequest createIdentityPoolRequest);

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
     * @return Result of the DeleteIdentities operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.DeleteIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DeleteIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteIdentitiesResult deleteIdentities(DeleteIdentitiesRequest deleteIdentitiesRequest);

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
     * @return Result of the DeleteIdentityPool operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.DeleteIdentityPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DeleteIdentityPool"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteIdentityPoolResult deleteIdentityPool(DeleteIdentityPoolRequest deleteIdentityPoolRequest);

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
     * @return Result of the DescribeIdentity operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.DescribeIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DescribeIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeIdentityResult describeIdentity(DescribeIdentityRequest describeIdentityRequest);

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
     * @return Result of the DescribeIdentityPool operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.DescribeIdentityPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DescribeIdentityPool"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeIdentityPoolResult describeIdentityPool(DescribeIdentityPoolRequest describeIdentityPoolRequest);

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
     * @return Result of the GetCredentialsForIdentity operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InvalidIdentityPoolConfigurationException
     *         Thrown if the identity pool has no role associated for the given auth type (auth/unauth) or if the
     *         AssumeRole fails.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @throws ExternalServiceException
     *         An exception thrown when a dependent service such as Facebook or Twitter is not responding
     * @sample AmazonCognitoIdentity.GetCredentialsForIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetCredentialsForIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    GetCredentialsForIdentityResult getCredentialsForIdentity(GetCredentialsForIdentityRequest getCredentialsForIdentityRequest);

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
     * @return Result of the GetId operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @throws LimitExceededException
     *         Thrown when the total number of user pools has exceeded a preset limit.
     * @throws ExternalServiceException
     *         An exception thrown when a dependent service such as Facebook or Twitter is not responding
     * @sample AmazonCognitoIdentity.GetId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetId" target="_top">AWS API
     *      Documentation</a>
     */
    GetIdResult getId(GetIdRequest getIdRequest);

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
     * @return Result of the GetIdentityPoolRoles operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.GetIdentityPoolRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetIdentityPoolRoles"
     *      target="_top">AWS API Documentation</a>
     */
    GetIdentityPoolRolesResult getIdentityPoolRoles(GetIdentityPoolRolesRequest getIdentityPoolRolesRequest);

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
     * @return Result of the GetOpenIdToken operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @throws ExternalServiceException
     *         An exception thrown when a dependent service such as Facebook or Twitter is not responding
     * @sample AmazonCognitoIdentity.GetOpenIdToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetOpenIdToken"
     *      target="_top">AWS API Documentation</a>
     */
    GetOpenIdTokenResult getOpenIdToken(GetOpenIdTokenRequest getOpenIdTokenRequest);

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
     * @return Result of the GetOpenIdTokenForDeveloperIdentity operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @throws DeveloperUserAlreadyRegisteredException
     *         The provided developer user identifier is already registered with Cognito under a different identity ID.
     * @sample AmazonCognitoIdentity.GetOpenIdTokenForDeveloperIdentity
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetOpenIdTokenForDeveloperIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    GetOpenIdTokenForDeveloperIdentityResult getOpenIdTokenForDeveloperIdentity(
            GetOpenIdTokenForDeveloperIdentityRequest getOpenIdTokenForDeveloperIdentityRequest);

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
     * @return Result of the ListIdentities operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.ListIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/ListIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    ListIdentitiesResult listIdentities(ListIdentitiesRequest listIdentitiesRequest);

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
     * @return Result of the ListIdentityPools operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.ListIdentityPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/ListIdentityPools"
     *      target="_top">AWS API Documentation</a>
     */
    ListIdentityPoolsResult listIdentityPools(ListIdentityPoolsRequest listIdentityPoolsRequest);

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
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the LookupDeveloperIdentity operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.LookupDeveloperIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/LookupDeveloperIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    LookupDeveloperIdentityResult lookupDeveloperIdentity(LookupDeveloperIdentityRequest lookupDeveloperIdentityRequest);

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
     * @return Result of the MergeDeveloperIdentities operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.MergeDeveloperIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/MergeDeveloperIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    MergeDeveloperIdentitiesResult mergeDeveloperIdentities(MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest);

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
     * @return Result of the SetIdentityPoolRoles operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @throws ConcurrentModificationException
     *         Thrown if there are parallel requests to modify a resource.
     * @sample AmazonCognitoIdentity.SetIdentityPoolRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/SetIdentityPoolRoles"
     *      target="_top">AWS API Documentation</a>
     */
    SetIdentityPoolRolesResult setIdentityPoolRoles(SetIdentityPoolRolesRequest setIdentityPoolRolesRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

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
     * @return Result of the UnlinkDeveloperIdentity operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.UnlinkDeveloperIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/UnlinkDeveloperIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    UnlinkDeveloperIdentityResult unlinkDeveloperIdentity(UnlinkDeveloperIdentityRequest unlinkDeveloperIdentityRequest);

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
     * @return Result of the UnlinkIdentity operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @throws ExternalServiceException
     *         An exception thrown when a dependent service such as Facebook or Twitter is not responding
     * @sample AmazonCognitoIdentity.UnlinkIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/UnlinkIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    UnlinkIdentityResult unlinkIdentity(UnlinkIdentityRequest unlinkIdentityRequest);

    /**
     * <p>
     * Removes the specified tags from an Amazon Cognito identity pool. You can use this action up to 5 times per
     * second, per account
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
     * @return Result of the UpdateIdentityPool operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @throws ConcurrentModificationException
     *         Thrown if there are parallel requests to modify a resource.
     * @throws LimitExceededException
     *         Thrown when the total number of user pools has exceeded a preset limit.
     * @sample AmazonCognitoIdentity.UpdateIdentityPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/UpdateIdentityPool"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateIdentityPoolResult updateIdentityPool(UpdateIdentityPoolRequest updateIdentityPoolRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}

/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cognitoidp.model.*;

/**
 * Interface for accessing Amazon Cognito Identity Provider.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cognitoidp.AbstractAWSCognitoIdentityProvider} instead.
 * </p>
 * <p>
 * <p>
 * Using the Amazon Cognito user pools API, you can create a user pool to manage directories and users. You can
 * authenticate a user to obtain tokens related to user identity and access policies.
 * </p>
 * <p>
 * This API reference provides information about user pools in Amazon Cognito user pools.
 * </p>
 * <p>
 * For more information, see the <a
 * href="https://docs.aws.amazon.com/cognito/latest/developerguide/what-is-amazon-cognito.html">Amazon Cognito
 * Documentation</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCognitoIdentityProvider {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cognito-idp";

    /**
     * Overrides the default endpoint for this client ("https://cognito-idp.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cognito-idp.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://cognito-idp.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "cognito-idp.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://cognito-idp.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSCognitoIdentityProvider#setEndpoint(String)}, sets the regional endpoint for this
     * client's service calls. Callers can use this method to control which AWS region they want to work with.
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
     * Adds additional user attributes to the user pool schema.
     * </p>
     * 
     * @param addCustomAttributesRequest
     *        Represents the request to add custom attributes.
     * @return Result of the AddCustomAttributes operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserImportInProgressException
     *         This exception is thrown when you're trying to modify a user pool while a user import job is in progress
     *         for that pool.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AddCustomAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AddCustomAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    AddCustomAttributesResult addCustomAttributes(AddCustomAttributesRequest addCustomAttributesRequest);

    /**
     * <p>
     * Adds the specified user to the specified group.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminAddUserToGroupRequest
     * @return Result of the AdminAddUserToGroup operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminAddUserToGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminAddUserToGroup"
     *      target="_top">AWS API Documentation</a>
     */
    AdminAddUserToGroupResult adminAddUserToGroup(AdminAddUserToGroupRequest adminAddUserToGroupRequest);

    /**
     * <p>
     * Confirms user registration as an admin without using a confirmation code. Works on any user.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminConfirmSignUpRequest
     *        Represents the request to confirm user registration.
     * @return Result of the AdminConfirmSignUp operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when Amazon Cognito encounters an unexpected exception with Lambda.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         Lambda service.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyFailedAttemptsException
     *         This exception is thrown when the user has made too many failed attempts for a given action, such as
     *         sign-in.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when Amazon Cognito encounters an invalid Lambda response.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminConfirmSignUp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminConfirmSignUp" target="_top">AWS
     *      API Documentation</a>
     */
    AdminConfirmSignUpResult adminConfirmSignUp(AdminConfirmSignUpRequest adminConfirmSignUpRequest);

    /**
     * <p>
     * Creates a new user in the specified user pool.
     * </p>
     * <p>
     * If <code>MessageAction</code> isn't set, the default is to send a welcome message via email or phone (SMS).
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US telecom carriers require you to
     * register an origination phone number before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>. Amazon Cognito uses the registered
     * number automatically. Otherwise, Amazon Cognito users who must receive SMS messages might not be able to sign up,
     * activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other Amazon Web Service, Amazon Simple
     * Notification Service might place your account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox mode</a> </i>, you can send
     * messages only to verified phone numbers. After you test your app while in the sandbox environment, you can move
     * out of the sandbox and into production. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * This message is based on a template that you configured in your call to create or update a user pool. This
     * template includes your custom sign-up instructions and placeholders for user name and temporary password.
     * </p>
     * <p>
     * Alternatively, you can call <code>AdminCreateUser</code> with <code>SUPPRESS</code> for the
     * <code>MessageAction</code> parameter, and Amazon Cognito won't send any email.
     * </p>
     * <p>
     * In either case, the user will be in the <code>FORCE_CHANGE_PASSWORD</code> state until they sign in and change
     * their password.
     * </p>
     * <p>
     * <code>AdminCreateUser</code> requires developer credentials.
     * </p>
     * 
     * @param adminCreateUserRequest
     *        Represents the request to create a user in the specified user pool.
     * @return Result of the AdminCreateUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UsernameExistsException
     *         This exception is thrown when Amazon Cognito encounters a user name that already exists in the user pool.
     * @throws InvalidPasswordException
     *         This exception is thrown when Amazon Cognito encounters an invalid password.
     * @throws CodeDeliveryFailureException
     *         This exception is thrown when a verification code fails to deliver successfully.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when Amazon Cognito encounters an unexpected exception with Lambda.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when Amazon Cognito encounters an invalid Lambda response.
     * @throws PreconditionNotMetException
     *         This exception is thrown when a precondition is not met.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration doesn't have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is not valid for the role provided for SMS
     *         configuration. This can happen if you don't trust <code>cognito-idp.amazonaws.com</code> or the external
     *         ID provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UnsupportedUserStateException
     *         The request failed because the user is in an unsupported state.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminCreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminCreateUser" target="_top">AWS
     *      API Documentation</a>
     */
    AdminCreateUserResult adminCreateUser(AdminCreateUserRequest adminCreateUserRequest);

    /**
     * <p>
     * Deletes a user as an administrator. Works on any user.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminDeleteUserRequest
     *        Represents the request to delete a user as an administrator.
     * @return Result of the AdminDeleteUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminDeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDeleteUser" target="_top">AWS
     *      API Documentation</a>
     */
    AdminDeleteUserResult adminDeleteUser(AdminDeleteUserRequest adminDeleteUserRequest);

    /**
     * <p>
     * Deletes the user attributes in a user pool as an administrator. Works on any user.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminDeleteUserAttributesRequest
     *        Represents the request to delete user attributes as an administrator.
     * @return Result of the AdminDeleteUserAttributes operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminDeleteUserAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDeleteUserAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    AdminDeleteUserAttributesResult adminDeleteUserAttributes(AdminDeleteUserAttributesRequest adminDeleteUserAttributesRequest);

    /**
     * <p>
     * Prevents the user from signing in with the specified external (SAML or social) identity provider (IdP). If the
     * user that you want to deactivate is a Amazon Cognito user pools native username + password user, they can't use
     * their password to sign in. If the user to deactivate is a linked external IdP user, any link between that user
     * and an existing user is removed. When the external user signs in again, and the user is no longer attached to the
     * previously linked <code>DestinationUser</code>, the user must create a new user account. See <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminLinkProviderForUser.html"
     * >AdminLinkProviderForUser</a>.
     * </p>
     * <p>
     * This action is enabled only for admin access and requires developer credentials.
     * </p>
     * <p>
     * The <code>ProviderName</code> must match the value specified when creating an IdP for the pool.
     * </p>
     * <p>
     * To deactivate a native username + password user, the <code>ProviderName</code> value must be <code>Cognito</code>
     * and the <code>ProviderAttributeName</code> must be <code>Cognito_Subject</code>. The
     * <code>ProviderAttributeValue</code> must be the name that is used in the user pool for the user.
     * </p>
     * <p>
     * The <code>ProviderAttributeName</code> must always be <code>Cognito_Subject</code> for social IdPs. The
     * <code>ProviderAttributeValue</code> must always be the exact subject that was used when the user was originally
     * linked as a source user.
     * </p>
     * <p>
     * For de-linking a SAML identity, there are two scenarios. If the linked identity has not yet been used to sign in,
     * the <code>ProviderAttributeName</code> and <code>ProviderAttributeValue</code> must be the same values that were
     * used for the <code>SourceUser</code> when the identities were originally linked using
     * <code> AdminLinkProviderForUser</code> call. (If the linking was done with <code>ProviderAttributeName</code> set
     * to <code>Cognito_Subject</code>, the same applies here). However, if the user has already signed in, the
     * <code>ProviderAttributeName</code> must be <code>Cognito_Subject</code> and <code>ProviderAttributeValue</code>
     * must be the subject of the SAML assertion.
     * </p>
     * 
     * @param adminDisableProviderForUserRequest
     * @return Result of the AdminDisableProviderForUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account with an email address or phone number
     *         that has already been supplied as an alias for a different user profile. This exception indicates that an
     *         account with this email address or phone already exists in a user pool that you've configured to use
     *         email address or phone number as a sign-in alias.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminDisableProviderForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDisableProviderForUser"
     *      target="_top">AWS API Documentation</a>
     */
    AdminDisableProviderForUserResult adminDisableProviderForUser(AdminDisableProviderForUserRequest adminDisableProviderForUserRequest);

    /**
     * <p>
     * Deactivates a user and revokes all access tokens for the user. A deactivated user can't sign in, but still
     * appears in the responses to <code>GetUser</code> and <code>ListUsers</code> API requests.
     * </p>
     * <p>
     * You must make this API request with Amazon Web Services credentials that have
     * <code>cognito-idp:AdminDisableUser</code> permissions.
     * </p>
     * 
     * @param adminDisableUserRequest
     *        Represents the request to disable the user as an administrator.
     * @return Result of the AdminDisableUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminDisableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDisableUser" target="_top">AWS
     *      API Documentation</a>
     */
    AdminDisableUserResult adminDisableUser(AdminDisableUserRequest adminDisableUserRequest);

    /**
     * <p>
     * Enables the specified user as an administrator. Works on any user.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminEnableUserRequest
     *        Represents the request that enables the user as an administrator.
     * @return Result of the AdminEnableUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminEnableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminEnableUser" target="_top">AWS
     *      API Documentation</a>
     */
    AdminEnableUserResult adminEnableUser(AdminEnableUserRequest adminEnableUserRequest);

    /**
     * <p>
     * Forgets the device, as an administrator.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminForgetDeviceRequest
     *        Sends the forgot device request, as an administrator.
     * @return Result of the AdminForgetDevice operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is not valid.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminForgetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminForgetDevice" target="_top">AWS
     *      API Documentation</a>
     */
    AdminForgetDeviceResult adminForgetDevice(AdminForgetDeviceRequest adminForgetDeviceRequest);

    /**
     * <p>
     * Gets the device, as an administrator.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminGetDeviceRequest
     *        Represents the request to get the device, as an administrator.
     * @return Result of the AdminGetDevice operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is not valid.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @sample AWSCognitoIdentityProvider.AdminGetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminGetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    AdminGetDeviceResult adminGetDevice(AdminGetDeviceRequest adminGetDeviceRequest);

    /**
     * <p>
     * Gets the specified user by user name in a user pool as an administrator. Works on any user.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminGetUserRequest
     *        Represents the request to get the specified user as an administrator.
     * @return Result of the AdminGetUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminGetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminGetUser" target="_top">AWS API
     *      Documentation</a>
     */
    AdminGetUserResult adminGetUser(AdminGetUserRequest adminGetUserRequest);

    /**
     * <p>
     * Initiates the authentication flow, as an administrator.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US telecom carriers require you to
     * register an origination phone number before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>. Amazon Cognito uses the registered
     * number automatically. Otherwise, Amazon Cognito users who must receive SMS messages might not be able to sign up,
     * activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other Amazon Web Service, Amazon Simple
     * Notification Service might place your account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox mode</a> </i>, you can send
     * messages only to verified phone numbers. After you test your app while in the sandbox environment, you can move
     * out of the sandbox and into production. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminInitiateAuthRequest
     *        Initiates the authorization request, as an administrator.
     * @return Result of the AdminInitiateAuth operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when Amazon Cognito encounters an unexpected exception with Lambda.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is not valid.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when Amazon Cognito encounters an invalid Lambda response.
     * @throws MFAMethodNotFoundException
     *         This exception is thrown when Amazon Cognito can't find a multi-factor authentication (MFA) method.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration doesn't have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is not valid for the role provided for SMS
     *         configuration. This can happen if you don't trust <code>cognito-idp.amazonaws.com</code> or the external
     *         ID provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @sample AWSCognitoIdentityProvider.AdminInitiateAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminInitiateAuth" target="_top">AWS
     *      API Documentation</a>
     */
    AdminInitiateAuthResult adminInitiateAuth(AdminInitiateAuthRequest adminInitiateAuthRequest);

    /**
     * <p>
     * Links an existing user account in a user pool (<code>DestinationUser</code>) to an identity from an external IdP
     * (<code>SourceUser</code>) based on a specified attribute name and value from the external IdP. This allows you to
     * create a link from the existing user account to an external federated user identity that has not yet been used to
     * sign in. You can then use the federated user identity to sign in as the existing user account.
     * </p>
     * <p>
     * For example, if there is an existing user with a username and password, this API links that user to a federated
     * user identity. When the user signs in with a federated user identity, they sign in as the existing user account.
     * </p>
     * <note>
     * <p>
     * The maximum number of federated identities linked to a user is five.
     * </p>
     * </note> <important>
     * <p>
     * Because this API allows a user with an external federated identity to sign in as an existing user in the user
     * pool, it is critical that it only be used with external IdPs and provider attributes that have been trusted by
     * the application owner.
     * </p>
     * </important>
     * <p>
     * This action is administrative and requires developer credentials.
     * </p>
     * 
     * @param adminLinkProviderForUserRequest
     * @return Result of the AdminLinkProviderForUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account with an email address or phone number
     *         that has already been supplied as an alias for a different user profile. This exception indicates that an
     *         account with this email address or phone already exists in a user pool that you've configured to use
     *         email address or phone number as a sign-in alias.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminLinkProviderForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminLinkProviderForUser"
     *      target="_top">AWS API Documentation</a>
     */
    AdminLinkProviderForUserResult adminLinkProviderForUser(AdminLinkProviderForUserRequest adminLinkProviderForUserRequest);

    /**
     * <p>
     * Lists devices, as an administrator.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminListDevicesRequest
     *        Represents the request to list devices, as an administrator.
     * @return Result of the AdminListDevices operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is not valid.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @sample AWSCognitoIdentityProvider.AdminListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminListDevices" target="_top">AWS
     *      API Documentation</a>
     */
    AdminListDevicesResult adminListDevices(AdminListDevicesRequest adminListDevicesRequest);

    /**
     * <p>
     * Lists the groups that the user belongs to.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminListGroupsForUserRequest
     * @return Result of the AdminListGroupsForUser operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminListGroupsForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminListGroupsForUser"
     *      target="_top">AWS API Documentation</a>
     */
    AdminListGroupsForUserResult adminListGroupsForUser(AdminListGroupsForUserRequest adminListGroupsForUserRequest);

    /**
     * <p>
     * A history of user activity and any risks detected as part of Amazon Cognito advanced security.
     * </p>
     * 
     * @param adminListUserAuthEventsRequest
     * @return Result of the AdminListUserAuthEvents operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserPoolAddOnNotEnabledException
     *         This exception is thrown when user pool add-ons aren't enabled.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminListUserAuthEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminListUserAuthEvents"
     *      target="_top">AWS API Documentation</a>
     */
    AdminListUserAuthEventsResult adminListUserAuthEvents(AdminListUserAuthEventsRequest adminListUserAuthEventsRequest);

    /**
     * <p>
     * Removes the specified user from the specified group.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminRemoveUserFromGroupRequest
     * @return Result of the AdminRemoveUserFromGroup operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminRemoveUserFromGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminRemoveUserFromGroup"
     *      target="_top">AWS API Documentation</a>
     */
    AdminRemoveUserFromGroupResult adminRemoveUserFromGroup(AdminRemoveUserFromGroupRequest adminRemoveUserFromGroupRequest);

    /**
     * <p>
     * Resets the specified user's password in a user pool as an administrator. Works on any user.
     * </p>
     * <p>
     * When a developer calls this API, the current password is invalidated, so it must be changed. If a user tries to
     * sign in after the API is called, the app will get a PasswordResetRequiredException exception back and should
     * direct the user down the flow to reset the password, which is the same as the forgot password flow. In addition,
     * if the user pool has phone verification selected and a verified phone number exists for the user, or if email
     * verification is selected and a verified email exists for the user, calling this API will also result in sending a
     * message to the end user with the code to change their password.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US telecom carriers require you to
     * register an origination phone number before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>. Amazon Cognito uses the registered
     * number automatically. Otherwise, Amazon Cognito users who must receive SMS messages might not be able to sign up,
     * activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other Amazon Web Service, Amazon Simple
     * Notification Service might place your account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox mode</a> </i>, you can send
     * messages only to verified phone numbers. After you test your app while in the sandbox environment, you can move
     * out of the sandbox and into production. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminResetUserPasswordRequest
     *        Represents the request to reset a user's password as an administrator.
     * @return Result of the AdminResetUserPassword operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when Amazon Cognito encounters an unexpected exception with Lambda.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         Lambda service.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when Amazon Cognito encounters an invalid Lambda response.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration doesn't have permission to
     *         publish using Amazon SNS.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito isn't allowed to use your email identity. HTTP status code:
     *         400.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is not valid for the role provided for SMS
     *         configuration. This can happen if you don't trust <code>cognito-idp.amazonaws.com</code> or the external
     *         ID provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminResetUserPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminResetUserPassword"
     *      target="_top">AWS API Documentation</a>
     */
    AdminResetUserPasswordResult adminResetUserPassword(AdminResetUserPasswordRequest adminResetUserPasswordRequest);

    /**
     * <p>
     * Responds to an authentication challenge, as an administrator.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US telecom carriers require you to
     * register an origination phone number before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>. Amazon Cognito uses the registered
     * number automatically. Otherwise, Amazon Cognito users who must receive SMS messages might not be able to sign up,
     * activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other Amazon Web Service, Amazon Simple
     * Notification Service might place your account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox mode</a> </i>, you can send
     * messages only to verified phone numbers. After you test your app while in the sandbox environment, you can move
     * out of the sandbox and into production. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminRespondToAuthChallengeRequest
     *        The request to respond to the authentication challenge, as an administrator.
     * @return Result of the AdminRespondToAuthChallenge operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code doesn't match what the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when Amazon Cognito encounters an unexpected exception with Lambda.
     * @throws InvalidPasswordException
     *         This exception is thrown when Amazon Cognito encounters an invalid password.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when Amazon Cognito encounters an invalid Lambda response.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is not valid.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws MFAMethodNotFoundException
     *         This exception is thrown when Amazon Cognito can't find a multi-factor authentication (MFA) method.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration doesn't have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is not valid for the role provided for SMS
     *         configuration. This can happen if you don't trust <code>cognito-idp.amazonaws.com</code> or the external
     *         ID provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account with an email address or phone number
     *         that has already been supplied as an alias for a different user profile. This exception indicates that an
     *         account with this email address or phone already exists in a user pool that you've configured to use
     *         email address or phone number as a sign-in alias.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws SoftwareTokenMFANotFoundException
     *         This exception is thrown when the software token time-based one-time password (TOTP) multi-factor
     *         authentication (MFA) isn't activated for the user pool.
     * @sample AWSCognitoIdentityProvider.AdminRespondToAuthChallenge
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminRespondToAuthChallenge"
     *      target="_top">AWS API Documentation</a>
     */
    AdminRespondToAuthChallengeResult adminRespondToAuthChallenge(AdminRespondToAuthChallengeRequest adminRespondToAuthChallengeRequest);

    /**
     * <p>
     * The user's multi-factor authentication (MFA) preference, including which MFA options are activated, and if any
     * are preferred. Only one factor can be set as preferred. The preferred MFA factor will be used to authenticate a
     * user if multiple factors are activated. If multiple options are activated and no preference is set, a challenge
     * to choose an MFA option will be returned during sign-in.
     * </p>
     * 
     * @param adminSetUserMFAPreferenceRequest
     * @return Result of the AdminSetUserMFAPreference operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminSetUserMFAPreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminSetUserMFAPreference"
     *      target="_top">AWS API Documentation</a>
     */
    AdminSetUserMFAPreferenceResult adminSetUserMFAPreference(AdminSetUserMFAPreferenceRequest adminSetUserMFAPreferenceRequest);

    /**
     * <p>
     * Sets the specified user's password in a user pool as an administrator. Works on any user.
     * </p>
     * <p>
     * The password can be temporary or permanent. If it is temporary, the user status enters the
     * <code>FORCE_CHANGE_PASSWORD</code> state. When the user next tries to sign in, the InitiateAuth/AdminInitiateAuth
     * response will contain the <code>NEW_PASSWORD_REQUIRED</code> challenge. If the user doesn't sign in before it
     * expires, the user won't be able to sign in, and an administrator must reset their password.
     * </p>
     * <p>
     * Once the user has set a new password, or the password is permanent, the user status is set to
     * <code>Confirmed</code>.
     * </p>
     * 
     * @param adminSetUserPasswordRequest
     * @return Result of the AdminSetUserPassword operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InvalidPasswordException
     *         This exception is thrown when Amazon Cognito encounters an invalid password.
     * @sample AWSCognitoIdentityProvider.AdminSetUserPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminSetUserPassword"
     *      target="_top">AWS API Documentation</a>
     */
    AdminSetUserPasswordResult adminSetUserPassword(AdminSetUserPasswordRequest adminSetUserPasswordRequest);

    /**
     * <p>
     * <i>This action is no longer supported.</i> You can use it to configure only SMS MFA. You can't use it to
     * configure time-based one-time password (TOTP) software token MFA. To configure either type of MFA, use <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminSetUserMFAPreference.html"
     * >AdminSetUserMFAPreference</a> instead.
     * </p>
     * 
     * @param adminSetUserSettingsRequest
     *        You can use this parameter to set an MFA configuration that uses the SMS delivery medium.
     * @return Result of the AdminSetUserSettings operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminSetUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminSetUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    AdminSetUserSettingsResult adminSetUserSettings(AdminSetUserSettingsRequest adminSetUserSettingsRequest);

    /**
     * <p>
     * Provides feedback for an authentication event indicating if it was from a valid user. This feedback is used for
     * improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
     * </p>
     * 
     * @param adminUpdateAuthEventFeedbackRequest
     * @return Result of the AdminUpdateAuthEventFeedback operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserPoolAddOnNotEnabledException
     *         This exception is thrown when user pool add-ons aren't enabled.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminUpdateAuthEventFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUpdateAuthEventFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    AdminUpdateAuthEventFeedbackResult adminUpdateAuthEventFeedback(AdminUpdateAuthEventFeedbackRequest adminUpdateAuthEventFeedbackRequest);

    /**
     * <p>
     * Updates the device status as an administrator.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminUpdateDeviceStatusRequest
     *        The request to update the device status, as an administrator.
     * @return Result of the AdminUpdateDeviceStatus operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is not valid.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminUpdateDeviceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUpdateDeviceStatus"
     *      target="_top">AWS API Documentation</a>
     */
    AdminUpdateDeviceStatusResult adminUpdateDeviceStatus(AdminUpdateDeviceStatusRequest adminUpdateDeviceStatusRequest);

    /**
     * <p>
     * Updates the specified user's attributes, including developer attributes, as an administrator. Works on any user.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * In addition to updating user attributes, this API can also be used to mark phone and email as verified.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US telecom carriers require you to
     * register an origination phone number before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>. Amazon Cognito uses the registered
     * number automatically. Otherwise, Amazon Cognito users who must receive SMS messages might not be able to sign up,
     * activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other Amazon Web Service, Amazon Simple
     * Notification Service might place your account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox mode</a> </i>, you can send
     * messages only to verified phone numbers. After you test your app while in the sandbox environment, you can move
     * out of the sandbox and into production. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminUpdateUserAttributesRequest
     *        Represents the request to update the user's attributes as an administrator.
     * @return Result of the AdminUpdateUserAttributes operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when Amazon Cognito encounters an unexpected exception with Lambda.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when Amazon Cognito encounters an invalid Lambda response.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account with an email address or phone number
     *         that has already been supplied as an alias for a different user profile. This exception indicates that an
     *         account with this email address or phone already exists in a user pool that you've configured to use
     *         email address or phone number as a sign-in alias.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration doesn't have permission to
     *         publish using Amazon SNS.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito isn't allowed to use your email identity. HTTP status code:
     *         400.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is not valid for the role provided for SMS
     *         configuration. This can happen if you don't trust <code>cognito-idp.amazonaws.com</code> or the external
     *         ID provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @sample AWSCognitoIdentityProvider.AdminUpdateUserAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUpdateUserAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    AdminUpdateUserAttributesResult adminUpdateUserAttributes(AdminUpdateUserAttributesRequest adminUpdateUserAttributesRequest);

    /**
     * <p>
     * Signs out a user from all devices. You must sign <code>AdminUserGlobalSignOut</code> requests with Amazon Web
     * Services credentials. It also invalidates all refresh tokens that Amazon Cognito has issued to a user. The user's
     * current access and ID tokens remain valid until they expire. By default, access and ID tokens expire one hour
     * after they're issued. A user can still use a hosted UI cookie to retrieve new tokens for the duration of the
     * cookie validity period of 1 hour.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param adminUserGlobalSignOutRequest
     *        The request to sign out of all devices, as an administrator.
     * @return Result of the AdminUserGlobalSignOut operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminUserGlobalSignOut
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUserGlobalSignOut"
     *      target="_top">AWS API Documentation</a>
     */
    AdminUserGlobalSignOutResult adminUserGlobalSignOut(AdminUserGlobalSignOutRequest adminUserGlobalSignOutRequest);

    /**
     * <p>
     * Begins setup of time-based one-time password (TOTP) multi-factor authentication (MFA) for a user, with a unique
     * private key that Amazon Cognito generates and returns in the API response. You can authorize an
     * <code>AssociateSoftwareToken</code> request with either the user's access token, or a session string from a
     * challenge response that you received from Amazon Cognito.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito disassociates an existing software token when you verify the new token in a <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifySoftwareToken.html">
     * VerifySoftwareToken</a> API request. If you don't verify the software token and your user pool doesn't require
     * MFA, the user can then authenticate with user name and password credentials alone. If your user pool requires
     * TOTP MFA, Amazon Cognito generates an <code>MFA_SETUP</code> or <code>SOFTWARE_TOKEN_SETUP</code> challenge each
     * time your user signs. Complete setup with <code>AssociateSoftwareToken</code> and
     * <code>VerifySoftwareToken</code>.
     * </p>
     * <p>
     * After you set up software token MFA for your user, Amazon Cognito generates a <code>SOFTWARE_TOKEN_MFA</code>
     * challenge when they authenticate. Respond to this challenge with your user's TOTP.
     * </p>
     * </note>
     * 
     * @param associateSoftwareTokenRequest
     * @return Result of the AssociateSoftwareToken operation returned by the service.
     * @throws ConcurrentModificationException
     *         This exception is thrown if two or more modifications are happening concurrently.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws SoftwareTokenMFANotFoundException
     *         This exception is thrown when the software token time-based one-time password (TOTP) multi-factor
     *         authentication (MFA) isn't activated for the user pool.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.AssociateSoftwareToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AssociateSoftwareToken"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateSoftwareTokenResult associateSoftwareToken(AssociateSoftwareTokenRequest associateSoftwareTokenRequest);

    /**
     * <p>
     * Changes the password for a specified user in a user pool.
     * </p>
     * 
     * @param changePasswordRequest
     *        Represents the request to change a user password.
     * @return Result of the ChangePassword operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InvalidPasswordException
     *         This exception is thrown when Amazon Cognito encounters an invalid password.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.ChangePassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ChangePassword" target="_top">AWS API
     *      Documentation</a>
     */
    ChangePasswordResult changePassword(ChangePasswordRequest changePasswordRequest);

    /**
     * <p>
     * Confirms tracking of the device. This API call is the call that begins device tracking.
     * </p>
     * 
     * @param confirmDeviceRequest
     *        Confirms the device request.
     * @return Result of the ConfirmDevice operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InvalidPasswordException
     *         This exception is thrown when Amazon Cognito encounters an invalid password.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when Amazon Cognito encounters an invalid Lambda response.
     * @throws UsernameExistsException
     *         This exception is thrown when Amazon Cognito encounters a user name that already exists in the user pool.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is not valid.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.ConfirmDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ConfirmDevice" target="_top">AWS API
     *      Documentation</a>
     */
    ConfirmDeviceResult confirmDevice(ConfirmDeviceRequest confirmDeviceRequest);

    /**
     * <p>
     * Allows a user to enter a confirmation code to reset a forgotten password.
     * </p>
     * 
     * @param confirmForgotPasswordRequest
     *        The request representing the confirmation for a password reset.
     * @return Result of the ConfirmForgotPassword operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when Amazon Cognito encounters an unexpected exception with Lambda.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         Lambda service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InvalidPasswordException
     *         This exception is thrown when Amazon Cognito encounters an invalid password.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code doesn't match what the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws TooManyFailedAttemptsException
     *         This exception is thrown when the user has made too many failed attempts for a given action, such as
     *         sign-in.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when Amazon Cognito encounters an invalid Lambda response.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.ConfirmForgotPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ConfirmForgotPassword"
     *      target="_top">AWS API Documentation</a>
     */
    ConfirmForgotPasswordResult confirmForgotPassword(ConfirmForgotPasswordRequest confirmForgotPasswordRequest);

    /**
     * <p>
     * Confirms registration of a new user.
     * </p>
     * 
     * @param confirmSignUpRequest
     *        Represents the request to confirm registration of a user.
     * @return Result of the ConfirmSignUp operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when Amazon Cognito encounters an unexpected exception with Lambda.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         Lambda service.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyFailedAttemptsException
     *         This exception is thrown when the user has made too many failed attempts for a given action, such as
     *         sign-in.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code doesn't match what the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when Amazon Cognito encounters an invalid Lambda response.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account with an email address or phone number
     *         that has already been supplied as an alias for a different user profile. This exception indicates that an
     *         account with this email address or phone already exists in a user pool that you've configured to use
     *         email address or phone number as a sign-in alias.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.ConfirmSignUp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ConfirmSignUp" target="_top">AWS API
     *      Documentation</a>
     */
    ConfirmSignUpResult confirmSignUp(ConfirmSignUpRequest confirmSignUpRequest);

    /**
     * <p>
     * Creates a new group in the specified user pool.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param createGroupRequest
     * @return Result of the CreateGroup operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws GroupExistsException
     *         This exception is thrown when Amazon Cognito encounters a group that already exists in the user pool.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGroupResult createGroup(CreateGroupRequest createGroupRequest);

    /**
     * <p>
     * Creates an IdP for a user pool.
     * </p>
     * 
     * @param createIdentityProviderRequest
     * @return Result of the CreateIdentityProvider operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws DuplicateProviderException
     *         This exception is thrown when the provider is already supported by the user pool.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    CreateIdentityProviderResult createIdentityProvider(CreateIdentityProviderRequest createIdentityProviderRequest);

    /**
     * <p>
     * Creates a new OAuth2.0 resource server and defines custom scopes within it.
     * </p>
     * 
     * @param createResourceServerRequest
     * @return Result of the CreateResourceServer operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateResourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateResourceServer"
     *      target="_top">AWS API Documentation</a>
     */
    CreateResourceServerResult createResourceServer(CreateResourceServerRequest createResourceServerRequest);

    /**
     * <p>
     * Creates the user import job.
     * </p>
     * 
     * @param createUserImportJobRequest
     *        Represents the request to create the user import job.
     * @return Result of the CreateUserImportJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PreconditionNotMetException
     *         This exception is thrown when a precondition is not met.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateUserImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    CreateUserImportJobResult createUserImportJob(CreateUserImportJobRequest createUserImportJobRequest);

    /**
     * <p>
     * Creates a new Amazon Cognito user pool and sets the password policy for the pool.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US telecom carriers require you to
     * register an origination phone number before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>. Amazon Cognito uses the registered
     * number automatically. Otherwise, Amazon Cognito users who must receive SMS messages might not be able to sign up,
     * activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other Amazon Web Service, Amazon Simple
     * Notification Service might place your account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox mode</a> </i>, you can send
     * messages only to verified phone numbers. After you test your app while in the sandbox environment, you can move
     * out of the sandbox and into production. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param createUserPoolRequest
     *        Represents the request to create a user pool.
     * @return Result of the CreateUserPool operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration doesn't have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is not valid for the role provided for SMS
     *         configuration. This can happen if you don't trust <code>cognito-idp.amazonaws.com</code> or the external
     *         ID provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito isn't allowed to use your email identity. HTTP status code:
     *         400.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserPoolTaggingException
     *         This exception is thrown when a user pool tag can't be set or updated.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateUserPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPool" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserPoolResult createUserPool(CreateUserPoolRequest createUserPoolRequest);

    /**
     * <p>
     * Creates the user pool client.
     * </p>
     * <p>
     * When you create a new user pool client, token revocation is automatically activated. For more information about
     * revoking tokens, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     * >RevokeToken</a>.
     * </p>
     * 
     * @param createUserPoolClientRequest
     *        Represents the request to create a user pool client.
     * @return Result of the CreateUserPoolClient operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws ScopeDoesNotExistException
     *         This exception is thrown when the specified scope doesn't exist.
     * @throws InvalidOAuthFlowException
     *         This exception is thrown when the specified OAuth flow is not valid.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateUserPoolClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPoolClient"
     *      target="_top">AWS API Documentation</a>
     */
    CreateUserPoolClientResult createUserPoolClient(CreateUserPoolClientRequest createUserPoolClientRequest);

    /**
     * <p>
     * Creates a new domain for a user pool.
     * </p>
     * 
     * @param createUserPoolDomainRequest
     * @return Result of the CreateUserPoolDomain operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateUserPoolDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPoolDomain"
     *      target="_top">AWS API Documentation</a>
     */
    CreateUserPoolDomainResult createUserPoolDomain(CreateUserPoolDomainRequest createUserPoolDomainRequest);

    /**
     * <p>
     * Deletes a group.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGroupResult deleteGroup(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Deletes an IdP for a user pool.
     * </p>
     * 
     * @param deleteIdentityProviderRequest
     * @return Result of the DeleteIdentityProvider operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnsupportedIdentityProviderException
     *         This exception is thrown when the specified identifier isn't supported.
     * @throws ConcurrentModificationException
     *         This exception is thrown if two or more modifications are happening concurrently.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteIdentityProviderResult deleteIdentityProvider(DeleteIdentityProviderRequest deleteIdentityProviderRequest);

    /**
     * <p>
     * Deletes a resource server.
     * </p>
     * 
     * @param deleteResourceServerRequest
     * @return Result of the DeleteResourceServer operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteResourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteResourceServer"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourceServerResult deleteResourceServer(DeleteResourceServerRequest deleteResourceServerRequest);

    /**
     * <p>
     * Allows a user to delete himself or herself.
     * </p>
     * 
     * @param deleteUserRequest
     *        Represents the request to delete a user.
     * @return Result of the DeleteUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes the attributes for a user.
     * </p>
     * 
     * @param deleteUserAttributesRequest
     *        Represents the request to delete user attributes.
     * @return Result of the DeleteUserAttributes operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.DeleteUserAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUserAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteUserAttributesResult deleteUserAttributes(DeleteUserAttributesRequest deleteUserAttributesRequest);

    /**
     * <p>
     * Deletes the specified Amazon Cognito user pool.
     * </p>
     * 
     * @param deleteUserPoolRequest
     *        Represents the request to delete a user pool.
     * @return Result of the DeleteUserPool operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserImportInProgressException
     *         This exception is thrown when you're trying to modify a user pool while a user import job is in progress
     *         for that pool.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteUserPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUserPool" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserPoolResult deleteUserPool(DeleteUserPoolRequest deleteUserPoolRequest);

    /**
     * <p>
     * Allows the developer to delete the user pool client.
     * </p>
     * 
     * @param deleteUserPoolClientRequest
     *        Represents the request to delete a user pool client.
     * @return Result of the DeleteUserPoolClient operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws ConcurrentModificationException
     *         This exception is thrown if two or more modifications are happening concurrently.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteUserPoolClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUserPoolClient"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteUserPoolClientResult deleteUserPoolClient(DeleteUserPoolClientRequest deleteUserPoolClientRequest);

    /**
     * <p>
     * Deletes a domain for a user pool.
     * </p>
     * 
     * @param deleteUserPoolDomainRequest
     * @return Result of the DeleteUserPoolDomain operation returned by the service.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteUserPoolDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUserPoolDomain"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteUserPoolDomainResult deleteUserPoolDomain(DeleteUserPoolDomainRequest deleteUserPoolDomainRequest);

    /**
     * <p>
     * Gets information about a specific IdP.
     * </p>
     * 
     * @param describeIdentityProviderRequest
     * @return Result of the DescribeIdentityProvider operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeIdentityProviderResult describeIdentityProvider(DescribeIdentityProviderRequest describeIdentityProviderRequest);

    /**
     * <p>
     * Describes a resource server.
     * </p>
     * 
     * @param describeResourceServerRequest
     * @return Result of the DescribeResourceServer operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeResourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeResourceServer"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeResourceServerResult describeResourceServer(DescribeResourceServerRequest describeResourceServerRequest);

    /**
     * <p>
     * Describes the risk configuration.
     * </p>
     * 
     * @param describeRiskConfigurationRequest
     * @return Result of the DescribeRiskConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserPoolAddOnNotEnabledException
     *         This exception is thrown when user pool add-ons aren't enabled.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeRiskConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeRiskConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRiskConfigurationResult describeRiskConfiguration(DescribeRiskConfigurationRequest describeRiskConfigurationRequest);

    /**
     * <p>
     * Describes the user import job.
     * </p>
     * 
     * @param describeUserImportJobRequest
     *        Represents the request to describe the user import job.
     * @return Result of the DescribeUserImportJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeUserImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeUserImportJobResult describeUserImportJob(DescribeUserImportJobRequest describeUserImportJobRequest);

    /**
     * <p>
     * Returns the configuration information and metadata of the specified user pool.
     * </p>
     * 
     * @param describeUserPoolRequest
     *        Represents the request to describe the user pool.
     * @return Result of the DescribeUserPool operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserPoolTaggingException
     *         This exception is thrown when a user pool tag can't be set or updated.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeUserPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserPool" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeUserPoolResult describeUserPool(DescribeUserPoolRequest describeUserPoolRequest);

    /**
     * <p>
     * Client method for returning the configuration information and metadata of the specified user pool app client.
     * </p>
     * 
     * @param describeUserPoolClientRequest
     *        Represents the request to describe a user pool client.
     * @return Result of the DescribeUserPoolClient operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeUserPoolClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserPoolClient"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeUserPoolClientResult describeUserPoolClient(DescribeUserPoolClientRequest describeUserPoolClientRequest);

    /**
     * <p>
     * Gets information about a domain.
     * </p>
     * 
     * @param describeUserPoolDomainRequest
     * @return Result of the DescribeUserPoolDomain operation returned by the service.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeUserPoolDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserPoolDomain"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeUserPoolDomainResult describeUserPoolDomain(DescribeUserPoolDomainRequest describeUserPoolDomainRequest);

    /**
     * <p>
     * Forgets the specified device.
     * </p>
     * 
     * @param forgetDeviceRequest
     *        Represents the request to forget the device.
     * @return Result of the ForgetDevice operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is not valid.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.ForgetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ForgetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    ForgetDeviceResult forgetDevice(ForgetDeviceRequest forgetDeviceRequest);

    /**
     * <p>
     * Calling this API causes a message to be sent to the end user with a confirmation code that is required to change
     * the user's password. For the <code>Username</code> parameter, you can use the username or user alias. The method
     * used to send the confirmation code is sent according to the specified AccountRecoverySetting. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/how-to-recover-a-user-account.html">Recovering
     * User Accounts</a> in the <i>Amazon Cognito Developer Guide</i>. If neither a verified phone number nor a verified
     * email exists, an <code>InvalidParameterException</code> is thrown. To use the confirmation code for resetting the
     * password, call <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmForgotPassword.html"
     * >ConfirmForgotPassword</a>.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US telecom carriers require you to
     * register an origination phone number before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>. Amazon Cognito uses the registered
     * number automatically. Otherwise, Amazon Cognito users who must receive SMS messages might not be able to sign up,
     * activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other Amazon Web Service, Amazon Simple
     * Notification Service might place your account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox mode</a> </i>, you can send
     * messages only to verified phone numbers. After you test your app while in the sandbox environment, you can move
     * out of the sandbox and into production. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param forgotPasswordRequest
     *        Represents the request to reset a user's password.
     * @return Result of the ForgotPassword operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when Amazon Cognito encounters an unexpected exception with Lambda.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         Lambda service.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when Amazon Cognito encounters an invalid Lambda response.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration doesn't have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is not valid for the role provided for SMS
     *         configuration. This can happen if you don't trust <code>cognito-idp.amazonaws.com</code> or the external
     *         ID provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito isn't allowed to use your email identity. HTTP status code:
     *         400.
     * @throws CodeDeliveryFailureException
     *         This exception is thrown when a verification code fails to deliver successfully.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.ForgotPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ForgotPassword" target="_top">AWS API
     *      Documentation</a>
     */
    ForgotPasswordResult forgotPassword(ForgotPasswordRequest forgotPasswordRequest);

    /**
     * <p>
     * Gets the header information for the comma-separated value (CSV) file to be used as input for the user import job.
     * </p>
     * 
     * @param getCSVHeaderRequest
     *        Represents the request to get the header information of the CSV file for the user import job.
     * @return Result of the GetCSVHeader operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GetCSVHeader
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetCSVHeader" target="_top">AWS API
     *      Documentation</a>
     */
    GetCSVHeaderResult getCSVHeader(GetCSVHeaderRequest getCSVHeaderRequest);

    /**
     * <p>
     * Gets the device.
     * </p>
     * 
     * @param getDeviceRequest
     *        Represents the request to get the device.
     * @return Result of the GetDevice operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is not valid.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    GetDeviceResult getDevice(GetDeviceRequest getDeviceRequest);

    /**
     * <p>
     * Gets a group.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param getGroupRequest
     * @return Result of the GetGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    GetGroupResult getGroup(GetGroupRequest getGroupRequest);

    /**
     * <p>
     * Gets the specified IdP.
     * </p>
     * 
     * @param getIdentityProviderByIdentifierRequest
     * @return Result of the GetIdentityProviderByIdentifier operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GetIdentityProviderByIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetIdentityProviderByIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    GetIdentityProviderByIdentifierResult getIdentityProviderByIdentifier(GetIdentityProviderByIdentifierRequest getIdentityProviderByIdentifierRequest);

    /**
     * <p>
     * This method takes a user pool ID, and returns the signing certificate. The issued certificate is valid for 10
     * years from the date of issue.
     * </p>
     * <p>
     * Amazon Cognito issues and assigns a new signing certificate annually. This process returns a new value in the
     * response to <code>GetSigningCertificate</code>, but doesn't invalidate the original certificate.
     * </p>
     * 
     * @param getSigningCertificateRequest
     *        Request to get a signing certificate from Amazon Cognito.
     * @return Result of the GetSigningCertificate operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @sample AWSCognitoIdentityProvider.GetSigningCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetSigningCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    GetSigningCertificateResult getSigningCertificate(GetSigningCertificateRequest getSigningCertificateRequest);

    /**
     * <p>
     * Gets the user interface (UI) Customization information for a particular app client's app UI, if any such
     * information exists for the client. If nothing is set for the particular client, but there is an existing pool
     * level customization (the app <code>clientId</code> is <code>ALL</code>), then that information is returned. If
     * nothing is present, then an empty shape is returned.
     * </p>
     * 
     * @param getUICustomizationRequest
     * @return Result of the GetUICustomization operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GetUICustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUICustomization" target="_top">AWS
     *      API Documentation</a>
     */
    GetUICustomizationResult getUICustomization(GetUICustomizationRequest getUICustomizationRequest);

    /**
     * <p>
     * Gets the user attributes and metadata for a user.
     * </p>
     * 
     * @param getUserRequest
     *        Represents the request to get information about the user.
     * @return Result of the GetUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUser" target="_top">AWS API
     *      Documentation</a>
     */
    GetUserResult getUser(GetUserRequest getUserRequest);

    /**
     * <p>
     * Generates a user attribute verification code for the specified attribute name. Sends a message to a user with a
     * code that they must return in a VerifyUserAttribute request.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US telecom carriers require you to
     * register an origination phone number before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>. Amazon Cognito uses the registered
     * number automatically. Otherwise, Amazon Cognito users who must receive SMS messages might not be able to sign up,
     * activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other Amazon Web Service, Amazon Simple
     * Notification Service might place your account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox mode</a> </i>, you can send
     * messages only to verified phone numbers. After you test your app while in the sandbox environment, you can move
     * out of the sandbox and into production. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param getUserAttributeVerificationCodeRequest
     *        Represents the request to get user attribute verification.
     * @return Result of the GetUserAttributeVerificationCode operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when Amazon Cognito encounters an unexpected exception with Lambda.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when Amazon Cognito encounters an invalid Lambda response.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration doesn't have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is not valid for the role provided for SMS
     *         configuration. This can happen if you don't trust <code>cognito-idp.amazonaws.com</code> or the external
     *         ID provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito isn't allowed to use your email identity. HTTP status code:
     *         400.
     * @throws CodeDeliveryFailureException
     *         This exception is thrown when a verification code fails to deliver successfully.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.GetUserAttributeVerificationCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUserAttributeVerificationCode"
     *      target="_top">AWS API Documentation</a>
     */
    GetUserAttributeVerificationCodeResult getUserAttributeVerificationCode(GetUserAttributeVerificationCodeRequest getUserAttributeVerificationCodeRequest);

    /**
     * <p>
     * Gets the user pool multi-factor authentication (MFA) configuration.
     * </p>
     * 
     * @param getUserPoolMfaConfigRequest
     * @return Result of the GetUserPoolMfaConfig operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GetUserPoolMfaConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUserPoolMfaConfig"
     *      target="_top">AWS API Documentation</a>
     */
    GetUserPoolMfaConfigResult getUserPoolMfaConfig(GetUserPoolMfaConfigRequest getUserPoolMfaConfigRequest);

    /**
     * <p>
     * Signs out users from all devices. It also invalidates all refresh tokens that Amazon Cognito has issued to a
     * user. A user can still use a hosted UI cookie to retrieve new tokens for the duration of the 1-hour cookie
     * validity period.
     * </p>
     * 
     * @param globalSignOutRequest
     *        Represents the request to sign out all devices.
     * @return Result of the GlobalSignOut operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.GlobalSignOut
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GlobalSignOut" target="_top">AWS API
     *      Documentation</a>
     */
    GlobalSignOutResult globalSignOut(GlobalSignOutRequest globalSignOutRequest);

    /**
     * <p>
     * Initiates sign-in for a user in the Amazon Cognito user directory. You can't sign in a user with a federated IdP
     * with <code>InitiateAuth</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-identity-federation.html">
     * Adding user pool sign-in through a third party</a>.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US telecom carriers require you to
     * register an origination phone number before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>. Amazon Cognito uses the registered
     * number automatically. Otherwise, Amazon Cognito users who must receive SMS messages might not be able to sign up,
     * activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other Amazon Web Service, Amazon Simple
     * Notification Service might place your account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox mode</a> </i>, you can send
     * messages only to verified phone numbers. After you test your app while in the sandbox environment, you can move
     * out of the sandbox and into production. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param initiateAuthRequest
     *        Initiates the authentication request.
     * @return Result of the InitiateAuth operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when Amazon Cognito encounters an unexpected exception with Lambda.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is not valid.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when Amazon Cognito encounters an invalid Lambda response.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration doesn't have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is not valid for the role provided for SMS
     *         configuration. This can happen if you don't trust <code>cognito-idp.amazonaws.com</code> or the external
     *         ID provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.InitiateAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/InitiateAuth" target="_top">AWS API
     *      Documentation</a>
     */
    InitiateAuthResult initiateAuth(InitiateAuthRequest initiateAuthRequest);

    /**
     * <p>
     * Lists the sign-in devices that Amazon Cognito has registered to the current user.
     * </p>
     * 
     * @param listDevicesRequest
     *        Represents the request to list the devices.
     * @return Result of the ListDevices operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is not valid.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    ListDevicesResult listDevices(ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * Lists the groups associated with a user pool.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest);

    /**
     * <p>
     * Lists information about all IdPs for a user pool.
     * </p>
     * 
     * @param listIdentityProvidersRequest
     * @return Result of the ListIdentityProviders operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListIdentityProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListIdentityProviders"
     *      target="_top">AWS API Documentation</a>
     */
    ListIdentityProvidersResult listIdentityProviders(ListIdentityProvidersRequest listIdentityProvidersRequest);

    /**
     * <p>
     * Lists the resource servers for a user pool.
     * </p>
     * 
     * @param listResourceServersRequest
     * @return Result of the ListResourceServers operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListResourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListResourceServers"
     *      target="_top">AWS API Documentation</a>
     */
    ListResourceServersResult listResourceServers(ListResourceServersRequest listResourceServersRequest);

    /**
     * <p>
     * Lists the tags that are assigned to an Amazon Cognito user pool.
     * </p>
     * <p>
     * A tag is a label that you can apply to user pools to categorize and manage them in different ways, such as by
     * purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * You can use this action up to 10 times per second, per account.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the user import jobs.
     * </p>
     * 
     * @param listUserImportJobsRequest
     *        Represents the request to list the user import jobs.
     * @return Result of the ListUserImportJobs operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListUserImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUserImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListUserImportJobsResult listUserImportJobs(ListUserImportJobsRequest listUserImportJobsRequest);

    /**
     * <p>
     * Lists the clients that have been created for the specified user pool.
     * </p>
     * 
     * @param listUserPoolClientsRequest
     *        Represents the request to list the user pool clients.
     * @return Result of the ListUserPoolClients operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListUserPoolClients
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUserPoolClients"
     *      target="_top">AWS API Documentation</a>
     */
    ListUserPoolClientsResult listUserPoolClients(ListUserPoolClientsRequest listUserPoolClientsRequest);

    /**
     * <p>
     * Lists the user pools associated with an Amazon Web Services account.
     * </p>
     * 
     * @param listUserPoolsRequest
     *        Represents the request to list user pools.
     * @return Result of the ListUserPools operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListUserPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUserPools" target="_top">AWS API
     *      Documentation</a>
     */
    ListUserPoolsResult listUserPools(ListUserPoolsRequest listUserPoolsRequest);

    /**
     * <p>
     * Lists the users in the Amazon Cognito user pool.
     * </p>
     * 
     * @param listUsersRequest
     *        Represents the request to list users.
     * @return Result of the ListUsers operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Lists the users in the specified group.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param listUsersInGroupRequest
     * @return Result of the ListUsersInGroup operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListUsersInGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUsersInGroup" target="_top">AWS
     *      API Documentation</a>
     */
    ListUsersInGroupResult listUsersInGroup(ListUsersInGroupRequest listUsersInGroupRequest);

    /**
     * <p>
     * Resends the confirmation (for confirmation of registration) to a specific user in the user pool.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US telecom carriers require you to
     * register an origination phone number before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>. Amazon Cognito uses the registered
     * number automatically. Otherwise, Amazon Cognito users who must receive SMS messages might not be able to sign up,
     * activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other Amazon Web Service, Amazon Simple
     * Notification Service might place your account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox mode</a> </i>, you can send
     * messages only to verified phone numbers. After you test your app while in the sandbox environment, you can move
     * out of the sandbox and into production. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param resendConfirmationCodeRequest
     *        Represents the request to resend the confirmation code.
     * @return Result of the ResendConfirmationCode operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when Amazon Cognito encounters an unexpected exception with Lambda.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         Lambda service.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when Amazon Cognito encounters an invalid Lambda response.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration doesn't have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is not valid for the role provided for SMS
     *         configuration. This can happen if you don't trust <code>cognito-idp.amazonaws.com</code> or the external
     *         ID provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito isn't allowed to use your email identity. HTTP status code:
     *         400.
     * @throws CodeDeliveryFailureException
     *         This exception is thrown when a verification code fails to deliver successfully.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.ResendConfirmationCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ResendConfirmationCode"
     *      target="_top">AWS API Documentation</a>
     */
    ResendConfirmationCodeResult resendConfirmationCode(ResendConfirmationCodeRequest resendConfirmationCodeRequest);

    /**
     * <p>
     * Responds to the authentication challenge.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US telecom carriers require you to
     * register an origination phone number before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>. Amazon Cognito uses the registered
     * number automatically. Otherwise, Amazon Cognito users who must receive SMS messages might not be able to sign up,
     * activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other Amazon Web Service, Amazon Simple
     * Notification Service might place your account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox mode</a> </i>, you can send
     * messages only to verified phone numbers. After you test your app while in the sandbox environment, you can move
     * out of the sandbox and into production. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param respondToAuthChallengeRequest
     *        The request to respond to an authentication challenge.
     * @return Result of the RespondToAuthChallenge operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code doesn't match what the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when Amazon Cognito encounters an unexpected exception with Lambda.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         Lambda service.
     * @throws InvalidPasswordException
     *         This exception is thrown when Amazon Cognito encounters an invalid password.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when Amazon Cognito encounters an invalid Lambda response.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is not valid.
     * @throws MFAMethodNotFoundException
     *         This exception is thrown when Amazon Cognito can't find a multi-factor authentication (MFA) method.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration doesn't have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is not valid for the role provided for SMS
     *         configuration. This can happen if you don't trust <code>cognito-idp.amazonaws.com</code> or the external
     *         ID provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account with an email address or phone number
     *         that has already been supplied as an alias for a different user profile. This exception indicates that an
     *         account with this email address or phone already exists in a user pool that you've configured to use
     *         email address or phone number as a sign-in alias.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws SoftwareTokenMFANotFoundException
     *         This exception is thrown when the software token time-based one-time password (TOTP) multi-factor
     *         authentication (MFA) isn't activated for the user pool.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.RespondToAuthChallenge
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/RespondToAuthChallenge"
     *      target="_top">AWS API Documentation</a>
     */
    RespondToAuthChallengeResult respondToAuthChallenge(RespondToAuthChallengeRequest respondToAuthChallengeRequest);

    /**
     * <p>
     * Revokes all of the access tokens generated by, and at the same time as, the specified refresh token. After a
     * token is revoked, you can't use the revoked token to access Amazon Cognito user APIs, or to authorize access to
     * your resource server.
     * </p>
     * 
     * @param revokeTokenRequest
     * @return Result of the RevokeToken operation returned by the service.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws UnauthorizedException
     *         Exception that is thrown when the request isn't authorized. This can happen due to an invalid access
     *         token in the request.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnsupportedOperationException
     *         Exception that is thrown when you attempt to perform an operation that isn't enabled for the user pool
     *         client.
     * @throws UnsupportedTokenTypeException
     *         Exception that is thrown when an unsupported token is passed to an operation.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.RevokeToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/RevokeToken" target="_top">AWS API
     *      Documentation</a>
     */
    RevokeTokenResult revokeToken(RevokeTokenRequest revokeTokenRequest);

    /**
     * <p>
     * Configures actions on detected risks. To delete the risk configuration for <code>UserPoolId</code> or
     * <code>ClientId</code>, pass null values for all four configuration types.
     * </p>
     * <p>
     * To activate Amazon Cognito advanced security features, update the user pool to include the
     * <code>UserPoolAddOns</code> key<code>AdvancedSecurityMode</code>.
     * </p>
     * 
     * @param setRiskConfigurationRequest
     * @return Result of the SetRiskConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserPoolAddOnNotEnabledException
     *         This exception is thrown when user pool add-ons aren't enabled.
     * @throws CodeDeliveryFailureException
     *         This exception is thrown when a verification code fails to deliver successfully.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito isn't allowed to use your email identity. HTTP status code:
     *         400.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.SetRiskConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetRiskConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    SetRiskConfigurationResult setRiskConfiguration(SetRiskConfigurationRequest setRiskConfigurationRequest);

    /**
     * <p>
     * Sets the user interface (UI) customization information for a user pool's built-in app UI.
     * </p>
     * <p>
     * You can specify app UI customization settings for a single client (with a specific <code>clientId</code>) or for
     * all clients (by setting the <code>clientId</code> to <code>ALL</code>). If you specify <code>ALL</code>, the
     * default configuration is used for every client that has no previously set UI customization. If you specify UI
     * customization settings for a particular client, it will no longer return to the <code>ALL</code> configuration.
     * </p>
     * <note>
     * <p>
     * To use this API, your user pool must have a domain associated with it. Otherwise, there is no place to host the
     * app's pages, and the service will throw an error.
     * </p>
     * </note>
     * 
     * @param setUICustomizationRequest
     * @return Result of the SetUICustomization operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.SetUICustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUICustomization" target="_top">AWS
     *      API Documentation</a>
     */
    SetUICustomizationResult setUICustomization(SetUICustomizationRequest setUICustomizationRequest);

    /**
     * <p>
     * Set the user's multi-factor authentication (MFA) method preference, including which MFA factors are activated and
     * if any are preferred. Only one factor can be set as preferred. The preferred MFA factor will be used to
     * authenticate a user if multiple factors are activated. If multiple options are activated and no preference is
     * set, a challenge to choose an MFA option will be returned during sign-in. If an MFA type is activated for a user,
     * the user will be prompted for MFA during all sign-in attempts unless device tracking is turned on and the device
     * has been trusted. If you want MFA to be applied selectively based on the assessed risk level of sign-in attempts,
     * deactivate MFA for users and turn on Adaptive Authentication for the user pool.
     * </p>
     * 
     * @param setUserMFAPreferenceRequest
     * @return Result of the SetUserMFAPreference operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.SetUserMFAPreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUserMFAPreference"
     *      target="_top">AWS API Documentation</a>
     */
    SetUserMFAPreferenceResult setUserMFAPreference(SetUserMFAPreferenceRequest setUserMFAPreferenceRequest);

    /**
     * <p>
     * Sets the user pool multi-factor authentication (MFA) configuration.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US telecom carriers require you to
     * register an origination phone number before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>. Amazon Cognito uses the registered
     * number automatically. Otherwise, Amazon Cognito users who must receive SMS messages might not be able to sign up,
     * activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other Amazon Web Service, Amazon Simple
     * Notification Service might place your account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox mode</a> </i>, you can send
     * messages only to verified phone numbers. After you test your app while in the sandbox environment, you can move
     * out of the sandbox and into production. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param setUserPoolMfaConfigRequest
     * @return Result of the SetUserPoolMfaConfig operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration doesn't have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is not valid for the role provided for SMS
     *         configuration. This can happen if you don't trust <code>cognito-idp.amazonaws.com</code> or the external
     *         ID provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.SetUserPoolMfaConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUserPoolMfaConfig"
     *      target="_top">AWS API Documentation</a>
     */
    SetUserPoolMfaConfigResult setUserPoolMfaConfig(SetUserPoolMfaConfigRequest setUserPoolMfaConfigRequest);

    /**
     * <p>
     * <i>This action is no longer supported.</i> You can use it to configure only SMS MFA. You can't use it to
     * configure time-based one-time password (TOTP) software token MFA. To configure either type of MFA, use <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserMFAPreference.html"
     * >SetUserMFAPreference</a> instead.
     * </p>
     * 
     * @param setUserSettingsRequest
     *        Represents the request to set user settings.
     * @return Result of the SetUserSettings operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.SetUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUserSettings" target="_top">AWS
     *      API Documentation</a>
     */
    SetUserSettingsResult setUserSettings(SetUserSettingsRequest setUserSettingsRequest);

    /**
     * <p>
     * Registers the user in the specified user pool and creates a user name, password, and user attributes.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US telecom carriers require you to
     * register an origination phone number before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>. Amazon Cognito uses the registered
     * number automatically. Otherwise, Amazon Cognito users who must receive SMS messages might not be able to sign up,
     * activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other Amazon Web Service, Amazon Simple
     * Notification Service might place your account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox mode</a> </i>, you can send
     * messages only to verified phone numbers. After you test your app while in the sandbox environment, you can move
     * out of the sandbox and into production. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param signUpRequest
     *        Represents the request to register a user.
     * @return Result of the SignUp operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when Amazon Cognito encounters an unexpected exception with Lambda.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         Lambda service.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InvalidPasswordException
     *         This exception is thrown when Amazon Cognito encounters an invalid password.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when Amazon Cognito encounters an invalid Lambda response.
     * @throws UsernameExistsException
     *         This exception is thrown when Amazon Cognito encounters a user name that already exists in the user pool.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration doesn't have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is not valid for the role provided for SMS
     *         configuration. This can happen if you don't trust <code>cognito-idp.amazonaws.com</code> or the external
     *         ID provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito isn't allowed to use your email identity. HTTP status code:
     *         400.
     * @throws CodeDeliveryFailureException
     *         This exception is thrown when a verification code fails to deliver successfully.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.SignUp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SignUp" target="_top">AWS API
     *      Documentation</a>
     */
    SignUpResult signUp(SignUpRequest signUpRequest);

    /**
     * <p>
     * Starts the user import.
     * </p>
     * 
     * @param startUserImportJobRequest
     *        Represents the request to start the user import job.
     * @return Result of the StartUserImportJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws PreconditionNotMetException
     *         This exception is thrown when a precondition is not met.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @sample AWSCognitoIdentityProvider.StartUserImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/StartUserImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    StartUserImportJobResult startUserImportJob(StartUserImportJobRequest startUserImportJobRequest);

    /**
     * <p>
     * Stops the user import job.
     * </p>
     * 
     * @param stopUserImportJobRequest
     *        Represents the request to stop the user import job.
     * @return Result of the StopUserImportJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws PreconditionNotMetException
     *         This exception is thrown when a precondition is not met.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @sample AWSCognitoIdentityProvider.StopUserImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/StopUserImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    StopUserImportJobResult stopUserImportJob(StopUserImportJobRequest stopUserImportJobRequest);

    /**
     * <p>
     * Assigns a set of tags to an Amazon Cognito user pool. A tag is a label that you can use to categorize and manage
     * user pools in different ways, such as by purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * Each tag consists of a key and value, both of which you define. A key is a general category for more specific
     * values. For example, if you have two versions of a user pool, one for testing and another for production, you
     * might assign an <code>Environment</code> tag key to both user pools. The value of this key might be
     * <code>Test</code> for one user pool, and <code>Production</code> for the other.
     * </p>
     * <p>
     * Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the
     * Billing and Cost Management console, where you can track the costs associated with your user pools. In an
     * Identity and Access Management policy, you can constrain permissions for user pools based on specific tags or tag
     * values.
     * </p>
     * <p>
     * You can use this action up to 5 times per second, per account. A user pool can have as many as 50 tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from an Amazon Cognito user pool. You can use this action up to 5 times per second,
     * per account.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Provides the feedback for an authentication event, whether it was from a valid user or not. This feedback is used
     * for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
     * </p>
     * 
     * @param updateAuthEventFeedbackRequest
     * @return Result of the UpdateAuthEventFeedback operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserPoolAddOnNotEnabledException
     *         This exception is thrown when user pool add-ons aren't enabled.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UpdateAuthEventFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateAuthEventFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAuthEventFeedbackResult updateAuthEventFeedback(UpdateAuthEventFeedbackRequest updateAuthEventFeedbackRequest);

    /**
     * <p>
     * Updates the device status.
     * </p>
     * 
     * @param updateDeviceStatusRequest
     *        Represents the request to update the device status.
     * @return Result of the UpdateDeviceStatus operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is not valid.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.UpdateDeviceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateDeviceStatus" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDeviceStatusResult updateDeviceStatus(UpdateDeviceStatusRequest updateDeviceStatusRequest);

    /**
     * <p>
     * Updates the specified group with the specified attributes.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param updateGroupRequest
     * @return Result of the UpdateGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGroupResult updateGroup(UpdateGroupRequest updateGroupRequest);

    /**
     * <p>
     * Updates IdP information for a user pool.
     * </p>
     * 
     * @param updateIdentityProviderRequest
     * @return Result of the UpdateIdentityProvider operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnsupportedIdentityProviderException
     *         This exception is thrown when the specified identifier isn't supported.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws ConcurrentModificationException
     *         This exception is thrown if two or more modifications are happening concurrently.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UpdateIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateIdentityProviderResult updateIdentityProvider(UpdateIdentityProviderRequest updateIdentityProviderRequest);

    /**
     * <p>
     * Updates the name and scopes of resource server. All other fields are read-only.
     * </p>
     * <important>
     * <p>
     * If you don't provide a value for an attribute, it is set to the default value.
     * </p>
     * </important>
     * 
     * @param updateResourceServerRequest
     * @return Result of the UpdateResourceServer operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UpdateResourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateResourceServer"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateResourceServerResult updateResourceServer(UpdateResourceServerRequest updateResourceServerRequest);

    /**
     * <p>
     * Allows a user to update a specific attribute (one at a time).
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US telecom carriers require you to
     * register an origination phone number before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>. Amazon Cognito uses the registered
     * number automatically. Otherwise, Amazon Cognito users who must receive SMS messages might not be able to sign up,
     * activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other Amazon Web Service, Amazon Simple
     * Notification Service might place your account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox mode</a> </i>, you can send
     * messages only to verified phone numbers. After you test your app while in the sandbox environment, you can move
     * out of the sandbox and into production. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param updateUserAttributesRequest
     *        Represents the request to update user attributes.
     * @return Result of the UpdateUserAttributes operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code doesn't match what the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when Amazon Cognito encounters an unexpected exception with Lambda.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when Amazon Cognito encounters an invalid Lambda response.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account with an email address or phone number
     *         that has already been supplied as an alias for a different user profile. This exception indicates that an
     *         account with this email address or phone already exists in a user pool that you've configured to use
     *         email address or phone number as a sign-in alias.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration doesn't have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is not valid for the role provided for SMS
     *         configuration. This can happen if you don't trust <code>cognito-idp.amazonaws.com</code> or the external
     *         ID provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito isn't allowed to use your email identity. HTTP status code:
     *         400.
     * @throws CodeDeliveryFailureException
     *         This exception is thrown when a verification code fails to deliver successfully.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.UpdateUserAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateUserAttributesResult updateUserAttributes(UpdateUserAttributesRequest updateUserAttributesRequest);

    /**
     * <p>
     * Updates the specified user pool with the specified attributes. You can get a list of the current user pool
     * settings using <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeUserPool.html"
     * >DescribeUserPool</a>. If you don't provide a value for an attribute, it will be set to the default value.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US telecom carriers require you to
     * register an origination phone number before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>. Amazon Cognito uses the registered
     * number automatically. Otherwise, Amazon Cognito users who must receive SMS messages might not be able to sign up,
     * activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other Amazon Web Service, Amazon Simple
     * Notification Service might place your account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox mode</a> </i>, you can send
     * messages only to verified phone numbers. After you test your app while in the sandbox environment, you can move
     * out of the sandbox and into production. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param updateUserPoolRequest
     *        Represents the request to update the user pool.
     * @return Result of the UpdateUserPool operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ConcurrentModificationException
     *         This exception is thrown if two or more modifications are happening concurrently.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws UserImportInProgressException
     *         This exception is thrown when you're trying to modify a user pool while a user import job is in progress
     *         for that pool.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration doesn't have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is not valid for the role provided for SMS
     *         configuration. This can happen if you don't trust <code>cognito-idp.amazonaws.com</code> or the external
     *         ID provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws UserPoolTaggingException
     *         This exception is thrown when a user pool tag can't be set or updated.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito isn't allowed to use your email identity. HTTP status code:
     *         400.
     * @sample AWSCognitoIdentityProvider.UpdateUserPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserPool" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateUserPoolResult updateUserPool(UpdateUserPoolRequest updateUserPoolRequest);

    /**
     * <p>
     * Updates the specified user pool app client with the specified attributes. You can get a list of the current user
     * pool app client settings using <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeUserPoolClient.html"
     * >DescribeUserPoolClient</a>.
     * </p>
     * <important>
     * <p>
     * If you don't provide a value for an attribute, it will be set to the default value.
     * </p>
     * </important>
     * <p>
     * You can also use this operation to enable token revocation for user pool clients. For more information about
     * revoking tokens, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     * >RevokeToken</a>.
     * </p>
     * 
     * @param updateUserPoolClientRequest
     *        Represents the request to update the user pool client.
     * @return Result of the UpdateUserPoolClient operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ConcurrentModificationException
     *         This exception is thrown if two or more modifications are happening concurrently.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws ScopeDoesNotExistException
     *         This exception is thrown when the specified scope doesn't exist.
     * @throws InvalidOAuthFlowException
     *         This exception is thrown when the specified OAuth flow is not valid.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UpdateUserPoolClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserPoolClient"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateUserPoolClientResult updateUserPoolClient(UpdateUserPoolClientRequest updateUserPoolClientRequest);

    /**
     * <p>
     * Updates the Secure Sockets Layer (SSL) certificate for the custom domain for your user pool.
     * </p>
     * <p>
     * You can use this operation to provide the Amazon Resource Name (ARN) of a new certificate to Amazon Cognito. You
     * can't use it to change the domain for a user pool.
     * </p>
     * <p>
     * A custom domain is used to host the Amazon Cognito hosted UI, which provides sign-up and sign-in pages for your
     * application. When you set up a custom domain, you provide a certificate that you manage with Certificate Manager
     * (ACM). When necessary, you can use this operation to change the certificate that you applied to your custom
     * domain.
     * </p>
     * <p>
     * Usually, this is unnecessary following routine certificate renewal with ACM. When you renew your existing
     * certificate in ACM, the ARN for your certificate remains the same, and your custom domain uses the new
     * certificate automatically.
     * </p>
     * <p>
     * However, if you replace your existing certificate with a new one, ACM gives the new certificate a new ARN. To
     * apply the new certificate to your custom domain, you must provide this ARN to Amazon Cognito.
     * </p>
     * <p>
     * When you add your new certificate in ACM, you must choose US East (N. Virginia) as the Amazon Web Services
     * Region.
     * </p>
     * <p>
     * After you submit your request, Amazon Cognito requires up to 1 hour to distribute your new certificate to your
     * custom domain.
     * </p>
     * <p>
     * For more information about adding a custom domain to your user pool, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html">Using
     * Your Own Domain for the Hosted UI</a>.
     * </p>
     * 
     * @param updateUserPoolDomainRequest
     *        The UpdateUserPoolDomain request input.
     * @return Result of the UpdateUserPoolDomain operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UpdateUserPoolDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserPoolDomain"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateUserPoolDomainResult updateUserPoolDomain(UpdateUserPoolDomainRequest updateUserPoolDomainRequest);

    /**
     * <p>
     * Use this API to register a user's entered time-based one-time password (TOTP) code and mark the user's software
     * token MFA status as "verified" if successful. The request takes an access token or a session string, but not
     * both.
     * </p>
     * 
     * @param verifySoftwareTokenRequest
     * @return Result of the VerifySoftwareToken operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is not valid.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws EnableSoftwareTokenMFAException
     *         This exception is thrown when there is a code mismatch and the service fails to configure the software
     *         token TOTP multi-factor authentication (MFA).
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws SoftwareTokenMFANotFoundException
     *         This exception is thrown when the software token time-based one-time password (TOTP) multi-factor
     *         authentication (MFA) isn't activated for the user pool.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code doesn't match what the server was expecting.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.VerifySoftwareToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/VerifySoftwareToken"
     *      target="_top">AWS API Documentation</a>
     */
    VerifySoftwareTokenResult verifySoftwareToken(VerifySoftwareTokenRequest verifySoftwareTokenRequest);

    /**
     * <p>
     * Verifies the specified user attributes in the user pool.
     * </p>
     * <p>
     * If your user pool requires verification before Amazon Cognito updates the attribute value, VerifyUserAttribute
     * updates the affected attribute to its pending value. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserAttributeUpdateSettingsType.html"
     * > UserAttributeUpdateSettingsType</a>.
     * </p>
     * 
     * @param verifyUserAttributeRequest
     *        Represents the request to verify user attributes.
     * @return Result of the VerifyUserAttribute operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service can't find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code doesn't match what the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user isn't authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested Amazon Web Services resource.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user isn't found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user isn't confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account with an email address or phone number
     *         that has already been supplied as an alias for a different user profile. This exception indicates that an
     *         account with this email address or phone already exists in a user pool that you've configured to use
     *         email address or phone number as a sign-in alias.
     * @throws ForbiddenException
     *         This exception is thrown when WAF doesn't allow your request based on a web ACL that's associated with
     *         your user pool.
     * @sample AWSCognitoIdentityProvider.VerifyUserAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/VerifyUserAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    VerifyUserAttributeResult verifyUserAttribute(VerifyUserAttributeRequest verifyUserAttributeRequest);

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

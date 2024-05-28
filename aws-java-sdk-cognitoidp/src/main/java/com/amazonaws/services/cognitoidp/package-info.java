/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * With the Amazon Cognito user pools API, you can configure user pools and authenticate users. To authenticate users
 * from third-party identity providers (IdPs) in this API, you can <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-identity-federation-consolidate-users.html"
 * >link IdP users to native user profiles</a>. Learn more about the authentication and authorization of federated users
 * at <a
 * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-identity-federation.html">Adding
 * user pool sign-in through a third party</a> and in the <a
 * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-userpools-server-contract-reference.html"
 * >User pool federation endpoints and hosted UI reference</a>.
 * </p>
 * <p>
 * This API reference provides detailed information about API operations and object types in Amazon Cognito.
 * </p>
 * <p>
 * Along with resource management operations, the Amazon Cognito user pools API includes classes of operations and
 * authorization models for client-side and server-side authentication of users. You can interact with operations in the
 * Amazon Cognito user pools API as any of the following subjects.
 * </p>
 * <ol>
 * <li>
 * <p>
 * An administrator who wants to configure user pools, app clients, users, groups, or other user pool functions.
 * </p>
 * </li>
 * <li>
 * <p>
 * A server-side app, like a web application, that wants to use its Amazon Web Services privileges to manage,
 * authenticate, or authorize a user.
 * </p>
 * </li>
 * <li>
 * <p>
 * A client-side app, like a mobile app, that wants to make unauthenticated requests to manage, authenticate, or
 * authorize a user.
 * </p>
 * </li>
 * </ol>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html">Using the Amazon
 * Cognito user pools API and user pool endpoints</a> in the <i>Amazon Cognito Developer Guide</i>.
 * </p>
 * <p>
 * With your Amazon Web Services SDK, you can build the logic to support operational flows in every use case for this
 * API. You can also make direct REST API requests to <a
 * href="https://docs.aws.amazon.com/general/latest/gr/cognito_identity.html#cognito_identity_your_user_pools_region"
 * >Amazon Cognito user pools service endpoints</a>. The following links can get you started with the
 * <code>CognitoIdentityProvider</code> client in other supported Amazon Web Services SDKs.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cli/latest/reference/cognito-idp/index.html#cli-aws-cognito-idp">Amazon Web
 * Services Command Line Interface</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/sdkfornet/v3/apidocs/items/CognitoIdentityProvider/TCognitoIdentityProviderClient.html"
 * >Amazon Web Services SDK for .NET</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://sdk.amazonaws.com/cpp/api/LATEST/aws-cpp-sdk-cognito-idp/html/class_aws_1_1_cognito_identity_provider_1_1_cognito_identity_provider_client.html"
 * >Amazon Web Services SDK for C++</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-go/api/service/cognitoidentityprovider/#CognitoIdentityProvider">Amazon
 * Web Services SDK for Go</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/cognitoidentityprovider/CognitoIdentityProviderClient.html"
 * >Amazon Web Services SDK for Java V2</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/CognitoIdentityServiceProvider.html">Amazon Web
 * Services SDK for JavaScript</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/aws-sdk-php/v3/api/api-cognito-idp-2016-04-18.html">Amazon Web Services SDK for
 * PHP V3</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://boto3.amazonaws.com/v1/documentation/api/latest/reference/services/cognito-idp.html">Amazon Web
 * Services SDK for Python</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-ruby/v3/api/Aws/CognitoIdentityProvider/Client.html">Amazon Web Services
 * SDK for Ruby V3</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * To get started with an Amazon Web Services SDK, see <a href="http://aws.amazon.com/developer/tools/">Tools to Build
 * on Amazon Web Services</a>. For example actions and scenarios, see <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/service_code_examples_cognito-identity-provider.html">Code
 * examples for Amazon Cognito Identity Provider using Amazon Web Services SDKs</a>.
 * </p>
 */
package com.amazonaws.services.cognitoidp;


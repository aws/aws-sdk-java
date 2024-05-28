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
 * IAM Identity Center OpenID Connect (OIDC) is a web service that enables a client (such as CLI or a native
 * application) to register with IAM Identity Center. The service also enables the client to fetch the user’s access
 * token upon successful authentication and authorization with IAM Identity Center.
 * </p>
 * <note>
 * <p>
 * IAM Identity Center uses the <code>sso</code> and <code>identitystore</code> API namespaces.
 * </p>
 * </note>
 * <p>
 * <b>Considerations for Using This Guide</b>
 * </p>
 * <p>
 * Before you begin using this guide, we recommend that you first review the following important information about how
 * the IAM Identity Center OIDC service works.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The IAM Identity Center OIDC service currently implements only the portions of the OAuth 2.0 Device Authorization
 * Grant standard (<a href="https://tools.ietf.org/html/rfc8628">https://tools.ietf.org/html/rfc8628</a>) that are
 * necessary to enable single sign-on authentication with the CLI.
 * </p>
 * </li>
 * <li>
 * <p>
 * With older versions of the CLI, the service only emits OIDC access tokens, so to obtain a new token, users must
 * explicitly re-authenticate. To access the OIDC flow that supports token refresh and doesn’t require
 * re-authentication, update to the latest CLI version (1.27.10 for CLI V1 and 2.9.0 for CLI V2) with support for OIDC
 * token refresh and configurable IAM Identity Center session durations. For more information, see <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/configure-user-session.html">Configure Amazon Web
 * Services access portal session duration </a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The access tokens provided by this service grant access to all Amazon Web Services account entitlements assigned to
 * an IAM Identity Center user, not just a particular application.
 * </p>
 * </li>
 * <li>
 * <p>
 * The documentation in this guide does not describe the mechanism to convert the access token into Amazon Web Services
 * Auth (“sigv4”) credentials for use with IAM-protected Amazon Web Services service endpoints. For more information,
 * see <a href="https://docs.aws.amazon.com/singlesignon/latest/PortalAPIReference/API_GetRoleCredentials.html">
 * GetRoleCredentials</a> in the <i>IAM Identity Center Portal API Reference Guide</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For general information about IAM Identity Center, see <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html">What is IAM Identity Center?</a> in the
 * <i>IAM Identity Center User Guide</i>.
 * </p>
 */
package com.amazonaws.services.ssooidc;


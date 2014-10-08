
/**
 * Synchronous and asynchronous client classes for accessing AmazonCognitoIdentity.
 *
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
 package com.amazonaws.services.cognitoidentity;
        
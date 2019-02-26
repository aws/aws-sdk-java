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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/AssumeRoleWithWebIdentity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssumeRoleWithWebIdentityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An identifier for the assumed role session. Typically, you pass the name or identifier that is associated with
     * the user who is using your application. That way, the temporary security credentials that your application will
     * use are associated with that user. This session name is included as part of the ARN and assumed role ID in the
     * <code>AssumedRoleUser</code> response element.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     */
    private String roleSessionName;
    /**
     * <p>
     * The OAuth 2.0 access token or OpenID Connect ID token that is provided by the identity provider. Your application
     * must get this token by authenticating the user who is using your application with a web identity provider before
     * the application makes an <code>AssumeRoleWithWebIdentity</code> call.
     * </p>
     */
    private String webIdentityToken;
    /**
     * <p>
     * The fully qualified host component of the domain name of the identity provider.
     * </p>
     * <p>
     * Specify this value only for OAuth 2.0 access tokens. Currently <code>www.amazon.com</code> and
     * <code>graph.facebook.com</code> are the only supported identity providers for OAuth 2.0 access tokens. Do not
     * include URL schemes and port numbers.
     * </p>
     * <p>
     * Do not specify this value for OpenID Connect ID tokens.
     * </p>
     */
    private String providerId;
    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * The policy parameter is optional. If you pass a policy, the temporary security credentials that are returned by
     * the operation have the permissions that are allowed by both the access policy of the role that is being assumed,
     * <i> <b>and</b> </i> the policy that you pass. This gives you a way to further restrict the permissions for the
     * resulting temporary security credentials. You cannot use the passed policy to grant permissions that are in
     * excess of those allowed by the access policy of the role that is being assumed. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html">Permissions
     * for AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a string of characters up to 2048 characters
     * in length. The characters can be any ASCII character from the space character to the end of the valid character
     * list ( -\u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The policy plain text must be 2048 bytes or shorter. However, an internal conversion compresses it into a packed
     * binary format with a separate limit. The PackedPolicySize response element indicates by percentage how close to
     * the upper size limit the policy is, with 100% equaling the maximum allowed size.
     * </p>
     * </note>
     */
    private String policy;
    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the
     * maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If you
     * specify a value higher than this setting, the operation fails. For example, if you specify a session duration of
     * 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn how
     * to view the maximum value for your role, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to 3600 seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might
     * request using the returned credentials. The request to the federation endpoint for a console sign-in token takes
     * a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html">Creating
     * a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     */
    private Integer durationSeconds;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that the caller is assuming.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role that the caller is assuming.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithWebIdentityRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An identifier for the assumed role session. Typically, you pass the name or identifier that is associated with
     * the user who is using your application. That way, the temporary security credentials that your application will
     * use are associated with that user. This session name is included as part of the ARN and assumed role ID in the
     * <code>AssumedRoleUser</code> response element.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     * 
     * @param roleSessionName
     *        An identifier for the assumed role session. Typically, you pass the name or identifier that is associated
     *        with the user who is using your application. That way, the temporary security credentials that your
     *        application will use are associated with that user. This session name is included as part of the ARN and
     *        assumed role ID in the <code>AssumedRoleUser</code> response element.</p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@-
     */

    public void setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
    }

    /**
     * <p>
     * An identifier for the assumed role session. Typically, you pass the name or identifier that is associated with
     * the user who is using your application. That way, the temporary security credentials that your application will
     * use are associated with that user. This session name is included as part of the ARN and assumed role ID in the
     * <code>AssumedRoleUser</code> response element.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     * 
     * @return An identifier for the assumed role session. Typically, you pass the name or identifier that is associated
     *         with the user who is using your application. That way, the temporary security credentials that your
     *         application will use are associated with that user. This session name is included as part of the ARN and
     *         assumed role ID in the <code>AssumedRoleUser</code> response element.</p>
     *         <p>
     *         The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *         alphanumeric characters with no spaces. You can also include underscores or any of the following
     *         characters: =,.@-
     */

    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    /**
     * <p>
     * An identifier for the assumed role session. Typically, you pass the name or identifier that is associated with
     * the user who is using your application. That way, the temporary security credentials that your application will
     * use are associated with that user. This session name is included as part of the ARN and assumed role ID in the
     * <code>AssumedRoleUser</code> response element.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     * 
     * @param roleSessionName
     *        An identifier for the assumed role session. Typically, you pass the name or identifier that is associated
     *        with the user who is using your application. That way, the temporary security credentials that your
     *        application will use are associated with that user. This session name is included as part of the ARN and
     *        assumed role ID in the <code>AssumedRoleUser</code> response element.</p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithWebIdentityRequest withRoleSessionName(String roleSessionName) {
        setRoleSessionName(roleSessionName);
        return this;
    }

    /**
     * <p>
     * The OAuth 2.0 access token or OpenID Connect ID token that is provided by the identity provider. Your application
     * must get this token by authenticating the user who is using your application with a web identity provider before
     * the application makes an <code>AssumeRoleWithWebIdentity</code> call.
     * </p>
     * 
     * @param webIdentityToken
     *        The OAuth 2.0 access token or OpenID Connect ID token that is provided by the identity provider. Your
     *        application must get this token by authenticating the user who is using your application with a web
     *        identity provider before the application makes an <code>AssumeRoleWithWebIdentity</code> call.
     */

    public void setWebIdentityToken(String webIdentityToken) {
        this.webIdentityToken = webIdentityToken;
    }

    /**
     * <p>
     * The OAuth 2.0 access token or OpenID Connect ID token that is provided by the identity provider. Your application
     * must get this token by authenticating the user who is using your application with a web identity provider before
     * the application makes an <code>AssumeRoleWithWebIdentity</code> call.
     * </p>
     * 
     * @return The OAuth 2.0 access token or OpenID Connect ID token that is provided by the identity provider. Your
     *         application must get this token by authenticating the user who is using your application with a web
     *         identity provider before the application makes an <code>AssumeRoleWithWebIdentity</code> call.
     */

    public String getWebIdentityToken() {
        return this.webIdentityToken;
    }

    /**
     * <p>
     * The OAuth 2.0 access token or OpenID Connect ID token that is provided by the identity provider. Your application
     * must get this token by authenticating the user who is using your application with a web identity provider before
     * the application makes an <code>AssumeRoleWithWebIdentity</code> call.
     * </p>
     * 
     * @param webIdentityToken
     *        The OAuth 2.0 access token or OpenID Connect ID token that is provided by the identity provider. Your
     *        application must get this token by authenticating the user who is using your application with a web
     *        identity provider before the application makes an <code>AssumeRoleWithWebIdentity</code> call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithWebIdentityRequest withWebIdentityToken(String webIdentityToken) {
        setWebIdentityToken(webIdentityToken);
        return this;
    }

    /**
     * <p>
     * The fully qualified host component of the domain name of the identity provider.
     * </p>
     * <p>
     * Specify this value only for OAuth 2.0 access tokens. Currently <code>www.amazon.com</code> and
     * <code>graph.facebook.com</code> are the only supported identity providers for OAuth 2.0 access tokens. Do not
     * include URL schemes and port numbers.
     * </p>
     * <p>
     * Do not specify this value for OpenID Connect ID tokens.
     * </p>
     * 
     * @param providerId
     *        The fully qualified host component of the domain name of the identity provider.</p>
     *        <p>
     *        Specify this value only for OAuth 2.0 access tokens. Currently <code>www.amazon.com</code> and
     *        <code>graph.facebook.com</code> are the only supported identity providers for OAuth 2.0 access tokens. Do
     *        not include URL schemes and port numbers.
     *        </p>
     *        <p>
     *        Do not specify this value for OpenID Connect ID tokens.
     */

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    /**
     * <p>
     * The fully qualified host component of the domain name of the identity provider.
     * </p>
     * <p>
     * Specify this value only for OAuth 2.0 access tokens. Currently <code>www.amazon.com</code> and
     * <code>graph.facebook.com</code> are the only supported identity providers for OAuth 2.0 access tokens. Do not
     * include URL schemes and port numbers.
     * </p>
     * <p>
     * Do not specify this value for OpenID Connect ID tokens.
     * </p>
     * 
     * @return The fully qualified host component of the domain name of the identity provider.</p>
     *         <p>
     *         Specify this value only for OAuth 2.0 access tokens. Currently <code>www.amazon.com</code> and
     *         <code>graph.facebook.com</code> are the only supported identity providers for OAuth 2.0 access tokens. Do
     *         not include URL schemes and port numbers.
     *         </p>
     *         <p>
     *         Do not specify this value for OpenID Connect ID tokens.
     */

    public String getProviderId() {
        return this.providerId;
    }

    /**
     * <p>
     * The fully qualified host component of the domain name of the identity provider.
     * </p>
     * <p>
     * Specify this value only for OAuth 2.0 access tokens. Currently <code>www.amazon.com</code> and
     * <code>graph.facebook.com</code> are the only supported identity providers for OAuth 2.0 access tokens. Do not
     * include URL schemes and port numbers.
     * </p>
     * <p>
     * Do not specify this value for OpenID Connect ID tokens.
     * </p>
     * 
     * @param providerId
     *        The fully qualified host component of the domain name of the identity provider.</p>
     *        <p>
     *        Specify this value only for OAuth 2.0 access tokens. Currently <code>www.amazon.com</code> and
     *        <code>graph.facebook.com</code> are the only supported identity providers for OAuth 2.0 access tokens. Do
     *        not include URL schemes and port numbers.
     *        </p>
     *        <p>
     *        Do not specify this value for OpenID Connect ID tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithWebIdentityRequest withProviderId(String providerId) {
        setProviderId(providerId);
        return this;
    }

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * The policy parameter is optional. If you pass a policy, the temporary security credentials that are returned by
     * the operation have the permissions that are allowed by both the access policy of the role that is being assumed,
     * <i> <b>and</b> </i> the policy that you pass. This gives you a way to further restrict the permissions for the
     * resulting temporary security credentials. You cannot use the passed policy to grant permissions that are in
     * excess of those allowed by the access policy of the role that is being assumed. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html">Permissions
     * for AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a string of characters up to 2048 characters
     * in length. The characters can be any ASCII character from the space character to the end of the valid character
     * list ( -\u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The policy plain text must be 2048 bytes or shorter. However, an internal conversion compresses it into a packed
     * binary format with a separate limit. The PackedPolicySize response element indicates by percentage how close to
     * the upper size limit the policy is, with 100% equaling the maximum allowed size.
     * </p>
     * </note>
     * 
     * @param policy
     *        An IAM policy in JSON format.</p>
     *        <p>
     *        The policy parameter is optional. If you pass a policy, the temporary security credentials that are
     *        returned by the operation have the permissions that are allowed by both the access policy of the role that
     *        is being assumed, <i> <b>and</b> </i> the policy that you pass. This gives you a way to further restrict
     *        the permissions for the resulting temporary security credentials. You cannot use the passed policy to
     *        grant permissions that are in excess of those allowed by the access policy of the role that is being
     *        assumed. For more information, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *        >Permissions for AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <p>
     *        The format for this parameter, as described by its regex pattern, is a string of characters up to 2048
     *        characters in length. The characters can be any ASCII character from the space character to the end of the
     *        valid character list ( -\u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( )
     *        characters.
     *        </p>
     *        <note>
     *        <p>
     *        The policy plain text must be 2048 bytes or shorter. However, an internal conversion compresses it into a
     *        packed binary format with a separate limit. The PackedPolicySize response element indicates by percentage
     *        how close to the upper size limit the policy is, with 100% equaling the maximum allowed size.
     *        </p>
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * The policy parameter is optional. If you pass a policy, the temporary security credentials that are returned by
     * the operation have the permissions that are allowed by both the access policy of the role that is being assumed,
     * <i> <b>and</b> </i> the policy that you pass. This gives you a way to further restrict the permissions for the
     * resulting temporary security credentials. You cannot use the passed policy to grant permissions that are in
     * excess of those allowed by the access policy of the role that is being assumed. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html">Permissions
     * for AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a string of characters up to 2048 characters
     * in length. The characters can be any ASCII character from the space character to the end of the valid character
     * list ( -\u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The policy plain text must be 2048 bytes or shorter. However, an internal conversion compresses it into a packed
     * binary format with a separate limit. The PackedPolicySize response element indicates by percentage how close to
     * the upper size limit the policy is, with 100% equaling the maximum allowed size.
     * </p>
     * </note>
     * 
     * @return An IAM policy in JSON format.</p>
     *         <p>
     *         The policy parameter is optional. If you pass a policy, the temporary security credentials that are
     *         returned by the operation have the permissions that are allowed by both the access policy of the role
     *         that is being assumed, <i> <b>and</b> </i> the policy that you pass. This gives you a way to further
     *         restrict the permissions for the resulting temporary security credentials. You cannot use the passed
     *         policy to grant permissions that are in excess of those allowed by the access policy of the role that is
     *         being assumed. For more information, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *         >Permissions for AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         The format for this parameter, as described by its regex pattern, is a string of characters up to 2048
     *         characters in length. The characters can be any ASCII character from the space character to the end of
     *         the valid character list ( -\u00FF). It can also include the tab ( ), linefeed ( ), and carriage return (
     *         ) characters.
     *         </p>
     *         <note>
     *         <p>
     *         The policy plain text must be 2048 bytes or shorter. However, an internal conversion compresses it into a
     *         packed binary format with a separate limit. The PackedPolicySize response element indicates by percentage
     *         how close to the upper size limit the policy is, with 100% equaling the maximum allowed size.
     *         </p>
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * The policy parameter is optional. If you pass a policy, the temporary security credentials that are returned by
     * the operation have the permissions that are allowed by both the access policy of the role that is being assumed,
     * <i> <b>and</b> </i> the policy that you pass. This gives you a way to further restrict the permissions for the
     * resulting temporary security credentials. You cannot use the passed policy to grant permissions that are in
     * excess of those allowed by the access policy of the role that is being assumed. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html">Permissions
     * for AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a string of characters up to 2048 characters
     * in length. The characters can be any ASCII character from the space character to the end of the valid character
     * list ( -\u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The policy plain text must be 2048 bytes or shorter. However, an internal conversion compresses it into a packed
     * binary format with a separate limit. The PackedPolicySize response element indicates by percentage how close to
     * the upper size limit the policy is, with 100% equaling the maximum allowed size.
     * </p>
     * </note>
     * 
     * @param policy
     *        An IAM policy in JSON format.</p>
     *        <p>
     *        The policy parameter is optional. If you pass a policy, the temporary security credentials that are
     *        returned by the operation have the permissions that are allowed by both the access policy of the role that
     *        is being assumed, <i> <b>and</b> </i> the policy that you pass. This gives you a way to further restrict
     *        the permissions for the resulting temporary security credentials. You cannot use the passed policy to
     *        grant permissions that are in excess of those allowed by the access policy of the role that is being
     *        assumed. For more information, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *        >Permissions for AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <p>
     *        The format for this parameter, as described by its regex pattern, is a string of characters up to 2048
     *        characters in length. The characters can be any ASCII character from the space character to the end of the
     *        valid character list ( -\u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( )
     *        characters.
     *        </p>
     *        <note>
     *        <p>
     *        The policy plain text must be 2048 bytes or shorter. However, an internal conversion compresses it into a
     *        packed binary format with a separate limit. The PackedPolicySize response element indicates by percentage
     *        how close to the upper size limit the policy is, with 100% equaling the maximum allowed size.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithWebIdentityRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the
     * maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If you
     * specify a value higher than this setting, the operation fails. For example, if you specify a session duration of
     * 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn how
     * to view the maximum value for your role, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to 3600 seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might
     * request using the returned credentials. The request to the federation endpoint for a console sign-in token takes
     * a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html">Creating
     * a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param durationSeconds
     *        The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the
     *        maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If
     *        you specify a value higher than this setting, the operation fails. For example, if you specify a session
     *        duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation
     *        fails. To learn how to view the maximum value for your role, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *        >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        By default, the value is set to 3600 seconds.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you
     *        might request using the returned credentials. The request to the federation endpoint for a console sign-in
     *        token takes a <code>SessionDuration</code> parameter that specifies the maximum length of the console
     *        session. For more information, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     *        >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     *        Guide</i>.
     *        </p>
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the
     * maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If you
     * specify a value higher than this setting, the operation fails. For example, if you specify a session duration of
     * 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn how
     * to view the maximum value for your role, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to 3600 seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might
     * request using the returned credentials. The request to the federation endpoint for a console sign-in token takes
     * a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html">Creating
     * a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @return The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to
     *         the maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours.
     *         If you specify a value higher than this setting, the operation fails. For example, if you specify a
     *         session duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your
     *         operation fails. To learn how to view the maximum value for your role, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *         >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.</p>
     *         <p>
     *         By default, the value is set to 3600 seconds.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you
     *         might request using the returned credentials. The request to the federation endpoint for a console
     *         sign-in token takes a <code>SessionDuration</code> parameter that specifies the maximum length of the
     *         console session. For more information, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     *         >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     *         Guide</i>.
     *         </p>
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the
     * maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If you
     * specify a value higher than this setting, the operation fails. For example, if you specify a session duration of
     * 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn how
     * to view the maximum value for your role, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to 3600 seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might
     * request using the returned credentials. The request to the federation endpoint for a console sign-in token takes
     * a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html">Creating
     * a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param durationSeconds
     *        The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the
     *        maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If
     *        you specify a value higher than this setting, the operation fails. For example, if you specify a session
     *        duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation
     *        fails. To learn how to view the maximum value for your role, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *        >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        By default, the value is set to 3600 seconds.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you
     *        might request using the returned credentials. The request to the federation endpoint for a console sign-in
     *        token takes a <code>SessionDuration</code> parameter that specifies the maximum length of the console
     *        session. For more information, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     *        >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     *        Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithWebIdentityRequest withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getRoleSessionName() != null)
            sb.append("RoleSessionName: ").append(getRoleSessionName()).append(",");
        if (getWebIdentityToken() != null)
            sb.append("WebIdentityToken: ").append(getWebIdentityToken()).append(",");
        if (getProviderId() != null)
            sb.append("ProviderId: ").append(getProviderId()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumeRoleWithWebIdentityRequest == false)
            return false;
        AssumeRoleWithWebIdentityRequest other = (AssumeRoleWithWebIdentityRequest) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRoleSessionName() == null ^ this.getRoleSessionName() == null)
            return false;
        if (other.getRoleSessionName() != null && other.getRoleSessionName().equals(this.getRoleSessionName()) == false)
            return false;
        if (other.getWebIdentityToken() == null ^ this.getWebIdentityToken() == null)
            return false;
        if (other.getWebIdentityToken() != null && other.getWebIdentityToken().equals(this.getWebIdentityToken()) == false)
            return false;
        if (other.getProviderId() == null ^ this.getProviderId() == null)
            return false;
        if (other.getProviderId() != null && other.getProviderId().equals(this.getProviderId()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRoleSessionName() == null) ? 0 : getRoleSessionName().hashCode());
        hashCode = prime * hashCode + ((getWebIdentityToken() == null) ? 0 : getWebIdentityToken().hashCode());
        hashCode = prime * hashCode + ((getProviderId() == null) ? 0 : getProviderId().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        return hashCode;
    }

    @Override
    public AssumeRoleWithWebIdentityRequest clone() {
        return (AssumeRoleWithWebIdentityRequest) super.clone();
    }

}

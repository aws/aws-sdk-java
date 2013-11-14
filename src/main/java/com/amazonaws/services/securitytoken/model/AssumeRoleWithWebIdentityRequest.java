/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.securitytoken.AWSSecurityTokenService#assumeRoleWithWebIdentity(AssumeRoleWithWebIdentityRequest) AssumeRoleWithWebIdentity operation}.
 * <p>
 * Returns a set of temporary security credentials for users who have been authenticated in a mobile or web application with a web identity provider,
 * such as Login with Amazon, Facebook, or Google. <code>AssumeRoleWithWebIdentity</code> is an API call that does not require the use of AWS security
 * credentials. Therefore, you can distribute an application (for example, on mobile devices) that requests temporary security credentials without
 * including long-term AWS credentials in the application or by deploying server-based proxy services that use long-term AWS credentials.
 * </p>
 * <p>
 * The temporary security credentials consist of an access key ID, a secret access key, and a security token. Applications can use these temporary
 * security credentials to sign calls to AWS service APIs. The credentials are valid for the duration that you specified when calling
 * <code>AssumeRoleWithWebIdentity</code> , which can be from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default, the temporary security
 * credentials are valid for 1 hour.
 * </p>
 * <p>
 * Optionally, you can pass an AWS IAM access policy to this operation. The temporary security credentials that are returned by the operation have the
 * permissions that are associated with the access policy of the role being assumed, except for any permissions explicitly denied by the policy you pass.
 * This gives you a way to further restrict the permissions for the federated user. These policies and any applicable resource-based policies are
 * evaluated when calls to AWS are made using the temporary security credentials.
 * </p>
 * <p>
 * Before your application can call <code>AssumeRoleWithWebIdentity</code> , you must have an identity token from a supported identity provider and
 * create a role that the application can assume. The role that your application assumes must trust the identity provider that is associated with the
 * identity token. In other words, the identity provider must be specified in the role's trust policy.
 * </p>
 * <p>
 * For more information about how to use web identity federation and the <code>AssumeRoleWithWebIdentity</code> , see the following resources:
 * </p>
 * 
 * <ul>
 * <li> <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/STSUseCases.html#MobileApplication-KnownProvider"> Creating a Mobile Application with
 * Third-Party Sign-In </a> and <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/CreatingWIF.html"> Creating Temporary Security Credentials for
 * Mobile Apps Using Third-Party Identity Providers </a> in <i>Using Temporary Security Credentials</i> . </li>
 * <li> <a href="https://web-identity-federation-playground.s3.amazonaws.com/index.html"> Web Identity Federation Playground </a> . This interactive
 * website lets you walk through the process of authenticating via Login with Amazon, Facebook, or Google, getting temporary security credentials, and
 * then using those credentials to make a request to AWS. </li>
 * <li> <a href="http://aws.amazon.com/sdkforios/"> AWS SDK for iOS </a> and <a href="http://aws.amazon.com/sdkforandroid/"> AWS SDK for Android </a> .
 * These toolkits contain sample apps that show how to invoke the identity providers, and then how to use the information from these providers to get and
 * use temporary security credentials. </li>
 * <li> <a href="http://aws.amazon.com/articles/4617974389850313"> Web Identity Federation with Mobile Applications </a> . This article discusses web
 * identity federation and shows an example of how to use web identity federation to get access to content in Amazon S3. </li>
 * 
 * </ul>
 * <p>
 * </p>
 * <p>
 * </p>
 * <p>
 * </p>
 * <p>
 * </p>
 * <p>
 * </p>
 * <p>
 * </p>
 *
 * @see com.amazonaws.services.securitytoken.AWSSecurityTokenService#assumeRoleWithWebIdentity(AssumeRoleWithWebIdentityRequest)
 */
public class AssumeRoleWithWebIdentityRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the role that the caller is
     * assuming.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArn;

    /**
     * An identifier for the assumed role session. Typically, you pass the
     * name or identifier that is associated with the user who is using your
     * application. That way, the temporary security credentials that your
     * application will use are associated with that user. This session name
     * is included as part of the ARN and assumed role ID in the
     * <code>AssumedRoleUser</code> response element.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String roleSessionName;

    /**
     * The OAuth 2.0 access token or OpenID Connect ID token that is provided
     * by the identity provider. Your application must get this token by
     * authenticating the user who is using your application with a web
     * identity provider before the application makes an
     * <code>AssumeRoleWithWebIdentity</code> call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 2048<br/>
     */
    private String webIdentityToken;

    /**
     * The fully-qualified host component of the domain name of the identity
     * provider. Specify this value only for OAuth access tokens. Do not
     * specify this value for OpenID Connect ID tokens, such as
     * <code>accounts.google.com</code>. Do not include URL schemes and port
     * numbers. Currently, <code>www.amazon.com</code> and
     * <code>graph.facebook.com</code> are supported.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 2048<br/>
     */
    private String providerId;

    /**
     * An AWS IAM policy in JSON format. <p>The temporary security
     * credentials that are returned by the operation have the permissions
     * that are associated with the access policy of the role being assumed,
     * except for any permissions explicitly denied by the policy you pass.
     * This gives you a way to further restrict the permissions for the
     * federated user. These policies and any applicable resource-based
     * policies are evaluated when calls to AWS are made using the temporary
     * security credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     */
    private String policy;

    /**
     * The duration, in seconds, of the role session. The value can range
     * from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     * the value is set to 3600 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     */
    private Integer durationSeconds;

    /**
     * The Amazon Resource Name (ARN) of the role that the caller is
     * assuming.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN) of the role that the caller is
     *         assuming.
     */
    public String getRoleArn() {
        return roleArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the role that the caller is
     * assuming.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn The Amazon Resource Name (ARN) of the role that the caller is
     *         assuming.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the role that the caller is
     * assuming.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn The Amazon Resource Name (ARN) of the role that the caller is
     *         assuming.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssumeRoleWithWebIdentityRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * An identifier for the assumed role session. Typically, you pass the
     * name or identifier that is associated with the user who is using your
     * application. That way, the temporary security credentials that your
     * application will use are associated with that user. This session name
     * is included as part of the ARN and assumed role ID in the
     * <code>AssumedRoleUser</code> response element.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return An identifier for the assumed role session. Typically, you pass the
     *         name or identifier that is associated with the user who is using your
     *         application. That way, the temporary security credentials that your
     *         application will use are associated with that user. This session name
     *         is included as part of the ARN and assumed role ID in the
     *         <code>AssumedRoleUser</code> response element.
     */
    public String getRoleSessionName() {
        return roleSessionName;
    }
    
    /**
     * An identifier for the assumed role session. Typically, you pass the
     * name or identifier that is associated with the user who is using your
     * application. That way, the temporary security credentials that your
     * application will use are associated with that user. This session name
     * is included as part of the ARN and assumed role ID in the
     * <code>AssumedRoleUser</code> response element.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param roleSessionName An identifier for the assumed role session. Typically, you pass the
     *         name or identifier that is associated with the user who is using your
     *         application. That way, the temporary security credentials that your
     *         application will use are associated with that user. This session name
     *         is included as part of the ARN and assumed role ID in the
     *         <code>AssumedRoleUser</code> response element.
     */
    public void setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
    }
    
    /**
     * An identifier for the assumed role session. Typically, you pass the
     * name or identifier that is associated with the user who is using your
     * application. That way, the temporary security credentials that your
     * application will use are associated with that user. This session name
     * is included as part of the ARN and assumed role ID in the
     * <code>AssumedRoleUser</code> response element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param roleSessionName An identifier for the assumed role session. Typically, you pass the
     *         name or identifier that is associated with the user who is using your
     *         application. That way, the temporary security credentials that your
     *         application will use are associated with that user. This session name
     *         is included as part of the ARN and assumed role ID in the
     *         <code>AssumedRoleUser</code> response element.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssumeRoleWithWebIdentityRequest withRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
        return this;
    }

    /**
     * The OAuth 2.0 access token or OpenID Connect ID token that is provided
     * by the identity provider. Your application must get this token by
     * authenticating the user who is using your application with a web
     * identity provider before the application makes an
     * <code>AssumeRoleWithWebIdentity</code> call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 2048<br/>
     *
     * @return The OAuth 2.0 access token or OpenID Connect ID token that is provided
     *         by the identity provider. Your application must get this token by
     *         authenticating the user who is using your application with a web
     *         identity provider before the application makes an
     *         <code>AssumeRoleWithWebIdentity</code> call.
     */
    public String getWebIdentityToken() {
        return webIdentityToken;
    }
    
    /**
     * The OAuth 2.0 access token or OpenID Connect ID token that is provided
     * by the identity provider. Your application must get this token by
     * authenticating the user who is using your application with a web
     * identity provider before the application makes an
     * <code>AssumeRoleWithWebIdentity</code> call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 2048<br/>
     *
     * @param webIdentityToken The OAuth 2.0 access token or OpenID Connect ID token that is provided
     *         by the identity provider. Your application must get this token by
     *         authenticating the user who is using your application with a web
     *         identity provider before the application makes an
     *         <code>AssumeRoleWithWebIdentity</code> call.
     */
    public void setWebIdentityToken(String webIdentityToken) {
        this.webIdentityToken = webIdentityToken;
    }
    
    /**
     * The OAuth 2.0 access token or OpenID Connect ID token that is provided
     * by the identity provider. Your application must get this token by
     * authenticating the user who is using your application with a web
     * identity provider before the application makes an
     * <code>AssumeRoleWithWebIdentity</code> call.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 2048<br/>
     *
     * @param webIdentityToken The OAuth 2.0 access token or OpenID Connect ID token that is provided
     *         by the identity provider. Your application must get this token by
     *         authenticating the user who is using your application with a web
     *         identity provider before the application makes an
     *         <code>AssumeRoleWithWebIdentity</code> call.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssumeRoleWithWebIdentityRequest withWebIdentityToken(String webIdentityToken) {
        this.webIdentityToken = webIdentityToken;
        return this;
    }

    /**
     * The fully-qualified host component of the domain name of the identity
     * provider. Specify this value only for OAuth access tokens. Do not
     * specify this value for OpenID Connect ID tokens, such as
     * <code>accounts.google.com</code>. Do not include URL schemes and port
     * numbers. Currently, <code>www.amazon.com</code> and
     * <code>graph.facebook.com</code> are supported.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 2048<br/>
     *
     * @return The fully-qualified host component of the domain name of the identity
     *         provider. Specify this value only for OAuth access tokens. Do not
     *         specify this value for OpenID Connect ID tokens, such as
     *         <code>accounts.google.com</code>. Do not include URL schemes and port
     *         numbers. Currently, <code>www.amazon.com</code> and
     *         <code>graph.facebook.com</code> are supported.
     */
    public String getProviderId() {
        return providerId;
    }
    
    /**
     * The fully-qualified host component of the domain name of the identity
     * provider. Specify this value only for OAuth access tokens. Do not
     * specify this value for OpenID Connect ID tokens, such as
     * <code>accounts.google.com</code>. Do not include URL schemes and port
     * numbers. Currently, <code>www.amazon.com</code> and
     * <code>graph.facebook.com</code> are supported.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 2048<br/>
     *
     * @param providerId The fully-qualified host component of the domain name of the identity
     *         provider. Specify this value only for OAuth access tokens. Do not
     *         specify this value for OpenID Connect ID tokens, such as
     *         <code>accounts.google.com</code>. Do not include URL schemes and port
     *         numbers. Currently, <code>www.amazon.com</code> and
     *         <code>graph.facebook.com</code> are supported.
     */
    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }
    
    /**
     * The fully-qualified host component of the domain name of the identity
     * provider. Specify this value only for OAuth access tokens. Do not
     * specify this value for OpenID Connect ID tokens, such as
     * <code>accounts.google.com</code>. Do not include URL schemes and port
     * numbers. Currently, <code>www.amazon.com</code> and
     * <code>graph.facebook.com</code> are supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 2048<br/>
     *
     * @param providerId The fully-qualified host component of the domain name of the identity
     *         provider. Specify this value only for OAuth access tokens. Do not
     *         specify this value for OpenID Connect ID tokens, such as
     *         <code>accounts.google.com</code>. Do not include URL schemes and port
     *         numbers. Currently, <code>www.amazon.com</code> and
     *         <code>graph.facebook.com</code> are supported.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssumeRoleWithWebIdentityRequest withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * An AWS IAM policy in JSON format. <p>The temporary security
     * credentials that are returned by the operation have the permissions
     * that are associated with the access policy of the role being assumed,
     * except for any permissions explicitly denied by the policy you pass.
     * This gives you a way to further restrict the permissions for the
     * federated user. These policies and any applicable resource-based
     * policies are evaluated when calls to AWS are made using the temporary
     * security credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @return An AWS IAM policy in JSON format. <p>The temporary security
     *         credentials that are returned by the operation have the permissions
     *         that are associated with the access policy of the role being assumed,
     *         except for any permissions explicitly denied by the policy you pass.
     *         This gives you a way to further restrict the permissions for the
     *         federated user. These policies and any applicable resource-based
     *         policies are evaluated when calls to AWS are made using the temporary
     *         security credentials.
     */
    public String getPolicy() {
        return policy;
    }
    
    /**
     * An AWS IAM policy in JSON format. <p>The temporary security
     * credentials that are returned by the operation have the permissions
     * that are associated with the access policy of the role being assumed,
     * except for any permissions explicitly denied by the policy you pass.
     * This gives you a way to further restrict the permissions for the
     * federated user. These policies and any applicable resource-based
     * policies are evaluated when calls to AWS are made using the temporary
     * security credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param policy An AWS IAM policy in JSON format. <p>The temporary security
     *         credentials that are returned by the operation have the permissions
     *         that are associated with the access policy of the role being assumed,
     *         except for any permissions explicitly denied by the policy you pass.
     *         This gives you a way to further restrict the permissions for the
     *         federated user. These policies and any applicable resource-based
     *         policies are evaluated when calls to AWS are made using the temporary
     *         security credentials.
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }
    
    /**
     * An AWS IAM policy in JSON format. <p>The temporary security
     * credentials that are returned by the operation have the permissions
     * that are associated with the access policy of the role being assumed,
     * except for any permissions explicitly denied by the policy you pass.
     * This gives you a way to further restrict the permissions for the
     * federated user. These policies and any applicable resource-based
     * policies are evaluated when calls to AWS are made using the temporary
     * security credentials.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param policy An AWS IAM policy in JSON format. <p>The temporary security
     *         credentials that are returned by the operation have the permissions
     *         that are associated with the access policy of the role being assumed,
     *         except for any permissions explicitly denied by the policy you pass.
     *         This gives you a way to further restrict the permissions for the
     *         federated user. These policies and any applicable resource-based
     *         policies are evaluated when calls to AWS are made using the temporary
     *         security credentials.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssumeRoleWithWebIdentityRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * The duration, in seconds, of the role session. The value can range
     * from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     * the value is set to 3600 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @return The duration, in seconds, of the role session. The value can range
     *         from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     *         the value is set to 3600 seconds.
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }
    
    /**
     * The duration, in seconds, of the role session. The value can range
     * from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     * the value is set to 3600 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @param durationSeconds The duration, in seconds, of the role session. The value can range
     *         from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     *         the value is set to 3600 seconds.
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }
    
    /**
     * The duration, in seconds, of the role session. The value can range
     * from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     * the value is set to 3600 seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @param durationSeconds The duration, in seconds, of the role session. The value can range
     *         from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     *         the value is set to 3600 seconds.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssumeRoleWithWebIdentityRequest withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() + ",");
        if (getRoleSessionName() != null) sb.append("RoleSessionName: " + getRoleSessionName() + ",");
        if (getWebIdentityToken() != null) sb.append("WebIdentityToken: " + getWebIdentityToken() + ",");
        if (getProviderId() != null) sb.append("ProviderId: " + getProviderId() + ",");
        if (getPolicy() != null) sb.append("Policy: " + getPolicy() + ",");
        if (getDurationSeconds() != null) sb.append("DurationSeconds: " + getDurationSeconds() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AssumeRoleWithWebIdentityRequest == false) return false;
        AssumeRoleWithWebIdentityRequest other = (AssumeRoleWithWebIdentityRequest)obj;
        
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        if (other.getRoleSessionName() == null ^ this.getRoleSessionName() == null) return false;
        if (other.getRoleSessionName() != null && other.getRoleSessionName().equals(this.getRoleSessionName()) == false) return false; 
        if (other.getWebIdentityToken() == null ^ this.getWebIdentityToken() == null) return false;
        if (other.getWebIdentityToken() != null && other.getWebIdentityToken().equals(this.getWebIdentityToken()) == false) return false; 
        if (other.getProviderId() == null ^ this.getProviderId() == null) return false;
        if (other.getProviderId() != null && other.getProviderId().equals(this.getProviderId()) == false) return false; 
        if (other.getPolicy() == null ^ this.getPolicy() == null) return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false) return false; 
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null) return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false) return false; 
        return true;
    }
    
}
    
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
 * Container for the parameters to the {@link com.amazonaws.services.securitytoken.AWSSecurityTokenService#assumeRoleWithSAML(AssumeRoleWithSAMLRequest) AssumeRoleWithSAML operation}.
 * <p>
 * Returns a set of temporary security credentials for users who have been authenticated via a SAML authentication response. This operation provides a
 * mechanism for tying an enterprise identity store or directory to role-based AWS access without user-specific credentials or configuration.
 * </p>
 * <p>
 * The temporary security credentials returned by this operation consist of an access key ID, a secret access key, and a security token. Applications
 * can use these temporary security credentials to sign calls to AWS services. The credentials are valid for the duration that you specified when calling
 * <code>AssumeRoleWithSAML</code> , which can be up to 3600 seconds (1 hour) or until the time specified in the SAML authentication response's
 * <code>NotOnOrAfter</code> value, whichever is shorter.
 * </p>
 * <p>
 * <b>NOTE:</b>The maximum duration for a session is 1 hour, and the minimum duration is 15 minutes, even if values outside this range are specified.
 * </p>
 * <p>
 * Optionally, you can pass an AWS IAM access policy to this operation. The temporary security credentials that are returned by the operation have the
 * permissions that are associated with the access policy of the role being assumed, except for any permissions explicitly denied by the policy you pass.
 * This gives you a way to further restrict the permissions for the federated user. These policies and any applicable resource-based policies are
 * evaluated when calls to AWS are made using the temporary security credentials.
 * </p>
 * <p>
 * Before your application can call <code>AssumeRoleWithSAML</code> , you must configure your SAML identity provider (IdP) to issue the claims required
 * by AWS. Additionally, you must use AWS Identity and Access Management (AWS IAM) to create a SAML provider entity in your AWS account that represents
 * your identity provider, and create an AWS IAM role that specifies this SAML provider in its trust policy.
 * </p>
 * <p>
 * Calling <code>AssumeRoleWithSAML</code> does not require the use of AWS security credentials. The identity of the caller is validated by using keys
 * in the metadata document that is uploaded for the SAML provider entity for your identity provider.
 * </p>
 * <p>
 * For more information, see the following resources:
 * </p>
 * 
 * <ul>
 * <li> <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/CreatingSAML.html"> Creating Temporary Security Credentials for SAML Federation </a> in
 * the <i>Using Temporary Security Credentials</i> guide. </li>
 * <li> <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/idp-managing-identityproviders.html"> SAML Providers </a> in the <i>Using IAM</i>
 * guide. </li>
 * <li> <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"> Configuring a Relying Party and Claims in the Using
 * IAM guide. </a> </li>
 * <li> <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml.html"> Creating a Role for SAML-Based Federation </a> in the <i>Using
 * IAM</i> guide. </li>
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
 *
 * @see com.amazonaws.services.securitytoken.AWSSecurityTokenService#assumeRoleWithSAML(AssumeRoleWithSAMLRequest)
 */
public class AssumeRoleWithSAMLRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the role that the caller is
     * assuming.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArn;

    /**
     * The Amazon Resource Name (ARN) of the SAML provider in AWS IAM that
     * describes the IdP.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String principalArn;

    /**
     * The base-64 encoded SAML authentication response provided by the IdP.
     * <p>For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html">Configuring
     * a Relying Party and Adding Claims</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 50000<br/>
     */
    private String sAMLAssertion;

    /**
     * An AWS IAM policy in JSON format. <p>The temporary security
     * credentials that are returned by this operation have the permissions
     * that are associated with the access policy of the role being assumed,
     * except for any permissions explicitly denied by the policy you pass.
     * These policies and any applicable resource-based policies are
     * evaluated when calls to AWS are made using the temporary security
     * credentials. <note>The policy must be 2048 bytes or shorter, and its
     * packed size must be less than 450 bytes.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     */
    private String policy;

    /**
     * The duration, in seconds, of the role session. The value can range
     * from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     * the value is set to 3600 seconds. An expiration can also be specified
     * in the SAML authentication response's <code>NotOnOrAfter</code> value.
     * The actual expiration time is whichever value is shorter. <note>The
     * maximum duration for a session is 1 hour, and the minimum duration is
     * 15 minutes, even if values outside this range are specified. </note>
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
    public AssumeRoleWithSAMLRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the SAML provider in AWS IAM that
     * describes the IdP.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN) of the SAML provider in AWS IAM that
     *         describes the IdP.
     */
    public String getPrincipalArn() {
        return principalArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the SAML provider in AWS IAM that
     * describes the IdP.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param principalArn The Amazon Resource Name (ARN) of the SAML provider in AWS IAM that
     *         describes the IdP.
     */
    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the SAML provider in AWS IAM that
     * describes the IdP.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param principalArn The Amazon Resource Name (ARN) of the SAML provider in AWS IAM that
     *         describes the IdP.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssumeRoleWithSAMLRequest withPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
        return this;
    }

    /**
     * The base-64 encoded SAML authentication response provided by the IdP.
     * <p>For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html">Configuring
     * a Relying Party and Adding Claims</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 50000<br/>
     *
     * @return The base-64 encoded SAML authentication response provided by the IdP.
     *         <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html">Configuring
     *         a Relying Party and Adding Claims</a> in the <i>Using IAM</i> guide.
     */
    public String getSAMLAssertion() {
        return sAMLAssertion;
    }
    
    /**
     * The base-64 encoded SAML authentication response provided by the IdP.
     * <p>For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html">Configuring
     * a Relying Party and Adding Claims</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 50000<br/>
     *
     * @param sAMLAssertion The base-64 encoded SAML authentication response provided by the IdP.
     *         <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html">Configuring
     *         a Relying Party and Adding Claims</a> in the <i>Using IAM</i> guide.
     */
    public void setSAMLAssertion(String sAMLAssertion) {
        this.sAMLAssertion = sAMLAssertion;
    }
    
    /**
     * The base-64 encoded SAML authentication response provided by the IdP.
     * <p>For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html">Configuring
     * a Relying Party and Adding Claims</a> in the <i>Using IAM</i> guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 50000<br/>
     *
     * @param sAMLAssertion The base-64 encoded SAML authentication response provided by the IdP.
     *         <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html">Configuring
     *         a Relying Party and Adding Claims</a> in the <i>Using IAM</i> guide.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssumeRoleWithSAMLRequest withSAMLAssertion(String sAMLAssertion) {
        this.sAMLAssertion = sAMLAssertion;
        return this;
    }

    /**
     * An AWS IAM policy in JSON format. <p>The temporary security
     * credentials that are returned by this operation have the permissions
     * that are associated with the access policy of the role being assumed,
     * except for any permissions explicitly denied by the policy you pass.
     * These policies and any applicable resource-based policies are
     * evaluated when calls to AWS are made using the temporary security
     * credentials. <note>The policy must be 2048 bytes or shorter, and its
     * packed size must be less than 450 bytes.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @return An AWS IAM policy in JSON format. <p>The temporary security
     *         credentials that are returned by this operation have the permissions
     *         that are associated with the access policy of the role being assumed,
     *         except for any permissions explicitly denied by the policy you pass.
     *         These policies and any applicable resource-based policies are
     *         evaluated when calls to AWS are made using the temporary security
     *         credentials. <note>The policy must be 2048 bytes or shorter, and its
     *         packed size must be less than 450 bytes.</note>
     */
    public String getPolicy() {
        return policy;
    }
    
    /**
     * An AWS IAM policy in JSON format. <p>The temporary security
     * credentials that are returned by this operation have the permissions
     * that are associated with the access policy of the role being assumed,
     * except for any permissions explicitly denied by the policy you pass.
     * These policies and any applicable resource-based policies are
     * evaluated when calls to AWS are made using the temporary security
     * credentials. <note>The policy must be 2048 bytes or shorter, and its
     * packed size must be less than 450 bytes.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param policy An AWS IAM policy in JSON format. <p>The temporary security
     *         credentials that are returned by this operation have the permissions
     *         that are associated with the access policy of the role being assumed,
     *         except for any permissions explicitly denied by the policy you pass.
     *         These policies and any applicable resource-based policies are
     *         evaluated when calls to AWS are made using the temporary security
     *         credentials. <note>The policy must be 2048 bytes or shorter, and its
     *         packed size must be less than 450 bytes.</note>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }
    
    /**
     * An AWS IAM policy in JSON format. <p>The temporary security
     * credentials that are returned by this operation have the permissions
     * that are associated with the access policy of the role being assumed,
     * except for any permissions explicitly denied by the policy you pass.
     * These policies and any applicable resource-based policies are
     * evaluated when calls to AWS are made using the temporary security
     * credentials. <note>The policy must be 2048 bytes or shorter, and its
     * packed size must be less than 450 bytes.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param policy An AWS IAM policy in JSON format. <p>The temporary security
     *         credentials that are returned by this operation have the permissions
     *         that are associated with the access policy of the role being assumed,
     *         except for any permissions explicitly denied by the policy you pass.
     *         These policies and any applicable resource-based policies are
     *         evaluated when calls to AWS are made using the temporary security
     *         credentials. <note>The policy must be 2048 bytes or shorter, and its
     *         packed size must be less than 450 bytes.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssumeRoleWithSAMLRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * The duration, in seconds, of the role session. The value can range
     * from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     * the value is set to 3600 seconds. An expiration can also be specified
     * in the SAML authentication response's <code>NotOnOrAfter</code> value.
     * The actual expiration time is whichever value is shorter. <note>The
     * maximum duration for a session is 1 hour, and the minimum duration is
     * 15 minutes, even if values outside this range are specified. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @return The duration, in seconds, of the role session. The value can range
     *         from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     *         the value is set to 3600 seconds. An expiration can also be specified
     *         in the SAML authentication response's <code>NotOnOrAfter</code> value.
     *         The actual expiration time is whichever value is shorter. <note>The
     *         maximum duration for a session is 1 hour, and the minimum duration is
     *         15 minutes, even if values outside this range are specified. </note>
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }
    
    /**
     * The duration, in seconds, of the role session. The value can range
     * from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     * the value is set to 3600 seconds. An expiration can also be specified
     * in the SAML authentication response's <code>NotOnOrAfter</code> value.
     * The actual expiration time is whichever value is shorter. <note>The
     * maximum duration for a session is 1 hour, and the minimum duration is
     * 15 minutes, even if values outside this range are specified. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @param durationSeconds The duration, in seconds, of the role session. The value can range
     *         from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     *         the value is set to 3600 seconds. An expiration can also be specified
     *         in the SAML authentication response's <code>NotOnOrAfter</code> value.
     *         The actual expiration time is whichever value is shorter. <note>The
     *         maximum duration for a session is 1 hour, and the minimum duration is
     *         15 minutes, even if values outside this range are specified. </note>
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }
    
    /**
     * The duration, in seconds, of the role session. The value can range
     * from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     * the value is set to 3600 seconds. An expiration can also be specified
     * in the SAML authentication response's <code>NotOnOrAfter</code> value.
     * The actual expiration time is whichever value is shorter. <note>The
     * maximum duration for a session is 1 hour, and the minimum duration is
     * 15 minutes, even if values outside this range are specified. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @param durationSeconds The duration, in seconds, of the role session. The value can range
     *         from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     *         the value is set to 3600 seconds. An expiration can also be specified
     *         in the SAML authentication response's <code>NotOnOrAfter</code> value.
     *         The actual expiration time is whichever value is shorter. <note>The
     *         maximum duration for a session is 1 hour, and the minimum duration is
     *         15 minutes, even if values outside this range are specified. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssumeRoleWithSAMLRequest withDurationSeconds(Integer durationSeconds) {
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
        if (getPrincipalArn() != null) sb.append("PrincipalArn: " + getPrincipalArn() + ",");
        if (getSAMLAssertion() != null) sb.append("SAMLAssertion: " + getSAMLAssertion() + ",");
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
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode()); 
        hashCode = prime * hashCode + ((getSAMLAssertion() == null) ? 0 : getSAMLAssertion().hashCode()); 
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AssumeRoleWithSAMLRequest == false) return false;
        AssumeRoleWithSAMLRequest other = (AssumeRoleWithSAMLRequest)obj;
        
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null) return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false) return false; 
        if (other.getSAMLAssertion() == null ^ this.getSAMLAssertion() == null) return false;
        if (other.getSAMLAssertion() != null && other.getSAMLAssertion().equals(this.getSAMLAssertion()) == false) return false; 
        if (other.getPolicy() == null ^ this.getPolicy() == null) return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false) return false; 
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null) return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false) return false; 
        return true;
    }
    
}
    
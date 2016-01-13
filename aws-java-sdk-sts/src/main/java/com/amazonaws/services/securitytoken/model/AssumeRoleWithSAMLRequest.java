/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * 
 */
public class AssumeRoleWithSAMLRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes
     * the IdP.
     * </p>
     */
    private String principalArn;
    /**
     * <p>
     * The base-64 encoded SAML authentication response provided by the IdP.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"
     * >Configuring a Relying Party and Adding Claims</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     */
    private String sAMLAssertion;
    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * The policy parameter is optional. If you pass a policy, the temporary
     * security credentials that are returned by the operation have the
     * permissions that are allowed by both the access policy of the role that
     * is being assumed, <i><b>and</b></i> the policy that you pass. This gives
     * you a way to further restrict the permissions for the resulting temporary
     * security credentials. You cannot use the passed policy to grant
     * permissions that are in excess of those allowed by the access policy of
     * the role that is being assumed. For more information, <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and
     * AssumeRoleWithWebIdentity</a> in the <i>Using IAM</i>.
     * </p>
     * <note>The policy plain text must be 2048 bytes or shorter. However, an
     * internal conversion compresses it into a packed binary format with a
     * separate limit. The PackedPolicySize response element indicates by
     * percentage how close to the upper size limit the policy is, with 100%
     * equaling the maximum allowed size. </note>
     */
    private String policy;
    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from
     * 900 seconds (15 minutes) to 3600 seconds (1 hour). By default, the value
     * is set to 3600 seconds. An expiration can also be specified in the SAML
     * authentication response's <code>SessionNotOnOrAfter</code> value. The
     * actual expiration time is whichever value is shorter.
     * </p>
     * <note>The maximum duration for a session is 1 hour, and the minimum
     * duration is 15 minutes, even if values outside this range are specified.
     * </note>
     */
    private Integer durationSeconds;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that the caller is
     *        assuming.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role that the caller is
     *         assuming.
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
     *        The Amazon Resource Name (ARN) of the role that the caller is
     *        assuming.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes
     * the IdP.
     * </p>
     * 
     * @param principalArn
     *        The Amazon Resource Name (ARN) of the SAML provider in IAM that
     *        describes the IdP.
     */
    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes
     * the IdP.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SAML provider in IAM that
     *         describes the IdP.
     */
    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes
     * the IdP.
     * </p>
     * 
     * @param principalArn
     *        The Amazon Resource Name (ARN) of the SAML provider in IAM that
     *        describes the IdP.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLRequest withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
        return this;
    }

    /**
     * <p>
     * The base-64 encoded SAML authentication response provided by the IdP.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"
     * >Configuring a Relying Party and Adding Claims</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param sAMLAssertion
     *        The base-64 encoded SAML authentication response provided by the
     *        IdP.</p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"
     *        >Configuring a Relying Party and Adding Claims</a> in the <i>Using
     *        IAM</i> guide.
     */
    public void setSAMLAssertion(String sAMLAssertion) {
        this.sAMLAssertion = sAMLAssertion;
    }

    /**
     * <p>
     * The base-64 encoded SAML authentication response provided by the IdP.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"
     * >Configuring a Relying Party and Adding Claims</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @return The base-64 encoded SAML authentication response provided by the
     *         IdP.</p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"
     *         >Configuring a Relying Party and Adding Claims</a> in the
     *         <i>Using IAM</i> guide.
     */
    public String getSAMLAssertion() {
        return this.sAMLAssertion;
    }

    /**
     * <p>
     * The base-64 encoded SAML authentication response provided by the IdP.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"
     * >Configuring a Relying Party and Adding Claims</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param sAMLAssertion
     *        The base-64 encoded SAML authentication response provided by the
     *        IdP.</p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"
     *        >Configuring a Relying Party and Adding Claims</a> in the <i>Using
     *        IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLRequest withSAMLAssertion(String sAMLAssertion) {
        setSAMLAssertion(sAMLAssertion);
        return this;
    }

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * The policy parameter is optional. If you pass a policy, the temporary
     * security credentials that are returned by the operation have the
     * permissions that are allowed by both the access policy of the role that
     * is being assumed, <i><b>and</b></i> the policy that you pass. This gives
     * you a way to further restrict the permissions for the resulting temporary
     * security credentials. You cannot use the passed policy to grant
     * permissions that are in excess of those allowed by the access policy of
     * the role that is being assumed. For more information, <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and
     * AssumeRoleWithWebIdentity</a> in the <i>Using IAM</i>.
     * </p>
     * <note>The policy plain text must be 2048 bytes or shorter. However, an
     * internal conversion compresses it into a packed binary format with a
     * separate limit. The PackedPolicySize response element indicates by
     * percentage how close to the upper size limit the policy is, with 100%
     * equaling the maximum allowed size. </note>
     * 
     * @param policy
     *        An IAM policy in JSON format.</p>
     *        <p>
     *        The policy parameter is optional. If you pass a policy, the
     *        temporary security credentials that are returned by the operation
     *        have the permissions that are allowed by both the access policy of
     *        the role that is being assumed, <i><b>and</b></i> the policy that
     *        you pass. This gives you a way to further restrict the permissions
     *        for the resulting temporary security credentials. You cannot use
     *        the passed policy to grant permissions that are in excess of those
     *        allowed by the access policy of the role that is being assumed.
     *        For more information, <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *        >Permissions for AssumeRole, AssumeRoleWithSAML, and
     *        AssumeRoleWithWebIdentity</a> in the <i>Using IAM</i>.
     *        </p>
     *        <note>The policy plain text must be 2048 bytes or shorter.
     *        However, an internal conversion compresses it into a packed binary
     *        format with a separate limit. The PackedPolicySize response
     *        element indicates by percentage how close to the upper size limit
     *        the policy is, with 100% equaling the maximum allowed size.
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * The policy parameter is optional. If you pass a policy, the temporary
     * security credentials that are returned by the operation have the
     * permissions that are allowed by both the access policy of the role that
     * is being assumed, <i><b>and</b></i> the policy that you pass. This gives
     * you a way to further restrict the permissions for the resulting temporary
     * security credentials. You cannot use the passed policy to grant
     * permissions that are in excess of those allowed by the access policy of
     * the role that is being assumed. For more information, <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and
     * AssumeRoleWithWebIdentity</a> in the <i>Using IAM</i>.
     * </p>
     * <note>The policy plain text must be 2048 bytes or shorter. However, an
     * internal conversion compresses it into a packed binary format with a
     * separate limit. The PackedPolicySize response element indicates by
     * percentage how close to the upper size limit the policy is, with 100%
     * equaling the maximum allowed size. </note>
     * 
     * @return An IAM policy in JSON format.</p>
     *         <p>
     *         The policy parameter is optional. If you pass a policy, the
     *         temporary security credentials that are returned by the operation
     *         have the permissions that are allowed by both the access policy
     *         of the role that is being assumed, <i><b>and</b></i> the policy
     *         that you pass. This gives you a way to further restrict the
     *         permissions for the resulting temporary security credentials. You
     *         cannot use the passed policy to grant permissions that are in
     *         excess of those allowed by the access policy of the role that is
     *         being assumed. For more information, <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *         >Permissions for AssumeRole, AssumeRoleWithSAML, and
     *         AssumeRoleWithWebIdentity</a> in the <i>Using IAM</i>.
     *         </p>
     *         <note>The policy plain text must be 2048 bytes or shorter.
     *         However, an internal conversion compresses it into a packed
     *         binary format with a separate limit. The PackedPolicySize
     *         response element indicates by percentage how close to the upper
     *         size limit the policy is, with 100% equaling the maximum allowed
     *         size.
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * The policy parameter is optional. If you pass a policy, the temporary
     * security credentials that are returned by the operation have the
     * permissions that are allowed by both the access policy of the role that
     * is being assumed, <i><b>and</b></i> the policy that you pass. This gives
     * you a way to further restrict the permissions for the resulting temporary
     * security credentials. You cannot use the passed policy to grant
     * permissions that are in excess of those allowed by the access policy of
     * the role that is being assumed. For more information, <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and
     * AssumeRoleWithWebIdentity</a> in the <i>Using IAM</i>.
     * </p>
     * <note>The policy plain text must be 2048 bytes or shorter. However, an
     * internal conversion compresses it into a packed binary format with a
     * separate limit. The PackedPolicySize response element indicates by
     * percentage how close to the upper size limit the policy is, with 100%
     * equaling the maximum allowed size. </note>
     * 
     * @param policy
     *        An IAM policy in JSON format.</p>
     *        <p>
     *        The policy parameter is optional. If you pass a policy, the
     *        temporary security credentials that are returned by the operation
     *        have the permissions that are allowed by both the access policy of
     *        the role that is being assumed, <i><b>and</b></i> the policy that
     *        you pass. This gives you a way to further restrict the permissions
     *        for the resulting temporary security credentials. You cannot use
     *        the passed policy to grant permissions that are in excess of those
     *        allowed by the access policy of the role that is being assumed.
     *        For more information, <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *        >Permissions for AssumeRole, AssumeRoleWithSAML, and
     *        AssumeRoleWithWebIdentity</a> in the <i>Using IAM</i>.
     *        </p>
     *        <note>The policy plain text must be 2048 bytes or shorter.
     *        However, an internal conversion compresses it into a packed binary
     *        format with a separate limit. The PackedPolicySize response
     *        element indicates by percentage how close to the upper size limit
     *        the policy is, with 100% equaling the maximum allowed size.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from
     * 900 seconds (15 minutes) to 3600 seconds (1 hour). By default, the value
     * is set to 3600 seconds. An expiration can also be specified in the SAML
     * authentication response's <code>SessionNotOnOrAfter</code> value. The
     * actual expiration time is whichever value is shorter.
     * </p>
     * <note>The maximum duration for a session is 1 hour, and the minimum
     * duration is 15 minutes, even if values outside this range are specified.
     * </note>
     * 
     * @param durationSeconds
     *        The duration, in seconds, of the role session. The value can range
     *        from 900 seconds (15 minutes) to 3600 seconds (1 hour). By
     *        default, the value is set to 3600 seconds. An expiration can also
     *        be specified in the SAML authentication response's
     *        <code>SessionNotOnOrAfter</code> value. The actual expiration time
     *        is whichever value is shorter. </p> <note>The maximum duration for
     *        a session is 1 hour, and the minimum duration is 15 minutes, even
     *        if values outside this range are specified.
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from
     * 900 seconds (15 minutes) to 3600 seconds (1 hour). By default, the value
     * is set to 3600 seconds. An expiration can also be specified in the SAML
     * authentication response's <code>SessionNotOnOrAfter</code> value. The
     * actual expiration time is whichever value is shorter.
     * </p>
     * <note>The maximum duration for a session is 1 hour, and the minimum
     * duration is 15 minutes, even if values outside this range are specified.
     * </note>
     * 
     * @return The duration, in seconds, of the role session. The value can
     *         range from 900 seconds (15 minutes) to 3600 seconds (1 hour). By
     *         default, the value is set to 3600 seconds. An expiration can also
     *         be specified in the SAML authentication response's
     *         <code>SessionNotOnOrAfter</code> value. The actual expiration
     *         time is whichever value is shorter. </p> <note>The maximum
     *         duration for a session is 1 hour, and the minimum duration is 15
     *         minutes, even if values outside this range are specified.
     */
    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from
     * 900 seconds (15 minutes) to 3600 seconds (1 hour). By default, the value
     * is set to 3600 seconds. An expiration can also be specified in the SAML
     * authentication response's <code>SessionNotOnOrAfter</code> value. The
     * actual expiration time is whichever value is shorter.
     * </p>
     * <note>The maximum duration for a session is 1 hour, and the minimum
     * duration is 15 minutes, even if values outside this range are specified.
     * </note>
     * 
     * @param durationSeconds
     *        The duration, in seconds, of the role session. The value can range
     *        from 900 seconds (15 minutes) to 3600 seconds (1 hour). By
     *        default, the value is set to 3600 seconds. An expiration can also
     *        be specified in the SAML authentication response's
     *        <code>SessionNotOnOrAfter</code> value. The actual expiration time
     *        is whichever value is shorter. </p> <note>The maximum duration for
     *        a session is 1 hour, and the minimum duration is 15 minutes, even
     *        if values outside this range are specified.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLRequest withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: " + getPrincipalArn() + ",");
        if (getSAMLAssertion() != null)
            sb.append("SAMLAssertion: " + getSAMLAssertion() + ",");
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: " + getDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumeRoleWithSAMLRequest == false)
            return false;
        AssumeRoleWithSAMLRequest other = (AssumeRoleWithSAMLRequest) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null
                && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null
                && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        if (other.getSAMLAssertion() == null ^ this.getSAMLAssertion() == null)
            return false;
        if (other.getSAMLAssertion() != null
                && other.getSAMLAssertion().equals(this.getSAMLAssertion()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null
                && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getDurationSeconds() == null
                ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null
                && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrincipalArn() == null) ? 0 : getPrincipalArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSAMLAssertion() == null) ? 0 : getSAMLAssertion()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime
                * hashCode
                + ((getDurationSeconds() == null) ? 0 : getDurationSeconds()
                        .hashCode());
        return hashCode;
    }

    @Override
    public AssumeRoleWithSAMLRequest clone() {
        return (AssumeRoleWithSAMLRequest) super.clone();
    }
}
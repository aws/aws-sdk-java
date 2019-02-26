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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/GetFederationToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFederationTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the federated user. The name is used as an identifier for the temporary security credentials (such as
     * <code>Bob</code>). For example, you can reference the federated user name in a resource-based policy, such as in
     * an Amazon S3 bucket policy.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     */
    private String name;
    /**
     * <p>
     * An IAM policy in JSON format that is passed with the <code>GetFederationToken</code> call and evaluated along
     * with the policy or policies that are attached to the IAM user whose credentials are used to call
     * <code>GetFederationToken</code>. The passed policy is used to scope down the permissions that are available to
     * the IAM user, by allowing only a subset of the permissions that are granted to the IAM user. The passed policy
     * cannot grant more permissions than those granted to the IAM user. The final permissions for the federated user
     * are the most restrictive set based on the intersection of the passed policy and the IAM user policy.
     * </p>
     * <p>
     * If you do not pass a policy, the resulting temporary security credentials have no effective permissions. The only
     * exception is when the temporary security credentials are used to access a resource that has a resource-based
     * policy that specifically allows the federated user to access the resource.
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
     * <p>
     * For more information about how permissions work, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
     * >Permissions for GetFederationToken</a>.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * The duration, in seconds, that the session should last. Acceptable durations for federation sessions range from
     * 900 seconds (15 minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the default. Sessions
     * obtained using AWS account (root) credentials are restricted to a maximum of 3600 seconds (one hour). If the
     * specified duration is longer than one hour, the session obtained by using AWS account (root) credentials defaults
     * to one hour.
     * </p>
     */
    private Integer durationSeconds;

    /**
     * Default constructor for GetFederationTokenRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public GetFederationTokenRequest() {
    }

    /**
     * Constructs a new GetFederationTokenRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param name
     *        The name of the federated user. The name is used as an identifier for the temporary security credentials
     *        (such as <code>Bob</code>). For example, you can reference the federated user name in a resource-based
     *        policy, such as in an Amazon S3 bucket policy.</p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@-
     */
    public GetFederationTokenRequest(String name) {
        setName(name);
    }

    /**
     * <p>
     * The name of the federated user. The name is used as an identifier for the temporary security credentials (such as
     * <code>Bob</code>). For example, you can reference the federated user name in a resource-based policy, such as in
     * an Amazon S3 bucket policy.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     * 
     * @param name
     *        The name of the federated user. The name is used as an identifier for the temporary security credentials
     *        (such as <code>Bob</code>). For example, you can reference the federated user name in a resource-based
     *        policy, such as in an Amazon S3 bucket policy.</p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@-
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the federated user. The name is used as an identifier for the temporary security credentials (such as
     * <code>Bob</code>). For example, you can reference the federated user name in a resource-based policy, such as in
     * an Amazon S3 bucket policy.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     * 
     * @return The name of the federated user. The name is used as an identifier for the temporary security credentials
     *         (such as <code>Bob</code>). For example, you can reference the federated user name in a resource-based
     *         policy, such as in an Amazon S3 bucket policy.</p>
     *         <p>
     *         The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *         alphanumeric characters with no spaces. You can also include underscores or any of the following
     *         characters: =,.@-
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the federated user. The name is used as an identifier for the temporary security credentials (such as
     * <code>Bob</code>). For example, you can reference the federated user name in a resource-based policy, such as in
     * an Amazon S3 bucket policy.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     * 
     * @param name
     *        The name of the federated user. The name is used as an identifier for the temporary security credentials
     *        (such as <code>Bob</code>). For example, you can reference the federated user name in a resource-based
     *        policy, such as in an Amazon S3 bucket policy.</p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFederationTokenRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An IAM policy in JSON format that is passed with the <code>GetFederationToken</code> call and evaluated along
     * with the policy or policies that are attached to the IAM user whose credentials are used to call
     * <code>GetFederationToken</code>. The passed policy is used to scope down the permissions that are available to
     * the IAM user, by allowing only a subset of the permissions that are granted to the IAM user. The passed policy
     * cannot grant more permissions than those granted to the IAM user. The final permissions for the federated user
     * are the most restrictive set based on the intersection of the passed policy and the IAM user policy.
     * </p>
     * <p>
     * If you do not pass a policy, the resulting temporary security credentials have no effective permissions. The only
     * exception is when the temporary security credentials are used to access a resource that has a resource-based
     * policy that specifically allows the federated user to access the resource.
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
     * <p>
     * For more information about how permissions work, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
     * >Permissions for GetFederationToken</a>.
     * </p>
     * 
     * @param policy
     *        An IAM policy in JSON format that is passed with the <code>GetFederationToken</code> call and evaluated
     *        along with the policy or policies that are attached to the IAM user whose credentials are used to call
     *        <code>GetFederationToken</code>. The passed policy is used to scope down the permissions that are
     *        available to the IAM user, by allowing only a subset of the permissions that are granted to the IAM user.
     *        The passed policy cannot grant more permissions than those granted to the IAM user. The final permissions
     *        for the federated user are the most restrictive set based on the intersection of the passed policy and the
     *        IAM user policy.</p>
     *        <p>
     *        If you do not pass a policy, the resulting temporary security credentials have no effective permissions.
     *        The only exception is when the temporary security credentials are used to access a resource that has a
     *        resource-based policy that specifically allows the federated user to access the resource.
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
     *        </note>
     *        <p>
     *        For more information about how permissions work, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
     *        >Permissions for GetFederationToken</a>.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format that is passed with the <code>GetFederationToken</code> call and evaluated along
     * with the policy or policies that are attached to the IAM user whose credentials are used to call
     * <code>GetFederationToken</code>. The passed policy is used to scope down the permissions that are available to
     * the IAM user, by allowing only a subset of the permissions that are granted to the IAM user. The passed policy
     * cannot grant more permissions than those granted to the IAM user. The final permissions for the federated user
     * are the most restrictive set based on the intersection of the passed policy and the IAM user policy.
     * </p>
     * <p>
     * If you do not pass a policy, the resulting temporary security credentials have no effective permissions. The only
     * exception is when the temporary security credentials are used to access a resource that has a resource-based
     * policy that specifically allows the federated user to access the resource.
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
     * <p>
     * For more information about how permissions work, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
     * >Permissions for GetFederationToken</a>.
     * </p>
     * 
     * @return An IAM policy in JSON format that is passed with the <code>GetFederationToken</code> call and evaluated
     *         along with the policy or policies that are attached to the IAM user whose credentials are used to call
     *         <code>GetFederationToken</code>. The passed policy is used to scope down the permissions that are
     *         available to the IAM user, by allowing only a subset of the permissions that are granted to the IAM user.
     *         The passed policy cannot grant more permissions than those granted to the IAM user. The final permissions
     *         for the federated user are the most restrictive set based on the intersection of the passed policy and
     *         the IAM user policy.</p>
     *         <p>
     *         If you do not pass a policy, the resulting temporary security credentials have no effective permissions.
     *         The only exception is when the temporary security credentials are used to access a resource that has a
     *         resource-based policy that specifically allows the federated user to access the resource.
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
     *         </note>
     *         <p>
     *         For more information about how permissions work, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
     *         >Permissions for GetFederationToken</a>.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format that is passed with the <code>GetFederationToken</code> call and evaluated along
     * with the policy or policies that are attached to the IAM user whose credentials are used to call
     * <code>GetFederationToken</code>. The passed policy is used to scope down the permissions that are available to
     * the IAM user, by allowing only a subset of the permissions that are granted to the IAM user. The passed policy
     * cannot grant more permissions than those granted to the IAM user. The final permissions for the federated user
     * are the most restrictive set based on the intersection of the passed policy and the IAM user policy.
     * </p>
     * <p>
     * If you do not pass a policy, the resulting temporary security credentials have no effective permissions. The only
     * exception is when the temporary security credentials are used to access a resource that has a resource-based
     * policy that specifically allows the federated user to access the resource.
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
     * <p>
     * For more information about how permissions work, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
     * >Permissions for GetFederationToken</a>.
     * </p>
     * 
     * @param policy
     *        An IAM policy in JSON format that is passed with the <code>GetFederationToken</code> call and evaluated
     *        along with the policy or policies that are attached to the IAM user whose credentials are used to call
     *        <code>GetFederationToken</code>. The passed policy is used to scope down the permissions that are
     *        available to the IAM user, by allowing only a subset of the permissions that are granted to the IAM user.
     *        The passed policy cannot grant more permissions than those granted to the IAM user. The final permissions
     *        for the federated user are the most restrictive set based on the intersection of the passed policy and the
     *        IAM user policy.</p>
     *        <p>
     *        If you do not pass a policy, the resulting temporary security credentials have no effective permissions.
     *        The only exception is when the temporary security credentials are used to access a resource that has a
     *        resource-based policy that specifically allows the federated user to access the resource.
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
     *        </note>
     *        <p>
     *        For more information about how permissions work, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
     *        >Permissions for GetFederationToken</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFederationTokenRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, that the session should last. Acceptable durations for federation sessions range from
     * 900 seconds (15 minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the default. Sessions
     * obtained using AWS account (root) credentials are restricted to a maximum of 3600 seconds (one hour). If the
     * specified duration is longer than one hour, the session obtained by using AWS account (root) credentials defaults
     * to one hour.
     * </p>
     * 
     * @param durationSeconds
     *        The duration, in seconds, that the session should last. Acceptable durations for federation sessions range
     *        from 900 seconds (15 minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the default.
     *        Sessions obtained using AWS account (root) credentials are restricted to a maximum of 3600 seconds (one
     *        hour). If the specified duration is longer than one hour, the session obtained by using AWS account (root)
     *        credentials defaults to one hour.
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that the session should last. Acceptable durations for federation sessions range from
     * 900 seconds (15 minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the default. Sessions
     * obtained using AWS account (root) credentials are restricted to a maximum of 3600 seconds (one hour). If the
     * specified duration is longer than one hour, the session obtained by using AWS account (root) credentials defaults
     * to one hour.
     * </p>
     * 
     * @return The duration, in seconds, that the session should last. Acceptable durations for federation sessions
     *         range from 900 seconds (15 minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the
     *         default. Sessions obtained using AWS account (root) credentials are restricted to a maximum of 3600
     *         seconds (one hour). If the specified duration is longer than one hour, the session obtained by using AWS
     *         account (root) credentials defaults to one hour.
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that the session should last. Acceptable durations for federation sessions range from
     * 900 seconds (15 minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the default. Sessions
     * obtained using AWS account (root) credentials are restricted to a maximum of 3600 seconds (one hour). If the
     * specified duration is longer than one hour, the session obtained by using AWS account (root) credentials defaults
     * to one hour.
     * </p>
     * 
     * @param durationSeconds
     *        The duration, in seconds, that the session should last. Acceptable durations for federation sessions range
     *        from 900 seconds (15 minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the default.
     *        Sessions obtained using AWS account (root) credentials are restricted to a maximum of 3600 seconds (one
     *        hour). If the specified duration is longer than one hour, the session obtained by using AWS account (root)
     *        credentials defaults to one hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFederationTokenRequest withDurationSeconds(Integer durationSeconds) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof GetFederationTokenRequest == false)
            return false;
        GetFederationTokenRequest other = (GetFederationTokenRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        return hashCode;
    }

    @Override
    public GetFederationTokenRequest clone() {
        return (GetFederationTokenRequest) super.clone();
    }

}

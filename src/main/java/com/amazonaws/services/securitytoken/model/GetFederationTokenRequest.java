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
 * Container for the parameters to the {@link com.amazonaws.services.securitytoken.AWSSecurityTokenService#getFederationToken(GetFederationTokenRequest) GetFederationToken operation}.
 * <p>
 * Returns a set of temporary security credentials (consisting of an access key ID, a secret access key, and a security token) for a federated user. A
 * typical use is in a proxy application that is getting temporary security credentials on behalf of distributed applications inside a corporate network.
 * Because you must call the <code>GetFederationToken</code> action using the long-term security credentials of an IAM user, this call is appropriate in
 * contexts where those credentials can be safely stored, usually in a server-based application.
 * </p>
 * <p>
 * <b>Note:</b> Do not use this call in mobile applications or client-based web applications that directly get temporary security credentials. For those
 * types of applications, use <code>AssumeRoleWithWebIdentity</code> .
 * </p>
 * <p>
 * The <code>GetFederationToken</code> action must be called by using the long-term AWS security credentials of the AWS account or an IAM user.
 * Credentials that are created by IAM users are valid for the specified duration, between 900 seconds (15 minutes) and 129600 seconds (36 hours);
 * credentials that are created by using account credentials have a maximum duration of 3600 seconds (1 hour).
 * </p>
 * <p>
 * Optionally, you can pass an AWS IAM access policy to this operation. The temporary security credentials that are returned by the operation have the
 * permissions that are associated with the entity that is making the <code>GetFederationToken</code> call, except for any permissions explicitly denied
 * by the policy you pass. This gives you a way to further restrict the permissions for the federated user. These policies and any applicable
 * resource-based policies are evaluated when calls to AWS are made using the temporary security credentials.
 * </p>
 * <p>
 * For more information about how permissions work, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/TokenPermissions.html"> Controlling
 * Permissions in Temporary Credentials </a> in <i>Using Temporary Security Credentials</i> . For information about using
 * <code>GetFederationToken</code> to create temporary security credentials, see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/CreatingFedTokens.html"> Creating Temporary Credentials to Enable Access for Federated Users
 * </a> in <i>Using Temporary Security Credentials</i> .
 * </p>
 *
 * @see com.amazonaws.services.securitytoken.AWSSecurityTokenService#getFederationToken(GetFederationTokenRequest)
 */
public class GetFederationTokenRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the federated user. The name is used as an identifier for
     * the temporary security credentials (such as <code>Bob</code>). For
     * example, you can reference the federated user name in a resource-based
     * policy, such as in an Amazon S3 bucket policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String name;

    /**
     * An AWS IAM policy in JSON format. <p>By default, federated users have
     * no permissions; they do not inherit any from the IAM user. When you
     * specify a policy, the federated user's permissions are based on the
     * specified policy and the IAM user's policy. If you don't specify a
     * policy, federated users can only access AWS resources that explicitly
     * allow those federated users in a resource policy, such as in an Amazon
     * S3 bucket policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     */
    private String policy;

    /**
     * The duration, in seconds, that the session should last. Acceptable
     * durations for federation sessions range from 900 seconds (15 minutes)
     * to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the
     * default. Sessions for AWS account owners are restricted to a maximum
     * of 3600 seconds (one hour). If the duration is longer than one hour,
     * the session for AWS account owners defaults to one hour.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     */
    private Integer durationSeconds;

    /**
     * Default constructor for a new GetFederationTokenRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetFederationTokenRequest() {}
    
    /**
     * Constructs a new GetFederationTokenRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name The name of the federated user. The name is used as an
     * identifier for the temporary security credentials (such as
     * <code>Bob</code>). For example, you can reference the federated user
     * name in a resource-based policy, such as in an Amazon S3 bucket
     * policy.
     */
    public GetFederationTokenRequest(String name) {
        setName(name);
    }

    /**
     * The name of the federated user. The name is used as an identifier for
     * the temporary security credentials (such as <code>Bob</code>). For
     * example, you can reference the federated user name in a resource-based
     * policy, such as in an Amazon S3 bucket policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The name of the federated user. The name is used as an identifier for
     *         the temporary security credentials (such as <code>Bob</code>). For
     *         example, you can reference the federated user name in a resource-based
     *         policy, such as in an Amazon S3 bucket policy.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the federated user. The name is used as an identifier for
     * the temporary security credentials (such as <code>Bob</code>). For
     * example, you can reference the federated user name in a resource-based
     * policy, such as in an Amazon S3 bucket policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param name The name of the federated user. The name is used as an identifier for
     *         the temporary security credentials (such as <code>Bob</code>). For
     *         example, you can reference the federated user name in a resource-based
     *         policy, such as in an Amazon S3 bucket policy.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the federated user. The name is used as an identifier for
     * the temporary security credentials (such as <code>Bob</code>). For
     * example, you can reference the federated user name in a resource-based
     * policy, such as in an Amazon S3 bucket policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param name The name of the federated user. The name is used as an identifier for
     *         the temporary security credentials (such as <code>Bob</code>). For
     *         example, you can reference the federated user name in a resource-based
     *         policy, such as in an Amazon S3 bucket policy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetFederationTokenRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * An AWS IAM policy in JSON format. <p>By default, federated users have
     * no permissions; they do not inherit any from the IAM user. When you
     * specify a policy, the federated user's permissions are based on the
     * specified policy and the IAM user's policy. If you don't specify a
     * policy, federated users can only access AWS resources that explicitly
     * allow those federated users in a resource policy, such as in an Amazon
     * S3 bucket policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @return An AWS IAM policy in JSON format. <p>By default, federated users have
     *         no permissions; they do not inherit any from the IAM user. When you
     *         specify a policy, the federated user's permissions are based on the
     *         specified policy and the IAM user's policy. If you don't specify a
     *         policy, federated users can only access AWS resources that explicitly
     *         allow those federated users in a resource policy, such as in an Amazon
     *         S3 bucket policy.
     */
    public String getPolicy() {
        return policy;
    }
    
    /**
     * An AWS IAM policy in JSON format. <p>By default, federated users have
     * no permissions; they do not inherit any from the IAM user. When you
     * specify a policy, the federated user's permissions are based on the
     * specified policy and the IAM user's policy. If you don't specify a
     * policy, federated users can only access AWS resources that explicitly
     * allow those federated users in a resource policy, such as in an Amazon
     * S3 bucket policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param policy An AWS IAM policy in JSON format. <p>By default, federated users have
     *         no permissions; they do not inherit any from the IAM user. When you
     *         specify a policy, the federated user's permissions are based on the
     *         specified policy and the IAM user's policy. If you don't specify a
     *         policy, federated users can only access AWS resources that explicitly
     *         allow those federated users in a resource policy, such as in an Amazon
     *         S3 bucket policy.
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }
    
    /**
     * An AWS IAM policy in JSON format. <p>By default, federated users have
     * no permissions; they do not inherit any from the IAM user. When you
     * specify a policy, the federated user's permissions are based on the
     * specified policy and the IAM user's policy. If you don't specify a
     * policy, federated users can only access AWS resources that explicitly
     * allow those federated users in a resource policy, such as in an Amazon
     * S3 bucket policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param policy An AWS IAM policy in JSON format. <p>By default, federated users have
     *         no permissions; they do not inherit any from the IAM user. When you
     *         specify a policy, the federated user's permissions are based on the
     *         specified policy and the IAM user's policy. If you don't specify a
     *         policy, federated users can only access AWS resources that explicitly
     *         allow those federated users in a resource policy, such as in an Amazon
     *         S3 bucket policy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetFederationTokenRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * The duration, in seconds, that the session should last. Acceptable
     * durations for federation sessions range from 900 seconds (15 minutes)
     * to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the
     * default. Sessions for AWS account owners are restricted to a maximum
     * of 3600 seconds (one hour). If the duration is longer than one hour,
     * the session for AWS account owners defaults to one hour.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @return The duration, in seconds, that the session should last. Acceptable
     *         durations for federation sessions range from 900 seconds (15 minutes)
     *         to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the
     *         default. Sessions for AWS account owners are restricted to a maximum
     *         of 3600 seconds (one hour). If the duration is longer than one hour,
     *         the session for AWS account owners defaults to one hour.
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }
    
    /**
     * The duration, in seconds, that the session should last. Acceptable
     * durations for federation sessions range from 900 seconds (15 minutes)
     * to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the
     * default. Sessions for AWS account owners are restricted to a maximum
     * of 3600 seconds (one hour). If the duration is longer than one hour,
     * the session for AWS account owners defaults to one hour.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @param durationSeconds The duration, in seconds, that the session should last. Acceptable
     *         durations for federation sessions range from 900 seconds (15 minutes)
     *         to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the
     *         default. Sessions for AWS account owners are restricted to a maximum
     *         of 3600 seconds (one hour). If the duration is longer than one hour,
     *         the session for AWS account owners defaults to one hour.
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }
    
    /**
     * The duration, in seconds, that the session should last. Acceptable
     * durations for federation sessions range from 900 seconds (15 minutes)
     * to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the
     * default. Sessions for AWS account owners are restricted to a maximum
     * of 3600 seconds (one hour). If the duration is longer than one hour,
     * the session for AWS account owners defaults to one hour.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @param durationSeconds The duration, in seconds, that the session should last. Acceptable
     *         durations for federation sessions range from 900 seconds (15 minutes)
     *         to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the
     *         default. Sessions for AWS account owners are restricted to a maximum
     *         of 3600 seconds (one hour). If the duration is longer than one hour,
     *         the session for AWS account owners defaults to one hour.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetFederationTokenRequest withDurationSeconds(Integer durationSeconds) {
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getPolicy() != null) sb.append("Policy: " + getPolicy() + ",");
        if (getDurationSeconds() != null) sb.append("DurationSeconds: " + getDurationSeconds() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetFederationTokenRequest == false) return false;
        GetFederationTokenRequest other = (GetFederationTokenRequest)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getPolicy() == null ^ this.getPolicy() == null) return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false) return false; 
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null) return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false) return false; 
        return true;
    }
    
}
    
/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.securitytoken.AWSSecurityTokenService#getFederationToken(GetFederationTokenRequest) GetFederationToken operation}.
 * <p>
 * The GetFederationToken action returns a set of temporary credentials for a federated user with the user name and policy specified in the request. The
 * credentials consist of an Access Key ID, a Secret Access Key, and a security token. Credentials created by IAM users are valid for the specified
 * duration, between one and 36 hours; credentials created using account credentials last one hour.
 * </p>
 * <p>
 * The federated user who holds these credentials has any permissions allowed by the intersection of the specified policy and any resource or user
 * policies that apply to the caller of the GetFederationToken API, and any resource policies that apply to the federated user's Amazon Resource Name
 * (ARN). For more information about how token permissions work, see <a
 * href="http://docs.amazonwebservices.com/IAM/latest/UserGuide/TokenPermissions.html"> Controlling Permissions in Temporary Credentials </a> in <i>Using
 * AWS Identity and Access Management</i> . For information about using GetFederationToken to create temporary credentials, see <a
 * href="http://docs.amazonwebservices.com/IAM/latest/UserGuide/CreatingFedTokens.html"> Creating Temporary Credentials to Enable Access for Federated
 * Users </a> in <i>Using AWS Identity and Access Management</i> .
 * </p>
 *
 * @see com.amazonaws.services.securitytoken.AWSSecurityTokenService#getFederationToken(GetFederationTokenRequest)
 */
public class GetFederationTokenRequest extends AmazonWebServiceRequest {

    /**
     * The name of the federated user associated with the credentials. For
     * information about limitations on user names, go to <a
     * vices.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations
     * on IAM Entities</a> in <i>Using AWS Identity and Access
     * Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String name;

    /**
     * A policy specifying the permissions to associate with the credentials.
     * The caller can delegate their own permissions by specifying a policy,
     * and both policies will be checked when a service call is made. For
     * more information about how permissions work in the context of
     * temporary credentials, see <a
     * docs.amazonwebservices.com/IAM/latest/UserGuide/TokenPermissions.html"
     * target="_blank">Controlling Permissions in Temporary Credentials</a>
     * in <i>Using AWS Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     */
    private String policy;

    /**
     * The duration, in seconds, that the session should last. Acceptable
     * durations for federation sessions range from 3600s (one hour) to
     * 129600s (36 hours), with 43200s (12 hours) as the default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 129600<br/>
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
     * @param name The name of the federated user associated with the
     * credentials. For information about limitations on user names, go to <a
     * vices.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations
     * on IAM Entities</a> in <i>Using AWS Identity and Access
     * Management</i>.
     */
    public GetFederationTokenRequest(String name) {
        this.name = name;
    }

    
    
    /**
     * The name of the federated user associated with the credentials. For
     * information about limitations on user names, go to <a
     * vices.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations
     * on IAM Entities</a> in <i>Using AWS Identity and Access
     * Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The name of the federated user associated with the credentials. For
     *         information about limitations on user names, go to <a
     *         vices.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations
     *         on IAM Entities</a> in <i>Using AWS Identity and Access
     *         Management</i>.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the federated user associated with the credentials. For
     * information about limitations on user names, go to <a
     * vices.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations
     * on IAM Entities</a> in <i>Using AWS Identity and Access
     * Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param name The name of the federated user associated with the credentials. For
     *         information about limitations on user names, go to <a
     *         vices.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations
     *         on IAM Entities</a> in <i>Using AWS Identity and Access
     *         Management</i>.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the federated user associated with the credentials. For
     * information about limitations on user names, go to <a
     * vices.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations
     * on IAM Entities</a> in <i>Using AWS Identity and Access
     * Management</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param name The name of the federated user associated with the credentials. For
     *         information about limitations on user names, go to <a
     *         vices.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations
     *         on IAM Entities</a> in <i>Using AWS Identity and Access
     *         Management</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetFederationTokenRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * A policy specifying the permissions to associate with the credentials.
     * The caller can delegate their own permissions by specifying a policy,
     * and both policies will be checked when a service call is made. For
     * more information about how permissions work in the context of
     * temporary credentials, see <a
     * docs.amazonwebservices.com/IAM/latest/UserGuide/TokenPermissions.html"
     * target="_blank">Controlling Permissions in Temporary Credentials</a>
     * in <i>Using AWS Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @return A policy specifying the permissions to associate with the credentials.
     *         The caller can delegate their own permissions by specifying a policy,
     *         and both policies will be checked when a service call is made. For
     *         more information about how permissions work in the context of
     *         temporary credentials, see <a
     *         docs.amazonwebservices.com/IAM/latest/UserGuide/TokenPermissions.html"
     *         target="_blank">Controlling Permissions in Temporary Credentials</a>
     *         in <i>Using AWS Identity and Access Management</i>.
     */
    public String getPolicy() {
        return policy;
    }
    
    /**
     * A policy specifying the permissions to associate with the credentials.
     * The caller can delegate their own permissions by specifying a policy,
     * and both policies will be checked when a service call is made. For
     * more information about how permissions work in the context of
     * temporary credentials, see <a
     * docs.amazonwebservices.com/IAM/latest/UserGuide/TokenPermissions.html"
     * target="_blank">Controlling Permissions in Temporary Credentials</a>
     * in <i>Using AWS Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param policy A policy specifying the permissions to associate with the credentials.
     *         The caller can delegate their own permissions by specifying a policy,
     *         and both policies will be checked when a service call is made. For
     *         more information about how permissions work in the context of
     *         temporary credentials, see <a
     *         docs.amazonwebservices.com/IAM/latest/UserGuide/TokenPermissions.html"
     *         target="_blank">Controlling Permissions in Temporary Credentials</a>
     *         in <i>Using AWS Identity and Access Management</i>.
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }
    
    /**
     * A policy specifying the permissions to associate with the credentials.
     * The caller can delegate their own permissions by specifying a policy,
     * and both policies will be checked when a service call is made. For
     * more information about how permissions work in the context of
     * temporary credentials, see <a
     * docs.amazonwebservices.com/IAM/latest/UserGuide/TokenPermissions.html"
     * target="_blank">Controlling Permissions in Temporary Credentials</a>
     * in <i>Using AWS Identity and Access Management</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param policy A policy specifying the permissions to associate with the credentials.
     *         The caller can delegate their own permissions by specifying a policy,
     *         and both policies will be checked when a service call is made. For
     *         more information about how permissions work in the context of
     *         temporary credentials, see <a
     *         docs.amazonwebservices.com/IAM/latest/UserGuide/TokenPermissions.html"
     *         target="_blank">Controlling Permissions in Temporary Credentials</a>
     *         in <i>Using AWS Identity and Access Management</i>.
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
     * durations for federation sessions range from 3600s (one hour) to
     * 129600s (36 hours), with 43200s (12 hours) as the default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 129600<br/>
     *
     * @return The duration, in seconds, that the session should last. Acceptable
     *         durations for federation sessions range from 3600s (one hour) to
     *         129600s (36 hours), with 43200s (12 hours) as the default.
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }
    
    /**
     * The duration, in seconds, that the session should last. Acceptable
     * durations for federation sessions range from 3600s (one hour) to
     * 129600s (36 hours), with 43200s (12 hours) as the default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 129600<br/>
     *
     * @param durationSeconds The duration, in seconds, that the session should last. Acceptable
     *         durations for federation sessions range from 3600s (one hour) to
     *         129600s (36 hours), with 43200s (12 hours) as the default.
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }
    
    /**
     * The duration, in seconds, that the session should last. Acceptable
     * durations for federation sessions range from 3600s (one hour) to
     * 129600s (36 hours), with 43200s (12 hours) as the default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 129600<br/>
     *
     * @param durationSeconds The duration, in seconds, that the session should last. Acceptable
     *         durations for federation sessions range from 3600s (one hour) to
     *         129600s (36 hours), with 43200s (12 hours) as the default.
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
        if (name != null) sb.append("Name: " + name + ", ");
        if (policy != null) sb.append("Policy: " + policy + ", ");
        if (durationSeconds != null) sb.append("DurationSeconds: " + durationSeconds + ", ");
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
    
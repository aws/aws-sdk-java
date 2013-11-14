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


/**
 * <p>
 * Contains the result of a successful call to the AssumeRoleWithWebIdentity action, including temporary AWS credentials that can be used to make AWS
 * requests.
 * </p>
 */
public class AssumeRoleWithWebIdentityResult implements Serializable {

    /**
     * The temporary security credentials, which include an access key ID, a
     * secret access key, and a security token.
     */
    private Credentials credentials;

    /**
     * The unique user identifier that is returned by the identity provider.
     * This identifier is associated with the <code>WebIdentityToken</code>
     * that was submitted with the <code>AssumeRoleWithWebIdentity</code>
     * call. The identifier is typically unique to the user and the
     * application that acquired the <code>WebIdentityToken</code> (pairwise
     * identifier). If an OpenID Connect ID token was submitted in the
     * <code>WebIdentityToken</code>, this value is returned by the identity
     * provider as the token's <code>sub</code> (Subject) claim.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 255<br/>
     */
    private String subjectFromWebIdentityToken;

    /**
     * The Amazon Resource Name (ARN) and the assumed role ID, which are
     * identifiers that you can use to refer to the resulting temporary
     * security credentials. For example, you can reference these credentials
     * as a principal in a resource-based policy by using the ARN or assumed
     * role ID. The ARN and ID include the <code>RoleSessionName</code> that
     * you specified when you called <code>AssumeRole</code>.
     */
    private AssumedRoleUser assumedRoleUser;

    /**
     * A percentage value that indicates the size of the policy in packed
     * form. The service rejects any policy with a packed size greater than
     * 100 percent, which means the policy exceeded the allowed space.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer packedPolicySize;

    /**
     * The temporary security credentials, which include an access key ID, a
     * secret access key, and a security token.
     *
     * @return The temporary security credentials, which include an access key ID, a
     *         secret access key, and a security token.
     */
    public Credentials getCredentials() {
        return credentials;
    }
    
    /**
     * The temporary security credentials, which include an access key ID, a
     * secret access key, and a security token.
     *
     * @param credentials The temporary security credentials, which include an access key ID, a
     *         secret access key, and a security token.
     */
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }
    
    /**
     * The temporary security credentials, which include an access key ID, a
     * secret access key, and a security token.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param credentials The temporary security credentials, which include an access key ID, a
     *         secret access key, and a security token.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssumeRoleWithWebIdentityResult withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * The unique user identifier that is returned by the identity provider.
     * This identifier is associated with the <code>WebIdentityToken</code>
     * that was submitted with the <code>AssumeRoleWithWebIdentity</code>
     * call. The identifier is typically unique to the user and the
     * application that acquired the <code>WebIdentityToken</code> (pairwise
     * identifier). If an OpenID Connect ID token was submitted in the
     * <code>WebIdentityToken</code>, this value is returned by the identity
     * provider as the token's <code>sub</code> (Subject) claim.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 255<br/>
     *
     * @return The unique user identifier that is returned by the identity provider.
     *         This identifier is associated with the <code>WebIdentityToken</code>
     *         that was submitted with the <code>AssumeRoleWithWebIdentity</code>
     *         call. The identifier is typically unique to the user and the
     *         application that acquired the <code>WebIdentityToken</code> (pairwise
     *         identifier). If an OpenID Connect ID token was submitted in the
     *         <code>WebIdentityToken</code>, this value is returned by the identity
     *         provider as the token's <code>sub</code> (Subject) claim.
     */
    public String getSubjectFromWebIdentityToken() {
        return subjectFromWebIdentityToken;
    }
    
    /**
     * The unique user identifier that is returned by the identity provider.
     * This identifier is associated with the <code>WebIdentityToken</code>
     * that was submitted with the <code>AssumeRoleWithWebIdentity</code>
     * call. The identifier is typically unique to the user and the
     * application that acquired the <code>WebIdentityToken</code> (pairwise
     * identifier). If an OpenID Connect ID token was submitted in the
     * <code>WebIdentityToken</code>, this value is returned by the identity
     * provider as the token's <code>sub</code> (Subject) claim.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 255<br/>
     *
     * @param subjectFromWebIdentityToken The unique user identifier that is returned by the identity provider.
     *         This identifier is associated with the <code>WebIdentityToken</code>
     *         that was submitted with the <code>AssumeRoleWithWebIdentity</code>
     *         call. The identifier is typically unique to the user and the
     *         application that acquired the <code>WebIdentityToken</code> (pairwise
     *         identifier). If an OpenID Connect ID token was submitted in the
     *         <code>WebIdentityToken</code>, this value is returned by the identity
     *         provider as the token's <code>sub</code> (Subject) claim.
     */
    public void setSubjectFromWebIdentityToken(String subjectFromWebIdentityToken) {
        this.subjectFromWebIdentityToken = subjectFromWebIdentityToken;
    }
    
    /**
     * The unique user identifier that is returned by the identity provider.
     * This identifier is associated with the <code>WebIdentityToken</code>
     * that was submitted with the <code>AssumeRoleWithWebIdentity</code>
     * call. The identifier is typically unique to the user and the
     * application that acquired the <code>WebIdentityToken</code> (pairwise
     * identifier). If an OpenID Connect ID token was submitted in the
     * <code>WebIdentityToken</code>, this value is returned by the identity
     * provider as the token's <code>sub</code> (Subject) claim.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 255<br/>
     *
     * @param subjectFromWebIdentityToken The unique user identifier that is returned by the identity provider.
     *         This identifier is associated with the <code>WebIdentityToken</code>
     *         that was submitted with the <code>AssumeRoleWithWebIdentity</code>
     *         call. The identifier is typically unique to the user and the
     *         application that acquired the <code>WebIdentityToken</code> (pairwise
     *         identifier). If an OpenID Connect ID token was submitted in the
     *         <code>WebIdentityToken</code>, this value is returned by the identity
     *         provider as the token's <code>sub</code> (Subject) claim.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssumeRoleWithWebIdentityResult withSubjectFromWebIdentityToken(String subjectFromWebIdentityToken) {
        this.subjectFromWebIdentityToken = subjectFromWebIdentityToken;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) and the assumed role ID, which are
     * identifiers that you can use to refer to the resulting temporary
     * security credentials. For example, you can reference these credentials
     * as a principal in a resource-based policy by using the ARN or assumed
     * role ID. The ARN and ID include the <code>RoleSessionName</code> that
     * you specified when you called <code>AssumeRole</code>.
     *
     * @return The Amazon Resource Name (ARN) and the assumed role ID, which are
     *         identifiers that you can use to refer to the resulting temporary
     *         security credentials. For example, you can reference these credentials
     *         as a principal in a resource-based policy by using the ARN or assumed
     *         role ID. The ARN and ID include the <code>RoleSessionName</code> that
     *         you specified when you called <code>AssumeRole</code>.
     */
    public AssumedRoleUser getAssumedRoleUser() {
        return assumedRoleUser;
    }
    
    /**
     * The Amazon Resource Name (ARN) and the assumed role ID, which are
     * identifiers that you can use to refer to the resulting temporary
     * security credentials. For example, you can reference these credentials
     * as a principal in a resource-based policy by using the ARN or assumed
     * role ID. The ARN and ID include the <code>RoleSessionName</code> that
     * you specified when you called <code>AssumeRole</code>.
     *
     * @param assumedRoleUser The Amazon Resource Name (ARN) and the assumed role ID, which are
     *         identifiers that you can use to refer to the resulting temporary
     *         security credentials. For example, you can reference these credentials
     *         as a principal in a resource-based policy by using the ARN or assumed
     *         role ID. The ARN and ID include the <code>RoleSessionName</code> that
     *         you specified when you called <code>AssumeRole</code>.
     */
    public void setAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
    }
    
    /**
     * The Amazon Resource Name (ARN) and the assumed role ID, which are
     * identifiers that you can use to refer to the resulting temporary
     * security credentials. For example, you can reference these credentials
     * as a principal in a resource-based policy by using the ARN or assumed
     * role ID. The ARN and ID include the <code>RoleSessionName</code> that
     * you specified when you called <code>AssumeRole</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param assumedRoleUser The Amazon Resource Name (ARN) and the assumed role ID, which are
     *         identifiers that you can use to refer to the resulting temporary
     *         security credentials. For example, you can reference these credentials
     *         as a principal in a resource-based policy by using the ARN or assumed
     *         role ID. The ARN and ID include the <code>RoleSessionName</code> that
     *         you specified when you called <code>AssumeRole</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssumeRoleWithWebIdentityResult withAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
        return this;
    }

    /**
     * A percentage value that indicates the size of the policy in packed
     * form. The service rejects any policy with a packed size greater than
     * 100 percent, which means the policy exceeded the allowed space.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A percentage value that indicates the size of the policy in packed
     *         form. The service rejects any policy with a packed size greater than
     *         100 percent, which means the policy exceeded the allowed space.
     */
    public Integer getPackedPolicySize() {
        return packedPolicySize;
    }
    
    /**
     * A percentage value that indicates the size of the policy in packed
     * form. The service rejects any policy with a packed size greater than
     * 100 percent, which means the policy exceeded the allowed space.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param packedPolicySize A percentage value that indicates the size of the policy in packed
     *         form. The service rejects any policy with a packed size greater than
     *         100 percent, which means the policy exceeded the allowed space.
     */
    public void setPackedPolicySize(Integer packedPolicySize) {
        this.packedPolicySize = packedPolicySize;
    }
    
    /**
     * A percentage value that indicates the size of the policy in packed
     * form. The service rejects any policy with a packed size greater than
     * 100 percent, which means the policy exceeded the allowed space.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param packedPolicySize A percentage value that indicates the size of the policy in packed
     *         form. The service rejects any policy with a packed size greater than
     *         100 percent, which means the policy exceeded the allowed space.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssumeRoleWithWebIdentityResult withPackedPolicySize(Integer packedPolicySize) {
        this.packedPolicySize = packedPolicySize;
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
        if (getCredentials() != null) sb.append("Credentials: " + getCredentials() + ",");
        if (getSubjectFromWebIdentityToken() != null) sb.append("SubjectFromWebIdentityToken: " + getSubjectFromWebIdentityToken() + ",");
        if (getAssumedRoleUser() != null) sb.append("AssumedRoleUser: " + getAssumedRoleUser() + ",");
        if (getPackedPolicySize() != null) sb.append("PackedPolicySize: " + getPackedPolicySize() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode()); 
        hashCode = prime * hashCode + ((getSubjectFromWebIdentityToken() == null) ? 0 : getSubjectFromWebIdentityToken().hashCode()); 
        hashCode = prime * hashCode + ((getAssumedRoleUser() == null) ? 0 : getAssumedRoleUser().hashCode()); 
        hashCode = prime * hashCode + ((getPackedPolicySize() == null) ? 0 : getPackedPolicySize().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AssumeRoleWithWebIdentityResult == false) return false;
        AssumeRoleWithWebIdentityResult other = (AssumeRoleWithWebIdentityResult)obj;
        
        if (other.getCredentials() == null ^ this.getCredentials() == null) return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false) return false; 
        if (other.getSubjectFromWebIdentityToken() == null ^ this.getSubjectFromWebIdentityToken() == null) return false;
        if (other.getSubjectFromWebIdentityToken() != null && other.getSubjectFromWebIdentityToken().equals(this.getSubjectFromWebIdentityToken()) == false) return false; 
        if (other.getAssumedRoleUser() == null ^ this.getAssumedRoleUser() == null) return false;
        if (other.getAssumedRoleUser() != null && other.getAssumedRoleUser().equals(this.getAssumedRoleUser()) == false) return false; 
        if (other.getPackedPolicySize() == null ^ this.getPackedPolicySize() == null) return false;
        if (other.getPackedPolicySize() != null && other.getPackedPolicySize().equals(this.getPackedPolicySize()) == false) return false; 
        return true;
    }
    
}
    
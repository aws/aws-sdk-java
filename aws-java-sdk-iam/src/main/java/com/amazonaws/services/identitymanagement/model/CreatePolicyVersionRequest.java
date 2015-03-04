/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createPolicyVersion(CreatePolicyVersionRequest) CreatePolicyVersion operation}.
 * <p>
 * Creates a new version of the specified managed policy. To update a
 * managed policy, you create a new policy version. A managed policy can
 * have up to five versions. If the policy has five versions, you must
 * delete an existing version using DeletePolicyVersion before you create
 * a new version.
 * </p>
 * <p>
 * Optionally, you can set the new version as the policy's default
 * version. The default version is the operative version; that is, the
 * version that is in effect for the IAM users, groups, and roles that
 * the policy is attached to.
 * </p>
 * <p>
 * For more information about managed policy versions, see
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"> Versioning for Managed Policies </a>
 * in the <i>Using IAM</i> guide.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createPolicyVersion(CreatePolicyVersionRequest)
 */
public class CreatePolicyVersionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String policyArn;

    /**
     * The policy document. <p>The policy must be URL-encoded according to <a
     * href="http://www.faqs.org/rfcs/rfc3986.html">RFC 3986</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     */
    private String policyDocument;

    /**
     * Specifies whether to set this version as the policy's default version.
     * <p>When this parameter is <code>true</code>, the new policy version
     * becomes the operative version; that is, the version that is in effect
     * for the IAM users, groups, and roles that the policy is attached to.
     * <p>For more information about managed policy versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     * for Managed Policies</a> in the <i>Using IAM</i> guide.
     */
    private Boolean setAsDefault;

    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     *         resources. <p>For more information about ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     *         General Reference</i>.
     */
    public String getPolicyArn() {
        return policyArn;
    }
    
    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param policyArn The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     *         resources. <p>For more information about ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     *         General Reference</i>.
     */
    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }
    
    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param policyArn The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     *         resources. <p>For more information about ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     *         General Reference</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePolicyVersionRequest withPolicyArn(String policyArn) {
        this.policyArn = policyArn;
        return this;
    }

    /**
     * The policy document. <p>The policy must be URL-encoded according to <a
     * href="http://www.faqs.org/rfcs/rfc3986.html">RFC 3986</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return The policy document. <p>The policy must be URL-encoded according to <a
     *         href="http://www.faqs.org/rfcs/rfc3986.html">RFC 3986</a>.
     */
    public String getPolicyDocument() {
        return policyDocument;
    }
    
    /**
     * The policy document. <p>The policy must be URL-encoded according to <a
     * href="http://www.faqs.org/rfcs/rfc3986.html">RFC 3986</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param policyDocument The policy document. <p>The policy must be URL-encoded according to <a
     *         href="http://www.faqs.org/rfcs/rfc3986.html">RFC 3986</a>.
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }
    
    /**
     * The policy document. <p>The policy must be URL-encoded according to <a
     * href="http://www.faqs.org/rfcs/rfc3986.html">RFC 3986</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param policyDocument The policy document. <p>The policy must be URL-encoded according to <a
     *         href="http://www.faqs.org/rfcs/rfc3986.html">RFC 3986</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePolicyVersionRequest withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * Specifies whether to set this version as the policy's default version.
     * <p>When this parameter is <code>true</code>, the new policy version
     * becomes the operative version; that is, the version that is in effect
     * for the IAM users, groups, and roles that the policy is attached to.
     * <p>For more information about managed policy versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     * for Managed Policies</a> in the <i>Using IAM</i> guide.
     *
     * @return Specifies whether to set this version as the policy's default version.
     *         <p>When this parameter is <code>true</code>, the new policy version
     *         becomes the operative version; that is, the version that is in effect
     *         for the IAM users, groups, and roles that the policy is attached to.
     *         <p>For more information about managed policy versions, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     *         for Managed Policies</a> in the <i>Using IAM</i> guide.
     */
    public Boolean isSetAsDefault() {
        return setAsDefault;
    }
    
    /**
     * Specifies whether to set this version as the policy's default version.
     * <p>When this parameter is <code>true</code>, the new policy version
     * becomes the operative version; that is, the version that is in effect
     * for the IAM users, groups, and roles that the policy is attached to.
     * <p>For more information about managed policy versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     * for Managed Policies</a> in the <i>Using IAM</i> guide.
     *
     * @param setAsDefault Specifies whether to set this version as the policy's default version.
     *         <p>When this parameter is <code>true</code>, the new policy version
     *         becomes the operative version; that is, the version that is in effect
     *         for the IAM users, groups, and roles that the policy is attached to.
     *         <p>For more information about managed policy versions, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     *         for Managed Policies</a> in the <i>Using IAM</i> guide.
     */
    public void setSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
    }
    
    /**
     * Specifies whether to set this version as the policy's default version.
     * <p>When this parameter is <code>true</code>, the new policy version
     * becomes the operative version; that is, the version that is in effect
     * for the IAM users, groups, and roles that the policy is attached to.
     * <p>For more information about managed policy versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     * for Managed Policies</a> in the <i>Using IAM</i> guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param setAsDefault Specifies whether to set this version as the policy's default version.
     *         <p>When this parameter is <code>true</code>, the new policy version
     *         becomes the operative version; that is, the version that is in effect
     *         for the IAM users, groups, and roles that the policy is attached to.
     *         <p>For more information about managed policy versions, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     *         for Managed Policies</a> in the <i>Using IAM</i> guide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePolicyVersionRequest withSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
        return this;
    }

    /**
     * Specifies whether to set this version as the policy's default version.
     * <p>When this parameter is <code>true</code>, the new policy version
     * becomes the operative version; that is, the version that is in effect
     * for the IAM users, groups, and roles that the policy is attached to.
     * <p>For more information about managed policy versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     * for Managed Policies</a> in the <i>Using IAM</i> guide.
     *
     * @return Specifies whether to set this version as the policy's default version.
     *         <p>When this parameter is <code>true</code>, the new policy version
     *         becomes the operative version; that is, the version that is in effect
     *         for the IAM users, groups, and roles that the policy is attached to.
     *         <p>For more information about managed policy versions, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     *         for Managed Policies</a> in the <i>Using IAM</i> guide.
     */
    public Boolean getSetAsDefault() {
        return setAsDefault;
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
        if (getPolicyArn() != null) sb.append("PolicyArn: " + getPolicyArn() + ",");
        if (getPolicyDocument() != null) sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (isSetAsDefault() != null) sb.append("SetAsDefault: " + isSetAsDefault() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode()); 
        hashCode = prime * hashCode + ((isSetAsDefault() == null) ? 0 : isSetAsDefault().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePolicyVersionRequest == false) return false;
        CreatePolicyVersionRequest other = (CreatePolicyVersionRequest)obj;
        
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null) return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false) return false; 
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null) return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false) return false; 
        if (other.isSetAsDefault() == null ^ this.isSetAsDefault() == null) return false;
        if (other.isSetAsDefault() != null && other.isSetAsDefault().equals(this.isSetAsDefault()) == false) return false; 
        return true;
    }
    
    @Override
    public CreatePolicyVersionRequest clone() {
        
            return (CreatePolicyVersionRequest) super.clone();
    }

}
    
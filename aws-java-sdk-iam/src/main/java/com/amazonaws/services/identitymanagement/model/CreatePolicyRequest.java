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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createPolicy(CreatePolicyRequest) CreatePolicy operation}.
 * <p>
 * Creates a new managed policy for your AWS account.
 * </p>
 * <p>
 * This operation creates a policy version with a version identifier of
 * <code>v1</code> and sets v1 as the policy's default version. For more
 * information about policy versions, see
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"> Versioning for Managed Policies </a>
 * in the <i>Using IAM</i> guide.
 * </p>
 * <p>
 * For more information about managed policies in general, refer to
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
 * in the <i>Using IAM</i> guide.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createPolicy(CreatePolicyRequest)
 */
public class CreatePolicyRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the policy document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String policyName;

    /**
     * The path for the policy. <p>For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide. <p>This parameter is
     * optional. If it is not included, it defaults to a slash (/).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     */
    private String path;

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
     * A friendly description of the policy. <p>Typically used to store
     * information about the permissions defined in the policy. For example,
     * "Grants access to production DynamoDB tables." <p>The policy
     * description is immutable. After a value is assigned, it cannot be
     * changed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String description;

    /**
     * The name of the policy document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The name of the policy document.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name of the policy document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param policyName The name of the policy document.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name of the policy document.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param policyName The name of the policy document.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * The path for the policy. <p>For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide. <p>This parameter is
     * optional. If it is not included, it defaults to a slash (/).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     *
     * @return The path for the policy. <p>For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide. <p>This parameter is
     *         optional. If it is not included, it defaults to a slash (/).
     */
    public String getPath() {
        return path;
    }
    
    /**
     * The path for the policy. <p>For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide. <p>This parameter is
     * optional. If it is not included, it defaults to a slash (/).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     *
     * @param path The path for the policy. <p>For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide. <p>This parameter is
     *         optional. If it is not included, it defaults to a slash (/).
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    /**
     * The path for the policy. <p>For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide. <p>This parameter is
     * optional. If it is not included, it defaults to a slash (/).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     *
     * @param path The path for the policy. <p>For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide. <p>This parameter is
     *         optional. If it is not included, it defaults to a slash (/).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePolicyRequest withPath(String path) {
        this.path = path;
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
    public CreatePolicyRequest withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * A friendly description of the policy. <p>Typically used to store
     * information about the permissions defined in the policy. For example,
     * "Grants access to production DynamoDB tables." <p>The policy
     * description is immutable. After a value is assigned, it cannot be
     * changed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return A friendly description of the policy. <p>Typically used to store
     *         information about the permissions defined in the policy. For example,
     *         "Grants access to production DynamoDB tables." <p>The policy
     *         description is immutable. After a value is assigned, it cannot be
     *         changed.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A friendly description of the policy. <p>Typically used to store
     * information about the permissions defined in the policy. For example,
     * "Grants access to production DynamoDB tables." <p>The policy
     * description is immutable. After a value is assigned, it cannot be
     * changed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description A friendly description of the policy. <p>Typically used to store
     *         information about the permissions defined in the policy. For example,
     *         "Grants access to production DynamoDB tables." <p>The policy
     *         description is immutable. After a value is assigned, it cannot be
     *         changed.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A friendly description of the policy. <p>Typically used to store
     * information about the permissions defined in the policy. For example,
     * "Grants access to production DynamoDB tables." <p>The policy
     * description is immutable. After a value is assigned, it cannot be
     * changed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description A friendly description of the policy. <p>Typically used to store
     *         information about the permissions defined in the policy. For example,
     *         "Grants access to production DynamoDB tables." <p>The policy
     *         description is immutable. After a value is assigned, it cannot be
     *         changed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePolicyRequest withDescription(String description) {
        this.description = description;
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
        if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPath() != null) sb.append("Path: " + getPath() + ",");
        if (getPolicyDocument() != null) sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePolicyRequest == false) return false;
        CreatePolicyRequest other = (CreatePolicyRequest)obj;
        
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.getPath() == null ^ this.getPath() == null) return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false) return false; 
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null) return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    
/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CheckAccessNotGranted"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckAccessNotGrantedRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The JSON policy document to use as the content for the policy.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * An access object containing the permissions that shouldn't be granted by the specified policy.
     * </p>
     */
    private java.util.List<Access> access;
    /**
     * <p>
     * The type of policy. Identity policies grant permissions to IAM principals. Identity policies include managed and
     * inline policies for IAM roles, users, and groups.
     * </p>
     * <p>
     * Resource policies grant permissions on Amazon Web Services resources. Resource policies include trust policies
     * for IAM roles and bucket policies for Amazon S3 buckets. You can provide a generic input such as identity policy
     * or resource policy or a specific input such as managed policy or Amazon S3 bucket policy.
     * </p>
     */
    private String policyType;

    /**
     * <p>
     * The JSON policy document to use as the content for the policy.
     * </p>
     * 
     * @param policyDocument
     *        The JSON policy document to use as the content for the policy.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The JSON policy document to use as the content for the policy.
     * </p>
     * 
     * @return The JSON policy document to use as the content for the policy.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The JSON policy document to use as the content for the policy.
     * </p>
     * 
     * @param policyDocument
     *        The JSON policy document to use as the content for the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckAccessNotGrantedRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * An access object containing the permissions that shouldn't be granted by the specified policy.
     * </p>
     * 
     * @return An access object containing the permissions that shouldn't be granted by the specified policy.
     */

    public java.util.List<Access> getAccess() {
        return access;
    }

    /**
     * <p>
     * An access object containing the permissions that shouldn't be granted by the specified policy.
     * </p>
     * 
     * @param access
     *        An access object containing the permissions that shouldn't be granted by the specified policy.
     */

    public void setAccess(java.util.Collection<Access> access) {
        if (access == null) {
            this.access = null;
            return;
        }

        this.access = new java.util.ArrayList<Access>(access);
    }

    /**
     * <p>
     * An access object containing the permissions that shouldn't be granted by the specified policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccess(java.util.Collection)} or {@link #withAccess(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param access
     *        An access object containing the permissions that shouldn't be granted by the specified policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckAccessNotGrantedRequest withAccess(Access... access) {
        if (this.access == null) {
            setAccess(new java.util.ArrayList<Access>(access.length));
        }
        for (Access ele : access) {
            this.access.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An access object containing the permissions that shouldn't be granted by the specified policy.
     * </p>
     * 
     * @param access
     *        An access object containing the permissions that shouldn't be granted by the specified policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckAccessNotGrantedRequest withAccess(java.util.Collection<Access> access) {
        setAccess(access);
        return this;
    }

    /**
     * <p>
     * The type of policy. Identity policies grant permissions to IAM principals. Identity policies include managed and
     * inline policies for IAM roles, users, and groups.
     * </p>
     * <p>
     * Resource policies grant permissions on Amazon Web Services resources. Resource policies include trust policies
     * for IAM roles and bucket policies for Amazon S3 buckets. You can provide a generic input such as identity policy
     * or resource policy or a specific input such as managed policy or Amazon S3 bucket policy.
     * </p>
     * 
     * @param policyType
     *        The type of policy. Identity policies grant permissions to IAM principals. Identity policies include
     *        managed and inline policies for IAM roles, users, and groups.</p>
     *        <p>
     *        Resource policies grant permissions on Amazon Web Services resources. Resource policies include trust
     *        policies for IAM roles and bucket policies for Amazon S3 buckets. You can provide a generic input such as
     *        identity policy or resource policy or a specific input such as managed policy or Amazon S3 bucket policy.
     * @see AccessCheckPolicyType
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The type of policy. Identity policies grant permissions to IAM principals. Identity policies include managed and
     * inline policies for IAM roles, users, and groups.
     * </p>
     * <p>
     * Resource policies grant permissions on Amazon Web Services resources. Resource policies include trust policies
     * for IAM roles and bucket policies for Amazon S3 buckets. You can provide a generic input such as identity policy
     * or resource policy or a specific input such as managed policy or Amazon S3 bucket policy.
     * </p>
     * 
     * @return The type of policy. Identity policies grant permissions to IAM principals. Identity policies include
     *         managed and inline policies for IAM roles, users, and groups.</p>
     *         <p>
     *         Resource policies grant permissions on Amazon Web Services resources. Resource policies include trust
     *         policies for IAM roles and bucket policies for Amazon S3 buckets. You can provide a generic input such as
     *         identity policy or resource policy or a specific input such as managed policy or Amazon S3 bucket policy.
     * @see AccessCheckPolicyType
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * The type of policy. Identity policies grant permissions to IAM principals. Identity policies include managed and
     * inline policies for IAM roles, users, and groups.
     * </p>
     * <p>
     * Resource policies grant permissions on Amazon Web Services resources. Resource policies include trust policies
     * for IAM roles and bucket policies for Amazon S3 buckets. You can provide a generic input such as identity policy
     * or resource policy or a specific input such as managed policy or Amazon S3 bucket policy.
     * </p>
     * 
     * @param policyType
     *        The type of policy. Identity policies grant permissions to IAM principals. Identity policies include
     *        managed and inline policies for IAM roles, users, and groups.</p>
     *        <p>
     *        Resource policies grant permissions on Amazon Web Services resources. Resource policies include trust
     *        policies for IAM roles and bucket policies for Amazon S3 buckets. You can provide a generic input such as
     *        identity policy or resource policy or a specific input such as managed policy or Amazon S3 bucket policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessCheckPolicyType
     */

    public CheckAccessNotGrantedRequest withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The type of policy. Identity policies grant permissions to IAM principals. Identity policies include managed and
     * inline policies for IAM roles, users, and groups.
     * </p>
     * <p>
     * Resource policies grant permissions on Amazon Web Services resources. Resource policies include trust policies
     * for IAM roles and bucket policies for Amazon S3 buckets. You can provide a generic input such as identity policy
     * or resource policy or a specific input such as managed policy or Amazon S3 bucket policy.
     * </p>
     * 
     * @param policyType
     *        The type of policy. Identity policies grant permissions to IAM principals. Identity policies include
     *        managed and inline policies for IAM roles, users, and groups.</p>
     *        <p>
     *        Resource policies grant permissions on Amazon Web Services resources. Resource policies include trust
     *        policies for IAM roles and bucket policies for Amazon S3 buckets. You can provide a generic input such as
     *        identity policy or resource policy or a specific input such as managed policy or Amazon S3 bucket policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessCheckPolicyType
     */

    public CheckAccessNotGrantedRequest withPolicyType(AccessCheckPolicyType policyType) {
        this.policyType = policyType.toString();
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
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append("***Sensitive Data Redacted***").append(",");
        if (getAccess() != null)
            sb.append("Access: ").append(getAccess()).append(",");
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckAccessNotGrantedRequest == false)
            return false;
        CheckAccessNotGrantedRequest other = (CheckAccessNotGrantedRequest) obj;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getAccess() == null ^ this.getAccess() == null)
            return false;
        if (other.getAccess() != null && other.getAccess().equals(this.getAccess()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getAccess() == null) ? 0 : getAccess().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        return hashCode;
    }

    @Override
    public CheckAccessNotGrantedRequest clone() {
        return (CheckAccessNotGrantedRequest) super.clone();
    }

}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CheckNoNewAccess" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckNoNewAccessRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The JSON policy document to use as the content for the updated policy.
     * </p>
     */
    private String newPolicyDocument;
    /**
     * <p>
     * The JSON policy document to use as the content for the existing policy.
     * </p>
     */
    private String existingPolicyDocument;
    /**
     * <p>
     * The type of policy to compare. Identity policies grant permissions to IAM principals. Identity policies include
     * managed and inline policies for IAM roles, users, and groups.
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
     * The JSON policy document to use as the content for the updated policy.
     * </p>
     * 
     * @param newPolicyDocument
     *        The JSON policy document to use as the content for the updated policy.
     */

    public void setNewPolicyDocument(String newPolicyDocument) {
        this.newPolicyDocument = newPolicyDocument;
    }

    /**
     * <p>
     * The JSON policy document to use as the content for the updated policy.
     * </p>
     * 
     * @return The JSON policy document to use as the content for the updated policy.
     */

    public String getNewPolicyDocument() {
        return this.newPolicyDocument;
    }

    /**
     * <p>
     * The JSON policy document to use as the content for the updated policy.
     * </p>
     * 
     * @param newPolicyDocument
     *        The JSON policy document to use as the content for the updated policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckNoNewAccessRequest withNewPolicyDocument(String newPolicyDocument) {
        setNewPolicyDocument(newPolicyDocument);
        return this;
    }

    /**
     * <p>
     * The JSON policy document to use as the content for the existing policy.
     * </p>
     * 
     * @param existingPolicyDocument
     *        The JSON policy document to use as the content for the existing policy.
     */

    public void setExistingPolicyDocument(String existingPolicyDocument) {
        this.existingPolicyDocument = existingPolicyDocument;
    }

    /**
     * <p>
     * The JSON policy document to use as the content for the existing policy.
     * </p>
     * 
     * @return The JSON policy document to use as the content for the existing policy.
     */

    public String getExistingPolicyDocument() {
        return this.existingPolicyDocument;
    }

    /**
     * <p>
     * The JSON policy document to use as the content for the existing policy.
     * </p>
     * 
     * @param existingPolicyDocument
     *        The JSON policy document to use as the content for the existing policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckNoNewAccessRequest withExistingPolicyDocument(String existingPolicyDocument) {
        setExistingPolicyDocument(existingPolicyDocument);
        return this;
    }

    /**
     * <p>
     * The type of policy to compare. Identity policies grant permissions to IAM principals. Identity policies include
     * managed and inline policies for IAM roles, users, and groups.
     * </p>
     * <p>
     * Resource policies grant permissions on Amazon Web Services resources. Resource policies include trust policies
     * for IAM roles and bucket policies for Amazon S3 buckets. You can provide a generic input such as identity policy
     * or resource policy or a specific input such as managed policy or Amazon S3 bucket policy.
     * </p>
     * 
     * @param policyType
     *        The type of policy to compare. Identity policies grant permissions to IAM principals. Identity policies
     *        include managed and inline policies for IAM roles, users, and groups.</p>
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
     * The type of policy to compare. Identity policies grant permissions to IAM principals. Identity policies include
     * managed and inline policies for IAM roles, users, and groups.
     * </p>
     * <p>
     * Resource policies grant permissions on Amazon Web Services resources. Resource policies include trust policies
     * for IAM roles and bucket policies for Amazon S3 buckets. You can provide a generic input such as identity policy
     * or resource policy or a specific input such as managed policy or Amazon S3 bucket policy.
     * </p>
     * 
     * @return The type of policy to compare. Identity policies grant permissions to IAM principals. Identity policies
     *         include managed and inline policies for IAM roles, users, and groups.</p>
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
     * The type of policy to compare. Identity policies grant permissions to IAM principals. Identity policies include
     * managed and inline policies for IAM roles, users, and groups.
     * </p>
     * <p>
     * Resource policies grant permissions on Amazon Web Services resources. Resource policies include trust policies
     * for IAM roles and bucket policies for Amazon S3 buckets. You can provide a generic input such as identity policy
     * or resource policy or a specific input such as managed policy or Amazon S3 bucket policy.
     * </p>
     * 
     * @param policyType
     *        The type of policy to compare. Identity policies grant permissions to IAM principals. Identity policies
     *        include managed and inline policies for IAM roles, users, and groups.</p>
     *        <p>
     *        Resource policies grant permissions on Amazon Web Services resources. Resource policies include trust
     *        policies for IAM roles and bucket policies for Amazon S3 buckets. You can provide a generic input such as
     *        identity policy or resource policy or a specific input such as managed policy or Amazon S3 bucket policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessCheckPolicyType
     */

    public CheckNoNewAccessRequest withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The type of policy to compare. Identity policies grant permissions to IAM principals. Identity policies include
     * managed and inline policies for IAM roles, users, and groups.
     * </p>
     * <p>
     * Resource policies grant permissions on Amazon Web Services resources. Resource policies include trust policies
     * for IAM roles and bucket policies for Amazon S3 buckets. You can provide a generic input such as identity policy
     * or resource policy or a specific input such as managed policy or Amazon S3 bucket policy.
     * </p>
     * 
     * @param policyType
     *        The type of policy to compare. Identity policies grant permissions to IAM principals. Identity policies
     *        include managed and inline policies for IAM roles, users, and groups.</p>
     *        <p>
     *        Resource policies grant permissions on Amazon Web Services resources. Resource policies include trust
     *        policies for IAM roles and bucket policies for Amazon S3 buckets. You can provide a generic input such as
     *        identity policy or resource policy or a specific input such as managed policy or Amazon S3 bucket policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessCheckPolicyType
     */

    public CheckNoNewAccessRequest withPolicyType(AccessCheckPolicyType policyType) {
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
        if (getNewPolicyDocument() != null)
            sb.append("NewPolicyDocument: ").append("***Sensitive Data Redacted***").append(",");
        if (getExistingPolicyDocument() != null)
            sb.append("ExistingPolicyDocument: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof CheckNoNewAccessRequest == false)
            return false;
        CheckNoNewAccessRequest other = (CheckNoNewAccessRequest) obj;
        if (other.getNewPolicyDocument() == null ^ this.getNewPolicyDocument() == null)
            return false;
        if (other.getNewPolicyDocument() != null && other.getNewPolicyDocument().equals(this.getNewPolicyDocument()) == false)
            return false;
        if (other.getExistingPolicyDocument() == null ^ this.getExistingPolicyDocument() == null)
            return false;
        if (other.getExistingPolicyDocument() != null && other.getExistingPolicyDocument().equals(this.getExistingPolicyDocument()) == false)
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

        hashCode = prime * hashCode + ((getNewPolicyDocument() == null) ? 0 : getNewPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getExistingPolicyDocument() == null) ? 0 : getExistingPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        return hashCode;
    }

    @Override
    public CheckNoNewAccessRequest clone() {
        return (CheckNoNewAccessRequest) super.clone();
    }

}

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

package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreatePolicyRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of the policy document.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The path for the policy.
     * </p>
     * <p>
     * For more information about paths, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     */
    private String path;
    /**
     * <p>
     * The policy document.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * A friendly description of the policy.
     * </p>
     * <p>
     * Typically used to store information about the permissions defined in the
     * policy. For example, "Grants access to production DynamoDB tables."
     * </p>
     * <p>
     * The policy description is immutable. After a value is assigned, it cannot
     * be changed.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the policy document.
     * </p>
     * 
     * @param policyName
     *        The name of the policy document.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy document.
     * </p>
     * 
     * @return The name of the policy document.
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the policy document.
     * </p>
     * 
     * @param policyName
     *        The name of the policy document.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreatePolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The path for the policy.
     * </p>
     * <p>
     * For more information about paths, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * 
     * @param path
     *        The path for the policy. </p>
     *        <p>
     *        For more information about paths, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *        >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to
     *        a slash (/).
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path for the policy.
     * </p>
     * <p>
     * For more information about paths, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * 
     * @return The path for the policy. </p>
     *         <p>
     *         For more information about paths, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         This parameter is optional. If it is not included, it defaults to
     *         a slash (/).
     */
    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path for the policy.
     * </p>
     * <p>
     * For more information about paths, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * 
     * @param path
     *        The path for the policy. </p>
     *        <p>
     *        For more information about paths, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *        >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to
     *        a slash (/).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreatePolicyRequest withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * 
     * @param policyDocument
     *        The policy document.
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * 
     * @return The policy document.
     */
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * 
     * @param policyDocument
     *        The policy document.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreatePolicyRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * A friendly description of the policy.
     * </p>
     * <p>
     * Typically used to store information about the permissions defined in the
     * policy. For example, "Grants access to production DynamoDB tables."
     * </p>
     * <p>
     * The policy description is immutable. After a value is assigned, it cannot
     * be changed.
     * </p>
     * 
     * @param description
     *        A friendly description of the policy. </p>
     *        <p>
     *        Typically used to store information about the permissions defined
     *        in the policy. For example,
     *        "Grants access to production DynamoDB tables."
     *        </p>
     *        <p>
     *        The policy description is immutable. After a value is assigned, it
     *        cannot be changed.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A friendly description of the policy.
     * </p>
     * <p>
     * Typically used to store information about the permissions defined in the
     * policy. For example, "Grants access to production DynamoDB tables."
     * </p>
     * <p>
     * The policy description is immutable. After a value is assigned, it cannot
     * be changed.
     * </p>
     * 
     * @return A friendly description of the policy. </p>
     *         <p>
     *         Typically used to store information about the permissions defined
     *         in the policy. For example,
     *         "Grants access to production DynamoDB tables."
     *         </p>
     *         <p>
     *         The policy description is immutable. After a value is assigned,
     *         it cannot be changed.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A friendly description of the policy.
     * </p>
     * <p>
     * Typically used to store information about the permissions defined in the
     * policy. For example, "Grants access to production DynamoDB tables."
     * </p>
     * <p>
     * The policy description is immutable. After a value is assigned, it cannot
     * be changed.
     * </p>
     * 
     * @param description
     *        A friendly description of the policy. </p>
     *        <p>
     *        Typically used to store information about the permissions defined
     *        in the policy. For example,
     *        "Grants access to production DynamoDB tables."
     *        </p>
     *        <p>
     *        The policy description is immutable. After a value is assigned, it
     *        cannot be changed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreatePolicyRequest withDescription(String description) {
        setDescription(description);
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
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePolicyRequest == false)
            return false;
        CreatePolicyRequest other = (CreatePolicyRequest) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null
                && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPolicyDocument() == null
                ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null
                && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode
                + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime
                * hashCode
                + ((getPolicyDocument() == null) ? 0 : getPolicyDocument()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreatePolicyRequest clone() {
        return (CreatePolicyRequest) super.clone();
    }
}
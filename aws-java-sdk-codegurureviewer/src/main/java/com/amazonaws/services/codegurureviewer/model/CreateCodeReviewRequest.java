/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/CreateCodeReview" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCodeReviewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the code review. Each code review of the same code review type must have a unique name in your AWS
     * account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     * <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling
     * <code>ListRepositories</code>.
     * </p>
     * <p>
     * A code review can only be created on an associated repository. This is the ARN of the associated repository.
     * </p>
     */
    private String repositoryAssociationArn;
    /**
     * <p>
     * The type of code review to create. This is specified using a <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReviewType.html">
     * <code>CodeReviewType</code> </a> object.
     * </p>
     */
    private CodeReviewType type;
    /**
     * <p>
     * Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate code reviews if there
     * are failures and retries.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name of the code review. Each code review of the same code review type must have a unique name in your AWS
     * account.
     * </p>
     * 
     * @param name
     *        The name of the code review. Each code review of the same code review type must have a unique name in your
     *        AWS account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the code review. Each code review of the same code review type must have a unique name in your AWS
     * account.
     * </p>
     * 
     * @return The name of the code review. Each code review of the same code review type must have a unique name in
     *         your AWS account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the code review. Each code review of the same code review type must have a unique name in your AWS
     * account.
     * </p>
     * 
     * @param name
     *        The name of the code review. Each code review of the same code review type must have a unique name in your
     *        AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCodeReviewRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     * <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling
     * <code>ListRepositories</code>.
     * </p>
     * <p>
     * A code review can only be created on an associated repository. This is the ARN of the associated repository.
     * </p>
     * 
     * @param repositoryAssociationArn
     *        The Amazon Resource Name (ARN) of the <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     *        <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling
     *        <code>ListRepositories</code>. </p>
     *        <p>
     *        A code review can only be created on an associated repository. This is the ARN of the associated
     *        repository.
     */

    public void setRepositoryAssociationArn(String repositoryAssociationArn) {
        this.repositoryAssociationArn = repositoryAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     * <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling
     * <code>ListRepositories</code>.
     * </p>
     * <p>
     * A code review can only be created on an associated repository. This is the ARN of the associated repository.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     *         <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling
     *         <code>ListRepositories</code>. </p>
     *         <p>
     *         A code review can only be created on an associated repository. This is the ARN of the associated
     *         repository.
     */

    public String getRepositoryAssociationArn() {
        return this.repositoryAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     * <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling
     * <code>ListRepositories</code>.
     * </p>
     * <p>
     * A code review can only be created on an associated repository. This is the ARN of the associated repository.
     * </p>
     * 
     * @param repositoryAssociationArn
     *        The Amazon Resource Name (ARN) of the <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     *        <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling
     *        <code>ListRepositories</code>. </p>
     *        <p>
     *        A code review can only be created on an associated repository. This is the ARN of the associated
     *        repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCodeReviewRequest withRepositoryAssociationArn(String repositoryAssociationArn) {
        setRepositoryAssociationArn(repositoryAssociationArn);
        return this;
    }

    /**
     * <p>
     * The type of code review to create. This is specified using a <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReviewType.html">
     * <code>CodeReviewType</code> </a> object.
     * </p>
     * 
     * @param type
     *        The type of code review to create. This is specified using a <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReviewType.html">
     *        <code>CodeReviewType</code> </a> object.
     */

    public void setType(CodeReviewType type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of code review to create. This is specified using a <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReviewType.html">
     * <code>CodeReviewType</code> </a> object.
     * </p>
     * 
     * @return The type of code review to create. This is specified using a <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReviewType.html">
     *         <code>CodeReviewType</code> </a> object.
     */

    public CodeReviewType getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of code review to create. This is specified using a <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReviewType.html">
     * <code>CodeReviewType</code> </a> object.
     * </p>
     * 
     * @param type
     *        The type of code review to create. This is specified using a <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReviewType.html">
     *        <code>CodeReviewType</code> </a> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCodeReviewRequest withType(CodeReviewType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate code reviews if there
     * are failures and retries.
     * </p>
     * 
     * @param clientRequestToken
     *        Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate code reviews if
     *        there are failures and retries.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate code reviews if there
     * are failures and retries.
     * </p>
     * 
     * @return Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate code reviews if
     *         there are failures and retries.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate code reviews if there
     * are failures and retries.
     * </p>
     * 
     * @param clientRequestToken
     *        Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate code reviews if
     *        there are failures and retries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCodeReviewRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getRepositoryAssociationArn() != null)
            sb.append("RepositoryAssociationArn: ").append(getRepositoryAssociationArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCodeReviewRequest == false)
            return false;
        CreateCodeReviewRequest other = (CreateCodeReviewRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRepositoryAssociationArn() == null ^ this.getRepositoryAssociationArn() == null)
            return false;
        if (other.getRepositoryAssociationArn() != null && other.getRepositoryAssociationArn().equals(this.getRepositoryAssociationArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRepositoryAssociationArn() == null) ? 0 : getRepositoryAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateCodeReviewRequest clone() {
        return (CreateCodeReviewRequest) super.clone();
    }

}

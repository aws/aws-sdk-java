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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchAssociateApprovalRuleTemplateWithRepositories"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchAssociateApprovalRuleTemplateWithRepositoriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the template you want to associate with one or more repositories.
     * </p>
     */
    private String approvalRuleTemplateName;
    /**
     * <p>
     * The names of the repositories you want to associate with the template.
     * </p>
     * <note>
     * <p>
     * The length constraint limit is for each string in the array. The array itself can be empty.
     * </p>
     * </note>
     */
    private java.util.List<String> repositoryNames;

    /**
     * <p>
     * The name of the template you want to associate with one or more repositories.
     * </p>
     * 
     * @param approvalRuleTemplateName
     *        The name of the template you want to associate with one or more repositories.
     */

    public void setApprovalRuleTemplateName(String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the template you want to associate with one or more repositories.
     * </p>
     * 
     * @return The name of the template you want to associate with one or more repositories.
     */

    public String getApprovalRuleTemplateName() {
        return this.approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the template you want to associate with one or more repositories.
     * </p>
     * 
     * @param approvalRuleTemplateName
     *        The name of the template you want to associate with one or more repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateApprovalRuleTemplateWithRepositoriesRequest withApprovalRuleTemplateName(String approvalRuleTemplateName) {
        setApprovalRuleTemplateName(approvalRuleTemplateName);
        return this;
    }

    /**
     * <p>
     * The names of the repositories you want to associate with the template.
     * </p>
     * <note>
     * <p>
     * The length constraint limit is for each string in the array. The array itself can be empty.
     * </p>
     * </note>
     * 
     * @return The names of the repositories you want to associate with the template.</p> <note>
     *         <p>
     *         The length constraint limit is for each string in the array. The array itself can be empty.
     *         </p>
     */

    public java.util.List<String> getRepositoryNames() {
        return repositoryNames;
    }

    /**
     * <p>
     * The names of the repositories you want to associate with the template.
     * </p>
     * <note>
     * <p>
     * The length constraint limit is for each string in the array. The array itself can be empty.
     * </p>
     * </note>
     * 
     * @param repositoryNames
     *        The names of the repositories you want to associate with the template.</p> <note>
     *        <p>
     *        The length constraint limit is for each string in the array. The array itself can be empty.
     *        </p>
     */

    public void setRepositoryNames(java.util.Collection<String> repositoryNames) {
        if (repositoryNames == null) {
            this.repositoryNames = null;
            return;
        }

        this.repositoryNames = new java.util.ArrayList<String>(repositoryNames);
    }

    /**
     * <p>
     * The names of the repositories you want to associate with the template.
     * </p>
     * <note>
     * <p>
     * The length constraint limit is for each string in the array. The array itself can be empty.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositoryNames(java.util.Collection)} or {@link #withRepositoryNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param repositoryNames
     *        The names of the repositories you want to associate with the template.</p> <note>
     *        <p>
     *        The length constraint limit is for each string in the array. The array itself can be empty.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateApprovalRuleTemplateWithRepositoriesRequest withRepositoryNames(String... repositoryNames) {
        if (this.repositoryNames == null) {
            setRepositoryNames(new java.util.ArrayList<String>(repositoryNames.length));
        }
        for (String ele : repositoryNames) {
            this.repositoryNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the repositories you want to associate with the template.
     * </p>
     * <note>
     * <p>
     * The length constraint limit is for each string in the array. The array itself can be empty.
     * </p>
     * </note>
     * 
     * @param repositoryNames
     *        The names of the repositories you want to associate with the template.</p> <note>
     *        <p>
     *        The length constraint limit is for each string in the array. The array itself can be empty.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateApprovalRuleTemplateWithRepositoriesRequest withRepositoryNames(java.util.Collection<String> repositoryNames) {
        setRepositoryNames(repositoryNames);
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
        if (getApprovalRuleTemplateName() != null)
            sb.append("ApprovalRuleTemplateName: ").append(getApprovalRuleTemplateName()).append(",");
        if (getRepositoryNames() != null)
            sb.append("RepositoryNames: ").append(getRepositoryNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchAssociateApprovalRuleTemplateWithRepositoriesRequest == false)
            return false;
        BatchAssociateApprovalRuleTemplateWithRepositoriesRequest other = (BatchAssociateApprovalRuleTemplateWithRepositoriesRequest) obj;
        if (other.getApprovalRuleTemplateName() == null ^ this.getApprovalRuleTemplateName() == null)
            return false;
        if (other.getApprovalRuleTemplateName() != null && other.getApprovalRuleTemplateName().equals(this.getApprovalRuleTemplateName()) == false)
            return false;
        if (other.getRepositoryNames() == null ^ this.getRepositoryNames() == null)
            return false;
        if (other.getRepositoryNames() != null && other.getRepositoryNames().equals(this.getRepositoryNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApprovalRuleTemplateName() == null) ? 0 : getApprovalRuleTemplateName().hashCode());
        hashCode = prime * hashCode + ((getRepositoryNames() == null) ? 0 : getRepositoryNames().hashCode());
        return hashCode;
    }

    @Override
    public BatchAssociateApprovalRuleTemplateWithRepositoriesRequest clone() {
        return (BatchAssociateApprovalRuleTemplateWithRepositoriesRequest) super.clone();
    }

}

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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/AssociateApprovalRuleTemplateWithRepository"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateApprovalRuleTemplateWithRepositoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the approval rule template.
     * </p>
     */
    private String approvalRuleTemplateName;
    /**
     * <p>
     * The name of the repository that you want to associate with the template.
     * </p>
     */
    private String repositoryName;

    /**
     * <p>
     * The name for the approval rule template.
     * </p>
     * 
     * @param approvalRuleTemplateName
     *        The name for the approval rule template.
     */

    public void setApprovalRuleTemplateName(String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name for the approval rule template.
     * </p>
     * 
     * @return The name for the approval rule template.
     */

    public String getApprovalRuleTemplateName() {
        return this.approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name for the approval rule template.
     * </p>
     * 
     * @param approvalRuleTemplateName
     *        The name for the approval rule template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateApprovalRuleTemplateWithRepositoryRequest withApprovalRuleTemplateName(String approvalRuleTemplateName) {
        setApprovalRuleTemplateName(approvalRuleTemplateName);
        return this;
    }

    /**
     * <p>
     * The name of the repository that you want to associate with the template.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that you want to associate with the template.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that you want to associate with the template.
     * </p>
     * 
     * @return The name of the repository that you want to associate with the template.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that you want to associate with the template.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that you want to associate with the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateApprovalRuleTemplateWithRepositoryRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateApprovalRuleTemplateWithRepositoryRequest == false)
            return false;
        AssociateApprovalRuleTemplateWithRepositoryRequest other = (AssociateApprovalRuleTemplateWithRepositoryRequest) obj;
        if (other.getApprovalRuleTemplateName() == null ^ this.getApprovalRuleTemplateName() == null)
            return false;
        if (other.getApprovalRuleTemplateName() != null && other.getApprovalRuleTemplateName().equals(this.getApprovalRuleTemplateName()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApprovalRuleTemplateName() == null) ? 0 : getApprovalRuleTemplateName().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        return hashCode;
    }

    @Override
    public AssociateApprovalRuleTemplateWithRepositoryRequest clone() {
        return (AssociateApprovalRuleTemplateWithRepositoryRequest) super.clone();
    }

}

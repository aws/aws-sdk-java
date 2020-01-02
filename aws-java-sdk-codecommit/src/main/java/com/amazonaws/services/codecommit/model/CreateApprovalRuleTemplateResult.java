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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateApprovalRuleTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApprovalRuleTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The content and structure of the created approval rule template.
     * </p>
     */
    private ApprovalRuleTemplate approvalRuleTemplate;

    /**
     * <p>
     * The content and structure of the created approval rule template.
     * </p>
     * 
     * @param approvalRuleTemplate
     *        The content and structure of the created approval rule template.
     */

    public void setApprovalRuleTemplate(ApprovalRuleTemplate approvalRuleTemplate) {
        this.approvalRuleTemplate = approvalRuleTemplate;
    }

    /**
     * <p>
     * The content and structure of the created approval rule template.
     * </p>
     * 
     * @return The content and structure of the created approval rule template.
     */

    public ApprovalRuleTemplate getApprovalRuleTemplate() {
        return this.approvalRuleTemplate;
    }

    /**
     * <p>
     * The content and structure of the created approval rule template.
     * </p>
     * 
     * @param approvalRuleTemplate
     *        The content and structure of the created approval rule template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApprovalRuleTemplateResult withApprovalRuleTemplate(ApprovalRuleTemplate approvalRuleTemplate) {
        setApprovalRuleTemplate(approvalRuleTemplate);
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
        if (getApprovalRuleTemplate() != null)
            sb.append("ApprovalRuleTemplate: ").append(getApprovalRuleTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApprovalRuleTemplateResult == false)
            return false;
        CreateApprovalRuleTemplateResult other = (CreateApprovalRuleTemplateResult) obj;
        if (other.getApprovalRuleTemplate() == null ^ this.getApprovalRuleTemplate() == null)
            return false;
        if (other.getApprovalRuleTemplate() != null && other.getApprovalRuleTemplate().equals(this.getApprovalRuleTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApprovalRuleTemplate() == null) ? 0 : getApprovalRuleTemplate().hashCode());
        return hashCode;
    }

    @Override
    public CreateApprovalRuleTemplateResult clone() {
        try {
            return (CreateApprovalRuleTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateApprovalRuleTemplateDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApprovalRuleTemplateDescriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the template for which you want to update the description.
     * </p>
     */
    private String approvalRuleTemplateName;
    /**
     * <p>
     * The updated description of the approval rule template.
     * </p>
     */
    private String approvalRuleTemplateDescription;

    /**
     * <p>
     * The name of the template for which you want to update the description.
     * </p>
     * 
     * @param approvalRuleTemplateName
     *        The name of the template for which you want to update the description.
     */

    public void setApprovalRuleTemplateName(String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the template for which you want to update the description.
     * </p>
     * 
     * @return The name of the template for which you want to update the description.
     */

    public String getApprovalRuleTemplateName() {
        return this.approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the template for which you want to update the description.
     * </p>
     * 
     * @param approvalRuleTemplateName
     *        The name of the template for which you want to update the description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApprovalRuleTemplateDescriptionRequest withApprovalRuleTemplateName(String approvalRuleTemplateName) {
        setApprovalRuleTemplateName(approvalRuleTemplateName);
        return this;
    }

    /**
     * <p>
     * The updated description of the approval rule template.
     * </p>
     * 
     * @param approvalRuleTemplateDescription
     *        The updated description of the approval rule template.
     */

    public void setApprovalRuleTemplateDescription(String approvalRuleTemplateDescription) {
        this.approvalRuleTemplateDescription = approvalRuleTemplateDescription;
    }

    /**
     * <p>
     * The updated description of the approval rule template.
     * </p>
     * 
     * @return The updated description of the approval rule template.
     */

    public String getApprovalRuleTemplateDescription() {
        return this.approvalRuleTemplateDescription;
    }

    /**
     * <p>
     * The updated description of the approval rule template.
     * </p>
     * 
     * @param approvalRuleTemplateDescription
     *        The updated description of the approval rule template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApprovalRuleTemplateDescriptionRequest withApprovalRuleTemplateDescription(String approvalRuleTemplateDescription) {
        setApprovalRuleTemplateDescription(approvalRuleTemplateDescription);
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
        if (getApprovalRuleTemplateDescription() != null)
            sb.append("ApprovalRuleTemplateDescription: ").append(getApprovalRuleTemplateDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApprovalRuleTemplateDescriptionRequest == false)
            return false;
        UpdateApprovalRuleTemplateDescriptionRequest other = (UpdateApprovalRuleTemplateDescriptionRequest) obj;
        if (other.getApprovalRuleTemplateName() == null ^ this.getApprovalRuleTemplateName() == null)
            return false;
        if (other.getApprovalRuleTemplateName() != null && other.getApprovalRuleTemplateName().equals(this.getApprovalRuleTemplateName()) == false)
            return false;
        if (other.getApprovalRuleTemplateDescription() == null ^ this.getApprovalRuleTemplateDescription() == null)
            return false;
        if (other.getApprovalRuleTemplateDescription() != null
                && other.getApprovalRuleTemplateDescription().equals(this.getApprovalRuleTemplateDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApprovalRuleTemplateName() == null) ? 0 : getApprovalRuleTemplateName().hashCode());
        hashCode = prime * hashCode + ((getApprovalRuleTemplateDescription() == null) ? 0 : getApprovalRuleTemplateDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApprovalRuleTemplateDescriptionRequest clone() {
        return (UpdateApprovalRuleTemplateDescriptionRequest) super.clone();
    }

}

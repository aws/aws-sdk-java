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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateApprovalRuleTemplateName"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApprovalRuleTemplateNameRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The current name of the approval rule template.
     * </p>
     */
    private String oldApprovalRuleTemplateName;
    /**
     * <p>
     * The new name you want to apply to the approval rule template.
     * </p>
     */
    private String newApprovalRuleTemplateName;

    /**
     * <p>
     * The current name of the approval rule template.
     * </p>
     * 
     * @param oldApprovalRuleTemplateName
     *        The current name of the approval rule template.
     */

    public void setOldApprovalRuleTemplateName(String oldApprovalRuleTemplateName) {
        this.oldApprovalRuleTemplateName = oldApprovalRuleTemplateName;
    }

    /**
     * <p>
     * The current name of the approval rule template.
     * </p>
     * 
     * @return The current name of the approval rule template.
     */

    public String getOldApprovalRuleTemplateName() {
        return this.oldApprovalRuleTemplateName;
    }

    /**
     * <p>
     * The current name of the approval rule template.
     * </p>
     * 
     * @param oldApprovalRuleTemplateName
     *        The current name of the approval rule template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApprovalRuleTemplateNameRequest withOldApprovalRuleTemplateName(String oldApprovalRuleTemplateName) {
        setOldApprovalRuleTemplateName(oldApprovalRuleTemplateName);
        return this;
    }

    /**
     * <p>
     * The new name you want to apply to the approval rule template.
     * </p>
     * 
     * @param newApprovalRuleTemplateName
     *        The new name you want to apply to the approval rule template.
     */

    public void setNewApprovalRuleTemplateName(String newApprovalRuleTemplateName) {
        this.newApprovalRuleTemplateName = newApprovalRuleTemplateName;
    }

    /**
     * <p>
     * The new name you want to apply to the approval rule template.
     * </p>
     * 
     * @return The new name you want to apply to the approval rule template.
     */

    public String getNewApprovalRuleTemplateName() {
        return this.newApprovalRuleTemplateName;
    }

    /**
     * <p>
     * The new name you want to apply to the approval rule template.
     * </p>
     * 
     * @param newApprovalRuleTemplateName
     *        The new name you want to apply to the approval rule template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApprovalRuleTemplateNameRequest withNewApprovalRuleTemplateName(String newApprovalRuleTemplateName) {
        setNewApprovalRuleTemplateName(newApprovalRuleTemplateName);
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
        if (getOldApprovalRuleTemplateName() != null)
            sb.append("OldApprovalRuleTemplateName: ").append(getOldApprovalRuleTemplateName()).append(",");
        if (getNewApprovalRuleTemplateName() != null)
            sb.append("NewApprovalRuleTemplateName: ").append(getNewApprovalRuleTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApprovalRuleTemplateNameRequest == false)
            return false;
        UpdateApprovalRuleTemplateNameRequest other = (UpdateApprovalRuleTemplateNameRequest) obj;
        if (other.getOldApprovalRuleTemplateName() == null ^ this.getOldApprovalRuleTemplateName() == null)
            return false;
        if (other.getOldApprovalRuleTemplateName() != null && other.getOldApprovalRuleTemplateName().equals(this.getOldApprovalRuleTemplateName()) == false)
            return false;
        if (other.getNewApprovalRuleTemplateName() == null ^ this.getNewApprovalRuleTemplateName() == null)
            return false;
        if (other.getNewApprovalRuleTemplateName() != null && other.getNewApprovalRuleTemplateName().equals(this.getNewApprovalRuleTemplateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOldApprovalRuleTemplateName() == null) ? 0 : getOldApprovalRuleTemplateName().hashCode());
        hashCode = prime * hashCode + ((getNewApprovalRuleTemplateName() == null) ? 0 : getNewApprovalRuleTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApprovalRuleTemplateNameRequest clone() {
        return (UpdateApprovalRuleTemplateNameRequest) super.clone();
    }

}

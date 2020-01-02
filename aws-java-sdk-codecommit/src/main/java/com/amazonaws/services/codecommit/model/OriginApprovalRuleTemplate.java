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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about the template that created the approval rule for a pull request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/OriginApprovalRuleTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginApprovalRuleTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the template that created the approval rule.
     * </p>
     */
    private String approvalRuleTemplateId;
    /**
     * <p>
     * The name of the template that created the approval rule.
     * </p>
     */
    private String approvalRuleTemplateName;

    /**
     * <p>
     * The ID of the template that created the approval rule.
     * </p>
     * 
     * @param approvalRuleTemplateId
     *        The ID of the template that created the approval rule.
     */

    public void setApprovalRuleTemplateId(String approvalRuleTemplateId) {
        this.approvalRuleTemplateId = approvalRuleTemplateId;
    }

    /**
     * <p>
     * The ID of the template that created the approval rule.
     * </p>
     * 
     * @return The ID of the template that created the approval rule.
     */

    public String getApprovalRuleTemplateId() {
        return this.approvalRuleTemplateId;
    }

    /**
     * <p>
     * The ID of the template that created the approval rule.
     * </p>
     * 
     * @param approvalRuleTemplateId
     *        The ID of the template that created the approval rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginApprovalRuleTemplate withApprovalRuleTemplateId(String approvalRuleTemplateId) {
        setApprovalRuleTemplateId(approvalRuleTemplateId);
        return this;
    }

    /**
     * <p>
     * The name of the template that created the approval rule.
     * </p>
     * 
     * @param approvalRuleTemplateName
     *        The name of the template that created the approval rule.
     */

    public void setApprovalRuleTemplateName(String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the template that created the approval rule.
     * </p>
     * 
     * @return The name of the template that created the approval rule.
     */

    public String getApprovalRuleTemplateName() {
        return this.approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the template that created the approval rule.
     * </p>
     * 
     * @param approvalRuleTemplateName
     *        The name of the template that created the approval rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginApprovalRuleTemplate withApprovalRuleTemplateName(String approvalRuleTemplateName) {
        setApprovalRuleTemplateName(approvalRuleTemplateName);
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
        if (getApprovalRuleTemplateId() != null)
            sb.append("ApprovalRuleTemplateId: ").append(getApprovalRuleTemplateId()).append(",");
        if (getApprovalRuleTemplateName() != null)
            sb.append("ApprovalRuleTemplateName: ").append(getApprovalRuleTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginApprovalRuleTemplate == false)
            return false;
        OriginApprovalRuleTemplate other = (OriginApprovalRuleTemplate) obj;
        if (other.getApprovalRuleTemplateId() == null ^ this.getApprovalRuleTemplateId() == null)
            return false;
        if (other.getApprovalRuleTemplateId() != null && other.getApprovalRuleTemplateId().equals(this.getApprovalRuleTemplateId()) == false)
            return false;
        if (other.getApprovalRuleTemplateName() == null ^ this.getApprovalRuleTemplateName() == null)
            return false;
        if (other.getApprovalRuleTemplateName() != null && other.getApprovalRuleTemplateName().equals(this.getApprovalRuleTemplateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApprovalRuleTemplateId() == null) ? 0 : getApprovalRuleTemplateId().hashCode());
        hashCode = prime * hashCode + ((getApprovalRuleTemplateName() == null) ? 0 : getApprovalRuleTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public OriginApprovalRuleTemplate clone() {
        try {
            return (OriginApprovalRuleTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.OriginApprovalRuleTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * Returns information about an event for an approval rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ApprovalRuleEventMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApprovalRuleEventMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the approval rule.
     * </p>
     */
    private String approvalRuleName;
    /**
     * <p>
     * The system-generated ID of the approval rule.
     * </p>
     */
    private String approvalRuleId;
    /**
     * <p>
     * The content of the approval rule.
     * </p>
     */
    private String approvalRuleContent;

    /**
     * <p>
     * The name of the approval rule.
     * </p>
     * 
     * @param approvalRuleName
     *        The name of the approval rule.
     */

    public void setApprovalRuleName(String approvalRuleName) {
        this.approvalRuleName = approvalRuleName;
    }

    /**
     * <p>
     * The name of the approval rule.
     * </p>
     * 
     * @return The name of the approval rule.
     */

    public String getApprovalRuleName() {
        return this.approvalRuleName;
    }

    /**
     * <p>
     * The name of the approval rule.
     * </p>
     * 
     * @param approvalRuleName
     *        The name of the approval rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRuleEventMetadata withApprovalRuleName(String approvalRuleName) {
        setApprovalRuleName(approvalRuleName);
        return this;
    }

    /**
     * <p>
     * The system-generated ID of the approval rule.
     * </p>
     * 
     * @param approvalRuleId
     *        The system-generated ID of the approval rule.
     */

    public void setApprovalRuleId(String approvalRuleId) {
        this.approvalRuleId = approvalRuleId;
    }

    /**
     * <p>
     * The system-generated ID of the approval rule.
     * </p>
     * 
     * @return The system-generated ID of the approval rule.
     */

    public String getApprovalRuleId() {
        return this.approvalRuleId;
    }

    /**
     * <p>
     * The system-generated ID of the approval rule.
     * </p>
     * 
     * @param approvalRuleId
     *        The system-generated ID of the approval rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRuleEventMetadata withApprovalRuleId(String approvalRuleId) {
        setApprovalRuleId(approvalRuleId);
        return this;
    }

    /**
     * <p>
     * The content of the approval rule.
     * </p>
     * 
     * @param approvalRuleContent
     *        The content of the approval rule.
     */

    public void setApprovalRuleContent(String approvalRuleContent) {
        this.approvalRuleContent = approvalRuleContent;
    }

    /**
     * <p>
     * The content of the approval rule.
     * </p>
     * 
     * @return The content of the approval rule.
     */

    public String getApprovalRuleContent() {
        return this.approvalRuleContent;
    }

    /**
     * <p>
     * The content of the approval rule.
     * </p>
     * 
     * @param approvalRuleContent
     *        The content of the approval rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRuleEventMetadata withApprovalRuleContent(String approvalRuleContent) {
        setApprovalRuleContent(approvalRuleContent);
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
        if (getApprovalRuleName() != null)
            sb.append("ApprovalRuleName: ").append(getApprovalRuleName()).append(",");
        if (getApprovalRuleId() != null)
            sb.append("ApprovalRuleId: ").append(getApprovalRuleId()).append(",");
        if (getApprovalRuleContent() != null)
            sb.append("ApprovalRuleContent: ").append(getApprovalRuleContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApprovalRuleEventMetadata == false)
            return false;
        ApprovalRuleEventMetadata other = (ApprovalRuleEventMetadata) obj;
        if (other.getApprovalRuleName() == null ^ this.getApprovalRuleName() == null)
            return false;
        if (other.getApprovalRuleName() != null && other.getApprovalRuleName().equals(this.getApprovalRuleName()) == false)
            return false;
        if (other.getApprovalRuleId() == null ^ this.getApprovalRuleId() == null)
            return false;
        if (other.getApprovalRuleId() != null && other.getApprovalRuleId().equals(this.getApprovalRuleId()) == false)
            return false;
        if (other.getApprovalRuleContent() == null ^ this.getApprovalRuleContent() == null)
            return false;
        if (other.getApprovalRuleContent() != null && other.getApprovalRuleContent().equals(this.getApprovalRuleContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApprovalRuleName() == null) ? 0 : getApprovalRuleName().hashCode());
        hashCode = prime * hashCode + ((getApprovalRuleId() == null) ? 0 : getApprovalRuleId().hashCode());
        hashCode = prime * hashCode + ((getApprovalRuleContent() == null) ? 0 : getApprovalRuleContent().hashCode());
        return hashCode;
    }

    @Override
    public ApprovalRuleEventMetadata clone() {
        try {
            return (ApprovalRuleEventMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.ApprovalRuleEventMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

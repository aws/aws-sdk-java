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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteApprovalRuleTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteApprovalRuleTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated ID of the deleted approval rule template. If the template has been previously deleted, the
     * only response is a 200 OK.
     * </p>
     */
    private String approvalRuleTemplateId;

    /**
     * <p>
     * The system-generated ID of the deleted approval rule template. If the template has been previously deleted, the
     * only response is a 200 OK.
     * </p>
     * 
     * @param approvalRuleTemplateId
     *        The system-generated ID of the deleted approval rule template. If the template has been previously
     *        deleted, the only response is a 200 OK.
     */

    public void setApprovalRuleTemplateId(String approvalRuleTemplateId) {
        this.approvalRuleTemplateId = approvalRuleTemplateId;
    }

    /**
     * <p>
     * The system-generated ID of the deleted approval rule template. If the template has been previously deleted, the
     * only response is a 200 OK.
     * </p>
     * 
     * @return The system-generated ID of the deleted approval rule template. If the template has been previously
     *         deleted, the only response is a 200 OK.
     */

    public String getApprovalRuleTemplateId() {
        return this.approvalRuleTemplateId;
    }

    /**
     * <p>
     * The system-generated ID of the deleted approval rule template. If the template has been previously deleted, the
     * only response is a 200 OK.
     * </p>
     * 
     * @param approvalRuleTemplateId
     *        The system-generated ID of the deleted approval rule template. If the template has been previously
     *        deleted, the only response is a 200 OK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApprovalRuleTemplateResult withApprovalRuleTemplateId(String approvalRuleTemplateId) {
        setApprovalRuleTemplateId(approvalRuleTemplateId);
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
            sb.append("ApprovalRuleTemplateId: ").append(getApprovalRuleTemplateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApprovalRuleTemplateResult == false)
            return false;
        DeleteApprovalRuleTemplateResult other = (DeleteApprovalRuleTemplateResult) obj;
        if (other.getApprovalRuleTemplateId() == null ^ this.getApprovalRuleTemplateId() == null)
            return false;
        if (other.getApprovalRuleTemplateId() != null && other.getApprovalRuleTemplateId().equals(this.getApprovalRuleTemplateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApprovalRuleTemplateId() == null) ? 0 : getApprovalRuleTemplateId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteApprovalRuleTemplateResult clone() {
        try {
            return (DeleteApprovalRuleTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

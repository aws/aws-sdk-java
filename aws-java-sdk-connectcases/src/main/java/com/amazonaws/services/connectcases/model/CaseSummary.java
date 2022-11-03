/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Case summary information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CaseSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaseSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier of the case.
     * </p>
     */
    private String caseId;
    /**
     * <p>
     * A unique identifier of a template.
     * </p>
     */
    private String templateId;

    /**
     * <p>
     * A unique identifier of the case.
     * </p>
     * 
     * @param caseId
     *        A unique identifier of the case.
     */

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    /**
     * <p>
     * A unique identifier of the case.
     * </p>
     * 
     * @return A unique identifier of the case.
     */

    public String getCaseId() {
        return this.caseId;
    }

    /**
     * <p>
     * A unique identifier of the case.
     * </p>
     * 
     * @param caseId
     *        A unique identifier of the case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseSummary withCaseId(String caseId) {
        setCaseId(caseId);
        return this;
    }

    /**
     * <p>
     * A unique identifier of a template.
     * </p>
     * 
     * @param templateId
     *        A unique identifier of a template.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * A unique identifier of a template.
     * </p>
     * 
     * @return A unique identifier of a template.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * A unique identifier of a template.
     * </p>
     * 
     * @param templateId
     *        A unique identifier of a template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseSummary withTemplateId(String templateId) {
        setTemplateId(templateId);
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
        if (getCaseId() != null)
            sb.append("CaseId: ").append(getCaseId()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaseSummary == false)
            return false;
        CaseSummary other = (CaseSummary) obj;
        if (other.getCaseId() == null ^ this.getCaseId() == null)
            return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        return hashCode;
    }

    @Override
    public CaseSummary clone() {
        try {
            return (CaseSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.CaseSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

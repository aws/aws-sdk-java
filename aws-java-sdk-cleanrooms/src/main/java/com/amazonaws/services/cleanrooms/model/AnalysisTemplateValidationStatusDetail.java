/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status details of the analysis template validation. Clean Rooms Differential Privacy uses a general-purpose query
 * structure to support complex SQL queries and validates whether an analysis template fits that general-purpose query
 * structure. Validation is performed when analysis templates are created and fetched. Because analysis templates are
 * immutable by design, we recommend that you create analysis templates after you associate the configured tables with
 * their analysis rule to your collaboration.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/clean-rooms/latest/userguide/analysis-rules-custom.html#custom-diff-privacy"
 * >https://docs.aws.amazon.com/clean-rooms/latest/userguide/analysis-rules-custom.html#custom-diff-privacy</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/AnalysisTemplateValidationStatusDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisTemplateValidationStatusDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of validation that was performed.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The status of the validation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reasons for the validation results.
     * </p>
     */
    private java.util.List<AnalysisTemplateValidationStatusReason> reasons;

    /**
     * <p>
     * The type of validation that was performed.
     * </p>
     * 
     * @param type
     *        The type of validation that was performed.
     * @see AnalysisTemplateValidationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of validation that was performed.
     * </p>
     * 
     * @return The type of validation that was performed.
     * @see AnalysisTemplateValidationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of validation that was performed.
     * </p>
     * 
     * @param type
     *        The type of validation that was performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisTemplateValidationType
     */

    public AnalysisTemplateValidationStatusDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of validation that was performed.
     * </p>
     * 
     * @param type
     *        The type of validation that was performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisTemplateValidationType
     */

    public AnalysisTemplateValidationStatusDetail withType(AnalysisTemplateValidationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The status of the validation.
     * </p>
     * 
     * @param status
     *        The status of the validation.
     * @see AnalysisTemplateValidationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the validation.
     * </p>
     * 
     * @return The status of the validation.
     * @see AnalysisTemplateValidationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the validation.
     * </p>
     * 
     * @param status
     *        The status of the validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisTemplateValidationStatus
     */

    public AnalysisTemplateValidationStatusDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the validation.
     * </p>
     * 
     * @param status
     *        The status of the validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisTemplateValidationStatus
     */

    public AnalysisTemplateValidationStatusDetail withStatus(AnalysisTemplateValidationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reasons for the validation results.
     * </p>
     * 
     * @return The reasons for the validation results.
     */

    public java.util.List<AnalysisTemplateValidationStatusReason> getReasons() {
        return reasons;
    }

    /**
     * <p>
     * The reasons for the validation results.
     * </p>
     * 
     * @param reasons
     *        The reasons for the validation results.
     */

    public void setReasons(java.util.Collection<AnalysisTemplateValidationStatusReason> reasons) {
        if (reasons == null) {
            this.reasons = null;
            return;
        }

        this.reasons = new java.util.ArrayList<AnalysisTemplateValidationStatusReason>(reasons);
    }

    /**
     * <p>
     * The reasons for the validation results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReasons(java.util.Collection)} or {@link #withReasons(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param reasons
     *        The reasons for the validation results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisTemplateValidationStatusDetail withReasons(AnalysisTemplateValidationStatusReason... reasons) {
        if (this.reasons == null) {
            setReasons(new java.util.ArrayList<AnalysisTemplateValidationStatusReason>(reasons.length));
        }
        for (AnalysisTemplateValidationStatusReason ele : reasons) {
            this.reasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reasons for the validation results.
     * </p>
     * 
     * @param reasons
     *        The reasons for the validation results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisTemplateValidationStatusDetail withReasons(java.util.Collection<AnalysisTemplateValidationStatusReason> reasons) {
        setReasons(reasons);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getReasons() != null)
            sb.append("Reasons: ").append(getReasons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisTemplateValidationStatusDetail == false)
            return false;
        AnalysisTemplateValidationStatusDetail other = (AnalysisTemplateValidationStatusDetail) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getReasons() == null ^ this.getReasons() == null)
            return false;
        if (other.getReasons() != null && other.getReasons().equals(this.getReasons()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReasons() == null) ? 0 : getReasons().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisTemplateValidationStatusDetail clone() {
        try {
            return (AnalysisTemplateValidationStatusDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.AnalysisTemplateValidationStatusDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

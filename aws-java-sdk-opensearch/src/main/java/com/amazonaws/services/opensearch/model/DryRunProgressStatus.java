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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the progress of a pre-upgrade dry run analysis.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DryRunProgressStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the dry run.
     * </p>
     */
    private String dryRunId;
    /**
     * <p>
     * The current status of the dry run.
     * </p>
     */
    private String dryRunStatus;
    /**
     * <p>
     * The timestamp when the dry run was initiated.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The timestamp when the dry run was last updated.
     * </p>
     */
    private String updateDate;
    /**
     * <p>
     * Any validation failures that occurred as a result of the dry run.
     * </p>
     */
    private java.util.List<ValidationFailure> validationFailures;

    /**
     * <p>
     * The unique identifier of the dry run.
     * </p>
     * 
     * @param dryRunId
     *        The unique identifier of the dry run.
     */

    public void setDryRunId(String dryRunId) {
        this.dryRunId = dryRunId;
    }

    /**
     * <p>
     * The unique identifier of the dry run.
     * </p>
     * 
     * @return The unique identifier of the dry run.
     */

    public String getDryRunId() {
        return this.dryRunId;
    }

    /**
     * <p>
     * The unique identifier of the dry run.
     * </p>
     * 
     * @param dryRunId
     *        The unique identifier of the dry run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DryRunProgressStatus withDryRunId(String dryRunId) {
        setDryRunId(dryRunId);
        return this;
    }

    /**
     * <p>
     * The current status of the dry run.
     * </p>
     * 
     * @param dryRunStatus
     *        The current status of the dry run.
     */

    public void setDryRunStatus(String dryRunStatus) {
        this.dryRunStatus = dryRunStatus;
    }

    /**
     * <p>
     * The current status of the dry run.
     * </p>
     * 
     * @return The current status of the dry run.
     */

    public String getDryRunStatus() {
        return this.dryRunStatus;
    }

    /**
     * <p>
     * The current status of the dry run.
     * </p>
     * 
     * @param dryRunStatus
     *        The current status of the dry run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DryRunProgressStatus withDryRunStatus(String dryRunStatus) {
        setDryRunStatus(dryRunStatus);
        return this;
    }

    /**
     * <p>
     * The timestamp when the dry run was initiated.
     * </p>
     * 
     * @param creationDate
     *        The timestamp when the dry run was initiated.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The timestamp when the dry run was initiated.
     * </p>
     * 
     * @return The timestamp when the dry run was initiated.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The timestamp when the dry run was initiated.
     * </p>
     * 
     * @param creationDate
     *        The timestamp when the dry run was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DryRunProgressStatus withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The timestamp when the dry run was last updated.
     * </p>
     * 
     * @param updateDate
     *        The timestamp when the dry run was last updated.
     */

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * <p>
     * The timestamp when the dry run was last updated.
     * </p>
     * 
     * @return The timestamp when the dry run was last updated.
     */

    public String getUpdateDate() {
        return this.updateDate;
    }

    /**
     * <p>
     * The timestamp when the dry run was last updated.
     * </p>
     * 
     * @param updateDate
     *        The timestamp when the dry run was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DryRunProgressStatus withUpdateDate(String updateDate) {
        setUpdateDate(updateDate);
        return this;
    }

    /**
     * <p>
     * Any validation failures that occurred as a result of the dry run.
     * </p>
     * 
     * @return Any validation failures that occurred as a result of the dry run.
     */

    public java.util.List<ValidationFailure> getValidationFailures() {
        return validationFailures;
    }

    /**
     * <p>
     * Any validation failures that occurred as a result of the dry run.
     * </p>
     * 
     * @param validationFailures
     *        Any validation failures that occurred as a result of the dry run.
     */

    public void setValidationFailures(java.util.Collection<ValidationFailure> validationFailures) {
        if (validationFailures == null) {
            this.validationFailures = null;
            return;
        }

        this.validationFailures = new java.util.ArrayList<ValidationFailure>(validationFailures);
    }

    /**
     * <p>
     * Any validation failures that occurred as a result of the dry run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationFailures(java.util.Collection)} or {@link #withValidationFailures(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param validationFailures
     *        Any validation failures that occurred as a result of the dry run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DryRunProgressStatus withValidationFailures(ValidationFailure... validationFailures) {
        if (this.validationFailures == null) {
            setValidationFailures(new java.util.ArrayList<ValidationFailure>(validationFailures.length));
        }
        for (ValidationFailure ele : validationFailures) {
            this.validationFailures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any validation failures that occurred as a result of the dry run.
     * </p>
     * 
     * @param validationFailures
     *        Any validation failures that occurred as a result of the dry run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DryRunProgressStatus withValidationFailures(java.util.Collection<ValidationFailure> validationFailures) {
        setValidationFailures(validationFailures);
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
        if (getDryRunId() != null)
            sb.append("DryRunId: ").append(getDryRunId()).append(",");
        if (getDryRunStatus() != null)
            sb.append("DryRunStatus: ").append(getDryRunStatus()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getUpdateDate() != null)
            sb.append("UpdateDate: ").append(getUpdateDate()).append(",");
        if (getValidationFailures() != null)
            sb.append("ValidationFailures: ").append(getValidationFailures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DryRunProgressStatus == false)
            return false;
        DryRunProgressStatus other = (DryRunProgressStatus) obj;
        if (other.getDryRunId() == null ^ this.getDryRunId() == null)
            return false;
        if (other.getDryRunId() != null && other.getDryRunId().equals(this.getDryRunId()) == false)
            return false;
        if (other.getDryRunStatus() == null ^ this.getDryRunStatus() == null)
            return false;
        if (other.getDryRunStatus() != null && other.getDryRunStatus().equals(this.getDryRunStatus()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null)
            return false;
        if (other.getUpdateDate() != null && other.getUpdateDate().equals(this.getUpdateDate()) == false)
            return false;
        if (other.getValidationFailures() == null ^ this.getValidationFailures() == null)
            return false;
        if (other.getValidationFailures() != null && other.getValidationFailures().equals(this.getValidationFailures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRunId() == null) ? 0 : getDryRunId().hashCode());
        hashCode = prime * hashCode + ((getDryRunStatus() == null) ? 0 : getDryRunStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getValidationFailures() == null) ? 0 : getValidationFailures().hashCode());
        return hashCode;
    }

    @Override
    public DryRunProgressStatus clone() {
        try {
            return (DryRunProgressStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.DryRunProgressStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

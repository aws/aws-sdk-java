/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of choices to be updated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ChoiceUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChoiceUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of a choice.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason why a choice is non-applicable to a question in your workload.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The notes associated with a choice.
     * </p>
     */
    private String notes;

    /**
     * <p>
     * The status of a choice.
     * </p>
     * 
     * @param status
     *        The status of a choice.
     * @see ChoiceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a choice.
     * </p>
     * 
     * @return The status of a choice.
     * @see ChoiceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a choice.
     * </p>
     * 
     * @param status
     *        The status of a choice.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChoiceStatus
     */

    public ChoiceUpdate withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a choice.
     * </p>
     * 
     * @param status
     *        The status of a choice.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChoiceStatus
     */

    public ChoiceUpdate withStatus(ChoiceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason why a choice is non-applicable to a question in your workload.
     * </p>
     * 
     * @param reason
     *        The reason why a choice is non-applicable to a question in your workload.
     * @see ChoiceReason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason why a choice is non-applicable to a question in your workload.
     * </p>
     * 
     * @return The reason why a choice is non-applicable to a question in your workload.
     * @see ChoiceReason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason why a choice is non-applicable to a question in your workload.
     * </p>
     * 
     * @param reason
     *        The reason why a choice is non-applicable to a question in your workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChoiceReason
     */

    public ChoiceUpdate withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason why a choice is non-applicable to a question in your workload.
     * </p>
     * 
     * @param reason
     *        The reason why a choice is non-applicable to a question in your workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChoiceReason
     */

    public ChoiceUpdate withReason(ChoiceReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * The notes associated with a choice.
     * </p>
     * 
     * @param notes
     *        The notes associated with a choice.
     */

    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * <p>
     * The notes associated with a choice.
     * </p>
     * 
     * @return The notes associated with a choice.
     */

    public String getNotes() {
        return this.notes;
    }

    /**
     * <p>
     * The notes associated with a choice.
     * </p>
     * 
     * @param notes
     *        The notes associated with a choice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChoiceUpdate withNotes(String notes) {
        setNotes(notes);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChoiceUpdate == false)
            return false;
        ChoiceUpdate other = (ChoiceUpdate) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        return hashCode;
    }

    @Override
    public ChoiceUpdate clone() {
        try {
            return (ChoiceUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.ChoiceUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

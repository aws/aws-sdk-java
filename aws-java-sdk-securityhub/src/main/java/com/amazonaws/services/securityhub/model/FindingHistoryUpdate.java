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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An array of objects that provides details about a change to a finding, including the Amazon Web Services Security
 * Finding Format (ASFF) field that changed, the value of the field before the change, and the value of the field after
 * the change.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/FindingHistoryUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingHistoryUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ASFF field that changed during the finding change event.
     * </p>
     */
    private String updatedField;
    /**
     * <p>
     * The value of the ASFF field before the finding change event.
     * </p>
     */
    private String oldValue;
    /**
     * <p>
     * The value of the ASFF field after the finding change event. To preserve storage and readability, Security Hub
     * omits this value if <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_FindingHistoryRecord.html">
     * <code>FindingHistoryRecord</code> </a> exceeds database limits.
     * </p>
     */
    private String newValue;

    /**
     * <p>
     * The ASFF field that changed during the finding change event.
     * </p>
     * 
     * @param updatedField
     *        The ASFF field that changed during the finding change event.
     */

    public void setUpdatedField(String updatedField) {
        this.updatedField = updatedField;
    }

    /**
     * <p>
     * The ASFF field that changed during the finding change event.
     * </p>
     * 
     * @return The ASFF field that changed during the finding change event.
     */

    public String getUpdatedField() {
        return this.updatedField;
    }

    /**
     * <p>
     * The ASFF field that changed during the finding change event.
     * </p>
     * 
     * @param updatedField
     *        The ASFF field that changed during the finding change event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingHistoryUpdate withUpdatedField(String updatedField) {
        setUpdatedField(updatedField);
        return this;
    }

    /**
     * <p>
     * The value of the ASFF field before the finding change event.
     * </p>
     * 
     * @param oldValue
     *        The value of the ASFF field before the finding change event.
     */

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    /**
     * <p>
     * The value of the ASFF field before the finding change event.
     * </p>
     * 
     * @return The value of the ASFF field before the finding change event.
     */

    public String getOldValue() {
        return this.oldValue;
    }

    /**
     * <p>
     * The value of the ASFF field before the finding change event.
     * </p>
     * 
     * @param oldValue
     *        The value of the ASFF field before the finding change event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingHistoryUpdate withOldValue(String oldValue) {
        setOldValue(oldValue);
        return this;
    }

    /**
     * <p>
     * The value of the ASFF field after the finding change event. To preserve storage and readability, Security Hub
     * omits this value if <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_FindingHistoryRecord.html">
     * <code>FindingHistoryRecord</code> </a> exceeds database limits.
     * </p>
     * 
     * @param newValue
     *        The value of the ASFF field after the finding change event. To preserve storage and readability, Security
     *        Hub omits this value if <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_FindingHistoryRecord.html">
     *        <code>FindingHistoryRecord</code> </a> exceeds database limits.
     */

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    /**
     * <p>
     * The value of the ASFF field after the finding change event. To preserve storage and readability, Security Hub
     * omits this value if <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_FindingHistoryRecord.html">
     * <code>FindingHistoryRecord</code> </a> exceeds database limits.
     * </p>
     * 
     * @return The value of the ASFF field after the finding change event. To preserve storage and readability, Security
     *         Hub omits this value if <a
     *         href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_FindingHistoryRecord.html">
     *         <code>FindingHistoryRecord</code> </a> exceeds database limits.
     */

    public String getNewValue() {
        return this.newValue;
    }

    /**
     * <p>
     * The value of the ASFF field after the finding change event. To preserve storage and readability, Security Hub
     * omits this value if <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_FindingHistoryRecord.html">
     * <code>FindingHistoryRecord</code> </a> exceeds database limits.
     * </p>
     * 
     * @param newValue
     *        The value of the ASFF field after the finding change event. To preserve storage and readability, Security
     *        Hub omits this value if <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_FindingHistoryRecord.html">
     *        <code>FindingHistoryRecord</code> </a> exceeds database limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingHistoryUpdate withNewValue(String newValue) {
        setNewValue(newValue);
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
        if (getUpdatedField() != null)
            sb.append("UpdatedField: ").append(getUpdatedField()).append(",");
        if (getOldValue() != null)
            sb.append("OldValue: ").append(getOldValue()).append(",");
        if (getNewValue() != null)
            sb.append("NewValue: ").append(getNewValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingHistoryUpdate == false)
            return false;
        FindingHistoryUpdate other = (FindingHistoryUpdate) obj;
        if (other.getUpdatedField() == null ^ this.getUpdatedField() == null)
            return false;
        if (other.getUpdatedField() != null && other.getUpdatedField().equals(this.getUpdatedField()) == false)
            return false;
        if (other.getOldValue() == null ^ this.getOldValue() == null)
            return false;
        if (other.getOldValue() != null && other.getOldValue().equals(this.getOldValue()) == false)
            return false;
        if (other.getNewValue() == null ^ this.getNewValue() == null)
            return false;
        if (other.getNewValue() != null && other.getNewValue().equals(this.getNewValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdatedField() == null) ? 0 : getUpdatedField().hashCode());
        hashCode = prime * hashCode + ((getOldValue() == null) ? 0 : getOldValue().hashCode());
        hashCode = prime * hashCode + ((getNewValue() == null) ? 0 : getNewValue().hashCode());
        return hashCode;
    }

    @Override
    public FindingHistoryUpdate clone() {
        try {
            return (FindingHistoryUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.FindingHistoryUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

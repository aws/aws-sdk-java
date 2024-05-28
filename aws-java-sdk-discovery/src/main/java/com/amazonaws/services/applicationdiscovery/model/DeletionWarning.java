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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A configuration ID paired with a warning message.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletionWarning implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the configuration that produced a warning.
     * </p>
     */
    private String configurationId;
    /**
     * <p>
     * The integer warning code associated with the warning message.
     * </p>
     */
    private Integer warningCode;
    /**
     * <p>
     * A descriptive message of the warning the associated configuration ID produced.
     * </p>
     */
    private String warningText;

    /**
     * <p>
     * The unique identifier of the configuration that produced a warning.
     * </p>
     * 
     * @param configurationId
     *        The unique identifier of the configuration that produced a warning.
     */

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    /**
     * <p>
     * The unique identifier of the configuration that produced a warning.
     * </p>
     * 
     * @return The unique identifier of the configuration that produced a warning.
     */

    public String getConfigurationId() {
        return this.configurationId;
    }

    /**
     * <p>
     * The unique identifier of the configuration that produced a warning.
     * </p>
     * 
     * @param configurationId
     *        The unique identifier of the configuration that produced a warning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletionWarning withConfigurationId(String configurationId) {
        setConfigurationId(configurationId);
        return this;
    }

    /**
     * <p>
     * The integer warning code associated with the warning message.
     * </p>
     * 
     * @param warningCode
     *        The integer warning code associated with the warning message.
     */

    public void setWarningCode(Integer warningCode) {
        this.warningCode = warningCode;
    }

    /**
     * <p>
     * The integer warning code associated with the warning message.
     * </p>
     * 
     * @return The integer warning code associated with the warning message.
     */

    public Integer getWarningCode() {
        return this.warningCode;
    }

    /**
     * <p>
     * The integer warning code associated with the warning message.
     * </p>
     * 
     * @param warningCode
     *        The integer warning code associated with the warning message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletionWarning withWarningCode(Integer warningCode) {
        setWarningCode(warningCode);
        return this;
    }

    /**
     * <p>
     * A descriptive message of the warning the associated configuration ID produced.
     * </p>
     * 
     * @param warningText
     *        A descriptive message of the warning the associated configuration ID produced.
     */

    public void setWarningText(String warningText) {
        this.warningText = warningText;
    }

    /**
     * <p>
     * A descriptive message of the warning the associated configuration ID produced.
     * </p>
     * 
     * @return A descriptive message of the warning the associated configuration ID produced.
     */

    public String getWarningText() {
        return this.warningText;
    }

    /**
     * <p>
     * A descriptive message of the warning the associated configuration ID produced.
     * </p>
     * 
     * @param warningText
     *        A descriptive message of the warning the associated configuration ID produced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletionWarning withWarningText(String warningText) {
        setWarningText(warningText);
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
        if (getConfigurationId() != null)
            sb.append("ConfigurationId: ").append(getConfigurationId()).append(",");
        if (getWarningCode() != null)
            sb.append("WarningCode: ").append(getWarningCode()).append(",");
        if (getWarningText() != null)
            sb.append("WarningText: ").append(getWarningText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletionWarning == false)
            return false;
        DeletionWarning other = (DeletionWarning) obj;
        if (other.getConfigurationId() == null ^ this.getConfigurationId() == null)
            return false;
        if (other.getConfigurationId() != null && other.getConfigurationId().equals(this.getConfigurationId()) == false)
            return false;
        if (other.getWarningCode() == null ^ this.getWarningCode() == null)
            return false;
        if (other.getWarningCode() != null && other.getWarningCode().equals(this.getWarningCode()) == false)
            return false;
        if (other.getWarningText() == null ^ this.getWarningText() == null)
            return false;
        if (other.getWarningText() != null && other.getWarningText().equals(this.getWarningText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationId() == null) ? 0 : getConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getWarningCode() == null) ? 0 : getWarningCode().hashCode());
        hashCode = prime * hashCode + ((getWarningText() == null) ? 0 : getWarningText().hashCode());
        return hashCode;
    }

    @Override
    public DeletionWarning clone() {
        try {
            return (DeletionWarning) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.DeletionWarningMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

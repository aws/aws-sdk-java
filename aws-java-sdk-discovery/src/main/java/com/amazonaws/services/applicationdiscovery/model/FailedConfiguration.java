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
 * A configuration ID paired with an error message.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the configuration the failed to delete.
     * </p>
     */
    private String configurationId;
    /**
     * <p>
     * The integer error code associated with the error message.
     * </p>
     */
    private Integer errorStatusCode;
    /**
     * <p>
     * A descriptive message indicating why the associated configuration failed to delete.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The unique identifier of the configuration the failed to delete.
     * </p>
     * 
     * @param configurationId
     *        The unique identifier of the configuration the failed to delete.
     */

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    /**
     * <p>
     * The unique identifier of the configuration the failed to delete.
     * </p>
     * 
     * @return The unique identifier of the configuration the failed to delete.
     */

    public String getConfigurationId() {
        return this.configurationId;
    }

    /**
     * <p>
     * The unique identifier of the configuration the failed to delete.
     * </p>
     * 
     * @param configurationId
     *        The unique identifier of the configuration the failed to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedConfiguration withConfigurationId(String configurationId) {
        setConfigurationId(configurationId);
        return this;
    }

    /**
     * <p>
     * The integer error code associated with the error message.
     * </p>
     * 
     * @param errorStatusCode
     *        The integer error code associated with the error message.
     */

    public void setErrorStatusCode(Integer errorStatusCode) {
        this.errorStatusCode = errorStatusCode;
    }

    /**
     * <p>
     * The integer error code associated with the error message.
     * </p>
     * 
     * @return The integer error code associated with the error message.
     */

    public Integer getErrorStatusCode() {
        return this.errorStatusCode;
    }

    /**
     * <p>
     * The integer error code associated with the error message.
     * </p>
     * 
     * @param errorStatusCode
     *        The integer error code associated with the error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedConfiguration withErrorStatusCode(Integer errorStatusCode) {
        setErrorStatusCode(errorStatusCode);
        return this;
    }

    /**
     * <p>
     * A descriptive message indicating why the associated configuration failed to delete.
     * </p>
     * 
     * @param errorMessage
     *        A descriptive message indicating why the associated configuration failed to delete.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * A descriptive message indicating why the associated configuration failed to delete.
     * </p>
     * 
     * @return A descriptive message indicating why the associated configuration failed to delete.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * A descriptive message indicating why the associated configuration failed to delete.
     * </p>
     * 
     * @param errorMessage
     *        A descriptive message indicating why the associated configuration failed to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedConfiguration withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getErrorStatusCode() != null)
            sb.append("ErrorStatusCode: ").append(getErrorStatusCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedConfiguration == false)
            return false;
        FailedConfiguration other = (FailedConfiguration) obj;
        if (other.getConfigurationId() == null ^ this.getConfigurationId() == null)
            return false;
        if (other.getConfigurationId() != null && other.getConfigurationId().equals(this.getConfigurationId()) == false)
            return false;
        if (other.getErrorStatusCode() == null ^ this.getErrorStatusCode() == null)
            return false;
        if (other.getErrorStatusCode() != null && other.getErrorStatusCode().equals(this.getErrorStatusCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationId() == null) ? 0 : getConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getErrorStatusCode() == null) ? 0 : getErrorStatusCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public FailedConfiguration clone() {
        try {
            return (FailedConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.FailedConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

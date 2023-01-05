/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List of all failures.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/Failures" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Failures implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of all exception messages.
     * </p>
     */
    private String exceptionMessage;
    /**
     * <p>
     * List of all remediation steps for failures.
     * </p>
     */
    private String remediation;
    /**
     * <p>
     * This error can occur if you configure the wrong timestamp format, or if the subset of entries used for validation
     * had errors or missing values.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * List of all exception messages.
     * </p>
     * 
     * @param exceptionMessage
     *        List of all exception messages.
     */

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    /**
     * <p>
     * List of all exception messages.
     * </p>
     * 
     * @return List of all exception messages.
     */

    public String getExceptionMessage() {
        return this.exceptionMessage;
    }

    /**
     * <p>
     * List of all exception messages.
     * </p>
     * 
     * @param exceptionMessage
     *        List of all exception messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Failures withExceptionMessage(String exceptionMessage) {
        setExceptionMessage(exceptionMessage);
        return this;
    }

    /**
     * <p>
     * List of all remediation steps for failures.
     * </p>
     * 
     * @param remediation
     *        List of all remediation steps for failures.
     */

    public void setRemediation(String remediation) {
        this.remediation = remediation;
    }

    /**
     * <p>
     * List of all remediation steps for failures.
     * </p>
     * 
     * @return List of all remediation steps for failures.
     */

    public String getRemediation() {
        return this.remediation;
    }

    /**
     * <p>
     * List of all remediation steps for failures.
     * </p>
     * 
     * @param remediation
     *        List of all remediation steps for failures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Failures withRemediation(String remediation) {
        setRemediation(remediation);
        return this;
    }

    /**
     * <p>
     * This error can occur if you configure the wrong timestamp format, or if the subset of entries used for validation
     * had errors or missing values.
     * </p>
     * 
     * @param timestamp
     *        This error can occur if you configure the wrong timestamp format, or if the subset of entries used for
     *        validation had errors or missing values.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * This error can occur if you configure the wrong timestamp format, or if the subset of entries used for validation
     * had errors or missing values.
     * </p>
     * 
     * @return This error can occur if you configure the wrong timestamp format, or if the subset of entries used for
     *         validation had errors or missing values.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * This error can occur if you configure the wrong timestamp format, or if the subset of entries used for validation
     * had errors or missing values.
     * </p>
     * 
     * @param timestamp
     *        This error can occur if you configure the wrong timestamp format, or if the subset of entries used for
     *        validation had errors or missing values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Failures withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
        if (getExceptionMessage() != null)
            sb.append("ExceptionMessage: ").append(getExceptionMessage()).append(",");
        if (getRemediation() != null)
            sb.append("Remediation: ").append(getRemediation()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Failures == false)
            return false;
        Failures other = (Failures) obj;
        if (other.getExceptionMessage() == null ^ this.getExceptionMessage() == null)
            return false;
        if (other.getExceptionMessage() != null && other.getExceptionMessage().equals(this.getExceptionMessage()) == false)
            return false;
        if (other.getRemediation() == null ^ this.getRemediation() == null)
            return false;
        if (other.getRemediation() != null && other.getRemediation().equals(this.getRemediation()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExceptionMessage() == null) ? 0 : getExceptionMessage().hashCode());
        hashCode = prime * hashCode + ((getRemediation() == null) ? 0 : getRemediation().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public Failures clone() {
        try {
            return (Failures) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.FailuresMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

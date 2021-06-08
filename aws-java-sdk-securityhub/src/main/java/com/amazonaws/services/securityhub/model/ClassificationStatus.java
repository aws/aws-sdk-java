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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about the current status of the sensitive data detection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ClassificationStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClassificationStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The code that represents the status of the sensitive data detection.
     * </p>
     */
    private String code;
    /**
     * <p>
     * A longer description of the current status of the sensitive data detection.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The code that represents the status of the sensitive data detection.
     * </p>
     * 
     * @param code
     *        The code that represents the status of the sensitive data detection.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The code that represents the status of the sensitive data detection.
     * </p>
     * 
     * @return The code that represents the status of the sensitive data detection.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The code that represents the status of the sensitive data detection.
     * </p>
     * 
     * @param code
     *        The code that represents the status of the sensitive data detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationStatus withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A longer description of the current status of the sensitive data detection.
     * </p>
     * 
     * @param reason
     *        A longer description of the current status of the sensitive data detection.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A longer description of the current status of the sensitive data detection.
     * </p>
     * 
     * @return A longer description of the current status of the sensitive data detection.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A longer description of the current status of the sensitive data detection.
     * </p>
     * 
     * @param reason
     *        A longer description of the current status of the sensitive data detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationStatus withReason(String reason) {
        setReason(reason);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassificationStatus == false)
            return false;
        ClassificationStatus other = (ClassificationStatus) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public ClassificationStatus clone() {
        try {
            return (ClassificationStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ClassificationStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of the scan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ScanStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScanStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The reason for the scan.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The status code of the scan.
     * </p>
     */
    private String statusCode;

    /**
     * <p>
     * The reason for the scan.
     * </p>
     * 
     * @param reason
     *        The reason for the scan.
     * @see ScanStatusReason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the scan.
     * </p>
     * 
     * @return The reason for the scan.
     * @see ScanStatusReason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the scan.
     * </p>
     * 
     * @param reason
     *        The reason for the scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanStatusReason
     */

    public ScanStatus withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason for the scan.
     * </p>
     * 
     * @param reason
     *        The reason for the scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanStatusReason
     */

    public ScanStatus withReason(ScanStatusReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * The status code of the scan.
     * </p>
     * 
     * @param statusCode
     *        The status code of the scan.
     * @see ScanStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code of the scan.
     * </p>
     * 
     * @return The status code of the scan.
     * @see ScanStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code of the scan.
     * </p>
     * 
     * @param statusCode
     *        The status code of the scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanStatusCode
     */

    public ScanStatus withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The status code of the scan.
     * </p>
     * 
     * @param statusCode
     *        The status code of the scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanStatusCode
     */

    public ScanStatus withStatusCode(ScanStatusCode statusCode) {
        this.statusCode = statusCode.toString();
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
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScanStatus == false)
            return false;
        ScanStatus other = (ScanStatus) obj;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        return hashCode;
    }

    @Override
    public ScanStatus clone() {
        try {
            return (ScanStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.ScanStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

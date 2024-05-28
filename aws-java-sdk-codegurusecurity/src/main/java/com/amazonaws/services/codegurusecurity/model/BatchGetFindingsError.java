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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the error that caused a finding to fail to be retrieved.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/BatchGetFindingsError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetFindingsError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A code associated with the type of error.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The finding ID of the finding that was not fetched.
     * </p>
     */
    private String findingId;
    /**
     * <p>
     * Describes the error.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The name of the scan that generated the finding.
     * </p>
     */
    private String scanName;

    /**
     * <p>
     * A code associated with the type of error.
     * </p>
     * 
     * @param errorCode
     *        A code associated with the type of error.
     * @see ErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * A code associated with the type of error.
     * </p>
     * 
     * @return A code associated with the type of error.
     * @see ErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * A code associated with the type of error.
     * </p>
     * 
     * @param errorCode
     *        A code associated with the type of error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public BatchGetFindingsError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * A code associated with the type of error.
     * </p>
     * 
     * @param errorCode
     *        A code associated with the type of error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public BatchGetFindingsError withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The finding ID of the finding that was not fetched.
     * </p>
     * 
     * @param findingId
     *        The finding ID of the finding that was not fetched.
     */

    public void setFindingId(String findingId) {
        this.findingId = findingId;
    }

    /**
     * <p>
     * The finding ID of the finding that was not fetched.
     * </p>
     * 
     * @return The finding ID of the finding that was not fetched.
     */

    public String getFindingId() {
        return this.findingId;
    }

    /**
     * <p>
     * The finding ID of the finding that was not fetched.
     * </p>
     * 
     * @param findingId
     *        The finding ID of the finding that was not fetched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFindingsError withFindingId(String findingId) {
        setFindingId(findingId);
        return this;
    }

    /**
     * <p>
     * Describes the error.
     * </p>
     * 
     * @param message
     *        Describes the error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Describes the error.
     * </p>
     * 
     * @return Describes the error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Describes the error.
     * </p>
     * 
     * @param message
     *        Describes the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFindingsError withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The name of the scan that generated the finding.
     * </p>
     * 
     * @param scanName
     *        The name of the scan that generated the finding.
     */

    public void setScanName(String scanName) {
        this.scanName = scanName;
    }

    /**
     * <p>
     * The name of the scan that generated the finding.
     * </p>
     * 
     * @return The name of the scan that generated the finding.
     */

    public String getScanName() {
        return this.scanName;
    }

    /**
     * <p>
     * The name of the scan that generated the finding.
     * </p>
     * 
     * @param scanName
     *        The name of the scan that generated the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFindingsError withScanName(String scanName) {
        setScanName(scanName);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getFindingId() != null)
            sb.append("FindingId: ").append(getFindingId()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getScanName() != null)
            sb.append("ScanName: ").append(getScanName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetFindingsError == false)
            return false;
        BatchGetFindingsError other = (BatchGetFindingsError) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getFindingId() == null ^ this.getFindingId() == null)
            return false;
        if (other.getFindingId() != null && other.getFindingId().equals(this.getFindingId()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getScanName() == null ^ this.getScanName() == null)
            return false;
        if (other.getScanName() != null && other.getScanName().equals(this.getScanName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getFindingId() == null) ? 0 : getFindingId().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getScanName() == null) ? 0 : getScanName().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetFindingsError clone() {
        try {
            return (BatchGetFindingsError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurusecurity.model.transform.BatchGetFindingsErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An error associated with package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PackageVersionError" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageVersionError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error code associated with the error. Valid error codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     */
    private String errorCode;
    /**
     * <p>
     * The error message associated with the error.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The error code associated with the error. Valid error codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCode
     *        The error code associated with the error. Valid error codes are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALREADY_EXISTS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISMATCHED_REVISION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISMATCHED_STATUS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_ALLOWED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_FOUND</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIPPED</code>
     *        </p>
     *        </li>
     * @see PackageVersionErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code associated with the error. Valid error codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The error code associated with the error. Valid error codes are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALREADY_EXISTS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MISMATCHED_REVISION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MISMATCHED_STATUS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_ALLOWED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_FOUND</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SKIPPED</code>
     *         </p>
     *         </li>
     * @see PackageVersionErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code associated with the error. Valid error codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCode
     *        The error code associated with the error. Valid error codes are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALREADY_EXISTS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISMATCHED_REVISION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISMATCHED_STATUS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_ALLOWED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_FOUND</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIPPED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionErrorCode
     */

    public PackageVersionError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error code associated with the error. Valid error codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCode
     *        The error code associated with the error. Valid error codes are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALREADY_EXISTS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISMATCHED_REVISION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISMATCHED_STATUS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_ALLOWED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_FOUND</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIPPED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionErrorCode
     */

    public PackageVersionError withErrorCode(PackageVersionErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The error message associated with the error.
     * </p>
     * 
     * @param errorMessage
     *        The error message associated with the error.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message associated with the error.
     * </p>
     * 
     * @return The error message associated with the error.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message associated with the error.
     * </p>
     * 
     * @param errorMessage
     *        The error message associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionError withErrorMessage(String errorMessage) {
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
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

        if (obj instanceof PackageVersionError == false)
            return false;
        PackageVersionError other = (PackageVersionError) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
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

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public PackageVersionError clone() {
        try {
            return (PackageVersionError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.PackageVersionErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

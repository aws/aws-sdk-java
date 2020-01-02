/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Returns information about an error state of the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ErrorInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A number describing the error programmatically.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * An optional field to provide more details about the error.
     * </p>
     */
    private String errorString;

    /**
     * <p>
     * A number describing the error programmatically.
     * </p>
     * 
     * @param errorCode
     *        <p>
     *        A number describing the error programmatically.
     *        </p>
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * A number describing the error programmatically.
     * </p>
     * 
     * @return <p>
     *         A number describing the error programmatically.
     *         </p>
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * A number describing the error programmatically.
     * </p>
     * 
     * @param errorCode
     *        <p>
     *        A number describing the error programmatically.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorInfo withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * An optional field to provide more details about the error.
     * </p>
     * 
     * @param errorString
     *        <p>
     *        An optional field to provide more details about the error.
     *        </p>
     */

    public void setErrorString(String errorString) {
        this.errorString = errorString;
    }

    /**
     * <p>
     * An optional field to provide more details about the error.
     * </p>
     * 
     * @return <p>
     *         An optional field to provide more details about the error.
     *         </p>
     */

    public String getErrorString() {
        return this.errorString;
    }

    /**
     * <p>
     * An optional field to provide more details about the error.
     * </p>
     * 
     * @param errorString
     *        <p>
     *        An optional field to provide more details about the error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorInfo withErrorString(String errorString) {
        setErrorString(errorString);
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
        if (getErrorString() != null)
            sb.append("ErrorString: ").append(getErrorString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorInfo == false)
            return false;
        ErrorInfo other = (ErrorInfo) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorString() == null ^ this.getErrorString() == null)
            return false;
        if (other.getErrorString() != null && other.getErrorString().equals(this.getErrorString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorString() == null) ? 0 : getErrorString().hashCode());
        return hashCode;
    }

    @Override
    public ErrorInfo clone() {
        try {
            return (ErrorInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ErrorInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

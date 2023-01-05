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
 * An object that described the state of Amazon Inspector scans for an account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/State" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class State implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error code explaining why the account failed to enable Amazon Inspector.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message received when the account failed to enable Amazon Inspector.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The status of Amazon Inspector for the account.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The error code explaining why the account failed to enable Amazon Inspector.
     * </p>
     * 
     * @param errorCode
     *        The error code explaining why the account failed to enable Amazon Inspector.
     * @see ErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code explaining why the account failed to enable Amazon Inspector.
     * </p>
     * 
     * @return The error code explaining why the account failed to enable Amazon Inspector.
     * @see ErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code explaining why the account failed to enable Amazon Inspector.
     * </p>
     * 
     * @param errorCode
     *        The error code explaining why the account failed to enable Amazon Inspector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public State withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error code explaining why the account failed to enable Amazon Inspector.
     * </p>
     * 
     * @param errorCode
     *        The error code explaining why the account failed to enable Amazon Inspector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public State withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The error message received when the account failed to enable Amazon Inspector.
     * </p>
     * 
     * @param errorMessage
     *        The error message received when the account failed to enable Amazon Inspector.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message received when the account failed to enable Amazon Inspector.
     * </p>
     * 
     * @return The error message received when the account failed to enable Amazon Inspector.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message received when the account failed to enable Amazon Inspector.
     * </p>
     * 
     * @param errorMessage
     *        The error message received when the account failed to enable Amazon Inspector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public State withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The status of Amazon Inspector for the account.
     * </p>
     * 
     * @param status
     *        The status of Amazon Inspector for the account.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of Amazon Inspector for the account.
     * </p>
     * 
     * @return The status of Amazon Inspector for the account.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of Amazon Inspector for the account.
     * </p>
     * 
     * @param status
     *        The status of Amazon Inspector for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public State withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of Amazon Inspector for the account.
     * </p>
     * 
     * @param status
     *        The status of Amazon Inspector for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public State withStatus(Status status) {
        this.status = status.toString();
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
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof State == false)
            return false;
        State other = (State) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public State clone() {
        try {
            return (State) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.StateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

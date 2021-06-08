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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An error associated with a statement in a PartiQL batch that was run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BatchStatementError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStatementError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error code associated with the failed PartiQL batch statement.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The error message associated with the PartiQL batch resposne.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The error code associated with the failed PartiQL batch statement.
     * </p>
     * 
     * @param code
     *        The error code associated with the failed PartiQL batch statement.
     * @see BatchStatementErrorCodeEnum
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code associated with the failed PartiQL batch statement.
     * </p>
     * 
     * @return The error code associated with the failed PartiQL batch statement.
     * @see BatchStatementErrorCodeEnum
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The error code associated with the failed PartiQL batch statement.
     * </p>
     * 
     * @param code
     *        The error code associated with the failed PartiQL batch statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchStatementErrorCodeEnum
     */

    public BatchStatementError withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The error code associated with the failed PartiQL batch statement.
     * </p>
     * 
     * @param code
     *        The error code associated with the failed PartiQL batch statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchStatementErrorCodeEnum
     */

    public BatchStatementError withCode(BatchStatementErrorCodeEnum code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * The error message associated with the PartiQL batch resposne.
     * </p>
     * 
     * @param message
     *        The error message associated with the PartiQL batch resposne.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The error message associated with the PartiQL batch resposne.
     * </p>
     * 
     * @return The error message associated with the PartiQL batch resposne.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The error message associated with the PartiQL batch resposne.
     * </p>
     * 
     * @param message
     *        The error message associated with the PartiQL batch resposne.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStatementError withMessage(String message) {
        setMessage(message);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStatementError == false)
            return false;
        BatchStatementError other = (BatchStatementError) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchStatementError clone() {
        try {
            return (BatchStatementError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.BatchStatementErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

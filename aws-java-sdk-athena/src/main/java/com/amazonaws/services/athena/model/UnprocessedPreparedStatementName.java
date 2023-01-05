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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The name of a prepared statement that could not be returned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UnprocessedPreparedStatementName"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnprocessedPreparedStatementName implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a prepared statement that could not be returned due to an error.
     * </p>
     */
    private String statementName;
    /**
     * <p>
     * The error code returned when the request for the prepared statement failed.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message containing the reason why the prepared statement could not be returned. The following error
     * messages are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVALID_INPUT</code> - The name of the prepared statement that was provided is not valid (for example, the
     * name is too long).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATEMENT_NOT_FOUND</code> - A prepared statement with the name provided could not be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAUTHORIZED</code> - The requester does not have permission to access the workgroup that contains the
     * prepared statement.
     * </p>
     * </li>
     * </ul>
     */
    private String errorMessage;

    /**
     * <p>
     * The name of a prepared statement that could not be returned due to an error.
     * </p>
     * 
     * @param statementName
     *        The name of a prepared statement that could not be returned due to an error.
     */

    public void setStatementName(String statementName) {
        this.statementName = statementName;
    }

    /**
     * <p>
     * The name of a prepared statement that could not be returned due to an error.
     * </p>
     * 
     * @return The name of a prepared statement that could not be returned due to an error.
     */

    public String getStatementName() {
        return this.statementName;
    }

    /**
     * <p>
     * The name of a prepared statement that could not be returned due to an error.
     * </p>
     * 
     * @param statementName
     *        The name of a prepared statement that could not be returned due to an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedPreparedStatementName withStatementName(String statementName) {
        setStatementName(statementName);
        return this;
    }

    /**
     * <p>
     * The error code returned when the request for the prepared statement failed.
     * </p>
     * 
     * @param errorCode
     *        The error code returned when the request for the prepared statement failed.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code returned when the request for the prepared statement failed.
     * </p>
     * 
     * @return The error code returned when the request for the prepared statement failed.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code returned when the request for the prepared statement failed.
     * </p>
     * 
     * @param errorCode
     *        The error code returned when the request for the prepared statement failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedPreparedStatementName withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error message containing the reason why the prepared statement could not be returned. The following error
     * messages are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVALID_INPUT</code> - The name of the prepared statement that was provided is not valid (for example, the
     * name is too long).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATEMENT_NOT_FOUND</code> - A prepared statement with the name provided could not be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAUTHORIZED</code> - The requester does not have permission to access the workgroup that contains the
     * prepared statement.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorMessage
     *        The error message containing the reason why the prepared statement could not be returned. The following
     *        error messages are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVALID_INPUT</code> - The name of the prepared statement that was provided is not valid (for
     *        example, the name is too long).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STATEMENT_NOT_FOUND</code> - A prepared statement with the name provided could not be found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNAUTHORIZED</code> - The requester does not have permission to access the workgroup that contains
     *        the prepared statement.
     *        </p>
     *        </li>
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message containing the reason why the prepared statement could not be returned. The following error
     * messages are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVALID_INPUT</code> - The name of the prepared statement that was provided is not valid (for example, the
     * name is too long).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATEMENT_NOT_FOUND</code> - A prepared statement with the name provided could not be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAUTHORIZED</code> - The requester does not have permission to access the workgroup that contains the
     * prepared statement.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The error message containing the reason why the prepared statement could not be returned. The following
     *         error messages are possible:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INVALID_INPUT</code> - The name of the prepared statement that was provided is not valid (for
     *         example, the name is too long).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STATEMENT_NOT_FOUND</code> - A prepared statement with the name provided could not be found.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNAUTHORIZED</code> - The requester does not have permission to access the workgroup that contains
     *         the prepared statement.
     *         </p>
     *         </li>
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message containing the reason why the prepared statement could not be returned. The following error
     * messages are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVALID_INPUT</code> - The name of the prepared statement that was provided is not valid (for example, the
     * name is too long).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATEMENT_NOT_FOUND</code> - A prepared statement with the name provided could not be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAUTHORIZED</code> - The requester does not have permission to access the workgroup that contains the
     * prepared statement.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorMessage
     *        The error message containing the reason why the prepared statement could not be returned. The following
     *        error messages are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVALID_INPUT</code> - The name of the prepared statement that was provided is not valid (for
     *        example, the name is too long).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STATEMENT_NOT_FOUND</code> - A prepared statement with the name provided could not be found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNAUTHORIZED</code> - The requester does not have permission to access the workgroup that contains
     *        the prepared statement.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedPreparedStatementName withErrorMessage(String errorMessage) {
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
        if (getStatementName() != null)
            sb.append("StatementName: ").append(getStatementName()).append(",");
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

        if (obj instanceof UnprocessedPreparedStatementName == false)
            return false;
        UnprocessedPreparedStatementName other = (UnprocessedPreparedStatementName) obj;
        if (other.getStatementName() == null ^ this.getStatementName() == null)
            return false;
        if (other.getStatementName() != null && other.getStatementName().equals(this.getStatementName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getStatementName() == null) ? 0 : getStatementName().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public UnprocessedPreparedStatementName clone() {
        try {
            return (UnprocessedPreparedStatementName) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.UnprocessedPreparedStatementNameMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

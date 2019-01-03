/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a query execution that failed to process.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UnprocessedQueryExecutionId" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnprocessedQueryExecutionId implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the query execution.
     * </p>
     */
    private String queryExecutionId;
    /**
     * <p>
     * The error code returned when the query execution failed to process, if applicable.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message returned when the query execution failed to process, if applicable.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The unique identifier of the query execution.
     * </p>
     * 
     * @param queryExecutionId
     *        The unique identifier of the query execution.
     */

    public void setQueryExecutionId(String queryExecutionId) {
        this.queryExecutionId = queryExecutionId;
    }

    /**
     * <p>
     * The unique identifier of the query execution.
     * </p>
     * 
     * @return The unique identifier of the query execution.
     */

    public String getQueryExecutionId() {
        return this.queryExecutionId;
    }

    /**
     * <p>
     * The unique identifier of the query execution.
     * </p>
     * 
     * @param queryExecutionId
     *        The unique identifier of the query execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedQueryExecutionId withQueryExecutionId(String queryExecutionId) {
        setQueryExecutionId(queryExecutionId);
        return this;
    }

    /**
     * <p>
     * The error code returned when the query execution failed to process, if applicable.
     * </p>
     * 
     * @param errorCode
     *        The error code returned when the query execution failed to process, if applicable.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code returned when the query execution failed to process, if applicable.
     * </p>
     * 
     * @return The error code returned when the query execution failed to process, if applicable.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code returned when the query execution failed to process, if applicable.
     * </p>
     * 
     * @param errorCode
     *        The error code returned when the query execution failed to process, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedQueryExecutionId withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error message returned when the query execution failed to process, if applicable.
     * </p>
     * 
     * @param errorMessage
     *        The error message returned when the query execution failed to process, if applicable.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message returned when the query execution failed to process, if applicable.
     * </p>
     * 
     * @return The error message returned when the query execution failed to process, if applicable.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message returned when the query execution failed to process, if applicable.
     * </p>
     * 
     * @param errorMessage
     *        The error message returned when the query execution failed to process, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedQueryExecutionId withErrorMessage(String errorMessage) {
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
        if (getQueryExecutionId() != null)
            sb.append("QueryExecutionId: ").append(getQueryExecutionId()).append(",");
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

        if (obj instanceof UnprocessedQueryExecutionId == false)
            return false;
        UnprocessedQueryExecutionId other = (UnprocessedQueryExecutionId) obj;
        if (other.getQueryExecutionId() == null ^ this.getQueryExecutionId() == null)
            return false;
        if (other.getQueryExecutionId() != null && other.getQueryExecutionId().equals(this.getQueryExecutionId()) == false)
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

        hashCode = prime * hashCode + ((getQueryExecutionId() == null) ? 0 : getQueryExecutionId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public UnprocessedQueryExecutionId clone() {
        try {
            return (UnprocessedQueryExecutionId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.UnprocessedQueryExecutionIdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

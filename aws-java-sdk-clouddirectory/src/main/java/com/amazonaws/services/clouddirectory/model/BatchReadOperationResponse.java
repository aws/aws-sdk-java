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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of a <code>BatchRead</code> response operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchReadOperationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchReadOperationResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies which operation in a batch has succeeded.
     * </p>
     */
    private BatchReadSuccessfulResponse successfulResponse;
    /**
     * <p>
     * Identifies which operation in a batch has failed.
     * </p>
     */
    private BatchReadException exceptionResponse;

    /**
     * <p>
     * Identifies which operation in a batch has succeeded.
     * </p>
     * 
     * @param successfulResponse
     *        Identifies which operation in a batch has succeeded.
     */

    public void setSuccessfulResponse(BatchReadSuccessfulResponse successfulResponse) {
        this.successfulResponse = successfulResponse;
    }

    /**
     * <p>
     * Identifies which operation in a batch has succeeded.
     * </p>
     * 
     * @return Identifies which operation in a batch has succeeded.
     */

    public BatchReadSuccessfulResponse getSuccessfulResponse() {
        return this.successfulResponse;
    }

    /**
     * <p>
     * Identifies which operation in a batch has succeeded.
     * </p>
     * 
     * @param successfulResponse
     *        Identifies which operation in a batch has succeeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadOperationResponse withSuccessfulResponse(BatchReadSuccessfulResponse successfulResponse) {
        setSuccessfulResponse(successfulResponse);
        return this;
    }

    /**
     * <p>
     * Identifies which operation in a batch has failed.
     * </p>
     * 
     * @param exceptionResponse
     *        Identifies which operation in a batch has failed.
     */

    public void setExceptionResponse(BatchReadException exceptionResponse) {
        this.exceptionResponse = exceptionResponse;
    }

    /**
     * <p>
     * Identifies which operation in a batch has failed.
     * </p>
     * 
     * @return Identifies which operation in a batch has failed.
     */

    public BatchReadException getExceptionResponse() {
        return this.exceptionResponse;
    }

    /**
     * <p>
     * Identifies which operation in a batch has failed.
     * </p>
     * 
     * @param exceptionResponse
     *        Identifies which operation in a batch has failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadOperationResponse withExceptionResponse(BatchReadException exceptionResponse) {
        setExceptionResponse(exceptionResponse);
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
        if (getSuccessfulResponse() != null)
            sb.append("SuccessfulResponse: ").append(getSuccessfulResponse()).append(",");
        if (getExceptionResponse() != null)
            sb.append("ExceptionResponse: ").append(getExceptionResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchReadOperationResponse == false)
            return false;
        BatchReadOperationResponse other = (BatchReadOperationResponse) obj;
        if (other.getSuccessfulResponse() == null ^ this.getSuccessfulResponse() == null)
            return false;
        if (other.getSuccessfulResponse() != null && other.getSuccessfulResponse().equals(this.getSuccessfulResponse()) == false)
            return false;
        if (other.getExceptionResponse() == null ^ this.getExceptionResponse() == null)
            return false;
        if (other.getExceptionResponse() != null && other.getExceptionResponse().equals(this.getExceptionResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessfulResponse() == null) ? 0 : getSuccessfulResponse().hashCode());
        hashCode = prime * hashCode + ((getExceptionResponse() == null) ? 0 : getExceptionResponse().hashCode());
        return hashCode;
    }

    @Override
    public BatchReadOperationResponse clone() {
        try {
            return (BatchReadOperationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchReadOperationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

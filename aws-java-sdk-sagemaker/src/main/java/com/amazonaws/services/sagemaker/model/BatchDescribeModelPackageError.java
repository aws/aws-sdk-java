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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The error code and error description associated with the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/BatchDescribeModelPackageError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDescribeModelPackageError implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String errorCode;
    /** <p/> */
    private String errorResponse;

    /**
     * <p/>
     * 
     * @param errorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p/>
     * 
     * @param errorCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeModelPackageError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p/>
     * 
     * @param errorResponse
     */

    public void setErrorResponse(String errorResponse) {
        this.errorResponse = errorResponse;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getErrorResponse() {
        return this.errorResponse;
    }

    /**
     * <p/>
     * 
     * @param errorResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeModelPackageError withErrorResponse(String errorResponse) {
        setErrorResponse(errorResponse);
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
        if (getErrorResponse() != null)
            sb.append("ErrorResponse: ").append(getErrorResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDescribeModelPackageError == false)
            return false;
        BatchDescribeModelPackageError other = (BatchDescribeModelPackageError) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorResponse() == null ^ this.getErrorResponse() == null)
            return false;
        if (other.getErrorResponse() != null && other.getErrorResponse().equals(this.getErrorResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorResponse() == null) ? 0 : getErrorResponse().hashCode());
        return hashCode;
    }

    @Override
    public BatchDescribeModelPackageError clone() {
        try {
            return (BatchDescribeModelPackageError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.BatchDescribeModelPackageErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

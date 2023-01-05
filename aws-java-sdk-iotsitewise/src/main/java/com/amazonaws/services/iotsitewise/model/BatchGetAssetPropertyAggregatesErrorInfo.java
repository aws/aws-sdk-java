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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the error code and the timestamp for an asset property aggregate entry that is associated with the <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchGetAssetPropertyAggregates.html"
 * >BatchGetAssetPropertyAggregates</a> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchGetAssetPropertyAggregatesErrorInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAssetPropertyAggregatesErrorInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error code.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The date the error occurred, in Unix epoch time.
     * </p>
     */
    private java.util.Date errorTimestamp;

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     * @see BatchGetAssetPropertyAggregatesErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @return The error code.
     * @see BatchGetAssetPropertyAggregatesErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchGetAssetPropertyAggregatesErrorCode
     */

    public BatchGetAssetPropertyAggregatesErrorInfo withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchGetAssetPropertyAggregatesErrorCode
     */

    public BatchGetAssetPropertyAggregatesErrorInfo withErrorCode(BatchGetAssetPropertyAggregatesErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The date the error occurred, in Unix epoch time.
     * </p>
     * 
     * @param errorTimestamp
     *        The date the error occurred, in Unix epoch time.
     */

    public void setErrorTimestamp(java.util.Date errorTimestamp) {
        this.errorTimestamp = errorTimestamp;
    }

    /**
     * <p>
     * The date the error occurred, in Unix epoch time.
     * </p>
     * 
     * @return The date the error occurred, in Unix epoch time.
     */

    public java.util.Date getErrorTimestamp() {
        return this.errorTimestamp;
    }

    /**
     * <p>
     * The date the error occurred, in Unix epoch time.
     * </p>
     * 
     * @param errorTimestamp
     *        The date the error occurred, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyAggregatesErrorInfo withErrorTimestamp(java.util.Date errorTimestamp) {
        setErrorTimestamp(errorTimestamp);
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
        if (getErrorTimestamp() != null)
            sb.append("ErrorTimestamp: ").append(getErrorTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetAssetPropertyAggregatesErrorInfo == false)
            return false;
        BatchGetAssetPropertyAggregatesErrorInfo other = (BatchGetAssetPropertyAggregatesErrorInfo) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorTimestamp() == null ^ this.getErrorTimestamp() == null)
            return false;
        if (other.getErrorTimestamp() != null && other.getErrorTimestamp().equals(this.getErrorTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorTimestamp() == null) ? 0 : getErrorTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetAssetPropertyAggregatesErrorInfo clone() {
        try {
            return (BatchGetAssetPropertyAggregatesErrorInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.BatchGetAssetPropertyAggregatesErrorInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

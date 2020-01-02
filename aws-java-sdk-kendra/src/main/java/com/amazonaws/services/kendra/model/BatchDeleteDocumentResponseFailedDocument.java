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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about documents that could not be removed from an index by the <a>BatchDeleteDocument</a>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchDeleteDocumentResponseFailedDocument"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteDocumentResponseFailedDocument implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the document that couldn't be removed from the index.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The error code for why the document couldn't be removed from the index.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * An explanation for why the document couldn't be removed from the index.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The identifier of the document that couldn't be removed from the index.
     * </p>
     * 
     * @param id
     *        The identifier of the document that couldn't be removed from the index.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the document that couldn't be removed from the index.
     * </p>
     * 
     * @return The identifier of the document that couldn't be removed from the index.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the document that couldn't be removed from the index.
     * </p>
     * 
     * @param id
     *        The identifier of the document that couldn't be removed from the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDocumentResponseFailedDocument withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The error code for why the document couldn't be removed from the index.
     * </p>
     * 
     * @param errorCode
     *        The error code for why the document couldn't be removed from the index.
     * @see ErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code for why the document couldn't be removed from the index.
     * </p>
     * 
     * @return The error code for why the document couldn't be removed from the index.
     * @see ErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code for why the document couldn't be removed from the index.
     * </p>
     * 
     * @param errorCode
     *        The error code for why the document couldn't be removed from the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public BatchDeleteDocumentResponseFailedDocument withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error code for why the document couldn't be removed from the index.
     * </p>
     * 
     * @param errorCode
     *        The error code for why the document couldn't be removed from the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public BatchDeleteDocumentResponseFailedDocument withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * An explanation for why the document couldn't be removed from the index.
     * </p>
     * 
     * @param errorMessage
     *        An explanation for why the document couldn't be removed from the index.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An explanation for why the document couldn't be removed from the index.
     * </p>
     * 
     * @return An explanation for why the document couldn't be removed from the index.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An explanation for why the document couldn't be removed from the index.
     * </p>
     * 
     * @param errorMessage
     *        An explanation for why the document couldn't be removed from the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDocumentResponseFailedDocument withErrorMessage(String errorMessage) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof BatchDeleteDocumentResponseFailedDocument == false)
            return false;
        BatchDeleteDocumentResponseFailedDocument other = (BatchDeleteDocumentResponseFailedDocument) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteDocumentResponseFailedDocument clone() {
        try {
            return (BatchDeleteDocumentResponseFailedDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.BatchDeleteDocumentResponseFailedDocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

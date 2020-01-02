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
 * Provides information about a document that could not be indexed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchPutDocumentResponseFailedDocument"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutDocumentResponseFailedDocument implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the document.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of error that caused the document to fail to be indexed.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * A description of the reason why the document could not be indexed.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The unique identifier of the document.
     * </p>
     * 
     * @param id
     *        The unique identifier of the document.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the document.
     * </p>
     * 
     * @return The unique identifier of the document.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the document.
     * </p>
     * 
     * @param id
     *        The unique identifier of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutDocumentResponseFailedDocument withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of error that caused the document to fail to be indexed.
     * </p>
     * 
     * @param errorCode
     *        The type of error that caused the document to fail to be indexed.
     * @see ErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The type of error that caused the document to fail to be indexed.
     * </p>
     * 
     * @return The type of error that caused the document to fail to be indexed.
     * @see ErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The type of error that caused the document to fail to be indexed.
     * </p>
     * 
     * @param errorCode
     *        The type of error that caused the document to fail to be indexed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public BatchPutDocumentResponseFailedDocument withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The type of error that caused the document to fail to be indexed.
     * </p>
     * 
     * @param errorCode
     *        The type of error that caused the document to fail to be indexed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public BatchPutDocumentResponseFailedDocument withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * A description of the reason why the document could not be indexed.
     * </p>
     * 
     * @param errorMessage
     *        A description of the reason why the document could not be indexed.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * A description of the reason why the document could not be indexed.
     * </p>
     * 
     * @return A description of the reason why the document could not be indexed.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * A description of the reason why the document could not be indexed.
     * </p>
     * 
     * @param errorMessage
     *        A description of the reason why the document could not be indexed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutDocumentResponseFailedDocument withErrorMessage(String errorMessage) {
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

        if (obj instanceof BatchPutDocumentResponseFailedDocument == false)
            return false;
        BatchPutDocumentResponseFailedDocument other = (BatchPutDocumentResponseFailedDocument) obj;
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
    public BatchPutDocumentResponseFailedDocument clone() {
        try {
            return (BatchPutDocumentResponseFailedDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.BatchPutDocumentResponseFailedDocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

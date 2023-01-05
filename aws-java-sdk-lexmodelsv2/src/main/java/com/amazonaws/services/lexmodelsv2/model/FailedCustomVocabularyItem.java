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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The unique failed custom vocabulary item from the custom vocabulary list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/FailedCustomVocabularyItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedCustomVocabularyItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique item identifer for the failed custom vocabulary item from the custom vocabulary list.
     * </p>
     */
    private String itemId;
    /**
     * <p>
     * The error message for the failed custom vocabulary item from the custom vocabulary list.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The unique error code for the failed custom vocabulary item from the custom vocabulary list.
     * </p>
     */
    private String errorCode;

    /**
     * <p>
     * The unique item identifer for the failed custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @param itemId
     *        The unique item identifer for the failed custom vocabulary item from the custom vocabulary list.
     */

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * <p>
     * The unique item identifer for the failed custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @return The unique item identifer for the failed custom vocabulary item from the custom vocabulary list.
     */

    public String getItemId() {
        return this.itemId;
    }

    /**
     * <p>
     * The unique item identifer for the failed custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @param itemId
     *        The unique item identifer for the failed custom vocabulary item from the custom vocabulary list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedCustomVocabularyItem withItemId(String itemId) {
        setItemId(itemId);
        return this;
    }

    /**
     * <p>
     * The error message for the failed custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @param errorMessage
     *        The error message for the failed custom vocabulary item from the custom vocabulary list.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message for the failed custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @return The error message for the failed custom vocabulary item from the custom vocabulary list.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message for the failed custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @param errorMessage
     *        The error message for the failed custom vocabulary item from the custom vocabulary list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedCustomVocabularyItem withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The unique error code for the failed custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @param errorCode
     *        The unique error code for the failed custom vocabulary item from the custom vocabulary list.
     * @see ErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The unique error code for the failed custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @return The unique error code for the failed custom vocabulary item from the custom vocabulary list.
     * @see ErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The unique error code for the failed custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @param errorCode
     *        The unique error code for the failed custom vocabulary item from the custom vocabulary list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public FailedCustomVocabularyItem withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The unique error code for the failed custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @param errorCode
     *        The unique error code for the failed custom vocabulary item from the custom vocabulary list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public FailedCustomVocabularyItem withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
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
        if (getItemId() != null)
            sb.append("ItemId: ").append(getItemId()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedCustomVocabularyItem == false)
            return false;
        FailedCustomVocabularyItem other = (FailedCustomVocabularyItem) obj;
        if (other.getItemId() == null ^ this.getItemId() == null)
            return false;
        if (other.getItemId() != null && other.getItemId().equals(this.getItemId()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemId() == null) ? 0 : getItemId().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        return hashCode;
    }

    @Override
    public FailedCustomVocabularyItem clone() {
        try {
            return (FailedCustomVocabularyItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.FailedCustomVocabularyItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

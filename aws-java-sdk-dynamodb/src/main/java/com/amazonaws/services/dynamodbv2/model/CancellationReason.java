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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An ordered list of errors for each item in the request which caused the transaction to get cancelled. The values of
 * the list are ordered according to the ordering of the <code>TransactWriteItems</code> request parameter. If no error
 * occurred for the associated item an error with a Null code and Null message will be present.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/CancellationReason" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancellationReason implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Item in the request which caused the transaction to get cancelled.
     * </p>
     */
    private java.util.Map<String, AttributeValue> item;
    /**
     * <p>
     * Status code for the result of the cancelled transaction.
     * </p>
     */
    private String code;
    /**
     * <p>
     * Cancellation reason message description.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Item in the request which caused the transaction to get cancelled.
     * </p>
     * 
     * @return Item in the request which caused the transaction to get cancelled.
     */

    public java.util.Map<String, AttributeValue> getItem() {
        return item;
    }

    /**
     * <p>
     * Item in the request which caused the transaction to get cancelled.
     * </p>
     * 
     * @param item
     *        Item in the request which caused the transaction to get cancelled.
     */

    public void setItem(java.util.Map<String, AttributeValue> item) {
        this.item = item;
    }

    /**
     * <p>
     * Item in the request which caused the transaction to get cancelled.
     * </p>
     * 
     * @param item
     *        Item in the request which caused the transaction to get cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancellationReason withItem(java.util.Map<String, AttributeValue> item) {
        setItem(item);
        return this;
    }

    public CancellationReason addItemEntry(String key, AttributeValue value) {
        if (null == this.item) {
            this.item = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.item.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.item.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Item.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancellationReason clearItemEntries() {
        this.item = null;
        return this;
    }

    /**
     * <p>
     * Status code for the result of the cancelled transaction.
     * </p>
     * 
     * @param code
     *        Status code for the result of the cancelled transaction.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * Status code for the result of the cancelled transaction.
     * </p>
     * 
     * @return Status code for the result of the cancelled transaction.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * Status code for the result of the cancelled transaction.
     * </p>
     * 
     * @param code
     *        Status code for the result of the cancelled transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancellationReason withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * Cancellation reason message description.
     * </p>
     * 
     * @param message
     *        Cancellation reason message description.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Cancellation reason message description.
     * </p>
     * 
     * @return Cancellation reason message description.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Cancellation reason message description.
     * </p>
     * 
     * @param message
     *        Cancellation reason message description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancellationReason withMessage(String message) {
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
        if (getItem() != null)
            sb.append("Item: ").append(getItem()).append(",");
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

        if (obj instanceof CancellationReason == false)
            return false;
        CancellationReason other = (CancellationReason) obj;
        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public CancellationReason clone() {
        try {
            return (CancellationReason) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.CancellationReasonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

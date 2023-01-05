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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipMediaApplicationCall"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSipMediaApplicationCallRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String sipMediaApplicationId;

    private String transactionId;

    private java.util.Map<String, String> arguments;

    /**
     * @param sipMediaApplicationId
     */

    public void setSipMediaApplicationId(String sipMediaApplicationId) {
        this.sipMediaApplicationId = sipMediaApplicationId;
    }

    /**
     * @return
     */

    public String getSipMediaApplicationId() {
        return this.sipMediaApplicationId;
    }

    /**
     * @param sipMediaApplicationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSipMediaApplicationCallRequest withSipMediaApplicationId(String sipMediaApplicationId) {
        setSipMediaApplicationId(sipMediaApplicationId);
        return this;
    }

    /**
     * @param transactionId
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * @return
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * @param transactionId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSipMediaApplicationCallRequest withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getArguments() {
        return arguments;
    }

    /**
     * @param arguments
     */

    public void setArguments(java.util.Map<String, String> arguments) {
        this.arguments = arguments;
    }

    /**
     * @param arguments
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSipMediaApplicationCallRequest withArguments(java.util.Map<String, String> arguments) {
        setArguments(arguments);
        return this;
    }

    /**
     * Add a single Arguments entry
     *
     * @see UpdateSipMediaApplicationCallRequest#withArguments
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSipMediaApplicationCallRequest addArgumentsEntry(String key, String value) {
        if (null == this.arguments) {
            this.arguments = new java.util.HashMap<String, String>();
        }
        if (this.arguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.arguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Arguments.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSipMediaApplicationCallRequest clearArgumentsEntries() {
        this.arguments = null;
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
        if (getSipMediaApplicationId() != null)
            sb.append("SipMediaApplicationId: ").append(getSipMediaApplicationId()).append(",");
        if (getTransactionId() != null)
            sb.append("TransactionId: ").append(getTransactionId()).append(",");
        if (getArguments() != null)
            sb.append("Arguments: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSipMediaApplicationCallRequest == false)
            return false;
        UpdateSipMediaApplicationCallRequest other = (UpdateSipMediaApplicationCallRequest) obj;
        if (other.getSipMediaApplicationId() == null ^ this.getSipMediaApplicationId() == null)
            return false;
        if (other.getSipMediaApplicationId() != null && other.getSipMediaApplicationId().equals(this.getSipMediaApplicationId()) == false)
            return false;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getArguments() == null ^ this.getArguments() == null)
            return false;
        if (other.getArguments() != null && other.getArguments().equals(this.getArguments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSipMediaApplicationId() == null) ? 0 : getSipMediaApplicationId().hashCode());
        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode + ((getArguments() == null) ? 0 : getArguments().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSipMediaApplicationCallRequest clone() {
        return (UpdateSipMediaApplicationCallRequest) super.clone();
    }

}

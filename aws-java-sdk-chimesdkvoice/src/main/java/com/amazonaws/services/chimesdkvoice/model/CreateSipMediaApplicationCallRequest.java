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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipMediaApplicationCall"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSipMediaApplicationCallRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String fromPhoneNumber;

    private String toPhoneNumber;

    private String sipMediaApplicationId;

    private java.util.Map<String, String> sipHeaders;

    private java.util.Map<String, String> argumentsMap;

    /**
     * @param fromPhoneNumber
     */

    public void setFromPhoneNumber(String fromPhoneNumber) {
        this.fromPhoneNumber = fromPhoneNumber;
    }

    /**
     * @return
     */

    public String getFromPhoneNumber() {
        return this.fromPhoneNumber;
    }

    /**
     * @param fromPhoneNumber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipMediaApplicationCallRequest withFromPhoneNumber(String fromPhoneNumber) {
        setFromPhoneNumber(fromPhoneNumber);
        return this;
    }

    /**
     * @param toPhoneNumber
     */

    public void setToPhoneNumber(String toPhoneNumber) {
        this.toPhoneNumber = toPhoneNumber;
    }

    /**
     * @return
     */

    public String getToPhoneNumber() {
        return this.toPhoneNumber;
    }

    /**
     * @param toPhoneNumber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipMediaApplicationCallRequest withToPhoneNumber(String toPhoneNumber) {
        setToPhoneNumber(toPhoneNumber);
        return this;
    }

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

    public CreateSipMediaApplicationCallRequest withSipMediaApplicationId(String sipMediaApplicationId) {
        setSipMediaApplicationId(sipMediaApplicationId);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getSipHeaders() {
        return sipHeaders;
    }

    /**
     * @param sipHeaders
     */

    public void setSipHeaders(java.util.Map<String, String> sipHeaders) {
        this.sipHeaders = sipHeaders;
    }

    /**
     * @param sipHeaders
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipMediaApplicationCallRequest withSipHeaders(java.util.Map<String, String> sipHeaders) {
        setSipHeaders(sipHeaders);
        return this;
    }

    /**
     * Add a single SipHeaders entry
     *
     * @see CreateSipMediaApplicationCallRequest#withSipHeaders
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipMediaApplicationCallRequest addSipHeadersEntry(String key, String value) {
        if (null == this.sipHeaders) {
            this.sipHeaders = new java.util.HashMap<String, String>();
        }
        if (this.sipHeaders.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sipHeaders.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SipHeaders.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipMediaApplicationCallRequest clearSipHeadersEntries() {
        this.sipHeaders = null;
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getArgumentsMap() {
        return argumentsMap;
    }

    /**
     * @param argumentsMap
     */

    public void setArgumentsMap(java.util.Map<String, String> argumentsMap) {
        this.argumentsMap = argumentsMap;
    }

    /**
     * @param argumentsMap
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipMediaApplicationCallRequest withArgumentsMap(java.util.Map<String, String> argumentsMap) {
        setArgumentsMap(argumentsMap);
        return this;
    }

    /**
     * Add a single ArgumentsMap entry
     *
     * @see CreateSipMediaApplicationCallRequest#withArgumentsMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipMediaApplicationCallRequest addArgumentsMapEntry(String key, String value) {
        if (null == this.argumentsMap) {
            this.argumentsMap = new java.util.HashMap<String, String>();
        }
        if (this.argumentsMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.argumentsMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ArgumentsMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipMediaApplicationCallRequest clearArgumentsMapEntries() {
        this.argumentsMap = null;
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
        if (getFromPhoneNumber() != null)
            sb.append("FromPhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getToPhoneNumber() != null)
            sb.append("ToPhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getSipMediaApplicationId() != null)
            sb.append("SipMediaApplicationId: ").append(getSipMediaApplicationId()).append(",");
        if (getSipHeaders() != null)
            sb.append("SipHeaders: ").append("***Sensitive Data Redacted***").append(",");
        if (getArgumentsMap() != null)
            sb.append("ArgumentsMap: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSipMediaApplicationCallRequest == false)
            return false;
        CreateSipMediaApplicationCallRequest other = (CreateSipMediaApplicationCallRequest) obj;
        if (other.getFromPhoneNumber() == null ^ this.getFromPhoneNumber() == null)
            return false;
        if (other.getFromPhoneNumber() != null && other.getFromPhoneNumber().equals(this.getFromPhoneNumber()) == false)
            return false;
        if (other.getToPhoneNumber() == null ^ this.getToPhoneNumber() == null)
            return false;
        if (other.getToPhoneNumber() != null && other.getToPhoneNumber().equals(this.getToPhoneNumber()) == false)
            return false;
        if (other.getSipMediaApplicationId() == null ^ this.getSipMediaApplicationId() == null)
            return false;
        if (other.getSipMediaApplicationId() != null && other.getSipMediaApplicationId().equals(this.getSipMediaApplicationId()) == false)
            return false;
        if (other.getSipHeaders() == null ^ this.getSipHeaders() == null)
            return false;
        if (other.getSipHeaders() != null && other.getSipHeaders().equals(this.getSipHeaders()) == false)
            return false;
        if (other.getArgumentsMap() == null ^ this.getArgumentsMap() == null)
            return false;
        if (other.getArgumentsMap() != null && other.getArgumentsMap().equals(this.getArgumentsMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromPhoneNumber() == null) ? 0 : getFromPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getToPhoneNumber() == null) ? 0 : getToPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getSipMediaApplicationId() == null) ? 0 : getSipMediaApplicationId().hashCode());
        hashCode = prime * hashCode + ((getSipHeaders() == null) ? 0 : getSipHeaders().hashCode());
        hashCode = prime * hashCode + ((getArgumentsMap() == null) ? 0 : getArgumentsMap().hashCode());
        return hashCode;
    }

    @Override
    public CreateSipMediaApplicationCallRequest clone() {
        return (CreateSipMediaApplicationCallRequest) super.clone();
    }

}

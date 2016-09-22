/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DecodeAuthorizationMessageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The encoded message that was returned with the response.
     * </p>
     */
    private String encodedMessage;

    /**
     * <p>
     * The encoded message that was returned with the response.
     * </p>
     * 
     * @param encodedMessage
     *        The encoded message that was returned with the response.
     */

    public void setEncodedMessage(String encodedMessage) {
        this.encodedMessage = encodedMessage;
    }

    /**
     * <p>
     * The encoded message that was returned with the response.
     * </p>
     * 
     * @return The encoded message that was returned with the response.
     */

    public String getEncodedMessage() {
        return this.encodedMessage;
    }

    /**
     * <p>
     * The encoded message that was returned with the response.
     * </p>
     * 
     * @param encodedMessage
     *        The encoded message that was returned with the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecodeAuthorizationMessageRequest withEncodedMessage(String encodedMessage) {
        setEncodedMessage(encodedMessage);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEncodedMessage() != null)
            sb.append("EncodedMessage: " + getEncodedMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecodeAuthorizationMessageRequest == false)
            return false;
        DecodeAuthorizationMessageRequest other = (DecodeAuthorizationMessageRequest) obj;
        if (other.getEncodedMessage() == null ^ this.getEncodedMessage() == null)
            return false;
        if (other.getEncodedMessage() != null && other.getEncodedMessage().equals(this.getEncodedMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncodedMessage() == null) ? 0 : getEncodedMessage().hashCode());
        return hashCode;
    }

    @Override
    public DecodeAuthorizationMessageRequest clone() {
        return (DecodeAuthorizationMessageRequest) super.clone();
    }
}

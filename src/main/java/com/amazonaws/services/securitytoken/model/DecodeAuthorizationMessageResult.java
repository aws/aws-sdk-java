/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;


/**
 * <p>
 * A document that contains additional information about the authorization status of a request from an encoded message that is returned in response to an
 * AWS request.
 * </p>
 */
public class DecodeAuthorizationMessageResult implements Serializable {

    /**
     * An XML document that contains the decoded message. For more
     * information, see <code>DecodeAuthorizationMessage</code>.
     */
    private String decodedMessage;

    /**
     * An XML document that contains the decoded message. For more
     * information, see <code>DecodeAuthorizationMessage</code>.
     *
     * @return An XML document that contains the decoded message. For more
     *         information, see <code>DecodeAuthorizationMessage</code>.
     */
    public String getDecodedMessage() {
        return decodedMessage;
    }
    
    /**
     * An XML document that contains the decoded message. For more
     * information, see <code>DecodeAuthorizationMessage</code>.
     *
     * @param decodedMessage An XML document that contains the decoded message. For more
     *         information, see <code>DecodeAuthorizationMessage</code>.
     */
    public void setDecodedMessage(String decodedMessage) {
        this.decodedMessage = decodedMessage;
    }
    
    /**
     * An XML document that contains the decoded message. For more
     * information, see <code>DecodeAuthorizationMessage</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decodedMessage An XML document that contains the decoded message. For more
     *         information, see <code>DecodeAuthorizationMessage</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DecodeAuthorizationMessageResult withDecodedMessage(String decodedMessage) {
        this.decodedMessage = decodedMessage;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDecodedMessage() != null) sb.append("DecodedMessage: " + getDecodedMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDecodedMessage() == null) ? 0 : getDecodedMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DecodeAuthorizationMessageResult == false) return false;
        DecodeAuthorizationMessageResult other = (DecodeAuthorizationMessageResult)obj;
        
        if (other.getDecodedMessage() == null ^ this.getDecodedMessage() == null) return false;
        if (other.getDecodedMessage() != null && other.getDecodedMessage().equals(this.getDecodedMessage()) == false) return false; 
        return true;
    }
    
}
    
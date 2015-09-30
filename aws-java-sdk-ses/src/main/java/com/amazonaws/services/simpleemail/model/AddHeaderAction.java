/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * When included in a receipt rule, this action adds a header to the
 * received email.
 * </p>
 * <p>
 * For information about adding a header using a receipt rule, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-add-header.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 */
public class AddHeaderAction implements Serializable, Cloneable {

    /**
     * The name of the header to add. Must be between 1 and 50 characters,
     * inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and
     * dashes only.
     */
    private String headerName;

    /**
     * Must be less than 2048 characters, and must not contain newline
     * characters ("\r" or "\n").
     */
    private String headerValue;

    /**
     * The name of the header to add. Must be between 1 and 50 characters,
     * inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and
     * dashes only.
     *
     * @return The name of the header to add. Must be between 1 and 50 characters,
     *         inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and
     *         dashes only.
     */
    public String getHeaderName() {
        return headerName;
    }
    
    /**
     * The name of the header to add. Must be between 1 and 50 characters,
     * inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and
     * dashes only.
     *
     * @param headerName The name of the header to add. Must be between 1 and 50 characters,
     *         inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and
     *         dashes only.
     */
    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }
    
    /**
     * The name of the header to add. Must be between 1 and 50 characters,
     * inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and
     * dashes only.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param headerName The name of the header to add. Must be between 1 and 50 characters,
     *         inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and
     *         dashes only.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddHeaderAction withHeaderName(String headerName) {
        this.headerName = headerName;
        return this;
    }

    /**
     * Must be less than 2048 characters, and must not contain newline
     * characters ("\r" or "\n").
     *
     * @return Must be less than 2048 characters, and must not contain newline
     *         characters ("\r" or "\n").
     */
    public String getHeaderValue() {
        return headerValue;
    }
    
    /**
     * Must be less than 2048 characters, and must not contain newline
     * characters ("\r" or "\n").
     *
     * @param headerValue Must be less than 2048 characters, and must not contain newline
     *         characters ("\r" or "\n").
     */
    public void setHeaderValue(String headerValue) {
        this.headerValue = headerValue;
    }
    
    /**
     * Must be less than 2048 characters, and must not contain newline
     * characters ("\r" or "\n").
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param headerValue Must be less than 2048 characters, and must not contain newline
     *         characters ("\r" or "\n").
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddHeaderAction withHeaderValue(String headerValue) {
        this.headerValue = headerValue;
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
        if (getHeaderName() != null) sb.append("HeaderName: " + getHeaderName() + ",");
        if (getHeaderValue() != null) sb.append("HeaderValue: " + getHeaderValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHeaderName() == null) ? 0 : getHeaderName().hashCode()); 
        hashCode = prime * hashCode + ((getHeaderValue() == null) ? 0 : getHeaderValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddHeaderAction == false) return false;
        AddHeaderAction other = (AddHeaderAction)obj;
        
        if (other.getHeaderName() == null ^ this.getHeaderName() == null) return false;
        if (other.getHeaderName() != null && other.getHeaderName().equals(this.getHeaderName()) == false) return false; 
        if (other.getHeaderValue() == null ^ this.getHeaderValue() == null) return false;
        if (other.getHeaderValue() != null && other.getHeaderValue().equals(this.getHeaderValue()) == false) return false; 
        return true;
    }
    
    @Override
    public AddHeaderAction clone() {
        try {
            return (AddHeaderAction) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    
/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * A complex type that contains information related to a Header
 */
public class OriginCustomHeader implements Serializable, Cloneable {

    /** The header's name. */
    private String headerName;
    /** The header's value. */
    private String headerValue;

    /**
     * The header's name.
     * 
     * @param headerName
     *        The header's name.
     */

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    /**
     * The header's name.
     * 
     * @return The header's name.
     */

    public String getHeaderName() {
        return this.headerName;
    }

    /**
     * The header's name.
     * 
     * @param headerName
     *        The header's name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public OriginCustomHeader withHeaderName(String headerName) {
        setHeaderName(headerName);
        return this;
    }

    /**
     * The header's value.
     * 
     * @param headerValue
     *        The header's value.
     */

    public void setHeaderValue(String headerValue) {
        this.headerValue = headerValue;
    }

    /**
     * The header's value.
     * 
     * @return The header's value.
     */

    public String getHeaderValue() {
        return this.headerValue;
    }

    /**
     * The header's value.
     * 
     * @param headerValue
     *        The header's value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public OriginCustomHeader withHeaderValue(String headerValue) {
        setHeaderValue(headerValue);
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
        if (getHeaderName() != null)
            sb.append("HeaderName: " + getHeaderName() + ",");
        if (getHeaderValue() != null)
            sb.append("HeaderValue: " + getHeaderValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginCustomHeader == false)
            return false;
        OriginCustomHeader other = (OriginCustomHeader) obj;
        if (other.getHeaderName() == null ^ this.getHeaderName() == null)
            return false;
        if (other.getHeaderName() != null
                && other.getHeaderName().equals(this.getHeaderName()) == false)
            return false;
        if (other.getHeaderValue() == null ^ this.getHeaderValue() == null)
            return false;
        if (other.getHeaderValue() != null
                && other.getHeaderValue().equals(this.getHeaderValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHeaderName() == null) ? 0 : getHeaderName().hashCode());
        hashCode = prime
                * hashCode
                + ((getHeaderValue() == null) ? 0 : getHeaderValue().hashCode());
        return hashCode;
    }

    @Override
    public OriginCustomHeader clone() {
        try {
            return (OriginCustomHeader) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * When included in a receipt rule, this action adds a header to the received email.
 * </p>
 * <p>
 * For information about adding a header using a receipt rule, see the <a
 * href="https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-add-header.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/AddHeaderAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddHeaderAction implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the header to add to the incoming message. The name must contain at least one character, and can
     * contain up to 50 characters. It consists of alphanumeric (a–z, A–Z, 0–9) characters and dashes.
     * </p>
     */
    private String headerName;
    /**
     * <p>
     * The content to include in the header. This value can contain up to 2048 characters. It can't contain newline (
     * <code>\n</code>) or carriage return (<code>\r</code>) characters.
     * </p>
     */
    private String headerValue;

    /**
     * <p>
     * The name of the header to add to the incoming message. The name must contain at least one character, and can
     * contain up to 50 characters. It consists of alphanumeric (a–z, A–Z, 0–9) characters and dashes.
     * </p>
     * 
     * @param headerName
     *        The name of the header to add to the incoming message. The name must contain at least one character, and
     *        can contain up to 50 characters. It consists of alphanumeric (a–z, A–Z, 0–9) characters and dashes.
     */

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    /**
     * <p>
     * The name of the header to add to the incoming message. The name must contain at least one character, and can
     * contain up to 50 characters. It consists of alphanumeric (a–z, A–Z, 0–9) characters and dashes.
     * </p>
     * 
     * @return The name of the header to add to the incoming message. The name must contain at least one character, and
     *         can contain up to 50 characters. It consists of alphanumeric (a–z, A–Z, 0–9) characters and dashes.
     */

    public String getHeaderName() {
        return this.headerName;
    }

    /**
     * <p>
     * The name of the header to add to the incoming message. The name must contain at least one character, and can
     * contain up to 50 characters. It consists of alphanumeric (a–z, A–Z, 0–9) characters and dashes.
     * </p>
     * 
     * @param headerName
     *        The name of the header to add to the incoming message. The name must contain at least one character, and
     *        can contain up to 50 characters. It consists of alphanumeric (a–z, A–Z, 0–9) characters and dashes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddHeaderAction withHeaderName(String headerName) {
        setHeaderName(headerName);
        return this;
    }

    /**
     * <p>
     * The content to include in the header. This value can contain up to 2048 characters. It can't contain newline (
     * <code>\n</code>) or carriage return (<code>\r</code>) characters.
     * </p>
     * 
     * @param headerValue
     *        The content to include in the header. This value can contain up to 2048 characters. It can't contain
     *        newline (<code>\n</code>) or carriage return (<code>\r</code>) characters.
     */

    public void setHeaderValue(String headerValue) {
        this.headerValue = headerValue;
    }

    /**
     * <p>
     * The content to include in the header. This value can contain up to 2048 characters. It can't contain newline (
     * <code>\n</code>) or carriage return (<code>\r</code>) characters.
     * </p>
     * 
     * @return The content to include in the header. This value can contain up to 2048 characters. It can't contain
     *         newline (<code>\n</code>) or carriage return (<code>\r</code>) characters.
     */

    public String getHeaderValue() {
        return this.headerValue;
    }

    /**
     * <p>
     * The content to include in the header. This value can contain up to 2048 characters. It can't contain newline (
     * <code>\n</code>) or carriage return (<code>\r</code>) characters.
     * </p>
     * 
     * @param headerValue
     *        The content to include in the header. This value can contain up to 2048 characters. It can't contain
     *        newline (<code>\n</code>) or carriage return (<code>\r</code>) characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddHeaderAction withHeaderValue(String headerValue) {
        setHeaderValue(headerValue);
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
        if (getHeaderName() != null)
            sb.append("HeaderName: ").append(getHeaderName()).append(",");
        if (getHeaderValue() != null)
            sb.append("HeaderValue: ").append(getHeaderValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddHeaderAction == false)
            return false;
        AddHeaderAction other = (AddHeaderAction) obj;
        if (other.getHeaderName() == null ^ this.getHeaderName() == null)
            return false;
        if (other.getHeaderName() != null && other.getHeaderName().equals(this.getHeaderName()) == false)
            return false;
        if (other.getHeaderValue() == null ^ this.getHeaderValue() == null)
            return false;
        if (other.getHeaderValue() != null && other.getHeaderValue().equals(this.getHeaderValue()) == false)
            return false;
        return true;
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
    public AddHeaderAction clone() {
        try {
            return (AddHeaderAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Additional X-headers to include in the Delivery Status Notification (DSN) when an email that Amazon SES receives on
 * your behalf bounces.
 * </p>
 * <p>
 * For information about receiving email through Amazon SES, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html">Amazon SES Developer Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ExtensionField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExtensionField implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the header to add. Must be between 1 and 50 characters, inclusive, and consist of alphanumeric (a-z,
     * A-Z, 0-9) characters and dashes only.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the header to add. Must be less than 2048 characters, and must not contain newline characters ("\r"
     * or "\n").
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the header to add. Must be between 1 and 50 characters, inclusive, and consist of alphanumeric (a-z,
     * A-Z, 0-9) characters and dashes only.
     * </p>
     * 
     * @param name
     *        The name of the header to add. Must be between 1 and 50 characters, inclusive, and consist of alphanumeric
     *        (a-z, A-Z, 0-9) characters and dashes only.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the header to add. Must be between 1 and 50 characters, inclusive, and consist of alphanumeric (a-z,
     * A-Z, 0-9) characters and dashes only.
     * </p>
     * 
     * @return The name of the header to add. Must be between 1 and 50 characters, inclusive, and consist of
     *         alphanumeric (a-z, A-Z, 0-9) characters and dashes only.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the header to add. Must be between 1 and 50 characters, inclusive, and consist of alphanumeric (a-z,
     * A-Z, 0-9) characters and dashes only.
     * </p>
     * 
     * @param name
     *        The name of the header to add. Must be between 1 and 50 characters, inclusive, and consist of alphanumeric
     *        (a-z, A-Z, 0-9) characters and dashes only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtensionField withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of the header to add. Must be less than 2048 characters, and must not contain newline characters ("\r"
     * or "\n").
     * </p>
     * 
     * @param value
     *        The value of the header to add. Must be less than 2048 characters, and must not contain newline characters
     *        ("\r" or "\n").
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the header to add. Must be less than 2048 characters, and must not contain newline characters ("\r"
     * or "\n").
     * </p>
     * 
     * @return The value of the header to add. Must be less than 2048 characters, and must not contain newline
     *         characters ("\r" or "\n").
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the header to add. Must be less than 2048 characters, and must not contain newline characters ("\r"
     * or "\n").
     * </p>
     * 
     * @param value
     *        The value of the header to add. Must be less than 2048 characters, and must not contain newline characters
     *        ("\r" or "\n").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtensionField withValue(String value) {
        setValue(value);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExtensionField == false)
            return false;
        ExtensionField other = (ExtensionField) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ExtensionField clone() {
        try {
            return (ExtensionField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

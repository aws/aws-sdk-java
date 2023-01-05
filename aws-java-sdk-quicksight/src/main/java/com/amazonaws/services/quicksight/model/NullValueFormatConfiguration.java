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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The options that determine the null value format configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NullValueFormatConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NullValueFormatConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the null string of null values.
     * </p>
     */
    private String nullString;

    /**
     * <p>
     * Determines the null string of null values.
     * </p>
     * 
     * @param nullString
     *        Determines the null string of null values.
     */

    public void setNullString(String nullString) {
        this.nullString = nullString;
    }

    /**
     * <p>
     * Determines the null string of null values.
     * </p>
     * 
     * @return Determines the null string of null values.
     */

    public String getNullString() {
        return this.nullString;
    }

    /**
     * <p>
     * Determines the null string of null values.
     * </p>
     * 
     * @param nullString
     *        Determines the null string of null values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NullValueFormatConfiguration withNullString(String nullString) {
        setNullString(nullString);
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
        if (getNullString() != null)
            sb.append("NullString: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NullValueFormatConfiguration == false)
            return false;
        NullValueFormatConfiguration other = (NullValueFormatConfiguration) obj;
        if (other.getNullString() == null ^ this.getNullString() == null)
            return false;
        if (other.getNullString() != null && other.getNullString().equals(this.getNullString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNullString() == null) ? 0 : getNullString().hashCode());
        return hashCode;
    }

    @Override
    public NullValueFormatConfiguration clone() {
        try {
            return (NullValueFormatConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NullValueFormatConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

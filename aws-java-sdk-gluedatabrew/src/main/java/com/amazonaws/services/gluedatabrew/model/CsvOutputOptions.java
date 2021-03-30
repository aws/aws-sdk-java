/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a set of options that define how DataBrew will write a comma-separated value (CSV) file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CsvOutputOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CsvOutputOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A single character that specifies the delimiter used to create CSV job output.
     * </p>
     */
    private String delimiter;

    /**
     * <p>
     * A single character that specifies the delimiter used to create CSV job output.
     * </p>
     * 
     * @param delimiter
     *        A single character that specifies the delimiter used to create CSV job output.
     */

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * A single character that specifies the delimiter used to create CSV job output.
     * </p>
     * 
     * @return A single character that specifies the delimiter used to create CSV job output.
     */

    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * <p>
     * A single character that specifies the delimiter used to create CSV job output.
     * </p>
     * 
     * @param delimiter
     *        A single character that specifies the delimiter used to create CSV job output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvOutputOptions withDelimiter(String delimiter) {
        setDelimiter(delimiter);
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
        if (getDelimiter() != null)
            sb.append("Delimiter: ").append(getDelimiter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CsvOutputOptions == false)
            return false;
        CsvOutputOptions other = (CsvOutputOptions) obj;
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null && other.getDelimiter().equals(this.getDelimiter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        return hashCode;
    }

    @Override
    public CsvOutputOptions clone() {
        try {
            return (CsvOutputOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.CsvOutputOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

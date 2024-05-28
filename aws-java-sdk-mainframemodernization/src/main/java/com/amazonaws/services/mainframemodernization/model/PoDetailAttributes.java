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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The supported properties for a PO type data set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/PoDetailAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PoDetailAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The character set encoding of the data set.
     * </p>
     */
    private String encoding;
    /**
     * <p>
     * The format of the data set records.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The character set encoding of the data set.
     * </p>
     * 
     * @param encoding
     *        The character set encoding of the data set.
     */

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * <p>
     * The character set encoding of the data set.
     * </p>
     * 
     * @return The character set encoding of the data set.
     */

    public String getEncoding() {
        return this.encoding;
    }

    /**
     * <p>
     * The character set encoding of the data set.
     * </p>
     * 
     * @param encoding
     *        The character set encoding of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PoDetailAttributes withEncoding(String encoding) {
        setEncoding(encoding);
        return this;
    }

    /**
     * <p>
     * The format of the data set records.
     * </p>
     * 
     * @param format
     *        The format of the data set records.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the data set records.
     * </p>
     * 
     * @return The format of the data set records.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the data set records.
     * </p>
     * 
     * @param format
     *        The format of the data set records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PoDetailAttributes withFormat(String format) {
        setFormat(format);
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
        if (getEncoding() != null)
            sb.append("Encoding: ").append(getEncoding()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PoDetailAttributes == false)
            return false;
        PoDetailAttributes other = (PoDetailAttributes) obj;
        if (other.getEncoding() == null ^ this.getEncoding() == null)
            return false;
        if (other.getEncoding() != null && other.getEncoding().equals(this.getEncoding()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncoding() == null) ? 0 : getEncoding().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public PoDetailAttributes clone() {
        try {
            return (PoDetailAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.PoDetailAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

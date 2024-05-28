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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/PoAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PoAttributes implements Serializable, Cloneable, StructuredPojo {

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
     * An array containing one or more filename extensions, allowing you to specify which files to be included as PDS
     * member.
     * </p>
     */
    private java.util.List<String> memberFileExtensions;

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

    public PoAttributes withEncoding(String encoding) {
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

    public PoAttributes withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * An array containing one or more filename extensions, allowing you to specify which files to be included as PDS
     * member.
     * </p>
     * 
     * @return An array containing one or more filename extensions, allowing you to specify which files to be included
     *         as PDS member.
     */

    public java.util.List<String> getMemberFileExtensions() {
        return memberFileExtensions;
    }

    /**
     * <p>
     * An array containing one or more filename extensions, allowing you to specify which files to be included as PDS
     * member.
     * </p>
     * 
     * @param memberFileExtensions
     *        An array containing one or more filename extensions, allowing you to specify which files to be included as
     *        PDS member.
     */

    public void setMemberFileExtensions(java.util.Collection<String> memberFileExtensions) {
        if (memberFileExtensions == null) {
            this.memberFileExtensions = null;
            return;
        }

        this.memberFileExtensions = new java.util.ArrayList<String>(memberFileExtensions);
    }

    /**
     * <p>
     * An array containing one or more filename extensions, allowing you to specify which files to be included as PDS
     * member.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberFileExtensions(java.util.Collection)} or {@link #withMemberFileExtensions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param memberFileExtensions
     *        An array containing one or more filename extensions, allowing you to specify which files to be included as
     *        PDS member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PoAttributes withMemberFileExtensions(String... memberFileExtensions) {
        if (this.memberFileExtensions == null) {
            setMemberFileExtensions(new java.util.ArrayList<String>(memberFileExtensions.length));
        }
        for (String ele : memberFileExtensions) {
            this.memberFileExtensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing one or more filename extensions, allowing you to specify which files to be included as PDS
     * member.
     * </p>
     * 
     * @param memberFileExtensions
     *        An array containing one or more filename extensions, allowing you to specify which files to be included as
     *        PDS member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PoAttributes withMemberFileExtensions(java.util.Collection<String> memberFileExtensions) {
        setMemberFileExtensions(memberFileExtensions);
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
            sb.append("Format: ").append(getFormat()).append(",");
        if (getMemberFileExtensions() != null)
            sb.append("MemberFileExtensions: ").append(getMemberFileExtensions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PoAttributes == false)
            return false;
        PoAttributes other = (PoAttributes) obj;
        if (other.getEncoding() == null ^ this.getEncoding() == null)
            return false;
        if (other.getEncoding() != null && other.getEncoding().equals(this.getEncoding()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getMemberFileExtensions() == null ^ this.getMemberFileExtensions() == null)
            return false;
        if (other.getMemberFileExtensions() != null && other.getMemberFileExtensions().equals(this.getMemberFileExtensions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncoding() == null) ? 0 : getEncoding().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getMemberFileExtensions() == null) ? 0 : getMemberFileExtensions().hashCode());
        return hashCode;
    }

    @Override
    public PoAttributes clone() {
        try {
            return (PoAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.PoAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

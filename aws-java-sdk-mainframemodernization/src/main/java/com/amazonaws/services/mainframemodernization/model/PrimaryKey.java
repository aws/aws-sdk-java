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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The primary key for a KSDS data set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/PrimaryKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrimaryKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A strictly positive integer value representing the length of the primary key.
     * </p>
     */
    private Integer length;
    /**
     * <p>
     * A name for the Primary Key.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A positive integer value representing the offset to mark the start of the primary key in the record byte array.
     * </p>
     */
    private Integer offset;

    /**
     * <p>
     * A strictly positive integer value representing the length of the primary key.
     * </p>
     * 
     * @param length
     *        A strictly positive integer value representing the length of the primary key.
     */

    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * <p>
     * A strictly positive integer value representing the length of the primary key.
     * </p>
     * 
     * @return A strictly positive integer value representing the length of the primary key.
     */

    public Integer getLength() {
        return this.length;
    }

    /**
     * <p>
     * A strictly positive integer value representing the length of the primary key.
     * </p>
     * 
     * @param length
     *        A strictly positive integer value representing the length of the primary key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrimaryKey withLength(Integer length) {
        setLength(length);
        return this;
    }

    /**
     * <p>
     * A name for the Primary Key.
     * </p>
     * 
     * @param name
     *        A name for the Primary Key.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the Primary Key.
     * </p>
     * 
     * @return A name for the Primary Key.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the Primary Key.
     * </p>
     * 
     * @param name
     *        A name for the Primary Key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrimaryKey withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A positive integer value representing the offset to mark the start of the primary key in the record byte array.
     * </p>
     * 
     * @param offset
     *        A positive integer value representing the offset to mark the start of the primary key in the record byte
     *        array.
     */

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * <p>
     * A positive integer value representing the offset to mark the start of the primary key in the record byte array.
     * </p>
     * 
     * @return A positive integer value representing the offset to mark the start of the primary key in the record byte
     *         array.
     */

    public Integer getOffset() {
        return this.offset;
    }

    /**
     * <p>
     * A positive integer value representing the offset to mark the start of the primary key in the record byte array.
     * </p>
     * 
     * @param offset
     *        A positive integer value representing the offset to mark the start of the primary key in the record byte
     *        array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrimaryKey withOffset(Integer offset) {
        setOffset(offset);
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
        if (getLength() != null)
            sb.append("Length: ").append(getLength()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOffset() != null)
            sb.append("Offset: ").append(getOffset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrimaryKey == false)
            return false;
        PrimaryKey other = (PrimaryKey) obj;
        if (other.getLength() == null ^ this.getLength() == null)
            return false;
        if (other.getLength() != null && other.getLength().equals(this.getLength()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOffset() == null ^ this.getOffset() == null)
            return false;
        if (other.getOffset() != null && other.getOffset().equals(this.getOffset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLength() == null) ? 0 : getLength().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
        return hashCode;
    }

    @Override
    public PrimaryKey clone() {
        try {
            return (PrimaryKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.PrimaryKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

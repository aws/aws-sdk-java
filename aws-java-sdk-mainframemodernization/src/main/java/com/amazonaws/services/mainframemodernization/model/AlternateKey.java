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
 * Defines an alternate key. This value is optional. A legacy data set might not have any alternate key defined but if
 * those alternate keys definitions exist, provide them, as some applications will make use of them.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/AlternateKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlternateKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the alternate key values are supposed to be unique for the given data set.
     * </p>
     */
    private Boolean allowDuplicates;
    /**
     * <p>
     * A strictly positive integer value representing the length of the alternate key.
     * </p>
     */
    private Integer length;
    /**
     * <p>
     * The name of the alternate key.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A positive integer value representing the offset to mark the start of the alternate key part in the record byte
     * array.
     * </p>
     */
    private Integer offset;

    /**
     * <p>
     * Indicates whether the alternate key values are supposed to be unique for the given data set.
     * </p>
     * 
     * @param allowDuplicates
     *        Indicates whether the alternate key values are supposed to be unique for the given data set.
     */

    public void setAllowDuplicates(Boolean allowDuplicates) {
        this.allowDuplicates = allowDuplicates;
    }

    /**
     * <p>
     * Indicates whether the alternate key values are supposed to be unique for the given data set.
     * </p>
     * 
     * @return Indicates whether the alternate key values are supposed to be unique for the given data set.
     */

    public Boolean getAllowDuplicates() {
        return this.allowDuplicates;
    }

    /**
     * <p>
     * Indicates whether the alternate key values are supposed to be unique for the given data set.
     * </p>
     * 
     * @param allowDuplicates
     *        Indicates whether the alternate key values are supposed to be unique for the given data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateKey withAllowDuplicates(Boolean allowDuplicates) {
        setAllowDuplicates(allowDuplicates);
        return this;
    }

    /**
     * <p>
     * Indicates whether the alternate key values are supposed to be unique for the given data set.
     * </p>
     * 
     * @return Indicates whether the alternate key values are supposed to be unique for the given data set.
     */

    public Boolean isAllowDuplicates() {
        return this.allowDuplicates;
    }

    /**
     * <p>
     * A strictly positive integer value representing the length of the alternate key.
     * </p>
     * 
     * @param length
     *        A strictly positive integer value representing the length of the alternate key.
     */

    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * <p>
     * A strictly positive integer value representing the length of the alternate key.
     * </p>
     * 
     * @return A strictly positive integer value representing the length of the alternate key.
     */

    public Integer getLength() {
        return this.length;
    }

    /**
     * <p>
     * A strictly positive integer value representing the length of the alternate key.
     * </p>
     * 
     * @param length
     *        A strictly positive integer value representing the length of the alternate key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateKey withLength(Integer length) {
        setLength(length);
        return this;
    }

    /**
     * <p>
     * The name of the alternate key.
     * </p>
     * 
     * @param name
     *        The name of the alternate key.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the alternate key.
     * </p>
     * 
     * @return The name of the alternate key.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the alternate key.
     * </p>
     * 
     * @param name
     *        The name of the alternate key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateKey withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A positive integer value representing the offset to mark the start of the alternate key part in the record byte
     * array.
     * </p>
     * 
     * @param offset
     *        A positive integer value representing the offset to mark the start of the alternate key part in the record
     *        byte array.
     */

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * <p>
     * A positive integer value representing the offset to mark the start of the alternate key part in the record byte
     * array.
     * </p>
     * 
     * @return A positive integer value representing the offset to mark the start of the alternate key part in the
     *         record byte array.
     */

    public Integer getOffset() {
        return this.offset;
    }

    /**
     * <p>
     * A positive integer value representing the offset to mark the start of the alternate key part in the record byte
     * array.
     * </p>
     * 
     * @param offset
     *        A positive integer value representing the offset to mark the start of the alternate key part in the record
     *        byte array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateKey withOffset(Integer offset) {
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
        if (getAllowDuplicates() != null)
            sb.append("AllowDuplicates: ").append(getAllowDuplicates()).append(",");
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

        if (obj instanceof AlternateKey == false)
            return false;
        AlternateKey other = (AlternateKey) obj;
        if (other.getAllowDuplicates() == null ^ this.getAllowDuplicates() == null)
            return false;
        if (other.getAllowDuplicates() != null && other.getAllowDuplicates().equals(this.getAllowDuplicates()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getAllowDuplicates() == null) ? 0 : getAllowDuplicates().hashCode());
        hashCode = prime * hashCode + ((getLength() == null) ? 0 : getLength().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
        return hashCode;
    }

    @Override
    public AlternateKey clone() {
        try {
            return (AlternateKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.AlternateKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

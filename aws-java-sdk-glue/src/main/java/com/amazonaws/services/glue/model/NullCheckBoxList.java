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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents whether certain values are recognized as null values for removal.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/NullCheckBoxList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NullCheckBoxList implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies that an empty string is considered as a null value.
     * </p>
     */
    private Boolean isEmpty;
    /**
     * <p>
     * Specifies that a value spelling out the word 'null' is considered as a null value.
     * </p>
     */
    private Boolean isNullString;
    /**
     * <p>
     * Specifies that an integer value of -1 is considered as a null value.
     * </p>
     */
    private Boolean isNegOne;

    /**
     * <p>
     * Specifies that an empty string is considered as a null value.
     * </p>
     * 
     * @param isEmpty
     *        Specifies that an empty string is considered as a null value.
     */

    public void setIsEmpty(Boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    /**
     * <p>
     * Specifies that an empty string is considered as a null value.
     * </p>
     * 
     * @return Specifies that an empty string is considered as a null value.
     */

    public Boolean getIsEmpty() {
        return this.isEmpty;
    }

    /**
     * <p>
     * Specifies that an empty string is considered as a null value.
     * </p>
     * 
     * @param isEmpty
     *        Specifies that an empty string is considered as a null value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NullCheckBoxList withIsEmpty(Boolean isEmpty) {
        setIsEmpty(isEmpty);
        return this;
    }

    /**
     * <p>
     * Specifies that an empty string is considered as a null value.
     * </p>
     * 
     * @return Specifies that an empty string is considered as a null value.
     */

    public Boolean isEmpty() {
        return this.isEmpty;
    }

    /**
     * <p>
     * Specifies that a value spelling out the word 'null' is considered as a null value.
     * </p>
     * 
     * @param isNullString
     *        Specifies that a value spelling out the word 'null' is considered as a null value.
     */

    public void setIsNullString(Boolean isNullString) {
        this.isNullString = isNullString;
    }

    /**
     * <p>
     * Specifies that a value spelling out the word 'null' is considered as a null value.
     * </p>
     * 
     * @return Specifies that a value spelling out the word 'null' is considered as a null value.
     */

    public Boolean getIsNullString() {
        return this.isNullString;
    }

    /**
     * <p>
     * Specifies that a value spelling out the word 'null' is considered as a null value.
     * </p>
     * 
     * @param isNullString
     *        Specifies that a value spelling out the word 'null' is considered as a null value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NullCheckBoxList withIsNullString(Boolean isNullString) {
        setIsNullString(isNullString);
        return this;
    }

    /**
     * <p>
     * Specifies that a value spelling out the word 'null' is considered as a null value.
     * </p>
     * 
     * @return Specifies that a value spelling out the word 'null' is considered as a null value.
     */

    public Boolean isNullString() {
        return this.isNullString;
    }

    /**
     * <p>
     * Specifies that an integer value of -1 is considered as a null value.
     * </p>
     * 
     * @param isNegOne
     *        Specifies that an integer value of -1 is considered as a null value.
     */

    public void setIsNegOne(Boolean isNegOne) {
        this.isNegOne = isNegOne;
    }

    /**
     * <p>
     * Specifies that an integer value of -1 is considered as a null value.
     * </p>
     * 
     * @return Specifies that an integer value of -1 is considered as a null value.
     */

    public Boolean getIsNegOne() {
        return this.isNegOne;
    }

    /**
     * <p>
     * Specifies that an integer value of -1 is considered as a null value.
     * </p>
     * 
     * @param isNegOne
     *        Specifies that an integer value of -1 is considered as a null value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NullCheckBoxList withIsNegOne(Boolean isNegOne) {
        setIsNegOne(isNegOne);
        return this;
    }

    /**
     * <p>
     * Specifies that an integer value of -1 is considered as a null value.
     * </p>
     * 
     * @return Specifies that an integer value of -1 is considered as a null value.
     */

    public Boolean isNegOne() {
        return this.isNegOne;
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
        if (getIsEmpty() != null)
            sb.append("IsEmpty: ").append(getIsEmpty()).append(",");
        if (getIsNullString() != null)
            sb.append("IsNullString: ").append(getIsNullString()).append(",");
        if (getIsNegOne() != null)
            sb.append("IsNegOne: ").append(getIsNegOne());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NullCheckBoxList == false)
            return false;
        NullCheckBoxList other = (NullCheckBoxList) obj;
        if (other.getIsEmpty() == null ^ this.getIsEmpty() == null)
            return false;
        if (other.getIsEmpty() != null && other.getIsEmpty().equals(this.getIsEmpty()) == false)
            return false;
        if (other.getIsNullString() == null ^ this.getIsNullString() == null)
            return false;
        if (other.getIsNullString() != null && other.getIsNullString().equals(this.getIsNullString()) == false)
            return false;
        if (other.getIsNegOne() == null ^ this.getIsNegOne() == null)
            return false;
        if (other.getIsNegOne() != null && other.getIsNegOne().equals(this.getIsNegOne()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsEmpty() == null) ? 0 : getIsEmpty().hashCode());
        hashCode = prime * hashCode + ((getIsNullString() == null) ? 0 : getIsNullString().hashCode());
        hashCode = prime * hashCode + ((getIsNegOne() == null) ? 0 : getIsNegOne().hashCode());
        return hashCode;
    }

    @Override
    public NullCheckBoxList clone() {
        try {
            return (NullCheckBoxList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.NullCheckBoxListMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that can contain an Amazon Ion value in multiple encoding formats.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ValueHolder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValueHolder implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon Ion plaintext value contained in a <code>ValueHolder</code> structure.
     * </p>
     */
    private String ionText;

    /**
     * <p>
     * An Amazon Ion plaintext value contained in a <code>ValueHolder</code> structure.
     * </p>
     * 
     * @param ionText
     *        An Amazon Ion plaintext value contained in a <code>ValueHolder</code> structure.
     */

    public void setIonText(String ionText) {
        this.ionText = ionText;
    }

    /**
     * <p>
     * An Amazon Ion plaintext value contained in a <code>ValueHolder</code> structure.
     * </p>
     * 
     * @return An Amazon Ion plaintext value contained in a <code>ValueHolder</code> structure.
     */

    public String getIonText() {
        return this.ionText;
    }

    /**
     * <p>
     * An Amazon Ion plaintext value contained in a <code>ValueHolder</code> structure.
     * </p>
     * 
     * @param ionText
     *        An Amazon Ion plaintext value contained in a <code>ValueHolder</code> structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValueHolder withIonText(String ionText) {
        setIonText(ionText);
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
        if (getIonText() != null)
            sb.append("IonText: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValueHolder == false)
            return false;
        ValueHolder other = (ValueHolder) obj;
        if (other.getIonText() == null ^ this.getIonText() == null)
            return false;
        if (other.getIonText() != null && other.getIonText().equals(this.getIonText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIonText() == null) ? 0 : getIonText().hashCode());
        return hashCode;
    }

    @Override
    public ValueHolder clone() {
        try {
            return (ValueHolder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldb.model.transform.ValueHolderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

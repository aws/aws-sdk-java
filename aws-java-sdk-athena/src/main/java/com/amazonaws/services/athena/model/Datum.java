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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A piece of data (a field in the table).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/Datum" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Datum implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the datum.
     * </p>
     */
    private String varCharValue;

    /**
     * <p>
     * The value of the datum.
     * </p>
     * 
     * @param varCharValue
     *        The value of the datum.
     */

    public void setVarCharValue(String varCharValue) {
        this.varCharValue = varCharValue;
    }

    /**
     * <p>
     * The value of the datum.
     * </p>
     * 
     * @return The value of the datum.
     */

    public String getVarCharValue() {
        return this.varCharValue;
    }

    /**
     * <p>
     * The value of the datum.
     * </p>
     * 
     * @param varCharValue
     *        The value of the datum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datum withVarCharValue(String varCharValue) {
        setVarCharValue(varCharValue);
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
        if (getVarCharValue() != null)
            sb.append("VarCharValue: ").append(getVarCharValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Datum == false)
            return false;
        Datum other = (Datum) obj;
        if (other.getVarCharValue() == null ^ this.getVarCharValue() == null)
            return false;
        if (other.getVarCharValue() != null && other.getVarCharValue().equals(this.getVarCharValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVarCharValue() == null) ? 0 : getVarCharValue().hashCode());
        return hashCode;
    }

    @Override
    public Datum clone() {
        try {
            return (Datum) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.DatumMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * CellInput object contains the data needed to create or update cells in a table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/CellInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CellInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Fact represents the data that is entered into a cell. This data can be free text or a formula. Formulas need to
     * start with the equals (=) sign.
     * </p>
     */
    private String fact;

    /**
     * <p>
     * Fact represents the data that is entered into a cell. This data can be free text or a formula. Formulas need to
     * start with the equals (=) sign.
     * </p>
     * 
     * @param fact
     *        Fact represents the data that is entered into a cell. This data can be free text or a formula. Formulas
     *        need to start with the equals (=) sign.
     */

    public void setFact(String fact) {
        this.fact = fact;
    }

    /**
     * <p>
     * Fact represents the data that is entered into a cell. This data can be free text or a formula. Formulas need to
     * start with the equals (=) sign.
     * </p>
     * 
     * @return Fact represents the data that is entered into a cell. This data can be free text or a formula. Formulas
     *         need to start with the equals (=) sign.
     */

    public String getFact() {
        return this.fact;
    }

    /**
     * <p>
     * Fact represents the data that is entered into a cell. This data can be free text or a formula. Formulas need to
     * start with the equals (=) sign.
     * </p>
     * 
     * @param fact
     *        Fact represents the data that is entered into a cell. This data can be free text or a formula. Formulas
     *        need to start with the equals (=) sign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellInput withFact(String fact) {
        setFact(fact);
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
        if (getFact() != null)
            sb.append("Fact: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CellInput == false)
            return false;
        CellInput other = (CellInput) obj;
        if (other.getFact() == null ^ this.getFact() == null)
            return false;
        if (other.getFact() != null && other.getFact().equals(this.getFact()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFact() == null) ? 0 : getFact().hashCode());
        return hashCode;
    }

    @Override
    public CellInput clone() {
        try {
            return (CellInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.CellInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

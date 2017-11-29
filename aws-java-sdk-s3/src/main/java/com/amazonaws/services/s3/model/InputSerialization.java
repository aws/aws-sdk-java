/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * Describes the serialization format of the object.
 *
 * @see SelectParameters#inputSerialization
 */
public class InputSerialization implements Serializable, Cloneable {

    /**
     * Describes the serialization of a CSV-encoded object.
     */
    private CSVInput csv;

    /**
     * @return the serialization of a CSV-encoded object.
     */
    public CSVInput getCsv() {
        return csv;
    }

    /**
     * Sets the serialization of a CSV-encoded object.
     *
     * @param csv The new csv value.
     */
    public void setCsv(CSVInput csv) {
        this.csv = csv;
    }

    /**
     * Sets the serialization of a CSV-encoded object.
     *
     * @param csvInput The new csv value.
     * @return This object for method chaining.
     */
    public InputSerialization withCsv(CSVInput csvInput) {
        setCsv(csvInput);
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ! (obj instanceof InputSerialization)) {
            return false;
        }

        final InputSerialization other = (InputSerialization) obj;

        if (other.getCsv() == null ^ this.getCsv() == null)
            return false;
        if (other.getCsv() != null && !other.getCsv().equals(this.getCsv()))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCsv() == null) ? 0 : getCsv().hashCode());
        return hashCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCsv() != null)
            sb.append("Csv: ").append(getCsv());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public InputSerialization clone() {
        try {
            return (InputSerialization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

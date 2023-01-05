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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The field wells of a <code>FilledMapVisual</code>.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FilledMapFieldWells" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilledMapFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aggregated field well of the filled map.
     * </p>
     */
    private FilledMapAggregatedFieldWells filledMapAggregatedFieldWells;

    /**
     * <p>
     * The aggregated field well of the filled map.
     * </p>
     * 
     * @param filledMapAggregatedFieldWells
     *        The aggregated field well of the filled map.
     */

    public void setFilledMapAggregatedFieldWells(FilledMapAggregatedFieldWells filledMapAggregatedFieldWells) {
        this.filledMapAggregatedFieldWells = filledMapAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field well of the filled map.
     * </p>
     * 
     * @return The aggregated field well of the filled map.
     */

    public FilledMapAggregatedFieldWells getFilledMapAggregatedFieldWells() {
        return this.filledMapAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field well of the filled map.
     * </p>
     * 
     * @param filledMapAggregatedFieldWells
     *        The aggregated field well of the filled map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilledMapFieldWells withFilledMapAggregatedFieldWells(FilledMapAggregatedFieldWells filledMapAggregatedFieldWells) {
        setFilledMapAggregatedFieldWells(filledMapAggregatedFieldWells);
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
        if (getFilledMapAggregatedFieldWells() != null)
            sb.append("FilledMapAggregatedFieldWells: ").append(getFilledMapAggregatedFieldWells());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilledMapFieldWells == false)
            return false;
        FilledMapFieldWells other = (FilledMapFieldWells) obj;
        if (other.getFilledMapAggregatedFieldWells() == null ^ this.getFilledMapAggregatedFieldWells() == null)
            return false;
        if (other.getFilledMapAggregatedFieldWells() != null
                && other.getFilledMapAggregatedFieldWells().equals(this.getFilledMapAggregatedFieldWells()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilledMapAggregatedFieldWells() == null) ? 0 : getFilledMapAggregatedFieldWells().hashCode());
        return hashCode;
    }

    @Override
    public FilledMapFieldWells clone() {
        try {
            return (FilledMapFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FilledMapFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

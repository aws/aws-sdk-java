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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DimensionMapping" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DimensionMapping implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String sourceColumn;
    /**
     * <p>
     * </p>
     */
    private String destinationColumn;

    /**
     * <p/>
     * 
     * @param sourceColumn
     */

    public void setSourceColumn(String sourceColumn) {
        this.sourceColumn = sourceColumn;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getSourceColumn() {
        return this.sourceColumn;
    }

    /**
     * <p/>
     * 
     * @param sourceColumn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionMapping withSourceColumn(String sourceColumn) {
        setSourceColumn(sourceColumn);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param destinationColumn
     */

    public void setDestinationColumn(String destinationColumn) {
        this.destinationColumn = destinationColumn;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getDestinationColumn() {
        return this.destinationColumn;
    }

    /**
     * <p>
     * </p>
     * 
     * @param destinationColumn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionMapping withDestinationColumn(String destinationColumn) {
        setDestinationColumn(destinationColumn);
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
        if (getSourceColumn() != null)
            sb.append("SourceColumn: ").append(getSourceColumn()).append(",");
        if (getDestinationColumn() != null)
            sb.append("DestinationColumn: ").append(getDestinationColumn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DimensionMapping == false)
            return false;
        DimensionMapping other = (DimensionMapping) obj;
        if (other.getSourceColumn() == null ^ this.getSourceColumn() == null)
            return false;
        if (other.getSourceColumn() != null && other.getSourceColumn().equals(this.getSourceColumn()) == false)
            return false;
        if (other.getDestinationColumn() == null ^ this.getDestinationColumn() == null)
            return false;
        if (other.getDestinationColumn() != null && other.getDestinationColumn().equals(this.getDestinationColumn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceColumn() == null) ? 0 : getSourceColumn().hashCode());
        hashCode = prime * hashCode + ((getDestinationColumn() == null) ? 0 : getDestinationColumn().hashCode());
        return hashCode;
    }

    @Override
    public DimensionMapping clone() {
        try {
            return (DimensionMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.DimensionMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

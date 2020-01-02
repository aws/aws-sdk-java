/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about rows for a data set SPICE ingestion.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RowInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RowInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of rows that were ingested.
     * </p>
     */
    private Long rowsIngested;
    /**
     * <p>
     * The number of rows that were not ingested.
     * </p>
     */
    private Long rowsDropped;

    /**
     * <p>
     * The number of rows that were ingested.
     * </p>
     * 
     * @param rowsIngested
     *        The number of rows that were ingested.
     */

    public void setRowsIngested(Long rowsIngested) {
        this.rowsIngested = rowsIngested;
    }

    /**
     * <p>
     * The number of rows that were ingested.
     * </p>
     * 
     * @return The number of rows that were ingested.
     */

    public Long getRowsIngested() {
        return this.rowsIngested;
    }

    /**
     * <p>
     * The number of rows that were ingested.
     * </p>
     * 
     * @param rowsIngested
     *        The number of rows that were ingested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowInfo withRowsIngested(Long rowsIngested) {
        setRowsIngested(rowsIngested);
        return this;
    }

    /**
     * <p>
     * The number of rows that were not ingested.
     * </p>
     * 
     * @param rowsDropped
     *        The number of rows that were not ingested.
     */

    public void setRowsDropped(Long rowsDropped) {
        this.rowsDropped = rowsDropped;
    }

    /**
     * <p>
     * The number of rows that were not ingested.
     * </p>
     * 
     * @return The number of rows that were not ingested.
     */

    public Long getRowsDropped() {
        return this.rowsDropped;
    }

    /**
     * <p>
     * The number of rows that were not ingested.
     * </p>
     * 
     * @param rowsDropped
     *        The number of rows that were not ingested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowInfo withRowsDropped(Long rowsDropped) {
        setRowsDropped(rowsDropped);
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
        if (getRowsIngested() != null)
            sb.append("RowsIngested: ").append(getRowsIngested()).append(",");
        if (getRowsDropped() != null)
            sb.append("RowsDropped: ").append(getRowsDropped());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RowInfo == false)
            return false;
        RowInfo other = (RowInfo) obj;
        if (other.getRowsIngested() == null ^ this.getRowsIngested() == null)
            return false;
        if (other.getRowsIngested() != null && other.getRowsIngested().equals(this.getRowsIngested()) == false)
            return false;
        if (other.getRowsDropped() == null ^ this.getRowsDropped() == null)
            return false;
        if (other.getRowsDropped() != null && other.getRowsDropped().equals(this.getRowsDropped()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRowsIngested() == null) ? 0 : getRowsIngested().hashCode());
        hashCode = prime * hashCode + ((getRowsDropped() == null) ? 0 : getRowsDropped().hashCode());
        return hashCode;
    }

    @Override
    public RowInfo clone() {
        try {
            return (RowInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RowInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

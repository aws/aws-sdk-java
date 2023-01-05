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
 * The source controls that are used in a <code>CascadingControlConfiguration</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CascadingControlSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CascadingControlSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source sheet control ID of a <code>CascadingControlSource</code>.
     * </p>
     */
    private String sourceSheetControlId;
    /**
     * <p>
     * The column identifier that determines which column to look up for the source sheet control.
     * </p>
     */
    private ColumnIdentifier columnToMatch;

    /**
     * <p>
     * The source sheet control ID of a <code>CascadingControlSource</code>.
     * </p>
     * 
     * @param sourceSheetControlId
     *        The source sheet control ID of a <code>CascadingControlSource</code>.
     */

    public void setSourceSheetControlId(String sourceSheetControlId) {
        this.sourceSheetControlId = sourceSheetControlId;
    }

    /**
     * <p>
     * The source sheet control ID of a <code>CascadingControlSource</code>.
     * </p>
     * 
     * @return The source sheet control ID of a <code>CascadingControlSource</code>.
     */

    public String getSourceSheetControlId() {
        return this.sourceSheetControlId;
    }

    /**
     * <p>
     * The source sheet control ID of a <code>CascadingControlSource</code>.
     * </p>
     * 
     * @param sourceSheetControlId
     *        The source sheet control ID of a <code>CascadingControlSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CascadingControlSource withSourceSheetControlId(String sourceSheetControlId) {
        setSourceSheetControlId(sourceSheetControlId);
        return this;
    }

    /**
     * <p>
     * The column identifier that determines which column to look up for the source sheet control.
     * </p>
     * 
     * @param columnToMatch
     *        The column identifier that determines which column to look up for the source sheet control.
     */

    public void setColumnToMatch(ColumnIdentifier columnToMatch) {
        this.columnToMatch = columnToMatch;
    }

    /**
     * <p>
     * The column identifier that determines which column to look up for the source sheet control.
     * </p>
     * 
     * @return The column identifier that determines which column to look up for the source sheet control.
     */

    public ColumnIdentifier getColumnToMatch() {
        return this.columnToMatch;
    }

    /**
     * <p>
     * The column identifier that determines which column to look up for the source sheet control.
     * </p>
     * 
     * @param columnToMatch
     *        The column identifier that determines which column to look up for the source sheet control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CascadingControlSource withColumnToMatch(ColumnIdentifier columnToMatch) {
        setColumnToMatch(columnToMatch);
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
        if (getSourceSheetControlId() != null)
            sb.append("SourceSheetControlId: ").append(getSourceSheetControlId()).append(",");
        if (getColumnToMatch() != null)
            sb.append("ColumnToMatch: ").append(getColumnToMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CascadingControlSource == false)
            return false;
        CascadingControlSource other = (CascadingControlSource) obj;
        if (other.getSourceSheetControlId() == null ^ this.getSourceSheetControlId() == null)
            return false;
        if (other.getSourceSheetControlId() != null && other.getSourceSheetControlId().equals(this.getSourceSheetControlId()) == false)
            return false;
        if (other.getColumnToMatch() == null ^ this.getColumnToMatch() == null)
            return false;
        if (other.getColumnToMatch() != null && other.getColumnToMatch().equals(this.getColumnToMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceSheetControlId() == null) ? 0 : getSourceSheetControlId().hashCode());
        hashCode = prime * hashCode + ((getColumnToMatch() == null) ? 0 : getColumnToMatch().hashCode());
        return hashCode;
    }

    @Override
    public CascadingControlSource clone() {
        try {
            return (CascadingControlSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CascadingControlSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

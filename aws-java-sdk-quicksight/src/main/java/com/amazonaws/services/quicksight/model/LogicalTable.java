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
 * A <i>logical table</i> is a unit that joins and that data transformations operate on. A logical table has a source,
 * which can be either a physical table or result of a join. When a logical table points to a physical table, the
 * logical table acts as a mutable copy of that physical table through transform operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/LogicalTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogicalTable implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A display name for the logical table.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * Transform operations that act on this logical table.
     * </p>
     */
    private java.util.List<TransformOperation> dataTransforms;
    /**
     * <p>
     * Source of this logical table.
     * </p>
     */
    private LogicalTableSource source;

    /**
     * <p>
     * A display name for the logical table.
     * </p>
     * 
     * @param alias
     *        A display name for the logical table.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * A display name for the logical table.
     * </p>
     * 
     * @return A display name for the logical table.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * A display name for the logical table.
     * </p>
     * 
     * @param alias
     *        A display name for the logical table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogicalTable withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * Transform operations that act on this logical table.
     * </p>
     * 
     * @return Transform operations that act on this logical table.
     */

    public java.util.List<TransformOperation> getDataTransforms() {
        return dataTransforms;
    }

    /**
     * <p>
     * Transform operations that act on this logical table.
     * </p>
     * 
     * @param dataTransforms
     *        Transform operations that act on this logical table.
     */

    public void setDataTransforms(java.util.Collection<TransformOperation> dataTransforms) {
        if (dataTransforms == null) {
            this.dataTransforms = null;
            return;
        }

        this.dataTransforms = new java.util.ArrayList<TransformOperation>(dataTransforms);
    }

    /**
     * <p>
     * Transform operations that act on this logical table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataTransforms(java.util.Collection)} or {@link #withDataTransforms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dataTransforms
     *        Transform operations that act on this logical table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogicalTable withDataTransforms(TransformOperation... dataTransforms) {
        if (this.dataTransforms == null) {
            setDataTransforms(new java.util.ArrayList<TransformOperation>(dataTransforms.length));
        }
        for (TransformOperation ele : dataTransforms) {
            this.dataTransforms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Transform operations that act on this logical table.
     * </p>
     * 
     * @param dataTransforms
     *        Transform operations that act on this logical table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogicalTable withDataTransforms(java.util.Collection<TransformOperation> dataTransforms) {
        setDataTransforms(dataTransforms);
        return this;
    }

    /**
     * <p>
     * Source of this logical table.
     * </p>
     * 
     * @param source
     *        Source of this logical table.
     */

    public void setSource(LogicalTableSource source) {
        this.source = source;
    }

    /**
     * <p>
     * Source of this logical table.
     * </p>
     * 
     * @return Source of this logical table.
     */

    public LogicalTableSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * Source of this logical table.
     * </p>
     * 
     * @param source
     *        Source of this logical table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogicalTable withSource(LogicalTableSource source) {
        setSource(source);
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
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getDataTransforms() != null)
            sb.append("DataTransforms: ").append(getDataTransforms()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogicalTable == false)
            return false;
        LogicalTable other = (LogicalTable) obj;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getDataTransforms() == null ^ this.getDataTransforms() == null)
            return false;
        if (other.getDataTransforms() != null && other.getDataTransforms().equals(this.getDataTransforms()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getDataTransforms() == null) ? 0 : getDataTransforms().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public LogicalTable clone() {
        try {
            return (LogicalTable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.LogicalTableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

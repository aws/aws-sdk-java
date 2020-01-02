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
 * A data transformation on a logical table. This is a variant type structure. For this structure to be valid, only one
 * of the attributes can be non-null.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TransformOperation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransformOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An operation that projects columns. Operations that come after a projection can only refer to projected columns.
     * </p>
     */
    private ProjectOperation projectOperation;
    /**
     * <p>
     * An operation that filters rows based on some condition.
     * </p>
     */
    private FilterOperation filterOperation;
    /**
     * <p>
     * An operation that creates calculated columns. Columns created in one such operation form a lexical closure.
     * </p>
     */
    private CreateColumnsOperation createColumnsOperation;
    /**
     * <p>
     * An operation that renames a column.
     * </p>
     */
    private RenameColumnOperation renameColumnOperation;
    /**
     * <p>
     * A transform operation that casts a column to a different type.
     * </p>
     */
    private CastColumnTypeOperation castColumnTypeOperation;
    /**
     * <p>
     * An operation that tags a column with additional information.
     * </p>
     */
    private TagColumnOperation tagColumnOperation;

    /**
     * <p>
     * An operation that projects columns. Operations that come after a projection can only refer to projected columns.
     * </p>
     * 
     * @param projectOperation
     *        An operation that projects columns. Operations that come after a projection can only refer to projected
     *        columns.
     */

    public void setProjectOperation(ProjectOperation projectOperation) {
        this.projectOperation = projectOperation;
    }

    /**
     * <p>
     * An operation that projects columns. Operations that come after a projection can only refer to projected columns.
     * </p>
     * 
     * @return An operation that projects columns. Operations that come after a projection can only refer to projected
     *         columns.
     */

    public ProjectOperation getProjectOperation() {
        return this.projectOperation;
    }

    /**
     * <p>
     * An operation that projects columns. Operations that come after a projection can only refer to projected columns.
     * </p>
     * 
     * @param projectOperation
     *        An operation that projects columns. Operations that come after a projection can only refer to projected
     *        columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformOperation withProjectOperation(ProjectOperation projectOperation) {
        setProjectOperation(projectOperation);
        return this;
    }

    /**
     * <p>
     * An operation that filters rows based on some condition.
     * </p>
     * 
     * @param filterOperation
     *        An operation that filters rows based on some condition.
     */

    public void setFilterOperation(FilterOperation filterOperation) {
        this.filterOperation = filterOperation;
    }

    /**
     * <p>
     * An operation that filters rows based on some condition.
     * </p>
     * 
     * @return An operation that filters rows based on some condition.
     */

    public FilterOperation getFilterOperation() {
        return this.filterOperation;
    }

    /**
     * <p>
     * An operation that filters rows based on some condition.
     * </p>
     * 
     * @param filterOperation
     *        An operation that filters rows based on some condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformOperation withFilterOperation(FilterOperation filterOperation) {
        setFilterOperation(filterOperation);
        return this;
    }

    /**
     * <p>
     * An operation that creates calculated columns. Columns created in one such operation form a lexical closure.
     * </p>
     * 
     * @param createColumnsOperation
     *        An operation that creates calculated columns. Columns created in one such operation form a lexical
     *        closure.
     */

    public void setCreateColumnsOperation(CreateColumnsOperation createColumnsOperation) {
        this.createColumnsOperation = createColumnsOperation;
    }

    /**
     * <p>
     * An operation that creates calculated columns. Columns created in one such operation form a lexical closure.
     * </p>
     * 
     * @return An operation that creates calculated columns. Columns created in one such operation form a lexical
     *         closure.
     */

    public CreateColumnsOperation getCreateColumnsOperation() {
        return this.createColumnsOperation;
    }

    /**
     * <p>
     * An operation that creates calculated columns. Columns created in one such operation form a lexical closure.
     * </p>
     * 
     * @param createColumnsOperation
     *        An operation that creates calculated columns. Columns created in one such operation form a lexical
     *        closure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformOperation withCreateColumnsOperation(CreateColumnsOperation createColumnsOperation) {
        setCreateColumnsOperation(createColumnsOperation);
        return this;
    }

    /**
     * <p>
     * An operation that renames a column.
     * </p>
     * 
     * @param renameColumnOperation
     *        An operation that renames a column.
     */

    public void setRenameColumnOperation(RenameColumnOperation renameColumnOperation) {
        this.renameColumnOperation = renameColumnOperation;
    }

    /**
     * <p>
     * An operation that renames a column.
     * </p>
     * 
     * @return An operation that renames a column.
     */

    public RenameColumnOperation getRenameColumnOperation() {
        return this.renameColumnOperation;
    }

    /**
     * <p>
     * An operation that renames a column.
     * </p>
     * 
     * @param renameColumnOperation
     *        An operation that renames a column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformOperation withRenameColumnOperation(RenameColumnOperation renameColumnOperation) {
        setRenameColumnOperation(renameColumnOperation);
        return this;
    }

    /**
     * <p>
     * A transform operation that casts a column to a different type.
     * </p>
     * 
     * @param castColumnTypeOperation
     *        A transform operation that casts a column to a different type.
     */

    public void setCastColumnTypeOperation(CastColumnTypeOperation castColumnTypeOperation) {
        this.castColumnTypeOperation = castColumnTypeOperation;
    }

    /**
     * <p>
     * A transform operation that casts a column to a different type.
     * </p>
     * 
     * @return A transform operation that casts a column to a different type.
     */

    public CastColumnTypeOperation getCastColumnTypeOperation() {
        return this.castColumnTypeOperation;
    }

    /**
     * <p>
     * A transform operation that casts a column to a different type.
     * </p>
     * 
     * @param castColumnTypeOperation
     *        A transform operation that casts a column to a different type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformOperation withCastColumnTypeOperation(CastColumnTypeOperation castColumnTypeOperation) {
        setCastColumnTypeOperation(castColumnTypeOperation);
        return this;
    }

    /**
     * <p>
     * An operation that tags a column with additional information.
     * </p>
     * 
     * @param tagColumnOperation
     *        An operation that tags a column with additional information.
     */

    public void setTagColumnOperation(TagColumnOperation tagColumnOperation) {
        this.tagColumnOperation = tagColumnOperation;
    }

    /**
     * <p>
     * An operation that tags a column with additional information.
     * </p>
     * 
     * @return An operation that tags a column with additional information.
     */

    public TagColumnOperation getTagColumnOperation() {
        return this.tagColumnOperation;
    }

    /**
     * <p>
     * An operation that tags a column with additional information.
     * </p>
     * 
     * @param tagColumnOperation
     *        An operation that tags a column with additional information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformOperation withTagColumnOperation(TagColumnOperation tagColumnOperation) {
        setTagColumnOperation(tagColumnOperation);
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
        if (getProjectOperation() != null)
            sb.append("ProjectOperation: ").append(getProjectOperation()).append(",");
        if (getFilterOperation() != null)
            sb.append("FilterOperation: ").append(getFilterOperation()).append(",");
        if (getCreateColumnsOperation() != null)
            sb.append("CreateColumnsOperation: ").append(getCreateColumnsOperation()).append(",");
        if (getRenameColumnOperation() != null)
            sb.append("RenameColumnOperation: ").append(getRenameColumnOperation()).append(",");
        if (getCastColumnTypeOperation() != null)
            sb.append("CastColumnTypeOperation: ").append(getCastColumnTypeOperation()).append(",");
        if (getTagColumnOperation() != null)
            sb.append("TagColumnOperation: ").append(getTagColumnOperation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformOperation == false)
            return false;
        TransformOperation other = (TransformOperation) obj;
        if (other.getProjectOperation() == null ^ this.getProjectOperation() == null)
            return false;
        if (other.getProjectOperation() != null && other.getProjectOperation().equals(this.getProjectOperation()) == false)
            return false;
        if (other.getFilterOperation() == null ^ this.getFilterOperation() == null)
            return false;
        if (other.getFilterOperation() != null && other.getFilterOperation().equals(this.getFilterOperation()) == false)
            return false;
        if (other.getCreateColumnsOperation() == null ^ this.getCreateColumnsOperation() == null)
            return false;
        if (other.getCreateColumnsOperation() != null && other.getCreateColumnsOperation().equals(this.getCreateColumnsOperation()) == false)
            return false;
        if (other.getRenameColumnOperation() == null ^ this.getRenameColumnOperation() == null)
            return false;
        if (other.getRenameColumnOperation() != null && other.getRenameColumnOperation().equals(this.getRenameColumnOperation()) == false)
            return false;
        if (other.getCastColumnTypeOperation() == null ^ this.getCastColumnTypeOperation() == null)
            return false;
        if (other.getCastColumnTypeOperation() != null && other.getCastColumnTypeOperation().equals(this.getCastColumnTypeOperation()) == false)
            return false;
        if (other.getTagColumnOperation() == null ^ this.getTagColumnOperation() == null)
            return false;
        if (other.getTagColumnOperation() != null && other.getTagColumnOperation().equals(this.getTagColumnOperation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectOperation() == null) ? 0 : getProjectOperation().hashCode());
        hashCode = prime * hashCode + ((getFilterOperation() == null) ? 0 : getFilterOperation().hashCode());
        hashCode = prime * hashCode + ((getCreateColumnsOperation() == null) ? 0 : getCreateColumnsOperation().hashCode());
        hashCode = prime * hashCode + ((getRenameColumnOperation() == null) ? 0 : getRenameColumnOperation().hashCode());
        hashCode = prime * hashCode + ((getCastColumnTypeOperation() == null) ? 0 : getCastColumnTypeOperation().hashCode());
        hashCode = prime * hashCode + ((getTagColumnOperation() == null) ? 0 : getTagColumnOperation().hashCode());
        return hashCode;
    }

    @Override
    public TransformOperation clone() {
        try {
            return (TransformOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TransformOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

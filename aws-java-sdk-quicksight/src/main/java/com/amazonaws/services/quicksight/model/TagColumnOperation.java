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
 * A transform operation that tags a column with additional information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TagColumnOperation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagColumnOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The column that this operation acts on.
     * </p>
     */
    private String columnName;
    /**
     * <p>
     * The dataset column tag, currently only used for geospatial type tagging. .
     * </p>
     * <note>
     * <p>
     * This is not tags for the AWS tagging feature. .
     * </p>
     * </note>
     */
    private java.util.List<ColumnTag> tags;

    /**
     * <p>
     * The column that this operation acts on.
     * </p>
     * 
     * @param columnName
     *        The column that this operation acts on.
     */

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * The column that this operation acts on.
     * </p>
     * 
     * @return The column that this operation acts on.
     */

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * <p>
     * The column that this operation acts on.
     * </p>
     * 
     * @param columnName
     *        The column that this operation acts on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagColumnOperation withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * <p>
     * The dataset column tag, currently only used for geospatial type tagging. .
     * </p>
     * <note>
     * <p>
     * This is not tags for the AWS tagging feature. .
     * </p>
     * </note>
     * 
     * @return The dataset column tag, currently only used for geospatial type tagging. .</p> <note>
     *         <p>
     *         This is not tags for the AWS tagging feature. .
     *         </p>
     */

    public java.util.List<ColumnTag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The dataset column tag, currently only used for geospatial type tagging. .
     * </p>
     * <note>
     * <p>
     * This is not tags for the AWS tagging feature. .
     * </p>
     * </note>
     * 
     * @param tags
     *        The dataset column tag, currently only used for geospatial type tagging. .</p> <note>
     *        <p>
     *        This is not tags for the AWS tagging feature. .
     *        </p>
     */

    public void setTags(java.util.Collection<ColumnTag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<ColumnTag>(tags);
    }

    /**
     * <p>
     * The dataset column tag, currently only used for geospatial type tagging. .
     * </p>
     * <note>
     * <p>
     * This is not tags for the AWS tagging feature. .
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The dataset column tag, currently only used for geospatial type tagging. .</p> <note>
     *        <p>
     *        This is not tags for the AWS tagging feature. .
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagColumnOperation withTags(ColumnTag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<ColumnTag>(tags.length));
        }
        for (ColumnTag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dataset column tag, currently only used for geospatial type tagging. .
     * </p>
     * <note>
     * <p>
     * This is not tags for the AWS tagging feature. .
     * </p>
     * </note>
     * 
     * @param tags
     *        The dataset column tag, currently only used for geospatial type tagging. .</p> <note>
     *        <p>
     *        This is not tags for the AWS tagging feature. .
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagColumnOperation withTags(java.util.Collection<ColumnTag> tags) {
        setTags(tags);
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
        if (getColumnName() != null)
            sb.append("ColumnName: ").append(getColumnName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagColumnOperation == false)
            return false;
        TagColumnOperation other = (TagColumnOperation) obj;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagColumnOperation clone() {
        try {
            return (TagColumnOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TagColumnOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

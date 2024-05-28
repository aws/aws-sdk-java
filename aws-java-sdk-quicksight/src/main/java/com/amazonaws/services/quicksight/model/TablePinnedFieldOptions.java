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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The settings for the pinned columns of a table visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TablePinnedFieldOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TablePinnedFieldOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of columns to be pinned to the left of a table visual.
     * </p>
     */
    private java.util.List<String> pinnedLeftFields;

    /**
     * <p>
     * A list of columns to be pinned to the left of a table visual.
     * </p>
     * 
     * @return A list of columns to be pinned to the left of a table visual.
     */

    public java.util.List<String> getPinnedLeftFields() {
        return pinnedLeftFields;
    }

    /**
     * <p>
     * A list of columns to be pinned to the left of a table visual.
     * </p>
     * 
     * @param pinnedLeftFields
     *        A list of columns to be pinned to the left of a table visual.
     */

    public void setPinnedLeftFields(java.util.Collection<String> pinnedLeftFields) {
        if (pinnedLeftFields == null) {
            this.pinnedLeftFields = null;
            return;
        }

        this.pinnedLeftFields = new java.util.ArrayList<String>(pinnedLeftFields);
    }

    /**
     * <p>
     * A list of columns to be pinned to the left of a table visual.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPinnedLeftFields(java.util.Collection)} or {@link #withPinnedLeftFields(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pinnedLeftFields
     *        A list of columns to be pinned to the left of a table visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TablePinnedFieldOptions withPinnedLeftFields(String... pinnedLeftFields) {
        if (this.pinnedLeftFields == null) {
            setPinnedLeftFields(new java.util.ArrayList<String>(pinnedLeftFields.length));
        }
        for (String ele : pinnedLeftFields) {
            this.pinnedLeftFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of columns to be pinned to the left of a table visual.
     * </p>
     * 
     * @param pinnedLeftFields
     *        A list of columns to be pinned to the left of a table visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TablePinnedFieldOptions withPinnedLeftFields(java.util.Collection<String> pinnedLeftFields) {
        setPinnedLeftFields(pinnedLeftFields);
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
        if (getPinnedLeftFields() != null)
            sb.append("PinnedLeftFields: ").append(getPinnedLeftFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TablePinnedFieldOptions == false)
            return false;
        TablePinnedFieldOptions other = (TablePinnedFieldOptions) obj;
        if (other.getPinnedLeftFields() == null ^ this.getPinnedLeftFields() == null)
            return false;
        if (other.getPinnedLeftFields() != null && other.getPinnedLeftFields().equals(this.getPinnedLeftFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPinnedLeftFields() == null) ? 0 : getPinnedLeftFields().hashCode());
        return hashCode;
    }

    @Override
    public TablePinnedFieldOptions clone() {
        try {
            return (TablePinnedFieldOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TablePinnedFieldOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

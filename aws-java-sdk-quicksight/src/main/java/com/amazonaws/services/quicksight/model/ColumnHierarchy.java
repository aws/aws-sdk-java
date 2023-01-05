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
 * The option that determines the hierarchy of the fields for a visual element.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ColumnHierarchy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnHierarchy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The option that determines the hierarchy of the fields that are built within a visual's field wells. These fields
     * can't be duplicated to other visuals.
     * </p>
     */
    private ExplicitHierarchy explicitHierarchy;
    /**
     * <p>
     * The option that determines the hierarchy of any <code>DateTime</code> fields.
     * </p>
     */
    private DateTimeHierarchy dateTimeHierarchy;
    /**
     * <p>
     * The option that determines the hierarchy of the fields that are defined during data preparation. These fields are
     * available to use in any analysis that uses the data source.
     * </p>
     */
    private PredefinedHierarchy predefinedHierarchy;

    /**
     * <p>
     * The option that determines the hierarchy of the fields that are built within a visual's field wells. These fields
     * can't be duplicated to other visuals.
     * </p>
     * 
     * @param explicitHierarchy
     *        The option that determines the hierarchy of the fields that are built within a visual's field wells. These
     *        fields can't be duplicated to other visuals.
     */

    public void setExplicitHierarchy(ExplicitHierarchy explicitHierarchy) {
        this.explicitHierarchy = explicitHierarchy;
    }

    /**
     * <p>
     * The option that determines the hierarchy of the fields that are built within a visual's field wells. These fields
     * can't be duplicated to other visuals.
     * </p>
     * 
     * @return The option that determines the hierarchy of the fields that are built within a visual's field wells.
     *         These fields can't be duplicated to other visuals.
     */

    public ExplicitHierarchy getExplicitHierarchy() {
        return this.explicitHierarchy;
    }

    /**
     * <p>
     * The option that determines the hierarchy of the fields that are built within a visual's field wells. These fields
     * can't be duplicated to other visuals.
     * </p>
     * 
     * @param explicitHierarchy
     *        The option that determines the hierarchy of the fields that are built within a visual's field wells. These
     *        fields can't be duplicated to other visuals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnHierarchy withExplicitHierarchy(ExplicitHierarchy explicitHierarchy) {
        setExplicitHierarchy(explicitHierarchy);
        return this;
    }

    /**
     * <p>
     * The option that determines the hierarchy of any <code>DateTime</code> fields.
     * </p>
     * 
     * @param dateTimeHierarchy
     *        The option that determines the hierarchy of any <code>DateTime</code> fields.
     */

    public void setDateTimeHierarchy(DateTimeHierarchy dateTimeHierarchy) {
        this.dateTimeHierarchy = dateTimeHierarchy;
    }

    /**
     * <p>
     * The option that determines the hierarchy of any <code>DateTime</code> fields.
     * </p>
     * 
     * @return The option that determines the hierarchy of any <code>DateTime</code> fields.
     */

    public DateTimeHierarchy getDateTimeHierarchy() {
        return this.dateTimeHierarchy;
    }

    /**
     * <p>
     * The option that determines the hierarchy of any <code>DateTime</code> fields.
     * </p>
     * 
     * @param dateTimeHierarchy
     *        The option that determines the hierarchy of any <code>DateTime</code> fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnHierarchy withDateTimeHierarchy(DateTimeHierarchy dateTimeHierarchy) {
        setDateTimeHierarchy(dateTimeHierarchy);
        return this;
    }

    /**
     * <p>
     * The option that determines the hierarchy of the fields that are defined during data preparation. These fields are
     * available to use in any analysis that uses the data source.
     * </p>
     * 
     * @param predefinedHierarchy
     *        The option that determines the hierarchy of the fields that are defined during data preparation. These
     *        fields are available to use in any analysis that uses the data source.
     */

    public void setPredefinedHierarchy(PredefinedHierarchy predefinedHierarchy) {
        this.predefinedHierarchy = predefinedHierarchy;
    }

    /**
     * <p>
     * The option that determines the hierarchy of the fields that are defined during data preparation. These fields are
     * available to use in any analysis that uses the data source.
     * </p>
     * 
     * @return The option that determines the hierarchy of the fields that are defined during data preparation. These
     *         fields are available to use in any analysis that uses the data source.
     */

    public PredefinedHierarchy getPredefinedHierarchy() {
        return this.predefinedHierarchy;
    }

    /**
     * <p>
     * The option that determines the hierarchy of the fields that are defined during data preparation. These fields are
     * available to use in any analysis that uses the data source.
     * </p>
     * 
     * @param predefinedHierarchy
     *        The option that determines the hierarchy of the fields that are defined during data preparation. These
     *        fields are available to use in any analysis that uses the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnHierarchy withPredefinedHierarchy(PredefinedHierarchy predefinedHierarchy) {
        setPredefinedHierarchy(predefinedHierarchy);
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
        if (getExplicitHierarchy() != null)
            sb.append("ExplicitHierarchy: ").append(getExplicitHierarchy()).append(",");
        if (getDateTimeHierarchy() != null)
            sb.append("DateTimeHierarchy: ").append(getDateTimeHierarchy()).append(",");
        if (getPredefinedHierarchy() != null)
            sb.append("PredefinedHierarchy: ").append(getPredefinedHierarchy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnHierarchy == false)
            return false;
        ColumnHierarchy other = (ColumnHierarchy) obj;
        if (other.getExplicitHierarchy() == null ^ this.getExplicitHierarchy() == null)
            return false;
        if (other.getExplicitHierarchy() != null && other.getExplicitHierarchy().equals(this.getExplicitHierarchy()) == false)
            return false;
        if (other.getDateTimeHierarchy() == null ^ this.getDateTimeHierarchy() == null)
            return false;
        if (other.getDateTimeHierarchy() != null && other.getDateTimeHierarchy().equals(this.getDateTimeHierarchy()) == false)
            return false;
        if (other.getPredefinedHierarchy() == null ^ this.getPredefinedHierarchy() == null)
            return false;
        if (other.getPredefinedHierarchy() != null && other.getPredefinedHierarchy().equals(this.getPredefinedHierarchy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExplicitHierarchy() == null) ? 0 : getExplicitHierarchy().hashCode());
        hashCode = prime * hashCode + ((getDateTimeHierarchy() == null) ? 0 : getDateTimeHierarchy().hashCode());
        hashCode = prime * hashCode + ((getPredefinedHierarchy() == null) ? 0 : getPredefinedHierarchy().hashCode());
        return hashCode;
    }

    @Override
    public ColumnHierarchy clone() {
        try {
            return (ColumnHierarchy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ColumnHierarchyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

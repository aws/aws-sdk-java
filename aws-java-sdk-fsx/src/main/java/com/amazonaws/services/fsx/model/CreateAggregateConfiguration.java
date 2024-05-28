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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to specify the configuration options for an FSx for ONTAP volume's storage aggregate or aggregates.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateAggregateConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAggregateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Used to specify the names of aggregates on which the volume will be created.
     * </p>
     */
    private java.util.List<String> aggregates;
    /**
     * <p>
     * Used to explicitly set the number of constituents within the FlexGroup per storage aggregate. This field is
     * optional when creating a FlexGroup volume. If unspecified, the default value will be 8. This field cannot be
     * provided when creating a FlexVol volume.
     * </p>
     */
    private Integer constituentsPerAggregate;

    /**
     * <p>
     * Used to specify the names of aggregates on which the volume will be created.
     * </p>
     * 
     * @return Used to specify the names of aggregates on which the volume will be created.
     */

    public java.util.List<String> getAggregates() {
        return aggregates;
    }

    /**
     * <p>
     * Used to specify the names of aggregates on which the volume will be created.
     * </p>
     * 
     * @param aggregates
     *        Used to specify the names of aggregates on which the volume will be created.
     */

    public void setAggregates(java.util.Collection<String> aggregates) {
        if (aggregates == null) {
            this.aggregates = null;
            return;
        }

        this.aggregates = new java.util.ArrayList<String>(aggregates);
    }

    /**
     * <p>
     * Used to specify the names of aggregates on which the volume will be created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregates(java.util.Collection)} or {@link #withAggregates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param aggregates
     *        Used to specify the names of aggregates on which the volume will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAggregateConfiguration withAggregates(String... aggregates) {
        if (this.aggregates == null) {
            setAggregates(new java.util.ArrayList<String>(aggregates.length));
        }
        for (String ele : aggregates) {
            this.aggregates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Used to specify the names of aggregates on which the volume will be created.
     * </p>
     * 
     * @param aggregates
     *        Used to specify the names of aggregates on which the volume will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAggregateConfiguration withAggregates(java.util.Collection<String> aggregates) {
        setAggregates(aggregates);
        return this;
    }

    /**
     * <p>
     * Used to explicitly set the number of constituents within the FlexGroup per storage aggregate. This field is
     * optional when creating a FlexGroup volume. If unspecified, the default value will be 8. This field cannot be
     * provided when creating a FlexVol volume.
     * </p>
     * 
     * @param constituentsPerAggregate
     *        Used to explicitly set the number of constituents within the FlexGroup per storage aggregate. This field
     *        is optional when creating a FlexGroup volume. If unspecified, the default value will be 8. This field
     *        cannot be provided when creating a FlexVol volume.
     */

    public void setConstituentsPerAggregate(Integer constituentsPerAggregate) {
        this.constituentsPerAggregate = constituentsPerAggregate;
    }

    /**
     * <p>
     * Used to explicitly set the number of constituents within the FlexGroup per storage aggregate. This field is
     * optional when creating a FlexGroup volume. If unspecified, the default value will be 8. This field cannot be
     * provided when creating a FlexVol volume.
     * </p>
     * 
     * @return Used to explicitly set the number of constituents within the FlexGroup per storage aggregate. This field
     *         is optional when creating a FlexGroup volume. If unspecified, the default value will be 8. This field
     *         cannot be provided when creating a FlexVol volume.
     */

    public Integer getConstituentsPerAggregate() {
        return this.constituentsPerAggregate;
    }

    /**
     * <p>
     * Used to explicitly set the number of constituents within the FlexGroup per storage aggregate. This field is
     * optional when creating a FlexGroup volume. If unspecified, the default value will be 8. This field cannot be
     * provided when creating a FlexVol volume.
     * </p>
     * 
     * @param constituentsPerAggregate
     *        Used to explicitly set the number of constituents within the FlexGroup per storage aggregate. This field
     *        is optional when creating a FlexGroup volume. If unspecified, the default value will be 8. This field
     *        cannot be provided when creating a FlexVol volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAggregateConfiguration withConstituentsPerAggregate(Integer constituentsPerAggregate) {
        setConstituentsPerAggregate(constituentsPerAggregate);
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
        if (getAggregates() != null)
            sb.append("Aggregates: ").append(getAggregates()).append(",");
        if (getConstituentsPerAggregate() != null)
            sb.append("ConstituentsPerAggregate: ").append(getConstituentsPerAggregate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAggregateConfiguration == false)
            return false;
        CreateAggregateConfiguration other = (CreateAggregateConfiguration) obj;
        if (other.getAggregates() == null ^ this.getAggregates() == null)
            return false;
        if (other.getAggregates() != null && other.getAggregates().equals(this.getAggregates()) == false)
            return false;
        if (other.getConstituentsPerAggregate() == null ^ this.getConstituentsPerAggregate() == null)
            return false;
        if (other.getConstituentsPerAggregate() != null && other.getConstituentsPerAggregate().equals(this.getConstituentsPerAggregate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggregates() == null) ? 0 : getAggregates().hashCode());
        hashCode = prime * hashCode + ((getConstituentsPerAggregate() == null) ? 0 : getConstituentsPerAggregate().hashCode());
        return hashCode;
    }

    @Override
    public CreateAggregateConfiguration clone() {
        try {
            return (CreateAggregateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.CreateAggregateConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Only one of MixedMeasureMappings or MultiMeasureMappings is to be provided. MultiMeasureMappings can be used to
 * ingest data as multi measures in the derived table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/MultiMeasureMappings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiMeasureMappings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the target multi-measure name in the derived table. This input is required when measureNameColumn is
     * not provided. If MeasureNameColumn is provided, then value from that column will be used as multi-measure name.
     * </p>
     */
    private String targetMultiMeasureName;
    /**
     * <p>
     * Required. Attribute mappings to be used for mapping query results to ingest data for multi-measure attributes.
     * </p>
     */
    private java.util.List<MultiMeasureAttributeMapping> multiMeasureAttributeMappings;

    /**
     * <p>
     * The name of the target multi-measure name in the derived table. This input is required when measureNameColumn is
     * not provided. If MeasureNameColumn is provided, then value from that column will be used as multi-measure name.
     * </p>
     * 
     * @param targetMultiMeasureName
     *        The name of the target multi-measure name in the derived table. This input is required when
     *        measureNameColumn is not provided. If MeasureNameColumn is provided, then value from that column will be
     *        used as multi-measure name.
     */

    public void setTargetMultiMeasureName(String targetMultiMeasureName) {
        this.targetMultiMeasureName = targetMultiMeasureName;
    }

    /**
     * <p>
     * The name of the target multi-measure name in the derived table. This input is required when measureNameColumn is
     * not provided. If MeasureNameColumn is provided, then value from that column will be used as multi-measure name.
     * </p>
     * 
     * @return The name of the target multi-measure name in the derived table. This input is required when
     *         measureNameColumn is not provided. If MeasureNameColumn is provided, then value from that column will be
     *         used as multi-measure name.
     */

    public String getTargetMultiMeasureName() {
        return this.targetMultiMeasureName;
    }

    /**
     * <p>
     * The name of the target multi-measure name in the derived table. This input is required when measureNameColumn is
     * not provided. If MeasureNameColumn is provided, then value from that column will be used as multi-measure name.
     * </p>
     * 
     * @param targetMultiMeasureName
     *        The name of the target multi-measure name in the derived table. This input is required when
     *        measureNameColumn is not provided. If MeasureNameColumn is provided, then value from that column will be
     *        used as multi-measure name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiMeasureMappings withTargetMultiMeasureName(String targetMultiMeasureName) {
        setTargetMultiMeasureName(targetMultiMeasureName);
        return this;
    }

    /**
     * <p>
     * Required. Attribute mappings to be used for mapping query results to ingest data for multi-measure attributes.
     * </p>
     * 
     * @return Required. Attribute mappings to be used for mapping query results to ingest data for multi-measure
     *         attributes.
     */

    public java.util.List<MultiMeasureAttributeMapping> getMultiMeasureAttributeMappings() {
        return multiMeasureAttributeMappings;
    }

    /**
     * <p>
     * Required. Attribute mappings to be used for mapping query results to ingest data for multi-measure attributes.
     * </p>
     * 
     * @param multiMeasureAttributeMappings
     *        Required. Attribute mappings to be used for mapping query results to ingest data for multi-measure
     *        attributes.
     */

    public void setMultiMeasureAttributeMappings(java.util.Collection<MultiMeasureAttributeMapping> multiMeasureAttributeMappings) {
        if (multiMeasureAttributeMappings == null) {
            this.multiMeasureAttributeMappings = null;
            return;
        }

        this.multiMeasureAttributeMappings = new java.util.ArrayList<MultiMeasureAttributeMapping>(multiMeasureAttributeMappings);
    }

    /**
     * <p>
     * Required. Attribute mappings to be used for mapping query results to ingest data for multi-measure attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMultiMeasureAttributeMappings(java.util.Collection)} or
     * {@link #withMultiMeasureAttributeMappings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param multiMeasureAttributeMappings
     *        Required. Attribute mappings to be used for mapping query results to ingest data for multi-measure
     *        attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiMeasureMappings withMultiMeasureAttributeMappings(MultiMeasureAttributeMapping... multiMeasureAttributeMappings) {
        if (this.multiMeasureAttributeMappings == null) {
            setMultiMeasureAttributeMappings(new java.util.ArrayList<MultiMeasureAttributeMapping>(multiMeasureAttributeMappings.length));
        }
        for (MultiMeasureAttributeMapping ele : multiMeasureAttributeMappings) {
            this.multiMeasureAttributeMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Required. Attribute mappings to be used for mapping query results to ingest data for multi-measure attributes.
     * </p>
     * 
     * @param multiMeasureAttributeMappings
     *        Required. Attribute mappings to be used for mapping query results to ingest data for multi-measure
     *        attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiMeasureMappings withMultiMeasureAttributeMappings(java.util.Collection<MultiMeasureAttributeMapping> multiMeasureAttributeMappings) {
        setMultiMeasureAttributeMappings(multiMeasureAttributeMappings);
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
        if (getTargetMultiMeasureName() != null)
            sb.append("TargetMultiMeasureName: ").append(getTargetMultiMeasureName()).append(",");
        if (getMultiMeasureAttributeMappings() != null)
            sb.append("MultiMeasureAttributeMappings: ").append(getMultiMeasureAttributeMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiMeasureMappings == false)
            return false;
        MultiMeasureMappings other = (MultiMeasureMappings) obj;
        if (other.getTargetMultiMeasureName() == null ^ this.getTargetMultiMeasureName() == null)
            return false;
        if (other.getTargetMultiMeasureName() != null && other.getTargetMultiMeasureName().equals(this.getTargetMultiMeasureName()) == false)
            return false;
        if (other.getMultiMeasureAttributeMappings() == null ^ this.getMultiMeasureAttributeMappings() == null)
            return false;
        if (other.getMultiMeasureAttributeMappings() != null
                && other.getMultiMeasureAttributeMappings().equals(this.getMultiMeasureAttributeMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetMultiMeasureName() == null) ? 0 : getTargetMultiMeasureName().hashCode());
        hashCode = prime * hashCode + ((getMultiMeasureAttributeMappings() == null) ? 0 : getMultiMeasureAttributeMappings().hashCode());
        return hashCode;
    }

    @Override
    public MultiMeasureMappings clone() {
        try {
            return (MultiMeasureMappings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.MultiMeasureMappingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

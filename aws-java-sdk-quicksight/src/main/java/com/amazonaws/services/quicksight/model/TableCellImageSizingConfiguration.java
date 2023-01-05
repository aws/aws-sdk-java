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
 * The sizing options for the table image configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableCellImageSizingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableCellImageSizingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The cell scaling configuration of the sizing options for the table image configuration.
     * </p>
     */
    private String tableCellImageScalingConfiguration;

    /**
     * <p>
     * The cell scaling configuration of the sizing options for the table image configuration.
     * </p>
     * 
     * @param tableCellImageScalingConfiguration
     *        The cell scaling configuration of the sizing options for the table image configuration.
     * @see TableCellImageScalingConfiguration
     */

    public void setTableCellImageScalingConfiguration(String tableCellImageScalingConfiguration) {
        this.tableCellImageScalingConfiguration = tableCellImageScalingConfiguration;
    }

    /**
     * <p>
     * The cell scaling configuration of the sizing options for the table image configuration.
     * </p>
     * 
     * @return The cell scaling configuration of the sizing options for the table image configuration.
     * @see TableCellImageScalingConfiguration
     */

    public String getTableCellImageScalingConfiguration() {
        return this.tableCellImageScalingConfiguration;
    }

    /**
     * <p>
     * The cell scaling configuration of the sizing options for the table image configuration.
     * </p>
     * 
     * @param tableCellImageScalingConfiguration
     *        The cell scaling configuration of the sizing options for the table image configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableCellImageScalingConfiguration
     */

    public TableCellImageSizingConfiguration withTableCellImageScalingConfiguration(String tableCellImageScalingConfiguration) {
        setTableCellImageScalingConfiguration(tableCellImageScalingConfiguration);
        return this;
    }

    /**
     * <p>
     * The cell scaling configuration of the sizing options for the table image configuration.
     * </p>
     * 
     * @param tableCellImageScalingConfiguration
     *        The cell scaling configuration of the sizing options for the table image configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableCellImageScalingConfiguration
     */

    public TableCellImageSizingConfiguration withTableCellImageScalingConfiguration(TableCellImageScalingConfiguration tableCellImageScalingConfiguration) {
        this.tableCellImageScalingConfiguration = tableCellImageScalingConfiguration.toString();
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
        if (getTableCellImageScalingConfiguration() != null)
            sb.append("TableCellImageScalingConfiguration: ").append(getTableCellImageScalingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableCellImageSizingConfiguration == false)
            return false;
        TableCellImageSizingConfiguration other = (TableCellImageSizingConfiguration) obj;
        if (other.getTableCellImageScalingConfiguration() == null ^ this.getTableCellImageScalingConfiguration() == null)
            return false;
        if (other.getTableCellImageScalingConfiguration() != null
                && other.getTableCellImageScalingConfiguration().equals(this.getTableCellImageScalingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableCellImageScalingConfiguration() == null) ? 0 : getTableCellImageScalingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public TableCellImageSizingConfiguration clone() {
        try {
            return (TableCellImageSizingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableCellImageSizingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

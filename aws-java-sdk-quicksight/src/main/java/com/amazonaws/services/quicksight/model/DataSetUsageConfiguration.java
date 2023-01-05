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
 * The usage configuration to apply to child datasets that reference this dataset as a source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataSetUsageConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSetUsageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An option that controls whether a child dataset of a direct query can use this dataset as a source.
     * </p>
     */
    private Boolean disableUseAsDirectQuerySource;
    /**
     * <p>
     * An option that controls whether a child dataset that's stored in QuickSight can use this dataset as a source.
     * </p>
     */
    private Boolean disableUseAsImportedSource;

    /**
     * <p>
     * An option that controls whether a child dataset of a direct query can use this dataset as a source.
     * </p>
     * 
     * @param disableUseAsDirectQuerySource
     *        An option that controls whether a child dataset of a direct query can use this dataset as a source.
     */

    public void setDisableUseAsDirectQuerySource(Boolean disableUseAsDirectQuerySource) {
        this.disableUseAsDirectQuerySource = disableUseAsDirectQuerySource;
    }

    /**
     * <p>
     * An option that controls whether a child dataset of a direct query can use this dataset as a source.
     * </p>
     * 
     * @return An option that controls whether a child dataset of a direct query can use this dataset as a source.
     */

    public Boolean getDisableUseAsDirectQuerySource() {
        return this.disableUseAsDirectQuerySource;
    }

    /**
     * <p>
     * An option that controls whether a child dataset of a direct query can use this dataset as a source.
     * </p>
     * 
     * @param disableUseAsDirectQuerySource
     *        An option that controls whether a child dataset of a direct query can use this dataset as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetUsageConfiguration withDisableUseAsDirectQuerySource(Boolean disableUseAsDirectQuerySource) {
        setDisableUseAsDirectQuerySource(disableUseAsDirectQuerySource);
        return this;
    }

    /**
     * <p>
     * An option that controls whether a child dataset of a direct query can use this dataset as a source.
     * </p>
     * 
     * @return An option that controls whether a child dataset of a direct query can use this dataset as a source.
     */

    public Boolean isDisableUseAsDirectQuerySource() {
        return this.disableUseAsDirectQuerySource;
    }

    /**
     * <p>
     * An option that controls whether a child dataset that's stored in QuickSight can use this dataset as a source.
     * </p>
     * 
     * @param disableUseAsImportedSource
     *        An option that controls whether a child dataset that's stored in QuickSight can use this dataset as a
     *        source.
     */

    public void setDisableUseAsImportedSource(Boolean disableUseAsImportedSource) {
        this.disableUseAsImportedSource = disableUseAsImportedSource;
    }

    /**
     * <p>
     * An option that controls whether a child dataset that's stored in QuickSight can use this dataset as a source.
     * </p>
     * 
     * @return An option that controls whether a child dataset that's stored in QuickSight can use this dataset as a
     *         source.
     */

    public Boolean getDisableUseAsImportedSource() {
        return this.disableUseAsImportedSource;
    }

    /**
     * <p>
     * An option that controls whether a child dataset that's stored in QuickSight can use this dataset as a source.
     * </p>
     * 
     * @param disableUseAsImportedSource
     *        An option that controls whether a child dataset that's stored in QuickSight can use this dataset as a
     *        source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetUsageConfiguration withDisableUseAsImportedSource(Boolean disableUseAsImportedSource) {
        setDisableUseAsImportedSource(disableUseAsImportedSource);
        return this;
    }

    /**
     * <p>
     * An option that controls whether a child dataset that's stored in QuickSight can use this dataset as a source.
     * </p>
     * 
     * @return An option that controls whether a child dataset that's stored in QuickSight can use this dataset as a
     *         source.
     */

    public Boolean isDisableUseAsImportedSource() {
        return this.disableUseAsImportedSource;
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
        if (getDisableUseAsDirectQuerySource() != null)
            sb.append("DisableUseAsDirectQuerySource: ").append(getDisableUseAsDirectQuerySource()).append(",");
        if (getDisableUseAsImportedSource() != null)
            sb.append("DisableUseAsImportedSource: ").append(getDisableUseAsImportedSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSetUsageConfiguration == false)
            return false;
        DataSetUsageConfiguration other = (DataSetUsageConfiguration) obj;
        if (other.getDisableUseAsDirectQuerySource() == null ^ this.getDisableUseAsDirectQuerySource() == null)
            return false;
        if (other.getDisableUseAsDirectQuerySource() != null
                && other.getDisableUseAsDirectQuerySource().equals(this.getDisableUseAsDirectQuerySource()) == false)
            return false;
        if (other.getDisableUseAsImportedSource() == null ^ this.getDisableUseAsImportedSource() == null)
            return false;
        if (other.getDisableUseAsImportedSource() != null && other.getDisableUseAsImportedSource().equals(this.getDisableUseAsImportedSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisableUseAsDirectQuerySource() == null) ? 0 : getDisableUseAsDirectQuerySource().hashCode());
        hashCode = prime * hashCode + ((getDisableUseAsImportedSource() == null) ? 0 : getDisableUseAsImportedSource().hashCode());
        return hashCode;
    }

    @Override
    public DataSetUsageConfiguration clone() {
        try {
            return (DataSetUsageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataSetUsageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

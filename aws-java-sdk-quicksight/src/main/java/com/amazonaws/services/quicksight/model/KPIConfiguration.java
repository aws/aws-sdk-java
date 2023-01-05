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
 * The configuration of a KPI visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/KPIConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KPIConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field well configuration of a KPI visual.
     * </p>
     */
    private KPIFieldWells fieldWells;
    /**
     * <p>
     * The sort configuration of a KPI visual.
     * </p>
     */
    private KPISortConfiguration sortConfiguration;
    /**
     * <p>
     * The options that determine the presentation of a KPI visual.
     * </p>
     */
    private KPIOptions kPIOptions;

    /**
     * <p>
     * The field well configuration of a KPI visual.
     * </p>
     * 
     * @param fieldWells
     *        The field well configuration of a KPI visual.
     */

    public void setFieldWells(KPIFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field well configuration of a KPI visual.
     * </p>
     * 
     * @return The field well configuration of a KPI visual.
     */

    public KPIFieldWells getFieldWells() {
        return this.fieldWells;
    }

    /**
     * <p>
     * The field well configuration of a KPI visual.
     * </p>
     * 
     * @param fieldWells
     *        The field well configuration of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIConfiguration withFieldWells(KPIFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The sort configuration of a KPI visual.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a KPI visual.
     */

    public void setSortConfiguration(KPISortConfiguration sortConfiguration) {
        this.sortConfiguration = sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a KPI visual.
     * </p>
     * 
     * @return The sort configuration of a KPI visual.
     */

    public KPISortConfiguration getSortConfiguration() {
        return this.sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a KPI visual.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIConfiguration withSortConfiguration(KPISortConfiguration sortConfiguration) {
        setSortConfiguration(sortConfiguration);
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of a KPI visual.
     * </p>
     * 
     * @param kPIOptions
     *        The options that determine the presentation of a KPI visual.
     */

    public void setKPIOptions(KPIOptions kPIOptions) {
        this.kPIOptions = kPIOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of a KPI visual.
     * </p>
     * 
     * @return The options that determine the presentation of a KPI visual.
     */

    public KPIOptions getKPIOptions() {
        return this.kPIOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of a KPI visual.
     * </p>
     * 
     * @param kPIOptions
     *        The options that determine the presentation of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIConfiguration withKPIOptions(KPIOptions kPIOptions) {
        setKPIOptions(kPIOptions);
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
        if (getFieldWells() != null)
            sb.append("FieldWells: ").append(getFieldWells()).append(",");
        if (getSortConfiguration() != null)
            sb.append("SortConfiguration: ").append(getSortConfiguration()).append(",");
        if (getKPIOptions() != null)
            sb.append("KPIOptions: ").append(getKPIOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KPIConfiguration == false)
            return false;
        KPIConfiguration other = (KPIConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getSortConfiguration() == null ^ this.getSortConfiguration() == null)
            return false;
        if (other.getSortConfiguration() != null && other.getSortConfiguration().equals(this.getSortConfiguration()) == false)
            return false;
        if (other.getKPIOptions() == null ^ this.getKPIOptions() == null)
            return false;
        if (other.getKPIOptions() != null && other.getKPIOptions().equals(this.getKPIOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldWells() == null) ? 0 : getFieldWells().hashCode());
        hashCode = prime * hashCode + ((getSortConfiguration() == null) ? 0 : getSortConfiguration().hashCode());
        hashCode = prime * hashCode + ((getKPIOptions() == null) ? 0 : getKPIOptions().hashCode());
        return hashCode;
    }

    @Override
    public KPIConfiguration clone() {
        try {
            return (KPIConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.KPIConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

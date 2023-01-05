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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for column evaluations for a profile job. ColumnStatisticsConfiguration can be used to select
 * evaluations and override parameters of evaluations for particular columns.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ColumnStatisticsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnStatisticsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of column selectors. Selectors can be used to select columns from the dataset. When selectors are undefined,
     * configuration will be applied to all supported columns.
     * </p>
     */
    private java.util.List<ColumnSelector> selectors;
    /**
     * <p>
     * Configuration for evaluations. Statistics can be used to select evaluations and override parameters of
     * evaluations.
     * </p>
     */
    private StatisticsConfiguration statistics;

    /**
     * <p>
     * List of column selectors. Selectors can be used to select columns from the dataset. When selectors are undefined,
     * configuration will be applied to all supported columns.
     * </p>
     * 
     * @return List of column selectors. Selectors can be used to select columns from the dataset. When selectors are
     *         undefined, configuration will be applied to all supported columns.
     */

    public java.util.List<ColumnSelector> getSelectors() {
        return selectors;
    }

    /**
     * <p>
     * List of column selectors. Selectors can be used to select columns from the dataset. When selectors are undefined,
     * configuration will be applied to all supported columns.
     * </p>
     * 
     * @param selectors
     *        List of column selectors. Selectors can be used to select columns from the dataset. When selectors are
     *        undefined, configuration will be applied to all supported columns.
     */

    public void setSelectors(java.util.Collection<ColumnSelector> selectors) {
        if (selectors == null) {
            this.selectors = null;
            return;
        }

        this.selectors = new java.util.ArrayList<ColumnSelector>(selectors);
    }

    /**
     * <p>
     * List of column selectors. Selectors can be used to select columns from the dataset. When selectors are undefined,
     * configuration will be applied to all supported columns.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectors(java.util.Collection)} or {@link #withSelectors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param selectors
     *        List of column selectors. Selectors can be used to select columns from the dataset. When selectors are
     *        undefined, configuration will be applied to all supported columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsConfiguration withSelectors(ColumnSelector... selectors) {
        if (this.selectors == null) {
            setSelectors(new java.util.ArrayList<ColumnSelector>(selectors.length));
        }
        for (ColumnSelector ele : selectors) {
            this.selectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of column selectors. Selectors can be used to select columns from the dataset. When selectors are undefined,
     * configuration will be applied to all supported columns.
     * </p>
     * 
     * @param selectors
     *        List of column selectors. Selectors can be used to select columns from the dataset. When selectors are
     *        undefined, configuration will be applied to all supported columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsConfiguration withSelectors(java.util.Collection<ColumnSelector> selectors) {
        setSelectors(selectors);
        return this;
    }

    /**
     * <p>
     * Configuration for evaluations. Statistics can be used to select evaluations and override parameters of
     * evaluations.
     * </p>
     * 
     * @param statistics
     *        Configuration for evaluations. Statistics can be used to select evaluations and override parameters of
     *        evaluations.
     */

    public void setStatistics(StatisticsConfiguration statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * Configuration for evaluations. Statistics can be used to select evaluations and override parameters of
     * evaluations.
     * </p>
     * 
     * @return Configuration for evaluations. Statistics can be used to select evaluations and override parameters of
     *         evaluations.
     */

    public StatisticsConfiguration getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * Configuration for evaluations. Statistics can be used to select evaluations and override parameters of
     * evaluations.
     * </p>
     * 
     * @param statistics
     *        Configuration for evaluations. Statistics can be used to select evaluations and override parameters of
     *        evaluations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsConfiguration withStatistics(StatisticsConfiguration statistics) {
        setStatistics(statistics);
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
        if (getSelectors() != null)
            sb.append("Selectors: ").append(getSelectors()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnStatisticsConfiguration == false)
            return false;
        ColumnStatisticsConfiguration other = (ColumnStatisticsConfiguration) obj;
        if (other.getSelectors() == null ^ this.getSelectors() == null)
            return false;
        if (other.getSelectors() != null && other.getSelectors().equals(this.getSelectors()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelectors() == null) ? 0 : getSelectors().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        return hashCode;
    }

    @Override
    public ColumnStatisticsConfiguration clone() {
        try {
            return (ColumnStatisticsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.ColumnStatisticsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * Configuration of evaluations for a profile job. This configuration can be used to select evaluations and override the
 * parameters of selected evaluations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/StatisticsConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatisticsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of included evaluations. When the list is undefined, all supported evaluations will be included.
     * </p>
     */
    private java.util.List<String> includedStatistics;
    /**
     * <p>
     * List of overrides for evaluations.
     * </p>
     */
    private java.util.List<StatisticOverride> overrides;

    /**
     * <p>
     * List of included evaluations. When the list is undefined, all supported evaluations will be included.
     * </p>
     * 
     * @return List of included evaluations. When the list is undefined, all supported evaluations will be included.
     */

    public java.util.List<String> getIncludedStatistics() {
        return includedStatistics;
    }

    /**
     * <p>
     * List of included evaluations. When the list is undefined, all supported evaluations will be included.
     * </p>
     * 
     * @param includedStatistics
     *        List of included evaluations. When the list is undefined, all supported evaluations will be included.
     */

    public void setIncludedStatistics(java.util.Collection<String> includedStatistics) {
        if (includedStatistics == null) {
            this.includedStatistics = null;
            return;
        }

        this.includedStatistics = new java.util.ArrayList<String>(includedStatistics);
    }

    /**
     * <p>
     * List of included evaluations. When the list is undefined, all supported evaluations will be included.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludedStatistics(java.util.Collection)} or {@link #withIncludedStatistics(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param includedStatistics
     *        List of included evaluations. When the list is undefined, all supported evaluations will be included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatisticsConfiguration withIncludedStatistics(String... includedStatistics) {
        if (this.includedStatistics == null) {
            setIncludedStatistics(new java.util.ArrayList<String>(includedStatistics.length));
        }
        for (String ele : includedStatistics) {
            this.includedStatistics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of included evaluations. When the list is undefined, all supported evaluations will be included.
     * </p>
     * 
     * @param includedStatistics
     *        List of included evaluations. When the list is undefined, all supported evaluations will be included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatisticsConfiguration withIncludedStatistics(java.util.Collection<String> includedStatistics) {
        setIncludedStatistics(includedStatistics);
        return this;
    }

    /**
     * <p>
     * List of overrides for evaluations.
     * </p>
     * 
     * @return List of overrides for evaluations.
     */

    public java.util.List<StatisticOverride> getOverrides() {
        return overrides;
    }

    /**
     * <p>
     * List of overrides for evaluations.
     * </p>
     * 
     * @param overrides
     *        List of overrides for evaluations.
     */

    public void setOverrides(java.util.Collection<StatisticOverride> overrides) {
        if (overrides == null) {
            this.overrides = null;
            return;
        }

        this.overrides = new java.util.ArrayList<StatisticOverride>(overrides);
    }

    /**
     * <p>
     * List of overrides for evaluations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOverrides(java.util.Collection)} or {@link #withOverrides(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param overrides
     *        List of overrides for evaluations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatisticsConfiguration withOverrides(StatisticOverride... overrides) {
        if (this.overrides == null) {
            setOverrides(new java.util.ArrayList<StatisticOverride>(overrides.length));
        }
        for (StatisticOverride ele : overrides) {
            this.overrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of overrides for evaluations.
     * </p>
     * 
     * @param overrides
     *        List of overrides for evaluations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatisticsConfiguration withOverrides(java.util.Collection<StatisticOverride> overrides) {
        setOverrides(overrides);
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
        if (getIncludedStatistics() != null)
            sb.append("IncludedStatistics: ").append(getIncludedStatistics()).append(",");
        if (getOverrides() != null)
            sb.append("Overrides: ").append(getOverrides());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatisticsConfiguration == false)
            return false;
        StatisticsConfiguration other = (StatisticsConfiguration) obj;
        if (other.getIncludedStatistics() == null ^ this.getIncludedStatistics() == null)
            return false;
        if (other.getIncludedStatistics() != null && other.getIncludedStatistics().equals(this.getIncludedStatistics()) == false)
            return false;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludedStatistics() == null) ? 0 : getIncludedStatistics().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        return hashCode;
    }

    @Override
    public StatisticsConfiguration clone() {
        try {
            return (StatisticsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.StatisticsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

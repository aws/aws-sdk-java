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
 * The color configuration of a waterfall visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/WaterfallChartColorConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WaterfallChartColorConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The color configuration for individual groups within a waterfall visual.
     * </p>
     */
    private WaterfallChartGroupColorConfiguration groupColorConfiguration;

    /**
     * <p>
     * The color configuration for individual groups within a waterfall visual.
     * </p>
     * 
     * @param groupColorConfiguration
     *        The color configuration for individual groups within a waterfall visual.
     */

    public void setGroupColorConfiguration(WaterfallChartGroupColorConfiguration groupColorConfiguration) {
        this.groupColorConfiguration = groupColorConfiguration;
    }

    /**
     * <p>
     * The color configuration for individual groups within a waterfall visual.
     * </p>
     * 
     * @return The color configuration for individual groups within a waterfall visual.
     */

    public WaterfallChartGroupColorConfiguration getGroupColorConfiguration() {
        return this.groupColorConfiguration;
    }

    /**
     * <p>
     * The color configuration for individual groups within a waterfall visual.
     * </p>
     * 
     * @param groupColorConfiguration
     *        The color configuration for individual groups within a waterfall visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartColorConfiguration withGroupColorConfiguration(WaterfallChartGroupColorConfiguration groupColorConfiguration) {
        setGroupColorConfiguration(groupColorConfiguration);
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
        if (getGroupColorConfiguration() != null)
            sb.append("GroupColorConfiguration: ").append(getGroupColorConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WaterfallChartColorConfiguration == false)
            return false;
        WaterfallChartColorConfiguration other = (WaterfallChartColorConfiguration) obj;
        if (other.getGroupColorConfiguration() == null ^ this.getGroupColorConfiguration() == null)
            return false;
        if (other.getGroupColorConfiguration() != null && other.getGroupColorConfiguration().equals(this.getGroupColorConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupColorConfiguration() == null) ? 0 : getGroupColorConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public WaterfallChartColorConfiguration clone() {
        try {
            return (WaterfallChartColorConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.WaterfallChartColorConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

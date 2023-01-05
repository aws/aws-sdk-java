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
 * The options for configuring a donut chart or pie chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DonutOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DonutOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The option for define the arc of the chart shape. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WHOLE</code> - A pie chart
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMALL</code>- A small-sized donut chart
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code>- A medium-sized donut chart
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LARGE</code>- A large-sized donut chart
     * </p>
     * </li>
     * </ul>
     */
    private ArcOptions arcOptions;
    /**
     * <p>
     * The label options of the label that is displayed in the center of a donut chart. This option isn't available for
     * pie charts.
     * </p>
     */
    private DonutCenterOptions donutCenterOptions;

    /**
     * <p>
     * The option for define the arc of the chart shape. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WHOLE</code> - A pie chart
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMALL</code>- A small-sized donut chart
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code>- A medium-sized donut chart
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LARGE</code>- A large-sized donut chart
     * </p>
     * </li>
     * </ul>
     * 
     * @param arcOptions
     *        The option for define the arc of the chart shape. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>WHOLE</code> - A pie chart
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMALL</code>- A small-sized donut chart
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MEDIUM</code>- A medium-sized donut chart
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LARGE</code>- A large-sized donut chart
     *        </p>
     *        </li>
     */

    public void setArcOptions(ArcOptions arcOptions) {
        this.arcOptions = arcOptions;
    }

    /**
     * <p>
     * The option for define the arc of the chart shape. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WHOLE</code> - A pie chart
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMALL</code>- A small-sized donut chart
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code>- A medium-sized donut chart
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LARGE</code>- A large-sized donut chart
     * </p>
     * </li>
     * </ul>
     * 
     * @return The option for define the arc of the chart shape. Valid values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>WHOLE</code> - A pie chart
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SMALL</code>- A small-sized donut chart
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MEDIUM</code>- A medium-sized donut chart
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LARGE</code>- A large-sized donut chart
     *         </p>
     *         </li>
     */

    public ArcOptions getArcOptions() {
        return this.arcOptions;
    }

    /**
     * <p>
     * The option for define the arc of the chart shape. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WHOLE</code> - A pie chart
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMALL</code>- A small-sized donut chart
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code>- A medium-sized donut chart
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LARGE</code>- A large-sized donut chart
     * </p>
     * </li>
     * </ul>
     * 
     * @param arcOptions
     *        The option for define the arc of the chart shape. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>WHOLE</code> - A pie chart
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMALL</code>- A small-sized donut chart
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MEDIUM</code>- A medium-sized donut chart
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LARGE</code>- A large-sized donut chart
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DonutOptions withArcOptions(ArcOptions arcOptions) {
        setArcOptions(arcOptions);
        return this;
    }

    /**
     * <p>
     * The label options of the label that is displayed in the center of a donut chart. This option isn't available for
     * pie charts.
     * </p>
     * 
     * @param donutCenterOptions
     *        The label options of the label that is displayed in the center of a donut chart. This option isn't
     *        available for pie charts.
     */

    public void setDonutCenterOptions(DonutCenterOptions donutCenterOptions) {
        this.donutCenterOptions = donutCenterOptions;
    }

    /**
     * <p>
     * The label options of the label that is displayed in the center of a donut chart. This option isn't available for
     * pie charts.
     * </p>
     * 
     * @return The label options of the label that is displayed in the center of a donut chart. This option isn't
     *         available for pie charts.
     */

    public DonutCenterOptions getDonutCenterOptions() {
        return this.donutCenterOptions;
    }

    /**
     * <p>
     * The label options of the label that is displayed in the center of a donut chart. This option isn't available for
     * pie charts.
     * </p>
     * 
     * @param donutCenterOptions
     *        The label options of the label that is displayed in the center of a donut chart. This option isn't
     *        available for pie charts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DonutOptions withDonutCenterOptions(DonutCenterOptions donutCenterOptions) {
        setDonutCenterOptions(donutCenterOptions);
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
        if (getArcOptions() != null)
            sb.append("ArcOptions: ").append(getArcOptions()).append(",");
        if (getDonutCenterOptions() != null)
            sb.append("DonutCenterOptions: ").append(getDonutCenterOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DonutOptions == false)
            return false;
        DonutOptions other = (DonutOptions) obj;
        if (other.getArcOptions() == null ^ this.getArcOptions() == null)
            return false;
        if (other.getArcOptions() != null && other.getArcOptions().equals(this.getArcOptions()) == false)
            return false;
        if (other.getDonutCenterOptions() == null ^ this.getDonutCenterOptions() == null)
            return false;
        if (other.getDonutCenterOptions() != null && other.getDonutCenterOptions().equals(this.getDonutCenterOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArcOptions() == null) ? 0 : getArcOptions().hashCode());
        hashCode = prime * hashCode + ((getDonutCenterOptions() == null) ? 0 : getDonutCenterOptions().hashCode());
        return hashCode;
    }

    @Override
    public DonutOptions clone() {
        try {
            return (DonutOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DonutOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * The data configuration of the reference line.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ReferenceLineDataConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceLineDataConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The static data configuration of the reference line data configuration.
     * </p>
     */
    private ReferenceLineStaticDataConfiguration staticConfiguration;
    /**
     * <p>
     * The dynamic configuration of the reference line data configuration.
     * </p>
     */
    private ReferenceLineDynamicDataConfiguration dynamicConfiguration;
    /**
     * <p>
     * The axis binding type of the reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PrimaryY
     * </p>
     * </li>
     * <li>
     * <p>
     * SecondaryY
     * </p>
     * </li>
     * </ul>
     */
    private String axisBinding;

    /**
     * <p>
     * The static data configuration of the reference line data configuration.
     * </p>
     * 
     * @param staticConfiguration
     *        The static data configuration of the reference line data configuration.
     */

    public void setStaticConfiguration(ReferenceLineStaticDataConfiguration staticConfiguration) {
        this.staticConfiguration = staticConfiguration;
    }

    /**
     * <p>
     * The static data configuration of the reference line data configuration.
     * </p>
     * 
     * @return The static data configuration of the reference line data configuration.
     */

    public ReferenceLineStaticDataConfiguration getStaticConfiguration() {
        return this.staticConfiguration;
    }

    /**
     * <p>
     * The static data configuration of the reference line data configuration.
     * </p>
     * 
     * @param staticConfiguration
     *        The static data configuration of the reference line data configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLineDataConfiguration withStaticConfiguration(ReferenceLineStaticDataConfiguration staticConfiguration) {
        setStaticConfiguration(staticConfiguration);
        return this;
    }

    /**
     * <p>
     * The dynamic configuration of the reference line data configuration.
     * </p>
     * 
     * @param dynamicConfiguration
     *        The dynamic configuration of the reference line data configuration.
     */

    public void setDynamicConfiguration(ReferenceLineDynamicDataConfiguration dynamicConfiguration) {
        this.dynamicConfiguration = dynamicConfiguration;
    }

    /**
     * <p>
     * The dynamic configuration of the reference line data configuration.
     * </p>
     * 
     * @return The dynamic configuration of the reference line data configuration.
     */

    public ReferenceLineDynamicDataConfiguration getDynamicConfiguration() {
        return this.dynamicConfiguration;
    }

    /**
     * <p>
     * The dynamic configuration of the reference line data configuration.
     * </p>
     * 
     * @param dynamicConfiguration
     *        The dynamic configuration of the reference line data configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLineDataConfiguration withDynamicConfiguration(ReferenceLineDynamicDataConfiguration dynamicConfiguration) {
        setDynamicConfiguration(dynamicConfiguration);
        return this;
    }

    /**
     * <p>
     * The axis binding type of the reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PrimaryY
     * </p>
     * </li>
     * <li>
     * <p>
     * SecondaryY
     * </p>
     * </li>
     * </ul>
     * 
     * @param axisBinding
     *        The axis binding type of the reference line. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PrimaryY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SecondaryY
     *        </p>
     *        </li>
     * @see AxisBinding
     */

    public void setAxisBinding(String axisBinding) {
        this.axisBinding = axisBinding;
    }

    /**
     * <p>
     * The axis binding type of the reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PrimaryY
     * </p>
     * </li>
     * <li>
     * <p>
     * SecondaryY
     * </p>
     * </li>
     * </ul>
     * 
     * @return The axis binding type of the reference line. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PrimaryY
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SecondaryY
     *         </p>
     *         </li>
     * @see AxisBinding
     */

    public String getAxisBinding() {
        return this.axisBinding;
    }

    /**
     * <p>
     * The axis binding type of the reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PrimaryY
     * </p>
     * </li>
     * <li>
     * <p>
     * SecondaryY
     * </p>
     * </li>
     * </ul>
     * 
     * @param axisBinding
     *        The axis binding type of the reference line. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PrimaryY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SecondaryY
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AxisBinding
     */

    public ReferenceLineDataConfiguration withAxisBinding(String axisBinding) {
        setAxisBinding(axisBinding);
        return this;
    }

    /**
     * <p>
     * The axis binding type of the reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PrimaryY
     * </p>
     * </li>
     * <li>
     * <p>
     * SecondaryY
     * </p>
     * </li>
     * </ul>
     * 
     * @param axisBinding
     *        The axis binding type of the reference line. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PrimaryY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SecondaryY
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AxisBinding
     */

    public ReferenceLineDataConfiguration withAxisBinding(AxisBinding axisBinding) {
        this.axisBinding = axisBinding.toString();
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
        if (getStaticConfiguration() != null)
            sb.append("StaticConfiguration: ").append(getStaticConfiguration()).append(",");
        if (getDynamicConfiguration() != null)
            sb.append("DynamicConfiguration: ").append(getDynamicConfiguration()).append(",");
        if (getAxisBinding() != null)
            sb.append("AxisBinding: ").append(getAxisBinding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceLineDataConfiguration == false)
            return false;
        ReferenceLineDataConfiguration other = (ReferenceLineDataConfiguration) obj;
        if (other.getStaticConfiguration() == null ^ this.getStaticConfiguration() == null)
            return false;
        if (other.getStaticConfiguration() != null && other.getStaticConfiguration().equals(this.getStaticConfiguration()) == false)
            return false;
        if (other.getDynamicConfiguration() == null ^ this.getDynamicConfiguration() == null)
            return false;
        if (other.getDynamicConfiguration() != null && other.getDynamicConfiguration().equals(this.getDynamicConfiguration()) == false)
            return false;
        if (other.getAxisBinding() == null ^ this.getAxisBinding() == null)
            return false;
        if (other.getAxisBinding() != null && other.getAxisBinding().equals(this.getAxisBinding()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStaticConfiguration() == null) ? 0 : getStaticConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDynamicConfiguration() == null) ? 0 : getDynamicConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAxisBinding() == null) ? 0 : getAxisBinding().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceLineDataConfiguration clone() {
        try {
            return (ReferenceLineDataConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ReferenceLineDataConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

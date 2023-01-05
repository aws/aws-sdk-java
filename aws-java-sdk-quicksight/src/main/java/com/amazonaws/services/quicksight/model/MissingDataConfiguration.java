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
 * The configuration options that determine how missing data is treated during the rendering of a line chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/MissingDataConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MissingDataConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The treatment option that determines how missing data should be rendered. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INTERPOLATE</code>: Interpolate missing values between the prior and the next known value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHOW_AS_ZERO</code>: Show missing values as the value <code>0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHOW_AS_BLANK</code>: Display a blank space when rendering missing data.
     * </p>
     * </li>
     * </ul>
     */
    private String treatmentOption;

    /**
     * <p>
     * The treatment option that determines how missing data should be rendered. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INTERPOLATE</code>: Interpolate missing values between the prior and the next known value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHOW_AS_ZERO</code>: Show missing values as the value <code>0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHOW_AS_BLANK</code>: Display a blank space when rendering missing data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param treatmentOption
     *        The treatment option that determines how missing data should be rendered. Choose from the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INTERPOLATE</code>: Interpolate missing values between the prior and the next known value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SHOW_AS_ZERO</code>: Show missing values as the value <code>0</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SHOW_AS_BLANK</code>: Display a blank space when rendering missing data.
     *        </p>
     *        </li>
     * @see MissingDataTreatmentOption
     */

    public void setTreatmentOption(String treatmentOption) {
        this.treatmentOption = treatmentOption;
    }

    /**
     * <p>
     * The treatment option that determines how missing data should be rendered. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INTERPOLATE</code>: Interpolate missing values between the prior and the next known value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHOW_AS_ZERO</code>: Show missing values as the value <code>0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHOW_AS_BLANK</code>: Display a blank space when rendering missing data.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The treatment option that determines how missing data should be rendered. Choose from the following
     *         options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INTERPOLATE</code>: Interpolate missing values between the prior and the next known value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SHOW_AS_ZERO</code>: Show missing values as the value <code>0</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SHOW_AS_BLANK</code>: Display a blank space when rendering missing data.
     *         </p>
     *         </li>
     * @see MissingDataTreatmentOption
     */

    public String getTreatmentOption() {
        return this.treatmentOption;
    }

    /**
     * <p>
     * The treatment option that determines how missing data should be rendered. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INTERPOLATE</code>: Interpolate missing values between the prior and the next known value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHOW_AS_ZERO</code>: Show missing values as the value <code>0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHOW_AS_BLANK</code>: Display a blank space when rendering missing data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param treatmentOption
     *        The treatment option that determines how missing data should be rendered. Choose from the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INTERPOLATE</code>: Interpolate missing values between the prior and the next known value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SHOW_AS_ZERO</code>: Show missing values as the value <code>0</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SHOW_AS_BLANK</code>: Display a blank space when rendering missing data.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MissingDataTreatmentOption
     */

    public MissingDataConfiguration withTreatmentOption(String treatmentOption) {
        setTreatmentOption(treatmentOption);
        return this;
    }

    /**
     * <p>
     * The treatment option that determines how missing data should be rendered. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INTERPOLATE</code>: Interpolate missing values between the prior and the next known value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHOW_AS_ZERO</code>: Show missing values as the value <code>0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHOW_AS_BLANK</code>: Display a blank space when rendering missing data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param treatmentOption
     *        The treatment option that determines how missing data should be rendered. Choose from the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INTERPOLATE</code>: Interpolate missing values between the prior and the next known value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SHOW_AS_ZERO</code>: Show missing values as the value <code>0</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SHOW_AS_BLANK</code>: Display a blank space when rendering missing data.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MissingDataTreatmentOption
     */

    public MissingDataConfiguration withTreatmentOption(MissingDataTreatmentOption treatmentOption) {
        this.treatmentOption = treatmentOption.toString();
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
        if (getTreatmentOption() != null)
            sb.append("TreatmentOption: ").append(getTreatmentOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MissingDataConfiguration == false)
            return false;
        MissingDataConfiguration other = (MissingDataConfiguration) obj;
        if (other.getTreatmentOption() == null ^ this.getTreatmentOption() == null)
            return false;
        if (other.getTreatmentOption() != null && other.getTreatmentOption().equals(this.getTreatmentOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTreatmentOption() == null) ? 0 : getTreatmentOption().hashCode());
        return hashCode;
    }

    @Override
    public MissingDataConfiguration clone() {
        try {
            return (MissingDataConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.MissingDataConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

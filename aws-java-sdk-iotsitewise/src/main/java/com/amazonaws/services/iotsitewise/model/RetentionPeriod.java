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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * How many days your data is kept in the hot tier. By default, your data is kept indefinitely in the hot tier.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/RetentionPeriod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetentionPeriod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of days that your data is kept.
     * </p>
     * <note>
     * <p>
     * If you specified a value for this parameter, the <code>unlimited</code> parameter must be <code>false</code>.
     * </p>
     * </note>
     */
    private Integer numberOfDays;
    /**
     * <p>
     * If true, your data is kept indefinitely.
     * </p>
     * <note>
     * <p>
     * If configured to <code>true</code>, you must not specify a value for the <code>numberOfDays</code> parameter.
     * </p>
     * </note>
     */
    private Boolean unlimited;

    /**
     * <p>
     * The number of days that your data is kept.
     * </p>
     * <note>
     * <p>
     * If you specified a value for this parameter, the <code>unlimited</code> parameter must be <code>false</code>.
     * </p>
     * </note>
     * 
     * @param numberOfDays
     *        The number of days that your data is kept.</p> <note>
     *        <p>
     *        If you specified a value for this parameter, the <code>unlimited</code> parameter must be
     *        <code>false</code>.
     *        </p>
     */

    public void setNumberOfDays(Integer numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    /**
     * <p>
     * The number of days that your data is kept.
     * </p>
     * <note>
     * <p>
     * If you specified a value for this parameter, the <code>unlimited</code> parameter must be <code>false</code>.
     * </p>
     * </note>
     * 
     * @return The number of days that your data is kept.</p> <note>
     *         <p>
     *         If you specified a value for this parameter, the <code>unlimited</code> parameter must be
     *         <code>false</code>.
     *         </p>
     */

    public Integer getNumberOfDays() {
        return this.numberOfDays;
    }

    /**
     * <p>
     * The number of days that your data is kept.
     * </p>
     * <note>
     * <p>
     * If you specified a value for this parameter, the <code>unlimited</code> parameter must be <code>false</code>.
     * </p>
     * </note>
     * 
     * @param numberOfDays
     *        The number of days that your data is kept.</p> <note>
     *        <p>
     *        If you specified a value for this parameter, the <code>unlimited</code> parameter must be
     *        <code>false</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetentionPeriod withNumberOfDays(Integer numberOfDays) {
        setNumberOfDays(numberOfDays);
        return this;
    }

    /**
     * <p>
     * If true, your data is kept indefinitely.
     * </p>
     * <note>
     * <p>
     * If configured to <code>true</code>, you must not specify a value for the <code>numberOfDays</code> parameter.
     * </p>
     * </note>
     * 
     * @param unlimited
     *        If true, your data is kept indefinitely.</p> <note>
     *        <p>
     *        If configured to <code>true</code>, you must not specify a value for the <code>numberOfDays</code>
     *        parameter.
     *        </p>
     */

    public void setUnlimited(Boolean unlimited) {
        this.unlimited = unlimited;
    }

    /**
     * <p>
     * If true, your data is kept indefinitely.
     * </p>
     * <note>
     * <p>
     * If configured to <code>true</code>, you must not specify a value for the <code>numberOfDays</code> parameter.
     * </p>
     * </note>
     * 
     * @return If true, your data is kept indefinitely.</p> <note>
     *         <p>
     *         If configured to <code>true</code>, you must not specify a value for the <code>numberOfDays</code>
     *         parameter.
     *         </p>
     */

    public Boolean getUnlimited() {
        return this.unlimited;
    }

    /**
     * <p>
     * If true, your data is kept indefinitely.
     * </p>
     * <note>
     * <p>
     * If configured to <code>true</code>, you must not specify a value for the <code>numberOfDays</code> parameter.
     * </p>
     * </note>
     * 
     * @param unlimited
     *        If true, your data is kept indefinitely.</p> <note>
     *        <p>
     *        If configured to <code>true</code>, you must not specify a value for the <code>numberOfDays</code>
     *        parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetentionPeriod withUnlimited(Boolean unlimited) {
        setUnlimited(unlimited);
        return this;
    }

    /**
     * <p>
     * If true, your data is kept indefinitely.
     * </p>
     * <note>
     * <p>
     * If configured to <code>true</code>, you must not specify a value for the <code>numberOfDays</code> parameter.
     * </p>
     * </note>
     * 
     * @return If true, your data is kept indefinitely.</p> <note>
     *         <p>
     *         If configured to <code>true</code>, you must not specify a value for the <code>numberOfDays</code>
     *         parameter.
     *         </p>
     */

    public Boolean isUnlimited() {
        return this.unlimited;
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
        if (getNumberOfDays() != null)
            sb.append("NumberOfDays: ").append(getNumberOfDays()).append(",");
        if (getUnlimited() != null)
            sb.append("Unlimited: ").append(getUnlimited());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetentionPeriod == false)
            return false;
        RetentionPeriod other = (RetentionPeriod) obj;
        if (other.getNumberOfDays() == null ^ this.getNumberOfDays() == null)
            return false;
        if (other.getNumberOfDays() != null && other.getNumberOfDays().equals(this.getNumberOfDays()) == false)
            return false;
        if (other.getUnlimited() == null ^ this.getUnlimited() == null)
            return false;
        if (other.getUnlimited() != null && other.getUnlimited().equals(this.getUnlimited()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfDays() == null) ? 0 : getNumberOfDays().hashCode());
        hashCode = prime * hashCode + ((getUnlimited() == null) ? 0 : getUnlimited().hashCode());
        return hashCode;
    }

    @Override
    public RetentionPeriod clone() {
        try {
            return (RetentionPeriod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.RetentionPeriodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

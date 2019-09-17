/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on recommended instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/TargetInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetInstance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Expected cost to operate this instance type on a monthly basis.
     * </p>
     */
    private String estimatedMonthlyCost;
    /**
     * <p>
     * Estimated savings resulting from modification, on a monthly basis.
     * </p>
     */
    private String estimatedMonthlySavings;
    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs for this instance.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * Indicates whether or not this recommendation is the defaulted Amazon Web Services recommendation.
     * </p>
     */
    private Boolean defaultTargetInstance;
    /**
     * <p>
     * Details on the target instance type.
     * </p>
     */
    private ResourceDetails resourceDetails;
    /**
     * <p>
     * Expected utilization metrics for target instance type.
     * </p>
     */
    private ResourceUtilization expectedResourceUtilization;

    /**
     * <p>
     * Expected cost to operate this instance type on a monthly basis.
     * </p>
     * 
     * @param estimatedMonthlyCost
     *        Expected cost to operate this instance type on a monthly basis.
     */

    public void setEstimatedMonthlyCost(String estimatedMonthlyCost) {
        this.estimatedMonthlyCost = estimatedMonthlyCost;
    }

    /**
     * <p>
     * Expected cost to operate this instance type on a monthly basis.
     * </p>
     * 
     * @return Expected cost to operate this instance type on a monthly basis.
     */

    public String getEstimatedMonthlyCost() {
        return this.estimatedMonthlyCost;
    }

    /**
     * <p>
     * Expected cost to operate this instance type on a monthly basis.
     * </p>
     * 
     * @param estimatedMonthlyCost
     *        Expected cost to operate this instance type on a monthly basis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetInstance withEstimatedMonthlyCost(String estimatedMonthlyCost) {
        setEstimatedMonthlyCost(estimatedMonthlyCost);
        return this;
    }

    /**
     * <p>
     * Estimated savings resulting from modification, on a monthly basis.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        Estimated savings resulting from modification, on a monthly basis.
     */

    public void setEstimatedMonthlySavings(String estimatedMonthlySavings) {
        this.estimatedMonthlySavings = estimatedMonthlySavings;
    }

    /**
     * <p>
     * Estimated savings resulting from modification, on a monthly basis.
     * </p>
     * 
     * @return Estimated savings resulting from modification, on a monthly basis.
     */

    public String getEstimatedMonthlySavings() {
        return this.estimatedMonthlySavings;
    }

    /**
     * <p>
     * Estimated savings resulting from modification, on a monthly basis.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        Estimated savings resulting from modification, on a monthly basis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetInstance withEstimatedMonthlySavings(String estimatedMonthlySavings) {
        setEstimatedMonthlySavings(estimatedMonthlySavings);
        return this;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs for this instance.
     * </p>
     * 
     * @param currencyCode
     *        The currency code that Amazon Web Services used to calculate the costs for this instance.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs for this instance.
     * </p>
     * 
     * @return The currency code that Amazon Web Services used to calculate the costs for this instance.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs for this instance.
     * </p>
     * 
     * @param currencyCode
     *        The currency code that Amazon Web Services used to calculate the costs for this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetInstance withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not this recommendation is the defaulted Amazon Web Services recommendation.
     * </p>
     * 
     * @param defaultTargetInstance
     *        Indicates whether or not this recommendation is the defaulted Amazon Web Services recommendation.
     */

    public void setDefaultTargetInstance(Boolean defaultTargetInstance) {
        this.defaultTargetInstance = defaultTargetInstance;
    }

    /**
     * <p>
     * Indicates whether or not this recommendation is the defaulted Amazon Web Services recommendation.
     * </p>
     * 
     * @return Indicates whether or not this recommendation is the defaulted Amazon Web Services recommendation.
     */

    public Boolean getDefaultTargetInstance() {
        return this.defaultTargetInstance;
    }

    /**
     * <p>
     * Indicates whether or not this recommendation is the defaulted Amazon Web Services recommendation.
     * </p>
     * 
     * @param defaultTargetInstance
     *        Indicates whether or not this recommendation is the defaulted Amazon Web Services recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetInstance withDefaultTargetInstance(Boolean defaultTargetInstance) {
        setDefaultTargetInstance(defaultTargetInstance);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not this recommendation is the defaulted Amazon Web Services recommendation.
     * </p>
     * 
     * @return Indicates whether or not this recommendation is the defaulted Amazon Web Services recommendation.
     */

    public Boolean isDefaultTargetInstance() {
        return this.defaultTargetInstance;
    }

    /**
     * <p>
     * Details on the target instance type.
     * </p>
     * 
     * @param resourceDetails
     *        Details on the target instance type.
     */

    public void setResourceDetails(ResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    /**
     * <p>
     * Details on the target instance type.
     * </p>
     * 
     * @return Details on the target instance type.
     */

    public ResourceDetails getResourceDetails() {
        return this.resourceDetails;
    }

    /**
     * <p>
     * Details on the target instance type.
     * </p>
     * 
     * @param resourceDetails
     *        Details on the target instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetInstance withResourceDetails(ResourceDetails resourceDetails) {
        setResourceDetails(resourceDetails);
        return this;
    }

    /**
     * <p>
     * Expected utilization metrics for target instance type.
     * </p>
     * 
     * @param expectedResourceUtilization
     *        Expected utilization metrics for target instance type.
     */

    public void setExpectedResourceUtilization(ResourceUtilization expectedResourceUtilization) {
        this.expectedResourceUtilization = expectedResourceUtilization;
    }

    /**
     * <p>
     * Expected utilization metrics for target instance type.
     * </p>
     * 
     * @return Expected utilization metrics for target instance type.
     */

    public ResourceUtilization getExpectedResourceUtilization() {
        return this.expectedResourceUtilization;
    }

    /**
     * <p>
     * Expected utilization metrics for target instance type.
     * </p>
     * 
     * @param expectedResourceUtilization
     *        Expected utilization metrics for target instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetInstance withExpectedResourceUtilization(ResourceUtilization expectedResourceUtilization) {
        setExpectedResourceUtilization(expectedResourceUtilization);
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
        if (getEstimatedMonthlyCost() != null)
            sb.append("EstimatedMonthlyCost: ").append(getEstimatedMonthlyCost()).append(",");
        if (getEstimatedMonthlySavings() != null)
            sb.append("EstimatedMonthlySavings: ").append(getEstimatedMonthlySavings()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getDefaultTargetInstance() != null)
            sb.append("DefaultTargetInstance: ").append(getDefaultTargetInstance()).append(",");
        if (getResourceDetails() != null)
            sb.append("ResourceDetails: ").append(getResourceDetails()).append(",");
        if (getExpectedResourceUtilization() != null)
            sb.append("ExpectedResourceUtilization: ").append(getExpectedResourceUtilization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetInstance == false)
            return false;
        TargetInstance other = (TargetInstance) obj;
        if (other.getEstimatedMonthlyCost() == null ^ this.getEstimatedMonthlyCost() == null)
            return false;
        if (other.getEstimatedMonthlyCost() != null && other.getEstimatedMonthlyCost().equals(this.getEstimatedMonthlyCost()) == false)
            return false;
        if (other.getEstimatedMonthlySavings() == null ^ this.getEstimatedMonthlySavings() == null)
            return false;
        if (other.getEstimatedMonthlySavings() != null && other.getEstimatedMonthlySavings().equals(this.getEstimatedMonthlySavings()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getDefaultTargetInstance() == null ^ this.getDefaultTargetInstance() == null)
            return false;
        if (other.getDefaultTargetInstance() != null && other.getDefaultTargetInstance().equals(this.getDefaultTargetInstance()) == false)
            return false;
        if (other.getResourceDetails() == null ^ this.getResourceDetails() == null)
            return false;
        if (other.getResourceDetails() != null && other.getResourceDetails().equals(this.getResourceDetails()) == false)
            return false;
        if (other.getExpectedResourceUtilization() == null ^ this.getExpectedResourceUtilization() == null)
            return false;
        if (other.getExpectedResourceUtilization() != null && other.getExpectedResourceUtilization().equals(this.getExpectedResourceUtilization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEstimatedMonthlyCost() == null) ? 0 : getEstimatedMonthlyCost().hashCode());
        hashCode = prime * hashCode + ((getEstimatedMonthlySavings() == null) ? 0 : getEstimatedMonthlySavings().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getDefaultTargetInstance() == null) ? 0 : getDefaultTargetInstance().hashCode());
        hashCode = prime * hashCode + ((getResourceDetails() == null) ? 0 : getResourceDetails().hashCode());
        hashCode = prime * hashCode + ((getExpectedResourceUtilization() == null) ? 0 : getExpectedResourceUtilization().hashCode());
        return hashCode;
    }

    @Override
    public TargetInstance clone() {
        try {
            return (TargetInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.TargetInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

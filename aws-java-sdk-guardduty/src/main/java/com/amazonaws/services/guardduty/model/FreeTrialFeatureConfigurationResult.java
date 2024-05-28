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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the free trial period for a feature.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/FreeTrialFeatureConfigurationResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FreeTrialFeatureConfigurationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the feature for which the free trial is configured.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The number of the remaining free trial days for the feature.
     * </p>
     */
    private Integer freeTrialDaysRemaining;

    /**
     * <p>
     * The name of the feature for which the free trial is configured.
     * </p>
     * 
     * @param name
     *        The name of the feature for which the free trial is configured.
     * @see FreeTrialFeatureResult
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the feature for which the free trial is configured.
     * </p>
     * 
     * @return The name of the feature for which the free trial is configured.
     * @see FreeTrialFeatureResult
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the feature for which the free trial is configured.
     * </p>
     * 
     * @param name
     *        The name of the feature for which the free trial is configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FreeTrialFeatureResult
     */

    public FreeTrialFeatureConfigurationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the feature for which the free trial is configured.
     * </p>
     * 
     * @param name
     *        The name of the feature for which the free trial is configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FreeTrialFeatureResult
     */

    public FreeTrialFeatureConfigurationResult withName(FreeTrialFeatureResult name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The number of the remaining free trial days for the feature.
     * </p>
     * 
     * @param freeTrialDaysRemaining
     *        The number of the remaining free trial days for the feature.
     */

    public void setFreeTrialDaysRemaining(Integer freeTrialDaysRemaining) {
        this.freeTrialDaysRemaining = freeTrialDaysRemaining;
    }

    /**
     * <p>
     * The number of the remaining free trial days for the feature.
     * </p>
     * 
     * @return The number of the remaining free trial days for the feature.
     */

    public Integer getFreeTrialDaysRemaining() {
        return this.freeTrialDaysRemaining;
    }

    /**
     * <p>
     * The number of the remaining free trial days for the feature.
     * </p>
     * 
     * @param freeTrialDaysRemaining
     *        The number of the remaining free trial days for the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTrialFeatureConfigurationResult withFreeTrialDaysRemaining(Integer freeTrialDaysRemaining) {
        setFreeTrialDaysRemaining(freeTrialDaysRemaining);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFreeTrialDaysRemaining() != null)
            sb.append("FreeTrialDaysRemaining: ").append(getFreeTrialDaysRemaining());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FreeTrialFeatureConfigurationResult == false)
            return false;
        FreeTrialFeatureConfigurationResult other = (FreeTrialFeatureConfigurationResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFreeTrialDaysRemaining() == null ^ this.getFreeTrialDaysRemaining() == null)
            return false;
        if (other.getFreeTrialDaysRemaining() != null && other.getFreeTrialDaysRemaining().equals(this.getFreeTrialDaysRemaining()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFreeTrialDaysRemaining() == null) ? 0 : getFreeTrialDaysRemaining().hashCode());
        return hashCode;
    }

    @Override
    public FreeTrialFeatureConfigurationResult clone() {
        try {
            return (FreeTrialFeatureConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.FreeTrialFeatureConfigurationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

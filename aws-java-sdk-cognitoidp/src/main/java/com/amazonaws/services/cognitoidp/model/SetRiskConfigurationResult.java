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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetRiskConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetRiskConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The risk configuration.
     * </p>
     */
    private RiskConfigurationType riskConfiguration;

    /**
     * <p>
     * The risk configuration.
     * </p>
     * 
     * @param riskConfiguration
     *        The risk configuration.
     */

    public void setRiskConfiguration(RiskConfigurationType riskConfiguration) {
        this.riskConfiguration = riskConfiguration;
    }

    /**
     * <p>
     * The risk configuration.
     * </p>
     * 
     * @return The risk configuration.
     */

    public RiskConfigurationType getRiskConfiguration() {
        return this.riskConfiguration;
    }

    /**
     * <p>
     * The risk configuration.
     * </p>
     * 
     * @param riskConfiguration
     *        The risk configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetRiskConfigurationResult withRiskConfiguration(RiskConfigurationType riskConfiguration) {
        setRiskConfiguration(riskConfiguration);
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
        if (getRiskConfiguration() != null)
            sb.append("RiskConfiguration: ").append(getRiskConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetRiskConfigurationResult == false)
            return false;
        SetRiskConfigurationResult other = (SetRiskConfigurationResult) obj;
        if (other.getRiskConfiguration() == null ^ this.getRiskConfiguration() == null)
            return false;
        if (other.getRiskConfiguration() != null && other.getRiskConfiguration().equals(this.getRiskConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRiskConfiguration() == null) ? 0 : getRiskConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SetRiskConfigurationResult clone() {
        try {
            return (SetRiskConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the percentage of traffic to send to a staging distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ContinuousDeploymentSingleWeightConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContinuousDeploymentSingleWeightConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The percentage of traffic to send to a staging distribution, expressed as a decimal number between 0 and .15.
     * </p>
     */
    private Float weight;

    private SessionStickinessConfig sessionStickinessConfig;

    /**
     * <p>
     * The percentage of traffic to send to a staging distribution, expressed as a decimal number between 0 and .15.
     * </p>
     * 
     * @param weight
     *        The percentage of traffic to send to a staging distribution, expressed as a decimal number between 0 and
     *        .15.
     */

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The percentage of traffic to send to a staging distribution, expressed as a decimal number between 0 and .15.
     * </p>
     * 
     * @return The percentage of traffic to send to a staging distribution, expressed as a decimal number between 0 and
     *         .15.
     */

    public Float getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * The percentage of traffic to send to a staging distribution, expressed as a decimal number between 0 and .15.
     * </p>
     * 
     * @param weight
     *        The percentage of traffic to send to a staging distribution, expressed as a decimal number between 0 and
     *        .15.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousDeploymentSingleWeightConfig withWeight(Float weight) {
        setWeight(weight);
        return this;
    }

    /**
     * @param sessionStickinessConfig
     */

    public void setSessionStickinessConfig(SessionStickinessConfig sessionStickinessConfig) {
        this.sessionStickinessConfig = sessionStickinessConfig;
    }

    /**
     * @return
     */

    public SessionStickinessConfig getSessionStickinessConfig() {
        return this.sessionStickinessConfig;
    }

    /**
     * @param sessionStickinessConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousDeploymentSingleWeightConfig withSessionStickinessConfig(SessionStickinessConfig sessionStickinessConfig) {
        setSessionStickinessConfig(sessionStickinessConfig);
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
        if (getWeight() != null)
            sb.append("Weight: ").append(getWeight()).append(",");
        if (getSessionStickinessConfig() != null)
            sb.append("SessionStickinessConfig: ").append(getSessionStickinessConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContinuousDeploymentSingleWeightConfig == false)
            return false;
        ContinuousDeploymentSingleWeightConfig other = (ContinuousDeploymentSingleWeightConfig) obj;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        if (other.getSessionStickinessConfig() == null ^ this.getSessionStickinessConfig() == null)
            return false;
        if (other.getSessionStickinessConfig() != null && other.getSessionStickinessConfig().equals(this.getSessionStickinessConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        hashCode = prime * hashCode + ((getSessionStickinessConfig() == null) ? 0 : getSessionStickinessConfig().hashCode());
        return hashCode;
    }

    @Override
    public ContinuousDeploymentSingleWeightConfig clone() {
        try {
            return (ContinuousDeploymentSingleWeightConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

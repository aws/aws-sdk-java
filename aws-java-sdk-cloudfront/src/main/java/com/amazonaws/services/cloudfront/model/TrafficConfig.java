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
 * The traffic configuration of your continuous deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/TrafficConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficConfig implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the percentage of traffic to send to the staging distribution.
     * </p>
     */
    private ContinuousDeploymentSingleWeightConfig singleWeightConfig;
    /**
     * <p>
     * Determines which HTTP requests are sent to the staging distribution.
     * </p>
     */
    private ContinuousDeploymentSingleHeaderConfig singleHeaderConfig;
    /**
     * <p>
     * The type of traffic configuration.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Contains the percentage of traffic to send to the staging distribution.
     * </p>
     * 
     * @param singleWeightConfig
     *        Contains the percentage of traffic to send to the staging distribution.
     */

    public void setSingleWeightConfig(ContinuousDeploymentSingleWeightConfig singleWeightConfig) {
        this.singleWeightConfig = singleWeightConfig;
    }

    /**
     * <p>
     * Contains the percentage of traffic to send to the staging distribution.
     * </p>
     * 
     * @return Contains the percentage of traffic to send to the staging distribution.
     */

    public ContinuousDeploymentSingleWeightConfig getSingleWeightConfig() {
        return this.singleWeightConfig;
    }

    /**
     * <p>
     * Contains the percentage of traffic to send to the staging distribution.
     * </p>
     * 
     * @param singleWeightConfig
     *        Contains the percentage of traffic to send to the staging distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficConfig withSingleWeightConfig(ContinuousDeploymentSingleWeightConfig singleWeightConfig) {
        setSingleWeightConfig(singleWeightConfig);
        return this;
    }

    /**
     * <p>
     * Determines which HTTP requests are sent to the staging distribution.
     * </p>
     * 
     * @param singleHeaderConfig
     *        Determines which HTTP requests are sent to the staging distribution.
     */

    public void setSingleHeaderConfig(ContinuousDeploymentSingleHeaderConfig singleHeaderConfig) {
        this.singleHeaderConfig = singleHeaderConfig;
    }

    /**
     * <p>
     * Determines which HTTP requests are sent to the staging distribution.
     * </p>
     * 
     * @return Determines which HTTP requests are sent to the staging distribution.
     */

    public ContinuousDeploymentSingleHeaderConfig getSingleHeaderConfig() {
        return this.singleHeaderConfig;
    }

    /**
     * <p>
     * Determines which HTTP requests are sent to the staging distribution.
     * </p>
     * 
     * @param singleHeaderConfig
     *        Determines which HTTP requests are sent to the staging distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficConfig withSingleHeaderConfig(ContinuousDeploymentSingleHeaderConfig singleHeaderConfig) {
        setSingleHeaderConfig(singleHeaderConfig);
        return this;
    }

    /**
     * <p>
     * The type of traffic configuration.
     * </p>
     * 
     * @param type
     *        The type of traffic configuration.
     * @see ContinuousDeploymentPolicyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of traffic configuration.
     * </p>
     * 
     * @return The type of traffic configuration.
     * @see ContinuousDeploymentPolicyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of traffic configuration.
     * </p>
     * 
     * @param type
     *        The type of traffic configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContinuousDeploymentPolicyType
     */

    public TrafficConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of traffic configuration.
     * </p>
     * 
     * @param type
     *        The type of traffic configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContinuousDeploymentPolicyType
     */

    public TrafficConfig withType(ContinuousDeploymentPolicyType type) {
        this.type = type.toString();
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
        if (getSingleWeightConfig() != null)
            sb.append("SingleWeightConfig: ").append(getSingleWeightConfig()).append(",");
        if (getSingleHeaderConfig() != null)
            sb.append("SingleHeaderConfig: ").append(getSingleHeaderConfig()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficConfig == false)
            return false;
        TrafficConfig other = (TrafficConfig) obj;
        if (other.getSingleWeightConfig() == null ^ this.getSingleWeightConfig() == null)
            return false;
        if (other.getSingleWeightConfig() != null && other.getSingleWeightConfig().equals(this.getSingleWeightConfig()) == false)
            return false;
        if (other.getSingleHeaderConfig() == null ^ this.getSingleHeaderConfig() == null)
            return false;
        if (other.getSingleHeaderConfig() != null && other.getSingleHeaderConfig().equals(this.getSingleHeaderConfig()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSingleWeightConfig() == null) ? 0 : getSingleWeightConfig().hashCode());
        hashCode = prime * hashCode + ((getSingleHeaderConfig() == null) ? 0 : getSingleHeaderConfig().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public TrafficConfig clone() {
        try {
            return (TrafficConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

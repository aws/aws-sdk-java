/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the properties for hyperparameter optimization (HPO). For use with the bring-your-own-recipe feature. Do
 * not use for Amazon Personalize native recipes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/HPOConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HPOConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metric to optimize during HPO.
     * </p>
     */
    private HPOObjective hpoObjective;
    /**
     * <p>
     * Describes the resource configuration for HPO.
     * </p>
     */
    private HPOResourceConfig hpoResourceConfig;
    /**
     * <p>
     * The hyperparameters and their allowable ranges.
     * </p>
     */
    private HyperParameterRanges algorithmHyperParameterRanges;

    /**
     * <p>
     * The metric to optimize during HPO.
     * </p>
     * 
     * @param hpoObjective
     *        The metric to optimize during HPO.
     */

    public void setHpoObjective(HPOObjective hpoObjective) {
        this.hpoObjective = hpoObjective;
    }

    /**
     * <p>
     * The metric to optimize during HPO.
     * </p>
     * 
     * @return The metric to optimize during HPO.
     */

    public HPOObjective getHpoObjective() {
        return this.hpoObjective;
    }

    /**
     * <p>
     * The metric to optimize during HPO.
     * </p>
     * 
     * @param hpoObjective
     *        The metric to optimize during HPO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HPOConfig withHpoObjective(HPOObjective hpoObjective) {
        setHpoObjective(hpoObjective);
        return this;
    }

    /**
     * <p>
     * Describes the resource configuration for HPO.
     * </p>
     * 
     * @param hpoResourceConfig
     *        Describes the resource configuration for HPO.
     */

    public void setHpoResourceConfig(HPOResourceConfig hpoResourceConfig) {
        this.hpoResourceConfig = hpoResourceConfig;
    }

    /**
     * <p>
     * Describes the resource configuration for HPO.
     * </p>
     * 
     * @return Describes the resource configuration for HPO.
     */

    public HPOResourceConfig getHpoResourceConfig() {
        return this.hpoResourceConfig;
    }

    /**
     * <p>
     * Describes the resource configuration for HPO.
     * </p>
     * 
     * @param hpoResourceConfig
     *        Describes the resource configuration for HPO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HPOConfig withHpoResourceConfig(HPOResourceConfig hpoResourceConfig) {
        setHpoResourceConfig(hpoResourceConfig);
        return this;
    }

    /**
     * <p>
     * The hyperparameters and their allowable ranges.
     * </p>
     * 
     * @param algorithmHyperParameterRanges
     *        The hyperparameters and their allowable ranges.
     */

    public void setAlgorithmHyperParameterRanges(HyperParameterRanges algorithmHyperParameterRanges) {
        this.algorithmHyperParameterRanges = algorithmHyperParameterRanges;
    }

    /**
     * <p>
     * The hyperparameters and their allowable ranges.
     * </p>
     * 
     * @return The hyperparameters and their allowable ranges.
     */

    public HyperParameterRanges getAlgorithmHyperParameterRanges() {
        return this.algorithmHyperParameterRanges;
    }

    /**
     * <p>
     * The hyperparameters and their allowable ranges.
     * </p>
     * 
     * @param algorithmHyperParameterRanges
     *        The hyperparameters and their allowable ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HPOConfig withAlgorithmHyperParameterRanges(HyperParameterRanges algorithmHyperParameterRanges) {
        setAlgorithmHyperParameterRanges(algorithmHyperParameterRanges);
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
        if (getHpoObjective() != null)
            sb.append("HpoObjective: ").append(getHpoObjective()).append(",");
        if (getHpoResourceConfig() != null)
            sb.append("HpoResourceConfig: ").append(getHpoResourceConfig()).append(",");
        if (getAlgorithmHyperParameterRanges() != null)
            sb.append("AlgorithmHyperParameterRanges: ").append(getAlgorithmHyperParameterRanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HPOConfig == false)
            return false;
        HPOConfig other = (HPOConfig) obj;
        if (other.getHpoObjective() == null ^ this.getHpoObjective() == null)
            return false;
        if (other.getHpoObjective() != null && other.getHpoObjective().equals(this.getHpoObjective()) == false)
            return false;
        if (other.getHpoResourceConfig() == null ^ this.getHpoResourceConfig() == null)
            return false;
        if (other.getHpoResourceConfig() != null && other.getHpoResourceConfig().equals(this.getHpoResourceConfig()) == false)
            return false;
        if (other.getAlgorithmHyperParameterRanges() == null ^ this.getAlgorithmHyperParameterRanges() == null)
            return false;
        if (other.getAlgorithmHyperParameterRanges() != null
                && other.getAlgorithmHyperParameterRanges().equals(this.getAlgorithmHyperParameterRanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHpoObjective() == null) ? 0 : getHpoObjective().hashCode());
        hashCode = prime * hashCode + ((getHpoResourceConfig() == null) ? 0 : getHpoResourceConfig().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmHyperParameterRanges() == null) ? 0 : getAlgorithmHyperParameterRanges().hashCode());
        return hashCode;
    }

    @Override
    public HPOConfig clone() {
        try {
            return (HPOConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.HPOConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

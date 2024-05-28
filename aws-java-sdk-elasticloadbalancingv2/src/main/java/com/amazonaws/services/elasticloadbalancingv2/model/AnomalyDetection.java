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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about anomaly detection and mitigation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/AnomalyDetection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyDetection implements Serializable, Cloneable {

    /**
     * <p>
     * The latest anomaly detection result.
     * </p>
     */
    private String result;
    /**
     * <p>
     * Indicates whether anomaly mitigation is in progress.
     * </p>
     */
    private String mitigationInEffect;

    /**
     * <p>
     * The latest anomaly detection result.
     * </p>
     * 
     * @param result
     *        The latest anomaly detection result.
     * @see AnomalyResultEnum
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * <p>
     * The latest anomaly detection result.
     * </p>
     * 
     * @return The latest anomaly detection result.
     * @see AnomalyResultEnum
     */

    public String getResult() {
        return this.result;
    }

    /**
     * <p>
     * The latest anomaly detection result.
     * </p>
     * 
     * @param result
     *        The latest anomaly detection result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyResultEnum
     */

    public AnomalyDetection withResult(String result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * The latest anomaly detection result.
     * </p>
     * 
     * @param result
     *        The latest anomaly detection result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyResultEnum
     */

    public AnomalyDetection withResult(AnomalyResultEnum result) {
        this.result = result.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether anomaly mitigation is in progress.
     * </p>
     * 
     * @param mitigationInEffect
     *        Indicates whether anomaly mitigation is in progress.
     * @see MitigationInEffectEnum
     */

    public void setMitigationInEffect(String mitigationInEffect) {
        this.mitigationInEffect = mitigationInEffect;
    }

    /**
     * <p>
     * Indicates whether anomaly mitigation is in progress.
     * </p>
     * 
     * @return Indicates whether anomaly mitigation is in progress.
     * @see MitigationInEffectEnum
     */

    public String getMitigationInEffect() {
        return this.mitigationInEffect;
    }

    /**
     * <p>
     * Indicates whether anomaly mitigation is in progress.
     * </p>
     * 
     * @param mitigationInEffect
     *        Indicates whether anomaly mitigation is in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MitigationInEffectEnum
     */

    public AnomalyDetection withMitigationInEffect(String mitigationInEffect) {
        setMitigationInEffect(mitigationInEffect);
        return this;
    }

    /**
     * <p>
     * Indicates whether anomaly mitigation is in progress.
     * </p>
     * 
     * @param mitigationInEffect
     *        Indicates whether anomaly mitigation is in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MitigationInEffectEnum
     */

    public AnomalyDetection withMitigationInEffect(MitigationInEffectEnum mitigationInEffect) {
        this.mitigationInEffect = mitigationInEffect.toString();
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
        if (getResult() != null)
            sb.append("Result: ").append(getResult()).append(",");
        if (getMitigationInEffect() != null)
            sb.append("MitigationInEffect: ").append(getMitigationInEffect());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalyDetection == false)
            return false;
        AnomalyDetection other = (AnomalyDetection) obj;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        if (other.getMitigationInEffect() == null ^ this.getMitigationInEffect() == null)
            return false;
        if (other.getMitigationInEffect() != null && other.getMitigationInEffect().equals(this.getMitigationInEffect()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getMitigationInEffect() == null) ? 0 : getMitigationInEffect().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyDetection clone() {
        try {
            return (AnomalyDetection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

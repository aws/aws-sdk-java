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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This object includes parameters that you can use to provide information to CloudWatch to help it build more accurate
 * anomaly detection models.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/MetricCharacteristics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricCharacteristics implements Serializable, Cloneable {

    /**
     * <p>
     * Set this parameter to <code>true</code> if values for this metric consistently include spikes that should not be
     * considered to be anomalies. With this set to <code>true</code>, CloudWatch will expect to see spikes that
     * occurred consistently during the model training period, and won't flag future similar spikes as anomalies.
     * </p>
     */
    private Boolean periodicSpikes;

    /**
     * <p>
     * Set this parameter to <code>true</code> if values for this metric consistently include spikes that should not be
     * considered to be anomalies. With this set to <code>true</code>, CloudWatch will expect to see spikes that
     * occurred consistently during the model training period, and won't flag future similar spikes as anomalies.
     * </p>
     * 
     * @param periodicSpikes
     *        Set this parameter to <code>true</code> if values for this metric consistently include spikes that should
     *        not be considered to be anomalies. With this set to <code>true</code>, CloudWatch will expect to see
     *        spikes that occurred consistently during the model training period, and won't flag future similar spikes
     *        as anomalies.
     */

    public void setPeriodicSpikes(Boolean periodicSpikes) {
        this.periodicSpikes = periodicSpikes;
    }

    /**
     * <p>
     * Set this parameter to <code>true</code> if values for this metric consistently include spikes that should not be
     * considered to be anomalies. With this set to <code>true</code>, CloudWatch will expect to see spikes that
     * occurred consistently during the model training period, and won't flag future similar spikes as anomalies.
     * </p>
     * 
     * @return Set this parameter to <code>true</code> if values for this metric consistently include spikes that should
     *         not be considered to be anomalies. With this set to <code>true</code>, CloudWatch will expect to see
     *         spikes that occurred consistently during the model training period, and won't flag future similar spikes
     *         as anomalies.
     */

    public Boolean getPeriodicSpikes() {
        return this.periodicSpikes;
    }

    /**
     * <p>
     * Set this parameter to <code>true</code> if values for this metric consistently include spikes that should not be
     * considered to be anomalies. With this set to <code>true</code>, CloudWatch will expect to see spikes that
     * occurred consistently during the model training period, and won't flag future similar spikes as anomalies.
     * </p>
     * 
     * @param periodicSpikes
     *        Set this parameter to <code>true</code> if values for this metric consistently include spikes that should
     *        not be considered to be anomalies. With this set to <code>true</code>, CloudWatch will expect to see
     *        spikes that occurred consistently during the model training period, and won't flag future similar spikes
     *        as anomalies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricCharacteristics withPeriodicSpikes(Boolean periodicSpikes) {
        setPeriodicSpikes(periodicSpikes);
        return this;
    }

    /**
     * <p>
     * Set this parameter to <code>true</code> if values for this metric consistently include spikes that should not be
     * considered to be anomalies. With this set to <code>true</code>, CloudWatch will expect to see spikes that
     * occurred consistently during the model training period, and won't flag future similar spikes as anomalies.
     * </p>
     * 
     * @return Set this parameter to <code>true</code> if values for this metric consistently include spikes that should
     *         not be considered to be anomalies. With this set to <code>true</code>, CloudWatch will expect to see
     *         spikes that occurred consistently during the model training period, and won't flag future similar spikes
     *         as anomalies.
     */

    public Boolean isPeriodicSpikes() {
        return this.periodicSpikes;
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
        if (getPeriodicSpikes() != null)
            sb.append("PeriodicSpikes: ").append(getPeriodicSpikes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricCharacteristics == false)
            return false;
        MetricCharacteristics other = (MetricCharacteristics) obj;
        if (other.getPeriodicSpikes() == null ^ this.getPeriodicSpikes() == null)
            return false;
        if (other.getPeriodicSpikes() != null && other.getPeriodicSpikes().equals(this.getPeriodicSpikes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPeriodicSpikes() == null) ? 0 : getPeriodicSpikes().hashCode());
        return hashCode;
    }

    @Override
    public MetricCharacteristics clone() {
        try {
            return (MetricCharacteristics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

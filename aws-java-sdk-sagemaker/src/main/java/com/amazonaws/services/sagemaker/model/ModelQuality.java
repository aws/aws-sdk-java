/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Model quality statistics and constraints.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelQuality" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelQuality implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Model quality statistics.
     * </p>
     */
    private MetricsSource statistics;
    /**
     * <p>
     * Model quality constraints.
     * </p>
     */
    private MetricsSource constraints;

    /**
     * <p>
     * Model quality statistics.
     * </p>
     * 
     * @param statistics
     *        Model quality statistics.
     */

    public void setStatistics(MetricsSource statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * Model quality statistics.
     * </p>
     * 
     * @return Model quality statistics.
     */

    public MetricsSource getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * Model quality statistics.
     * </p>
     * 
     * @param statistics
     *        Model quality statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelQuality withStatistics(MetricsSource statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * Model quality constraints.
     * </p>
     * 
     * @param constraints
     *        Model quality constraints.
     */

    public void setConstraints(MetricsSource constraints) {
        this.constraints = constraints;
    }

    /**
     * <p>
     * Model quality constraints.
     * </p>
     * 
     * @return Model quality constraints.
     */

    public MetricsSource getConstraints() {
        return this.constraints;
    }

    /**
     * <p>
     * Model quality constraints.
     * </p>
     * 
     * @param constraints
     *        Model quality constraints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelQuality withConstraints(MetricsSource constraints) {
        setConstraints(constraints);
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
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics()).append(",");
        if (getConstraints() != null)
            sb.append("Constraints: ").append(getConstraints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelQuality == false)
            return false;
        ModelQuality other = (ModelQuality) obj;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getConstraints() == null ^ this.getConstraints() == null)
            return false;
        if (other.getConstraints() != null && other.getConstraints().equals(this.getConstraints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getConstraints() == null) ? 0 : getConstraints().hashCode());
        return hashCode;
    }

    @Override
    public ModelQuality clone() {
        try {
            return (ModelQuality) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelQualityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

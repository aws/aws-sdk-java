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
 * Data quality constraints and statistics for a model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelDataQuality" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelDataQuality implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Data quality statistics for a model.
     * </p>
     */
    private MetricsSource statistics;
    /**
     * <p>
     * Data quality constraints for a model.
     * </p>
     */
    private MetricsSource constraints;

    /**
     * <p>
     * Data quality statistics for a model.
     * </p>
     * 
     * @param statistics
     *        Data quality statistics for a model.
     */

    public void setStatistics(MetricsSource statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * Data quality statistics for a model.
     * </p>
     * 
     * @return Data quality statistics for a model.
     */

    public MetricsSource getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * Data quality statistics for a model.
     * </p>
     * 
     * @param statistics
     *        Data quality statistics for a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDataQuality withStatistics(MetricsSource statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * Data quality constraints for a model.
     * </p>
     * 
     * @param constraints
     *        Data quality constraints for a model.
     */

    public void setConstraints(MetricsSource constraints) {
        this.constraints = constraints;
    }

    /**
     * <p>
     * Data quality constraints for a model.
     * </p>
     * 
     * @return Data quality constraints for a model.
     */

    public MetricsSource getConstraints() {
        return this.constraints;
    }

    /**
     * <p>
     * Data quality constraints for a model.
     * </p>
     * 
     * @param constraints
     *        Data quality constraints for a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDataQuality withConstraints(MetricsSource constraints) {
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

        if (obj instanceof ModelDataQuality == false)
            return false;
        ModelDataQuality other = (ModelDataQuality) obj;
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
    public ModelDataQuality clone() {
        try {
            return (ModelDataQuality) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelDataQualityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of conditions for stopping a labeling job. If any of the conditions are met, the job is automatically stopped.
 * You can use these conditions to control the cost of data labeling.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LabelingJobStoppingConditions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelingJobStoppingConditions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of objects that can be labeled by human workers.
     * </p>
     */
    private Integer maxHumanLabeledObjectCount;
    /**
     * <p>
     * The maximum number of input data objects that should be labeled.
     * </p>
     */
    private Integer maxPercentageOfInputDatasetLabeled;

    /**
     * <p>
     * The maximum number of objects that can be labeled by human workers.
     * </p>
     * 
     * @param maxHumanLabeledObjectCount
     *        The maximum number of objects that can be labeled by human workers.
     */

    public void setMaxHumanLabeledObjectCount(Integer maxHumanLabeledObjectCount) {
        this.maxHumanLabeledObjectCount = maxHumanLabeledObjectCount;
    }

    /**
     * <p>
     * The maximum number of objects that can be labeled by human workers.
     * </p>
     * 
     * @return The maximum number of objects that can be labeled by human workers.
     */

    public Integer getMaxHumanLabeledObjectCount() {
        return this.maxHumanLabeledObjectCount;
    }

    /**
     * <p>
     * The maximum number of objects that can be labeled by human workers.
     * </p>
     * 
     * @param maxHumanLabeledObjectCount
     *        The maximum number of objects that can be labeled by human workers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobStoppingConditions withMaxHumanLabeledObjectCount(Integer maxHumanLabeledObjectCount) {
        setMaxHumanLabeledObjectCount(maxHumanLabeledObjectCount);
        return this;
    }

    /**
     * <p>
     * The maximum number of input data objects that should be labeled.
     * </p>
     * 
     * @param maxPercentageOfInputDatasetLabeled
     *        The maximum number of input data objects that should be labeled.
     */

    public void setMaxPercentageOfInputDatasetLabeled(Integer maxPercentageOfInputDatasetLabeled) {
        this.maxPercentageOfInputDatasetLabeled = maxPercentageOfInputDatasetLabeled;
    }

    /**
     * <p>
     * The maximum number of input data objects that should be labeled.
     * </p>
     * 
     * @return The maximum number of input data objects that should be labeled.
     */

    public Integer getMaxPercentageOfInputDatasetLabeled() {
        return this.maxPercentageOfInputDatasetLabeled;
    }

    /**
     * <p>
     * The maximum number of input data objects that should be labeled.
     * </p>
     * 
     * @param maxPercentageOfInputDatasetLabeled
     *        The maximum number of input data objects that should be labeled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobStoppingConditions withMaxPercentageOfInputDatasetLabeled(Integer maxPercentageOfInputDatasetLabeled) {
        setMaxPercentageOfInputDatasetLabeled(maxPercentageOfInputDatasetLabeled);
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
        if (getMaxHumanLabeledObjectCount() != null)
            sb.append("MaxHumanLabeledObjectCount: ").append(getMaxHumanLabeledObjectCount()).append(",");
        if (getMaxPercentageOfInputDatasetLabeled() != null)
            sb.append("MaxPercentageOfInputDatasetLabeled: ").append(getMaxPercentageOfInputDatasetLabeled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobStoppingConditions == false)
            return false;
        LabelingJobStoppingConditions other = (LabelingJobStoppingConditions) obj;
        if (other.getMaxHumanLabeledObjectCount() == null ^ this.getMaxHumanLabeledObjectCount() == null)
            return false;
        if (other.getMaxHumanLabeledObjectCount() != null && other.getMaxHumanLabeledObjectCount().equals(this.getMaxHumanLabeledObjectCount()) == false)
            return false;
        if (other.getMaxPercentageOfInputDatasetLabeled() == null ^ this.getMaxPercentageOfInputDatasetLabeled() == null)
            return false;
        if (other.getMaxPercentageOfInputDatasetLabeled() != null
                && other.getMaxPercentageOfInputDatasetLabeled().equals(this.getMaxPercentageOfInputDatasetLabeled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxHumanLabeledObjectCount() == null) ? 0 : getMaxHumanLabeledObjectCount().hashCode());
        hashCode = prime * hashCode + ((getMaxPercentageOfInputDatasetLabeled() == null) ? 0 : getMaxPercentageOfInputDatasetLabeled().hashCode());
        return hashCode;
    }

    @Override
    public LabelingJobStoppingConditions clone() {
        try {
            return (LabelingJobStoppingConditions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LabelingJobStoppingConditionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

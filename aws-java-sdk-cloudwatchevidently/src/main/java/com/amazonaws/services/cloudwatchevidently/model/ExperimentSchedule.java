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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure contains the time and date that Evidently completed the analysis of the experiment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ExperimentSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperimentSchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time and date that Evidently completed the analysis of the experiment.
     * </p>
     */
    private java.util.Date analysisCompleteTime;

    /**
     * <p>
     * The time and date that Evidently completed the analysis of the experiment.
     * </p>
     * 
     * @param analysisCompleteTime
     *        The time and date that Evidently completed the analysis of the experiment.
     */

    public void setAnalysisCompleteTime(java.util.Date analysisCompleteTime) {
        this.analysisCompleteTime = analysisCompleteTime;
    }

    /**
     * <p>
     * The time and date that Evidently completed the analysis of the experiment.
     * </p>
     * 
     * @return The time and date that Evidently completed the analysis of the experiment.
     */

    public java.util.Date getAnalysisCompleteTime() {
        return this.analysisCompleteTime;
    }

    /**
     * <p>
     * The time and date that Evidently completed the analysis of the experiment.
     * </p>
     * 
     * @param analysisCompleteTime
     *        The time and date that Evidently completed the analysis of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentSchedule withAnalysisCompleteTime(java.util.Date analysisCompleteTime) {
        setAnalysisCompleteTime(analysisCompleteTime);
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
        if (getAnalysisCompleteTime() != null)
            sb.append("AnalysisCompleteTime: ").append(getAnalysisCompleteTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExperimentSchedule == false)
            return false;
        ExperimentSchedule other = (ExperimentSchedule) obj;
        if (other.getAnalysisCompleteTime() == null ^ this.getAnalysisCompleteTime() == null)
            return false;
        if (other.getAnalysisCompleteTime() != null && other.getAnalysisCompleteTime().equals(this.getAnalysisCompleteTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalysisCompleteTime() == null) ? 0 : getAnalysisCompleteTime().hashCode());
        return hashCode;
    }

    @Override
    public ExperimentSchedule clone() {
        try {
            return (ExperimentSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.ExperimentScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

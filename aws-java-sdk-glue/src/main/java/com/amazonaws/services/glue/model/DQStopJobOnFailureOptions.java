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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Options to configure how your job will stop if your data quality evaluation fails.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DQStopJobOnFailureOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DQStopJobOnFailureOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When to stop job if your data quality evaluation fails. Options are Immediate or AfterDataLoad.
     * </p>
     */
    private String stopJobOnFailureTiming;

    /**
     * <p>
     * When to stop job if your data quality evaluation fails. Options are Immediate or AfterDataLoad.
     * </p>
     * 
     * @param stopJobOnFailureTiming
     *        When to stop job if your data quality evaluation fails. Options are Immediate or AfterDataLoad.
     * @see DQStopJobOnFailureTiming
     */

    public void setStopJobOnFailureTiming(String stopJobOnFailureTiming) {
        this.stopJobOnFailureTiming = stopJobOnFailureTiming;
    }

    /**
     * <p>
     * When to stop job if your data quality evaluation fails. Options are Immediate or AfterDataLoad.
     * </p>
     * 
     * @return When to stop job if your data quality evaluation fails. Options are Immediate or AfterDataLoad.
     * @see DQStopJobOnFailureTiming
     */

    public String getStopJobOnFailureTiming() {
        return this.stopJobOnFailureTiming;
    }

    /**
     * <p>
     * When to stop job if your data quality evaluation fails. Options are Immediate or AfterDataLoad.
     * </p>
     * 
     * @param stopJobOnFailureTiming
     *        When to stop job if your data quality evaluation fails. Options are Immediate or AfterDataLoad.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DQStopJobOnFailureTiming
     */

    public DQStopJobOnFailureOptions withStopJobOnFailureTiming(String stopJobOnFailureTiming) {
        setStopJobOnFailureTiming(stopJobOnFailureTiming);
        return this;
    }

    /**
     * <p>
     * When to stop job if your data quality evaluation fails. Options are Immediate or AfterDataLoad.
     * </p>
     * 
     * @param stopJobOnFailureTiming
     *        When to stop job if your data quality evaluation fails. Options are Immediate or AfterDataLoad.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DQStopJobOnFailureTiming
     */

    public DQStopJobOnFailureOptions withStopJobOnFailureTiming(DQStopJobOnFailureTiming stopJobOnFailureTiming) {
        this.stopJobOnFailureTiming = stopJobOnFailureTiming.toString();
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
        if (getStopJobOnFailureTiming() != null)
            sb.append("StopJobOnFailureTiming: ").append(getStopJobOnFailureTiming());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DQStopJobOnFailureOptions == false)
            return false;
        DQStopJobOnFailureOptions other = (DQStopJobOnFailureOptions) obj;
        if (other.getStopJobOnFailureTiming() == null ^ this.getStopJobOnFailureTiming() == null)
            return false;
        if (other.getStopJobOnFailureTiming() != null && other.getStopJobOnFailureTiming().equals(this.getStopJobOnFailureTiming()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStopJobOnFailureTiming() == null) ? 0 : getStopJobOnFailureTiming().hashCode());
        return hashCode;
    }

    @Override
    public DQStopJobOnFailureOptions clone() {
        try {
            return (DQStopJobOnFailureOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DQStopJobOnFailureOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

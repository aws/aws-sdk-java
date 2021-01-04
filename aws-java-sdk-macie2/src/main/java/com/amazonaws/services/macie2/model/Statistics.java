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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides processing statistics for a classification job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/Statistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Statistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The approximate number of objects that the job has yet to process during its current run.
     * </p>
     */
    private Double approximateNumberOfObjectsToProcess;
    /**
     * <p>
     * The number of times that the job has run.
     * </p>
     */
    private Double numberOfRuns;

    /**
     * <p>
     * The approximate number of objects that the job has yet to process during its current run.
     * </p>
     * 
     * @param approximateNumberOfObjectsToProcess
     *        The approximate number of objects that the job has yet to process during its current run.
     */

    public void setApproximateNumberOfObjectsToProcess(Double approximateNumberOfObjectsToProcess) {
        this.approximateNumberOfObjectsToProcess = approximateNumberOfObjectsToProcess;
    }

    /**
     * <p>
     * The approximate number of objects that the job has yet to process during its current run.
     * </p>
     * 
     * @return The approximate number of objects that the job has yet to process during its current run.
     */

    public Double getApproximateNumberOfObjectsToProcess() {
        return this.approximateNumberOfObjectsToProcess;
    }

    /**
     * <p>
     * The approximate number of objects that the job has yet to process during its current run.
     * </p>
     * 
     * @param approximateNumberOfObjectsToProcess
     *        The approximate number of objects that the job has yet to process during its current run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withApproximateNumberOfObjectsToProcess(Double approximateNumberOfObjectsToProcess) {
        setApproximateNumberOfObjectsToProcess(approximateNumberOfObjectsToProcess);
        return this;
    }

    /**
     * <p>
     * The number of times that the job has run.
     * </p>
     * 
     * @param numberOfRuns
     *        The number of times that the job has run.
     */

    public void setNumberOfRuns(Double numberOfRuns) {
        this.numberOfRuns = numberOfRuns;
    }

    /**
     * <p>
     * The number of times that the job has run.
     * </p>
     * 
     * @return The number of times that the job has run.
     */

    public Double getNumberOfRuns() {
        return this.numberOfRuns;
    }

    /**
     * <p>
     * The number of times that the job has run.
     * </p>
     * 
     * @param numberOfRuns
     *        The number of times that the job has run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withNumberOfRuns(Double numberOfRuns) {
        setNumberOfRuns(numberOfRuns);
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
        if (getApproximateNumberOfObjectsToProcess() != null)
            sb.append("ApproximateNumberOfObjectsToProcess: ").append(getApproximateNumberOfObjectsToProcess()).append(",");
        if (getNumberOfRuns() != null)
            sb.append("NumberOfRuns: ").append(getNumberOfRuns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Statistics == false)
            return false;
        Statistics other = (Statistics) obj;
        if (other.getApproximateNumberOfObjectsToProcess() == null ^ this.getApproximateNumberOfObjectsToProcess() == null)
            return false;
        if (other.getApproximateNumberOfObjectsToProcess() != null
                && other.getApproximateNumberOfObjectsToProcess().equals(this.getApproximateNumberOfObjectsToProcess()) == false)
            return false;
        if (other.getNumberOfRuns() == null ^ this.getNumberOfRuns() == null)
            return false;
        if (other.getNumberOfRuns() != null && other.getNumberOfRuns().equals(this.getNumberOfRuns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApproximateNumberOfObjectsToProcess() == null) ? 0 : getApproximateNumberOfObjectsToProcess().hashCode());
        hashCode = prime * hashCode + ((getNumberOfRuns() == null) ? 0 : getNumberOfRuns().hashCode());
        return hashCode;
    }

    @Override
    public Statistics clone() {
        try {
            return (Statistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.StatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

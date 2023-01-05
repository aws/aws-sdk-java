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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Statistics related to the processing of a query statement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/PlanningStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlanningStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An estimate of the data that was scanned in bytes.
     * </p>
     */
    private Long estimatedDataToScanBytes;
    /**
     * <p>
     * The time that it took to process the request.
     * </p>
     */
    private Long planningTimeMillis;
    /**
     * <p>
     * The time the request was in queue to be processed.
     * </p>
     */
    private Long queueTimeMillis;
    /**
     * <p>
     * The number of work units generated.
     * </p>
     */
    private Long workUnitsGeneratedCount;

    /**
     * <p>
     * An estimate of the data that was scanned in bytes.
     * </p>
     * 
     * @param estimatedDataToScanBytes
     *        An estimate of the data that was scanned in bytes.
     */

    public void setEstimatedDataToScanBytes(Long estimatedDataToScanBytes) {
        this.estimatedDataToScanBytes = estimatedDataToScanBytes;
    }

    /**
     * <p>
     * An estimate of the data that was scanned in bytes.
     * </p>
     * 
     * @return An estimate of the data that was scanned in bytes.
     */

    public Long getEstimatedDataToScanBytes() {
        return this.estimatedDataToScanBytes;
    }

    /**
     * <p>
     * An estimate of the data that was scanned in bytes.
     * </p>
     * 
     * @param estimatedDataToScanBytes
     *        An estimate of the data that was scanned in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlanningStatistics withEstimatedDataToScanBytes(Long estimatedDataToScanBytes) {
        setEstimatedDataToScanBytes(estimatedDataToScanBytes);
        return this;
    }

    /**
     * <p>
     * The time that it took to process the request.
     * </p>
     * 
     * @param planningTimeMillis
     *        The time that it took to process the request.
     */

    public void setPlanningTimeMillis(Long planningTimeMillis) {
        this.planningTimeMillis = planningTimeMillis;
    }

    /**
     * <p>
     * The time that it took to process the request.
     * </p>
     * 
     * @return The time that it took to process the request.
     */

    public Long getPlanningTimeMillis() {
        return this.planningTimeMillis;
    }

    /**
     * <p>
     * The time that it took to process the request.
     * </p>
     * 
     * @param planningTimeMillis
     *        The time that it took to process the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlanningStatistics withPlanningTimeMillis(Long planningTimeMillis) {
        setPlanningTimeMillis(planningTimeMillis);
        return this;
    }

    /**
     * <p>
     * The time the request was in queue to be processed.
     * </p>
     * 
     * @param queueTimeMillis
     *        The time the request was in queue to be processed.
     */

    public void setQueueTimeMillis(Long queueTimeMillis) {
        this.queueTimeMillis = queueTimeMillis;
    }

    /**
     * <p>
     * The time the request was in queue to be processed.
     * </p>
     * 
     * @return The time the request was in queue to be processed.
     */

    public Long getQueueTimeMillis() {
        return this.queueTimeMillis;
    }

    /**
     * <p>
     * The time the request was in queue to be processed.
     * </p>
     * 
     * @param queueTimeMillis
     *        The time the request was in queue to be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlanningStatistics withQueueTimeMillis(Long queueTimeMillis) {
        setQueueTimeMillis(queueTimeMillis);
        return this;
    }

    /**
     * <p>
     * The number of work units generated.
     * </p>
     * 
     * @param workUnitsGeneratedCount
     *        The number of work units generated.
     */

    public void setWorkUnitsGeneratedCount(Long workUnitsGeneratedCount) {
        this.workUnitsGeneratedCount = workUnitsGeneratedCount;
    }

    /**
     * <p>
     * The number of work units generated.
     * </p>
     * 
     * @return The number of work units generated.
     */

    public Long getWorkUnitsGeneratedCount() {
        return this.workUnitsGeneratedCount;
    }

    /**
     * <p>
     * The number of work units generated.
     * </p>
     * 
     * @param workUnitsGeneratedCount
     *        The number of work units generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlanningStatistics withWorkUnitsGeneratedCount(Long workUnitsGeneratedCount) {
        setWorkUnitsGeneratedCount(workUnitsGeneratedCount);
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
        if (getEstimatedDataToScanBytes() != null)
            sb.append("EstimatedDataToScanBytes: ").append(getEstimatedDataToScanBytes()).append(",");
        if (getPlanningTimeMillis() != null)
            sb.append("PlanningTimeMillis: ").append(getPlanningTimeMillis()).append(",");
        if (getQueueTimeMillis() != null)
            sb.append("QueueTimeMillis: ").append(getQueueTimeMillis()).append(",");
        if (getWorkUnitsGeneratedCount() != null)
            sb.append("WorkUnitsGeneratedCount: ").append(getWorkUnitsGeneratedCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlanningStatistics == false)
            return false;
        PlanningStatistics other = (PlanningStatistics) obj;
        if (other.getEstimatedDataToScanBytes() == null ^ this.getEstimatedDataToScanBytes() == null)
            return false;
        if (other.getEstimatedDataToScanBytes() != null && other.getEstimatedDataToScanBytes().equals(this.getEstimatedDataToScanBytes()) == false)
            return false;
        if (other.getPlanningTimeMillis() == null ^ this.getPlanningTimeMillis() == null)
            return false;
        if (other.getPlanningTimeMillis() != null && other.getPlanningTimeMillis().equals(this.getPlanningTimeMillis()) == false)
            return false;
        if (other.getQueueTimeMillis() == null ^ this.getQueueTimeMillis() == null)
            return false;
        if (other.getQueueTimeMillis() != null && other.getQueueTimeMillis().equals(this.getQueueTimeMillis()) == false)
            return false;
        if (other.getWorkUnitsGeneratedCount() == null ^ this.getWorkUnitsGeneratedCount() == null)
            return false;
        if (other.getWorkUnitsGeneratedCount() != null && other.getWorkUnitsGeneratedCount().equals(this.getWorkUnitsGeneratedCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEstimatedDataToScanBytes() == null) ? 0 : getEstimatedDataToScanBytes().hashCode());
        hashCode = prime * hashCode + ((getPlanningTimeMillis() == null) ? 0 : getPlanningTimeMillis().hashCode());
        hashCode = prime * hashCode + ((getQueueTimeMillis() == null) ? 0 : getQueueTimeMillis().hashCode());
        hashCode = prime * hashCode + ((getWorkUnitsGeneratedCount() == null) ? 0 : getWorkUnitsGeneratedCount().hashCode());
        return hashCode;
    }

    @Override
    public PlanningStatistics clone() {
        try {
            return (PlanningStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.PlanningStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

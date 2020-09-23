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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This object continuously inspects your account's cost data for anomalies, based on <code>MonitorType</code> and
 * <code>MonitorSpecification</code>. The content consists of detailed metadata and the current status of the monitor
 * object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/AnomalyMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyMonitor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) value.
     * </p>
     */
    private String monitorArn;
    /**
     * <p>
     * The name of the monitor.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * The date when the monitor was created.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The date when the monitor was last updated.
     * </p>
     */
    private String lastUpdatedDate;
    /**
     * <p>
     * The date when the monitor last evaluated for anomalies.
     * </p>
     */
    private String lastEvaluatedDate;
    /**
     * <p>
     * The possible type values.
     * </p>
     */
    private String monitorType;
    /**
     * <p>
     * The dimensions to evaluate.
     * </p>
     */
    private String monitorDimension;

    private Expression monitorSpecification;
    /**
     * <p>
     * The value for evaluated dimensions.
     * </p>
     */
    private Integer dimensionalValueCount;

    /**
     * <p>
     * The Amazon Resource Name (ARN) value.
     * </p>
     * 
     * @param monitorArn
     *        The Amazon Resource Name (ARN) value.
     */

    public void setMonitorArn(String monitorArn) {
        this.monitorArn = monitorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) value.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) value.
     */

    public String getMonitorArn() {
        return this.monitorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) value.
     * </p>
     * 
     * @param monitorArn
     *        The Amazon Resource Name (ARN) value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyMonitor withMonitorArn(String monitorArn) {
        setMonitorArn(monitorArn);
        return this;
    }

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor.
     */

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @return The name of the monitor.
     */

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyMonitor withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * The date when the monitor was created.
     * </p>
     * 
     * @param creationDate
     *        The date when the monitor was created.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when the monitor was created.
     * </p>
     * 
     * @return The date when the monitor was created.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date when the monitor was created.
     * </p>
     * 
     * @param creationDate
     *        The date when the monitor was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyMonitor withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date when the monitor was last updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date when the monitor was last updated.
     */

    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date when the monitor was last updated.
     * </p>
     * 
     * @return The date when the monitor was last updated.
     */

    public String getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The date when the monitor was last updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date when the monitor was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyMonitor withLastUpdatedDate(String lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
        return this;
    }

    /**
     * <p>
     * The date when the monitor last evaluated for anomalies.
     * </p>
     * 
     * @param lastEvaluatedDate
     *        The date when the monitor last evaluated for anomalies.
     */

    public void setLastEvaluatedDate(String lastEvaluatedDate) {
        this.lastEvaluatedDate = lastEvaluatedDate;
    }

    /**
     * <p>
     * The date when the monitor last evaluated for anomalies.
     * </p>
     * 
     * @return The date when the monitor last evaluated for anomalies.
     */

    public String getLastEvaluatedDate() {
        return this.lastEvaluatedDate;
    }

    /**
     * <p>
     * The date when the monitor last evaluated for anomalies.
     * </p>
     * 
     * @param lastEvaluatedDate
     *        The date when the monitor last evaluated for anomalies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyMonitor withLastEvaluatedDate(String lastEvaluatedDate) {
        setLastEvaluatedDate(lastEvaluatedDate);
        return this;
    }

    /**
     * <p>
     * The possible type values.
     * </p>
     * 
     * @param monitorType
     *        The possible type values.
     * @see MonitorType
     */

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }

    /**
     * <p>
     * The possible type values.
     * </p>
     * 
     * @return The possible type values.
     * @see MonitorType
     */

    public String getMonitorType() {
        return this.monitorType;
    }

    /**
     * <p>
     * The possible type values.
     * </p>
     * 
     * @param monitorType
     *        The possible type values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorType
     */

    public AnomalyMonitor withMonitorType(String monitorType) {
        setMonitorType(monitorType);
        return this;
    }

    /**
     * <p>
     * The possible type values.
     * </p>
     * 
     * @param monitorType
     *        The possible type values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorType
     */

    public AnomalyMonitor withMonitorType(MonitorType monitorType) {
        this.monitorType = monitorType.toString();
        return this;
    }

    /**
     * <p>
     * The dimensions to evaluate.
     * </p>
     * 
     * @param monitorDimension
     *        The dimensions to evaluate.
     * @see MonitorDimension
     */

    public void setMonitorDimension(String monitorDimension) {
        this.monitorDimension = monitorDimension;
    }

    /**
     * <p>
     * The dimensions to evaluate.
     * </p>
     * 
     * @return The dimensions to evaluate.
     * @see MonitorDimension
     */

    public String getMonitorDimension() {
        return this.monitorDimension;
    }

    /**
     * <p>
     * The dimensions to evaluate.
     * </p>
     * 
     * @param monitorDimension
     *        The dimensions to evaluate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorDimension
     */

    public AnomalyMonitor withMonitorDimension(String monitorDimension) {
        setMonitorDimension(monitorDimension);
        return this;
    }

    /**
     * <p>
     * The dimensions to evaluate.
     * </p>
     * 
     * @param monitorDimension
     *        The dimensions to evaluate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorDimension
     */

    public AnomalyMonitor withMonitorDimension(MonitorDimension monitorDimension) {
        this.monitorDimension = monitorDimension.toString();
        return this;
    }

    /**
     * @param monitorSpecification
     */

    public void setMonitorSpecification(Expression monitorSpecification) {
        this.monitorSpecification = monitorSpecification;
    }

    /**
     * @return
     */

    public Expression getMonitorSpecification() {
        return this.monitorSpecification;
    }

    /**
     * @param monitorSpecification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyMonitor withMonitorSpecification(Expression monitorSpecification) {
        setMonitorSpecification(monitorSpecification);
        return this;
    }

    /**
     * <p>
     * The value for evaluated dimensions.
     * </p>
     * 
     * @param dimensionalValueCount
     *        The value for evaluated dimensions.
     */

    public void setDimensionalValueCount(Integer dimensionalValueCount) {
        this.dimensionalValueCount = dimensionalValueCount;
    }

    /**
     * <p>
     * The value for evaluated dimensions.
     * </p>
     * 
     * @return The value for evaluated dimensions.
     */

    public Integer getDimensionalValueCount() {
        return this.dimensionalValueCount;
    }

    /**
     * <p>
     * The value for evaluated dimensions.
     * </p>
     * 
     * @param dimensionalValueCount
     *        The value for evaluated dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyMonitor withDimensionalValueCount(Integer dimensionalValueCount) {
        setDimensionalValueCount(dimensionalValueCount);
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
        if (getMonitorArn() != null)
            sb.append("MonitorArn: ").append(getMonitorArn()).append(",");
        if (getMonitorName() != null)
            sb.append("MonitorName: ").append(getMonitorName()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate()).append(",");
        if (getLastEvaluatedDate() != null)
            sb.append("LastEvaluatedDate: ").append(getLastEvaluatedDate()).append(",");
        if (getMonitorType() != null)
            sb.append("MonitorType: ").append(getMonitorType()).append(",");
        if (getMonitorDimension() != null)
            sb.append("MonitorDimension: ").append(getMonitorDimension()).append(",");
        if (getMonitorSpecification() != null)
            sb.append("MonitorSpecification: ").append(getMonitorSpecification()).append(",");
        if (getDimensionalValueCount() != null)
            sb.append("DimensionalValueCount: ").append(getDimensionalValueCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalyMonitor == false)
            return false;
        AnomalyMonitor other = (AnomalyMonitor) obj;
        if (other.getMonitorArn() == null ^ this.getMonitorArn() == null)
            return false;
        if (other.getMonitorArn() != null && other.getMonitorArn().equals(this.getMonitorArn()) == false)
            return false;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getLastEvaluatedDate() == null ^ this.getLastEvaluatedDate() == null)
            return false;
        if (other.getLastEvaluatedDate() != null && other.getLastEvaluatedDate().equals(this.getLastEvaluatedDate()) == false)
            return false;
        if (other.getMonitorType() == null ^ this.getMonitorType() == null)
            return false;
        if (other.getMonitorType() != null && other.getMonitorType().equals(this.getMonitorType()) == false)
            return false;
        if (other.getMonitorDimension() == null ^ this.getMonitorDimension() == null)
            return false;
        if (other.getMonitorDimension() != null && other.getMonitorDimension().equals(this.getMonitorDimension()) == false)
            return false;
        if (other.getMonitorSpecification() == null ^ this.getMonitorSpecification() == null)
            return false;
        if (other.getMonitorSpecification() != null && other.getMonitorSpecification().equals(this.getMonitorSpecification()) == false)
            return false;
        if (other.getDimensionalValueCount() == null ^ this.getDimensionalValueCount() == null)
            return false;
        if (other.getDimensionalValueCount() != null && other.getDimensionalValueCount().equals(this.getDimensionalValueCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitorArn() == null) ? 0 : getMonitorArn().hashCode());
        hashCode = prime * hashCode + ((getMonitorName() == null) ? 0 : getMonitorName().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastEvaluatedDate() == null) ? 0 : getLastEvaluatedDate().hashCode());
        hashCode = prime * hashCode + ((getMonitorType() == null) ? 0 : getMonitorType().hashCode());
        hashCode = prime * hashCode + ((getMonitorDimension() == null) ? 0 : getMonitorDimension().hashCode());
        hashCode = prime * hashCode + ((getMonitorSpecification() == null) ? 0 : getMonitorSpecification().hashCode());
        hashCode = prime * hashCode + ((getDimensionalValueCount() == null) ? 0 : getDimensionalValueCount().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyMonitor clone() {
        try {
            return (AnomalyMonitor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.AnomalyMonitorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

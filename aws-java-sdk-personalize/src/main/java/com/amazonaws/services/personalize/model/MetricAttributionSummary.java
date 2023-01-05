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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary of the properties of a metric attribution. For a complete listing, call the <a
 * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeMetricAttribution.html"
 * >DescribeMetricAttribution</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/MetricAttributionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricAttributionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the metric attribution.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The metric attribution's Amazon Resource Name (ARN).
     * </p>
     */
    private String metricAttributionArn;
    /**
     * <p>
     * The metric attribution's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The metric attribution's creation date time.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The metric attribution's last updated date time.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * The metric attribution's failure reason.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the metric attribution.
     * </p>
     * 
     * @param name
     *        The name of the metric attribution.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the metric attribution.
     * </p>
     * 
     * @return The name of the metric attribution.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the metric attribution.
     * </p>
     * 
     * @param name
     *        The name of the metric attribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAttributionSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The metric attribution's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param metricAttributionArn
     *        The metric attribution's Amazon Resource Name (ARN).
     */

    public void setMetricAttributionArn(String metricAttributionArn) {
        this.metricAttributionArn = metricAttributionArn;
    }

    /**
     * <p>
     * The metric attribution's Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The metric attribution's Amazon Resource Name (ARN).
     */

    public String getMetricAttributionArn() {
        return this.metricAttributionArn;
    }

    /**
     * <p>
     * The metric attribution's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param metricAttributionArn
     *        The metric attribution's Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAttributionSummary withMetricAttributionArn(String metricAttributionArn) {
        setMetricAttributionArn(metricAttributionArn);
        return this;
    }

    /**
     * <p>
     * The metric attribution's status.
     * </p>
     * 
     * @param status
     *        The metric attribution's status.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The metric attribution's status.
     * </p>
     * 
     * @return The metric attribution's status.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The metric attribution's status.
     * </p>
     * 
     * @param status
     *        The metric attribution's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAttributionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The metric attribution's creation date time.
     * </p>
     * 
     * @param creationDateTime
     *        The metric attribution's creation date time.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The metric attribution's creation date time.
     * </p>
     * 
     * @return The metric attribution's creation date time.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The metric attribution's creation date time.
     * </p>
     * 
     * @param creationDateTime
     *        The metric attribution's creation date time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAttributionSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The metric attribution's last updated date time.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The metric attribution's last updated date time.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The metric attribution's last updated date time.
     * </p>
     * 
     * @return The metric attribution's last updated date time.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The metric attribution's last updated date time.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The metric attribution's last updated date time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAttributionSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * The metric attribution's failure reason.
     * </p>
     * 
     * @param failureReason
     *        The metric attribution's failure reason.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The metric attribution's failure reason.
     * </p>
     * 
     * @return The metric attribution's failure reason.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The metric attribution's failure reason.
     * </p>
     * 
     * @param failureReason
     *        The metric attribution's failure reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAttributionSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMetricAttributionArn() != null)
            sb.append("MetricAttributionArn: ").append(getMetricAttributionArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricAttributionSummary == false)
            return false;
        MetricAttributionSummary other = (MetricAttributionSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetricAttributionArn() == null ^ this.getMetricAttributionArn() == null)
            return false;
        if (other.getMetricAttributionArn() != null && other.getMetricAttributionArn().equals(this.getMetricAttributionArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetricAttributionArn() == null) ? 0 : getMetricAttributionArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public MetricAttributionSummary clone() {
        try {
            return (MetricAttributionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.MetricAttributionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

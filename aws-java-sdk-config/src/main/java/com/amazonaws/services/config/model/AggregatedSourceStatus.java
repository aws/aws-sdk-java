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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The current sync status between the source and the aggregator account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/AggregatedSourceStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregatedSourceStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source account ID or an organization.
     * </p>
     */
    private String sourceId;
    /**
     * <p>
     * The source account or an organization.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The region authorized to collect aggregated data.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * Filters the last updated status type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Valid value FAILED indicates errors while moving data.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value SUCCEEDED indicates the data was successfully moved.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value OUTDATED indicates the data is not the most recent.
     * </p>
     * </li>
     * </ul>
     */
    private String lastUpdateStatus;
    /**
     * <p>
     * The time of the last update.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The error code that AWS Config returned when the source account aggregation last failed.
     * </p>
     */
    private String lastErrorCode;
    /**
     * <p>
     * The message indicating that the source account aggregation failed due to an error.
     * </p>
     */
    private String lastErrorMessage;

    /**
     * <p>
     * The source account ID or an organization.
     * </p>
     * 
     * @param sourceId
     *        The source account ID or an organization.
     */

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * <p>
     * The source account ID or an organization.
     * </p>
     * 
     * @return The source account ID or an organization.
     */

    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * <p>
     * The source account ID or an organization.
     * </p>
     * 
     * @param sourceId
     *        The source account ID or an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregatedSourceStatus withSourceId(String sourceId) {
        setSourceId(sourceId);
        return this;
    }

    /**
     * <p>
     * The source account or an organization.
     * </p>
     * 
     * @param sourceType
     *        The source account or an organization.
     * @see AggregatedSourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source account or an organization.
     * </p>
     * 
     * @return The source account or an organization.
     * @see AggregatedSourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The source account or an organization.
     * </p>
     * 
     * @param sourceType
     *        The source account or an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregatedSourceType
     */

    public AggregatedSourceStatus withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The source account or an organization.
     * </p>
     * 
     * @param sourceType
     *        The source account or an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregatedSourceType
     */

    public AggregatedSourceStatus withSourceType(AggregatedSourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * The region authorized to collect aggregated data.
     * </p>
     * 
     * @param awsRegion
     *        The region authorized to collect aggregated data.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The region authorized to collect aggregated data.
     * </p>
     * 
     * @return The region authorized to collect aggregated data.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The region authorized to collect aggregated data.
     * </p>
     * 
     * @param awsRegion
     *        The region authorized to collect aggregated data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregatedSourceStatus withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * Filters the last updated status type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Valid value FAILED indicates errors while moving data.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value SUCCEEDED indicates the data was successfully moved.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value OUTDATED indicates the data is not the most recent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastUpdateStatus
     *        Filters the last updated status type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Valid value FAILED indicates errors while moving data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid value SUCCEEDED indicates the data was successfully moved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid value OUTDATED indicates the data is not the most recent.
     *        </p>
     *        </li>
     * @see AggregatedSourceStatusType
     */

    public void setLastUpdateStatus(String lastUpdateStatus) {
        this.lastUpdateStatus = lastUpdateStatus;
    }

    /**
     * <p>
     * Filters the last updated status type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Valid value FAILED indicates errors while moving data.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value SUCCEEDED indicates the data was successfully moved.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value OUTDATED indicates the data is not the most recent.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Filters the last updated status type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Valid value FAILED indicates errors while moving data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Valid value SUCCEEDED indicates the data was successfully moved.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Valid value OUTDATED indicates the data is not the most recent.
     *         </p>
     *         </li>
     * @see AggregatedSourceStatusType
     */

    public String getLastUpdateStatus() {
        return this.lastUpdateStatus;
    }

    /**
     * <p>
     * Filters the last updated status type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Valid value FAILED indicates errors while moving data.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value SUCCEEDED indicates the data was successfully moved.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value OUTDATED indicates the data is not the most recent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastUpdateStatus
     *        Filters the last updated status type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Valid value FAILED indicates errors while moving data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid value SUCCEEDED indicates the data was successfully moved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid value OUTDATED indicates the data is not the most recent.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregatedSourceStatusType
     */

    public AggregatedSourceStatus withLastUpdateStatus(String lastUpdateStatus) {
        setLastUpdateStatus(lastUpdateStatus);
        return this;
    }

    /**
     * <p>
     * Filters the last updated status type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Valid value FAILED indicates errors while moving data.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value SUCCEEDED indicates the data was successfully moved.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value OUTDATED indicates the data is not the most recent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastUpdateStatus
     *        Filters the last updated status type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Valid value FAILED indicates errors while moving data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid value SUCCEEDED indicates the data was successfully moved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid value OUTDATED indicates the data is not the most recent.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregatedSourceStatusType
     */

    public AggregatedSourceStatus withLastUpdateStatus(AggregatedSourceStatusType lastUpdateStatus) {
        this.lastUpdateStatus = lastUpdateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time of the last update.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time of the last update.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The time of the last update.
     * </p>
     * 
     * @return The time of the last update.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The time of the last update.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time of the last update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregatedSourceStatus withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The error code that AWS Config returned when the source account aggregation last failed.
     * </p>
     * 
     * @param lastErrorCode
     *        The error code that AWS Config returned when the source account aggregation last failed.
     */

    public void setLastErrorCode(String lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
    }

    /**
     * <p>
     * The error code that AWS Config returned when the source account aggregation last failed.
     * </p>
     * 
     * @return The error code that AWS Config returned when the source account aggregation last failed.
     */

    public String getLastErrorCode() {
        return this.lastErrorCode;
    }

    /**
     * <p>
     * The error code that AWS Config returned when the source account aggregation last failed.
     * </p>
     * 
     * @param lastErrorCode
     *        The error code that AWS Config returned when the source account aggregation last failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregatedSourceStatus withLastErrorCode(String lastErrorCode) {
        setLastErrorCode(lastErrorCode);
        return this;
    }

    /**
     * <p>
     * The message indicating that the source account aggregation failed due to an error.
     * </p>
     * 
     * @param lastErrorMessage
     *        The message indicating that the source account aggregation failed due to an error.
     */

    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }

    /**
     * <p>
     * The message indicating that the source account aggregation failed due to an error.
     * </p>
     * 
     * @return The message indicating that the source account aggregation failed due to an error.
     */

    public String getLastErrorMessage() {
        return this.lastErrorMessage;
    }

    /**
     * <p>
     * The message indicating that the source account aggregation failed due to an error.
     * </p>
     * 
     * @param lastErrorMessage
     *        The message indicating that the source account aggregation failed due to an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregatedSourceStatus withLastErrorMessage(String lastErrorMessage) {
        setLastErrorMessage(lastErrorMessage);
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
        if (getSourceId() != null)
            sb.append("SourceId: ").append(getSourceId()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getLastUpdateStatus() != null)
            sb.append("LastUpdateStatus: ").append(getLastUpdateStatus()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getLastErrorCode() != null)
            sb.append("LastErrorCode: ").append(getLastErrorCode()).append(",");
        if (getLastErrorMessage() != null)
            sb.append("LastErrorMessage: ").append(getLastErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregatedSourceStatus == false)
            return false;
        AggregatedSourceStatus other = (AggregatedSourceStatus) obj;
        if (other.getSourceId() == null ^ this.getSourceId() == null)
            return false;
        if (other.getSourceId() != null && other.getSourceId().equals(this.getSourceId()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getLastUpdateStatus() == null ^ this.getLastUpdateStatus() == null)
            return false;
        if (other.getLastUpdateStatus() != null && other.getLastUpdateStatus().equals(this.getLastUpdateStatus()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getLastErrorCode() == null ^ this.getLastErrorCode() == null)
            return false;
        if (other.getLastErrorCode() != null && other.getLastErrorCode().equals(this.getLastErrorCode()) == false)
            return false;
        if (other.getLastErrorMessage() == null ^ this.getLastErrorMessage() == null)
            return false;
        if (other.getLastErrorMessage() != null && other.getLastErrorMessage().equals(this.getLastErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateStatus() == null) ? 0 : getLastUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getLastErrorCode() == null) ? 0 : getLastErrorCode().hashCode());
        hashCode = prime * hashCode + ((getLastErrorMessage() == null) ? 0 : getLastErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public AggregatedSourceStatus clone() {
        try {
            return (AggregatedSourceStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.AggregatedSourceStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

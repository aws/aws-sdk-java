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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration information that will be updated for this workgroup, which includes the location in Amazon S3 where
 * query results are stored, the encryption option, if any, used for query results, whether the Amazon CloudWatch
 * Metrics are enabled for the workgroup, whether the workgroup settings override the client-side settings, and the data
 * usage limit for the amount of bytes scanned per query, if it is specified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/WorkGroupConfigurationUpdates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkGroupConfigurationUpdates implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If set to "true", the settings for the workgroup override client-side settings. If set to "false" client-side
     * settings are used. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     */
    private Boolean enforceWorkGroupConfiguration;
    /**
     * <p>
     * The result configuration information about the queries in this workgroup that will be updated. Includes the
     * updated results location and an updated option for encrypting query results.
     * </p>
     */
    private ResultConfigurationUpdates resultConfigurationUpdates;
    /**
     * <p>
     * Indicates whether this workgroup enables publishing metrics to Amazon CloudWatch.
     * </p>
     */
    private Boolean publishCloudWatchMetricsEnabled;
    /**
     * <p>
     * The upper limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
     * </p>
     */
    private Long bytesScannedCutoffPerQuery;
    /**
     * <p>
     * Indicates that the data usage control limit per query is removed.
     * <a>WorkGroupConfiguration$BytesScannedCutoffPerQuery</a>
     * </p>
     */
    private Boolean removeBytesScannedCutoffPerQuery;

    /**
     * <p>
     * If set to "true", the settings for the workgroup override client-side settings. If set to "false" client-side
     * settings are used. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param enforceWorkGroupConfiguration
     *        If set to "true", the settings for the workgroup override client-side settings. If set to "false"
     *        client-side settings are used. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     */

    public void setEnforceWorkGroupConfiguration(Boolean enforceWorkGroupConfiguration) {
        this.enforceWorkGroupConfiguration = enforceWorkGroupConfiguration;
    }

    /**
     * <p>
     * If set to "true", the settings for the workgroup override client-side settings. If set to "false" client-side
     * settings are used. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return If set to "true", the settings for the workgroup override client-side settings. If set to "false"
     *         client-side settings are used. For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *         Override Client-Side Settings</a>.
     */

    public Boolean getEnforceWorkGroupConfiguration() {
        return this.enforceWorkGroupConfiguration;
    }

    /**
     * <p>
     * If set to "true", the settings for the workgroup override client-side settings. If set to "false" client-side
     * settings are used. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param enforceWorkGroupConfiguration
     *        If set to "true", the settings for the workgroup override client-side settings. If set to "false"
     *        client-side settings are used. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkGroupConfigurationUpdates withEnforceWorkGroupConfiguration(Boolean enforceWorkGroupConfiguration) {
        setEnforceWorkGroupConfiguration(enforceWorkGroupConfiguration);
        return this;
    }

    /**
     * <p>
     * If set to "true", the settings for the workgroup override client-side settings. If set to "false" client-side
     * settings are used. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return If set to "true", the settings for the workgroup override client-side settings. If set to "false"
     *         client-side settings are used. For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *         Override Client-Side Settings</a>.
     */

    public Boolean isEnforceWorkGroupConfiguration() {
        return this.enforceWorkGroupConfiguration;
    }

    /**
     * <p>
     * The result configuration information about the queries in this workgroup that will be updated. Includes the
     * updated results location and an updated option for encrypting query results.
     * </p>
     * 
     * @param resultConfigurationUpdates
     *        The result configuration information about the queries in this workgroup that will be updated. Includes
     *        the updated results location and an updated option for encrypting query results.
     */

    public void setResultConfigurationUpdates(ResultConfigurationUpdates resultConfigurationUpdates) {
        this.resultConfigurationUpdates = resultConfigurationUpdates;
    }

    /**
     * <p>
     * The result configuration information about the queries in this workgroup that will be updated. Includes the
     * updated results location and an updated option for encrypting query results.
     * </p>
     * 
     * @return The result configuration information about the queries in this workgroup that will be updated. Includes
     *         the updated results location and an updated option for encrypting query results.
     */

    public ResultConfigurationUpdates getResultConfigurationUpdates() {
        return this.resultConfigurationUpdates;
    }

    /**
     * <p>
     * The result configuration information about the queries in this workgroup that will be updated. Includes the
     * updated results location and an updated option for encrypting query results.
     * </p>
     * 
     * @param resultConfigurationUpdates
     *        The result configuration information about the queries in this workgroup that will be updated. Includes
     *        the updated results location and an updated option for encrypting query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkGroupConfigurationUpdates withResultConfigurationUpdates(ResultConfigurationUpdates resultConfigurationUpdates) {
        setResultConfigurationUpdates(resultConfigurationUpdates);
        return this;
    }

    /**
     * <p>
     * Indicates whether this workgroup enables publishing metrics to Amazon CloudWatch.
     * </p>
     * 
     * @param publishCloudWatchMetricsEnabled
     *        Indicates whether this workgroup enables publishing metrics to Amazon CloudWatch.
     */

    public void setPublishCloudWatchMetricsEnabled(Boolean publishCloudWatchMetricsEnabled) {
        this.publishCloudWatchMetricsEnabled = publishCloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * Indicates whether this workgroup enables publishing metrics to Amazon CloudWatch.
     * </p>
     * 
     * @return Indicates whether this workgroup enables publishing metrics to Amazon CloudWatch.
     */

    public Boolean getPublishCloudWatchMetricsEnabled() {
        return this.publishCloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * Indicates whether this workgroup enables publishing metrics to Amazon CloudWatch.
     * </p>
     * 
     * @param publishCloudWatchMetricsEnabled
     *        Indicates whether this workgroup enables publishing metrics to Amazon CloudWatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkGroupConfigurationUpdates withPublishCloudWatchMetricsEnabled(Boolean publishCloudWatchMetricsEnabled) {
        setPublishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether this workgroup enables publishing metrics to Amazon CloudWatch.
     * </p>
     * 
     * @return Indicates whether this workgroup enables publishing metrics to Amazon CloudWatch.
     */

    public Boolean isPublishCloudWatchMetricsEnabled() {
        return this.publishCloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * The upper limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
     * </p>
     * 
     * @param bytesScannedCutoffPerQuery
     *        The upper limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
     */

    public void setBytesScannedCutoffPerQuery(Long bytesScannedCutoffPerQuery) {
        this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
    }

    /**
     * <p>
     * The upper limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
     * </p>
     * 
     * @return The upper limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
     */

    public Long getBytesScannedCutoffPerQuery() {
        return this.bytesScannedCutoffPerQuery;
    }

    /**
     * <p>
     * The upper limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
     * </p>
     * 
     * @param bytesScannedCutoffPerQuery
     *        The upper limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkGroupConfigurationUpdates withBytesScannedCutoffPerQuery(Long bytesScannedCutoffPerQuery) {
        setBytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery);
        return this;
    }

    /**
     * <p>
     * Indicates that the data usage control limit per query is removed.
     * <a>WorkGroupConfiguration$BytesScannedCutoffPerQuery</a>
     * </p>
     * 
     * @param removeBytesScannedCutoffPerQuery
     *        Indicates that the data usage control limit per query is removed.
     *        <a>WorkGroupConfiguration$BytesScannedCutoffPerQuery</a>
     */

    public void setRemoveBytesScannedCutoffPerQuery(Boolean removeBytesScannedCutoffPerQuery) {
        this.removeBytesScannedCutoffPerQuery = removeBytesScannedCutoffPerQuery;
    }

    /**
     * <p>
     * Indicates that the data usage control limit per query is removed.
     * <a>WorkGroupConfiguration$BytesScannedCutoffPerQuery</a>
     * </p>
     * 
     * @return Indicates that the data usage control limit per query is removed.
     *         <a>WorkGroupConfiguration$BytesScannedCutoffPerQuery</a>
     */

    public Boolean getRemoveBytesScannedCutoffPerQuery() {
        return this.removeBytesScannedCutoffPerQuery;
    }

    /**
     * <p>
     * Indicates that the data usage control limit per query is removed.
     * <a>WorkGroupConfiguration$BytesScannedCutoffPerQuery</a>
     * </p>
     * 
     * @param removeBytesScannedCutoffPerQuery
     *        Indicates that the data usage control limit per query is removed.
     *        <a>WorkGroupConfiguration$BytesScannedCutoffPerQuery</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkGroupConfigurationUpdates withRemoveBytesScannedCutoffPerQuery(Boolean removeBytesScannedCutoffPerQuery) {
        setRemoveBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery);
        return this;
    }

    /**
     * <p>
     * Indicates that the data usage control limit per query is removed.
     * <a>WorkGroupConfiguration$BytesScannedCutoffPerQuery</a>
     * </p>
     * 
     * @return Indicates that the data usage control limit per query is removed.
     *         <a>WorkGroupConfiguration$BytesScannedCutoffPerQuery</a>
     */

    public Boolean isRemoveBytesScannedCutoffPerQuery() {
        return this.removeBytesScannedCutoffPerQuery;
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
        if (getEnforceWorkGroupConfiguration() != null)
            sb.append("EnforceWorkGroupConfiguration: ").append(getEnforceWorkGroupConfiguration()).append(",");
        if (getResultConfigurationUpdates() != null)
            sb.append("ResultConfigurationUpdates: ").append(getResultConfigurationUpdates()).append(",");
        if (getPublishCloudWatchMetricsEnabled() != null)
            sb.append("PublishCloudWatchMetricsEnabled: ").append(getPublishCloudWatchMetricsEnabled()).append(",");
        if (getBytesScannedCutoffPerQuery() != null)
            sb.append("BytesScannedCutoffPerQuery: ").append(getBytesScannedCutoffPerQuery()).append(",");
        if (getRemoveBytesScannedCutoffPerQuery() != null)
            sb.append("RemoveBytesScannedCutoffPerQuery: ").append(getRemoveBytesScannedCutoffPerQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkGroupConfigurationUpdates == false)
            return false;
        WorkGroupConfigurationUpdates other = (WorkGroupConfigurationUpdates) obj;
        if (other.getEnforceWorkGroupConfiguration() == null ^ this.getEnforceWorkGroupConfiguration() == null)
            return false;
        if (other.getEnforceWorkGroupConfiguration() != null
                && other.getEnforceWorkGroupConfiguration().equals(this.getEnforceWorkGroupConfiguration()) == false)
            return false;
        if (other.getResultConfigurationUpdates() == null ^ this.getResultConfigurationUpdates() == null)
            return false;
        if (other.getResultConfigurationUpdates() != null && other.getResultConfigurationUpdates().equals(this.getResultConfigurationUpdates()) == false)
            return false;
        if (other.getPublishCloudWatchMetricsEnabled() == null ^ this.getPublishCloudWatchMetricsEnabled() == null)
            return false;
        if (other.getPublishCloudWatchMetricsEnabled() != null
                && other.getPublishCloudWatchMetricsEnabled().equals(this.getPublishCloudWatchMetricsEnabled()) == false)
            return false;
        if (other.getBytesScannedCutoffPerQuery() == null ^ this.getBytesScannedCutoffPerQuery() == null)
            return false;
        if (other.getBytesScannedCutoffPerQuery() != null && other.getBytesScannedCutoffPerQuery().equals(this.getBytesScannedCutoffPerQuery()) == false)
            return false;
        if (other.getRemoveBytesScannedCutoffPerQuery() == null ^ this.getRemoveBytesScannedCutoffPerQuery() == null)
            return false;
        if (other.getRemoveBytesScannedCutoffPerQuery() != null
                && other.getRemoveBytesScannedCutoffPerQuery().equals(this.getRemoveBytesScannedCutoffPerQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnforceWorkGroupConfiguration() == null) ? 0 : getEnforceWorkGroupConfiguration().hashCode());
        hashCode = prime * hashCode + ((getResultConfigurationUpdates() == null) ? 0 : getResultConfigurationUpdates().hashCode());
        hashCode = prime * hashCode + ((getPublishCloudWatchMetricsEnabled() == null) ? 0 : getPublishCloudWatchMetricsEnabled().hashCode());
        hashCode = prime * hashCode + ((getBytesScannedCutoffPerQuery() == null) ? 0 : getBytesScannedCutoffPerQuery().hashCode());
        hashCode = prime * hashCode + ((getRemoveBytesScannedCutoffPerQuery() == null) ? 0 : getRemoveBytesScannedCutoffPerQuery().hashCode());
        return hashCode;
    }

    @Override
    public WorkGroupConfigurationUpdates clone() {
        try {
            return (WorkGroupConfigurationUpdates) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.WorkGroupConfigurationUpdatesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

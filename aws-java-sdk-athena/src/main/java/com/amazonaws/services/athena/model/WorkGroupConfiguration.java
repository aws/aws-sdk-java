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
 * The configuration of the workgroup, which includes the location in Amazon S3 where query results are stored, the
 * encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the
 * workgroup and whether workgroup settings override query settings, and the data usage limit for the amount of data
 * scanned per query, if it is specified. The workgroup settings override is specified in EnforceWorkGroupConfiguration
 * (true/false) in the WorkGroupConfiguration. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/WorkGroupConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkGroupConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration for the workgroup, which includes the location in Amazon S3 where query results are stored and
     * the encryption option, if any, used for query results.
     * </p>
     */
    private ResultConfiguration resultConfiguration;
    /**
     * <p>
     * If set to "true", the settings for the workgroup override client-side settings. If set to "false", client-side
     * settings are used. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     */
    private Boolean enforceWorkGroupConfiguration;
    /**
     * <p>
     * Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
     * </p>
     */
    private Boolean publishCloudWatchMetricsEnabled;
    /**
     * <p>
     * The upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
     * </p>
     */
    private Long bytesScannedCutoffPerQuery;

    /**
     * <p>
     * The configuration for the workgroup, which includes the location in Amazon S3 where query results are stored and
     * the encryption option, if any, used for query results.
     * </p>
     * 
     * @param resultConfiguration
     *        The configuration for the workgroup, which includes the location in Amazon S3 where query results are
     *        stored and the encryption option, if any, used for query results.
     */

    public void setResultConfiguration(ResultConfiguration resultConfiguration) {
        this.resultConfiguration = resultConfiguration;
    }

    /**
     * <p>
     * The configuration for the workgroup, which includes the location in Amazon S3 where query results are stored and
     * the encryption option, if any, used for query results.
     * </p>
     * 
     * @return The configuration for the workgroup, which includes the location in Amazon S3 where query results are
     *         stored and the encryption option, if any, used for query results.
     */

    public ResultConfiguration getResultConfiguration() {
        return this.resultConfiguration;
    }

    /**
     * <p>
     * The configuration for the workgroup, which includes the location in Amazon S3 where query results are stored and
     * the encryption option, if any, used for query results.
     * </p>
     * 
     * @param resultConfiguration
     *        The configuration for the workgroup, which includes the location in Amazon S3 where query results are
     *        stored and the encryption option, if any, used for query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkGroupConfiguration withResultConfiguration(ResultConfiguration resultConfiguration) {
        setResultConfiguration(resultConfiguration);
        return this;
    }

    /**
     * <p>
     * If set to "true", the settings for the workgroup override client-side settings. If set to "false", client-side
     * settings are used. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param enforceWorkGroupConfiguration
     *        If set to "true", the settings for the workgroup override client-side settings. If set to "false",
     *        client-side settings are used. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     */

    public void setEnforceWorkGroupConfiguration(Boolean enforceWorkGroupConfiguration) {
        this.enforceWorkGroupConfiguration = enforceWorkGroupConfiguration;
    }

    /**
     * <p>
     * If set to "true", the settings for the workgroup override client-side settings. If set to "false", client-side
     * settings are used. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return If set to "true", the settings for the workgroup override client-side settings. If set to "false",
     *         client-side settings are used. For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *         Override Client-Side Settings</a>.
     */

    public Boolean getEnforceWorkGroupConfiguration() {
        return this.enforceWorkGroupConfiguration;
    }

    /**
     * <p>
     * If set to "true", the settings for the workgroup override client-side settings. If set to "false", client-side
     * settings are used. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param enforceWorkGroupConfiguration
     *        If set to "true", the settings for the workgroup override client-side settings. If set to "false",
     *        client-side settings are used. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkGroupConfiguration withEnforceWorkGroupConfiguration(Boolean enforceWorkGroupConfiguration) {
        setEnforceWorkGroupConfiguration(enforceWorkGroupConfiguration);
        return this;
    }

    /**
     * <p>
     * If set to "true", the settings for the workgroup override client-side settings. If set to "false", client-side
     * settings are used. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return If set to "true", the settings for the workgroup override client-side settings. If set to "false",
     *         client-side settings are used. For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *         Override Client-Side Settings</a>.
     */

    public Boolean isEnforceWorkGroupConfiguration() {
        return this.enforceWorkGroupConfiguration;
    }

    /**
     * <p>
     * Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
     * </p>
     * 
     * @param publishCloudWatchMetricsEnabled
     *        Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
     */

    public void setPublishCloudWatchMetricsEnabled(Boolean publishCloudWatchMetricsEnabled) {
        this.publishCloudWatchMetricsEnabled = publishCloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
     * </p>
     * 
     * @return Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
     */

    public Boolean getPublishCloudWatchMetricsEnabled() {
        return this.publishCloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
     * </p>
     * 
     * @param publishCloudWatchMetricsEnabled
     *        Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkGroupConfiguration withPublishCloudWatchMetricsEnabled(Boolean publishCloudWatchMetricsEnabled) {
        setPublishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
     * </p>
     * 
     * @return Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
     */

    public Boolean isPublishCloudWatchMetricsEnabled() {
        return this.publishCloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * The upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
     * </p>
     * 
     * @param bytesScannedCutoffPerQuery
     *        The upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to
     *        scan.
     */

    public void setBytesScannedCutoffPerQuery(Long bytesScannedCutoffPerQuery) {
        this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
    }

    /**
     * <p>
     * The upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
     * </p>
     * 
     * @return The upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to
     *         scan.
     */

    public Long getBytesScannedCutoffPerQuery() {
        return this.bytesScannedCutoffPerQuery;
    }

    /**
     * <p>
     * The upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
     * </p>
     * 
     * @param bytesScannedCutoffPerQuery
     *        The upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to
     *        scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkGroupConfiguration withBytesScannedCutoffPerQuery(Long bytesScannedCutoffPerQuery) {
        setBytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery);
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
        if (getResultConfiguration() != null)
            sb.append("ResultConfiguration: ").append(getResultConfiguration()).append(",");
        if (getEnforceWorkGroupConfiguration() != null)
            sb.append("EnforceWorkGroupConfiguration: ").append(getEnforceWorkGroupConfiguration()).append(",");
        if (getPublishCloudWatchMetricsEnabled() != null)
            sb.append("PublishCloudWatchMetricsEnabled: ").append(getPublishCloudWatchMetricsEnabled()).append(",");
        if (getBytesScannedCutoffPerQuery() != null)
            sb.append("BytesScannedCutoffPerQuery: ").append(getBytesScannedCutoffPerQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkGroupConfiguration == false)
            return false;
        WorkGroupConfiguration other = (WorkGroupConfiguration) obj;
        if (other.getResultConfiguration() == null ^ this.getResultConfiguration() == null)
            return false;
        if (other.getResultConfiguration() != null && other.getResultConfiguration().equals(this.getResultConfiguration()) == false)
            return false;
        if (other.getEnforceWorkGroupConfiguration() == null ^ this.getEnforceWorkGroupConfiguration() == null)
            return false;
        if (other.getEnforceWorkGroupConfiguration() != null
                && other.getEnforceWorkGroupConfiguration().equals(this.getEnforceWorkGroupConfiguration()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultConfiguration() == null) ? 0 : getResultConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEnforceWorkGroupConfiguration() == null) ? 0 : getEnforceWorkGroupConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPublishCloudWatchMetricsEnabled() == null) ? 0 : getPublishCloudWatchMetricsEnabled().hashCode());
        hashCode = prime * hashCode + ((getBytesScannedCutoffPerQuery() == null) ? 0 : getBytesScannedCutoffPerQuery().hashCode());
        return hashCode;
    }

    @Override
    public WorkGroupConfiguration clone() {
        try {
            return (WorkGroupConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.WorkGroupConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

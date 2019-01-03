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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Enable or disable collection of reputation metrics for emails that you send using this configuration set in the
 * current AWS Region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ReputationOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReputationOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If <code>false</code>,
     * tracking of reputation metrics is disabled for the configuration set.
     * </p>
     */
    private Boolean reputationMetricsEnabled;
    /**
     * <p>
     * The date and time (in Unix time) when the reputation metrics were last given a fresh start. When your account is
     * given a fresh start, your reputation metrics are calculated starting from the date of the fresh start.
     * </p>
     */
    private java.util.Date lastFreshStart;

    /**
     * <p>
     * If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If <code>false</code>,
     * tracking of reputation metrics is disabled for the configuration set.
     * </p>
     * 
     * @param reputationMetricsEnabled
     *        If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If
     *        <code>false</code>, tracking of reputation metrics is disabled for the configuration set.
     */

    public void setReputationMetricsEnabled(Boolean reputationMetricsEnabled) {
        this.reputationMetricsEnabled = reputationMetricsEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If <code>false</code>,
     * tracking of reputation metrics is disabled for the configuration set.
     * </p>
     * 
     * @return If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If
     *         <code>false</code>, tracking of reputation metrics is disabled for the configuration set.
     */

    public Boolean getReputationMetricsEnabled() {
        return this.reputationMetricsEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If <code>false</code>,
     * tracking of reputation metrics is disabled for the configuration set.
     * </p>
     * 
     * @param reputationMetricsEnabled
     *        If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If
     *        <code>false</code>, tracking of reputation metrics is disabled for the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReputationOptions withReputationMetricsEnabled(Boolean reputationMetricsEnabled) {
        setReputationMetricsEnabled(reputationMetricsEnabled);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If <code>false</code>,
     * tracking of reputation metrics is disabled for the configuration set.
     * </p>
     * 
     * @return If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If
     *         <code>false</code>, tracking of reputation metrics is disabled for the configuration set.
     */

    public Boolean isReputationMetricsEnabled() {
        return this.reputationMetricsEnabled;
    }

    /**
     * <p>
     * The date and time (in Unix time) when the reputation metrics were last given a fresh start. When your account is
     * given a fresh start, your reputation metrics are calculated starting from the date of the fresh start.
     * </p>
     * 
     * @param lastFreshStart
     *        The date and time (in Unix time) when the reputation metrics were last given a fresh start. When your
     *        account is given a fresh start, your reputation metrics are calculated starting from the date of the fresh
     *        start.
     */

    public void setLastFreshStart(java.util.Date lastFreshStart) {
        this.lastFreshStart = lastFreshStart;
    }

    /**
     * <p>
     * The date and time (in Unix time) when the reputation metrics were last given a fresh start. When your account is
     * given a fresh start, your reputation metrics are calculated starting from the date of the fresh start.
     * </p>
     * 
     * @return The date and time (in Unix time) when the reputation metrics were last given a fresh start. When your
     *         account is given a fresh start, your reputation metrics are calculated starting from the date of the
     *         fresh start.
     */

    public java.util.Date getLastFreshStart() {
        return this.lastFreshStart;
    }

    /**
     * <p>
     * The date and time (in Unix time) when the reputation metrics were last given a fresh start. When your account is
     * given a fresh start, your reputation metrics are calculated starting from the date of the fresh start.
     * </p>
     * 
     * @param lastFreshStart
     *        The date and time (in Unix time) when the reputation metrics were last given a fresh start. When your
     *        account is given a fresh start, your reputation metrics are calculated starting from the date of the fresh
     *        start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReputationOptions withLastFreshStart(java.util.Date lastFreshStart) {
        setLastFreshStart(lastFreshStart);
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
        if (getReputationMetricsEnabled() != null)
            sb.append("ReputationMetricsEnabled: ").append(getReputationMetricsEnabled()).append(",");
        if (getLastFreshStart() != null)
            sb.append("LastFreshStart: ").append(getLastFreshStart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReputationOptions == false)
            return false;
        ReputationOptions other = (ReputationOptions) obj;
        if (other.getReputationMetricsEnabled() == null ^ this.getReputationMetricsEnabled() == null)
            return false;
        if (other.getReputationMetricsEnabled() != null && other.getReputationMetricsEnabled().equals(this.getReputationMetricsEnabled()) == false)
            return false;
        if (other.getLastFreshStart() == null ^ this.getLastFreshStart() == null)
            return false;
        if (other.getLastFreshStart() != null && other.getLastFreshStart().equals(this.getLastFreshStart()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReputationMetricsEnabled() == null) ? 0 : getReputationMetricsEnabled().hashCode());
        hashCode = prime * hashCode + ((getLastFreshStart() == null) ? 0 : getLastFreshStart().hashCode());
        return hashCode;
    }

    @Override
    public ReputationOptions clone() {
        try {
            return (ReputationOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.ReputationOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

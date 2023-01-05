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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing additional settings for your VDM configuration as applicable to the Dashboard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DashboardOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashboardOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the status of your VDM engagement metrics collection. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – Amazon SES enables engagement metrics for the configuration set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – Amazon SES disables engagement metrics for the configuration set.
     * </p>
     * </li>
     * </ul>
     */
    private String engagementMetrics;

    /**
     * <p>
     * Specifies the status of your VDM engagement metrics collection. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – Amazon SES enables engagement metrics for the configuration set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – Amazon SES disables engagement metrics for the configuration set.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engagementMetrics
     *        Specifies the status of your VDM engagement metrics collection. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – Amazon SES enables engagement metrics for the configuration set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – Amazon SES disables engagement metrics for the configuration set.
     *        </p>
     *        </li>
     * @see FeatureStatus
     */

    public void setEngagementMetrics(String engagementMetrics) {
        this.engagementMetrics = engagementMetrics;
    }

    /**
     * <p>
     * Specifies the status of your VDM engagement metrics collection. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – Amazon SES enables engagement metrics for the configuration set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – Amazon SES disables engagement metrics for the configuration set.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the status of your VDM engagement metrics collection. Can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> – Amazon SES enables engagement metrics for the configuration set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> – Amazon SES disables engagement metrics for the configuration set.
     *         </p>
     *         </li>
     * @see FeatureStatus
     */

    public String getEngagementMetrics() {
        return this.engagementMetrics;
    }

    /**
     * <p>
     * Specifies the status of your VDM engagement metrics collection. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – Amazon SES enables engagement metrics for the configuration set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – Amazon SES disables engagement metrics for the configuration set.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engagementMetrics
     *        Specifies the status of your VDM engagement metrics collection. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – Amazon SES enables engagement metrics for the configuration set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – Amazon SES disables engagement metrics for the configuration set.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public DashboardOptions withEngagementMetrics(String engagementMetrics) {
        setEngagementMetrics(engagementMetrics);
        return this;
    }

    /**
     * <p>
     * Specifies the status of your VDM engagement metrics collection. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – Amazon SES enables engagement metrics for the configuration set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – Amazon SES disables engagement metrics for the configuration set.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engagementMetrics
     *        Specifies the status of your VDM engagement metrics collection. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – Amazon SES enables engagement metrics for the configuration set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – Amazon SES disables engagement metrics for the configuration set.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public DashboardOptions withEngagementMetrics(FeatureStatus engagementMetrics) {
        this.engagementMetrics = engagementMetrics.toString();
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
        if (getEngagementMetrics() != null)
            sb.append("EngagementMetrics: ").append(getEngagementMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashboardOptions == false)
            return false;
        DashboardOptions other = (DashboardOptions) obj;
        if (other.getEngagementMetrics() == null ^ this.getEngagementMetrics() == null)
            return false;
        if (other.getEngagementMetrics() != null && other.getEngagementMetrics().equals(this.getEngagementMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngagementMetrics() == null) ? 0 : getEngagementMetrics().hashCode());
        return hashCode;
    }

    @Override
    public DashboardOptions clone() {
        try {
            return (DashboardOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.DashboardOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

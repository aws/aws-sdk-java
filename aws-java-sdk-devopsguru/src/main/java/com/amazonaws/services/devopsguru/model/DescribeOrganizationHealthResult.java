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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeOrganizationHealth"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationHealthResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An integer that specifies the number of open reactive insights in your Amazon Web Services account.
     * </p>
     */
    private Integer openReactiveInsights;
    /**
     * <p>
     * An integer that specifies the number of open proactive insights in your Amazon Web Services account.
     * </p>
     */
    private Integer openProactiveInsights;
    /**
     * <p>
     * An integer that specifies the number of metrics that have been analyzed in your organization.
     * </p>
     */
    private Integer metricsAnalyzed;
    /**
     * <p>
     * The number of Amazon DevOps Guru resource analysis hours billed to the current Amazon Web Services account in the
     * last hour.
     * </p>
     */
    private Long resourceHours;

    /**
     * <p>
     * An integer that specifies the number of open reactive insights in your Amazon Web Services account.
     * </p>
     * 
     * @param openReactiveInsights
     *        An integer that specifies the number of open reactive insights in your Amazon Web Services account.
     */

    public void setOpenReactiveInsights(Integer openReactiveInsights) {
        this.openReactiveInsights = openReactiveInsights;
    }

    /**
     * <p>
     * An integer that specifies the number of open reactive insights in your Amazon Web Services account.
     * </p>
     * 
     * @return An integer that specifies the number of open reactive insights in your Amazon Web Services account.
     */

    public Integer getOpenReactiveInsights() {
        return this.openReactiveInsights;
    }

    /**
     * <p>
     * An integer that specifies the number of open reactive insights in your Amazon Web Services account.
     * </p>
     * 
     * @param openReactiveInsights
     *        An integer that specifies the number of open reactive insights in your Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationHealthResult withOpenReactiveInsights(Integer openReactiveInsights) {
        setOpenReactiveInsights(openReactiveInsights);
        return this;
    }

    /**
     * <p>
     * An integer that specifies the number of open proactive insights in your Amazon Web Services account.
     * </p>
     * 
     * @param openProactiveInsights
     *        An integer that specifies the number of open proactive insights in your Amazon Web Services account.
     */

    public void setOpenProactiveInsights(Integer openProactiveInsights) {
        this.openProactiveInsights = openProactiveInsights;
    }

    /**
     * <p>
     * An integer that specifies the number of open proactive insights in your Amazon Web Services account.
     * </p>
     * 
     * @return An integer that specifies the number of open proactive insights in your Amazon Web Services account.
     */

    public Integer getOpenProactiveInsights() {
        return this.openProactiveInsights;
    }

    /**
     * <p>
     * An integer that specifies the number of open proactive insights in your Amazon Web Services account.
     * </p>
     * 
     * @param openProactiveInsights
     *        An integer that specifies the number of open proactive insights in your Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationHealthResult withOpenProactiveInsights(Integer openProactiveInsights) {
        setOpenProactiveInsights(openProactiveInsights);
        return this;
    }

    /**
     * <p>
     * An integer that specifies the number of metrics that have been analyzed in your organization.
     * </p>
     * 
     * @param metricsAnalyzed
     *        An integer that specifies the number of metrics that have been analyzed in your organization.
     */

    public void setMetricsAnalyzed(Integer metricsAnalyzed) {
        this.metricsAnalyzed = metricsAnalyzed;
    }

    /**
     * <p>
     * An integer that specifies the number of metrics that have been analyzed in your organization.
     * </p>
     * 
     * @return An integer that specifies the number of metrics that have been analyzed in your organization.
     */

    public Integer getMetricsAnalyzed() {
        return this.metricsAnalyzed;
    }

    /**
     * <p>
     * An integer that specifies the number of metrics that have been analyzed in your organization.
     * </p>
     * 
     * @param metricsAnalyzed
     *        An integer that specifies the number of metrics that have been analyzed in your organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationHealthResult withMetricsAnalyzed(Integer metricsAnalyzed) {
        setMetricsAnalyzed(metricsAnalyzed);
        return this;
    }

    /**
     * <p>
     * The number of Amazon DevOps Guru resource analysis hours billed to the current Amazon Web Services account in the
     * last hour.
     * </p>
     * 
     * @param resourceHours
     *        The number of Amazon DevOps Guru resource analysis hours billed to the current Amazon Web Services account
     *        in the last hour.
     */

    public void setResourceHours(Long resourceHours) {
        this.resourceHours = resourceHours;
    }

    /**
     * <p>
     * The number of Amazon DevOps Guru resource analysis hours billed to the current Amazon Web Services account in the
     * last hour.
     * </p>
     * 
     * @return The number of Amazon DevOps Guru resource analysis hours billed to the current Amazon Web Services
     *         account in the last hour.
     */

    public Long getResourceHours() {
        return this.resourceHours;
    }

    /**
     * <p>
     * The number of Amazon DevOps Guru resource analysis hours billed to the current Amazon Web Services account in the
     * last hour.
     * </p>
     * 
     * @param resourceHours
     *        The number of Amazon DevOps Guru resource analysis hours billed to the current Amazon Web Services account
     *        in the last hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationHealthResult withResourceHours(Long resourceHours) {
        setResourceHours(resourceHours);
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
        if (getOpenReactiveInsights() != null)
            sb.append("OpenReactiveInsights: ").append(getOpenReactiveInsights()).append(",");
        if (getOpenProactiveInsights() != null)
            sb.append("OpenProactiveInsights: ").append(getOpenProactiveInsights()).append(",");
        if (getMetricsAnalyzed() != null)
            sb.append("MetricsAnalyzed: ").append(getMetricsAnalyzed()).append(",");
        if (getResourceHours() != null)
            sb.append("ResourceHours: ").append(getResourceHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrganizationHealthResult == false)
            return false;
        DescribeOrganizationHealthResult other = (DescribeOrganizationHealthResult) obj;
        if (other.getOpenReactiveInsights() == null ^ this.getOpenReactiveInsights() == null)
            return false;
        if (other.getOpenReactiveInsights() != null && other.getOpenReactiveInsights().equals(this.getOpenReactiveInsights()) == false)
            return false;
        if (other.getOpenProactiveInsights() == null ^ this.getOpenProactiveInsights() == null)
            return false;
        if (other.getOpenProactiveInsights() != null && other.getOpenProactiveInsights().equals(this.getOpenProactiveInsights()) == false)
            return false;
        if (other.getMetricsAnalyzed() == null ^ this.getMetricsAnalyzed() == null)
            return false;
        if (other.getMetricsAnalyzed() != null && other.getMetricsAnalyzed().equals(this.getMetricsAnalyzed()) == false)
            return false;
        if (other.getResourceHours() == null ^ this.getResourceHours() == null)
            return false;
        if (other.getResourceHours() != null && other.getResourceHours().equals(this.getResourceHours()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpenReactiveInsights() == null) ? 0 : getOpenReactiveInsights().hashCode());
        hashCode = prime * hashCode + ((getOpenProactiveInsights() == null) ? 0 : getOpenProactiveInsights().hashCode());
        hashCode = prime * hashCode + ((getMetricsAnalyzed() == null) ? 0 : getMetricsAnalyzed().hashCode());
        hashCode = prime * hashCode + ((getResourceHours() == null) ? 0 : getResourceHours().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationHealthResult clone() {
        try {
            return (DescribeOrganizationHealthResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

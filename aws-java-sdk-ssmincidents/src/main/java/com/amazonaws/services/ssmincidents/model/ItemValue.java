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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a related item.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ItemValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ItemValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the related item, if the related item is an Amazon resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The metric definition, if the related item is a metric in Amazon CloudWatch.
     * </p>
     */
    private String metricDefinition;
    /**
     * <p>
     * Details about an incident that is associated with a PagerDuty incident.
     * </p>
     */
    private PagerDutyIncidentDetail pagerDutyIncidentDetail;
    /**
     * <p>
     * The URL, if the related item is a non-Amazon Web Services resource.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the related item, if the related item is an Amazon resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the related item, if the related item is an Amazon resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the related item, if the related item is an Amazon resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the related item, if the related item is an Amazon resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the related item, if the related item is an Amazon resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the related item, if the related item is an Amazon resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemValue withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The metric definition, if the related item is a metric in Amazon CloudWatch.
     * </p>
     * 
     * @param metricDefinition
     *        The metric definition, if the related item is a metric in Amazon CloudWatch.
     */

    public void setMetricDefinition(String metricDefinition) {
        this.metricDefinition = metricDefinition;
    }

    /**
     * <p>
     * The metric definition, if the related item is a metric in Amazon CloudWatch.
     * </p>
     * 
     * @return The metric definition, if the related item is a metric in Amazon CloudWatch.
     */

    public String getMetricDefinition() {
        return this.metricDefinition;
    }

    /**
     * <p>
     * The metric definition, if the related item is a metric in Amazon CloudWatch.
     * </p>
     * 
     * @param metricDefinition
     *        The metric definition, if the related item is a metric in Amazon CloudWatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemValue withMetricDefinition(String metricDefinition) {
        setMetricDefinition(metricDefinition);
        return this;
    }

    /**
     * <p>
     * Details about an incident that is associated with a PagerDuty incident.
     * </p>
     * 
     * @param pagerDutyIncidentDetail
     *        Details about an incident that is associated with a PagerDuty incident.
     */

    public void setPagerDutyIncidentDetail(PagerDutyIncidentDetail pagerDutyIncidentDetail) {
        this.pagerDutyIncidentDetail = pagerDutyIncidentDetail;
    }

    /**
     * <p>
     * Details about an incident that is associated with a PagerDuty incident.
     * </p>
     * 
     * @return Details about an incident that is associated with a PagerDuty incident.
     */

    public PagerDutyIncidentDetail getPagerDutyIncidentDetail() {
        return this.pagerDutyIncidentDetail;
    }

    /**
     * <p>
     * Details about an incident that is associated with a PagerDuty incident.
     * </p>
     * 
     * @param pagerDutyIncidentDetail
     *        Details about an incident that is associated with a PagerDuty incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemValue withPagerDutyIncidentDetail(PagerDutyIncidentDetail pagerDutyIncidentDetail) {
        setPagerDutyIncidentDetail(pagerDutyIncidentDetail);
        return this;
    }

    /**
     * <p>
     * The URL, if the related item is a non-Amazon Web Services resource.
     * </p>
     * 
     * @param url
     *        The URL, if the related item is a non-Amazon Web Services resource.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL, if the related item is a non-Amazon Web Services resource.
     * </p>
     * 
     * @return The URL, if the related item is a non-Amazon Web Services resource.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL, if the related item is a non-Amazon Web Services resource.
     * </p>
     * 
     * @param url
     *        The URL, if the related item is a non-Amazon Web Services resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemValue withUrl(String url) {
        setUrl(url);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getMetricDefinition() != null)
            sb.append("MetricDefinition: ").append(getMetricDefinition()).append(",");
        if (getPagerDutyIncidentDetail() != null)
            sb.append("PagerDutyIncidentDetail: ").append(getPagerDutyIncidentDetail()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ItemValue == false)
            return false;
        ItemValue other = (ItemValue) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getMetricDefinition() == null ^ this.getMetricDefinition() == null)
            return false;
        if (other.getMetricDefinition() != null && other.getMetricDefinition().equals(this.getMetricDefinition()) == false)
            return false;
        if (other.getPagerDutyIncidentDetail() == null ^ this.getPagerDutyIncidentDetail() == null)
            return false;
        if (other.getPagerDutyIncidentDetail() != null && other.getPagerDutyIncidentDetail().equals(this.getPagerDutyIncidentDetail()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getMetricDefinition() == null) ? 0 : getMetricDefinition().hashCode());
        hashCode = prime * hashCode + ((getPagerDutyIncidentDetail() == null) ? 0 : getPagerDutyIncidentDetail().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public ItemValue clone() {
        try {
            return (ItemValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.ItemValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

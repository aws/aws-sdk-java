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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/UpdateAlert" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAlertRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the alert to update.
     * </p>
     */
    private String alertArn;
    /**
     * <p>
     * A description of the alert.
     * </p>
     */
    private String alertDescription;
    /**
     * <p>
     * An integer from 0 to 100 specifying the alert sensitivity threshold.
     * </p>
     */
    private Integer alertSensitivityThreshold;
    /**
     * <p>
     * Action that will be triggered when there is an alert.
     * </p>
     */
    private Action action;
    /**
     * <p>
     * The configuration of the alert filters, containing MetricList and DimensionFilterList.
     * </p>
     */
    private AlertFilters alertFilters;

    /**
     * <p>
     * The ARN of the alert to update.
     * </p>
     * 
     * @param alertArn
     *        The ARN of the alert to update.
     */

    public void setAlertArn(String alertArn) {
        this.alertArn = alertArn;
    }

    /**
     * <p>
     * The ARN of the alert to update.
     * </p>
     * 
     * @return The ARN of the alert to update.
     */

    public String getAlertArn() {
        return this.alertArn;
    }

    /**
     * <p>
     * The ARN of the alert to update.
     * </p>
     * 
     * @param alertArn
     *        The ARN of the alert to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAlertRequest withAlertArn(String alertArn) {
        setAlertArn(alertArn);
        return this;
    }

    /**
     * <p>
     * A description of the alert.
     * </p>
     * 
     * @param alertDescription
     *        A description of the alert.
     */

    public void setAlertDescription(String alertDescription) {
        this.alertDescription = alertDescription;
    }

    /**
     * <p>
     * A description of the alert.
     * </p>
     * 
     * @return A description of the alert.
     */

    public String getAlertDescription() {
        return this.alertDescription;
    }

    /**
     * <p>
     * A description of the alert.
     * </p>
     * 
     * @param alertDescription
     *        A description of the alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAlertRequest withAlertDescription(String alertDescription) {
        setAlertDescription(alertDescription);
        return this;
    }

    /**
     * <p>
     * An integer from 0 to 100 specifying the alert sensitivity threshold.
     * </p>
     * 
     * @param alertSensitivityThreshold
     *        An integer from 0 to 100 specifying the alert sensitivity threshold.
     */

    public void setAlertSensitivityThreshold(Integer alertSensitivityThreshold) {
        this.alertSensitivityThreshold = alertSensitivityThreshold;
    }

    /**
     * <p>
     * An integer from 0 to 100 specifying the alert sensitivity threshold.
     * </p>
     * 
     * @return An integer from 0 to 100 specifying the alert sensitivity threshold.
     */

    public Integer getAlertSensitivityThreshold() {
        return this.alertSensitivityThreshold;
    }

    /**
     * <p>
     * An integer from 0 to 100 specifying the alert sensitivity threshold.
     * </p>
     * 
     * @param alertSensitivityThreshold
     *        An integer from 0 to 100 specifying the alert sensitivity threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAlertRequest withAlertSensitivityThreshold(Integer alertSensitivityThreshold) {
        setAlertSensitivityThreshold(alertSensitivityThreshold);
        return this;
    }

    /**
     * <p>
     * Action that will be triggered when there is an alert.
     * </p>
     * 
     * @param action
     *        Action that will be triggered when there is an alert.
     */

    public void setAction(Action action) {
        this.action = action;
    }

    /**
     * <p>
     * Action that will be triggered when there is an alert.
     * </p>
     * 
     * @return Action that will be triggered when there is an alert.
     */

    public Action getAction() {
        return this.action;
    }

    /**
     * <p>
     * Action that will be triggered when there is an alert.
     * </p>
     * 
     * @param action
     *        Action that will be triggered when there is an alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAlertRequest withAction(Action action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The configuration of the alert filters, containing MetricList and DimensionFilterList.
     * </p>
     * 
     * @param alertFilters
     *        The configuration of the alert filters, containing MetricList and DimensionFilterList.
     */

    public void setAlertFilters(AlertFilters alertFilters) {
        this.alertFilters = alertFilters;
    }

    /**
     * <p>
     * The configuration of the alert filters, containing MetricList and DimensionFilterList.
     * </p>
     * 
     * @return The configuration of the alert filters, containing MetricList and DimensionFilterList.
     */

    public AlertFilters getAlertFilters() {
        return this.alertFilters;
    }

    /**
     * <p>
     * The configuration of the alert filters, containing MetricList and DimensionFilterList.
     * </p>
     * 
     * @param alertFilters
     *        The configuration of the alert filters, containing MetricList and DimensionFilterList.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAlertRequest withAlertFilters(AlertFilters alertFilters) {
        setAlertFilters(alertFilters);
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
        if (getAlertArn() != null)
            sb.append("AlertArn: ").append(getAlertArn()).append(",");
        if (getAlertDescription() != null)
            sb.append("AlertDescription: ").append(getAlertDescription()).append(",");
        if (getAlertSensitivityThreshold() != null)
            sb.append("AlertSensitivityThreshold: ").append(getAlertSensitivityThreshold()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getAlertFilters() != null)
            sb.append("AlertFilters: ").append(getAlertFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAlertRequest == false)
            return false;
        UpdateAlertRequest other = (UpdateAlertRequest) obj;
        if (other.getAlertArn() == null ^ this.getAlertArn() == null)
            return false;
        if (other.getAlertArn() != null && other.getAlertArn().equals(this.getAlertArn()) == false)
            return false;
        if (other.getAlertDescription() == null ^ this.getAlertDescription() == null)
            return false;
        if (other.getAlertDescription() != null && other.getAlertDescription().equals(this.getAlertDescription()) == false)
            return false;
        if (other.getAlertSensitivityThreshold() == null ^ this.getAlertSensitivityThreshold() == null)
            return false;
        if (other.getAlertSensitivityThreshold() != null && other.getAlertSensitivityThreshold().equals(this.getAlertSensitivityThreshold()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getAlertFilters() == null ^ this.getAlertFilters() == null)
            return false;
        if (other.getAlertFilters() != null && other.getAlertFilters().equals(this.getAlertFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlertArn() == null) ? 0 : getAlertArn().hashCode());
        hashCode = prime * hashCode + ((getAlertDescription() == null) ? 0 : getAlertDescription().hashCode());
        hashCode = prime * hashCode + ((getAlertSensitivityThreshold() == null) ? 0 : getAlertSensitivityThreshold().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getAlertFilters() == null) ? 0 : getAlertFilters().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAlertRequest clone() {
        return (UpdateAlertRequest) super.clone();
    }

}

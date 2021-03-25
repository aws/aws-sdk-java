/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CreateAlert" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAlertRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the alert.
     * </p>
     */
    private String alertName;
    /**
     * <p>
     * An integer from 0 to 100 specifying the alert sensitivity threshold.
     * </p>
     */
    private Integer alertSensitivityThreshold;
    /**
     * <p>
     * A description of the alert.
     * </p>
     */
    private String alertDescription;
    /**
     * <p>
     * The ARN of the detector to which the alert is attached.
     * </p>
     */
    private String anomalyDetectorArn;
    /**
     * <p>
     * Action that will be triggered when there is an alert.
     * </p>
     */
    private Action action;
    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to apply
     * to the alert.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the alert.
     * </p>
     * 
     * @param alertName
     *        The name of the alert.
     */

    public void setAlertName(String alertName) {
        this.alertName = alertName;
    }

    /**
     * <p>
     * The name of the alert.
     * </p>
     * 
     * @return The name of the alert.
     */

    public String getAlertName() {
        return this.alertName;
    }

    /**
     * <p>
     * The name of the alert.
     * </p>
     * 
     * @param alertName
     *        The name of the alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlertRequest withAlertName(String alertName) {
        setAlertName(alertName);
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

    public CreateAlertRequest withAlertSensitivityThreshold(Integer alertSensitivityThreshold) {
        setAlertSensitivityThreshold(alertSensitivityThreshold);
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

    public CreateAlertRequest withAlertDescription(String alertDescription) {
        setAlertDescription(alertDescription);
        return this;
    }

    /**
     * <p>
     * The ARN of the detector to which the alert is attached.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the detector to which the alert is attached.
     */

    public void setAnomalyDetectorArn(String anomalyDetectorArn) {
        this.anomalyDetectorArn = anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the detector to which the alert is attached.
     * </p>
     * 
     * @return The ARN of the detector to which the alert is attached.
     */

    public String getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the detector to which the alert is attached.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the detector to which the alert is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlertRequest withAnomalyDetectorArn(String anomalyDetectorArn) {
        setAnomalyDetectorArn(anomalyDetectorArn);
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

    public CreateAlertRequest withAction(Action action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to apply
     * to the alert.
     * </p>
     * 
     * @return A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to
     *         apply to the alert.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to apply
     * to the alert.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to
     *        apply to the alert.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to apply
     * to the alert.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to
     *        apply to the alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlertRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAlertRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlertRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlertRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAlertName() != null)
            sb.append("AlertName: ").append(getAlertName()).append(",");
        if (getAlertSensitivityThreshold() != null)
            sb.append("AlertSensitivityThreshold: ").append(getAlertSensitivityThreshold()).append(",");
        if (getAlertDescription() != null)
            sb.append("AlertDescription: ").append(getAlertDescription()).append(",");
        if (getAnomalyDetectorArn() != null)
            sb.append("AnomalyDetectorArn: ").append(getAnomalyDetectorArn()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAlertRequest == false)
            return false;
        CreateAlertRequest other = (CreateAlertRequest) obj;
        if (other.getAlertName() == null ^ this.getAlertName() == null)
            return false;
        if (other.getAlertName() != null && other.getAlertName().equals(this.getAlertName()) == false)
            return false;
        if (other.getAlertSensitivityThreshold() == null ^ this.getAlertSensitivityThreshold() == null)
            return false;
        if (other.getAlertSensitivityThreshold() != null && other.getAlertSensitivityThreshold().equals(this.getAlertSensitivityThreshold()) == false)
            return false;
        if (other.getAlertDescription() == null ^ this.getAlertDescription() == null)
            return false;
        if (other.getAlertDescription() != null && other.getAlertDescription().equals(this.getAlertDescription()) == false)
            return false;
        if (other.getAnomalyDetectorArn() == null ^ this.getAnomalyDetectorArn() == null)
            return false;
        if (other.getAnomalyDetectorArn() != null && other.getAnomalyDetectorArn().equals(this.getAnomalyDetectorArn()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlertName() == null) ? 0 : getAlertName().hashCode());
        hashCode = prime * hashCode + ((getAlertSensitivityThreshold() == null) ? 0 : getAlertSensitivityThreshold().hashCode());
        hashCode = prime * hashCode + ((getAlertDescription() == null) ? 0 : getAlertDescription().hashCode());
        hashCode = prime * hashCode + ((getAnomalyDetectorArn() == null) ? 0 : getAnomalyDetectorArn().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAlertRequest clone() {
        return (CreateAlertRequest) super.clone();
    }

}

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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdateDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDatasetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the data set to update.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * A list of <code>DatasetAction</code> objects.
     * </p>
     */
    private java.util.List<DatasetAction> actions;
    /**
     * <p>
     * A list of <code>DatasetTrigger</code> objects. The list can be empty or can contain up to five
     * <code>DatasetTrigger</code> objects.
     * </p>
     */
    private java.util.List<DatasetTrigger> triggers;
    /**
     * <p>
     * When dataset contents are created, they are delivered to destinations specified here.
     * </p>
     */
    private java.util.List<DatasetContentDeliveryRule> contentDeliveryRules;
    /**
     * <p>
     * How long, in days, dataset contents are kept for the dataset.
     * </p>
     */
    private RetentionPeriod retentionPeriod;
    /**
     * <p>
     * Optional. How many versions of dataset contents are kept. If not specified or set to null, only the latest
     * version plus the latest succeeded version (if they are different) are kept for the time period specified by the
     * <code>retentionPeriod</code> parameter. For more information, see <a href=
     * "https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions"
     * >Keeping Multiple Versions of AWS IoT Analytics Data Sets</a> in the <i>AWS IoT Analytics User Guide</i>.
     * </p>
     */
    private VersioningConfiguration versioningConfiguration;
    /**
     * <p>
     * A list of data rules that send notifications to Amazon CloudWatch, when data arrives late. To specify
     * <code>lateDataRules</code>, the dataset must use a <a
     * href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html">DeltaTimer</a> filter.
     * </p>
     */
    private java.util.List<LateDataRule> lateDataRules;

    /**
     * <p>
     * The name of the data set to update.
     * </p>
     * 
     * @param datasetName
     *        The name of the data set to update.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the data set to update.
     * </p>
     * 
     * @return The name of the data set to update.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the data set to update.
     * </p>
     * 
     * @param datasetName
     *        The name of the data set to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * A list of <code>DatasetAction</code> objects.
     * </p>
     * 
     * @return A list of <code>DatasetAction</code> objects.
     */

    public java.util.List<DatasetAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * A list of <code>DatasetAction</code> objects.
     * </p>
     * 
     * @param actions
     *        A list of <code>DatasetAction</code> objects.
     */

    public void setActions(java.util.Collection<DatasetAction> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<DatasetAction>(actions);
    }

    /**
     * <p>
     * A list of <code>DatasetAction</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        A list of <code>DatasetAction</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withActions(DatasetAction... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<DatasetAction>(actions.length));
        }
        for (DatasetAction ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DatasetAction</code> objects.
     * </p>
     * 
     * @param actions
     *        A list of <code>DatasetAction</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withActions(java.util.Collection<DatasetAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * A list of <code>DatasetTrigger</code> objects. The list can be empty or can contain up to five
     * <code>DatasetTrigger</code> objects.
     * </p>
     * 
     * @return A list of <code>DatasetTrigger</code> objects. The list can be empty or can contain up to five
     *         <code>DatasetTrigger</code> objects.
     */

    public java.util.List<DatasetTrigger> getTriggers() {
        return triggers;
    }

    /**
     * <p>
     * A list of <code>DatasetTrigger</code> objects. The list can be empty or can contain up to five
     * <code>DatasetTrigger</code> objects.
     * </p>
     * 
     * @param triggers
     *        A list of <code>DatasetTrigger</code> objects. The list can be empty or can contain up to five
     *        <code>DatasetTrigger</code> objects.
     */

    public void setTriggers(java.util.Collection<DatasetTrigger> triggers) {
        if (triggers == null) {
            this.triggers = null;
            return;
        }

        this.triggers = new java.util.ArrayList<DatasetTrigger>(triggers);
    }

    /**
     * <p>
     * A list of <code>DatasetTrigger</code> objects. The list can be empty or can contain up to five
     * <code>DatasetTrigger</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTriggers(java.util.Collection)} or {@link #withTriggers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param triggers
     *        A list of <code>DatasetTrigger</code> objects. The list can be empty or can contain up to five
     *        <code>DatasetTrigger</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withTriggers(DatasetTrigger... triggers) {
        if (this.triggers == null) {
            setTriggers(new java.util.ArrayList<DatasetTrigger>(triggers.length));
        }
        for (DatasetTrigger ele : triggers) {
            this.triggers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DatasetTrigger</code> objects. The list can be empty or can contain up to five
     * <code>DatasetTrigger</code> objects.
     * </p>
     * 
     * @param triggers
     *        A list of <code>DatasetTrigger</code> objects. The list can be empty or can contain up to five
     *        <code>DatasetTrigger</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withTriggers(java.util.Collection<DatasetTrigger> triggers) {
        setTriggers(triggers);
        return this;
    }

    /**
     * <p>
     * When dataset contents are created, they are delivered to destinations specified here.
     * </p>
     * 
     * @return When dataset contents are created, they are delivered to destinations specified here.
     */

    public java.util.List<DatasetContentDeliveryRule> getContentDeliveryRules() {
        return contentDeliveryRules;
    }

    /**
     * <p>
     * When dataset contents are created, they are delivered to destinations specified here.
     * </p>
     * 
     * @param contentDeliveryRules
     *        When dataset contents are created, they are delivered to destinations specified here.
     */

    public void setContentDeliveryRules(java.util.Collection<DatasetContentDeliveryRule> contentDeliveryRules) {
        if (contentDeliveryRules == null) {
            this.contentDeliveryRules = null;
            return;
        }

        this.contentDeliveryRules = new java.util.ArrayList<DatasetContentDeliveryRule>(contentDeliveryRules);
    }

    /**
     * <p>
     * When dataset contents are created, they are delivered to destinations specified here.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContentDeliveryRules(java.util.Collection)} or {@link #withContentDeliveryRules(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param contentDeliveryRules
     *        When dataset contents are created, they are delivered to destinations specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withContentDeliveryRules(DatasetContentDeliveryRule... contentDeliveryRules) {
        if (this.contentDeliveryRules == null) {
            setContentDeliveryRules(new java.util.ArrayList<DatasetContentDeliveryRule>(contentDeliveryRules.length));
        }
        for (DatasetContentDeliveryRule ele : contentDeliveryRules) {
            this.contentDeliveryRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * When dataset contents are created, they are delivered to destinations specified here.
     * </p>
     * 
     * @param contentDeliveryRules
     *        When dataset contents are created, they are delivered to destinations specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withContentDeliveryRules(java.util.Collection<DatasetContentDeliveryRule> contentDeliveryRules) {
        setContentDeliveryRules(contentDeliveryRules);
        return this;
    }

    /**
     * <p>
     * How long, in days, dataset contents are kept for the dataset.
     * </p>
     * 
     * @param retentionPeriod
     *        How long, in days, dataset contents are kept for the dataset.
     */

    public void setRetentionPeriod(RetentionPeriod retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * How long, in days, dataset contents are kept for the dataset.
     * </p>
     * 
     * @return How long, in days, dataset contents are kept for the dataset.
     */

    public RetentionPeriod getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * How long, in days, dataset contents are kept for the dataset.
     * </p>
     * 
     * @param retentionPeriod
     *        How long, in days, dataset contents are kept for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withRetentionPeriod(RetentionPeriod retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * Optional. How many versions of dataset contents are kept. If not specified or set to null, only the latest
     * version plus the latest succeeded version (if they are different) are kept for the time period specified by the
     * <code>retentionPeriod</code> parameter. For more information, see <a href=
     * "https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions"
     * >Keeping Multiple Versions of AWS IoT Analytics Data Sets</a> in the <i>AWS IoT Analytics User Guide</i>.
     * </p>
     * 
     * @param versioningConfiguration
     *        Optional. How many versions of dataset contents are kept. If not specified or set to null, only the latest
     *        version plus the latest succeeded version (if they are different) are kept for the time period specified
     *        by the <code>retentionPeriod</code> parameter. For more information, see <a href=
     *        "https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions"
     *        >Keeping Multiple Versions of AWS IoT Analytics Data Sets</a> in the <i>AWS IoT Analytics User Guide</i>.
     */

    public void setVersioningConfiguration(VersioningConfiguration versioningConfiguration) {
        this.versioningConfiguration = versioningConfiguration;
    }

    /**
     * <p>
     * Optional. How many versions of dataset contents are kept. If not specified or set to null, only the latest
     * version plus the latest succeeded version (if they are different) are kept for the time period specified by the
     * <code>retentionPeriod</code> parameter. For more information, see <a href=
     * "https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions"
     * >Keeping Multiple Versions of AWS IoT Analytics Data Sets</a> in the <i>AWS IoT Analytics User Guide</i>.
     * </p>
     * 
     * @return Optional. How many versions of dataset contents are kept. If not specified or set to null, only the
     *         latest version plus the latest succeeded version (if they are different) are kept for the time period
     *         specified by the <code>retentionPeriod</code> parameter. For more information, see <a href=
     *         "https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions"
     *         >Keeping Multiple Versions of AWS IoT Analytics Data Sets</a> in the <i>AWS IoT Analytics User Guide</i>.
     */

    public VersioningConfiguration getVersioningConfiguration() {
        return this.versioningConfiguration;
    }

    /**
     * <p>
     * Optional. How many versions of dataset contents are kept. If not specified or set to null, only the latest
     * version plus the latest succeeded version (if they are different) are kept for the time period specified by the
     * <code>retentionPeriod</code> parameter. For more information, see <a href=
     * "https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions"
     * >Keeping Multiple Versions of AWS IoT Analytics Data Sets</a> in the <i>AWS IoT Analytics User Guide</i>.
     * </p>
     * 
     * @param versioningConfiguration
     *        Optional. How many versions of dataset contents are kept. If not specified or set to null, only the latest
     *        version plus the latest succeeded version (if they are different) are kept for the time period specified
     *        by the <code>retentionPeriod</code> parameter. For more information, see <a href=
     *        "https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions"
     *        >Keeping Multiple Versions of AWS IoT Analytics Data Sets</a> in the <i>AWS IoT Analytics User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withVersioningConfiguration(VersioningConfiguration versioningConfiguration) {
        setVersioningConfiguration(versioningConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of data rules that send notifications to Amazon CloudWatch, when data arrives late. To specify
     * <code>lateDataRules</code>, the dataset must use a <a
     * href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html">DeltaTimer</a> filter.
     * </p>
     * 
     * @return A list of data rules that send notifications to Amazon CloudWatch, when data arrives late. To specify
     *         <code>lateDataRules</code>, the dataset must use a <a
     *         href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html">DeltaTimer</a>
     *         filter.
     */

    public java.util.List<LateDataRule> getLateDataRules() {
        return lateDataRules;
    }

    /**
     * <p>
     * A list of data rules that send notifications to Amazon CloudWatch, when data arrives late. To specify
     * <code>lateDataRules</code>, the dataset must use a <a
     * href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html">DeltaTimer</a> filter.
     * </p>
     * 
     * @param lateDataRules
     *        A list of data rules that send notifications to Amazon CloudWatch, when data arrives late. To specify
     *        <code>lateDataRules</code>, the dataset must use a <a
     *        href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html">DeltaTimer</a>
     *        filter.
     */

    public void setLateDataRules(java.util.Collection<LateDataRule> lateDataRules) {
        if (lateDataRules == null) {
            this.lateDataRules = null;
            return;
        }

        this.lateDataRules = new java.util.ArrayList<LateDataRule>(lateDataRules);
    }

    /**
     * <p>
     * A list of data rules that send notifications to Amazon CloudWatch, when data arrives late. To specify
     * <code>lateDataRules</code>, the dataset must use a <a
     * href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html">DeltaTimer</a> filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLateDataRules(java.util.Collection)} or {@link #withLateDataRules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param lateDataRules
     *        A list of data rules that send notifications to Amazon CloudWatch, when data arrives late. To specify
     *        <code>lateDataRules</code>, the dataset must use a <a
     *        href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html">DeltaTimer</a>
     *        filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withLateDataRules(LateDataRule... lateDataRules) {
        if (this.lateDataRules == null) {
            setLateDataRules(new java.util.ArrayList<LateDataRule>(lateDataRules.length));
        }
        for (LateDataRule ele : lateDataRules) {
            this.lateDataRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of data rules that send notifications to Amazon CloudWatch, when data arrives late. To specify
     * <code>lateDataRules</code>, the dataset must use a <a
     * href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html">DeltaTimer</a> filter.
     * </p>
     * 
     * @param lateDataRules
     *        A list of data rules that send notifications to Amazon CloudWatch, when data arrives late. To specify
     *        <code>lateDataRules</code>, the dataset must use a <a
     *        href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html">DeltaTimer</a>
     *        filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withLateDataRules(java.util.Collection<LateDataRule> lateDataRules) {
        setLateDataRules(lateDataRules);
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
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getTriggers() != null)
            sb.append("Triggers: ").append(getTriggers()).append(",");
        if (getContentDeliveryRules() != null)
            sb.append("ContentDeliveryRules: ").append(getContentDeliveryRules()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getVersioningConfiguration() != null)
            sb.append("VersioningConfiguration: ").append(getVersioningConfiguration()).append(",");
        if (getLateDataRules() != null)
            sb.append("LateDataRules: ").append(getLateDataRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDatasetRequest == false)
            return false;
        UpdateDatasetRequest other = (UpdateDatasetRequest) obj;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getTriggers() == null ^ this.getTriggers() == null)
            return false;
        if (other.getTriggers() != null && other.getTriggers().equals(this.getTriggers()) == false)
            return false;
        if (other.getContentDeliveryRules() == null ^ this.getContentDeliveryRules() == null)
            return false;
        if (other.getContentDeliveryRules() != null && other.getContentDeliveryRules().equals(this.getContentDeliveryRules()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getVersioningConfiguration() == null ^ this.getVersioningConfiguration() == null)
            return false;
        if (other.getVersioningConfiguration() != null && other.getVersioningConfiguration().equals(this.getVersioningConfiguration()) == false)
            return false;
        if (other.getLateDataRules() == null ^ this.getLateDataRules() == null)
            return false;
        if (other.getLateDataRules() != null && other.getLateDataRules().equals(this.getLateDataRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getTriggers() == null) ? 0 : getTriggers().hashCode());
        hashCode = prime * hashCode + ((getContentDeliveryRules() == null) ? 0 : getContentDeliveryRules().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getVersioningConfiguration() == null) ? 0 : getVersioningConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLateDataRules() == null) ? 0 : getLateDataRules().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDatasetRequest clone() {
        return (UpdateDatasetRequest) super.clone();
    }

}

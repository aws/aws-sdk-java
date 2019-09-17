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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the data set.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * A list of actions that create the data set contents.
     * </p>
     */
    private java.util.List<DatasetAction> actions;
    /**
     * <p>
     * A list of triggers. A trigger causes data set contents to be populated at a specified time interval or when
     * another data set's contents are created. The list of triggers can be empty or contain up to five
     * <b>DataSetTrigger</b> objects.
     * </p>
     */
    private java.util.List<DatasetTrigger> triggers;
    /**
     * <p>
     * When data set contents are created they are delivered to destinations specified here.
     * </p>
     */
    private java.util.List<DatasetContentDeliveryRule> contentDeliveryRules;
    /**
     * <p>
     * [Optional] How long, in days, versions of data set contents are kept for the data set. If not specified or set to
     * null, versions of data set contents are retained for at most 90 days. The number of versions of data set contents
     * retained is determined by the <code>versioningConfiguration</code> parameter. (For more information, see
     * https://docs
     * .aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * </p>
     */
    private RetentionPeriod retentionPeriod;
    /**
     * <p>
     * [Optional] How many versions of data set contents are kept. If not specified or set to null, only the latest
     * version plus the latest succeeded version (if they are different) are kept for the time period specified by the
     * "retentionPeriod" parameter. (For more information, see
     * https://docs.aws.amazon.com/iotanalytics/latest/userguide/
     * getting-started.html#aws-iot-analytics-dataset-versions)
     * </p>
     */
    private VersioningConfiguration versioningConfiguration;
    /**
     * <p>
     * Metadata which can be used to manage the data set.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @param datasetName
     *        The name of the data set.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @return The name of the data set.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @param datasetName
     *        The name of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * A list of actions that create the data set contents.
     * </p>
     * 
     * @return A list of actions that create the data set contents.
     */

    public java.util.List<DatasetAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * A list of actions that create the data set contents.
     * </p>
     * 
     * @param actions
     *        A list of actions that create the data set contents.
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
     * A list of actions that create the data set contents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        A list of actions that create the data set contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withActions(DatasetAction... actions) {
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
     * A list of actions that create the data set contents.
     * </p>
     * 
     * @param actions
     *        A list of actions that create the data set contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withActions(java.util.Collection<DatasetAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * A list of triggers. A trigger causes data set contents to be populated at a specified time interval or when
     * another data set's contents are created. The list of triggers can be empty or contain up to five
     * <b>DataSetTrigger</b> objects.
     * </p>
     * 
     * @return A list of triggers. A trigger causes data set contents to be populated at a specified time interval or
     *         when another data set's contents are created. The list of triggers can be empty or contain up to five
     *         <b>DataSetTrigger</b> objects.
     */

    public java.util.List<DatasetTrigger> getTriggers() {
        return triggers;
    }

    /**
     * <p>
     * A list of triggers. A trigger causes data set contents to be populated at a specified time interval or when
     * another data set's contents are created. The list of triggers can be empty or contain up to five
     * <b>DataSetTrigger</b> objects.
     * </p>
     * 
     * @param triggers
     *        A list of triggers. A trigger causes data set contents to be populated at a specified time interval or
     *        when another data set's contents are created. The list of triggers can be empty or contain up to five
     *        <b>DataSetTrigger</b> objects.
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
     * A list of triggers. A trigger causes data set contents to be populated at a specified time interval or when
     * another data set's contents are created. The list of triggers can be empty or contain up to five
     * <b>DataSetTrigger</b> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTriggers(java.util.Collection)} or {@link #withTriggers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param triggers
     *        A list of triggers. A trigger causes data set contents to be populated at a specified time interval or
     *        when another data set's contents are created. The list of triggers can be empty or contain up to five
     *        <b>DataSetTrigger</b> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withTriggers(DatasetTrigger... triggers) {
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
     * A list of triggers. A trigger causes data set contents to be populated at a specified time interval or when
     * another data set's contents are created. The list of triggers can be empty or contain up to five
     * <b>DataSetTrigger</b> objects.
     * </p>
     * 
     * @param triggers
     *        A list of triggers. A trigger causes data set contents to be populated at a specified time interval or
     *        when another data set's contents are created. The list of triggers can be empty or contain up to five
     *        <b>DataSetTrigger</b> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withTriggers(java.util.Collection<DatasetTrigger> triggers) {
        setTriggers(triggers);
        return this;
    }

    /**
     * <p>
     * When data set contents are created they are delivered to destinations specified here.
     * </p>
     * 
     * @return When data set contents are created they are delivered to destinations specified here.
     */

    public java.util.List<DatasetContentDeliveryRule> getContentDeliveryRules() {
        return contentDeliveryRules;
    }

    /**
     * <p>
     * When data set contents are created they are delivered to destinations specified here.
     * </p>
     * 
     * @param contentDeliveryRules
     *        When data set contents are created they are delivered to destinations specified here.
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
     * When data set contents are created they are delivered to destinations specified here.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContentDeliveryRules(java.util.Collection)} or {@link #withContentDeliveryRules(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param contentDeliveryRules
     *        When data set contents are created they are delivered to destinations specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withContentDeliveryRules(DatasetContentDeliveryRule... contentDeliveryRules) {
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
     * When data set contents are created they are delivered to destinations specified here.
     * </p>
     * 
     * @param contentDeliveryRules
     *        When data set contents are created they are delivered to destinations specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withContentDeliveryRules(java.util.Collection<DatasetContentDeliveryRule> contentDeliveryRules) {
        setContentDeliveryRules(contentDeliveryRules);
        return this;
    }

    /**
     * <p>
     * [Optional] How long, in days, versions of data set contents are kept for the data set. If not specified or set to
     * null, versions of data set contents are retained for at most 90 days. The number of versions of data set contents
     * retained is determined by the <code>versioningConfiguration</code> parameter. (For more information, see
     * https://docs
     * .aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * </p>
     * 
     * @param retentionPeriod
     *        [Optional] How long, in days, versions of data set contents are kept for the data set. If not specified or
     *        set to null, versions of data set contents are retained for at most 90 days. The number of versions of
     *        data set contents retained is determined by the <code>versioningConfiguration</code> parameter. (For more
     *        information, see
     *        https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics
     *        -dataset-versions)
     */

    public void setRetentionPeriod(RetentionPeriod retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * [Optional] How long, in days, versions of data set contents are kept for the data set. If not specified or set to
     * null, versions of data set contents are retained for at most 90 days. The number of versions of data set contents
     * retained is determined by the <code>versioningConfiguration</code> parameter. (For more information, see
     * https://docs
     * .aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * </p>
     * 
     * @return [Optional] How long, in days, versions of data set contents are kept for the data set. If not specified
     *         or set to null, versions of data set contents are retained for at most 90 days. The number of versions of
     *         data set contents retained is determined by the <code>versioningConfiguration</code> parameter. (For more
     *         information, see
     *         https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics
     *         -dataset-versions)
     */

    public RetentionPeriod getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * [Optional] How long, in days, versions of data set contents are kept for the data set. If not specified or set to
     * null, versions of data set contents are retained for at most 90 days. The number of versions of data set contents
     * retained is determined by the <code>versioningConfiguration</code> parameter. (For more information, see
     * https://docs
     * .aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * </p>
     * 
     * @param retentionPeriod
     *        [Optional] How long, in days, versions of data set contents are kept for the data set. If not specified or
     *        set to null, versions of data set contents are retained for at most 90 days. The number of versions of
     *        data set contents retained is determined by the <code>versioningConfiguration</code> parameter. (For more
     *        information, see
     *        https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics
     *        -dataset-versions)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withRetentionPeriod(RetentionPeriod retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * [Optional] How many versions of data set contents are kept. If not specified or set to null, only the latest
     * version plus the latest succeeded version (if they are different) are kept for the time period specified by the
     * "retentionPeriod" parameter. (For more information, see
     * https://docs.aws.amazon.com/iotanalytics/latest/userguide/
     * getting-started.html#aws-iot-analytics-dataset-versions)
     * </p>
     * 
     * @param versioningConfiguration
     *        [Optional] How many versions of data set contents are kept. If not specified or set to null, only the
     *        latest version plus the latest succeeded version (if they are different) are kept for the time period
     *        specified by the "retentionPeriod" parameter. (For more information, see
     *        https://docs.aws.amazon.com/iotanalytics
     *        /latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     */

    public void setVersioningConfiguration(VersioningConfiguration versioningConfiguration) {
        this.versioningConfiguration = versioningConfiguration;
    }

    /**
     * <p>
     * [Optional] How many versions of data set contents are kept. If not specified or set to null, only the latest
     * version plus the latest succeeded version (if they are different) are kept for the time period specified by the
     * "retentionPeriod" parameter. (For more information, see
     * https://docs.aws.amazon.com/iotanalytics/latest/userguide/
     * getting-started.html#aws-iot-analytics-dataset-versions)
     * </p>
     * 
     * @return [Optional] How many versions of data set contents are kept. If not specified or set to null, only the
     *         latest version plus the latest succeeded version (if they are different) are kept for the time period
     *         specified by the "retentionPeriod" parameter. (For more information, see
     *         https://docs.aws.amazon.com/iotanalytics
     *         /latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     */

    public VersioningConfiguration getVersioningConfiguration() {
        return this.versioningConfiguration;
    }

    /**
     * <p>
     * [Optional] How many versions of data set contents are kept. If not specified or set to null, only the latest
     * version plus the latest succeeded version (if they are different) are kept for the time period specified by the
     * "retentionPeriod" parameter. (For more information, see
     * https://docs.aws.amazon.com/iotanalytics/latest/userguide/
     * getting-started.html#aws-iot-analytics-dataset-versions)
     * </p>
     * 
     * @param versioningConfiguration
     *        [Optional] How many versions of data set contents are kept. If not specified or set to null, only the
     *        latest version plus the latest succeeded version (if they are different) are kept for the time period
     *        specified by the "retentionPeriod" parameter. (For more information, see
     *        https://docs.aws.amazon.com/iotanalytics
     *        /latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withVersioningConfiguration(VersioningConfiguration versioningConfiguration) {
        setVersioningConfiguration(versioningConfiguration);
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the data set.
     * </p>
     * 
     * @return Metadata which can be used to manage the data set.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the data set.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the data set.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage the data set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the data set.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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

        if (obj instanceof CreateDatasetRequest == false)
            return false;
        CreateDatasetRequest other = (CreateDatasetRequest) obj;
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

        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getTriggers() == null) ? 0 : getTriggers().hashCode());
        hashCode = prime * hashCode + ((getContentDeliveryRules() == null) ? 0 : getContentDeliveryRules().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getVersioningConfiguration() == null) ? 0 : getVersioningConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetRequest clone() {
        return (CreateDatasetRequest) super.clone();
    }

}

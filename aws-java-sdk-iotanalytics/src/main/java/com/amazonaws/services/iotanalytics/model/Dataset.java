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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a data set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/Dataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Dataset implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data set.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the data set.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The "DatasetAction" objects that automatically create the data set contents.
     * </p>
     */
    private java.util.List<DatasetAction> actions;
    /**
     * <p>
     * The "DatasetTrigger" objects that specify when the data set is automatically updated.
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
     * The status of the data set.
     * </p>
     */
    private String status;
    /**
     * <p>
     * When the data set was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time the data set was updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * [Optional] How long, in days, message data is kept for the data set.
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
     * The name of the data set.
     * </p>
     * 
     * @param name
     *        The name of the data set.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @return The name of the data set.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @param name
     *        The name of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the data set.
     * </p>
     * 
     * @param arn
     *        The ARN of the data set.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the data set.
     * </p>
     * 
     * @return The ARN of the data set.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the data set.
     * </p>
     * 
     * @param arn
     *        The ARN of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The "DatasetAction" objects that automatically create the data set contents.
     * </p>
     * 
     * @return The "DatasetAction" objects that automatically create the data set contents.
     */

    public java.util.List<DatasetAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * The "DatasetAction" objects that automatically create the data set contents.
     * </p>
     * 
     * @param actions
     *        The "DatasetAction" objects that automatically create the data set contents.
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
     * The "DatasetAction" objects that automatically create the data set contents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The "DatasetAction" objects that automatically create the data set contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset withActions(DatasetAction... actions) {
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
     * The "DatasetAction" objects that automatically create the data set contents.
     * </p>
     * 
     * @param actions
     *        The "DatasetAction" objects that automatically create the data set contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset withActions(java.util.Collection<DatasetAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The "DatasetTrigger" objects that specify when the data set is automatically updated.
     * </p>
     * 
     * @return The "DatasetTrigger" objects that specify when the data set is automatically updated.
     */

    public java.util.List<DatasetTrigger> getTriggers() {
        return triggers;
    }

    /**
     * <p>
     * The "DatasetTrigger" objects that specify when the data set is automatically updated.
     * </p>
     * 
     * @param triggers
     *        The "DatasetTrigger" objects that specify when the data set is automatically updated.
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
     * The "DatasetTrigger" objects that specify when the data set is automatically updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTriggers(java.util.Collection)} or {@link #withTriggers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param triggers
     *        The "DatasetTrigger" objects that specify when the data set is automatically updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset withTriggers(DatasetTrigger... triggers) {
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
     * The "DatasetTrigger" objects that specify when the data set is automatically updated.
     * </p>
     * 
     * @param triggers
     *        The "DatasetTrigger" objects that specify when the data set is automatically updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset withTriggers(java.util.Collection<DatasetTrigger> triggers) {
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

    public Dataset withContentDeliveryRules(DatasetContentDeliveryRule... contentDeliveryRules) {
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

    public Dataset withContentDeliveryRules(java.util.Collection<DatasetContentDeliveryRule> contentDeliveryRules) {
        setContentDeliveryRules(contentDeliveryRules);
        return this;
    }

    /**
     * <p>
     * The status of the data set.
     * </p>
     * 
     * @param status
     *        The status of the data set.
     * @see DatasetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the data set.
     * </p>
     * 
     * @return The status of the data set.
     * @see DatasetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the data set.
     * </p>
     * 
     * @param status
     *        The status of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatus
     */

    public Dataset withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the data set.
     * </p>
     * 
     * @param status
     *        The status of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatus
     */

    public Dataset withStatus(DatasetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * When the data set was created.
     * </p>
     * 
     * @param creationTime
     *        When the data set was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the data set was created.
     * </p>
     * 
     * @return When the data set was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the data set was created.
     * </p>
     * 
     * @param creationTime
     *        When the data set was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time the data set was updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time the data set was updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last time the data set was updated.
     * </p>
     * 
     * @return The last time the data set was updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The last time the data set was updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time the data set was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * [Optional] How long, in days, message data is kept for the data set.
     * </p>
     * 
     * @param retentionPeriod
     *        [Optional] How long, in days, message data is kept for the data set.
     */

    public void setRetentionPeriod(RetentionPeriod retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * [Optional] How long, in days, message data is kept for the data set.
     * </p>
     * 
     * @return [Optional] How long, in days, message data is kept for the data set.
     */

    public RetentionPeriod getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * [Optional] How long, in days, message data is kept for the data set.
     * </p>
     * 
     * @param retentionPeriod
     *        [Optional] How long, in days, message data is kept for the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset withRetentionPeriod(RetentionPeriod retentionPeriod) {
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

    public Dataset withVersioningConfiguration(VersioningConfiguration versioningConfiguration) {
        setVersioningConfiguration(versioningConfiguration);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getTriggers() != null)
            sb.append("Triggers: ").append(getTriggers()).append(",");
        if (getContentDeliveryRules() != null)
            sb.append("ContentDeliveryRules: ").append(getContentDeliveryRules()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getVersioningConfiguration() != null)
            sb.append("VersioningConfiguration: ").append(getVersioningConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Dataset == false)
            return false;
        Dataset other = (Dataset) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getVersioningConfiguration() == null ^ this.getVersioningConfiguration() == null)
            return false;
        if (other.getVersioningConfiguration() != null && other.getVersioningConfiguration().equals(this.getVersioningConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getTriggers() == null) ? 0 : getTriggers().hashCode());
        hashCode = prime * hashCode + ((getContentDeliveryRules() == null) ? 0 : getContentDeliveryRules().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getVersioningConfiguration() == null) ? 0 : getVersioningConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public Dataset clone() {
        try {
            return (Dataset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatasetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

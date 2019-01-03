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
 * A summary of information about a data set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DatasetSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data set.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The status of the data set.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time the data set was created.
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
     * A list of triggers. A trigger causes data set content to be populated at a specified time interval or when
     * another data set is populated. The list of triggers can be empty or contain up to five DataSetTrigger objects
     * </p>
     */
    private java.util.List<DatasetTrigger> triggers;
    /**
     * <p>
     * A list of "DataActionSummary" objects.
     * </p>
     */
    private java.util.List<DatasetActionSummary> actions;

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

    public DatasetSummary withDatasetName(String datasetName) {
        setDatasetName(datasetName);
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

    public DatasetSummary withStatus(String status) {
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

    public DatasetSummary withStatus(DatasetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time the data set was created.
     * </p>
     * 
     * @param creationTime
     *        The time the data set was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the data set was created.
     * </p>
     * 
     * @return The time the data set was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the data set was created.
     * </p>
     * 
     * @param creationTime
     *        The time the data set was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetSummary withCreationTime(java.util.Date creationTime) {
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

    public DatasetSummary withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * A list of triggers. A trigger causes data set content to be populated at a specified time interval or when
     * another data set is populated. The list of triggers can be empty or contain up to five DataSetTrigger objects
     * </p>
     * 
     * @return A list of triggers. A trigger causes data set content to be populated at a specified time interval or
     *         when another data set is populated. The list of triggers can be empty or contain up to five
     *         DataSetTrigger objects
     */

    public java.util.List<DatasetTrigger> getTriggers() {
        return triggers;
    }

    /**
     * <p>
     * A list of triggers. A trigger causes data set content to be populated at a specified time interval or when
     * another data set is populated. The list of triggers can be empty or contain up to five DataSetTrigger objects
     * </p>
     * 
     * @param triggers
     *        A list of triggers. A trigger causes data set content to be populated at a specified time interval or when
     *        another data set is populated. The list of triggers can be empty or contain up to five DataSetTrigger
     *        objects
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
     * A list of triggers. A trigger causes data set content to be populated at a specified time interval or when
     * another data set is populated. The list of triggers can be empty or contain up to five DataSetTrigger objects
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTriggers(java.util.Collection)} or {@link #withTriggers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param triggers
     *        A list of triggers. A trigger causes data set content to be populated at a specified time interval or when
     *        another data set is populated. The list of triggers can be empty or contain up to five DataSetTrigger
     *        objects
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetSummary withTriggers(DatasetTrigger... triggers) {
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
     * A list of triggers. A trigger causes data set content to be populated at a specified time interval or when
     * another data set is populated. The list of triggers can be empty or contain up to five DataSetTrigger objects
     * </p>
     * 
     * @param triggers
     *        A list of triggers. A trigger causes data set content to be populated at a specified time interval or when
     *        another data set is populated. The list of triggers can be empty or contain up to five DataSetTrigger
     *        objects
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetSummary withTriggers(java.util.Collection<DatasetTrigger> triggers) {
        setTriggers(triggers);
        return this;
    }

    /**
     * <p>
     * A list of "DataActionSummary" objects.
     * </p>
     * 
     * @return A list of "DataActionSummary" objects.
     */

    public java.util.List<DatasetActionSummary> getActions() {
        return actions;
    }

    /**
     * <p>
     * A list of "DataActionSummary" objects.
     * </p>
     * 
     * @param actions
     *        A list of "DataActionSummary" objects.
     */

    public void setActions(java.util.Collection<DatasetActionSummary> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<DatasetActionSummary>(actions);
    }

    /**
     * <p>
     * A list of "DataActionSummary" objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        A list of "DataActionSummary" objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetSummary withActions(DatasetActionSummary... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<DatasetActionSummary>(actions.length));
        }
        for (DatasetActionSummary ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of "DataActionSummary" objects.
     * </p>
     * 
     * @param actions
     *        A list of "DataActionSummary" objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetSummary withActions(java.util.Collection<DatasetActionSummary> actions) {
        setActions(actions);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getTriggers() != null)
            sb.append("Triggers: ").append(getTriggers()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetSummary == false)
            return false;
        DatasetSummary other = (DatasetSummary) obj;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
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
        if (other.getTriggers() == null ^ this.getTriggers() == null)
            return false;
        if (other.getTriggers() != null && other.getTriggers().equals(this.getTriggers()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getTriggers() == null) ? 0 : getTriggers().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public DatasetSummary clone() {
        try {
            return (DatasetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatasetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

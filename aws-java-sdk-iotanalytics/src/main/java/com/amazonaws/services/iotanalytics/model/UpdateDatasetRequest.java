/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * A list of "DatasetAction" objects. Only one action is supported at this time.
     * </p>
     */
    private java.util.List<DatasetAction> actions;
    /**
     * <p>
     * A list of "DatasetTrigger" objects. The list can be empty or can contain up to five <b>DataSetTrigger</b>
     * objects.
     * </p>
     */
    private java.util.List<DatasetTrigger> triggers;

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
     * A list of "DatasetAction" objects. Only one action is supported at this time.
     * </p>
     * 
     * @return A list of "DatasetAction" objects. Only one action is supported at this time.
     */

    public java.util.List<DatasetAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * A list of "DatasetAction" objects. Only one action is supported at this time.
     * </p>
     * 
     * @param actions
     *        A list of "DatasetAction" objects. Only one action is supported at this time.
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
     * A list of "DatasetAction" objects. Only one action is supported at this time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        A list of "DatasetAction" objects. Only one action is supported at this time.
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
     * A list of "DatasetAction" objects. Only one action is supported at this time.
     * </p>
     * 
     * @param actions
     *        A list of "DatasetAction" objects. Only one action is supported at this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withActions(java.util.Collection<DatasetAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * A list of "DatasetTrigger" objects. The list can be empty or can contain up to five <b>DataSetTrigger</b>
     * objects.
     * </p>
     * 
     * @return A list of "DatasetTrigger" objects. The list can be empty or can contain up to five <b>DataSetTrigger</b>
     *         objects.
     */

    public java.util.List<DatasetTrigger> getTriggers() {
        return triggers;
    }

    /**
     * <p>
     * A list of "DatasetTrigger" objects. The list can be empty or can contain up to five <b>DataSetTrigger</b>
     * objects.
     * </p>
     * 
     * @param triggers
     *        A list of "DatasetTrigger" objects. The list can be empty or can contain up to five <b>DataSetTrigger</b>
     *        objects.
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
     * A list of "DatasetTrigger" objects. The list can be empty or can contain up to five <b>DataSetTrigger</b>
     * objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTriggers(java.util.Collection)} or {@link #withTriggers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param triggers
     *        A list of "DatasetTrigger" objects. The list can be empty or can contain up to five <b>DataSetTrigger</b>
     *        objects.
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
     * A list of "DatasetTrigger" objects. The list can be empty or can contain up to five <b>DataSetTrigger</b>
     * objects.
     * </p>
     * 
     * @param triggers
     *        A list of "DatasetTrigger" objects. The list can be empty or can contain up to five <b>DataSetTrigger</b>
     *        objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withTriggers(java.util.Collection<DatasetTrigger> triggers) {
        setTriggers(triggers);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Triggers: ").append(getTriggers());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getTriggers() == null) ? 0 : getTriggers().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDatasetRequest clone() {
        return (UpdateDatasetRequest) super.clone();
    }

}

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
 * The "DatasetTrigger" that specifies when the data set is automatically updated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DatasetTrigger" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetTrigger implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The "Schedule" when the trigger is initiated.
     * </p>
     */
    private Schedule schedule;
    /**
     * <p>
     * The data set whose content creation triggers the creation of this data set's contents.
     * </p>
     */
    private TriggeringDataset dataset;

    /**
     * <p>
     * The "Schedule" when the trigger is initiated.
     * </p>
     * 
     * @param schedule
     *        The "Schedule" when the trigger is initiated.
     */

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The "Schedule" when the trigger is initiated.
     * </p>
     * 
     * @return The "Schedule" when the trigger is initiated.
     */

    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The "Schedule" when the trigger is initiated.
     * </p>
     * 
     * @param schedule
     *        The "Schedule" when the trigger is initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetTrigger withSchedule(Schedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The data set whose content creation triggers the creation of this data set's contents.
     * </p>
     * 
     * @param dataset
     *        The data set whose content creation triggers the creation of this data set's contents.
     */

    public void setDataset(TriggeringDataset dataset) {
        this.dataset = dataset;
    }

    /**
     * <p>
     * The data set whose content creation triggers the creation of this data set's contents.
     * </p>
     * 
     * @return The data set whose content creation triggers the creation of this data set's contents.
     */

    public TriggeringDataset getDataset() {
        return this.dataset;
    }

    /**
     * <p>
     * The data set whose content creation triggers the creation of this data set's contents.
     * </p>
     * 
     * @param dataset
     *        The data set whose content creation triggers the creation of this data set's contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetTrigger withDataset(TriggeringDataset dataset) {
        setDataset(dataset);
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
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getDataset() != null)
            sb.append("Dataset: ").append(getDataset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetTrigger == false)
            return false;
        DatasetTrigger other = (DatasetTrigger) obj;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getDataset() == null ^ this.getDataset() == null)
            return false;
        if (other.getDataset() != null && other.getDataset().equals(this.getDataset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getDataset() == null) ? 0 : getDataset().hashCode());
        return hashCode;
    }

    @Override
    public DatasetTrigger clone() {
        try {
            return (DatasetTrigger) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatasetTriggerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

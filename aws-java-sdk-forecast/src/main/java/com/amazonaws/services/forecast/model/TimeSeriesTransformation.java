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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A transformation function is a pair of operations that select and modify the rows in a related time series. You
 * select the rows that you want with a condition operation and you modify the rows with a transformation operation. All
 * conditions are joined with an AND operation, meaning that all conditions must be true for the transformation to be
 * applied. Transformations are applied in the order that they are listed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/TimeSeriesTransformation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeSeriesTransformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of actions that define a time series and how it is transformed. These transformations create a new time
     * series that is used for the what-if analysis.
     * </p>
     */
    private Action action;
    /**
     * <p>
     * An array of conditions that define which members of the related time series are transformed.
     * </p>
     */
    private java.util.List<TimeSeriesCondition> timeSeriesConditions;

    /**
     * <p>
     * An array of actions that define a time series and how it is transformed. These transformations create a new time
     * series that is used for the what-if analysis.
     * </p>
     * 
     * @param action
     *        An array of actions that define a time series and how it is transformed. These transformations create a
     *        new time series that is used for the what-if analysis.
     */

    public void setAction(Action action) {
        this.action = action;
    }

    /**
     * <p>
     * An array of actions that define a time series and how it is transformed. These transformations create a new time
     * series that is used for the what-if analysis.
     * </p>
     * 
     * @return An array of actions that define a time series and how it is transformed. These transformations create a
     *         new time series that is used for the what-if analysis.
     */

    public Action getAction() {
        return this.action;
    }

    /**
     * <p>
     * An array of actions that define a time series and how it is transformed. These transformations create a new time
     * series that is used for the what-if analysis.
     * </p>
     * 
     * @param action
     *        An array of actions that define a time series and how it is transformed. These transformations create a
     *        new time series that is used for the what-if analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesTransformation withAction(Action action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * An array of conditions that define which members of the related time series are transformed.
     * </p>
     * 
     * @return An array of conditions that define which members of the related time series are transformed.
     */

    public java.util.List<TimeSeriesCondition> getTimeSeriesConditions() {
        return timeSeriesConditions;
    }

    /**
     * <p>
     * An array of conditions that define which members of the related time series are transformed.
     * </p>
     * 
     * @param timeSeriesConditions
     *        An array of conditions that define which members of the related time series are transformed.
     */

    public void setTimeSeriesConditions(java.util.Collection<TimeSeriesCondition> timeSeriesConditions) {
        if (timeSeriesConditions == null) {
            this.timeSeriesConditions = null;
            return;
        }

        this.timeSeriesConditions = new java.util.ArrayList<TimeSeriesCondition>(timeSeriesConditions);
    }

    /**
     * <p>
     * An array of conditions that define which members of the related time series are transformed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimeSeriesConditions(java.util.Collection)} or {@link #withTimeSeriesConditions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param timeSeriesConditions
     *        An array of conditions that define which members of the related time series are transformed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesTransformation withTimeSeriesConditions(TimeSeriesCondition... timeSeriesConditions) {
        if (this.timeSeriesConditions == null) {
            setTimeSeriesConditions(new java.util.ArrayList<TimeSeriesCondition>(timeSeriesConditions.length));
        }
        for (TimeSeriesCondition ele : timeSeriesConditions) {
            this.timeSeriesConditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of conditions that define which members of the related time series are transformed.
     * </p>
     * 
     * @param timeSeriesConditions
     *        An array of conditions that define which members of the related time series are transformed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesTransformation withTimeSeriesConditions(java.util.Collection<TimeSeriesCondition> timeSeriesConditions) {
        setTimeSeriesConditions(timeSeriesConditions);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getTimeSeriesConditions() != null)
            sb.append("TimeSeriesConditions: ").append(getTimeSeriesConditions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeSeriesTransformation == false)
            return false;
        TimeSeriesTransformation other = (TimeSeriesTransformation) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getTimeSeriesConditions() == null ^ this.getTimeSeriesConditions() == null)
            return false;
        if (other.getTimeSeriesConditions() != null && other.getTimeSeriesConditions().equals(this.getTimeSeriesConditions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getTimeSeriesConditions() == null) ? 0 : getTimeSeriesConditions().hashCode());
        return hashCode;
    }

    @Override
    public TimeSeriesTransformation clone() {
        try {
            return (TimeSeriesTransformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.TimeSeriesTransformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The name of the data and how often it should be pulled from the source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ScheduleConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start date for objects to import in the first flow run.
     * </p>
     */
    private String firstExecutionFrom;
    /**
     * <p>
     * The name of the object to pull from the data source.
     * </p>
     */
    private String object;
    /**
     * <p>
     * How often the data should be pulled from data source.
     * </p>
     */
    private String scheduleExpression;

    /**
     * <p>
     * The start date for objects to import in the first flow run.
     * </p>
     * 
     * @param firstExecutionFrom
     *        The start date for objects to import in the first flow run.
     */

    public void setFirstExecutionFrom(String firstExecutionFrom) {
        this.firstExecutionFrom = firstExecutionFrom;
    }

    /**
     * <p>
     * The start date for objects to import in the first flow run.
     * </p>
     * 
     * @return The start date for objects to import in the first flow run.
     */

    public String getFirstExecutionFrom() {
        return this.firstExecutionFrom;
    }

    /**
     * <p>
     * The start date for objects to import in the first flow run.
     * </p>
     * 
     * @param firstExecutionFrom
     *        The start date for objects to import in the first flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleConfiguration withFirstExecutionFrom(String firstExecutionFrom) {
        setFirstExecutionFrom(firstExecutionFrom);
        return this;
    }

    /**
     * <p>
     * The name of the object to pull from the data source.
     * </p>
     * 
     * @param object
     *        The name of the object to pull from the data source.
     */

    public void setObject(String object) {
        this.object = object;
    }

    /**
     * <p>
     * The name of the object to pull from the data source.
     * </p>
     * 
     * @return The name of the object to pull from the data source.
     */

    public String getObject() {
        return this.object;
    }

    /**
     * <p>
     * The name of the object to pull from the data source.
     * </p>
     * 
     * @param object
     *        The name of the object to pull from the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleConfiguration withObject(String object) {
        setObject(object);
        return this;
    }

    /**
     * <p>
     * How often the data should be pulled from data source.
     * </p>
     * 
     * @param scheduleExpression
     *        How often the data should be pulled from data source.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * How often the data should be pulled from data source.
     * </p>
     * 
     * @return How often the data should be pulled from data source.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * How often the data should be pulled from data source.
     * </p>
     * 
     * @param scheduleExpression
     *        How often the data should be pulled from data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleConfiguration withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
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
        if (getFirstExecutionFrom() != null)
            sb.append("FirstExecutionFrom: ").append(getFirstExecutionFrom()).append(",");
        if (getObject() != null)
            sb.append("Object: ").append(getObject()).append(",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: ").append(getScheduleExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleConfiguration == false)
            return false;
        ScheduleConfiguration other = (ScheduleConfiguration) obj;
        if (other.getFirstExecutionFrom() == null ^ this.getFirstExecutionFrom() == null)
            return false;
        if (other.getFirstExecutionFrom() != null && other.getFirstExecutionFrom().equals(this.getFirstExecutionFrom()) == false)
            return false;
        if (other.getObject() == null ^ this.getObject() == null)
            return false;
        if (other.getObject() != null && other.getObject().equals(this.getObject()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirstExecutionFrom() == null) ? 0 : getFirstExecutionFrom().hashCode());
        hashCode = prime * hashCode + ((getObject() == null) ? 0 : getObject().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleConfiguration clone() {
        try {
            return (ScheduleConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appintegrations.model.transform.ScheduleConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

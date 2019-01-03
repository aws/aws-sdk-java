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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DisableAlarmActions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableAlarmActionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the alarms.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> alarmNames;

    /**
     * <p>
     * The names of the alarms.
     * </p>
     * 
     * @return The names of the alarms.
     */

    public java.util.List<String> getAlarmNames() {
        if (alarmNames == null) {
            alarmNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return alarmNames;
    }

    /**
     * <p>
     * The names of the alarms.
     * </p>
     * 
     * @param alarmNames
     *        The names of the alarms.
     */

    public void setAlarmNames(java.util.Collection<String> alarmNames) {
        if (alarmNames == null) {
            this.alarmNames = null;
            return;
        }

        this.alarmNames = new com.amazonaws.internal.SdkInternalList<String>(alarmNames);
    }

    /**
     * <p>
     * The names of the alarms.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarmNames(java.util.Collection)} or {@link #withAlarmNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param alarmNames
     *        The names of the alarms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableAlarmActionsRequest withAlarmNames(String... alarmNames) {
        if (this.alarmNames == null) {
            setAlarmNames(new com.amazonaws.internal.SdkInternalList<String>(alarmNames.length));
        }
        for (String ele : alarmNames) {
            this.alarmNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the alarms.
     * </p>
     * 
     * @param alarmNames
     *        The names of the alarms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableAlarmActionsRequest withAlarmNames(java.util.Collection<String> alarmNames) {
        setAlarmNames(alarmNames);
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
        if (getAlarmNames() != null)
            sb.append("AlarmNames: ").append(getAlarmNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableAlarmActionsRequest == false)
            return false;
        DisableAlarmActionsRequest other = (DisableAlarmActionsRequest) obj;
        if (other.getAlarmNames() == null ^ this.getAlarmNames() == null)
            return false;
        if (other.getAlarmNames() != null && other.getAlarmNames().equals(this.getAlarmNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmNames() == null) ? 0 : getAlarmNames().hashCode());
        return hashCode;
    }

    @Override
    public DisableAlarmActionsRequest clone() {
        return (DisableAlarmActionsRequest) super.clone();
    }

}

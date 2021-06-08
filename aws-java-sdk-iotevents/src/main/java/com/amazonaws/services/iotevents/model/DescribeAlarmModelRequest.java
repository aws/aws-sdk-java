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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeAlarmModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAlarmModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the alarm model.
     * </p>
     */
    private String alarmModelName;
    /**
     * <p>
     * The version of the alarm model.
     * </p>
     */
    private String alarmModelVersion;

    /**
     * <p>
     * The name of the alarm model.
     * </p>
     * 
     * @param alarmModelName
     *        The name of the alarm model.
     */

    public void setAlarmModelName(String alarmModelName) {
        this.alarmModelName = alarmModelName;
    }

    /**
     * <p>
     * The name of the alarm model.
     * </p>
     * 
     * @return The name of the alarm model.
     */

    public String getAlarmModelName() {
        return this.alarmModelName;
    }

    /**
     * <p>
     * The name of the alarm model.
     * </p>
     * 
     * @param alarmModelName
     *        The name of the alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmModelRequest withAlarmModelName(String alarmModelName) {
        setAlarmModelName(alarmModelName);
        return this;
    }

    /**
     * <p>
     * The version of the alarm model.
     * </p>
     * 
     * @param alarmModelVersion
     *        The version of the alarm model.
     */

    public void setAlarmModelVersion(String alarmModelVersion) {
        this.alarmModelVersion = alarmModelVersion;
    }

    /**
     * <p>
     * The version of the alarm model.
     * </p>
     * 
     * @return The version of the alarm model.
     */

    public String getAlarmModelVersion() {
        return this.alarmModelVersion;
    }

    /**
     * <p>
     * The version of the alarm model.
     * </p>
     * 
     * @param alarmModelVersion
     *        The version of the alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmModelRequest withAlarmModelVersion(String alarmModelVersion) {
        setAlarmModelVersion(alarmModelVersion);
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
        if (getAlarmModelName() != null)
            sb.append("AlarmModelName: ").append(getAlarmModelName()).append(",");
        if (getAlarmModelVersion() != null)
            sb.append("AlarmModelVersion: ").append(getAlarmModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAlarmModelRequest == false)
            return false;
        DescribeAlarmModelRequest other = (DescribeAlarmModelRequest) obj;
        if (other.getAlarmModelName() == null ^ this.getAlarmModelName() == null)
            return false;
        if (other.getAlarmModelName() != null && other.getAlarmModelName().equals(this.getAlarmModelName()) == false)
            return false;
        if (other.getAlarmModelVersion() == null ^ this.getAlarmModelVersion() == null)
            return false;
        if (other.getAlarmModelVersion() != null && other.getAlarmModelVersion().equals(this.getAlarmModelVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmModelName() == null) ? 0 : getAlarmModelName().hashCode());
        hashCode = prime * hashCode + ((getAlarmModelVersion() == null) ? 0 : getAlarmModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAlarmModelRequest clone() {
        return (DescribeAlarmModelRequest) super.clone();
    }

}

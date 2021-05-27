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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information used to disable the alarm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/DisableAlarmActionRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableAlarmActionRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The request ID. Each ID must be unique within each batch.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The name of the alarm model.
     * </p>
     */
    private String alarmModelName;
    /**
     * <p>
     * The value of the key used as a filter to select only the alarms associated with the <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_CreateAlarmModel.html#iotevents-CreateAlarmModel-request-key"
     * >key</a>.
     * </p>
     */
    private String keyValue;
    /**
     * <p>
     * The note that you can leave when you disable the alarm.
     * </p>
     */
    private String note;

    /**
     * <p>
     * The request ID. Each ID must be unique within each batch.
     * </p>
     * 
     * @param requestId
     *        The request ID. Each ID must be unique within each batch.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID. Each ID must be unique within each batch.
     * </p>
     * 
     * @return The request ID. Each ID must be unique within each batch.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The request ID. Each ID must be unique within each batch.
     * </p>
     * 
     * @param requestId
     *        The request ID. Each ID must be unique within each batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableAlarmActionRequest withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

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

    public DisableAlarmActionRequest withAlarmModelName(String alarmModelName) {
        setAlarmModelName(alarmModelName);
        return this;
    }

    /**
     * <p>
     * The value of the key used as a filter to select only the alarms associated with the <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_CreateAlarmModel.html#iotevents-CreateAlarmModel-request-key"
     * >key</a>.
     * </p>
     * 
     * @param keyValue
     *        The value of the key used as a filter to select only the alarms associated with the <a href=
     *        "https://docs.aws.amazon.com/iotevents/latest/apireference/API_CreateAlarmModel.html#iotevents-CreateAlarmModel-request-key"
     *        >key</a>.
     */

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    /**
     * <p>
     * The value of the key used as a filter to select only the alarms associated with the <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_CreateAlarmModel.html#iotevents-CreateAlarmModel-request-key"
     * >key</a>.
     * </p>
     * 
     * @return The value of the key used as a filter to select only the alarms associated with the <a href=
     *         "https://docs.aws.amazon.com/iotevents/latest/apireference/API_CreateAlarmModel.html#iotevents-CreateAlarmModel-request-key"
     *         >key</a>.
     */

    public String getKeyValue() {
        return this.keyValue;
    }

    /**
     * <p>
     * The value of the key used as a filter to select only the alarms associated with the <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_CreateAlarmModel.html#iotevents-CreateAlarmModel-request-key"
     * >key</a>.
     * </p>
     * 
     * @param keyValue
     *        The value of the key used as a filter to select only the alarms associated with the <a href=
     *        "https://docs.aws.amazon.com/iotevents/latest/apireference/API_CreateAlarmModel.html#iotevents-CreateAlarmModel-request-key"
     *        >key</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableAlarmActionRequest withKeyValue(String keyValue) {
        setKeyValue(keyValue);
        return this;
    }

    /**
     * <p>
     * The note that you can leave when you disable the alarm.
     * </p>
     * 
     * @param note
     *        The note that you can leave when you disable the alarm.
     */

    public void setNote(String note) {
        this.note = note;
    }

    /**
     * <p>
     * The note that you can leave when you disable the alarm.
     * </p>
     * 
     * @return The note that you can leave when you disable the alarm.
     */

    public String getNote() {
        return this.note;
    }

    /**
     * <p>
     * The note that you can leave when you disable the alarm.
     * </p>
     * 
     * @param note
     *        The note that you can leave when you disable the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableAlarmActionRequest withNote(String note) {
        setNote(note);
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
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getAlarmModelName() != null)
            sb.append("AlarmModelName: ").append(getAlarmModelName()).append(",");
        if (getKeyValue() != null)
            sb.append("KeyValue: ").append(getKeyValue()).append(",");
        if (getNote() != null)
            sb.append("Note: ").append(getNote());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableAlarmActionRequest == false)
            return false;
        DisableAlarmActionRequest other = (DisableAlarmActionRequest) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getAlarmModelName() == null ^ this.getAlarmModelName() == null)
            return false;
        if (other.getAlarmModelName() != null && other.getAlarmModelName().equals(this.getAlarmModelName()) == false)
            return false;
        if (other.getKeyValue() == null ^ this.getKeyValue() == null)
            return false;
        if (other.getKeyValue() != null && other.getKeyValue().equals(this.getKeyValue()) == false)
            return false;
        if (other.getNote() == null ^ this.getNote() == null)
            return false;
        if (other.getNote() != null && other.getNote().equals(this.getNote()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getAlarmModelName() == null) ? 0 : getAlarmModelName().hashCode());
        hashCode = prime * hashCode + ((getKeyValue() == null) ? 0 : getKeyValue().hashCode());
        hashCode = prime * hashCode + ((getNote() == null) ? 0 : getNote().hashCode());
        return hashCode;
    }

    @Override
    public DisableAlarmActionRequest clone() {
        try {
            return (DisableAlarmActionRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ioteventsdata.model.transform.DisableAlarmActionRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

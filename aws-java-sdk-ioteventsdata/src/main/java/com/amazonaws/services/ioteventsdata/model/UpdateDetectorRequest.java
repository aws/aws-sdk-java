/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information used to update the detector (instance).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/UpdateDetectorRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDetectorRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID to assign to the detector update <code>"message"</code>. Each <code>"messageId"</code> must be unique
     * within each batch sent.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * The name of the detector model that created the detectors (instances).
     * </p>
     */
    private String detectorModelName;
    /**
     * <p>
     * The value of the input key attribute (identifying the device or system) that caused the creation of this detector
     * (instance).
     * </p>
     */
    private String keyValue;
    /**
     * <p>
     * The new state, variable values, and timer settings of the detector (instance).
     * </p>
     */
    private DetectorStateDefinition state;

    /**
     * <p>
     * The ID to assign to the detector update <code>"message"</code>. Each <code>"messageId"</code> must be unique
     * within each batch sent.
     * </p>
     * 
     * @param messageId
     *        The ID to assign to the detector update <code>"message"</code>. Each <code>"messageId"</code> must be
     *        unique within each batch sent.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The ID to assign to the detector update <code>"message"</code>. Each <code>"messageId"</code> must be unique
     * within each batch sent.
     * </p>
     * 
     * @return The ID to assign to the detector update <code>"message"</code>. Each <code>"messageId"</code> must be
     *         unique within each batch sent.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The ID to assign to the detector update <code>"message"</code>. Each <code>"messageId"</code> must be unique
     * within each batch sent.
     * </p>
     * 
     * @param messageId
     *        The ID to assign to the detector update <code>"message"</code>. Each <code>"messageId"</code> must be
     *        unique within each batch sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorRequest withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * The name of the detector model that created the detectors (instances).
     * </p>
     * 
     * @param detectorModelName
     *        The name of the detector model that created the detectors (instances).
     */

    public void setDetectorModelName(String detectorModelName) {
        this.detectorModelName = detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model that created the detectors (instances).
     * </p>
     * 
     * @return The name of the detector model that created the detectors (instances).
     */

    public String getDetectorModelName() {
        return this.detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model that created the detectors (instances).
     * </p>
     * 
     * @param detectorModelName
     *        The name of the detector model that created the detectors (instances).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorRequest withDetectorModelName(String detectorModelName) {
        setDetectorModelName(detectorModelName);
        return this;
    }

    /**
     * <p>
     * The value of the input key attribute (identifying the device or system) that caused the creation of this detector
     * (instance).
     * </p>
     * 
     * @param keyValue
     *        The value of the input key attribute (identifying the device or system) that caused the creation of this
     *        detector (instance).
     */

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    /**
     * <p>
     * The value of the input key attribute (identifying the device or system) that caused the creation of this detector
     * (instance).
     * </p>
     * 
     * @return The value of the input key attribute (identifying the device or system) that caused the creation of this
     *         detector (instance).
     */

    public String getKeyValue() {
        return this.keyValue;
    }

    /**
     * <p>
     * The value of the input key attribute (identifying the device or system) that caused the creation of this detector
     * (instance).
     * </p>
     * 
     * @param keyValue
     *        The value of the input key attribute (identifying the device or system) that caused the creation of this
     *        detector (instance).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorRequest withKeyValue(String keyValue) {
        setKeyValue(keyValue);
        return this;
    }

    /**
     * <p>
     * The new state, variable values, and timer settings of the detector (instance).
     * </p>
     * 
     * @param state
     *        The new state, variable values, and timer settings of the detector (instance).
     */

    public void setState(DetectorStateDefinition state) {
        this.state = state;
    }

    /**
     * <p>
     * The new state, variable values, and timer settings of the detector (instance).
     * </p>
     * 
     * @return The new state, variable values, and timer settings of the detector (instance).
     */

    public DetectorStateDefinition getState() {
        return this.state;
    }

    /**
     * <p>
     * The new state, variable values, and timer settings of the detector (instance).
     * </p>
     * 
     * @param state
     *        The new state, variable values, and timer settings of the detector (instance).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorRequest withState(DetectorStateDefinition state) {
        setState(state);
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
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getDetectorModelName() != null)
            sb.append("DetectorModelName: ").append(getDetectorModelName()).append(",");
        if (getKeyValue() != null)
            sb.append("KeyValue: ").append(getKeyValue()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDetectorRequest == false)
            return false;
        UpdateDetectorRequest other = (UpdateDetectorRequest) obj;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getDetectorModelName() == null ^ this.getDetectorModelName() == null)
            return false;
        if (other.getDetectorModelName() != null && other.getDetectorModelName().equals(this.getDetectorModelName()) == false)
            return false;
        if (other.getKeyValue() == null ^ this.getKeyValue() == null)
            return false;
        if (other.getKeyValue() != null && other.getKeyValue().equals(this.getKeyValue()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getDetectorModelName() == null) ? 0 : getDetectorModelName().hashCode());
        hashCode = prime * hashCode + ((getKeyValue() == null) ? 0 : getKeyValue().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDetectorRequest clone() {
        try {
            return (UpdateDetectorRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ioteventsdata.model.transform.UpdateDetectorRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

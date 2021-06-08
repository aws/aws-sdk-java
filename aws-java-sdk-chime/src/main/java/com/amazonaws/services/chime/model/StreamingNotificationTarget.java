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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The targeted recipient for a streaming configuration notification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/StreamingNotificationTarget" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingNotificationTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The streaming notification target.
     * </p>
     */
    private String notificationTarget;

    /**
     * <p>
     * The streaming notification target.
     * </p>
     * 
     * @param notificationTarget
     *        The streaming notification target.
     * @see NotificationTarget
     */

    public void setNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
    }

    /**
     * <p>
     * The streaming notification target.
     * </p>
     * 
     * @return The streaming notification target.
     * @see NotificationTarget
     */

    public String getNotificationTarget() {
        return this.notificationTarget;
    }

    /**
     * <p>
     * The streaming notification target.
     * </p>
     * 
     * @param notificationTarget
     *        The streaming notification target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationTarget
     */

    public StreamingNotificationTarget withNotificationTarget(String notificationTarget) {
        setNotificationTarget(notificationTarget);
        return this;
    }

    /**
     * <p>
     * The streaming notification target.
     * </p>
     * 
     * @param notificationTarget
     *        The streaming notification target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationTarget
     */

    public StreamingNotificationTarget withNotificationTarget(NotificationTarget notificationTarget) {
        this.notificationTarget = notificationTarget.toString();
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
        if (getNotificationTarget() != null)
            sb.append("NotificationTarget: ").append(getNotificationTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingNotificationTarget == false)
            return false;
        StreamingNotificationTarget other = (StreamingNotificationTarget) obj;
        if (other.getNotificationTarget() == null ^ this.getNotificationTarget() == null)
            return false;
        if (other.getNotificationTarget() != null && other.getNotificationTarget().equals(this.getNotificationTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotificationTarget() == null) ? 0 : getNotificationTarget().hashCode());
        return hashCode;
    }

    @Override
    public StreamingNotificationTarget clone() {
        try {
            return (StreamingNotificationTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.StreamingNotificationTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

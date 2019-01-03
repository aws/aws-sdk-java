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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies configuration properties of a notification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/NotificationProperty" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * After a job run starts, the number of minutes to wait before sending a job run delay notification.
     * </p>
     */
    private Integer notifyDelayAfter;

    /**
     * <p>
     * After a job run starts, the number of minutes to wait before sending a job run delay notification.
     * </p>
     * 
     * @param notifyDelayAfter
     *        After a job run starts, the number of minutes to wait before sending a job run delay notification.
     */

    public void setNotifyDelayAfter(Integer notifyDelayAfter) {
        this.notifyDelayAfter = notifyDelayAfter;
    }

    /**
     * <p>
     * After a job run starts, the number of minutes to wait before sending a job run delay notification.
     * </p>
     * 
     * @return After a job run starts, the number of minutes to wait before sending a job run delay notification.
     */

    public Integer getNotifyDelayAfter() {
        return this.notifyDelayAfter;
    }

    /**
     * <p>
     * After a job run starts, the number of minutes to wait before sending a job run delay notification.
     * </p>
     * 
     * @param notifyDelayAfter
     *        After a job run starts, the number of minutes to wait before sending a job run delay notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationProperty withNotifyDelayAfter(Integer notifyDelayAfter) {
        setNotifyDelayAfter(notifyDelayAfter);
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
        if (getNotifyDelayAfter() != null)
            sb.append("NotifyDelayAfter: ").append(getNotifyDelayAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationProperty == false)
            return false;
        NotificationProperty other = (NotificationProperty) obj;
        if (other.getNotifyDelayAfter() == null ^ this.getNotifyDelayAfter() == null)
            return false;
        if (other.getNotifyDelayAfter() != null && other.getNotifyDelayAfter().equals(this.getNotifyDelayAfter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotifyDelayAfter() == null) ? 0 : getNotifyDelayAfter().hashCode());
        return hashCode;
    }

    @Override
    public NotificationProperty clone() {
        try {
            return (NotificationProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.NotificationPropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

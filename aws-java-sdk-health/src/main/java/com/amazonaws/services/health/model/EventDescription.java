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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The detailed description of the event. Included in the information returned by the <a>DescribeEventDetails</a>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/EventDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The most recent description of the event.
     * </p>
     */
    private String latestDescription;

    /**
     * <p>
     * The most recent description of the event.
     * </p>
     * 
     * @param latestDescription
     *        The most recent description of the event.
     */

    public void setLatestDescription(String latestDescription) {
        this.latestDescription = latestDescription;
    }

    /**
     * <p>
     * The most recent description of the event.
     * </p>
     * 
     * @return The most recent description of the event.
     */

    public String getLatestDescription() {
        return this.latestDescription;
    }

    /**
     * <p>
     * The most recent description of the event.
     * </p>
     * 
     * @param latestDescription
     *        The most recent description of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDescription withLatestDescription(String latestDescription) {
        setLatestDescription(latestDescription);
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
        if (getLatestDescription() != null)
            sb.append("LatestDescription: ").append(getLatestDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventDescription == false)
            return false;
        EventDescription other = (EventDescription) obj;
        if (other.getLatestDescription() == null ^ this.getLatestDescription() == null)
            return false;
        if (other.getLatestDescription() != null && other.getLatestDescription().equals(this.getLatestDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLatestDescription() == null) ? 0 : getLatestDescription().hashCode());
        return hashCode;
    }

    @Override
    public EventDescription clone() {
        try {
            return (EventDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.health.model.transform.EventDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

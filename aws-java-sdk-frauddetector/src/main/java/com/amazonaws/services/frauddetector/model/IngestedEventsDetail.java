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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the ingested event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/IngestedEventsDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngestedEventsDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start and stop time of the ingested events.
     * </p>
     */
    private IngestedEventsTimeWindow ingestedEventsTimeWindow;

    /**
     * <p>
     * The start and stop time of the ingested events.
     * </p>
     * 
     * @param ingestedEventsTimeWindow
     *        The start and stop time of the ingested events.
     */

    public void setIngestedEventsTimeWindow(IngestedEventsTimeWindow ingestedEventsTimeWindow) {
        this.ingestedEventsTimeWindow = ingestedEventsTimeWindow;
    }

    /**
     * <p>
     * The start and stop time of the ingested events.
     * </p>
     * 
     * @return The start and stop time of the ingested events.
     */

    public IngestedEventsTimeWindow getIngestedEventsTimeWindow() {
        return this.ingestedEventsTimeWindow;
    }

    /**
     * <p>
     * The start and stop time of the ingested events.
     * </p>
     * 
     * @param ingestedEventsTimeWindow
     *        The start and stop time of the ingested events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestedEventsDetail withIngestedEventsTimeWindow(IngestedEventsTimeWindow ingestedEventsTimeWindow) {
        setIngestedEventsTimeWindow(ingestedEventsTimeWindow);
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
        if (getIngestedEventsTimeWindow() != null)
            sb.append("IngestedEventsTimeWindow: ").append(getIngestedEventsTimeWindow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngestedEventsDetail == false)
            return false;
        IngestedEventsDetail other = (IngestedEventsDetail) obj;
        if (other.getIngestedEventsTimeWindow() == null ^ this.getIngestedEventsTimeWindow() == null)
            return false;
        if (other.getIngestedEventsTimeWindow() != null && other.getIngestedEventsTimeWindow().equals(this.getIngestedEventsTimeWindow()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIngestedEventsTimeWindow() == null) ? 0 : getIngestedEventsTimeWindow().hashCode());
        return hashCode;
    }

    @Override
    public IngestedEventsDetail clone() {
        try {
            return (IngestedEventsDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.IngestedEventsDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.personalizeevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a metric attribution associated with an event. For more information about metric
 * attributions, see <a
 * href="https://docs.aws.amazon.com/personalize/latest/dg/measuring-recommendation-impact.html">Measuring impact of
 * recommendations</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/MetricAttribution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricAttribution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source of the event, such as a third party.
     * </p>
     */
    private String eventAttributionSource;

    /**
     * <p>
     * The source of the event, such as a third party.
     * </p>
     * 
     * @param eventAttributionSource
     *        The source of the event, such as a third party.
     */

    public void setEventAttributionSource(String eventAttributionSource) {
        this.eventAttributionSource = eventAttributionSource;
    }

    /**
     * <p>
     * The source of the event, such as a third party.
     * </p>
     * 
     * @return The source of the event, such as a third party.
     */

    public String getEventAttributionSource() {
        return this.eventAttributionSource;
    }

    /**
     * <p>
     * The source of the event, such as a third party.
     * </p>
     * 
     * @param eventAttributionSource
     *        The source of the event, such as a third party.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAttribution withEventAttributionSource(String eventAttributionSource) {
        setEventAttributionSource(eventAttributionSource);
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
        if (getEventAttributionSource() != null)
            sb.append("EventAttributionSource: ").append(getEventAttributionSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricAttribution == false)
            return false;
        MetricAttribution other = (MetricAttribution) obj;
        if (other.getEventAttributionSource() == null ^ this.getEventAttributionSource() == null)
            return false;
        if (other.getEventAttributionSource() != null && other.getEventAttributionSource().equals(this.getEventAttributionSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventAttributionSource() == null) ? 0 : getEventAttributionSource().hashCode());
        return hashCode;
    }

    @Override
    public MetricAttribution clone() {
        try {
            return (MetricAttribution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalizeevents.model.transform.MetricAttributionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An Amazon Pinpoint analytics endpoint.
 * </p>
 * <p>
 * An endpoint uniquely identifies a mobile device, email address, or phone number that can receive messages from Amazon
 * Pinpoint analytics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AnalyticsMetadataType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyticsMetadataType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint ID.
     * </p>
     */
    private String analyticsEndpointId;

    /**
     * <p>
     * The endpoint ID.
     * </p>
     * 
     * @param analyticsEndpointId
     *        The endpoint ID.
     */

    public void setAnalyticsEndpointId(String analyticsEndpointId) {
        this.analyticsEndpointId = analyticsEndpointId;
    }

    /**
     * <p>
     * The endpoint ID.
     * </p>
     * 
     * @return The endpoint ID.
     */

    public String getAnalyticsEndpointId() {
        return this.analyticsEndpointId;
    }

    /**
     * <p>
     * The endpoint ID.
     * </p>
     * 
     * @param analyticsEndpointId
     *        The endpoint ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsMetadataType withAnalyticsEndpointId(String analyticsEndpointId) {
        setAnalyticsEndpointId(analyticsEndpointId);
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
        if (getAnalyticsEndpointId() != null)
            sb.append("AnalyticsEndpointId: ").append(getAnalyticsEndpointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyticsMetadataType == false)
            return false;
        AnalyticsMetadataType other = (AnalyticsMetadataType) obj;
        if (other.getAnalyticsEndpointId() == null ^ this.getAnalyticsEndpointId() == null)
            return false;
        if (other.getAnalyticsEndpointId() != null && other.getAnalyticsEndpointId().equals(this.getAnalyticsEndpointId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalyticsEndpointId() == null) ? 0 : getAnalyticsEndpointId().hashCode());
        return hashCode;
    }

    @Override
    public AnalyticsMetadataType clone() {
        try {
            return (AnalyticsMetadataType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.AnalyticsMetadataTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

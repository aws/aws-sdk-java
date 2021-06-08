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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The identifer of the input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/InputIdentifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the input routed to AWS IoT Events.
     * </p>
     */
    private IotEventsInputIdentifier iotEventsInputIdentifier;
    /**
     * <p>
     * The identifer of the input routed from AWS IoT SiteWise.
     * </p>
     */
    private IotSiteWiseInputIdentifier iotSiteWiseInputIdentifier;

    /**
     * <p>
     * The identifier of the input routed to AWS IoT Events.
     * </p>
     * 
     * @param iotEventsInputIdentifier
     *        The identifier of the input routed to AWS IoT Events.
     */

    public void setIotEventsInputIdentifier(IotEventsInputIdentifier iotEventsInputIdentifier) {
        this.iotEventsInputIdentifier = iotEventsInputIdentifier;
    }

    /**
     * <p>
     * The identifier of the input routed to AWS IoT Events.
     * </p>
     * 
     * @return The identifier of the input routed to AWS IoT Events.
     */

    public IotEventsInputIdentifier getIotEventsInputIdentifier() {
        return this.iotEventsInputIdentifier;
    }

    /**
     * <p>
     * The identifier of the input routed to AWS IoT Events.
     * </p>
     * 
     * @param iotEventsInputIdentifier
     *        The identifier of the input routed to AWS IoT Events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputIdentifier withIotEventsInputIdentifier(IotEventsInputIdentifier iotEventsInputIdentifier) {
        setIotEventsInputIdentifier(iotEventsInputIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifer of the input routed from AWS IoT SiteWise.
     * </p>
     * 
     * @param iotSiteWiseInputIdentifier
     *        The identifer of the input routed from AWS IoT SiteWise.
     */

    public void setIotSiteWiseInputIdentifier(IotSiteWiseInputIdentifier iotSiteWiseInputIdentifier) {
        this.iotSiteWiseInputIdentifier = iotSiteWiseInputIdentifier;
    }

    /**
     * <p>
     * The identifer of the input routed from AWS IoT SiteWise.
     * </p>
     * 
     * @return The identifer of the input routed from AWS IoT SiteWise.
     */

    public IotSiteWiseInputIdentifier getIotSiteWiseInputIdentifier() {
        return this.iotSiteWiseInputIdentifier;
    }

    /**
     * <p>
     * The identifer of the input routed from AWS IoT SiteWise.
     * </p>
     * 
     * @param iotSiteWiseInputIdentifier
     *        The identifer of the input routed from AWS IoT SiteWise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputIdentifier withIotSiteWiseInputIdentifier(IotSiteWiseInputIdentifier iotSiteWiseInputIdentifier) {
        setIotSiteWiseInputIdentifier(iotSiteWiseInputIdentifier);
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
        if (getIotEventsInputIdentifier() != null)
            sb.append("IotEventsInputIdentifier: ").append(getIotEventsInputIdentifier()).append(",");
        if (getIotSiteWiseInputIdentifier() != null)
            sb.append("IotSiteWiseInputIdentifier: ").append(getIotSiteWiseInputIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputIdentifier == false)
            return false;
        InputIdentifier other = (InputIdentifier) obj;
        if (other.getIotEventsInputIdentifier() == null ^ this.getIotEventsInputIdentifier() == null)
            return false;
        if (other.getIotEventsInputIdentifier() != null && other.getIotEventsInputIdentifier().equals(this.getIotEventsInputIdentifier()) == false)
            return false;
        if (other.getIotSiteWiseInputIdentifier() == null ^ this.getIotSiteWiseInputIdentifier() == null)
            return false;
        if (other.getIotSiteWiseInputIdentifier() != null && other.getIotSiteWiseInputIdentifier().equals(this.getIotSiteWiseInputIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIotEventsInputIdentifier() == null) ? 0 : getIotEventsInputIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIotSiteWiseInputIdentifier() == null) ? 0 : getIotSiteWiseInputIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public InputIdentifier clone() {
        try {
            return (InputIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.InputIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

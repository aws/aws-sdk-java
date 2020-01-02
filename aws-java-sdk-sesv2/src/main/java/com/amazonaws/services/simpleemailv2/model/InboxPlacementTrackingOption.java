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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about the inbox placement data settings for a verified domain that’s associated
 * with your AWS account. This data is available only if you enabled the Deliverability dashboard for the domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/InboxPlacementTrackingOption" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InboxPlacementTrackingOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether inbox placement data is being tracked for the domain.
     * </p>
     */
    private Boolean global;
    /**
     * <p>
     * An array of strings, one for each major email provider that the inbox placement data applies to.
     * </p>
     */
    private java.util.List<String> trackedIsps;

    /**
     * <p>
     * Specifies whether inbox placement data is being tracked for the domain.
     * </p>
     * 
     * @param global
     *        Specifies whether inbox placement data is being tracked for the domain.
     */

    public void setGlobal(Boolean global) {
        this.global = global;
    }

    /**
     * <p>
     * Specifies whether inbox placement data is being tracked for the domain.
     * </p>
     * 
     * @return Specifies whether inbox placement data is being tracked for the domain.
     */

    public Boolean getGlobal() {
        return this.global;
    }

    /**
     * <p>
     * Specifies whether inbox placement data is being tracked for the domain.
     * </p>
     * 
     * @param global
     *        Specifies whether inbox placement data is being tracked for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboxPlacementTrackingOption withGlobal(Boolean global) {
        setGlobal(global);
        return this;
    }

    /**
     * <p>
     * Specifies whether inbox placement data is being tracked for the domain.
     * </p>
     * 
     * @return Specifies whether inbox placement data is being tracked for the domain.
     */

    public Boolean isGlobal() {
        return this.global;
    }

    /**
     * <p>
     * An array of strings, one for each major email provider that the inbox placement data applies to.
     * </p>
     * 
     * @return An array of strings, one for each major email provider that the inbox placement data applies to.
     */

    public java.util.List<String> getTrackedIsps() {
        return trackedIsps;
    }

    /**
     * <p>
     * An array of strings, one for each major email provider that the inbox placement data applies to.
     * </p>
     * 
     * @param trackedIsps
     *        An array of strings, one for each major email provider that the inbox placement data applies to.
     */

    public void setTrackedIsps(java.util.Collection<String> trackedIsps) {
        if (trackedIsps == null) {
            this.trackedIsps = null;
            return;
        }

        this.trackedIsps = new java.util.ArrayList<String>(trackedIsps);
    }

    /**
     * <p>
     * An array of strings, one for each major email provider that the inbox placement data applies to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrackedIsps(java.util.Collection)} or {@link #withTrackedIsps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param trackedIsps
     *        An array of strings, one for each major email provider that the inbox placement data applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboxPlacementTrackingOption withTrackedIsps(String... trackedIsps) {
        if (this.trackedIsps == null) {
            setTrackedIsps(new java.util.ArrayList<String>(trackedIsps.length));
        }
        for (String ele : trackedIsps) {
            this.trackedIsps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings, one for each major email provider that the inbox placement data applies to.
     * </p>
     * 
     * @param trackedIsps
     *        An array of strings, one for each major email provider that the inbox placement data applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboxPlacementTrackingOption withTrackedIsps(java.util.Collection<String> trackedIsps) {
        setTrackedIsps(trackedIsps);
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
        if (getGlobal() != null)
            sb.append("Global: ").append(getGlobal()).append(",");
        if (getTrackedIsps() != null)
            sb.append("TrackedIsps: ").append(getTrackedIsps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InboxPlacementTrackingOption == false)
            return false;
        InboxPlacementTrackingOption other = (InboxPlacementTrackingOption) obj;
        if (other.getGlobal() == null ^ this.getGlobal() == null)
            return false;
        if (other.getGlobal() != null && other.getGlobal().equals(this.getGlobal()) == false)
            return false;
        if (other.getTrackedIsps() == null ^ this.getTrackedIsps() == null)
            return false;
        if (other.getTrackedIsps() != null && other.getTrackedIsps().equals(this.getTrackedIsps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobal() == null) ? 0 : getGlobal().hashCode());
        hashCode = prime * hashCode + ((getTrackedIsps() == null) ? 0 : getTrackedIsps().hashCode());
        return hashCode;
    }

    @Override
    public InboxPlacementTrackingOption clone() {
        try {
            return (InboxPlacementTrackingOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.InboxPlacementTrackingOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

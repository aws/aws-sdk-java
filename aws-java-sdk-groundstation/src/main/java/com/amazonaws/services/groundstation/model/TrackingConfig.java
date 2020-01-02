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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object that determines whether tracking should be used during a contact executed with this <code>Config</code> in the
 * mission profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/TrackingConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrackingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Current setting for autotrack.
     * </p>
     */
    private String autotrack;

    /**
     * <p>
     * Current setting for autotrack.
     * </p>
     * 
     * @param autotrack
     *        Current setting for autotrack.
     * @see Criticality
     */

    public void setAutotrack(String autotrack) {
        this.autotrack = autotrack;
    }

    /**
     * <p>
     * Current setting for autotrack.
     * </p>
     * 
     * @return Current setting for autotrack.
     * @see Criticality
     */

    public String getAutotrack() {
        return this.autotrack;
    }

    /**
     * <p>
     * Current setting for autotrack.
     * </p>
     * 
     * @param autotrack
     *        Current setting for autotrack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Criticality
     */

    public TrackingConfig withAutotrack(String autotrack) {
        setAutotrack(autotrack);
        return this;
    }

    /**
     * <p>
     * Current setting for autotrack.
     * </p>
     * 
     * @param autotrack
     *        Current setting for autotrack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Criticality
     */

    public TrackingConfig withAutotrack(Criticality autotrack) {
        this.autotrack = autotrack.toString();
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
        if (getAutotrack() != null)
            sb.append("Autotrack: ").append(getAutotrack());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrackingConfig == false)
            return false;
        TrackingConfig other = (TrackingConfig) obj;
        if (other.getAutotrack() == null ^ this.getAutotrack() == null)
            return false;
        if (other.getAutotrack() != null && other.getAutotrack().equals(this.getAutotrack()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutotrack() == null) ? 0 : getAutotrack().hashCode());
        return hashCode;
    }

    @Override
    public TrackingConfig clone() {
        try {
            return (TrackingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.TrackingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure contains information about when the canary was created and modified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CanaryTimeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CanaryTimeline implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time the canary was created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The date and time the canary was most recently modified.
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * The date and time that the canary's most recent run started.
     * </p>
     */
    private java.util.Date lastStarted;
    /**
     * <p>
     * The date and time that the canary's most recent run ended.
     * </p>
     */
    private java.util.Date lastStopped;

    /**
     * <p>
     * The date and time the canary was created.
     * </p>
     * 
     * @param created
     *        The date and time the canary was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date and time the canary was created.
     * </p>
     * 
     * @return The date and time the canary was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The date and time the canary was created.
     * </p>
     * 
     * @param created
     *        The date and time the canary was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryTimeline withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The date and time the canary was most recently modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time the canary was most recently modified.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time the canary was most recently modified.
     * </p>
     * 
     * @return The date and time the canary was most recently modified.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date and time the canary was most recently modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time the canary was most recently modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryTimeline withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * The date and time that the canary's most recent run started.
     * </p>
     * 
     * @param lastStarted
     *        The date and time that the canary's most recent run started.
     */

    public void setLastStarted(java.util.Date lastStarted) {
        this.lastStarted = lastStarted;
    }

    /**
     * <p>
     * The date and time that the canary's most recent run started.
     * </p>
     * 
     * @return The date and time that the canary's most recent run started.
     */

    public java.util.Date getLastStarted() {
        return this.lastStarted;
    }

    /**
     * <p>
     * The date and time that the canary's most recent run started.
     * </p>
     * 
     * @param lastStarted
     *        The date and time that the canary's most recent run started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryTimeline withLastStarted(java.util.Date lastStarted) {
        setLastStarted(lastStarted);
        return this;
    }

    /**
     * <p>
     * The date and time that the canary's most recent run ended.
     * </p>
     * 
     * @param lastStopped
     *        The date and time that the canary's most recent run ended.
     */

    public void setLastStopped(java.util.Date lastStopped) {
        this.lastStopped = lastStopped;
    }

    /**
     * <p>
     * The date and time that the canary's most recent run ended.
     * </p>
     * 
     * @return The date and time that the canary's most recent run ended.
     */

    public java.util.Date getLastStopped() {
        return this.lastStopped;
    }

    /**
     * <p>
     * The date and time that the canary's most recent run ended.
     * </p>
     * 
     * @param lastStopped
     *        The date and time that the canary's most recent run ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryTimeline withLastStopped(java.util.Date lastStopped) {
        setLastStopped(lastStopped);
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
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getLastStarted() != null)
            sb.append("LastStarted: ").append(getLastStarted()).append(",");
        if (getLastStopped() != null)
            sb.append("LastStopped: ").append(getLastStopped());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryTimeline == false)
            return false;
        CanaryTimeline other = (CanaryTimeline) obj;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getLastStarted() == null ^ this.getLastStarted() == null)
            return false;
        if (other.getLastStarted() != null && other.getLastStarted().equals(this.getLastStarted()) == false)
            return false;
        if (other.getLastStopped() == null ^ this.getLastStopped() == null)
            return false;
        if (other.getLastStopped() != null && other.getLastStopped().equals(this.getLastStopped()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getLastStarted() == null) ? 0 : getLastStarted().hashCode());
        hashCode = prime * hashCode + ((getLastStopped() == null) ? 0 : getLastStopped().hashCode());
        return hashCode;
    }

    @Override
    public CanaryTimeline clone() {
        try {
            return (CanaryTimeline) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.CanaryTimelineMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

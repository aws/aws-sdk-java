/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary for sync blockers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/SyncBlockerSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SyncBlockerSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource name for sync blocker summary.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The parent resource name for a sync blocker summary.
     * </p>
     */
    private String parentResourceName;
    /**
     * <p>
     * The latest events for a sync blocker summary.
     * </p>
     */
    private java.util.List<SyncBlocker> latestBlockers;

    /**
     * <p>
     * The resource name for sync blocker summary.
     * </p>
     * 
     * @param resourceName
     *        The resource name for sync blocker summary.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The resource name for sync blocker summary.
     * </p>
     * 
     * @return The resource name for sync blocker summary.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The resource name for sync blocker summary.
     * </p>
     * 
     * @param resourceName
     *        The resource name for sync blocker summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlockerSummary withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The parent resource name for a sync blocker summary.
     * </p>
     * 
     * @param parentResourceName
     *        The parent resource name for a sync blocker summary.
     */

    public void setParentResourceName(String parentResourceName) {
        this.parentResourceName = parentResourceName;
    }

    /**
     * <p>
     * The parent resource name for a sync blocker summary.
     * </p>
     * 
     * @return The parent resource name for a sync blocker summary.
     */

    public String getParentResourceName() {
        return this.parentResourceName;
    }

    /**
     * <p>
     * The parent resource name for a sync blocker summary.
     * </p>
     * 
     * @param parentResourceName
     *        The parent resource name for a sync blocker summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlockerSummary withParentResourceName(String parentResourceName) {
        setParentResourceName(parentResourceName);
        return this;
    }

    /**
     * <p>
     * The latest events for a sync blocker summary.
     * </p>
     * 
     * @return The latest events for a sync blocker summary.
     */

    public java.util.List<SyncBlocker> getLatestBlockers() {
        return latestBlockers;
    }

    /**
     * <p>
     * The latest events for a sync blocker summary.
     * </p>
     * 
     * @param latestBlockers
     *        The latest events for a sync blocker summary.
     */

    public void setLatestBlockers(java.util.Collection<SyncBlocker> latestBlockers) {
        if (latestBlockers == null) {
            this.latestBlockers = null;
            return;
        }

        this.latestBlockers = new java.util.ArrayList<SyncBlocker>(latestBlockers);
    }

    /**
     * <p>
     * The latest events for a sync blocker summary.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLatestBlockers(java.util.Collection)} or {@link #withLatestBlockers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param latestBlockers
     *        The latest events for a sync blocker summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlockerSummary withLatestBlockers(SyncBlocker... latestBlockers) {
        if (this.latestBlockers == null) {
            setLatestBlockers(new java.util.ArrayList<SyncBlocker>(latestBlockers.length));
        }
        for (SyncBlocker ele : latestBlockers) {
            this.latestBlockers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The latest events for a sync blocker summary.
     * </p>
     * 
     * @param latestBlockers
     *        The latest events for a sync blocker summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlockerSummary withLatestBlockers(java.util.Collection<SyncBlocker> latestBlockers) {
        setLatestBlockers(latestBlockers);
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
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getParentResourceName() != null)
            sb.append("ParentResourceName: ").append(getParentResourceName()).append(",");
        if (getLatestBlockers() != null)
            sb.append("LatestBlockers: ").append(getLatestBlockers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SyncBlockerSummary == false)
            return false;
        SyncBlockerSummary other = (SyncBlockerSummary) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getParentResourceName() == null ^ this.getParentResourceName() == null)
            return false;
        if (other.getParentResourceName() != null && other.getParentResourceName().equals(this.getParentResourceName()) == false)
            return false;
        if (other.getLatestBlockers() == null ^ this.getLatestBlockers() == null)
            return false;
        if (other.getLatestBlockers() != null && other.getLatestBlockers().equals(this.getLatestBlockers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getParentResourceName() == null) ? 0 : getParentResourceName().hashCode());
        hashCode = prime * hashCode + ((getLatestBlockers() == null) ? 0 : getLatestBlockers().hashCode());
        return hashCode;
    }

    @Override
    public SyncBlockerSummary clone() {
        try {
            return (SyncBlockerSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeconnections.model.transform.SyncBlockerSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

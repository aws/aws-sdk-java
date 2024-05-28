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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the behavior of the anomaly that is new to GuardDuty.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AnomalyUnusual" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyUnusual implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The behavior of the anomalous activity that caused GuardDuty to generate the finding.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, AnomalyObject>> behavior;

    /**
     * <p>
     * The behavior of the anomalous activity that caused GuardDuty to generate the finding.
     * </p>
     * 
     * @return The behavior of the anomalous activity that caused GuardDuty to generate the finding.
     */

    public java.util.Map<String, java.util.Map<String, AnomalyObject>> getBehavior() {
        return behavior;
    }

    /**
     * <p>
     * The behavior of the anomalous activity that caused GuardDuty to generate the finding.
     * </p>
     * 
     * @param behavior
     *        The behavior of the anomalous activity that caused GuardDuty to generate the finding.
     */

    public void setBehavior(java.util.Map<String, java.util.Map<String, AnomalyObject>> behavior) {
        this.behavior = behavior;
    }

    /**
     * <p>
     * The behavior of the anomalous activity that caused GuardDuty to generate the finding.
     * </p>
     * 
     * @param behavior
     *        The behavior of the anomalous activity that caused GuardDuty to generate the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyUnusual withBehavior(java.util.Map<String, java.util.Map<String, AnomalyObject>> behavior) {
        setBehavior(behavior);
        return this;
    }

    /**
     * Add a single Behavior entry
     *
     * @see AnomalyUnusual#withBehavior
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyUnusual addBehaviorEntry(String key, java.util.Map<String, AnomalyObject> value) {
        if (null == this.behavior) {
            this.behavior = new java.util.HashMap<String, java.util.Map<String, AnomalyObject>>();
        }
        if (this.behavior.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.behavior.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Behavior.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyUnusual clearBehaviorEntries() {
        this.behavior = null;
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
        if (getBehavior() != null)
            sb.append("Behavior: ").append(getBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalyUnusual == false)
            return false;
        AnomalyUnusual other = (AnomalyUnusual) obj;
        if (other.getBehavior() == null ^ this.getBehavior() == null)
            return false;
        if (other.getBehavior() != null && other.getBehavior().equals(this.getBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBehavior() == null) ? 0 : getBehavior().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyUnusual clone() {
        try {
            return (AnomalyUnusual) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.AnomalyUnusualMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

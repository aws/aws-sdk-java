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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set amount of time that an escalation plan or engagement plan engages the specified contacts or contact methods.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/Stage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Stage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time to wait until beginning the next stage.
     * </p>
     */
    private Integer durationInMinutes;
    /**
     * <p>
     * The contacts or contact methods that the escalation plan or engagement plan is engaging.
     * </p>
     */
    private java.util.List<Target> targets;

    /**
     * <p>
     * The time to wait until beginning the next stage.
     * </p>
     * 
     * @param durationInMinutes
     *        The time to wait until beginning the next stage.
     */

    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    /**
     * <p>
     * The time to wait until beginning the next stage.
     * </p>
     * 
     * @return The time to wait until beginning the next stage.
     */

    public Integer getDurationInMinutes() {
        return this.durationInMinutes;
    }

    /**
     * <p>
     * The time to wait until beginning the next stage.
     * </p>
     * 
     * @param durationInMinutes
     *        The time to wait until beginning the next stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stage withDurationInMinutes(Integer durationInMinutes) {
        setDurationInMinutes(durationInMinutes);
        return this;
    }

    /**
     * <p>
     * The contacts or contact methods that the escalation plan or engagement plan is engaging.
     * </p>
     * 
     * @return The contacts or contact methods that the escalation plan or engagement plan is engaging.
     */

    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The contacts or contact methods that the escalation plan or engagement plan is engaging.
     * </p>
     * 
     * @param targets
     *        The contacts or contact methods that the escalation plan or engagement plan is engaging.
     */

    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<Target>(targets);
    }

    /**
     * <p>
     * The contacts or contact methods that the escalation plan or engagement plan is engaging.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The contacts or contact methods that the escalation plan or engagement plan is engaging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stage withTargets(Target... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<Target>(targets.length));
        }
        for (Target ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The contacts or contact methods that the escalation plan or engagement plan is engaging.
     * </p>
     * 
     * @param targets
     *        The contacts or contact methods that the escalation plan or engagement plan is engaging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stage withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
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
        if (getDurationInMinutes() != null)
            sb.append("DurationInMinutes: ").append(getDurationInMinutes()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Stage == false)
            return false;
        Stage other = (Stage) obj;
        if (other.getDurationInMinutes() == null ^ this.getDurationInMinutes() == null)
            return false;
        if (other.getDurationInMinutes() != null && other.getDurationInMinutes().equals(this.getDurationInMinutes()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDurationInMinutes() == null) ? 0 : getDurationInMinutes().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        return hashCode;
    }

    @Override
    public Stage clone() {
        try {
            return (Stage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.StageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

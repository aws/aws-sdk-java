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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Feature Activations
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/FeatureActivations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeatureActivations implements Serializable, Cloneable, StructuredPojo {

    /**
     * Enables the Input Prepare feature. You can create Input Prepare actions in the schedule only if this feature is
     * enabled. If you disable the feature on an existing schedule, make sure that you first delete all input prepare
     * actions from the schedule.
     */
    private String inputPrepareScheduleActions;

    /**
     * Enables the Input Prepare feature. You can create Input Prepare actions in the schedule only if this feature is
     * enabled. If you disable the feature on an existing schedule, make sure that you first delete all input prepare
     * actions from the schedule.
     * 
     * @param inputPrepareScheduleActions
     *        Enables the Input Prepare feature. You can create Input Prepare actions in the schedule only if this
     *        feature is enabled. If you disable the feature on an existing schedule, make sure that you first delete
     *        all input prepare actions from the schedule.
     * @see FeatureActivationsInputPrepareScheduleActions
     */

    public void setInputPrepareScheduleActions(String inputPrepareScheduleActions) {
        this.inputPrepareScheduleActions = inputPrepareScheduleActions;
    }

    /**
     * Enables the Input Prepare feature. You can create Input Prepare actions in the schedule only if this feature is
     * enabled. If you disable the feature on an existing schedule, make sure that you first delete all input prepare
     * actions from the schedule.
     * 
     * @return Enables the Input Prepare feature. You can create Input Prepare actions in the schedule only if this
     *         feature is enabled. If you disable the feature on an existing schedule, make sure that you first delete
     *         all input prepare actions from the schedule.
     * @see FeatureActivationsInputPrepareScheduleActions
     */

    public String getInputPrepareScheduleActions() {
        return this.inputPrepareScheduleActions;
    }

    /**
     * Enables the Input Prepare feature. You can create Input Prepare actions in the schedule only if this feature is
     * enabled. If you disable the feature on an existing schedule, make sure that you first delete all input prepare
     * actions from the schedule.
     * 
     * @param inputPrepareScheduleActions
     *        Enables the Input Prepare feature. You can create Input Prepare actions in the schedule only if this
     *        feature is enabled. If you disable the feature on an existing schedule, make sure that you first delete
     *        all input prepare actions from the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureActivationsInputPrepareScheduleActions
     */

    public FeatureActivations withInputPrepareScheduleActions(String inputPrepareScheduleActions) {
        setInputPrepareScheduleActions(inputPrepareScheduleActions);
        return this;
    }

    /**
     * Enables the Input Prepare feature. You can create Input Prepare actions in the schedule only if this feature is
     * enabled. If you disable the feature on an existing schedule, make sure that you first delete all input prepare
     * actions from the schedule.
     * 
     * @param inputPrepareScheduleActions
     *        Enables the Input Prepare feature. You can create Input Prepare actions in the schedule only if this
     *        feature is enabled. If you disable the feature on an existing schedule, make sure that you first delete
     *        all input prepare actions from the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureActivationsInputPrepareScheduleActions
     */

    public FeatureActivations withInputPrepareScheduleActions(FeatureActivationsInputPrepareScheduleActions inputPrepareScheduleActions) {
        this.inputPrepareScheduleActions = inputPrepareScheduleActions.toString();
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
        if (getInputPrepareScheduleActions() != null)
            sb.append("InputPrepareScheduleActions: ").append(getInputPrepareScheduleActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FeatureActivations == false)
            return false;
        FeatureActivations other = (FeatureActivations) obj;
        if (other.getInputPrepareScheduleActions() == null ^ this.getInputPrepareScheduleActions() == null)
            return false;
        if (other.getInputPrepareScheduleActions() != null && other.getInputPrepareScheduleActions().equals(this.getInputPrepareScheduleActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputPrepareScheduleActions() == null) ? 0 : getInputPrepareScheduleActions().hashCode());
        return hashCode;
    }

    @Override
    public FeatureActivations clone() {
        try {
            return (FeatureActivations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.FeatureActivationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

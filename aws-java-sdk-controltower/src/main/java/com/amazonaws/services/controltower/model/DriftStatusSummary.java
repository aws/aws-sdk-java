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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The drift summary of the enabled control.
 * </p>
 * <p>
 * Amazon Web Services Control Tower expects the enabled control configuration to include all supported and governed
 * Regions. If the enabled control differs from the expected configuration, it is defined to be in a state of drift. You
 * can repair this drift by resetting the enabled control.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/DriftStatusSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DriftStatusSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The drift status of the enabled control.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The <code>enabledControl</code> deployed in this configuration doesn’t match the
     * configuration that Amazon Web Services Control Tower expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The <code>enabledControl</code> deployed in this configuration matches the configuration
     * that Amazon Web Services Control Tower expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKING</code>: Amazon Web Services Control Tower does not check drift for this enabled control. Drift
     * is not supported for the control type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: Amazon Web Services Control Tower is not able to check the drift status for the enabled
     * control.
     * </p>
     * </li>
     * </ul>
     */
    private String driftStatus;

    /**
     * <p>
     * The drift status of the enabled control.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The <code>enabledControl</code> deployed in this configuration doesn’t match the
     * configuration that Amazon Web Services Control Tower expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The <code>enabledControl</code> deployed in this configuration matches the configuration
     * that Amazon Web Services Control Tower expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKING</code>: Amazon Web Services Control Tower does not check drift for this enabled control. Drift
     * is not supported for the control type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: Amazon Web Services Control Tower is not able to check the drift status for the enabled
     * control.
     * </p>
     * </li>
     * </ul>
     * 
     * @param driftStatus
     *        The drift status of the enabled control.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DRIFTED</code>: The <code>enabledControl</code> deployed in this configuration doesn’t match the
     *        configuration that Amazon Web Services Control Tower expected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The <code>enabledControl</code> deployed in this configuration matches the
     *        configuration that Amazon Web Services Control Tower expected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKING</code>: Amazon Web Services Control Tower does not check drift for this enabled
     *        control. Drift is not supported for the control type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code>: Amazon Web Services Control Tower is not able to check the drift status for the
     *        enabled control.
     *        </p>
     *        </li>
     * @see DriftStatus
     */

    public void setDriftStatus(String driftStatus) {
        this.driftStatus = driftStatus;
    }

    /**
     * <p>
     * The drift status of the enabled control.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The <code>enabledControl</code> deployed in this configuration doesn’t match the
     * configuration that Amazon Web Services Control Tower expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The <code>enabledControl</code> deployed in this configuration matches the configuration
     * that Amazon Web Services Control Tower expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKING</code>: Amazon Web Services Control Tower does not check drift for this enabled control. Drift
     * is not supported for the control type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: Amazon Web Services Control Tower is not able to check the drift status for the enabled
     * control.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The drift status of the enabled control.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DRIFTED</code>: The <code>enabledControl</code> deployed in this configuration doesn’t match the
     *         configuration that Amazon Web Services Control Tower expected.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code>: The <code>enabledControl</code> deployed in this configuration matches the
     *         configuration that Amazon Web Services Control Tower expected.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_CHECKING</code>: Amazon Web Services Control Tower does not check drift for this enabled
     *         control. Drift is not supported for the control type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNKNOWN</code>: Amazon Web Services Control Tower is not able to check the drift status for the
     *         enabled control.
     *         </p>
     *         </li>
     * @see DriftStatus
     */

    public String getDriftStatus() {
        return this.driftStatus;
    }

    /**
     * <p>
     * The drift status of the enabled control.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The <code>enabledControl</code> deployed in this configuration doesn’t match the
     * configuration that Amazon Web Services Control Tower expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The <code>enabledControl</code> deployed in this configuration matches the configuration
     * that Amazon Web Services Control Tower expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKING</code>: Amazon Web Services Control Tower does not check drift for this enabled control. Drift
     * is not supported for the control type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: Amazon Web Services Control Tower is not able to check the drift status for the enabled
     * control.
     * </p>
     * </li>
     * </ul>
     * 
     * @param driftStatus
     *        The drift status of the enabled control.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DRIFTED</code>: The <code>enabledControl</code> deployed in this configuration doesn’t match the
     *        configuration that Amazon Web Services Control Tower expected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The <code>enabledControl</code> deployed in this configuration matches the
     *        configuration that Amazon Web Services Control Tower expected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKING</code>: Amazon Web Services Control Tower does not check drift for this enabled
     *        control. Drift is not supported for the control type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code>: Amazon Web Services Control Tower is not able to check the drift status for the
     *        enabled control.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DriftStatus
     */

    public DriftStatusSummary withDriftStatus(String driftStatus) {
        setDriftStatus(driftStatus);
        return this;
    }

    /**
     * <p>
     * The drift status of the enabled control.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The <code>enabledControl</code> deployed in this configuration doesn’t match the
     * configuration that Amazon Web Services Control Tower expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The <code>enabledControl</code> deployed in this configuration matches the configuration
     * that Amazon Web Services Control Tower expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKING</code>: Amazon Web Services Control Tower does not check drift for this enabled control. Drift
     * is not supported for the control type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: Amazon Web Services Control Tower is not able to check the drift status for the enabled
     * control.
     * </p>
     * </li>
     * </ul>
     * 
     * @param driftStatus
     *        The drift status of the enabled control.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DRIFTED</code>: The <code>enabledControl</code> deployed in this configuration doesn’t match the
     *        configuration that Amazon Web Services Control Tower expected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The <code>enabledControl</code> deployed in this configuration matches the
     *        configuration that Amazon Web Services Control Tower expected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKING</code>: Amazon Web Services Control Tower does not check drift for this enabled
     *        control. Drift is not supported for the control type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code>: Amazon Web Services Control Tower is not able to check the drift status for the
     *        enabled control.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DriftStatus
     */

    public DriftStatusSummary withDriftStatus(DriftStatus driftStatus) {
        this.driftStatus = driftStatus.toString();
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
        if (getDriftStatus() != null)
            sb.append("DriftStatus: ").append(getDriftStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DriftStatusSummary == false)
            return false;
        DriftStatusSummary other = (DriftStatusSummary) obj;
        if (other.getDriftStatus() == null ^ this.getDriftStatus() == null)
            return false;
        if (other.getDriftStatus() != null && other.getDriftStatus().equals(this.getDriftStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDriftStatus() == null) ? 0 : getDriftStatus().hashCode());
        return hashCode;
    }

    @Override
    public DriftStatusSummary clone() {
        try {
            return (DriftStatusSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.DriftStatusSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

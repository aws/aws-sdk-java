/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UpdateControlPanel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateControlPanelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The control panel to update.
     * </p>
     */
    private ControlPanel controlPanel;

    /**
     * <p>
     * The control panel to update.
     * </p>
     * 
     * @param controlPanel
     *        The control panel to update.
     */

    public void setControlPanel(ControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }

    /**
     * <p>
     * The control panel to update.
     * </p>
     * 
     * @return The control panel to update.
     */

    public ControlPanel getControlPanel() {
        return this.controlPanel;
    }

    /**
     * <p>
     * The control panel to update.
     * </p>
     * 
     * @param controlPanel
     *        The control panel to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateControlPanelResult withControlPanel(ControlPanel controlPanel) {
        setControlPanel(controlPanel);
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
        if (getControlPanel() != null)
            sb.append("ControlPanel: ").append(getControlPanel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateControlPanelResult == false)
            return false;
        UpdateControlPanelResult other = (UpdateControlPanelResult) obj;
        if (other.getControlPanel() == null ^ this.getControlPanel() == null)
            return false;
        if (other.getControlPanel() != null && other.getControlPanel().equals(this.getControlPanel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControlPanel() == null) ? 0 : getControlPanel().hashCode());
        return hashCode;
    }

    @Override
    public UpdateControlPanelResult clone() {
        try {
            return (UpdateControlPanelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

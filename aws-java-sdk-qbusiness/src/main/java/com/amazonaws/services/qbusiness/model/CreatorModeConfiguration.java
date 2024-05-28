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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information required to invoke chat in <code>CREATOR_MODE</code>.
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/guardrails.html">Admin
 * controls and guardrails</a> and <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/using-web-experience.html#chat-source-scope"
 * >Conversation settings</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreatorModeConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatorModeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Status information about whether <code>CREATOR_MODE</code> has been enabled or disabled. The default status is
     * <code>DISABLED</code>.
     * </p>
     */
    private String creatorModeControl;

    /**
     * <p>
     * Status information about whether <code>CREATOR_MODE</code> has been enabled or disabled. The default status is
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param creatorModeControl
     *        Status information about whether <code>CREATOR_MODE</code> has been enabled or disabled. The default
     *        status is <code>DISABLED</code>.
     * @see CreatorModeControl
     */

    public void setCreatorModeControl(String creatorModeControl) {
        this.creatorModeControl = creatorModeControl;
    }

    /**
     * <p>
     * Status information about whether <code>CREATOR_MODE</code> has been enabled or disabled. The default status is
     * <code>DISABLED</code>.
     * </p>
     * 
     * @return Status information about whether <code>CREATOR_MODE</code> has been enabled or disabled. The default
     *         status is <code>DISABLED</code>.
     * @see CreatorModeControl
     */

    public String getCreatorModeControl() {
        return this.creatorModeControl;
    }

    /**
     * <p>
     * Status information about whether <code>CREATOR_MODE</code> has been enabled or disabled. The default status is
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param creatorModeControl
     *        Status information about whether <code>CREATOR_MODE</code> has been enabled or disabled. The default
     *        status is <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CreatorModeControl
     */

    public CreatorModeConfiguration withCreatorModeControl(String creatorModeControl) {
        setCreatorModeControl(creatorModeControl);
        return this;
    }

    /**
     * <p>
     * Status information about whether <code>CREATOR_MODE</code> has been enabled or disabled. The default status is
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param creatorModeControl
     *        Status information about whether <code>CREATOR_MODE</code> has been enabled or disabled. The default
     *        status is <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CreatorModeControl
     */

    public CreatorModeConfiguration withCreatorModeControl(CreatorModeControl creatorModeControl) {
        this.creatorModeControl = creatorModeControl.toString();
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
        if (getCreatorModeControl() != null)
            sb.append("CreatorModeControl: ").append(getCreatorModeControl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatorModeConfiguration == false)
            return false;
        CreatorModeConfiguration other = (CreatorModeConfiguration) obj;
        if (other.getCreatorModeControl() == null ^ this.getCreatorModeControl() == null)
            return false;
        if (other.getCreatorModeControl() != null && other.getCreatorModeControl().equals(this.getCreatorModeControl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatorModeControl() == null) ? 0 : getCreatorModeControl().hashCode());
        return hashCode;
    }

    @Override
    public CreatorModeConfiguration clone() {
        try {
            return (CreatorModeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.CreatorModeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

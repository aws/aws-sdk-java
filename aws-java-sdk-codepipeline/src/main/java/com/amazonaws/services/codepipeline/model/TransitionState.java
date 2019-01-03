/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about the state of transitions between one stage and another stage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/TransitionState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitionState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether the transition between stages is enabled (true) or disabled (false).
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The ID of the user who last changed the transition state.
     * </p>
     */
    private String lastChangedBy;
    /**
     * <p>
     * The timestamp when the transition state was last changed.
     * </p>
     */
    private java.util.Date lastChangedAt;
    /**
     * <p>
     * The user-specified reason why the transition between two stages of a pipeline was disabled.
     * </p>
     */
    private String disabledReason;

    /**
     * <p>
     * Whether the transition between stages is enabled (true) or disabled (false).
     * </p>
     * 
     * @param enabled
     *        Whether the transition between stages is enabled (true) or disabled (false).
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether the transition between stages is enabled (true) or disabled (false).
     * </p>
     * 
     * @return Whether the transition between stages is enabled (true) or disabled (false).
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether the transition between stages is enabled (true) or disabled (false).
     * </p>
     * 
     * @param enabled
     *        Whether the transition between stages is enabled (true) or disabled (false).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitionState withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether the transition between stages is enabled (true) or disabled (false).
     * </p>
     * 
     * @return Whether the transition between stages is enabled (true) or disabled (false).
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The ID of the user who last changed the transition state.
     * </p>
     * 
     * @param lastChangedBy
     *        The ID of the user who last changed the transition state.
     */

    public void setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
    }

    /**
     * <p>
     * The ID of the user who last changed the transition state.
     * </p>
     * 
     * @return The ID of the user who last changed the transition state.
     */

    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * <p>
     * The ID of the user who last changed the transition state.
     * </p>
     * 
     * @param lastChangedBy
     *        The ID of the user who last changed the transition state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitionState withLastChangedBy(String lastChangedBy) {
        setLastChangedBy(lastChangedBy);
        return this;
    }

    /**
     * <p>
     * The timestamp when the transition state was last changed.
     * </p>
     * 
     * @param lastChangedAt
     *        The timestamp when the transition state was last changed.
     */

    public void setLastChangedAt(java.util.Date lastChangedAt) {
        this.lastChangedAt = lastChangedAt;
    }

    /**
     * <p>
     * The timestamp when the transition state was last changed.
     * </p>
     * 
     * @return The timestamp when the transition state was last changed.
     */

    public java.util.Date getLastChangedAt() {
        return this.lastChangedAt;
    }

    /**
     * <p>
     * The timestamp when the transition state was last changed.
     * </p>
     * 
     * @param lastChangedAt
     *        The timestamp when the transition state was last changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitionState withLastChangedAt(java.util.Date lastChangedAt) {
        setLastChangedAt(lastChangedAt);
        return this;
    }

    /**
     * <p>
     * The user-specified reason why the transition between two stages of a pipeline was disabled.
     * </p>
     * 
     * @param disabledReason
     *        The user-specified reason why the transition between two stages of a pipeline was disabled.
     */

    public void setDisabledReason(String disabledReason) {
        this.disabledReason = disabledReason;
    }

    /**
     * <p>
     * The user-specified reason why the transition between two stages of a pipeline was disabled.
     * </p>
     * 
     * @return The user-specified reason why the transition between two stages of a pipeline was disabled.
     */

    public String getDisabledReason() {
        return this.disabledReason;
    }

    /**
     * <p>
     * The user-specified reason why the transition between two stages of a pipeline was disabled.
     * </p>
     * 
     * @param disabledReason
     *        The user-specified reason why the transition between two stages of a pipeline was disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitionState withDisabledReason(String disabledReason) {
        setDisabledReason(disabledReason);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getLastChangedBy() != null)
            sb.append("LastChangedBy: ").append(getLastChangedBy()).append(",");
        if (getLastChangedAt() != null)
            sb.append("LastChangedAt: ").append(getLastChangedAt()).append(",");
        if (getDisabledReason() != null)
            sb.append("DisabledReason: ").append(getDisabledReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitionState == false)
            return false;
        TransitionState other = (TransitionState) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getLastChangedBy() == null ^ this.getLastChangedBy() == null)
            return false;
        if (other.getLastChangedBy() != null && other.getLastChangedBy().equals(this.getLastChangedBy()) == false)
            return false;
        if (other.getLastChangedAt() == null ^ this.getLastChangedAt() == null)
            return false;
        if (other.getLastChangedAt() != null && other.getLastChangedAt().equals(this.getLastChangedAt()) == false)
            return false;
        if (other.getDisabledReason() == null ^ this.getDisabledReason() == null)
            return false;
        if (other.getDisabledReason() != null && other.getDisabledReason().equals(this.getDisabledReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getLastChangedBy() == null) ? 0 : getLastChangedBy().hashCode());
        hashCode = prime * hashCode + ((getLastChangedAt() == null) ? 0 : getLastChangedAt().hashCode());
        hashCode = prime * hashCode + ((getDisabledReason() == null) ? 0 : getDisabledReason().hashCode());
        return hashCode;
    }

    @Override
    public TransitionState clone() {
        try {
            return (TransitionState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.TransitionStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

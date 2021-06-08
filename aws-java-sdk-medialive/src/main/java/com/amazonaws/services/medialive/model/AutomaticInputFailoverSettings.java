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
 * The settings for Automatic Input Failover.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AutomaticInputFailoverSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomaticInputFailoverSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * This clear time defines the requirement a recovered input must meet to be considered healthy. The input must have
     * no failover conditions for this length of time. Enter a time in milliseconds. This value is particularly
     * important if the input_preference for the failover pair is set to PRIMARY_INPUT_PREFERRED, because after this
     * time, MediaLive will switch back to the primary input.
     */
    private Integer errorClearTimeMsec;
    /**
     * A list of failover conditions. If any of these conditions occur, MediaLive will perform a failover to the other
     * input.
     */
    private java.util.List<FailoverCondition> failoverConditions;
    /** Input preference when deciding which input to make active when a previously failed input has recovered. */
    private String inputPreference;
    /** The input ID of the secondary input in the automatic input failover pair. */
    private String secondaryInputId;

    /**
     * This clear time defines the requirement a recovered input must meet to be considered healthy. The input must have
     * no failover conditions for this length of time. Enter a time in milliseconds. This value is particularly
     * important if the input_preference for the failover pair is set to PRIMARY_INPUT_PREFERRED, because after this
     * time, MediaLive will switch back to the primary input.
     * 
     * @param errorClearTimeMsec
     *        This clear time defines the requirement a recovered input must meet to be considered healthy. The input
     *        must have no failover conditions for this length of time. Enter a time in milliseconds. This value is
     *        particularly important if the input_preference for the failover pair is set to PRIMARY_INPUT_PREFERRED,
     *        because after this time, MediaLive will switch back to the primary input.
     */

    public void setErrorClearTimeMsec(Integer errorClearTimeMsec) {
        this.errorClearTimeMsec = errorClearTimeMsec;
    }

    /**
     * This clear time defines the requirement a recovered input must meet to be considered healthy. The input must have
     * no failover conditions for this length of time. Enter a time in milliseconds. This value is particularly
     * important if the input_preference for the failover pair is set to PRIMARY_INPUT_PREFERRED, because after this
     * time, MediaLive will switch back to the primary input.
     * 
     * @return This clear time defines the requirement a recovered input must meet to be considered healthy. The input
     *         must have no failover conditions for this length of time. Enter a time in milliseconds. This value is
     *         particularly important if the input_preference for the failover pair is set to PRIMARY_INPUT_PREFERRED,
     *         because after this time, MediaLive will switch back to the primary input.
     */

    public Integer getErrorClearTimeMsec() {
        return this.errorClearTimeMsec;
    }

    /**
     * This clear time defines the requirement a recovered input must meet to be considered healthy. The input must have
     * no failover conditions for this length of time. Enter a time in milliseconds. This value is particularly
     * important if the input_preference for the failover pair is set to PRIMARY_INPUT_PREFERRED, because after this
     * time, MediaLive will switch back to the primary input.
     * 
     * @param errorClearTimeMsec
     *        This clear time defines the requirement a recovered input must meet to be considered healthy. The input
     *        must have no failover conditions for this length of time. Enter a time in milliseconds. This value is
     *        particularly important if the input_preference for the failover pair is set to PRIMARY_INPUT_PREFERRED,
     *        because after this time, MediaLive will switch back to the primary input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomaticInputFailoverSettings withErrorClearTimeMsec(Integer errorClearTimeMsec) {
        setErrorClearTimeMsec(errorClearTimeMsec);
        return this;
    }

    /**
     * A list of failover conditions. If any of these conditions occur, MediaLive will perform a failover to the other
     * input.
     * 
     * @return A list of failover conditions. If any of these conditions occur, MediaLive will perform a failover to the
     *         other input.
     */

    public java.util.List<FailoverCondition> getFailoverConditions() {
        return failoverConditions;
    }

    /**
     * A list of failover conditions. If any of these conditions occur, MediaLive will perform a failover to the other
     * input.
     * 
     * @param failoverConditions
     *        A list of failover conditions. If any of these conditions occur, MediaLive will perform a failover to the
     *        other input.
     */

    public void setFailoverConditions(java.util.Collection<FailoverCondition> failoverConditions) {
        if (failoverConditions == null) {
            this.failoverConditions = null;
            return;
        }

        this.failoverConditions = new java.util.ArrayList<FailoverCondition>(failoverConditions);
    }

    /**
     * A list of failover conditions. If any of these conditions occur, MediaLive will perform a failover to the other
     * input.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailoverConditions(java.util.Collection)} or {@link #withFailoverConditions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param failoverConditions
     *        A list of failover conditions. If any of these conditions occur, MediaLive will perform a failover to the
     *        other input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomaticInputFailoverSettings withFailoverConditions(FailoverCondition... failoverConditions) {
        if (this.failoverConditions == null) {
            setFailoverConditions(new java.util.ArrayList<FailoverCondition>(failoverConditions.length));
        }
        for (FailoverCondition ele : failoverConditions) {
            this.failoverConditions.add(ele);
        }
        return this;
    }

    /**
     * A list of failover conditions. If any of these conditions occur, MediaLive will perform a failover to the other
     * input.
     * 
     * @param failoverConditions
     *        A list of failover conditions. If any of these conditions occur, MediaLive will perform a failover to the
     *        other input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomaticInputFailoverSettings withFailoverConditions(java.util.Collection<FailoverCondition> failoverConditions) {
        setFailoverConditions(failoverConditions);
        return this;
    }

    /**
     * Input preference when deciding which input to make active when a previously failed input has recovered.
     * 
     * @param inputPreference
     *        Input preference when deciding which input to make active when a previously failed input has recovered.
     * @see InputPreference
     */

    public void setInputPreference(String inputPreference) {
        this.inputPreference = inputPreference;
    }

    /**
     * Input preference when deciding which input to make active when a previously failed input has recovered.
     * 
     * @return Input preference when deciding which input to make active when a previously failed input has recovered.
     * @see InputPreference
     */

    public String getInputPreference() {
        return this.inputPreference;
    }

    /**
     * Input preference when deciding which input to make active when a previously failed input has recovered.
     * 
     * @param inputPreference
     *        Input preference when deciding which input to make active when a previously failed input has recovered.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputPreference
     */

    public AutomaticInputFailoverSettings withInputPreference(String inputPreference) {
        setInputPreference(inputPreference);
        return this;
    }

    /**
     * Input preference when deciding which input to make active when a previously failed input has recovered.
     * 
     * @param inputPreference
     *        Input preference when deciding which input to make active when a previously failed input has recovered.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputPreference
     */

    public AutomaticInputFailoverSettings withInputPreference(InputPreference inputPreference) {
        this.inputPreference = inputPreference.toString();
        return this;
    }

    /**
     * The input ID of the secondary input in the automatic input failover pair.
     * 
     * @param secondaryInputId
     *        The input ID of the secondary input in the automatic input failover pair.
     */

    public void setSecondaryInputId(String secondaryInputId) {
        this.secondaryInputId = secondaryInputId;
    }

    /**
     * The input ID of the secondary input in the automatic input failover pair.
     * 
     * @return The input ID of the secondary input in the automatic input failover pair.
     */

    public String getSecondaryInputId() {
        return this.secondaryInputId;
    }

    /**
     * The input ID of the secondary input in the automatic input failover pair.
     * 
     * @param secondaryInputId
     *        The input ID of the secondary input in the automatic input failover pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomaticInputFailoverSettings withSecondaryInputId(String secondaryInputId) {
        setSecondaryInputId(secondaryInputId);
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
        if (getErrorClearTimeMsec() != null)
            sb.append("ErrorClearTimeMsec: ").append(getErrorClearTimeMsec()).append(",");
        if (getFailoverConditions() != null)
            sb.append("FailoverConditions: ").append(getFailoverConditions()).append(",");
        if (getInputPreference() != null)
            sb.append("InputPreference: ").append(getInputPreference()).append(",");
        if (getSecondaryInputId() != null)
            sb.append("SecondaryInputId: ").append(getSecondaryInputId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomaticInputFailoverSettings == false)
            return false;
        AutomaticInputFailoverSettings other = (AutomaticInputFailoverSettings) obj;
        if (other.getErrorClearTimeMsec() == null ^ this.getErrorClearTimeMsec() == null)
            return false;
        if (other.getErrorClearTimeMsec() != null && other.getErrorClearTimeMsec().equals(this.getErrorClearTimeMsec()) == false)
            return false;
        if (other.getFailoverConditions() == null ^ this.getFailoverConditions() == null)
            return false;
        if (other.getFailoverConditions() != null && other.getFailoverConditions().equals(this.getFailoverConditions()) == false)
            return false;
        if (other.getInputPreference() == null ^ this.getInputPreference() == null)
            return false;
        if (other.getInputPreference() != null && other.getInputPreference().equals(this.getInputPreference()) == false)
            return false;
        if (other.getSecondaryInputId() == null ^ this.getSecondaryInputId() == null)
            return false;
        if (other.getSecondaryInputId() != null && other.getSecondaryInputId().equals(this.getSecondaryInputId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorClearTimeMsec() == null) ? 0 : getErrorClearTimeMsec().hashCode());
        hashCode = prime * hashCode + ((getFailoverConditions() == null) ? 0 : getFailoverConditions().hashCode());
        hashCode = prime * hashCode + ((getInputPreference() == null) ? 0 : getInputPreference().hashCode());
        hashCode = prime * hashCode + ((getSecondaryInputId() == null) ? 0 : getSecondaryInputId().hashCode());
        return hashCode;
    }

    @Override
    public AutomaticInputFailoverSettings clone() {
        try {
            return (AutomaticInputFailoverSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AutomaticInputFailoverSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

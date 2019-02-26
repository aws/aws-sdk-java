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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings related to the Amazon Chime account. This includes settings that start or stop remote control of shared
 * screens, or start or stop the dial-out option in the Amazon Chime web application. For more information about these
 * settings, see <a href="https://docs.aws.amazon.com/chime/latest/ag/policies.html">Use the Policies Page</a> in the
 * <i>Amazon Chime Administration Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AccountSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Setting that stops or starts remote control of shared screens during meetings.
     * </p>
     */
    private Boolean disableRemoteControl;
    /**
     * <p>
     * Setting that allows meeting participants to choose the <b>Call me at a phone number</b> option. For more
     * information, see <a href="https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html">Join a Meeting
     * without the Amazon Chime App</a>.
     * </p>
     */
    private Boolean enableDialOut;

    /**
     * <p>
     * Setting that stops or starts remote control of shared screens during meetings.
     * </p>
     * 
     * @param disableRemoteControl
     *        Setting that stops or starts remote control of shared screens during meetings.
     */

    public void setDisableRemoteControl(Boolean disableRemoteControl) {
        this.disableRemoteControl = disableRemoteControl;
    }

    /**
     * <p>
     * Setting that stops or starts remote control of shared screens during meetings.
     * </p>
     * 
     * @return Setting that stops or starts remote control of shared screens during meetings.
     */

    public Boolean getDisableRemoteControl() {
        return this.disableRemoteControl;
    }

    /**
     * <p>
     * Setting that stops or starts remote control of shared screens during meetings.
     * </p>
     * 
     * @param disableRemoteControl
     *        Setting that stops or starts remote control of shared screens during meetings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSettings withDisableRemoteControl(Boolean disableRemoteControl) {
        setDisableRemoteControl(disableRemoteControl);
        return this;
    }

    /**
     * <p>
     * Setting that stops or starts remote control of shared screens during meetings.
     * </p>
     * 
     * @return Setting that stops or starts remote control of shared screens during meetings.
     */

    public Boolean isDisableRemoteControl() {
        return this.disableRemoteControl;
    }

    /**
     * <p>
     * Setting that allows meeting participants to choose the <b>Call me at a phone number</b> option. For more
     * information, see <a href="https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html">Join a Meeting
     * without the Amazon Chime App</a>.
     * </p>
     * 
     * @param enableDialOut
     *        Setting that allows meeting participants to choose the <b>Call me at a phone number</b> option. For more
     *        information, see <a href="https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html">Join a
     *        Meeting without the Amazon Chime App</a>.
     */

    public void setEnableDialOut(Boolean enableDialOut) {
        this.enableDialOut = enableDialOut;
    }

    /**
     * <p>
     * Setting that allows meeting participants to choose the <b>Call me at a phone number</b> option. For more
     * information, see <a href="https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html">Join a Meeting
     * without the Amazon Chime App</a>.
     * </p>
     * 
     * @return Setting that allows meeting participants to choose the <b>Call me at a phone number</b> option. For more
     *         information, see <a href="https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html">Join a
     *         Meeting without the Amazon Chime App</a>.
     */

    public Boolean getEnableDialOut() {
        return this.enableDialOut;
    }

    /**
     * <p>
     * Setting that allows meeting participants to choose the <b>Call me at a phone number</b> option. For more
     * information, see <a href="https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html">Join a Meeting
     * without the Amazon Chime App</a>.
     * </p>
     * 
     * @param enableDialOut
     *        Setting that allows meeting participants to choose the <b>Call me at a phone number</b> option. For more
     *        information, see <a href="https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html">Join a
     *        Meeting without the Amazon Chime App</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSettings withEnableDialOut(Boolean enableDialOut) {
        setEnableDialOut(enableDialOut);
        return this;
    }

    /**
     * <p>
     * Setting that allows meeting participants to choose the <b>Call me at a phone number</b> option. For more
     * information, see <a href="https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html">Join a Meeting
     * without the Amazon Chime App</a>.
     * </p>
     * 
     * @return Setting that allows meeting participants to choose the <b>Call me at a phone number</b> option. For more
     *         information, see <a href="https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html">Join a
     *         Meeting without the Amazon Chime App</a>.
     */

    public Boolean isEnableDialOut() {
        return this.enableDialOut;
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
        if (getDisableRemoteControl() != null)
            sb.append("DisableRemoteControl: ").append(getDisableRemoteControl()).append(",");
        if (getEnableDialOut() != null)
            sb.append("EnableDialOut: ").append(getEnableDialOut());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountSettings == false)
            return false;
        AccountSettings other = (AccountSettings) obj;
        if (other.getDisableRemoteControl() == null ^ this.getDisableRemoteControl() == null)
            return false;
        if (other.getDisableRemoteControl() != null && other.getDisableRemoteControl().equals(this.getDisableRemoteControl()) == false)
            return false;
        if (other.getEnableDialOut() == null ^ this.getEnableDialOut() == null)
            return false;
        if (other.getEnableDialOut() != null && other.getEnableDialOut().equals(this.getEnableDialOut()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisableRemoteControl() == null) ? 0 : getDisableRemoteControl().hashCode());
        hashCode = prime * hashCode + ((getEnableDialOut() == null) ? 0 : getEnableDialOut().hashCode());
        return hashCode;
    }

    @Override
    public AccountSettings clone() {
        try {
            return (AccountSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.AccountSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

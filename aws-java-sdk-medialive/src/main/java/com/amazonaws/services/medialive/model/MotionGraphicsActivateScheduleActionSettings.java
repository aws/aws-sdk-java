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
 * Settings to specify the rendering of motion graphics into the video stream.
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/MotionGraphicsActivateScheduleActionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MotionGraphicsActivateScheduleActionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Duration (in milliseconds) that motion graphics should render on to the video stream. Leaving out this property
     * or setting to 0 will result in rendering continuing until a deactivate action is processed.
     */
    private Long duration;
    /** Key used to extract the password from EC2 Parameter store */
    private String passwordParam;
    /** URI of the HTML5 content to be rendered into the live stream. */
    private String url;
    /** Documentation update needed */
    private String username;

    /**
     * Duration (in milliseconds) that motion graphics should render on to the video stream. Leaving out this property
     * or setting to 0 will result in rendering continuing until a deactivate action is processed.
     * 
     * @param duration
     *        Duration (in milliseconds) that motion graphics should render on to the video stream. Leaving out this
     *        property or setting to 0 will result in rendering continuing until a deactivate action is processed.
     */

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * Duration (in milliseconds) that motion graphics should render on to the video stream. Leaving out this property
     * or setting to 0 will result in rendering continuing until a deactivate action is processed.
     * 
     * @return Duration (in milliseconds) that motion graphics should render on to the video stream. Leaving out this
     *         property or setting to 0 will result in rendering continuing until a deactivate action is processed.
     */

    public Long getDuration() {
        return this.duration;
    }

    /**
     * Duration (in milliseconds) that motion graphics should render on to the video stream. Leaving out this property
     * or setting to 0 will result in rendering continuing until a deactivate action is processed.
     * 
     * @param duration
     *        Duration (in milliseconds) that motion graphics should render on to the video stream. Leaving out this
     *        property or setting to 0 will result in rendering continuing until a deactivate action is processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MotionGraphicsActivateScheduleActionSettings withDuration(Long duration) {
        setDuration(duration);
        return this;
    }

    /**
     * Key used to extract the password from EC2 Parameter store
     * 
     * @param passwordParam
     *        Key used to extract the password from EC2 Parameter store
     */

    public void setPasswordParam(String passwordParam) {
        this.passwordParam = passwordParam;
    }

    /**
     * Key used to extract the password from EC2 Parameter store
     * 
     * @return Key used to extract the password from EC2 Parameter store
     */

    public String getPasswordParam() {
        return this.passwordParam;
    }

    /**
     * Key used to extract the password from EC2 Parameter store
     * 
     * @param passwordParam
     *        Key used to extract the password from EC2 Parameter store
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MotionGraphicsActivateScheduleActionSettings withPasswordParam(String passwordParam) {
        setPasswordParam(passwordParam);
        return this;
    }

    /**
     * URI of the HTML5 content to be rendered into the live stream.
     * 
     * @param url
     *        URI of the HTML5 content to be rendered into the live stream.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * URI of the HTML5 content to be rendered into the live stream.
     * 
     * @return URI of the HTML5 content to be rendered into the live stream.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * URI of the HTML5 content to be rendered into the live stream.
     * 
     * @param url
     *        URI of the HTML5 content to be rendered into the live stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MotionGraphicsActivateScheduleActionSettings withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * Documentation update needed
     * 
     * @param username
     *        Documentation update needed
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Documentation update needed
     * 
     * @return Documentation update needed
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * Documentation update needed
     * 
     * @param username
     *        Documentation update needed
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MotionGraphicsActivateScheduleActionSettings withUsername(String username) {
        setUsername(username);
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
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getPasswordParam() != null)
            sb.append("PasswordParam: ").append(getPasswordParam()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MotionGraphicsActivateScheduleActionSettings == false)
            return false;
        MotionGraphicsActivateScheduleActionSettings other = (MotionGraphicsActivateScheduleActionSettings) obj;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getPasswordParam() == null ^ this.getPasswordParam() == null)
            return false;
        if (other.getPasswordParam() != null && other.getPasswordParam().equals(this.getPasswordParam()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getPasswordParam() == null) ? 0 : getPasswordParam().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public MotionGraphicsActivateScheduleActionSettings clone() {
        try {
            return (MotionGraphicsActivateScheduleActionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.MotionGraphicsActivateScheduleActionSettingsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}

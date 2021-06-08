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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the debug session for a build. For more information, see <a
 * href="https://docs.aws.amazon.com/codebuild/latest/userguide/session-manager.html">Viewing a running build in Session
 * Manager</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DebugSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DebugSession implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies if session debugging is enabled for this build.
     * </p>
     */
    private Boolean sessionEnabled;
    /**
     * <p>
     * Contains the identifier of the Session Manager session used for the build. To work with the paused build, you
     * open this session to examine, control, and resume the build.
     * </p>
     */
    private String sessionTarget;

    /**
     * <p>
     * Specifies if session debugging is enabled for this build.
     * </p>
     * 
     * @param sessionEnabled
     *        Specifies if session debugging is enabled for this build.
     */

    public void setSessionEnabled(Boolean sessionEnabled) {
        this.sessionEnabled = sessionEnabled;
    }

    /**
     * <p>
     * Specifies if session debugging is enabled for this build.
     * </p>
     * 
     * @return Specifies if session debugging is enabled for this build.
     */

    public Boolean getSessionEnabled() {
        return this.sessionEnabled;
    }

    /**
     * <p>
     * Specifies if session debugging is enabled for this build.
     * </p>
     * 
     * @param sessionEnabled
     *        Specifies if session debugging is enabled for this build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugSession withSessionEnabled(Boolean sessionEnabled) {
        setSessionEnabled(sessionEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies if session debugging is enabled for this build.
     * </p>
     * 
     * @return Specifies if session debugging is enabled for this build.
     */

    public Boolean isSessionEnabled() {
        return this.sessionEnabled;
    }

    /**
     * <p>
     * Contains the identifier of the Session Manager session used for the build. To work with the paused build, you
     * open this session to examine, control, and resume the build.
     * </p>
     * 
     * @param sessionTarget
     *        Contains the identifier of the Session Manager session used for the build. To work with the paused build,
     *        you open this session to examine, control, and resume the build.
     */

    public void setSessionTarget(String sessionTarget) {
        this.sessionTarget = sessionTarget;
    }

    /**
     * <p>
     * Contains the identifier of the Session Manager session used for the build. To work with the paused build, you
     * open this session to examine, control, and resume the build.
     * </p>
     * 
     * @return Contains the identifier of the Session Manager session used for the build. To work with the paused build,
     *         you open this session to examine, control, and resume the build.
     */

    public String getSessionTarget() {
        return this.sessionTarget;
    }

    /**
     * <p>
     * Contains the identifier of the Session Manager session used for the build. To work with the paused build, you
     * open this session to examine, control, and resume the build.
     * </p>
     * 
     * @param sessionTarget
     *        Contains the identifier of the Session Manager session used for the build. To work with the paused build,
     *        you open this session to examine, control, and resume the build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugSession withSessionTarget(String sessionTarget) {
        setSessionTarget(sessionTarget);
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
        if (getSessionEnabled() != null)
            sb.append("SessionEnabled: ").append(getSessionEnabled()).append(",");
        if (getSessionTarget() != null)
            sb.append("SessionTarget: ").append(getSessionTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DebugSession == false)
            return false;
        DebugSession other = (DebugSession) obj;
        if (other.getSessionEnabled() == null ^ this.getSessionEnabled() == null)
            return false;
        if (other.getSessionEnabled() != null && other.getSessionEnabled().equals(this.getSessionEnabled()) == false)
            return false;
        if (other.getSessionTarget() == null ^ this.getSessionTarget() == null)
            return false;
        if (other.getSessionTarget() != null && other.getSessionTarget().equals(this.getSessionTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionEnabled() == null) ? 0 : getSessionEnabled().hashCode());
        hashCode = prime * hashCode + ((getSessionTarget() == null) ? 0 : getSessionTarget().hashCode());
        return hashCode;
    }

    @Override
    public DebugSession clone() {
        try {
            return (DebugSession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.DebugSessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

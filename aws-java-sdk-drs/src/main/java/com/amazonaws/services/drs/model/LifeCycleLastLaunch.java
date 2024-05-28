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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing information regarding the last launch of a Source Server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/LifeCycleLastLaunch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifeCycleLastLaunch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object containing information regarding the initiation of the last launch of a Source Server.
     * </p>
     */
    private LifeCycleLastLaunchInitiated initiated;
    /**
     * <p>
     * Status of Source Server's last launch.
     * </p>
     */
    private String status;

    /**
     * <p>
     * An object containing information regarding the initiation of the last launch of a Source Server.
     * </p>
     * 
     * @param initiated
     *        An object containing information regarding the initiation of the last launch of a Source Server.
     */

    public void setInitiated(LifeCycleLastLaunchInitiated initiated) {
        this.initiated = initiated;
    }

    /**
     * <p>
     * An object containing information regarding the initiation of the last launch of a Source Server.
     * </p>
     * 
     * @return An object containing information regarding the initiation of the last launch of a Source Server.
     */

    public LifeCycleLastLaunchInitiated getInitiated() {
        return this.initiated;
    }

    /**
     * <p>
     * An object containing information regarding the initiation of the last launch of a Source Server.
     * </p>
     * 
     * @param initiated
     *        An object containing information regarding the initiation of the last launch of a Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycleLastLaunch withInitiated(LifeCycleLastLaunchInitiated initiated) {
        setInitiated(initiated);
        return this;
    }

    /**
     * <p>
     * Status of Source Server's last launch.
     * </p>
     * 
     * @param status
     *        Status of Source Server's last launch.
     * @see LaunchStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of Source Server's last launch.
     * </p>
     * 
     * @return Status of Source Server's last launch.
     * @see LaunchStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of Source Server's last launch.
     * </p>
     * 
     * @param status
     *        Status of Source Server's last launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchStatus
     */

    public LifeCycleLastLaunch withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of Source Server's last launch.
     * </p>
     * 
     * @param status
     *        Status of Source Server's last launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchStatus
     */

    public LifeCycleLastLaunch withStatus(LaunchStatus status) {
        this.status = status.toString();
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
        if (getInitiated() != null)
            sb.append("Initiated: ").append(getInitiated()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifeCycleLastLaunch == false)
            return false;
        LifeCycleLastLaunch other = (LifeCycleLastLaunch) obj;
        if (other.getInitiated() == null ^ this.getInitiated() == null)
            return false;
        if (other.getInitiated() != null && other.getInitiated().equals(this.getInitiated()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitiated() == null) ? 0 : getInitiated().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public LifeCycleLastLaunch clone() {
        try {
            return (LifeCycleLastLaunch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.LifeCycleLastLaunchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

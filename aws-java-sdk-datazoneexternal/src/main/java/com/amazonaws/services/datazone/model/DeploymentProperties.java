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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The deployment properties of the Amazon DataZone blueprint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeploymentProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The end timeout of the environment blueprint deployment.
     * </p>
     */
    private Integer endTimeoutMinutes;
    /**
     * <p>
     * The start timeout of the environment blueprint deployment.
     * </p>
     */
    private Integer startTimeoutMinutes;

    /**
     * <p>
     * The end timeout of the environment blueprint deployment.
     * </p>
     * 
     * @param endTimeoutMinutes
     *        The end timeout of the environment blueprint deployment.
     */

    public void setEndTimeoutMinutes(Integer endTimeoutMinutes) {
        this.endTimeoutMinutes = endTimeoutMinutes;
    }

    /**
     * <p>
     * The end timeout of the environment blueprint deployment.
     * </p>
     * 
     * @return The end timeout of the environment blueprint deployment.
     */

    public Integer getEndTimeoutMinutes() {
        return this.endTimeoutMinutes;
    }

    /**
     * <p>
     * The end timeout of the environment blueprint deployment.
     * </p>
     * 
     * @param endTimeoutMinutes
     *        The end timeout of the environment blueprint deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentProperties withEndTimeoutMinutes(Integer endTimeoutMinutes) {
        setEndTimeoutMinutes(endTimeoutMinutes);
        return this;
    }

    /**
     * <p>
     * The start timeout of the environment blueprint deployment.
     * </p>
     * 
     * @param startTimeoutMinutes
     *        The start timeout of the environment blueprint deployment.
     */

    public void setStartTimeoutMinutes(Integer startTimeoutMinutes) {
        this.startTimeoutMinutes = startTimeoutMinutes;
    }

    /**
     * <p>
     * The start timeout of the environment blueprint deployment.
     * </p>
     * 
     * @return The start timeout of the environment blueprint deployment.
     */

    public Integer getStartTimeoutMinutes() {
        return this.startTimeoutMinutes;
    }

    /**
     * <p>
     * The start timeout of the environment blueprint deployment.
     * </p>
     * 
     * @param startTimeoutMinutes
     *        The start timeout of the environment blueprint deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentProperties withStartTimeoutMinutes(Integer startTimeoutMinutes) {
        setStartTimeoutMinutes(startTimeoutMinutes);
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
        if (getEndTimeoutMinutes() != null)
            sb.append("EndTimeoutMinutes: ").append(getEndTimeoutMinutes()).append(",");
        if (getStartTimeoutMinutes() != null)
            sb.append("StartTimeoutMinutes: ").append(getStartTimeoutMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentProperties == false)
            return false;
        DeploymentProperties other = (DeploymentProperties) obj;
        if (other.getEndTimeoutMinutes() == null ^ this.getEndTimeoutMinutes() == null)
            return false;
        if (other.getEndTimeoutMinutes() != null && other.getEndTimeoutMinutes().equals(this.getEndTimeoutMinutes()) == false)
            return false;
        if (other.getStartTimeoutMinutes() == null ^ this.getStartTimeoutMinutes() == null)
            return false;
        if (other.getStartTimeoutMinutes() != null && other.getStartTimeoutMinutes().equals(this.getStartTimeoutMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTimeoutMinutes() == null) ? 0 : getEndTimeoutMinutes().hashCode());
        hashCode = prime * hashCode + ((getStartTimeoutMinutes() == null) ? 0 : getStartTimeoutMinutes().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentProperties clone() {
        try {
            return (DeploymentProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.DeploymentPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

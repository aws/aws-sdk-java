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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing information regarding the initiation of the last launch of a Source Server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/LifeCycleLastLaunchInitiated" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifeCycleLastLaunchInitiated implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time the last Source Server launch was initiated.
     * </p>
     */
    private String apiCallDateTime;
    /**
     * <p>
     * The ID of the Job that was used to last launch the Source Server.
     * </p>
     */
    private String jobID;
    /**
     * <p>
     * The Job type that was used to last launch the Source Server.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The date and time the last Source Server launch was initiated.
     * </p>
     * 
     * @param apiCallDateTime
     *        The date and time the last Source Server launch was initiated.
     */

    public void setApiCallDateTime(String apiCallDateTime) {
        this.apiCallDateTime = apiCallDateTime;
    }

    /**
     * <p>
     * The date and time the last Source Server launch was initiated.
     * </p>
     * 
     * @return The date and time the last Source Server launch was initiated.
     */

    public String getApiCallDateTime() {
        return this.apiCallDateTime;
    }

    /**
     * <p>
     * The date and time the last Source Server launch was initiated.
     * </p>
     * 
     * @param apiCallDateTime
     *        The date and time the last Source Server launch was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycleLastLaunchInitiated withApiCallDateTime(String apiCallDateTime) {
        setApiCallDateTime(apiCallDateTime);
        return this;
    }

    /**
     * <p>
     * The ID of the Job that was used to last launch the Source Server.
     * </p>
     * 
     * @param jobID
     *        The ID of the Job that was used to last launch the Source Server.
     */

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    /**
     * <p>
     * The ID of the Job that was used to last launch the Source Server.
     * </p>
     * 
     * @return The ID of the Job that was used to last launch the Source Server.
     */

    public String getJobID() {
        return this.jobID;
    }

    /**
     * <p>
     * The ID of the Job that was used to last launch the Source Server.
     * </p>
     * 
     * @param jobID
     *        The ID of the Job that was used to last launch the Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycleLastLaunchInitiated withJobID(String jobID) {
        setJobID(jobID);
        return this;
    }

    /**
     * <p>
     * The Job type that was used to last launch the Source Server.
     * </p>
     * 
     * @param type
     *        The Job type that was used to last launch the Source Server.
     * @see LastLaunchType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The Job type that was used to last launch the Source Server.
     * </p>
     * 
     * @return The Job type that was used to last launch the Source Server.
     * @see LastLaunchType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The Job type that was used to last launch the Source Server.
     * </p>
     * 
     * @param type
     *        The Job type that was used to last launch the Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastLaunchType
     */

    public LifeCycleLastLaunchInitiated withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The Job type that was used to last launch the Source Server.
     * </p>
     * 
     * @param type
     *        The Job type that was used to last launch the Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastLaunchType
     */

    public LifeCycleLastLaunchInitiated withType(LastLaunchType type) {
        this.type = type.toString();
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
        if (getApiCallDateTime() != null)
            sb.append("ApiCallDateTime: ").append(getApiCallDateTime()).append(",");
        if (getJobID() != null)
            sb.append("JobID: ").append(getJobID()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifeCycleLastLaunchInitiated == false)
            return false;
        LifeCycleLastLaunchInitiated other = (LifeCycleLastLaunchInitiated) obj;
        if (other.getApiCallDateTime() == null ^ this.getApiCallDateTime() == null)
            return false;
        if (other.getApiCallDateTime() != null && other.getApiCallDateTime().equals(this.getApiCallDateTime()) == false)
            return false;
        if (other.getJobID() == null ^ this.getJobID() == null)
            return false;
        if (other.getJobID() != null && other.getJobID().equals(this.getJobID()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiCallDateTime() == null) ? 0 : getApiCallDateTime().hashCode());
        hashCode = prime * hashCode + ((getJobID() == null) ? 0 : getJobID().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public LifeCycleLastLaunchInitiated clone() {
        try {
            return (LifeCycleLastLaunchInitiated) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.LifeCycleLastLaunchInitiatedMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

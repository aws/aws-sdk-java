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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the latest launch of an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/LaunchDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Latest time this application was launched successfully.
     * </p>
     */
    private java.util.Date latestLaunchTime;
    /**
     * <p>
     * Name of the latest stack launched for this application.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * Identifier of the latest stack launched for this application.
     * </p>
     */
    private String stackId;

    /**
     * <p>
     * Latest time this application was launched successfully.
     * </p>
     * 
     * @param latestLaunchTime
     *        Latest time this application was launched successfully.
     */

    public void setLatestLaunchTime(java.util.Date latestLaunchTime) {
        this.latestLaunchTime = latestLaunchTime;
    }

    /**
     * <p>
     * Latest time this application was launched successfully.
     * </p>
     * 
     * @return Latest time this application was launched successfully.
     */

    public java.util.Date getLatestLaunchTime() {
        return this.latestLaunchTime;
    }

    /**
     * <p>
     * Latest time this application was launched successfully.
     * </p>
     * 
     * @param latestLaunchTime
     *        Latest time this application was launched successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchDetails withLatestLaunchTime(java.util.Date latestLaunchTime) {
        setLatestLaunchTime(latestLaunchTime);
        return this;
    }

    /**
     * <p>
     * Name of the latest stack launched for this application.
     * </p>
     * 
     * @param stackName
     *        Name of the latest stack launched for this application.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * Name of the latest stack launched for this application.
     * </p>
     * 
     * @return Name of the latest stack launched for this application.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * Name of the latest stack launched for this application.
     * </p>
     * 
     * @param stackName
     *        Name of the latest stack launched for this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchDetails withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * Identifier of the latest stack launched for this application.
     * </p>
     * 
     * @param stackId
     *        Identifier of the latest stack launched for this application.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * Identifier of the latest stack launched for this application.
     * </p>
     * 
     * @return Identifier of the latest stack launched for this application.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * Identifier of the latest stack launched for this application.
     * </p>
     * 
     * @param stackId
     *        Identifier of the latest stack launched for this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchDetails withStackId(String stackId) {
        setStackId(stackId);
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
        if (getLatestLaunchTime() != null)
            sb.append("LatestLaunchTime: ").append(getLatestLaunchTime()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchDetails == false)
            return false;
        LaunchDetails other = (LaunchDetails) obj;
        if (other.getLatestLaunchTime() == null ^ this.getLatestLaunchTime() == null)
            return false;
        if (other.getLatestLaunchTime() != null && other.getLatestLaunchTime().equals(this.getLatestLaunchTime()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLatestLaunchTime() == null) ? 0 : getLatestLaunchTime().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        return hashCode;
    }

    @Override
    public LaunchDetails clone() {
        try {
            return (LaunchDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.LaunchDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

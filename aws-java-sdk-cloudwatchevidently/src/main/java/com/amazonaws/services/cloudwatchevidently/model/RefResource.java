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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains information about one experiment or launch that uses the specified segment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/RefResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RefResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the experiment or launch.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The day and time that this experiment or launch ended.
     * </p>
     */
    private String endTime;
    /**
     * <p>
     * The day and time that this experiment or launch was most recently updated.
     * </p>
     */
    private String lastUpdatedOn;
    /**
     * <p>
     * The name of the experiment or launch.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The day and time that this experiment or launch started.
     * </p>
     */
    private String startTime;
    /**
     * <p>
     * The status of the experiment or launch.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies whether the resource that this structure contains information about is an experiment or a launch.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ARN of the experiment or launch.
     * </p>
     * 
     * @param arn
     *        The ARN of the experiment or launch.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the experiment or launch.
     * </p>
     * 
     * @return The ARN of the experiment or launch.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the experiment or launch.
     * </p>
     * 
     * @param arn
     *        The ARN of the experiment or launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefResource withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The day and time that this experiment or launch ended.
     * </p>
     * 
     * @param endTime
     *        The day and time that this experiment or launch ended.
     */

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The day and time that this experiment or launch ended.
     * </p>
     * 
     * @return The day and time that this experiment or launch ended.
     */

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The day and time that this experiment or launch ended.
     * </p>
     * 
     * @param endTime
     *        The day and time that this experiment or launch ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefResource withEndTime(String endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The day and time that this experiment or launch was most recently updated.
     * </p>
     * 
     * @param lastUpdatedOn
     *        The day and time that this experiment or launch was most recently updated.
     */

    public void setLastUpdatedOn(String lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    /**
     * <p>
     * The day and time that this experiment or launch was most recently updated.
     * </p>
     * 
     * @return The day and time that this experiment or launch was most recently updated.
     */

    public String getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }

    /**
     * <p>
     * The day and time that this experiment or launch was most recently updated.
     * </p>
     * 
     * @param lastUpdatedOn
     *        The day and time that this experiment or launch was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefResource withLastUpdatedOn(String lastUpdatedOn) {
        setLastUpdatedOn(lastUpdatedOn);
        return this;
    }

    /**
     * <p>
     * The name of the experiment or launch.
     * </p>
     * 
     * @param name
     *        The name of the experiment or launch.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the experiment or launch.
     * </p>
     * 
     * @return The name of the experiment or launch.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the experiment or launch.
     * </p>
     * 
     * @param name
     *        The name of the experiment or launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefResource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The day and time that this experiment or launch started.
     * </p>
     * 
     * @param startTime
     *        The day and time that this experiment or launch started.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The day and time that this experiment or launch started.
     * </p>
     * 
     * @return The day and time that this experiment or launch started.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The day and time that this experiment or launch started.
     * </p>
     * 
     * @param startTime
     *        The day and time that this experiment or launch started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefResource withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The status of the experiment or launch.
     * </p>
     * 
     * @param status
     *        The status of the experiment or launch.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the experiment or launch.
     * </p>
     * 
     * @return The status of the experiment or launch.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the experiment or launch.
     * </p>
     * 
     * @param status
     *        The status of the experiment or launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefResource withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies whether the resource that this structure contains information about is an experiment or a launch.
     * </p>
     * 
     * @param type
     *        Specifies whether the resource that this structure contains information about is an experiment or a
     *        launch.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies whether the resource that this structure contains information about is an experiment or a launch.
     * </p>
     * 
     * @return Specifies whether the resource that this structure contains information about is an experiment or a
     *         launch.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies whether the resource that this structure contains information about is an experiment or a launch.
     * </p>
     * 
     * @param type
     *        Specifies whether the resource that this structure contains information about is an experiment or a
     *        launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefResource withType(String type) {
        setType(type);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getLastUpdatedOn() != null)
            sb.append("LastUpdatedOn: ").append(getLastUpdatedOn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof RefResource == false)
            return false;
        RefResource other = (RefResource) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getLastUpdatedOn() == null ^ this.getLastUpdatedOn() == null)
            return false;
        if (other.getLastUpdatedOn() != null && other.getLastUpdatedOn().equals(this.getLastUpdatedOn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedOn() == null) ? 0 : getLastUpdatedOn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public RefResource clone() {
        try {
            return (RefResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.RefResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

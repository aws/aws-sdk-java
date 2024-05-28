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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an CloudFormation stack creation or update that occurred around the time of an incident and could
 * be a potential cause of the incident.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/CloudFormationStackUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudFormationStackUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp for when the CloudFormation stack creation or update ended. Not reported for deployments that are
     * still in progress.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudFormation stack involved in the update.
     * </p>
     */
    private String stackArn;
    /**
     * <p>
     * The timestamp for when the CloudFormation stack creation or update began.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The timestamp for when the CloudFormation stack creation or update ended. Not reported for deployments that are
     * still in progress.
     * </p>
     * 
     * @param endTime
     *        The timestamp for when the CloudFormation stack creation or update ended. Not reported for deployments
     *        that are still in progress.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The timestamp for when the CloudFormation stack creation or update ended. Not reported for deployments that are
     * still in progress.
     * </p>
     * 
     * @return The timestamp for when the CloudFormation stack creation or update ended. Not reported for deployments
     *         that are still in progress.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The timestamp for when the CloudFormation stack creation or update ended. Not reported for deployments that are
     * still in progress.
     * </p>
     * 
     * @param endTime
     *        The timestamp for when the CloudFormation stack creation or update ended. Not reported for deployments
     *        that are still in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationStackUpdate withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudFormation stack involved in the update.
     * </p>
     * 
     * @param stackArn
     *        The Amazon Resource Name (ARN) of the CloudFormation stack involved in the update.
     */

    public void setStackArn(String stackArn) {
        this.stackArn = stackArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudFormation stack involved in the update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the CloudFormation stack involved in the update.
     */

    public String getStackArn() {
        return this.stackArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudFormation stack involved in the update.
     * </p>
     * 
     * @param stackArn
     *        The Amazon Resource Name (ARN) of the CloudFormation stack involved in the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationStackUpdate withStackArn(String stackArn) {
        setStackArn(stackArn);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the CloudFormation stack creation or update began.
     * </p>
     * 
     * @param startTime
     *        The timestamp for when the CloudFormation stack creation or update began.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp for when the CloudFormation stack creation or update began.
     * </p>
     * 
     * @return The timestamp for when the CloudFormation stack creation or update began.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp for when the CloudFormation stack creation or update began.
     * </p>
     * 
     * @param startTime
     *        The timestamp for when the CloudFormation stack creation or update began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationStackUpdate withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStackArn() != null)
            sb.append("StackArn: ").append(getStackArn()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudFormationStackUpdate == false)
            return false;
        CloudFormationStackUpdate other = (CloudFormationStackUpdate) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStackArn() == null ^ this.getStackArn() == null)
            return false;
        if (other.getStackArn() != null && other.getStackArn().equals(this.getStackArn()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStackArn() == null) ? 0 : getStackArn().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public CloudFormationStackUpdate clone() {
        try {
            return (CloudFormationStackUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.CloudFormationStackUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

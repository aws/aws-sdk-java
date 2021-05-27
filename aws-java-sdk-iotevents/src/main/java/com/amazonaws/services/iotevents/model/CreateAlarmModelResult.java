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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/CreateAlarmModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAlarmModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The time the alarm model was created, in the Unix epoch format.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The ARN of the alarm model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String alarmModelArn;
    /**
     * <p>
     * The version of the alarm model.
     * </p>
     */
    private String alarmModelVersion;
    /**
     * <p>
     * The time the alarm model was last updated, in the Unix epoch format.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The status of the alarm model. The status can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can take up to
     * a few minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm model
     * information and update the alarm model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information and try
     * again.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The time the alarm model was created, in the Unix epoch format.
     * </p>
     * 
     * @param creationTime
     *        The time the alarm model was created, in the Unix epoch format.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the alarm model was created, in the Unix epoch format.
     * </p>
     * 
     * @return The time the alarm model was created, in the Unix epoch format.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the alarm model was created, in the Unix epoch format.
     * </p>
     * 
     * @param creationTime
     *        The time the alarm model was created, in the Unix epoch format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlarmModelResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The ARN of the alarm model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param alarmModelArn
     *        The ARN of the alarm model. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setAlarmModelArn(String alarmModelArn) {
        this.alarmModelArn = alarmModelArn;
    }

    /**
     * <p>
     * The ARN of the alarm model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The ARN of the alarm model. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getAlarmModelArn() {
        return this.alarmModelArn;
    }

    /**
     * <p>
     * The ARN of the alarm model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param alarmModelArn
     *        The ARN of the alarm model. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlarmModelResult withAlarmModelArn(String alarmModelArn) {
        setAlarmModelArn(alarmModelArn);
        return this;
    }

    /**
     * <p>
     * The version of the alarm model.
     * </p>
     * 
     * @param alarmModelVersion
     *        The version of the alarm model.
     */

    public void setAlarmModelVersion(String alarmModelVersion) {
        this.alarmModelVersion = alarmModelVersion;
    }

    /**
     * <p>
     * The version of the alarm model.
     * </p>
     * 
     * @return The version of the alarm model.
     */

    public String getAlarmModelVersion() {
        return this.alarmModelVersion;
    }

    /**
     * <p>
     * The version of the alarm model.
     * </p>
     * 
     * @param alarmModelVersion
     *        The version of the alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlarmModelResult withAlarmModelVersion(String alarmModelVersion) {
        setAlarmModelVersion(alarmModelVersion);
        return this;
    }

    /**
     * <p>
     * The time the alarm model was last updated, in the Unix epoch format.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time the alarm model was last updated, in the Unix epoch format.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The time the alarm model was last updated, in the Unix epoch format.
     * </p>
     * 
     * @return The time the alarm model was last updated, in the Unix epoch format.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The time the alarm model was last updated, in the Unix epoch format.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time the alarm model was last updated, in the Unix epoch format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlarmModelResult withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The status of the alarm model. The status can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can take up to
     * a few minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm model
     * information and update the alarm model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information and try
     * again.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the alarm model. The status can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can
     *        take up to a few minutes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm
     *        model information and update the alarm model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information
     *        and try again.
     *        </p>
     *        </li>
     * @see AlarmModelVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the alarm model. The status can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can take up to
     * a few minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm model
     * information and update the alarm model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information and try
     * again.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the alarm model. The status can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can
     *         take up to a few minutes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm
     *         model information and update the alarm model.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information
     *         and try again.
     *         </p>
     *         </li>
     * @see AlarmModelVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the alarm model. The status can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can take up to
     * a few minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm model
     * information and update the alarm model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information and try
     * again.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the alarm model. The status can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can
     *        take up to a few minutes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm
     *        model information and update the alarm model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information
     *        and try again.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmModelVersionStatus
     */

    public CreateAlarmModelResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the alarm model. The status can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can take up to
     * a few minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm model
     * information and update the alarm model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information and try
     * again.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the alarm model. The status can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The alarm model is active and it's ready to evaluate data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATING</code> - AWS IoT Events is activating your alarm model. Activating an alarm model can
     *        take up to a few minutes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE</code> - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm
     *        model information and update the alarm model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - You couldn't create or update the alarm model. Check your alarm model information
     *        and try again.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmModelVersionStatus
     */

    public CreateAlarmModelResult withStatus(AlarmModelVersionStatus status) {
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getAlarmModelArn() != null)
            sb.append("AlarmModelArn: ").append(getAlarmModelArn()).append(",");
        if (getAlarmModelVersion() != null)
            sb.append("AlarmModelVersion: ").append(getAlarmModelVersion()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
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

        if (obj instanceof CreateAlarmModelResult == false)
            return false;
        CreateAlarmModelResult other = (CreateAlarmModelResult) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getAlarmModelArn() == null ^ this.getAlarmModelArn() == null)
            return false;
        if (other.getAlarmModelArn() != null && other.getAlarmModelArn().equals(this.getAlarmModelArn()) == false)
            return false;
        if (other.getAlarmModelVersion() == null ^ this.getAlarmModelVersion() == null)
            return false;
        if (other.getAlarmModelVersion() != null && other.getAlarmModelVersion().equals(this.getAlarmModelVersion()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
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

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getAlarmModelArn() == null) ? 0 : getAlarmModelArn().hashCode());
        hashCode = prime * hashCode + ((getAlarmModelVersion() == null) ? 0 : getAlarmModelVersion().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateAlarmModelResult clone() {
        try {
            return (CreateAlarmModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

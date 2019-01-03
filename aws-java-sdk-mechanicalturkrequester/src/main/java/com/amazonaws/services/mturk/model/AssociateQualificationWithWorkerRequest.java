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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/AssociateQualificationWithWorker"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateQualificationWithWorkerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Qualification type to use for the assigned Qualification.
     * </p>
     */
    private String qualificationTypeId;
    /**
     * <p>
     * The ID of the Worker to whom the Qualification is being assigned. Worker IDs are included with submitted HIT
     * assignments and Qualification requests.
     * </p>
     */
    private String workerId;
    /**
     * <p>
     * The value of the Qualification to assign.
     * </p>
     */
    private Integer integerValue;
    /**
     * <p>
     * Specifies whether to send a notification email message to the Worker saying that the qualification was assigned
     * to the Worker. Note: this is true by default.
     * </p>
     */
    private Boolean sendNotification;

    /**
     * <p>
     * The ID of the Qualification type to use for the assigned Qualification.
     * </p>
     * 
     * @param qualificationTypeId
     *        The ID of the Qualification type to use for the assigned Qualification.
     */

    public void setQualificationTypeId(String qualificationTypeId) {
        this.qualificationTypeId = qualificationTypeId;
    }

    /**
     * <p>
     * The ID of the Qualification type to use for the assigned Qualification.
     * </p>
     * 
     * @return The ID of the Qualification type to use for the assigned Qualification.
     */

    public String getQualificationTypeId() {
        return this.qualificationTypeId;
    }

    /**
     * <p>
     * The ID of the Qualification type to use for the assigned Qualification.
     * </p>
     * 
     * @param qualificationTypeId
     *        The ID of the Qualification type to use for the assigned Qualification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateQualificationWithWorkerRequest withQualificationTypeId(String qualificationTypeId) {
        setQualificationTypeId(qualificationTypeId);
        return this;
    }

    /**
     * <p>
     * The ID of the Worker to whom the Qualification is being assigned. Worker IDs are included with submitted HIT
     * assignments and Qualification requests.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker to whom the Qualification is being assigned. Worker IDs are included with submitted
     *        HIT assignments and Qualification requests.
     */

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    /**
     * <p>
     * The ID of the Worker to whom the Qualification is being assigned. Worker IDs are included with submitted HIT
     * assignments and Qualification requests.
     * </p>
     * 
     * @return The ID of the Worker to whom the Qualification is being assigned. Worker IDs are included with submitted
     *         HIT assignments and Qualification requests.
     */

    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * <p>
     * The ID of the Worker to whom the Qualification is being assigned. Worker IDs are included with submitted HIT
     * assignments and Qualification requests.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker to whom the Qualification is being assigned. Worker IDs are included with submitted
     *        HIT assignments and Qualification requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateQualificationWithWorkerRequest withWorkerId(String workerId) {
        setWorkerId(workerId);
        return this;
    }

    /**
     * <p>
     * The value of the Qualification to assign.
     * </p>
     * 
     * @param integerValue
     *        The value of the Qualification to assign.
     */

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    /**
     * <p>
     * The value of the Qualification to assign.
     * </p>
     * 
     * @return The value of the Qualification to assign.
     */

    public Integer getIntegerValue() {
        return this.integerValue;
    }

    /**
     * <p>
     * The value of the Qualification to assign.
     * </p>
     * 
     * @param integerValue
     *        The value of the Qualification to assign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateQualificationWithWorkerRequest withIntegerValue(Integer integerValue) {
        setIntegerValue(integerValue);
        return this;
    }

    /**
     * <p>
     * Specifies whether to send a notification email message to the Worker saying that the qualification was assigned
     * to the Worker. Note: this is true by default.
     * </p>
     * 
     * @param sendNotification
     *        Specifies whether to send a notification email message to the Worker saying that the qualification was
     *        assigned to the Worker. Note: this is true by default.
     */

    public void setSendNotification(Boolean sendNotification) {
        this.sendNotification = sendNotification;
    }

    /**
     * <p>
     * Specifies whether to send a notification email message to the Worker saying that the qualification was assigned
     * to the Worker. Note: this is true by default.
     * </p>
     * 
     * @return Specifies whether to send a notification email message to the Worker saying that the qualification was
     *         assigned to the Worker. Note: this is true by default.
     */

    public Boolean getSendNotification() {
        return this.sendNotification;
    }

    /**
     * <p>
     * Specifies whether to send a notification email message to the Worker saying that the qualification was assigned
     * to the Worker. Note: this is true by default.
     * </p>
     * 
     * @param sendNotification
     *        Specifies whether to send a notification email message to the Worker saying that the qualification was
     *        assigned to the Worker. Note: this is true by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateQualificationWithWorkerRequest withSendNotification(Boolean sendNotification) {
        setSendNotification(sendNotification);
        return this;
    }

    /**
     * <p>
     * Specifies whether to send a notification email message to the Worker saying that the qualification was assigned
     * to the Worker. Note: this is true by default.
     * </p>
     * 
     * @return Specifies whether to send a notification email message to the Worker saying that the qualification was
     *         assigned to the Worker. Note: this is true by default.
     */

    public Boolean isSendNotification() {
        return this.sendNotification;
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
        if (getQualificationTypeId() != null)
            sb.append("QualificationTypeId: ").append(getQualificationTypeId()).append(",");
        if (getWorkerId() != null)
            sb.append("WorkerId: ").append(getWorkerId()).append(",");
        if (getIntegerValue() != null)
            sb.append("IntegerValue: ").append(getIntegerValue()).append(",");
        if (getSendNotification() != null)
            sb.append("SendNotification: ").append(getSendNotification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateQualificationWithWorkerRequest == false)
            return false;
        AssociateQualificationWithWorkerRequest other = (AssociateQualificationWithWorkerRequest) obj;
        if (other.getQualificationTypeId() == null ^ this.getQualificationTypeId() == null)
            return false;
        if (other.getQualificationTypeId() != null && other.getQualificationTypeId().equals(this.getQualificationTypeId()) == false)
            return false;
        if (other.getWorkerId() == null ^ this.getWorkerId() == null)
            return false;
        if (other.getWorkerId() != null && other.getWorkerId().equals(this.getWorkerId()) == false)
            return false;
        if (other.getIntegerValue() == null ^ this.getIntegerValue() == null)
            return false;
        if (other.getIntegerValue() != null && other.getIntegerValue().equals(this.getIntegerValue()) == false)
            return false;
        if (other.getSendNotification() == null ^ this.getSendNotification() == null)
            return false;
        if (other.getSendNotification() != null && other.getSendNotification().equals(this.getSendNotification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQualificationTypeId() == null) ? 0 : getQualificationTypeId().hashCode());
        hashCode = prime * hashCode + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        hashCode = prime * hashCode + ((getIntegerValue() == null) ? 0 : getIntegerValue().hashCode());
        hashCode = prime * hashCode + ((getSendNotification() == null) ? 0 : getSendNotification().hashCode());
        return hashCode;
    }

    @Override
    public AssociateQualificationWithWorkerRequest clone() {
        return (AssociateQualificationWithWorkerRequest) super.clone();
    }

}

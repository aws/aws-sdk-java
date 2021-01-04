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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains validation output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ValidationOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the validation.
     * </p>
     */
    private String validationId;
    /**
     * <p>
     * The name of the validation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the validation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The latest time that the validation was performed.
     * </p>
     */
    private java.util.Date latestValidationTime;
    /**
     * <p>
     * The output from validating an application.
     * </p>
     */
    private AppValidationOutput appValidationOutput;
    /**
     * <p>
     * The output from validation an instance.
     * </p>
     */
    private ServerValidationOutput serverValidationOutput;

    /**
     * <p>
     * The ID of the validation.
     * </p>
     * 
     * @param validationId
     *        The ID of the validation.
     */

    public void setValidationId(String validationId) {
        this.validationId = validationId;
    }

    /**
     * <p>
     * The ID of the validation.
     * </p>
     * 
     * @return The ID of the validation.
     */

    public String getValidationId() {
        return this.validationId;
    }

    /**
     * <p>
     * The ID of the validation.
     * </p>
     * 
     * @param validationId
     *        The ID of the validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationOutput withValidationId(String validationId) {
        setValidationId(validationId);
        return this;
    }

    /**
     * <p>
     * The name of the validation.
     * </p>
     * 
     * @param name
     *        The name of the validation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the validation.
     * </p>
     * 
     * @return The name of the validation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the validation.
     * </p>
     * 
     * @param name
     *        The name of the validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationOutput withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the validation.
     * </p>
     * 
     * @param status
     *        The status of the validation.
     * @see ValidationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the validation.
     * </p>
     * 
     * @return The status of the validation.
     * @see ValidationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the validation.
     * </p>
     * 
     * @param status
     *        The status of the validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationStatus
     */

    public ValidationOutput withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the validation.
     * </p>
     * 
     * @param status
     *        The status of the validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationStatus
     */

    public ValidationOutput withStatus(ValidationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param statusMessage
     *        The status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @return The status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param statusMessage
     *        The status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationOutput withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The latest time that the validation was performed.
     * </p>
     * 
     * @param latestValidationTime
     *        The latest time that the validation was performed.
     */

    public void setLatestValidationTime(java.util.Date latestValidationTime) {
        this.latestValidationTime = latestValidationTime;
    }

    /**
     * <p>
     * The latest time that the validation was performed.
     * </p>
     * 
     * @return The latest time that the validation was performed.
     */

    public java.util.Date getLatestValidationTime() {
        return this.latestValidationTime;
    }

    /**
     * <p>
     * The latest time that the validation was performed.
     * </p>
     * 
     * @param latestValidationTime
     *        The latest time that the validation was performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationOutput withLatestValidationTime(java.util.Date latestValidationTime) {
        setLatestValidationTime(latestValidationTime);
        return this;
    }

    /**
     * <p>
     * The output from validating an application.
     * </p>
     * 
     * @param appValidationOutput
     *        The output from validating an application.
     */

    public void setAppValidationOutput(AppValidationOutput appValidationOutput) {
        this.appValidationOutput = appValidationOutput;
    }

    /**
     * <p>
     * The output from validating an application.
     * </p>
     * 
     * @return The output from validating an application.
     */

    public AppValidationOutput getAppValidationOutput() {
        return this.appValidationOutput;
    }

    /**
     * <p>
     * The output from validating an application.
     * </p>
     * 
     * @param appValidationOutput
     *        The output from validating an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationOutput withAppValidationOutput(AppValidationOutput appValidationOutput) {
        setAppValidationOutput(appValidationOutput);
        return this;
    }

    /**
     * <p>
     * The output from validation an instance.
     * </p>
     * 
     * @param serverValidationOutput
     *        The output from validation an instance.
     */

    public void setServerValidationOutput(ServerValidationOutput serverValidationOutput) {
        this.serverValidationOutput = serverValidationOutput;
    }

    /**
     * <p>
     * The output from validation an instance.
     * </p>
     * 
     * @return The output from validation an instance.
     */

    public ServerValidationOutput getServerValidationOutput() {
        return this.serverValidationOutput;
    }

    /**
     * <p>
     * The output from validation an instance.
     * </p>
     * 
     * @param serverValidationOutput
     *        The output from validation an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationOutput withServerValidationOutput(ServerValidationOutput serverValidationOutput) {
        setServerValidationOutput(serverValidationOutput);
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
        if (getValidationId() != null)
            sb.append("ValidationId: ").append(getValidationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getLatestValidationTime() != null)
            sb.append("LatestValidationTime: ").append(getLatestValidationTime()).append(",");
        if (getAppValidationOutput() != null)
            sb.append("AppValidationOutput: ").append(getAppValidationOutput()).append(",");
        if (getServerValidationOutput() != null)
            sb.append("ServerValidationOutput: ").append(getServerValidationOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidationOutput == false)
            return false;
        ValidationOutput other = (ValidationOutput) obj;
        if (other.getValidationId() == null ^ this.getValidationId() == null)
            return false;
        if (other.getValidationId() != null && other.getValidationId().equals(this.getValidationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getLatestValidationTime() == null ^ this.getLatestValidationTime() == null)
            return false;
        if (other.getLatestValidationTime() != null && other.getLatestValidationTime().equals(this.getLatestValidationTime()) == false)
            return false;
        if (other.getAppValidationOutput() == null ^ this.getAppValidationOutput() == null)
            return false;
        if (other.getAppValidationOutput() != null && other.getAppValidationOutput().equals(this.getAppValidationOutput()) == false)
            return false;
        if (other.getServerValidationOutput() == null ^ this.getServerValidationOutput() == null)
            return false;
        if (other.getServerValidationOutput() != null && other.getServerValidationOutput().equals(this.getServerValidationOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValidationId() == null) ? 0 : getValidationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getLatestValidationTime() == null) ? 0 : getLatestValidationTime().hashCode());
        hashCode = prime * hashCode + ((getAppValidationOutput() == null) ? 0 : getAppValidationOutput().hashCode());
        hashCode = prime * hashCode + ((getServerValidationOutput() == null) ? 0 : getServerValidationOutput().hashCode());
        return hashCode;
    }

    @Override
    public ValidationOutput clone() {
        try {
            return (ValidationOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.ValidationOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the configuration of an input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/InputConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the input.
     * </p>
     */
    private String inputName;
    /**
     * <p>
     * A brief description of the input.
     * </p>
     */
    private String inputDescription;
    /**
     * <p>
     * The ARN of the input.
     * </p>
     */
    private String inputArn;
    /**
     * <p>
     * The time the input was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time the input was updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The status of the input.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the input.
     * </p>
     * 
     * @param inputName
     *        The name of the input.
     */

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * <p>
     * The name of the input.
     * </p>
     * 
     * @return The name of the input.
     */

    public String getInputName() {
        return this.inputName;
    }

    /**
     * <p>
     * The name of the input.
     * </p>
     * 
     * @param inputName
     *        The name of the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfiguration withInputName(String inputName) {
        setInputName(inputName);
        return this;
    }

    /**
     * <p>
     * A brief description of the input.
     * </p>
     * 
     * @param inputDescription
     *        A brief description of the input.
     */

    public void setInputDescription(String inputDescription) {
        this.inputDescription = inputDescription;
    }

    /**
     * <p>
     * A brief description of the input.
     * </p>
     * 
     * @return A brief description of the input.
     */

    public String getInputDescription() {
        return this.inputDescription;
    }

    /**
     * <p>
     * A brief description of the input.
     * </p>
     * 
     * @param inputDescription
     *        A brief description of the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfiguration withInputDescription(String inputDescription) {
        setInputDescription(inputDescription);
        return this;
    }

    /**
     * <p>
     * The ARN of the input.
     * </p>
     * 
     * @param inputArn
     *        The ARN of the input.
     */

    public void setInputArn(String inputArn) {
        this.inputArn = inputArn;
    }

    /**
     * <p>
     * The ARN of the input.
     * </p>
     * 
     * @return The ARN of the input.
     */

    public String getInputArn() {
        return this.inputArn;
    }

    /**
     * <p>
     * The ARN of the input.
     * </p>
     * 
     * @param inputArn
     *        The ARN of the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfiguration withInputArn(String inputArn) {
        setInputArn(inputArn);
        return this;
    }

    /**
     * <p>
     * The time the input was created.
     * </p>
     * 
     * @param creationTime
     *        The time the input was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the input was created.
     * </p>
     * 
     * @return The time the input was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the input was created.
     * </p>
     * 
     * @param creationTime
     *        The time the input was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfiguration withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time the input was updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time the input was updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last time the input was updated.
     * </p>
     * 
     * @return The last time the input was updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The last time the input was updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time the input was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfiguration withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The status of the input.
     * </p>
     * 
     * @param status
     *        The status of the input.
     * @see InputStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the input.
     * </p>
     * 
     * @return The status of the input.
     * @see InputStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the input.
     * </p>
     * 
     * @param status
     *        The status of the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputStatus
     */

    public InputConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the input.
     * </p>
     * 
     * @param status
     *        The status of the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputStatus
     */

    public InputConfiguration withStatus(InputStatus status) {
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
        if (getInputName() != null)
            sb.append("InputName: ").append(getInputName()).append(",");
        if (getInputDescription() != null)
            sb.append("InputDescription: ").append(getInputDescription()).append(",");
        if (getInputArn() != null)
            sb.append("InputArn: ").append(getInputArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
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

        if (obj instanceof InputConfiguration == false)
            return false;
        InputConfiguration other = (InputConfiguration) obj;
        if (other.getInputName() == null ^ this.getInputName() == null)
            return false;
        if (other.getInputName() != null && other.getInputName().equals(this.getInputName()) == false)
            return false;
        if (other.getInputDescription() == null ^ this.getInputDescription() == null)
            return false;
        if (other.getInputDescription() != null && other.getInputDescription().equals(this.getInputDescription()) == false)
            return false;
        if (other.getInputArn() == null ^ this.getInputArn() == null)
            return false;
        if (other.getInputArn() != null && other.getInputArn().equals(this.getInputArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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

        hashCode = prime * hashCode + ((getInputName() == null) ? 0 : getInputName().hashCode());
        hashCode = prime * hashCode + ((getInputDescription() == null) ? 0 : getInputDescription().hashCode());
        hashCode = prime * hashCode + ((getInputArn() == null) ? 0 : getInputArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public InputConfiguration clone() {
        try {
            return (InputConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.InputConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An error that occurred with the job request.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/JobError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobError implements Serializable, Cloneable, StructuredPojo {

    /** The code for the job error. */
    private String code;

    private Details details;
    /**
     * <p>
     * The name of the limit that was reached.
     * </p>
     */
    private String limitName;
    /** The value of the exceeded limit. */
    private Double limitValue;
    /** The message related to the job error. */
    private String message;
    /** The unqiue identifier for the resource related to the error. */
    private String resourceId;
    /** The type of resource related to the error. */
    private String resourceType;

    /**
     * The code for the job error.
     * 
     * @param code
     *        The code for the job error.
     * @see Code
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * The code for the job error.
     * 
     * @return The code for the job error.
     * @see Code
     */

    public String getCode() {
        return this.code;
    }

    /**
     * The code for the job error.
     * 
     * @param code
     *        The code for the job error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Code
     */

    public JobError withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * The code for the job error.
     * 
     * @param code
     *        The code for the job error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Code
     */

    public JobError withCode(Code code) {
        this.code = code.toString();
        return this;
    }

    /**
     * @param details
     */

    public void setDetails(Details details) {
        this.details = details;
    }

    /**
     * @return
     */

    public Details getDetails() {
        return this.details;
    }

    /**
     * @param details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobError withDetails(Details details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * The name of the limit that was reached.
     * </p>
     * 
     * @param limitName
     *        The name of the limit that was reached.
     * @see JobErrorLimitName
     */

    public void setLimitName(String limitName) {
        this.limitName = limitName;
    }

    /**
     * <p>
     * The name of the limit that was reached.
     * </p>
     * 
     * @return The name of the limit that was reached.
     * @see JobErrorLimitName
     */

    public String getLimitName() {
        return this.limitName;
    }

    /**
     * <p>
     * The name of the limit that was reached.
     * </p>
     * 
     * @param limitName
     *        The name of the limit that was reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobErrorLimitName
     */

    public JobError withLimitName(String limitName) {
        setLimitName(limitName);
        return this;
    }

    /**
     * <p>
     * The name of the limit that was reached.
     * </p>
     * 
     * @param limitName
     *        The name of the limit that was reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobErrorLimitName
     */

    public JobError withLimitName(JobErrorLimitName limitName) {
        this.limitName = limitName.toString();
        return this;
    }

    /**
     * The value of the exceeded limit.
     * 
     * @param limitValue
     *        The value of the exceeded limit.
     */

    public void setLimitValue(Double limitValue) {
        this.limitValue = limitValue;
    }

    /**
     * The value of the exceeded limit.
     * 
     * @return The value of the exceeded limit.
     */

    public Double getLimitValue() {
        return this.limitValue;
    }

    /**
     * The value of the exceeded limit.
     * 
     * @param limitValue
     *        The value of the exceeded limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobError withLimitValue(Double limitValue) {
        setLimitValue(limitValue);
        return this;
    }

    /**
     * The message related to the job error.
     * 
     * @param message
     *        The message related to the job error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * The message related to the job error.
     * 
     * @return The message related to the job error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * The message related to the job error.
     * 
     * @param message
     *        The message related to the job error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobError withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * The unqiue identifier for the resource related to the error.
     * 
     * @param resourceId
     *        The unqiue identifier for the resource related to the error.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * The unqiue identifier for the resource related to the error.
     * 
     * @return The unqiue identifier for the resource related to the error.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * The unqiue identifier for the resource related to the error.
     * 
     * @param resourceId
     *        The unqiue identifier for the resource related to the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobError withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * The type of resource related to the error.
     * 
     * @param resourceType
     *        The type of resource related to the error.
     * @see JobErrorResourceTypes
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * The type of resource related to the error.
     * 
     * @return The type of resource related to the error.
     * @see JobErrorResourceTypes
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * The type of resource related to the error.
     * 
     * @param resourceType
     *        The type of resource related to the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobErrorResourceTypes
     */

    public JobError withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * The type of resource related to the error.
     * 
     * @param resourceType
     *        The type of resource related to the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobErrorResourceTypes
     */

    public JobError withResourceType(JobErrorResourceTypes resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getLimitName() != null)
            sb.append("LimitName: ").append(getLimitName()).append(",");
        if (getLimitValue() != null)
            sb.append("LimitValue: ").append(getLimitValue()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobError == false)
            return false;
        JobError other = (JobError) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getLimitName() == null ^ this.getLimitName() == null)
            return false;
        if (other.getLimitName() != null && other.getLimitName().equals(this.getLimitName()) == false)
            return false;
        if (other.getLimitValue() == null ^ this.getLimitValue() == null)
            return false;
        if (other.getLimitValue() != null && other.getLimitValue().equals(this.getLimitValue()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getLimitName() == null) ? 0 : getLimitName().hashCode());
        hashCode = prime * hashCode + ((getLimitValue() == null) ? 0 : getLimitValue().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public JobError clone() {
        try {
            return (JobError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.JobErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

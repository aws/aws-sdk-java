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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Details from a failed operation
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchFailedResultModel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchFailedResultModel implements Serializable, Cloneable, StructuredPojo {

    /** ARN of the resource */
    private String arn;
    /** Error code for the failed operation */
    private String code;
    /** ID of the resource */
    private String id;
    /** Error message for the failed operation */
    private String message;

    /**
     * ARN of the resource
     * 
     * @param arn
     *        ARN of the resource
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * ARN of the resource
     * 
     * @return ARN of the resource
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * ARN of the resource
     * 
     * @param arn
     *        ARN of the resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchFailedResultModel withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * Error code for the failed operation
     * 
     * @param code
     *        Error code for the failed operation
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Error code for the failed operation
     * 
     * @return Error code for the failed operation
     */

    public String getCode() {
        return this.code;
    }

    /**
     * Error code for the failed operation
     * 
     * @param code
     *        Error code for the failed operation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchFailedResultModel withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * ID of the resource
     * 
     * @param id
     *        ID of the resource
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * ID of the resource
     * 
     * @return ID of the resource
     */

    public String getId() {
        return this.id;
    }

    /**
     * ID of the resource
     * 
     * @param id
     *        ID of the resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchFailedResultModel withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Error message for the failed operation
     * 
     * @param message
     *        Error message for the failed operation
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Error message for the failed operation
     * 
     * @return Error message for the failed operation
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * Error message for the failed operation
     * 
     * @param message
     *        Error message for the failed operation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchFailedResultModel withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchFailedResultModel == false)
            return false;
        BatchFailedResultModel other = (BatchFailedResultModel) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchFailedResultModel clone() {
        try {
            return (BatchFailedResultModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.BatchFailedResultModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

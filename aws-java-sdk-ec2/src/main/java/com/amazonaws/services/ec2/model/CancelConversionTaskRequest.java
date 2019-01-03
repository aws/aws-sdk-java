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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CancelConversionTaskRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CancelConversionTask.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelConversionTaskRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CancelConversionTaskRequest> {

    /**
     * <p>
     * The ID of the conversion task.
     * </p>
     */
    private String conversionTaskId;
    /**
     * <p>
     * The reason for canceling the conversion task.
     * </p>
     */
    private String reasonMessage;

    /**
     * <p>
     * The ID of the conversion task.
     * </p>
     * 
     * @param conversionTaskId
     *        The ID of the conversion task.
     */

    public void setConversionTaskId(String conversionTaskId) {
        this.conversionTaskId = conversionTaskId;
    }

    /**
     * <p>
     * The ID of the conversion task.
     * </p>
     * 
     * @return The ID of the conversion task.
     */

    public String getConversionTaskId() {
        return this.conversionTaskId;
    }

    /**
     * <p>
     * The ID of the conversion task.
     * </p>
     * 
     * @param conversionTaskId
     *        The ID of the conversion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelConversionTaskRequest withConversionTaskId(String conversionTaskId) {
        setConversionTaskId(conversionTaskId);
        return this;
    }

    /**
     * <p>
     * The reason for canceling the conversion task.
     * </p>
     * 
     * @param reasonMessage
     *        The reason for canceling the conversion task.
     */

    public void setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
    }

    /**
     * <p>
     * The reason for canceling the conversion task.
     * </p>
     * 
     * @return The reason for canceling the conversion task.
     */

    public String getReasonMessage() {
        return this.reasonMessage;
    }

    /**
     * <p>
     * The reason for canceling the conversion task.
     * </p>
     * 
     * @param reasonMessage
     *        The reason for canceling the conversion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelConversionTaskRequest withReasonMessage(String reasonMessage) {
        setReasonMessage(reasonMessage);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CancelConversionTaskRequest> getDryRunRequest() {
        Request<CancelConversionTaskRequest> request = new CancelConversionTaskRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getConversionTaskId() != null)
            sb.append("ConversionTaskId: ").append(getConversionTaskId()).append(",");
        if (getReasonMessage() != null)
            sb.append("ReasonMessage: ").append(getReasonMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelConversionTaskRequest == false)
            return false;
        CancelConversionTaskRequest other = (CancelConversionTaskRequest) obj;
        if (other.getConversionTaskId() == null ^ this.getConversionTaskId() == null)
            return false;
        if (other.getConversionTaskId() != null && other.getConversionTaskId().equals(this.getConversionTaskId()) == false)
            return false;
        if (other.getReasonMessage() == null ^ this.getReasonMessage() == null)
            return false;
        if (other.getReasonMessage() != null && other.getReasonMessage().equals(this.getReasonMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConversionTaskId() == null) ? 0 : getConversionTaskId().hashCode());
        hashCode = prime * hashCode + ((getReasonMessage() == null) ? 0 : getReasonMessage().hashCode());
        return hashCode;
    }

    @Override
    public CancelConversionTaskRequest clone() {
        return (CancelConversionTaskRequest) super.clone();
    }
}

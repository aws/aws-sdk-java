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
import com.amazonaws.services.ec2.model.transform.CancelImportTaskRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CancelImportTask.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelImportTaskRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CancelImportTaskRequest> {

    /**
     * <p>
     * The reason for canceling the task.
     * </p>
     */
    private String cancelReason;
    /**
     * <p>
     * The ID of the import image or import snapshot task to be canceled.
     * </p>
     */
    private String importTaskId;

    /**
     * <p>
     * The reason for canceling the task.
     * </p>
     * 
     * @param cancelReason
     *        The reason for canceling the task.
     */

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    /**
     * <p>
     * The reason for canceling the task.
     * </p>
     * 
     * @return The reason for canceling the task.
     */

    public String getCancelReason() {
        return this.cancelReason;
    }

    /**
     * <p>
     * The reason for canceling the task.
     * </p>
     * 
     * @param cancelReason
     *        The reason for canceling the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelImportTaskRequest withCancelReason(String cancelReason) {
        setCancelReason(cancelReason);
        return this;
    }

    /**
     * <p>
     * The ID of the import image or import snapshot task to be canceled.
     * </p>
     * 
     * @param importTaskId
     *        The ID of the import image or import snapshot task to be canceled.
     */

    public void setImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
    }

    /**
     * <p>
     * The ID of the import image or import snapshot task to be canceled.
     * </p>
     * 
     * @return The ID of the import image or import snapshot task to be canceled.
     */

    public String getImportTaskId() {
        return this.importTaskId;
    }

    /**
     * <p>
     * The ID of the import image or import snapshot task to be canceled.
     * </p>
     * 
     * @param importTaskId
     *        The ID of the import image or import snapshot task to be canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelImportTaskRequest withImportTaskId(String importTaskId) {
        setImportTaskId(importTaskId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CancelImportTaskRequest> getDryRunRequest() {
        Request<CancelImportTaskRequest> request = new CancelImportTaskRequestMarshaller().marshall(this);
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
        if (getCancelReason() != null)
            sb.append("CancelReason: ").append(getCancelReason()).append(",");
        if (getImportTaskId() != null)
            sb.append("ImportTaskId: ").append(getImportTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelImportTaskRequest == false)
            return false;
        CancelImportTaskRequest other = (CancelImportTaskRequest) obj;
        if (other.getCancelReason() == null ^ this.getCancelReason() == null)
            return false;
        if (other.getCancelReason() != null && other.getCancelReason().equals(this.getCancelReason()) == false)
            return false;
        if (other.getImportTaskId() == null ^ this.getImportTaskId() == null)
            return false;
        if (other.getImportTaskId() != null && other.getImportTaskId().equals(this.getImportTaskId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCancelReason() == null) ? 0 : getCancelReason().hashCode());
        hashCode = prime * hashCode + ((getImportTaskId() == null) ? 0 : getImportTaskId().hashCode());
        return hashCode;
    }

    @Override
    public CancelImportTaskRequest clone() {
        return (CancelImportTaskRequest) super.clone();
    }
}

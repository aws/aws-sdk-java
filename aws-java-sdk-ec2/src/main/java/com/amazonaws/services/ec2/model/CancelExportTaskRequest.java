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
import com.amazonaws.services.ec2.model.transform.CancelExportTaskRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CancelExportTask.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelExportTaskRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CancelExportTaskRequest> {

    /**
     * <p>
     * The ID of the export task. This is the ID returned by <code>CreateInstanceExportTask</code>.
     * </p>
     */
    private String exportTaskId;

    /**
     * <p>
     * The ID of the export task. This is the ID returned by <code>CreateInstanceExportTask</code>.
     * </p>
     * 
     * @param exportTaskId
     *        The ID of the export task. This is the ID returned by <code>CreateInstanceExportTask</code>.
     */

    public void setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
    }

    /**
     * <p>
     * The ID of the export task. This is the ID returned by <code>CreateInstanceExportTask</code>.
     * </p>
     * 
     * @return The ID of the export task. This is the ID returned by <code>CreateInstanceExportTask</code>.
     */

    public String getExportTaskId() {
        return this.exportTaskId;
    }

    /**
     * <p>
     * The ID of the export task. This is the ID returned by <code>CreateInstanceExportTask</code>.
     * </p>
     * 
     * @param exportTaskId
     *        The ID of the export task. This is the ID returned by <code>CreateInstanceExportTask</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskRequest withExportTaskId(String exportTaskId) {
        setExportTaskId(exportTaskId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CancelExportTaskRequest> getDryRunRequest() {
        Request<CancelExportTaskRequest> request = new CancelExportTaskRequestMarshaller().marshall(this);
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
        if (getExportTaskId() != null)
            sb.append("ExportTaskId: ").append(getExportTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelExportTaskRequest == false)
            return false;
        CancelExportTaskRequest other = (CancelExportTaskRequest) obj;
        if (other.getExportTaskId() == null ^ this.getExportTaskId() == null)
            return false;
        if (other.getExportTaskId() != null && other.getExportTaskId().equals(this.getExportTaskId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportTaskId() == null) ? 0 : getExportTaskId().hashCode());
        return hashCode;
    }

    @Override
    public CancelExportTaskRequest clone() {
        return (CancelExportTaskRequest) super.clone();
    }
}

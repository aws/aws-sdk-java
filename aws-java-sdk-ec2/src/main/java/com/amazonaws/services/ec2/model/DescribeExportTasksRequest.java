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
import com.amazonaws.services.ec2.model.transform.DescribeExportTasksRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeExportTasks.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExportTasksRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeExportTasksRequest> {

    /**
     * <p>
     * One or more export task IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> exportTaskIds;

    /**
     * <p>
     * One or more export task IDs.
     * </p>
     * 
     * @return One or more export task IDs.
     */

    public java.util.List<String> getExportTaskIds() {
        if (exportTaskIds == null) {
            exportTaskIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return exportTaskIds;
    }

    /**
     * <p>
     * One or more export task IDs.
     * </p>
     * 
     * @param exportTaskIds
     *        One or more export task IDs.
     */

    public void setExportTaskIds(java.util.Collection<String> exportTaskIds) {
        if (exportTaskIds == null) {
            this.exportTaskIds = null;
            return;
        }

        this.exportTaskIds = new com.amazonaws.internal.SdkInternalList<String>(exportTaskIds);
    }

    /**
     * <p>
     * One or more export task IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportTaskIds(java.util.Collection)} or {@link #withExportTaskIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param exportTaskIds
     *        One or more export task IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withExportTaskIds(String... exportTaskIds) {
        if (this.exportTaskIds == null) {
            setExportTaskIds(new com.amazonaws.internal.SdkInternalList<String>(exportTaskIds.length));
        }
        for (String ele : exportTaskIds) {
            this.exportTaskIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more export task IDs.
     * </p>
     * 
     * @param exportTaskIds
     *        One or more export task IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withExportTaskIds(java.util.Collection<String> exportTaskIds) {
        setExportTaskIds(exportTaskIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeExportTasksRequest> getDryRunRequest() {
        Request<DescribeExportTasksRequest> request = new DescribeExportTasksRequestMarshaller().marshall(this);
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
        if (getExportTaskIds() != null)
            sb.append("ExportTaskIds: ").append(getExportTaskIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExportTasksRequest == false)
            return false;
        DescribeExportTasksRequest other = (DescribeExportTasksRequest) obj;
        if (other.getExportTaskIds() == null ^ this.getExportTaskIds() == null)
            return false;
        if (other.getExportTaskIds() != null && other.getExportTaskIds().equals(this.getExportTaskIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportTaskIds() == null) ? 0 : getExportTaskIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExportTasksRequest clone() {
        return (DescribeExportTasksRequest) super.clone();
    }
}

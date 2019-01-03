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
import com.amazonaws.services.ec2.model.transform.DeleteFlowLogsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFlowLogsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteFlowLogsRequest> {

    /**
     * <p>
     * One or more flow log IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> flowLogIds;

    /**
     * <p>
     * One or more flow log IDs.
     * </p>
     * 
     * @return One or more flow log IDs.
     */

    public java.util.List<String> getFlowLogIds() {
        if (flowLogIds == null) {
            flowLogIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return flowLogIds;
    }

    /**
     * <p>
     * One or more flow log IDs.
     * </p>
     * 
     * @param flowLogIds
     *        One or more flow log IDs.
     */

    public void setFlowLogIds(java.util.Collection<String> flowLogIds) {
        if (flowLogIds == null) {
            this.flowLogIds = null;
            return;
        }

        this.flowLogIds = new com.amazonaws.internal.SdkInternalList<String>(flowLogIds);
    }

    /**
     * <p>
     * One or more flow log IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFlowLogIds(java.util.Collection)} or {@link #withFlowLogIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param flowLogIds
     *        One or more flow log IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFlowLogsRequest withFlowLogIds(String... flowLogIds) {
        if (this.flowLogIds == null) {
            setFlowLogIds(new com.amazonaws.internal.SdkInternalList<String>(flowLogIds.length));
        }
        for (String ele : flowLogIds) {
            this.flowLogIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more flow log IDs.
     * </p>
     * 
     * @param flowLogIds
     *        One or more flow log IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFlowLogsRequest withFlowLogIds(java.util.Collection<String> flowLogIds) {
        setFlowLogIds(flowLogIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteFlowLogsRequest> getDryRunRequest() {
        Request<DeleteFlowLogsRequest> request = new DeleteFlowLogsRequestMarshaller().marshall(this);
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
        if (getFlowLogIds() != null)
            sb.append("FlowLogIds: ").append(getFlowLogIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFlowLogsRequest == false)
            return false;
        DeleteFlowLogsRequest other = (DeleteFlowLogsRequest) obj;
        if (other.getFlowLogIds() == null ^ this.getFlowLogIds() == null)
            return false;
        if (other.getFlowLogIds() != null && other.getFlowLogIds().equals(this.getFlowLogIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowLogIds() == null) ? 0 : getFlowLogIds().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFlowLogsRequest clone() {
        return (DeleteFlowLogsRequest) super.clone();
    }
}

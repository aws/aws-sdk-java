/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DeleteInstanceEventWindowRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteInstanceEventWindowRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteInstanceEventWindowRequest> {

    /**
     * <p>
     * Specify <code>true</code> to force delete the event window. Use the force delete parameter if the event window is
     * currently associated with targets.
     * </p>
     */
    private Boolean forceDelete;
    /**
     * <p>
     * The ID of the event window.
     * </p>
     */
    private String instanceEventWindowId;

    /**
     * <p>
     * Specify <code>true</code> to force delete the event window. Use the force delete parameter if the event window is
     * currently associated with targets.
     * </p>
     * 
     * @param forceDelete
     *        Specify <code>true</code> to force delete the event window. Use the force delete parameter if the event
     *        window is currently associated with targets.
     */

    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    /**
     * <p>
     * Specify <code>true</code> to force delete the event window. Use the force delete parameter if the event window is
     * currently associated with targets.
     * </p>
     * 
     * @return Specify <code>true</code> to force delete the event window. Use the force delete parameter if the event
     *         window is currently associated with targets.
     */

    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    /**
     * <p>
     * Specify <code>true</code> to force delete the event window. Use the force delete parameter if the event window is
     * currently associated with targets.
     * </p>
     * 
     * @param forceDelete
     *        Specify <code>true</code> to force delete the event window. Use the force delete parameter if the event
     *        window is currently associated with targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInstanceEventWindowRequest withForceDelete(Boolean forceDelete) {
        setForceDelete(forceDelete);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to force delete the event window. Use the force delete parameter if the event window is
     * currently associated with targets.
     * </p>
     * 
     * @return Specify <code>true</code> to force delete the event window. Use the force delete parameter if the event
     *         window is currently associated with targets.
     */

    public Boolean isForceDelete() {
        return this.forceDelete;
    }

    /**
     * <p>
     * The ID of the event window.
     * </p>
     * 
     * @param instanceEventWindowId
     *        The ID of the event window.
     */

    public void setInstanceEventWindowId(String instanceEventWindowId) {
        this.instanceEventWindowId = instanceEventWindowId;
    }

    /**
     * <p>
     * The ID of the event window.
     * </p>
     * 
     * @return The ID of the event window.
     */

    public String getInstanceEventWindowId() {
        return this.instanceEventWindowId;
    }

    /**
     * <p>
     * The ID of the event window.
     * </p>
     * 
     * @param instanceEventWindowId
     *        The ID of the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInstanceEventWindowRequest withInstanceEventWindowId(String instanceEventWindowId) {
        setInstanceEventWindowId(instanceEventWindowId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteInstanceEventWindowRequest> getDryRunRequest() {
        Request<DeleteInstanceEventWindowRequest> request = new DeleteInstanceEventWindowRequestMarshaller().marshall(this);
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
        if (getForceDelete() != null)
            sb.append("ForceDelete: ").append(getForceDelete()).append(",");
        if (getInstanceEventWindowId() != null)
            sb.append("InstanceEventWindowId: ").append(getInstanceEventWindowId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInstanceEventWindowRequest == false)
            return false;
        DeleteInstanceEventWindowRequest other = (DeleteInstanceEventWindowRequest) obj;
        if (other.getForceDelete() == null ^ this.getForceDelete() == null)
            return false;
        if (other.getForceDelete() != null && other.getForceDelete().equals(this.getForceDelete()) == false)
            return false;
        if (other.getInstanceEventWindowId() == null ^ this.getInstanceEventWindowId() == null)
            return false;
        if (other.getInstanceEventWindowId() != null && other.getInstanceEventWindowId().equals(this.getInstanceEventWindowId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForceDelete() == null) ? 0 : getForceDelete().hashCode());
        hashCode = prime * hashCode + ((getInstanceEventWindowId() == null) ? 0 : getInstanceEventWindowId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteInstanceEventWindowRequest clone() {
        return (DeleteInstanceEventWindowRequest) super.clone();
    }
}

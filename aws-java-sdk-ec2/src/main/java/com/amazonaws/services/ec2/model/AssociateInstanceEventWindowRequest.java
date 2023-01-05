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
import com.amazonaws.services.ec2.model.transform.AssociateInstanceEventWindowRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateInstanceEventWindowRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<AssociateInstanceEventWindowRequest> {

    /**
     * <p>
     * The ID of the event window.
     * </p>
     */
    private String instanceEventWindowId;
    /**
     * <p>
     * One or more targets associated with the specified event window.
     * </p>
     */
    private InstanceEventWindowAssociationRequest associationTarget;

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

    public AssociateInstanceEventWindowRequest withInstanceEventWindowId(String instanceEventWindowId) {
        setInstanceEventWindowId(instanceEventWindowId);
        return this;
    }

    /**
     * <p>
     * One or more targets associated with the specified event window.
     * </p>
     * 
     * @param associationTarget
     *        One or more targets associated with the specified event window.
     */

    public void setAssociationTarget(InstanceEventWindowAssociationRequest associationTarget) {
        this.associationTarget = associationTarget;
    }

    /**
     * <p>
     * One or more targets associated with the specified event window.
     * </p>
     * 
     * @return One or more targets associated with the specified event window.
     */

    public InstanceEventWindowAssociationRequest getAssociationTarget() {
        return this.associationTarget;
    }

    /**
     * <p>
     * One or more targets associated with the specified event window.
     * </p>
     * 
     * @param associationTarget
     *        One or more targets associated with the specified event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateInstanceEventWindowRequest withAssociationTarget(InstanceEventWindowAssociationRequest associationTarget) {
        setAssociationTarget(associationTarget);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AssociateInstanceEventWindowRequest> getDryRunRequest() {
        Request<AssociateInstanceEventWindowRequest> request = new AssociateInstanceEventWindowRequestMarshaller().marshall(this);
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
        if (getInstanceEventWindowId() != null)
            sb.append("InstanceEventWindowId: ").append(getInstanceEventWindowId()).append(",");
        if (getAssociationTarget() != null)
            sb.append("AssociationTarget: ").append(getAssociationTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateInstanceEventWindowRequest == false)
            return false;
        AssociateInstanceEventWindowRequest other = (AssociateInstanceEventWindowRequest) obj;
        if (other.getInstanceEventWindowId() == null ^ this.getInstanceEventWindowId() == null)
            return false;
        if (other.getInstanceEventWindowId() != null && other.getInstanceEventWindowId().equals(this.getInstanceEventWindowId()) == false)
            return false;
        if (other.getAssociationTarget() == null ^ this.getAssociationTarget() == null)
            return false;
        if (other.getAssociationTarget() != null && other.getAssociationTarget().equals(this.getAssociationTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceEventWindowId() == null) ? 0 : getInstanceEventWindowId().hashCode());
        hashCode = prime * hashCode + ((getAssociationTarget() == null) ? 0 : getAssociationTarget().hashCode());
        return hashCode;
    }

    @Override
    public AssociateInstanceEventWindowRequest clone() {
        return (AssociateInstanceEventWindowRequest) super.clone();
    }
}

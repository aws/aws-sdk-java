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
import com.amazonaws.services.ec2.model.transform.DeleteFleetsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFleetsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteFleetsRequest> {

    /**
     * <p>
     * The IDs of the EC2 Fleets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> fleetIds;
    /**
     * <p>
     * Indicates whether to terminate instances for an EC2 Fleet if it is deleted successfully.
     * </p>
     */
    private Boolean terminateInstances;

    /**
     * <p>
     * The IDs of the EC2 Fleets.
     * </p>
     * 
     * @return The IDs of the EC2 Fleets.
     */

    public java.util.List<String> getFleetIds() {
        if (fleetIds == null) {
            fleetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return fleetIds;
    }

    /**
     * <p>
     * The IDs of the EC2 Fleets.
     * </p>
     * 
     * @param fleetIds
     *        The IDs of the EC2 Fleets.
     */

    public void setFleetIds(java.util.Collection<String> fleetIds) {
        if (fleetIds == null) {
            this.fleetIds = null;
            return;
        }

        this.fleetIds = new com.amazonaws.internal.SdkInternalList<String>(fleetIds);
    }

    /**
     * <p>
     * The IDs of the EC2 Fleets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleetIds(java.util.Collection)} or {@link #withFleetIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param fleetIds
     *        The IDs of the EC2 Fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetsRequest withFleetIds(String... fleetIds) {
        if (this.fleetIds == null) {
            setFleetIds(new com.amazonaws.internal.SdkInternalList<String>(fleetIds.length));
        }
        for (String ele : fleetIds) {
            this.fleetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the EC2 Fleets.
     * </p>
     * 
     * @param fleetIds
     *        The IDs of the EC2 Fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetsRequest withFleetIds(java.util.Collection<String> fleetIds) {
        setFleetIds(fleetIds);
        return this;
    }

    /**
     * <p>
     * Indicates whether to terminate instances for an EC2 Fleet if it is deleted successfully.
     * </p>
     * 
     * @param terminateInstances
     *        Indicates whether to terminate instances for an EC2 Fleet if it is deleted successfully.
     */

    public void setTerminateInstances(Boolean terminateInstances) {
        this.terminateInstances = terminateInstances;
    }

    /**
     * <p>
     * Indicates whether to terminate instances for an EC2 Fleet if it is deleted successfully.
     * </p>
     * 
     * @return Indicates whether to terminate instances for an EC2 Fleet if it is deleted successfully.
     */

    public Boolean getTerminateInstances() {
        return this.terminateInstances;
    }

    /**
     * <p>
     * Indicates whether to terminate instances for an EC2 Fleet if it is deleted successfully.
     * </p>
     * 
     * @param terminateInstances
     *        Indicates whether to terminate instances for an EC2 Fleet if it is deleted successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetsRequest withTerminateInstances(Boolean terminateInstances) {
        setTerminateInstances(terminateInstances);
        return this;
    }

    /**
     * <p>
     * Indicates whether to terminate instances for an EC2 Fleet if it is deleted successfully.
     * </p>
     * 
     * @return Indicates whether to terminate instances for an EC2 Fleet if it is deleted successfully.
     */

    public Boolean isTerminateInstances() {
        return this.terminateInstances;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteFleetsRequest> getDryRunRequest() {
        Request<DeleteFleetsRequest> request = new DeleteFleetsRequestMarshaller().marshall(this);
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
        if (getFleetIds() != null)
            sb.append("FleetIds: ").append(getFleetIds()).append(",");
        if (getTerminateInstances() != null)
            sb.append("TerminateInstances: ").append(getTerminateInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFleetsRequest == false)
            return false;
        DeleteFleetsRequest other = (DeleteFleetsRequest) obj;
        if (other.getFleetIds() == null ^ this.getFleetIds() == null)
            return false;
        if (other.getFleetIds() != null && other.getFleetIds().equals(this.getFleetIds()) == false)
            return false;
        if (other.getTerminateInstances() == null ^ this.getTerminateInstances() == null)
            return false;
        if (other.getTerminateInstances() != null && other.getTerminateInstances().equals(this.getTerminateInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetIds() == null) ? 0 : getFleetIds().hashCode());
        hashCode = prime * hashCode + ((getTerminateInstances() == null) ? 0 : getTerminateInstances().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFleetsRequest clone() {
        return (DeleteFleetsRequest) super.clone();
    }
}

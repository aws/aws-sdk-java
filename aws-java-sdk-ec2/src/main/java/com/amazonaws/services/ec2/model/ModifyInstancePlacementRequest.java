/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyInstancePlacementRequestMarshaller;

/**
 * <p>
 * Contains the parameters for ModifyInstancePlacement.
 * </p>
 */
public class ModifyInstancePlacementRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyInstancePlacementRequest> {

    /**
     * <p>
     * The ID of the instance that you are modifying.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The tenancy of the instance that you are modifying.
     * </p>
     */
    private String tenancy;
    /**
     * <p>
     * The new affinity setting for the instance.
     * </p>
     */
    private String affinity;
    /**
     * <p>
     * The ID of the Dedicated Host that the instance will have affinity with.
     * </p>
     */
    private String hostId;

    /**
     * <p>
     * The ID of the instance that you are modifying.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance that you are modifying.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance that you are modifying.
     * </p>
     * 
     * @return The ID of the instance that you are modifying.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance that you are modifying.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance that you are modifying.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstancePlacementRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance that you are modifying.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance that you are modifying.
     * @see HostTenancy
     */

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * The tenancy of the instance that you are modifying.
     * </p>
     * 
     * @return The tenancy of the instance that you are modifying.
     * @see HostTenancy
     */

    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * <p>
     * The tenancy of the instance that you are modifying.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance that you are modifying.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostTenancy
     */

    public ModifyInstancePlacementRequest withTenancy(String tenancy) {
        setTenancy(tenancy);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance that you are modifying.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance that you are modifying.
     * @see HostTenancy
     */

    public void setTenancy(HostTenancy tenancy) {
        this.tenancy = tenancy.toString();
    }

    /**
     * <p>
     * The tenancy of the instance that you are modifying.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance that you are modifying.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostTenancy
     */

    public ModifyInstancePlacementRequest withTenancy(HostTenancy tenancy) {
        setTenancy(tenancy);
        return this;
    }

    /**
     * <p>
     * The new affinity setting for the instance.
     * </p>
     * 
     * @param affinity
     *        The new affinity setting for the instance.
     * @see Affinity
     */

    public void setAffinity(String affinity) {
        this.affinity = affinity;
    }

    /**
     * <p>
     * The new affinity setting for the instance.
     * </p>
     * 
     * @return The new affinity setting for the instance.
     * @see Affinity
     */

    public String getAffinity() {
        return this.affinity;
    }

    /**
     * <p>
     * The new affinity setting for the instance.
     * </p>
     * 
     * @param affinity
     *        The new affinity setting for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Affinity
     */

    public ModifyInstancePlacementRequest withAffinity(String affinity) {
        setAffinity(affinity);
        return this;
    }

    /**
     * <p>
     * The new affinity setting for the instance.
     * </p>
     * 
     * @param affinity
     *        The new affinity setting for the instance.
     * @see Affinity
     */

    public void setAffinity(Affinity affinity) {
        this.affinity = affinity.toString();
    }

    /**
     * <p>
     * The new affinity setting for the instance.
     * </p>
     * 
     * @param affinity
     *        The new affinity setting for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Affinity
     */

    public ModifyInstancePlacementRequest withAffinity(Affinity affinity) {
        setAffinity(affinity);
        return this;
    }

    /**
     * <p>
     * The ID of the Dedicated Host that the instance will have affinity with.
     * </p>
     * 
     * @param hostId
     *        The ID of the Dedicated Host that the instance will have affinity with.
     */

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host that the instance will have affinity with.
     * </p>
     * 
     * @return The ID of the Dedicated Host that the instance will have affinity with.
     */

    public String getHostId() {
        return this.hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host that the instance will have affinity with.
     * </p>
     * 
     * @param hostId
     *        The ID of the Dedicated Host that the instance will have affinity with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstancePlacementRequest withHostId(String hostId) {
        setHostId(hostId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyInstancePlacementRequest> getDryRunRequest() {
        Request<ModifyInstancePlacementRequest> request = new ModifyInstancePlacementRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getTenancy() != null)
            sb.append("Tenancy: " + getTenancy() + ",");
        if (getAffinity() != null)
            sb.append("Affinity: " + getAffinity() + ",");
        if (getHostId() != null)
            sb.append("HostId: " + getHostId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstancePlacementRequest == false)
            return false;
        ModifyInstancePlacementRequest other = (ModifyInstancePlacementRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        if (other.getAffinity() == null ^ this.getAffinity() == null)
            return false;
        if (other.getAffinity() != null && other.getAffinity().equals(this.getAffinity()) == false)
            return false;
        if (other.getHostId() == null ^ this.getHostId() == null)
            return false;
        if (other.getHostId() != null && other.getHostId().equals(this.getHostId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode + ((getAffinity() == null) ? 0 : getAffinity().hashCode());
        hashCode = prime * hashCode + ((getHostId() == null) ? 0 : getHostId().hashCode());
        return hashCode;
    }

    @Override
    public ModifyInstancePlacementRequest clone() {
        return (ModifyInstancePlacementRequest) super.clone();
    }
}

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
import com.amazonaws.services.ec2.model.transform.ModifyIpamResourceCidrRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyIpamResourceCidrRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyIpamResourceCidrRequest> {

    /**
     * <p>
     * The ID of the resource you want to modify.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The CIDR of the resource you want to modify.
     * </p>
     */
    private String resourceCidr;
    /**
     * <p>
     * The Amazon Web Services Region of the resource you want to modify.
     * </p>
     */
    private String resourceRegion;
    /**
     * <p>
     * The ID of the current scope that the resource CIDR is in.
     * </p>
     */
    private String currentIpamScopeId;
    /**
     * <p>
     * The ID of the scope you want to transfer the resource CIDR to.
     * </p>
     */
    private String destinationIpamScopeId;
    /**
     * <p>
     * Determines if the resource is monitored by IPAM. If a resource is monitored, the resource is discovered by IPAM
     * and you can view details about the resource’s CIDR.
     * </p>
     */
    private Boolean monitored;

    /**
     * <p>
     * The ID of the resource you want to modify.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource you want to modify.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource you want to modify.
     * </p>
     * 
     * @return The ID of the resource you want to modify.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource you want to modify.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamResourceCidrRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The CIDR of the resource you want to modify.
     * </p>
     * 
     * @param resourceCidr
     *        The CIDR of the resource you want to modify.
     */

    public void setResourceCidr(String resourceCidr) {
        this.resourceCidr = resourceCidr;
    }

    /**
     * <p>
     * The CIDR of the resource you want to modify.
     * </p>
     * 
     * @return The CIDR of the resource you want to modify.
     */

    public String getResourceCidr() {
        return this.resourceCidr;
    }

    /**
     * <p>
     * The CIDR of the resource you want to modify.
     * </p>
     * 
     * @param resourceCidr
     *        The CIDR of the resource you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamResourceCidrRequest withResourceCidr(String resourceCidr) {
        setResourceCidr(resourceCidr);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the resource you want to modify.
     * </p>
     * 
     * @param resourceRegion
     *        The Amazon Web Services Region of the resource you want to modify.
     */

    public void setResourceRegion(String resourceRegion) {
        this.resourceRegion = resourceRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the resource you want to modify.
     * </p>
     * 
     * @return The Amazon Web Services Region of the resource you want to modify.
     */

    public String getResourceRegion() {
        return this.resourceRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the resource you want to modify.
     * </p>
     * 
     * @param resourceRegion
     *        The Amazon Web Services Region of the resource you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamResourceCidrRequest withResourceRegion(String resourceRegion) {
        setResourceRegion(resourceRegion);
        return this;
    }

    /**
     * <p>
     * The ID of the current scope that the resource CIDR is in.
     * </p>
     * 
     * @param currentIpamScopeId
     *        The ID of the current scope that the resource CIDR is in.
     */

    public void setCurrentIpamScopeId(String currentIpamScopeId) {
        this.currentIpamScopeId = currentIpamScopeId;
    }

    /**
     * <p>
     * The ID of the current scope that the resource CIDR is in.
     * </p>
     * 
     * @return The ID of the current scope that the resource CIDR is in.
     */

    public String getCurrentIpamScopeId() {
        return this.currentIpamScopeId;
    }

    /**
     * <p>
     * The ID of the current scope that the resource CIDR is in.
     * </p>
     * 
     * @param currentIpamScopeId
     *        The ID of the current scope that the resource CIDR is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamResourceCidrRequest withCurrentIpamScopeId(String currentIpamScopeId) {
        setCurrentIpamScopeId(currentIpamScopeId);
        return this;
    }

    /**
     * <p>
     * The ID of the scope you want to transfer the resource CIDR to.
     * </p>
     * 
     * @param destinationIpamScopeId
     *        The ID of the scope you want to transfer the resource CIDR to.
     */

    public void setDestinationIpamScopeId(String destinationIpamScopeId) {
        this.destinationIpamScopeId = destinationIpamScopeId;
    }

    /**
     * <p>
     * The ID of the scope you want to transfer the resource CIDR to.
     * </p>
     * 
     * @return The ID of the scope you want to transfer the resource CIDR to.
     */

    public String getDestinationIpamScopeId() {
        return this.destinationIpamScopeId;
    }

    /**
     * <p>
     * The ID of the scope you want to transfer the resource CIDR to.
     * </p>
     * 
     * @param destinationIpamScopeId
     *        The ID of the scope you want to transfer the resource CIDR to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamResourceCidrRequest withDestinationIpamScopeId(String destinationIpamScopeId) {
        setDestinationIpamScopeId(destinationIpamScopeId);
        return this;
    }

    /**
     * <p>
     * Determines if the resource is monitored by IPAM. If a resource is monitored, the resource is discovered by IPAM
     * and you can view details about the resource’s CIDR.
     * </p>
     * 
     * @param monitored
     *        Determines if the resource is monitored by IPAM. If a resource is monitored, the resource is discovered by
     *        IPAM and you can view details about the resource’s CIDR.
     */

    public void setMonitored(Boolean monitored) {
        this.monitored = monitored;
    }

    /**
     * <p>
     * Determines if the resource is monitored by IPAM. If a resource is monitored, the resource is discovered by IPAM
     * and you can view details about the resource’s CIDR.
     * </p>
     * 
     * @return Determines if the resource is monitored by IPAM. If a resource is monitored, the resource is discovered
     *         by IPAM and you can view details about the resource’s CIDR.
     */

    public Boolean getMonitored() {
        return this.monitored;
    }

    /**
     * <p>
     * Determines if the resource is monitored by IPAM. If a resource is monitored, the resource is discovered by IPAM
     * and you can view details about the resource’s CIDR.
     * </p>
     * 
     * @param monitored
     *        Determines if the resource is monitored by IPAM. If a resource is monitored, the resource is discovered by
     *        IPAM and you can view details about the resource’s CIDR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamResourceCidrRequest withMonitored(Boolean monitored) {
        setMonitored(monitored);
        return this;
    }

    /**
     * <p>
     * Determines if the resource is monitored by IPAM. If a resource is monitored, the resource is discovered by IPAM
     * and you can view details about the resource’s CIDR.
     * </p>
     * 
     * @return Determines if the resource is monitored by IPAM. If a resource is monitored, the resource is discovered
     *         by IPAM and you can view details about the resource’s CIDR.
     */

    public Boolean isMonitored() {
        return this.monitored;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyIpamResourceCidrRequest> getDryRunRequest() {
        Request<ModifyIpamResourceCidrRequest> request = new ModifyIpamResourceCidrRequestMarshaller().marshall(this);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceCidr() != null)
            sb.append("ResourceCidr: ").append(getResourceCidr()).append(",");
        if (getResourceRegion() != null)
            sb.append("ResourceRegion: ").append(getResourceRegion()).append(",");
        if (getCurrentIpamScopeId() != null)
            sb.append("CurrentIpamScopeId: ").append(getCurrentIpamScopeId()).append(",");
        if (getDestinationIpamScopeId() != null)
            sb.append("DestinationIpamScopeId: ").append(getDestinationIpamScopeId()).append(",");
        if (getMonitored() != null)
            sb.append("Monitored: ").append(getMonitored());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyIpamResourceCidrRequest == false)
            return false;
        ModifyIpamResourceCidrRequest other = (ModifyIpamResourceCidrRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceCidr() == null ^ this.getResourceCidr() == null)
            return false;
        if (other.getResourceCidr() != null && other.getResourceCidr().equals(this.getResourceCidr()) == false)
            return false;
        if (other.getResourceRegion() == null ^ this.getResourceRegion() == null)
            return false;
        if (other.getResourceRegion() != null && other.getResourceRegion().equals(this.getResourceRegion()) == false)
            return false;
        if (other.getCurrentIpamScopeId() == null ^ this.getCurrentIpamScopeId() == null)
            return false;
        if (other.getCurrentIpamScopeId() != null && other.getCurrentIpamScopeId().equals(this.getCurrentIpamScopeId()) == false)
            return false;
        if (other.getDestinationIpamScopeId() == null ^ this.getDestinationIpamScopeId() == null)
            return false;
        if (other.getDestinationIpamScopeId() != null && other.getDestinationIpamScopeId().equals(this.getDestinationIpamScopeId()) == false)
            return false;
        if (other.getMonitored() == null ^ this.getMonitored() == null)
            return false;
        if (other.getMonitored() != null && other.getMonitored().equals(this.getMonitored()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceCidr() == null) ? 0 : getResourceCidr().hashCode());
        hashCode = prime * hashCode + ((getResourceRegion() == null) ? 0 : getResourceRegion().hashCode());
        hashCode = prime * hashCode + ((getCurrentIpamScopeId() == null) ? 0 : getCurrentIpamScopeId().hashCode());
        hashCode = prime * hashCode + ((getDestinationIpamScopeId() == null) ? 0 : getDestinationIpamScopeId().hashCode());
        hashCode = prime * hashCode + ((getMonitored() == null) ? 0 : getMonitored().hashCode());
        return hashCode;
    }

    @Override
    public ModifyIpamResourceCidrRequest clone() {
        return (ModifyIpamResourceCidrRequest) super.clone();
    }
}

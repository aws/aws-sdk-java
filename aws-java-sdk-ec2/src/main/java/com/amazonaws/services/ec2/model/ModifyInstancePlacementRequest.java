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
import com.amazonaws.services.ec2.model.transform.ModifyInstancePlacementRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyInstancePlacementRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyInstancePlacementRequest> {

    /**
     * <p>
     * The affinity setting for the instance.
     * </p>
     */
    private String affinity;
    /**
     * <p>
     * The name of the placement group in which to place the instance. For spread placement groups, the instance must
     * have a tenancy of <code>default</code>. For cluster and partition placement groups, the instance must have a
     * tenancy of <code>default</code> or <code>dedicated</code>.
     * </p>
     * <p>
     * To remove an instance from a placement group, specify an empty string ("").
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The ID of the Dedicated Host with which to associate the instance.
     * </p>
     */
    private String hostId;
    /**
     * <p>
     * The ID of the instance that you are modifying.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The tenancy for the instance.
     * </p>
     */
    private String tenancy;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Integer partitionNumber;

    /**
     * <p>
     * The affinity setting for the instance.
     * </p>
     * 
     * @param affinity
     *        The affinity setting for the instance.
     * @see Affinity
     */

    public void setAffinity(String affinity) {
        this.affinity = affinity;
    }

    /**
     * <p>
     * The affinity setting for the instance.
     * </p>
     * 
     * @return The affinity setting for the instance.
     * @see Affinity
     */

    public String getAffinity() {
        return this.affinity;
    }

    /**
     * <p>
     * The affinity setting for the instance.
     * </p>
     * 
     * @param affinity
     *        The affinity setting for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Affinity
     */

    public ModifyInstancePlacementRequest withAffinity(String affinity) {
        setAffinity(affinity);
        return this;
    }

    /**
     * <p>
     * The affinity setting for the instance.
     * </p>
     * 
     * @param affinity
     *        The affinity setting for the instance.
     * @see Affinity
     */

    public void setAffinity(Affinity affinity) {
        withAffinity(affinity);
    }

    /**
     * <p>
     * The affinity setting for the instance.
     * </p>
     * 
     * @param affinity
     *        The affinity setting for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Affinity
     */

    public ModifyInstancePlacementRequest withAffinity(Affinity affinity) {
        this.affinity = affinity.toString();
        return this;
    }

    /**
     * <p>
     * The name of the placement group in which to place the instance. For spread placement groups, the instance must
     * have a tenancy of <code>default</code>. For cluster and partition placement groups, the instance must have a
     * tenancy of <code>default</code> or <code>dedicated</code>.
     * </p>
     * <p>
     * To remove an instance from a placement group, specify an empty string ("").
     * </p>
     * 
     * @param groupName
     *        The name of the placement group in which to place the instance. For spread placement groups, the instance
     *        must have a tenancy of <code>default</code>. For cluster and partition placement groups, the instance must
     *        have a tenancy of <code>default</code> or <code>dedicated</code>.</p>
     *        <p>
     *        To remove an instance from a placement group, specify an empty string ("").
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the placement group in which to place the instance. For spread placement groups, the instance must
     * have a tenancy of <code>default</code>. For cluster and partition placement groups, the instance must have a
     * tenancy of <code>default</code> or <code>dedicated</code>.
     * </p>
     * <p>
     * To remove an instance from a placement group, specify an empty string ("").
     * </p>
     * 
     * @return The name of the placement group in which to place the instance. For spread placement groups, the instance
     *         must have a tenancy of <code>default</code>. For cluster and partition placement groups, the instance
     *         must have a tenancy of <code>default</code> or <code>dedicated</code>.</p>
     *         <p>
     *         To remove an instance from a placement group, specify an empty string ("").
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the placement group in which to place the instance. For spread placement groups, the instance must
     * have a tenancy of <code>default</code>. For cluster and partition placement groups, the instance must have a
     * tenancy of <code>default</code> or <code>dedicated</code>.
     * </p>
     * <p>
     * To remove an instance from a placement group, specify an empty string ("").
     * </p>
     * 
     * @param groupName
     *        The name of the placement group in which to place the instance. For spread placement groups, the instance
     *        must have a tenancy of <code>default</code>. For cluster and partition placement groups, the instance must
     *        have a tenancy of <code>default</code> or <code>dedicated</code>.</p>
     *        <p>
     *        To remove an instance from a placement group, specify an empty string ("").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstancePlacementRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The ID of the Dedicated Host with which to associate the instance.
     * </p>
     * 
     * @param hostId
     *        The ID of the Dedicated Host with which to associate the instance.
     */

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host with which to associate the instance.
     * </p>
     * 
     * @return The ID of the Dedicated Host with which to associate the instance.
     */

    public String getHostId() {
        return this.hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host with which to associate the instance.
     * </p>
     * 
     * @param hostId
     *        The ID of the Dedicated Host with which to associate the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstancePlacementRequest withHostId(String hostId) {
        setHostId(hostId);
        return this;
    }

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
     * The tenancy for the instance.
     * </p>
     * 
     * @param tenancy
     *        The tenancy for the instance.
     * @see HostTenancy
     */

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * The tenancy for the instance.
     * </p>
     * 
     * @return The tenancy for the instance.
     * @see HostTenancy
     */

    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * <p>
     * The tenancy for the instance.
     * </p>
     * 
     * @param tenancy
     *        The tenancy for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostTenancy
     */

    public ModifyInstancePlacementRequest withTenancy(String tenancy) {
        setTenancy(tenancy);
        return this;
    }

    /**
     * <p>
     * The tenancy for the instance.
     * </p>
     * 
     * @param tenancy
     *        The tenancy for the instance.
     * @see HostTenancy
     */

    public void setTenancy(HostTenancy tenancy) {
        withTenancy(tenancy);
    }

    /**
     * <p>
     * The tenancy for the instance.
     * </p>
     * 
     * @param tenancy
     *        The tenancy for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostTenancy
     */

    public ModifyInstancePlacementRequest withTenancy(HostTenancy tenancy) {
        this.tenancy = tenancy.toString();
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param partitionNumber
     *        Reserved for future use.
     */

    public void setPartitionNumber(Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public Integer getPartitionNumber() {
        return this.partitionNumber;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param partitionNumber
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstancePlacementRequest withPartitionNumber(Integer partitionNumber) {
        setPartitionNumber(partitionNumber);
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
        if (getAffinity() != null)
            sb.append("Affinity: ").append(getAffinity()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getHostId() != null)
            sb.append("HostId: ").append(getHostId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getTenancy() != null)
            sb.append("Tenancy: ").append(getTenancy()).append(",");
        if (getPartitionNumber() != null)
            sb.append("PartitionNumber: ").append(getPartitionNumber());
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
        if (other.getAffinity() == null ^ this.getAffinity() == null)
            return false;
        if (other.getAffinity() != null && other.getAffinity().equals(this.getAffinity()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getHostId() == null ^ this.getHostId() == null)
            return false;
        if (other.getHostId() != null && other.getHostId().equals(this.getHostId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        if (other.getPartitionNumber() == null ^ this.getPartitionNumber() == null)
            return false;
        if (other.getPartitionNumber() != null && other.getPartitionNumber().equals(this.getPartitionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAffinity() == null) ? 0 : getAffinity().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getHostId() == null) ? 0 : getHostId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode + ((getPartitionNumber() == null) ? 0 : getPartitionNumber().hashCode());
        return hashCode;
    }

    @Override
    public ModifyInstancePlacementRequest clone() {
        return (ModifyInstancePlacementRequest) super.clone();
    }
}

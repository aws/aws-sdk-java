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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Whether to delete the instance Elastic IP address.
     * </p>
     */
    private Boolean deleteElasticIp;
    /**
     * <p>
     * Whether to delete the instance's Amazon EBS volumes.
     * </p>
     */
    private Boolean deleteVolumes;

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @return The instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInstanceRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Whether to delete the instance Elastic IP address.
     * </p>
     * 
     * @param deleteElasticIp
     *        Whether to delete the instance Elastic IP address.
     */

    public void setDeleteElasticIp(Boolean deleteElasticIp) {
        this.deleteElasticIp = deleteElasticIp;
    }

    /**
     * <p>
     * Whether to delete the instance Elastic IP address.
     * </p>
     * 
     * @return Whether to delete the instance Elastic IP address.
     */

    public Boolean getDeleteElasticIp() {
        return this.deleteElasticIp;
    }

    /**
     * <p>
     * Whether to delete the instance Elastic IP address.
     * </p>
     * 
     * @param deleteElasticIp
     *        Whether to delete the instance Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInstanceRequest withDeleteElasticIp(Boolean deleteElasticIp) {
        setDeleteElasticIp(deleteElasticIp);
        return this;
    }

    /**
     * <p>
     * Whether to delete the instance Elastic IP address.
     * </p>
     * 
     * @return Whether to delete the instance Elastic IP address.
     */

    public Boolean isDeleteElasticIp() {
        return this.deleteElasticIp;
    }

    /**
     * <p>
     * Whether to delete the instance's Amazon EBS volumes.
     * </p>
     * 
     * @param deleteVolumes
     *        Whether to delete the instance's Amazon EBS volumes.
     */

    public void setDeleteVolumes(Boolean deleteVolumes) {
        this.deleteVolumes = deleteVolumes;
    }

    /**
     * <p>
     * Whether to delete the instance's Amazon EBS volumes.
     * </p>
     * 
     * @return Whether to delete the instance's Amazon EBS volumes.
     */

    public Boolean getDeleteVolumes() {
        return this.deleteVolumes;
    }

    /**
     * <p>
     * Whether to delete the instance's Amazon EBS volumes.
     * </p>
     * 
     * @param deleteVolumes
     *        Whether to delete the instance's Amazon EBS volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInstanceRequest withDeleteVolumes(Boolean deleteVolumes) {
        setDeleteVolumes(deleteVolumes);
        return this;
    }

    /**
     * <p>
     * Whether to delete the instance's Amazon EBS volumes.
     * </p>
     * 
     * @return Whether to delete the instance's Amazon EBS volumes.
     */

    public Boolean isDeleteVolumes() {
        return this.deleteVolumes;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getDeleteElasticIp() != null)
            sb.append("DeleteElasticIp: ").append(getDeleteElasticIp()).append(",");
        if (getDeleteVolumes() != null)
            sb.append("DeleteVolumes: ").append(getDeleteVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInstanceRequest == false)
            return false;
        DeleteInstanceRequest other = (DeleteInstanceRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getDeleteElasticIp() == null ^ this.getDeleteElasticIp() == null)
            return false;
        if (other.getDeleteElasticIp() != null && other.getDeleteElasticIp().equals(this.getDeleteElasticIp()) == false)
            return false;
        if (other.getDeleteVolumes() == null ^ this.getDeleteVolumes() == null)
            return false;
        if (other.getDeleteVolumes() != null && other.getDeleteVolumes().equals(this.getDeleteVolumes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getDeleteElasticIp() == null) ? 0 : getDeleteElasticIp().hashCode());
        hashCode = prime * hashCode + ((getDeleteVolumes() == null) ? 0 : getDeleteVolumes().hashCode());
        return hashCode;
    }

    @Override
    public DeleteInstanceRequest clone() {
        return (DeleteInstanceRequest) super.clone();
    }

}

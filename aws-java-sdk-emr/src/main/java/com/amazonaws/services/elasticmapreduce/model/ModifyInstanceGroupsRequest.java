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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Change the size of some instance groups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ModifyInstanceGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyInstanceGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the cluster to which the instance group belongs.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * Instance groups to change.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceGroupModifyConfig> instanceGroups;

    /**
     * Default constructor for ModifyInstanceGroupsRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public ModifyInstanceGroupsRequest() {
    }

    /**
     * Constructs a new ModifyInstanceGroupsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param instanceGroups
     *        Instance groups to change.
     */
    public ModifyInstanceGroupsRequest(java.util.List<InstanceGroupModifyConfig> instanceGroups) {
        setInstanceGroups(instanceGroups);
    }

    /**
     * <p>
     * The ID of the cluster to which the instance group belongs.
     * </p>
     * 
     * @param clusterId
     *        The ID of the cluster to which the instance group belongs.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The ID of the cluster to which the instance group belongs.
     * </p>
     * 
     * @return The ID of the cluster to which the instance group belongs.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The ID of the cluster to which the instance group belongs.
     * </p>
     * 
     * @param clusterId
     *        The ID of the cluster to which the instance group belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceGroupsRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * Instance groups to change.
     * </p>
     * 
     * @return Instance groups to change.
     */

    public java.util.List<InstanceGroupModifyConfig> getInstanceGroups() {
        if (instanceGroups == null) {
            instanceGroups = new com.amazonaws.internal.SdkInternalList<InstanceGroupModifyConfig>();
        }
        return instanceGroups;
    }

    /**
     * <p>
     * Instance groups to change.
     * </p>
     * 
     * @param instanceGroups
     *        Instance groups to change.
     */

    public void setInstanceGroups(java.util.Collection<InstanceGroupModifyConfig> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
            return;
        }

        this.instanceGroups = new com.amazonaws.internal.SdkInternalList<InstanceGroupModifyConfig>(instanceGroups);
    }

    /**
     * <p>
     * Instance groups to change.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceGroups(java.util.Collection)} or {@link #withInstanceGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceGroups
     *        Instance groups to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceGroupsRequest withInstanceGroups(InstanceGroupModifyConfig... instanceGroups) {
        if (this.instanceGroups == null) {
            setInstanceGroups(new com.amazonaws.internal.SdkInternalList<InstanceGroupModifyConfig>(instanceGroups.length));
        }
        for (InstanceGroupModifyConfig ele : instanceGroups) {
            this.instanceGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Instance groups to change.
     * </p>
     * 
     * @param instanceGroups
     *        Instance groups to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceGroupsRequest withInstanceGroups(java.util.Collection<InstanceGroupModifyConfig> instanceGroups) {
        setInstanceGroups(instanceGroups);
        return this;
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getInstanceGroups() != null)
            sb.append("InstanceGroups: ").append(getInstanceGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstanceGroupsRequest == false)
            return false;
        ModifyInstanceGroupsRequest other = (ModifyInstanceGroupsRequest) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getInstanceGroups() == null ^ this.getInstanceGroups() == null)
            return false;
        if (other.getInstanceGroups() != null && other.getInstanceGroups().equals(this.getInstanceGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getInstanceGroups() == null) ? 0 : getInstanceGroups().hashCode());
        return hashCode;
    }

    @Override
    public ModifyInstanceGroupsRequest clone() {
        return (ModifyInstanceGroupsRequest) super.clone();
    }

}

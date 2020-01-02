/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.ModifyHostsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyHostsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifyHostsRequest> {

    /**
     * <p>
     * Specify whether to enable or disable auto-placement.
     * </p>
     */
    private String autoPlacement;
    /**
     * <p>
     * The IDs of the Dedicated Hosts to modify.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> hostIds;
    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host Recovery</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String hostRecovery;
    /**
     * <p>
     * Specifies the instance type to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated
     * Host to support only a specific instance type.
     * </p>
     * <p>
     * If you want to modify a Dedicated Host to support multiple instance types in its current instance family, omit
     * this parameter and specify <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     * <b>InstanceFamily</b> in the same request.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Specifies the instance family to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated
     * Host to support multiple instance types within its current instance family.
     * </p>
     * <p>
     * If you want to modify a Dedicated Host to support a specific instance type only, omit this parameter and specify
     * <b>InstanceType</b> instead. You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     * request.
     * </p>
     */
    private String instanceFamily;

    /**
     * <p>
     * Specify whether to enable or disable auto-placement.
     * </p>
     * 
     * @param autoPlacement
     *        Specify whether to enable or disable auto-placement.
     * @see AutoPlacement
     */

    public void setAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
    }

    /**
     * <p>
     * Specify whether to enable or disable auto-placement.
     * </p>
     * 
     * @return Specify whether to enable or disable auto-placement.
     * @see AutoPlacement
     */

    public String getAutoPlacement() {
        return this.autoPlacement;
    }

    /**
     * <p>
     * Specify whether to enable or disable auto-placement.
     * </p>
     * 
     * @param autoPlacement
     *        Specify whether to enable or disable auto-placement.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoPlacement
     */

    public ModifyHostsRequest withAutoPlacement(String autoPlacement) {
        setAutoPlacement(autoPlacement);
        return this;
    }

    /**
     * <p>
     * Specify whether to enable or disable auto-placement.
     * </p>
     * 
     * @param autoPlacement
     *        Specify whether to enable or disable auto-placement.
     * @see AutoPlacement
     */

    public void setAutoPlacement(AutoPlacement autoPlacement) {
        withAutoPlacement(autoPlacement);
    }

    /**
     * <p>
     * Specify whether to enable or disable auto-placement.
     * </p>
     * 
     * @param autoPlacement
     *        Specify whether to enable or disable auto-placement.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoPlacement
     */

    public ModifyHostsRequest withAutoPlacement(AutoPlacement autoPlacement) {
        this.autoPlacement = autoPlacement.toString();
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts to modify.
     * </p>
     * 
     * @return The IDs of the Dedicated Hosts to modify.
     */

    public java.util.List<String> getHostIds() {
        if (hostIds == null) {
            hostIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return hostIds;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts to modify.
     * </p>
     * 
     * @param hostIds
     *        The IDs of the Dedicated Hosts to modify.
     */

    public void setHostIds(java.util.Collection<String> hostIds) {
        if (hostIds == null) {
            this.hostIds = null;
            return;
        }

        this.hostIds = new com.amazonaws.internal.SdkInternalList<String>(hostIds);
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts to modify.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHostIds(java.util.Collection)} or {@link #withHostIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param hostIds
     *        The IDs of the Dedicated Hosts to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyHostsRequest withHostIds(String... hostIds) {
        if (this.hostIds == null) {
            setHostIds(new com.amazonaws.internal.SdkInternalList<String>(hostIds.length));
        }
        for (String ele : hostIds) {
            this.hostIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts to modify.
     * </p>
     * 
     * @param hostIds
     *        The IDs of the Dedicated Hosts to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyHostsRequest withHostIds(java.util.Collection<String> hostIds) {
        setHostIds(hostIds);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host Recovery</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param hostRecovery
     *        Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host
     *        Recovery</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see HostRecovery
     */

    public void setHostRecovery(String hostRecovery) {
        this.hostRecovery = hostRecovery;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host Recovery</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host
     *         Recovery</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see HostRecovery
     */

    public String getHostRecovery() {
        return this.hostRecovery;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host Recovery</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param hostRecovery
     *        Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host
     *        Recovery</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostRecovery
     */

    public ModifyHostsRequest withHostRecovery(String hostRecovery) {
        setHostRecovery(hostRecovery);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host Recovery</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param hostRecovery
     *        Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host
     *        Recovery</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see HostRecovery
     */

    public void setHostRecovery(HostRecovery hostRecovery) {
        withHostRecovery(hostRecovery);
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host Recovery</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param hostRecovery
     *        Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host
     *        Recovery</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostRecovery
     */

    public ModifyHostsRequest withHostRecovery(HostRecovery hostRecovery) {
        this.hostRecovery = hostRecovery.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the instance type to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated
     * Host to support only a specific instance type.
     * </p>
     * <p>
     * If you want to modify a Dedicated Host to support multiple instance types in its current instance family, omit
     * this parameter and specify <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     * <b>InstanceFamily</b> in the same request.
     * </p>
     * 
     * @param instanceType
     *        Specifies the instance type to be supported by the Dedicated Host. Specify this parameter to modify a
     *        Dedicated Host to support only a specific instance type.</p>
     *        <p>
     *        If you want to modify a Dedicated Host to support multiple instance types in its current instance family,
     *        omit this parameter and specify <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     *        <b>InstanceFamily</b> in the same request.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * Specifies the instance type to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated
     * Host to support only a specific instance type.
     * </p>
     * <p>
     * If you want to modify a Dedicated Host to support multiple instance types in its current instance family, omit
     * this parameter and specify <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     * <b>InstanceFamily</b> in the same request.
     * </p>
     * 
     * @return Specifies the instance type to be supported by the Dedicated Host. Specify this parameter to modify a
     *         Dedicated Host to support only a specific instance type.</p>
     *         <p>
     *         If you want to modify a Dedicated Host to support multiple instance types in its current instance family,
     *         omit this parameter and specify <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     *         <b>InstanceFamily</b> in the same request.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * Specifies the instance type to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated
     * Host to support only a specific instance type.
     * </p>
     * <p>
     * If you want to modify a Dedicated Host to support multiple instance types in its current instance family, omit
     * this parameter and specify <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     * <b>InstanceFamily</b> in the same request.
     * </p>
     * 
     * @param instanceType
     *        Specifies the instance type to be supported by the Dedicated Host. Specify this parameter to modify a
     *        Dedicated Host to support only a specific instance type.</p>
     *        <p>
     *        If you want to modify a Dedicated Host to support multiple instance types in its current instance family,
     *        omit this parameter and specify <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     *        <b>InstanceFamily</b> in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyHostsRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * Specifies the instance family to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated
     * Host to support multiple instance types within its current instance family.
     * </p>
     * <p>
     * If you want to modify a Dedicated Host to support a specific instance type only, omit this parameter and specify
     * <b>InstanceType</b> instead. You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     * request.
     * </p>
     * 
     * @param instanceFamily
     *        Specifies the instance family to be supported by the Dedicated Host. Specify this parameter to modify a
     *        Dedicated Host to support multiple instance types within its current instance family.</p>
     *        <p>
     *        If you want to modify a Dedicated Host to support a specific instance type only, omit this parameter and
     *        specify <b>InstanceType</b> instead. You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in
     *        the same request.
     */

    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * Specifies the instance family to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated
     * Host to support multiple instance types within its current instance family.
     * </p>
     * <p>
     * If you want to modify a Dedicated Host to support a specific instance type only, omit this parameter and specify
     * <b>InstanceType</b> instead. You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     * request.
     * </p>
     * 
     * @return Specifies the instance family to be supported by the Dedicated Host. Specify this parameter to modify a
     *         Dedicated Host to support multiple instance types within its current instance family.</p>
     *         <p>
     *         If you want to modify a Dedicated Host to support a specific instance type only, omit this parameter and
     *         specify <b>InstanceType</b> instead. You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in
     *         the same request.
     */

    public String getInstanceFamily() {
        return this.instanceFamily;
    }

    /**
     * <p>
     * Specifies the instance family to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated
     * Host to support multiple instance types within its current instance family.
     * </p>
     * <p>
     * If you want to modify a Dedicated Host to support a specific instance type only, omit this parameter and specify
     * <b>InstanceType</b> instead. You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     * request.
     * </p>
     * 
     * @param instanceFamily
     *        Specifies the instance family to be supported by the Dedicated Host. Specify this parameter to modify a
     *        Dedicated Host to support multiple instance types within its current instance family.</p>
     *        <p>
     *        If you want to modify a Dedicated Host to support a specific instance type only, omit this parameter and
     *        specify <b>InstanceType</b> instead. You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in
     *        the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyHostsRequest withInstanceFamily(String instanceFamily) {
        setInstanceFamily(instanceFamily);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyHostsRequest> getDryRunRequest() {
        Request<ModifyHostsRequest> request = new ModifyHostsRequestMarshaller().marshall(this);
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
        if (getAutoPlacement() != null)
            sb.append("AutoPlacement: ").append(getAutoPlacement()).append(",");
        if (getHostIds() != null)
            sb.append("HostIds: ").append(getHostIds()).append(",");
        if (getHostRecovery() != null)
            sb.append("HostRecovery: ").append(getHostRecovery()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: ").append(getInstanceFamily());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyHostsRequest == false)
            return false;
        ModifyHostsRequest other = (ModifyHostsRequest) obj;
        if (other.getAutoPlacement() == null ^ this.getAutoPlacement() == null)
            return false;
        if (other.getAutoPlacement() != null && other.getAutoPlacement().equals(this.getAutoPlacement()) == false)
            return false;
        if (other.getHostIds() == null ^ this.getHostIds() == null)
            return false;
        if (other.getHostIds() != null && other.getHostIds().equals(this.getHostIds()) == false)
            return false;
        if (other.getHostRecovery() == null ^ this.getHostRecovery() == null)
            return false;
        if (other.getHostRecovery() != null && other.getHostRecovery().equals(this.getHostRecovery()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceFamily() == null ^ this.getInstanceFamily() == null)
            return false;
        if (other.getInstanceFamily() != null && other.getInstanceFamily().equals(this.getInstanceFamily()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoPlacement() == null) ? 0 : getAutoPlacement().hashCode());
        hashCode = prime * hashCode + ((getHostIds() == null) ? 0 : getHostIds().hashCode());
        hashCode = prime * hashCode + ((getHostRecovery() == null) ? 0 : getHostRecovery().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        return hashCode;
    }

    @Override
    public ModifyHostsRequest clone() {
        return (ModifyHostsRequest) super.clone();
    }
}

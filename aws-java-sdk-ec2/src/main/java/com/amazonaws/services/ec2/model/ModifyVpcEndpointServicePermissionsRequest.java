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
import com.amazonaws.services.ec2.model.transform.ModifyVpcEndpointServicePermissionsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpcEndpointServicePermissionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyVpcEndpointServicePermissionsRequest> {

    /**
     * <p>
     * The ID of the service.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions are granted to the principals in this
     * list. To grant permissions to all principals, specify an asterisk (*).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> addAllowedPrincipals;
    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions are revoked for principals in this list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removeAllowedPrincipals;

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @return The ID of the service.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServicePermissionsRequest withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions are granted to the principals in this
     * list. To grant permissions to all principals, specify an asterisk (*).
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of one or more principals. Permissions are granted to the principals in
     *         this list. To grant permissions to all principals, specify an asterisk (*).
     */

    public java.util.List<String> getAddAllowedPrincipals() {
        if (addAllowedPrincipals == null) {
            addAllowedPrincipals = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return addAllowedPrincipals;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions are granted to the principals in this
     * list. To grant permissions to all principals, specify an asterisk (*).
     * </p>
     * 
     * @param addAllowedPrincipals
     *        The Amazon Resource Names (ARN) of one or more principals. Permissions are granted to the principals in
     *        this list. To grant permissions to all principals, specify an asterisk (*).
     */

    public void setAddAllowedPrincipals(java.util.Collection<String> addAllowedPrincipals) {
        if (addAllowedPrincipals == null) {
            this.addAllowedPrincipals = null;
            return;
        }

        this.addAllowedPrincipals = new com.amazonaws.internal.SdkInternalList<String>(addAllowedPrincipals);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions are granted to the principals in this
     * list. To grant permissions to all principals, specify an asterisk (*).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddAllowedPrincipals(java.util.Collection)} or {@link #withAddAllowedPrincipals(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param addAllowedPrincipals
     *        The Amazon Resource Names (ARN) of one or more principals. Permissions are granted to the principals in
     *        this list. To grant permissions to all principals, specify an asterisk (*).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServicePermissionsRequest withAddAllowedPrincipals(String... addAllowedPrincipals) {
        if (this.addAllowedPrincipals == null) {
            setAddAllowedPrincipals(new com.amazonaws.internal.SdkInternalList<String>(addAllowedPrincipals.length));
        }
        for (String ele : addAllowedPrincipals) {
            this.addAllowedPrincipals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions are granted to the principals in this
     * list. To grant permissions to all principals, specify an asterisk (*).
     * </p>
     * 
     * @param addAllowedPrincipals
     *        The Amazon Resource Names (ARN) of one or more principals. Permissions are granted to the principals in
     *        this list. To grant permissions to all principals, specify an asterisk (*).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServicePermissionsRequest withAddAllowedPrincipals(java.util.Collection<String> addAllowedPrincipals) {
        setAddAllowedPrincipals(addAllowedPrincipals);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions are revoked for principals in this list.
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of one or more principals. Permissions are revoked for principals in this
     *         list.
     */

    public java.util.List<String> getRemoveAllowedPrincipals() {
        if (removeAllowedPrincipals == null) {
            removeAllowedPrincipals = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removeAllowedPrincipals;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions are revoked for principals in this list.
     * </p>
     * 
     * @param removeAllowedPrincipals
     *        The Amazon Resource Names (ARN) of one or more principals. Permissions are revoked for principals in this
     *        list.
     */

    public void setRemoveAllowedPrincipals(java.util.Collection<String> removeAllowedPrincipals) {
        if (removeAllowedPrincipals == null) {
            this.removeAllowedPrincipals = null;
            return;
        }

        this.removeAllowedPrincipals = new com.amazonaws.internal.SdkInternalList<String>(removeAllowedPrincipals);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions are revoked for principals in this list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveAllowedPrincipals(java.util.Collection)} or
     * {@link #withRemoveAllowedPrincipals(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param removeAllowedPrincipals
     *        The Amazon Resource Names (ARN) of one or more principals. Permissions are revoked for principals in this
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServicePermissionsRequest withRemoveAllowedPrincipals(String... removeAllowedPrincipals) {
        if (this.removeAllowedPrincipals == null) {
            setRemoveAllowedPrincipals(new com.amazonaws.internal.SdkInternalList<String>(removeAllowedPrincipals.length));
        }
        for (String ele : removeAllowedPrincipals) {
            this.removeAllowedPrincipals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions are revoked for principals in this list.
     * </p>
     * 
     * @param removeAllowedPrincipals
     *        The Amazon Resource Names (ARN) of one or more principals. Permissions are revoked for principals in this
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServicePermissionsRequest withRemoveAllowedPrincipals(java.util.Collection<String> removeAllowedPrincipals) {
        setRemoveAllowedPrincipals(removeAllowedPrincipals);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVpcEndpointServicePermissionsRequest> getDryRunRequest() {
        Request<ModifyVpcEndpointServicePermissionsRequest> request = new ModifyVpcEndpointServicePermissionsRequestMarshaller().marshall(this);
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
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getAddAllowedPrincipals() != null)
            sb.append("AddAllowedPrincipals: ").append(getAddAllowedPrincipals()).append(",");
        if (getRemoveAllowedPrincipals() != null)
            sb.append("RemoveAllowedPrincipals: ").append(getRemoveAllowedPrincipals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcEndpointServicePermissionsRequest == false)
            return false;
        ModifyVpcEndpointServicePermissionsRequest other = (ModifyVpcEndpointServicePermissionsRequest) obj;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getAddAllowedPrincipals() == null ^ this.getAddAllowedPrincipals() == null)
            return false;
        if (other.getAddAllowedPrincipals() != null && other.getAddAllowedPrincipals().equals(this.getAddAllowedPrincipals()) == false)
            return false;
        if (other.getRemoveAllowedPrincipals() == null ^ this.getRemoveAllowedPrincipals() == null)
            return false;
        if (other.getRemoveAllowedPrincipals() != null && other.getRemoveAllowedPrincipals().equals(this.getRemoveAllowedPrincipals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getAddAllowedPrincipals() == null) ? 0 : getAddAllowedPrincipals().hashCode());
        hashCode = prime * hashCode + ((getRemoveAllowedPrincipals() == null) ? 0 : getRemoveAllowedPrincipals().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVpcEndpointServicePermissionsRequest clone() {
        return (ModifyVpcEndpointServicePermissionsRequest) super.clone();
    }
}

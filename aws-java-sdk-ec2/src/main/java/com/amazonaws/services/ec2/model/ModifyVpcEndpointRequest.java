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
import com.amazonaws.services.ec2.model.transform.ModifyVpcEndpointRequestMarshaller;

/**
 * <p>
 * Contains the parameters for ModifyVpcEndpoint.
 * </p>
 */
public class ModifyVpcEndpointRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifyVpcEndpointRequest> {

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     */
    private String vpcEndpointId;
    /**
     * <p>
     * Specify <code>true</code> to reset the policy document to the default policy. The default policy allows access to
     * the service.
     * </p>
     */
    private Boolean resetPolicy;
    /**
     * <p>
     * A policy document to attach to the endpoint. The policy must be in valid JSON format.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * One or more route tables IDs to associate with the endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> addRouteTableIds;
    /**
     * <p>
     * One or more route table IDs to disassociate from the endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removeRouteTableIds;

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of the endpoint.
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     * 
     * @return The ID of the endpoint.
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to reset the policy document to the default policy. The default policy allows access to
     * the service.
     * </p>
     * 
     * @param resetPolicy
     *        Specify <code>true</code> to reset the policy document to the default policy. The default policy allows
     *        access to the service.
     */

    public void setResetPolicy(Boolean resetPolicy) {
        this.resetPolicy = resetPolicy;
    }

    /**
     * <p>
     * Specify <code>true</code> to reset the policy document to the default policy. The default policy allows access to
     * the service.
     * </p>
     * 
     * @return Specify <code>true</code> to reset the policy document to the default policy. The default policy allows
     *         access to the service.
     */

    public Boolean getResetPolicy() {
        return this.resetPolicy;
    }

    /**
     * <p>
     * Specify <code>true</code> to reset the policy document to the default policy. The default policy allows access to
     * the service.
     * </p>
     * 
     * @param resetPolicy
     *        Specify <code>true</code> to reset the policy document to the default policy. The default policy allows
     *        access to the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withResetPolicy(Boolean resetPolicy) {
        setResetPolicy(resetPolicy);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to reset the policy document to the default policy. The default policy allows access to
     * the service.
     * </p>
     * 
     * @return Specify <code>true</code> to reset the policy document to the default policy. The default policy allows
     *         access to the service.
     */

    public Boolean isResetPolicy() {
        return this.resetPolicy;
    }

    /**
     * <p>
     * A policy document to attach to the endpoint. The policy must be in valid JSON format.
     * </p>
     * 
     * @param policyDocument
     *        A policy document to attach to the endpoint. The policy must be in valid JSON format.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * A policy document to attach to the endpoint. The policy must be in valid JSON format.
     * </p>
     * 
     * @return A policy document to attach to the endpoint. The policy must be in valid JSON format.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * A policy document to attach to the endpoint. The policy must be in valid JSON format.
     * </p>
     * 
     * @param policyDocument
     *        A policy document to attach to the endpoint. The policy must be in valid JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * One or more route tables IDs to associate with the endpoint.
     * </p>
     * 
     * @return One or more route tables IDs to associate with the endpoint.
     */

    public java.util.List<String> getAddRouteTableIds() {
        if (addRouteTableIds == null) {
            addRouteTableIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return addRouteTableIds;
    }

    /**
     * <p>
     * One or more route tables IDs to associate with the endpoint.
     * </p>
     * 
     * @param addRouteTableIds
     *        One or more route tables IDs to associate with the endpoint.
     */

    public void setAddRouteTableIds(java.util.Collection<String> addRouteTableIds) {
        if (addRouteTableIds == null) {
            this.addRouteTableIds = null;
            return;
        }

        this.addRouteTableIds = new com.amazonaws.internal.SdkInternalList<String>(addRouteTableIds);
    }

    /**
     * <p>
     * One or more route tables IDs to associate with the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddRouteTableIds(java.util.Collection)} or {@link #withAddRouteTableIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param addRouteTableIds
     *        One or more route tables IDs to associate with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withAddRouteTableIds(String... addRouteTableIds) {
        if (this.addRouteTableIds == null) {
            setAddRouteTableIds(new com.amazonaws.internal.SdkInternalList<String>(addRouteTableIds.length));
        }
        for (String ele : addRouteTableIds) {
            this.addRouteTableIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more route tables IDs to associate with the endpoint.
     * </p>
     * 
     * @param addRouteTableIds
     *        One or more route tables IDs to associate with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withAddRouteTableIds(java.util.Collection<String> addRouteTableIds) {
        setAddRouteTableIds(addRouteTableIds);
        return this;
    }

    /**
     * <p>
     * One or more route table IDs to disassociate from the endpoint.
     * </p>
     * 
     * @return One or more route table IDs to disassociate from the endpoint.
     */

    public java.util.List<String> getRemoveRouteTableIds() {
        if (removeRouteTableIds == null) {
            removeRouteTableIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removeRouteTableIds;
    }

    /**
     * <p>
     * One or more route table IDs to disassociate from the endpoint.
     * </p>
     * 
     * @param removeRouteTableIds
     *        One or more route table IDs to disassociate from the endpoint.
     */

    public void setRemoveRouteTableIds(java.util.Collection<String> removeRouteTableIds) {
        if (removeRouteTableIds == null) {
            this.removeRouteTableIds = null;
            return;
        }

        this.removeRouteTableIds = new com.amazonaws.internal.SdkInternalList<String>(removeRouteTableIds);
    }

    /**
     * <p>
     * One or more route table IDs to disassociate from the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveRouteTableIds(java.util.Collection)} or {@link #withRemoveRouteTableIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param removeRouteTableIds
     *        One or more route table IDs to disassociate from the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withRemoveRouteTableIds(String... removeRouteTableIds) {
        if (this.removeRouteTableIds == null) {
            setRemoveRouteTableIds(new com.amazonaws.internal.SdkInternalList<String>(removeRouteTableIds.length));
        }
        for (String ele : removeRouteTableIds) {
            this.removeRouteTableIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more route table IDs to disassociate from the endpoint.
     * </p>
     * 
     * @param removeRouteTableIds
     *        One or more route table IDs to disassociate from the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withRemoveRouteTableIds(java.util.Collection<String> removeRouteTableIds) {
        setRemoveRouteTableIds(removeRouteTableIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVpcEndpointRequest> getDryRunRequest() {
        Request<ModifyVpcEndpointRequest> request = new ModifyVpcEndpointRequestMarshaller().marshall(this);
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
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: " + getVpcEndpointId() + ",");
        if (getResetPolicy() != null)
            sb.append("ResetPolicy: " + getResetPolicy() + ",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (getAddRouteTableIds() != null)
            sb.append("AddRouteTableIds: " + getAddRouteTableIds() + ",");
        if (getRemoveRouteTableIds() != null)
            sb.append("RemoveRouteTableIds: " + getRemoveRouteTableIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcEndpointRequest == false)
            return false;
        ModifyVpcEndpointRequest other = (ModifyVpcEndpointRequest) obj;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getResetPolicy() == null ^ this.getResetPolicy() == null)
            return false;
        if (other.getResetPolicy() != null && other.getResetPolicy().equals(this.getResetPolicy()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getAddRouteTableIds() == null ^ this.getAddRouteTableIds() == null)
            return false;
        if (other.getAddRouteTableIds() != null && other.getAddRouteTableIds().equals(this.getAddRouteTableIds()) == false)
            return false;
        if (other.getRemoveRouteTableIds() == null ^ this.getRemoveRouteTableIds() == null)
            return false;
        if (other.getRemoveRouteTableIds() != null && other.getRemoveRouteTableIds().equals(this.getRemoveRouteTableIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getResetPolicy() == null) ? 0 : getResetPolicy().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getAddRouteTableIds() == null) ? 0 : getAddRouteTableIds().hashCode());
        hashCode = prime * hashCode + ((getRemoveRouteTableIds() == null) ? 0 : getRemoveRouteTableIds().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVpcEndpointRequest clone() {
        return (ModifyVpcEndpointRequest) super.clone();
    }
}

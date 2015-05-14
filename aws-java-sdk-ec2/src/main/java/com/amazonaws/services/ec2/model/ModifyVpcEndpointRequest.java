/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyVpcEndpointRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifyVpcEndpoint(ModifyVpcEndpointRequest) ModifyVpcEndpoint operation}.
 * <p>
 * Modifies attributes of a specified VPC endpoint. You can modify the
 * policy associated with the endpoint, and you can add and remove route
 * tables associated with the endpoint.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifyVpcEndpoint(ModifyVpcEndpointRequest)
 */
public class ModifyVpcEndpointRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifyVpcEndpointRequest> {

    /**
     * The ID of the endpoint.
     */
    private String vpcEndpointId;

    /**
     * Specify <code>true</code> to reset the policy document to the default
     * policy. The default policy allows access to the service.
     */
    private Boolean resetPolicy;

    /**
     * A policy document to attach to the endpoint. The policy must be in
     * valid JSON format.
     */
    private String policyDocument;

    /**
     * One or more route tables IDs to associate with the endpoint.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> addRouteTableIds;

    /**
     * One or more route table IDs to disassociate from the endpoint.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> removeRouteTableIds;

    /**
     * The ID of the endpoint.
     *
     * @return The ID of the endpoint.
     */
    public String getVpcEndpointId() {
        return vpcEndpointId;
    }
    
    /**
     * The ID of the endpoint.
     *
     * @param vpcEndpointId The ID of the endpoint.
     */
    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }
    
    /**
     * The ID of the endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcEndpointId The ID of the endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyVpcEndpointRequest withVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
        return this;
    }

    /**
     * Specify <code>true</code> to reset the policy document to the default
     * policy. The default policy allows access to the service.
     *
     * @return Specify <code>true</code> to reset the policy document to the default
     *         policy. The default policy allows access to the service.
     */
    public Boolean isResetPolicy() {
        return resetPolicy;
    }
    
    /**
     * Specify <code>true</code> to reset the policy document to the default
     * policy. The default policy allows access to the service.
     *
     * @param resetPolicy Specify <code>true</code> to reset the policy document to the default
     *         policy. The default policy allows access to the service.
     */
    public void setResetPolicy(Boolean resetPolicy) {
        this.resetPolicy = resetPolicy;
    }
    
    /**
     * Specify <code>true</code> to reset the policy document to the default
     * policy. The default policy allows access to the service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resetPolicy Specify <code>true</code> to reset the policy document to the default
     *         policy. The default policy allows access to the service.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyVpcEndpointRequest withResetPolicy(Boolean resetPolicy) {
        this.resetPolicy = resetPolicy;
        return this;
    }

    /**
     * Specify <code>true</code> to reset the policy document to the default
     * policy. The default policy allows access to the service.
     *
     * @return Specify <code>true</code> to reset the policy document to the default
     *         policy. The default policy allows access to the service.
     */
    public Boolean getResetPolicy() {
        return resetPolicy;
    }

    /**
     * A policy document to attach to the endpoint. The policy must be in
     * valid JSON format.
     *
     * @return A policy document to attach to the endpoint. The policy must be in
     *         valid JSON format.
     */
    public String getPolicyDocument() {
        return policyDocument;
    }
    
    /**
     * A policy document to attach to the endpoint. The policy must be in
     * valid JSON format.
     *
     * @param policyDocument A policy document to attach to the endpoint. The policy must be in
     *         valid JSON format.
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }
    
    /**
     * A policy document to attach to the endpoint. The policy must be in
     * valid JSON format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyDocument A policy document to attach to the endpoint. The policy must be in
     *         valid JSON format.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyVpcEndpointRequest withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * One or more route tables IDs to associate with the endpoint.
     *
     * @return One or more route tables IDs to associate with the endpoint.
     */
    public java.util.List<String> getAddRouteTableIds() {
        if (addRouteTableIds == null) {
              addRouteTableIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              addRouteTableIds.setAutoConstruct(true);
        }
        return addRouteTableIds;
    }
    
    /**
     * One or more route tables IDs to associate with the endpoint.
     *
     * @param addRouteTableIds One or more route tables IDs to associate with the endpoint.
     */
    public void setAddRouteTableIds(java.util.Collection<String> addRouteTableIds) {
        if (addRouteTableIds == null) {
            this.addRouteTableIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> addRouteTableIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(addRouteTableIds.size());
        addRouteTableIdsCopy.addAll(addRouteTableIds);
        this.addRouteTableIds = addRouteTableIdsCopy;
    }
    
    /**
     * One or more route tables IDs to associate with the endpoint.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAddRouteTableIds(java.util.Collection)} or {@link
     * #withAddRouteTableIds(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param addRouteTableIds One or more route tables IDs to associate with the endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyVpcEndpointRequest withAddRouteTableIds(String... addRouteTableIds) {
        if (getAddRouteTableIds() == null) setAddRouteTableIds(new java.util.ArrayList<String>(addRouteTableIds.length));
        for (String value : addRouteTableIds) {
            getAddRouteTableIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more route tables IDs to associate with the endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param addRouteTableIds One or more route tables IDs to associate with the endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyVpcEndpointRequest withAddRouteTableIds(java.util.Collection<String> addRouteTableIds) {
        if (addRouteTableIds == null) {
            this.addRouteTableIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> addRouteTableIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(addRouteTableIds.size());
            addRouteTableIdsCopy.addAll(addRouteTableIds);
            this.addRouteTableIds = addRouteTableIdsCopy;
        }

        return this;
    }

    /**
     * One or more route table IDs to disassociate from the endpoint.
     *
     * @return One or more route table IDs to disassociate from the endpoint.
     */
    public java.util.List<String> getRemoveRouteTableIds() {
        if (removeRouteTableIds == null) {
              removeRouteTableIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              removeRouteTableIds.setAutoConstruct(true);
        }
        return removeRouteTableIds;
    }
    
    /**
     * One or more route table IDs to disassociate from the endpoint.
     *
     * @param removeRouteTableIds One or more route table IDs to disassociate from the endpoint.
     */
    public void setRemoveRouteTableIds(java.util.Collection<String> removeRouteTableIds) {
        if (removeRouteTableIds == null) {
            this.removeRouteTableIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> removeRouteTableIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(removeRouteTableIds.size());
        removeRouteTableIdsCopy.addAll(removeRouteTableIds);
        this.removeRouteTableIds = removeRouteTableIdsCopy;
    }
    
    /**
     * One or more route table IDs to disassociate from the endpoint.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRemoveRouteTableIds(java.util.Collection)} or
     * {@link #withRemoveRouteTableIds(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param removeRouteTableIds One or more route table IDs to disassociate from the endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyVpcEndpointRequest withRemoveRouteTableIds(String... removeRouteTableIds) {
        if (getRemoveRouteTableIds() == null) setRemoveRouteTableIds(new java.util.ArrayList<String>(removeRouteTableIds.length));
        for (String value : removeRouteTableIds) {
            getRemoveRouteTableIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more route table IDs to disassociate from the endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param removeRouteTableIds One or more route table IDs to disassociate from the endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyVpcEndpointRequest withRemoveRouteTableIds(java.util.Collection<String> removeRouteTableIds) {
        if (removeRouteTableIds == null) {
            this.removeRouteTableIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> removeRouteTableIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(removeRouteTableIds.size());
            removeRouteTableIdsCopy.addAll(removeRouteTableIds);
            this.removeRouteTableIds = removeRouteTableIdsCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ModifyVpcEndpointRequest> getDryRunRequest() {
        Request<ModifyVpcEndpointRequest> request = new ModifyVpcEndpointRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVpcEndpointId() != null) sb.append("VpcEndpointId: " + getVpcEndpointId() + ",");
        if (isResetPolicy() != null) sb.append("ResetPolicy: " + isResetPolicy() + ",");
        if (getPolicyDocument() != null) sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (getAddRouteTableIds() != null) sb.append("AddRouteTableIds: " + getAddRouteTableIds() + ",");
        if (getRemoveRouteTableIds() != null) sb.append("RemoveRouteTableIds: " + getRemoveRouteTableIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode()); 
        hashCode = prime * hashCode + ((isResetPolicy() == null) ? 0 : isResetPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode()); 
        hashCode = prime * hashCode + ((getAddRouteTableIds() == null) ? 0 : getAddRouteTableIds().hashCode()); 
        hashCode = prime * hashCode + ((getRemoveRouteTableIds() == null) ? 0 : getRemoveRouteTableIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyVpcEndpointRequest == false) return false;
        ModifyVpcEndpointRequest other = (ModifyVpcEndpointRequest)obj;
        
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null) return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false) return false; 
        if (other.isResetPolicy() == null ^ this.isResetPolicy() == null) return false;
        if (other.isResetPolicy() != null && other.isResetPolicy().equals(this.isResetPolicy()) == false) return false; 
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null) return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false) return false; 
        if (other.getAddRouteTableIds() == null ^ this.getAddRouteTableIds() == null) return false;
        if (other.getAddRouteTableIds() != null && other.getAddRouteTableIds().equals(this.getAddRouteTableIds()) == false) return false; 
        if (other.getRemoveRouteTableIds() == null ^ this.getRemoveRouteTableIds() == null) return false;
        if (other.getRemoveRouteTableIds() != null && other.getRemoveRouteTableIds().equals(this.getRemoveRouteTableIds()) == false) return false; 
        return true;
    }
    
    @Override
    public ModifyVpcEndpointRequest clone() {
        
            return (ModifyVpcEndpointRequest) super.clone();
    }

}
    
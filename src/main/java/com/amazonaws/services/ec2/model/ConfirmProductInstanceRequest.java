/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.ConfirmProductInstanceRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#confirmProductInstance(ConfirmProductInstanceRequest) ConfirmProductInstance operation}.
 * <p>
 * The ConfirmProductInstance operation returns true if the specified product code is attached to the specified instance. The operation returns false if
 * the product code is not attached to the instance.
 * </p>
 * <p>
 * The ConfirmProductInstance operation can only be executed by the owner of the AMI. This feature is useful when an AMI owner is providing support and
 * wants to verify whether a user's instance is eligible.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#confirmProductInstance(ConfirmProductInstanceRequest)
 */
public class ConfirmProductInstanceRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ConfirmProductInstanceRequest> {

    /**
     * The product code to confirm.
     */
    private String productCode;

    /**
     * The ID of the instance to confirm.
     */
    private String instanceId;

    /**
     * Default constructor for a new ConfirmProductInstanceRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ConfirmProductInstanceRequest() {}
    
    /**
     * Constructs a new ConfirmProductInstanceRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param productCode The product code to confirm.
     * @param instanceId The ID of the instance to confirm.
     */
    public ConfirmProductInstanceRequest(String productCode, String instanceId) {
        setProductCode(productCode);
        setInstanceId(instanceId);
    }

    /**
     * The product code to confirm.
     *
     * @return The product code to confirm.
     */
    public String getProductCode() {
        return productCode;
    }
    
    /**
     * The product code to confirm.
     *
     * @param productCode The product code to confirm.
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    
    /**
     * The product code to confirm.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCode The product code to confirm.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfirmProductInstanceRequest withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    /**
     * The ID of the instance to confirm.
     *
     * @return The ID of the instance to confirm.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance to confirm.
     *
     * @param instanceId The ID of the instance to confirm.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance to confirm.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance to confirm.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfirmProductInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ConfirmProductInstanceRequest> getDryRunRequest() {
        Request<ConfirmProductInstanceRequest> request = new ConfirmProductInstanceRequestMarshaller().marshall(this);
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
        if (getProductCode() != null) sb.append("ProductCode: " + getProductCode() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getProductCode() == null) ? 0 : getProductCode().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfirmProductInstanceRequest == false) return false;
        ConfirmProductInstanceRequest other = (ConfirmProductInstanceRequest)obj;
        
        if (other.getProductCode() == null ^ this.getProductCode() == null) return false;
        if (other.getProductCode() != null && other.getProductCode().equals(this.getProductCode()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        return true;
    }
    
}
    
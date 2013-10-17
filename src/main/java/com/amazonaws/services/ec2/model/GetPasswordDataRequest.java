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
import com.amazonaws.services.ec2.model.transform.GetPasswordDataRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#getPasswordData(GetPasswordDataRequest) GetPasswordData operation}.
 * <p>
 * Retrieves the encrypted administrator password for the instances running Windows.
 * </p>
 * <p>
 * <b>NOTE:</b> The Windows password is only generated the first time an AMI is launched. It is not generated for rebundled AMIs or after the password is
 * changed on an instance. The password is encrypted using the key pair that you provided.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#getPasswordData(GetPasswordDataRequest)
 */
public class GetPasswordDataRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<GetPasswordDataRequest> {

    /**
     * The ID of the instance for which you want the Windows administrator
     * password.
     */
    private String instanceId;

    /**
     * Default constructor for a new GetPasswordDataRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetPasswordDataRequest() {}
    
    /**
     * Constructs a new GetPasswordDataRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceId The ID of the instance for which you want the
     * Windows administrator password.
     */
    public GetPasswordDataRequest(String instanceId) {
        setInstanceId(instanceId);
    }

    /**
     * The ID of the instance for which you want the Windows administrator
     * password.
     *
     * @return The ID of the instance for which you want the Windows administrator
     *         password.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance for which you want the Windows administrator
     * password.
     *
     * @param instanceId The ID of the instance for which you want the Windows administrator
     *         password.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance for which you want the Windows administrator
     * password.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance for which you want the Windows administrator
     *         password.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetPasswordDataRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<GetPasswordDataRequest> getDryRunRequest() {
        Request<GetPasswordDataRequest> request = new GetPasswordDataRequestMarshaller().marshall(this);
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetPasswordDataRequest == false) return false;
        GetPasswordDataRequest other = (GetPasswordDataRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        return true;
    }
    
}
    
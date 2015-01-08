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
import com.amazonaws.services.ec2.model.transform.GetConsoleOutputRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#getConsoleOutput(GetConsoleOutputRequest) GetConsoleOutput operation}.
 * <p>
 * Gets the console output for the specified instance.
 * </p>
 * <p>
 * Instances do not have a physical monitor through which you can view
 * their console output. They also lack physical controls that allow you
 * to power up, reboot, or shut them down. To allow these actions, we
 * provide them through the Amazon EC2 API and command line interface.
 * </p>
 * <p>
 * Instance console output is buffered and posted shortly after instance
 * boot, reboot, and termination. Amazon EC2 preserves the most recent 64
 * KB output which is available for at least one hour after the most
 * recent post.
 * </p>
 * <p>
 * For Linux/Unix instances, the instance console output displays the
 * exact console output that would normally be displayed on a physical
 * monitor attached to a machine. This output is buffered because the
 * instance produces it and then posts it to a store where the instance's
 * owner can retrieve it.
 * </p>
 * <p>
 * For Windows instances, the instance console output displays the last
 * three system event log errors.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#getConsoleOutput(GetConsoleOutputRequest)
 */
public class GetConsoleOutputRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<GetConsoleOutputRequest> {

    /**
     * The ID of the instance.
     */
    private String instanceId;

    /**
     * Default constructor for a new GetConsoleOutputRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetConsoleOutputRequest() {}
    
    /**
     * Constructs a new GetConsoleOutputRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceId The ID of the instance.
     */
    public GetConsoleOutputRequest(String instanceId) {
        setInstanceId(instanceId);
    }

    /**
     * The ID of the instance.
     *
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance.
     *
     * @param instanceId The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetConsoleOutputRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<GetConsoleOutputRequest> getDryRunRequest() {
        Request<GetConsoleOutputRequest> request = new GetConsoleOutputRequestMarshaller().marshall(this);
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

        if (obj instanceof GetConsoleOutputRequest == false) return false;
        GetConsoleOutputRequest other = (GetConsoleOutputRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        return true;
    }
    
}
    
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
import com.amazonaws.services.ec2.model.transform.UnmonitorInstancesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#unmonitorInstances(UnmonitorInstancesRequest) UnmonitorInstances operation}.
 * <p>
 * Disables monitoring for a running instance.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#unmonitorInstances(UnmonitorInstancesRequest)
 */
public class UnmonitorInstancesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<UnmonitorInstancesRequest> {

    /**
     * The list of Amazon EC2 instances on which to disable monitoring.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIds;

    /**
     * Default constructor for a new UnmonitorInstancesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UnmonitorInstancesRequest() {}
    
    /**
     * Constructs a new UnmonitorInstancesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceIds The list of Amazon EC2 instances on which to
     * disable monitoring.
     */
    public UnmonitorInstancesRequest(java.util.List<String> instanceIds) {
        setInstanceIds(instanceIds);
    }

    /**
     * The list of Amazon EC2 instances on which to disable monitoring.
     *
     * @return The list of Amazon EC2 instances on which to disable monitoring.
     */
    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
              instanceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceIds.setAutoConstruct(true);
        }
        return instanceIds;
    }
    
    /**
     * The list of Amazon EC2 instances on which to disable monitoring.
     *
     * @param instanceIds The list of Amazon EC2 instances on which to disable monitoring.
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceIds.size());
        instanceIdsCopy.addAll(instanceIds);
        this.instanceIds = instanceIdsCopy;
    }
    
    /**
     * The list of Amazon EC2 instances on which to disable monitoring.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds The list of Amazon EC2 instances on which to disable monitoring.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UnmonitorInstancesRequest withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) setInstanceIds(new java.util.ArrayList<String>(instanceIds.length));
        for (String value : instanceIds) {
            getInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * The list of Amazon EC2 instances on which to disable monitoring.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds The list of Amazon EC2 instances on which to disable monitoring.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UnmonitorInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceIds.size());
            instanceIdsCopy.addAll(instanceIds);
            this.instanceIds = instanceIdsCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<UnmonitorInstancesRequest> getDryRunRequest() {
        Request<UnmonitorInstancesRequest> request = new UnmonitorInstancesRequestMarshaller().marshall(this);
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
        if (getInstanceIds() != null) sb.append("InstanceIds: " + getInstanceIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UnmonitorInstancesRequest == false) return false;
        UnmonitorInstancesRequest other = (UnmonitorInstancesRequest)obj;
        
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null) return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false) return false; 
        return true;
    }
    
}
    
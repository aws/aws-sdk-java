/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.StartInstancesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#startInstances(StartInstancesRequest) StartInstances operation}.
 * <p>
 * Starts an Amazon EBS-backed AMI that you've previously stopped.
 * </p>
 * <p>
 * Instances that use Amazon EBS volumes as their root devices can be
 * quickly stopped and started. When an instance is stopped, the compute
 * resources are released and you are not billed for hourly instance
 * usage. However, your root partition Amazon EBS volume remains,
 * continues to persist your data, and you are charged for Amazon EBS
 * volume usage. You can restart your instance at any time. Each time you
 * transition an instance from stopped to started, Amazon EC2 charges a
 * full instance hour, even if transitions happen multiple times within a
 * single hour.
 * </p>
 * <p>
 * Before stopping an instance, make sure it is in a state from which it
 * can be restarted. Stopping an instance does not preserve data stored
 * in RAM.
 * </p>
 * <p>
 * Performing this operation on an instance that uses an instance store
 * as its root device returns an error.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html"> Stopping Instances </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#startInstances(StartInstancesRequest)
 */
public class StartInstancesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<StartInstancesRequest> {

    /**
     * One or more instance IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIds;

    /**
     * 
     */
    private String additionalInfo;

    /**
     * Default constructor for a new StartInstancesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public StartInstancesRequest() {}
    
    /**
     * Constructs a new StartInstancesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceIds One or more instance IDs.
     */
    public StartInstancesRequest(java.util.List<String> instanceIds) {
        setInstanceIds(instanceIds);
    }

    /**
     * One or more instance IDs.
     *
     * @return One or more instance IDs.
     */
    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
              instanceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceIds.setAutoConstruct(true);
        }
        return instanceIds;
    }
    
    /**
     * One or more instance IDs.
     *
     * @param instanceIds One or more instance IDs.
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
     * One or more instance IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds One or more instance IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StartInstancesRequest withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) setInstanceIds(new java.util.ArrayList<String>(instanceIds.length));
        for (String value : instanceIds) {
            getInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more instance IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds One or more instance IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StartInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
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
     * 
     *
     * @return 
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }
    
    /**
     * 
     *
     * @param additionalInfo 
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalInfo 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StartInstancesRequest withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<StartInstancesRequest> getDryRunRequest() {
        Request<StartInstancesRequest> request = new StartInstancesRequestMarshaller().marshall(this);
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
        if (getInstanceIds() != null) sb.append("InstanceIds: " + getInstanceIds() + ",");
        if (getAdditionalInfo() != null) sb.append("AdditionalInfo: " + getAdditionalInfo() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode()); 
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StartInstancesRequest == false) return false;
        StartInstancesRequest other = (StartInstancesRequest)obj;
        
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null) return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false) return false; 
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null) return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false) return false; 
        return true;
    }
    
}
    
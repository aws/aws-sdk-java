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
import com.amazonaws.services.ec2.model.transform.StopInstancesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#stopInstances(StopInstancesRequest) StopInstances operation}.
 * <p>
 * Stops an Amazon EBS-backed instance. Each time you transition an
 * instance from stopped to started, Amazon EC2 charges a full instance
 * hour, even if transitions happen multiple times within a single hour.
 * </p>
 * <p>
 * You can't start or stop Spot Instances.
 * </p>
 * <p>
 * Instances that use Amazon EBS volumes as their root devices can be
 * quickly stopped and started. When an instance is stopped, the compute
 * resources are released and you are not billed for hourly instance
 * usage. However, your root partition Amazon EBS volume remains,
 * continues to persist your data, and you are charged for Amazon EBS
 * volume usage. You can restart your instance at any time.
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
 * You can stop, start, and terminate EBS-backed instances. You can only
 * terminate instance store-backed instances. What happens to an instance
 * differs if you stop it or terminate it. For example, when you stop an
 * instance, the root device and any other devices attached to the
 * instance persist. When you terminate an instance, the root device and
 * any other devices attached during the instance launch are
 * automatically deleted. For more information about the differences
 * between stopping and terminating instances, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html"> Instance Lifecycle </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 * <p>
 * For more information about troubleshooting, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesStopping.html"> Troubleshooting Stopping Your Instance </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#stopInstances(StopInstancesRequest)
 */
public class StopInstancesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<StopInstancesRequest> {

    /**
     * One or more instance IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIds;

    /**
     * Forces the instances to stop. The instances do not have an opportunity
     * to flush file system caches or file system metadata. If you use this
     * option, you must perform file system check and repair procedures. This
     * option is not recommended for Windows instances. <p>Default:
     * <code>false</code>
     */
    private Boolean force;

    /**
     * Default constructor for a new StopInstancesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public StopInstancesRequest() {}
    
    /**
     * Constructs a new StopInstancesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceIds One or more instance IDs.
     */
    public StopInstancesRequest(java.util.List<String> instanceIds) {
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
    public StopInstancesRequest withInstanceIds(String... instanceIds) {
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
    public StopInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
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
     * Forces the instances to stop. The instances do not have an opportunity
     * to flush file system caches or file system metadata. If you use this
     * option, you must perform file system check and repair procedures. This
     * option is not recommended for Windows instances. <p>Default:
     * <code>false</code>
     *
     * @return Forces the instances to stop. The instances do not have an opportunity
     *         to flush file system caches or file system metadata. If you use this
     *         option, you must perform file system check and repair procedures. This
     *         option is not recommended for Windows instances. <p>Default:
     *         <code>false</code>
     */
    public Boolean isForce() {
        return force;
    }
    
    /**
     * Forces the instances to stop. The instances do not have an opportunity
     * to flush file system caches or file system metadata. If you use this
     * option, you must perform file system check and repair procedures. This
     * option is not recommended for Windows instances. <p>Default:
     * <code>false</code>
     *
     * @param force Forces the instances to stop. The instances do not have an opportunity
     *         to flush file system caches or file system metadata. If you use this
     *         option, you must perform file system check and repair procedures. This
     *         option is not recommended for Windows instances. <p>Default:
     *         <code>false</code>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }
    
    /**
     * Forces the instances to stop. The instances do not have an opportunity
     * to flush file system caches or file system metadata. If you use this
     * option, you must perform file system check and repair procedures. This
     * option is not recommended for Windows instances. <p>Default:
     * <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param force Forces the instances to stop. The instances do not have an opportunity
     *         to flush file system caches or file system metadata. If you use this
     *         option, you must perform file system check and repair procedures. This
     *         option is not recommended for Windows instances. <p>Default:
     *         <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StopInstancesRequest withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * Forces the instances to stop. The instances do not have an opportunity
     * to flush file system caches or file system metadata. If you use this
     * option, you must perform file system check and repair procedures. This
     * option is not recommended for Windows instances. <p>Default:
     * <code>false</code>
     *
     * @return Forces the instances to stop. The instances do not have an opportunity
     *         to flush file system caches or file system metadata. If you use this
     *         option, you must perform file system check and repair procedures. This
     *         option is not recommended for Windows instances. <p>Default:
     *         <code>false</code>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<StopInstancesRequest> getDryRunRequest() {
        Request<StopInstancesRequest> request = new StopInstancesRequestMarshaller().marshall(this);
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
        if (isForce() != null) sb.append("Force: " + isForce() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode()); 
        hashCode = prime * hashCode + ((isForce() == null) ? 0 : isForce().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StopInstancesRequest == false) return false;
        StopInstancesRequest other = (StopInstancesRequest)obj;
        
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null) return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false) return false; 
        if (other.isForce() == null ^ this.isForce() == null) return false;
        if (other.isForce() != null && other.isForce().equals(this.isForce()) == false) return false; 
        return true;
    }
    
}
    
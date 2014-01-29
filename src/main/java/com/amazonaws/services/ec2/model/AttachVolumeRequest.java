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
import com.amazonaws.services.ec2.model.transform.AttachVolumeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#attachVolume(AttachVolumeRequest) AttachVolume operation}.
 * <p>
 * Attaches an Amazon EBS volume to a running or stopped instance and exposes it to the instance with the specified device name.
 * </p>
 * <p>
 * For a list of supported device names, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-attaching-volume.html"> Attaching an Amazon
 * EBS Volume to an Instance </a> . Any device names that aren't reserved for instance store volumes can be used for Amazon EBS volumes. For more
 * information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html"> Amazon EC2 Instance Store </a> in the <i>Amazon
 * Elastic Compute Cloud User Guide</i> .
 * </p>
 * <p>
 * If a volume has an AWS Marketplace product code:
 * </p>
 * 
 * <ul>
 * <li>The volume can only be attached as the root device of a stopped instance.</li>
 * <li>You must be subscribed to the AWS Marketplace code that is on the volume.</li>
 * <li>The configuration (instance type, operating system) of the instance must support that specific AWS Marketplace code. For example, you cannot take
 * a volume from a Windows instance and attach it to a Linux instance.</li>
 * <li>AWS Marketplace product codes are copied from the volume to the instance.</li>
 * 
 * </ul>
 * <p>
 * For an overview of the AWS Marketplace, see <a href="https://aws.amazon.com/marketplace/help/200900000">
 * https://aws.amazon.com/marketplace/help/200900000 </a> . For more information about how to use the AWS Marketplace, see <a
 * href="https://aws.amazon.com/marketplace"> AWS Marketplace </a> .
 * </p>
 * <p>
 * For more information about Amazon EBS volumes, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-attaching-volume.html"> Attaching
 * Amazon EBS Volumes </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#attachVolume(AttachVolumeRequest)
 */
public class AttachVolumeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<AttachVolumeRequest> {

    /**
     * The ID of the Amazon EBS volume. The volume and instance must be
     * within the same Availability Zone.
     */
    private String volumeId;

    /**
     * The ID of the instance.
     */
    private String instanceId;

    /**
     * The device name to expose to the instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     */
    private String device;

    /**
     * Default constructor for a new AttachVolumeRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AttachVolumeRequest() {}
    
    /**
     * Constructs a new AttachVolumeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param volumeId The ID of the Amazon EBS volume. The volume and
     * instance must be within the same Availability Zone.
     * @param instanceId The ID of the instance.
     * @param device The device name to expose to the instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     */
    public AttachVolumeRequest(String volumeId, String instanceId, String device) {
        setVolumeId(volumeId);
        setInstanceId(instanceId);
        setDevice(device);
    }

    /**
     * The ID of the Amazon EBS volume. The volume and instance must be
     * within the same Availability Zone.
     *
     * @return The ID of the Amazon EBS volume. The volume and instance must be
     *         within the same Availability Zone.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The ID of the Amazon EBS volume. The volume and instance must be
     * within the same Availability Zone.
     *
     * @param volumeId The ID of the Amazon EBS volume. The volume and instance must be
     *         within the same Availability Zone.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The ID of the Amazon EBS volume. The volume and instance must be
     * within the same Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The ID of the Amazon EBS volume. The volume and instance must be
     *         within the same Availability Zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttachVolumeRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
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
    public AttachVolumeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The device name to expose to the instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     *
     * @return The device name to expose to the instance (for example,
     *         <code>/dev/sdh</code> or <code>xvdh</code>).
     */
    public String getDevice() {
        return device;
    }
    
    /**
     * The device name to expose to the instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     *
     * @param device The device name to expose to the instance (for example,
     *         <code>/dev/sdh</code> or <code>xvdh</code>).
     */
    public void setDevice(String device) {
        this.device = device;
    }
    
    /**
     * The device name to expose to the instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param device The device name to expose to the instance (for example,
     *         <code>/dev/sdh</code> or <code>xvdh</code>).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttachVolumeRequest withDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<AttachVolumeRequest> getDryRunRequest() {
        Request<AttachVolumeRequest> request = new AttachVolumeRequestMarshaller().marshall(this);
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
        if (getVolumeId() != null) sb.append("VolumeId: " + getVolumeId() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getDevice() != null) sb.append("Device: " + getDevice() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AttachVolumeRequest == false) return false;
        AttachVolumeRequest other = (AttachVolumeRequest)obj;
        
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getDevice() == null ^ this.getDevice() == null) return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false) return false; 
        return true;
    }
    
}
    
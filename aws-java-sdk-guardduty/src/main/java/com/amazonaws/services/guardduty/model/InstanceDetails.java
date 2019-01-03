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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The information about the EC2 instance associated with the activity that prompted GuardDuty to generate a finding.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/InstanceDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceDetails implements Serializable, Cloneable, StructuredPojo {

    /** The availability zone of the EC2 instance. */
    private String availabilityZone;

    private IamInstanceProfile iamInstanceProfile;
    /** The image description of the EC2 instance. */
    private String imageDescription;
    /** The image ID of the EC2 instance. */
    private String imageId;
    /** The ID of the EC2 instance. */
    private String instanceId;
    /** The state of the EC2 instance. */
    private String instanceState;
    /** The type of the EC2 instance. */
    private String instanceType;
    /** The launch time of the EC2 instance. */
    private String launchTime;
    /** The network interface information of the EC2 instance. */
    private java.util.List<NetworkInterface> networkInterfaces;
    /** The platform of the EC2 instance. */
    private String platform;
    /** The product code of the EC2 instance. */
    private java.util.List<ProductCode> productCodes;
    /** The tags of the EC2 instance. */
    private java.util.List<Tag> tags;

    /**
     * The availability zone of the EC2 instance.
     * 
     * @param availabilityZone
     *        The availability zone of the EC2 instance.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * The availability zone of the EC2 instance.
     * 
     * @return The availability zone of the EC2 instance.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * The availability zone of the EC2 instance.
     * 
     * @param availabilityZone
     *        The availability zone of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * @param iamInstanceProfile
     */

    public void setIamInstanceProfile(IamInstanceProfile iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * @return
     */

    public IamInstanceProfile getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    /**
     * @param iamInstanceProfile
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withIamInstanceProfile(IamInstanceProfile iamInstanceProfile) {
        setIamInstanceProfile(iamInstanceProfile);
        return this;
    }

    /**
     * The image description of the EC2 instance.
     * 
     * @param imageDescription
     *        The image description of the EC2 instance.
     */

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    /**
     * The image description of the EC2 instance.
     * 
     * @return The image description of the EC2 instance.
     */

    public String getImageDescription() {
        return this.imageDescription;
    }

    /**
     * The image description of the EC2 instance.
     * 
     * @param imageDescription
     *        The image description of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withImageDescription(String imageDescription) {
        setImageDescription(imageDescription);
        return this;
    }

    /**
     * The image ID of the EC2 instance.
     * 
     * @param imageId
     *        The image ID of the EC2 instance.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * The image ID of the EC2 instance.
     * 
     * @return The image ID of the EC2 instance.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * The image ID of the EC2 instance.
     * 
     * @param imageId
     *        The image ID of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * The ID of the EC2 instance.
     * 
     * @param instanceId
     *        The ID of the EC2 instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * The ID of the EC2 instance.
     * 
     * @return The ID of the EC2 instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * The ID of the EC2 instance.
     * 
     * @param instanceId
     *        The ID of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * The state of the EC2 instance.
     * 
     * @param instanceState
     *        The state of the EC2 instance.
     */

    public void setInstanceState(String instanceState) {
        this.instanceState = instanceState;
    }

    /**
     * The state of the EC2 instance.
     * 
     * @return The state of the EC2 instance.
     */

    public String getInstanceState() {
        return this.instanceState;
    }

    /**
     * The state of the EC2 instance.
     * 
     * @param instanceState
     *        The state of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withInstanceState(String instanceState) {
        setInstanceState(instanceState);
        return this;
    }

    /**
     * The type of the EC2 instance.
     * 
     * @param instanceType
     *        The type of the EC2 instance.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * The type of the EC2 instance.
     * 
     * @return The type of the EC2 instance.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * The type of the EC2 instance.
     * 
     * @param instanceType
     *        The type of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * The launch time of the EC2 instance.
     * 
     * @param launchTime
     *        The launch time of the EC2 instance.
     */

    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
    }

    /**
     * The launch time of the EC2 instance.
     * 
     * @return The launch time of the EC2 instance.
     */

    public String getLaunchTime() {
        return this.launchTime;
    }

    /**
     * The launch time of the EC2 instance.
     * 
     * @param launchTime
     *        The launch time of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withLaunchTime(String launchTime) {
        setLaunchTime(launchTime);
        return this;
    }

    /**
     * The network interface information of the EC2 instance.
     * 
     * @return The network interface information of the EC2 instance.
     */

    public java.util.List<NetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * The network interface information of the EC2 instance.
     * 
     * @param networkInterfaces
     *        The network interface information of the EC2 instance.
     */

    public void setNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new java.util.ArrayList<NetworkInterface>(networkInterfaces);
    }

    /**
     * The network interface information of the EC2 instance.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interface information of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withNetworkInterfaces(NetworkInterface... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new java.util.ArrayList<NetworkInterface>(networkInterfaces.length));
        }
        for (NetworkInterface ele : networkInterfaces) {
            this.networkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * The network interface information of the EC2 instance.
     * 
     * @param networkInterfaces
     *        The network interface information of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * The platform of the EC2 instance.
     * 
     * @param platform
     *        The platform of the EC2 instance.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * The platform of the EC2 instance.
     * 
     * @return The platform of the EC2 instance.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * The platform of the EC2 instance.
     * 
     * @param platform
     *        The platform of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * The product code of the EC2 instance.
     * 
     * @return The product code of the EC2 instance.
     */

    public java.util.List<ProductCode> getProductCodes() {
        return productCodes;
    }

    /**
     * The product code of the EC2 instance.
     * 
     * @param productCodes
     *        The product code of the EC2 instance.
     */

    public void setProductCodes(java.util.Collection<ProductCode> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
            return;
        }

        this.productCodes = new java.util.ArrayList<ProductCode>(productCodes);
    }

    /**
     * The product code of the EC2 instance.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductCodes(java.util.Collection)} or {@link #withProductCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param productCodes
     *        The product code of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withProductCodes(ProductCode... productCodes) {
        if (this.productCodes == null) {
            setProductCodes(new java.util.ArrayList<ProductCode>(productCodes.length));
        }
        for (ProductCode ele : productCodes) {
            this.productCodes.add(ele);
        }
        return this;
    }

    /**
     * The product code of the EC2 instance.
     * 
     * @param productCodes
     *        The product code of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withProductCodes(java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * The tags of the EC2 instance.
     * 
     * @return The tags of the EC2 instance.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * The tags of the EC2 instance.
     * 
     * @param tags
     *        The tags of the EC2 instance.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * The tags of the EC2 instance.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * The tags of the EC2 instance.
     * 
     * @param tags
     *        The tags of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: ").append(getIamInstanceProfile()).append(",");
        if (getImageDescription() != null)
            sb.append("ImageDescription: ").append(getImageDescription()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getInstanceState() != null)
            sb.append("InstanceState: ").append(getInstanceState()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getLaunchTime() != null)
            sb.append("LaunchTime: ").append(getLaunchTime()).append(",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: ").append(getNetworkInterfaces()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: ").append(getProductCodes()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceDetails == false)
            return false;
        InstanceDetails other = (InstanceDetails) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getImageDescription() == null ^ this.getImageDescription() == null)
            return false;
        if (other.getImageDescription() != null && other.getImageDescription().equals(this.getImageDescription()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceState() == null ^ this.getInstanceState() == null)
            return false;
        if (other.getInstanceState() != null && other.getInstanceState().equals(this.getInstanceState()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getLaunchTime() == null ^ this.getLaunchTime() == null)
            return false;
        if (other.getLaunchTime() != null && other.getLaunchTime().equals(this.getLaunchTime()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getImageDescription() == null) ? 0 : getImageDescription().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceState() == null) ? 0 : getInstanceState().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getLaunchTime() == null) ? 0 : getLaunchTime().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public InstanceDetails clone() {
        try {
            return (InstanceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.InstanceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

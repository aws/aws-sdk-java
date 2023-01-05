/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.EnableFastLaunchRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableFastLaunchRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<EnableFastLaunchRequest> {

    /**
     * <p>
     * The ID of the image for which you’re enabling faster launching.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The type of resource to use for pre-provisioning the Windows AMI for faster launching. Supported values include:
     * <code>snapshot</code>, which is the default value.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Configuration settings for creating and managing the snapshots that are used for pre-provisioning the Windows AMI
     * for faster launching. The associated <code>ResourceType</code> must be <code>snapshot</code>.
     * </p>
     */
    private FastLaunchSnapshotConfigurationRequest snapshotConfiguration;
    /**
     * <p>
     * The launch template to use when launching Windows instances from pre-provisioned snapshots. Launch template
     * parameters can include either the name or ID of the launch template, but not both.
     * </p>
     */
    private FastLaunchLaunchTemplateSpecificationRequest launchTemplate;
    /**
     * <p>
     * The maximum number of parallel instances to launch for creating resources. Value must be <code>6</code> or
     * greater.
     * </p>
     */
    private Integer maxParallelLaunches;

    /**
     * <p>
     * The ID of the image for which you’re enabling faster launching.
     * </p>
     * 
     * @param imageId
     *        The ID of the image for which you’re enabling faster launching.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the image for which you’re enabling faster launching.
     * </p>
     * 
     * @return The ID of the image for which you’re enabling faster launching.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the image for which you’re enabling faster launching.
     * </p>
     * 
     * @param imageId
     *        The ID of the image for which you’re enabling faster launching.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastLaunchRequest withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The type of resource to use for pre-provisioning the Windows AMI for faster launching. Supported values include:
     * <code>snapshot</code>, which is the default value.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to use for pre-provisioning the Windows AMI for faster launching. Supported values
     *        include: <code>snapshot</code>, which is the default value.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource to use for pre-provisioning the Windows AMI for faster launching. Supported values include:
     * <code>snapshot</code>, which is the default value.
     * </p>
     * 
     * @return The type of resource to use for pre-provisioning the Windows AMI for faster launching. Supported values
     *         include: <code>snapshot</code>, which is the default value.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource to use for pre-provisioning the Windows AMI for faster launching. Supported values include:
     * <code>snapshot</code>, which is the default value.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to use for pre-provisioning the Windows AMI for faster launching. Supported values
     *        include: <code>snapshot</code>, which is the default value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastLaunchRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Configuration settings for creating and managing the snapshots that are used for pre-provisioning the Windows AMI
     * for faster launching. The associated <code>ResourceType</code> must be <code>snapshot</code>.
     * </p>
     * 
     * @param snapshotConfiguration
     *        Configuration settings for creating and managing the snapshots that are used for pre-provisioning the
     *        Windows AMI for faster launching. The associated <code>ResourceType</code> must be <code>snapshot</code>.
     */

    public void setSnapshotConfiguration(FastLaunchSnapshotConfigurationRequest snapshotConfiguration) {
        this.snapshotConfiguration = snapshotConfiguration;
    }

    /**
     * <p>
     * Configuration settings for creating and managing the snapshots that are used for pre-provisioning the Windows AMI
     * for faster launching. The associated <code>ResourceType</code> must be <code>snapshot</code>.
     * </p>
     * 
     * @return Configuration settings for creating and managing the snapshots that are used for pre-provisioning the
     *         Windows AMI for faster launching. The associated <code>ResourceType</code> must be <code>snapshot</code>.
     */

    public FastLaunchSnapshotConfigurationRequest getSnapshotConfiguration() {
        return this.snapshotConfiguration;
    }

    /**
     * <p>
     * Configuration settings for creating and managing the snapshots that are used for pre-provisioning the Windows AMI
     * for faster launching. The associated <code>ResourceType</code> must be <code>snapshot</code>.
     * </p>
     * 
     * @param snapshotConfiguration
     *        Configuration settings for creating and managing the snapshots that are used for pre-provisioning the
     *        Windows AMI for faster launching. The associated <code>ResourceType</code> must be <code>snapshot</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastLaunchRequest withSnapshotConfiguration(FastLaunchSnapshotConfigurationRequest snapshotConfiguration) {
        setSnapshotConfiguration(snapshotConfiguration);
        return this;
    }

    /**
     * <p>
     * The launch template to use when launching Windows instances from pre-provisioned snapshots. Launch template
     * parameters can include either the name or ID of the launch template, but not both.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template to use when launching Windows instances from pre-provisioned snapshots. Launch
     *        template parameters can include either the name or ID of the launch template, but not both.
     */

    public void setLaunchTemplate(FastLaunchLaunchTemplateSpecificationRequest launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The launch template to use when launching Windows instances from pre-provisioned snapshots. Launch template
     * parameters can include either the name or ID of the launch template, but not both.
     * </p>
     * 
     * @return The launch template to use when launching Windows instances from pre-provisioned snapshots. Launch
     *         template parameters can include either the name or ID of the launch template, but not both.
     */

    public FastLaunchLaunchTemplateSpecificationRequest getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * The launch template to use when launching Windows instances from pre-provisioned snapshots. Launch template
     * parameters can include either the name or ID of the launch template, but not both.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template to use when launching Windows instances from pre-provisioned snapshots. Launch
     *        template parameters can include either the name or ID of the launch template, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastLaunchRequest withLaunchTemplate(FastLaunchLaunchTemplateSpecificationRequest launchTemplate) {
        setLaunchTemplate(launchTemplate);
        return this;
    }

    /**
     * <p>
     * The maximum number of parallel instances to launch for creating resources. Value must be <code>6</code> or
     * greater.
     * </p>
     * 
     * @param maxParallelLaunches
     *        The maximum number of parallel instances to launch for creating resources. Value must be <code>6</code> or
     *        greater.
     */

    public void setMaxParallelLaunches(Integer maxParallelLaunches) {
        this.maxParallelLaunches = maxParallelLaunches;
    }

    /**
     * <p>
     * The maximum number of parallel instances to launch for creating resources. Value must be <code>6</code> or
     * greater.
     * </p>
     * 
     * @return The maximum number of parallel instances to launch for creating resources. Value must be <code>6</code>
     *         or greater.
     */

    public Integer getMaxParallelLaunches() {
        return this.maxParallelLaunches;
    }

    /**
     * <p>
     * The maximum number of parallel instances to launch for creating resources. Value must be <code>6</code> or
     * greater.
     * </p>
     * 
     * @param maxParallelLaunches
     *        The maximum number of parallel instances to launch for creating resources. Value must be <code>6</code> or
     *        greater.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastLaunchRequest withMaxParallelLaunches(Integer maxParallelLaunches) {
        setMaxParallelLaunches(maxParallelLaunches);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<EnableFastLaunchRequest> getDryRunRequest() {
        Request<EnableFastLaunchRequest> request = new EnableFastLaunchRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getSnapshotConfiguration() != null)
            sb.append("SnapshotConfiguration: ").append(getSnapshotConfiguration()).append(",");
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: ").append(getLaunchTemplate()).append(",");
        if (getMaxParallelLaunches() != null)
            sb.append("MaxParallelLaunches: ").append(getMaxParallelLaunches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableFastLaunchRequest == false)
            return false;
        EnableFastLaunchRequest other = (EnableFastLaunchRequest) obj;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSnapshotConfiguration() == null ^ this.getSnapshotConfiguration() == null)
            return false;
        if (other.getSnapshotConfiguration() != null && other.getSnapshotConfiguration().equals(this.getSnapshotConfiguration()) == false)
            return false;
        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
            return false;
        if (other.getMaxParallelLaunches() == null ^ this.getMaxParallelLaunches() == null)
            return false;
        if (other.getMaxParallelLaunches() != null && other.getMaxParallelLaunches().equals(this.getMaxParallelLaunches()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSnapshotConfiguration() == null) ? 0 : getSnapshotConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        hashCode = prime * hashCode + ((getMaxParallelLaunches() == null) ? 0 : getMaxParallelLaunches().hashCode());
        return hashCode;
    }

    @Override
    public EnableFastLaunchRequest clone() {
        return (EnableFastLaunchRequest) super.clone();
    }
}

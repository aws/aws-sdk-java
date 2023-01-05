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
import com.amazonaws.services.ec2.model.transform.DisableFastLaunchRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableFastLaunchRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DisableFastLaunchRequest> {

    /**
     * <p>
     * The ID of the image for which you’re turning off faster launching, and removing pre-provisioned snapshots.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * Forces the image settings to turn off faster launching for your Windows AMI. This parameter overrides any errors
     * that are encountered while cleaning up resources in your account.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The ID of the image for which you’re turning off faster launching, and removing pre-provisioned snapshots.
     * </p>
     * 
     * @param imageId
     *        The ID of the image for which you’re turning off faster launching, and removing pre-provisioned snapshots.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the image for which you’re turning off faster launching, and removing pre-provisioned snapshots.
     * </p>
     * 
     * @return The ID of the image for which you’re turning off faster launching, and removing pre-provisioned
     *         snapshots.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the image for which you’re turning off faster launching, and removing pre-provisioned snapshots.
     * </p>
     * 
     * @param imageId
     *        The ID of the image for which you’re turning off faster launching, and removing pre-provisioned snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableFastLaunchRequest withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * Forces the image settings to turn off faster launching for your Windows AMI. This parameter overrides any errors
     * that are encountered while cleaning up resources in your account.
     * </p>
     * 
     * @param force
     *        Forces the image settings to turn off faster launching for your Windows AMI. This parameter overrides any
     *        errors that are encountered while cleaning up resources in your account.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Forces the image settings to turn off faster launching for your Windows AMI. This parameter overrides any errors
     * that are encountered while cleaning up resources in your account.
     * </p>
     * 
     * @return Forces the image settings to turn off faster launching for your Windows AMI. This parameter overrides any
     *         errors that are encountered while cleaning up resources in your account.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * Forces the image settings to turn off faster launching for your Windows AMI. This parameter overrides any errors
     * that are encountered while cleaning up resources in your account.
     * </p>
     * 
     * @param force
     *        Forces the image settings to turn off faster launching for your Windows AMI. This parameter overrides any
     *        errors that are encountered while cleaning up resources in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableFastLaunchRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * Forces the image settings to turn off faster launching for your Windows AMI. This parameter overrides any errors
     * that are encountered while cleaning up resources in your account.
     * </p>
     * 
     * @return Forces the image settings to turn off faster launching for your Windows AMI. This parameter overrides any
     *         errors that are encountered while cleaning up resources in your account.
     */

    public Boolean isForce() {
        return this.force;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DisableFastLaunchRequest> getDryRunRequest() {
        Request<DisableFastLaunchRequest> request = new DisableFastLaunchRequestMarshaller().marshall(this);
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
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableFastLaunchRequest == false)
            return false;
        DisableFastLaunchRequest other = (DisableFastLaunchRequest) obj;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public DisableFastLaunchRequest clone() {
        return (DisableFastLaunchRequest) super.clone();
    }
}

/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateLaunchConfigurationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLaunchConfigurationTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Update Launch configuration Target instance right sizing request.
     * </p>
     */
    private String launchConfigurationTemplateID;
    /**
     * <p>
     * Update Launch configuration Target instance right sizing request.
     * </p>
     */
    private PostLaunchActions postLaunchActions;

    /**
     * <p>
     * Update Launch configuration Target instance right sizing request.
     * </p>
     * 
     * @param launchConfigurationTemplateID
     *        Update Launch configuration Target instance right sizing request.
     */

    public void setLaunchConfigurationTemplateID(String launchConfigurationTemplateID) {
        this.launchConfigurationTemplateID = launchConfigurationTemplateID;
    }

    /**
     * <p>
     * Update Launch configuration Target instance right sizing request.
     * </p>
     * 
     * @return Update Launch configuration Target instance right sizing request.
     */

    public String getLaunchConfigurationTemplateID() {
        return this.launchConfigurationTemplateID;
    }

    /**
     * <p>
     * Update Launch configuration Target instance right sizing request.
     * </p>
     * 
     * @param launchConfigurationTemplateID
     *        Update Launch configuration Target instance right sizing request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationTemplateRequest withLaunchConfigurationTemplateID(String launchConfigurationTemplateID) {
        setLaunchConfigurationTemplateID(launchConfigurationTemplateID);
        return this;
    }

    /**
     * <p>
     * Update Launch configuration Target instance right sizing request.
     * </p>
     * 
     * @param postLaunchActions
     *        Update Launch configuration Target instance right sizing request.
     */

    public void setPostLaunchActions(PostLaunchActions postLaunchActions) {
        this.postLaunchActions = postLaunchActions;
    }

    /**
     * <p>
     * Update Launch configuration Target instance right sizing request.
     * </p>
     * 
     * @return Update Launch configuration Target instance right sizing request.
     */

    public PostLaunchActions getPostLaunchActions() {
        return this.postLaunchActions;
    }

    /**
     * <p>
     * Update Launch configuration Target instance right sizing request.
     * </p>
     * 
     * @param postLaunchActions
     *        Update Launch configuration Target instance right sizing request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationTemplateRequest withPostLaunchActions(PostLaunchActions postLaunchActions) {
        setPostLaunchActions(postLaunchActions);
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
        if (getLaunchConfigurationTemplateID() != null)
            sb.append("LaunchConfigurationTemplateID: ").append(getLaunchConfigurationTemplateID()).append(",");
        if (getPostLaunchActions() != null)
            sb.append("PostLaunchActions: ").append(getPostLaunchActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLaunchConfigurationTemplateRequest == false)
            return false;
        UpdateLaunchConfigurationTemplateRequest other = (UpdateLaunchConfigurationTemplateRequest) obj;
        if (other.getLaunchConfigurationTemplateID() == null ^ this.getLaunchConfigurationTemplateID() == null)
            return false;
        if (other.getLaunchConfigurationTemplateID() != null
                && other.getLaunchConfigurationTemplateID().equals(this.getLaunchConfigurationTemplateID()) == false)
            return false;
        if (other.getPostLaunchActions() == null ^ this.getPostLaunchActions() == null)
            return false;
        if (other.getPostLaunchActions() != null && other.getPostLaunchActions().equals(this.getPostLaunchActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchConfigurationTemplateID() == null) ? 0 : getLaunchConfigurationTemplateID().hashCode());
        hashCode = prime * hashCode + ((getPostLaunchActions() == null) ? 0 : getPostLaunchActions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLaunchConfigurationTemplateRequest clone() {
        return (UpdateLaunchConfigurationTemplateRequest) super.clone();
    }

}

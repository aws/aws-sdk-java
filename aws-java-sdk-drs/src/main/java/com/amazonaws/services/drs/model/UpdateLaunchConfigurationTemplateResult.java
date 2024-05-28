/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateLaunchConfigurationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLaunchConfigurationTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Updated Launch Configuration Template.
     * </p>
     */
    private LaunchConfigurationTemplate launchConfigurationTemplate;

    /**
     * <p>
     * Updated Launch Configuration Template.
     * </p>
     * 
     * @param launchConfigurationTemplate
     *        Updated Launch Configuration Template.
     */

    public void setLaunchConfigurationTemplate(LaunchConfigurationTemplate launchConfigurationTemplate) {
        this.launchConfigurationTemplate = launchConfigurationTemplate;
    }

    /**
     * <p>
     * Updated Launch Configuration Template.
     * </p>
     * 
     * @return Updated Launch Configuration Template.
     */

    public LaunchConfigurationTemplate getLaunchConfigurationTemplate() {
        return this.launchConfigurationTemplate;
    }

    /**
     * <p>
     * Updated Launch Configuration Template.
     * </p>
     * 
     * @param launchConfigurationTemplate
     *        Updated Launch Configuration Template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationTemplateResult withLaunchConfigurationTemplate(LaunchConfigurationTemplate launchConfigurationTemplate) {
        setLaunchConfigurationTemplate(launchConfigurationTemplate);
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
        if (getLaunchConfigurationTemplate() != null)
            sb.append("LaunchConfigurationTemplate: ").append(getLaunchConfigurationTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLaunchConfigurationTemplateResult == false)
            return false;
        UpdateLaunchConfigurationTemplateResult other = (UpdateLaunchConfigurationTemplateResult) obj;
        if (other.getLaunchConfigurationTemplate() == null ^ this.getLaunchConfigurationTemplate() == null)
            return false;
        if (other.getLaunchConfigurationTemplate() != null && other.getLaunchConfigurationTemplate().equals(this.getLaunchConfigurationTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchConfigurationTemplate() == null) ? 0 : getLaunchConfigurationTemplate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLaunchConfigurationTemplateResult clone() {
        try {
            return (UpdateLaunchConfigurationTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

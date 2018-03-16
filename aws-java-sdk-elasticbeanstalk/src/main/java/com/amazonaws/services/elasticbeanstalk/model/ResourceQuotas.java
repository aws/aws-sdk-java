/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ResourceQuotas" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceQuotas implements Serializable, Cloneable {

    private ResourceQuota applicationQuota;

    private ResourceQuota applicationVersionQuota;

    private ResourceQuota environmentQuota;

    private ResourceQuota configurationTemplateQuota;

    private ResourceQuota customPlatformQuota;

    /**
     * @param applicationQuota
     */

    public void setApplicationQuota(ResourceQuota applicationQuota) {
        this.applicationQuota = applicationQuota;
    }

    /**
     * @return
     */

    public ResourceQuota getApplicationQuota() {
        return this.applicationQuota;
    }

    /**
     * @param applicationQuota
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceQuotas withApplicationQuota(ResourceQuota applicationQuota) {
        setApplicationQuota(applicationQuota);
        return this;
    }

    /**
     * @param applicationVersionQuota
     */

    public void setApplicationVersionQuota(ResourceQuota applicationVersionQuota) {
        this.applicationVersionQuota = applicationVersionQuota;
    }

    /**
     * @return
     */

    public ResourceQuota getApplicationVersionQuota() {
        return this.applicationVersionQuota;
    }

    /**
     * @param applicationVersionQuota
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceQuotas withApplicationVersionQuota(ResourceQuota applicationVersionQuota) {
        setApplicationVersionQuota(applicationVersionQuota);
        return this;
    }

    /**
     * @param environmentQuota
     */

    public void setEnvironmentQuota(ResourceQuota environmentQuota) {
        this.environmentQuota = environmentQuota;
    }

    /**
     * @return
     */

    public ResourceQuota getEnvironmentQuota() {
        return this.environmentQuota;
    }

    /**
     * @param environmentQuota
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceQuotas withEnvironmentQuota(ResourceQuota environmentQuota) {
        setEnvironmentQuota(environmentQuota);
        return this;
    }

    /**
     * @param configurationTemplateQuota
     */

    public void setConfigurationTemplateQuota(ResourceQuota configurationTemplateQuota) {
        this.configurationTemplateQuota = configurationTemplateQuota;
    }

    /**
     * @return
     */

    public ResourceQuota getConfigurationTemplateQuota() {
        return this.configurationTemplateQuota;
    }

    /**
     * @param configurationTemplateQuota
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceQuotas withConfigurationTemplateQuota(ResourceQuota configurationTemplateQuota) {
        setConfigurationTemplateQuota(configurationTemplateQuota);
        return this;
    }

    /**
     * @param customPlatformQuota
     */

    public void setCustomPlatformQuota(ResourceQuota customPlatformQuota) {
        this.customPlatformQuota = customPlatformQuota;
    }

    /**
     * @return
     */

    public ResourceQuota getCustomPlatformQuota() {
        return this.customPlatformQuota;
    }

    /**
     * @param customPlatformQuota
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceQuotas withCustomPlatformQuota(ResourceQuota customPlatformQuota) {
        setCustomPlatformQuota(customPlatformQuota);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationQuota() != null)
            sb.append("ApplicationQuota: ").append(getApplicationQuota()).append(",");
        if (getApplicationVersionQuota() != null)
            sb.append("ApplicationVersionQuota: ").append(getApplicationVersionQuota()).append(",");
        if (getEnvironmentQuota() != null)
            sb.append("EnvironmentQuota: ").append(getEnvironmentQuota()).append(",");
        if (getConfigurationTemplateQuota() != null)
            sb.append("ConfigurationTemplateQuota: ").append(getConfigurationTemplateQuota()).append(",");
        if (getCustomPlatformQuota() != null)
            sb.append("CustomPlatformQuota: ").append(getCustomPlatformQuota());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceQuotas == false)
            return false;
        ResourceQuotas other = (ResourceQuotas) obj;
        if (other.getApplicationQuota() == null ^ this.getApplicationQuota() == null)
            return false;
        if (other.getApplicationQuota() != null && other.getApplicationQuota().equals(this.getApplicationQuota()) == false)
            return false;
        if (other.getApplicationVersionQuota() == null ^ this.getApplicationVersionQuota() == null)
            return false;
        if (other.getApplicationVersionQuota() != null && other.getApplicationVersionQuota().equals(this.getApplicationVersionQuota()) == false)
            return false;
        if (other.getEnvironmentQuota() == null ^ this.getEnvironmentQuota() == null)
            return false;
        if (other.getEnvironmentQuota() != null && other.getEnvironmentQuota().equals(this.getEnvironmentQuota()) == false)
            return false;
        if (other.getConfigurationTemplateQuota() == null ^ this.getConfigurationTemplateQuota() == null)
            return false;
        if (other.getConfigurationTemplateQuota() != null && other.getConfigurationTemplateQuota().equals(this.getConfigurationTemplateQuota()) == false)
            return false;
        if (other.getCustomPlatformQuota() == null ^ this.getCustomPlatformQuota() == null)
            return false;
        if (other.getCustomPlatformQuota() != null && other.getCustomPlatformQuota().equals(this.getCustomPlatformQuota()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationQuota() == null) ? 0 : getApplicationQuota().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersionQuota() == null) ? 0 : getApplicationVersionQuota().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentQuota() == null) ? 0 : getEnvironmentQuota().hashCode());
        hashCode = prime * hashCode + ((getConfigurationTemplateQuota() == null) ? 0 : getConfigurationTemplateQuota().hashCode());
        hashCode = prime * hashCode + ((getCustomPlatformQuota() == null) ? 0 : getCustomPlatformQuota().hashCode());
        return hashCode;
    }

    @Override
    public ResourceQuotas clone() {
        try {
            return (ResourceQuotas) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

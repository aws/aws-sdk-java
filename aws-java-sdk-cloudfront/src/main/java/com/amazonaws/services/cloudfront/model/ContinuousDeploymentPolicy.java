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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A continuous deployment policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ContinuousDeploymentPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContinuousDeploymentPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the continuous deployment policy.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time the continuous deployment policy was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    private ContinuousDeploymentPolicyConfig continuousDeploymentPolicyConfig;

    /**
     * <p>
     * The identifier of the continuous deployment policy.
     * </p>
     * 
     * @param id
     *        The identifier of the continuous deployment policy.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the continuous deployment policy.
     * </p>
     * 
     * @return The identifier of the continuous deployment policy.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the continuous deployment policy.
     * </p>
     * 
     * @param id
     *        The identifier of the continuous deployment policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousDeploymentPolicy withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time the continuous deployment policy was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time the continuous deployment policy was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the continuous deployment policy was last modified.
     * </p>
     * 
     * @return The date and time the continuous deployment policy was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the continuous deployment policy was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time the continuous deployment policy was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousDeploymentPolicy withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * @param continuousDeploymentPolicyConfig
     */

    public void setContinuousDeploymentPolicyConfig(ContinuousDeploymentPolicyConfig continuousDeploymentPolicyConfig) {
        this.continuousDeploymentPolicyConfig = continuousDeploymentPolicyConfig;
    }

    /**
     * @return
     */

    public ContinuousDeploymentPolicyConfig getContinuousDeploymentPolicyConfig() {
        return this.continuousDeploymentPolicyConfig;
    }

    /**
     * @param continuousDeploymentPolicyConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousDeploymentPolicy withContinuousDeploymentPolicyConfig(ContinuousDeploymentPolicyConfig continuousDeploymentPolicyConfig) {
        setContinuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getContinuousDeploymentPolicyConfig() != null)
            sb.append("ContinuousDeploymentPolicyConfig: ").append(getContinuousDeploymentPolicyConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContinuousDeploymentPolicy == false)
            return false;
        ContinuousDeploymentPolicy other = (ContinuousDeploymentPolicy) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getContinuousDeploymentPolicyConfig() == null ^ this.getContinuousDeploymentPolicyConfig() == null)
            return false;
        if (other.getContinuousDeploymentPolicyConfig() != null
                && other.getContinuousDeploymentPolicyConfig().equals(this.getContinuousDeploymentPolicyConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getContinuousDeploymentPolicyConfig() == null) ? 0 : getContinuousDeploymentPolicyConfig().hashCode());
        return hashCode;
    }

    @Override
    public ContinuousDeploymentPolicy clone() {
        try {
            return (ContinuousDeploymentPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

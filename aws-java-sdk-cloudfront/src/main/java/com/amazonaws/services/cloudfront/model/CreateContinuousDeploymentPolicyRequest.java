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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateContinuousDeploymentPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContinuousDeploymentPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the configuration for a continuous deployment policy.
     * </p>
     */
    private ContinuousDeploymentPolicyConfig continuousDeploymentPolicyConfig;

    /**
     * <p>
     * Contains the configuration for a continuous deployment policy.
     * </p>
     * 
     * @param continuousDeploymentPolicyConfig
     *        Contains the configuration for a continuous deployment policy.
     */

    public void setContinuousDeploymentPolicyConfig(ContinuousDeploymentPolicyConfig continuousDeploymentPolicyConfig) {
        this.continuousDeploymentPolicyConfig = continuousDeploymentPolicyConfig;
    }

    /**
     * <p>
     * Contains the configuration for a continuous deployment policy.
     * </p>
     * 
     * @return Contains the configuration for a continuous deployment policy.
     */

    public ContinuousDeploymentPolicyConfig getContinuousDeploymentPolicyConfig() {
        return this.continuousDeploymentPolicyConfig;
    }

    /**
     * <p>
     * Contains the configuration for a continuous deployment policy.
     * </p>
     * 
     * @param continuousDeploymentPolicyConfig
     *        Contains the configuration for a continuous deployment policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContinuousDeploymentPolicyRequest withContinuousDeploymentPolicyConfig(ContinuousDeploymentPolicyConfig continuousDeploymentPolicyConfig) {
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

        if (obj instanceof CreateContinuousDeploymentPolicyRequest == false)
            return false;
        CreateContinuousDeploymentPolicyRequest other = (CreateContinuousDeploymentPolicyRequest) obj;
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

        hashCode = prime * hashCode + ((getContinuousDeploymentPolicyConfig() == null) ? 0 : getContinuousDeploymentPolicyConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateContinuousDeploymentPolicyRequest clone() {
        return (CreateContinuousDeploymentPolicyRequest) super.clone();
    }

}

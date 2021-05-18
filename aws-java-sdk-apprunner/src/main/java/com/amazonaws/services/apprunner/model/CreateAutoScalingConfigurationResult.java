/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateAutoScalingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAutoScalingConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A description of the App Runner auto scaling configuration that's created by this request.
     * </p>
     */
    private AutoScalingConfiguration autoScalingConfiguration;

    /**
     * <p>
     * A description of the App Runner auto scaling configuration that's created by this request.
     * </p>
     * 
     * @param autoScalingConfiguration
     *        A description of the App Runner auto scaling configuration that's created by this request.
     */

    public void setAutoScalingConfiguration(AutoScalingConfiguration autoScalingConfiguration) {
        this.autoScalingConfiguration = autoScalingConfiguration;
    }

    /**
     * <p>
     * A description of the App Runner auto scaling configuration that's created by this request.
     * </p>
     * 
     * @return A description of the App Runner auto scaling configuration that's created by this request.
     */

    public AutoScalingConfiguration getAutoScalingConfiguration() {
        return this.autoScalingConfiguration;
    }

    /**
     * <p>
     * A description of the App Runner auto scaling configuration that's created by this request.
     * </p>
     * 
     * @param autoScalingConfiguration
     *        A description of the App Runner auto scaling configuration that's created by this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingConfigurationResult withAutoScalingConfiguration(AutoScalingConfiguration autoScalingConfiguration) {
        setAutoScalingConfiguration(autoScalingConfiguration);
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
        if (getAutoScalingConfiguration() != null)
            sb.append("AutoScalingConfiguration: ").append(getAutoScalingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAutoScalingConfigurationResult == false)
            return false;
        CreateAutoScalingConfigurationResult other = (CreateAutoScalingConfigurationResult) obj;
        if (other.getAutoScalingConfiguration() == null ^ this.getAutoScalingConfiguration() == null)
            return false;
        if (other.getAutoScalingConfiguration() != null && other.getAutoScalingConfiguration().equals(this.getAutoScalingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingConfiguration() == null) ? 0 : getAutoScalingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateAutoScalingConfigurationResult clone() {
        try {
            return (CreateAutoScalingConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

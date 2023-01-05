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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateRevealConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRevealConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The new configuration settings and the status of the configuration for the account.
     * </p>
     */
    private RevealConfiguration configuration;

    /**
     * <p>
     * The new configuration settings and the status of the configuration for the account.
     * </p>
     * 
     * @param configuration
     *        The new configuration settings and the status of the configuration for the account.
     */

    public void setConfiguration(RevealConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The new configuration settings and the status of the configuration for the account.
     * </p>
     * 
     * @return The new configuration settings and the status of the configuration for the account.
     */

    public RevealConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The new configuration settings and the status of the configuration for the account.
     * </p>
     * 
     * @param configuration
     *        The new configuration settings and the status of the configuration for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRevealConfigurationRequest withConfiguration(RevealConfiguration configuration) {
        setConfiguration(configuration);
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRevealConfigurationRequest == false)
            return false;
        UpdateRevealConfigurationRequest other = (UpdateRevealConfigurationRequest) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRevealConfigurationRequest clone() {
        return (UpdateRevealConfigurationRequest) super.clone();
    }

}

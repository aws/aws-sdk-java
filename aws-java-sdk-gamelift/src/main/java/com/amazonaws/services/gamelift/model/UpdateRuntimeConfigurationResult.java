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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateRuntimeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRuntimeConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The run-time configuration currently in force. If the update was successful, this object matches the one in the
     * request.
     * </p>
     */
    private RuntimeConfiguration runtimeConfiguration;

    /**
     * <p>
     * The run-time configuration currently in force. If the update was successful, this object matches the one in the
     * request.
     * </p>
     * 
     * @param runtimeConfiguration
     *        The run-time configuration currently in force. If the update was successful, this object matches the one
     *        in the request.
     */

    public void setRuntimeConfiguration(RuntimeConfiguration runtimeConfiguration) {
        this.runtimeConfiguration = runtimeConfiguration;
    }

    /**
     * <p>
     * The run-time configuration currently in force. If the update was successful, this object matches the one in the
     * request.
     * </p>
     * 
     * @return The run-time configuration currently in force. If the update was successful, this object matches the one
     *         in the request.
     */

    public RuntimeConfiguration getRuntimeConfiguration() {
        return this.runtimeConfiguration;
    }

    /**
     * <p>
     * The run-time configuration currently in force. If the update was successful, this object matches the one in the
     * request.
     * </p>
     * 
     * @param runtimeConfiguration
     *        The run-time configuration currently in force. If the update was successful, this object matches the one
     *        in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuntimeConfigurationResult withRuntimeConfiguration(RuntimeConfiguration runtimeConfiguration) {
        setRuntimeConfiguration(runtimeConfiguration);
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
        if (getRuntimeConfiguration() != null)
            sb.append("RuntimeConfiguration: ").append(getRuntimeConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRuntimeConfigurationResult == false)
            return false;
        UpdateRuntimeConfigurationResult other = (UpdateRuntimeConfigurationResult) obj;
        if (other.getRuntimeConfiguration() == null ^ this.getRuntimeConfiguration() == null)
            return false;
        if (other.getRuntimeConfiguration() != null && other.getRuntimeConfiguration().equals(this.getRuntimeConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuntimeConfiguration() == null) ? 0 : getRuntimeConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRuntimeConfigurationResult clone() {
        try {
            return (UpdateRuntimeConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

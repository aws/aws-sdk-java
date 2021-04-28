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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfileInitialization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLaunchProfileInitializationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The launch profile initialization.
     * </p>
     */
    private LaunchProfileInitialization launchProfileInitialization;

    /**
     * <p>
     * The launch profile initialization.
     * </p>
     * 
     * @param launchProfileInitialization
     *        The launch profile initialization.
     */

    public void setLaunchProfileInitialization(LaunchProfileInitialization launchProfileInitialization) {
        this.launchProfileInitialization = launchProfileInitialization;
    }

    /**
     * <p>
     * The launch profile initialization.
     * </p>
     * 
     * @return The launch profile initialization.
     */

    public LaunchProfileInitialization getLaunchProfileInitialization() {
        return this.launchProfileInitialization;
    }

    /**
     * <p>
     * The launch profile initialization.
     * </p>
     * 
     * @param launchProfileInitialization
     *        The launch profile initialization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLaunchProfileInitializationResult withLaunchProfileInitialization(LaunchProfileInitialization launchProfileInitialization) {
        setLaunchProfileInitialization(launchProfileInitialization);
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
        if (getLaunchProfileInitialization() != null)
            sb.append("LaunchProfileInitialization: ").append(getLaunchProfileInitialization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLaunchProfileInitializationResult == false)
            return false;
        GetLaunchProfileInitializationResult other = (GetLaunchProfileInitializationResult) obj;
        if (other.getLaunchProfileInitialization() == null ^ this.getLaunchProfileInitialization() == null)
            return false;
        if (other.getLaunchProfileInitialization() != null && other.getLaunchProfileInitialization().equals(this.getLaunchProfileInitialization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchProfileInitialization() == null) ? 0 : getLaunchProfileInitialization().hashCode());
        return hashCode;
    }

    @Override
    public GetLaunchProfileInitializationResult clone() {
        try {
            return (GetLaunchProfileInitializationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

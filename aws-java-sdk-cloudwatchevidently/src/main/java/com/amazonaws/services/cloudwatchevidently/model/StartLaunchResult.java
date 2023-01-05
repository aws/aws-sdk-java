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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StartLaunch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartLaunchResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that contains information about the launch that was started.
     * </p>
     */
    private Launch launch;

    /**
     * <p>
     * A structure that contains information about the launch that was started.
     * </p>
     * 
     * @param launch
     *        A structure that contains information about the launch that was started.
     */

    public void setLaunch(Launch launch) {
        this.launch = launch;
    }

    /**
     * <p>
     * A structure that contains information about the launch that was started.
     * </p>
     * 
     * @return A structure that contains information about the launch that was started.
     */

    public Launch getLaunch() {
        return this.launch;
    }

    /**
     * <p>
     * A structure that contains information about the launch that was started.
     * </p>
     * 
     * @param launch
     *        A structure that contains information about the launch that was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartLaunchResult withLaunch(Launch launch) {
        setLaunch(launch);
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
        if (getLaunch() != null)
            sb.append("Launch: ").append(getLaunch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartLaunchResult == false)
            return false;
        StartLaunchResult other = (StartLaunchResult) obj;
        if (other.getLaunch() == null ^ this.getLaunch() == null)
            return false;
        if (other.getLaunch() != null && other.getLaunch().equals(this.getLaunch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunch() == null) ? 0 : getLaunch().hashCode());
        return hashCode;
    }

    @Override
    public StartLaunchResult clone() {
        try {
            return (StartLaunchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

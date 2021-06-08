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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNetworkInsightsPathResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the path.
     * </p>
     */
    private NetworkInsightsPath networkInsightsPath;

    /**
     * <p>
     * Information about the path.
     * </p>
     * 
     * @param networkInsightsPath
     *        Information about the path.
     */

    public void setNetworkInsightsPath(NetworkInsightsPath networkInsightsPath) {
        this.networkInsightsPath = networkInsightsPath;
    }

    /**
     * <p>
     * Information about the path.
     * </p>
     * 
     * @return Information about the path.
     */

    public NetworkInsightsPath getNetworkInsightsPath() {
        return this.networkInsightsPath;
    }

    /**
     * <p>
     * Information about the path.
     * </p>
     * 
     * @param networkInsightsPath
     *        Information about the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInsightsPathResult withNetworkInsightsPath(NetworkInsightsPath networkInsightsPath) {
        setNetworkInsightsPath(networkInsightsPath);
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
        if (getNetworkInsightsPath() != null)
            sb.append("NetworkInsightsPath: ").append(getNetworkInsightsPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNetworkInsightsPathResult == false)
            return false;
        CreateNetworkInsightsPathResult other = (CreateNetworkInsightsPathResult) obj;
        if (other.getNetworkInsightsPath() == null ^ this.getNetworkInsightsPath() == null)
            return false;
        if (other.getNetworkInsightsPath() != null && other.getNetworkInsightsPath().equals(this.getNetworkInsightsPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInsightsPath() == null) ? 0 : getNetworkInsightsPath().hashCode());
        return hashCode;
    }

    @Override
    public CreateNetworkInsightsPathResult clone() {
        try {
            return (CreateNetworkInsightsPathResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

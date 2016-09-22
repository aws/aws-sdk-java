/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class DescribeBuildRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier of the build that you want to retrieve properties for.
     * </p>
     */
    private String buildId;

    /**
     * <p>
     * Unique identifier of the build that you want to retrieve properties for.
     * </p>
     * 
     * @param buildId
     *        Unique identifier of the build that you want to retrieve properties for.
     */

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    /**
     * <p>
     * Unique identifier of the build that you want to retrieve properties for.
     * </p>
     * 
     * @return Unique identifier of the build that you want to retrieve properties for.
     */

    public String getBuildId() {
        return this.buildId;
    }

    /**
     * <p>
     * Unique identifier of the build that you want to retrieve properties for.
     * </p>
     * 
     * @param buildId
     *        Unique identifier of the build that you want to retrieve properties for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBuildRequest withBuildId(String buildId) {
        setBuildId(buildId);
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
        if (getBuildId() != null)
            sb.append("BuildId: " + getBuildId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBuildRequest == false)
            return false;
        DescribeBuildRequest other = (DescribeBuildRequest) obj;
        if (other.getBuildId() == null ^ this.getBuildId() == null)
            return false;
        if (other.getBuildId() != null && other.getBuildId().equals(this.getBuildId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBuildId() == null) ? 0 : getBuildId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBuildRequest clone() {
        return (DescribeBuildRequest) super.clone();
    }
}

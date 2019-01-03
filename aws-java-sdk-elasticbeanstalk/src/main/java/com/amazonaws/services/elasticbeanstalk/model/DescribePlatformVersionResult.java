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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribePlatformVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePlatformVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Detailed information about the version of the platform.
     * </p>
     */
    private PlatformDescription platformDescription;

    /**
     * <p>
     * Detailed information about the version of the platform.
     * </p>
     * 
     * @param platformDescription
     *        Detailed information about the version of the platform.
     */

    public void setPlatformDescription(PlatformDescription platformDescription) {
        this.platformDescription = platformDescription;
    }

    /**
     * <p>
     * Detailed information about the version of the platform.
     * </p>
     * 
     * @return Detailed information about the version of the platform.
     */

    public PlatformDescription getPlatformDescription() {
        return this.platformDescription;
    }

    /**
     * <p>
     * Detailed information about the version of the platform.
     * </p>
     * 
     * @param platformDescription
     *        Detailed information about the version of the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePlatformVersionResult withPlatformDescription(PlatformDescription platformDescription) {
        setPlatformDescription(platformDescription);
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
        if (getPlatformDescription() != null)
            sb.append("PlatformDescription: ").append(getPlatformDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePlatformVersionResult == false)
            return false;
        DescribePlatformVersionResult other = (DescribePlatformVersionResult) obj;
        if (other.getPlatformDescription() == null ^ this.getPlatformDescription() == null)
            return false;
        if (other.getPlatformDescription() != null && other.getPlatformDescription().equals(this.getPlatformDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlatformDescription() == null) ? 0 : getPlatformDescription().hashCode());
        return hashCode;
    }

    @Override
    public DescribePlatformVersionResult clone() {
        try {
            return (DescribePlatformVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

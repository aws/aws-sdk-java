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
 * <p>
 * Result message containing a list of environment resource descriptions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironmentResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEnvironmentResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <a>EnvironmentResourceDescription</a>.
     * </p>
     */
    private EnvironmentResourceDescription environmentResources;

    /**
     * <p>
     * A list of <a>EnvironmentResourceDescription</a>.
     * </p>
     * 
     * @param environmentResources
     *        A list of <a>EnvironmentResourceDescription</a>.
     */

    public void setEnvironmentResources(EnvironmentResourceDescription environmentResources) {
        this.environmentResources = environmentResources;
    }

    /**
     * <p>
     * A list of <a>EnvironmentResourceDescription</a>.
     * </p>
     * 
     * @return A list of <a>EnvironmentResourceDescription</a>.
     */

    public EnvironmentResourceDescription getEnvironmentResources() {
        return this.environmentResources;
    }

    /**
     * <p>
     * A list of <a>EnvironmentResourceDescription</a>.
     * </p>
     * 
     * @param environmentResources
     *        A list of <a>EnvironmentResourceDescription</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentResourcesResult withEnvironmentResources(EnvironmentResourceDescription environmentResources) {
        setEnvironmentResources(environmentResources);
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
        if (getEnvironmentResources() != null)
            sb.append("EnvironmentResources: ").append(getEnvironmentResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEnvironmentResourcesResult == false)
            return false;
        DescribeEnvironmentResourcesResult other = (DescribeEnvironmentResourcesResult) obj;
        if (other.getEnvironmentResources() == null ^ this.getEnvironmentResources() == null)
            return false;
        if (other.getEnvironmentResources() != null && other.getEnvironmentResources().equals(this.getEnvironmentResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentResources() == null) ? 0 : getEnvironmentResources().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEnvironmentResourcesResult clone() {
        try {
            return (DescribeEnvironmentResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

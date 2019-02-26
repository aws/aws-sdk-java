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
 * Result message wrapping a single description of an application version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateApplicationVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <a>ApplicationVersionDescription</a> of the application version.
     * </p>
     */
    private ApplicationVersionDescription applicationVersion;

    /**
     * <p>
     * The <a>ApplicationVersionDescription</a> of the application version.
     * </p>
     * 
     * @param applicationVersion
     *        The <a>ApplicationVersionDescription</a> of the application version.
     */

    public void setApplicationVersion(ApplicationVersionDescription applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    /**
     * <p>
     * The <a>ApplicationVersionDescription</a> of the application version.
     * </p>
     * 
     * @return The <a>ApplicationVersionDescription</a> of the application version.
     */

    public ApplicationVersionDescription getApplicationVersion() {
        return this.applicationVersion;
    }

    /**
     * <p>
     * The <a>ApplicationVersionDescription</a> of the application version.
     * </p>
     * 
     * @param applicationVersion
     *        The <a>ApplicationVersionDescription</a> of the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationVersionResult withApplicationVersion(ApplicationVersionDescription applicationVersion) {
        setApplicationVersion(applicationVersion);
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
        if (getApplicationVersion() != null)
            sb.append("ApplicationVersion: ").append(getApplicationVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationVersionResult == false)
            return false;
        UpdateApplicationVersionResult other = (UpdateApplicationVersionResult) obj;
        if (other.getApplicationVersion() == null ^ this.getApplicationVersion() == null)
            return false;
        if (other.getApplicationVersion() != null && other.getApplicationVersion().equals(this.getApplicationVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationVersion() == null) ? 0 : getApplicationVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationVersionResult clone() {
        try {
            return (UpdateApplicationVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

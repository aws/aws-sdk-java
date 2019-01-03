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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateBuild" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBuildResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Object that contains the updated build record.
     * </p>
     */
    private Build build;

    /**
     * <p>
     * Object that contains the updated build record.
     * </p>
     * 
     * @param build
     *        Object that contains the updated build record.
     */

    public void setBuild(Build build) {
        this.build = build;
    }

    /**
     * <p>
     * Object that contains the updated build record.
     * </p>
     * 
     * @return Object that contains the updated build record.
     */

    public Build getBuild() {
        return this.build;
    }

    /**
     * <p>
     * Object that contains the updated build record.
     * </p>
     * 
     * @param build
     *        Object that contains the updated build record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBuildResult withBuild(Build build) {
        setBuild(build);
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
        if (getBuild() != null)
            sb.append("Build: ").append(getBuild());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBuildResult == false)
            return false;
        UpdateBuildResult other = (UpdateBuildResult) obj;
        if (other.getBuild() == null ^ this.getBuild() == null)
            return false;
        if (other.getBuild() != null && other.getBuild().equals(this.getBuild()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBuild() == null) ? 0 : getBuild().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBuildResult clone() {
        try {
            return (UpdateBuildResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

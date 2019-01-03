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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateDirectoryConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDirectoryConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the Directory Config object.
     * </p>
     */
    private DirectoryConfig directoryConfig;

    /**
     * <p>
     * Information about the Directory Config object.
     * </p>
     * 
     * @param directoryConfig
     *        Information about the Directory Config object.
     */

    public void setDirectoryConfig(DirectoryConfig directoryConfig) {
        this.directoryConfig = directoryConfig;
    }

    /**
     * <p>
     * Information about the Directory Config object.
     * </p>
     * 
     * @return Information about the Directory Config object.
     */

    public DirectoryConfig getDirectoryConfig() {
        return this.directoryConfig;
    }

    /**
     * <p>
     * Information about the Directory Config object.
     * </p>
     * 
     * @param directoryConfig
     *        Information about the Directory Config object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDirectoryConfigResult withDirectoryConfig(DirectoryConfig directoryConfig) {
        setDirectoryConfig(directoryConfig);
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
        if (getDirectoryConfig() != null)
            sb.append("DirectoryConfig: ").append(getDirectoryConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDirectoryConfigResult == false)
            return false;
        UpdateDirectoryConfigResult other = (UpdateDirectoryConfigResult) obj;
        if (other.getDirectoryConfig() == null ^ this.getDirectoryConfig() == null)
            return false;
        if (other.getDirectoryConfig() != null && other.getDirectoryConfig().equals(this.getDirectoryConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryConfig() == null) ? 0 : getDirectoryConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDirectoryConfigResult clone() {
        try {
            return (UpdateDirectoryConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

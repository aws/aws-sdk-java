/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A file system, created by you, that you assign to a user profile or space for an Amazon SageMaker Domain. Permitted
 * users can access this file system in Amazon SageMaker Studio.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CustomFileSystem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomFileSystem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A custom file system in Amazon EFS.
     * </p>
     */
    private EFSFileSystem eFSFileSystem;

    /**
     * <p>
     * A custom file system in Amazon EFS.
     * </p>
     * 
     * @param eFSFileSystem
     *        A custom file system in Amazon EFS.
     */

    public void setEFSFileSystem(EFSFileSystem eFSFileSystem) {
        this.eFSFileSystem = eFSFileSystem;
    }

    /**
     * <p>
     * A custom file system in Amazon EFS.
     * </p>
     * 
     * @return A custom file system in Amazon EFS.
     */

    public EFSFileSystem getEFSFileSystem() {
        return this.eFSFileSystem;
    }

    /**
     * <p>
     * A custom file system in Amazon EFS.
     * </p>
     * 
     * @param eFSFileSystem
     *        A custom file system in Amazon EFS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomFileSystem withEFSFileSystem(EFSFileSystem eFSFileSystem) {
        setEFSFileSystem(eFSFileSystem);
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
        if (getEFSFileSystem() != null)
            sb.append("EFSFileSystem: ").append(getEFSFileSystem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomFileSystem == false)
            return false;
        CustomFileSystem other = (CustomFileSystem) obj;
        if (other.getEFSFileSystem() == null ^ this.getEFSFileSystem() == null)
            return false;
        if (other.getEFSFileSystem() != null && other.getEFSFileSystem().equals(this.getEFSFileSystem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEFSFileSystem() == null) ? 0 : getEFSFileSystem().hashCode());
        return hashCode;
    }

    @Override
    public CustomFileSystem clone() {
        try {
            return (CustomFileSystem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CustomFileSystemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The attachments for jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/Attachments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Attachments implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file system.
     * </p>
     */
    private String fileSystem;
    /**
     * <p>
     * A list of manifests which describe job attachment configurations.
     * </p>
     */
    private java.util.List<ManifestProperties> manifests;

    /**
     * <p>
     * The file system.
     * </p>
     * 
     * @param fileSystem
     *        The file system.
     * @see JobAttachmentsFileSystem
     */

    public void setFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
    }

    /**
     * <p>
     * The file system.
     * </p>
     * 
     * @return The file system.
     * @see JobAttachmentsFileSystem
     */

    public String getFileSystem() {
        return this.fileSystem;
    }

    /**
     * <p>
     * The file system.
     * </p>
     * 
     * @param fileSystem
     *        The file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobAttachmentsFileSystem
     */

    public Attachments withFileSystem(String fileSystem) {
        setFileSystem(fileSystem);
        return this;
    }

    /**
     * <p>
     * The file system.
     * </p>
     * 
     * @param fileSystem
     *        The file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobAttachmentsFileSystem
     */

    public Attachments withFileSystem(JobAttachmentsFileSystem fileSystem) {
        this.fileSystem = fileSystem.toString();
        return this;
    }

    /**
     * <p>
     * A list of manifests which describe job attachment configurations.
     * </p>
     * 
     * @return A list of manifests which describe job attachment configurations.
     */

    public java.util.List<ManifestProperties> getManifests() {
        return manifests;
    }

    /**
     * <p>
     * A list of manifests which describe job attachment configurations.
     * </p>
     * 
     * @param manifests
     *        A list of manifests which describe job attachment configurations.
     */

    public void setManifests(java.util.Collection<ManifestProperties> manifests) {
        if (manifests == null) {
            this.manifests = null;
            return;
        }

        this.manifests = new java.util.ArrayList<ManifestProperties>(manifests);
    }

    /**
     * <p>
     * A list of manifests which describe job attachment configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManifests(java.util.Collection)} or {@link #withManifests(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param manifests
     *        A list of manifests which describe job attachment configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachments withManifests(ManifestProperties... manifests) {
        if (this.manifests == null) {
            setManifests(new java.util.ArrayList<ManifestProperties>(manifests.length));
        }
        for (ManifestProperties ele : manifests) {
            this.manifests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of manifests which describe job attachment configurations.
     * </p>
     * 
     * @param manifests
     *        A list of manifests which describe job attachment configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachments withManifests(java.util.Collection<ManifestProperties> manifests) {
        setManifests(manifests);
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
        if (getFileSystem() != null)
            sb.append("FileSystem: ").append(getFileSystem()).append(",");
        if (getManifests() != null)
            sb.append("Manifests: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attachments == false)
            return false;
        Attachments other = (Attachments) obj;
        if (other.getFileSystem() == null ^ this.getFileSystem() == null)
            return false;
        if (other.getFileSystem() != null && other.getFileSystem().equals(this.getFileSystem()) == false)
            return false;
        if (other.getManifests() == null ^ this.getManifests() == null)
            return false;
        if (other.getManifests() != null && other.getManifests().equals(this.getManifests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystem() == null) ? 0 : getFileSystem().hashCode());
        hashCode = prime * hashCode + ((getManifests() == null) ? 0 : getManifests().hashCode());
        return hashCode;
    }

    @Override
    public Attachments clone() {
        try {
            return (Attachments) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.AttachmentsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

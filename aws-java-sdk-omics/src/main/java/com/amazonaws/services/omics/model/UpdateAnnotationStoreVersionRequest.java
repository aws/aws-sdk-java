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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateAnnotationStoreVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAnnotationStoreVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an annotation store.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of an annotation store version.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * The description of an annotation store.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of an annotation store.
     * </p>
     * 
     * @param name
     *        The name of an annotation store.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of an annotation store.
     * </p>
     * 
     * @return The name of an annotation store.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of an annotation store.
     * </p>
     * 
     * @param name
     *        The name of an annotation store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnnotationStoreVersionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of an annotation store version.
     * </p>
     * 
     * @param versionName
     *        The name of an annotation store version.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The name of an annotation store version.
     * </p>
     * 
     * @return The name of an annotation store version.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * The name of an annotation store version.
     * </p>
     * 
     * @param versionName
     *        The name of an annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnnotationStoreVersionRequest withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * The description of an annotation store.
     * </p>
     * 
     * @param description
     *        The description of an annotation store.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of an annotation store.
     * </p>
     * 
     * @return The description of an annotation store.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of an annotation store.
     * </p>
     * 
     * @param description
     *        The description of an annotation store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnnotationStoreVersionRequest withDescription(String description) {
        setDescription(description);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAnnotationStoreVersionRequest == false)
            return false;
        UpdateAnnotationStoreVersionRequest other = (UpdateAnnotationStoreVersionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAnnotationStoreVersionRequest clone() {
        return (UpdateAnnotationStoreVersionRequest) super.clone();
    }

}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteAnnotationStoreVersions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAnnotationStoreVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the annotation store from which versions are being deleted.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The versions of an annotation store to be deleted.
     * </p>
     */
    private java.util.List<String> versions;
    /**
     * <p>
     * Forces the deletion of an annotation store version when imports are in-progress..
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The name of the annotation store from which versions are being deleted.
     * </p>
     * 
     * @param name
     *        The name of the annotation store from which versions are being deleted.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the annotation store from which versions are being deleted.
     * </p>
     * 
     * @return The name of the annotation store from which versions are being deleted.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the annotation store from which versions are being deleted.
     * </p>
     * 
     * @param name
     *        The name of the annotation store from which versions are being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAnnotationStoreVersionsRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The versions of an annotation store to be deleted.
     * </p>
     * 
     * @return The versions of an annotation store to be deleted.
     */

    public java.util.List<String> getVersions() {
        return versions;
    }

    /**
     * <p>
     * The versions of an annotation store to be deleted.
     * </p>
     * 
     * @param versions
     *        The versions of an annotation store to be deleted.
     */

    public void setVersions(java.util.Collection<String> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<String>(versions);
    }

    /**
     * <p>
     * The versions of an annotation store to be deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersions(java.util.Collection)} or {@link #withVersions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param versions
     *        The versions of an annotation store to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAnnotationStoreVersionsRequest withVersions(String... versions) {
        if (this.versions == null) {
            setVersions(new java.util.ArrayList<String>(versions.length));
        }
        for (String ele : versions) {
            this.versions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The versions of an annotation store to be deleted.
     * </p>
     * 
     * @param versions
     *        The versions of an annotation store to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAnnotationStoreVersionsRequest withVersions(java.util.Collection<String> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * <p>
     * Forces the deletion of an annotation store version when imports are in-progress..
     * </p>
     * 
     * @param force
     *        Forces the deletion of an annotation store version when imports are in-progress..
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Forces the deletion of an annotation store version when imports are in-progress..
     * </p>
     * 
     * @return Forces the deletion of an annotation store version when imports are in-progress..
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * Forces the deletion of an annotation store version when imports are in-progress..
     * </p>
     * 
     * @param force
     *        Forces the deletion of an annotation store version when imports are in-progress..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAnnotationStoreVersionsRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * Forces the deletion of an annotation store version when imports are in-progress..
     * </p>
     * 
     * @return Forces the deletion of an annotation store version when imports are in-progress..
     */

    public Boolean isForce() {
        return this.force;
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
        if (getVersions() != null)
            sb.append("Versions: ").append(getVersions()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAnnotationStoreVersionsRequest == false)
            return false;
        DeleteAnnotationStoreVersionsRequest other = (DeleteAnnotationStoreVersionsRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAnnotationStoreVersionsRequest clone() {
        return (DeleteAnnotationStoreVersionsRequest) super.clone();
    }

}

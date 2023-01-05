/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the threat detected in a security finding and the file paths that were affected by the
 * threat.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Threat" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Threat implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the threat.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The severity of the threat.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * This total number of items in which the threat has been detected.
     * </p>
     */
    private Integer itemCount;
    /**
     * <p>
     * Provides information about the file paths that were affected by the threat.
     * </p>
     */
    private java.util.List<FilePaths> filePaths;

    /**
     * <p>
     * The name of the threat.
     * </p>
     * 
     * @param name
     *        The name of the threat.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the threat.
     * </p>
     * 
     * @return The name of the threat.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the threat.
     * </p>
     * 
     * @param name
     *        The name of the threat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Threat withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The severity of the threat.
     * </p>
     * 
     * @param severity
     *        The severity of the threat.
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the threat.
     * </p>
     * 
     * @return The severity of the threat.
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of the threat.
     * </p>
     * 
     * @param severity
     *        The severity of the threat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Threat withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * This total number of items in which the threat has been detected.
     * </p>
     * 
     * @param itemCount
     *        This total number of items in which the threat has been detected.
     */

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * This total number of items in which the threat has been detected.
     * </p>
     * 
     * @return This total number of items in which the threat has been detected.
     */

    public Integer getItemCount() {
        return this.itemCount;
    }

    /**
     * <p>
     * This total number of items in which the threat has been detected.
     * </p>
     * 
     * @param itemCount
     *        This total number of items in which the threat has been detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Threat withItemCount(Integer itemCount) {
        setItemCount(itemCount);
        return this;
    }

    /**
     * <p>
     * Provides information about the file paths that were affected by the threat.
     * </p>
     * 
     * @return Provides information about the file paths that were affected by the threat.
     */

    public java.util.List<FilePaths> getFilePaths() {
        return filePaths;
    }

    /**
     * <p>
     * Provides information about the file paths that were affected by the threat.
     * </p>
     * 
     * @param filePaths
     *        Provides information about the file paths that were affected by the threat.
     */

    public void setFilePaths(java.util.Collection<FilePaths> filePaths) {
        if (filePaths == null) {
            this.filePaths = null;
            return;
        }

        this.filePaths = new java.util.ArrayList<FilePaths>(filePaths);
    }

    /**
     * <p>
     * Provides information about the file paths that were affected by the threat.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilePaths(java.util.Collection)} or {@link #withFilePaths(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filePaths
     *        Provides information about the file paths that were affected by the threat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Threat withFilePaths(FilePaths... filePaths) {
        if (this.filePaths == null) {
            setFilePaths(new java.util.ArrayList<FilePaths>(filePaths.length));
        }
        for (FilePaths ele : filePaths) {
            this.filePaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides information about the file paths that were affected by the threat.
     * </p>
     * 
     * @param filePaths
     *        Provides information about the file paths that were affected by the threat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Threat withFilePaths(java.util.Collection<FilePaths> filePaths) {
        setFilePaths(filePaths);
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
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getItemCount() != null)
            sb.append("ItemCount: ").append(getItemCount()).append(",");
        if (getFilePaths() != null)
            sb.append("FilePaths: ").append(getFilePaths());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Threat == false)
            return false;
        Threat other = (Threat) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        if (other.getFilePaths() == null ^ this.getFilePaths() == null)
            return false;
        if (other.getFilePaths() != null && other.getFilePaths().equals(this.getFilePaths()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        hashCode = prime * hashCode + ((getFilePaths() == null) ? 0 : getFilePaths().hashCode());
        return hashCode;
    }

    @Override
    public Threat clone() {
        try {
            return (Threat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ThreatMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

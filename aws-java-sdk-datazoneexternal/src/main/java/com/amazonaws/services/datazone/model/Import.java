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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the import of the metadata form type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/Import" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Import implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the import.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The revision of the import.
     * </p>
     */
    private String revision;

    /**
     * <p>
     * The name of the import.
     * </p>
     * 
     * @param name
     *        The name of the import.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the import.
     * </p>
     * 
     * @return The name of the import.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the import.
     * </p>
     * 
     * @param name
     *        The name of the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Import withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The revision of the import.
     * </p>
     * 
     * @param revision
     *        The revision of the import.
     */

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the import.
     * </p>
     * 
     * @return The revision of the import.
     */

    public String getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of the import.
     * </p>
     * 
     * @param revision
     *        The revision of the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Import withRevision(String revision) {
        setRevision(revision);
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
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Import == false)
            return false;
        Import other = (Import) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public Import clone() {
        try {
            return (Import) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.ImportMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

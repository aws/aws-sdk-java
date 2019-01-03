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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The location of the custom terminology data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TerminologyDataLocation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminologyDataLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The repository type for the custom terminology data.
     * </p>
     */
    private String repositoryType;
    /**
     * <p>
     * The location of the custom terminology data.
     * </p>
     */
    private String location;

    /**
     * <p>
     * The repository type for the custom terminology data.
     * </p>
     * 
     * @param repositoryType
     *        The repository type for the custom terminology data.
     */

    public void setRepositoryType(String repositoryType) {
        this.repositoryType = repositoryType;
    }

    /**
     * <p>
     * The repository type for the custom terminology data.
     * </p>
     * 
     * @return The repository type for the custom terminology data.
     */

    public String getRepositoryType() {
        return this.repositoryType;
    }

    /**
     * <p>
     * The repository type for the custom terminology data.
     * </p>
     * 
     * @param repositoryType
     *        The repository type for the custom terminology data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminologyDataLocation withRepositoryType(String repositoryType) {
        setRepositoryType(repositoryType);
        return this;
    }

    /**
     * <p>
     * The location of the custom terminology data.
     * </p>
     * 
     * @param location
     *        The location of the custom terminology data.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the custom terminology data.
     * </p>
     * 
     * @return The location of the custom terminology data.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location of the custom terminology data.
     * </p>
     * 
     * @param location
     *        The location of the custom terminology data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminologyDataLocation withLocation(String location) {
        setLocation(location);
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
        if (getRepositoryType() != null)
            sb.append("RepositoryType: ").append(getRepositoryType()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminologyDataLocation == false)
            return false;
        TerminologyDataLocation other = (TerminologyDataLocation) obj;
        if (other.getRepositoryType() == null ^ this.getRepositoryType() == null)
            return false;
        if (other.getRepositoryType() != null && other.getRepositoryType().equals(this.getRepositoryType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryType() == null) ? 0 : getRepositoryType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public TerminologyDataLocation clone() {
        try {
            return (TerminologyDataLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.translate.model.transform.TerminologyDataLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

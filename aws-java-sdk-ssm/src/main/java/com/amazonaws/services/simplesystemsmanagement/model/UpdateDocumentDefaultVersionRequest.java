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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocumentDefaultVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDocumentDefaultVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a custom document that you want to set as the default version.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of a custom document that you want to set as the default version.
     * </p>
     */
    private String documentVersion;

    /**
     * <p>
     * The name of a custom document that you want to set as the default version.
     * </p>
     * 
     * @param name
     *        The name of a custom document that you want to set as the default version.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a custom document that you want to set as the default version.
     * </p>
     * 
     * @return The name of a custom document that you want to set as the default version.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a custom document that you want to set as the default version.
     * </p>
     * 
     * @param name
     *        The name of a custom document that you want to set as the default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentDefaultVersionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of a custom document that you want to set as the default version.
     * </p>
     * 
     * @param documentVersion
     *        The version of a custom document that you want to set as the default version.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of a custom document that you want to set as the default version.
     * </p>
     * 
     * @return The version of a custom document that you want to set as the default version.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The version of a custom document that you want to set as the default version.
     * </p>
     * 
     * @param documentVersion
     *        The version of a custom document that you want to set as the default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentDefaultVersionRequest withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
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
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDocumentDefaultVersionRequest == false)
            return false;
        UpdateDocumentDefaultVersionRequest other = (UpdateDocumentDefaultVersionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDocumentDefaultVersionRequest clone() {
        return (UpdateDocumentDefaultVersionRequest) super.clone();
    }

}

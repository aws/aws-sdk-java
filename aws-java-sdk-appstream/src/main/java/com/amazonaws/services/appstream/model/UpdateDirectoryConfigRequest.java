/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateDirectoryConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDirectoryConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the existing directory configuration to be updated.
     * </p>
     */
    private String directoryName;
    /**
     * <p>
     * The list of the distinguished names of organizational units to place computer accounts in.
     * </p>
     */
    private java.util.List<String> organizationalUnitDistinguishedNames;
    /**
     * <p>
     * The <i>AccountName</i> and <i>AccountPassword</i> values for the service account, which are used by the streaming
     * instance to connect to the directory
     * </p>
     */
    private ServiceAccountCredentials serviceAccountCredentials;

    /**
     * <p>
     * The name of the existing directory configuration to be updated.
     * </p>
     * 
     * @param directoryName
     *        The name of the existing directory configuration to be updated.
     */

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    /**
     * <p>
     * The name of the existing directory configuration to be updated.
     * </p>
     * 
     * @return The name of the existing directory configuration to be updated.
     */

    public String getDirectoryName() {
        return this.directoryName;
    }

    /**
     * <p>
     * The name of the existing directory configuration to be updated.
     * </p>
     * 
     * @param directoryName
     *        The name of the existing directory configuration to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDirectoryConfigRequest withDirectoryName(String directoryName) {
        setDirectoryName(directoryName);
        return this;
    }

    /**
     * <p>
     * The list of the distinguished names of organizational units to place computer accounts in.
     * </p>
     * 
     * @return The list of the distinguished names of organizational units to place computer accounts in.
     */

    public java.util.List<String> getOrganizationalUnitDistinguishedNames() {
        return organizationalUnitDistinguishedNames;
    }

    /**
     * <p>
     * The list of the distinguished names of organizational units to place computer accounts in.
     * </p>
     * 
     * @param organizationalUnitDistinguishedNames
     *        The list of the distinguished names of organizational units to place computer accounts in.
     */

    public void setOrganizationalUnitDistinguishedNames(java.util.Collection<String> organizationalUnitDistinguishedNames) {
        if (organizationalUnitDistinguishedNames == null) {
            this.organizationalUnitDistinguishedNames = null;
            return;
        }

        this.organizationalUnitDistinguishedNames = new java.util.ArrayList<String>(organizationalUnitDistinguishedNames);
    }

    /**
     * <p>
     * The list of the distinguished names of organizational units to place computer accounts in.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationalUnitDistinguishedNames(java.util.Collection)} or
     * {@link #withOrganizationalUnitDistinguishedNames(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param organizationalUnitDistinguishedNames
     *        The list of the distinguished names of organizational units to place computer accounts in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDirectoryConfigRequest withOrganizationalUnitDistinguishedNames(String... organizationalUnitDistinguishedNames) {
        if (this.organizationalUnitDistinguishedNames == null) {
            setOrganizationalUnitDistinguishedNames(new java.util.ArrayList<String>(organizationalUnitDistinguishedNames.length));
        }
        for (String ele : organizationalUnitDistinguishedNames) {
            this.organizationalUnitDistinguishedNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of the distinguished names of organizational units to place computer accounts in.
     * </p>
     * 
     * @param organizationalUnitDistinguishedNames
     *        The list of the distinguished names of organizational units to place computer accounts in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDirectoryConfigRequest withOrganizationalUnitDistinguishedNames(java.util.Collection<String> organizationalUnitDistinguishedNames) {
        setOrganizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames);
        return this;
    }

    /**
     * <p>
     * The <i>AccountName</i> and <i>AccountPassword</i> values for the service account, which are used by the streaming
     * instance to connect to the directory
     * </p>
     * 
     * @param serviceAccountCredentials
     *        The <i>AccountName</i> and <i>AccountPassword</i> values for the service account, which are used by the
     *        streaming instance to connect to the directory
     */

    public void setServiceAccountCredentials(ServiceAccountCredentials serviceAccountCredentials) {
        this.serviceAccountCredentials = serviceAccountCredentials;
    }

    /**
     * <p>
     * The <i>AccountName</i> and <i>AccountPassword</i> values for the service account, which are used by the streaming
     * instance to connect to the directory
     * </p>
     * 
     * @return The <i>AccountName</i> and <i>AccountPassword</i> values for the service account, which are used by the
     *         streaming instance to connect to the directory
     */

    public ServiceAccountCredentials getServiceAccountCredentials() {
        return this.serviceAccountCredentials;
    }

    /**
     * <p>
     * The <i>AccountName</i> and <i>AccountPassword</i> values for the service account, which are used by the streaming
     * instance to connect to the directory
     * </p>
     * 
     * @param serviceAccountCredentials
     *        The <i>AccountName</i> and <i>AccountPassword</i> values for the service account, which are used by the
     *        streaming instance to connect to the directory
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDirectoryConfigRequest withServiceAccountCredentials(ServiceAccountCredentials serviceAccountCredentials) {
        setServiceAccountCredentials(serviceAccountCredentials);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDirectoryName() != null)
            sb.append("DirectoryName: ").append(getDirectoryName()).append(",");
        if (getOrganizationalUnitDistinguishedNames() != null)
            sb.append("OrganizationalUnitDistinguishedNames: ").append(getOrganizationalUnitDistinguishedNames()).append(",");
        if (getServiceAccountCredentials() != null)
            sb.append("ServiceAccountCredentials: ").append(getServiceAccountCredentials());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDirectoryConfigRequest == false)
            return false;
        UpdateDirectoryConfigRequest other = (UpdateDirectoryConfigRequest) obj;
        if (other.getDirectoryName() == null ^ this.getDirectoryName() == null)
            return false;
        if (other.getDirectoryName() != null && other.getDirectoryName().equals(this.getDirectoryName()) == false)
            return false;
        if (other.getOrganizationalUnitDistinguishedNames() == null ^ this.getOrganizationalUnitDistinguishedNames() == null)
            return false;
        if (other.getOrganizationalUnitDistinguishedNames() != null
                && other.getOrganizationalUnitDistinguishedNames().equals(this.getOrganizationalUnitDistinguishedNames()) == false)
            return false;
        if (other.getServiceAccountCredentials() == null ^ this.getServiceAccountCredentials() == null)
            return false;
        if (other.getServiceAccountCredentials() != null && other.getServiceAccountCredentials().equals(this.getServiceAccountCredentials()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryName() == null) ? 0 : getDirectoryName().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnitDistinguishedNames() == null) ? 0 : getOrganizationalUnitDistinguishedNames().hashCode());
        hashCode = prime * hashCode + ((getServiceAccountCredentials() == null) ? 0 : getServiceAccountCredentials().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDirectoryConfigRequest clone() {
        return (UpdateDirectoryConfigRequest) super.clone();
    }

}

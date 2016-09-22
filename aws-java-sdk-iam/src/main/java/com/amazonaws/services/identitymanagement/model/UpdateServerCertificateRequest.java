/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class UpdateServerCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the server certificate that you want to update.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     */
    private String serverCertificateName;
    /**
     * <p>
     * The new path for the server certificate. Include this only if you are updating the server certificate's path.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes,
     * containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F), including most punctuation
     * characters, digits, and upper and lowercased letters.
     * </p>
     */
    private String newPath;
    /**
     * <p>
     * The new name for the server certificate. Include this only if you are updating the server certificate's name. The
     * name of the certificate cannot contain any spaces.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     */
    private String newServerCertificateName;

    /**
     * Default constructor for UpdateServerCertificateRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public UpdateServerCertificateRequest() {
    }

    /**
     * Constructs a new UpdateServerCertificateRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param serverCertificateName
     *        The name of the server certificate that you want to update.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     */
    public UpdateServerCertificateRequest(String serverCertificateName) {
        setServerCertificateName(serverCertificateName);
    }

    /**
     * <p>
     * The name of the server certificate that you want to update.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     * 
     * @param serverCertificateName
     *        The name of the server certificate that you want to update.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     */

    public void setServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
    }

    /**
     * <p>
     * The name of the server certificate that you want to update.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     * 
     * @return The name of the server certificate that you want to update.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *         characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *         any of the following characters: =,.@-
     */

    public String getServerCertificateName() {
        return this.serverCertificateName;
    }

    /**
     * <p>
     * The name of the server certificate that you want to update.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     * 
     * @param serverCertificateName
     *        The name of the server certificate that you want to update.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerCertificateRequest withServerCertificateName(String serverCertificateName) {
        setServerCertificateName(serverCertificateName);
        return this;
    }

    /**
     * <p>
     * The new path for the server certificate. Include this only if you are updating the server certificate's path.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes,
     * containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F), including most punctuation
     * characters, digits, and upper and lowercased letters.
     * </p>
     * 
     * @param newPath
     *        The new path for the server certificate. Include this only if you are updating the server certificate's
     *        path.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *        forward slashes, containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F),
     *        including most punctuation characters, digits, and upper and lowercased letters.
     */

    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }

    /**
     * <p>
     * The new path for the server certificate. Include this only if you are updating the server certificate's path.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes,
     * containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F), including most punctuation
     * characters, digits, and upper and lowercased letters.
     * </p>
     * 
     * @return The new path for the server certificate. Include this only if you are updating the server certificate's
     *         path.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *         characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *         forward slashes, containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F),
     *         including most punctuation characters, digits, and upper and lowercased letters.
     */

    public String getNewPath() {
        return this.newPath;
    }

    /**
     * <p>
     * The new path for the server certificate. Include this only if you are updating the server certificate's path.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes,
     * containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F), including most punctuation
     * characters, digits, and upper and lowercased letters.
     * </p>
     * 
     * @param newPath
     *        The new path for the server certificate. Include this only if you are updating the server certificate's
     *        path.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *        forward slashes, containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F),
     *        including most punctuation characters, digits, and upper and lowercased letters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerCertificateRequest withNewPath(String newPath) {
        setNewPath(newPath);
        return this;
    }

    /**
     * <p>
     * The new name for the server certificate. Include this only if you are updating the server certificate's name. The
     * name of the certificate cannot contain any spaces.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     * 
     * @param newServerCertificateName
     *        The new name for the server certificate. Include this only if you are updating the server certificate's
     *        name. The name of the certificate cannot contain any spaces.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     */

    public void setNewServerCertificateName(String newServerCertificateName) {
        this.newServerCertificateName = newServerCertificateName;
    }

    /**
     * <p>
     * The new name for the server certificate. Include this only if you are updating the server certificate's name. The
     * name of the certificate cannot contain any spaces.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     * 
     * @return The new name for the server certificate. Include this only if you are updating the server certificate's
     *         name. The name of the certificate cannot contain any spaces.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *         characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *         any of the following characters: =,.@-
     */

    public String getNewServerCertificateName() {
        return this.newServerCertificateName;
    }

    /**
     * <p>
     * The new name for the server certificate. Include this only if you are updating the server certificate's name. The
     * name of the certificate cannot contain any spaces.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     * 
     * @param newServerCertificateName
     *        The new name for the server certificate. Include this only if you are updating the server certificate's
     *        name. The name of the certificate cannot contain any spaces.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerCertificateRequest withNewServerCertificateName(String newServerCertificateName) {
        setNewServerCertificateName(newServerCertificateName);
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
        if (getServerCertificateName() != null)
            sb.append("ServerCertificateName: " + getServerCertificateName() + ",");
        if (getNewPath() != null)
            sb.append("NewPath: " + getNewPath() + ",");
        if (getNewServerCertificateName() != null)
            sb.append("NewServerCertificateName: " + getNewServerCertificateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServerCertificateRequest == false)
            return false;
        UpdateServerCertificateRequest other = (UpdateServerCertificateRequest) obj;
        if (other.getServerCertificateName() == null ^ this.getServerCertificateName() == null)
            return false;
        if (other.getServerCertificateName() != null && other.getServerCertificateName().equals(this.getServerCertificateName()) == false)
            return false;
        if (other.getNewPath() == null ^ this.getNewPath() == null)
            return false;
        if (other.getNewPath() != null && other.getNewPath().equals(this.getNewPath()) == false)
            return false;
        if (other.getNewServerCertificateName() == null ^ this.getNewServerCertificateName() == null)
            return false;
        if (other.getNewServerCertificateName() != null && other.getNewServerCertificateName().equals(this.getNewServerCertificateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerCertificateName() == null) ? 0 : getServerCertificateName().hashCode());
        hashCode = prime * hashCode + ((getNewPath() == null) ? 0 : getNewPath().hashCode());
        hashCode = prime * hashCode + ((getNewServerCertificateName() == null) ? 0 : getNewServerCertificateName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServerCertificateRequest clone() {
        return (UpdateServerCertificateRequest) super.clone();
    }
}

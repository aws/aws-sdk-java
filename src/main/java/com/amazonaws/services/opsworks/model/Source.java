/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;
import java.io.Serializable;

/**
 * <p>
 * Contains the information required to retrieve an app or cookbook from a repository.
 * </p>
 */
public class Source  implements Serializable  {

    /**
     * The repository type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>git, svn, archive, s3
     */
    private String type;

    /**
     * The source URL.
     */
    private String url;

    /**
     * The user name.
     */
    private String username;

    /**
     * The repository's password.
     */
    private String password;

    /**
     * The repository's SSH key.
     */
    private String sshKey;

    /**
     * The application's version. OpsWorks enables you to easily deploy new
     * versions of an application. One of the simplest approaches is to have
     * branches or revisions in your repository that represent different
     * versions that can potentially be deployed.
     */
    private String revision;

    /**
     * The repository type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>git, svn, archive, s3
     *
     * @return The repository type.
     *
     * @see SourceType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The repository type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>git, svn, archive, s3
     *
     * @param type The repository type.
     *
     * @see SourceType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The repository type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>git, svn, archive, s3
     *
     * @param type The repository type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see SourceType
     */
    public Source withType(String type) {
        this.type = type;
        return this;
    }
    
    
    /**
     * The repository type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>git, svn, archive, s3
     *
     * @param type The repository type.
     *
     * @see SourceType
     */
    public void setType(SourceType type) {
        this.type = type.toString();
    }
    
    /**
     * The repository type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>git, svn, archive, s3
     *
     * @param type The repository type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see SourceType
     */
    public Source withType(SourceType type) {
        this.type = type.toString();
        return this;
    }
    
    /**
     * The source URL.
     *
     * @return The source URL.
     */
    public String getUrl() {
        return url;
    }
    
    /**
     * The source URL.
     *
     * @param url The source URL.
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
    /**
     * The source URL.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param url The source URL.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Source withUrl(String url) {
        this.url = url;
        return this;
    }
    
    
    /**
     * The user name.
     *
     * @return The user name.
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * The user name.
     *
     * @param username The user name.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * The user name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param username The user name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Source withUsername(String username) {
        this.username = username;
        return this;
    }
    
    
    /**
     * The repository's password.
     *
     * @return The repository's password.
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * The repository's password.
     *
     * @param password The repository's password.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * The repository's password.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param password The repository's password.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Source withPassword(String password) {
        this.password = password;
        return this;
    }
    
    
    /**
     * The repository's SSH key.
     *
     * @return The repository's SSH key.
     */
    public String getSshKey() {
        return sshKey;
    }
    
    /**
     * The repository's SSH key.
     *
     * @param sshKey The repository's SSH key.
     */
    public void setSshKey(String sshKey) {
        this.sshKey = sshKey;
    }
    
    /**
     * The repository's SSH key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sshKey The repository's SSH key.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Source withSshKey(String sshKey) {
        this.sshKey = sshKey;
        return this;
    }
    
    
    /**
     * The application's version. OpsWorks enables you to easily deploy new
     * versions of an application. One of the simplest approaches is to have
     * branches or revisions in your repository that represent different
     * versions that can potentially be deployed.
     *
     * @return The application's version. OpsWorks enables you to easily deploy new
     *         versions of an application. One of the simplest approaches is to have
     *         branches or revisions in your repository that represent different
     *         versions that can potentially be deployed.
     */
    public String getRevision() {
        return revision;
    }
    
    /**
     * The application's version. OpsWorks enables you to easily deploy new
     * versions of an application. One of the simplest approaches is to have
     * branches or revisions in your repository that represent different
     * versions that can potentially be deployed.
     *
     * @param revision The application's version. OpsWorks enables you to easily deploy new
     *         versions of an application. One of the simplest approaches is to have
     *         branches or revisions in your repository that represent different
     *         versions that can potentially be deployed.
     */
    public void setRevision(String revision) {
        this.revision = revision;
    }
    
    /**
     * The application's version. OpsWorks enables you to easily deploy new
     * versions of an application. One of the simplest approaches is to have
     * branches or revisions in your repository that represent different
     * versions that can potentially be deployed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param revision The application's version. OpsWorks enables you to easily deploy new
     *         versions of an application. One of the simplest approaches is to have
     *         branches or revisions in your repository that represent different
     *         versions that can potentially be deployed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Source withRevision(String revision) {
        this.revision = revision;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null) sb.append("Type: " + getType() + ", ");
        if (getUrl() != null) sb.append("Url: " + getUrl() + ", ");
        if (getUsername() != null) sb.append("Username: " + getUsername() + ", ");
        if (getPassword() != null) sb.append("Password: " + getPassword() + ", ");
        if (getSshKey() != null) sb.append("SshKey: " + getSshKey() + ", ");
        if (getRevision() != null) sb.append("Revision: " + getRevision() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode()); 
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode()); 
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode()); 
        hashCode = prime * hashCode + ((getSshKey() == null) ? 0 : getSshKey().hashCode()); 
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Source == false) return false;
        Source other = (Source)obj;
        
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getUrl() == null ^ this.getUrl() == null) return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false) return false; 
        if (other.getUsername() == null ^ this.getUsername() == null) return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false) return false; 
        if (other.getPassword() == null ^ this.getPassword() == null) return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false) return false; 
        if (other.getSshKey() == null ^ this.getSshKey() == null) return false;
        if (other.getSshKey() != null && other.getSshKey().equals(this.getSshKey()) == false) return false; 
        if (other.getRevision() == null ^ this.getRevision() == null) return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false) return false; 
        return true;
    }
    
}
    
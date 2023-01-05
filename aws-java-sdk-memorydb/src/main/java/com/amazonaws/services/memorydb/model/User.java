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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * You create users and assign them specific permissions by using an access string. You assign the users to Access
 * Control Lists aligned with a specific role (administrators, human resources) that are then deployed to one or more
 * MemoryDB clusters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/User" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class User implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the user
     * </p>
     */
    private String name;
    /**
     * <p>
     * Indicates the user status. Can be "active", "modifying" or "deleting".
     * </p>
     */
    private String status;
    /**
     * <p>
     * Access permissions string used for this user.
     * </p>
     */
    private String accessString;
    /**
     * <p>
     * The names of the Access Control Lists to which the user belongs
     * </p>
     */
    private java.util.List<String> aCLNames;
    /**
     * <p>
     * The minimum engine version supported for the user
     * </p>
     */
    private String minimumEngineVersion;
    /**
     * <p>
     * Denotes whether the user requires a password to authenticate.
     * </p>
     */
    private Authentication authentication;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The name of the user
     * </p>
     * 
     * @param name
     *        The name of the user
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the user
     * </p>
     * 
     * @return The name of the user
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the user
     * </p>
     * 
     * @param name
     *        The name of the user
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Indicates the user status. Can be "active", "modifying" or "deleting".
     * </p>
     * 
     * @param status
     *        Indicates the user status. Can be "active", "modifying" or "deleting".
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the user status. Can be "active", "modifying" or "deleting".
     * </p>
     * 
     * @return Indicates the user status. Can be "active", "modifying" or "deleting".
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the user status. Can be "active", "modifying" or "deleting".
     * </p>
     * 
     * @param status
     *        Indicates the user status. Can be "active", "modifying" or "deleting".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Access permissions string used for this user.
     * </p>
     * 
     * @param accessString
     *        Access permissions string used for this user.
     */

    public void setAccessString(String accessString) {
        this.accessString = accessString;
    }

    /**
     * <p>
     * Access permissions string used for this user.
     * </p>
     * 
     * @return Access permissions string used for this user.
     */

    public String getAccessString() {
        return this.accessString;
    }

    /**
     * <p>
     * Access permissions string used for this user.
     * </p>
     * 
     * @param accessString
     *        Access permissions string used for this user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withAccessString(String accessString) {
        setAccessString(accessString);
        return this;
    }

    /**
     * <p>
     * The names of the Access Control Lists to which the user belongs
     * </p>
     * 
     * @return The names of the Access Control Lists to which the user belongs
     */

    public java.util.List<String> getACLNames() {
        return aCLNames;
    }

    /**
     * <p>
     * The names of the Access Control Lists to which the user belongs
     * </p>
     * 
     * @param aCLNames
     *        The names of the Access Control Lists to which the user belongs
     */

    public void setACLNames(java.util.Collection<String> aCLNames) {
        if (aCLNames == null) {
            this.aCLNames = null;
            return;
        }

        this.aCLNames = new java.util.ArrayList<String>(aCLNames);
    }

    /**
     * <p>
     * The names of the Access Control Lists to which the user belongs
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setACLNames(java.util.Collection)} or {@link #withACLNames(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param aCLNames
     *        The names of the Access Control Lists to which the user belongs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withACLNames(String... aCLNames) {
        if (this.aCLNames == null) {
            setACLNames(new java.util.ArrayList<String>(aCLNames.length));
        }
        for (String ele : aCLNames) {
            this.aCLNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the Access Control Lists to which the user belongs
     * </p>
     * 
     * @param aCLNames
     *        The names of the Access Control Lists to which the user belongs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withACLNames(java.util.Collection<String> aCLNames) {
        setACLNames(aCLNames);
        return this;
    }

    /**
     * <p>
     * The minimum engine version supported for the user
     * </p>
     * 
     * @param minimumEngineVersion
     *        The minimum engine version supported for the user
     */

    public void setMinimumEngineVersion(String minimumEngineVersion) {
        this.minimumEngineVersion = minimumEngineVersion;
    }

    /**
     * <p>
     * The minimum engine version supported for the user
     * </p>
     * 
     * @return The minimum engine version supported for the user
     */

    public String getMinimumEngineVersion() {
        return this.minimumEngineVersion;
    }

    /**
     * <p>
     * The minimum engine version supported for the user
     * </p>
     * 
     * @param minimumEngineVersion
     *        The minimum engine version supported for the user
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withMinimumEngineVersion(String minimumEngineVersion) {
        setMinimumEngineVersion(minimumEngineVersion);
        return this;
    }

    /**
     * <p>
     * Denotes whether the user requires a password to authenticate.
     * </p>
     * 
     * @param authentication
     *        Denotes whether the user requires a password to authenticate.
     */

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    /**
     * <p>
     * Denotes whether the user requires a password to authenticate.
     * </p>
     * 
     * @return Denotes whether the user requires a password to authenticate.
     */

    public Authentication getAuthentication() {
        return this.authentication;
    }

    /**
     * <p>
     * Denotes whether the user requires a password to authenticate.
     * </p>
     * 
     * @param authentication
     *        Denotes whether the user requires a password to authenticate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withAuthentication(Authentication authentication) {
        setAuthentication(authentication);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the user.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withARN(String aRN) {
        setARN(aRN);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAccessString() != null)
            sb.append("AccessString: ").append(getAccessString()).append(",");
        if (getACLNames() != null)
            sb.append("ACLNames: ").append(getACLNames()).append(",");
        if (getMinimumEngineVersion() != null)
            sb.append("MinimumEngineVersion: ").append(getMinimumEngineVersion()).append(",");
        if (getAuthentication() != null)
            sb.append("Authentication: ").append(getAuthentication()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof User == false)
            return false;
        User other = (User) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAccessString() == null ^ this.getAccessString() == null)
            return false;
        if (other.getAccessString() != null && other.getAccessString().equals(this.getAccessString()) == false)
            return false;
        if (other.getACLNames() == null ^ this.getACLNames() == null)
            return false;
        if (other.getACLNames() != null && other.getACLNames().equals(this.getACLNames()) == false)
            return false;
        if (other.getMinimumEngineVersion() == null ^ this.getMinimumEngineVersion() == null)
            return false;
        if (other.getMinimumEngineVersion() != null && other.getMinimumEngineVersion().equals(this.getMinimumEngineVersion()) == false)
            return false;
        if (other.getAuthentication() == null ^ this.getAuthentication() == null)
            return false;
        if (other.getAuthentication() != null && other.getAuthentication().equals(this.getAuthentication()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAccessString() == null) ? 0 : getAccessString().hashCode());
        hashCode = prime * hashCode + ((getACLNames() == null) ? 0 : getACLNames().hashCode());
        hashCode = prime * hashCode + ((getMinimumEngineVersion() == null) ? 0 : getMinimumEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getAuthentication() == null) ? 0 : getAuthentication().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.UserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DisableLDAPS" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableLDAPSRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The type of LDAP security to enable. Currently only the value <code>Client</code> is supported.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @return The identifier of the directory.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableLDAPSRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The type of LDAP security to enable. Currently only the value <code>Client</code> is supported.
     * </p>
     * 
     * @param type
     *        The type of LDAP security to enable. Currently only the value <code>Client</code> is supported.
     * @see LDAPSType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of LDAP security to enable. Currently only the value <code>Client</code> is supported.
     * </p>
     * 
     * @return The type of LDAP security to enable. Currently only the value <code>Client</code> is supported.
     * @see LDAPSType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of LDAP security to enable. Currently only the value <code>Client</code> is supported.
     * </p>
     * 
     * @param type
     *        The type of LDAP security to enable. Currently only the value <code>Client</code> is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LDAPSType
     */

    public DisableLDAPSRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of LDAP security to enable. Currently only the value <code>Client</code> is supported.
     * </p>
     * 
     * @param type
     *        The type of LDAP security to enable. Currently only the value <code>Client</code> is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LDAPSType
     */

    public DisableLDAPSRequest withType(LDAPSType type) {
        this.type = type.toString();
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableLDAPSRequest == false)
            return false;
        DisableLDAPSRequest other = (DisableLDAPSRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public DisableLDAPSRequest clone() {
        return (DisableLDAPSRequest) super.clone();
    }

}

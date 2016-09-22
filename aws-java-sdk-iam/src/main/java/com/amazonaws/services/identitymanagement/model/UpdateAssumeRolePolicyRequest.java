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
public class UpdateAssumeRolePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the role to update with the new policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The policy that grants an entity permission to assume the role.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of any printable ASCII character ranging from the space character ( ) through end of the ASCII
     * character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage return (
     * ).
     * </p>
     */
    private String policyDocument;

    /**
     * <p>
     * The name of the role to update with the new policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     * 
     * @param roleName
     *        The name of the role to update with the new policy.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role to update with the new policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     * 
     * @return The name of the role to update with the new policy.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *         characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *         any of the following characters: =,.@-
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the role to update with the new policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     * 
     * @param roleName
     *        The name of the role to update with the new policy.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssumeRolePolicyRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The policy that grants an entity permission to assume the role.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of any printable ASCII character ranging from the space character ( ) through end of the ASCII
     * character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage return (
     * ).
     * </p>
     * 
     * @param policyDocument
     *        The policy that grants an entity permission to assume the role.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of any printable ASCII character ranging from the space character ( ) through end of
     *        the ASCII character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and
     *        carriage return ( ).
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The policy that grants an entity permission to assume the role.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of any printable ASCII character ranging from the space character ( ) through end of the ASCII
     * character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage return (
     * ).
     * </p>
     * 
     * @return The policy that grants an entity permission to assume the role.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *         characters consisting of any printable ASCII character ranging from the space character ( ) through end
     *         of the ASCII character range (\u00FF). It also includes the special characters tab ( ), line feed ( ),
     *         and carriage return ( ).
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The policy that grants an entity permission to assume the role.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of any printable ASCII character ranging from the space character ( ) through end of the ASCII
     * character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage return (
     * ).
     * </p>
     * 
     * @param policyDocument
     *        The policy that grants an entity permission to assume the role.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of any printable ASCII character ranging from the space character ( ) through end of
     *        the ASCII character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and
     *        carriage return ( ).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssumeRolePolicyRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
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
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: " + getPolicyDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAssumeRolePolicyRequest == false)
            return false;
        UpdateAssumeRolePolicyRequest other = (UpdateAssumeRolePolicyRequest) obj;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAssumeRolePolicyRequest clone() {
        return (UpdateAssumeRolePolicyRequest) super.clone();
    }
}

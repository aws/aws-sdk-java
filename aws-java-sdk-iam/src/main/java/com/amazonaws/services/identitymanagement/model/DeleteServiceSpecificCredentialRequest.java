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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteServiceSpecificCredential"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteServiceSpecificCredentialRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the IAM user associated with the service-specific credential. If this value is not specified, then
     * the operation assumes the user whose credentials are used to call the operation.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The unique identifier of the service-specific credential. You can get this value by calling
     * <a>ListServiceSpecificCredentials</a>.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     */
    private String serviceSpecificCredentialId;

    /**
     * <p>
     * The name of the IAM user associated with the service-specific credential. If this value is not specified, then
     * the operation assumes the user whose credentials are used to call the operation.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param userName
     *        The name of the IAM user associated with the service-specific credential. If this value is not specified,
     *        then the operation assumes the user whose credentials are used to call the operation.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user associated with the service-specific credential. If this value is not specified, then
     * the operation assumes the user whose credentials are used to call the operation.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @return The name of the IAM user associated with the service-specific credential. If this value is not specified,
     *         then the operation assumes the user whose credentials are used to call the operation.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *         include any of the following characters: _+=,.@-
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the IAM user associated with the service-specific credential. If this value is not specified, then
     * the operation assumes the user whose credentials are used to call the operation.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param userName
     *        The name of the IAM user associated with the service-specific credential. If this value is not specified,
     *        then the operation assumes the user whose credentials are used to call the operation.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServiceSpecificCredentialRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the service-specific credential. You can get this value by calling
     * <a>ListServiceSpecificCredentials</a>.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * 
     * @param serviceSpecificCredentialId
     *        The unique identifier of the service-specific credential. You can get this value by calling
     *        <a>ListServiceSpecificCredentials</a>.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that can consist of any upper or lowercased letter or digit.
     */

    public void setServiceSpecificCredentialId(String serviceSpecificCredentialId) {
        this.serviceSpecificCredentialId = serviceSpecificCredentialId;
    }

    /**
     * <p>
     * The unique identifier of the service-specific credential. You can get this value by calling
     * <a>ListServiceSpecificCredentials</a>.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * 
     * @return The unique identifier of the service-specific credential. You can get this value by calling
     *         <a>ListServiceSpecificCredentials</a>.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters that can consist of any upper or lowercased letter or digit.
     */

    public String getServiceSpecificCredentialId() {
        return this.serviceSpecificCredentialId;
    }

    /**
     * <p>
     * The unique identifier of the service-specific credential. You can get this value by calling
     * <a>ListServiceSpecificCredentials</a>.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * 
     * @param serviceSpecificCredentialId
     *        The unique identifier of the service-specific credential. You can get this value by calling
     *        <a>ListServiceSpecificCredentials</a>.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that can consist of any upper or lowercased letter or digit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServiceSpecificCredentialRequest withServiceSpecificCredentialId(String serviceSpecificCredentialId) {
        setServiceSpecificCredentialId(serviceSpecificCredentialId);
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getServiceSpecificCredentialId() != null)
            sb.append("ServiceSpecificCredentialId: ").append(getServiceSpecificCredentialId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteServiceSpecificCredentialRequest == false)
            return false;
        DeleteServiceSpecificCredentialRequest other = (DeleteServiceSpecificCredentialRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getServiceSpecificCredentialId() == null ^ this.getServiceSpecificCredentialId() == null)
            return false;
        if (other.getServiceSpecificCredentialId() != null && other.getServiceSpecificCredentialId().equals(this.getServiceSpecificCredentialId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getServiceSpecificCredentialId() == null) ? 0 : getServiceSpecificCredentialId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteServiceSpecificCredentialRequest clone() {
        return (DeleteServiceSpecificCredentialRequest) super.clone();
    }

}

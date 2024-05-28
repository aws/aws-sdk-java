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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationAuthenticationMethod"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteApplicationAuthenticationMethodRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ARN of the application with the authentication method to delete.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * Specifies the authentication method type to delete from the application.
     * </p>
     */
    private String authenticationMethodType;

    /**
     * <p>
     * Specifies the ARN of the application with the authentication method to delete.
     * </p>
     * 
     * @param applicationArn
     *        Specifies the ARN of the application with the authentication method to delete.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * Specifies the ARN of the application with the authentication method to delete.
     * </p>
     * 
     * @return Specifies the ARN of the application with the authentication method to delete.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * Specifies the ARN of the application with the authentication method to delete.
     * </p>
     * 
     * @param applicationArn
     *        Specifies the ARN of the application with the authentication method to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationAuthenticationMethodRequest withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * Specifies the authentication method type to delete from the application.
     * </p>
     * 
     * @param authenticationMethodType
     *        Specifies the authentication method type to delete from the application.
     * @see AuthenticationMethodType
     */

    public void setAuthenticationMethodType(String authenticationMethodType) {
        this.authenticationMethodType = authenticationMethodType;
    }

    /**
     * <p>
     * Specifies the authentication method type to delete from the application.
     * </p>
     * 
     * @return Specifies the authentication method type to delete from the application.
     * @see AuthenticationMethodType
     */

    public String getAuthenticationMethodType() {
        return this.authenticationMethodType;
    }

    /**
     * <p>
     * Specifies the authentication method type to delete from the application.
     * </p>
     * 
     * @param authenticationMethodType
     *        Specifies the authentication method type to delete from the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationMethodType
     */

    public DeleteApplicationAuthenticationMethodRequest withAuthenticationMethodType(String authenticationMethodType) {
        setAuthenticationMethodType(authenticationMethodType);
        return this;
    }

    /**
     * <p>
     * Specifies the authentication method type to delete from the application.
     * </p>
     * 
     * @param authenticationMethodType
     *        Specifies the authentication method type to delete from the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationMethodType
     */

    public DeleteApplicationAuthenticationMethodRequest withAuthenticationMethodType(AuthenticationMethodType authenticationMethodType) {
        this.authenticationMethodType = authenticationMethodType.toString();
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
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getAuthenticationMethodType() != null)
            sb.append("AuthenticationMethodType: ").append(getAuthenticationMethodType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApplicationAuthenticationMethodRequest == false)
            return false;
        DeleteApplicationAuthenticationMethodRequest other = (DeleteApplicationAuthenticationMethodRequest) obj;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getAuthenticationMethodType() == null ^ this.getAuthenticationMethodType() == null)
            return false;
        if (other.getAuthenticationMethodType() != null && other.getAuthenticationMethodType().equals(this.getAuthenticationMethodType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationMethodType() == null) ? 0 : getAuthenticationMethodType().hashCode());
        return hashCode;
    }

    @Override
    public DeleteApplicationAuthenticationMethodRequest clone() {
        return (DeleteApplicationAuthenticationMethodRequest) super.clone();
    }

}

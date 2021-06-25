/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes authorization configurations for the auth resources, configured as a part of your Amplify project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendAuthIdentityPoolConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBackendAuthIdentityPoolConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the Amazon Cognito identity pool used for authorization.
     * </p>
     */
    private String identityPoolName;
    /**
     * <p>
     * Set to true or false based on whether you want to enable guest authorization to your Amplify app.
     * </p>
     */
    private Boolean unauthenticatedLogin;

    /**
     * <p>
     * Name of the Amazon Cognito identity pool used for authorization.
     * </p>
     * 
     * @param identityPoolName
     *        Name of the Amazon Cognito identity pool used for authorization.
     */

    public void setIdentityPoolName(String identityPoolName) {
        this.identityPoolName = identityPoolName;
    }

    /**
     * <p>
     * Name of the Amazon Cognito identity pool used for authorization.
     * </p>
     * 
     * @return Name of the Amazon Cognito identity pool used for authorization.
     */

    public String getIdentityPoolName() {
        return this.identityPoolName;
    }

    /**
     * <p>
     * Name of the Amazon Cognito identity pool used for authorization.
     * </p>
     * 
     * @param identityPoolName
     *        Name of the Amazon Cognito identity pool used for authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendAuthIdentityPoolConfig withIdentityPoolName(String identityPoolName) {
        setIdentityPoolName(identityPoolName);
        return this;
    }

    /**
     * <p>
     * Set to true or false based on whether you want to enable guest authorization to your Amplify app.
     * </p>
     * 
     * @param unauthenticatedLogin
     *        Set to true or false based on whether you want to enable guest authorization to your Amplify app.
     */

    public void setUnauthenticatedLogin(Boolean unauthenticatedLogin) {
        this.unauthenticatedLogin = unauthenticatedLogin;
    }

    /**
     * <p>
     * Set to true or false based on whether you want to enable guest authorization to your Amplify app.
     * </p>
     * 
     * @return Set to true or false based on whether you want to enable guest authorization to your Amplify app.
     */

    public Boolean getUnauthenticatedLogin() {
        return this.unauthenticatedLogin;
    }

    /**
     * <p>
     * Set to true or false based on whether you want to enable guest authorization to your Amplify app.
     * </p>
     * 
     * @param unauthenticatedLogin
     *        Set to true or false based on whether you want to enable guest authorization to your Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendAuthIdentityPoolConfig withUnauthenticatedLogin(Boolean unauthenticatedLogin) {
        setUnauthenticatedLogin(unauthenticatedLogin);
        return this;
    }

    /**
     * <p>
     * Set to true or false based on whether you want to enable guest authorization to your Amplify app.
     * </p>
     * 
     * @return Set to true or false based on whether you want to enable guest authorization to your Amplify app.
     */

    public Boolean isUnauthenticatedLogin() {
        return this.unauthenticatedLogin;
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
        if (getIdentityPoolName() != null)
            sb.append("IdentityPoolName: ").append(getIdentityPoolName()).append(",");
        if (getUnauthenticatedLogin() != null)
            sb.append("UnauthenticatedLogin: ").append(getUnauthenticatedLogin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackendAuthIdentityPoolConfig == false)
            return false;
        CreateBackendAuthIdentityPoolConfig other = (CreateBackendAuthIdentityPoolConfig) obj;
        if (other.getIdentityPoolName() == null ^ this.getIdentityPoolName() == null)
            return false;
        if (other.getIdentityPoolName() != null && other.getIdentityPoolName().equals(this.getIdentityPoolName()) == false)
            return false;
        if (other.getUnauthenticatedLogin() == null ^ this.getUnauthenticatedLogin() == null)
            return false;
        if (other.getUnauthenticatedLogin() != null && other.getUnauthenticatedLogin().equals(this.getUnauthenticatedLogin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityPoolName() == null) ? 0 : getIdentityPoolName().hashCode());
        hashCode = prime * hashCode + ((getUnauthenticatedLogin() == null) ? 0 : getUnauthenticatedLogin().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackendAuthIdentityPoolConfig clone() {
        try {
            return (CreateBackendAuthIdentityPoolConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.CreateBackendAuthIdentityPoolConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

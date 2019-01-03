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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetRandomPassword" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRandomPasswordResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A string with the generated password.
     * </p>
     */
    private String randomPassword;

    /**
     * <p>
     * A string with the generated password.
     * </p>
     * 
     * @param randomPassword
     *        A string with the generated password.
     */

    public void setRandomPassword(String randomPassword) {
        this.randomPassword = randomPassword;
    }

    /**
     * <p>
     * A string with the generated password.
     * </p>
     * 
     * @return A string with the generated password.
     */

    public String getRandomPassword() {
        return this.randomPassword;
    }

    /**
     * <p>
     * A string with the generated password.
     * </p>
     * 
     * @param randomPassword
     *        A string with the generated password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRandomPasswordResult withRandomPassword(String randomPassword) {
        setRandomPassword(randomPassword);
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
        if (getRandomPassword() != null)
            sb.append("RandomPassword: ").append(getRandomPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRandomPasswordResult == false)
            return false;
        GetRandomPasswordResult other = (GetRandomPasswordResult) obj;
        if (other.getRandomPassword() == null ^ this.getRandomPassword() == null)
            return false;
        if (other.getRandomPassword() != null && other.getRandomPassword().equals(this.getRandomPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRandomPassword() == null) ? 0 : getRandomPassword().hashCode());
        return hashCode;
    }

    @Override
    public GetRandomPasswordResult clone() {
        try {
            return (GetRandomPasswordResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

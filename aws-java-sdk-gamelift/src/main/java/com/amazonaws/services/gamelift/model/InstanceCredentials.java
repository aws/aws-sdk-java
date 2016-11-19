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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;

/**
 * <p>
 * Set of credentials required to remotely access a fleet instance. Access credentials are requested by calling
 * <a>GetInstanceAccess</a> and returned in an <a>InstanceAccess</a> object.
 * </p>
 */
public class InstanceCredentials implements Serializable, Cloneable {

    /**
     * <p>
     * User login string.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * Secret string. For Windows instances, the secret is a password. For Linux instances, it is a private key.
     * </p>
     */
    private String secret;

    /**
     * <p>
     * User login string.
     * </p>
     * 
     * @param userName
     *        User login string.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * User login string.
     * </p>
     * 
     * @return User login string.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * User login string.
     * </p>
     * 
     * @param userName
     *        User login string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceCredentials withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * Secret string. For Windows instances, the secret is a password. For Linux instances, it is a private key.
     * </p>
     * 
     * @param secret
     *        Secret string. For Windows instances, the secret is a password. For Linux instances, it is a private key.
     */

    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * <p>
     * Secret string. For Windows instances, the secret is a password. For Linux instances, it is a private key.
     * </p>
     * 
     * @return Secret string. For Windows instances, the secret is a password. For Linux instances, it is a private key.
     */

    public String getSecret() {
        return this.secret;
    }

    /**
     * <p>
     * Secret string. For Windows instances, the secret is a password. For Linux instances, it is a private key.
     * </p>
     * 
     * @param secret
     *        Secret string. For Windows instances, the secret is a password. For Linux instances, it is a private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceCredentials withSecret(String secret) {
        setSecret(secret);
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getSecret() != null)
            sb.append("Secret: " + getSecret());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceCredentials == false)
            return false;
        InstanceCredentials other = (InstanceCredentials) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getSecret() == null ^ this.getSecret() == null)
            return false;
        if (other.getSecret() != null && other.getSecret().equals(this.getSecret()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getSecret() == null) ? 0 : getSecret().hashCode());
        return hashCode;
    }

    @Override
    public InstanceCredentials clone() {
        try {
            return (InstanceCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

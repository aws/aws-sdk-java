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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Set of credentials required to remotely access a fleet instance. Access credentials are requested by calling
 * <a>GetInstanceAccess</a> and returned in an <a>InstanceAccess</a> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/InstanceCredentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * User login string.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * Secret string. For Windows instances, the secret is a password for use with Windows Remote Desktop. For Linux
     * instances, it is a private key (which must be saved as a <code>.pem</code> file) for use with SSH.
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
     * Secret string. For Windows instances, the secret is a password for use with Windows Remote Desktop. For Linux
     * instances, it is a private key (which must be saved as a <code>.pem</code> file) for use with SSH.
     * </p>
     * 
     * @param secret
     *        Secret string. For Windows instances, the secret is a password for use with Windows Remote Desktop. For
     *        Linux instances, it is a private key (which must be saved as a <code>.pem</code> file) for use with SSH.
     */

    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * <p>
     * Secret string. For Windows instances, the secret is a password for use with Windows Remote Desktop. For Linux
     * instances, it is a private key (which must be saved as a <code>.pem</code> file) for use with SSH.
     * </p>
     * 
     * @return Secret string. For Windows instances, the secret is a password for use with Windows Remote Desktop. For
     *         Linux instances, it is a private key (which must be saved as a <code>.pem</code> file) for use with SSH.
     */

    public String getSecret() {
        return this.secret;
    }

    /**
     * <p>
     * Secret string. For Windows instances, the secret is a password for use with Windows Remote Desktop. For Linux
     * instances, it is a private key (which must be saved as a <code>.pem</code> file) for use with SSH.
     * </p>
     * 
     * @param secret
     *        Secret string. For Windows instances, the secret is a password for use with Windows Remote Desktop. For
     *        Linux instances, it is a private key (which must be saved as a <code>.pem</code> file) for use with SSH.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceCredentials withSecret(String secret) {
        setSecret(secret);
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
        if (getSecret() != null)
            sb.append("Secret: ").append(getSecret());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.InstanceCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * AWS access credentials required to upload game build files to Amazon GameLift. These credentials are generated with
 * <a>CreateBuild</a>, and are valid for a limited time. If they expire before you upload your game build, get a new set
 * by calling <a>RequestUploadCredentials</a>.
 * </p>
 */
public class Credentials implements Serializable, Cloneable {

    /**
     * <p>
     * Access key for an AWS account.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * Secret key for an AWS account.
     * </p>
     */
    private String secretAccessKey;
    /**
     * <p>
     * Token specific to a build ID.
     * </p>
     */
    private String sessionToken;

    /**
     * <p>
     * Access key for an AWS account.
     * </p>
     * 
     * @param accessKeyId
     *        Access key for an AWS account.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * Access key for an AWS account.
     * </p>
     * 
     * @return Access key for an AWS account.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * Access key for an AWS account.
     * </p>
     * 
     * @param accessKeyId
     *        Access key for an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * Secret key for an AWS account.
     * </p>
     * 
     * @param secretAccessKey
     *        Secret key for an AWS account.
     */

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * <p>
     * Secret key for an AWS account.
     * </p>
     * 
     * @return Secret key for an AWS account.
     */

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * <p>
     * Secret key for an AWS account.
     * </p>
     * 
     * @param secretAccessKey
     *        Secret key for an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withSecretAccessKey(String secretAccessKey) {
        setSecretAccessKey(secretAccessKey);
        return this;
    }

    /**
     * <p>
     * Token specific to a build ID.
     * </p>
     * 
     * @param sessionToken
     *        Token specific to a build ID.
     */

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * <p>
     * Token specific to a build ID.
     * </p>
     * 
     * @return Token specific to a build ID.
     */

    public String getSessionToken() {
        return this.sessionToken;
    }

    /**
     * <p>
     * Token specific to a build ID.
     * </p>
     * 
     * @param sessionToken
     *        Token specific to a build ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withSessionToken(String sessionToken) {
        setSessionToken(sessionToken);
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
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: " + getAccessKeyId() + ",");
        if (getSecretAccessKey() != null)
            sb.append("SecretAccessKey: " + getSecretAccessKey() + ",");
        if (getSessionToken() != null)
            sb.append("SessionToken: " + getSessionToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Credentials == false)
            return false;
        Credentials other = (Credentials) obj;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getSecretAccessKey() == null ^ this.getSecretAccessKey() == null)
            return false;
        if (other.getSecretAccessKey() != null && other.getSecretAccessKey().equals(this.getSecretAccessKey()) == false)
            return false;
        if (other.getSessionToken() == null ^ this.getSessionToken() == null)
            return false;
        if (other.getSessionToken() != null && other.getSessionToken().equals(this.getSessionToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getSecretAccessKey() == null) ? 0 : getSecretAccessKey().hashCode());
        hashCode = prime * hashCode + ((getSessionToken() == null) ? 0 : getSessionToken().hashCode());
        return hashCode;
    }

    @Override
    public Credentials clone() {
        try {
            return (Credentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

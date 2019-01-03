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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the response from the server after AWS Device Farm makes a request to install to a remote access session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/InstallToRemoteAccessSession"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstallToRemoteAccessSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An app to upload or that has been uploaded.
     * </p>
     */
    private Upload appUpload;

    /**
     * <p>
     * An app to upload or that has been uploaded.
     * </p>
     * 
     * @param appUpload
     *        An app to upload or that has been uploaded.
     */

    public void setAppUpload(Upload appUpload) {
        this.appUpload = appUpload;
    }

    /**
     * <p>
     * An app to upload or that has been uploaded.
     * </p>
     * 
     * @return An app to upload or that has been uploaded.
     */

    public Upload getAppUpload() {
        return this.appUpload;
    }

    /**
     * <p>
     * An app to upload or that has been uploaded.
     * </p>
     * 
     * @param appUpload
     *        An app to upload or that has been uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstallToRemoteAccessSessionResult withAppUpload(Upload appUpload) {
        setAppUpload(appUpload);
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
        if (getAppUpload() != null)
            sb.append("AppUpload: ").append(getAppUpload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstallToRemoteAccessSessionResult == false)
            return false;
        InstallToRemoteAccessSessionResult other = (InstallToRemoteAccessSessionResult) obj;
        if (other.getAppUpload() == null ^ this.getAppUpload() == null)
            return false;
        if (other.getAppUpload() != null && other.getAppUpload().equals(this.getAppUpload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppUpload() == null) ? 0 : getAppUpload().hashCode());
        return hashCode;
    }

    @Override
    public InstallToRemoteAccessSessionResult clone() {
        try {
            return (InstallToRemoteAccessSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

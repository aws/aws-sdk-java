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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteInstallationMedia" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteInstallationMediaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The installation medium ID.
     * </p>
     */
    private String installationMediaId;

    /**
     * <p>
     * The installation medium ID.
     * </p>
     * 
     * @param installationMediaId
     *        The installation medium ID.
     */

    public void setInstallationMediaId(String installationMediaId) {
        this.installationMediaId = installationMediaId;
    }

    /**
     * <p>
     * The installation medium ID.
     * </p>
     * 
     * @return The installation medium ID.
     */

    public String getInstallationMediaId() {
        return this.installationMediaId;
    }

    /**
     * <p>
     * The installation medium ID.
     * </p>
     * 
     * @param installationMediaId
     *        The installation medium ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInstallationMediaRequest withInstallationMediaId(String installationMediaId) {
        setInstallationMediaId(installationMediaId);
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
        if (getInstallationMediaId() != null)
            sb.append("InstallationMediaId: ").append(getInstallationMediaId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInstallationMediaRequest == false)
            return false;
        DeleteInstallationMediaRequest other = (DeleteInstallationMediaRequest) obj;
        if (other.getInstallationMediaId() == null ^ this.getInstallationMediaId() == null)
            return false;
        if (other.getInstallationMediaId() != null && other.getInstallationMediaId().equals(this.getInstallationMediaId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstallationMediaId() == null) ? 0 : getInstallationMediaId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteInstallationMediaRequest clone() {
        return (DeleteInstallationMediaRequest) super.clone();
    }

}

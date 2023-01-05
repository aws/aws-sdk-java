/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetRepositorySyncStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRepositorySyncStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The repository sync status detail data that's returned by Proton.
     * </p>
     */
    private RepositorySyncAttempt latestSync;

    /**
     * <p>
     * The repository sync status detail data that's returned by Proton.
     * </p>
     * 
     * @param latestSync
     *        The repository sync status detail data that's returned by Proton.
     */

    public void setLatestSync(RepositorySyncAttempt latestSync) {
        this.latestSync = latestSync;
    }

    /**
     * <p>
     * The repository sync status detail data that's returned by Proton.
     * </p>
     * 
     * @return The repository sync status detail data that's returned by Proton.
     */

    public RepositorySyncAttempt getLatestSync() {
        return this.latestSync;
    }

    /**
     * <p>
     * The repository sync status detail data that's returned by Proton.
     * </p>
     * 
     * @param latestSync
     *        The repository sync status detail data that's returned by Proton.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRepositorySyncStatusResult withLatestSync(RepositorySyncAttempt latestSync) {
        setLatestSync(latestSync);
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
        if (getLatestSync() != null)
            sb.append("LatestSync: ").append(getLatestSync());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRepositorySyncStatusResult == false)
            return false;
        GetRepositorySyncStatusResult other = (GetRepositorySyncStatusResult) obj;
        if (other.getLatestSync() == null ^ this.getLatestSync() == null)
            return false;
        if (other.getLatestSync() != null && other.getLatestSync().equals(this.getLatestSync()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLatestSync() == null) ? 0 : getLatestSync().hashCode());
        return hashCode;
    }

    @Override
    public GetRepositorySyncStatusResult clone() {
        try {
            return (GetRepositorySyncStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

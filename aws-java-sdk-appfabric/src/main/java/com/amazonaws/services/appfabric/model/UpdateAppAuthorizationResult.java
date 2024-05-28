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
package com.amazonaws.services.appfabric.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/UpdateAppAuthorization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAppAuthorizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains information about an app authorization.
     * </p>
     */
    private AppAuthorization appAuthorization;

    /**
     * <p>
     * Contains information about an app authorization.
     * </p>
     * 
     * @param appAuthorization
     *        Contains information about an app authorization.
     */

    public void setAppAuthorization(AppAuthorization appAuthorization) {
        this.appAuthorization = appAuthorization;
    }

    /**
     * <p>
     * Contains information about an app authorization.
     * </p>
     * 
     * @return Contains information about an app authorization.
     */

    public AppAuthorization getAppAuthorization() {
        return this.appAuthorization;
    }

    /**
     * <p>
     * Contains information about an app authorization.
     * </p>
     * 
     * @param appAuthorization
     *        Contains information about an app authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppAuthorizationResult withAppAuthorization(AppAuthorization appAuthorization) {
        setAppAuthorization(appAuthorization);
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
        if (getAppAuthorization() != null)
            sb.append("AppAuthorization: ").append(getAppAuthorization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAppAuthorizationResult == false)
            return false;
        UpdateAppAuthorizationResult other = (UpdateAppAuthorizationResult) obj;
        if (other.getAppAuthorization() == null ^ this.getAppAuthorization() == null)
            return false;
        if (other.getAppAuthorization() != null && other.getAppAuthorization().equals(this.getAppAuthorization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppAuthorization() == null) ? 0 : getAppAuthorization().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAppAuthorizationResult clone() {
        try {
            return (UpdateAppAuthorizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

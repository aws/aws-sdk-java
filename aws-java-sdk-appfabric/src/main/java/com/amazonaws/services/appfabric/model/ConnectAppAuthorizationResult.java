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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ConnectAppAuthorization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectAppAuthorizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains a summary of the app authorization.
     * </p>
     */
    private AppAuthorizationSummary appAuthorizationSummary;

    /**
     * <p>
     * Contains a summary of the app authorization.
     * </p>
     * 
     * @param appAuthorizationSummary
     *        Contains a summary of the app authorization.
     */

    public void setAppAuthorizationSummary(AppAuthorizationSummary appAuthorizationSummary) {
        this.appAuthorizationSummary = appAuthorizationSummary;
    }

    /**
     * <p>
     * Contains a summary of the app authorization.
     * </p>
     * 
     * @return Contains a summary of the app authorization.
     */

    public AppAuthorizationSummary getAppAuthorizationSummary() {
        return this.appAuthorizationSummary;
    }

    /**
     * <p>
     * Contains a summary of the app authorization.
     * </p>
     * 
     * @param appAuthorizationSummary
     *        Contains a summary of the app authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectAppAuthorizationResult withAppAuthorizationSummary(AppAuthorizationSummary appAuthorizationSummary) {
        setAppAuthorizationSummary(appAuthorizationSummary);
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
        if (getAppAuthorizationSummary() != null)
            sb.append("AppAuthorizationSummary: ").append(getAppAuthorizationSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectAppAuthorizationResult == false)
            return false;
        ConnectAppAuthorizationResult other = (ConnectAppAuthorizationResult) obj;
        if (other.getAppAuthorizationSummary() == null ^ this.getAppAuthorizationSummary() == null)
            return false;
        if (other.getAppAuthorizationSummary() != null && other.getAppAuthorizationSummary().equals(this.getAppAuthorizationSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppAuthorizationSummary() == null) ? 0 : getAppAuthorizationSummary().hashCode());
        return hashCode;
    }

    @Override
    public ConnectAppAuthorizationResult clone() {
        try {
            return (ConnectAppAuthorizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

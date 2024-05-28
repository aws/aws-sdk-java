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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteAppAuthorization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAppAuthorizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     */
    private String appBundleIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app authorization to use for the
     * request.
     * </p>
     */
    private String appAuthorizationIdentifier;

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     * 
     * @param appBundleIdentifier
     *        The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the
     *        request.
     */

    public void setAppBundleIdentifier(String appBundleIdentifier) {
        this.appBundleIdentifier = appBundleIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the
     *         request.
     */

    public String getAppBundleIdentifier() {
        return this.appBundleIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     * 
     * @param appBundleIdentifier
     *        The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppAuthorizationRequest withAppBundleIdentifier(String appBundleIdentifier) {
        setAppBundleIdentifier(appBundleIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app authorization to use for the
     * request.
     * </p>
     * 
     * @param appAuthorizationIdentifier
     *        The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app authorization to use for
     *        the request.
     */

    public void setAppAuthorizationIdentifier(String appAuthorizationIdentifier) {
        this.appAuthorizationIdentifier = appAuthorizationIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app authorization to use for the
     * request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app authorization to use for
     *         the request.
     */

    public String getAppAuthorizationIdentifier() {
        return this.appAuthorizationIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app authorization to use for the
     * request.
     * </p>
     * 
     * @param appAuthorizationIdentifier
     *        The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app authorization to use for
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppAuthorizationRequest withAppAuthorizationIdentifier(String appAuthorizationIdentifier) {
        setAppAuthorizationIdentifier(appAuthorizationIdentifier);
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
        if (getAppBundleIdentifier() != null)
            sb.append("AppBundleIdentifier: ").append(getAppBundleIdentifier()).append(",");
        if (getAppAuthorizationIdentifier() != null)
            sb.append("AppAuthorizationIdentifier: ").append(getAppAuthorizationIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAppAuthorizationRequest == false)
            return false;
        DeleteAppAuthorizationRequest other = (DeleteAppAuthorizationRequest) obj;
        if (other.getAppBundleIdentifier() == null ^ this.getAppBundleIdentifier() == null)
            return false;
        if (other.getAppBundleIdentifier() != null && other.getAppBundleIdentifier().equals(this.getAppBundleIdentifier()) == false)
            return false;
        if (other.getAppAuthorizationIdentifier() == null ^ this.getAppAuthorizationIdentifier() == null)
            return false;
        if (other.getAppAuthorizationIdentifier() != null && other.getAppAuthorizationIdentifier().equals(this.getAppAuthorizationIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppBundleIdentifier() == null) ? 0 : getAppBundleIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAppAuthorizationIdentifier() == null) ? 0 : getAppAuthorizationIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAppAuthorizationRequest clone() {
        return (DeleteAppAuthorizationRequest) super.clone();
    }

}

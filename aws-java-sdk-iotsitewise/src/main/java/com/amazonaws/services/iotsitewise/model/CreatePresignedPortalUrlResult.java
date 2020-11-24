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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreatePresignedPortalUrl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePresignedPortalUrlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pre-signed URL to the portal. The URL contains the portal ID and an authentication token that lets you access
     * the portal. The URL has the following format.
     * </p>
     * <p>
     * <code>https://&lt;portal-id&gt;.app.iotsitewise.aws/iam?token=&lt;encrypted-token&gt;</code>
     * </p>
     */
    private String presignedPortalUrl;

    /**
     * <p>
     * The pre-signed URL to the portal. The URL contains the portal ID and an authentication token that lets you access
     * the portal. The URL has the following format.
     * </p>
     * <p>
     * <code>https://&lt;portal-id&gt;.app.iotsitewise.aws/iam?token=&lt;encrypted-token&gt;</code>
     * </p>
     * 
     * @param presignedPortalUrl
     *        The pre-signed URL to the portal. The URL contains the portal ID and an authentication token that lets you
     *        access the portal. The URL has the following format.</p>
     *        <p>
     *        <code>https://&lt;portal-id&gt;.app.iotsitewise.aws/iam?token=&lt;encrypted-token&gt;</code>
     */

    public void setPresignedPortalUrl(String presignedPortalUrl) {
        this.presignedPortalUrl = presignedPortalUrl;
    }

    /**
     * <p>
     * The pre-signed URL to the portal. The URL contains the portal ID and an authentication token that lets you access
     * the portal. The URL has the following format.
     * </p>
     * <p>
     * <code>https://&lt;portal-id&gt;.app.iotsitewise.aws/iam?token=&lt;encrypted-token&gt;</code>
     * </p>
     * 
     * @return The pre-signed URL to the portal. The URL contains the portal ID and an authentication token that lets
     *         you access the portal. The URL has the following format.</p>
     *         <p>
     *         <code>https://&lt;portal-id&gt;.app.iotsitewise.aws/iam?token=&lt;encrypted-token&gt;</code>
     */

    public String getPresignedPortalUrl() {
        return this.presignedPortalUrl;
    }

    /**
     * <p>
     * The pre-signed URL to the portal. The URL contains the portal ID and an authentication token that lets you access
     * the portal. The URL has the following format.
     * </p>
     * <p>
     * <code>https://&lt;portal-id&gt;.app.iotsitewise.aws/iam?token=&lt;encrypted-token&gt;</code>
     * </p>
     * 
     * @param presignedPortalUrl
     *        The pre-signed URL to the portal. The URL contains the portal ID and an authentication token that lets you
     *        access the portal. The URL has the following format.</p>
     *        <p>
     *        <code>https://&lt;portal-id&gt;.app.iotsitewise.aws/iam?token=&lt;encrypted-token&gt;</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresignedPortalUrlResult withPresignedPortalUrl(String presignedPortalUrl) {
        setPresignedPortalUrl(presignedPortalUrl);
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
        if (getPresignedPortalUrl() != null)
            sb.append("PresignedPortalUrl: ").append(getPresignedPortalUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePresignedPortalUrlResult == false)
            return false;
        CreatePresignedPortalUrlResult other = (CreatePresignedPortalUrlResult) obj;
        if (other.getPresignedPortalUrl() == null ^ this.getPresignedPortalUrl() == null)
            return false;
        if (other.getPresignedPortalUrl() != null && other.getPresignedPortalUrl().equals(this.getPresignedPortalUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPresignedPortalUrl() == null) ? 0 : getPresignedPortalUrl().hashCode());
        return hashCode;
    }

    @Override
    public CreatePresignedPortalUrlResult clone() {
        try {
            return (CreatePresignedPortalUrlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

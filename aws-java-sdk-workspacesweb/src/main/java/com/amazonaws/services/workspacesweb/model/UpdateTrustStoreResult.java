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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateTrustStore" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTrustStoreResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the trust store.
     * </p>
     */
    private String trustStoreArn;

    /**
     * <p>
     * The ARN of the trust store.
     * </p>
     * 
     * @param trustStoreArn
     *        The ARN of the trust store.
     */

    public void setTrustStoreArn(String trustStoreArn) {
        this.trustStoreArn = trustStoreArn;
    }

    /**
     * <p>
     * The ARN of the trust store.
     * </p>
     * 
     * @return The ARN of the trust store.
     */

    public String getTrustStoreArn() {
        return this.trustStoreArn;
    }

    /**
     * <p>
     * The ARN of the trust store.
     * </p>
     * 
     * @param trustStoreArn
     *        The ARN of the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrustStoreResult withTrustStoreArn(String trustStoreArn) {
        setTrustStoreArn(trustStoreArn);
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
        if (getTrustStoreArn() != null)
            sb.append("TrustStoreArn: ").append(getTrustStoreArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrustStoreResult == false)
            return false;
        UpdateTrustStoreResult other = (UpdateTrustStoreResult) obj;
        if (other.getTrustStoreArn() == null ^ this.getTrustStoreArn() == null)
            return false;
        if (other.getTrustStoreArn() != null && other.getTrustStoreArn().equals(this.getTrustStoreArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrustStoreArn() == null) ? 0 : getTrustStoreArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrustStoreResult clone() {
        try {
            return (UpdateTrustStoreResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteFileCache" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFileCacheRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the cache that's being deleted.
     * </p>
     */
    private String fileCacheId;

    private String clientRequestToken;

    /**
     * <p>
     * The ID of the cache that's being deleted.
     * </p>
     * 
     * @param fileCacheId
     *        The ID of the cache that's being deleted.
     */

    public void setFileCacheId(String fileCacheId) {
        this.fileCacheId = fileCacheId;
    }

    /**
     * <p>
     * The ID of the cache that's being deleted.
     * </p>
     * 
     * @return The ID of the cache that's being deleted.
     */

    public String getFileCacheId() {
        return this.fileCacheId;
    }

    /**
     * <p>
     * The ID of the cache that's being deleted.
     * </p>
     * 
     * @param fileCacheId
     *        The ID of the cache that's being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileCacheRequest withFileCacheId(String fileCacheId) {
        setFileCacheId(fileCacheId);
        return this;
    }

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileCacheRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getFileCacheId() != null)
            sb.append("FileCacheId: ").append(getFileCacheId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFileCacheRequest == false)
            return false;
        DeleteFileCacheRequest other = (DeleteFileCacheRequest) obj;
        if (other.getFileCacheId() == null ^ this.getFileCacheId() == null)
            return false;
        if (other.getFileCacheId() != null && other.getFileCacheId().equals(this.getFileCacheId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileCacheId() == null) ? 0 : getFileCacheId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFileCacheRequest clone() {
        return (DeleteFileCacheRequest) super.clone();
    }

}

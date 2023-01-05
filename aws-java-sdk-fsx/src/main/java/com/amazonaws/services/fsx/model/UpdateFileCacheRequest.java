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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileCache" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFileCacheRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the cache that you are updating.
     * </p>
     */
    private String fileCacheId;

    private String clientRequestToken;
    /**
     * <p>
     * The configuration updates for an Amazon File Cache resource.
     * </p>
     */
    private UpdateFileCacheLustreConfiguration lustreConfiguration;

    /**
     * <p>
     * The ID of the cache that you are updating.
     * </p>
     * 
     * @param fileCacheId
     *        The ID of the cache that you are updating.
     */

    public void setFileCacheId(String fileCacheId) {
        this.fileCacheId = fileCacheId;
    }

    /**
     * <p>
     * The ID of the cache that you are updating.
     * </p>
     * 
     * @return The ID of the cache that you are updating.
     */

    public String getFileCacheId() {
        return this.fileCacheId;
    }

    /**
     * <p>
     * The ID of the cache that you are updating.
     * </p>
     * 
     * @param fileCacheId
     *        The ID of the cache that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileCacheRequest withFileCacheId(String fileCacheId) {
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

    public UpdateFileCacheRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The configuration updates for an Amazon File Cache resource.
     * </p>
     * 
     * @param lustreConfiguration
     *        The configuration updates for an Amazon File Cache resource.
     */

    public void setLustreConfiguration(UpdateFileCacheLustreConfiguration lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
    }

    /**
     * <p>
     * The configuration updates for an Amazon File Cache resource.
     * </p>
     * 
     * @return The configuration updates for an Amazon File Cache resource.
     */

    public UpdateFileCacheLustreConfiguration getLustreConfiguration() {
        return this.lustreConfiguration;
    }

    /**
     * <p>
     * The configuration updates for an Amazon File Cache resource.
     * </p>
     * 
     * @param lustreConfiguration
     *        The configuration updates for an Amazon File Cache resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileCacheRequest withLustreConfiguration(UpdateFileCacheLustreConfiguration lustreConfiguration) {
        setLustreConfiguration(lustreConfiguration);
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
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getLustreConfiguration() != null)
            sb.append("LustreConfiguration: ").append(getLustreConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileCacheRequest == false)
            return false;
        UpdateFileCacheRequest other = (UpdateFileCacheRequest) obj;
        if (other.getFileCacheId() == null ^ this.getFileCacheId() == null)
            return false;
        if (other.getFileCacheId() != null && other.getFileCacheId().equals(this.getFileCacheId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getLustreConfiguration() == null ^ this.getLustreConfiguration() == null)
            return false;
        if (other.getLustreConfiguration() != null && other.getLustreConfiguration().equals(this.getLustreConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileCacheId() == null) ? 0 : getFileCacheId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getLustreConfiguration() == null) ? 0 : getLustreConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFileCacheRequest clone() {
        return (UpdateFileCacheRequest) super.clone();
    }

}

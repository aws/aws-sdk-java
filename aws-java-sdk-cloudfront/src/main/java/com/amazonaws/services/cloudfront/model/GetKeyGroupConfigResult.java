/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetKeyGroupConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKeyGroupConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The key group configuration.
     * </p>
     */
    private KeyGroupConfig keyGroupConfig;
    /**
     * <p>
     * The identifier for this version of the key group.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * The key group configuration.
     * </p>
     * 
     * @param keyGroupConfig
     *        The key group configuration.
     */

    public void setKeyGroupConfig(KeyGroupConfig keyGroupConfig) {
        this.keyGroupConfig = keyGroupConfig;
    }

    /**
     * <p>
     * The key group configuration.
     * </p>
     * 
     * @return The key group configuration.
     */

    public KeyGroupConfig getKeyGroupConfig() {
        return this.keyGroupConfig;
    }

    /**
     * <p>
     * The key group configuration.
     * </p>
     * 
     * @param keyGroupConfig
     *        The key group configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyGroupConfigResult withKeyGroupConfig(KeyGroupConfig keyGroupConfig) {
        setKeyGroupConfig(keyGroupConfig);
        return this;
    }

    /**
     * <p>
     * The identifier for this version of the key group.
     * </p>
     * 
     * @param eTag
     *        The identifier for this version of the key group.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The identifier for this version of the key group.
     * </p>
     * 
     * @return The identifier for this version of the key group.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The identifier for this version of the key group.
     * </p>
     * 
     * @param eTag
     *        The identifier for this version of the key group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyGroupConfigResult withETag(String eTag) {
        setETag(eTag);
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
        if (getKeyGroupConfig() != null)
            sb.append("KeyGroupConfig: ").append(getKeyGroupConfig()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKeyGroupConfigResult == false)
            return false;
        GetKeyGroupConfigResult other = (GetKeyGroupConfigResult) obj;
        if (other.getKeyGroupConfig() == null ^ this.getKeyGroupConfig() == null)
            return false;
        if (other.getKeyGroupConfig() != null && other.getKeyGroupConfig().equals(this.getKeyGroupConfig()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyGroupConfig() == null) ? 0 : getKeyGroupConfig().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public GetKeyGroupConfigResult clone() {
        try {
            return (GetKeyGroupConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

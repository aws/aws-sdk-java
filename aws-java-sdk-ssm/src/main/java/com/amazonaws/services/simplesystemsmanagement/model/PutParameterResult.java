/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutParameterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The new version number of a parameter. If you edit a parameter value, Parameter Store automatically creates a new
     * version and assigns this new version a unique ID. You can reference a parameter version ID in API actions or in
     * Systems Manager documents (SSM documents). By default, if you don't specify a specific version, the system
     * returns the latest parameter value when a parameter is called.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The new version number of a parameter. If you edit a parameter value, Parameter Store automatically creates a new
     * version and assigns this new version a unique ID. You can reference a parameter version ID in API actions or in
     * Systems Manager documents (SSM documents). By default, if you don't specify a specific version, the system
     * returns the latest parameter value when a parameter is called.
     * </p>
     * 
     * @param version
     *        The new version number of a parameter. If you edit a parameter value, Parameter Store automatically
     *        creates a new version and assigns this new version a unique ID. You can reference a parameter version ID
     *        in API actions or in Systems Manager documents (SSM documents). By default, if you don't specify a
     *        specific version, the system returns the latest parameter value when a parameter is called.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The new version number of a parameter. If you edit a parameter value, Parameter Store automatically creates a new
     * version and assigns this new version a unique ID. You can reference a parameter version ID in API actions or in
     * Systems Manager documents (SSM documents). By default, if you don't specify a specific version, the system
     * returns the latest parameter value when a parameter is called.
     * </p>
     * 
     * @return The new version number of a parameter. If you edit a parameter value, Parameter Store automatically
     *         creates a new version and assigns this new version a unique ID. You can reference a parameter version ID
     *         in API actions or in Systems Manager documents (SSM documents). By default, if you don't specify a
     *         specific version, the system returns the latest parameter value when a parameter is called.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The new version number of a parameter. If you edit a parameter value, Parameter Store automatically creates a new
     * version and assigns this new version a unique ID. You can reference a parameter version ID in API actions or in
     * Systems Manager documents (SSM documents). By default, if you don't specify a specific version, the system
     * returns the latest parameter value when a parameter is called.
     * </p>
     * 
     * @param version
     *        The new version number of a parameter. If you edit a parameter value, Parameter Store automatically
     *        creates a new version and assigns this new version a unique ID. You can reference a parameter version ID
     *        in API actions or in Systems Manager documents (SSM documents). By default, if you don't specify a
     *        specific version, the system returns the latest parameter value when a parameter is called.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutParameterResult withVersion(Long version) {
        setVersion(version);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutParameterResult == false)
            return false;
        PutParameterResult other = (PutParameterResult) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public PutParameterResult clone() {
        try {
            return (PutParameterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

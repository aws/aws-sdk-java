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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateSecurityConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSecurityConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the created security configuration.
     * </p>
     */
    private SecurityConfigDetail securityConfigDetail;

    /**
     * <p>
     * Details about the created security configuration.
     * </p>
     * 
     * @param securityConfigDetail
     *        Details about the created security configuration.
     */

    public void setSecurityConfigDetail(SecurityConfigDetail securityConfigDetail) {
        this.securityConfigDetail = securityConfigDetail;
    }

    /**
     * <p>
     * Details about the created security configuration.
     * </p>
     * 
     * @return Details about the created security configuration.
     */

    public SecurityConfigDetail getSecurityConfigDetail() {
        return this.securityConfigDetail;
    }

    /**
     * <p>
     * Details about the created security configuration.
     * </p>
     * 
     * @param securityConfigDetail
     *        Details about the created security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityConfigResult withSecurityConfigDetail(SecurityConfigDetail securityConfigDetail) {
        setSecurityConfigDetail(securityConfigDetail);
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
        if (getSecurityConfigDetail() != null)
            sb.append("SecurityConfigDetail: ").append(getSecurityConfigDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSecurityConfigResult == false)
            return false;
        CreateSecurityConfigResult other = (CreateSecurityConfigResult) obj;
        if (other.getSecurityConfigDetail() == null ^ this.getSecurityConfigDetail() == null)
            return false;
        if (other.getSecurityConfigDetail() != null && other.getSecurityConfigDetail().equals(this.getSecurityConfigDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityConfigDetail() == null) ? 0 : getSecurityConfigDetail().hashCode());
        return hashCode;
    }

    @Override
    public CreateSecurityConfigResult clone() {
        try {
            return (CreateSecurityConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

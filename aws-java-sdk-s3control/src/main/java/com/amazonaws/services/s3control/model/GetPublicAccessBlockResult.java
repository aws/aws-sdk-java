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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetPublicAccessBlock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPublicAccessBlockResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The Public Access Block configuration currently in effect for this Amazon Web Services account.
     * </p>
     */
    private PublicAccessBlockConfiguration publicAccessBlockConfiguration;

    /**
     * <p>
     * The Public Access Block configuration currently in effect for this Amazon Web Services account.
     * </p>
     * 
     * @param publicAccessBlockConfiguration
     *        The Public Access Block configuration currently in effect for this Amazon Web Services account.
     */

    public void setPublicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
    }

    /**
     * <p>
     * The Public Access Block configuration currently in effect for this Amazon Web Services account.
     * </p>
     * 
     * @return The Public Access Block configuration currently in effect for this Amazon Web Services account.
     */

    public PublicAccessBlockConfiguration getPublicAccessBlockConfiguration() {
        return this.publicAccessBlockConfiguration;
    }

    /**
     * <p>
     * The Public Access Block configuration currently in effect for this Amazon Web Services account.
     * </p>
     * 
     * @param publicAccessBlockConfiguration
     *        The Public Access Block configuration currently in effect for this Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPublicAccessBlockResult withPublicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        setPublicAccessBlockConfiguration(publicAccessBlockConfiguration);
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
        if (getPublicAccessBlockConfiguration() != null)
            sb.append("PublicAccessBlockConfiguration: ").append(getPublicAccessBlockConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPublicAccessBlockResult == false)
            return false;
        GetPublicAccessBlockResult other = (GetPublicAccessBlockResult) obj;
        if (other.getPublicAccessBlockConfiguration() == null ^ this.getPublicAccessBlockConfiguration() == null)
            return false;
        if (other.getPublicAccessBlockConfiguration() != null
                && other.getPublicAccessBlockConfiguration().equals(this.getPublicAccessBlockConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublicAccessBlockConfiguration() == null) ? 0 : getPublicAccessBlockConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetPublicAccessBlockResult clone() {
        try {
            return (GetPublicAccessBlockResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

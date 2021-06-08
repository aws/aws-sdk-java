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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateWebACLMigrationStack"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWebACLMigrationStackResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The URL of the template created in Amazon S3.
     * </p>
     */
    private String s3ObjectUrl;

    /**
     * <p>
     * The URL of the template created in Amazon S3.
     * </p>
     * 
     * @param s3ObjectUrl
     *        The URL of the template created in Amazon S3.
     */

    public void setS3ObjectUrl(String s3ObjectUrl) {
        this.s3ObjectUrl = s3ObjectUrl;
    }

    /**
     * <p>
     * The URL of the template created in Amazon S3.
     * </p>
     * 
     * @return The URL of the template created in Amazon S3.
     */

    public String getS3ObjectUrl() {
        return this.s3ObjectUrl;
    }

    /**
     * <p>
     * The URL of the template created in Amazon S3.
     * </p>
     * 
     * @param s3ObjectUrl
     *        The URL of the template created in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebACLMigrationStackResult withS3ObjectUrl(String s3ObjectUrl) {
        setS3ObjectUrl(s3ObjectUrl);
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
        if (getS3ObjectUrl() != null)
            sb.append("S3ObjectUrl: ").append(getS3ObjectUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWebACLMigrationStackResult == false)
            return false;
        CreateWebACLMigrationStackResult other = (CreateWebACLMigrationStackResult) obj;
        if (other.getS3ObjectUrl() == null ^ this.getS3ObjectUrl() == null)
            return false;
        if (other.getS3ObjectUrl() != null && other.getS3ObjectUrl().equals(this.getS3ObjectUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3ObjectUrl() == null) ? 0 : getS3ObjectUrl().hashCode());
        return hashCode;
    }

    @Override
    public CreateWebACLMigrationStackResult clone() {
        try {
            return (CreateWebACLMigrationStackResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetClassificationScope" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetClassificationScopeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the classification scope.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the classification scope.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The S3 buckets that are excluded from automated sensitive data discovery.
     * </p>
     */
    private S3ClassificationScope s3;

    /**
     * <p>
     * The unique identifier for the classification scope.
     * </p>
     * 
     * @param id
     *        The unique identifier for the classification scope.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the classification scope.
     * </p>
     * 
     * @return The unique identifier for the classification scope.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the classification scope.
     * </p>
     * 
     * @param id
     *        The unique identifier for the classification scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClassificationScopeResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the classification scope.
     * </p>
     * 
     * @param name
     *        The name of the classification scope.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the classification scope.
     * </p>
     * 
     * @return The name of the classification scope.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the classification scope.
     * </p>
     * 
     * @param name
     *        The name of the classification scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClassificationScopeResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The S3 buckets that are excluded from automated sensitive data discovery.
     * </p>
     * 
     * @param s3
     *        The S3 buckets that are excluded from automated sensitive data discovery.
     */

    public void setS3(S3ClassificationScope s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * The S3 buckets that are excluded from automated sensitive data discovery.
     * </p>
     * 
     * @return The S3 buckets that are excluded from automated sensitive data discovery.
     */

    public S3ClassificationScope getS3() {
        return this.s3;
    }

    /**
     * <p>
     * The S3 buckets that are excluded from automated sensitive data discovery.
     * </p>
     * 
     * @param s3
     *        The S3 buckets that are excluded from automated sensitive data discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClassificationScopeResult withS3(S3ClassificationScope s3) {
        setS3(s3);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getS3() != null)
            sb.append("S3: ").append(getS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetClassificationScopeResult == false)
            return false;
        GetClassificationScopeResult other = (GetClassificationScopeResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        return hashCode;
    }

    @Override
    public GetClassificationScopeResult clone() {
        try {
            return (GetClassificationScopeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

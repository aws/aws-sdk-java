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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the S3 buckets that are excluded from automated sensitive data discovery for an Amazon Macie account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/S3ClassificationScope" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ClassificationScope implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 buckets that are excluded.
     * </p>
     */
    private S3ClassificationScopeExclusion excludes;

    /**
     * <p>
     * The S3 buckets that are excluded.
     * </p>
     * 
     * @param excludes
     *        The S3 buckets that are excluded.
     */

    public void setExcludes(S3ClassificationScopeExclusion excludes) {
        this.excludes = excludes;
    }

    /**
     * <p>
     * The S3 buckets that are excluded.
     * </p>
     * 
     * @return The S3 buckets that are excluded.
     */

    public S3ClassificationScopeExclusion getExcludes() {
        return this.excludes;
    }

    /**
     * <p>
     * The S3 buckets that are excluded.
     * </p>
     * 
     * @param excludes
     *        The S3 buckets that are excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ClassificationScope withExcludes(S3ClassificationScopeExclusion excludes) {
        setExcludes(excludes);
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
        if (getExcludes() != null)
            sb.append("Excludes: ").append(getExcludes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ClassificationScope == false)
            return false;
        S3ClassificationScope other = (S3ClassificationScope) obj;
        if (other.getExcludes() == null ^ this.getExcludes() == null)
            return false;
        if (other.getExcludes() != null && other.getExcludes().equals(this.getExcludes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExcludes() == null) ? 0 : getExcludes().hashCode());
        return hashCode;
    }

    @Override
    public S3ClassificationScope clone() {
        try {
            return (S3ClassificationScope) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.S3ClassificationScopeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

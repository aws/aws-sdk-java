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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CopyProduct" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyProductResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use to track the progress of the operation.
     * </p>
     */
    private String copyProductToken;

    /**
     * <p>
     * The token to use to track the progress of the operation.
     * </p>
     * 
     * @param copyProductToken
     *        The token to use to track the progress of the operation.
     */

    public void setCopyProductToken(String copyProductToken) {
        this.copyProductToken = copyProductToken;
    }

    /**
     * <p>
     * The token to use to track the progress of the operation.
     * </p>
     * 
     * @return The token to use to track the progress of the operation.
     */

    public String getCopyProductToken() {
        return this.copyProductToken;
    }

    /**
     * <p>
     * The token to use to track the progress of the operation.
     * </p>
     * 
     * @param copyProductToken
     *        The token to use to track the progress of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyProductResult withCopyProductToken(String copyProductToken) {
        setCopyProductToken(copyProductToken);
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
        if (getCopyProductToken() != null)
            sb.append("CopyProductToken: ").append(getCopyProductToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyProductResult == false)
            return false;
        CopyProductResult other = (CopyProductResult) obj;
        if (other.getCopyProductToken() == null ^ this.getCopyProductToken() == null)
            return false;
        if (other.getCopyProductToken() != null && other.getCopyProductToken().equals(this.getCopyProductToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCopyProductToken() == null) ? 0 : getCopyProductToken().hashCode());
        return hashCode;
    }

    @Override
    public CopyProductResult clone() {
        try {
            return (CopyProductResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

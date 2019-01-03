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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCodeRepository" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCodeRepositoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new repository.
     * </p>
     */
    private String codeRepositoryArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new repository.
     * </p>
     * 
     * @param codeRepositoryArn
     *        The Amazon Resource Name (ARN) of the new repository.
     */

    public void setCodeRepositoryArn(String codeRepositoryArn) {
        this.codeRepositoryArn = codeRepositoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new repository.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the new repository.
     */

    public String getCodeRepositoryArn() {
        return this.codeRepositoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new repository.
     * </p>
     * 
     * @param codeRepositoryArn
     *        The Amazon Resource Name (ARN) of the new repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCodeRepositoryResult withCodeRepositoryArn(String codeRepositoryArn) {
        setCodeRepositoryArn(codeRepositoryArn);
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
        if (getCodeRepositoryArn() != null)
            sb.append("CodeRepositoryArn: ").append(getCodeRepositoryArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCodeRepositoryResult == false)
            return false;
        CreateCodeRepositoryResult other = (CreateCodeRepositoryResult) obj;
        if (other.getCodeRepositoryArn() == null ^ this.getCodeRepositoryArn() == null)
            return false;
        if (other.getCodeRepositoryArn() != null && other.getCodeRepositoryArn().equals(this.getCodeRepositoryArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeRepositoryArn() == null) ? 0 : getCodeRepositoryArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateCodeRepositoryResult clone() {
        try {
            return (CreateCodeRepositoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateNotebookInstanceLifecycleConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNotebookInstanceLifecycleConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle configuration.
     * </p>
     */
    private String notebookInstanceLifecycleConfigArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle configuration.
     * </p>
     * 
     * @param notebookInstanceLifecycleConfigArn
     *        The Amazon Resource Name (ARN) of the lifecycle configuration.
     */

    public void setNotebookInstanceLifecycleConfigArn(String notebookInstanceLifecycleConfigArn) {
        this.notebookInstanceLifecycleConfigArn = notebookInstanceLifecycleConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the lifecycle configuration.
     */

    public String getNotebookInstanceLifecycleConfigArn() {
        return this.notebookInstanceLifecycleConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle configuration.
     * </p>
     * 
     * @param notebookInstanceLifecycleConfigArn
     *        The Amazon Resource Name (ARN) of the lifecycle configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceLifecycleConfigResult withNotebookInstanceLifecycleConfigArn(String notebookInstanceLifecycleConfigArn) {
        setNotebookInstanceLifecycleConfigArn(notebookInstanceLifecycleConfigArn);
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
        if (getNotebookInstanceLifecycleConfigArn() != null)
            sb.append("NotebookInstanceLifecycleConfigArn: ").append(getNotebookInstanceLifecycleConfigArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNotebookInstanceLifecycleConfigResult == false)
            return false;
        CreateNotebookInstanceLifecycleConfigResult other = (CreateNotebookInstanceLifecycleConfigResult) obj;
        if (other.getNotebookInstanceLifecycleConfigArn() == null ^ this.getNotebookInstanceLifecycleConfigArn() == null)
            return false;
        if (other.getNotebookInstanceLifecycleConfigArn() != null
                && other.getNotebookInstanceLifecycleConfigArn().equals(this.getNotebookInstanceLifecycleConfigArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookInstanceLifecycleConfigArn() == null) ? 0 : getNotebookInstanceLifecycleConfigArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateNotebookInstanceLifecycleConfigResult clone() {
        try {
            return (CreateNotebookInstanceLifecycleConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

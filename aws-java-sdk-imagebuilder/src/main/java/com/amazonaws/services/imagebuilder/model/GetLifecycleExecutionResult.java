/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetLifecycleExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLifecycleExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Runtime details for the specified runtime instance of the lifecycle policy.
     * </p>
     */
    private LifecycleExecution lifecycleExecution;

    /**
     * <p>
     * Runtime details for the specified runtime instance of the lifecycle policy.
     * </p>
     * 
     * @param lifecycleExecution
     *        Runtime details for the specified runtime instance of the lifecycle policy.
     */

    public void setLifecycleExecution(LifecycleExecution lifecycleExecution) {
        this.lifecycleExecution = lifecycleExecution;
    }

    /**
     * <p>
     * Runtime details for the specified runtime instance of the lifecycle policy.
     * </p>
     * 
     * @return Runtime details for the specified runtime instance of the lifecycle policy.
     */

    public LifecycleExecution getLifecycleExecution() {
        return this.lifecycleExecution;
    }

    /**
     * <p>
     * Runtime details for the specified runtime instance of the lifecycle policy.
     * </p>
     * 
     * @param lifecycleExecution
     *        Runtime details for the specified runtime instance of the lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecycleExecutionResult withLifecycleExecution(LifecycleExecution lifecycleExecution) {
        setLifecycleExecution(lifecycleExecution);
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
        if (getLifecycleExecution() != null)
            sb.append("LifecycleExecution: ").append(getLifecycleExecution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLifecycleExecutionResult == false)
            return false;
        GetLifecycleExecutionResult other = (GetLifecycleExecutionResult) obj;
        if (other.getLifecycleExecution() == null ^ this.getLifecycleExecution() == null)
            return false;
        if (other.getLifecycleExecution() != null && other.getLifecycleExecution().equals(this.getLifecycleExecution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecycleExecution() == null) ? 0 : getLifecycleExecution().hashCode());
        return hashCode;
    }

    @Override
    public GetLifecycleExecutionResult clone() {
        try {
            return (GetLifecycleExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

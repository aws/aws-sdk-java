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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetLifecycleExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLifecycleExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use the unique identifier for a runtime instance of the lifecycle policy to get runtime details.
     * </p>
     */
    private String lifecycleExecutionId;

    /**
     * <p>
     * Use the unique identifier for a runtime instance of the lifecycle policy to get runtime details.
     * </p>
     * 
     * @param lifecycleExecutionId
     *        Use the unique identifier for a runtime instance of the lifecycle policy to get runtime details.
     */

    public void setLifecycleExecutionId(String lifecycleExecutionId) {
        this.lifecycleExecutionId = lifecycleExecutionId;
    }

    /**
     * <p>
     * Use the unique identifier for a runtime instance of the lifecycle policy to get runtime details.
     * </p>
     * 
     * @return Use the unique identifier for a runtime instance of the lifecycle policy to get runtime details.
     */

    public String getLifecycleExecutionId() {
        return this.lifecycleExecutionId;
    }

    /**
     * <p>
     * Use the unique identifier for a runtime instance of the lifecycle policy to get runtime details.
     * </p>
     * 
     * @param lifecycleExecutionId
     *        Use the unique identifier for a runtime instance of the lifecycle policy to get runtime details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecycleExecutionRequest withLifecycleExecutionId(String lifecycleExecutionId) {
        setLifecycleExecutionId(lifecycleExecutionId);
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
        if (getLifecycleExecutionId() != null)
            sb.append("LifecycleExecutionId: ").append(getLifecycleExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLifecycleExecutionRequest == false)
            return false;
        GetLifecycleExecutionRequest other = (GetLifecycleExecutionRequest) obj;
        if (other.getLifecycleExecutionId() == null ^ this.getLifecycleExecutionId() == null)
            return false;
        if (other.getLifecycleExecutionId() != null && other.getLifecycleExecutionId().equals(this.getLifecycleExecutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecycleExecutionId() == null) ? 0 : getLifecycleExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public GetLifecycleExecutionRequest clone() {
        return (GetLifecycleExecutionRequest) super.clone();
    }

}

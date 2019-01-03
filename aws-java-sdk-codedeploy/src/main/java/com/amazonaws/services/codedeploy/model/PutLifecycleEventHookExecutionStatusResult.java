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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/PutLifecycleEventHookExecutionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutLifecycleEventHookExecutionStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The execution ID of the lifecycle event hook. A hook is specified in the <code>hooks</code> section of the
     * deployment's AppSpec file.
     * </p>
     */
    private String lifecycleEventHookExecutionId;

    /**
     * <p>
     * The execution ID of the lifecycle event hook. A hook is specified in the <code>hooks</code> section of the
     * deployment's AppSpec file.
     * </p>
     * 
     * @param lifecycleEventHookExecutionId
     *        The execution ID of the lifecycle event hook. A hook is specified in the <code>hooks</code> section of the
     *        deployment's AppSpec file.
     */

    public void setLifecycleEventHookExecutionId(String lifecycleEventHookExecutionId) {
        this.lifecycleEventHookExecutionId = lifecycleEventHookExecutionId;
    }

    /**
     * <p>
     * The execution ID of the lifecycle event hook. A hook is specified in the <code>hooks</code> section of the
     * deployment's AppSpec file.
     * </p>
     * 
     * @return The execution ID of the lifecycle event hook. A hook is specified in the <code>hooks</code> section of
     *         the deployment's AppSpec file.
     */

    public String getLifecycleEventHookExecutionId() {
        return this.lifecycleEventHookExecutionId;
    }

    /**
     * <p>
     * The execution ID of the lifecycle event hook. A hook is specified in the <code>hooks</code> section of the
     * deployment's AppSpec file.
     * </p>
     * 
     * @param lifecycleEventHookExecutionId
     *        The execution ID of the lifecycle event hook. A hook is specified in the <code>hooks</code> section of the
     *        deployment's AppSpec file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecycleEventHookExecutionStatusResult withLifecycleEventHookExecutionId(String lifecycleEventHookExecutionId) {
        setLifecycleEventHookExecutionId(lifecycleEventHookExecutionId);
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
        if (getLifecycleEventHookExecutionId() != null)
            sb.append("LifecycleEventHookExecutionId: ").append(getLifecycleEventHookExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLifecycleEventHookExecutionStatusResult == false)
            return false;
        PutLifecycleEventHookExecutionStatusResult other = (PutLifecycleEventHookExecutionStatusResult) obj;
        if (other.getLifecycleEventHookExecutionId() == null ^ this.getLifecycleEventHookExecutionId() == null)
            return false;
        if (other.getLifecycleEventHookExecutionId() != null
                && other.getLifecycleEventHookExecutionId().equals(this.getLifecycleEventHookExecutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecycleEventHookExecutionId() == null) ? 0 : getLifecycleEventHookExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public PutLifecycleEventHookExecutionStatusResult clone() {
        try {
            return (PutLifecycleEventHookExecutionStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StartResourceEvaluation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartResourceEvaluationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique ResourceEvaluationId that is associated with a single execution.
     * </p>
     */
    private String resourceEvaluationId;

    /**
     * <p>
     * A unique ResourceEvaluationId that is associated with a single execution.
     * </p>
     * 
     * @param resourceEvaluationId
     *        A unique ResourceEvaluationId that is associated with a single execution.
     */

    public void setResourceEvaluationId(String resourceEvaluationId) {
        this.resourceEvaluationId = resourceEvaluationId;
    }

    /**
     * <p>
     * A unique ResourceEvaluationId that is associated with a single execution.
     * </p>
     * 
     * @return A unique ResourceEvaluationId that is associated with a single execution.
     */

    public String getResourceEvaluationId() {
        return this.resourceEvaluationId;
    }

    /**
     * <p>
     * A unique ResourceEvaluationId that is associated with a single execution.
     * </p>
     * 
     * @param resourceEvaluationId
     *        A unique ResourceEvaluationId that is associated with a single execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartResourceEvaluationResult withResourceEvaluationId(String resourceEvaluationId) {
        setResourceEvaluationId(resourceEvaluationId);
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
        if (getResourceEvaluationId() != null)
            sb.append("ResourceEvaluationId: ").append(getResourceEvaluationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartResourceEvaluationResult == false)
            return false;
        StartResourceEvaluationResult other = (StartResourceEvaluationResult) obj;
        if (other.getResourceEvaluationId() == null ^ this.getResourceEvaluationId() == null)
            return false;
        if (other.getResourceEvaluationId() != null && other.getResourceEvaluationId().equals(this.getResourceEvaluationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceEvaluationId() == null) ? 0 : getResourceEvaluationId().hashCode());
        return hashCode;
    }

    @Override
    public StartResourceEvaluationResult clone() {
        try {
            return (StartResourceEvaluationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/StartGeneratedCodeJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartGeneratedCodeJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the code generation job. You can use this identifier in the <code>GetGeneratedCodeJob</code>
     * operation.
     * </p>
     */
    private String generatedCodeJobId;

    /**
     * <p>
     * The identifier of the code generation job. You can use this identifier in the <code>GetGeneratedCodeJob</code>
     * operation.
     * </p>
     * 
     * @param generatedCodeJobId
     *        The identifier of the code generation job. You can use this identifier in the
     *        <code>GetGeneratedCodeJob</code> operation.
     */

    public void setGeneratedCodeJobId(String generatedCodeJobId) {
        this.generatedCodeJobId = generatedCodeJobId;
    }

    /**
     * <p>
     * The identifier of the code generation job. You can use this identifier in the <code>GetGeneratedCodeJob</code>
     * operation.
     * </p>
     * 
     * @return The identifier of the code generation job. You can use this identifier in the
     *         <code>GetGeneratedCodeJob</code> operation.
     */

    public String getGeneratedCodeJobId() {
        return this.generatedCodeJobId;
    }

    /**
     * <p>
     * The identifier of the code generation job. You can use this identifier in the <code>GetGeneratedCodeJob</code>
     * operation.
     * </p>
     * 
     * @param generatedCodeJobId
     *        The identifier of the code generation job. You can use this identifier in the
     *        <code>GetGeneratedCodeJob</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartGeneratedCodeJobResult withGeneratedCodeJobId(String generatedCodeJobId) {
        setGeneratedCodeJobId(generatedCodeJobId);
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
        if (getGeneratedCodeJobId() != null)
            sb.append("GeneratedCodeJobId: ").append(getGeneratedCodeJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartGeneratedCodeJobResult == false)
            return false;
        StartGeneratedCodeJobResult other = (StartGeneratedCodeJobResult) obj;
        if (other.getGeneratedCodeJobId() == null ^ this.getGeneratedCodeJobId() == null)
            return false;
        if (other.getGeneratedCodeJobId() != null && other.getGeneratedCodeJobId().equals(this.getGeneratedCodeJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeneratedCodeJobId() == null) ? 0 : getGeneratedCodeJobId().hashCode());
        return hashCode;
    }

    @Override
    public StartGeneratedCodeJobResult clone() {
        try {
            return (StartGeneratedCodeJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

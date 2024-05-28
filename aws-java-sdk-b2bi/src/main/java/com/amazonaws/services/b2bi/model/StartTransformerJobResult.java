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
package com.amazonaws.services.b2bi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/StartTransformerJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTransformerJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the unique, system-generated identifier for a transformer run.
     * </p>
     */
    private String transformerJobId;

    /**
     * <p>
     * Returns the unique, system-generated identifier for a transformer run.
     * </p>
     * 
     * @param transformerJobId
     *        Returns the unique, system-generated identifier for a transformer run.
     */

    public void setTransformerJobId(String transformerJobId) {
        this.transformerJobId = transformerJobId;
    }

    /**
     * <p>
     * Returns the unique, system-generated identifier for a transformer run.
     * </p>
     * 
     * @return Returns the unique, system-generated identifier for a transformer run.
     */

    public String getTransformerJobId() {
        return this.transformerJobId;
    }

    /**
     * <p>
     * Returns the unique, system-generated identifier for a transformer run.
     * </p>
     * 
     * @param transformerJobId
     *        Returns the unique, system-generated identifier for a transformer run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTransformerJobResult withTransformerJobId(String transformerJobId) {
        setTransformerJobId(transformerJobId);
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
        if (getTransformerJobId() != null)
            sb.append("TransformerJobId: ").append(getTransformerJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTransformerJobResult == false)
            return false;
        StartTransformerJobResult other = (StartTransformerJobResult) obj;
        if (other.getTransformerJobId() == null ^ this.getTransformerJobId() == null)
            return false;
        if (other.getTransformerJobId() != null && other.getTransformerJobId().equals(this.getTransformerJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransformerJobId() == null) ? 0 : getTransformerJobId().hashCode());
        return hashCode;
    }

    @Override
    public StartTransformerJobResult clone() {
        try {
            return (StartTransformerJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

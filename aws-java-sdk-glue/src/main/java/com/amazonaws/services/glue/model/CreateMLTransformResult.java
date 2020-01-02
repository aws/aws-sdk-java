/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateMLTransform" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMLTransformResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier that is generated for the transform.
     * </p>
     */
    private String transformId;

    /**
     * <p>
     * A unique identifier that is generated for the transform.
     * </p>
     * 
     * @param transformId
     *        A unique identifier that is generated for the transform.
     */

    public void setTransformId(String transformId) {
        this.transformId = transformId;
    }

    /**
     * <p>
     * A unique identifier that is generated for the transform.
     * </p>
     * 
     * @return A unique identifier that is generated for the transform.
     */

    public String getTransformId() {
        return this.transformId;
    }

    /**
     * <p>
     * A unique identifier that is generated for the transform.
     * </p>
     * 
     * @param transformId
     *        A unique identifier that is generated for the transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMLTransformResult withTransformId(String transformId) {
        setTransformId(transformId);
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
        if (getTransformId() != null)
            sb.append("TransformId: ").append(getTransformId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMLTransformResult == false)
            return false;
        CreateMLTransformResult other = (CreateMLTransformResult) obj;
        if (other.getTransformId() == null ^ this.getTransformId() == null)
            return false;
        if (other.getTransformId() != null && other.getTransformId().equals(this.getTransformId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransformId() == null) ? 0 : getTransformId().hashCode());
        return hashCode;
    }

    @Override
    public CreateMLTransformResult clone() {
        try {
            return (CreateMLTransformResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

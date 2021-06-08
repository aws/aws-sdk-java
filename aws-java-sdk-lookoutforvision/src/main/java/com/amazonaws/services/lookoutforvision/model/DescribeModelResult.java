/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the description of the model.
     * </p>
     */
    private ModelDescription modelDescription;

    /**
     * <p>
     * Contains the description of the model.
     * </p>
     * 
     * @param modelDescription
     *        Contains the description of the model.
     */

    public void setModelDescription(ModelDescription modelDescription) {
        this.modelDescription = modelDescription;
    }

    /**
     * <p>
     * Contains the description of the model.
     * </p>
     * 
     * @return Contains the description of the model.
     */

    public ModelDescription getModelDescription() {
        return this.modelDescription;
    }

    /**
     * <p>
     * Contains the description of the model.
     * </p>
     * 
     * @param modelDescription
     *        Contains the description of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withModelDescription(ModelDescription modelDescription) {
        setModelDescription(modelDescription);
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
        if (getModelDescription() != null)
            sb.append("ModelDescription: ").append(getModelDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeModelResult == false)
            return false;
        DescribeModelResult other = (DescribeModelResult) obj;
        if (other.getModelDescription() == null ^ this.getModelDescription() == null)
            return false;
        if (other.getModelDescription() != null && other.getModelDescription().equals(this.getModelDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelDescription() == null) ? 0 : getModelDescription().hashCode());
        return hashCode;
    }

    @Override
    public DescribeModelResult clone() {
        try {
            return (DescribeModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

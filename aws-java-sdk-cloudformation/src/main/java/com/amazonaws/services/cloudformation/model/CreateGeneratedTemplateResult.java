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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateGeneratedTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGeneratedTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the generated template.
     * </p>
     */
    private String generatedTemplateId;

    /**
     * <p>
     * The ID of the generated template.
     * </p>
     * 
     * @param generatedTemplateId
     *        The ID of the generated template.
     */

    public void setGeneratedTemplateId(String generatedTemplateId) {
        this.generatedTemplateId = generatedTemplateId;
    }

    /**
     * <p>
     * The ID of the generated template.
     * </p>
     * 
     * @return The ID of the generated template.
     */

    public String getGeneratedTemplateId() {
        return this.generatedTemplateId;
    }

    /**
     * <p>
     * The ID of the generated template.
     * </p>
     * 
     * @param generatedTemplateId
     *        The ID of the generated template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeneratedTemplateResult withGeneratedTemplateId(String generatedTemplateId) {
        setGeneratedTemplateId(generatedTemplateId);
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
        if (getGeneratedTemplateId() != null)
            sb.append("GeneratedTemplateId: ").append(getGeneratedTemplateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGeneratedTemplateResult == false)
            return false;
        CreateGeneratedTemplateResult other = (CreateGeneratedTemplateResult) obj;
        if (other.getGeneratedTemplateId() == null ^ this.getGeneratedTemplateId() == null)
            return false;
        if (other.getGeneratedTemplateId() != null && other.getGeneratedTemplateId().equals(this.getGeneratedTemplateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeneratedTemplateId() == null) ? 0 : getGeneratedTemplateId().hashCode());
        return hashCode;
    }

    @Override
    public CreateGeneratedTemplateResult clone() {
        try {
            return (CreateGeneratedTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

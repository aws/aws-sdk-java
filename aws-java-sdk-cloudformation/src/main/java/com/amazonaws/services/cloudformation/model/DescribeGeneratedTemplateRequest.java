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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeGeneratedTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGeneratedTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of a generated template.
     * </p>
     */
    private String generatedTemplateName;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of a generated template.
     * </p>
     * 
     * @param generatedTemplateName
     *        The name or Amazon Resource Name (ARN) of a generated template.
     */

    public void setGeneratedTemplateName(String generatedTemplateName) {
        this.generatedTemplateName = generatedTemplateName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of a generated template.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of a generated template.
     */

    public String getGeneratedTemplateName() {
        return this.generatedTemplateName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of a generated template.
     * </p>
     * 
     * @param generatedTemplateName
     *        The name or Amazon Resource Name (ARN) of a generated template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGeneratedTemplateRequest withGeneratedTemplateName(String generatedTemplateName) {
        setGeneratedTemplateName(generatedTemplateName);
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
        if (getGeneratedTemplateName() != null)
            sb.append("GeneratedTemplateName: ").append(getGeneratedTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGeneratedTemplateRequest == false)
            return false;
        DescribeGeneratedTemplateRequest other = (DescribeGeneratedTemplateRequest) obj;
        if (other.getGeneratedTemplateName() == null ^ this.getGeneratedTemplateName() == null)
            return false;
        if (other.getGeneratedTemplateName() != null && other.getGeneratedTemplateName().equals(this.getGeneratedTemplateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeneratedTemplateName() == null) ? 0 : getGeneratedTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGeneratedTemplateRequest clone() {
        return (DescribeGeneratedTemplateRequest) super.clone();
    }

}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/GetGeneratedTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGeneratedTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language to use to retrieve for the generated template. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JSON</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YAML</code>
     * </p>
     * </li>
     * </ul>
     */
    private String format;
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the generated template. The format is
     * <code>arn:${Partition}:cloudformation:${Region}:${Account}:generatedtemplate/${Id}</code>. For example,
     * <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:generatedtemplate/<i>2e8465c1-9a80-43ea-a3a3-4f2d692fe6dc</i> </code>
     * .
     * </p>
     */
    private String generatedTemplateName;

    /**
     * <p>
     * The language to use to retrieve for the generated template. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JSON</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YAML</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        The language to use to retrieve for the generated template. Supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>JSON</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YAML</code>
     *        </p>
     *        </li>
     * @see TemplateFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The language to use to retrieve for the generated template. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JSON</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YAML</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language to use to retrieve for the generated template. Supported values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>JSON</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YAML</code>
     *         </p>
     *         </li>
     * @see TemplateFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The language to use to retrieve for the generated template. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JSON</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YAML</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        The language to use to retrieve for the generated template. Supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>JSON</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YAML</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateFormat
     */

    public GetGeneratedTemplateRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The language to use to retrieve for the generated template. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JSON</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YAML</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        The language to use to retrieve for the generated template. Supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>JSON</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YAML</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateFormat
     */

    public GetGeneratedTemplateRequest withFormat(TemplateFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the generated template. The format is
     * <code>arn:${Partition}:cloudformation:${Region}:${Account}:generatedtemplate/${Id}</code>. For example,
     * <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:generatedtemplate/<i>2e8465c1-9a80-43ea-a3a3-4f2d692fe6dc</i> </code>
     * .
     * </p>
     * 
     * @param generatedTemplateName
     *        The name or Amazon Resource Name (ARN) of the generated template. The format is
     *        <code>arn:${Partition}:cloudformation:${Region}:${Account}:generatedtemplate/${Id}</code>. For example,
     *        <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:generatedtemplate/<i>2e8465c1-9a80-43ea-a3a3-4f2d692fe6dc</i> </code>
     *        .
     */

    public void setGeneratedTemplateName(String generatedTemplateName) {
        this.generatedTemplateName = generatedTemplateName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the generated template. The format is
     * <code>arn:${Partition}:cloudformation:${Region}:${Account}:generatedtemplate/${Id}</code>. For example,
     * <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:generatedtemplate/<i>2e8465c1-9a80-43ea-a3a3-4f2d692fe6dc</i> </code>
     * .
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the generated template. The format is
     *         <code>arn:${Partition}:cloudformation:${Region}:${Account}:generatedtemplate/${Id}</code>. For example,
     *         <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:generatedtemplate/<i>2e8465c1-9a80-43ea-a3a3-4f2d692fe6dc</i> </code>
     *         .
     */

    public String getGeneratedTemplateName() {
        return this.generatedTemplateName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the generated template. The format is
     * <code>arn:${Partition}:cloudformation:${Region}:${Account}:generatedtemplate/${Id}</code>. For example,
     * <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:generatedtemplate/<i>2e8465c1-9a80-43ea-a3a3-4f2d692fe6dc</i> </code>
     * .
     * </p>
     * 
     * @param generatedTemplateName
     *        The name or Amazon Resource Name (ARN) of the generated template. The format is
     *        <code>arn:${Partition}:cloudformation:${Region}:${Account}:generatedtemplate/${Id}</code>. For example,
     *        <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:generatedtemplate/<i>2e8465c1-9a80-43ea-a3a3-4f2d692fe6dc</i> </code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeneratedTemplateRequest withGeneratedTemplateName(String generatedTemplateName) {
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
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

        if (obj instanceof GetGeneratedTemplateRequest == false)
            return false;
        GetGeneratedTemplateRequest other = (GetGeneratedTemplateRequest) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getGeneratedTemplateName() == null) ? 0 : getGeneratedTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public GetGeneratedTemplateRequest clone() {
        return (GetGeneratedTemplateRequest) super.clone();
    }

}

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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/UpdateTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     */
    private TemplateDefinition definition;
    /**
     * <p>
     * This setting allows the major version of a template to be increased automatically. All members of Active
     * Directory groups that are allowed to enroll with a template will receive a new certificate issued using that
     * template.
     * </p>
     */
    private Boolean reenrollAllCertificateHolders;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     * >CreateTemplate</a>.
     * </p>
     */
    private String templateArn;

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @param definition
     *        Template configuration to define the information included in certificates. Define certificate validity and
     *        renewal periods, certificate request handling and enrollment options, key usage extensions, application
     *        policies, and cryptography settings.
     */

    public void setDefinition(TemplateDefinition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @return Template configuration to define the information included in certificates. Define certificate validity
     *         and renewal periods, certificate request handling and enrollment options, key usage extensions,
     *         application policies, and cryptography settings.
     */

    public TemplateDefinition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @param definition
     *        Template configuration to define the information included in certificates. Define certificate validity and
     *        renewal periods, certificate request handling and enrollment options, key usage extensions, application
     *        policies, and cryptography settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTemplateRequest withDefinition(TemplateDefinition definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * This setting allows the major version of a template to be increased automatically. All members of Active
     * Directory groups that are allowed to enroll with a template will receive a new certificate issued using that
     * template.
     * </p>
     * 
     * @param reenrollAllCertificateHolders
     *        This setting allows the major version of a template to be increased automatically. All members of Active
     *        Directory groups that are allowed to enroll with a template will receive a new certificate issued using
     *        that template.
     */

    public void setReenrollAllCertificateHolders(Boolean reenrollAllCertificateHolders) {
        this.reenrollAllCertificateHolders = reenrollAllCertificateHolders;
    }

    /**
     * <p>
     * This setting allows the major version of a template to be increased automatically. All members of Active
     * Directory groups that are allowed to enroll with a template will receive a new certificate issued using that
     * template.
     * </p>
     * 
     * @return This setting allows the major version of a template to be increased automatically. All members of Active
     *         Directory groups that are allowed to enroll with a template will receive a new certificate issued using
     *         that template.
     */

    public Boolean getReenrollAllCertificateHolders() {
        return this.reenrollAllCertificateHolders;
    }

    /**
     * <p>
     * This setting allows the major version of a template to be increased automatically. All members of Active
     * Directory groups that are allowed to enroll with a template will receive a new certificate issued using that
     * template.
     * </p>
     * 
     * @param reenrollAllCertificateHolders
     *        This setting allows the major version of a template to be increased automatically. All members of Active
     *        Directory groups that are allowed to enroll with a template will receive a new certificate issued using
     *        that template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTemplateRequest withReenrollAllCertificateHolders(Boolean reenrollAllCertificateHolders) {
        setReenrollAllCertificateHolders(reenrollAllCertificateHolders);
        return this;
    }

    /**
     * <p>
     * This setting allows the major version of a template to be increased automatically. All members of Active
     * Directory groups that are allowed to enroll with a template will receive a new certificate issued using that
     * template.
     * </p>
     * 
     * @return This setting allows the major version of a template to be increased automatically. All members of Active
     *         Directory groups that are allowed to enroll with a template will receive a new certificate issued using
     *         that template.
     */

    public Boolean isReenrollAllCertificateHolders() {
        return this.reenrollAllCertificateHolders;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     * >CreateTemplate</a>.
     * </p>
     * 
     * @param templateArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     *        >CreateTemplate</a>.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     * >CreateTemplate</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that was returned when you called <a
     *         href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     *         >CreateTemplate</a>.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     * >CreateTemplate</a>.
     * </p>
     * 
     * @param templateArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     *        >CreateTemplate</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTemplateRequest withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
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
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getReenrollAllCertificateHolders() != null)
            sb.append("ReenrollAllCertificateHolders: ").append(getReenrollAllCertificateHolders()).append(",");
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTemplateRequest == false)
            return false;
        UpdateTemplateRequest other = (UpdateTemplateRequest) obj;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getReenrollAllCertificateHolders() == null ^ this.getReenrollAllCertificateHolders() == null)
            return false;
        if (other.getReenrollAllCertificateHolders() != null
                && other.getReenrollAllCertificateHolders().equals(this.getReenrollAllCertificateHolders()) == false)
            return false;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getReenrollAllCertificateHolders() == null) ? 0 : getReenrollAllCertificateHolders().hashCode());
        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTemplateRequest clone() {
        return (UpdateTemplateRequest) super.clone();
    }

}

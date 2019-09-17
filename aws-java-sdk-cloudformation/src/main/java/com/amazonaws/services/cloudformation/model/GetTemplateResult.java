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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output for <a>GetTemplate</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/GetTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Structure containing the template body. (For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * AWS CloudFormation returns the same template that was used when the stack was created.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * The stage of the template that you can retrieve. For stacks, the <code>Original</code> and <code>Processed</code>
     * templates are always available. For change sets, the <code>Original</code> template is always available. After
     * AWS CloudFormation finishes creating the change set, the <code>Processed</code> template becomes available.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> stagesAvailable;

    /**
     * <p>
     * Structure containing the template body. (For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * AWS CloudFormation returns the same template that was used when the stack was created.
     * </p>
     * 
     * @param templateBody
     *        Structure containing the template body. (For more information, go to <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.)</p>
     *        <p>
     *        AWS CloudFormation returns the same template that was used when the stack was created.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * Structure containing the template body. (For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * AWS CloudFormation returns the same template that was used when the stack was created.
     * </p>
     * 
     * @return Structure containing the template body. (For more information, go to <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide.)</p>
     *         <p>
     *         AWS CloudFormation returns the same template that was used when the stack was created.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * Structure containing the template body. (For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * AWS CloudFormation returns the same template that was used when the stack was created.
     * </p>
     * 
     * @param templateBody
     *        Structure containing the template body. (For more information, go to <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.)</p>
     *        <p>
     *        AWS CloudFormation returns the same template that was used when the stack was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateResult withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * The stage of the template that you can retrieve. For stacks, the <code>Original</code> and <code>Processed</code>
     * templates are always available. For change sets, the <code>Original</code> template is always available. After
     * AWS CloudFormation finishes creating the change set, the <code>Processed</code> template becomes available.
     * </p>
     * 
     * @return The stage of the template that you can retrieve. For stacks, the <code>Original</code> and
     *         <code>Processed</code> templates are always available. For change sets, the <code>Original</code>
     *         template is always available. After AWS CloudFormation finishes creating the change set, the
     *         <code>Processed</code> template becomes available.
     * @see TemplateStage
     */

    public java.util.List<String> getStagesAvailable() {
        if (stagesAvailable == null) {
            stagesAvailable = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return stagesAvailable;
    }

    /**
     * <p>
     * The stage of the template that you can retrieve. For stacks, the <code>Original</code> and <code>Processed</code>
     * templates are always available. For change sets, the <code>Original</code> template is always available. After
     * AWS CloudFormation finishes creating the change set, the <code>Processed</code> template becomes available.
     * </p>
     * 
     * @param stagesAvailable
     *        The stage of the template that you can retrieve. For stacks, the <code>Original</code> and
     *        <code>Processed</code> templates are always available. For change sets, the <code>Original</code> template
     *        is always available. After AWS CloudFormation finishes creating the change set, the <code>Processed</code>
     *        template becomes available.
     * @see TemplateStage
     */

    public void setStagesAvailable(java.util.Collection<String> stagesAvailable) {
        if (stagesAvailable == null) {
            this.stagesAvailable = null;
            return;
        }

        this.stagesAvailable = new com.amazonaws.internal.SdkInternalList<String>(stagesAvailable);
    }

    /**
     * <p>
     * The stage of the template that you can retrieve. For stacks, the <code>Original</code> and <code>Processed</code>
     * templates are always available. For change sets, the <code>Original</code> template is always available. After
     * AWS CloudFormation finishes creating the change set, the <code>Processed</code> template becomes available.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStagesAvailable(java.util.Collection)} or {@link #withStagesAvailable(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param stagesAvailable
     *        The stage of the template that you can retrieve. For stacks, the <code>Original</code> and
     *        <code>Processed</code> templates are always available. For change sets, the <code>Original</code> template
     *        is always available. After AWS CloudFormation finishes creating the change set, the <code>Processed</code>
     *        template becomes available.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateStage
     */

    public GetTemplateResult withStagesAvailable(String... stagesAvailable) {
        if (this.stagesAvailable == null) {
            setStagesAvailable(new com.amazonaws.internal.SdkInternalList<String>(stagesAvailable.length));
        }
        for (String ele : stagesAvailable) {
            this.stagesAvailable.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The stage of the template that you can retrieve. For stacks, the <code>Original</code> and <code>Processed</code>
     * templates are always available. For change sets, the <code>Original</code> template is always available. After
     * AWS CloudFormation finishes creating the change set, the <code>Processed</code> template becomes available.
     * </p>
     * 
     * @param stagesAvailable
     *        The stage of the template that you can retrieve. For stacks, the <code>Original</code> and
     *        <code>Processed</code> templates are always available. For change sets, the <code>Original</code> template
     *        is always available. After AWS CloudFormation finishes creating the change set, the <code>Processed</code>
     *        template becomes available.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateStage
     */

    public GetTemplateResult withStagesAvailable(java.util.Collection<String> stagesAvailable) {
        setStagesAvailable(stagesAvailable);
        return this;
    }

    /**
     * <p>
     * The stage of the template that you can retrieve. For stacks, the <code>Original</code> and <code>Processed</code>
     * templates are always available. For change sets, the <code>Original</code> template is always available. After
     * AWS CloudFormation finishes creating the change set, the <code>Processed</code> template becomes available.
     * </p>
     * 
     * @param stagesAvailable
     *        The stage of the template that you can retrieve. For stacks, the <code>Original</code> and
     *        <code>Processed</code> templates are always available. For change sets, the <code>Original</code> template
     *        is always available. After AWS CloudFormation finishes creating the change set, the <code>Processed</code>
     *        template becomes available.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateStage
     */

    public GetTemplateResult withStagesAvailable(TemplateStage... stagesAvailable) {
        com.amazonaws.internal.SdkInternalList<String> stagesAvailableCopy = new com.amazonaws.internal.SdkInternalList<String>(stagesAvailable.length);
        for (TemplateStage value : stagesAvailable) {
            stagesAvailableCopy.add(value.toString());
        }
        if (getStagesAvailable() == null) {
            setStagesAvailable(stagesAvailableCopy);
        } else {
            getStagesAvailable().addAll(stagesAvailableCopy);
        }
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
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getStagesAvailable() != null)
            sb.append("StagesAvailable: ").append(getStagesAvailable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTemplateResult == false)
            return false;
        GetTemplateResult other = (GetTemplateResult) obj;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getStagesAvailable() == null ^ this.getStagesAvailable() == null)
            return false;
        if (other.getStagesAvailable() != null && other.getStagesAvailable().equals(this.getStagesAvailable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getStagesAvailable() == null) ? 0 : getStagesAvailable().hashCode());
        return hashCode;
    }

    @Override
    public GetTemplateResult clone() {
        try {
            return (GetTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

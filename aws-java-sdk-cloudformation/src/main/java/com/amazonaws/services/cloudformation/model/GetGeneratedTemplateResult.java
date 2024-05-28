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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/GetGeneratedTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGeneratedTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the template generation. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatePending</code> - the creation of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateInProgress</code> - the creation of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletePending</code> - the deletion of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteInProgress</code> - the deletion of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdatePending</code> - the update of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateInProgress</code> - the update of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - the template operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Complete</code> - the template operation is complete.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The template body of the generated template, in the language specified by the <code>Language</code> parameter.
     * </p>
     */
    private String templateBody;

    /**
     * <p>
     * The status of the template generation. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatePending</code> - the creation of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateInProgress</code> - the creation of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletePending</code> - the deletion of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteInProgress</code> - the deletion of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdatePending</code> - the update of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateInProgress</code> - the update of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - the template operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Complete</code> - the template operation is complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the template generation. Supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreatePending</code> - the creation of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreateInProgress</code> - the creation of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeletePending</code> - the deletion of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeleteInProgress</code> - the deletion of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdatePending</code> - the update of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdateInProgress</code> - the update of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - the template operation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Complete</code> - the template operation is complete.
     *        </p>
     *        </li>
     * @see GeneratedTemplateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the template generation. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatePending</code> - the creation of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateInProgress</code> - the creation of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletePending</code> - the deletion of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteInProgress</code> - the deletion of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdatePending</code> - the update of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateInProgress</code> - the update of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - the template operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Complete</code> - the template operation is complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the template generation. Supported values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CreatePending</code> - the creation of the template is pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CreateInProgress</code> - the creation of the template is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DeletePending</code> - the deletion of the template is pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DeleteInProgress</code> - the deletion of the template is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UpdatePending</code> - the update of the template is pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UpdateInProgress</code> - the update of the template is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - the template operation failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Complete</code> - the template operation is complete.
     *         </p>
     *         </li>
     * @see GeneratedTemplateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the template generation. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatePending</code> - the creation of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateInProgress</code> - the creation of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletePending</code> - the deletion of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteInProgress</code> - the deletion of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdatePending</code> - the update of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateInProgress</code> - the update of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - the template operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Complete</code> - the template operation is complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the template generation. Supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreatePending</code> - the creation of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreateInProgress</code> - the creation of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeletePending</code> - the deletion of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeleteInProgress</code> - the deletion of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdatePending</code> - the update of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdateInProgress</code> - the update of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - the template operation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Complete</code> - the template operation is complete.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedTemplateStatus
     */

    public GetGeneratedTemplateResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the template generation. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatePending</code> - the creation of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateInProgress</code> - the creation of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletePending</code> - the deletion of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteInProgress</code> - the deletion of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdatePending</code> - the update of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateInProgress</code> - the update of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - the template operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Complete</code> - the template operation is complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the template generation. Supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreatePending</code> - the creation of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreateInProgress</code> - the creation of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeletePending</code> - the deletion of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeleteInProgress</code> - the deletion of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdatePending</code> - the update of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdateInProgress</code> - the update of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - the template operation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Complete</code> - the template operation is complete.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedTemplateStatus
     */

    public GetGeneratedTemplateResult withStatus(GeneratedTemplateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The template body of the generated template, in the language specified by the <code>Language</code> parameter.
     * </p>
     * 
     * @param templateBody
     *        The template body of the generated template, in the language specified by the <code>Language</code>
     *        parameter.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The template body of the generated template, in the language specified by the <code>Language</code> parameter.
     * </p>
     * 
     * @return The template body of the generated template, in the language specified by the <code>Language</code>
     *         parameter.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * The template body of the generated template, in the language specified by the <code>Language</code> parameter.
     * </p>
     * 
     * @param templateBody
     *        The template body of the generated template, in the language specified by the <code>Language</code>
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeneratedTemplateResult withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGeneratedTemplateResult == false)
            return false;
        GetGeneratedTemplateResult other = (GetGeneratedTemplateResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        return hashCode;
    }

    @Override
    public GetGeneratedTemplateResult clone() {
        try {
            return (GetGeneratedTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

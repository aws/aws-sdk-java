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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateServiceAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The self-service action name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * </p>
     */
    private String definitionType;
    /**
     * <p>
     * The self-service action definition. Can be one of the following:
     * </p>
     * <dl>
     * <dt>Name</dt>
     * <dd>
     * <p>
     * The name of the AWS Systems Manager Document. For example, <code>AWS-RestartEC2Instance</code>.
     * </p>
     * </dd>
     * <dt>Version</dt>
     * <dd>
     * <p>
     * The AWS Systems Manager automation document version. For example, <code>"Version": "1"</code>
     * </p>
     * </dd>
     * <dt>AssumeRole</dt>
     * <dd>
     * <p>
     * The Amazon Resource Name (ARN) of the role that performs the self-service actions on your behalf. For example,
     * <code>"AssumeRole": "arn:aws:iam::12345678910:role/ActionRole"</code>.
     * </p>
     * <p>
     * To reuse the provisioned product launch role, set to <code>"AssumeRole": "LAUNCH_ROLE"</code>.
     * </p>
     * </dd>
     * <dt>Parameters</dt>
     * <dd>
     * <p>
     * The list of parameters in JSON format.
     * </p>
     * <p>
     * For example: <code>[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]</code>.
     * </p>
     * </dd>
     * </dl>
     */
    private java.util.Map<String, String> definition;
    /**
     * <p>
     * The self-service action description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;
    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The self-service action name.
     * </p>
     * 
     * @param name
     *        The self-service action name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The self-service action name.
     * </p>
     * 
     * @return The self-service action name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The self-service action name.
     * </p>
     * 
     * @param name
     *        The self-service action name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceActionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * </p>
     * 
     * @param definitionType
     *        The service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * @see ServiceActionDefinitionType
     */

    public void setDefinitionType(String definitionType) {
        this.definitionType = definitionType;
    }

    /**
     * <p>
     * The service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * </p>
     * 
     * @return The service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * @see ServiceActionDefinitionType
     */

    public String getDefinitionType() {
        return this.definitionType;
    }

    /**
     * <p>
     * The service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * </p>
     * 
     * @param definitionType
     *        The service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceActionDefinitionType
     */

    public CreateServiceActionRequest withDefinitionType(String definitionType) {
        setDefinitionType(definitionType);
        return this;
    }

    /**
     * <p>
     * The service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * </p>
     * 
     * @param definitionType
     *        The service action definition type. For example, <code>SSM_AUTOMATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceActionDefinitionType
     */

    public CreateServiceActionRequest withDefinitionType(ServiceActionDefinitionType definitionType) {
        this.definitionType = definitionType.toString();
        return this;
    }

    /**
     * <p>
     * The self-service action definition. Can be one of the following:
     * </p>
     * <dl>
     * <dt>Name</dt>
     * <dd>
     * <p>
     * The name of the AWS Systems Manager Document. For example, <code>AWS-RestartEC2Instance</code>.
     * </p>
     * </dd>
     * <dt>Version</dt>
     * <dd>
     * <p>
     * The AWS Systems Manager automation document version. For example, <code>"Version": "1"</code>
     * </p>
     * </dd>
     * <dt>AssumeRole</dt>
     * <dd>
     * <p>
     * The Amazon Resource Name (ARN) of the role that performs the self-service actions on your behalf. For example,
     * <code>"AssumeRole": "arn:aws:iam::12345678910:role/ActionRole"</code>.
     * </p>
     * <p>
     * To reuse the provisioned product launch role, set to <code>"AssumeRole": "LAUNCH_ROLE"</code>.
     * </p>
     * </dd>
     * <dt>Parameters</dt>
     * <dd>
     * <p>
     * The list of parameters in JSON format.
     * </p>
     * <p>
     * For example: <code>[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The self-service action definition. Can be one of the following:</p>
     *         <dl>
     *         <dt>Name</dt>
     *         <dd>
     *         <p>
     *         The name of the AWS Systems Manager Document. For example, <code>AWS-RestartEC2Instance</code>.
     *         </p>
     *         </dd>
     *         <dt>Version</dt>
     *         <dd>
     *         <p>
     *         The AWS Systems Manager automation document version. For example, <code>"Version": "1"</code>
     *         </p>
     *         </dd>
     *         <dt>AssumeRole</dt>
     *         <dd>
     *         <p>
     *         The Amazon Resource Name (ARN) of the role that performs the self-service actions on your behalf. For
     *         example, <code>"AssumeRole": "arn:aws:iam::12345678910:role/ActionRole"</code>.
     *         </p>
     *         <p>
     *         To reuse the provisioned product launch role, set to <code>"AssumeRole": "LAUNCH_ROLE"</code>.
     *         </p>
     *         </dd>
     *         <dt>Parameters</dt>
     *         <dd>
     *         <p>
     *         The list of parameters in JSON format.
     *         </p>
     *         <p>
     *         For example: <code>[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]</code>.
     *         </p>
     *         </dd>
     */

    public java.util.Map<String, String> getDefinition() {
        return definition;
    }

    /**
     * <p>
     * The self-service action definition. Can be one of the following:
     * </p>
     * <dl>
     * <dt>Name</dt>
     * <dd>
     * <p>
     * The name of the AWS Systems Manager Document. For example, <code>AWS-RestartEC2Instance</code>.
     * </p>
     * </dd>
     * <dt>Version</dt>
     * <dd>
     * <p>
     * The AWS Systems Manager automation document version. For example, <code>"Version": "1"</code>
     * </p>
     * </dd>
     * <dt>AssumeRole</dt>
     * <dd>
     * <p>
     * The Amazon Resource Name (ARN) of the role that performs the self-service actions on your behalf. For example,
     * <code>"AssumeRole": "arn:aws:iam::12345678910:role/ActionRole"</code>.
     * </p>
     * <p>
     * To reuse the provisioned product launch role, set to <code>"AssumeRole": "LAUNCH_ROLE"</code>.
     * </p>
     * </dd>
     * <dt>Parameters</dt>
     * <dd>
     * <p>
     * The list of parameters in JSON format.
     * </p>
     * <p>
     * For example: <code>[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param definition
     *        The self-service action definition. Can be one of the following:</p>
     *        <dl>
     *        <dt>Name</dt>
     *        <dd>
     *        <p>
     *        The name of the AWS Systems Manager Document. For example, <code>AWS-RestartEC2Instance</code>.
     *        </p>
     *        </dd>
     *        <dt>Version</dt>
     *        <dd>
     *        <p>
     *        The AWS Systems Manager automation document version. For example, <code>"Version": "1"</code>
     *        </p>
     *        </dd>
     *        <dt>AssumeRole</dt>
     *        <dd>
     *        <p>
     *        The Amazon Resource Name (ARN) of the role that performs the self-service actions on your behalf. For
     *        example, <code>"AssumeRole": "arn:aws:iam::12345678910:role/ActionRole"</code>.
     *        </p>
     *        <p>
     *        To reuse the provisioned product launch role, set to <code>"AssumeRole": "LAUNCH_ROLE"</code>.
     *        </p>
     *        </dd>
     *        <dt>Parameters</dt>
     *        <dd>
     *        <p>
     *        The list of parameters in JSON format.
     *        </p>
     *        <p>
     *        For example: <code>[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]</code>.
     *        </p>
     *        </dd>
     */

    public void setDefinition(java.util.Map<String, String> definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The self-service action definition. Can be one of the following:
     * </p>
     * <dl>
     * <dt>Name</dt>
     * <dd>
     * <p>
     * The name of the AWS Systems Manager Document. For example, <code>AWS-RestartEC2Instance</code>.
     * </p>
     * </dd>
     * <dt>Version</dt>
     * <dd>
     * <p>
     * The AWS Systems Manager automation document version. For example, <code>"Version": "1"</code>
     * </p>
     * </dd>
     * <dt>AssumeRole</dt>
     * <dd>
     * <p>
     * The Amazon Resource Name (ARN) of the role that performs the self-service actions on your behalf. For example,
     * <code>"AssumeRole": "arn:aws:iam::12345678910:role/ActionRole"</code>.
     * </p>
     * <p>
     * To reuse the provisioned product launch role, set to <code>"AssumeRole": "LAUNCH_ROLE"</code>.
     * </p>
     * </dd>
     * <dt>Parameters</dt>
     * <dd>
     * <p>
     * The list of parameters in JSON format.
     * </p>
     * <p>
     * For example: <code>[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param definition
     *        The self-service action definition. Can be one of the following:</p>
     *        <dl>
     *        <dt>Name</dt>
     *        <dd>
     *        <p>
     *        The name of the AWS Systems Manager Document. For example, <code>AWS-RestartEC2Instance</code>.
     *        </p>
     *        </dd>
     *        <dt>Version</dt>
     *        <dd>
     *        <p>
     *        The AWS Systems Manager automation document version. For example, <code>"Version": "1"</code>
     *        </p>
     *        </dd>
     *        <dt>AssumeRole</dt>
     *        <dd>
     *        <p>
     *        The Amazon Resource Name (ARN) of the role that performs the self-service actions on your behalf. For
     *        example, <code>"AssumeRole": "arn:aws:iam::12345678910:role/ActionRole"</code>.
     *        </p>
     *        <p>
     *        To reuse the provisioned product launch role, set to <code>"AssumeRole": "LAUNCH_ROLE"</code>.
     *        </p>
     *        </dd>
     *        <dt>Parameters</dt>
     *        <dd>
     *        <p>
     *        The list of parameters in JSON format.
     *        </p>
     *        <p>
     *        For example: <code>[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]</code>.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceActionRequest withDefinition(java.util.Map<String, String> definition) {
        setDefinition(definition);
        return this;
    }

    public CreateServiceActionRequest addDefinitionEntry(String key, String value) {
        if (null == this.definition) {
            this.definition = new java.util.HashMap<String, String>();
        }
        if (this.definition.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.definition.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Definition.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceActionRequest clearDefinitionEntries() {
        this.definition = null;
        return this;
    }

    /**
     * <p>
     * The self-service action description.
     * </p>
     * 
     * @param description
     *        The self-service action description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The self-service action description.
     * </p>
     * 
     * @return The self-service action description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The self-service action description.
     * </p>
     * 
     * @param description
     *        The self-service action description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceActionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceActionRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *        idempotency token, the same response is returned for each repeated request.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @return A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *         idempotency token, the same response is returned for each repeated request.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *        idempotency token, the same response is returned for each repeated request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceActionRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDefinitionType() != null)
            sb.append("DefinitionType: ").append(getDefinitionType()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceActionRequest == false)
            return false;
        CreateServiceActionRequest other = (CreateServiceActionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefinitionType() == null ^ this.getDefinitionType() == null)
            return false;
        if (other.getDefinitionType() != null && other.getDefinitionType().equals(this.getDefinitionType()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefinitionType() == null) ? 0 : getDefinitionType().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceActionRequest clone() {
        return (CreateServiceActionRequest) super.clone();
    }

}

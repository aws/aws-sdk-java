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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the secret to expose to your container. Secrets can be exposed to a container in the following
 * ways:
 * </p>
 * <ul>
 * <li>
 * <p>
 * To inject sensitive data into your containers as environment variables, use the <code>secrets</code> container
 * definition parameter.
 * </p>
 * </li>
 * <li>
 * <p>
 * To reference sensitive information in the log configuration of a container, use the <code>secretOptions</code>
 * container definition parameter.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html">Specifying
 * Sensitive Data</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/Secret" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Secret implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the secret.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The secret to expose to the container. The supported values are either the full ARN of the AWS Secrets Manager
     * secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
     * </p>
     * <note>
     * <p>
     * If the AWS Systems Manager Parameter Store parameter exists in the same Region as the task you are launching,
     * then you can use either the full ARN or name of the parameter. If the parameter exists in a different Region,
     * then the full ARN must be specified.
     * </p>
     * </note>
     */
    private String valueFrom;

    /**
     * <p>
     * The name of the secret.
     * </p>
     * 
     * @param name
     *        The name of the secret.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the secret.
     * </p>
     * 
     * @return The name of the secret.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the secret.
     * </p>
     * 
     * @param name
     *        The name of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Secret withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The secret to expose to the container. The supported values are either the full ARN of the AWS Secrets Manager
     * secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
     * </p>
     * <note>
     * <p>
     * If the AWS Systems Manager Parameter Store parameter exists in the same Region as the task you are launching,
     * then you can use either the full ARN or name of the parameter. If the parameter exists in a different Region,
     * then the full ARN must be specified.
     * </p>
     * </note>
     * 
     * @param valueFrom
     *        The secret to expose to the container. The supported values are either the full ARN of the AWS Secrets
     *        Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.</p> <note>
     *        <p>
     *        If the AWS Systems Manager Parameter Store parameter exists in the same Region as the task you are
     *        launching, then you can use either the full ARN or name of the parameter. If the parameter exists in a
     *        different Region, then the full ARN must be specified.
     *        </p>
     */

    public void setValueFrom(String valueFrom) {
        this.valueFrom = valueFrom;
    }

    /**
     * <p>
     * The secret to expose to the container. The supported values are either the full ARN of the AWS Secrets Manager
     * secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
     * </p>
     * <note>
     * <p>
     * If the AWS Systems Manager Parameter Store parameter exists in the same Region as the task you are launching,
     * then you can use either the full ARN or name of the parameter. If the parameter exists in a different Region,
     * then the full ARN must be specified.
     * </p>
     * </note>
     * 
     * @return The secret to expose to the container. The supported values are either the full ARN of the AWS Secrets
     *         Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.</p> <note>
     *         <p>
     *         If the AWS Systems Manager Parameter Store parameter exists in the same Region as the task you are
     *         launching, then you can use either the full ARN or name of the parameter. If the parameter exists in a
     *         different Region, then the full ARN must be specified.
     *         </p>
     */

    public String getValueFrom() {
        return this.valueFrom;
    }

    /**
     * <p>
     * The secret to expose to the container. The supported values are either the full ARN of the AWS Secrets Manager
     * secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
     * </p>
     * <note>
     * <p>
     * If the AWS Systems Manager Parameter Store parameter exists in the same Region as the task you are launching,
     * then you can use either the full ARN or name of the parameter. If the parameter exists in a different Region,
     * then the full ARN must be specified.
     * </p>
     * </note>
     * 
     * @param valueFrom
     *        The secret to expose to the container. The supported values are either the full ARN of the AWS Secrets
     *        Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.</p> <note>
     *        <p>
     *        If the AWS Systems Manager Parameter Store parameter exists in the same Region as the task you are
     *        launching, then you can use either the full ARN or name of the parameter. If the parameter exists in a
     *        different Region, then the full ARN must be specified.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Secret withValueFrom(String valueFrom) {
        setValueFrom(valueFrom);
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
        if (getValueFrom() != null)
            sb.append("ValueFrom: ").append(getValueFrom());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Secret == false)
            return false;
        Secret other = (Secret) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValueFrom() == null ^ this.getValueFrom() == null)
            return false;
        if (other.getValueFrom() != null && other.getValueFrom().equals(this.getValueFrom()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValueFrom() == null) ? 0 : getValueFrom().hashCode());
        return hashCode;
    }

    @Override
    public Secret clone() {
        try {
            return (Secret) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.SecretMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

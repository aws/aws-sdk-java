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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about a guardrail.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_ListGuardrails.html#API_ListGuardrails_ResponseSyntax"
 * >ListGuardrails response body</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GuardrailSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the guardrail.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN of the guardrail.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The status of the guardrail.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name of the guardrail.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the guardrail.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The version of the guardrail.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The date and time at which the guardrail was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time at which the guardrail was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The unique identifier of the guardrail.
     * </p>
     * 
     * @param id
     *        The unique identifier of the guardrail.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the guardrail.
     * </p>
     * 
     * @return The unique identifier of the guardrail.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the guardrail.
     * </p>
     * 
     * @param id
     *        The unique identifier of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN of the guardrail.
     * </p>
     * 
     * @param arn
     *        The ARN of the guardrail.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the guardrail.
     * </p>
     * 
     * @return The ARN of the guardrail.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the guardrail.
     * </p>
     * 
     * @param arn
     *        The ARN of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The status of the guardrail.
     * </p>
     * 
     * @param status
     *        The status of the guardrail.
     * @see GuardrailStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the guardrail.
     * </p>
     * 
     * @return The status of the guardrail.
     * @see GuardrailStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the guardrail.
     * </p>
     * 
     * @param status
     *        The status of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailStatus
     */

    public GuardrailSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the guardrail.
     * </p>
     * 
     * @param status
     *        The status of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailStatus
     */

    public GuardrailSummary withStatus(GuardrailStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The name of the guardrail.
     * </p>
     * 
     * @param name
     *        The name of the guardrail.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the guardrail.
     * </p>
     * 
     * @return The name of the guardrail.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the guardrail.
     * </p>
     * 
     * @param name
     *        The name of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the guardrail.
     * </p>
     * 
     * @param description
     *        A description of the guardrail.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the guardrail.
     * </p>
     * 
     * @return A description of the guardrail.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the guardrail.
     * </p>
     * 
     * @param description
     *        A description of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The version of the guardrail.
     * </p>
     * 
     * @param version
     *        The version of the guardrail.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the guardrail.
     * </p>
     * 
     * @return The version of the guardrail.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the guardrail.
     * </p>
     * 
     * @param version
     *        The version of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailSummary withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The date and time at which the guardrail was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time at which the guardrail was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time at which the guardrail was created.
     * </p>
     * 
     * @return The date and time at which the guardrail was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time at which the guardrail was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time at which the guardrail was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time at which the guardrail was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time at which the guardrail was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time at which the guardrail was last updated.
     * </p>
     * 
     * @return The date and time at which the guardrail was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time at which the guardrail was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time at which the guardrail was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailSummary == false)
            return false;
        GuardrailSummary other = (GuardrailSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailSummary clone() {
        try {
            return (GuardrailSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.GuardrailSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

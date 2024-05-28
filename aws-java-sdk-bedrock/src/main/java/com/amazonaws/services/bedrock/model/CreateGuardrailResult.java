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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateGuardrail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGuardrailResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the guardrail that was created.
     * </p>
     */
    private String guardrailId;
    /**
     * <p>
     * The ARN of the guardrail that was created.
     * </p>
     */
    private String guardrailArn;
    /**
     * <p>
     * The version of the guardrail that was created. This value should be 1.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The time at which the guardrail was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The unique identifier of the guardrail that was created.
     * </p>
     * 
     * @param guardrailId
     *        The unique identifier of the guardrail that was created.
     */

    public void setGuardrailId(String guardrailId) {
        this.guardrailId = guardrailId;
    }

    /**
     * <p>
     * The unique identifier of the guardrail that was created.
     * </p>
     * 
     * @return The unique identifier of the guardrail that was created.
     */

    public String getGuardrailId() {
        return this.guardrailId;
    }

    /**
     * <p>
     * The unique identifier of the guardrail that was created.
     * </p>
     * 
     * @param guardrailId
     *        The unique identifier of the guardrail that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGuardrailResult withGuardrailId(String guardrailId) {
        setGuardrailId(guardrailId);
        return this;
    }

    /**
     * <p>
     * The ARN of the guardrail that was created.
     * </p>
     * 
     * @param guardrailArn
     *        The ARN of the guardrail that was created.
     */

    public void setGuardrailArn(String guardrailArn) {
        this.guardrailArn = guardrailArn;
    }

    /**
     * <p>
     * The ARN of the guardrail that was created.
     * </p>
     * 
     * @return The ARN of the guardrail that was created.
     */

    public String getGuardrailArn() {
        return this.guardrailArn;
    }

    /**
     * <p>
     * The ARN of the guardrail that was created.
     * </p>
     * 
     * @param guardrailArn
     *        The ARN of the guardrail that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGuardrailResult withGuardrailArn(String guardrailArn) {
        setGuardrailArn(guardrailArn);
        return this;
    }

    /**
     * <p>
     * The version of the guardrail that was created. This value should be 1.
     * </p>
     * 
     * @param version
     *        The version of the guardrail that was created. This value should be 1.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the guardrail that was created. This value should be 1.
     * </p>
     * 
     * @return The version of the guardrail that was created. This value should be 1.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the guardrail that was created. This value should be 1.
     * </p>
     * 
     * @param version
     *        The version of the guardrail that was created. This value should be 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGuardrailResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The time at which the guardrail was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the guardrail was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the guardrail was created.
     * </p>
     * 
     * @return The time at which the guardrail was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the guardrail was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the guardrail was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGuardrailResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getGuardrailId() != null)
            sb.append("GuardrailId: ").append(getGuardrailId()).append(",");
        if (getGuardrailArn() != null)
            sb.append("GuardrailArn: ").append(getGuardrailArn()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGuardrailResult == false)
            return false;
        CreateGuardrailResult other = (CreateGuardrailResult) obj;
        if (other.getGuardrailId() == null ^ this.getGuardrailId() == null)
            return false;
        if (other.getGuardrailId() != null && other.getGuardrailId().equals(this.getGuardrailId()) == false)
            return false;
        if (other.getGuardrailArn() == null ^ this.getGuardrailArn() == null)
            return false;
        if (other.getGuardrailArn() != null && other.getGuardrailArn().equals(this.getGuardrailArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGuardrailId() == null) ? 0 : getGuardrailId().hashCode());
        hashCode = prime * hashCode + ((getGuardrailArn() == null) ? 0 : getGuardrailArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public CreateGuardrailResult clone() {
        try {
            return (CreateGuardrailResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

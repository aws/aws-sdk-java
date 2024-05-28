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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UpdateGuardrail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGuardrailResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the guardrail
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
     * The version of the guardrail.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The date and time at which the guardrail was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The unique identifier of the guardrail
     * </p>
     * 
     * @param guardrailId
     *        The unique identifier of the guardrail
     */

    public void setGuardrailId(String guardrailId) {
        this.guardrailId = guardrailId;
    }

    /**
     * <p>
     * The unique identifier of the guardrail
     * </p>
     * 
     * @return The unique identifier of the guardrail
     */

    public String getGuardrailId() {
        return this.guardrailId;
    }

    /**
     * <p>
     * The unique identifier of the guardrail
     * </p>
     * 
     * @param guardrailId
     *        The unique identifier of the guardrail
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGuardrailResult withGuardrailId(String guardrailId) {
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

    public UpdateGuardrailResult withGuardrailArn(String guardrailArn) {
        setGuardrailArn(guardrailArn);
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

    public UpdateGuardrailResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The date and time at which the guardrail was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time at which the guardrail was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time at which the guardrail was updated.
     * </p>
     * 
     * @return The date and time at which the guardrail was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time at which the guardrail was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time at which the guardrail was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGuardrailResult withUpdatedAt(java.util.Date updatedAt) {
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
        if (getGuardrailId() != null)
            sb.append("GuardrailId: ").append(getGuardrailId()).append(",");
        if (getGuardrailArn() != null)
            sb.append("GuardrailArn: ").append(getGuardrailArn()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
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

        if (obj instanceof UpdateGuardrailResult == false)
            return false;
        UpdateGuardrailResult other = (UpdateGuardrailResult) obj;
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

        hashCode = prime * hashCode + ((getGuardrailId() == null) ? 0 : getGuardrailId().hashCode());
        hashCode = prime * hashCode + ((getGuardrailArn() == null) ? 0 : getGuardrailArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGuardrailResult clone() {
        try {
            return (UpdateGuardrailResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

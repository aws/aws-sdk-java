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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetGuardrail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGuardrailRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the guardrail for which to get details.
     * </p>
     */
    private String guardrailIdentifier;
    /**
     * <p>
     * The version of the guardrail for which to get details. If you don't specify a version, the response returns
     * details for the <code>DRAFT</code> version.
     * </p>
     */
    private String guardrailVersion;

    /**
     * <p>
     * The unique identifier of the guardrail for which to get details.
     * </p>
     * 
     * @param guardrailIdentifier
     *        The unique identifier of the guardrail for which to get details.
     */

    public void setGuardrailIdentifier(String guardrailIdentifier) {
        this.guardrailIdentifier = guardrailIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the guardrail for which to get details.
     * </p>
     * 
     * @return The unique identifier of the guardrail for which to get details.
     */

    public String getGuardrailIdentifier() {
        return this.guardrailIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the guardrail for which to get details.
     * </p>
     * 
     * @param guardrailIdentifier
     *        The unique identifier of the guardrail for which to get details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailRequest withGuardrailIdentifier(String guardrailIdentifier) {
        setGuardrailIdentifier(guardrailIdentifier);
        return this;
    }

    /**
     * <p>
     * The version of the guardrail for which to get details. If you don't specify a version, the response returns
     * details for the <code>DRAFT</code> version.
     * </p>
     * 
     * @param guardrailVersion
     *        The version of the guardrail for which to get details. If you don't specify a version, the response
     *        returns details for the <code>DRAFT</code> version.
     */

    public void setGuardrailVersion(String guardrailVersion) {
        this.guardrailVersion = guardrailVersion;
    }

    /**
     * <p>
     * The version of the guardrail for which to get details. If you don't specify a version, the response returns
     * details for the <code>DRAFT</code> version.
     * </p>
     * 
     * @return The version of the guardrail for which to get details. If you don't specify a version, the response
     *         returns details for the <code>DRAFT</code> version.
     */

    public String getGuardrailVersion() {
        return this.guardrailVersion;
    }

    /**
     * <p>
     * The version of the guardrail for which to get details. If you don't specify a version, the response returns
     * details for the <code>DRAFT</code> version.
     * </p>
     * 
     * @param guardrailVersion
     *        The version of the guardrail for which to get details. If you don't specify a version, the response
     *        returns details for the <code>DRAFT</code> version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailRequest withGuardrailVersion(String guardrailVersion) {
        setGuardrailVersion(guardrailVersion);
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
        if (getGuardrailIdentifier() != null)
            sb.append("GuardrailIdentifier: ").append(getGuardrailIdentifier()).append(",");
        if (getGuardrailVersion() != null)
            sb.append("GuardrailVersion: ").append(getGuardrailVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGuardrailRequest == false)
            return false;
        GetGuardrailRequest other = (GetGuardrailRequest) obj;
        if (other.getGuardrailIdentifier() == null ^ this.getGuardrailIdentifier() == null)
            return false;
        if (other.getGuardrailIdentifier() != null && other.getGuardrailIdentifier().equals(this.getGuardrailIdentifier()) == false)
            return false;
        if (other.getGuardrailVersion() == null ^ this.getGuardrailVersion() == null)
            return false;
        if (other.getGuardrailVersion() != null && other.getGuardrailVersion().equals(this.getGuardrailVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGuardrailIdentifier() == null) ? 0 : getGuardrailIdentifier().hashCode());
        hashCode = prime * hashCode + ((getGuardrailVersion() == null) ? 0 : getGuardrailVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetGuardrailRequest clone() {
        return (GetGuardrailRequest) super.clone();
    }

}

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
 * Contains details about how to handle harmful content.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_CreateGuardrail.html#API_CreateGuardrail_RequestSyntax"
 * >CreateGuardrail request body</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_UpdateGuardrail.html#API_UpdateGuardrail_RequestSyntax"
 * >UpdateGuardrail request body</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GuardrailContentPolicyConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailContentPolicyConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the type of the content filter and how strongly it should apply to prompts and model responses.
     * </p>
     */
    private java.util.List<GuardrailContentFilterConfig> filtersConfig;

    /**
     * <p>
     * Contains the type of the content filter and how strongly it should apply to prompts and model responses.
     * </p>
     * 
     * @return Contains the type of the content filter and how strongly it should apply to prompts and model responses.
     */

    public java.util.List<GuardrailContentFilterConfig> getFiltersConfig() {
        return filtersConfig;
    }

    /**
     * <p>
     * Contains the type of the content filter and how strongly it should apply to prompts and model responses.
     * </p>
     * 
     * @param filtersConfig
     *        Contains the type of the content filter and how strongly it should apply to prompts and model responses.
     */

    public void setFiltersConfig(java.util.Collection<GuardrailContentFilterConfig> filtersConfig) {
        if (filtersConfig == null) {
            this.filtersConfig = null;
            return;
        }

        this.filtersConfig = new java.util.ArrayList<GuardrailContentFilterConfig>(filtersConfig);
    }

    /**
     * <p>
     * Contains the type of the content filter and how strongly it should apply to prompts and model responses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFiltersConfig(java.util.Collection)} or {@link #withFiltersConfig(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param filtersConfig
     *        Contains the type of the content filter and how strongly it should apply to prompts and model responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailContentPolicyConfig withFiltersConfig(GuardrailContentFilterConfig... filtersConfig) {
        if (this.filtersConfig == null) {
            setFiltersConfig(new java.util.ArrayList<GuardrailContentFilterConfig>(filtersConfig.length));
        }
        for (GuardrailContentFilterConfig ele : filtersConfig) {
            this.filtersConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the type of the content filter and how strongly it should apply to prompts and model responses.
     * </p>
     * 
     * @param filtersConfig
     *        Contains the type of the content filter and how strongly it should apply to prompts and model responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailContentPolicyConfig withFiltersConfig(java.util.Collection<GuardrailContentFilterConfig> filtersConfig) {
        setFiltersConfig(filtersConfig);
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
        if (getFiltersConfig() != null)
            sb.append("FiltersConfig: ").append(getFiltersConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailContentPolicyConfig == false)
            return false;
        GuardrailContentPolicyConfig other = (GuardrailContentPolicyConfig) obj;
        if (other.getFiltersConfig() == null ^ this.getFiltersConfig() == null)
            return false;
        if (other.getFiltersConfig() != null && other.getFiltersConfig().equals(this.getFiltersConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFiltersConfig() == null) ? 0 : getFiltersConfig().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailContentPolicyConfig clone() {
        try {
            return (GuardrailContentPolicyConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.GuardrailContentPolicyConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

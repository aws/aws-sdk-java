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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies an AWS Config rule that evaluated an AWS resource, and provides the type and ID of the resource that the
 * rule evaluated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/EvaluationResultQualifier" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationResultQualifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the AWS Config rule that was used in the evaluation.
     * </p>
     */
    private String configRuleName;
    /**
     * <p>
     * The type of AWS resource that was evaluated.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The ID of the evaluated AWS resource.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * The name of the AWS Config rule that was used in the evaluation.
     * </p>
     * 
     * @param configRuleName
     *        The name of the AWS Config rule that was used in the evaluation.
     */

    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }

    /**
     * <p>
     * The name of the AWS Config rule that was used in the evaluation.
     * </p>
     * 
     * @return The name of the AWS Config rule that was used in the evaluation.
     */

    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * <p>
     * The name of the AWS Config rule that was used in the evaluation.
     * </p>
     * 
     * @param configRuleName
     *        The name of the AWS Config rule that was used in the evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResultQualifier withConfigRuleName(String configRuleName) {
        setConfigRuleName(configRuleName);
        return this;
    }

    /**
     * <p>
     * The type of AWS resource that was evaluated.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource that was evaluated.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of AWS resource that was evaluated.
     * </p>
     * 
     * @return The type of AWS resource that was evaluated.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of AWS resource that was evaluated.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource that was evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResultQualifier withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The ID of the evaluated AWS resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the evaluated AWS resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the evaluated AWS resource.
     * </p>
     * 
     * @return The ID of the evaluated AWS resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the evaluated AWS resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the evaluated AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResultQualifier withResourceId(String resourceId) {
        setResourceId(resourceId);
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
        if (getConfigRuleName() != null)
            sb.append("ConfigRuleName: ").append(getConfigRuleName()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationResultQualifier == false)
            return false;
        EvaluationResultQualifier other = (EvaluationResultQualifier) obj;
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null)
            return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationResultQualifier clone() {
        try {
            return (EvaluationResultQualifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.EvaluationResultQualifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

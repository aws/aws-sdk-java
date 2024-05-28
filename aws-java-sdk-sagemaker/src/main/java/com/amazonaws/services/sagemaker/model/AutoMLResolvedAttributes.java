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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The resolved attributes used to configure an AutoML job V2.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLResolvedAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLResolvedAttributes implements Serializable, Cloneable, StructuredPojo {

    private AutoMLJobObjective autoMLJobObjective;

    private AutoMLJobCompletionCriteria completionCriteria;
    /**
     * <p>
     * Defines the resolved attributes specific to a problem type.
     * </p>
     */
    private AutoMLProblemTypeResolvedAttributes autoMLProblemTypeResolvedAttributes;

    /**
     * @param autoMLJobObjective
     */

    public void setAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        this.autoMLJobObjective = autoMLJobObjective;
    }

    /**
     * @return
     */

    public AutoMLJobObjective getAutoMLJobObjective() {
        return this.autoMLJobObjective;
    }

    /**
     * @param autoMLJobObjective
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLResolvedAttributes withAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        setAutoMLJobObjective(autoMLJobObjective);
        return this;
    }

    /**
     * @param completionCriteria
     */

    public void setCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        this.completionCriteria = completionCriteria;
    }

    /**
     * @return
     */

    public AutoMLJobCompletionCriteria getCompletionCriteria() {
        return this.completionCriteria;
    }

    /**
     * @param completionCriteria
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLResolvedAttributes withCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        setCompletionCriteria(completionCriteria);
        return this;
    }

    /**
     * <p>
     * Defines the resolved attributes specific to a problem type.
     * </p>
     * 
     * @param autoMLProblemTypeResolvedAttributes
     *        Defines the resolved attributes specific to a problem type.
     */

    public void setAutoMLProblemTypeResolvedAttributes(AutoMLProblemTypeResolvedAttributes autoMLProblemTypeResolvedAttributes) {
        this.autoMLProblemTypeResolvedAttributes = autoMLProblemTypeResolvedAttributes;
    }

    /**
     * <p>
     * Defines the resolved attributes specific to a problem type.
     * </p>
     * 
     * @return Defines the resolved attributes specific to a problem type.
     */

    public AutoMLProblemTypeResolvedAttributes getAutoMLProblemTypeResolvedAttributes() {
        return this.autoMLProblemTypeResolvedAttributes;
    }

    /**
     * <p>
     * Defines the resolved attributes specific to a problem type.
     * </p>
     * 
     * @param autoMLProblemTypeResolvedAttributes
     *        Defines the resolved attributes specific to a problem type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLResolvedAttributes withAutoMLProblemTypeResolvedAttributes(AutoMLProblemTypeResolvedAttributes autoMLProblemTypeResolvedAttributes) {
        setAutoMLProblemTypeResolvedAttributes(autoMLProblemTypeResolvedAttributes);
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
        if (getAutoMLJobObjective() != null)
            sb.append("AutoMLJobObjective: ").append(getAutoMLJobObjective()).append(",");
        if (getCompletionCriteria() != null)
            sb.append("CompletionCriteria: ").append(getCompletionCriteria()).append(",");
        if (getAutoMLProblemTypeResolvedAttributes() != null)
            sb.append("AutoMLProblemTypeResolvedAttributes: ").append(getAutoMLProblemTypeResolvedAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLResolvedAttributes == false)
            return false;
        AutoMLResolvedAttributes other = (AutoMLResolvedAttributes) obj;
        if (other.getAutoMLJobObjective() == null ^ this.getAutoMLJobObjective() == null)
            return false;
        if (other.getAutoMLJobObjective() != null && other.getAutoMLJobObjective().equals(this.getAutoMLJobObjective()) == false)
            return false;
        if (other.getCompletionCriteria() == null ^ this.getCompletionCriteria() == null)
            return false;
        if (other.getCompletionCriteria() != null && other.getCompletionCriteria().equals(this.getCompletionCriteria()) == false)
            return false;
        if (other.getAutoMLProblemTypeResolvedAttributes() == null ^ this.getAutoMLProblemTypeResolvedAttributes() == null)
            return false;
        if (other.getAutoMLProblemTypeResolvedAttributes() != null
                && other.getAutoMLProblemTypeResolvedAttributes().equals(this.getAutoMLProblemTypeResolvedAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoMLJobObjective() == null) ? 0 : getAutoMLJobObjective().hashCode());
        hashCode = prime * hashCode + ((getCompletionCriteria() == null) ? 0 : getCompletionCriteria().hashCode());
        hashCode = prime * hashCode + ((getAutoMLProblemTypeResolvedAttributes() == null) ? 0 : getAutoMLProblemTypeResolvedAttributes().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLResolvedAttributes clone() {
        try {
            return (AutoMLResolvedAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLResolvedAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

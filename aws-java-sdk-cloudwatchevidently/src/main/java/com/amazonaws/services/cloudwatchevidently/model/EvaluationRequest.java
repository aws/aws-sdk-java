/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure assigns a feature variation to one user session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/EvaluationRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An internal ID that represents a unique user session of the application. This <code>entityID</code> is checked
     * against any override rules assigned for this feature.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * A JSON block of attributes that you can optionally pass in. This JSON block is included in the evaluation events
     * sent to Evidently from the user session.
     * </p>
     */
    private String evaluationContext;
    /**
     * <p>
     * The name of the feature being evaluated.
     * </p>
     */
    private String feature;

    /**
     * <p>
     * An internal ID that represents a unique user session of the application. This <code>entityID</code> is checked
     * against any override rules assigned for this feature.
     * </p>
     * 
     * @param entityId
     *        An internal ID that represents a unique user session of the application. This <code>entityID</code> is
     *        checked against any override rules assigned for this feature.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * An internal ID that represents a unique user session of the application. This <code>entityID</code> is checked
     * against any override rules assigned for this feature.
     * </p>
     * 
     * @return An internal ID that represents a unique user session of the application. This <code>entityID</code> is
     *         checked against any override rules assigned for this feature.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * An internal ID that represents a unique user session of the application. This <code>entityID</code> is checked
     * against any override rules assigned for this feature.
     * </p>
     * 
     * @param entityId
     *        An internal ID that represents a unique user session of the application. This <code>entityID</code> is
     *        checked against any override rules assigned for this feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationRequest withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * A JSON block of attributes that you can optionally pass in. This JSON block is included in the evaluation events
     * sent to Evidently from the user session.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param evaluationContext
     *        A JSON block of attributes that you can optionally pass in. This JSON block is included in the evaluation
     *        events sent to Evidently from the user session.
     */

    public void setEvaluationContext(String evaluationContext) {
        this.evaluationContext = evaluationContext;
    }

    /**
     * <p>
     * A JSON block of attributes that you can optionally pass in. This JSON block is included in the evaluation events
     * sent to Evidently from the user session.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return A JSON block of attributes that you can optionally pass in. This JSON block is included in the evaluation
     *         events sent to Evidently from the user session.
     */

    public String getEvaluationContext() {
        return this.evaluationContext;
    }

    /**
     * <p>
     * A JSON block of attributes that you can optionally pass in. This JSON block is included in the evaluation events
     * sent to Evidently from the user session.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param evaluationContext
     *        A JSON block of attributes that you can optionally pass in. This JSON block is included in the evaluation
     *        events sent to Evidently from the user session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationRequest withEvaluationContext(String evaluationContext) {
        setEvaluationContext(evaluationContext);
        return this;
    }

    /**
     * <p>
     * The name of the feature being evaluated.
     * </p>
     * 
     * @param feature
     *        The name of the feature being evaluated.
     */

    public void setFeature(String feature) {
        this.feature = feature;
    }

    /**
     * <p>
     * The name of the feature being evaluated.
     * </p>
     * 
     * @return The name of the feature being evaluated.
     */

    public String getFeature() {
        return this.feature;
    }

    /**
     * <p>
     * The name of the feature being evaluated.
     * </p>
     * 
     * @param feature
     *        The name of the feature being evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationRequest withFeature(String feature) {
        setFeature(feature);
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
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getEvaluationContext() != null)
            sb.append("EvaluationContext: ").append(getEvaluationContext()).append(",");
        if (getFeature() != null)
            sb.append("Feature: ").append(getFeature());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationRequest == false)
            return false;
        EvaluationRequest other = (EvaluationRequest) obj;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getEvaluationContext() == null ^ this.getEvaluationContext() == null)
            return false;
        if (other.getEvaluationContext() != null && other.getEvaluationContext().equals(this.getEvaluationContext()) == false)
            return false;
        if (other.getFeature() == null ^ this.getFeature() == null)
            return false;
        if (other.getFeature() != null && other.getFeature().equals(this.getFeature()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getEvaluationContext() == null) ? 0 : getEvaluationContext().hashCode());
        hashCode = prime * hashCode + ((getFeature() == null) ? 0 : getFeature().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationRequest clone() {
        try {
            return (EvaluationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.EvaluationRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

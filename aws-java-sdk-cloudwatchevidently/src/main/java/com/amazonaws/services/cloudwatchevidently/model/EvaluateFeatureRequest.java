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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/EvaluateFeature" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluateFeatureRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An internal ID that represents a unique user of the application. This <code>entityID</code> is checked against
     * any override rules assigned for this feature.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * A JSON object of attributes that you can optionally pass in as part of the evaluation event sent to Evidently
     * from the user session. Evidently can use this value to match user sessions with defined audience segments. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html">Use
     * segments to focus your audience</a>.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;If you include this parameter, the value must be a JSON object. A JSON array is not supported.&lt;/p&gt; </code>
     * </pre>
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
     * The name or ARN of the project that contains this feature.
     * </p>
     */
    private String project;

    /**
     * <p>
     * An internal ID that represents a unique user of the application. This <code>entityID</code> is checked against
     * any override rules assigned for this feature.
     * </p>
     * 
     * @param entityId
     *        An internal ID that represents a unique user of the application. This <code>entityID</code> is checked
     *        against any override rules assigned for this feature.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * An internal ID that represents a unique user of the application. This <code>entityID</code> is checked against
     * any override rules assigned for this feature.
     * </p>
     * 
     * @return An internal ID that represents a unique user of the application. This <code>entityID</code> is checked
     *         against any override rules assigned for this feature.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * An internal ID that represents a unique user of the application. This <code>entityID</code> is checked against
     * any override rules assigned for this feature.
     * </p>
     * 
     * @param entityId
     *        An internal ID that represents a unique user of the application. This <code>entityID</code> is checked
     *        against any override rules assigned for this feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateFeatureRequest withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * A JSON object of attributes that you can optionally pass in as part of the evaluation event sent to Evidently
     * from the user session. Evidently can use this value to match user sessions with defined audience segments. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html">Use
     * segments to focus your audience</a>.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;If you include this parameter, the value must be a JSON object. A JSON array is not supported.&lt;/p&gt; </code>
     * </pre>
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
     *        A JSON object of attributes that you can optionally pass in as part of the evaluation event sent to
     *        Evidently from the user session. Evidently can use this value to match user sessions with defined audience
     *        segments. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html"
     *        >Use segments to focus your audience</a>.</p>
     * 
     * <pre><code> &lt;p&gt;If you include this parameter, the value must be a JSON object. A JSON array is not supported.&lt;/p&gt; </code>
     */

    public void setEvaluationContext(String evaluationContext) {
        this.evaluationContext = evaluationContext;
    }

    /**
     * <p>
     * A JSON object of attributes that you can optionally pass in as part of the evaluation event sent to Evidently
     * from the user session. Evidently can use this value to match user sessions with defined audience segments. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html">Use
     * segments to focus your audience</a>.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;If you include this parameter, the value must be a JSON object. A JSON array is not supported.&lt;/p&gt; </code>
     * </pre>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return A JSON object of attributes that you can optionally pass in as part of the evaluation event sent to
     *         Evidently from the user session. Evidently can use this value to match user sessions with defined
     *         audience segments. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html">Use
     *         segments to focus your audience</a>.</p>
     * 
     * <pre><code> &lt;p&gt;If you include this parameter, the value must be a JSON object. A JSON array is not supported.&lt;/p&gt; </code>
     */

    public String getEvaluationContext() {
        return this.evaluationContext;
    }

    /**
     * <p>
     * A JSON object of attributes that you can optionally pass in as part of the evaluation event sent to Evidently
     * from the user session. Evidently can use this value to match user sessions with defined audience segments. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html">Use
     * segments to focus your audience</a>.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;If you include this parameter, the value must be a JSON object. A JSON array is not supported.&lt;/p&gt; </code>
     * </pre>
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
     *        A JSON object of attributes that you can optionally pass in as part of the evaluation event sent to
     *        Evidently from the user session. Evidently can use this value to match user sessions with defined audience
     *        segments. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html"
     *        >Use segments to focus your audience</a>.</p>
     * 
     *        <pre>
     * <code> &lt;p&gt;If you include this parameter, the value must be a JSON object. A JSON array is not supported.&lt;/p&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateFeatureRequest withEvaluationContext(String evaluationContext) {
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

    public EvaluateFeatureRequest withFeature(String feature) {
        setFeature(feature);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that contains this feature.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains this feature.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains this feature.
     * </p>
     * 
     * @return The name or ARN of the project that contains this feature.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains this feature.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains this feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateFeatureRequest withProject(String project) {
        setProject(project);
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
            sb.append("Feature: ").append(getFeature()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluateFeatureRequest == false)
            return false;
        EvaluateFeatureRequest other = (EvaluateFeatureRequest) obj;
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
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
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
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        return hashCode;
    }

    @Override
    public EvaluateFeatureRequest clone() {
        return (EvaluateFeatureRequest) super.clone();
    }

}

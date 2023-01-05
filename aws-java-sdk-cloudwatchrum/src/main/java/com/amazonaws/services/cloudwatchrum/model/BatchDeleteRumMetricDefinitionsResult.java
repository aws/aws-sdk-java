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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/BatchDeleteRumMetricDefinitions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteRumMetricDefinitionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array of error objects, if the operation caused any errors.
     * </p>
     */
    private java.util.List<BatchDeleteRumMetricDefinitionsError> errors;
    /**
     * <p>
     * The IDs of the metric definitions that were deleted.
     * </p>
     */
    private java.util.List<String> metricDefinitionIds;

    /**
     * <p>
     * An array of error objects, if the operation caused any errors.
     * </p>
     * 
     * @return An array of error objects, if the operation caused any errors.
     */

    public java.util.List<BatchDeleteRumMetricDefinitionsError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * An array of error objects, if the operation caused any errors.
     * </p>
     * 
     * @param errors
     *        An array of error objects, if the operation caused any errors.
     */

    public void setErrors(java.util.Collection<BatchDeleteRumMetricDefinitionsError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchDeleteRumMetricDefinitionsError>(errors);
    }

    /**
     * <p>
     * An array of error objects, if the operation caused any errors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        An array of error objects, if the operation caused any errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRumMetricDefinitionsResult withErrors(BatchDeleteRumMetricDefinitionsError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchDeleteRumMetricDefinitionsError>(errors.length));
        }
        for (BatchDeleteRumMetricDefinitionsError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of error objects, if the operation caused any errors.
     * </p>
     * 
     * @param errors
     *        An array of error objects, if the operation caused any errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRumMetricDefinitionsResult withErrors(java.util.Collection<BatchDeleteRumMetricDefinitionsError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * The IDs of the metric definitions that were deleted.
     * </p>
     * 
     * @return The IDs of the metric definitions that were deleted.
     */

    public java.util.List<String> getMetricDefinitionIds() {
        return metricDefinitionIds;
    }

    /**
     * <p>
     * The IDs of the metric definitions that were deleted.
     * </p>
     * 
     * @param metricDefinitionIds
     *        The IDs of the metric definitions that were deleted.
     */

    public void setMetricDefinitionIds(java.util.Collection<String> metricDefinitionIds) {
        if (metricDefinitionIds == null) {
            this.metricDefinitionIds = null;
            return;
        }

        this.metricDefinitionIds = new java.util.ArrayList<String>(metricDefinitionIds);
    }

    /**
     * <p>
     * The IDs of the metric definitions that were deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricDefinitionIds(java.util.Collection)} or {@link #withMetricDefinitionIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param metricDefinitionIds
     *        The IDs of the metric definitions that were deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRumMetricDefinitionsResult withMetricDefinitionIds(String... metricDefinitionIds) {
        if (this.metricDefinitionIds == null) {
            setMetricDefinitionIds(new java.util.ArrayList<String>(metricDefinitionIds.length));
        }
        for (String ele : metricDefinitionIds) {
            this.metricDefinitionIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the metric definitions that were deleted.
     * </p>
     * 
     * @param metricDefinitionIds
     *        The IDs of the metric definitions that were deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRumMetricDefinitionsResult withMetricDefinitionIds(java.util.Collection<String> metricDefinitionIds) {
        setMetricDefinitionIds(metricDefinitionIds);
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
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getMetricDefinitionIds() != null)
            sb.append("MetricDefinitionIds: ").append(getMetricDefinitionIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteRumMetricDefinitionsResult == false)
            return false;
        BatchDeleteRumMetricDefinitionsResult other = (BatchDeleteRumMetricDefinitionsResult) obj;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getMetricDefinitionIds() == null ^ this.getMetricDefinitionIds() == null)
            return false;
        if (other.getMetricDefinitionIds() != null && other.getMetricDefinitionIds().equals(this.getMetricDefinitionIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getMetricDefinitionIds() == null) ? 0 : getMetricDefinitionIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteRumMetricDefinitionsResult clone() {
        try {
            return (BatchDeleteRumMetricDefinitionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

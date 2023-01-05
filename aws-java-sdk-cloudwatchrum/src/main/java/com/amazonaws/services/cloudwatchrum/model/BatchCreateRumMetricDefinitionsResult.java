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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/BatchCreateRumMetricDefinitions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateRumMetricDefinitionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array of error objects, if the operation caused any errors.
     * </p>
     */
    private java.util.List<BatchCreateRumMetricDefinitionsError> errors;
    /**
     * <p>
     * An array of structures that define the extended metrics.
     * </p>
     */
    private java.util.List<MetricDefinition> metricDefinitions;

    /**
     * <p>
     * An array of error objects, if the operation caused any errors.
     * </p>
     * 
     * @return An array of error objects, if the operation caused any errors.
     */

    public java.util.List<BatchCreateRumMetricDefinitionsError> getErrors() {
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

    public void setErrors(java.util.Collection<BatchCreateRumMetricDefinitionsError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchCreateRumMetricDefinitionsError>(errors);
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

    public BatchCreateRumMetricDefinitionsResult withErrors(BatchCreateRumMetricDefinitionsError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchCreateRumMetricDefinitionsError>(errors.length));
        }
        for (BatchCreateRumMetricDefinitionsError ele : errors) {
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

    public BatchCreateRumMetricDefinitionsResult withErrors(java.util.Collection<BatchCreateRumMetricDefinitionsError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * An array of structures that define the extended metrics.
     * </p>
     * 
     * @return An array of structures that define the extended metrics.
     */

    public java.util.List<MetricDefinition> getMetricDefinitions() {
        return metricDefinitions;
    }

    /**
     * <p>
     * An array of structures that define the extended metrics.
     * </p>
     * 
     * @param metricDefinitions
     *        An array of structures that define the extended metrics.
     */

    public void setMetricDefinitions(java.util.Collection<MetricDefinition> metricDefinitions) {
        if (metricDefinitions == null) {
            this.metricDefinitions = null;
            return;
        }

        this.metricDefinitions = new java.util.ArrayList<MetricDefinition>(metricDefinitions);
    }

    /**
     * <p>
     * An array of structures that define the extended metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricDefinitions(java.util.Collection)} or {@link #withMetricDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param metricDefinitions
     *        An array of structures that define the extended metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateRumMetricDefinitionsResult withMetricDefinitions(MetricDefinition... metricDefinitions) {
        if (this.metricDefinitions == null) {
            setMetricDefinitions(new java.util.ArrayList<MetricDefinition>(metricDefinitions.length));
        }
        for (MetricDefinition ele : metricDefinitions) {
            this.metricDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that define the extended metrics.
     * </p>
     * 
     * @param metricDefinitions
     *        An array of structures that define the extended metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateRumMetricDefinitionsResult withMetricDefinitions(java.util.Collection<MetricDefinition> metricDefinitions) {
        setMetricDefinitions(metricDefinitions);
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
        if (getMetricDefinitions() != null)
            sb.append("MetricDefinitions: ").append(getMetricDefinitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateRumMetricDefinitionsResult == false)
            return false;
        BatchCreateRumMetricDefinitionsResult other = (BatchCreateRumMetricDefinitionsResult) obj;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getMetricDefinitions() == null ^ this.getMetricDefinitions() == null)
            return false;
        if (other.getMetricDefinitions() != null && other.getMetricDefinitions().equals(this.getMetricDefinitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getMetricDefinitions() == null) ? 0 : getMetricDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreateRumMetricDefinitionsResult clone() {
        try {
            return (BatchCreateRumMetricDefinitionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

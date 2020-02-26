/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the endpoint whose configuration you want to update.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The name of the new endpoint configuration.
     * </p>
     */
    private String endpointConfigName;
    /**
     * <p>
     * When updating endpoint resources, enables or disables the retention of variant properties, such as the instance
     * count or the variant weight. To retain the variant properties of an endpoint when updating it, set
     * <code>RetainAllVariantProperties</code> to <code>true</code>. To use the variant properties specified in a new
     * <code>EndpointConfig</code> call when updating an endpoint, set <code>RetainAllVariantProperties</code> to
     * <code>false</code>.
     * </p>
     */
    private Boolean retainAllVariantProperties;
    /**
     * <p>
     * When you are updating endpoint resources with <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties"
     * >RetainAllVariantProperties</a>, whose value is set to <code>true</code>,
     * <code>ExcludeRetainedVariantProperties</code> specifies the list of type <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_VariantProperty.html">VariantProperty</a> to override
     * with the values provided by <code>EndpointConfig</code>. If you don't specify a value for
     * <code>ExcludeAllVariantProperties</code>, no variant properties are overridden.
     * </p>
     */
    private java.util.List<VariantProperty> excludeRetainedVariantProperties;

    /**
     * <p>
     * The name of the endpoint whose configuration you want to update.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint whose configuration you want to update.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint whose configuration you want to update.
     * </p>
     * 
     * @return The name of the endpoint whose configuration you want to update.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the endpoint whose configuration you want to update.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint whose configuration you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The name of the new endpoint configuration.
     * </p>
     * 
     * @param endpointConfigName
     *        The name of the new endpoint configuration.
     */

    public void setEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
    }

    /**
     * <p>
     * The name of the new endpoint configuration.
     * </p>
     * 
     * @return The name of the new endpoint configuration.
     */

    public String getEndpointConfigName() {
        return this.endpointConfigName;
    }

    /**
     * <p>
     * The name of the new endpoint configuration.
     * </p>
     * 
     * @param endpointConfigName
     *        The name of the new endpoint configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointRequest withEndpointConfigName(String endpointConfigName) {
        setEndpointConfigName(endpointConfigName);
        return this;
    }

    /**
     * <p>
     * When updating endpoint resources, enables or disables the retention of variant properties, such as the instance
     * count or the variant weight. To retain the variant properties of an endpoint when updating it, set
     * <code>RetainAllVariantProperties</code> to <code>true</code>. To use the variant properties specified in a new
     * <code>EndpointConfig</code> call when updating an endpoint, set <code>RetainAllVariantProperties</code> to
     * <code>false</code>.
     * </p>
     * 
     * @param retainAllVariantProperties
     *        When updating endpoint resources, enables or disables the retention of variant properties, such as the
     *        instance count or the variant weight. To retain the variant properties of an endpoint when updating it,
     *        set <code>RetainAllVariantProperties</code> to <code>true</code>. To use the variant properties specified
     *        in a new <code>EndpointConfig</code> call when updating an endpoint, set
     *        <code>RetainAllVariantProperties</code> to <code>false</code>.
     */

    public void setRetainAllVariantProperties(Boolean retainAllVariantProperties) {
        this.retainAllVariantProperties = retainAllVariantProperties;
    }

    /**
     * <p>
     * When updating endpoint resources, enables or disables the retention of variant properties, such as the instance
     * count or the variant weight. To retain the variant properties of an endpoint when updating it, set
     * <code>RetainAllVariantProperties</code> to <code>true</code>. To use the variant properties specified in a new
     * <code>EndpointConfig</code> call when updating an endpoint, set <code>RetainAllVariantProperties</code> to
     * <code>false</code>.
     * </p>
     * 
     * @return When updating endpoint resources, enables or disables the retention of variant properties, such as the
     *         instance count or the variant weight. To retain the variant properties of an endpoint when updating it,
     *         set <code>RetainAllVariantProperties</code> to <code>true</code>. To use the variant properties specified
     *         in a new <code>EndpointConfig</code> call when updating an endpoint, set
     *         <code>RetainAllVariantProperties</code> to <code>false</code>.
     */

    public Boolean getRetainAllVariantProperties() {
        return this.retainAllVariantProperties;
    }

    /**
     * <p>
     * When updating endpoint resources, enables or disables the retention of variant properties, such as the instance
     * count or the variant weight. To retain the variant properties of an endpoint when updating it, set
     * <code>RetainAllVariantProperties</code> to <code>true</code>. To use the variant properties specified in a new
     * <code>EndpointConfig</code> call when updating an endpoint, set <code>RetainAllVariantProperties</code> to
     * <code>false</code>.
     * </p>
     * 
     * @param retainAllVariantProperties
     *        When updating endpoint resources, enables or disables the retention of variant properties, such as the
     *        instance count or the variant weight. To retain the variant properties of an endpoint when updating it,
     *        set <code>RetainAllVariantProperties</code> to <code>true</code>. To use the variant properties specified
     *        in a new <code>EndpointConfig</code> call when updating an endpoint, set
     *        <code>RetainAllVariantProperties</code> to <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointRequest withRetainAllVariantProperties(Boolean retainAllVariantProperties) {
        setRetainAllVariantProperties(retainAllVariantProperties);
        return this;
    }

    /**
     * <p>
     * When updating endpoint resources, enables or disables the retention of variant properties, such as the instance
     * count or the variant weight. To retain the variant properties of an endpoint when updating it, set
     * <code>RetainAllVariantProperties</code> to <code>true</code>. To use the variant properties specified in a new
     * <code>EndpointConfig</code> call when updating an endpoint, set <code>RetainAllVariantProperties</code> to
     * <code>false</code>.
     * </p>
     * 
     * @return When updating endpoint resources, enables or disables the retention of variant properties, such as the
     *         instance count or the variant weight. To retain the variant properties of an endpoint when updating it,
     *         set <code>RetainAllVariantProperties</code> to <code>true</code>. To use the variant properties specified
     *         in a new <code>EndpointConfig</code> call when updating an endpoint, set
     *         <code>RetainAllVariantProperties</code> to <code>false</code>.
     */

    public Boolean isRetainAllVariantProperties() {
        return this.retainAllVariantProperties;
    }

    /**
     * <p>
     * When you are updating endpoint resources with <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties"
     * >RetainAllVariantProperties</a>, whose value is set to <code>true</code>,
     * <code>ExcludeRetainedVariantProperties</code> specifies the list of type <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_VariantProperty.html">VariantProperty</a> to override
     * with the values provided by <code>EndpointConfig</code>. If you don't specify a value for
     * <code>ExcludeAllVariantProperties</code>, no variant properties are overridden.
     * </p>
     * 
     * @return When you are updating endpoint resources with <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties"
     *         >RetainAllVariantProperties</a>, whose value is set to <code>true</code>,
     *         <code>ExcludeRetainedVariantProperties</code> specifies the list of type <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_VariantProperty.html">VariantProperty</a> to
     *         override with the values provided by <code>EndpointConfig</code>. If you don't specify a value for
     *         <code>ExcludeAllVariantProperties</code>, no variant properties are overridden.
     */

    public java.util.List<VariantProperty> getExcludeRetainedVariantProperties() {
        return excludeRetainedVariantProperties;
    }

    /**
     * <p>
     * When you are updating endpoint resources with <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties"
     * >RetainAllVariantProperties</a>, whose value is set to <code>true</code>,
     * <code>ExcludeRetainedVariantProperties</code> specifies the list of type <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_VariantProperty.html">VariantProperty</a> to override
     * with the values provided by <code>EndpointConfig</code>. If you don't specify a value for
     * <code>ExcludeAllVariantProperties</code>, no variant properties are overridden.
     * </p>
     * 
     * @param excludeRetainedVariantProperties
     *        When you are updating endpoint resources with <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties"
     *        >RetainAllVariantProperties</a>, whose value is set to <code>true</code>,
     *        <code>ExcludeRetainedVariantProperties</code> specifies the list of type <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_VariantProperty.html">VariantProperty</a> to
     *        override with the values provided by <code>EndpointConfig</code>. If you don't specify a value for
     *        <code>ExcludeAllVariantProperties</code>, no variant properties are overridden.
     */

    public void setExcludeRetainedVariantProperties(java.util.Collection<VariantProperty> excludeRetainedVariantProperties) {
        if (excludeRetainedVariantProperties == null) {
            this.excludeRetainedVariantProperties = null;
            return;
        }

        this.excludeRetainedVariantProperties = new java.util.ArrayList<VariantProperty>(excludeRetainedVariantProperties);
    }

    /**
     * <p>
     * When you are updating endpoint resources with <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties"
     * >RetainAllVariantProperties</a>, whose value is set to <code>true</code>,
     * <code>ExcludeRetainedVariantProperties</code> specifies the list of type <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_VariantProperty.html">VariantProperty</a> to override
     * with the values provided by <code>EndpointConfig</code>. If you don't specify a value for
     * <code>ExcludeAllVariantProperties</code>, no variant properties are overridden.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeRetainedVariantProperties(java.util.Collection)} or
     * {@link #withExcludeRetainedVariantProperties(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param excludeRetainedVariantProperties
     *        When you are updating endpoint resources with <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties"
     *        >RetainAllVariantProperties</a>, whose value is set to <code>true</code>,
     *        <code>ExcludeRetainedVariantProperties</code> specifies the list of type <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_VariantProperty.html">VariantProperty</a> to
     *        override with the values provided by <code>EndpointConfig</code>. If you don't specify a value for
     *        <code>ExcludeAllVariantProperties</code>, no variant properties are overridden.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointRequest withExcludeRetainedVariantProperties(VariantProperty... excludeRetainedVariantProperties) {
        if (this.excludeRetainedVariantProperties == null) {
            setExcludeRetainedVariantProperties(new java.util.ArrayList<VariantProperty>(excludeRetainedVariantProperties.length));
        }
        for (VariantProperty ele : excludeRetainedVariantProperties) {
            this.excludeRetainedVariantProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * When you are updating endpoint resources with <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties"
     * >RetainAllVariantProperties</a>, whose value is set to <code>true</code>,
     * <code>ExcludeRetainedVariantProperties</code> specifies the list of type <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_VariantProperty.html">VariantProperty</a> to override
     * with the values provided by <code>EndpointConfig</code>. If you don't specify a value for
     * <code>ExcludeAllVariantProperties</code>, no variant properties are overridden.
     * </p>
     * 
     * @param excludeRetainedVariantProperties
     *        When you are updating endpoint resources with <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties"
     *        >RetainAllVariantProperties</a>, whose value is set to <code>true</code>,
     *        <code>ExcludeRetainedVariantProperties</code> specifies the list of type <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_VariantProperty.html">VariantProperty</a> to
     *        override with the values provided by <code>EndpointConfig</code>. If you don't specify a value for
     *        <code>ExcludeAllVariantProperties</code>, no variant properties are overridden.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointRequest withExcludeRetainedVariantProperties(java.util.Collection<VariantProperty> excludeRetainedVariantProperties) {
        setExcludeRetainedVariantProperties(excludeRetainedVariantProperties);
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getEndpointConfigName() != null)
            sb.append("EndpointConfigName: ").append(getEndpointConfigName()).append(",");
        if (getRetainAllVariantProperties() != null)
            sb.append("RetainAllVariantProperties: ").append(getRetainAllVariantProperties()).append(",");
        if (getExcludeRetainedVariantProperties() != null)
            sb.append("ExcludeRetainedVariantProperties: ").append(getExcludeRetainedVariantProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEndpointRequest == false)
            return false;
        UpdateEndpointRequest other = (UpdateEndpointRequest) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getEndpointConfigName() == null ^ this.getEndpointConfigName() == null)
            return false;
        if (other.getEndpointConfigName() != null && other.getEndpointConfigName().equals(this.getEndpointConfigName()) == false)
            return false;
        if (other.getRetainAllVariantProperties() == null ^ this.getRetainAllVariantProperties() == null)
            return false;
        if (other.getRetainAllVariantProperties() != null && other.getRetainAllVariantProperties().equals(this.getRetainAllVariantProperties()) == false)
            return false;
        if (other.getExcludeRetainedVariantProperties() == null ^ this.getExcludeRetainedVariantProperties() == null)
            return false;
        if (other.getExcludeRetainedVariantProperties() != null
                && other.getExcludeRetainedVariantProperties().equals(this.getExcludeRetainedVariantProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfigName() == null) ? 0 : getEndpointConfigName().hashCode());
        hashCode = prime * hashCode + ((getRetainAllVariantProperties() == null) ? 0 : getRetainAllVariantProperties().hashCode());
        hashCode = prime * hashCode + ((getExcludeRetainedVariantProperties() == null) ? 0 : getExcludeRetainedVariantProperties().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEndpointRequest clone() {
        return (UpdateEndpointRequest) super.clone();
    }

}

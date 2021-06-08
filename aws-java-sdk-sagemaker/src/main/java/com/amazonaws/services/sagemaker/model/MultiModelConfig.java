/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies additional configuration for hosting multi-model endpoints.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MultiModelConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiModelConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to cache models for a multi-model endpoint. By default, multi-model endpoints cache models so that a
     * model does not have to be loaded into memory each time it is invoked. Some use cases do not benefit from model
     * caching. For example, if an endpoint hosts a large number of models that are each invoked infrequently, the
     * endpoint might perform better if you disable model caching. To disable model caching, set the value of this
     * parameter to <code>Disabled</code>.
     * </p>
     */
    private String modelCacheSetting;

    /**
     * <p>
     * Whether to cache models for a multi-model endpoint. By default, multi-model endpoints cache models so that a
     * model does not have to be loaded into memory each time it is invoked. Some use cases do not benefit from model
     * caching. For example, if an endpoint hosts a large number of models that are each invoked infrequently, the
     * endpoint might perform better if you disable model caching. To disable model caching, set the value of this
     * parameter to <code>Disabled</code>.
     * </p>
     * 
     * @param modelCacheSetting
     *        Whether to cache models for a multi-model endpoint. By default, multi-model endpoints cache models so that
     *        a model does not have to be loaded into memory each time it is invoked. Some use cases do not benefit from
     *        model caching. For example, if an endpoint hosts a large number of models that are each invoked
     *        infrequently, the endpoint might perform better if you disable model caching. To disable model caching,
     *        set the value of this parameter to <code>Disabled</code>.
     * @see ModelCacheSetting
     */

    public void setModelCacheSetting(String modelCacheSetting) {
        this.modelCacheSetting = modelCacheSetting;
    }

    /**
     * <p>
     * Whether to cache models for a multi-model endpoint. By default, multi-model endpoints cache models so that a
     * model does not have to be loaded into memory each time it is invoked. Some use cases do not benefit from model
     * caching. For example, if an endpoint hosts a large number of models that are each invoked infrequently, the
     * endpoint might perform better if you disable model caching. To disable model caching, set the value of this
     * parameter to <code>Disabled</code>.
     * </p>
     * 
     * @return Whether to cache models for a multi-model endpoint. By default, multi-model endpoints cache models so
     *         that a model does not have to be loaded into memory each time it is invoked. Some use cases do not
     *         benefit from model caching. For example, if an endpoint hosts a large number of models that are each
     *         invoked infrequently, the endpoint might perform better if you disable model caching. To disable model
     *         caching, set the value of this parameter to <code>Disabled</code>.
     * @see ModelCacheSetting
     */

    public String getModelCacheSetting() {
        return this.modelCacheSetting;
    }

    /**
     * <p>
     * Whether to cache models for a multi-model endpoint. By default, multi-model endpoints cache models so that a
     * model does not have to be loaded into memory each time it is invoked. Some use cases do not benefit from model
     * caching. For example, if an endpoint hosts a large number of models that are each invoked infrequently, the
     * endpoint might perform better if you disable model caching. To disable model caching, set the value of this
     * parameter to <code>Disabled</code>.
     * </p>
     * 
     * @param modelCacheSetting
     *        Whether to cache models for a multi-model endpoint. By default, multi-model endpoints cache models so that
     *        a model does not have to be loaded into memory each time it is invoked. Some use cases do not benefit from
     *        model caching. For example, if an endpoint hosts a large number of models that are each invoked
     *        infrequently, the endpoint might perform better if you disable model caching. To disable model caching,
     *        set the value of this parameter to <code>Disabled</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCacheSetting
     */

    public MultiModelConfig withModelCacheSetting(String modelCacheSetting) {
        setModelCacheSetting(modelCacheSetting);
        return this;
    }

    /**
     * <p>
     * Whether to cache models for a multi-model endpoint. By default, multi-model endpoints cache models so that a
     * model does not have to be loaded into memory each time it is invoked. Some use cases do not benefit from model
     * caching. For example, if an endpoint hosts a large number of models that are each invoked infrequently, the
     * endpoint might perform better if you disable model caching. To disable model caching, set the value of this
     * parameter to <code>Disabled</code>.
     * </p>
     * 
     * @param modelCacheSetting
     *        Whether to cache models for a multi-model endpoint. By default, multi-model endpoints cache models so that
     *        a model does not have to be loaded into memory each time it is invoked. Some use cases do not benefit from
     *        model caching. For example, if an endpoint hosts a large number of models that are each invoked
     *        infrequently, the endpoint might perform better if you disable model caching. To disable model caching,
     *        set the value of this parameter to <code>Disabled</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCacheSetting
     */

    public MultiModelConfig withModelCacheSetting(ModelCacheSetting modelCacheSetting) {
        this.modelCacheSetting = modelCacheSetting.toString();
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
        if (getModelCacheSetting() != null)
            sb.append("ModelCacheSetting: ").append(getModelCacheSetting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiModelConfig == false)
            return false;
        MultiModelConfig other = (MultiModelConfig) obj;
        if (other.getModelCacheSetting() == null ^ this.getModelCacheSetting() == null)
            return false;
        if (other.getModelCacheSetting() != null && other.getModelCacheSetting().equals(this.getModelCacheSetting()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelCacheSetting() == null) ? 0 : getModelCacheSetting().hashCode());
        return hashCode;
    }

    @Override
    public MultiModelConfig clone() {
        try {
            return (MultiModelConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MultiModelConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

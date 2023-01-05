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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateObservabilityConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateObservabilityConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the observability configuration. When you use it for the first time in an Amazon Web Services Region,
     * App Runner creates revision number <code>1</code> of this name. When you use the same name in subsequent calls,
     * App Runner creates incremental revisions of the configuration.
     * </p>
     * <note>
     * <p>
     * The name <code>DefaultConfiguration</code> is reserved. You can't use it to create a new observability
     * configuration, and you can't create a revision of it.
     * </p>
     * <p>
     * When you want to use your own observability configuration for your App Runner service, <i>create a configuration
     * with a different name</i>, and then provide it when you create or update your service.
     * </p>
     * </note>
     */
    private String observabilityConfigurationName;
    /**
     * <p>
     * The configuration of the tracing feature within this observability configuration. If you don't specify it, App
     * Runner doesn't enable tracing.
     * </p>
     */
    private TraceConfiguration traceConfiguration;
    /**
     * <p>
     * A list of metadata items that you can associate with your observability configuration resource. A tag is a
     * key-value pair.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A name for the observability configuration. When you use it for the first time in an Amazon Web Services Region,
     * App Runner creates revision number <code>1</code> of this name. When you use the same name in subsequent calls,
     * App Runner creates incremental revisions of the configuration.
     * </p>
     * <note>
     * <p>
     * The name <code>DefaultConfiguration</code> is reserved. You can't use it to create a new observability
     * configuration, and you can't create a revision of it.
     * </p>
     * <p>
     * When you want to use your own observability configuration for your App Runner service, <i>create a configuration
     * with a different name</i>, and then provide it when you create or update your service.
     * </p>
     * </note>
     * 
     * @param observabilityConfigurationName
     *        A name for the observability configuration. When you use it for the first time in an Amazon Web Services
     *        Region, App Runner creates revision number <code>1</code> of this name. When you use the same name in
     *        subsequent calls, App Runner creates incremental revisions of the configuration.</p> <note>
     *        <p>
     *        The name <code>DefaultConfiguration</code> is reserved. You can't use it to create a new observability
     *        configuration, and you can't create a revision of it.
     *        </p>
     *        <p>
     *        When you want to use your own observability configuration for your App Runner service, <i>create a
     *        configuration with a different name</i>, and then provide it when you create or update your service.
     *        </p>
     */

    public void setObservabilityConfigurationName(String observabilityConfigurationName) {
        this.observabilityConfigurationName = observabilityConfigurationName;
    }

    /**
     * <p>
     * A name for the observability configuration. When you use it for the first time in an Amazon Web Services Region,
     * App Runner creates revision number <code>1</code> of this name. When you use the same name in subsequent calls,
     * App Runner creates incremental revisions of the configuration.
     * </p>
     * <note>
     * <p>
     * The name <code>DefaultConfiguration</code> is reserved. You can't use it to create a new observability
     * configuration, and you can't create a revision of it.
     * </p>
     * <p>
     * When you want to use your own observability configuration for your App Runner service, <i>create a configuration
     * with a different name</i>, and then provide it when you create or update your service.
     * </p>
     * </note>
     * 
     * @return A name for the observability configuration. When you use it for the first time in an Amazon Web Services
     *         Region, App Runner creates revision number <code>1</code> of this name. When you use the same name in
     *         subsequent calls, App Runner creates incremental revisions of the configuration.</p> <note>
     *         <p>
     *         The name <code>DefaultConfiguration</code> is reserved. You can't use it to create a new observability
     *         configuration, and you can't create a revision of it.
     *         </p>
     *         <p>
     *         When you want to use your own observability configuration for your App Runner service, <i>create a
     *         configuration with a different name</i>, and then provide it when you create or update your service.
     *         </p>
     */

    public String getObservabilityConfigurationName() {
        return this.observabilityConfigurationName;
    }

    /**
     * <p>
     * A name for the observability configuration. When you use it for the first time in an Amazon Web Services Region,
     * App Runner creates revision number <code>1</code> of this name. When you use the same name in subsequent calls,
     * App Runner creates incremental revisions of the configuration.
     * </p>
     * <note>
     * <p>
     * The name <code>DefaultConfiguration</code> is reserved. You can't use it to create a new observability
     * configuration, and you can't create a revision of it.
     * </p>
     * <p>
     * When you want to use your own observability configuration for your App Runner service, <i>create a configuration
     * with a different name</i>, and then provide it when you create or update your service.
     * </p>
     * </note>
     * 
     * @param observabilityConfigurationName
     *        A name for the observability configuration. When you use it for the first time in an Amazon Web Services
     *        Region, App Runner creates revision number <code>1</code> of this name. When you use the same name in
     *        subsequent calls, App Runner creates incremental revisions of the configuration.</p> <note>
     *        <p>
     *        The name <code>DefaultConfiguration</code> is reserved. You can't use it to create a new observability
     *        configuration, and you can't create a revision of it.
     *        </p>
     *        <p>
     *        When you want to use your own observability configuration for your App Runner service, <i>create a
     *        configuration with a different name</i>, and then provide it when you create or update your service.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateObservabilityConfigurationRequest withObservabilityConfigurationName(String observabilityConfigurationName) {
        setObservabilityConfigurationName(observabilityConfigurationName);
        return this;
    }

    /**
     * <p>
     * The configuration of the tracing feature within this observability configuration. If you don't specify it, App
     * Runner doesn't enable tracing.
     * </p>
     * 
     * @param traceConfiguration
     *        The configuration of the tracing feature within this observability configuration. If you don't specify it,
     *        App Runner doesn't enable tracing.
     */

    public void setTraceConfiguration(TraceConfiguration traceConfiguration) {
        this.traceConfiguration = traceConfiguration;
    }

    /**
     * <p>
     * The configuration of the tracing feature within this observability configuration. If you don't specify it, App
     * Runner doesn't enable tracing.
     * </p>
     * 
     * @return The configuration of the tracing feature within this observability configuration. If you don't specify
     *         it, App Runner doesn't enable tracing.
     */

    public TraceConfiguration getTraceConfiguration() {
        return this.traceConfiguration;
    }

    /**
     * <p>
     * The configuration of the tracing feature within this observability configuration. If you don't specify it, App
     * Runner doesn't enable tracing.
     * </p>
     * 
     * @param traceConfiguration
     *        The configuration of the tracing feature within this observability configuration. If you don't specify it,
     *        App Runner doesn't enable tracing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateObservabilityConfigurationRequest withTraceConfiguration(TraceConfiguration traceConfiguration) {
        setTraceConfiguration(traceConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of metadata items that you can associate with your observability configuration resource. A tag is a
     * key-value pair.
     * </p>
     * 
     * @return A list of metadata items that you can associate with your observability configuration resource. A tag is
     *         a key-value pair.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of metadata items that you can associate with your observability configuration resource. A tag is a
     * key-value pair.
     * </p>
     * 
     * @param tags
     *        A list of metadata items that you can associate with your observability configuration resource. A tag is a
     *        key-value pair.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of metadata items that you can associate with your observability configuration resource. A tag is a
     * key-value pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of metadata items that you can associate with your observability configuration resource. A tag is a
     *        key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateObservabilityConfigurationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of metadata items that you can associate with your observability configuration resource. A tag is a
     * key-value pair.
     * </p>
     * 
     * @param tags
     *        A list of metadata items that you can associate with your observability configuration resource. A tag is a
     *        key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateObservabilityConfigurationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getObservabilityConfigurationName() != null)
            sb.append("ObservabilityConfigurationName: ").append(getObservabilityConfigurationName()).append(",");
        if (getTraceConfiguration() != null)
            sb.append("TraceConfiguration: ").append(getTraceConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateObservabilityConfigurationRequest == false)
            return false;
        CreateObservabilityConfigurationRequest other = (CreateObservabilityConfigurationRequest) obj;
        if (other.getObservabilityConfigurationName() == null ^ this.getObservabilityConfigurationName() == null)
            return false;
        if (other.getObservabilityConfigurationName() != null
                && other.getObservabilityConfigurationName().equals(this.getObservabilityConfigurationName()) == false)
            return false;
        if (other.getTraceConfiguration() == null ^ this.getTraceConfiguration() == null)
            return false;
        if (other.getTraceConfiguration() != null && other.getTraceConfiguration().equals(this.getTraceConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObservabilityConfigurationName() == null) ? 0 : getObservabilityConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getTraceConfiguration() == null) ? 0 : getTraceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateObservabilityConfigurationRequest clone() {
        return (CreateObservabilityConfigurationRequest) super.clone();
    }

}

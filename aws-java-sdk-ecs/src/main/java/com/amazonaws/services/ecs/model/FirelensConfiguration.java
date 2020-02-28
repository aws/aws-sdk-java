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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The FireLens configuration for the container. This is used to specify and configure a log router for container logs.
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html">Custom Log Routing</a> in the
 * <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/FirelensConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirelensConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The log router to use. The valid values are <code>fluentd</code> or <code>fluentbit</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The options to use when configuring the log router. This field is optional and can be used to specify a custom
     * configuration file or to add additional metadata, such as the task, task definition, cluster, and container
     * instance details to the log event. If specified, the syntax to use is
     * <code>"options":{"enable-ecs-log-metadata":"true|false","config-file-type:"s3|file","config-file-value":"arn:aws:s3:::mybucket/fluent.conf|filepath"}</code>
     * . For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html#firelens-taskdef">Creating
     * a Task Definition that Uses a FireLens Configuration</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> options;

    /**
     * <p>
     * The log router to use. The valid values are <code>fluentd</code> or <code>fluentbit</code>.
     * </p>
     * 
     * @param type
     *        The log router to use. The valid values are <code>fluentd</code> or <code>fluentbit</code>.
     * @see FirelensConfigurationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The log router to use. The valid values are <code>fluentd</code> or <code>fluentbit</code>.
     * </p>
     * 
     * @return The log router to use. The valid values are <code>fluentd</code> or <code>fluentbit</code>.
     * @see FirelensConfigurationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The log router to use. The valid values are <code>fluentd</code> or <code>fluentbit</code>.
     * </p>
     * 
     * @param type
     *        The log router to use. The valid values are <code>fluentd</code> or <code>fluentbit</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirelensConfigurationType
     */

    public FirelensConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The log router to use. The valid values are <code>fluentd</code> or <code>fluentbit</code>.
     * </p>
     * 
     * @param type
     *        The log router to use. The valid values are <code>fluentd</code> or <code>fluentbit</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirelensConfigurationType
     */

    public FirelensConfiguration withType(FirelensConfigurationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The options to use when configuring the log router. This field is optional and can be used to specify a custom
     * configuration file or to add additional metadata, such as the task, task definition, cluster, and container
     * instance details to the log event. If specified, the syntax to use is
     * <code>"options":{"enable-ecs-log-metadata":"true|false","config-file-type:"s3|file","config-file-value":"arn:aws:s3:::mybucket/fluent.conf|filepath"}</code>
     * . For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html#firelens-taskdef">Creating
     * a Task Definition that Uses a FireLens Configuration</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * 
     * @return The options to use when configuring the log router. This field is optional and can be used to specify a
     *         custom configuration file or to add additional metadata, such as the task, task definition, cluster, and
     *         container instance details to the log event. If specified, the syntax to use is
     *         <code>"options":{"enable-ecs-log-metadata":"true|false","config-file-type:"s3|file","config-file-value":"arn:aws:s3:::mybucket/fluent.conf|filepath"}</code>
     *         . For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html#firelens-taskdef"
     *         >Creating a Task Definition that Uses a FireLens Configuration</a> in the <i>Amazon Elastic Container
     *         Service Developer Guide</i>.
     */

    public java.util.Map<String, String> getOptions() {
        return options;
    }

    /**
     * <p>
     * The options to use when configuring the log router. This field is optional and can be used to specify a custom
     * configuration file or to add additional metadata, such as the task, task definition, cluster, and container
     * instance details to the log event. If specified, the syntax to use is
     * <code>"options":{"enable-ecs-log-metadata":"true|false","config-file-type:"s3|file","config-file-value":"arn:aws:s3:::mybucket/fluent.conf|filepath"}</code>
     * . For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html#firelens-taskdef">Creating
     * a Task Definition that Uses a FireLens Configuration</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param options
     *        The options to use when configuring the log router. This field is optional and can be used to specify a
     *        custom configuration file or to add additional metadata, such as the task, task definition, cluster, and
     *        container instance details to the log event. If specified, the syntax to use is
     *        <code>"options":{"enable-ecs-log-metadata":"true|false","config-file-type:"s3|file","config-file-value":"arn:aws:s3:::mybucket/fluent.conf|filepath"}</code>
     *        . For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html#firelens-taskdef"
     *        >Creating a Task Definition that Uses a FireLens Configuration</a> in the <i>Amazon Elastic Container
     *        Service Developer Guide</i>.
     */

    public void setOptions(java.util.Map<String, String> options) {
        this.options = options;
    }

    /**
     * <p>
     * The options to use when configuring the log router. This field is optional and can be used to specify a custom
     * configuration file or to add additional metadata, such as the task, task definition, cluster, and container
     * instance details to the log event. If specified, the syntax to use is
     * <code>"options":{"enable-ecs-log-metadata":"true|false","config-file-type:"s3|file","config-file-value":"arn:aws:s3:::mybucket/fluent.conf|filepath"}</code>
     * . For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html#firelens-taskdef">Creating
     * a Task Definition that Uses a FireLens Configuration</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param options
     *        The options to use when configuring the log router. This field is optional and can be used to specify a
     *        custom configuration file or to add additional metadata, such as the task, task definition, cluster, and
     *        container instance details to the log event. If specified, the syntax to use is
     *        <code>"options":{"enable-ecs-log-metadata":"true|false","config-file-type:"s3|file","config-file-value":"arn:aws:s3:::mybucket/fluent.conf|filepath"}</code>
     *        . For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html#firelens-taskdef"
     *        >Creating a Task Definition that Uses a FireLens Configuration</a> in the <i>Amazon Elastic Container
     *        Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirelensConfiguration withOptions(java.util.Map<String, String> options) {
        setOptions(options);
        return this;
    }

    /**
     * Add a single Options entry
     *
     * @see FirelensConfiguration#withOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public FirelensConfiguration addOptionsEntry(String key, String value) {
        if (null == this.options) {
            this.options = new java.util.HashMap<String, String>();
        }
        if (this.options.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.options.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Options.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirelensConfiguration clearOptionsEntries() {
        this.options = null;
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirelensConfiguration == false)
            return false;
        FirelensConfiguration other = (FirelensConfiguration) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public FirelensConfiguration clone() {
        try {
            return (FirelensConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.FirelensConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

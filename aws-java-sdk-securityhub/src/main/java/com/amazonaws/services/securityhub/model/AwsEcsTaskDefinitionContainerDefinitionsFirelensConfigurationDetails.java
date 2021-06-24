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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The FireLens configuration for the container. The configuration specifies and configures a log router for container
 * logs.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The options to use to configure the log router.
     * </p>
     * <p>
     * The valid option keys are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>enable-ecs-log-metadata</code>. The value can be <code>true</code> or <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>config-file-type</code>. The value can be <code>s3</code> or <code>file</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>config-file-value</code>. The value is either an S3 ARN or a file path.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> options;
    /**
     * <p>
     * The log router to use.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The options to use to configure the log router.
     * </p>
     * <p>
     * The valid option keys are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>enable-ecs-log-metadata</code>. The value can be <code>true</code> or <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>config-file-type</code>. The value can be <code>s3</code> or <code>file</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>config-file-value</code>. The value is either an S3 ARN or a file path.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The options to use to configure the log router.</p>
     *         <p>
     *         The valid option keys are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>enable-ecs-log-metadata</code>. The value can be <code>true</code> or <code>false</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>config-file-type</code>. The value can be <code>s3</code> or <code>file</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>config-file-value</code>. The value is either an S3 ARN or a file path.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getOptions() {
        return options;
    }

    /**
     * <p>
     * The options to use to configure the log router.
     * </p>
     * <p>
     * The valid option keys are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>enable-ecs-log-metadata</code>. The value can be <code>true</code> or <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>config-file-type</code>. The value can be <code>s3</code> or <code>file</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>config-file-value</code>. The value is either an S3 ARN or a file path.
     * </p>
     * </li>
     * </ul>
     * 
     * @param options
     *        The options to use to configure the log router.</p>
     *        <p>
     *        The valid option keys are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>enable-ecs-log-metadata</code>. The value can be <code>true</code> or <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>config-file-type</code>. The value can be <code>s3</code> or <code>file</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>config-file-value</code>. The value is either an S3 ARN or a file path.
     *        </p>
     *        </li>
     */

    public void setOptions(java.util.Map<String, String> options) {
        this.options = options;
    }

    /**
     * <p>
     * The options to use to configure the log router.
     * </p>
     * <p>
     * The valid option keys are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>enable-ecs-log-metadata</code>. The value can be <code>true</code> or <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>config-file-type</code>. The value can be <code>s3</code> or <code>file</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>config-file-value</code>. The value is either an S3 ARN or a file path.
     * </p>
     * </li>
     * </ul>
     * 
     * @param options
     *        The options to use to configure the log router.</p>
     *        <p>
     *        The valid option keys are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>enable-ecs-log-metadata</code>. The value can be <code>true</code> or <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>config-file-type</code>. The value can be <code>s3</code> or <code>file</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>config-file-value</code>. The value is either an S3 ARN or a file path.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails withOptions(java.util.Map<String, String> options) {
        setOptions(options);
        return this;
    }

    /**
     * Add a single Options entry
     *
     * @see AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails#withOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails addOptionsEntry(String key, String value) {
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

    public AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails clearOptionsEntries() {
        this.options = null;
        return this;
    }

    /**
     * <p>
     * The log router to use.
     * </p>
     * 
     * @param type
     *        The log router to use.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The log router to use.
     * </p>
     * 
     * @return The log router to use.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The log router to use.
     * </p>
     * 
     * @param type
     *        The log router to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails withType(String type) {
        setType(type);
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
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails == false)
            return false;
        AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails other = (AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails) obj;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails clone() {
        try {
            return (AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetailsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}

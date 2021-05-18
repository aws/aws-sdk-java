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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration that AWS App Runner uses to build and run an App Runner service from a source code
 * repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CodeConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source of the App Runner configuration. Values are interpreted as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPOSITORY</code> – App Runner reads configuration values from the <code>apprunner.yaml</code> file in the
     * source code repository and ignores <code>CodeConfigurationValues</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>API</code> – App Runner uses configuration values provided in <code>CodeConfigurationValues</code> and
     * ignores the <code>apprunner.yaml</code> file in the source code repository.
     * </p>
     * </li>
     * </ul>
     */
    private String configurationSource;
    /**
     * <p>
     * The basic configuration for building and running the App Runner service. Use it to quickly launch an App Runner
     * service without providing a <code>apprunner.yaml</code> file in the source code repository (or ignoring the file
     * if it exists).
     * </p>
     */
    private CodeConfigurationValues codeConfigurationValues;

    /**
     * <p>
     * The source of the App Runner configuration. Values are interpreted as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPOSITORY</code> – App Runner reads configuration values from the <code>apprunner.yaml</code> file in the
     * source code repository and ignores <code>CodeConfigurationValues</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>API</code> – App Runner uses configuration values provided in <code>CodeConfigurationValues</code> and
     * ignores the <code>apprunner.yaml</code> file in the source code repository.
     * </p>
     * </li>
     * </ul>
     * 
     * @param configurationSource
     *        The source of the App Runner configuration. Values are interpreted as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPOSITORY</code> – App Runner reads configuration values from the <code>apprunner.yaml</code> file
     *        in the source code repository and ignores <code>CodeConfigurationValues</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>API</code> – App Runner uses configuration values provided in <code>CodeConfigurationValues</code>
     *        and ignores the <code>apprunner.yaml</code> file in the source code repository.
     *        </p>
     *        </li>
     * @see ConfigurationSource
     */

    public void setConfigurationSource(String configurationSource) {
        this.configurationSource = configurationSource;
    }

    /**
     * <p>
     * The source of the App Runner configuration. Values are interpreted as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPOSITORY</code> – App Runner reads configuration values from the <code>apprunner.yaml</code> file in the
     * source code repository and ignores <code>CodeConfigurationValues</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>API</code> – App Runner uses configuration values provided in <code>CodeConfigurationValues</code> and
     * ignores the <code>apprunner.yaml</code> file in the source code repository.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The source of the App Runner configuration. Values are interpreted as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>REPOSITORY</code> – App Runner reads configuration values from the <code>apprunner.yaml</code> file
     *         in the source code repository and ignores <code>CodeConfigurationValues</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>API</code> – App Runner uses configuration values provided in <code>CodeConfigurationValues</code>
     *         and ignores the <code>apprunner.yaml</code> file in the source code repository.
     *         </p>
     *         </li>
     * @see ConfigurationSource
     */

    public String getConfigurationSource() {
        return this.configurationSource;
    }

    /**
     * <p>
     * The source of the App Runner configuration. Values are interpreted as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPOSITORY</code> – App Runner reads configuration values from the <code>apprunner.yaml</code> file in the
     * source code repository and ignores <code>CodeConfigurationValues</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>API</code> – App Runner uses configuration values provided in <code>CodeConfigurationValues</code> and
     * ignores the <code>apprunner.yaml</code> file in the source code repository.
     * </p>
     * </li>
     * </ul>
     * 
     * @param configurationSource
     *        The source of the App Runner configuration. Values are interpreted as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPOSITORY</code> – App Runner reads configuration values from the <code>apprunner.yaml</code> file
     *        in the source code repository and ignores <code>CodeConfigurationValues</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>API</code> – App Runner uses configuration values provided in <code>CodeConfigurationValues</code>
     *        and ignores the <code>apprunner.yaml</code> file in the source code repository.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationSource
     */

    public CodeConfiguration withConfigurationSource(String configurationSource) {
        setConfigurationSource(configurationSource);
        return this;
    }

    /**
     * <p>
     * The source of the App Runner configuration. Values are interpreted as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPOSITORY</code> – App Runner reads configuration values from the <code>apprunner.yaml</code> file in the
     * source code repository and ignores <code>CodeConfigurationValues</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>API</code> – App Runner uses configuration values provided in <code>CodeConfigurationValues</code> and
     * ignores the <code>apprunner.yaml</code> file in the source code repository.
     * </p>
     * </li>
     * </ul>
     * 
     * @param configurationSource
     *        The source of the App Runner configuration. Values are interpreted as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPOSITORY</code> – App Runner reads configuration values from the <code>apprunner.yaml</code> file
     *        in the source code repository and ignores <code>CodeConfigurationValues</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>API</code> – App Runner uses configuration values provided in <code>CodeConfigurationValues</code>
     *        and ignores the <code>apprunner.yaml</code> file in the source code repository.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationSource
     */

    public CodeConfiguration withConfigurationSource(ConfigurationSource configurationSource) {
        this.configurationSource = configurationSource.toString();
        return this;
    }

    /**
     * <p>
     * The basic configuration for building and running the App Runner service. Use it to quickly launch an App Runner
     * service without providing a <code>apprunner.yaml</code> file in the source code repository (or ignoring the file
     * if it exists).
     * </p>
     * 
     * @param codeConfigurationValues
     *        The basic configuration for building and running the App Runner service. Use it to quickly launch an App
     *        Runner service without providing a <code>apprunner.yaml</code> file in the source code repository (or
     *        ignoring the file if it exists).
     */

    public void setCodeConfigurationValues(CodeConfigurationValues codeConfigurationValues) {
        this.codeConfigurationValues = codeConfigurationValues;
    }

    /**
     * <p>
     * The basic configuration for building and running the App Runner service. Use it to quickly launch an App Runner
     * service without providing a <code>apprunner.yaml</code> file in the source code repository (or ignoring the file
     * if it exists).
     * </p>
     * 
     * @return The basic configuration for building and running the App Runner service. Use it to quickly launch an App
     *         Runner service without providing a <code>apprunner.yaml</code> file in the source code repository (or
     *         ignoring the file if it exists).
     */

    public CodeConfigurationValues getCodeConfigurationValues() {
        return this.codeConfigurationValues;
    }

    /**
     * <p>
     * The basic configuration for building and running the App Runner service. Use it to quickly launch an App Runner
     * service without providing a <code>apprunner.yaml</code> file in the source code repository (or ignoring the file
     * if it exists).
     * </p>
     * 
     * @param codeConfigurationValues
     *        The basic configuration for building and running the App Runner service. Use it to quickly launch an App
     *        Runner service without providing a <code>apprunner.yaml</code> file in the source code repository (or
     *        ignoring the file if it exists).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeConfiguration withCodeConfigurationValues(CodeConfigurationValues codeConfigurationValues) {
        setCodeConfigurationValues(codeConfigurationValues);
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
        if (getConfigurationSource() != null)
            sb.append("ConfigurationSource: ").append(getConfigurationSource()).append(",");
        if (getCodeConfigurationValues() != null)
            sb.append("CodeConfigurationValues: ").append(getCodeConfigurationValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeConfiguration == false)
            return false;
        CodeConfiguration other = (CodeConfiguration) obj;
        if (other.getConfigurationSource() == null ^ this.getConfigurationSource() == null)
            return false;
        if (other.getConfigurationSource() != null && other.getConfigurationSource().equals(this.getConfigurationSource()) == false)
            return false;
        if (other.getCodeConfigurationValues() == null ^ this.getCodeConfigurationValues() == null)
            return false;
        if (other.getCodeConfigurationValues() != null && other.getCodeConfigurationValues().equals(this.getCodeConfigurationValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSource() == null) ? 0 : getConfigurationSource().hashCode());
        hashCode = prime * hashCode + ((getCodeConfigurationValues() == null) ? 0 : getCodeConfigurationValues().hashCode());
        return hashCode;
    }

    @Override
    public CodeConfiguration clone() {
        try {
            return (CodeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.CodeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

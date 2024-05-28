/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration information of the external data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ExternalSourceConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExternalSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration information of the external data source.
     * </p>
     */
    private Configuration configuration;
    /**
     * <p>
     * The type of the external data source.
     * </p>
     */
    private String source;

    /**
     * <p>
     * The configuration information of the external data source.
     * </p>
     * 
     * @param configuration
     *        The configuration information of the external data source.
     */

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration information of the external data source.
     * </p>
     * 
     * @return The configuration information of the external data source.
     */

    public Configuration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration information of the external data source.
     * </p>
     * 
     * @param configuration
     *        The configuration information of the external data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalSourceConfiguration withConfiguration(Configuration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The type of the external data source.
     * </p>
     * 
     * @param source
     *        The type of the external data source.
     * @see ExternalSource
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The type of the external data source.
     * </p>
     * 
     * @return The type of the external data source.
     * @see ExternalSource
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The type of the external data source.
     * </p>
     * 
     * @param source
     *        The type of the external data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExternalSource
     */

    public ExternalSourceConfiguration withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The type of the external data source.
     * </p>
     * 
     * @param source
     *        The type of the external data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExternalSource
     */

    public ExternalSourceConfiguration withSource(ExternalSource source) {
        this.source = source.toString();
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExternalSourceConfiguration == false)
            return false;
        ExternalSourceConfiguration other = (ExternalSourceConfiguration) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public ExternalSourceConfiguration clone() {
        try {
            return (ExternalSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.ExternalSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

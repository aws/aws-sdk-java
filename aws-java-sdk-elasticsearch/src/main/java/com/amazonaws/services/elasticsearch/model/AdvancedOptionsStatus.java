/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Status of the advanced options for the specified Elasticsearch domain. Currently, the following advanced options are
 * available:
 * </p>
 * <ul>
 * <li>Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring access
 * to individual sub-resources. By default, the value is <code>true</code>. See <a href=
 * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
 * target="_blank">Configuration Advanced Options</a> for more information.</li>
 * <li>Option to specify the percentage of heap space that is allocated to field data. By default, this setting is
 * unbounded.</li>
 * </ul>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
 * >Configuring Advanced Options</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdvancedOptionsStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the status of advanced options for the specified Elasticsearch domain.
     * </p>
     */
    private java.util.Map<String, String> options;
    /**
     * <p>
     * Specifies the status of <code>OptionStatus</code> for advanced options for the specified Elasticsearch domain.
     * </p>
     */
    private OptionStatus status;

    /**
     * <p>
     * Specifies the status of advanced options for the specified Elasticsearch domain.
     * </p>
     * 
     * @return Specifies the status of advanced options for the specified Elasticsearch domain.
     */

    public java.util.Map<String, String> getOptions() {
        return options;
    }

    /**
     * <p>
     * Specifies the status of advanced options for the specified Elasticsearch domain.
     * </p>
     * 
     * @param options
     *        Specifies the status of advanced options for the specified Elasticsearch domain.
     */

    public void setOptions(java.util.Map<String, String> options) {
        this.options = options;
    }

    /**
     * <p>
     * Specifies the status of advanced options for the specified Elasticsearch domain.
     * </p>
     * 
     * @param options
     *        Specifies the status of advanced options for the specified Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedOptionsStatus withOptions(java.util.Map<String, String> options) {
        setOptions(options);
        return this;
    }

    public AdvancedOptionsStatus addOptionsEntry(String key, String value) {
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

    public AdvancedOptionsStatus clearOptionsEntries() {
        this.options = null;
        return this;
    }

    /**
     * <p>
     * Specifies the status of <code>OptionStatus</code> for advanced options for the specified Elasticsearch domain.
     * </p>
     * 
     * @param status
     *        Specifies the status of <code>OptionStatus</code> for advanced options for the specified Elasticsearch
     *        domain.
     */

    public void setStatus(OptionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of <code>OptionStatus</code> for advanced options for the specified Elasticsearch domain.
     * </p>
     * 
     * @return Specifies the status of <code>OptionStatus</code> for advanced options for the specified Elasticsearch
     *         domain.
     */

    public OptionStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the status of <code>OptionStatus</code> for advanced options for the specified Elasticsearch domain.
     * </p>
     * 
     * @param status
     *        Specifies the status of <code>OptionStatus</code> for advanced options for the specified Elasticsearch
     *        domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedOptionsStatus withStatus(OptionStatus status) {
        setStatus(status);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdvancedOptionsStatus == false)
            return false;
        AdvancedOptionsStatus other = (AdvancedOptionsStatus) obj;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AdvancedOptionsStatus clone() {
        try {
            return (AdvancedOptionsStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.AdvancedOptionsStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

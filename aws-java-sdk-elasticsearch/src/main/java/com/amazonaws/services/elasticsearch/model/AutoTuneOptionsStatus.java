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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the status of Auto-Tune options for the specified Elasticsearch domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoTuneOptionsStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies Auto-Tune options for the specified Elasticsearch domain.
     * </p>
     */
    private AutoTuneOptions options;
    /**
     * <p>
     * Specifies Status of the Auto-Tune options for the specified Elasticsearch domain.
     * </p>
     */
    private AutoTuneStatus status;

    /**
     * <p>
     * Specifies Auto-Tune options for the specified Elasticsearch domain.
     * </p>
     * 
     * @param options
     *        Specifies Auto-Tune options for the specified Elasticsearch domain.
     */

    public void setOptions(AutoTuneOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * Specifies Auto-Tune options for the specified Elasticsearch domain.
     * </p>
     * 
     * @return Specifies Auto-Tune options for the specified Elasticsearch domain.
     */

    public AutoTuneOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * Specifies Auto-Tune options for the specified Elasticsearch domain.
     * </p>
     * 
     * @param options
     *        Specifies Auto-Tune options for the specified Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoTuneOptionsStatus withOptions(AutoTuneOptions options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * Specifies Status of the Auto-Tune options for the specified Elasticsearch domain.
     * </p>
     * 
     * @param status
     *        Specifies Status of the Auto-Tune options for the specified Elasticsearch domain.
     */

    public void setStatus(AutoTuneStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies Status of the Auto-Tune options for the specified Elasticsearch domain.
     * </p>
     * 
     * @return Specifies Status of the Auto-Tune options for the specified Elasticsearch domain.
     */

    public AutoTuneStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies Status of the Auto-Tune options for the specified Elasticsearch domain.
     * </p>
     * 
     * @param status
     *        Specifies Status of the Auto-Tune options for the specified Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoTuneOptionsStatus withStatus(AutoTuneStatus status) {
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

        if (obj instanceof AutoTuneOptionsStatus == false)
            return false;
        AutoTuneOptionsStatus other = (AutoTuneOptionsStatus) obj;
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
    public AutoTuneOptionsStatus clone() {
        try {
            return (AutoTuneOptionsStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.AutoTuneOptionsStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

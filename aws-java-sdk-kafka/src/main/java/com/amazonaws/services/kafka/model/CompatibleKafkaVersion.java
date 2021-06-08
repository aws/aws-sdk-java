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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Contains source Kafka versions and compatible target Kafka versions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CompatibleKafkaVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompatibleKafkaVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Kafka version.
     * </p>
     */
    private String sourceVersion;
    /**
     * <p>
     * A list of Kafka versions.
     * </p>
     */
    private java.util.List<String> targetVersions;

    /**
     * <p>
     * A Kafka version.
     * </p>
     * 
     * @param sourceVersion
     *        <p>
     *        A Kafka version.
     *        </p>
     */

    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * A Kafka version.
     * </p>
     * 
     * @return <p>
     *         A Kafka version.
     *         </p>
     */

    public String getSourceVersion() {
        return this.sourceVersion;
    }

    /**
     * <p>
     * A Kafka version.
     * </p>
     * 
     * @param sourceVersion
     *        <p>
     *        A Kafka version.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompatibleKafkaVersion withSourceVersion(String sourceVersion) {
        setSourceVersion(sourceVersion);
        return this;
    }

    /**
     * <p>
     * A list of Kafka versions.
     * </p>
     * 
     * @return <p>
     *         A list of Kafka versions.
     *         </p>
     */

    public java.util.List<String> getTargetVersions() {
        return targetVersions;
    }

    /**
     * <p>
     * A list of Kafka versions.
     * </p>
     * 
     * @param targetVersions
     *        <p>
     *        A list of Kafka versions.
     *        </p>
     */

    public void setTargetVersions(java.util.Collection<String> targetVersions) {
        if (targetVersions == null) {
            this.targetVersions = null;
            return;
        }

        this.targetVersions = new java.util.ArrayList<String>(targetVersions);
    }

    /**
     * <p>
     * A list of Kafka versions.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetVersions(java.util.Collection)} or {@link #withTargetVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param targetVersions
     *        <p>
     *        A list of Kafka versions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompatibleKafkaVersion withTargetVersions(String... targetVersions) {
        if (this.targetVersions == null) {
            setTargetVersions(new java.util.ArrayList<String>(targetVersions.length));
        }
        for (String ele : targetVersions) {
            this.targetVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Kafka versions.
     * </p>
     * 
     * @param targetVersions
     *        <p>
     *        A list of Kafka versions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompatibleKafkaVersion withTargetVersions(java.util.Collection<String> targetVersions) {
        setTargetVersions(targetVersions);
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
        if (getSourceVersion() != null)
            sb.append("SourceVersion: ").append(getSourceVersion()).append(",");
        if (getTargetVersions() != null)
            sb.append("TargetVersions: ").append(getTargetVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompatibleKafkaVersion == false)
            return false;
        CompatibleKafkaVersion other = (CompatibleKafkaVersion) obj;
        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null && other.getSourceVersion().equals(this.getSourceVersion()) == false)
            return false;
        if (other.getTargetVersions() == null ^ this.getTargetVersions() == null)
            return false;
        if (other.getTargetVersions() != null && other.getTargetVersions().equals(this.getTargetVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        hashCode = prime * hashCode + ((getTargetVersions() == null) ? 0 : getTargetVersions().hashCode());
        return hashCode;
    }

    @Override
    public CompatibleKafkaVersion clone() {
        try {
            return (CompatibleKafkaVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.CompatibleKafkaVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

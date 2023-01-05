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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata about the detection source that generates proactive anomalies. The anomaly is detected using analysis of the
 * metric data&#x2028; over a period of time
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/AnomalySourceMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalySourceMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source of the anomaly.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The name of the anomaly's resource.
     * </p>
     */
    private String sourceResourceName;
    /**
     * <p>
     * The anomaly's resource type.
     * </p>
     */
    private String sourceResourceType;

    /**
     * <p>
     * The source of the anomaly.
     * </p>
     * 
     * @param source
     *        The source of the anomaly.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the anomaly.
     * </p>
     * 
     * @return The source of the anomaly.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the anomaly.
     * </p>
     * 
     * @param source
     *        The source of the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalySourceMetadata withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The name of the anomaly's resource.
     * </p>
     * 
     * @param sourceResourceName
     *        The name of the anomaly's resource.
     */

    public void setSourceResourceName(String sourceResourceName) {
        this.sourceResourceName = sourceResourceName;
    }

    /**
     * <p>
     * The name of the anomaly's resource.
     * </p>
     * 
     * @return The name of the anomaly's resource.
     */

    public String getSourceResourceName() {
        return this.sourceResourceName;
    }

    /**
     * <p>
     * The name of the anomaly's resource.
     * </p>
     * 
     * @param sourceResourceName
     *        The name of the anomaly's resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalySourceMetadata withSourceResourceName(String sourceResourceName) {
        setSourceResourceName(sourceResourceName);
        return this;
    }

    /**
     * <p>
     * The anomaly's resource type.
     * </p>
     * 
     * @param sourceResourceType
     *        The anomaly's resource type.
     */

    public void setSourceResourceType(String sourceResourceType) {
        this.sourceResourceType = sourceResourceType;
    }

    /**
     * <p>
     * The anomaly's resource type.
     * </p>
     * 
     * @return The anomaly's resource type.
     */

    public String getSourceResourceType() {
        return this.sourceResourceType;
    }

    /**
     * <p>
     * The anomaly's resource type.
     * </p>
     * 
     * @param sourceResourceType
     *        The anomaly's resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalySourceMetadata withSourceResourceType(String sourceResourceType) {
        setSourceResourceType(sourceResourceType);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getSourceResourceName() != null)
            sb.append("SourceResourceName: ").append(getSourceResourceName()).append(",");
        if (getSourceResourceType() != null)
            sb.append("SourceResourceType: ").append(getSourceResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalySourceMetadata == false)
            return false;
        AnomalySourceMetadata other = (AnomalySourceMetadata) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSourceResourceName() == null ^ this.getSourceResourceName() == null)
            return false;
        if (other.getSourceResourceName() != null && other.getSourceResourceName().equals(this.getSourceResourceName()) == false)
            return false;
        if (other.getSourceResourceType() == null ^ this.getSourceResourceType() == null)
            return false;
        if (other.getSourceResourceType() != null && other.getSourceResourceType().equals(this.getSourceResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSourceResourceName() == null) ? 0 : getSourceResourceName().hashCode());
        hashCode = prime * hashCode + ((getSourceResourceType() == null) ? 0 : getSourceResourceType().hashCode());
        return hashCode;
    }

    @Override
    public AnomalySourceMetadata clone() {
        try {
            return (AnomalySourceMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.AnomalySourceMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

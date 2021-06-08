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
 * For global and local secondary indexes, identifies the attributes that are copied from the table into the index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsDynamoDbTableProjection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDynamoDbTableProjection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The nonkey attributes that are projected into the index. For each attribute, provide the attribute name.
     * </p>
     */
    private java.util.List<String> nonKeyAttributes;
    /**
     * <p>
     * The types of attributes that are projected into the index.
     * </p>
     */
    private String projectionType;

    /**
     * <p>
     * The nonkey attributes that are projected into the index. For each attribute, provide the attribute name.
     * </p>
     * 
     * @return The nonkey attributes that are projected into the index. For each attribute, provide the attribute name.
     */

    public java.util.List<String> getNonKeyAttributes() {
        return nonKeyAttributes;
    }

    /**
     * <p>
     * The nonkey attributes that are projected into the index. For each attribute, provide the attribute name.
     * </p>
     * 
     * @param nonKeyAttributes
     *        The nonkey attributes that are projected into the index. For each attribute, provide the attribute name.
     */

    public void setNonKeyAttributes(java.util.Collection<String> nonKeyAttributes) {
        if (nonKeyAttributes == null) {
            this.nonKeyAttributes = null;
            return;
        }

        this.nonKeyAttributes = new java.util.ArrayList<String>(nonKeyAttributes);
    }

    /**
     * <p>
     * The nonkey attributes that are projected into the index. For each attribute, provide the attribute name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNonKeyAttributes(java.util.Collection)} or {@link #withNonKeyAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param nonKeyAttributes
     *        The nonkey attributes that are projected into the index. For each attribute, provide the attribute name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableProjection withNonKeyAttributes(String... nonKeyAttributes) {
        if (this.nonKeyAttributes == null) {
            setNonKeyAttributes(new java.util.ArrayList<String>(nonKeyAttributes.length));
        }
        for (String ele : nonKeyAttributes) {
            this.nonKeyAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The nonkey attributes that are projected into the index. For each attribute, provide the attribute name.
     * </p>
     * 
     * @param nonKeyAttributes
     *        The nonkey attributes that are projected into the index. For each attribute, provide the attribute name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableProjection withNonKeyAttributes(java.util.Collection<String> nonKeyAttributes) {
        setNonKeyAttributes(nonKeyAttributes);
        return this;
    }

    /**
     * <p>
     * The types of attributes that are projected into the index.
     * </p>
     * 
     * @param projectionType
     *        The types of attributes that are projected into the index.
     */

    public void setProjectionType(String projectionType) {
        this.projectionType = projectionType;
    }

    /**
     * <p>
     * The types of attributes that are projected into the index.
     * </p>
     * 
     * @return The types of attributes that are projected into the index.
     */

    public String getProjectionType() {
        return this.projectionType;
    }

    /**
     * <p>
     * The types of attributes that are projected into the index.
     * </p>
     * 
     * @param projectionType
     *        The types of attributes that are projected into the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableProjection withProjectionType(String projectionType) {
        setProjectionType(projectionType);
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
        if (getNonKeyAttributes() != null)
            sb.append("NonKeyAttributes: ").append(getNonKeyAttributes()).append(",");
        if (getProjectionType() != null)
            sb.append("ProjectionType: ").append(getProjectionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsDynamoDbTableProjection == false)
            return false;
        AwsDynamoDbTableProjection other = (AwsDynamoDbTableProjection) obj;
        if (other.getNonKeyAttributes() == null ^ this.getNonKeyAttributes() == null)
            return false;
        if (other.getNonKeyAttributes() != null && other.getNonKeyAttributes().equals(this.getNonKeyAttributes()) == false)
            return false;
        if (other.getProjectionType() == null ^ this.getProjectionType() == null)
            return false;
        if (other.getProjectionType() != null && other.getProjectionType().equals(this.getProjectionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNonKeyAttributes() == null) ? 0 : getNonKeyAttributes().hashCode());
        hashCode = prime * hashCode + ((getProjectionType() == null) ? 0 : getProjectionType().hashCode());
        return hashCode;
    }

    @Override
    public AwsDynamoDbTableProjection clone() {
        try {
            return (AwsDynamoDbTableProjection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsDynamoDbTableProjectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

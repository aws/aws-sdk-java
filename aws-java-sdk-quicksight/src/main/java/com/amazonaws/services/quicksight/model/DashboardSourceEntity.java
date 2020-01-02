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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Dashboard source entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DashboardSourceEntity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashboardSourceEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Source template.
     * </p>
     */
    private DashboardSourceTemplate sourceTemplate;

    /**
     * <p>
     * Source template.
     * </p>
     * 
     * @param sourceTemplate
     *        Source template.
     */

    public void setSourceTemplate(DashboardSourceTemplate sourceTemplate) {
        this.sourceTemplate = sourceTemplate;
    }

    /**
     * <p>
     * Source template.
     * </p>
     * 
     * @return Source template.
     */

    public DashboardSourceTemplate getSourceTemplate() {
        return this.sourceTemplate;
    }

    /**
     * <p>
     * Source template.
     * </p>
     * 
     * @param sourceTemplate
     *        Source template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardSourceEntity withSourceTemplate(DashboardSourceTemplate sourceTemplate) {
        setSourceTemplate(sourceTemplate);
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
        if (getSourceTemplate() != null)
            sb.append("SourceTemplate: ").append(getSourceTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashboardSourceEntity == false)
            return false;
        DashboardSourceEntity other = (DashboardSourceEntity) obj;
        if (other.getSourceTemplate() == null ^ this.getSourceTemplate() == null)
            return false;
        if (other.getSourceTemplate() != null && other.getSourceTemplate().equals(this.getSourceTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceTemplate() == null) ? 0 : getSourceTemplate().hashCode());
        return hashCode;
    }

    @Override
    public DashboardSourceEntity clone() {
        try {
            return (DashboardSourceEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DashboardSourceEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

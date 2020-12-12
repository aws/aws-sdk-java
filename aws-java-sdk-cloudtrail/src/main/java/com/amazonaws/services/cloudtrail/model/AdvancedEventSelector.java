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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Advanced event selectors let you create fine-grained selectors for the following AWS CloudTrail event record ﬁelds.
 * They help you control costs by logging only those events that are important to you. For more information about
 * advanced event selectors, see <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html">Logging
 * data events for trails</a> in the <i>AWS CloudTrail User Guide</i>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>readOnly</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>eventSource</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>eventName</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>eventCategory</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>resources.type</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>resources.ARN</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * You cannot apply both event selectors and advanced event selectors to a trail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/AdvancedEventSelector" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdvancedEventSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An optional, descriptive name for an advanced event selector, such as "Log data events for only two S3 buckets".
     * </p>
     */
    private String name;
    /**
     * <p>
     * Contains all selector statements in an advanced event selector.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AdvancedFieldSelector> fieldSelectors;

    /**
     * <p>
     * An optional, descriptive name for an advanced event selector, such as "Log data events for only two S3 buckets".
     * </p>
     * 
     * @param name
     *        An optional, descriptive name for an advanced event selector, such as
     *        "Log data events for only two S3 buckets".
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * An optional, descriptive name for an advanced event selector, such as "Log data events for only two S3 buckets".
     * </p>
     * 
     * @return An optional, descriptive name for an advanced event selector, such as
     *         "Log data events for only two S3 buckets".
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * An optional, descriptive name for an advanced event selector, such as "Log data events for only two S3 buckets".
     * </p>
     * 
     * @param name
     *        An optional, descriptive name for an advanced event selector, such as
     *        "Log data events for only two S3 buckets".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedEventSelector withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Contains all selector statements in an advanced event selector.
     * </p>
     * 
     * @return Contains all selector statements in an advanced event selector.
     */

    public java.util.List<AdvancedFieldSelector> getFieldSelectors() {
        if (fieldSelectors == null) {
            fieldSelectors = new com.amazonaws.internal.SdkInternalList<AdvancedFieldSelector>();
        }
        return fieldSelectors;
    }

    /**
     * <p>
     * Contains all selector statements in an advanced event selector.
     * </p>
     * 
     * @param fieldSelectors
     *        Contains all selector statements in an advanced event selector.
     */

    public void setFieldSelectors(java.util.Collection<AdvancedFieldSelector> fieldSelectors) {
        if (fieldSelectors == null) {
            this.fieldSelectors = null;
            return;
        }

        this.fieldSelectors = new com.amazonaws.internal.SdkInternalList<AdvancedFieldSelector>(fieldSelectors);
    }

    /**
     * <p>
     * Contains all selector statements in an advanced event selector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldSelectors(java.util.Collection)} or {@link #withFieldSelectors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fieldSelectors
     *        Contains all selector statements in an advanced event selector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedEventSelector withFieldSelectors(AdvancedFieldSelector... fieldSelectors) {
        if (this.fieldSelectors == null) {
            setFieldSelectors(new com.amazonaws.internal.SdkInternalList<AdvancedFieldSelector>(fieldSelectors.length));
        }
        for (AdvancedFieldSelector ele : fieldSelectors) {
            this.fieldSelectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains all selector statements in an advanced event selector.
     * </p>
     * 
     * @param fieldSelectors
     *        Contains all selector statements in an advanced event selector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedEventSelector withFieldSelectors(java.util.Collection<AdvancedFieldSelector> fieldSelectors) {
        setFieldSelectors(fieldSelectors);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFieldSelectors() != null)
            sb.append("FieldSelectors: ").append(getFieldSelectors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdvancedEventSelector == false)
            return false;
        AdvancedEventSelector other = (AdvancedEventSelector) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFieldSelectors() == null ^ this.getFieldSelectors() == null)
            return false;
        if (other.getFieldSelectors() != null && other.getFieldSelectors().equals(this.getFieldSelectors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFieldSelectors() == null) ? 0 : getFieldSelectors().hashCode());
        return hashCode;
    }

    @Override
    public AdvancedEventSelector clone() {
        try {
            return (AdvancedEventSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.AdvancedEventSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

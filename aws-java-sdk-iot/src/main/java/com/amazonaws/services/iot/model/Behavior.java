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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A Device Defender security profile behavior.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Behavior implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name you have given to the behavior.
     * </p>
     */
    private String name;
    /**
     * <p>
     * What is measured by the behavior.
     * </p>
     */
    private String metric;
    /**
     * <p>
     * The criteria that determine if a device is behaving normally in regard to the <code>metric</code>.
     * </p>
     */
    private BehaviorCriteria criteria;

    /**
     * <p>
     * The name you have given to the behavior.
     * </p>
     * 
     * @param name
     *        The name you have given to the behavior.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name you have given to the behavior.
     * </p>
     * 
     * @return The name you have given to the behavior.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name you have given to the behavior.
     * </p>
     * 
     * @param name
     *        The name you have given to the behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Behavior withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * What is measured by the behavior.
     * </p>
     * 
     * @param metric
     *        What is measured by the behavior.
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * What is measured by the behavior.
     * </p>
     * 
     * @return What is measured by the behavior.
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * What is measured by the behavior.
     * </p>
     * 
     * @param metric
     *        What is measured by the behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Behavior withMetric(String metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The criteria that determine if a device is behaving normally in regard to the <code>metric</code>.
     * </p>
     * 
     * @param criteria
     *        The criteria that determine if a device is behaving normally in regard to the <code>metric</code>.
     */

    public void setCriteria(BehaviorCriteria criteria) {
        this.criteria = criteria;
    }

    /**
     * <p>
     * The criteria that determine if a device is behaving normally in regard to the <code>metric</code>.
     * </p>
     * 
     * @return The criteria that determine if a device is behaving normally in regard to the <code>metric</code>.
     */

    public BehaviorCriteria getCriteria() {
        return this.criteria;
    }

    /**
     * <p>
     * The criteria that determine if a device is behaving normally in regard to the <code>metric</code>.
     * </p>
     * 
     * @param criteria
     *        The criteria that determine if a device is behaving normally in regard to the <code>metric</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Behavior withCriteria(BehaviorCriteria criteria) {
        setCriteria(criteria);
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
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getCriteria() != null)
            sb.append("Criteria: ").append(getCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Behavior == false)
            return false;
        Behavior other = (Behavior) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getCriteria() == null ^ this.getCriteria() == null)
            return false;
        if (other.getCriteria() != null && other.getCriteria().equals(this.getCriteria()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getCriteria() == null) ? 0 : getCriteria().hashCode());
        return hashCode;
    }

    @Override
    public Behavior clone() {
        try {
            return (Behavior) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.BehaviorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

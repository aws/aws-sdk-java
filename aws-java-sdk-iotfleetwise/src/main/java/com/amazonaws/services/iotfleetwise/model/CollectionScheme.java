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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies what data to collect and how often or when to collect it.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CollectionScheme" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollectionScheme implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about a collection scheme that uses a time period to decide how often to collect data.
     * </p>
     */
    private TimeBasedCollectionScheme timeBasedCollectionScheme;
    /**
     * <p>
     * Information about a collection scheme that uses a simple logical expression to recognize what data to collect.
     * </p>
     */
    private ConditionBasedCollectionScheme conditionBasedCollectionScheme;

    /**
     * <p>
     * Information about a collection scheme that uses a time period to decide how often to collect data.
     * </p>
     * 
     * @param timeBasedCollectionScheme
     *        Information about a collection scheme that uses a time period to decide how often to collect data.
     */

    public void setTimeBasedCollectionScheme(TimeBasedCollectionScheme timeBasedCollectionScheme) {
        this.timeBasedCollectionScheme = timeBasedCollectionScheme;
    }

    /**
     * <p>
     * Information about a collection scheme that uses a time period to decide how often to collect data.
     * </p>
     * 
     * @return Information about a collection scheme that uses a time period to decide how often to collect data.
     */

    public TimeBasedCollectionScheme getTimeBasedCollectionScheme() {
        return this.timeBasedCollectionScheme;
    }

    /**
     * <p>
     * Information about a collection scheme that uses a time period to decide how often to collect data.
     * </p>
     * 
     * @param timeBasedCollectionScheme
     *        Information about a collection scheme that uses a time period to decide how often to collect data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionScheme withTimeBasedCollectionScheme(TimeBasedCollectionScheme timeBasedCollectionScheme) {
        setTimeBasedCollectionScheme(timeBasedCollectionScheme);
        return this;
    }

    /**
     * <p>
     * Information about a collection scheme that uses a simple logical expression to recognize what data to collect.
     * </p>
     * 
     * @param conditionBasedCollectionScheme
     *        Information about a collection scheme that uses a simple logical expression to recognize what data to
     *        collect.
     */

    public void setConditionBasedCollectionScheme(ConditionBasedCollectionScheme conditionBasedCollectionScheme) {
        this.conditionBasedCollectionScheme = conditionBasedCollectionScheme;
    }

    /**
     * <p>
     * Information about a collection scheme that uses a simple logical expression to recognize what data to collect.
     * </p>
     * 
     * @return Information about a collection scheme that uses a simple logical expression to recognize what data to
     *         collect.
     */

    public ConditionBasedCollectionScheme getConditionBasedCollectionScheme() {
        return this.conditionBasedCollectionScheme;
    }

    /**
     * <p>
     * Information about a collection scheme that uses a simple logical expression to recognize what data to collect.
     * </p>
     * 
     * @param conditionBasedCollectionScheme
     *        Information about a collection scheme that uses a simple logical expression to recognize what data to
     *        collect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionScheme withConditionBasedCollectionScheme(ConditionBasedCollectionScheme conditionBasedCollectionScheme) {
        setConditionBasedCollectionScheme(conditionBasedCollectionScheme);
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
        if (getTimeBasedCollectionScheme() != null)
            sb.append("TimeBasedCollectionScheme: ").append(getTimeBasedCollectionScheme()).append(",");
        if (getConditionBasedCollectionScheme() != null)
            sb.append("ConditionBasedCollectionScheme: ").append(getConditionBasedCollectionScheme());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CollectionScheme == false)
            return false;
        CollectionScheme other = (CollectionScheme) obj;
        if (other.getTimeBasedCollectionScheme() == null ^ this.getTimeBasedCollectionScheme() == null)
            return false;
        if (other.getTimeBasedCollectionScheme() != null && other.getTimeBasedCollectionScheme().equals(this.getTimeBasedCollectionScheme()) == false)
            return false;
        if (other.getConditionBasedCollectionScheme() == null ^ this.getConditionBasedCollectionScheme() == null)
            return false;
        if (other.getConditionBasedCollectionScheme() != null
                && other.getConditionBasedCollectionScheme().equals(this.getConditionBasedCollectionScheme()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeBasedCollectionScheme() == null) ? 0 : getTimeBasedCollectionScheme().hashCode());
        hashCode = prime * hashCode + ((getConditionBasedCollectionScheme() == null) ? 0 : getConditionBasedCollectionScheme().hashCode());
        return hashCode;
    }

    @Override
    public CollectionScheme clone() {
        try {
            return (CollectionScheme) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.CollectionSchemeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

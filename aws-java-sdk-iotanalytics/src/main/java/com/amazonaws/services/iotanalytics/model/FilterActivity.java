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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An activity that filters a message based on its attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/FilterActivity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterActivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the 'filter' activity.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An expression that looks like a SQL WHERE clause that must return a Boolean value.
     * </p>
     */
    private String filter;
    /**
     * <p>
     * The next activity in the pipeline.
     * </p>
     */
    private String next;

    /**
     * <p>
     * The name of the 'filter' activity.
     * </p>
     * 
     * @param name
     *        The name of the 'filter' activity.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the 'filter' activity.
     * </p>
     * 
     * @return The name of the 'filter' activity.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the 'filter' activity.
     * </p>
     * 
     * @param name
     *        The name of the 'filter' activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterActivity withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An expression that looks like a SQL WHERE clause that must return a Boolean value.
     * </p>
     * 
     * @param filter
     *        An expression that looks like a SQL WHERE clause that must return a Boolean value.
     */

    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * An expression that looks like a SQL WHERE clause that must return a Boolean value.
     * </p>
     * 
     * @return An expression that looks like a SQL WHERE clause that must return a Boolean value.
     */

    public String getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * An expression that looks like a SQL WHERE clause that must return a Boolean value.
     * </p>
     * 
     * @param filter
     *        An expression that looks like a SQL WHERE clause that must return a Boolean value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterActivity withFilter(String filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The next activity in the pipeline.
     * </p>
     * 
     * @param next
     *        The next activity in the pipeline.
     */

    public void setNext(String next) {
        this.next = next;
    }

    /**
     * <p>
     * The next activity in the pipeline.
     * </p>
     * 
     * @return The next activity in the pipeline.
     */

    public String getNext() {
        return this.next;
    }

    /**
     * <p>
     * The next activity in the pipeline.
     * </p>
     * 
     * @param next
     *        The next activity in the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterActivity withNext(String next) {
        setNext(next);
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getNext() != null)
            sb.append("Next: ").append(getNext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterActivity == false)
            return false;
        FilterActivity other = (FilterActivity) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getNext() == null ^ this.getNext() == null)
            return false;
        if (other.getNext() != null && other.getNext().equals(this.getNext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNext() == null) ? 0 : getNext().hashCode());
        return hashCode;
    }

    @Override
    public FilterActivity clone() {
        try {
            return (FilterActivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.FilterActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a single value and metadata about that value as part of an array of query results for a standard metric that
 * applies to an application, campaign, or journey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ResultRowValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultRowValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The friendly name of the metric whose value is specified by the Value property.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The data type of the value specified by the Value property.
     * </p>
     */
    private String type;
    /**
     * <p>
     * In a Values object, the value for the metric that the query retrieved data for. In a GroupedBys object, the value
     * for the field that was used to group data in a result set that contains multiple results (Values objects).
     * </p>
     */
    private String value;

    /**
     * <p>
     * The friendly name of the metric whose value is specified by the Value property.
     * </p>
     * 
     * @param key
     *        The friendly name of the metric whose value is specified by the Value property.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The friendly name of the metric whose value is specified by the Value property.
     * </p>
     * 
     * @return The friendly name of the metric whose value is specified by the Value property.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The friendly name of the metric whose value is specified by the Value property.
     * </p>
     * 
     * @param key
     *        The friendly name of the metric whose value is specified by the Value property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultRowValue withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The data type of the value specified by the Value property.
     * </p>
     * 
     * @param type
     *        The data type of the value specified by the Value property.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data type of the value specified by the Value property.
     * </p>
     * 
     * @return The data type of the value specified by the Value property.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The data type of the value specified by the Value property.
     * </p>
     * 
     * @param type
     *        The data type of the value specified by the Value property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultRowValue withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * In a Values object, the value for the metric that the query retrieved data for. In a GroupedBys object, the value
     * for the field that was used to group data in a result set that contains multiple results (Values objects).
     * </p>
     * 
     * @param value
     *        In a Values object, the value for the metric that the query retrieved data for. In a GroupedBys object,
     *        the value for the field that was used to group data in a result set that contains multiple results (Values
     *        objects).
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * In a Values object, the value for the metric that the query retrieved data for. In a GroupedBys object, the value
     * for the field that was used to group data in a result set that contains multiple results (Values objects).
     * </p>
     * 
     * @return In a Values object, the value for the metric that the query retrieved data for. In a GroupedBys object,
     *         the value for the field that was used to group data in a result set that contains multiple results
     *         (Values objects).
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * In a Values object, the value for the metric that the query retrieved data for. In a GroupedBys object, the value
     * for the field that was used to group data in a result set that contains multiple results (Values objects).
     * </p>
     * 
     * @param value
     *        In a Values object, the value for the metric that the query retrieved data for. In a GroupedBys object,
     *        the value for the field that was used to group data in a result set that contains multiple results (Values
     *        objects).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultRowValue withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultRowValue == false)
            return false;
        ResultRowValue other = (ResultRowValue) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ResultRowValue clone() {
        try {
            return (ResultRowValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ResultRowValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

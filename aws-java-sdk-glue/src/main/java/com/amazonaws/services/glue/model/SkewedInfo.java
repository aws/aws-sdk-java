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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies skewed values in a table. Skewed are ones that occur with very high frequency.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SkewedInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SkewedInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of names of columns that contain skewed values.
     * </p>
     */
    private java.util.List<String> skewedColumnNames;
    /**
     * <p>
     * A list of values that appear so frequently as to be considered skewed.
     * </p>
     */
    private java.util.List<String> skewedColumnValues;
    /**
     * <p>
     * A mapping of skewed values to the columns that contain them.
     * </p>
     */
    private java.util.Map<String, String> skewedColumnValueLocationMaps;

    /**
     * <p>
     * A list of names of columns that contain skewed values.
     * </p>
     * 
     * @return A list of names of columns that contain skewed values.
     */

    public java.util.List<String> getSkewedColumnNames() {
        return skewedColumnNames;
    }

    /**
     * <p>
     * A list of names of columns that contain skewed values.
     * </p>
     * 
     * @param skewedColumnNames
     *        A list of names of columns that contain skewed values.
     */

    public void setSkewedColumnNames(java.util.Collection<String> skewedColumnNames) {
        if (skewedColumnNames == null) {
            this.skewedColumnNames = null;
            return;
        }

        this.skewedColumnNames = new java.util.ArrayList<String>(skewedColumnNames);
    }

    /**
     * <p>
     * A list of names of columns that contain skewed values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSkewedColumnNames(java.util.Collection)} or {@link #withSkewedColumnNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param skewedColumnNames
     *        A list of names of columns that contain skewed values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkewedInfo withSkewedColumnNames(String... skewedColumnNames) {
        if (this.skewedColumnNames == null) {
            setSkewedColumnNames(new java.util.ArrayList<String>(skewedColumnNames.length));
        }
        for (String ele : skewedColumnNames) {
            this.skewedColumnNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of columns that contain skewed values.
     * </p>
     * 
     * @param skewedColumnNames
     *        A list of names of columns that contain skewed values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkewedInfo withSkewedColumnNames(java.util.Collection<String> skewedColumnNames) {
        setSkewedColumnNames(skewedColumnNames);
        return this;
    }

    /**
     * <p>
     * A list of values that appear so frequently as to be considered skewed.
     * </p>
     * 
     * @return A list of values that appear so frequently as to be considered skewed.
     */

    public java.util.List<String> getSkewedColumnValues() {
        return skewedColumnValues;
    }

    /**
     * <p>
     * A list of values that appear so frequently as to be considered skewed.
     * </p>
     * 
     * @param skewedColumnValues
     *        A list of values that appear so frequently as to be considered skewed.
     */

    public void setSkewedColumnValues(java.util.Collection<String> skewedColumnValues) {
        if (skewedColumnValues == null) {
            this.skewedColumnValues = null;
            return;
        }

        this.skewedColumnValues = new java.util.ArrayList<String>(skewedColumnValues);
    }

    /**
     * <p>
     * A list of values that appear so frequently as to be considered skewed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSkewedColumnValues(java.util.Collection)} or {@link #withSkewedColumnValues(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param skewedColumnValues
     *        A list of values that appear so frequently as to be considered skewed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkewedInfo withSkewedColumnValues(String... skewedColumnValues) {
        if (this.skewedColumnValues == null) {
            setSkewedColumnValues(new java.util.ArrayList<String>(skewedColumnValues.length));
        }
        for (String ele : skewedColumnValues) {
            this.skewedColumnValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of values that appear so frequently as to be considered skewed.
     * </p>
     * 
     * @param skewedColumnValues
     *        A list of values that appear so frequently as to be considered skewed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkewedInfo withSkewedColumnValues(java.util.Collection<String> skewedColumnValues) {
        setSkewedColumnValues(skewedColumnValues);
        return this;
    }

    /**
     * <p>
     * A mapping of skewed values to the columns that contain them.
     * </p>
     * 
     * @return A mapping of skewed values to the columns that contain them.
     */

    public java.util.Map<String, String> getSkewedColumnValueLocationMaps() {
        return skewedColumnValueLocationMaps;
    }

    /**
     * <p>
     * A mapping of skewed values to the columns that contain them.
     * </p>
     * 
     * @param skewedColumnValueLocationMaps
     *        A mapping of skewed values to the columns that contain them.
     */

    public void setSkewedColumnValueLocationMaps(java.util.Map<String, String> skewedColumnValueLocationMaps) {
        this.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
    }

    /**
     * <p>
     * A mapping of skewed values to the columns that contain them.
     * </p>
     * 
     * @param skewedColumnValueLocationMaps
     *        A mapping of skewed values to the columns that contain them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkewedInfo withSkewedColumnValueLocationMaps(java.util.Map<String, String> skewedColumnValueLocationMaps) {
        setSkewedColumnValueLocationMaps(skewedColumnValueLocationMaps);
        return this;
    }

    public SkewedInfo addSkewedColumnValueLocationMapsEntry(String key, String value) {
        if (null == this.skewedColumnValueLocationMaps) {
            this.skewedColumnValueLocationMaps = new java.util.HashMap<String, String>();
        }
        if (this.skewedColumnValueLocationMaps.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.skewedColumnValueLocationMaps.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SkewedColumnValueLocationMaps.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkewedInfo clearSkewedColumnValueLocationMapsEntries() {
        this.skewedColumnValueLocationMaps = null;
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
        if (getSkewedColumnNames() != null)
            sb.append("SkewedColumnNames: ").append(getSkewedColumnNames()).append(",");
        if (getSkewedColumnValues() != null)
            sb.append("SkewedColumnValues: ").append(getSkewedColumnValues()).append(",");
        if (getSkewedColumnValueLocationMaps() != null)
            sb.append("SkewedColumnValueLocationMaps: ").append(getSkewedColumnValueLocationMaps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SkewedInfo == false)
            return false;
        SkewedInfo other = (SkewedInfo) obj;
        if (other.getSkewedColumnNames() == null ^ this.getSkewedColumnNames() == null)
            return false;
        if (other.getSkewedColumnNames() != null && other.getSkewedColumnNames().equals(this.getSkewedColumnNames()) == false)
            return false;
        if (other.getSkewedColumnValues() == null ^ this.getSkewedColumnValues() == null)
            return false;
        if (other.getSkewedColumnValues() != null && other.getSkewedColumnValues().equals(this.getSkewedColumnValues()) == false)
            return false;
        if (other.getSkewedColumnValueLocationMaps() == null ^ this.getSkewedColumnValueLocationMaps() == null)
            return false;
        if (other.getSkewedColumnValueLocationMaps() != null
                && other.getSkewedColumnValueLocationMaps().equals(this.getSkewedColumnValueLocationMaps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkewedColumnNames() == null) ? 0 : getSkewedColumnNames().hashCode());
        hashCode = prime * hashCode + ((getSkewedColumnValues() == null) ? 0 : getSkewedColumnValues().hashCode());
        hashCode = prime * hashCode + ((getSkewedColumnValueLocationMaps() == null) ? 0 : getSkewedColumnValueLocationMaps().hashCode());
        return hashCode;
    }

    @Override
    public SkewedInfo clone() {
        try {
            return (SkewedInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SkewedInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

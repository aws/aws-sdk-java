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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeOptionGroupOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOptionGroupOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private com.amazonaws.internal.SdkInternalList<OptionGroupOption> optionGroupOptions;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * @return
     */

    public java.util.List<OptionGroupOption> getOptionGroupOptions() {
        if (optionGroupOptions == null) {
            optionGroupOptions = new com.amazonaws.internal.SdkInternalList<OptionGroupOption>();
        }
        return optionGroupOptions;
    }

    /**
     * @param optionGroupOptions
     */

    public void setOptionGroupOptions(java.util.Collection<OptionGroupOption> optionGroupOptions) {
        if (optionGroupOptions == null) {
            this.optionGroupOptions = null;
            return;
        }

        this.optionGroupOptions = new com.amazonaws.internal.SdkInternalList<OptionGroupOption>(optionGroupOptions);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionGroupOptions(java.util.Collection)} or {@link #withOptionGroupOptions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param optionGroupOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptionGroupOptionsResult withOptionGroupOptions(OptionGroupOption... optionGroupOptions) {
        if (this.optionGroupOptions == null) {
            setOptionGroupOptions(new com.amazonaws.internal.SdkInternalList<OptionGroupOption>(optionGroupOptions.length));
        }
        for (OptionGroupOption ele : optionGroupOptions) {
            this.optionGroupOptions.add(ele);
        }
        return this;
    }

    /**
     * @param optionGroupOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptionGroupOptionsResult withOptionGroupOptions(java.util.Collection<OptionGroupOption> optionGroupOptions) {
        setOptionGroupOptions(optionGroupOptions);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptionGroupOptionsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getOptionGroupOptions() != null)
            sb.append("OptionGroupOptions: ").append(getOptionGroupOptions()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOptionGroupOptionsResult == false)
            return false;
        DescribeOptionGroupOptionsResult other = (DescribeOptionGroupOptionsResult) obj;
        if (other.getOptionGroupOptions() == null ^ this.getOptionGroupOptions() == null)
            return false;
        if (other.getOptionGroupOptions() != null && other.getOptionGroupOptions().equals(this.getOptionGroupOptions()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptionGroupOptions() == null) ? 0 : getOptionGroupOptions().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOptionGroupOptionsResult clone() {
        try {
            return (DescribeOptionGroupOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

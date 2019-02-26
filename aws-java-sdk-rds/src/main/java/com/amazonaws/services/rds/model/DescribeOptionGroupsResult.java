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
 * <p>
 * List of option groups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeOptionGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOptionGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of option groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OptionGroup> optionGroupsList;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * List of option groups.
     * </p>
     * 
     * @return List of option groups.
     */

    public java.util.List<OptionGroup> getOptionGroupsList() {
        if (optionGroupsList == null) {
            optionGroupsList = new com.amazonaws.internal.SdkInternalList<OptionGroup>();
        }
        return optionGroupsList;
    }

    /**
     * <p>
     * List of option groups.
     * </p>
     * 
     * @param optionGroupsList
     *        List of option groups.
     */

    public void setOptionGroupsList(java.util.Collection<OptionGroup> optionGroupsList) {
        if (optionGroupsList == null) {
            this.optionGroupsList = null;
            return;
        }

        this.optionGroupsList = new com.amazonaws.internal.SdkInternalList<OptionGroup>(optionGroupsList);
    }

    /**
     * <p>
     * List of option groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionGroupsList(java.util.Collection)} or {@link #withOptionGroupsList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param optionGroupsList
     *        List of option groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptionGroupsResult withOptionGroupsList(OptionGroup... optionGroupsList) {
        if (this.optionGroupsList == null) {
            setOptionGroupsList(new com.amazonaws.internal.SdkInternalList<OptionGroup>(optionGroupsList.length));
        }
        for (OptionGroup ele : optionGroupsList) {
            this.optionGroupsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of option groups.
     * </p>
     * 
     * @param optionGroupsList
     *        List of option groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptionGroupsResult withOptionGroupsList(java.util.Collection<OptionGroup> optionGroupsList) {
        setOptionGroupsList(optionGroupsList);
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

    public DescribeOptionGroupsResult withMarker(String marker) {
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
        if (getOptionGroupsList() != null)
            sb.append("OptionGroupsList: ").append(getOptionGroupsList()).append(",");
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

        if (obj instanceof DescribeOptionGroupsResult == false)
            return false;
        DescribeOptionGroupsResult other = (DescribeOptionGroupsResult) obj;
        if (other.getOptionGroupsList() == null ^ this.getOptionGroupsList() == null)
            return false;
        if (other.getOptionGroupsList() != null && other.getOptionGroupsList().equals(this.getOptionGroupsList()) == false)
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

        hashCode = prime * hashCode + ((getOptionGroupsList() == null) ? 0 : getOptionGroupsList().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOptionGroupsResult clone() {
        try {
            return (DescribeOptionGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The paginated report options for a table visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TablePaginatedReportOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TablePaginatedReportOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The visibility of printing table overflow across pages.
     * </p>
     */
    private String verticalOverflowVisibility;
    /**
     * <p>
     * The visibility of repeating header rows on each page.
     * </p>
     */
    private String overflowColumnHeaderVisibility;

    /**
     * <p>
     * The visibility of printing table overflow across pages.
     * </p>
     * 
     * @param verticalOverflowVisibility
     *        The visibility of printing table overflow across pages.
     * @see Visibility
     */

    public void setVerticalOverflowVisibility(String verticalOverflowVisibility) {
        this.verticalOverflowVisibility = verticalOverflowVisibility;
    }

    /**
     * <p>
     * The visibility of printing table overflow across pages.
     * </p>
     * 
     * @return The visibility of printing table overflow across pages.
     * @see Visibility
     */

    public String getVerticalOverflowVisibility() {
        return this.verticalOverflowVisibility;
    }

    /**
     * <p>
     * The visibility of printing table overflow across pages.
     * </p>
     * 
     * @param verticalOverflowVisibility
     *        The visibility of printing table overflow across pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public TablePaginatedReportOptions withVerticalOverflowVisibility(String verticalOverflowVisibility) {
        setVerticalOverflowVisibility(verticalOverflowVisibility);
        return this;
    }

    /**
     * <p>
     * The visibility of printing table overflow across pages.
     * </p>
     * 
     * @param verticalOverflowVisibility
     *        The visibility of printing table overflow across pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public TablePaginatedReportOptions withVerticalOverflowVisibility(Visibility verticalOverflowVisibility) {
        this.verticalOverflowVisibility = verticalOverflowVisibility.toString();
        return this;
    }

    /**
     * <p>
     * The visibility of repeating header rows on each page.
     * </p>
     * 
     * @param overflowColumnHeaderVisibility
     *        The visibility of repeating header rows on each page.
     * @see Visibility
     */

    public void setOverflowColumnHeaderVisibility(String overflowColumnHeaderVisibility) {
        this.overflowColumnHeaderVisibility = overflowColumnHeaderVisibility;
    }

    /**
     * <p>
     * The visibility of repeating header rows on each page.
     * </p>
     * 
     * @return The visibility of repeating header rows on each page.
     * @see Visibility
     */

    public String getOverflowColumnHeaderVisibility() {
        return this.overflowColumnHeaderVisibility;
    }

    /**
     * <p>
     * The visibility of repeating header rows on each page.
     * </p>
     * 
     * @param overflowColumnHeaderVisibility
     *        The visibility of repeating header rows on each page.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public TablePaginatedReportOptions withOverflowColumnHeaderVisibility(String overflowColumnHeaderVisibility) {
        setOverflowColumnHeaderVisibility(overflowColumnHeaderVisibility);
        return this;
    }

    /**
     * <p>
     * The visibility of repeating header rows on each page.
     * </p>
     * 
     * @param overflowColumnHeaderVisibility
     *        The visibility of repeating header rows on each page.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public TablePaginatedReportOptions withOverflowColumnHeaderVisibility(Visibility overflowColumnHeaderVisibility) {
        this.overflowColumnHeaderVisibility = overflowColumnHeaderVisibility.toString();
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
        if (getVerticalOverflowVisibility() != null)
            sb.append("VerticalOverflowVisibility: ").append(getVerticalOverflowVisibility()).append(",");
        if (getOverflowColumnHeaderVisibility() != null)
            sb.append("OverflowColumnHeaderVisibility: ").append(getOverflowColumnHeaderVisibility());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TablePaginatedReportOptions == false)
            return false;
        TablePaginatedReportOptions other = (TablePaginatedReportOptions) obj;
        if (other.getVerticalOverflowVisibility() == null ^ this.getVerticalOverflowVisibility() == null)
            return false;
        if (other.getVerticalOverflowVisibility() != null && other.getVerticalOverflowVisibility().equals(this.getVerticalOverflowVisibility()) == false)
            return false;
        if (other.getOverflowColumnHeaderVisibility() == null ^ this.getOverflowColumnHeaderVisibility() == null)
            return false;
        if (other.getOverflowColumnHeaderVisibility() != null
                && other.getOverflowColumnHeaderVisibility().equals(this.getOverflowColumnHeaderVisibility()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerticalOverflowVisibility() == null) ? 0 : getVerticalOverflowVisibility().hashCode());
        hashCode = prime * hashCode + ((getOverflowColumnHeaderVisibility() == null) ? 0 : getOverflowColumnHeaderVisibility().hashCode());
        return hashCode;
    }

    @Override
    public TablePaginatedReportOptions clone() {
        try {
            return (TablePaginatedReportOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TablePaginatedReportOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

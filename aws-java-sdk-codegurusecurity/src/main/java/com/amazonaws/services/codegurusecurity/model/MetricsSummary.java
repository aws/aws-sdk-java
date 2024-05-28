/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about summary metrics in an account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/MetricsSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricsSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of <code>CategoryWithFindingNum</code> objects for the top 5 finding categories with the most open
     * findings in an account.
     * </p>
     */
    private java.util.List<CategoryWithFindingNum> categoriesWithMostFindings;
    /**
     * <p>
     * The date from which the metrics summary information was retrieved.
     * </p>
     */
    private java.util.Date date;
    /**
     * <p>
     * The number of open findings of each severity in an account.
     * </p>
     */
    private FindingMetricsValuePerSeverity openFindings;
    /**
     * <p>
     * A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open findings
     * in an account.
     * </p>
     */
    private java.util.List<ScanNameWithFindingNum> scansWithMostOpenCriticalFindings;
    /**
     * <p>
     * A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open critical
     * findings in an account.
     * </p>
     */
    private java.util.List<ScanNameWithFindingNum> scansWithMostOpenFindings;

    /**
     * <p>
     * A list of <code>CategoryWithFindingNum</code> objects for the top 5 finding categories with the most open
     * findings in an account.
     * </p>
     * 
     * @return A list of <code>CategoryWithFindingNum</code> objects for the top 5 finding categories with the most open
     *         findings in an account.
     */

    public java.util.List<CategoryWithFindingNum> getCategoriesWithMostFindings() {
        return categoriesWithMostFindings;
    }

    /**
     * <p>
     * A list of <code>CategoryWithFindingNum</code> objects for the top 5 finding categories with the most open
     * findings in an account.
     * </p>
     * 
     * @param categoriesWithMostFindings
     *        A list of <code>CategoryWithFindingNum</code> objects for the top 5 finding categories with the most open
     *        findings in an account.
     */

    public void setCategoriesWithMostFindings(java.util.Collection<CategoryWithFindingNum> categoriesWithMostFindings) {
        if (categoriesWithMostFindings == null) {
            this.categoriesWithMostFindings = null;
            return;
        }

        this.categoriesWithMostFindings = new java.util.ArrayList<CategoryWithFindingNum>(categoriesWithMostFindings);
    }

    /**
     * <p>
     * A list of <code>CategoryWithFindingNum</code> objects for the top 5 finding categories with the most open
     * findings in an account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategoriesWithMostFindings(java.util.Collection)} or
     * {@link #withCategoriesWithMostFindings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param categoriesWithMostFindings
     *        A list of <code>CategoryWithFindingNum</code> objects for the top 5 finding categories with the most open
     *        findings in an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsSummary withCategoriesWithMostFindings(CategoryWithFindingNum... categoriesWithMostFindings) {
        if (this.categoriesWithMostFindings == null) {
            setCategoriesWithMostFindings(new java.util.ArrayList<CategoryWithFindingNum>(categoriesWithMostFindings.length));
        }
        for (CategoryWithFindingNum ele : categoriesWithMostFindings) {
            this.categoriesWithMostFindings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>CategoryWithFindingNum</code> objects for the top 5 finding categories with the most open
     * findings in an account.
     * </p>
     * 
     * @param categoriesWithMostFindings
     *        A list of <code>CategoryWithFindingNum</code> objects for the top 5 finding categories with the most open
     *        findings in an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsSummary withCategoriesWithMostFindings(java.util.Collection<CategoryWithFindingNum> categoriesWithMostFindings) {
        setCategoriesWithMostFindings(categoriesWithMostFindings);
        return this;
    }

    /**
     * <p>
     * The date from which the metrics summary information was retrieved.
     * </p>
     * 
     * @param date
     *        The date from which the metrics summary information was retrieved.
     */

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * <p>
     * The date from which the metrics summary information was retrieved.
     * </p>
     * 
     * @return The date from which the metrics summary information was retrieved.
     */

    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * <p>
     * The date from which the metrics summary information was retrieved.
     * </p>
     * 
     * @param date
     *        The date from which the metrics summary information was retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsSummary withDate(java.util.Date date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * The number of open findings of each severity in an account.
     * </p>
     * 
     * @param openFindings
     *        The number of open findings of each severity in an account.
     */

    public void setOpenFindings(FindingMetricsValuePerSeverity openFindings) {
        this.openFindings = openFindings;
    }

    /**
     * <p>
     * The number of open findings of each severity in an account.
     * </p>
     * 
     * @return The number of open findings of each severity in an account.
     */

    public FindingMetricsValuePerSeverity getOpenFindings() {
        return this.openFindings;
    }

    /**
     * <p>
     * The number of open findings of each severity in an account.
     * </p>
     * 
     * @param openFindings
     *        The number of open findings of each severity in an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsSummary withOpenFindings(FindingMetricsValuePerSeverity openFindings) {
        setOpenFindings(openFindings);
        return this;
    }

    /**
     * <p>
     * A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open findings
     * in an account.
     * </p>
     * 
     * @return A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open
     *         findings in an account.
     */

    public java.util.List<ScanNameWithFindingNum> getScansWithMostOpenCriticalFindings() {
        return scansWithMostOpenCriticalFindings;
    }

    /**
     * <p>
     * A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open findings
     * in an account.
     * </p>
     * 
     * @param scansWithMostOpenCriticalFindings
     *        A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open
     *        findings in an account.
     */

    public void setScansWithMostOpenCriticalFindings(java.util.Collection<ScanNameWithFindingNum> scansWithMostOpenCriticalFindings) {
        if (scansWithMostOpenCriticalFindings == null) {
            this.scansWithMostOpenCriticalFindings = null;
            return;
        }

        this.scansWithMostOpenCriticalFindings = new java.util.ArrayList<ScanNameWithFindingNum>(scansWithMostOpenCriticalFindings);
    }

    /**
     * <p>
     * A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open findings
     * in an account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScansWithMostOpenCriticalFindings(java.util.Collection)} or
     * {@link #withScansWithMostOpenCriticalFindings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param scansWithMostOpenCriticalFindings
     *        A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open
     *        findings in an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsSummary withScansWithMostOpenCriticalFindings(ScanNameWithFindingNum... scansWithMostOpenCriticalFindings) {
        if (this.scansWithMostOpenCriticalFindings == null) {
            setScansWithMostOpenCriticalFindings(new java.util.ArrayList<ScanNameWithFindingNum>(scansWithMostOpenCriticalFindings.length));
        }
        for (ScanNameWithFindingNum ele : scansWithMostOpenCriticalFindings) {
            this.scansWithMostOpenCriticalFindings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open findings
     * in an account.
     * </p>
     * 
     * @param scansWithMostOpenCriticalFindings
     *        A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open
     *        findings in an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsSummary withScansWithMostOpenCriticalFindings(java.util.Collection<ScanNameWithFindingNum> scansWithMostOpenCriticalFindings) {
        setScansWithMostOpenCriticalFindings(scansWithMostOpenCriticalFindings);
        return this;
    }

    /**
     * <p>
     * A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open critical
     * findings in an account.
     * </p>
     * 
     * @return A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open
     *         critical findings in an account.
     */

    public java.util.List<ScanNameWithFindingNum> getScansWithMostOpenFindings() {
        return scansWithMostOpenFindings;
    }

    /**
     * <p>
     * A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open critical
     * findings in an account.
     * </p>
     * 
     * @param scansWithMostOpenFindings
     *        A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open
     *        critical findings in an account.
     */

    public void setScansWithMostOpenFindings(java.util.Collection<ScanNameWithFindingNum> scansWithMostOpenFindings) {
        if (scansWithMostOpenFindings == null) {
            this.scansWithMostOpenFindings = null;
            return;
        }

        this.scansWithMostOpenFindings = new java.util.ArrayList<ScanNameWithFindingNum>(scansWithMostOpenFindings);
    }

    /**
     * <p>
     * A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open critical
     * findings in an account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScansWithMostOpenFindings(java.util.Collection)} or
     * {@link #withScansWithMostOpenFindings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param scansWithMostOpenFindings
     *        A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open
     *        critical findings in an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsSummary withScansWithMostOpenFindings(ScanNameWithFindingNum... scansWithMostOpenFindings) {
        if (this.scansWithMostOpenFindings == null) {
            setScansWithMostOpenFindings(new java.util.ArrayList<ScanNameWithFindingNum>(scansWithMostOpenFindings.length));
        }
        for (ScanNameWithFindingNum ele : scansWithMostOpenFindings) {
            this.scansWithMostOpenFindings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open critical
     * findings in an account.
     * </p>
     * 
     * @param scansWithMostOpenFindings
     *        A list of <code>ScanNameWithFindingNum</code> objects for the top 3 scans with the most number of open
     *        critical findings in an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsSummary withScansWithMostOpenFindings(java.util.Collection<ScanNameWithFindingNum> scansWithMostOpenFindings) {
        setScansWithMostOpenFindings(scansWithMostOpenFindings);
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
        if (getCategoriesWithMostFindings() != null)
            sb.append("CategoriesWithMostFindings: ").append(getCategoriesWithMostFindings()).append(",");
        if (getDate() != null)
            sb.append("Date: ").append(getDate()).append(",");
        if (getOpenFindings() != null)
            sb.append("OpenFindings: ").append(getOpenFindings()).append(",");
        if (getScansWithMostOpenCriticalFindings() != null)
            sb.append("ScansWithMostOpenCriticalFindings: ").append(getScansWithMostOpenCriticalFindings()).append(",");
        if (getScansWithMostOpenFindings() != null)
            sb.append("ScansWithMostOpenFindings: ").append(getScansWithMostOpenFindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricsSummary == false)
            return false;
        MetricsSummary other = (MetricsSummary) obj;
        if (other.getCategoriesWithMostFindings() == null ^ this.getCategoriesWithMostFindings() == null)
            return false;
        if (other.getCategoriesWithMostFindings() != null && other.getCategoriesWithMostFindings().equals(this.getCategoriesWithMostFindings()) == false)
            return false;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getOpenFindings() == null ^ this.getOpenFindings() == null)
            return false;
        if (other.getOpenFindings() != null && other.getOpenFindings().equals(this.getOpenFindings()) == false)
            return false;
        if (other.getScansWithMostOpenCriticalFindings() == null ^ this.getScansWithMostOpenCriticalFindings() == null)
            return false;
        if (other.getScansWithMostOpenCriticalFindings() != null
                && other.getScansWithMostOpenCriticalFindings().equals(this.getScansWithMostOpenCriticalFindings()) == false)
            return false;
        if (other.getScansWithMostOpenFindings() == null ^ this.getScansWithMostOpenFindings() == null)
            return false;
        if (other.getScansWithMostOpenFindings() != null && other.getScansWithMostOpenFindings().equals(this.getScansWithMostOpenFindings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategoriesWithMostFindings() == null) ? 0 : getCategoriesWithMostFindings().hashCode());
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getOpenFindings() == null) ? 0 : getOpenFindings().hashCode());
        hashCode = prime * hashCode + ((getScansWithMostOpenCriticalFindings() == null) ? 0 : getScansWithMostOpenCriticalFindings().hashCode());
        hashCode = prime * hashCode + ((getScansWithMostOpenFindings() == null) ? 0 : getScansWithMostOpenFindings().hashCode());
        return hashCode;
    }

    @Override
    public MetricsSummary clone() {
        try {
            return (MetricsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurusecurity.model.transform.MetricsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

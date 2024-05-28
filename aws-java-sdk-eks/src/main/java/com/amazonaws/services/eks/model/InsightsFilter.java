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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The criteria to use for the insights.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/InsightsFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The categories to use to filter insights.
     * </p>
     */
    private java.util.List<String> categories;
    /**
     * <p>
     * The Kubernetes versions to use to filter the insights.
     * </p>
     */
    private java.util.List<String> kubernetesVersions;
    /**
     * <p>
     * The statuses to use to filter the insights.
     * </p>
     */
    private java.util.List<String> statuses;

    /**
     * <p>
     * The categories to use to filter insights.
     * </p>
     * 
     * @return The categories to use to filter insights.
     * @see Category
     */

    public java.util.List<String> getCategories() {
        return categories;
    }

    /**
     * <p>
     * The categories to use to filter insights.
     * </p>
     * 
     * @param categories
     *        The categories to use to filter insights.
     * @see Category
     */

    public void setCategories(java.util.Collection<String> categories) {
        if (categories == null) {
            this.categories = null;
            return;
        }

        this.categories = new java.util.ArrayList<String>(categories);
    }

    /**
     * <p>
     * The categories to use to filter insights.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategories(java.util.Collection)} or {@link #withCategories(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param categories
     *        The categories to use to filter insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Category
     */

    public InsightsFilter withCategories(String... categories) {
        if (this.categories == null) {
            setCategories(new java.util.ArrayList<String>(categories.length));
        }
        for (String ele : categories) {
            this.categories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The categories to use to filter insights.
     * </p>
     * 
     * @param categories
     *        The categories to use to filter insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Category
     */

    public InsightsFilter withCategories(java.util.Collection<String> categories) {
        setCategories(categories);
        return this;
    }

    /**
     * <p>
     * The categories to use to filter insights.
     * </p>
     * 
     * @param categories
     *        The categories to use to filter insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Category
     */

    public InsightsFilter withCategories(Category... categories) {
        java.util.ArrayList<String> categoriesCopy = new java.util.ArrayList<String>(categories.length);
        for (Category value : categories) {
            categoriesCopy.add(value.toString());
        }
        if (getCategories() == null) {
            setCategories(categoriesCopy);
        } else {
            getCategories().addAll(categoriesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The Kubernetes versions to use to filter the insights.
     * </p>
     * 
     * @return The Kubernetes versions to use to filter the insights.
     */

    public java.util.List<String> getKubernetesVersions() {
        return kubernetesVersions;
    }

    /**
     * <p>
     * The Kubernetes versions to use to filter the insights.
     * </p>
     * 
     * @param kubernetesVersions
     *        The Kubernetes versions to use to filter the insights.
     */

    public void setKubernetesVersions(java.util.Collection<String> kubernetesVersions) {
        if (kubernetesVersions == null) {
            this.kubernetesVersions = null;
            return;
        }

        this.kubernetesVersions = new java.util.ArrayList<String>(kubernetesVersions);
    }

    /**
     * <p>
     * The Kubernetes versions to use to filter the insights.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKubernetesVersions(java.util.Collection)} or {@link #withKubernetesVersions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param kubernetesVersions
     *        The Kubernetes versions to use to filter the insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightsFilter withKubernetesVersions(String... kubernetesVersions) {
        if (this.kubernetesVersions == null) {
            setKubernetesVersions(new java.util.ArrayList<String>(kubernetesVersions.length));
        }
        for (String ele : kubernetesVersions) {
            this.kubernetesVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Kubernetes versions to use to filter the insights.
     * </p>
     * 
     * @param kubernetesVersions
     *        The Kubernetes versions to use to filter the insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightsFilter withKubernetesVersions(java.util.Collection<String> kubernetesVersions) {
        setKubernetesVersions(kubernetesVersions);
        return this;
    }

    /**
     * <p>
     * The statuses to use to filter the insights.
     * </p>
     * 
     * @return The statuses to use to filter the insights.
     * @see InsightStatusValue
     */

    public java.util.List<String> getStatuses() {
        return statuses;
    }

    /**
     * <p>
     * The statuses to use to filter the insights.
     * </p>
     * 
     * @param statuses
     *        The statuses to use to filter the insights.
     * @see InsightStatusValue
     */

    public void setStatuses(java.util.Collection<String> statuses) {
        if (statuses == null) {
            this.statuses = null;
            return;
        }

        this.statuses = new java.util.ArrayList<String>(statuses);
    }

    /**
     * <p>
     * The statuses to use to filter the insights.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatuses(java.util.Collection)} or {@link #withStatuses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param statuses
     *        The statuses to use to filter the insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightStatusValue
     */

    public InsightsFilter withStatuses(String... statuses) {
        if (this.statuses == null) {
            setStatuses(new java.util.ArrayList<String>(statuses.length));
        }
        for (String ele : statuses) {
            this.statuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The statuses to use to filter the insights.
     * </p>
     * 
     * @param statuses
     *        The statuses to use to filter the insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightStatusValue
     */

    public InsightsFilter withStatuses(java.util.Collection<String> statuses) {
        setStatuses(statuses);
        return this;
    }

    /**
     * <p>
     * The statuses to use to filter the insights.
     * </p>
     * 
     * @param statuses
     *        The statuses to use to filter the insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightStatusValue
     */

    public InsightsFilter withStatuses(InsightStatusValue... statuses) {
        java.util.ArrayList<String> statusesCopy = new java.util.ArrayList<String>(statuses.length);
        for (InsightStatusValue value : statuses) {
            statusesCopy.add(value.toString());
        }
        if (getStatuses() == null) {
            setStatuses(statusesCopy);
        } else {
            getStatuses().addAll(statusesCopy);
        }
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
        if (getCategories() != null)
            sb.append("Categories: ").append(getCategories()).append(",");
        if (getKubernetesVersions() != null)
            sb.append("KubernetesVersions: ").append(getKubernetesVersions()).append(",");
        if (getStatuses() != null)
            sb.append("Statuses: ").append(getStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightsFilter == false)
            return false;
        InsightsFilter other = (InsightsFilter) obj;
        if (other.getCategories() == null ^ this.getCategories() == null)
            return false;
        if (other.getCategories() != null && other.getCategories().equals(this.getCategories()) == false)
            return false;
        if (other.getKubernetesVersions() == null ^ this.getKubernetesVersions() == null)
            return false;
        if (other.getKubernetesVersions() != null && other.getKubernetesVersions().equals(this.getKubernetesVersions()) == false)
            return false;
        if (other.getStatuses() == null ^ this.getStatuses() == null)
            return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategories() == null) ? 0 : getCategories().hashCode());
        hashCode = prime * hashCode + ((getKubernetesVersions() == null) ? 0 : getKubernetesVersions().hashCode());
        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode());
        return hashCode;
    }

    @Override
    public InsightsFilter clone() {
        try {
            return (InsightsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.InsightsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

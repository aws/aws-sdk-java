/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies one or more severity values and one or more status values that are used to search for insights.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/SearchInsightsFilters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchInsightsFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of severity values used to search for insights.
     * </p>
     */
    private java.util.List<String> severities;
    /**
     * <p>
     * An array of status values used to search for insights.
     * </p>
     */
    private java.util.List<String> statuses;

    private ResourceCollection resourceCollection;
    /**
     * <p>
     * A collection of the names of AWS services.
     * </p>
     */
    private ServiceCollection serviceCollection;

    /**
     * <p>
     * An array of severity values used to search for insights.
     * </p>
     * 
     * @return An array of severity values used to search for insights.
     * @see InsightSeverity
     */

    public java.util.List<String> getSeverities() {
        return severities;
    }

    /**
     * <p>
     * An array of severity values used to search for insights.
     * </p>
     * 
     * @param severities
     *        An array of severity values used to search for insights.
     * @see InsightSeverity
     */

    public void setSeverities(java.util.Collection<String> severities) {
        if (severities == null) {
            this.severities = null;
            return;
        }

        this.severities = new java.util.ArrayList<String>(severities);
    }

    /**
     * <p>
     * An array of severity values used to search for insights.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSeverities(java.util.Collection)} or {@link #withSeverities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param severities
     *        An array of severity values used to search for insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightSeverity
     */

    public SearchInsightsFilters withSeverities(String... severities) {
        if (this.severities == null) {
            setSeverities(new java.util.ArrayList<String>(severities.length));
        }
        for (String ele : severities) {
            this.severities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of severity values used to search for insights.
     * </p>
     * 
     * @param severities
     *        An array of severity values used to search for insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightSeverity
     */

    public SearchInsightsFilters withSeverities(java.util.Collection<String> severities) {
        setSeverities(severities);
        return this;
    }

    /**
     * <p>
     * An array of severity values used to search for insights.
     * </p>
     * 
     * @param severities
     *        An array of severity values used to search for insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightSeverity
     */

    public SearchInsightsFilters withSeverities(InsightSeverity... severities) {
        java.util.ArrayList<String> severitiesCopy = new java.util.ArrayList<String>(severities.length);
        for (InsightSeverity value : severities) {
            severitiesCopy.add(value.toString());
        }
        if (getSeverities() == null) {
            setSeverities(severitiesCopy);
        } else {
            getSeverities().addAll(severitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * An array of status values used to search for insights.
     * </p>
     * 
     * @return An array of status values used to search for insights.
     * @see InsightStatus
     */

    public java.util.List<String> getStatuses() {
        return statuses;
    }

    /**
     * <p>
     * An array of status values used to search for insights.
     * </p>
     * 
     * @param statuses
     *        An array of status values used to search for insights.
     * @see InsightStatus
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
     * An array of status values used to search for insights.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatuses(java.util.Collection)} or {@link #withStatuses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param statuses
     *        An array of status values used to search for insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightStatus
     */

    public SearchInsightsFilters withStatuses(String... statuses) {
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
     * An array of status values used to search for insights.
     * </p>
     * 
     * @param statuses
     *        An array of status values used to search for insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightStatus
     */

    public SearchInsightsFilters withStatuses(java.util.Collection<String> statuses) {
        setStatuses(statuses);
        return this;
    }

    /**
     * <p>
     * An array of status values used to search for insights.
     * </p>
     * 
     * @param statuses
     *        An array of status values used to search for insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightStatus
     */

    public SearchInsightsFilters withStatuses(InsightStatus... statuses) {
        java.util.ArrayList<String> statusesCopy = new java.util.ArrayList<String>(statuses.length);
        for (InsightStatus value : statuses) {
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
     * @param resourceCollection
     */

    public void setResourceCollection(ResourceCollection resourceCollection) {
        this.resourceCollection = resourceCollection;
    }

    /**
     * @return
     */

    public ResourceCollection getResourceCollection() {
        return this.resourceCollection;
    }

    /**
     * @param resourceCollection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchInsightsFilters withResourceCollection(ResourceCollection resourceCollection) {
        setResourceCollection(resourceCollection);
        return this;
    }

    /**
     * <p>
     * A collection of the names of AWS services.
     * </p>
     * 
     * @param serviceCollection
     *        A collection of the names of AWS services.
     */

    public void setServiceCollection(ServiceCollection serviceCollection) {
        this.serviceCollection = serviceCollection;
    }

    /**
     * <p>
     * A collection of the names of AWS services.
     * </p>
     * 
     * @return A collection of the names of AWS services.
     */

    public ServiceCollection getServiceCollection() {
        return this.serviceCollection;
    }

    /**
     * <p>
     * A collection of the names of AWS services.
     * </p>
     * 
     * @param serviceCollection
     *        A collection of the names of AWS services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchInsightsFilters withServiceCollection(ServiceCollection serviceCollection) {
        setServiceCollection(serviceCollection);
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
        if (getSeverities() != null)
            sb.append("Severities: ").append(getSeverities()).append(",");
        if (getStatuses() != null)
            sb.append("Statuses: ").append(getStatuses()).append(",");
        if (getResourceCollection() != null)
            sb.append("ResourceCollection: ").append(getResourceCollection()).append(",");
        if (getServiceCollection() != null)
            sb.append("ServiceCollection: ").append(getServiceCollection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchInsightsFilters == false)
            return false;
        SearchInsightsFilters other = (SearchInsightsFilters) obj;
        if (other.getSeverities() == null ^ this.getSeverities() == null)
            return false;
        if (other.getSeverities() != null && other.getSeverities().equals(this.getSeverities()) == false)
            return false;
        if (other.getStatuses() == null ^ this.getStatuses() == null)
            return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false)
            return false;
        if (other.getResourceCollection() == null ^ this.getResourceCollection() == null)
            return false;
        if (other.getResourceCollection() != null && other.getResourceCollection().equals(this.getResourceCollection()) == false)
            return false;
        if (other.getServiceCollection() == null ^ this.getServiceCollection() == null)
            return false;
        if (other.getServiceCollection() != null && other.getServiceCollection().equals(this.getServiceCollection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSeverities() == null) ? 0 : getSeverities().hashCode());
        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode());
        hashCode = prime * hashCode + ((getResourceCollection() == null) ? 0 : getResourceCollection().hashCode());
        hashCode = prime * hashCode + ((getServiceCollection() == null) ? 0 : getServiceCollection().hashCode());
        return hashCode;
    }

    @Override
    public SearchInsightsFilters clone() {
        try {
            return (SearchInsightsFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.SearchInsightsFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

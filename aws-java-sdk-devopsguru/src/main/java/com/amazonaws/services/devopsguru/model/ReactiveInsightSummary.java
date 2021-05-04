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
 * Information about a reactive insight. This object is returned by <code>DescribeInsight.</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ReactiveInsightSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReactiveInsightSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a reactive summary.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of a reactive insight.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The severity of a reactive insight.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * The status of a reactive insight.
     * </p>
     */
    private String status;

    private InsightTimeRange insightTimeRange;

    private ResourceCollection resourceCollection;
    /**
     * <p>
     * A collection of the names of AWS services.
     * </p>
     */
    private ServiceCollection serviceCollection;

    /**
     * <p>
     * The ID of a reactive summary.
     * </p>
     * 
     * @param id
     *        The ID of a reactive summary.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of a reactive summary.
     * </p>
     * 
     * @return The ID of a reactive summary.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of a reactive summary.
     * </p>
     * 
     * @param id
     *        The ID of a reactive summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactiveInsightSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of a reactive insight.
     * </p>
     * 
     * @param name
     *        The name of a reactive insight.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a reactive insight.
     * </p>
     * 
     * @return The name of a reactive insight.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a reactive insight.
     * </p>
     * 
     * @param name
     *        The name of a reactive insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactiveInsightSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The severity of a reactive insight.
     * </p>
     * 
     * @param severity
     *        The severity of a reactive insight.
     * @see InsightSeverity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of a reactive insight.
     * </p>
     * 
     * @return The severity of a reactive insight.
     * @see InsightSeverity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of a reactive insight.
     * </p>
     * 
     * @param severity
     *        The severity of a reactive insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightSeverity
     */

    public ReactiveInsightSummary withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The severity of a reactive insight.
     * </p>
     * 
     * @param severity
     *        The severity of a reactive insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightSeverity
     */

    public ReactiveInsightSummary withSeverity(InsightSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * The status of a reactive insight.
     * </p>
     * 
     * @param status
     *        The status of a reactive insight.
     * @see InsightStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a reactive insight.
     * </p>
     * 
     * @return The status of a reactive insight.
     * @see InsightStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a reactive insight.
     * </p>
     * 
     * @param status
     *        The status of a reactive insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightStatus
     */

    public ReactiveInsightSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a reactive insight.
     * </p>
     * 
     * @param status
     *        The status of a reactive insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightStatus
     */

    public ReactiveInsightSummary withStatus(InsightStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @param insightTimeRange
     */

    public void setInsightTimeRange(InsightTimeRange insightTimeRange) {
        this.insightTimeRange = insightTimeRange;
    }

    /**
     * @return
     */

    public InsightTimeRange getInsightTimeRange() {
        return this.insightTimeRange;
    }

    /**
     * @param insightTimeRange
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactiveInsightSummary withInsightTimeRange(InsightTimeRange insightTimeRange) {
        setInsightTimeRange(insightTimeRange);
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

    public ReactiveInsightSummary withResourceCollection(ResourceCollection resourceCollection) {
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

    public ReactiveInsightSummary withServiceCollection(ServiceCollection serviceCollection) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getInsightTimeRange() != null)
            sb.append("InsightTimeRange: ").append(getInsightTimeRange()).append(",");
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

        if (obj instanceof ReactiveInsightSummary == false)
            return false;
        ReactiveInsightSummary other = (ReactiveInsightSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getInsightTimeRange() == null ^ this.getInsightTimeRange() == null)
            return false;
        if (other.getInsightTimeRange() != null && other.getInsightTimeRange().equals(this.getInsightTimeRange()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getInsightTimeRange() == null) ? 0 : getInsightTimeRange().hashCode());
        hashCode = prime * hashCode + ((getResourceCollection() == null) ? 0 : getResourceCollection().hashCode());
        hashCode = prime * hashCode + ((getServiceCollection() == null) ? 0 : getServiceCollection().hashCode());
        return hashCode;
    }

    @Override
    public ReactiveInsightSummary clone() {
        try {
            return (ReactiveInsightSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.ReactiveInsightSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

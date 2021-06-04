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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetDimensionKeyDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDimensionKeyDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS service for which Performance Insights returns data. The only valid value is <code>RDS</code>.
     * </p>
     */
    private String serviceType;
    /**
     * <p>
     * The ID for a data source from which to gather dimension data. This ID must be immutable and unique within an AWS
     * Region. When a DB instance is the data source, specify its <code>DbiResourceId</code> value. For example, specify
     * <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The name of the dimension group. The only valid value is <code>db.sql</code>. Performance Insights searches the
     * specified group for the dimension group ID.
     * </p>
     */
    private String group;
    /**
     * <p>
     * The ID of the dimension group from which to retrieve dimension details. For dimension group <code>db.sql</code>,
     * the group ID is <code>db.sql.id</code>.
     * </p>
     */
    private String groupIdentifier;
    /**
     * <p>
     * A list of dimensions to retrieve the detail data for within the given dimension group. For the dimension group
     * <code>db.sql</code>, specify either the full dimension name <code>db.sql.statement</code> or the short dimension
     * name <code>statement</code>. If you don't specify this parameter, Performance Insights returns all dimension data
     * within the specified dimension group.
     * </p>
     */
    private java.util.List<String> requestedDimensions;

    /**
     * <p>
     * The AWS service for which Performance Insights returns data. The only valid value is <code>RDS</code>.
     * </p>
     * 
     * @param serviceType
     *        The AWS service for which Performance Insights returns data. The only valid value is <code>RDS</code>.
     * @see ServiceType
     */

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * The AWS service for which Performance Insights returns data. The only valid value is <code>RDS</code>.
     * </p>
     * 
     * @return The AWS service for which Performance Insights returns data. The only valid value is <code>RDS</code>.
     * @see ServiceType
     */

    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * <p>
     * The AWS service for which Performance Insights returns data. The only valid value is <code>RDS</code>.
     * </p>
     * 
     * @param serviceType
     *        The AWS service for which Performance Insights returns data. The only valid value is <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public GetDimensionKeyDetailsRequest withServiceType(String serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * The AWS service for which Performance Insights returns data. The only valid value is <code>RDS</code>.
     * </p>
     * 
     * @param serviceType
     *        The AWS service for which Performance Insights returns data. The only valid value is <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public GetDimensionKeyDetailsRequest withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID for a data source from which to gather dimension data. This ID must be immutable and unique within an AWS
     * Region. When a DB instance is the data source, specify its <code>DbiResourceId</code> value. For example, specify
     * <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     * 
     * @param identifier
     *        The ID for a data source from which to gather dimension data. This ID must be immutable and unique within
     *        an AWS Region. When a DB instance is the data source, specify its <code>DbiResourceId</code> value. For
     *        example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The ID for a data source from which to gather dimension data. This ID must be immutable and unique within an AWS
     * Region. When a DB instance is the data source, specify its <code>DbiResourceId</code> value. For example, specify
     * <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     * 
     * @return The ID for a data source from which to gather dimension data. This ID must be immutable and unique within
     *         an AWS Region. When a DB instance is the data source, specify its <code>DbiResourceId</code> value. For
     *         example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The ID for a data source from which to gather dimension data. This ID must be immutable and unique within an AWS
     * Region. When a DB instance is the data source, specify its <code>DbiResourceId</code> value. For example, specify
     * <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     * 
     * @param identifier
     *        The ID for a data source from which to gather dimension data. This ID must be immutable and unique within
     *        an AWS Region. When a DB instance is the data source, specify its <code>DbiResourceId</code> value. For
     *        example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionKeyDetailsRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The name of the dimension group. The only valid value is <code>db.sql</code>. Performance Insights searches the
     * specified group for the dimension group ID.
     * </p>
     * 
     * @param group
     *        The name of the dimension group. The only valid value is <code>db.sql</code>. Performance Insights
     *        searches the specified group for the dimension group ID.
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The name of the dimension group. The only valid value is <code>db.sql</code>. Performance Insights searches the
     * specified group for the dimension group ID.
     * </p>
     * 
     * @return The name of the dimension group. The only valid value is <code>db.sql</code>. Performance Insights
     *         searches the specified group for the dimension group ID.
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The name of the dimension group. The only valid value is <code>db.sql</code>. Performance Insights searches the
     * specified group for the dimension group ID.
     * </p>
     * 
     * @param group
     *        The name of the dimension group. The only valid value is <code>db.sql</code>. Performance Insights
     *        searches the specified group for the dimension group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionKeyDetailsRequest withGroup(String group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * The ID of the dimension group from which to retrieve dimension details. For dimension group <code>db.sql</code>,
     * the group ID is <code>db.sql.id</code>.
     * </p>
     * 
     * @param groupIdentifier
     *        The ID of the dimension group from which to retrieve dimension details. For dimension group
     *        <code>db.sql</code>, the group ID is <code>db.sql.id</code>.
     */

    public void setGroupIdentifier(String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
    }

    /**
     * <p>
     * The ID of the dimension group from which to retrieve dimension details. For dimension group <code>db.sql</code>,
     * the group ID is <code>db.sql.id</code>.
     * </p>
     * 
     * @return The ID of the dimension group from which to retrieve dimension details. For dimension group
     *         <code>db.sql</code>, the group ID is <code>db.sql.id</code>.
     */

    public String getGroupIdentifier() {
        return this.groupIdentifier;
    }

    /**
     * <p>
     * The ID of the dimension group from which to retrieve dimension details. For dimension group <code>db.sql</code>,
     * the group ID is <code>db.sql.id</code>.
     * </p>
     * 
     * @param groupIdentifier
     *        The ID of the dimension group from which to retrieve dimension details. For dimension group
     *        <code>db.sql</code>, the group ID is <code>db.sql.id</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionKeyDetailsRequest withGroupIdentifier(String groupIdentifier) {
        setGroupIdentifier(groupIdentifier);
        return this;
    }

    /**
     * <p>
     * A list of dimensions to retrieve the detail data for within the given dimension group. For the dimension group
     * <code>db.sql</code>, specify either the full dimension name <code>db.sql.statement</code> or the short dimension
     * name <code>statement</code>. If you don't specify this parameter, Performance Insights returns all dimension data
     * within the specified dimension group.
     * </p>
     * 
     * @return A list of dimensions to retrieve the detail data for within the given dimension group. For the dimension
     *         group <code>db.sql</code>, specify either the full dimension name <code>db.sql.statement</code> or the
     *         short dimension name <code>statement</code>. If you don't specify this parameter, Performance Insights
     *         returns all dimension data within the specified dimension group.
     */

    public java.util.List<String> getRequestedDimensions() {
        return requestedDimensions;
    }

    /**
     * <p>
     * A list of dimensions to retrieve the detail data for within the given dimension group. For the dimension group
     * <code>db.sql</code>, specify either the full dimension name <code>db.sql.statement</code> or the short dimension
     * name <code>statement</code>. If you don't specify this parameter, Performance Insights returns all dimension data
     * within the specified dimension group.
     * </p>
     * 
     * @param requestedDimensions
     *        A list of dimensions to retrieve the detail data for within the given dimension group. For the dimension
     *        group <code>db.sql</code>, specify either the full dimension name <code>db.sql.statement</code> or the
     *        short dimension name <code>statement</code>. If you don't specify this parameter, Performance Insights
     *        returns all dimension data within the specified dimension group.
     */

    public void setRequestedDimensions(java.util.Collection<String> requestedDimensions) {
        if (requestedDimensions == null) {
            this.requestedDimensions = null;
            return;
        }

        this.requestedDimensions = new java.util.ArrayList<String>(requestedDimensions);
    }

    /**
     * <p>
     * A list of dimensions to retrieve the detail data for within the given dimension group. For the dimension group
     * <code>db.sql</code>, specify either the full dimension name <code>db.sql.statement</code> or the short dimension
     * name <code>statement</code>. If you don't specify this parameter, Performance Insights returns all dimension data
     * within the specified dimension group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequestedDimensions(java.util.Collection)} or {@link #withRequestedDimensions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param requestedDimensions
     *        A list of dimensions to retrieve the detail data for within the given dimension group. For the dimension
     *        group <code>db.sql</code>, specify either the full dimension name <code>db.sql.statement</code> or the
     *        short dimension name <code>statement</code>. If you don't specify this parameter, Performance Insights
     *        returns all dimension data within the specified dimension group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionKeyDetailsRequest withRequestedDimensions(String... requestedDimensions) {
        if (this.requestedDimensions == null) {
            setRequestedDimensions(new java.util.ArrayList<String>(requestedDimensions.length));
        }
        for (String ele : requestedDimensions) {
            this.requestedDimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of dimensions to retrieve the detail data for within the given dimension group. For the dimension group
     * <code>db.sql</code>, specify either the full dimension name <code>db.sql.statement</code> or the short dimension
     * name <code>statement</code>. If you don't specify this parameter, Performance Insights returns all dimension data
     * within the specified dimension group.
     * </p>
     * 
     * @param requestedDimensions
     *        A list of dimensions to retrieve the detail data for within the given dimension group. For the dimension
     *        group <code>db.sql</code>, specify either the full dimension name <code>db.sql.statement</code> or the
     *        short dimension name <code>statement</code>. If you don't specify this parameter, Performance Insights
     *        returns all dimension data within the specified dimension group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionKeyDetailsRequest withRequestedDimensions(java.util.Collection<String> requestedDimensions) {
        setRequestedDimensions(requestedDimensions);
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
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup()).append(",");
        if (getGroupIdentifier() != null)
            sb.append("GroupIdentifier: ").append(getGroupIdentifier()).append(",");
        if (getRequestedDimensions() != null)
            sb.append("RequestedDimensions: ").append(getRequestedDimensions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDimensionKeyDetailsRequest == false)
            return false;
        GetDimensionKeyDetailsRequest other = (GetDimensionKeyDetailsRequest) obj;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getGroupIdentifier() == null ^ this.getGroupIdentifier() == null)
            return false;
        if (other.getGroupIdentifier() != null && other.getGroupIdentifier().equals(this.getGroupIdentifier()) == false)
            return false;
        if (other.getRequestedDimensions() == null ^ this.getRequestedDimensions() == null)
            return false;
        if (other.getRequestedDimensions() != null && other.getRequestedDimensions().equals(this.getRequestedDimensions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getGroupIdentifier() == null) ? 0 : getGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRequestedDimensions() == null) ? 0 : getRequestedDimensions().hashCode());
        return hashCode;
    }

    @Override
    public GetDimensionKeyDetailsRequest clone() {
        return (GetDimensionKeyDetailsRequest) super.clone();
    }

}

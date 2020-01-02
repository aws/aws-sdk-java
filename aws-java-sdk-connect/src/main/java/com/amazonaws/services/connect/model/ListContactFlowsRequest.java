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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactFlows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContactFlowsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The type of contact flow.
     * </p>
     */
    private java.util.List<String> contactFlowTypes;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximimum number of results to return per page.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactFlowsRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * 
     * @return The type of contact flow.
     * @see ContactFlowType
     */

    public java.util.List<String> getContactFlowTypes() {
        return contactFlowTypes;
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * 
     * @param contactFlowTypes
     *        The type of contact flow.
     * @see ContactFlowType
     */

    public void setContactFlowTypes(java.util.Collection<String> contactFlowTypes) {
        if (contactFlowTypes == null) {
            this.contactFlowTypes = null;
            return;
        }

        this.contactFlowTypes = new java.util.ArrayList<String>(contactFlowTypes);
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContactFlowTypes(java.util.Collection)} or {@link #withContactFlowTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param contactFlowTypes
     *        The type of contact flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowType
     */

    public ListContactFlowsRequest withContactFlowTypes(String... contactFlowTypes) {
        if (this.contactFlowTypes == null) {
            setContactFlowTypes(new java.util.ArrayList<String>(contactFlowTypes.length));
        }
        for (String ele : contactFlowTypes) {
            this.contactFlowTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * 
     * @param contactFlowTypes
     *        The type of contact flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowType
     */

    public ListContactFlowsRequest withContactFlowTypes(java.util.Collection<String> contactFlowTypes) {
        setContactFlowTypes(contactFlowTypes);
        return this;
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * 
     * @param contactFlowTypes
     *        The type of contact flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowType
     */

    public ListContactFlowsRequest withContactFlowTypes(ContactFlowType... contactFlowTypes) {
        java.util.ArrayList<String> contactFlowTypesCopy = new java.util.ArrayList<String>(contactFlowTypes.length);
        for (ContactFlowType value : contactFlowTypes) {
            contactFlowTypesCopy.add(value.toString());
        }
        if (getContactFlowTypes() == null) {
            setContactFlowTypes(contactFlowTypesCopy);
        } else {
            getContactFlowTypes().addAll(contactFlowTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactFlowsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximimum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximimum number of results to return per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximimum number of results to return per page.
     * </p>
     * 
     * @return The maximimum number of results to return per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximimum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximimum number of results to return per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactFlowsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getContactFlowTypes() != null)
            sb.append("ContactFlowTypes: ").append(getContactFlowTypes()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListContactFlowsRequest == false)
            return false;
        ListContactFlowsRequest other = (ListContactFlowsRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactFlowTypes() == null ^ this.getContactFlowTypes() == null)
            return false;
        if (other.getContactFlowTypes() != null && other.getContactFlowTypes().equals(this.getContactFlowTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactFlowTypes() == null) ? 0 : getContactFlowTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListContactFlowsRequest clone() {
        return (ListContactFlowsRequest) super.clone();
    }

}

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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a ListOnPremisesInstances operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListOnPremisesInstances" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOnPremisesInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The registration status of the on-premises instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deregistered: Include deregistered on-premises instances in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Registered: Include registered on-premises instances in the resulting list.
     * </p>
     * </li>
     * </ul>
     */
    private String registrationStatus;
    /**
     * <p>
     * The on-premises instance tags that are used to restrict the on-premises instance names returned.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagFilter> tagFilters;
    /**
     * <p>
     * An identifier returned from the previous list on-premises instances call. It can be used to return the next set
     * of on-premises instances in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The registration status of the on-premises instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deregistered: Include deregistered on-premises instances in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Registered: Include registered on-premises instances in the resulting list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registrationStatus
     *        The registration status of the on-premises instances:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Deregistered: Include deregistered on-premises instances in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Registered: Include registered on-premises instances in the resulting list.
     *        </p>
     *        </li>
     * @see RegistrationStatus
     */

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    /**
     * <p>
     * The registration status of the on-premises instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deregistered: Include deregistered on-premises instances in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Registered: Include registered on-premises instances in the resulting list.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The registration status of the on-premises instances:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Deregistered: Include deregistered on-premises instances in the resulting list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Registered: Include registered on-premises instances in the resulting list.
     *         </p>
     *         </li>
     * @see RegistrationStatus
     */

    public String getRegistrationStatus() {
        return this.registrationStatus;
    }

    /**
     * <p>
     * The registration status of the on-premises instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deregistered: Include deregistered on-premises instances in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Registered: Include registered on-premises instances in the resulting list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registrationStatus
     *        The registration status of the on-premises instances:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Deregistered: Include deregistered on-premises instances in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Registered: Include registered on-premises instances in the resulting list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public ListOnPremisesInstancesRequest withRegistrationStatus(String registrationStatus) {
        setRegistrationStatus(registrationStatus);
        return this;
    }

    /**
     * <p>
     * The registration status of the on-premises instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deregistered: Include deregistered on-premises instances in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Registered: Include registered on-premises instances in the resulting list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registrationStatus
     *        The registration status of the on-premises instances:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Deregistered: Include deregistered on-premises instances in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Registered: Include registered on-premises instances in the resulting list.
     *        </p>
     *        </li>
     * @see RegistrationStatus
     */

    public void setRegistrationStatus(RegistrationStatus registrationStatus) {
        withRegistrationStatus(registrationStatus);
    }

    /**
     * <p>
     * The registration status of the on-premises instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deregistered: Include deregistered on-premises instances in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Registered: Include registered on-premises instances in the resulting list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registrationStatus
     *        The registration status of the on-premises instances:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Deregistered: Include deregistered on-premises instances in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Registered: Include registered on-premises instances in the resulting list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public ListOnPremisesInstancesRequest withRegistrationStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The on-premises instance tags that are used to restrict the on-premises instance names returned.
     * </p>
     * 
     * @return The on-premises instance tags that are used to restrict the on-premises instance names returned.
     */

    public java.util.List<TagFilter> getTagFilters() {
        if (tagFilters == null) {
            tagFilters = new com.amazonaws.internal.SdkInternalList<TagFilter>();
        }
        return tagFilters;
    }

    /**
     * <p>
     * The on-premises instance tags that are used to restrict the on-premises instance names returned.
     * </p>
     * 
     * @param tagFilters
     *        The on-premises instance tags that are used to restrict the on-premises instance names returned.
     */

    public void setTagFilters(java.util.Collection<TagFilter> tagFilters) {
        if (tagFilters == null) {
            this.tagFilters = null;
            return;
        }

        this.tagFilters = new com.amazonaws.internal.SdkInternalList<TagFilter>(tagFilters);
    }

    /**
     * <p>
     * The on-premises instance tags that are used to restrict the on-premises instance names returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagFilters(java.util.Collection)} or {@link #withTagFilters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagFilters
     *        The on-premises instance tags that are used to restrict the on-premises instance names returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOnPremisesInstancesRequest withTagFilters(TagFilter... tagFilters) {
        if (this.tagFilters == null) {
            setTagFilters(new com.amazonaws.internal.SdkInternalList<TagFilter>(tagFilters.length));
        }
        for (TagFilter ele : tagFilters) {
            this.tagFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The on-premises instance tags that are used to restrict the on-premises instance names returned.
     * </p>
     * 
     * @param tagFilters
     *        The on-premises instance tags that are used to restrict the on-premises instance names returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOnPremisesInstancesRequest withTagFilters(java.util.Collection<TagFilter> tagFilters) {
        setTagFilters(tagFilters);
        return this;
    }

    /**
     * <p>
     * An identifier returned from the previous list on-premises instances call. It can be used to return the next set
     * of on-premises instances in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier returned from the previous list on-premises instances call. It can be used to return the
     *        next set of on-premises instances in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous list on-premises instances call. It can be used to return the next set
     * of on-premises instances in the list.
     * </p>
     * 
     * @return An identifier returned from the previous list on-premises instances call. It can be used to return the
     *         next set of on-premises instances in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous list on-premises instances call. It can be used to return the next set
     * of on-premises instances in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier returned from the previous list on-premises instances call. It can be used to return the
     *        next set of on-premises instances in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOnPremisesInstancesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getRegistrationStatus() != null)
            sb.append("RegistrationStatus: ").append(getRegistrationStatus()).append(",");
        if (getTagFilters() != null)
            sb.append("TagFilters: ").append(getTagFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOnPremisesInstancesRequest == false)
            return false;
        ListOnPremisesInstancesRequest other = (ListOnPremisesInstancesRequest) obj;
        if (other.getRegistrationStatus() == null ^ this.getRegistrationStatus() == null)
            return false;
        if (other.getRegistrationStatus() != null && other.getRegistrationStatus().equals(this.getRegistrationStatus()) == false)
            return false;
        if (other.getTagFilters() == null ^ this.getTagFilters() == null)
            return false;
        if (other.getTagFilters() != null && other.getTagFilters().equals(this.getTagFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistrationStatus() == null) ? 0 : getRegistrationStatus().hashCode());
        hashCode = prime * hashCode + ((getTagFilters() == null) ? 0 : getTagFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOnPremisesInstancesRequest clone() {
        return (ListOnPremisesInstancesRequest) super.clone();
    }

}

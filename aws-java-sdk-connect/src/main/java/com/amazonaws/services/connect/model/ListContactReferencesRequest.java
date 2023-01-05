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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactReferences" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContactReferencesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the initial contact.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The type of reference.
     * </p>
     */
    private java.util.List<String> referenceTypes;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * <important>
     * <p>
     * This is not expected to be set, because the value returned in the previous response is always null.
     * </p>
     * </important>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactReferencesRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the initial contact.
     * </p>
     * 
     * @param contactId
     *        The identifier of the initial contact.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the initial contact.
     * </p>
     * 
     * @return The identifier of the initial contact.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The identifier of the initial contact.
     * </p>
     * 
     * @param contactId
     *        The identifier of the initial contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactReferencesRequest withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * The type of reference.
     * </p>
     * 
     * @return The type of reference.
     * @see ReferenceType
     */

    public java.util.List<String> getReferenceTypes() {
        return referenceTypes;
    }

    /**
     * <p>
     * The type of reference.
     * </p>
     * 
     * @param referenceTypes
     *        The type of reference.
     * @see ReferenceType
     */

    public void setReferenceTypes(java.util.Collection<String> referenceTypes) {
        if (referenceTypes == null) {
            this.referenceTypes = null;
            return;
        }

        this.referenceTypes = new java.util.ArrayList<String>(referenceTypes);
    }

    /**
     * <p>
     * The type of reference.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferenceTypes(java.util.Collection)} or {@link #withReferenceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param referenceTypes
     *        The type of reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceType
     */

    public ListContactReferencesRequest withReferenceTypes(String... referenceTypes) {
        if (this.referenceTypes == null) {
            setReferenceTypes(new java.util.ArrayList<String>(referenceTypes.length));
        }
        for (String ele : referenceTypes) {
            this.referenceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of reference.
     * </p>
     * 
     * @param referenceTypes
     *        The type of reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceType
     */

    public ListContactReferencesRequest withReferenceTypes(java.util.Collection<String> referenceTypes) {
        setReferenceTypes(referenceTypes);
        return this;
    }

    /**
     * <p>
     * The type of reference.
     * </p>
     * 
     * @param referenceTypes
     *        The type of reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceType
     */

    public ListContactReferencesRequest withReferenceTypes(ReferenceType... referenceTypes) {
        java.util.ArrayList<String> referenceTypesCopy = new java.util.ArrayList<String>(referenceTypes.length);
        for (ReferenceType value : referenceTypes) {
            referenceTypesCopy.add(value.toString());
        }
        if (getReferenceTypes() == null) {
            setReferenceTypes(referenceTypesCopy);
        } else {
            getReferenceTypes().addAll(referenceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * <important>
     * <p>
     * This is not expected to be set, because the value returned in the previous response is always null.
     * </p>
     * </important>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.</p> <important>
     *        <p>
     *        This is not expected to be set, because the value returned in the previous response is always null.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * <important>
     * <p>
     * This is not expected to be set, because the value returned in the previous response is always null.
     * </p>
     * </important>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.</p> <important>
     *         <p>
     *         This is not expected to be set, because the value returned in the previous response is always null.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * <important>
     * <p>
     * This is not expected to be set, because the value returned in the previous response is always null.
     * </p>
     * </important>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.</p> <important>
     *        <p>
     *        This is not expected to be set, because the value returned in the previous response is always null.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactReferencesRequest withNextToken(String nextToken) {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getContactId() != null)
            sb.append("ContactId: ").append(getContactId()).append(",");
        if (getReferenceTypes() != null)
            sb.append("ReferenceTypes: ").append(getReferenceTypes()).append(",");
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

        if (obj instanceof ListContactReferencesRequest == false)
            return false;
        ListContactReferencesRequest other = (ListContactReferencesRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getReferenceTypes() == null ^ this.getReferenceTypes() == null)
            return false;
        if (other.getReferenceTypes() != null && other.getReferenceTypes().equals(this.getReferenceTypes()) == false)
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

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getReferenceTypes() == null) ? 0 : getReferenceTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListContactReferencesRequest clone() {
        return (ListContactReferencesRequest) super.clone();
    }

}

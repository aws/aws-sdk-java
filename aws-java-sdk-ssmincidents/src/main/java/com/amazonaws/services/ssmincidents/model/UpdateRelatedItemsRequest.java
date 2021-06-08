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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateRelatedItems" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRelatedItemsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record you are updating related items in.
     * </p>
     */
    private String incidentRecordArn;
    /**
     * <p>
     * Details about the item you are adding or deleting.
     * </p>
     */
    private RelatedItemsUpdate relatedItemsUpdate;

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param clientToken
     *        A token ensuring that the action is called only once with the specified details.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @return A token ensuring that the action is called only once with the specified details.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param clientToken
     *        A token ensuring that the action is called only once with the specified details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRelatedItemsRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record you are updating related items in.
     * </p>
     * 
     * @param incidentRecordArn
     *        The Amazon Resource Name (ARN) of the incident record you are updating related items in.
     */

    public void setIncidentRecordArn(String incidentRecordArn) {
        this.incidentRecordArn = incidentRecordArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record you are updating related items in.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the incident record you are updating related items in.
     */

    public String getIncidentRecordArn() {
        return this.incidentRecordArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record you are updating related items in.
     * </p>
     * 
     * @param incidentRecordArn
     *        The Amazon Resource Name (ARN) of the incident record you are updating related items in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRelatedItemsRequest withIncidentRecordArn(String incidentRecordArn) {
        setIncidentRecordArn(incidentRecordArn);
        return this;
    }

    /**
     * <p>
     * Details about the item you are adding or deleting.
     * </p>
     * 
     * @param relatedItemsUpdate
     *        Details about the item you are adding or deleting.
     */

    public void setRelatedItemsUpdate(RelatedItemsUpdate relatedItemsUpdate) {
        this.relatedItemsUpdate = relatedItemsUpdate;
    }

    /**
     * <p>
     * Details about the item you are adding or deleting.
     * </p>
     * 
     * @return Details about the item you are adding or deleting.
     */

    public RelatedItemsUpdate getRelatedItemsUpdate() {
        return this.relatedItemsUpdate;
    }

    /**
     * <p>
     * Details about the item you are adding or deleting.
     * </p>
     * 
     * @param relatedItemsUpdate
     *        Details about the item you are adding or deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRelatedItemsRequest withRelatedItemsUpdate(RelatedItemsUpdate relatedItemsUpdate) {
        setRelatedItemsUpdate(relatedItemsUpdate);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getIncidentRecordArn() != null)
            sb.append("IncidentRecordArn: ").append(getIncidentRecordArn()).append(",");
        if (getRelatedItemsUpdate() != null)
            sb.append("RelatedItemsUpdate: ").append(getRelatedItemsUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRelatedItemsRequest == false)
            return false;
        UpdateRelatedItemsRequest other = (UpdateRelatedItemsRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getIncidentRecordArn() == null ^ this.getIncidentRecordArn() == null)
            return false;
        if (other.getIncidentRecordArn() != null && other.getIncidentRecordArn().equals(this.getIncidentRecordArn()) == false)
            return false;
        if (other.getRelatedItemsUpdate() == null ^ this.getRelatedItemsUpdate() == null)
            return false;
        if (other.getRelatedItemsUpdate() != null && other.getRelatedItemsUpdate().equals(this.getRelatedItemsUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getIncidentRecordArn() == null) ? 0 : getIncidentRecordArn().hashCode());
        hashCode = prime * hashCode + ((getRelatedItemsUpdate() == null) ? 0 : getRelatedItemsUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRelatedItemsRequest clone() {
        return (UpdateRelatedItemsRequest) super.clone();
    }

}

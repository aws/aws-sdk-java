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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an action that occurred for a resource and produced a policy finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/FindingAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of action that occurred for the affected resource. This value is typically AWS_API_CALL, which indicates
     * that an entity invoked an API operation for the resource.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * The invocation details of the API operation that an entity invoked for the affected resource, if the value for
     * the actionType property is AWS_API_CALL.
     * </p>
     */
    private ApiCallDetails apiCallDetails;

    /**
     * <p>
     * The type of action that occurred for the affected resource. This value is typically AWS_API_CALL, which indicates
     * that an entity invoked an API operation for the resource.
     * </p>
     * 
     * @param actionType
     *        The type of action that occurred for the affected resource. This value is typically AWS_API_CALL, which
     *        indicates that an entity invoked an API operation for the resource.
     * @see FindingActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of action that occurred for the affected resource. This value is typically AWS_API_CALL, which indicates
     * that an entity invoked an API operation for the resource.
     * </p>
     * 
     * @return The type of action that occurred for the affected resource. This value is typically AWS_API_CALL, which
     *         indicates that an entity invoked an API operation for the resource.
     * @see FindingActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The type of action that occurred for the affected resource. This value is typically AWS_API_CALL, which indicates
     * that an entity invoked an API operation for the resource.
     * </p>
     * 
     * @param actionType
     *        The type of action that occurred for the affected resource. This value is typically AWS_API_CALL, which
     *        indicates that an entity invoked an API operation for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingActionType
     */

    public FindingAction withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The type of action that occurred for the affected resource. This value is typically AWS_API_CALL, which indicates
     * that an entity invoked an API operation for the resource.
     * </p>
     * 
     * @param actionType
     *        The type of action that occurred for the affected resource. This value is typically AWS_API_CALL, which
     *        indicates that an entity invoked an API operation for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingActionType
     */

    public FindingAction withActionType(FindingActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * The invocation details of the API operation that an entity invoked for the affected resource, if the value for
     * the actionType property is AWS_API_CALL.
     * </p>
     * 
     * @param apiCallDetails
     *        The invocation details of the API operation that an entity invoked for the affected resource, if the value
     *        for the actionType property is AWS_API_CALL.
     */

    public void setApiCallDetails(ApiCallDetails apiCallDetails) {
        this.apiCallDetails = apiCallDetails;
    }

    /**
     * <p>
     * The invocation details of the API operation that an entity invoked for the affected resource, if the value for
     * the actionType property is AWS_API_CALL.
     * </p>
     * 
     * @return The invocation details of the API operation that an entity invoked for the affected resource, if the
     *         value for the actionType property is AWS_API_CALL.
     */

    public ApiCallDetails getApiCallDetails() {
        return this.apiCallDetails;
    }

    /**
     * <p>
     * The invocation details of the API operation that an entity invoked for the affected resource, if the value for
     * the actionType property is AWS_API_CALL.
     * </p>
     * 
     * @param apiCallDetails
     *        The invocation details of the API operation that an entity invoked for the affected resource, if the value
     *        for the actionType property is AWS_API_CALL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingAction withApiCallDetails(ApiCallDetails apiCallDetails) {
        setApiCallDetails(apiCallDetails);
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
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getApiCallDetails() != null)
            sb.append("ApiCallDetails: ").append(getApiCallDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingAction == false)
            return false;
        FindingAction other = (FindingAction) obj;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getApiCallDetails() == null ^ this.getApiCallDetails() == null)
            return false;
        if (other.getApiCallDetails() != null && other.getApiCallDetails().equals(this.getApiCallDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getApiCallDetails() == null) ? 0 : getApiCallDetails().hashCode());
        return hashCode;
    }

    @Override
    public FindingAction clone() {
        try {
            return (FindingAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.FindingActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

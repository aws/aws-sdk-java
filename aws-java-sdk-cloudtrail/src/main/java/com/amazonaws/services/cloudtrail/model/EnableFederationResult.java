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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/EnableFederation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableFederationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the event data store for which you enabled Lake query federation.
     * </p>
     */
    private String eventDataStoreArn;
    /**
     * <p>
     * The federation status.
     * </p>
     */
    private String federationStatus;
    /**
     * <p>
     * The ARN of the federation role.
     * </p>
     */
    private String federationRoleArn;

    /**
     * <p>
     * The ARN of the event data store for which you enabled Lake query federation.
     * </p>
     * 
     * @param eventDataStoreArn
     *        The ARN of the event data store for which you enabled Lake query federation.
     */

    public void setEventDataStoreArn(String eventDataStoreArn) {
        this.eventDataStoreArn = eventDataStoreArn;
    }

    /**
     * <p>
     * The ARN of the event data store for which you enabled Lake query federation.
     * </p>
     * 
     * @return The ARN of the event data store for which you enabled Lake query federation.
     */

    public String getEventDataStoreArn() {
        return this.eventDataStoreArn;
    }

    /**
     * <p>
     * The ARN of the event data store for which you enabled Lake query federation.
     * </p>
     * 
     * @param eventDataStoreArn
     *        The ARN of the event data store for which you enabled Lake query federation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFederationResult withEventDataStoreArn(String eventDataStoreArn) {
        setEventDataStoreArn(eventDataStoreArn);
        return this;
    }

    /**
     * <p>
     * The federation status.
     * </p>
     * 
     * @param federationStatus
     *        The federation status.
     * @see FederationStatus
     */

    public void setFederationStatus(String federationStatus) {
        this.federationStatus = federationStatus;
    }

    /**
     * <p>
     * The federation status.
     * </p>
     * 
     * @return The federation status.
     * @see FederationStatus
     */

    public String getFederationStatus() {
        return this.federationStatus;
    }

    /**
     * <p>
     * The federation status.
     * </p>
     * 
     * @param federationStatus
     *        The federation status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FederationStatus
     */

    public EnableFederationResult withFederationStatus(String federationStatus) {
        setFederationStatus(federationStatus);
        return this;
    }

    /**
     * <p>
     * The federation status.
     * </p>
     * 
     * @param federationStatus
     *        The federation status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FederationStatus
     */

    public EnableFederationResult withFederationStatus(FederationStatus federationStatus) {
        this.federationStatus = federationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the federation role.
     * </p>
     * 
     * @param federationRoleArn
     *        The ARN of the federation role.
     */

    public void setFederationRoleArn(String federationRoleArn) {
        this.federationRoleArn = federationRoleArn;
    }

    /**
     * <p>
     * The ARN of the federation role.
     * </p>
     * 
     * @return The ARN of the federation role.
     */

    public String getFederationRoleArn() {
        return this.federationRoleArn;
    }

    /**
     * <p>
     * The ARN of the federation role.
     * </p>
     * 
     * @param federationRoleArn
     *        The ARN of the federation role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFederationResult withFederationRoleArn(String federationRoleArn) {
        setFederationRoleArn(federationRoleArn);
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
        if (getEventDataStoreArn() != null)
            sb.append("EventDataStoreArn: ").append(getEventDataStoreArn()).append(",");
        if (getFederationStatus() != null)
            sb.append("FederationStatus: ").append(getFederationStatus()).append(",");
        if (getFederationRoleArn() != null)
            sb.append("FederationRoleArn: ").append(getFederationRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableFederationResult == false)
            return false;
        EnableFederationResult other = (EnableFederationResult) obj;
        if (other.getEventDataStoreArn() == null ^ this.getEventDataStoreArn() == null)
            return false;
        if (other.getEventDataStoreArn() != null && other.getEventDataStoreArn().equals(this.getEventDataStoreArn()) == false)
            return false;
        if (other.getFederationStatus() == null ^ this.getFederationStatus() == null)
            return false;
        if (other.getFederationStatus() != null && other.getFederationStatus().equals(this.getFederationStatus()) == false)
            return false;
        if (other.getFederationRoleArn() == null ^ this.getFederationRoleArn() == null)
            return false;
        if (other.getFederationRoleArn() != null && other.getFederationRoleArn().equals(this.getFederationRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventDataStoreArn() == null) ? 0 : getEventDataStoreArn().hashCode());
        hashCode = prime * hashCode + ((getFederationStatus() == null) ? 0 : getFederationStatus().hashCode());
        hashCode = prime * hashCode + ((getFederationRoleArn() == null) ? 0 : getFederationRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public EnableFederationResult clone() {
        try {
            return (EnableFederationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

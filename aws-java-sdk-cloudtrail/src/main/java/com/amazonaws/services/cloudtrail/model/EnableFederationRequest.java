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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/EnableFederation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableFederationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the event data store for which you want to enable Lake query federation.
     * </p>
     */
    private String eventDataStore;
    /**
     * <p>
     * The ARN of the federation role to use for the event data store. Amazon Web Services services like Lake Formation
     * use this federation role to access data for the federated event data store. The federation role must exist in
     * your account and provide the <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html#query-federation-permissions-role"
     * >required minimum permissions</a>.
     * </p>
     */
    private String federationRoleArn;

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the event data store for which you want to enable Lake query federation.
     * </p>
     * 
     * @param eventDataStore
     *        The ARN (or ID suffix of the ARN) of the event data store for which you want to enable Lake query
     *        federation.
     */

    public void setEventDataStore(String eventDataStore) {
        this.eventDataStore = eventDataStore;
    }

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the event data store for which you want to enable Lake query federation.
     * </p>
     * 
     * @return The ARN (or ID suffix of the ARN) of the event data store for which you want to enable Lake query
     *         federation.
     */

    public String getEventDataStore() {
        return this.eventDataStore;
    }

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the event data store for which you want to enable Lake query federation.
     * </p>
     * 
     * @param eventDataStore
     *        The ARN (or ID suffix of the ARN) of the event data store for which you want to enable Lake query
     *        federation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFederationRequest withEventDataStore(String eventDataStore) {
        setEventDataStore(eventDataStore);
        return this;
    }

    /**
     * <p>
     * The ARN of the federation role to use for the event data store. Amazon Web Services services like Lake Formation
     * use this federation role to access data for the federated event data store. The federation role must exist in
     * your account and provide the <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html#query-federation-permissions-role"
     * >required minimum permissions</a>.
     * </p>
     * 
     * @param federationRoleArn
     *        The ARN of the federation role to use for the event data store. Amazon Web Services services like Lake
     *        Formation use this federation role to access data for the federated event data store. The federation role
     *        must exist in your account and provide the <a href=
     *        "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html#query-federation-permissions-role"
     *        >required minimum permissions</a>.
     */

    public void setFederationRoleArn(String federationRoleArn) {
        this.federationRoleArn = federationRoleArn;
    }

    /**
     * <p>
     * The ARN of the federation role to use for the event data store. Amazon Web Services services like Lake Formation
     * use this federation role to access data for the federated event data store. The federation role must exist in
     * your account and provide the <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html#query-federation-permissions-role"
     * >required minimum permissions</a>.
     * </p>
     * 
     * @return The ARN of the federation role to use for the event data store. Amazon Web Services services like Lake
     *         Formation use this federation role to access data for the federated event data store. The federation role
     *         must exist in your account and provide the <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html#query-federation-permissions-role"
     *         >required minimum permissions</a>.
     */

    public String getFederationRoleArn() {
        return this.federationRoleArn;
    }

    /**
     * <p>
     * The ARN of the federation role to use for the event data store. Amazon Web Services services like Lake Formation
     * use this federation role to access data for the federated event data store. The federation role must exist in
     * your account and provide the <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html#query-federation-permissions-role"
     * >required minimum permissions</a>.
     * </p>
     * 
     * @param federationRoleArn
     *        The ARN of the federation role to use for the event data store. Amazon Web Services services like Lake
     *        Formation use this federation role to access data for the federated event data store. The federation role
     *        must exist in your account and provide the <a href=
     *        "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html#query-federation-permissions-role"
     *        >required minimum permissions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFederationRequest withFederationRoleArn(String federationRoleArn) {
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
        if (getEventDataStore() != null)
            sb.append("EventDataStore: ").append(getEventDataStore()).append(",");
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

        if (obj instanceof EnableFederationRequest == false)
            return false;
        EnableFederationRequest other = (EnableFederationRequest) obj;
        if (other.getEventDataStore() == null ^ this.getEventDataStore() == null)
            return false;
        if (other.getEventDataStore() != null && other.getEventDataStore().equals(this.getEventDataStore()) == false)
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

        hashCode = prime * hashCode + ((getEventDataStore() == null) ? 0 : getEventDataStore().hashCode());
        hashCode = prime * hashCode + ((getFederationRoleArn() == null) ? 0 : getFederationRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public EnableFederationRequest clone() {
        return (EnableFederationRequest) super.clone();
    }

}

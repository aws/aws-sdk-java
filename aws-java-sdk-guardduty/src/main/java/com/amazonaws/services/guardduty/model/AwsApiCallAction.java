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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the API action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AwsApiCallAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsApiCallAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services API name.
     * </p>
     */
    private String api;
    /**
     * <p>
     * The Amazon Web Services API caller type.
     * </p>
     */
    private String callerType;
    /**
     * <p>
     * The domain information for the Amazon Web Services API call.
     * </p>
     */
    private DomainDetails domainDetails;
    /**
     * <p>
     * The error code of the failed Amazon Web Services API action.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The agent through which the API request was made.
     * </p>
     */
    private String userAgent;
    /**
     * <p>
     * The remote IP information of the connection that initiated the Amazon Web Services API call.
     * </p>
     */
    private RemoteIpDetails remoteIpDetails;
    /**
     * <p>
     * The Amazon Web Services service name whose API was invoked.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The details of the Amazon Web Services account that made the API call. This field appears if the call was made
     * from outside your account.
     * </p>
     */
    private RemoteAccountDetails remoteAccountDetails;
    /**
     * <p>
     * The details of the Amazon Web Services account that made the API call. This field identifies the resources that
     * were affected by this API call.
     * </p>
     */
    private java.util.Map<String, String> affectedResources;

    /**
     * <p>
     * The Amazon Web Services API name.
     * </p>
     * 
     * @param api
     *        The Amazon Web Services API name.
     */

    public void setApi(String api) {
        this.api = api;
    }

    /**
     * <p>
     * The Amazon Web Services API name.
     * </p>
     * 
     * @return The Amazon Web Services API name.
     */

    public String getApi() {
        return this.api;
    }

    /**
     * <p>
     * The Amazon Web Services API name.
     * </p>
     * 
     * @param api
     *        The Amazon Web Services API name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withApi(String api) {
        setApi(api);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services API caller type.
     * </p>
     * 
     * @param callerType
     *        The Amazon Web Services API caller type.
     */

    public void setCallerType(String callerType) {
        this.callerType = callerType;
    }

    /**
     * <p>
     * The Amazon Web Services API caller type.
     * </p>
     * 
     * @return The Amazon Web Services API caller type.
     */

    public String getCallerType() {
        return this.callerType;
    }

    /**
     * <p>
     * The Amazon Web Services API caller type.
     * </p>
     * 
     * @param callerType
     *        The Amazon Web Services API caller type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withCallerType(String callerType) {
        setCallerType(callerType);
        return this;
    }

    /**
     * <p>
     * The domain information for the Amazon Web Services API call.
     * </p>
     * 
     * @param domainDetails
     *        The domain information for the Amazon Web Services API call.
     */

    public void setDomainDetails(DomainDetails domainDetails) {
        this.domainDetails = domainDetails;
    }

    /**
     * <p>
     * The domain information for the Amazon Web Services API call.
     * </p>
     * 
     * @return The domain information for the Amazon Web Services API call.
     */

    public DomainDetails getDomainDetails() {
        return this.domainDetails;
    }

    /**
     * <p>
     * The domain information for the Amazon Web Services API call.
     * </p>
     * 
     * @param domainDetails
     *        The domain information for the Amazon Web Services API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withDomainDetails(DomainDetails domainDetails) {
        setDomainDetails(domainDetails);
        return this;
    }

    /**
     * <p>
     * The error code of the failed Amazon Web Services API action.
     * </p>
     * 
     * @param errorCode
     *        The error code of the failed Amazon Web Services API action.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code of the failed Amazon Web Services API action.
     * </p>
     * 
     * @return The error code of the failed Amazon Web Services API action.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code of the failed Amazon Web Services API action.
     * </p>
     * 
     * @param errorCode
     *        The error code of the failed Amazon Web Services API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The agent through which the API request was made.
     * </p>
     * 
     * @param userAgent
     *        The agent through which the API request was made.
     */

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * <p>
     * The agent through which the API request was made.
     * </p>
     * 
     * @return The agent through which the API request was made.
     */

    public String getUserAgent() {
        return this.userAgent;
    }

    /**
     * <p>
     * The agent through which the API request was made.
     * </p>
     * 
     * @param userAgent
     *        The agent through which the API request was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withUserAgent(String userAgent) {
        setUserAgent(userAgent);
        return this;
    }

    /**
     * <p>
     * The remote IP information of the connection that initiated the Amazon Web Services API call.
     * </p>
     * 
     * @param remoteIpDetails
     *        The remote IP information of the connection that initiated the Amazon Web Services API call.
     */

    public void setRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        this.remoteIpDetails = remoteIpDetails;
    }

    /**
     * <p>
     * The remote IP information of the connection that initiated the Amazon Web Services API call.
     * </p>
     * 
     * @return The remote IP information of the connection that initiated the Amazon Web Services API call.
     */

    public RemoteIpDetails getRemoteIpDetails() {
        return this.remoteIpDetails;
    }

    /**
     * <p>
     * The remote IP information of the connection that initiated the Amazon Web Services API call.
     * </p>
     * 
     * @param remoteIpDetails
     *        The remote IP information of the connection that initiated the Amazon Web Services API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        setRemoteIpDetails(remoteIpDetails);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services service name whose API was invoked.
     * </p>
     * 
     * @param serviceName
     *        The Amazon Web Services service name whose API was invoked.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The Amazon Web Services service name whose API was invoked.
     * </p>
     * 
     * @return The Amazon Web Services service name whose API was invoked.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The Amazon Web Services service name whose API was invoked.
     * </p>
     * 
     * @param serviceName
     *        The Amazon Web Services service name whose API was invoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The details of the Amazon Web Services account that made the API call. This field appears if the call was made
     * from outside your account.
     * </p>
     * 
     * @param remoteAccountDetails
     *        The details of the Amazon Web Services account that made the API call. This field appears if the call was
     *        made from outside your account.
     */

    public void setRemoteAccountDetails(RemoteAccountDetails remoteAccountDetails) {
        this.remoteAccountDetails = remoteAccountDetails;
    }

    /**
     * <p>
     * The details of the Amazon Web Services account that made the API call. This field appears if the call was made
     * from outside your account.
     * </p>
     * 
     * @return The details of the Amazon Web Services account that made the API call. This field appears if the call was
     *         made from outside your account.
     */

    public RemoteAccountDetails getRemoteAccountDetails() {
        return this.remoteAccountDetails;
    }

    /**
     * <p>
     * The details of the Amazon Web Services account that made the API call. This field appears if the call was made
     * from outside your account.
     * </p>
     * 
     * @param remoteAccountDetails
     *        The details of the Amazon Web Services account that made the API call. This field appears if the call was
     *        made from outside your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withRemoteAccountDetails(RemoteAccountDetails remoteAccountDetails) {
        setRemoteAccountDetails(remoteAccountDetails);
        return this;
    }

    /**
     * <p>
     * The details of the Amazon Web Services account that made the API call. This field identifies the resources that
     * were affected by this API call.
     * </p>
     * 
     * @return The details of the Amazon Web Services account that made the API call. This field identifies the
     *         resources that were affected by this API call.
     */

    public java.util.Map<String, String> getAffectedResources() {
        return affectedResources;
    }

    /**
     * <p>
     * The details of the Amazon Web Services account that made the API call. This field identifies the resources that
     * were affected by this API call.
     * </p>
     * 
     * @param affectedResources
     *        The details of the Amazon Web Services account that made the API call. This field identifies the resources
     *        that were affected by this API call.
     */

    public void setAffectedResources(java.util.Map<String, String> affectedResources) {
        this.affectedResources = affectedResources;
    }

    /**
     * <p>
     * The details of the Amazon Web Services account that made the API call. This field identifies the resources that
     * were affected by this API call.
     * </p>
     * 
     * @param affectedResources
     *        The details of the Amazon Web Services account that made the API call. This field identifies the resources
     *        that were affected by this API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withAffectedResources(java.util.Map<String, String> affectedResources) {
        setAffectedResources(affectedResources);
        return this;
    }

    /**
     * Add a single AffectedResources entry
     *
     * @see AwsApiCallAction#withAffectedResources
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction addAffectedResourcesEntry(String key, String value) {
        if (null == this.affectedResources) {
            this.affectedResources = new java.util.HashMap<String, String>();
        }
        if (this.affectedResources.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.affectedResources.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AffectedResources.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction clearAffectedResourcesEntries() {
        this.affectedResources = null;
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
        if (getApi() != null)
            sb.append("Api: ").append(getApi()).append(",");
        if (getCallerType() != null)
            sb.append("CallerType: ").append(getCallerType()).append(",");
        if (getDomainDetails() != null)
            sb.append("DomainDetails: ").append(getDomainDetails()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getUserAgent() != null)
            sb.append("UserAgent: ").append(getUserAgent()).append(",");
        if (getRemoteIpDetails() != null)
            sb.append("RemoteIpDetails: ").append(getRemoteIpDetails()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getRemoteAccountDetails() != null)
            sb.append("RemoteAccountDetails: ").append(getRemoteAccountDetails()).append(",");
        if (getAffectedResources() != null)
            sb.append("AffectedResources: ").append(getAffectedResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsApiCallAction == false)
            return false;
        AwsApiCallAction other = (AwsApiCallAction) obj;
        if (other.getApi() == null ^ this.getApi() == null)
            return false;
        if (other.getApi() != null && other.getApi().equals(this.getApi()) == false)
            return false;
        if (other.getCallerType() == null ^ this.getCallerType() == null)
            return false;
        if (other.getCallerType() != null && other.getCallerType().equals(this.getCallerType()) == false)
            return false;
        if (other.getDomainDetails() == null ^ this.getDomainDetails() == null)
            return false;
        if (other.getDomainDetails() != null && other.getDomainDetails().equals(this.getDomainDetails()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getUserAgent() == null ^ this.getUserAgent() == null)
            return false;
        if (other.getUserAgent() != null && other.getUserAgent().equals(this.getUserAgent()) == false)
            return false;
        if (other.getRemoteIpDetails() == null ^ this.getRemoteIpDetails() == null)
            return false;
        if (other.getRemoteIpDetails() != null && other.getRemoteIpDetails().equals(this.getRemoteIpDetails()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getRemoteAccountDetails() == null ^ this.getRemoteAccountDetails() == null)
            return false;
        if (other.getRemoteAccountDetails() != null && other.getRemoteAccountDetails().equals(this.getRemoteAccountDetails()) == false)
            return false;
        if (other.getAffectedResources() == null ^ this.getAffectedResources() == null)
            return false;
        if (other.getAffectedResources() != null && other.getAffectedResources().equals(this.getAffectedResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApi() == null) ? 0 : getApi().hashCode());
        hashCode = prime * hashCode + ((getCallerType() == null) ? 0 : getCallerType().hashCode());
        hashCode = prime * hashCode + ((getDomainDetails() == null) ? 0 : getDomainDetails().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getUserAgent() == null) ? 0 : getUserAgent().hashCode());
        hashCode = prime * hashCode + ((getRemoteIpDetails() == null) ? 0 : getRemoteIpDetails().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getRemoteAccountDetails() == null) ? 0 : getRemoteAccountDetails().hashCode());
        hashCode = prime * hashCode + ((getAffectedResources() == null) ? 0 : getAffectedResources().hashCode());
        return hashCode;
    }

    @Override
    public AwsApiCallAction clone() {
        try {
            return (AwsApiCallAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.AwsApiCallActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provided if <code>ActionType</code> is <code>AWS_API_CALL</code>. It provides details about the API call that was
 * detected.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsApiCallAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsApiCallAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the API method that was issued.
     * </p>
     */
    private String api;
    /**
     * <p>
     * The name of the AWS service that the API method belongs to.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * Indicates whether the API call originated from a remote IP address (<code>remoteip</code>) or from a DNS domain (
     * <code>domain</code>).
     * </p>
     */
    private String callerType;
    /**
     * <p>
     * Provided if <code>CallerType</code> is <code>remoteIp</code>. Provides information about the remote IP address
     * that the API call originated from.
     * </p>
     */
    private ActionRemoteIpDetails remoteIpDetails;
    /**
     * <p>
     * Provided if <code>CallerType</code> is <code>domain</code>. Provides information about the DNS domain that the
     * API call originated from.
     * </p>
     */
    private AwsApiCallActionDomainDetails domainDetails;
    /**
     * <p>
     * Identifies the resources that were affected by the API call.
     * </p>
     */
    private java.util.Map<String, String> affectedResources;
    /**
     * <p>
     * An ISO8601-formatted timestamp that indicates when the API call was first observed.
     * </p>
     */
    private String firstSeen;
    /**
     * <p>
     * An ISO8601-formatted timestamp that indicates when the API call was most recently observed.
     * </p>
     */
    private String lastSeen;

    /**
     * <p>
     * The name of the API method that was issued.
     * </p>
     * 
     * @param api
     *        The name of the API method that was issued.
     */

    public void setApi(String api) {
        this.api = api;
    }

    /**
     * <p>
     * The name of the API method that was issued.
     * </p>
     * 
     * @return The name of the API method that was issued.
     */

    public String getApi() {
        return this.api;
    }

    /**
     * <p>
     * The name of the API method that was issued.
     * </p>
     * 
     * @param api
     *        The name of the API method that was issued.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withApi(String api) {
        setApi(api);
        return this;
    }

    /**
     * <p>
     * The name of the AWS service that the API method belongs to.
     * </p>
     * 
     * @param serviceName
     *        The name of the AWS service that the API method belongs to.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the AWS service that the API method belongs to.
     * </p>
     * 
     * @return The name of the AWS service that the API method belongs to.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the AWS service that the API method belongs to.
     * </p>
     * 
     * @param serviceName
     *        The name of the AWS service that the API method belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the API call originated from a remote IP address (<code>remoteip</code>) or from a DNS domain (
     * <code>domain</code>).
     * </p>
     * 
     * @param callerType
     *        Indicates whether the API call originated from a remote IP address (<code>remoteip</code>) or from a DNS
     *        domain (<code>domain</code>).
     */

    public void setCallerType(String callerType) {
        this.callerType = callerType;
    }

    /**
     * <p>
     * Indicates whether the API call originated from a remote IP address (<code>remoteip</code>) or from a DNS domain (
     * <code>domain</code>).
     * </p>
     * 
     * @return Indicates whether the API call originated from a remote IP address (<code>remoteip</code>) or from a DNS
     *         domain (<code>domain</code>).
     */

    public String getCallerType() {
        return this.callerType;
    }

    /**
     * <p>
     * Indicates whether the API call originated from a remote IP address (<code>remoteip</code>) or from a DNS domain (
     * <code>domain</code>).
     * </p>
     * 
     * @param callerType
     *        Indicates whether the API call originated from a remote IP address (<code>remoteip</code>) or from a DNS
     *        domain (<code>domain</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withCallerType(String callerType) {
        setCallerType(callerType);
        return this;
    }

    /**
     * <p>
     * Provided if <code>CallerType</code> is <code>remoteIp</code>. Provides information about the remote IP address
     * that the API call originated from.
     * </p>
     * 
     * @param remoteIpDetails
     *        Provided if <code>CallerType</code> is <code>remoteIp</code>. Provides information about the remote IP
     *        address that the API call originated from.
     */

    public void setRemoteIpDetails(ActionRemoteIpDetails remoteIpDetails) {
        this.remoteIpDetails = remoteIpDetails;
    }

    /**
     * <p>
     * Provided if <code>CallerType</code> is <code>remoteIp</code>. Provides information about the remote IP address
     * that the API call originated from.
     * </p>
     * 
     * @return Provided if <code>CallerType</code> is <code>remoteIp</code>. Provides information about the remote IP
     *         address that the API call originated from.
     */

    public ActionRemoteIpDetails getRemoteIpDetails() {
        return this.remoteIpDetails;
    }

    /**
     * <p>
     * Provided if <code>CallerType</code> is <code>remoteIp</code>. Provides information about the remote IP address
     * that the API call originated from.
     * </p>
     * 
     * @param remoteIpDetails
     *        Provided if <code>CallerType</code> is <code>remoteIp</code>. Provides information about the remote IP
     *        address that the API call originated from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withRemoteIpDetails(ActionRemoteIpDetails remoteIpDetails) {
        setRemoteIpDetails(remoteIpDetails);
        return this;
    }

    /**
     * <p>
     * Provided if <code>CallerType</code> is <code>domain</code>. Provides information about the DNS domain that the
     * API call originated from.
     * </p>
     * 
     * @param domainDetails
     *        Provided if <code>CallerType</code> is <code>domain</code>. Provides information about the DNS domain that
     *        the API call originated from.
     */

    public void setDomainDetails(AwsApiCallActionDomainDetails domainDetails) {
        this.domainDetails = domainDetails;
    }

    /**
     * <p>
     * Provided if <code>CallerType</code> is <code>domain</code>. Provides information about the DNS domain that the
     * API call originated from.
     * </p>
     * 
     * @return Provided if <code>CallerType</code> is <code>domain</code>. Provides information about the DNS domain
     *         that the API call originated from.
     */

    public AwsApiCallActionDomainDetails getDomainDetails() {
        return this.domainDetails;
    }

    /**
     * <p>
     * Provided if <code>CallerType</code> is <code>domain</code>. Provides information about the DNS domain that the
     * API call originated from.
     * </p>
     * 
     * @param domainDetails
     *        Provided if <code>CallerType</code> is <code>domain</code>. Provides information about the DNS domain that
     *        the API call originated from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withDomainDetails(AwsApiCallActionDomainDetails domainDetails) {
        setDomainDetails(domainDetails);
        return this;
    }

    /**
     * <p>
     * Identifies the resources that were affected by the API call.
     * </p>
     * 
     * @return Identifies the resources that were affected by the API call.
     */

    public java.util.Map<String, String> getAffectedResources() {
        return affectedResources;
    }

    /**
     * <p>
     * Identifies the resources that were affected by the API call.
     * </p>
     * 
     * @param affectedResources
     *        Identifies the resources that were affected by the API call.
     */

    public void setAffectedResources(java.util.Map<String, String> affectedResources) {
        this.affectedResources = affectedResources;
    }

    /**
     * <p>
     * Identifies the resources that were affected by the API call.
     * </p>
     * 
     * @param affectedResources
     *        Identifies the resources that were affected by the API call.
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
     * <p>
     * An ISO8601-formatted timestamp that indicates when the API call was first observed.
     * </p>
     * 
     * @param firstSeen
     *        An ISO8601-formatted timestamp that indicates when the API call was first observed.
     */

    public void setFirstSeen(String firstSeen) {
        this.firstSeen = firstSeen;
    }

    /**
     * <p>
     * An ISO8601-formatted timestamp that indicates when the API call was first observed.
     * </p>
     * 
     * @return An ISO8601-formatted timestamp that indicates when the API call was first observed.
     */

    public String getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * <p>
     * An ISO8601-formatted timestamp that indicates when the API call was first observed.
     * </p>
     * 
     * @param firstSeen
     *        An ISO8601-formatted timestamp that indicates when the API call was first observed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withFirstSeen(String firstSeen) {
        setFirstSeen(firstSeen);
        return this;
    }

    /**
     * <p>
     * An ISO8601-formatted timestamp that indicates when the API call was most recently observed.
     * </p>
     * 
     * @param lastSeen
     *        An ISO8601-formatted timestamp that indicates when the API call was most recently observed.
     */

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    /**
     * <p>
     * An ISO8601-formatted timestamp that indicates when the API call was most recently observed.
     * </p>
     * 
     * @return An ISO8601-formatted timestamp that indicates when the API call was most recently observed.
     */

    public String getLastSeen() {
        return this.lastSeen;
    }

    /**
     * <p>
     * An ISO8601-formatted timestamp that indicates when the API call was most recently observed.
     * </p>
     * 
     * @param lastSeen
     *        An ISO8601-formatted timestamp that indicates when the API call was most recently observed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withLastSeen(String lastSeen) {
        setLastSeen(lastSeen);
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
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getCallerType() != null)
            sb.append("CallerType: ").append(getCallerType()).append(",");
        if (getRemoteIpDetails() != null)
            sb.append("RemoteIpDetails: ").append(getRemoteIpDetails()).append(",");
        if (getDomainDetails() != null)
            sb.append("DomainDetails: ").append(getDomainDetails()).append(",");
        if (getAffectedResources() != null)
            sb.append("AffectedResources: ").append(getAffectedResources()).append(",");
        if (getFirstSeen() != null)
            sb.append("FirstSeen: ").append(getFirstSeen()).append(",");
        if (getLastSeen() != null)
            sb.append("LastSeen: ").append(getLastSeen());
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
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getCallerType() == null ^ this.getCallerType() == null)
            return false;
        if (other.getCallerType() != null && other.getCallerType().equals(this.getCallerType()) == false)
            return false;
        if (other.getRemoteIpDetails() == null ^ this.getRemoteIpDetails() == null)
            return false;
        if (other.getRemoteIpDetails() != null && other.getRemoteIpDetails().equals(this.getRemoteIpDetails()) == false)
            return false;
        if (other.getDomainDetails() == null ^ this.getDomainDetails() == null)
            return false;
        if (other.getDomainDetails() != null && other.getDomainDetails().equals(this.getDomainDetails()) == false)
            return false;
        if (other.getAffectedResources() == null ^ this.getAffectedResources() == null)
            return false;
        if (other.getAffectedResources() != null && other.getAffectedResources().equals(this.getAffectedResources()) == false)
            return false;
        if (other.getFirstSeen() == null ^ this.getFirstSeen() == null)
            return false;
        if (other.getFirstSeen() != null && other.getFirstSeen().equals(this.getFirstSeen()) == false)
            return false;
        if (other.getLastSeen() == null ^ this.getLastSeen() == null)
            return false;
        if (other.getLastSeen() != null && other.getLastSeen().equals(this.getLastSeen()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApi() == null) ? 0 : getApi().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getCallerType() == null) ? 0 : getCallerType().hashCode());
        hashCode = prime * hashCode + ((getRemoteIpDetails() == null) ? 0 : getRemoteIpDetails().hashCode());
        hashCode = prime * hashCode + ((getDomainDetails() == null) ? 0 : getDomainDetails().hashCode());
        hashCode = prime * hashCode + ((getAffectedResources() == null) ? 0 : getAffectedResources().hashCode());
        hashCode = prime * hashCode + ((getFirstSeen() == null) ? 0 : getFirstSeen().hashCode());
        hashCode = prime * hashCode + ((getLastSeen() == null) ? 0 : getLastSeen().hashCode());
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
        com.amazonaws.services.securityhub.model.transform.AwsApiCallActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

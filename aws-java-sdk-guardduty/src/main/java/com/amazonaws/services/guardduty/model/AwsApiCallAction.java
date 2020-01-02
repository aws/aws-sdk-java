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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the API operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AwsApiCallAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsApiCallAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * AWS API name.
     * </p>
     */
    private String api;
    /**
     * <p>
     * AWS API caller type.
     * </p>
     */
    private String callerType;
    /**
     * <p>
     * Domain information for the AWS API call.
     * </p>
     */
    private DomainDetails domainDetails;
    /**
     * <p>
     * Remote IP information of the connection.
     * </p>
     */
    private RemoteIpDetails remoteIpDetails;
    /**
     * <p>
     * AWS service name whose API was invoked.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * AWS API name.
     * </p>
     * 
     * @param api
     *        AWS API name.
     */

    public void setApi(String api) {
        this.api = api;
    }

    /**
     * <p>
     * AWS API name.
     * </p>
     * 
     * @return AWS API name.
     */

    public String getApi() {
        return this.api;
    }

    /**
     * <p>
     * AWS API name.
     * </p>
     * 
     * @param api
     *        AWS API name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withApi(String api) {
        setApi(api);
        return this;
    }

    /**
     * <p>
     * AWS API caller type.
     * </p>
     * 
     * @param callerType
     *        AWS API caller type.
     */

    public void setCallerType(String callerType) {
        this.callerType = callerType;
    }

    /**
     * <p>
     * AWS API caller type.
     * </p>
     * 
     * @return AWS API caller type.
     */

    public String getCallerType() {
        return this.callerType;
    }

    /**
     * <p>
     * AWS API caller type.
     * </p>
     * 
     * @param callerType
     *        AWS API caller type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withCallerType(String callerType) {
        setCallerType(callerType);
        return this;
    }

    /**
     * <p>
     * Domain information for the AWS API call.
     * </p>
     * 
     * @param domainDetails
     *        Domain information for the AWS API call.
     */

    public void setDomainDetails(DomainDetails domainDetails) {
        this.domainDetails = domainDetails;
    }

    /**
     * <p>
     * Domain information for the AWS API call.
     * </p>
     * 
     * @return Domain information for the AWS API call.
     */

    public DomainDetails getDomainDetails() {
        return this.domainDetails;
    }

    /**
     * <p>
     * Domain information for the AWS API call.
     * </p>
     * 
     * @param domainDetails
     *        Domain information for the AWS API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withDomainDetails(DomainDetails domainDetails) {
        setDomainDetails(domainDetails);
        return this;
    }

    /**
     * <p>
     * Remote IP information of the connection.
     * </p>
     * 
     * @param remoteIpDetails
     *        Remote IP information of the connection.
     */

    public void setRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        this.remoteIpDetails = remoteIpDetails;
    }

    /**
     * <p>
     * Remote IP information of the connection.
     * </p>
     * 
     * @return Remote IP information of the connection.
     */

    public RemoteIpDetails getRemoteIpDetails() {
        return this.remoteIpDetails;
    }

    /**
     * <p>
     * Remote IP information of the connection.
     * </p>
     * 
     * @param remoteIpDetails
     *        Remote IP information of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        setRemoteIpDetails(remoteIpDetails);
        return this;
    }

    /**
     * <p>
     * AWS service name whose API was invoked.
     * </p>
     * 
     * @param serviceName
     *        AWS service name whose API was invoked.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * AWS service name whose API was invoked.
     * </p>
     * 
     * @return AWS service name whose API was invoked.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * AWS service name whose API was invoked.
     * </p>
     * 
     * @param serviceName
     *        AWS service name whose API was invoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiCallAction withServiceName(String serviceName) {
        setServiceName(serviceName);
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
        if (getRemoteIpDetails() != null)
            sb.append("RemoteIpDetails: ").append(getRemoteIpDetails()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName());
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
        if (other.getRemoteIpDetails() == null ^ this.getRemoteIpDetails() == null)
            return false;
        if (other.getRemoteIpDetails() != null && other.getRemoteIpDetails().equals(this.getRemoteIpDetails()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
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
        hashCode = prime * hashCode + ((getRemoteIpDetails() == null) ? 0 : getRemoteIpDetails().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
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

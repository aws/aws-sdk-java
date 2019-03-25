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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetProtectionStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProtectionStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS Firewall administrator account for this policy.
     * </p>
     */
    private String adminAccountId;
    /**
     * <p>
     * The service type that is protected by the policy. Currently, this is always <code>SHIELD_ADVANCED</code>.
     * </p>
     */
    private String serviceType;
    /**
     * <p>
     * Details about the attack, including the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Attack type
     * </p>
     * </li>
     * <li>
     * <p>
     * Account ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of the resource attacked
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time of the attack
     * </p>
     * </li>
     * <li>
     * <p>
     * End time of the attack (ongoing attacks will not have an end time)
     * </p>
     * </li>
     * </ul>
     * <p>
     * The details are in JSON format. An example is shown in the Examples section below.
     * </p>
     */
    private String data;
    /**
     * <p>
     * If you have more objects than the number that you specified for <code>MaxResults</code> in the request, the
     * response includes a <code>NextToken</code> value. To list more objects, submit another
     * <code>GetProtectionStatus</code> request, and specify the <code>NextToken</code> value from the response in the
     * <code>NextToken</code> value in the next request.
     * </p>
     * <p>
     * AWS SDKs provide auto-pagination that identify <code>NextToken</code> in a response and make subsequent request
     * calls automatically on your behalf. However, this feature is not supported by <code>GetProtectionStatus</code>.
     * You must submit subsequent requests with <code>NextToken</code> using your own processes.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the AWS Firewall administrator account for this policy.
     * </p>
     * 
     * @param adminAccountId
     *        The ID of the AWS Firewall administrator account for this policy.
     */

    public void setAdminAccountId(String adminAccountId) {
        this.adminAccountId = adminAccountId;
    }

    /**
     * <p>
     * The ID of the AWS Firewall administrator account for this policy.
     * </p>
     * 
     * @return The ID of the AWS Firewall administrator account for this policy.
     */

    public String getAdminAccountId() {
        return this.adminAccountId;
    }

    /**
     * <p>
     * The ID of the AWS Firewall administrator account for this policy.
     * </p>
     * 
     * @param adminAccountId
     *        The ID of the AWS Firewall administrator account for this policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProtectionStatusResult withAdminAccountId(String adminAccountId) {
        setAdminAccountId(adminAccountId);
        return this;
    }

    /**
     * <p>
     * The service type that is protected by the policy. Currently, this is always <code>SHIELD_ADVANCED</code>.
     * </p>
     * 
     * @param serviceType
     *        The service type that is protected by the policy. Currently, this is always <code>SHIELD_ADVANCED</code>.
     * @see SecurityServiceType
     */

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * The service type that is protected by the policy. Currently, this is always <code>SHIELD_ADVANCED</code>.
     * </p>
     * 
     * @return The service type that is protected by the policy. Currently, this is always <code>SHIELD_ADVANCED</code>.
     * @see SecurityServiceType
     */

    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * <p>
     * The service type that is protected by the policy. Currently, this is always <code>SHIELD_ADVANCED</code>.
     * </p>
     * 
     * @param serviceType
     *        The service type that is protected by the policy. Currently, this is always <code>SHIELD_ADVANCED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityServiceType
     */

    public GetProtectionStatusResult withServiceType(String serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * The service type that is protected by the policy. Currently, this is always <code>SHIELD_ADVANCED</code>.
     * </p>
     * 
     * @param serviceType
     *        The service type that is protected by the policy. Currently, this is always <code>SHIELD_ADVANCED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityServiceType
     */

    public GetProtectionStatusResult withServiceType(SecurityServiceType serviceType) {
        this.serviceType = serviceType.toString();
        return this;
    }

    /**
     * <p>
     * Details about the attack, including the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Attack type
     * </p>
     * </li>
     * <li>
     * <p>
     * Account ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of the resource attacked
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time of the attack
     * </p>
     * </li>
     * <li>
     * <p>
     * End time of the attack (ongoing attacks will not have an end time)
     * </p>
     * </li>
     * </ul>
     * <p>
     * The details are in JSON format. An example is shown in the Examples section below.
     * </p>
     * 
     * @param data
     *        Details about the attack, including the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Attack type
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Account ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN of the resource attacked
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time of the attack
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        End time of the attack (ongoing attacks will not have an end time)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The details are in JSON format. An example is shown in the Examples section below.
     */

    public void setData(String data) {
        this.data = data;
    }

    /**
     * <p>
     * Details about the attack, including the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Attack type
     * </p>
     * </li>
     * <li>
     * <p>
     * Account ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of the resource attacked
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time of the attack
     * </p>
     * </li>
     * <li>
     * <p>
     * End time of the attack (ongoing attacks will not have an end time)
     * </p>
     * </li>
     * </ul>
     * <p>
     * The details are in JSON format. An example is shown in the Examples section below.
     * </p>
     * 
     * @return Details about the attack, including the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Attack type
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Account ID
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN of the resource attacked
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start time of the attack
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         End time of the attack (ongoing attacks will not have an end time)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The details are in JSON format. An example is shown in the Examples section below.
     */

    public String getData() {
        return this.data;
    }

    /**
     * <p>
     * Details about the attack, including the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Attack type
     * </p>
     * </li>
     * <li>
     * <p>
     * Account ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of the resource attacked
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time of the attack
     * </p>
     * </li>
     * <li>
     * <p>
     * End time of the attack (ongoing attacks will not have an end time)
     * </p>
     * </li>
     * </ul>
     * <p>
     * The details are in JSON format. An example is shown in the Examples section below.
     * </p>
     * 
     * @param data
     *        Details about the attack, including the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Attack type
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Account ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN of the resource attacked
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time of the attack
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        End time of the attack (ongoing attacks will not have an end time)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The details are in JSON format. An example is shown in the Examples section below.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProtectionStatusResult withData(String data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * If you have more objects than the number that you specified for <code>MaxResults</code> in the request, the
     * response includes a <code>NextToken</code> value. To list more objects, submit another
     * <code>GetProtectionStatus</code> request, and specify the <code>NextToken</code> value from the response in the
     * <code>NextToken</code> value in the next request.
     * </p>
     * <p>
     * AWS SDKs provide auto-pagination that identify <code>NextToken</code> in a response and make subsequent request
     * calls automatically on your behalf. However, this feature is not supported by <code>GetProtectionStatus</code>.
     * You must submit subsequent requests with <code>NextToken</code> using your own processes.
     * </p>
     * 
     * @param nextToken
     *        If you have more objects than the number that you specified for <code>MaxResults</code> in the request,
     *        the response includes a <code>NextToken</code> value. To list more objects, submit another
     *        <code>GetProtectionStatus</code> request, and specify the <code>NextToken</code> value from the response
     *        in the <code>NextToken</code> value in the next request.</p>
     *        <p>
     *        AWS SDKs provide auto-pagination that identify <code>NextToken</code> in a response and make subsequent
     *        request calls automatically on your behalf. However, this feature is not supported by
     *        <code>GetProtectionStatus</code>. You must submit subsequent requests with <code>NextToken</code> using
     *        your own processes.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you have more objects than the number that you specified for <code>MaxResults</code> in the request, the
     * response includes a <code>NextToken</code> value. To list more objects, submit another
     * <code>GetProtectionStatus</code> request, and specify the <code>NextToken</code> value from the response in the
     * <code>NextToken</code> value in the next request.
     * </p>
     * <p>
     * AWS SDKs provide auto-pagination that identify <code>NextToken</code> in a response and make subsequent request
     * calls automatically on your behalf. However, this feature is not supported by <code>GetProtectionStatus</code>.
     * You must submit subsequent requests with <code>NextToken</code> using your own processes.
     * </p>
     * 
     * @return If you have more objects than the number that you specified for <code>MaxResults</code> in the request,
     *         the response includes a <code>NextToken</code> value. To list more objects, submit another
     *         <code>GetProtectionStatus</code> request, and specify the <code>NextToken</code> value from the response
     *         in the <code>NextToken</code> value in the next request.</p>
     *         <p>
     *         AWS SDKs provide auto-pagination that identify <code>NextToken</code> in a response and make subsequent
     *         request calls automatically on your behalf. However, this feature is not supported by
     *         <code>GetProtectionStatus</code>. You must submit subsequent requests with <code>NextToken</code> using
     *         your own processes.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you have more objects than the number that you specified for <code>MaxResults</code> in the request, the
     * response includes a <code>NextToken</code> value. To list more objects, submit another
     * <code>GetProtectionStatus</code> request, and specify the <code>NextToken</code> value from the response in the
     * <code>NextToken</code> value in the next request.
     * </p>
     * <p>
     * AWS SDKs provide auto-pagination that identify <code>NextToken</code> in a response and make subsequent request
     * calls automatically on your behalf. However, this feature is not supported by <code>GetProtectionStatus</code>.
     * You must submit subsequent requests with <code>NextToken</code> using your own processes.
     * </p>
     * 
     * @param nextToken
     *        If you have more objects than the number that you specified for <code>MaxResults</code> in the request,
     *        the response includes a <code>NextToken</code> value. To list more objects, submit another
     *        <code>GetProtectionStatus</code> request, and specify the <code>NextToken</code> value from the response
     *        in the <code>NextToken</code> value in the next request.</p>
     *        <p>
     *        AWS SDKs provide auto-pagination that identify <code>NextToken</code> in a response and make subsequent
     *        request calls automatically on your behalf. However, this feature is not supported by
     *        <code>GetProtectionStatus</code>. You must submit subsequent requests with <code>NextToken</code> using
     *        your own processes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProtectionStatusResult withNextToken(String nextToken) {
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
        if (getAdminAccountId() != null)
            sb.append("AdminAccountId: ").append(getAdminAccountId()).append(",");
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType()).append(",");
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
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

        if (obj instanceof GetProtectionStatusResult == false)
            return false;
        GetProtectionStatusResult other = (GetProtectionStatusResult) obj;
        if (other.getAdminAccountId() == null ^ this.getAdminAccountId() == null)
            return false;
        if (other.getAdminAccountId() != null && other.getAdminAccountId().equals(this.getAdminAccountId()) == false)
            return false;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
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

        hashCode = prime * hashCode + ((getAdminAccountId() == null) ? 0 : getAdminAccountId().hashCode());
        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetProtectionStatusResult clone() {
        try {
            return (GetProtectionStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

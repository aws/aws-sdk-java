/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.securitytoken.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.securitytoken.AWSSecurityTokenService#getSessionToken(GetSessionTokenRequest) GetSessionToken operation}.
 * <p>
 * The GetSessionToken action returns a set of temporary credentials for an AWS account or IAM user. The credentials consist of an Access Key ID, a
 * Secret Access Key, and a security token. These credentials are valid for the specified duration only. The session duration for IAM users can be
 * between one and 36 hours, with a default of 12 hours. The session duration for AWS account owners is restricted to one hour. Providing the AWS
 * Multi-Factor Authentication (MFA) device serial number and the token code is optional.
 * </p>
 * <p>
 * For more information about using GetSessionToken to create temporary credentials, go to <a
 * href="http://docs.amazonwebservices.com/IAM/latest/UserGuide/CreatingSessionTokens.html"> Creating Temporary Credentials to Enable Access for IAM
 * Users </a> in <i>Using IAM</i> .
 * </p>
 *
 * @see com.amazonaws.services.securitytoken.AWSSecurityTokenService#getSessionToken(GetSessionTokenRequest)
 */
public class GetSessionTokenRequest extends AmazonWebServiceRequest {

    /**
     * The duration, in seconds, that the credentials should remain valid.
     * Acceptable durations for IAM user sessions range from 3600s (one hour)
     * to 129600s (36 hours), with 43200s (12 hours) as the default. Sessions
     * for AWS account owners are restricted to a maximum of 3600s (one
     * hour).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 129600<br/>
     */
    private Integer durationSeconds;

    /**
     * The identification number of the MFA device for the user. If the IAM
     * user has a policy requiring MFA authentication (or is in a group
     * requiring MFA authentication) to access resources, provide the device
     * value here.<p>The value is in the <b>Security Credentials</b> tab of
     * the user's details pane in the IAM console. If the IAM user has an
     * active MFA device, the details pane displays a <b>Multi-Factor
     * Authentication Device</b> value. The value is either for a virtual
     * device, such as <code>arn:aws:iam::123456789012:mfa/user</code>, or it
     * is the device serial number for a hardware device (usually the number
     * from the back of the device), such as <code>GAHT12345678</code>. For
     * more information, see <a
     * ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_ManagingMFA.html"
     * target="_blank">Using Multi-Factor Authentication (MFA) Devices with
     * AWS</a> in <i>Using IAM</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     */
    private String serialNumber;

    /**
     * The value provided by the MFA device. If the user has an access policy
     * requiring an MFA code (or is in a group requiring an MFA code),
     * provide the value here to get permission to resources as specified in
     * the access policy. If MFA authentication is required, and the user
     * does not provide a code when requesting a set of temporary security
     * credentials, the user will receive an "access denied" response when
     * requesting resources that require MFA authentication. For more
     * information, see <a
     * ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_ManagingMFA.html"
     * target="_blank">Using Multi-Factor Authentication (MFA) Devices with
     * AWS</a> in <i>Using IAM</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     */
    private String tokenCode;

    /**
     * Default constructor for a new GetSessionTokenRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetSessionTokenRequest() {}
    
    /**
     * The duration, in seconds, that the credentials should remain valid.
     * Acceptable durations for IAM user sessions range from 3600s (one hour)
     * to 129600s (36 hours), with 43200s (12 hours) as the default. Sessions
     * for AWS account owners are restricted to a maximum of 3600s (one
     * hour).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 129600<br/>
     *
     * @return The duration, in seconds, that the credentials should remain valid.
     *         Acceptable durations for IAM user sessions range from 3600s (one hour)
     *         to 129600s (36 hours), with 43200s (12 hours) as the default. Sessions
     *         for AWS account owners are restricted to a maximum of 3600s (one
     *         hour).
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }
    
    /**
     * The duration, in seconds, that the credentials should remain valid.
     * Acceptable durations for IAM user sessions range from 3600s (one hour)
     * to 129600s (36 hours), with 43200s (12 hours) as the default. Sessions
     * for AWS account owners are restricted to a maximum of 3600s (one
     * hour).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 129600<br/>
     *
     * @param durationSeconds The duration, in seconds, that the credentials should remain valid.
     *         Acceptable durations for IAM user sessions range from 3600s (one hour)
     *         to 129600s (36 hours), with 43200s (12 hours) as the default. Sessions
     *         for AWS account owners are restricted to a maximum of 3600s (one
     *         hour).
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }
    
    /**
     * The duration, in seconds, that the credentials should remain valid.
     * Acceptable durations for IAM user sessions range from 3600s (one hour)
     * to 129600s (36 hours), with 43200s (12 hours) as the default. Sessions
     * for AWS account owners are restricted to a maximum of 3600s (one
     * hour).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 129600<br/>
     *
     * @param durationSeconds The duration, in seconds, that the credentials should remain valid.
     *         Acceptable durations for IAM user sessions range from 3600s (one hour)
     *         to 129600s (36 hours), with 43200s (12 hours) as the default. Sessions
     *         for AWS account owners are restricted to a maximum of 3600s (one
     *         hour).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetSessionTokenRequest withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    
    
    /**
     * The identification number of the MFA device for the user. If the IAM
     * user has a policy requiring MFA authentication (or is in a group
     * requiring MFA authentication) to access resources, provide the device
     * value here.<p>The value is in the <b>Security Credentials</b> tab of
     * the user's details pane in the IAM console. If the IAM user has an
     * active MFA device, the details pane displays a <b>Multi-Factor
     * Authentication Device</b> value. The value is either for a virtual
     * device, such as <code>arn:aws:iam::123456789012:mfa/user</code>, or it
     * is the device serial number for a hardware device (usually the number
     * from the back of the device), such as <code>GAHT12345678</code>. For
     * more information, see <a
     * ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_ManagingMFA.html"
     * target="_blank">Using Multi-Factor Authentication (MFA) Devices with
     * AWS</a> in <i>Using IAM</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @return The identification number of the MFA device for the user. If the IAM
     *         user has a policy requiring MFA authentication (or is in a group
     *         requiring MFA authentication) to access resources, provide the device
     *         value here.<p>The value is in the <b>Security Credentials</b> tab of
     *         the user's details pane in the IAM console. If the IAM user has an
     *         active MFA device, the details pane displays a <b>Multi-Factor
     *         Authentication Device</b> value. The value is either for a virtual
     *         device, such as <code>arn:aws:iam::123456789012:mfa/user</code>, or it
     *         is the device serial number for a hardware device (usually the number
     *         from the back of the device), such as <code>GAHT12345678</code>. For
     *         more information, see <a
     *         ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_ManagingMFA.html"
     *         target="_blank">Using Multi-Factor Authentication (MFA) Devices with
     *         AWS</a> in <i>Using IAM</i>.
     */
    public String getSerialNumber() {
        return serialNumber;
    }
    
    /**
     * The identification number of the MFA device for the user. If the IAM
     * user has a policy requiring MFA authentication (or is in a group
     * requiring MFA authentication) to access resources, provide the device
     * value here.<p>The value is in the <b>Security Credentials</b> tab of
     * the user's details pane in the IAM console. If the IAM user has an
     * active MFA device, the details pane displays a <b>Multi-Factor
     * Authentication Device</b> value. The value is either for a virtual
     * device, such as <code>arn:aws:iam::123456789012:mfa/user</code>, or it
     * is the device serial number for a hardware device (usually the number
     * from the back of the device), such as <code>GAHT12345678</code>. For
     * more information, see <a
     * ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_ManagingMFA.html"
     * target="_blank">Using Multi-Factor Authentication (MFA) Devices with
     * AWS</a> in <i>Using IAM</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber The identification number of the MFA device for the user. If the IAM
     *         user has a policy requiring MFA authentication (or is in a group
     *         requiring MFA authentication) to access resources, provide the device
     *         value here.<p>The value is in the <b>Security Credentials</b> tab of
     *         the user's details pane in the IAM console. If the IAM user has an
     *         active MFA device, the details pane displays a <b>Multi-Factor
     *         Authentication Device</b> value. The value is either for a virtual
     *         device, such as <code>arn:aws:iam::123456789012:mfa/user</code>, or it
     *         is the device serial number for a hardware device (usually the number
     *         from the back of the device), such as <code>GAHT12345678</code>. For
     *         more information, see <a
     *         ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_ManagingMFA.html"
     *         target="_blank">Using Multi-Factor Authentication (MFA) Devices with
     *         AWS</a> in <i>Using IAM</i>.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    /**
     * The identification number of the MFA device for the user. If the IAM
     * user has a policy requiring MFA authentication (or is in a group
     * requiring MFA authentication) to access resources, provide the device
     * value here.<p>The value is in the <b>Security Credentials</b> tab of
     * the user's details pane in the IAM console. If the IAM user has an
     * active MFA device, the details pane displays a <b>Multi-Factor
     * Authentication Device</b> value. The value is either for a virtual
     * device, such as <code>arn:aws:iam::123456789012:mfa/user</code>, or it
     * is the device serial number for a hardware device (usually the number
     * from the back of the device), such as <code>GAHT12345678</code>. For
     * more information, see <a
     * ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_ManagingMFA.html"
     * target="_blank">Using Multi-Factor Authentication (MFA) Devices with
     * AWS</a> in <i>Using IAM</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber The identification number of the MFA device for the user. If the IAM
     *         user has a policy requiring MFA authentication (or is in a group
     *         requiring MFA authentication) to access resources, provide the device
     *         value here.<p>The value is in the <b>Security Credentials</b> tab of
     *         the user's details pane in the IAM console. If the IAM user has an
     *         active MFA device, the details pane displays a <b>Multi-Factor
     *         Authentication Device</b> value. The value is either for a virtual
     *         device, such as <code>arn:aws:iam::123456789012:mfa/user</code>, or it
     *         is the device serial number for a hardware device (usually the number
     *         from the back of the device), such as <code>GAHT12345678</code>. For
     *         more information, see <a
     *         ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_ManagingMFA.html"
     *         target="_blank">Using Multi-Factor Authentication (MFA) Devices with
     *         AWS</a> in <i>Using IAM</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetSessionTokenRequest withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    
    
    /**
     * The value provided by the MFA device. If the user has an access policy
     * requiring an MFA code (or is in a group requiring an MFA code),
     * provide the value here to get permission to resources as specified in
     * the access policy. If MFA authentication is required, and the user
     * does not provide a code when requesting a set of temporary security
     * credentials, the user will receive an "access denied" response when
     * requesting resources that require MFA authentication. For more
     * information, see <a
     * ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_ManagingMFA.html"
     * target="_blank">Using Multi-Factor Authentication (MFA) Devices with
     * AWS</a> in <i>Using IAM</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @return The value provided by the MFA device. If the user has an access policy
     *         requiring an MFA code (or is in a group requiring an MFA code),
     *         provide the value here to get permission to resources as specified in
     *         the access policy. If MFA authentication is required, and the user
     *         does not provide a code when requesting a set of temporary security
     *         credentials, the user will receive an "access denied" response when
     *         requesting resources that require MFA authentication. For more
     *         information, see <a
     *         ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_ManagingMFA.html"
     *         target="_blank">Using Multi-Factor Authentication (MFA) Devices with
     *         AWS</a> in <i>Using IAM</i>.
     */
    public String getTokenCode() {
        return tokenCode;
    }
    
    /**
     * The value provided by the MFA device. If the user has an access policy
     * requiring an MFA code (or is in a group requiring an MFA code),
     * provide the value here to get permission to resources as specified in
     * the access policy. If MFA authentication is required, and the user
     * does not provide a code when requesting a set of temporary security
     * credentials, the user will receive an "access denied" response when
     * requesting resources that require MFA authentication. For more
     * information, see <a
     * ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_ManagingMFA.html"
     * target="_blank">Using Multi-Factor Authentication (MFA) Devices with
     * AWS</a> in <i>Using IAM</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param tokenCode The value provided by the MFA device. If the user has an access policy
     *         requiring an MFA code (or is in a group requiring an MFA code),
     *         provide the value here to get permission to resources as specified in
     *         the access policy. If MFA authentication is required, and the user
     *         does not provide a code when requesting a set of temporary security
     *         credentials, the user will receive an "access denied" response when
     *         requesting resources that require MFA authentication. For more
     *         information, see <a
     *         ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_ManagingMFA.html"
     *         target="_blank">Using Multi-Factor Authentication (MFA) Devices with
     *         AWS</a> in <i>Using IAM</i>.
     */
    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }
    
    /**
     * The value provided by the MFA device. If the user has an access policy
     * requiring an MFA code (or is in a group requiring an MFA code),
     * provide the value here to get permission to resources as specified in
     * the access policy. If MFA authentication is required, and the user
     * does not provide a code when requesting a set of temporary security
     * credentials, the user will receive an "access denied" response when
     * requesting resources that require MFA authentication. For more
     * information, see <a
     * ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_ManagingMFA.html"
     * target="_blank">Using Multi-Factor Authentication (MFA) Devices with
     * AWS</a> in <i>Using IAM</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param tokenCode The value provided by the MFA device. If the user has an access policy
     *         requiring an MFA code (or is in a group requiring an MFA code),
     *         provide the value here to get permission to resources as specified in
     *         the access policy. If MFA authentication is required, and the user
     *         does not provide a code when requesting a set of temporary security
     *         credentials, the user will receive an "access denied" response when
     *         requesting resources that require MFA authentication. For more
     *         information, see <a
     *         ocs.amazonwebservices.com/IAM/latest/UserGuide/Using_ManagingMFA.html"
     *         target="_blank">Using Multi-Factor Authentication (MFA) Devices with
     *         AWS</a> in <i>Using IAM</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetSessionTokenRequest withTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (durationSeconds != null) sb.append("DurationSeconds: " + durationSeconds + ", ");
        if (serialNumber != null) sb.append("SerialNumber: " + serialNumber + ", ");
        if (tokenCode != null) sb.append("TokenCode: " + tokenCode + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode()); 
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode()); 
        hashCode = prime * hashCode + ((getTokenCode() == null) ? 0 : getTokenCode().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof GetSessionTokenRequest == false) return false;
        GetSessionTokenRequest other = (GetSessionTokenRequest)obj;
        
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null) return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false) return false; 
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null) return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false) return false; 
        if (other.getTokenCode() == null ^ this.getTokenCode() == null) return false;
        if (other.getTokenCode() != null && other.getTokenCode().equals(this.getTokenCode()) == false) return false; 
        return true;
    }
    
}
    
/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.securitytoken.AWSSecurityTokenService#getSessionToken(GetSessionTokenRequest) GetSessionToken operation}.
 * <p>
 * Returns a set of temporary credentials for an AWS account or IAM user. The credentials consist of an access key ID, a secret access key, and a
 * security token. Typically, you use <code>GetSessionToken</code> if you want use MFA to protect programmatic calls to specific AWS APIs like Amazon EC2
 * <code>StopInstances</code> . MFA-enabled IAM users would need to call <code>GetSessionToken</code> and submit an MFA code that is associated with
 * their MFA device. Using the temporary security credentials that are returned from the call, IAM users can then make programmatic calls to APIs that
 * require MFA authentication.
 * </p>
 * <p>
 * The <code>GetSessionToken</code> action must be called by using the long-term AWS security credentials of the AWS account or an IAM user. Credentials
 * that are created by IAM users are valid for the duration that you specify, between 900 seconds (15 minutes) and 129600 seconds (36 hours); credentials
 * that are created by using account credentials have a maximum duration of 3600 seconds (1 hour).
 * </p>
 * <p>
 * Optionally, you can pass an AWS IAM access policy to this operation. The temporary security credentials that are returned by the operation have the
 * permissions that are associated with the entity that is making the <code>GetSessionToken</code> call, except for any permissions explicitly denied by
 * the policy you pass. This gives you a way to further restrict the permissions for the federated user. These policies and any applicable resource-based
 * policies are evaluated when calls to AWS are made using the temporary security credentials.
 * </p>
 * <p>
 * For more information about using <code>GetSessionToken</code> to create temporary credentials, go to <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/CreatingSessionTokens.html"> Creating Temporary Credentials to Enable Access for IAM Users
 * </a> in <i>Using IAM</i> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.securitytoken.AWSSecurityTokenService#getSessionToken(GetSessionTokenRequest)
 */
public class GetSessionTokenRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The duration, in seconds, that the credentials should remain valid.
     * Acceptable durations for IAM user sessions range from 900 seconds (15
     * minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours)
     * as the default. Sessions for AWS account owners are restricted to a
     * maximum of 3600 seconds (one hour). If the duration is longer than one
     * hour, the session for AWS account owners defaults to one hour.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     */
    private Integer durationSeconds;

    /**
     * The identification number of the MFA device that is associated with
     * the IAM user who is making the <code>GetSessionToken</code> call.
     * Specify this value if the IAM user has a policy that requires MFA
     * authentication. The value is either the serial number for a hardware
     * device (such as <code>GAHT12345678</code>) or an Amazon Resource Name
     * (ARN) for a virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>). You can find the
     * device for an IAM user by going to the AWS Management Console and
     * viewing the user's security credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     */
    private String serialNumber;

    /**
     * The value provided by the MFA device, if MFA is required. If any
     * policy requires the IAM user to submit an MFA code, specify this
     * value. If MFA authentication is required, and the user does not
     * provide a code when requesting a set of temporary security
     * credentials, the user will receive an "access denied" response when
     * requesting resources that require MFA authentication.
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
     * Acceptable durations for IAM user sessions range from 900 seconds (15
     * minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours)
     * as the default. Sessions for AWS account owners are restricted to a
     * maximum of 3600 seconds (one hour). If the duration is longer than one
     * hour, the session for AWS account owners defaults to one hour.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @return The duration, in seconds, that the credentials should remain valid.
     *         Acceptable durations for IAM user sessions range from 900 seconds (15
     *         minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours)
     *         as the default. Sessions for AWS account owners are restricted to a
     *         maximum of 3600 seconds (one hour). If the duration is longer than one
     *         hour, the session for AWS account owners defaults to one hour.
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }
    
    /**
     * The duration, in seconds, that the credentials should remain valid.
     * Acceptable durations for IAM user sessions range from 900 seconds (15
     * minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours)
     * as the default. Sessions for AWS account owners are restricted to a
     * maximum of 3600 seconds (one hour). If the duration is longer than one
     * hour, the session for AWS account owners defaults to one hour.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @param durationSeconds The duration, in seconds, that the credentials should remain valid.
     *         Acceptable durations for IAM user sessions range from 900 seconds (15
     *         minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours)
     *         as the default. Sessions for AWS account owners are restricted to a
     *         maximum of 3600 seconds (one hour). If the duration is longer than one
     *         hour, the session for AWS account owners defaults to one hour.
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }
    
    /**
     * The duration, in seconds, that the credentials should remain valid.
     * Acceptable durations for IAM user sessions range from 900 seconds (15
     * minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours)
     * as the default. Sessions for AWS account owners are restricted to a
     * maximum of 3600 seconds (one hour). If the duration is longer than one
     * hour, the session for AWS account owners defaults to one hour.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @param durationSeconds The duration, in seconds, that the credentials should remain valid.
     *         Acceptable durations for IAM user sessions range from 900 seconds (15
     *         minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours)
     *         as the default. Sessions for AWS account owners are restricted to a
     *         maximum of 3600 seconds (one hour). If the duration is longer than one
     *         hour, the session for AWS account owners defaults to one hour.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetSessionTokenRequest withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * The identification number of the MFA device that is associated with
     * the IAM user who is making the <code>GetSessionToken</code> call.
     * Specify this value if the IAM user has a policy that requires MFA
     * authentication. The value is either the serial number for a hardware
     * device (such as <code>GAHT12345678</code>) or an Amazon Resource Name
     * (ARN) for a virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>). You can find the
     * device for an IAM user by going to the AWS Management Console and
     * viewing the user's security credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @return The identification number of the MFA device that is associated with
     *         the IAM user who is making the <code>GetSessionToken</code> call.
     *         Specify this value if the IAM user has a policy that requires MFA
     *         authentication. The value is either the serial number for a hardware
     *         device (such as <code>GAHT12345678</code>) or an Amazon Resource Name
     *         (ARN) for a virtual device (such as
     *         <code>arn:aws:iam::123456789012:mfa/user</code>). You can find the
     *         device for an IAM user by going to the AWS Management Console and
     *         viewing the user's security credentials.
     */
    public String getSerialNumber() {
        return serialNumber;
    }
    
    /**
     * The identification number of the MFA device that is associated with
     * the IAM user who is making the <code>GetSessionToken</code> call.
     * Specify this value if the IAM user has a policy that requires MFA
     * authentication. The value is either the serial number for a hardware
     * device (such as <code>GAHT12345678</code>) or an Amazon Resource Name
     * (ARN) for a virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>). You can find the
     * device for an IAM user by going to the AWS Management Console and
     * viewing the user's security credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber The identification number of the MFA device that is associated with
     *         the IAM user who is making the <code>GetSessionToken</code> call.
     *         Specify this value if the IAM user has a policy that requires MFA
     *         authentication. The value is either the serial number for a hardware
     *         device (such as <code>GAHT12345678</code>) or an Amazon Resource Name
     *         (ARN) for a virtual device (such as
     *         <code>arn:aws:iam::123456789012:mfa/user</code>). You can find the
     *         device for an IAM user by going to the AWS Management Console and
     *         viewing the user's security credentials.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    /**
     * The identification number of the MFA device that is associated with
     * the IAM user who is making the <code>GetSessionToken</code> call.
     * Specify this value if the IAM user has a policy that requires MFA
     * authentication. The value is either the serial number for a hardware
     * device (such as <code>GAHT12345678</code>) or an Amazon Resource Name
     * (ARN) for a virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>). You can find the
     * device for an IAM user by going to the AWS Management Console and
     * viewing the user's security credentials.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber The identification number of the MFA device that is associated with
     *         the IAM user who is making the <code>GetSessionToken</code> call.
     *         Specify this value if the IAM user has a policy that requires MFA
     *         authentication. The value is either the serial number for a hardware
     *         device (such as <code>GAHT12345678</code>) or an Amazon Resource Name
     *         (ARN) for a virtual device (such as
     *         <code>arn:aws:iam::123456789012:mfa/user</code>). You can find the
     *         device for an IAM user by going to the AWS Management Console and
     *         viewing the user's security credentials.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetSessionTokenRequest withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * The value provided by the MFA device, if MFA is required. If any
     * policy requires the IAM user to submit an MFA code, specify this
     * value. If MFA authentication is required, and the user does not
     * provide a code when requesting a set of temporary security
     * credentials, the user will receive an "access denied" response when
     * requesting resources that require MFA authentication.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @return The value provided by the MFA device, if MFA is required. If any
     *         policy requires the IAM user to submit an MFA code, specify this
     *         value. If MFA authentication is required, and the user does not
     *         provide a code when requesting a set of temporary security
     *         credentials, the user will receive an "access denied" response when
     *         requesting resources that require MFA authentication.
     */
    public String getTokenCode() {
        return tokenCode;
    }
    
    /**
     * The value provided by the MFA device, if MFA is required. If any
     * policy requires the IAM user to submit an MFA code, specify this
     * value. If MFA authentication is required, and the user does not
     * provide a code when requesting a set of temporary security
     * credentials, the user will receive an "access denied" response when
     * requesting resources that require MFA authentication.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param tokenCode The value provided by the MFA device, if MFA is required. If any
     *         policy requires the IAM user to submit an MFA code, specify this
     *         value. If MFA authentication is required, and the user does not
     *         provide a code when requesting a set of temporary security
     *         credentials, the user will receive an "access denied" response when
     *         requesting resources that require MFA authentication.
     */
    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }
    
    /**
     * The value provided by the MFA device, if MFA is required. If any
     * policy requires the IAM user to submit an MFA code, specify this
     * value. If MFA authentication is required, and the user does not
     * provide a code when requesting a set of temporary security
     * credentials, the user will receive an "access denied" response when
     * requesting resources that require MFA authentication.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param tokenCode The value provided by the MFA device, if MFA is required. If any
     *         policy requires the IAM user to submit an MFA code, specify this
     *         value. If MFA authentication is required, and the user does not
     *         provide a code when requesting a set of temporary security
     *         credentials, the user will receive an "access denied" response when
     *         requesting resources that require MFA authentication.
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
        if (getDurationSeconds() != null) sb.append("DurationSeconds: " + getDurationSeconds() + ",");
        if (getSerialNumber() != null) sb.append("SerialNumber: " + getSerialNumber() + ",");
        if (getTokenCode() != null) sb.append("TokenCode: " + getTokenCode() );
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
    
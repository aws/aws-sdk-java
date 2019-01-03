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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/GetSessionToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSessionTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The duration, in seconds, that the credentials should remain valid. Acceptable durations for IAM user sessions
     * range from 900 seconds (15 minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the default.
     * Sessions for AWS account owners are restricted to a maximum of 3600 seconds (one hour). If the duration is longer
     * than one hour, the session for AWS account owners defaults to one hour.
     * </p>
     */
    private Integer durationSeconds;
    /**
     * <p>
     * The identification number of the MFA device that is associated with the IAM user who is making the
     * <code>GetSessionToken</code> call. Specify this value if the IAM user has a policy that requires MFA
     * authentication. The value is either the serial number for a hardware device (such as <code>GAHT12345678</code>)
     * or an Amazon Resource Name (ARN) for a virtual device (such as <code>arn:aws:iam::123456789012:mfa/user</code>).
     * You can find the device for an IAM user by going to the AWS Management Console and viewing the user's security
     * credentials.
     * </p>
     * <p>
     * The regex used to validated this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     */
    private String serialNumber;
    /**
     * <p>
     * The value provided by the MFA device, if MFA is required. If any policy requires the IAM user to submit an MFA
     * code, specify this value. If MFA authentication is required, and the user does not provide a code when requesting
     * a set of temporary security credentials, the user will receive an "access denied" response when requesting
     * resources that require MFA authentication.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
     * </p>
     */
    private String tokenCode;

    /**
     * <p>
     * The duration, in seconds, that the credentials should remain valid. Acceptable durations for IAM user sessions
     * range from 900 seconds (15 minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the default.
     * Sessions for AWS account owners are restricted to a maximum of 3600 seconds (one hour). If the duration is longer
     * than one hour, the session for AWS account owners defaults to one hour.
     * </p>
     * 
     * @param durationSeconds
     *        The duration, in seconds, that the credentials should remain valid. Acceptable durations for IAM user
     *        sessions range from 900 seconds (15 minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours)
     *        as the default. Sessions for AWS account owners are restricted to a maximum of 3600 seconds (one hour). If
     *        the duration is longer than one hour, the session for AWS account owners defaults to one hour.
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that the credentials should remain valid. Acceptable durations for IAM user sessions
     * range from 900 seconds (15 minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the default.
     * Sessions for AWS account owners are restricted to a maximum of 3600 seconds (one hour). If the duration is longer
     * than one hour, the session for AWS account owners defaults to one hour.
     * </p>
     * 
     * @return The duration, in seconds, that the credentials should remain valid. Acceptable durations for IAM user
     *         sessions range from 900 seconds (15 minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours)
     *         as the default. Sessions for AWS account owners are restricted to a maximum of 3600 seconds (one hour).
     *         If the duration is longer than one hour, the session for AWS account owners defaults to one hour.
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that the credentials should remain valid. Acceptable durations for IAM user sessions
     * range from 900 seconds (15 minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours) as the default.
     * Sessions for AWS account owners are restricted to a maximum of 3600 seconds (one hour). If the duration is longer
     * than one hour, the session for AWS account owners defaults to one hour.
     * </p>
     * 
     * @param durationSeconds
     *        The duration, in seconds, that the credentials should remain valid. Acceptable durations for IAM user
     *        sessions range from 900 seconds (15 minutes) to 129600 seconds (36 hours), with 43200 seconds (12 hours)
     *        as the default. Sessions for AWS account owners are restricted to a maximum of 3600 seconds (one hour). If
     *        the duration is longer than one hour, the session for AWS account owners defaults to one hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionTokenRequest withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * <p>
     * The identification number of the MFA device that is associated with the IAM user who is making the
     * <code>GetSessionToken</code> call. Specify this value if the IAM user has a policy that requires MFA
     * authentication. The value is either the serial number for a hardware device (such as <code>GAHT12345678</code>)
     * or an Amazon Resource Name (ARN) for a virtual device (such as <code>arn:aws:iam::123456789012:mfa/user</code>).
     * You can find the device for an IAM user by going to the AWS Management Console and viewing the user's security
     * credentials.
     * </p>
     * <p>
     * The regex used to validated this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     * 
     * @param serialNumber
     *        The identification number of the MFA device that is associated with the IAM user who is making the
     *        <code>GetSessionToken</code> call. Specify this value if the IAM user has a policy that requires MFA
     *        authentication. The value is either the serial number for a hardware device (such as
     *        <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a virtual device (such as
     *        <code>arn:aws:iam::123456789012:mfa/user</code>). You can find the device for an IAM user by going to the
     *        AWS Management Console and viewing the user's security credentials. </p>
     *        <p>
     *        The regex used to validated this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@:/-
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The identification number of the MFA device that is associated with the IAM user who is making the
     * <code>GetSessionToken</code> call. Specify this value if the IAM user has a policy that requires MFA
     * authentication. The value is either the serial number for a hardware device (such as <code>GAHT12345678</code>)
     * or an Amazon Resource Name (ARN) for a virtual device (such as <code>arn:aws:iam::123456789012:mfa/user</code>).
     * You can find the device for an IAM user by going to the AWS Management Console and viewing the user's security
     * credentials.
     * </p>
     * <p>
     * The regex used to validated this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     * 
     * @return The identification number of the MFA device that is associated with the IAM user who is making the
     *         <code>GetSessionToken</code> call. Specify this value if the IAM user has a policy that requires MFA
     *         authentication. The value is either the serial number for a hardware device (such as
     *         <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a virtual device (such as
     *         <code>arn:aws:iam::123456789012:mfa/user</code>). You can find the device for an IAM user by going to the
     *         AWS Management Console and viewing the user's security credentials. </p>
     *         <p>
     *         The regex used to validated this parameter is a string of characters consisting of upper- and lower-case
     *         alphanumeric characters with no spaces. You can also include underscores or any of the following
     *         characters: =,.@:/-
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * The identification number of the MFA device that is associated with the IAM user who is making the
     * <code>GetSessionToken</code> call. Specify this value if the IAM user has a policy that requires MFA
     * authentication. The value is either the serial number for a hardware device (such as <code>GAHT12345678</code>)
     * or an Amazon Resource Name (ARN) for a virtual device (such as <code>arn:aws:iam::123456789012:mfa/user</code>).
     * You can find the device for an IAM user by going to the AWS Management Console and viewing the user's security
     * credentials.
     * </p>
     * <p>
     * The regex used to validated this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     * 
     * @param serialNumber
     *        The identification number of the MFA device that is associated with the IAM user who is making the
     *        <code>GetSessionToken</code> call. Specify this value if the IAM user has a policy that requires MFA
     *        authentication. The value is either the serial number for a hardware device (such as
     *        <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a virtual device (such as
     *        <code>arn:aws:iam::123456789012:mfa/user</code>). You can find the device for an IAM user by going to the
     *        AWS Management Console and viewing the user's security credentials. </p>
     *        <p>
     *        The regex used to validated this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@:/-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionTokenRequest withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * <p>
     * The value provided by the MFA device, if MFA is required. If any policy requires the IAM user to submit an MFA
     * code, specify this value. If MFA authentication is required, and the user does not provide a code when requesting
     * a set of temporary security credentials, the user will receive an "access denied" response when requesting
     * resources that require MFA authentication.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
     * </p>
     * 
     * @param tokenCode
     *        The value provided by the MFA device, if MFA is required. If any policy requires the IAM user to submit an
     *        MFA code, specify this value. If MFA authentication is required, and the user does not provide a code when
     *        requesting a set of temporary security credentials, the user will receive an "access denied" response when
     *        requesting resources that require MFA authentication.</p>
     *        <p>
     *        The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
     */

    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }

    /**
     * <p>
     * The value provided by the MFA device, if MFA is required. If any policy requires the IAM user to submit an MFA
     * code, specify this value. If MFA authentication is required, and the user does not provide a code when requesting
     * a set of temporary security credentials, the user will receive an "access denied" response when requesting
     * resources that require MFA authentication.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
     * </p>
     * 
     * @return The value provided by the MFA device, if MFA is required. If any policy requires the IAM user to submit
     *         an MFA code, specify this value. If MFA authentication is required, and the user does not provide a code
     *         when requesting a set of temporary security credentials, the user will receive an "access denied"
     *         response when requesting resources that require MFA authentication.</p>
     *         <p>
     *         The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
     */

    public String getTokenCode() {
        return this.tokenCode;
    }

    /**
     * <p>
     * The value provided by the MFA device, if MFA is required. If any policy requires the IAM user to submit an MFA
     * code, specify this value. If MFA authentication is required, and the user does not provide a code when requesting
     * a set of temporary security credentials, the user will receive an "access denied" response when requesting
     * resources that require MFA authentication.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
     * </p>
     * 
     * @param tokenCode
     *        The value provided by the MFA device, if MFA is required. If any policy requires the IAM user to submit an
     *        MFA code, specify this value. If MFA authentication is required, and the user does not provide a code when
     *        requesting a set of temporary security credentials, the user will receive an "access denied" response when
     *        requesting resources that require MFA authentication.</p>
     *        <p>
     *        The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionTokenRequest withTokenCode(String tokenCode) {
        setTokenCode(tokenCode);
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
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds()).append(",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
        if (getTokenCode() != null)
            sb.append("TokenCode: ").append(getTokenCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSessionTokenRequest == false)
            return false;
        GetSessionTokenRequest other = (GetSessionTokenRequest) obj;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getTokenCode() == null ^ this.getTokenCode() == null)
            return false;
        if (other.getTokenCode() != null && other.getTokenCode().equals(this.getTokenCode()) == false)
            return false;
        return true;
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
    public GetSessionTokenRequest clone() {
        return (GetSessionTokenRequest) super.clone();
    }

}

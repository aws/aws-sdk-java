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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to retrieve a list of the blacklists that your dedicated IP addresses appear on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetBlacklistReports" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBlacklistReportsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of IP addresses that you want to retrieve blacklist information about. You can only specify the dedicated
     * IP addresses that you use to send email using Amazon Pinpoint or Amazon SES.
     * </p>
     */
    private java.util.List<String> blacklistItemNames;

    /**
     * <p>
     * A list of IP addresses that you want to retrieve blacklist information about. You can only specify the dedicated
     * IP addresses that you use to send email using Amazon Pinpoint or Amazon SES.
     * </p>
     * 
     * @return A list of IP addresses that you want to retrieve blacklist information about. You can only specify the
     *         dedicated IP addresses that you use to send email using Amazon Pinpoint or Amazon SES.
     */

    public java.util.List<String> getBlacklistItemNames() {
        return blacklistItemNames;
    }

    /**
     * <p>
     * A list of IP addresses that you want to retrieve blacklist information about. You can only specify the dedicated
     * IP addresses that you use to send email using Amazon Pinpoint or Amazon SES.
     * </p>
     * 
     * @param blacklistItemNames
     *        A list of IP addresses that you want to retrieve blacklist information about. You can only specify the
     *        dedicated IP addresses that you use to send email using Amazon Pinpoint or Amazon SES.
     */

    public void setBlacklistItemNames(java.util.Collection<String> blacklistItemNames) {
        if (blacklistItemNames == null) {
            this.blacklistItemNames = null;
            return;
        }

        this.blacklistItemNames = new java.util.ArrayList<String>(blacklistItemNames);
    }

    /**
     * <p>
     * A list of IP addresses that you want to retrieve blacklist information about. You can only specify the dedicated
     * IP addresses that you use to send email using Amazon Pinpoint or Amazon SES.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlacklistItemNames(java.util.Collection)} or {@link #withBlacklistItemNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param blacklistItemNames
     *        A list of IP addresses that you want to retrieve blacklist information about. You can only specify the
     *        dedicated IP addresses that you use to send email using Amazon Pinpoint or Amazon SES.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlacklistReportsRequest withBlacklistItemNames(String... blacklistItemNames) {
        if (this.blacklistItemNames == null) {
            setBlacklistItemNames(new java.util.ArrayList<String>(blacklistItemNames.length));
        }
        for (String ele : blacklistItemNames) {
            this.blacklistItemNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IP addresses that you want to retrieve blacklist information about. You can only specify the dedicated
     * IP addresses that you use to send email using Amazon Pinpoint or Amazon SES.
     * </p>
     * 
     * @param blacklistItemNames
     *        A list of IP addresses that you want to retrieve blacklist information about. You can only specify the
     *        dedicated IP addresses that you use to send email using Amazon Pinpoint or Amazon SES.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlacklistReportsRequest withBlacklistItemNames(java.util.Collection<String> blacklistItemNames) {
        setBlacklistItemNames(blacklistItemNames);
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
        if (getBlacklistItemNames() != null)
            sb.append("BlacklistItemNames: ").append(getBlacklistItemNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBlacklistReportsRequest == false)
            return false;
        GetBlacklistReportsRequest other = (GetBlacklistReportsRequest) obj;
        if (other.getBlacklistItemNames() == null ^ this.getBlacklistItemNames() == null)
            return false;
        if (other.getBlacklistItemNames() != null && other.getBlacklistItemNames().equals(this.getBlacklistItemNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlacklistItemNames() == null) ? 0 : getBlacklistItemNames().hashCode());
        return hashCode;
    }

    @Override
    public GetBlacklistReportsRequest clone() {
        return (GetBlacklistReportsRequest) super.clone();
    }

}

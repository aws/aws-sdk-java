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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/GetAccessKeyInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessKeyInfoRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of an access key.
     * </p>
     * <p>
     * This parameter allows (through its regex pattern) a string of characters that can consist of any upper- or
     * lowercase letter or digit.
     * </p>
     */
    private String accessKeyId;

    /**
     * <p>
     * The identifier of an access key.
     * </p>
     * <p>
     * This parameter allows (through its regex pattern) a string of characters that can consist of any upper- or
     * lowercase letter or digit.
     * </p>
     * 
     * @param accessKeyId
     *        The identifier of an access key.</p>
     *        <p>
     *        This parameter allows (through its regex pattern) a string of characters that can consist of any upper- or
     *        lowercase letter or digit.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The identifier of an access key.
     * </p>
     * <p>
     * This parameter allows (through its regex pattern) a string of characters that can consist of any upper- or
     * lowercase letter or digit.
     * </p>
     * 
     * @return The identifier of an access key.</p>
     *         <p>
     *         This parameter allows (through its regex pattern) a string of characters that can consist of any upper-
     *         or lowercase letter or digit.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * The identifier of an access key.
     * </p>
     * <p>
     * This parameter allows (through its regex pattern) a string of characters that can consist of any upper- or
     * lowercase letter or digit.
     * </p>
     * 
     * @param accessKeyId
     *        The identifier of an access key.</p>
     *        <p>
     *        This parameter allows (through its regex pattern) a string of characters that can consist of any upper- or
     *        lowercase letter or digit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessKeyInfoRequest withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
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
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: ").append(getAccessKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessKeyInfoRequest == false)
            return false;
        GetAccessKeyInfoRequest other = (GetAccessKeyInfoRequest) obj;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        return hashCode;
    }

    @Override
    public GetAccessKeyInfoRequest clone() {
        return (GetAccessKeyInfoRequest) super.clone();
    }

}

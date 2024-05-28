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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateIpAccessSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIpAccessSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the IP access settings resource.
     * </p>
     */
    private String ipAccessSettingsArn;

    /**
     * <p>
     * The ARN of the IP access settings resource.
     * </p>
     * 
     * @param ipAccessSettingsArn
     *        The ARN of the IP access settings resource.
     */

    public void setIpAccessSettingsArn(String ipAccessSettingsArn) {
        this.ipAccessSettingsArn = ipAccessSettingsArn;
    }

    /**
     * <p>
     * The ARN of the IP access settings resource.
     * </p>
     * 
     * @return The ARN of the IP access settings resource.
     */

    public String getIpAccessSettingsArn() {
        return this.ipAccessSettingsArn;
    }

    /**
     * <p>
     * The ARN of the IP access settings resource.
     * </p>
     * 
     * @param ipAccessSettingsArn
     *        The ARN of the IP access settings resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpAccessSettingsResult withIpAccessSettingsArn(String ipAccessSettingsArn) {
        setIpAccessSettingsArn(ipAccessSettingsArn);
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
        if (getIpAccessSettingsArn() != null)
            sb.append("IpAccessSettingsArn: ").append(getIpAccessSettingsArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIpAccessSettingsResult == false)
            return false;
        CreateIpAccessSettingsResult other = (CreateIpAccessSettingsResult) obj;
        if (other.getIpAccessSettingsArn() == null ^ this.getIpAccessSettingsArn() == null)
            return false;
        if (other.getIpAccessSettingsArn() != null && other.getIpAccessSettingsArn().equals(this.getIpAccessSettingsArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAccessSettingsArn() == null) ? 0 : getIpAccessSettingsArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateIpAccessSettingsResult clone() {
        try {
            return (CreateIpAccessSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

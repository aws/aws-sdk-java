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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/GetConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the client.
     * </p>
     */
    private String clientArn;
    /**
     * <p>
     * The client version.
     * </p>
     */
    private String clientVersion;
    /**
     * <p>
     * A list of ARNs that identify the high-availability partition groups that are associated with the client.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> hapgList;

    /**
     * <p>
     * The ARN of the client.
     * </p>
     * 
     * @param clientArn
     *        The ARN of the client.
     */

    public void setClientArn(String clientArn) {
        this.clientArn = clientArn;
    }

    /**
     * <p>
     * The ARN of the client.
     * </p>
     * 
     * @return The ARN of the client.
     */

    public String getClientArn() {
        return this.clientArn;
    }

    /**
     * <p>
     * The ARN of the client.
     * </p>
     * 
     * @param clientArn
     *        The ARN of the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigRequest withClientArn(String clientArn) {
        setClientArn(clientArn);
        return this;
    }

    /**
     * <p>
     * The client version.
     * </p>
     * 
     * @param clientVersion
     *        The client version.
     * @see ClientVersion
     */

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    /**
     * <p>
     * The client version.
     * </p>
     * 
     * @return The client version.
     * @see ClientVersion
     */

    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * <p>
     * The client version.
     * </p>
     * 
     * @param clientVersion
     *        The client version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientVersion
     */

    public GetConfigRequest withClientVersion(String clientVersion) {
        setClientVersion(clientVersion);
        return this;
    }

    /**
     * <p>
     * The client version.
     * </p>
     * 
     * @param clientVersion
     *        The client version.
     * @see ClientVersion
     */

    public void setClientVersion(ClientVersion clientVersion) {
        withClientVersion(clientVersion);
    }

    /**
     * <p>
     * The client version.
     * </p>
     * 
     * @param clientVersion
     *        The client version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientVersion
     */

    public GetConfigRequest withClientVersion(ClientVersion clientVersion) {
        this.clientVersion = clientVersion.toString();
        return this;
    }

    /**
     * <p>
     * A list of ARNs that identify the high-availability partition groups that are associated with the client.
     * </p>
     * 
     * @return A list of ARNs that identify the high-availability partition groups that are associated with the client.
     */

    public java.util.List<String> getHapgList() {
        if (hapgList == null) {
            hapgList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return hapgList;
    }

    /**
     * <p>
     * A list of ARNs that identify the high-availability partition groups that are associated with the client.
     * </p>
     * 
     * @param hapgList
     *        A list of ARNs that identify the high-availability partition groups that are associated with the client.
     */

    public void setHapgList(java.util.Collection<String> hapgList) {
        if (hapgList == null) {
            this.hapgList = null;
            return;
        }

        this.hapgList = new com.amazonaws.internal.SdkInternalList<String>(hapgList);
    }

    /**
     * <p>
     * A list of ARNs that identify the high-availability partition groups that are associated with the client.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHapgList(java.util.Collection)} or {@link #withHapgList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param hapgList
     *        A list of ARNs that identify the high-availability partition groups that are associated with the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigRequest withHapgList(String... hapgList) {
        if (this.hapgList == null) {
            setHapgList(new com.amazonaws.internal.SdkInternalList<String>(hapgList.length));
        }
        for (String ele : hapgList) {
            this.hapgList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs that identify the high-availability partition groups that are associated with the client.
     * </p>
     * 
     * @param hapgList
     *        A list of ARNs that identify the high-availability partition groups that are associated with the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigRequest withHapgList(java.util.Collection<String> hapgList) {
        setHapgList(hapgList);
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
        if (getClientArn() != null)
            sb.append("ClientArn: ").append(getClientArn()).append(",");
        if (getClientVersion() != null)
            sb.append("ClientVersion: ").append(getClientVersion()).append(",");
        if (getHapgList() != null)
            sb.append("HapgList: ").append(getHapgList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConfigRequest == false)
            return false;
        GetConfigRequest other = (GetConfigRequest) obj;
        if (other.getClientArn() == null ^ this.getClientArn() == null)
            return false;
        if (other.getClientArn() != null && other.getClientArn().equals(this.getClientArn()) == false)
            return false;
        if (other.getClientVersion() == null ^ this.getClientVersion() == null)
            return false;
        if (other.getClientVersion() != null && other.getClientVersion().equals(this.getClientVersion()) == false)
            return false;
        if (other.getHapgList() == null ^ this.getHapgList() == null)
            return false;
        if (other.getHapgList() != null && other.getHapgList().equals(this.getHapgList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientArn() == null) ? 0 : getClientArn().hashCode());
        hashCode = prime * hashCode + ((getClientVersion() == null) ? 0 : getClientVersion().hashCode());
        hashCode = prime * hashCode + ((getHapgList() == null) ? 0 : getHapgList().hashCode());
        return hashCode;
    }

    @Override
    public GetConfigRequest clone() {
        return (GetConfigRequest) super.clone();
    }

}

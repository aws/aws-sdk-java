/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudhsm.AWSCloudHSM#getConfig(GetConfigRequest) GetConfig operation}.
 * <p>
 * Gets the configuration files necessary to connect to all high
 * availability partition groups the client is associated with.
 * </p>
 *
 * @see com.amazonaws.services.cloudhsm.AWSCloudHSM#getConfig(GetConfigRequest)
 */
public class GetConfigRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ARN of the client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:client-[0-9a-f]{8}<br/>
     */
    private String clientArn;

    /**
     * The client version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>5.1, 5.3
     */
    private String clientVersion;

    /**
     * A list of ARNs that identify the high-availability partition groups
     * that are associated with the client.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> hapgList;

    /**
     * The ARN of the client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:client-[0-9a-f]{8}<br/>
     *
     * @return The ARN of the client.
     */
    public String getClientArn() {
        return clientArn;
    }
    
    /**
     * The ARN of the client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:client-[0-9a-f]{8}<br/>
     *
     * @param clientArn The ARN of the client.
     */
    public void setClientArn(String clientArn) {
        this.clientArn = clientArn;
    }
    
    /**
     * The ARN of the client.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:client-[0-9a-f]{8}<br/>
     *
     * @param clientArn The ARN of the client.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetConfigRequest withClientArn(String clientArn) {
        this.clientArn = clientArn;
        return this;
    }

    /**
     * The client version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>5.1, 5.3
     *
     * @return The client version.
     *
     * @see ClientVersion
     */
    public String getClientVersion() {
        return clientVersion;
    }
    
    /**
     * The client version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>5.1, 5.3
     *
     * @param clientVersion The client version.
     *
     * @see ClientVersion
     */
    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }
    
    /**
     * The client version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>5.1, 5.3
     *
     * @param clientVersion The client version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ClientVersion
     */
    public GetConfigRequest withClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }

    /**
     * The client version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>5.1, 5.3
     *
     * @param clientVersion The client version.
     *
     * @see ClientVersion
     */
    public void setClientVersion(ClientVersion clientVersion) {
        this.clientVersion = clientVersion.toString();
    }
    
    /**
     * The client version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>5.1, 5.3
     *
     * @param clientVersion The client version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ClientVersion
     */
    public GetConfigRequest withClientVersion(ClientVersion clientVersion) {
        this.clientVersion = clientVersion.toString();
        return this;
    }

    /**
     * A list of ARNs that identify the high-availability partition groups
     * that are associated with the client.
     *
     * @return A list of ARNs that identify the high-availability partition groups
     *         that are associated with the client.
     */
    public java.util.List<String> getHapgList() {
        if (hapgList == null) {
              hapgList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              hapgList.setAutoConstruct(true);
        }
        return hapgList;
    }
    
    /**
     * A list of ARNs that identify the high-availability partition groups
     * that are associated with the client.
     *
     * @param hapgList A list of ARNs that identify the high-availability partition groups
     *         that are associated with the client.
     */
    public void setHapgList(java.util.Collection<String> hapgList) {
        if (hapgList == null) {
            this.hapgList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> hapgListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(hapgList.size());
        hapgListCopy.addAll(hapgList);
        this.hapgList = hapgListCopy;
    }
    
    /**
     * A list of ARNs that identify the high-availability partition groups
     * that are associated with the client.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hapgList A list of ARNs that identify the high-availability partition groups
     *         that are associated with the client.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetConfigRequest withHapgList(String... hapgList) {
        if (getHapgList() == null) setHapgList(new java.util.ArrayList<String>(hapgList.length));
        for (String value : hapgList) {
            getHapgList().add(value);
        }
        return this;
    }
    
    /**
     * A list of ARNs that identify the high-availability partition groups
     * that are associated with the client.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hapgList A list of ARNs that identify the high-availability partition groups
     *         that are associated with the client.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetConfigRequest withHapgList(java.util.Collection<String> hapgList) {
        if (hapgList == null) {
            this.hapgList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> hapgListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(hapgList.size());
            hapgListCopy.addAll(hapgList);
            this.hapgList = hapgListCopy;
        }

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
        if (getClientArn() != null) sb.append("ClientArn: " + getClientArn() + ",");
        if (getClientVersion() != null) sb.append("ClientVersion: " + getClientVersion() + ",");
        if (getHapgList() != null) sb.append("HapgList: " + getHapgList() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetConfigRequest == false) return false;
        GetConfigRequest other = (GetConfigRequest)obj;
        
        if (other.getClientArn() == null ^ this.getClientArn() == null) return false;
        if (other.getClientArn() != null && other.getClientArn().equals(this.getClientArn()) == false) return false; 
        if (other.getClientVersion() == null ^ this.getClientVersion() == null) return false;
        if (other.getClientVersion() != null && other.getClientVersion().equals(this.getClientVersion()) == false) return false; 
        if (other.getHapgList() == null ^ this.getHapgList() == null) return false;
        if (other.getHapgList() != null && other.getHapgList().equals(this.getHapgList()) == false) return false; 
        return true;
    }
    
}
    